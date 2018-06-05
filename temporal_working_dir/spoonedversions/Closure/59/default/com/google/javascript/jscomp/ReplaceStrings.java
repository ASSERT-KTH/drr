

package com.google.javascript.jscomp;


class ReplaceStrings extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType BAD_REPLACEMENT_CONFIGURATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_BAD_REPLACEMENT_CONFIGURATION", "Bad replacement configuration.");

	private final java.lang.String DEFAULT_PLACEHOLDER_TOKEN = "`";

	private final java.lang.String placeholderToken;

	private static final java.lang.String REPLACE_ONE_MARKER = "?";

	private static final java.lang.String REPLACE_ALL_MARKER = "*";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ReplaceStrings.Config> functions = com.google.common.collect.Maps.newHashMap();

	private final com.google.common.collect.Multimap<java.lang.String, java.lang.String> methods = com.google.common.collect.HashMultimap.create();

	private final com.google.javascript.jscomp.NameGenerator nameGenerator;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ReplaceStrings.Result> results = com.google.common.collect.Maps.newLinkedHashMap();

	private class Config {
		final java.lang.String name;

		final int parameter;

		static final int REPLACE_ALL_VALUE = 0;

		Config(java.lang.String name, int parameter) {
			this.name = name;
			this.parameter = parameter;
		}
	}

	class Result {
		public final java.lang.String original;

		public final java.lang.String replacement;

		public final java.util.List<com.google.javascript.jscomp.ReplaceStrings.Location> replacementLocations = com.google.common.collect.Lists.newLinkedList();

		Result(java.lang.String original, java.lang.String replacement) {
			this.original = original;
			this.replacement = replacement;
		}

		void addLocation(com.google.javascript.rhino.Node n) {
			replacementLocations.add(new com.google.javascript.jscomp.ReplaceStrings.Location(n.getSourceFileName(), n.getLineno(), n.getCharno()));
		}
	}

	class Location {
		public final java.lang.String sourceFile;

		public final int line;

		public final int column;

		Location(java.lang.String sourceFile, int line, int column) {
			this.sourceFile = sourceFile;
			this.line = line;
			this.column = column;
		}
	}

	ReplaceStrings(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String placeholderToken, java.util.List<java.lang.String> functionsToInspect, java.util.Set<java.lang.String> reservedNames) {
		this.compiler = compiler;
		this.placeholderToken = (placeholderToken.isEmpty()) ? DEFAULT_PLACEHOLDER_TOKEN : placeholderToken;
		this.registry = compiler.getTypeRegistry();
		this.nameGenerator = com.google.javascript.jscomp.ReplaceStrings.createNameGenerator(reservedNames);
		parseConfiguration(functionsToInspect);
	}

	java.util.List<com.google.javascript.jscomp.ReplaceStrings.Result> getResult() {
		return com.google.common.collect.ImmutableList.copyOf(results.values());
	}

	com.google.javascript.jscomp.VariableMap getStringMap() {
		java.util.Map<java.lang.String, java.lang.String> map = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.ReplaceStrings.Result result : results.values()) {
			map.put(result.replacement, escapeForVariableMap(result.original));
		}
		com.google.javascript.jscomp.VariableMap stringMap = new com.google.javascript.jscomp.VariableMap(map);
		return stringMap;
	}

	private java.lang.String escapeForVariableMap(java.lang.String original) {
		return original.replace("\\", "\\\\").replace("\n", "\\n");
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ReplaceStrings.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.CALL :
				com.google.javascript.rhino.Node calledFn = n.getFirstChild();
				java.lang.String name = calledFn.getQualifiedName();
				if (name != null) {
					com.google.javascript.jscomp.ReplaceStrings.Config config = findMatching(name);
					if (config != null) {
						doSubstitutions(t, config, n);
						return ;
					}
				}
				if (com.google.javascript.jscomp.NodeUtil.isGet(calledFn)) {
					com.google.javascript.rhino.Node rhs = calledFn.getLastChild();
					if (((rhs.getType()) == (com.google.javascript.rhino.Token.NAME)) || ((rhs.getType()) == (com.google.javascript.rhino.Token.STRING))) {
						java.lang.String methodName = rhs.getString();
						java.util.Collection<java.lang.String> classes = methods.get(methodName);
						if (classes != null) {
							com.google.javascript.rhino.Node lhs = calledFn.getFirstChild();
							if ((lhs.getJSType()) != null) {
								com.google.javascript.rhino.jstype.JSType type = lhs.getJSType().restrictByNotNullOrUndefined();
								com.google.javascript.jscomp.ReplaceStrings.Config config = findMatchingClass(type, classes);
								if (config != null) {
									doSubstitutions(t, config, n);
									return ;
								}
							}
						}
					}
				}
				break;
		}
	}

	private com.google.javascript.jscomp.ReplaceStrings.Config findMatching(java.lang.String name) {
		com.google.javascript.jscomp.ReplaceStrings.Config config = functions.get(name);
		if (config == null) {
			name = name.replace('$', '.');
			config = functions.get(name);
		}
		return config;
	}

	private com.google.javascript.jscomp.ReplaceStrings.Config findMatchingClass(com.google.javascript.rhino.jstype.JSType callClassType, java.util.Collection<java.lang.String> declarationNames) {
		if ((!(callClassType.isNoObjectType())) && (!(callClassType.isUnknownType()))) {
			for (java.lang.String declarationName : declarationNames) {
				java.lang.String className = getClassFromDeclarationName(declarationName);
				com.google.javascript.rhino.jstype.JSType methodClassType = registry.getType(className);
				if ((methodClassType != null) && (callClassType.isSubtype(methodClassType))) {
					return functions.get(declarationName);
				}
			}
		}
		return null;
	}

	private void doSubstitutions(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReplaceStrings.Config config, com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState((((n.getType()) == (com.google.javascript.rhino.Token.NEW)) || ((n.getType()) == (com.google.javascript.rhino.Token.CALL))));
		if ((config.parameter) != (com.google.javascript.jscomp.ReplaceStrings.Config.REPLACE_ALL_VALUE)) {
			com.google.javascript.rhino.Node arg = n.getChildAtIndex(config.parameter);
			if (arg != null) {
				replaceExpression(t, arg, n);
			}
		}else {
			com.google.javascript.rhino.Node firstParam = n.getFirstChild().getNext();
			for (com.google.javascript.rhino.Node arg = firstParam; arg != null; arg = arg.getNext()) {
				arg = replaceExpression(t, arg, n);
			}
		}
	}

	private com.google.javascript.rhino.Node replaceExpression(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node replacement;
		java.lang.String key = null;
		java.lang.String replacementString;
		switch (expr.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				key = expr.getString();
				replacementString = getReplacement(key);
				replacement = com.google.javascript.rhino.Node.newString(replacementString);
				break;
			case com.google.javascript.rhino.Token.ADD :
				java.lang.StringBuilder keyBuilder = new java.lang.StringBuilder();
				com.google.javascript.rhino.Node keyNode = com.google.javascript.rhino.Node.newString("");
				replacement = buildReplacement(expr, keyNode, keyBuilder);
				key = keyBuilder.toString();
				replacementString = getReplacement(key);
				keyNode.setString(replacementString);
				break;
			case com.google.javascript.rhino.Token.NAME :
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(expr.getString());
				if ((var != null) && (var.isConst())) {
					com.google.javascript.rhino.Node value = var.getInitialValue();
					if ((value != null) && ((value.getType()) == (com.google.javascript.rhino.Token.STRING))) {
						key = value.getString();
						replacementString = getReplacement(key);
						replacement = com.google.javascript.rhino.Node.newString(replacementString);
						break;
					}
				}
				return expr;
			default :
				return expr;
		}
		com.google.common.base.Preconditions.checkNotNull(key);
		com.google.common.base.Preconditions.checkNotNull(replacementString);
		recordReplacement(expr, key, replacementString);
		parent.replaceChild(expr, replacement);
		compiler.reportCodeChange();
		return replacement;
	}

	private java.lang.String getReplacement(java.lang.String key) {
		com.google.javascript.jscomp.ReplaceStrings.Result result = results.get(key);
		if (result != null) {
			return result.replacement;
		}
		java.lang.String replacement = nameGenerator.generateNextName();
		result = new com.google.javascript.jscomp.ReplaceStrings.Result(key, replacement);
		results.put(key, result);
		return replacement;
	}

	private void recordReplacement(com.google.javascript.rhino.Node n, java.lang.String key, java.lang.String replacement) {
		com.google.javascript.jscomp.ReplaceStrings.Result result = results.get(key);
		com.google.common.base.Preconditions.checkState((result != null));
		result.addLocation(n);
	}

	private com.google.javascript.rhino.Node buildReplacement(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node prefix, java.lang.StringBuilder keyBuilder) {
		switch (expr.getType()) {
			case com.google.javascript.rhino.Token.ADD :
				com.google.javascript.rhino.Node left = expr.getFirstChild();
				com.google.javascript.rhino.Node right = left.getNext();
				prefix = buildReplacement(left, prefix, keyBuilder);
				return buildReplacement(right, prefix, keyBuilder);
			case com.google.javascript.rhino.Token.STRING :
				keyBuilder.append(expr.getString());
				return prefix;
			default :
				keyBuilder.append(placeholderToken);
				prefix = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ADD, prefix, com.google.javascript.rhino.Node.newString(placeholderToken));
				return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ADD, prefix, expr.cloneTree());
		}
	}

	private java.lang.String getMethodFromDeclarationName(java.lang.String fullDeclarationName) {
		java.lang.String[] parts = fullDeclarationName.split("\\.prototype\\.");
		com.google.common.base.Preconditions.checkState((((parts.length) == 1) || ((parts.length) == 2)));
		if ((parts.length) == 2) {
			return parts[1];
		}
		return null;
	}

	private java.lang.String getClassFromDeclarationName(java.lang.String fullDeclarationName) {
		java.lang.String[] parts = fullDeclarationName.split("\\.prototype\\.");
		com.google.common.base.Preconditions.checkState((((parts.length) == 1) || ((parts.length) == 2)));
		if ((parts.length) == 2) {
			return parts[0];
		}
		return null;
	}

	private void parseConfiguration(java.util.List<java.lang.String> functionsToInspect) {
		for (java.lang.String function : functionsToInspect) {
			com.google.javascript.jscomp.ReplaceStrings.Config config = parseConfiguration(function);
			functions.put(config.name, config);
			java.lang.String method = getMethodFromDeclarationName(config.name);
			if (method != null) {
				methods.put(method, config.name);
			}
		}
	}

	private com.google.javascript.jscomp.ReplaceStrings.Config parseConfiguration(java.lang.String function) {
		int first = function.indexOf('(');
		int last = function.indexOf(')');
		com.google.common.base.Preconditions.checkState(((first != (-1)) && (last != (-1))));
		java.lang.String name = function.substring(0, first);
		java.lang.String params = function.substring((first + 1), last);
		int paramCount = 0;
		int replacementParameter = -1;
		java.lang.String[] parts = params.split(",");
		for (java.lang.String param : parts) {
			paramCount++;
			if (param.equals(com.google.javascript.jscomp.ReplaceStrings.REPLACE_ALL_MARKER)) {
				com.google.common.base.Preconditions.checkState(((paramCount == 1) && ((parts.length) == 1)));
				replacementParameter = com.google.javascript.jscomp.ReplaceStrings.Config.REPLACE_ALL_VALUE;
			}else
				if (param.equals(com.google.javascript.jscomp.ReplaceStrings.REPLACE_ONE_MARKER)) {
					com.google.common.base.Preconditions.checkState((replacementParameter == (-1)));
					replacementParameter = paramCount;
				}else {
					com.google.common.base.Preconditions.checkState(param.isEmpty(), "Unknown marker", param);
				}
			
		}
		com.google.common.base.Preconditions.checkState((replacementParameter != (-1)));
		return new com.google.javascript.jscomp.ReplaceStrings.Config(name, replacementParameter);
	}

	private static com.google.javascript.jscomp.NameGenerator createNameGenerator(java.util.Set<java.lang.String> reservedNames) {
		final java.lang.String namePrefix = "";
		final char[] reservedChars = new char[0];
		return new com.google.javascript.jscomp.NameGenerator(com.google.common.collect.ImmutableSet.copyOf(reservedNames), namePrefix, reservedChars);
	}
}


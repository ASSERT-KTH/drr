

package com.google.javascript.jscomp;


class AliasStrings extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.AliasStrings.class.getName());

	private static final java.lang.String STRING_ALIAS_PREFIX = "$$S_";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private java.util.regex.Matcher blacklist = null;

	private final java.util.Set<java.lang.String> aliasableStrings;

	private final boolean outputStringUsage;

	private final java.util.SortedMap<java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo> stringInfoMap = com.google.common.collect.Maps.newTreeMap();

	private final java.util.Set<java.lang.String> usedHashedAliases = new java.util.LinkedHashSet<java.lang.String>();

	private final java.util.Map<com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node> moduleVarParentMap = new java.util.HashMap<com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node>();

	long unitTestHashReductionMask = ~0L;

	AliasStrings(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSModuleGraph moduleGraph, java.util.Set<java.lang.String> strings, java.lang.String blacklistRegex, boolean outputStringUsage) {
		this.compiler = compiler;
		this.moduleGraph = moduleGraph;
		this.aliasableStrings = strings;
		if ((blacklistRegex.length()) != 0) {
			com.google.javascript.jscomp.AliasStrings.this.blacklist = java.util.regex.Pattern.compile(blacklistRegex).matcher("");
		}else {
			com.google.javascript.jscomp.AliasStrings.this.blacklist = null;
		}
		this.outputStringUsage = outputStringUsage;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.AliasStrings.logger.info("Aliasing common strings");
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.AliasStrings.this);
		replaceStringsWithAliases();
		addAliasDeclarationNodes();
		if (outputStringUsage) {
			outputStringUsage();
		}
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((((n.isString()) && (!(parent.isGetProp()))) && (!(parent.isRegExp()))) && (!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)))) {
			java.lang.String str = n.getString();
			if ("undefined".equals(str)) {
				return ;
			}
			if (((blacklist) != null) && (blacklist.reset(str).find())) {
				return ;
			}
			if (((aliasableStrings) == null) || (aliasableStrings.contains(str))) {
				com.google.javascript.jscomp.AliasStrings.StringOccurrence occurrence = new com.google.javascript.jscomp.AliasStrings.StringOccurrence(n, parent);
				com.google.javascript.jscomp.AliasStrings.StringInfo info = getOrCreateStringInfo(str);
				info.occurrences.add(occurrence);
				(info.numOccurrences)++;
				if ((t.inGlobalScope()) || (com.google.javascript.jscomp.AliasStrings.isInThrowExpression(n))) {
					(info.numOccurrencesInfrequentlyExecuted)++;
				}
				com.google.javascript.jscomp.JSModule module = t.getModule();
				if ((info.numOccurrences) != 1) {
					if ((((module != null) && ((info.moduleToContainDecl) != null)) && (module != (info.moduleToContainDecl))) && (!(moduleGraph.dependsOn(module, info.moduleToContainDecl)))) {
						module = moduleGraph.getDeepestCommonDependency(module, info.moduleToContainDecl);
					}else {
						return ;
					}
				}
				com.google.javascript.rhino.Node varParent = moduleVarParentMap.get(module);
				if (varParent == null) {
					varParent = compiler.getNodeForCodeInsertion(module);
					moduleVarParentMap.put(module, varParent);
				}
				info.moduleToContainDecl = module;
				info.parentForNewVarDecl = varParent;
				info.siblingToInsertVarDeclBefore = varParent.getFirstChild();
			}
		}
	}

	private com.google.javascript.jscomp.AliasStrings.StringInfo getOrCreateStringInfo(java.lang.String string) {
		com.google.javascript.jscomp.AliasStrings.StringInfo info = stringInfoMap.get(string);
		if (info == null) {
			info = new com.google.javascript.jscomp.AliasStrings.StringInfo(stringInfoMap.size());
			stringInfoMap.put(string, info);
		}
		return info;
	}

	private static boolean isInThrowExpression(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
			switch (ancestor.getType()) {
				case com.google.javascript.rhino.Token.THROW :
					return true;
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.DO :
				case com.google.javascript.rhino.Token.FOR :
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.DEFAULT_CASE :
				case com.google.javascript.rhino.Token.BLOCK :
				case com.google.javascript.rhino.Token.SCRIPT :
				case com.google.javascript.rhino.Token.FUNCTION :
				case com.google.javascript.rhino.Token.TRY :
				case com.google.javascript.rhino.Token.CATCH :
				case com.google.javascript.rhino.Token.RETURN :
				case com.google.javascript.rhino.Token.EXPR_RESULT :
					return false;
			}
		}
		return false;
	}

	private void replaceStringsWithAliases() {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo> entry : stringInfoMap.entrySet()) {
			java.lang.String literal = entry.getKey();
			com.google.javascript.jscomp.AliasStrings.StringInfo info = entry.getValue();
			if (com.google.javascript.jscomp.AliasStrings.shouldReplaceWithAlias(literal, info)) {
				for (com.google.javascript.jscomp.AliasStrings.StringOccurrence occurrence : info.occurrences) {
					replaceStringWithAliasName(occurrence, info.getVariableName(literal), info);
				}
			}
		}
	}

	private void addAliasDeclarationNodes() {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo> entry : stringInfoMap.entrySet()) {
			com.google.javascript.jscomp.AliasStrings.StringInfo info = entry.getValue();
			if (!(info.isAliased)) {
				continue;
			}
			java.lang.String alias = info.getVariableName(entry.getKey());
			com.google.javascript.rhino.Node var = com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(alias), com.google.javascript.rhino.IR.string(entry.getKey()));
			if ((info.siblingToInsertVarDeclBefore) == null) {
				info.parentForNewVarDecl.addChildToFront(var);
			}else {
				info.parentForNewVarDecl.addChildBefore(var, info.siblingToInsertVarDeclBefore);
			}
			compiler.reportCodeChange();
		}
	}

	private static boolean shouldReplaceWithAlias(java.lang.String str, com.google.javascript.jscomp.AliasStrings.StringInfo info) {
		if ((info.numOccurrences) > (info.numOccurrencesInfrequentlyExecuted)) {
			return true;
		}
		int sizeOfLiteral = 2 + (str.length());
		int sizeOfStrings = (info.numOccurrences) * sizeOfLiteral;
		int sizeOfVariable = 3;
		int sizeOfAliases = ((6 + sizeOfVariable) + sizeOfLiteral) + ((info.numOccurrences) * sizeOfVariable);
		return sizeOfAliases < sizeOfStrings;
	}

	private void replaceStringWithAliasName(com.google.javascript.jscomp.AliasStrings.StringOccurrence occurrence, java.lang.String name, com.google.javascript.jscomp.AliasStrings.StringInfo info) {
		occurrence.parent.replaceChild(occurrence.node, com.google.javascript.rhino.IR.name(name));
		info.isAliased = true;
		compiler.reportCodeChange();
	}

	private void outputStringUsage() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder("Strings used more than once:\n");
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo> stringInfoEntry : stringInfoMap.entrySet()) {
			com.google.javascript.jscomp.AliasStrings.StringInfo info = stringInfoEntry.getValue();
			if ((info.numOccurrences) > 1) {
				sb.append(info.numOccurrences);
				sb.append(": ");
				sb.append(stringInfoEntry.getKey());
				sb.append('\n');
			}
		}
		com.google.javascript.jscomp.AliasStrings.logger.info(sb.toString());
	}

	private static final class StringOccurrence {
		final com.google.javascript.rhino.Node node;

		final com.google.javascript.rhino.Node parent;

		StringOccurrence(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			this.node = node;
			this.parent = parent;
		}
	}

	private final class StringInfo {
		final int id;

		boolean isAliased;

		final java.util.List<com.google.javascript.jscomp.AliasStrings.StringOccurrence> occurrences;

		int numOccurrences;

		int numOccurrencesInfrequentlyExecuted;

		com.google.javascript.jscomp.JSModule moduleToContainDecl;

		com.google.javascript.rhino.Node parentForNewVarDecl;

		com.google.javascript.rhino.Node siblingToInsertVarDeclBefore;

		java.lang.String aliasName;

		StringInfo(int id) {
			this.id = id;
			this.occurrences = new java.util.ArrayList<com.google.javascript.jscomp.AliasStrings.StringOccurrence>();
			com.google.javascript.jscomp.AliasStrings.StringInfo.this.isAliased = false;
		}

		java.lang.String getVariableName(java.lang.String stringLiteral) {
			if ((aliasName) == null) {
				aliasName = encodeStringAsIdentifier(com.google.javascript.jscomp.AliasStrings.STRING_ALIAS_PREFIX, stringLiteral);
			}
			return aliasName;
		}

		java.lang.String encodeStringAsIdentifier(java.lang.String prefix, java.lang.String s) {
			final int MAX_LIMIT = 20;
			final int length = s.length();
			final int limit = java.lang.Math.min(length, MAX_LIMIT);
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			sb.append(prefix);
			boolean protectHex = false;
			for (int i = 0; i < limit; i++) {
				char ch = s.charAt(i);
				if (protectHex) {
					if (((ch >= '0') && (ch <= '9')) || ((ch >= 'a') && (ch <= 'f'))) {
						sb.append('_');
					}
					protectHex = false;
				}
				if ((((ch >= '0') && (ch <= '9')) || ((ch >= 'A') && (ch <= 'Z'))) || ((ch >= 'a') && (ch <= 'z'))) {
					sb.append(ch);
				}else {
					sb.append('$');
					sb.append(java.lang.Integer.toHexString(ch));
					protectHex = true;
				}
			}
			if (length == limit) {
				return sb.toString();
			}
			java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
			crc32.update(s.getBytes());
			long hash = (crc32.getValue()) & (unitTestHashReductionMask);
			sb.append('_');
			sb.append(java.lang.Long.toHexString(hash));
			java.lang.String encoded = sb.toString();
			if (!(usedHashedAliases.add(encoded))) {
				encoded += "_" + (id);
			}
			return encoded;
		}
	}
}


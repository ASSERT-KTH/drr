

package com.google.javascript.jscomp;


final class ExternExportsPass extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE", "Unable to determine type of parameter {0} for exported function {1}");

	static final com.google.javascript.jscomp.DiagnosticType EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE", "Unable to determine return type for exported function {0}");

	private final java.util.List<com.google.javascript.jscomp.ExternExportsPass.Export> exports;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> definitionMap;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.Node externsRoot;

	private final java.util.Map<java.lang.String, java.lang.String> mappedPaths;

	private final java.util.Set<java.lang.String> alreadyExportedPaths;

	private java.util.List<java.lang.String> exportSymbolFunctionNames;

	private java.util.List<java.lang.String> exportPropertyFunctionNames;

	private abstract class Export {
		protected final java.lang.String symbolName;

		protected final com.google.javascript.rhino.Node value;

		Export(java.lang.String symbolName, com.google.javascript.rhino.Node value) {
			this.symbolName = symbolName;
			this.value = value;
		}

		void generateExterns() {
			appendExtern(getExportedPath(), getValue(value));
		}

		abstract java.lang.String getExportedPath();

		void appendExtern(java.lang.String path, com.google.javascript.rhino.Node valueToExport) {
			java.util.List<java.lang.String> pathPrefixes = computePathPrefixes(path);
			for (int i = 0; i < (pathPrefixes.size()); ++i) {
				java.lang.String pathPrefix = pathPrefixes.get(i);
				boolean isCompletePathPrefix = i == ((pathPrefixes.size()) - 1);
				boolean skipPathPrefix = (pathPrefix.endsWith(".prototype")) || ((alreadyExportedPaths.contains(pathPrefix)) && (!isCompletePathPrefix));
				if (!skipPathPrefix) {
					com.google.javascript.rhino.Node initializer;
					if (isCompletePathPrefix && (valueToExport != null)) {
						if (valueToExport.isFunction()) {
							initializer = createExternFunction(valueToExport);
						}else {
							com.google.common.base.Preconditions.checkState(valueToExport.isObjectLit());
							initializer = createExternObjectLit(valueToExport);
						}
					}else {
						initializer = com.google.javascript.rhino.IR.empty();
					}
					appendPathDefinition(pathPrefix, initializer);
				}
			}
		}

		private java.util.List<java.lang.String> computePathPrefixes(java.lang.String path) {
			java.util.List<java.lang.String> pieces = com.google.common.collect.Lists.newArrayList(path.split("\\."));
			java.util.List<java.lang.String> pathPrefixes = com.google.common.collect.Lists.newArrayList();
			for (int i = 0; i < (pieces.size()); i++) {
				pathPrefixes.add(com.google.common.base.Joiner.on(".").join(com.google.common.collect.Iterables.limit(pieces, (i + 1))));
			}
			return pathPrefixes;
		}

		private void appendPathDefinition(java.lang.String path, com.google.javascript.rhino.Node initializer) {
			com.google.javascript.rhino.Node pathDefinition;
			if (!(path.contains("."))) {
				if (initializer.isEmpty()) {
					pathDefinition = com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(path));
				}else {
					pathDefinition = com.google.javascript.jscomp.NodeUtil.newVarNode(path, initializer);
				}
			}else {
				com.google.javascript.rhino.Node qualifiedPath = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), path);
				if (initializer.isEmpty()) {
					pathDefinition = com.google.javascript.jscomp.NodeUtil.newExpr(qualifiedPath);
				}else {
					pathDefinition = com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.rhino.IR.assign(qualifiedPath, initializer));
				}
			}
			externsRoot.addChildToBack(pathDefinition);
			alreadyExportedPaths.add(path);
		}

		private com.google.javascript.rhino.Node createExternFunction(com.google.javascript.rhino.Node exportedFunction) {
			com.google.javascript.rhino.Node paramList = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(exportedFunction).cloneTree();
			com.google.javascript.rhino.Node externFunction = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name(""), paramList, com.google.javascript.rhino.IR.block());
			checkForFunctionsWithUnknownTypes(exportedFunction);
			externFunction.setJSType(exportedFunction.getJSType());
			return externFunction;
		}

		private com.google.javascript.rhino.Node createExternObjectLit(com.google.javascript.rhino.Node exportedObjectLit) {
			com.google.javascript.rhino.Node lit = com.google.javascript.rhino.IR.objectlit();
			lit.setJSType(exportedObjectLit.getJSType());
			lit.setJSDocInfo(new com.google.javascript.rhino.JSDocInfo());
			int index = 1;
			for (com.google.javascript.rhino.Node child = exportedObjectLit.getFirstChild(); child != null; child = child.getNext()) {
				if (child.isStringKey()) {
					lit.addChildToBack(com.google.javascript.rhino.IR.propdef(com.google.javascript.rhino.IR.stringKey(child.getString()), com.google.javascript.rhino.IR.number((index++))));
				}
			}
			return lit;
		}

		private void checkForFunctionsWithUnknownTypes(com.google.javascript.rhino.Node function) {
			com.google.common.base.Preconditions.checkArgument(function.isFunction());
			com.google.javascript.rhino.jstype.FunctionType functionType = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(function.getJSType());
			if (functionType == null) {
				return ;
			}
			com.google.javascript.rhino.JSDocInfo functionJSDocInfo = functionType.getJSDocInfo();
			com.google.javascript.rhino.jstype.JSType returnType = functionType.getReturnType();
			if ((!(functionType.isConstructor())) && ((returnType == null) || (returnType.isUnknownType()))) {
				reportUnknownReturnType(function);
			}
			com.google.javascript.rhino.Node astParameterIterator = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(function).getFirstChild();
			com.google.javascript.rhino.Node typeParameterIterator = functionType.getParametersNode().getFirstChild();
			while (astParameterIterator != null) {
				com.google.javascript.rhino.jstype.JSType parameterType = typeParameterIterator.getJSType();
				if ((parameterType == null) || (parameterType.isUnknownType())) {
					reportUnknownParameterType(function, astParameterIterator);
				}
				astParameterIterator = astParameterIterator.getNext();
				typeParameterIterator = typeParameterIterator.getNext();
			} 
		}

		private void reportUnknownParameterType(com.google.javascript.rhino.Node function, com.google.javascript.rhino.Node parameter) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(function), parameter, com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.ExternExportsPass.EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE, com.google.javascript.jscomp.NodeUtil.getFunctionName(function), parameter.getString()));
		}

		private void reportUnknownReturnType(com.google.javascript.rhino.Node function) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(function), function, com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.ExternExportsPass.EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE, com.google.javascript.jscomp.NodeUtil.getFunctionName(function)));
		}

		protected com.google.javascript.rhino.Node getValue(com.google.javascript.rhino.Node qualifiedNameNode) {
			java.lang.String qualifiedName = value.getQualifiedName();
			if (qualifiedName == null) {
				return null;
			}
			com.google.javascript.rhino.Node definitionParent = definitionMap.get(qualifiedName);
			if (definitionParent == null) {
				return null;
			}
			com.google.javascript.rhino.Node definition;
			switch (definitionParent.getType()) {
				case com.google.javascript.rhino.Token.ASSIGN :
					definition = definitionParent.getLastChild();
					break;
				case com.google.javascript.rhino.Token.VAR :
					definition = definitionParent.getLastChild().getLastChild();
					break;
				default :
					return null;
			}
			if ((!(definition.isFunction())) && (!(definition.isObjectLit()))) {
				return null;
			}
			return definition;
		}
	}

	private class SymbolExport extends com.google.javascript.jscomp.ExternExportsPass.Export {
		public SymbolExport(java.lang.String symbolName, com.google.javascript.rhino.Node value) {
			super(symbolName, value);
			java.lang.String qualifiedName = value.getQualifiedName();
			if (qualifiedName != null) {
				mappedPaths.put(qualifiedName, symbolName);
			}
		}

		@java.lang.Override
		java.lang.String getExportedPath() {
			return symbolName;
		}
	}

	private class PropertyExport extends com.google.javascript.jscomp.ExternExportsPass.Export {
		private final java.lang.String exportPath;

		public PropertyExport(java.lang.String exportPath, java.lang.String symbolName, com.google.javascript.rhino.Node value) {
			super(symbolName, value);
			this.exportPath = exportPath;
		}

		@java.lang.Override
		java.lang.String getExportedPath() {
			java.util.List<java.lang.String> pieces = com.google.common.collect.Lists.newArrayList(exportPath.split("\\."));
			for (int i = pieces.size(); i > 0; i--) {
				java.lang.String cPath = com.google.common.base.Joiner.on(".").join(com.google.common.collect.Iterables.limit(pieces, i));
				if (mappedPaths.containsKey(cPath)) {
					java.lang.String newPath = mappedPaths.get(cPath);
					if (i < (pieces.size())) {
						newPath += "." + (com.google.common.base.Joiner.on(".").join(com.google.common.collect.Iterables.skip(pieces, i)));
					}
					return (newPath + ".") + (symbolName);
				}
			}
			return ((exportPath) + ".") + (symbolName);
		}
	}

	ExternExportsPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.exports = com.google.common.collect.Lists.newArrayList();
		this.compiler = compiler;
		this.definitionMap = com.google.common.collect.Maps.newHashMap();
		this.externsRoot = com.google.javascript.rhino.IR.block();
		com.google.javascript.jscomp.ExternExportsPass.this.externsRoot.setIsSyntheticBlock(true);
		this.alreadyExportedPaths = com.google.common.collect.Sets.newHashSet();
		this.mappedPaths = com.google.common.collect.Maps.newHashMap();
		initExportMethods();
	}

	private void initExportMethods() {
		exportSymbolFunctionNames = com.google.common.collect.Lists.newArrayList();
		exportPropertyFunctionNames = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
		exportSymbolFunctionNames.add(convention.getExportSymbolFunction());
		exportPropertyFunctionNames.add(convention.getExportPropertyFunction());
		exportSymbolFunctionNames.add("google_exportSymbol");
		exportPropertyFunctionNames.add("google_exportProperty");
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.ExternExportsPass.this).traverse(root);
		java.util.Set<com.google.javascript.jscomp.ExternExportsPass.Export> sorted = new java.util.TreeSet<com.google.javascript.jscomp.ExternExportsPass.Export>(new java.util.Comparator<com.google.javascript.jscomp.ExternExportsPass.Export>() {
			@java.lang.Override
			public int compare(com.google.javascript.jscomp.ExternExportsPass.Export e1, com.google.javascript.jscomp.ExternExportsPass.Export e2) {
				return e1.getExportedPath().compareTo(e2.getExportedPath());
			}
		});
		sorted.addAll(exports);
		for (com.google.javascript.jscomp.ExternExportsPass.Export export : sorted) {
			export.generateExterns();
		}
	}

	public java.lang.String getGeneratedExterns() {
		com.google.javascript.jscomp.CodePrinter.Builder builder = new com.google.javascript.jscomp.CodePrinter.Builder(externsRoot).setPrettyPrint(true).setOutputTypes(true);
		return builder.build();
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
				java.lang.String name = n.getQualifiedName();
				if (name == null) {
					return ;
				}
				if ((parent.isAssign()) || (parent.isVar())) {
					definitionMap.put(n.getQualifiedName(), parent);
				}
				if (!(parent.isCall())) {
					return ;
				}
				if (exportPropertyFunctionNames.contains(n.getQualifiedName())) {
					handlePropertyExport(parent);
				}
				if (exportSymbolFunctionNames.contains(n.getQualifiedName())) {
					handleSymbolExport(parent);
				}
		}
	}

	private void handleSymbolExport(com.google.javascript.rhino.Node parent) {
		if ((parent.getChildCount()) != 3) {
			return ;
		}
		com.google.javascript.rhino.Node thisNode = parent.getFirstChild();
		com.google.javascript.rhino.Node nameArg = thisNode.getNext();
		com.google.javascript.rhino.Node valueArg = nameArg.getNext();
		if (!(nameArg.isString())) {
			return ;
		}
		com.google.javascript.jscomp.ExternExportsPass.this.exports.add(new com.google.javascript.jscomp.ExternExportsPass.SymbolExport(nameArg.getString(), valueArg));
	}

	private void handlePropertyExport(com.google.javascript.rhino.Node parent) {
		if ((parent.getChildCount()) != 4) {
			return ;
		}
		com.google.javascript.rhino.Node thisNode = parent.getFirstChild();
		com.google.javascript.rhino.Node objectArg = thisNode.getNext();
		com.google.javascript.rhino.Node nameArg = objectArg.getNext();
		com.google.javascript.rhino.Node valueArg = nameArg.getNext();
		if ((objectArg.getQualifiedName()) == null) {
			return ;
		}
		if (!(nameArg.isString())) {
			return ;
		}
		com.google.javascript.jscomp.ExternExportsPass.this.exports.add(new com.google.javascript.jscomp.ExternExportsPass.PropertyExport(objectArg.getQualifiedName(), nameArg.getString(), valueArg));
	}
}


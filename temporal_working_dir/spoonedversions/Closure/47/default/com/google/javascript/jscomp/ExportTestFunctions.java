

package com.google.javascript.jscomp;


class ExportTestFunctions implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.regex.Pattern TEST_FUNCTIONS_NAME_PATTERN = java.util.regex.Pattern.compile(("^(?:((\\w+\\.)+prototype\\.)*" + "(setUpPage|setUp|tearDown|tearDownPage|test\\w+))$"));

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String exportSymbolFunction;

	private final java.lang.String exportPropertyFunction;

	ExportTestFunctions(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String exportSymbolFunction, java.lang.String exportPropertyFunction) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		com.google.javascript.jscomp.ExportTestFunctions.this.compiler = compiler;
		this.exportSymbolFunction = exportSymbolFunction;
		this.exportPropertyFunction = exportPropertyFunction;
	}

	private class ExportTestFunctionsNodes extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (parent == null) {
				return ;
			}
			if (parent.isScript()) {
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
					if (isTestFunction(n, functionName)) {
						exportTestFunctionAsSymbol(functionName, n, parent);
					}
				}else
					if (isVarDeclaredFunction(n)) {
						com.google.javascript.rhino.Node functionNode = n.getFirstChild().getFirstChild();
						java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getFunctionName(functionNode);
						if (isTestFunction(functionNode, functionName)) {
							exportTestFunctionAsSymbol(functionName, n, parent);
						}
					}
				
			}else
				if ((com.google.javascript.jscomp.NodeUtil.isExprAssign(parent)) && ((n.getLastChild().getType()) != (com.google.javascript.rhino.Token.ASSIGN))) {
					com.google.javascript.rhino.Node grandparent = parent.getParent();
					if ((grandparent != null) && (grandparent.isScript())) {
						java.lang.String functionName = n.getFirstChild().getQualifiedName();
						if (isTestFunction(n, functionName)) {
							exportTestFunctionAsProperty(functionName, parent, n, grandparent);
						}
					}
				}
			
		}

		private boolean isVarDeclaredFunction(com.google.javascript.rhino.Node node) {
			if ((node.getType()) != (com.google.javascript.rhino.Token.VAR)) {
				return false;
			}
			com.google.javascript.rhino.Node grandchild = node.getFirstChild().getFirstChild();
			return (grandchild != null) && (grandchild.isFunction());
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ExportTestFunctions.ExportTestFunctionsNodes());
	}

	private void exportTestFunctionAsSymbol(java.lang.String testFunctionName, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node scriptNode) {
		com.google.javascript.rhino.Node exportCallTarget = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), exportSymbolFunction, node, testFunctionName);
		com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, exportCallTarget);
		if (exportCallTarget.isName()) {
			call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		}
		call.addChildToBack(com.google.javascript.rhino.Node.newString(testFunctionName));
		call.addChildToBack(com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), testFunctionName, node, testFunctionName));
		com.google.javascript.rhino.Node expression = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
		scriptNode.addChildAfter(expression, node);
		compiler.reportCodeChange();
	}

	private void exportTestFunctionAsProperty(java.lang.String fullyQualifiedFunctionName, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node scriptNode) {
		java.lang.String testFunctionName = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node.getFirstChild());
		java.lang.String objectName = fullyQualifiedFunctionName.substring(0, fullyQualifiedFunctionName.lastIndexOf('.'));
		java.lang.String exportCallStr = java.lang.String.format("%s(%s, '%s', %s);", exportPropertyFunction, objectName, testFunctionName, fullyQualifiedFunctionName);
		com.google.javascript.rhino.Node exportCall = com.google.javascript.jscomp.ExportTestFunctions.this.compiler.parseSyntheticCode(exportCallStr).removeChildren();
		exportCall.useSourceInfoFromForTree(scriptNode);
		scriptNode.addChildAfter(exportCall, parent);
		compiler.reportCodeChange();
	}

	private boolean isTestFunction(com.google.javascript.rhino.Node n, java.lang.String functionName) {
		return !((functionName == null) || (!(com.google.javascript.jscomp.ExportTestFunctions.TEST_FUNCTIONS_NAME_PATTERN.matcher(functionName).matches())));
	}
}


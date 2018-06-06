

package com.google.javascript.jscomp;


class ExportTestFunctions implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.regex.Pattern TEST_FUNCTIONS_NAME_PATTERN = java.util.regex.Pattern.compile("^(?:setUpPage|setUp|tearDown|tearDownPage|test.*)$");

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String exportSymbolFunction;

	ExportTestFunctions(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String exportSymbolFunction) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		com.google.javascript.jscomp.ExportTestFunctions.this.compiler = compiler;
		this.exportSymbolFunction = exportSymbolFunction;
	}

	private class ExportTestFunctionsNodes extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.SCRIPT))) {
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
					if (isTestFunction(n, functionName)) {
						exportTestFunction(functionName, n, parent);
					}
				}else
					if (isVarDeclaredFunction(n)) {
						com.google.javascript.rhino.Node functionNode = n.getFirstChild().getFirstChild();
						java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getFunctionName(functionNode);
						if (isTestFunction(functionNode, functionName)) {
							exportTestFunction(functionName, n, parent);
						}
					}
				
			}
		}

		private boolean isVarDeclaredFunction(com.google.javascript.rhino.Node node) {
			if ((node.getType()) != (com.google.javascript.rhino.Token.VAR)) {
				return false;
			}
			com.google.javascript.rhino.Node grandchild = node.getFirstChild().getFirstChild();
			return (grandchild != null) && ((grandchild.getType()) == (com.google.javascript.rhino.Token.FUNCTION));
		}
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ExportTestFunctions.ExportTestFunctionsNodes());
	}

	private void exportTestFunction(java.lang.String testFunctionName, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node scriptNode) {
		com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), exportSymbolFunction, node, testFunctionName));
		call.addChildToBack(com.google.javascript.rhino.Node.newString(testFunctionName));
		call.addChildToBack(com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), testFunctionName, node, testFunctionName));
		com.google.javascript.rhino.Node expression = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
		scriptNode.addChildAfter(expression, node);
		compiler.reportCodeChange();
	}

	private boolean isTestFunction(com.google.javascript.rhino.Node n, java.lang.String functionName) {
		return !((functionName == null) || (!(com.google.javascript.jscomp.ExportTestFunctions.TEST_FUNCTIONS_NAME_PATTERN.matcher(functionName).matches())));
	}
}


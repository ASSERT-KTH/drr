

package com.google.javascript.jscomp;


class InlineGetters extends com.google.javascript.jscomp.MethodCompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.InlineGetters.class.getName());

	InlineGetters(com.google.javascript.jscomp.AbstractCompiler compiler) {
		super(compiler);
	}

	private class InlineTrivialAccessors extends com.google.javascript.jscomp.InvocationsCallback {
		@java.lang.Override
		void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, java.lang.String callName) {
			if ((externMethods.contains(callName)) || (nonMethodProperties.contains(callName))) {
				return ;
			}
			java.util.Collection<com.google.javascript.rhino.Node> definitions = methodDefinitions.get(callName);
			if ((definitions == null) || ((definitions.size()) == 0)) {
				return ;
			}
			com.google.javascript.rhino.Node firstDefinition = definitions.iterator().next();
			if (((definitions.size()) == 1) || (allDefinitionsEquivalent(definitions))) {
				if (!(argsMayHaveSideEffects(callNode))) {
					com.google.javascript.rhino.Node returned = com.google.javascript.jscomp.InlineGetters.returnedExpression(firstDefinition);
					if (returned != null) {
						if (com.google.javascript.jscomp.InlineGetters.isPropertyTree(returned)) {
							com.google.javascript.jscomp.InlineGetters.logger.fine(("Inlining property accessor: " + callName));
							inlinePropertyReturn(parent, callNode, returned);
						}else
							if ((com.google.javascript.jscomp.NodeUtil.isLiteralValue(returned, false)) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(callNode.getFirstChild())))) {
								com.google.javascript.jscomp.InlineGetters.logger.fine(("Inlining constant accessor: " + callName));
								inlineConstReturn(parent, callNode, returned);
							}
						
					}else
						if ((com.google.javascript.jscomp.InlineGetters.isEmptyMethod(firstDefinition)) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(callNode.getFirstChild())))) {
							com.google.javascript.jscomp.InlineGetters.logger.fine(("Inlining empty method: " + callName));
							inlineEmptyMethod(t, parent, callNode);
						}
					
				}
			}else {
				com.google.javascript.jscomp.InlineGetters.logger.fine((("Method '" + callName) + "' has conflicting definitions."));
			}
		}
	}

	@java.lang.Override
	com.google.javascript.jscomp.NodeTraversal.Callback getActingCallback() {
		return new com.google.javascript.jscomp.InlineGetters.InlineTrivialAccessors();
	}

	private static boolean isPropertyTree(com.google.javascript.rhino.Node expectedGetprop) {
		if ((expectedGetprop.getType()) != (com.google.javascript.rhino.Token.GETPROP)) {
			return false;
		}
		com.google.javascript.rhino.Node leftChild = expectedGetprop.getFirstChild();
		if (((leftChild.getType()) != (com.google.javascript.rhino.Token.THIS)) && (!(com.google.javascript.jscomp.InlineGetters.isPropertyTree(leftChild)))) {
			return false;
		}
		com.google.javascript.rhino.Node retVal = leftChild.getNext();
		if ((com.google.javascript.jscomp.NodeUtil.getStringValue(retVal)) == null) {
			return false;
		}
		return true;
	}

	private static void replaceThis(com.google.javascript.rhino.Node expectedGetprop, com.google.javascript.rhino.Node replacement) {
		com.google.javascript.rhino.Node leftChild = expectedGetprop.getFirstChild();
		if ((leftChild.getType()) == (com.google.javascript.rhino.Token.THIS)) {
			expectedGetprop.replaceChild(leftChild, replacement);
		}else {
			com.google.javascript.jscomp.InlineGetters.replaceThis(leftChild, replacement);
		}
	}

	private static com.google.javascript.rhino.Node returnedExpression(com.google.javascript.rhino.Node fn) {
		com.google.javascript.rhino.Node expectedBlock = com.google.javascript.jscomp.InlineGetters.getMethodBlock(fn);
		if (!(expectedBlock.hasOneChild())) {
			return null;
		}
		com.google.javascript.rhino.Node expectedReturn = expectedBlock.getFirstChild();
		if ((expectedReturn.getType()) != (com.google.javascript.rhino.Token.RETURN)) {
			return null;
		}
		if (!(expectedReturn.hasOneChild())) {
			return null;
		}
		return expectedReturn.getLastChild();
	}

	private static boolean isEmptyMethod(com.google.javascript.rhino.Node fn) {
		com.google.javascript.rhino.Node expectedBlock = com.google.javascript.jscomp.InlineGetters.getMethodBlock(fn);
		return expectedBlock == null ? false : com.google.javascript.jscomp.NodeUtil.isEmptyBlock(expectedBlock);
	}

	private static com.google.javascript.rhino.Node getMethodBlock(com.google.javascript.rhino.Node fn) {
		if ((fn.getChildCount()) != 3) {
			return null;
		}
		com.google.javascript.rhino.Node expectedBlock = fn.getLastChild();
		return (expectedBlock.getType()) == (com.google.javascript.rhino.Token.BLOCK) ? expectedBlock : null;
	}

	private boolean allDefinitionsEquivalent(java.util.Collection<com.google.javascript.rhino.Node> definitions) {
		java.util.List<com.google.javascript.rhino.Node> list = com.google.common.collect.Lists.newArrayList();
		list.addAll(definitions);
		com.google.javascript.rhino.Node node0 = list.get(0);
		for (int i = 1; i < (list.size()); i++) {
			if (!(compiler.areNodesEqualForInlining(list.get(i), node0))) {
				return false;
			}
		}
		return true;
	}

	private void inlinePropertyReturn(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node call, com.google.javascript.rhino.Node returnedValue) {
		com.google.javascript.rhino.Node getProp = returnedValue.cloneTree();
		com.google.javascript.jscomp.InlineGetters.replaceThis(getProp, call.getFirstChild().removeFirstChild());
		parent.replaceChild(call, getProp);
		compiler.reportCodeChange();
	}

	private void inlineConstReturn(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node call, com.google.javascript.rhino.Node returnedValue) {
		com.google.javascript.rhino.Node retValue = returnedValue.cloneTree();
		parent.replaceChild(call, retValue);
		compiler.reportCodeChange();
	}

	private void inlineEmptyMethod(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node call) {
		if (com.google.javascript.jscomp.NodeUtil.isExprCall(parent)) {
			parent.getParent().replaceChild(parent, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
		}else {
			com.google.javascript.rhino.Node srcLocation = call;
			parent.replaceChild(call, com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation));
		}
		compiler.reportCodeChange();
	}

	private boolean argsMayHaveSideEffects(com.google.javascript.rhino.Node call) {
		for (com.google.javascript.rhino.Node currentChild = call.getFirstChild().getNext(); currentChild != null; currentChild = currentChild.getNext()) {
			if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(currentChild)) {
				return true;
			}
		}
		return false;
	}

	static final com.google.javascript.jscomp.MethodCompilerPass.SignatureStore DUMMY_SIGNATURE_STORE = new com.google.javascript.jscomp.MethodCompilerPass.SignatureStore() {
		@java.lang.Override
		public void addSignature(java.lang.String functionName, com.google.javascript.rhino.Node functionNode, java.lang.String sourceFile) {
		}

		@java.lang.Override
		public void removeSignature(java.lang.String functionName) {
		}

		@java.lang.Override
		public void reset() {
		}
	};

	@java.lang.Override
	com.google.javascript.jscomp.MethodCompilerPass.SignatureStore getSignatureStore() {
		return com.google.javascript.jscomp.InlineGetters.DUMMY_SIGNATURE_STORE;
	}
}


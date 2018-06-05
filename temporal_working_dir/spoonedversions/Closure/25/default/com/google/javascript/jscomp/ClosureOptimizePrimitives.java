

package com.google.javascript.jscomp;


final class ClosureOptimizePrimitives implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private class FindObjectCreateCalls extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		java.util.List<com.google.javascript.rhino.Node> callNodes = com.google.common.collect.Lists.newArrayList();

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isCall()) {
				java.lang.String fnName = n.getFirstChild().getQualifiedName();
				if (("goog$object$create".equals(fnName)) || ("goog.object.create".equals(fnName))) {
					callNodes.add(n);
				}
			}
		}
	}

	ClosureOptimizePrimitives(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ClosureOptimizePrimitives.FindObjectCreateCalls pass = new com.google.javascript.jscomp.ClosureOptimizePrimitives.FindObjectCreateCalls();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, pass);
		processObjectCreateCalls(pass.callNodes);
	}

	private void processObjectCreateCalls(java.util.List<com.google.javascript.rhino.Node> callNodes) {
		for (com.google.javascript.rhino.Node callNode : callNodes) {
			com.google.javascript.rhino.Node curParam = callNode.getFirstChild().getNext();
			if (canOptimizeObjectCreate(curParam)) {
				com.google.javascript.rhino.Node objNode = com.google.javascript.rhino.IR.objectlit().srcref(callNode);
				while (curParam != null) {
					com.google.javascript.rhino.Node keyNode = curParam;
					com.google.javascript.rhino.Node valueNode = curParam.getNext();
					curParam = valueNode.getNext();
					callNode.removeChild(keyNode);
					callNode.removeChild(valueNode);
					if (!(keyNode.isString())) {
						keyNode = com.google.javascript.rhino.IR.string(com.google.javascript.jscomp.NodeUtil.getStringValue(keyNode)).srcref(keyNode);
					}
					keyNode.setType(com.google.javascript.rhino.Token.STRING_KEY);
					keyNode.setQuotedString();
					objNode.addChildToBack(com.google.javascript.rhino.IR.propdef(keyNode, valueNode));
				} 
				callNode.getParent().replaceChild(callNode, objNode);
				compiler.reportCodeChange();
			}
		}
	}

	private boolean canOptimizeObjectCreate(com.google.javascript.rhino.Node firstParam) {
		com.google.javascript.rhino.Node curParam = firstParam;
		while (curParam != null) {
			if ((!(curParam.isString())) && (!(curParam.isNumber()))) {
				return false;
			}
			curParam = curParam.getNext();
			if (curParam == null) {
				return false;
			}
			curParam = curParam.getNext();
		} 
		return true;
	}
}


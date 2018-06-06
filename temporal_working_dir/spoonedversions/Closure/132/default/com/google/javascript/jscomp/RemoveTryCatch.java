

package com.google.javascript.jscomp;


class RemoveTryCatch implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<com.google.javascript.rhino.Node> tryNodesContainingReturnStatements;

	RemoveTryCatch(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.tryNodesContainingReturnStatements = new java.util.HashSet<com.google.javascript.rhino.Node>();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RemoveTryCatch.RemoveTryCatchCode());
	}

	private class RemoveTryCatchCode extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.TRY :
					com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
					if ((info != null) && (info.shouldPreserveTry())) {
						return ;
					}
					com.google.javascript.rhino.Node tryBlock = n.getFirstChild();
					com.google.javascript.rhino.Node catchBlock = tryBlock.getNext();
					com.google.javascript.rhino.Node finallyBlock = catchBlock != null ? catchBlock.getNext() : null;
					if ((finallyBlock != null) && (tryNodesContainingReturnStatements.contains(n))) {
						return ;
					}
					if (catchBlock.hasOneChild()) {
						com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(catchBlock);
					}
					n.detachChildren();
					com.google.javascript.rhino.Node block;
					if (!(com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent))) {
						block = com.google.javascript.rhino.IR.block();
						parent.replaceChild(n, block);
						block.addChildToFront(tryBlock);
					}else {
						parent.replaceChild(n, tryBlock);
						block = parent;
					}
					if (finallyBlock != null) {
						block.addChildAfter(finallyBlock, tryBlock);
					}
					compiler.reportCodeChange();
					break;
				case com.google.javascript.rhino.Token.RETURN :
					for (com.google.javascript.rhino.Node anc = parent; (anc != null) && (!(anc.isFunction())); anc = anc.getParent()) {
						if (anc.isTry()) {
							tryNodesContainingReturnStatements.add(anc);
							break;
						}
					}
					break;
			}
		}
	}
}


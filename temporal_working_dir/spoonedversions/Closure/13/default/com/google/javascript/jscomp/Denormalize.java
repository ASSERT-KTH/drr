

package com.google.javascript.jscomp;


class Denormalize implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	Denormalize(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.Denormalize.this);
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		maybeCollapseIntoForStatements(n, parent);
	}

	private void maybeCollapseIntoForStatements(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((parent == null) || (!(com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent)))) {
			return ;
		}
		if ((!(n.isExprResult())) && (!(n.isVar()))) {
			return ;
		}
		com.google.javascript.rhino.Node nextSibling = n.getNext();
		if (nextSibling == null) {
			return ;
		}else
			if (com.google.javascript.jscomp.NodeUtil.isForIn(nextSibling)) {
				com.google.javascript.rhino.Node forNode = nextSibling;
				com.google.javascript.rhino.Node forVar = forNode.getFirstChild();
				if (((forVar.isName()) && (n.isVar())) && (n.hasOneChild())) {
					com.google.javascript.rhino.Node name = n.getFirstChild();
					if ((!(name.hasChildren())) && (forVar.getString().equals(name.getString()))) {
						parent.removeChild(n);
						forNode.replaceChild(forVar, n);
						compiler.reportCodeChange();
					}
				}
			}else
				if ((nextSibling.isFor()) && (nextSibling.getFirstChild().isEmpty())) {
					if (com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.IN)) {
						return ;
					}
					com.google.javascript.rhino.Node forNode = nextSibling;
					com.google.javascript.rhino.Node oldInitializer = forNode.getFirstChild();
					parent.removeChild(n);
					com.google.javascript.rhino.Node newInitializer;
					if (n.isVar()) {
						newInitializer = n;
					}else {
						com.google.common.base.Preconditions.checkState(n.hasOneChild());
						newInitializer = n.getFirstChild();
						n.removeChild(newInitializer);
					}
					forNode.replaceChild(oldInitializer, newInitializer);
					compiler.reportCodeChange();
				}
			
		
	}

	static class StripConstantAnnotations extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
		private com.google.javascript.jscomp.AbstractCompiler compiler;

		StripConstantAnnotations(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node js) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.this);
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.this);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (((node.isName()) || (node.isString())) || (node.isStringKey())) {
				node.removeProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
			}
		}
	}
}




package com.google.javascript.jscomp;


class CollapseAnonymousFunctions implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public CollapseAnonymousFunctions(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.common.base.Preconditions.checkArgument(compiler.getLifeCycleStage().isNormalized());
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.CollapseAnonymousFunctions.Callback());
	}

	private class Callback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.VAR)) {
				return ;
			}
			com.google.javascript.rhino.Node grandparent = parent.getParent();
			if (!((parent.isScript()) || (((grandparent != null) && (grandparent.isFunction())) && (parent.isBlock())))) {
				return ;
			}
			com.google.common.base.Preconditions.checkState(n.hasOneChild());
			com.google.javascript.rhino.Node name = n.getFirstChild();
			com.google.javascript.rhino.Node value = name.getFirstChild();
			if (((value != null) && (value.isFunction())) && (!(isRecursiveFunction(value)))) {
				com.google.javascript.rhino.Node fnName = value.getFirstChild();
				fnName.setString(name.getString());
				com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(name, fnName);
				name.removeChild(value);
				parent.replaceChild(n, value);
				if ((!(t.inGlobalScope())) && (com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(value))) {
					parent.addChildToFront(value.detachFromParent());
				}
				compiler.reportCodeChange();
			}
		}

		private boolean isRecursiveFunction(com.google.javascript.rhino.Node function) {
			com.google.javascript.rhino.Node name = function.getFirstChild();
			if (name.getString().isEmpty()) {
				return false;
			}
			com.google.javascript.rhino.Node args = name.getNext();
			com.google.javascript.rhino.Node body = args.getNext();
			return containsName(body, name.getString());
		}

		private boolean containsName(com.google.javascript.rhino.Node n, java.lang.String name) {
			if ((n.isName()) && (n.getString().equals(name))) {
				return true;
			}
			for (com.google.javascript.rhino.Node child : n.children()) {
				if (containsName(child, name)) {
					return true;
				}
			}
			return false;
		}
	}
}


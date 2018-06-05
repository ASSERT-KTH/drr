

package com.google.javascript.jscomp;


class IgnoreCajaProperties implements com.google.javascript.jscomp.CompilerPass {
	final com.google.javascript.jscomp.AbstractCompiler compiler;

	int counter;

	public IgnoreCajaProperties(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		com.google.javascript.jscomp.IgnoreCajaProperties.this.counter = 0;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.IgnoreCajaProperties.Traversal());
	}

	private class Traversal extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isFor()) && ((n.getChildCount()) == 3)) {
				com.google.javascript.rhino.Node body = n.getLastChild();
				n.removeChild(body);
				com.google.javascript.rhino.Node key = n.getFirstChild();
				n.removeChild(key);
				com.google.javascript.rhino.Node tmp = com.google.javascript.rhino.IR.name(("JSCompiler_IgnoreCajaProperties_" + ((counter)++)));
				n.addChildToFront(com.google.javascript.rhino.IR.var(tmp));
				com.google.javascript.rhino.Node ifBody;
				if (key.isVar()) {
					ifBody = com.google.javascript.rhino.IR.block(key, com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(key.getFirstChild().cloneNode(), tmp.cloneTree())), body);
				}else {
					ifBody = com.google.javascript.rhino.IR.block(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(key, tmp.cloneTree())), body);
				}
				com.google.javascript.rhino.Node newBody = com.google.javascript.rhino.IR.block(com.google.javascript.rhino.IR.ifNode(com.google.javascript.rhino.IR.not(com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.getprop(tmp.cloneTree(), com.google.javascript.rhino.IR.string("match")), com.google.javascript.rhino.IR.regexp(com.google.javascript.rhino.IR.string("___$")))), ifBody));
				n.addChildToBack(newBody);
				compiler.reportCodeChange();
			}
		}
	}
}


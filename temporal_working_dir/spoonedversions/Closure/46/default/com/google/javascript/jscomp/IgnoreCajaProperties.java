

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
				com.google.javascript.rhino.Node tmp = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, ("JSCompiler_IgnoreCajaProperties_" + ((counter)++)));
				n.addChildToFront(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, tmp));
				com.google.javascript.rhino.Node assignment;
				com.google.javascript.rhino.Node ifBody;
				if (key.isVar()) {
					ifBody = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, key, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, key.getFirstChild().cloneNode(), tmp.cloneTree())), body);
				}else {
					ifBody = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, key, tmp.cloneTree())), body);
				}
				com.google.javascript.rhino.Node newBody = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.IF, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NOT, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, tmp.cloneTree(), com.google.javascript.rhino.Node.newString("match")), new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, com.google.javascript.rhino.Node.newString("___$")))), ifBody));
				n.addChildToBack(newBody);
				compiler.reportCodeChange();
			}
		}
	}
}


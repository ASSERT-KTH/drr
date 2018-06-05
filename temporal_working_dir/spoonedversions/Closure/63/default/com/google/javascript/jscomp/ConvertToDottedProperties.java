

package com.google.javascript.jscomp;


class ConvertToDottedProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	ConvertToDottedProperties(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ConvertToDottedProperties.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GET :
			case com.google.javascript.rhino.Token.SET :
			case com.google.javascript.rhino.Token.STRING :
				if ((com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)) && (com.google.javascript.jscomp.NodeUtil.isValidPropertyName(n.getString()))) {
					n.putBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP, false);
				}
				break;
			case com.google.javascript.rhino.Token.GETELEM :
				com.google.javascript.rhino.Node left = n.getFirstChild();
				com.google.javascript.rhino.Node right = left.getNext();
				if (((right.getType()) == (com.google.javascript.rhino.Token.STRING)) && (com.google.javascript.jscomp.NodeUtil.isValidPropertyName(right.getString()))) {
					n.removeChild(left);
					n.removeChild(right);
					parent.replaceChild(n, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, left, right));
					compiler.reportCodeChange();
				}
				break;
		}
	}
}


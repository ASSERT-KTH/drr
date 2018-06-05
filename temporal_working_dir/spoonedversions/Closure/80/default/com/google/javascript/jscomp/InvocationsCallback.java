

package com.google.javascript.jscomp;


abstract class InvocationsCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) != (com.google.javascript.rhino.Token.CALL)) {
			return ;
		}
		com.google.javascript.rhino.Node function = n.getFirstChild();
		if ((function.getType()) != (com.google.javascript.rhino.Token.GETPROP)) {
			return ;
		}
		com.google.javascript.rhino.Node nameNode = function.getFirstChild().getNext();
		if ((nameNode.getType()) != (com.google.javascript.rhino.Token.STRING)) {
			return ;
		}
		visit(t, n, parent, nameNode.getString());
	}

	abstract void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, java.lang.String callName);
}


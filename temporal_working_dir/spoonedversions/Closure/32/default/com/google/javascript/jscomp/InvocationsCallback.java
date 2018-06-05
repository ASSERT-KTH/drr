

package com.google.javascript.jscomp;


abstract class InvocationsCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (!(n.isCall())) {
			return ;
		}
		com.google.javascript.rhino.Node function = n.getFirstChild();
		if (!(function.isGetProp())) {
			return ;
		}
		com.google.javascript.rhino.Node nameNode = function.getFirstChild().getNext();
		if (!(nameNode.isString())) {
			return ;
		}
		visit(t, n, parent, nameNode.getString());
	}

	abstract void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node parent, java.lang.String callName);
}


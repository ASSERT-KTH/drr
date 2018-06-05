

package com.google.javascript.jscomp.jsonml;


class NodeUtil {
	static boolean isForIn(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.FOR)) && ((n.getChildCount()) == 3);
	}

	static boolean isStatement(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		com.google.common.base.Preconditions.checkState((parent != null));
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.LABEL :
				return true;
			default :
				return false;
		}
	}

	static boolean isFunctionDeclaration(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && (com.google.javascript.jscomp.jsonml.NodeUtil.isStatement(n));
	}

	static boolean isHoistedFunctionDeclaration(com.google.javascript.rhino.Node n) {
		return (com.google.javascript.jscomp.jsonml.NodeUtil.isFunctionDeclaration(n)) && (((n.getParent().getType()) == (com.google.javascript.rhino.Token.SCRIPT)) || ((n.getParent().getParent().getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
	}
}


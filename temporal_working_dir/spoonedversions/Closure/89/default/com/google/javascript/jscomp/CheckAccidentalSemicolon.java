

package com.google.javascript.jscomp;


final class CheckAccidentalSemicolon extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	static final com.google.javascript.jscomp.DiagnosticType SUSPICIOUS_SEMICOLON = com.google.javascript.jscomp.DiagnosticType.warning("JSC_SUSPICIOUS_SEMICOLON", "If this if/for/while really shouldn't have a body, use {}");

	private final com.google.javascript.jscomp.CheckLevel level;

	CheckAccidentalSemicolon(com.google.javascript.jscomp.CheckLevel level) {
		this.level = level;
	}

	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node child;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.IF :
				child = n.getFirstChild().getNext();
				break;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.FOR :
				child = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(n);
				break;
			default :
				return ;
		}
		for (; child != null; child = child.getNext()) {
			if (((child.getType()) == (com.google.javascript.rhino.Token.BLOCK)) && (!(child.hasChildren()))) {
				if (child.wasEmptyNode()) {
					t.getCompiler().report(t.makeError(n, level, com.google.javascript.jscomp.CheckAccidentalSemicolon.SUSPICIOUS_SEMICOLON));
				}
			}
		}
	}
}


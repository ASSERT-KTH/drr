

package com.google.javascript.jscomp;


final class CheckSuspiciousCode extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	static final com.google.javascript.jscomp.DiagnosticType SUSPICIOUS_SEMICOLON = com.google.javascript.jscomp.DiagnosticType.warning("JSC_SUSPICIOUS_SEMICOLON", "If this if/for/while really shouldn't have a body, use {}");

	static final com.google.javascript.jscomp.DiagnosticType SUSPICIOUS_COMPARISON_WITH_NAN = com.google.javascript.jscomp.DiagnosticType.warning("JSC_SUSPICIOUS_NAN", "Comparison again NaN is always false. Did you mean isNaN()?");

	CheckSuspiciousCode() {
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		checkMissingSemicolon(t, n);
		checkNaN(t, n);
	}

	private void checkMissingSemicolon(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.IF :
				com.google.javascript.rhino.Node trueCase = n.getFirstChild().getNext();
				reportIfWasEmpty(t, trueCase);
				com.google.javascript.rhino.Node elseCase = trueCase.getNext();
				if (elseCase != null) {
					reportIfWasEmpty(t, elseCase);
				}
				break;
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.FOR :
				reportIfWasEmpty(t, com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(n));
				break;
		}
	}

	private void reportIfWasEmpty(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node block) {
		com.google.common.base.Preconditions.checkState(block.isBlock());
		if ((!(block.hasChildren())) && (block.wasEmptyNode())) {
			t.getCompiler().report(t.makeError(block, com.google.javascript.jscomp.CheckSuspiciousCode.SUSPICIOUS_SEMICOLON));
		}
	}

	private void checkNaN(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
				reportIfNaN(t, n.getFirstChild());
				reportIfNaN(t, n.getLastChild());
		}
	}

	private void reportIfNaN(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (com.google.javascript.jscomp.NodeUtil.isNaN(n)) {
			t.getCompiler().report(t.makeError(n.getParent(), com.google.javascript.jscomp.CheckSuspiciousCode.SUSPICIOUS_COMPARISON_WITH_NAN));
		}
	}
}


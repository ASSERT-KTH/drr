

package com.google.javascript.jscomp;


final class CheckSideEffects extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	static final com.google.javascript.jscomp.DiagnosticType USELESS_CODE_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_USELESS_CODE", "Suspicious code. {0}");

	private final com.google.javascript.jscomp.CheckLevel level;

	CheckSideEffects(com.google.javascript.jscomp.CheckLevel level) {
		this.level = level;
	}

	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (((n.getType()) == (com.google.javascript.rhino.Token.EMPTY)) || ((n.getType()) == (com.google.javascript.rhino.Token.COMMA))) {
			return ;
		}
		if (parent == null)
			return ;
		
		int pt = parent.getType();
		if (pt == (com.google.javascript.rhino.Token.COMMA)) {
			com.google.javascript.rhino.Node gramps = parent.getParent();
			if (((gramps.getType()) == (com.google.javascript.rhino.Token.CALL)) && (parent == (gramps.getFirstChild()))) {
				if ((((n == (parent.getFirstChild())) && ((parent.getChildCount()) == 2)) && ((n.getNext().getType()) == (com.google.javascript.rhino.Token.NAME))) && ("eval".equals(n.getNext().getString()))) {
					return ;
				}
			}
			if (n == (parent.getLastChild())) {
				for (com.google.javascript.rhino.Node an : parent.getAncestors()) {
					int ancestorType = an.getType();
					if (ancestorType == (com.google.javascript.rhino.Token.COMMA))
						continue;
					
					if ((ancestorType != (com.google.javascript.rhino.Token.EXPR_RESULT)) && (ancestorType != (com.google.javascript.rhino.Token.BLOCK)))
						return ;
					else
						break;
					
				}
			}
		}else
			if ((pt != (com.google.javascript.rhino.Token.EXPR_RESULT)) && (pt != (com.google.javascript.rhino.Token.BLOCK))) {
				if (((pt == (com.google.javascript.rhino.Token.FOR)) && ((parent.getChildCount()) == 4)) && ((n == (parent.getFirstChild())) || (n == (parent.getFirstChild().getNext().getNext())))) {
				}else {
					return ;
				}
			}
		
		boolean isSimpleOp = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(n.getType());
		if (isSimpleOp || (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n, t.getCompiler())))) {
			if ((n.isQualifiedName()) && ((n.getJSDocInfo()) != null)) {
				return ;
			}else
				if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(n)) {
					return ;
				}
			
			java.lang.String msg = "This code lacks side-effects. Is there a bug?";
			if ((n.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				msg = "Is there a missing '+' on the previous line?";
			}else
				if (isSimpleOp) {
					msg = ("The result of the '" + (com.google.javascript.rhino.Node.tokenToName(n.getType()))) + "' operator is not being used.";
				}
			
			t.getCompiler().report(t.makeError(n, level, com.google.javascript.jscomp.CheckSideEffects.USELESS_CODE_ERROR, msg));
		}
	}
}


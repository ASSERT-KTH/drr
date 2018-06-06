

package com.google.javascript.jscomp;


final class CheckGlobalThis implements com.google.javascript.jscomp.NodeTraversal.Callback {
	static final com.google.javascript.jscomp.DiagnosticType GLOBAL_THIS = com.google.javascript.jscomp.DiagnosticType.warning("JSC_USED_GLOBAL_THIS", "dangerous use of the global 'this' object");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.rhino.Node assignLhsChild = null;

	CheckGlobalThis(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (n.isFunction()) {
			com.google.javascript.rhino.JSDocInfo jsDoc = getFunctionJsDocInfo(n);
			if ((jsDoc != null) && ((((jsDoc.isConstructor()) || (jsDoc.isInterface())) || (jsDoc.hasThisType())) || (jsDoc.isOverride()))) {
				return false;
			}
			int pType = parent.getType();
			if (!(((((pType == (com.google.javascript.rhino.Token.BLOCK)) || (pType == (com.google.javascript.rhino.Token.SCRIPT))) || (pType == (com.google.javascript.rhino.Token.NAME))) || (pType == (com.google.javascript.rhino.Token.ASSIGN))) || (pType == (com.google.javascript.rhino.Token.STRING_KEY)))) {
				return false;
			}
			com.google.javascript.rhino.Node gramps = parent.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, gramps)) {
				com.google.javascript.rhino.JSDocInfo maybeLends = gramps.getJSDocInfo();
				if (((maybeLends != null) && ((maybeLends.getLendsName()) != null)) && (maybeLends.getLendsName().endsWith(".prototype"))) {
					return false;
				}
			}
		}
		if ((parent != null) && (parent.isAssign())) {
			com.google.javascript.rhino.Node lhs = parent.getFirstChild();
			com.google.javascript.rhino.Node rhs = lhs.getNext();
			if (n == lhs) {
				if ((assignLhsChild) == null) {
					assignLhsChild = lhs;
				}
			}else {
				if (com.google.javascript.jscomp.NodeUtil.isGet(lhs)) {
					if ((lhs.isGetProp()) && (lhs.getLastChild().getString().equals("prototype"))) {
						return false;
					}
					com.google.javascript.rhino.Node llhs = lhs.getFirstChild();
					if ((llhs.isGetProp()) && (llhs.getLastChild().getString().equals("prototype"))) {
						return false;
					}
				}
			}
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.isThis()) && (shouldReportThis(n, parent))) {
			compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckGlobalThis.GLOBAL_THIS));
		}
		if (n == (assignLhsChild)) {
			assignLhsChild = null;
		}
	}

	private boolean shouldReportThis(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((assignLhsChild) != null) {
			return true;
		}
		return (parent != null) && (com.google.javascript.jscomp.NodeUtil.isGet(parent));
	}

	private com.google.javascript.rhino.JSDocInfo getFunctionJsDocInfo(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.JSDocInfo jsDoc = n.getJSDocInfo();
		com.google.javascript.rhino.Node parent = n.getParent();
		if (jsDoc == null) {
			int parentType = parent.getType();
			if ((parentType == (com.google.javascript.rhino.Token.NAME)) || (parentType == (com.google.javascript.rhino.Token.ASSIGN))) {
				jsDoc = parent.getJSDocInfo();
				if ((jsDoc == null) && (parentType == (com.google.javascript.rhino.Token.NAME))) {
					com.google.javascript.rhino.Node gramps = parent.getParent();
					if (gramps.isVar()) {
						jsDoc = gramps.getJSDocInfo();
					}
				}
			}
		}
		return jsDoc;
	}
}


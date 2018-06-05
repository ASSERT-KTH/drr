

package com.google.javascript.jscomp;


class CheckMissingGetCssName extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel level;

	private final java.util.regex.Matcher blacklist;

	static final java.lang.String GET_CSS_NAME_FUNCTION = "goog.getCssName";

	static final java.lang.String GET_UNIQUE_ID_FUNCTION = ".getUniqueId";

	static final com.google.javascript.jscomp.DiagnosticType MISSING_GETCSSNAME = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_MISSING_GETCSSNAME", "missing goog.getCssName around literal ''{0}''");

	CheckMissingGetCssName(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level, java.lang.String blacklistRegex) {
		this.compiler = compiler;
		this.level = level;
		this.blacklist = java.util.regex.Pattern.compile((("\\b(?:" + blacklistRegex) + ")")).matcher("");
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckMissingGetCssName.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((((n.isString()) && (!(parent.isGetProp()))) && (!(parent.isRegExp()))) && (!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)))) {
			java.lang.String s = n.getString();
			for (blacklist.reset(s); blacklist.find();) {
				if (insideGetCssNameCall(n, parent)) {
					continue;
				}
				if (insideGetUniqueIdCall(n, parent)) {
					continue;
				}
				if (insideAssignmentToIdConstant(n, parent)) {
					continue;
				}
				compiler.report(t.makeError(n, level, com.google.javascript.jscomp.CheckMissingGetCssName.MISSING_GETCSSNAME, blacklist.group()));
			}
		}
	}

	private boolean insideGetCssNameCall(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return (parent.isCall()) && (com.google.javascript.jscomp.CheckMissingGetCssName.GET_CSS_NAME_FUNCTION.equals(parent.getFirstChild().getQualifiedName()));
	}

	private boolean insideGetUniqueIdCall(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		java.lang.String name = parent.isCall() ? parent.getFirstChild().getQualifiedName() : null;
		return (name != null) && (name.endsWith(com.google.javascript.jscomp.CheckMissingGetCssName.GET_UNIQUE_ID_FUNCTION));
	}

	private boolean insideAssignmentToIdConstant(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (parent.isAssign()) {
			java.lang.String qname = parent.getFirstChild().getQualifiedName();
			return (qname != null) && (isIdName(qname));
		}else
			if (parent.isName()) {
				com.google.javascript.rhino.Node grandParent = parent.getParent();
				if ((grandParent != null) && (grandParent.isVar())) {
					java.lang.String name = parent.getString();
					return isIdName(name);
				}else {
					return false;
				}
			}else {
				return false;
			}
		
	}

	private boolean isIdName(java.lang.String name) {
		return (name.endsWith("ID")) || (name.endsWith("ID_"));
	}
}


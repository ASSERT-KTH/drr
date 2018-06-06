

package com.google.javascript.jscomp;


class CheckRegExp extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType REGEXP_REFERENCE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_REGEXP_REFERENCE", ("References to the global RegExp object prevents " + "optimization of regular expressions."));

	static final com.google.javascript.jscomp.DiagnosticType MALFORMED_REGEXP = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MALFORMED_REGEXP", "Malformed Regular Expression: {0}");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private boolean globalRegExpPropertiesUsed = false;

	public boolean isGlobalRegExpPropertiesUsed() {
		return globalRegExpPropertiesUsed;
	}

	public CheckRegExp(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckRegExp.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (com.google.javascript.jscomp.NodeUtil.isReferenceName(n)) {
			java.lang.String name = n.getString();
			if ((name.equals("RegExp")) && ((t.getScope().getVar(name)) == null)) {
				int parentType = parent.getType();
				boolean first = n == (parent.getFirstChild());
				if (!((((parentType == (com.google.javascript.rhino.Token.NEW)) && first) || ((parentType == (com.google.javascript.rhino.Token.CALL)) && first)) || ((parentType == (com.google.javascript.rhino.Token.INSTANCEOF)) && (!first)))) {
					t.report(n, com.google.javascript.jscomp.CheckRegExp.REGEXP_REFERENCE);
					globalRegExpPropertiesUsed = true;
				}
			}
		}else
			if (n.isRegExp()) {
				java.lang.String pattern = n.getFirstChild().getString();
				java.lang.String flags = (n.getChildCount()) == 2 ? n.getLastChild().getString() : "";
				try {
					com.google.javascript.jscomp.regex.RegExpTree.parseRegExp(pattern, flags);
				} catch (java.lang.IllegalArgumentException ex) {
					t.report(n, com.google.javascript.jscomp.CheckRegExp.MALFORMED_REGEXP, ex.getMessage());
				}
			}
		
	}
}


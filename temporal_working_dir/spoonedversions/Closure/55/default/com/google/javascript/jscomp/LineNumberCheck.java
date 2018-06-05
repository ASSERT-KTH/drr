

package com.google.javascript.jscomp;


class LineNumberCheck implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	static final com.google.javascript.jscomp.DiagnosticType MISSING_LINE_INFO = com.google.javascript.jscomp.DiagnosticType.error("JSC_MISSING_LINE_INFO", ("No source location information associated with {0}.\n" + (("Most likely a Node has been created with settings the source file " + "and line/column location.  Usually this is done using ") + "Node.copyInformationFrom and supplying a Node from the source AST.")));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private boolean requiresLineNumbers = false;

	LineNumberCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	public void setCheckSubTree(com.google.javascript.rhino.Node root) {
		requiresLineNumbers = true;
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.LineNumberCheck.this);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		requiresLineNumbers = false;
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.LineNumberCheck.this);
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) {
			requiresLineNumbers = true;
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) {
			requiresLineNumbers = false;
		}else
			if (requiresLineNumbers) {
				if ((n.getLineno()) == (-1)) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.LineNumberCheck.MISSING_LINE_INFO, n.toStringTree()));
				}
			}
		
	}
}


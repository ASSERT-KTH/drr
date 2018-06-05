

package com.google.javascript.jscomp;


class CheckDebuggerStatement extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType DEBUGGER_STATEMENT_PRESENT = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEBUGGER_STATEMENT_PRESENT", ("Using the debugger statement can halt your application if the user " + "has a JavaScript debugger running."));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public CheckDebuggerStatement(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckDebuggerStatement.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (n.isDebugger()) {
			t.report(n, com.google.javascript.jscomp.CheckDebuggerStatement.DEBUGGER_STATEMENT_PRESENT);
		}
	}
}


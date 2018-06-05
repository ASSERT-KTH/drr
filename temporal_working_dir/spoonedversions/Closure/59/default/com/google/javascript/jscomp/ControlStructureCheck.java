

package com.google.javascript.jscomp;


class ControlStructureCheck implements com.google.javascript.jscomp.HotSwapCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	static final com.google.javascript.jscomp.DiagnosticType USE_OF_WITH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_USE_OF_WITH", "The use of the 'with' structure should be avoided.");

	ControlStructureCheck(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		check(root);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot) {
		check(scriptRoot);
	}

	private void check(com.google.javascript.rhino.Node node) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.WITH :
				com.google.javascript.rhino.JSDocInfo info = node.getJSDocInfo();
				boolean allowWith = (info != null) && (info.getSuppressions().contains("with"));
				if (!allowWith) {
					report(node, com.google.javascript.jscomp.ControlStructureCheck.USE_OF_WITH);
				}
				break;
		}
		for (com.google.javascript.rhino.Node bChild = node.getFirstChild(); bChild != null;) {
			com.google.javascript.rhino.Node next = bChild.getNext();
			check(bChild);
			bChild = next;
		}
	}

	private void report(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType error) {
		compiler.report(com.google.javascript.jscomp.JSError.make(n.getSourceFileName(), n, error));
	}
}


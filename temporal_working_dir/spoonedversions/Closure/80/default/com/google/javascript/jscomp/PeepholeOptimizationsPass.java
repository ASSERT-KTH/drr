

package com.google.javascript.jscomp;


class PeepholeOptimizationsPass extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations;

	PeepholeOptimizationsPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.AbstractPeepholeOptimization... optimizations) {
		com.google.javascript.jscomp.PeepholeOptimizationsPass.this.compiler = compiler;
		this.peepholeOptimizations = optimizations;
	}

	public com.google.javascript.jscomp.AbstractCompiler getCompiler() {
		return compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.PeepholeOptimizationsPass.this);
		beginTraversal(t);
		t.traverse(root);
		endTraversal(t);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node currentVersionOfNode = n;
		boolean somethingChanged = false;
		do {
			somethingChanged = false;
			for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
				com.google.javascript.rhino.Node newVersionOfNode = optimization.optimizeSubtree(currentVersionOfNode);
				if (newVersionOfNode != currentVersionOfNode) {
					somethingChanged = true;
					currentVersionOfNode = newVersionOfNode;
				}
				if (currentVersionOfNode == null) {
					return ;
				}
			}
		} while (somethingChanged );
	}

	private void beginTraversal(com.google.javascript.jscomp.NodeTraversal t) {
		for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
			optimization.beginTraversal(t);
		}
	}

	private void endTraversal(com.google.javascript.jscomp.NodeTraversal t) {
		for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
			optimization.endTraversal(t);
		}
	}
}


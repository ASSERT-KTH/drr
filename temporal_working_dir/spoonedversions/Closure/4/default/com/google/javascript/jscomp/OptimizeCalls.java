

package com.google.javascript.jscomp;


class OptimizeCalls implements com.google.javascript.jscomp.CompilerPass {
	java.util.List<com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass> passes = com.google.common.collect.Lists.newArrayList();

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	OptimizeCalls(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.OptimizeCalls.this.compiler = compiler;
	}

	com.google.javascript.jscomp.OptimizeCalls addPass(com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass pass) {
		passes.add(pass);
		return com.google.javascript.jscomp.OptimizeCalls.this;
	}

	interface CallGraphCompilerPass {
		void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.SimpleDefinitionFinder definitions);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if ((passes.size()) > 0) {
			com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
			defFinder.process(externs, root);
			for (com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass pass : passes) {
				pass.process(externs, root, defFinder);
			}
		}
	}
}


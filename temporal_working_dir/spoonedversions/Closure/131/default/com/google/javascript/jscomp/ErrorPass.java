

package com.google.javascript.jscomp;


class ErrorPass implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.JSError error;

	ErrorPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.DiagnosticType error) {
		this(compiler, com.google.javascript.jscomp.JSError.make(error));
	}

	ErrorPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSError error) {
		this.compiler = compiler;
		this.error = error;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		compiler.report(error);
	}
}


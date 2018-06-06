

package com.google.javascript.jscomp;


public class SyntheticAst implements com.google.javascript.jscomp.SourceAst {
	private static final long serialVersionUID = 1L;

	private final com.google.javascript.rhino.InputId inputId;

	private final com.google.javascript.jscomp.SourceFile sourceFile;

	private com.google.javascript.rhino.Node root;

	SyntheticAst(java.lang.String sourceName) {
		this.inputId = new com.google.javascript.rhino.InputId(sourceName);
		this.sourceFile = new com.google.javascript.jscomp.SourceFile(sourceName);
		clearAst();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return root;
	}

	@java.lang.Override
	public void clearAst() {
		root = com.google.javascript.rhino.IR.script();
		root.setInputId(inputId);
		root.setStaticSourceFile(sourceFile);
	}

	@java.lang.Override
	public com.google.javascript.rhino.InputId getInputId() {
		return inputId;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SourceFile getSourceFile() {
		return sourceFile;
	}

	@java.lang.Override
	public void setSourceFile(com.google.javascript.jscomp.SourceFile file) {
		throw new java.lang.IllegalStateException("Cannot set a source file for a synthetic AST");
	}
}


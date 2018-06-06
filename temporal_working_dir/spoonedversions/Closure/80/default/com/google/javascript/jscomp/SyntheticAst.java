

package com.google.javascript.jscomp;


class SyntheticAst implements com.google.javascript.jscomp.SourceAst {
	private static final long serialVersionUID = 1L;

	private final java.lang.String sourceName;

	private com.google.javascript.rhino.Node root;

	SyntheticAst(java.lang.String sourceName) {
		this.sourceName = sourceName;
		clearAst();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return root;
	}

	@java.lang.Override
	public void clearAst() {
		root = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		root.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, sourceName);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SourceFile getSourceFile() {
		return null;
	}

	@java.lang.Override
	public void setSourceFile(com.google.javascript.jscomp.SourceFile file) {
		throw new java.lang.IllegalStateException("Cannot set a source file for a synthetic AST");
	}
}


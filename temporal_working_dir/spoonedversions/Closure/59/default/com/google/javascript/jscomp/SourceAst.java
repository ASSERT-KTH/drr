

package com.google.javascript.jscomp;


public interface SourceAst extends java.io.Serializable {
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler);

	public void clearAst();

	public com.google.javascript.jscomp.SourceFile getSourceFile();

	public void setSourceFile(com.google.javascript.jscomp.SourceFile file);
}


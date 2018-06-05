

package com.google.javascript.jscomp;


public class JsAst implements com.google.javascript.jscomp.SourceAst {
	private static final java.util.logging.Logger logger_ = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.JsAst.class.getName());

	private static final long serialVersionUID = 1L;

	private transient com.google.javascript.jscomp.SourceFile sourceFile;

	private java.lang.String fileName;

	private com.google.javascript.rhino.Node root;

	public JsAst(com.google.javascript.jscomp.SourceFile sourceFile) {
		com.google.javascript.jscomp.JsAst.this.sourceFile = sourceFile;
		com.google.javascript.jscomp.JsAst.this.fileName = sourceFile.getName();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler) {
		if ((root) == null) {
			createAst(compiler);
		}
		return root;
	}

	@java.lang.Override
	public void clearAst() {
		root = null;
		sourceFile.clearCachedSource();
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SourceFile getSourceFile() {
		return sourceFile;
	}

	@java.lang.Override
	public void setSourceFile(com.google.javascript.jscomp.SourceFile file) {
		com.google.common.base.Preconditions.checkState(fileName.equals(file.getName()));
		sourceFile = file;
	}

	private void createAst(com.google.javascript.jscomp.AbstractCompiler compiler) {
		try {
			parse(compiler, sourceFile.getName(), sourceFile.getCode());
		} catch (java.io.IOException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.AbstractCompiler.READ_ERROR, sourceFile.getName()));
		}
	}

	private void parse(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String sourceName, java.lang.String sourceStr) {
		try {
			com.google.javascript.jscomp.JsAst.logger_.fine(("Parsing: " + sourceName));
			root = com.google.javascript.jscomp.parsing.ParserRunner.parse(sourceName, sourceStr, compiler.getParserConfig(), compiler.getDefaultErrorReporter(), com.google.javascript.jscomp.JsAst.logger_);
		} catch (java.io.IOException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.AbstractCompiler.READ_ERROR, sourceName));
		}
		if (((root) == null) || (compiler.hasHaltingErrors())) {
			root = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		}else {
			compiler.prepareAst(root);
		}
		root.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, sourceName);
	}
}


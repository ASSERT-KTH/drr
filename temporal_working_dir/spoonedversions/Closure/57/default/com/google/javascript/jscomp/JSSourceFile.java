

package com.google.javascript.jscomp;


public class JSSourceFile extends com.google.javascript.jscomp.SourceFile implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public static com.google.javascript.jscomp.JSSourceFile fromFile(java.lang.String fileName, java.nio.charset.Charset charSet) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromFile(fileName, charSet));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromFile(java.lang.String fileName) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromFile(fileName, com.google.common.base.Charsets.UTF_8));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromFile(java.io.File file, java.nio.charset.Charset charSet) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromFile(file, charSet));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromFile(java.io.File file) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromFile(file, com.google.common.base.Charsets.UTF_8));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromCode(java.lang.String fileName, java.lang.String code) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromCode(fileName, code));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromInputStream(java.lang.String fileName, java.io.InputStream s) throws java.io.IOException {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromInputStream(fileName, s));
	}

	public static com.google.javascript.jscomp.JSSourceFile fromGenerator(java.lang.String fileName, com.google.javascript.jscomp.SourceFile.Generator generator) {
		return new com.google.javascript.jscomp.JSSourceFile(com.google.javascript.jscomp.SourceFile.fromGenerator(fileName, generator));
	}

	private com.google.javascript.jscomp.SourceFile referenced;

	private JSSourceFile(com.google.javascript.jscomp.SourceFile referenced) {
		super(referenced.getName());
		com.google.javascript.jscomp.JSSourceFile.this.referenced = referenced;
	}

	@java.lang.Override
	public java.lang.String getCode() throws java.io.IOException {
		return referenced.getCode();
	}

	@java.lang.Override
	public void clearCachedSource() {
		referenced.clearCachedSource();
	}

	@java.lang.Override
	@com.google.common.annotations.VisibleForTesting
	java.lang.String getCodeNoCache() {
		return referenced.getCodeNoCache();
	}
}


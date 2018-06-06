

package com.google.javascript.jscomp.testing;


public class SimpleSourceExcerptProvider implements com.google.javascript.jscomp.SourceExcerptProvider {
	private final com.google.javascript.jscomp.SourceFile sourceFile;

	public SimpleSourceExcerptProvider(java.lang.String source) {
		sourceFile = com.google.javascript.jscomp.SourceFile.fromCode("input", source);
	}

	@java.lang.Override
	public java.lang.String getSourceLine(java.lang.String sourceName, int lineNumber) {
		return sourceFile.getLine(lineNumber);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.Region getSourceRegion(java.lang.String sourceName, int lineNumber) {
		return sourceFile.getRegion(lineNumber);
	}
}


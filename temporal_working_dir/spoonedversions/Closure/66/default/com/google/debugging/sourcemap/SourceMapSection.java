

package com.google.debugging.sourcemap;


public class SourceMapSection {
	private final java.lang.String sectionUrl;

	private final int line;

	private final int column;

	public SourceMapSection(java.lang.String sectionUrl, int line, int column) {
		this.sectionUrl = sectionUrl;
		this.line = line;
		this.column = column;
	}

	public java.lang.String getSectionUrl() {
		return sectionUrl;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}
}


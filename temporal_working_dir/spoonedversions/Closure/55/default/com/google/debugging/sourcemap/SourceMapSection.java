

package com.google.debugging.sourcemap;


public class SourceMapSection {
	private final java.lang.String value;

	private final int line;

	private final int column;

	private final com.google.debugging.sourcemap.SourceMapSection.SectionType type;

	public static enum SectionType {
URL, MAP;	}

	@java.lang.Deprecated
	public SourceMapSection(java.lang.String sectionUrl, int line, int column) {
		this.type = com.google.debugging.sourcemap.SourceMapSection.SectionType.URL;
		this.value = sectionUrl;
		this.line = line;
		this.column = column;
	}

	private SourceMapSection(com.google.debugging.sourcemap.SourceMapSection.SectionType type, java.lang.String value, int line, int column) {
		this.type = type;
		this.value = value;
		this.line = line;
		this.column = column;
	}

	static com.google.debugging.sourcemap.SourceMapSection forMap(java.lang.String value, int line, int column) {
		return new com.google.debugging.sourcemap.SourceMapSection(com.google.debugging.sourcemap.SourceMapSection.SectionType.MAP, value, line, column);
	}

	static com.google.debugging.sourcemap.SourceMapSection forURL(java.lang.String value, int line, int column) {
		return new com.google.debugging.sourcemap.SourceMapSection(com.google.debugging.sourcemap.SourceMapSection.SectionType.URL, value, line, column);
	}

	public com.google.debugging.sourcemap.SourceMapSection.SectionType getSectionType() {
		return com.google.debugging.sourcemap.SourceMapSection.this.type;
	}

	public java.lang.String getSectionUrl() {
		assert type.equals(com.google.debugging.sourcemap.SourceMapSection.SectionType.URL);
		return value;
	}

	public java.lang.String getSectionValue() {
		return value;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}
}




package com.google.javascript.jscomp.sourcemap;


public class SourceMapSection {
	private final java.lang.String sectionUrl;

	private final long representedLength;

	public SourceMapSection(java.lang.String sectionUrl, long length) {
		this.sectionUrl = sectionUrl;
		this.representedLength = length;
	}

	public java.lang.String getSectionUrl() {
		return sectionUrl;
	}

	public long getLength() {
		return representedLength;
	}
}


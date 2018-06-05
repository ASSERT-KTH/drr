

package com.google.javascript.jscomp;


public class SimpleRegion implements com.google.javascript.jscomp.Region {
	private final int beginningLineNumber;

	private final int endingLineNumber;

	private final java.lang.String source;

	public SimpleRegion(int beginningLineNumber, int endingLineNumber, java.lang.String source) {
		this.beginningLineNumber = beginningLineNumber;
		this.endingLineNumber = endingLineNumber;
		this.source = source;
	}

	@java.lang.Override
	public int getBeginningLineNumber() {
		return beginningLineNumber;
	}

	@java.lang.Override
	public int getEndingLineNumber() {
		return endingLineNumber;
	}

	@java.lang.Override
	public java.lang.String getSourceExcerpt() {
		return source;
	}
}




package com.google.javascript.jscomp;


public interface Region {
	java.lang.String getSourceExcerpt();

	int getBeginningLineNumber();

	int getEndingLineNumber();
}


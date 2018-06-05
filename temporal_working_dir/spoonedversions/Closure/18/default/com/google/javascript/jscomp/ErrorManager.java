

package com.google.javascript.jscomp;


public interface ErrorManager extends com.google.javascript.jscomp.ErrorHandler {
	@java.lang.Override
	void report(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error);

	void generateReport();

	int getErrorCount();

	int getWarningCount();

	com.google.javascript.jscomp.JSError[] getErrors();

	com.google.javascript.jscomp.JSError[] getWarnings();

	void setTypedPercent(double typedPercent);

	double getTypedPercent();
}


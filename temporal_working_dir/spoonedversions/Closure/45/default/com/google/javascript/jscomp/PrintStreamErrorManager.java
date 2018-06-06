

package com.google.javascript.jscomp;


public class PrintStreamErrorManager extends com.google.javascript.jscomp.BasicErrorManager {
	private final com.google.javascript.jscomp.MessageFormatter formatter;

	private final java.io.PrintStream stream;

	private int summaryDetailLevel = 1;

	public PrintStreamErrorManager(com.google.javascript.jscomp.MessageFormatter formatter, java.io.PrintStream stream) {
		this.formatter = formatter;
		this.stream = stream;
	}

	public PrintStreamErrorManager(java.io.PrintStream stream) {
		this(com.google.javascript.jscomp.ErrorFormat.SOURCELESS.toFormatter(null, false), stream);
	}

	@java.lang.Override
	public void println(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error) {
		stream.println(error.format(level, formatter));
	}

	public void setSummaryDetailLevel(int summaryDetailLevel) {
		com.google.javascript.jscomp.PrintStreamErrorManager.this.summaryDetailLevel = summaryDetailLevel;
	}

	@java.lang.Override
	public void printSummary() {
		if ((((summaryDetailLevel) >= 3) || (((summaryDetailLevel) >= 1) && (((getErrorCount()) + (getWarningCount())) > 0))) || (((summaryDetailLevel) >= 2) && ((getTypedPercent()) > 0.0))) {
			if ((getTypedPercent()) > 0.0) {
				stream.format("%d error(s), %d warning(s), %.1f%% typed%n", getErrorCount(), getWarningCount(), getTypedPercent());
			}else {
				stream.format("%d error(s), %d warning(s)%n", getErrorCount(), getWarningCount());
			}
		}
	}
}


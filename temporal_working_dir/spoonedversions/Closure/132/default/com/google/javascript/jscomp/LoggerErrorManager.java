

package com.google.javascript.jscomp;


public class LoggerErrorManager extends com.google.javascript.jscomp.BasicErrorManager {
	private final com.google.javascript.jscomp.MessageFormatter formatter;

	private final java.util.logging.Logger logger;

	public LoggerErrorManager(com.google.javascript.jscomp.MessageFormatter formatter, java.util.logging.Logger logger) {
		this.formatter = formatter;
		this.logger = logger;
	}

	public LoggerErrorManager(java.util.logging.Logger logger) {
		this(com.google.javascript.jscomp.ErrorFormat.SOURCELESS.toFormatter(null, false), logger);
	}

	@java.lang.Override
	public void println(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error) {
		switch (level) {
			case ERROR :
				logger.severe(error.format(level, formatter));
				break;
			case WARNING :
				logger.warning(error.format(level, formatter));
				break;
			case OFF :
				break;
		}
	}

	@java.lang.Override
	protected void printSummary() {
		java.util.logging.Level level = ((getErrorCount()) + (getWarningCount())) == 0 ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING;
		if ((getTypedPercent()) > 0.0) {
			logger.log(level, "{0} error(s), {1} warning(s), {2,number,#.#}% typed", new java.lang.Object[]{ getErrorCount() , getWarningCount() , getTypedPercent() });
		}else {
			if (((getErrorCount()) + (getWarningCount())) > 0) {
				logger.log(level, "{0} error(s), {1} warning(s)", new java.lang.Object[]{ getErrorCount() , getWarningCount() });
			}
		}
	}
}


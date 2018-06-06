

package com.google.javascript.jscomp.ant;


public final class AntErrorManager extends com.google.javascript.jscomp.BasicErrorManager {
	private final com.google.javascript.jscomp.MessageFormatter formatter;

	private final org.apache.tools.ant.Task task;

	public AntErrorManager(com.google.javascript.jscomp.MessageFormatter formatter, org.apache.tools.ant.Task task) {
		this.formatter = formatter;
		this.task = task;
	}

	@java.lang.Override
	public void println(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error) {
		switch (level) {
			case ERROR :
				com.google.javascript.jscomp.ant.AntErrorManager.this.task.log(error.format(level, com.google.javascript.jscomp.ant.AntErrorManager.this.formatter), org.apache.tools.ant.Project.MSG_ERR);
				break;
			case WARNING :
				com.google.javascript.jscomp.ant.AntErrorManager.this.task.log(error.format(level, com.google.javascript.jscomp.ant.AntErrorManager.this.formatter), org.apache.tools.ant.Project.MSG_WARN);
				break;
		}
	}

	@java.lang.Override
	protected void printSummary() {
		java.lang.String message = (((getErrorCount()) + " error(s), ") + (getWarningCount())) + " warning(s)";
		if ((getTypedPercent()) > 0.0) {
			message += (", " + (getTypedPercent())) + " typed";
		}
		int level = ((getErrorCount()) + (getWarningCount())) == 0 ? org.apache.tools.ant.Project.MSG_INFO : org.apache.tools.ant.Project.MSG_WARN;
		com.google.javascript.jscomp.ant.AntErrorManager.this.task.log(message, level);
	}
}


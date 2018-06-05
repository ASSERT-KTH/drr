

package com.google.javascript.jscomp;


public abstract class WarningsGuard {
	public static enum Priority {
MAX(1), MIN(100), STRICT(100), DEFAULT(50), SUPPRESS_BY_WHITELIST(40), SUPPRESS_DOC(20), FILTER_BY_PATH(1);
		final int value;

		Priority(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public abstract com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error);

	protected int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.DEFAULT.value;
	}

	protected boolean disables(com.google.javascript.jscomp.DiagnosticGroup group) {
		return false;
	}

	protected boolean enables(com.google.javascript.jscomp.DiagnosticGroup group) {
		return false;
	}
}


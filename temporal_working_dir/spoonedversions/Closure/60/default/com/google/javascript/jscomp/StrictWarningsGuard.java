

package com.google.javascript.jscomp;


public class StrictWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final long serialVersionUID = 1L;

	static final com.google.javascript.jscomp.DiagnosticType UNRAISABLE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNRAISABLE_WARNING", "{0}");

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		if ((error.getType()) == (com.google.javascript.jscomp.StrictWarningsGuard.UNRAISABLE_WARNING)) {
			return null;
		}
		return error.level.isOn() ? com.google.javascript.jscomp.CheckLevel.ERROR : null;
	}

	@java.lang.Override
	protected int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.STRICT.value;
	}
}


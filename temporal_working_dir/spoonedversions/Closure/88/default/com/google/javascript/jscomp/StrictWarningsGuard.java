

package com.google.javascript.jscomp;


public class StrictWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		return error.level.isOn() ? com.google.javascript.jscomp.CheckLevel.ERROR : null;
	}

	@java.lang.Override
	protected int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.STRICT.value;
	}
}


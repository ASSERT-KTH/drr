

package com.google.javascript.jscomp;


public class DiagnosticGroupWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private final com.google.javascript.jscomp.DiagnosticGroup group;

	private final com.google.javascript.jscomp.CheckLevel level;

	public DiagnosticGroupWarningsGuard(com.google.javascript.jscomp.DiagnosticGroup group, com.google.javascript.jscomp.CheckLevel level) {
		this.group = group;
		this.level = level;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		return group.matches(error) ? level : null;
	}

	@java.lang.Override
	public boolean disables(com.google.javascript.jscomp.DiagnosticGroup otherGroup) {
		return (!(level.isOn())) && (group.isSubGroup(otherGroup));
	}

	@java.lang.Override
	public boolean enables(com.google.javascript.jscomp.DiagnosticGroup otherGroup) {
		if (level.isOn()) {
			for (com.google.javascript.jscomp.DiagnosticType type : otherGroup.getTypes()) {
				if (group.matches(type)) {
					return true;
				}
			}
		}
		return false;
	}
}


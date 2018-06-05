

package com.google.javascript.jscomp;


public class ShowByPathWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	public enum ShowType {
INCLUDE, EXCLUDE;	}

	private final java.lang.String[] paths;

	private final com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType showType;

	public ShowByPathWarningsGuard(java.lang.String checkWarningsOnlyForPath) {
		this(checkWarningsOnlyForPath, com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType.INCLUDE);
	}

	public ShowByPathWarningsGuard(java.lang.String[] checkWarningsOnlyForPath) {
		this(checkWarningsOnlyForPath, com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType.INCLUDE);
	}

	public ShowByPathWarningsGuard(java.lang.String path, com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType showType) {
		this(new java.lang.String[]{ path }, showType);
	}

	public ShowByPathWarningsGuard(java.lang.String[] paths, com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType showType) {
		com.google.common.base.Preconditions.checkArgument((paths != null));
		com.google.common.base.Preconditions.checkArgument((showType != null));
		this.paths = paths;
		this.showType = showType;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		final java.lang.String errorPath = error.sourceName;
		if (((error.level) != (com.google.javascript.jscomp.CheckLevel.ERROR)) && (errorPath != null)) {
			boolean inPath = false;
			for (java.lang.String path : paths) {
				inPath |= errorPath.contains(path);
			}
			if (inPath ^ ((showType) == (com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType.INCLUDE))) {
				return com.google.javascript.jscomp.CheckLevel.OFF;
			}
		}
		return null;
	}

	@java.lang.Override
	protected int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.FILTER_BY_PATH.value;
	}
}




package com.google.javascript.jscomp;


public class ShowByPathWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final long serialVersionUID = 1L;

	public enum ShowType {
INCLUDE, EXCLUDE;	}

	private final com.google.javascript.jscomp.ByPathWarningsGuard warningsGuard;

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
		java.util.List<java.lang.String> pathList = com.google.common.collect.Lists.newArrayList(paths);
		if (showType == (com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType.INCLUDE)) {
			warningsGuard = com.google.javascript.jscomp.ByPathWarningsGuard.exceptPath(pathList, com.google.javascript.jscomp.CheckLevel.OFF);
		}else {
			warningsGuard = com.google.javascript.jscomp.ByPathWarningsGuard.forPath(pathList, com.google.javascript.jscomp.CheckLevel.OFF);
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		return warningsGuard.level(error);
	}

	@java.lang.Override
	protected int getPriority() {
		return warningsGuard.getPriority();
	}
}


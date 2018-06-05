

package com.google.javascript.jscomp;


public class ByPathWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final long serialVersionUID = 1L;

	private final java.util.List<java.lang.String> paths;

	private final boolean include;

	private final int priority;

	private com.google.javascript.jscomp.CheckLevel level;

	private ByPathWarningsGuard(java.util.List<java.lang.String> paths, boolean include, com.google.javascript.jscomp.CheckLevel level) {
		com.google.common.base.Preconditions.checkArgument((paths != null));
		com.google.common.base.Preconditions.checkArgument(((level == (com.google.javascript.jscomp.CheckLevel.OFF)) || (level == (com.google.javascript.jscomp.CheckLevel.ERROR))));
		this.paths = paths;
		this.include = include;
		com.google.javascript.jscomp.ByPathWarningsGuard.this.level = level;
		this.priority = (level == (com.google.javascript.jscomp.CheckLevel.ERROR)) ? com.google.javascript.jscomp.WarningsGuard.Priority.STRICT.value : com.google.javascript.jscomp.WarningsGuard.Priority.FILTER_BY_PATH.value;
	}

	public static com.google.javascript.jscomp.ByPathWarningsGuard forPath(java.util.List<java.lang.String> paths, com.google.javascript.jscomp.CheckLevel level) {
		return new com.google.javascript.jscomp.ByPathWarningsGuard(paths, true, level);
	}

	public static com.google.javascript.jscomp.ByPathWarningsGuard exceptPath(java.util.List<java.lang.String> paths, com.google.javascript.jscomp.CheckLevel level) {
		return new com.google.javascript.jscomp.ByPathWarningsGuard(paths, false, level);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		final java.lang.String errorPath = error.sourceName;
		com.google.javascript.jscomp.CheckLevel defaultLevel = error.getDefaultLevel();
		if ((defaultLevel != (com.google.javascript.jscomp.CheckLevel.ERROR)) && (errorPath != null)) {
			boolean inPath = false;
			for (java.lang.String path : paths) {
				inPath |= errorPath.contains(path);
			}
			if (inPath == (include)) {
				return level;
			}
		}
		return null;
	}

	@java.lang.Override
	protected int getPriority() {
		return priority;
	}
}


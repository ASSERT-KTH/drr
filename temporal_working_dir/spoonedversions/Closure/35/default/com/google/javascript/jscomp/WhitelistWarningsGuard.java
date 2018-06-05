

package com.google.javascript.jscomp;


public abstract class WhitelistWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private final java.util.Set<java.lang.String> whiteList;

	private static final java.util.regex.Pattern LINE_NUMBER = java.util.regex.Pattern.compile(":\\d+");

	public WhitelistWarningsGuard(java.util.Set<java.lang.String> whiteList) {
		this.whiteList = whiteList;
	}

	protected boolean containWarning(java.lang.String formattedWarning) {
		return whiteList.contains(formattedWarning);
	}

	@java.lang.Override
	public int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_BY_WHITELIST.getValue();
	}

	public static java.util.Set<java.lang.String> loadWhitelistedJsWarnings(java.io.File file) {
		return com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(com.google.common.io.Files.newReaderSupplier(file, com.google.common.base.Charsets.UTF_8));
	}

	protected static java.util.Set<java.lang.String> loadWhitelistedJsWarnings(com.google.common.io.InputSupplier<java.io.InputStreamReader> supplier) {
		com.google.common.base.Preconditions.checkNotNull(supplier);
		java.util.Set<java.lang.String> result = new java.util.HashSet<java.lang.String>();
		try {
			for (java.lang.String line : com.google.common.io.CharStreams.readLines(supplier)) {
				line = line.trim();
				if ((line.isEmpty()) || ((line.charAt(0)) == '#')) {
					continue;
				}
				result.add(line);
			}
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
		return result;
	}

	public static java.lang.String formatWarning(com.google.javascript.jscomp.JSError error) {
		return com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(error, false);
	}

	public static java.lang.String formatWarning(com.google.javascript.jscomp.JSError error, boolean withLineNumber) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append(error.sourceName).append(":");
		if (withLineNumber) {
			sb.append(error.lineNumber);
		}
		java.lang.String descriptionFirstLine = com.google.javascript.jscomp.WhitelistWarningsGuard.getFirstLine(error.description);
		if (!withLineNumber) {
			descriptionFirstLine = com.google.javascript.jscomp.WhitelistWarningsGuard.LINE_NUMBER.matcher(descriptionFirstLine).replaceAll(":");
		}
		sb.append("  ").append(descriptionFirstLine);
		return sb.toString();
	}

	public static java.lang.String getFirstLine(java.lang.String warning) {
		int lineLength = warning.indexOf('\n');
		if (lineLength > 0) {
			warning = warning.substring(0, lineLength);
		}
		return warning;
	}
}


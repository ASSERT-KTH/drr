

package com.google.javascript.jscomp;


public class WhitelistWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private final java.util.Set<java.lang.String> whiteList;

	private static final java.util.regex.Pattern LINE_NUMBER = java.util.regex.Pattern.compile(":\\d+");

	public WhitelistWarningsGuard(java.util.Set<java.lang.String> whiteList) {
		this.whiteList = whiteList;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		if (containWarning(com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(error))) {
			return com.google.javascript.jscomp.CheckLevel.WARNING;
		}
		return null;
	}

	protected boolean containWarning(java.lang.String formattedWarning) {
		return whiteList.contains(formattedWarning);
	}

	@java.lang.Override
	public int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_BY_WHITELIST.getValue();
	}

	public static com.google.javascript.jscomp.WhitelistWarningsGuard fromFile(java.io.File file) {
		return new com.google.javascript.jscomp.WhitelistWarningsGuard(com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(file));
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

	public static class WhitelistBuilder implements com.google.javascript.jscomp.ErrorHandler {
		private final java.util.Set<com.google.javascript.jscomp.JSError> warnings = com.google.common.collect.Sets.newLinkedHashSet();

		private java.lang.String productName = null;

		private java.lang.String generatorTarget = null;

		private boolean withLineNumber = false;

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setProductName(java.lang.String name) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.productName = name;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setGeneratorTarget(java.lang.String name) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.generatorTarget = name;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setWithLineNumber(boolean line) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.withLineNumber = line;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		@java.lang.Override
		public void report(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error) {
			warnings.add(error);
		}

		public void writeWhitelist(java.io.File out) throws java.io.IOException {
			java.io.PrintStream stream = new java.io.PrintStream(out);
			appendWhitelist(stream);
			stream.close();
		}

		public void appendWhitelist(java.io.PrintStream out) {
			out.append("# This is a list of legacy warnings that have yet to be fixed.\n");
			if ((productName) != null) {
				out.append(((("# Please find some time and fix at least one of them " + "and it will be the happiest day for ") + (productName)) + ".\n"));
			}
			if ((generatorTarget) != null) {
				out.append((("# When you fix any of these warnings, run " + (generatorTarget)) + " task.\n"));
			}
			com.google.common.collect.Multimap<com.google.javascript.jscomp.DiagnosticType, java.lang.String> warningsByType = com.google.common.collect.TreeMultimap.create();
			for (com.google.javascript.jscomp.JSError warning : warnings) {
				warningsByType.put(warning.getType(), com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(warning, withLineNumber));
			}
			for (com.google.javascript.jscomp.DiagnosticType type : warningsByType.keySet()) {
				out.append("\n# Warning ").append(type.key).append(": ").println(com.google.javascript.jscomp.WhitelistWarningsGuard.getFirstLine(type.format.toPattern()));
				for (java.lang.String warning : warningsByType.get(type)) {
					out.println(warning);
				}
			}
		}
	}
}


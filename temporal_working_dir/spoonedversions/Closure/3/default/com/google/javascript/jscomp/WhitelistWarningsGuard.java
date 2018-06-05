

package com.google.javascript.jscomp;


public class WhitelistWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final com.google.common.base.Splitter LINE_SPLITTER = com.google.common.base.Splitter.on("\n");

	private final java.util.Set<java.lang.String> whitelist;

	private static final java.util.regex.Pattern LINE_NUMBER = java.util.regex.Pattern.compile(":-?\\d+");

	public WhitelistWarningsGuard(java.util.Set<java.lang.String> whitelist) {
		com.google.common.base.Preconditions.checkNotNull(whitelist);
		this.whitelist = com.google.javascript.jscomp.WhitelistWarningsGuard.normalizeWhitelist(whitelist);
	}

	private static java.util.Set<java.lang.String> normalizeWhitelist(java.util.Set<java.lang.String> whitelist) {
		java.util.Set<java.lang.String> result = com.google.common.collect.Sets.newHashSet();
		for (java.lang.String line : whitelist) {
			java.lang.String trimmed = line.trim();
			if ((trimmed.isEmpty()) || ((trimmed.charAt(0)) == '#')) {
				continue;
			}
			result.add(com.google.javascript.jscomp.WhitelistWarningsGuard.LINE_NUMBER.matcher(trimmed).replaceFirst(":"));
		}
		return com.google.common.collect.ImmutableSet.copyOf(result);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		if (containWarning(com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(error))) {
			return com.google.javascript.jscomp.CheckLevel.WARNING;
		}
		return null;
	}

	protected boolean containWarning(java.lang.String formattedWarning) {
		return whitelist.contains(formattedWarning);
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

	protected static java.util.Set<java.lang.String> loadWhitelistedJsWarnings(com.google.common.io.InputSupplier<? extends java.io.Reader> supplier) {
		try {
			return com.google.javascript.jscomp.WhitelistWarningsGuard.loadWhitelistedJsWarnings(supplier.getInput());
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
	}

	static java.util.Set<java.lang.String> loadWhitelistedJsWarnings(java.io.Reader reader) throws java.io.IOException {
		com.google.common.base.Preconditions.checkNotNull(reader);
		java.util.Set<java.lang.String> result = com.google.common.collect.Sets.newHashSet();
		for (java.lang.String line : com.google.common.io.CharStreams.readLines(reader)) {
			result.add(line);
		}
		return result;
	}

	public static java.lang.String formatWarning(com.google.javascript.jscomp.JSError error) {
		return com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(error, false);
	}

	public static java.lang.String formatWarning(com.google.javascript.jscomp.JSError error, boolean withMetaData) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append(error.sourceName).append(":");
		if (withMetaData) {
			sb.append(error.lineNumber);
		}
		java.util.List<java.lang.String> lines = com.google.common.collect.ImmutableList.copyOf(com.google.javascript.jscomp.WhitelistWarningsGuard.LINE_SPLITTER.split(error.description));
		sb.append("  ").append(lines.get(0));
		if (withMetaData) {
			for (int i = 1; i < (lines.size()); i++) {
				sb.append("\n# ").append(lines.get(i));
			}
			sb.append("\n");
		}
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

		private java.lang.String headerNote = null;

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setProductName(java.lang.String name) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.productName = name;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setGeneratorTarget(java.lang.String name) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.generatorTarget = name;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setNote(java.lang.String note) {
			com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this.headerNote = note;
			return com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder.this;
		}

		@java.lang.Deprecated
		public com.google.javascript.jscomp.WhitelistWarningsGuard.WhitelistBuilder setWithLineNumber(boolean line) {
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
			if ((headerNote) != null) {
				out.append((("#" + (com.google.common.base.Joiner.on("\n# ").join(com.google.common.base.Splitter.on("\n").split(headerNote)))) + "\n"));
			}
			com.google.common.collect.Multimap<com.google.javascript.jscomp.DiagnosticType, java.lang.String> warningsByType = com.google.common.collect.TreeMultimap.create();
			for (com.google.javascript.jscomp.JSError warning : warnings) {
				warningsByType.put(warning.getType(), com.google.javascript.jscomp.WhitelistWarningsGuard.formatWarning(warning, true));
			}
			for (com.google.javascript.jscomp.DiagnosticType type : warningsByType.keySet()) {
				out.append("\n# Warning ").append(type.key).append(": ").println(com.google.common.collect.Iterables.get(com.google.javascript.jscomp.WhitelistWarningsGuard.LINE_SPLITTER.split(type.format.toPattern()), 0));
				for (java.lang.String warning : warningsByType.get(type)) {
					out.println(warning);
				}
			}
			out.flush();
		}
	}
}




package com.google.javascript.jscomp;


class VerboseMessageFormatter extends com.google.javascript.jscomp.AbstractMessageFormatter {
	VerboseMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider source) {
		super(source);
	}

	public java.lang.String formatError(com.google.javascript.jscomp.JSError error) {
		return ((getLevelName(com.google.javascript.jscomp.CheckLevel.ERROR)) + ": ") + (format(error));
	}

	public java.lang.String formatWarning(com.google.javascript.jscomp.JSError warning) {
		return ((getLevelName(com.google.javascript.jscomp.CheckLevel.WARNING)) + ": ") + (format(warning));
	}

	private java.lang.String format(com.google.javascript.jscomp.JSError message) {
		java.lang.String description = message.description;
		java.lang.String sourceName = message.sourceName;
		int lineNumber = message.lineNumber;
		com.google.javascript.jscomp.Region sourceRegion = getSource().getSourceRegion(sourceName, lineNumber);
		java.lang.String lineSource = null;
		if (sourceRegion != null) {
			lineSource = sourceRegion.getSourceExcerpt();
		}
		return java.lang.String.format("%s at %s line %s %s", description, (com.google.javascript.jscomp.Strings.isEmpty(sourceName) ? "(unknown source)" : sourceName), (lineNumber < 0 ? java.lang.String.valueOf(lineNumber) : "(unknown line)"), (lineSource != null ? ":\n\n" + lineSource : "."));
	}
}


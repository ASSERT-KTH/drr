

package com.google.javascript.jscomp;


public class LightweightMessageFormatter extends com.google.javascript.jscomp.AbstractMessageFormatter {
	private com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt excerpt;

	private static final com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter excerptFormatter = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();

	private LightweightMessageFormatter() {
		super(null);
		com.google.javascript.jscomp.LightweightMessageFormatter.this.excerpt = com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE;
	}

	public LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider source) {
		this(source, com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE);
	}

	public LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt excerpt) {
		super(source);
		com.google.common.base.Preconditions.checkNotNull(source);
		com.google.javascript.jscomp.LightweightMessageFormatter.this.excerpt = excerpt;
	}

	static com.google.javascript.jscomp.LightweightMessageFormatter withoutSource() {
		return new com.google.javascript.jscomp.LightweightMessageFormatter();
	}

	public java.lang.String formatError(com.google.javascript.jscomp.JSError error) {
		return format(error, false);
	}

	public java.lang.String formatWarning(com.google.javascript.jscomp.JSError warning) {
		return format(warning, true);
	}

	private java.lang.String format(com.google.javascript.jscomp.JSError error, boolean warning) {
		com.google.javascript.jscomp.SourceExcerptProvider source = getSource();
		java.lang.String sourceExcerpt = source == null ? null : excerpt.get(source, error.sourceName, error.lineNumber, com.google.javascript.jscomp.LightweightMessageFormatter.excerptFormatter);
		java.lang.StringBuilder b = new java.lang.StringBuilder();
		if ((error.sourceName) != null) {
			b.append(error.sourceName);
			if ((error.lineNumber) > 0) {
				b.append(':');
				b.append(error.lineNumber);
			}
			b.append(": ");
		}
		b.append(getLevelName((warning ? com.google.javascript.jscomp.CheckLevel.WARNING : com.google.javascript.jscomp.CheckLevel.ERROR)));
		b.append(" - ");
		b.append(error.description);
		b.append('\n');
		if (sourceExcerpt != null) {
			b.append(sourceExcerpt);
			b.append('\n');
			int charno = error.getCharno();
			if (((excerpt.equals(com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.LINE)) && (0 <= charno)) && (charno <= (sourceExcerpt.length()))) {
				for (int i = 0; i < charno; i++) {
					char c = sourceExcerpt.charAt(i);
					if (java.lang.Character.isWhitespace(c)) {
						b.append(c);
					}else {
						b.append(' ');
					}
				}
				b.append("^\n");
			}
		}
		return b.toString();
	}

	static class LineNumberingFormatter implements com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter {
		public java.lang.String formatLine(java.lang.String line, int lineNumber) {
			return line;
		}

		public java.lang.String formatRegion(com.google.javascript.jscomp.Region region) {
			if (region == null) {
				return null;
			}
			java.lang.String code = region.getSourceExcerpt();
			if ((code.length()) == 0) {
				return null;
			}
			int numberLength = java.lang.Integer.toString(region.getEndingLineNumber()).length();
			java.lang.StringBuilder builder = new java.lang.StringBuilder(((code.length()) * 2));
			int start = 0;
			int end = code.indexOf('\n', start);
			int lineNumber = region.getBeginningLineNumber();
			while (start >= 0) {
				java.lang.String line;
				if (end < 0) {
					line = code.substring(start);
					if ((line.length()) == 0) {
						return builder.substring(0, ((builder.length()) - 1));
					}
				}else {
					line = code.substring(start, end);
				}
				builder.append("  ");
				int spaces = numberLength - (java.lang.Integer.toString(lineNumber).length());
				builder.append(com.google.javascript.jscomp.Strings.repeat(" ", spaces));
				builder.append(lineNumber);
				builder.append("| ");
				if (end < 0) {
					builder.append(line);
					start = -1;
				}else {
					builder.append(line);
					builder.append('\n');
					start = end + 1;
					end = code.indexOf('\n', start);
					lineNumber++;
				}
			} 
			return builder.toString();
		}
	}
}




package org.apache.commons.lang.text;


public class ExtendedMessageFormat extends java.text.MessageFormat {
	private static final long serialVersionUID = -2362048321261811743L;

	public static java.text.Format createDefaultMetaFormat() {
		return org.apache.commons.lang.text.ExtendedMessageFormat.createDefaultMetaFormat(java.util.Locale.getDefault());
	}

	public static java.text.Format createDefaultMetaFormat(java.util.Locale locale) {
		return org.apache.commons.lang.text.DefaultMetaFormatFactory.getFormat(locale);
	}

	private static class Parser {
		private static final java.lang.String ESCAPED_QUOTE = "''";

		private static final char START_FMT = ',';

		private static final char END_FE = '}';

		private static final char START_FE = '{';

		private static final char QUOTE = '\'';

		private java.lang.String stripFormats(java.lang.String pattern) {
			java.lang.StringBuffer sb = new java.lang.StringBuffer(pattern.length());
			java.text.ParsePosition pos = new java.text.ParsePosition(0);
			char[] c = pattern.toCharArray();
			while ((pos.getIndex()) < (pattern.length())) {
				switch (c[pos.getIndex()]) {
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE :
						appendQuotedString(pattern, pos, sb, true);
						break;
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FE :
						int start = pos.getIndex();
						readArgumentIndex(pattern, next(pos));
						sb.append(c, start, ((pos.getIndex()) - start));
						if ((c[pos.getIndex()]) == (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FMT)) {
							eatFormat(pattern, next(pos));
						}
						if ((c[pos.getIndex()]) != (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.END_FE)) {
							throw new java.lang.IllegalArgumentException(("Unreadable format element at position " + start));
						}
					default :
						sb.append(c[pos.getIndex()]);
						next(pos);
				}
			} 
			return sb.toString();
		}

		private java.lang.String insertFormats(java.lang.String pattern, java.text.Format[] formats, java.text.Format metaFormat) {
			if ((formats == null) || ((formats.length) == 0)) {
				return pattern;
			}
			java.lang.StringBuffer sb = new java.lang.StringBuffer(((pattern.length()) * 2));
			java.text.ParsePosition pos = new java.text.ParsePosition(0);
			int fe = -1;
			while ((pos.getIndex()) < (pattern.length())) {
				char c = pattern.charAt(pos.getIndex());
				switch (c) {
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE :
						appendQuotedString(pattern, pos, sb, false);
						break;
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FE :
						fe++;
						sb.append(org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FE).append(readArgumentIndex(pattern, next(pos)));
						if ((formats[fe]) != null) {
							java.lang.String formatName = metaFormat.format(formats[fe]);
							if (org.apache.commons.lang.StringUtils.isNotEmpty(formatName)) {
								sb.append(org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FMT).append(formatName);
							}
						}
						break;
					default :
						sb.append(pattern.charAt(pos.getIndex()));
						next(pos);
				}
			} 
			return sb.toString();
		}

		private java.text.Format[] parseFormats(java.lang.String pattern, java.text.Format metaFormat) {
			java.util.ArrayList result = new java.util.ArrayList();
			java.text.ParsePosition pos = new java.text.ParsePosition(0);
			while ((pos.getIndex()) < (pattern.length())) {
				switch (pattern.charAt(pos.getIndex())) {
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE :
						getQuotedString(pattern, next(pos), true);
						break;
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FE :
						int start = pos.getIndex();
						readArgumentIndex(pattern, next(pos));
						if ((pattern.charAt(pos.getIndex())) == (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FMT)) {
							seekNonWs(pattern, next(pos));
						}
						result.add(metaFormat.parseObject(pattern, pos));
						seekNonWs(pattern, pos);
						if ((pattern.charAt(pos.getIndex())) != (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.END_FE)) {
							throw new java.lang.IllegalArgumentException(("Unreadable format element at position " + start));
						}
					default :
						next(pos);
				}
			} 
			return ((java.text.Format[]) (result.toArray(new java.text.Format[result.size()])));
		}

		private void seekNonWs(java.lang.String pattern, java.text.ParsePosition pos) {
			int len = 0;
			char[] buffer = pattern.toCharArray();
			do {
				len = org.apache.commons.lang.text.StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
				pos.setIndex(((pos.getIndex()) + len));
			} while ((len > 0) && ((pos.getIndex()) < (pattern.length())) );
		}

		private java.text.ParsePosition next(java.text.ParsePosition pos) {
			pos.setIndex(((pos.getIndex()) + 1));
			return pos;
		}

		private java.lang.String readArgumentIndex(java.lang.String pattern, java.text.ParsePosition pos) {
			int start = pos.getIndex();
			for (; (pos.getIndex()) < (pattern.length()); next(pos)) {
				char c = pattern.charAt(pos.getIndex());
				if ((c == (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FMT)) || (c == (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.END_FE))) {
					return pattern.substring(start, pos.getIndex());
				}
				if (!(java.lang.Character.isDigit(c))) {
					throw new java.lang.IllegalArgumentException(("Invalid format argument index at position " + start));
				}
			}
			throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
		}

		private java.lang.StringBuffer appendQuotedString(java.lang.String pattern, java.text.ParsePosition pos, java.lang.StringBuffer appendTo, boolean escapingOn) {
			int start = pos.getIndex();
			char[] c = pattern.toCharArray();
			if (escapingOn && ((c[start]) == (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE))) {
				return appendTo == null ? null : appendTo.append(org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE);
			}
			int lastHold = start;
			for (int i = pos.getIndex(); i < (pattern.length()); i++) {
				if (escapingOn && (pattern.substring(i).startsWith(org.apache.commons.lang.text.ExtendedMessageFormat.Parser.ESCAPED_QUOTE))) {
					appendTo.append(c, lastHold, ((pos.getIndex()) - lastHold)).append(org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE);
					pos.setIndex((i + (org.apache.commons.lang.text.ExtendedMessageFormat.Parser.ESCAPED_QUOTE.length())));
					lastHold = pos.getIndex();
					continue;
				}
				switch (c[pos.getIndex()]) {
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE :
						next(pos);
						return appendTo == null ? null : appendTo.append(c, lastHold, ((pos.getIndex()) - lastHold));
					default :
						next(pos);
				}
			}
			throw new java.lang.IllegalArgumentException(("Unterminated quoted string at position " + start));
		}

		private void getQuotedString(java.lang.String pattern, java.text.ParsePosition pos, boolean escapingOn) {
			appendQuotedString(pattern, pos, null, escapingOn);
		}

		private void eatFormat(java.lang.String pattern, java.text.ParsePosition pos) {
			int start = pos.getIndex();
			int depth = 1;
			for (; (pos.getIndex()) < (pattern.length()); next(pos)) {
				switch (pattern.charAt(pos.getIndex())) {
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.START_FE :
						depth++;
						break;
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.END_FE :
						depth--;
						if (depth == 0) {
							return ;
						}
						break;
					case org.apache.commons.lang.text.ExtendedMessageFormat.Parser.QUOTE :
						getQuotedString(pattern, pos, false);
						break;
				}
			}
			throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
		}
	}

	private static final org.apache.commons.lang.text.ExtendedMessageFormat.Parser PARSER = new org.apache.commons.lang.text.ExtendedMessageFormat.Parser();

	private java.text.Format metaFormat;

	private java.lang.String strippedPattern;

	public ExtendedMessageFormat(java.lang.String pattern, java.text.Format metaFormat) {
		this(pattern, java.util.Locale.getDefault(), metaFormat);
	}

	public ExtendedMessageFormat(java.lang.String pattern, java.util.Locale locale, java.text.Format metaFormat) {
		super(pattern);
		setLocale(locale);
		setMetaFormat(metaFormat);
		applyPattern(pattern);
	}

	public final void applyPattern(java.lang.String pattern) {
		if ((metaFormat) == null) {
			return ;
		}
		applyPatternPre(pattern);
		strippedPattern = org.apache.commons.lang.text.ExtendedMessageFormat.PARSER.stripFormats(pattern);
		super.applyPattern(strippedPattern);
		setFormats(org.apache.commons.lang.text.ExtendedMessageFormat.PARSER.parseFormats(pattern, metaFormat));
		applyPatternPost(pattern);
	}

	protected void applyPatternPre(java.lang.String pattern) {
	}

	protected void applyPatternPost(java.lang.String pattern) {
	}

	public java.lang.String toPattern() {
		return org.apache.commons.lang.text.ExtendedMessageFormat.PARSER.insertFormats(strippedPattern, getFormats(), metaFormat);
	}

	public synchronized java.text.Format getMetaFormat() {
		return metaFormat;
	}

	public synchronized void setMetaFormat(java.text.Format metaFormat) {
		org.apache.commons.lang.Validate.notNull(metaFormat, "metaFormat is null");
		org.apache.commons.lang.text.ExtendedMessageFormat.this.metaFormat = metaFormat;
	}
}


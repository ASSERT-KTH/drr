

package org.apache.commons.lang.text;


public class ExtendedMessageFormat extends java.text.MessageFormat {
	private static final long serialVersionUID = -2362048321261811743L;

	private static final java.lang.String DUMMY_PATTERN = "";

	private static final java.lang.String ESCAPED_QUOTE = "''";

	private static final char START_FMT = ',';

	private static final char END_FE = '}';

	private static final char START_FE = '{';

	private static final char QUOTE = '\'';

	private java.lang.String toPattern;

	private java.util.Map registry;

	public ExtendedMessageFormat(java.lang.String pattern) {
		this(pattern, java.util.Locale.getDefault());
	}

	public ExtendedMessageFormat(java.lang.String pattern, java.util.Locale locale) {
		this(pattern, locale, null);
	}

	public ExtendedMessageFormat(java.lang.String pattern, java.util.Map registry) {
		this(pattern, java.util.Locale.getDefault(), registry);
	}

	public ExtendedMessageFormat(java.lang.String pattern, java.util.Locale locale, java.util.Map registry) {
		super(org.apache.commons.lang.text.ExtendedMessageFormat.DUMMY_PATTERN);
		setLocale(locale);
		org.apache.commons.lang.text.ExtendedMessageFormat.this.registry = registry;
		applyPattern(pattern);
	}

	public java.lang.String toPattern() {
		return toPattern;
	}

	public final void applyPattern(java.lang.String pattern) {
		if ((registry) == null) {
			super.applyPattern(pattern);
			toPattern = super.toPattern();
			return ;
		}
		java.util.ArrayList foundFormats = new java.util.ArrayList();
		java.util.ArrayList foundDescriptions = new java.util.ArrayList();
		java.lang.StringBuffer stripCustom = new java.lang.StringBuffer(pattern.length());
		java.text.ParsePosition pos = new java.text.ParsePosition(0);
		char[] c = pattern.toCharArray();
		int fmtCount = 0;
		while ((pos.getIndex()) < (pattern.length())) {
			switch (c[pos.getIndex()]) {
				case org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE :
					appendQuotedString(pattern, pos, stripCustom, true);
					break;
				case org.apache.commons.lang.text.ExtendedMessageFormat.START_FE :
					fmtCount++;
					seekNonWs(pattern, pos);
					int start = pos.getIndex();
					int index = readArgumentIndex(pattern, next(pos));
					stripCustom.append(org.apache.commons.lang.text.ExtendedMessageFormat.START_FE).append(index);
					seekNonWs(pattern, pos);
					java.text.Format format = null;
					java.lang.String formatDescription = null;
					if ((c[pos.getIndex()]) == (org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT)) {
						formatDescription = parseFormatDescription(pattern, next(pos));
						format = getFormat(formatDescription);
						if (format == null) {
							stripCustom.append(org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT).append(formatDescription);
						}
					}
					foundFormats.add(format);
					foundDescriptions.add((format == null ? null : formatDescription));
					org.apache.commons.lang.Validate.isTrue(((foundFormats.size()) == fmtCount));
					org.apache.commons.lang.Validate.isTrue(((foundDescriptions.size()) == fmtCount));
					if ((c[pos.getIndex()]) != (org.apache.commons.lang.text.ExtendedMessageFormat.END_FE)) {
						throw new java.lang.IllegalArgumentException(("Unreadable format element at position " + start));
					}
				default :
					stripCustom.append(c[pos.getIndex()]);
					next(pos);
			}
		} 
		super.applyPattern(stripCustom.toString());
		toPattern = insertFormats(super.toPattern(), foundDescriptions);
		if (containsElements(foundFormats)) {
			java.text.Format[] origFormats = getFormats();
			int i = 0;
			for (java.util.Iterator it = foundFormats.iterator(); it.hasNext(); i++) {
				java.text.Format f = ((java.text.Format) (it.next()));
				if (f != null) {
					origFormats[i] = f;
				}
			}
			super.setFormats(origFormats);
		}
	}

	public void setFormat(int formatElementIndex, java.text.Format newFormat) {
		throw new java.lang.UnsupportedOperationException();
	}

	public void setFormatByArgumentIndex(int argumentIndex, java.text.Format newFormat) {
		throw new java.lang.UnsupportedOperationException();
	}

	public void setFormats(java.text.Format[] newFormats) {
		throw new java.lang.UnsupportedOperationException();
	}

	public void setFormatsByArgumentIndex(java.text.Format[] newFormats) {
		throw new java.lang.UnsupportedOperationException();
	}

	private java.text.Format getFormat(java.lang.String desc) {
		if ((registry) != null) {
			java.lang.String name = desc;
			java.lang.String args = null;
			int i = desc.indexOf(org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT);
			if (i > 0) {
				name = desc.substring(0, i).trim();
				args = desc.substring((i + 1)).trim();
			}
			org.apache.commons.lang.text.FormatFactory factory = ((org.apache.commons.lang.text.FormatFactory) (registry.get(name)));
			if (factory != null) {
				return factory.getFormat(name, args, getLocale());
			}
		}
		return null;
	}

	private int readArgumentIndex(java.lang.String pattern, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		seekNonWs(pattern, pos);
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		boolean error = false;
		for (; (!error) && ((pos.getIndex()) < (pattern.length())); next(pos)) {
			char c = pattern.charAt(pos.getIndex());
			if (java.lang.Character.isWhitespace(c)) {
				seekNonWs(pattern, pos);
				c = pattern.charAt(pos.getIndex());
				if ((c != (org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT)) && (c != (org.apache.commons.lang.text.ExtendedMessageFormat.END_FE))) {
					error = true;
					continue;
				}
			}
			if (((c == (org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT)) || (c == (org.apache.commons.lang.text.ExtendedMessageFormat.END_FE))) && ((result.length()) > 0)) {
				try {
					return java.lang.Integer.parseInt(result.toString());
				} catch (java.lang.NumberFormatException e) {
				}
			}
			error = !(java.lang.Character.isDigit(c));
			result.append(c);
		}
		if (error) {
			throw new java.lang.IllegalArgumentException(((("Invalid format argument index at position " + start) + ": ") + (pattern.substring(start, pos.getIndex()))));
		}
		throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
	}

	private java.lang.String parseFormatDescription(java.lang.String pattern, java.text.ParsePosition pos) {
		int start = pos.getIndex();
		seekNonWs(pattern, pos);
		int text = pos.getIndex();
		int depth = 1;
		for (; (pos.getIndex()) < (pattern.length()); next(pos)) {
			switch (pattern.charAt(pos.getIndex())) {
				case org.apache.commons.lang.text.ExtendedMessageFormat.START_FE :
					depth++;
					break;
				case org.apache.commons.lang.text.ExtendedMessageFormat.END_FE :
					depth--;
					if (depth == 0) {
						return pattern.substring(text, pos.getIndex());
					}
					break;
				case org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE :
					getQuotedString(pattern, pos, false);
					break;
			}
		}
		throw new java.lang.IllegalArgumentException(("Unterminated format element at position " + start));
	}

	private java.lang.String insertFormats(java.lang.String pattern, java.util.ArrayList customPatterns) {
		if (!(containsElements(customPatterns))) {
			return pattern;
		}
		java.lang.StringBuffer sb = new java.lang.StringBuffer(((pattern.length()) * 2));
		java.text.ParsePosition pos = new java.text.ParsePosition(0);
		int fe = -1;
		int depth = 0;
		while ((pos.getIndex()) < (pattern.length())) {
			char c = pattern.charAt(pos.getIndex());
			switch (c) {
				case org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE :
					appendQuotedString(pattern, pos, sb, false);
					break;
				case org.apache.commons.lang.text.ExtendedMessageFormat.START_FE :
					depth++;
					if (depth == 1) {
						fe++;
						sb.append(org.apache.commons.lang.text.ExtendedMessageFormat.START_FE).append(readArgumentIndex(pattern, next(pos)));
						java.lang.String customPattern = ((java.lang.String) (customPatterns.get(fe)));
						if (customPattern != null) {
							sb.append(org.apache.commons.lang.text.ExtendedMessageFormat.START_FMT).append(customPattern);
						}
					}
					break;
				case org.apache.commons.lang.text.ExtendedMessageFormat.END_FE :
					depth--;
				default :
					sb.append(c);
					next(pos);
			}
		} 
		return sb.toString();
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

	private java.lang.StringBuffer appendQuotedString(java.lang.String pattern, java.text.ParsePosition pos, java.lang.StringBuffer appendTo, boolean escapingOn) {
		int start = pos.getIndex();
		char[] c = pattern.toCharArray();
		if (escapingOn && ((c[start]) == (org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE))) {
			next(pos);
			return appendTo == null ? null : appendTo.append(org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE);
		}
		int lastHold = start;
		for (int i = pos.getIndex(); i < (pattern.length()); i++) {
			if (escapingOn && (pattern.substring(i).startsWith(org.apache.commons.lang.text.ExtendedMessageFormat.ESCAPED_QUOTE))) {
				appendTo.append(c, lastHold, ((pos.getIndex()) - lastHold)).append(org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE);
				pos.setIndex((i + (org.apache.commons.lang.text.ExtendedMessageFormat.ESCAPED_QUOTE.length())));
				lastHold = pos.getIndex();
				continue;
			}
			switch (c[pos.getIndex()]) {
				case org.apache.commons.lang.text.ExtendedMessageFormat.QUOTE :
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

	private boolean containsElements(java.util.Collection coll) {
		if ((coll == null) || ((coll.size()) == 0)) {
			return false;
		}
		for (java.util.Iterator iter = coll.iterator(); iter.hasNext();) {
			if ((iter.next()) != null) {
				return true;
			}
		}
		return false;
	}
}


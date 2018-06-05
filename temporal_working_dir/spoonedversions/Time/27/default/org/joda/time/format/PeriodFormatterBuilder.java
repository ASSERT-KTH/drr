

package org.joda.time.format;


public class PeriodFormatterBuilder {
	private static final int PRINT_ZERO_RARELY_FIRST = 1;

	private static final int PRINT_ZERO_RARELY_LAST = 2;

	private static final int PRINT_ZERO_IF_SUPPORTED = 3;

	private static final int PRINT_ZERO_ALWAYS = 4;

	private static final int PRINT_ZERO_NEVER = 5;

	private static final int YEARS = 0;

	private static final int MONTHS = 1;

	private static final int WEEKS = 2;

	private static final int DAYS = 3;

	private static final int HOURS = 4;

	private static final int MINUTES = 5;

	private static final int SECONDS = 6;

	private static final int MILLIS = 7;

	private static final int SECONDS_MILLIS = 8;

	private static final int SECONDS_OPTIONAL_MILLIS = 9;

	private static final int MAX_FIELD = org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS;

	private int iMinPrintedDigits;

	private int iPrintZeroSetting;

	private int iMaxParsedDigits;

	private boolean iRejectSignedValues;

	private org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix iPrefix;

	private java.util.List<java.lang.Object> iElementPairs;

	private boolean iNotPrinter;

	private boolean iNotParser;

	private org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters;

	public PeriodFormatterBuilder() {
		clear();
	}

	public org.joda.time.format.PeriodFormatter toFormatter() {
		org.joda.time.format.PeriodFormatter formatter = org.joda.time.format.PeriodFormatterBuilder.toFormatter(iElementPairs, iNotPrinter, iNotParser);
		iFieldFormatters = ((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[]) (iFieldFormatters.clone()));
		return formatter;
	}

	public org.joda.time.format.PeriodPrinter toPrinter() {
		if (iNotPrinter) {
			return null;
		}
		return toFormatter().getPrinter();
	}

	public org.joda.time.format.PeriodParser toParser() {
		if (iNotParser) {
			return null;
		}
		return toFormatter().getParser();
	}

	public void clear() {
		iMinPrintedDigits = 1;
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_RARELY_LAST;
		iMaxParsedDigits = 10;
		iRejectSignedValues = false;
		iPrefix = null;
		if ((iElementPairs) == null) {
			iElementPairs = new java.util.ArrayList<java.lang.Object>();
		}else {
			iElementPairs.clear();
		}
		iNotPrinter = false;
		iNotParser = false;
		iFieldFormatters = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[10];
	}

	public org.joda.time.format.PeriodFormatterBuilder append(org.joda.time.format.PeriodFormatter formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("No formatter supplied");
		}
		clearPrefix();
		append0(formatter.getPrinter(), formatter.getParser());
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder append(org.joda.time.format.PeriodPrinter printer, org.joda.time.format.PeriodParser parser) {
		if ((printer == null) && (parser == null)) {
			throw new java.lang.IllegalArgumentException("No printer or parser supplied");
		}
		clearPrefix();
		append0(printer, parser);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendLiteral(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Literal must not be null");
		}
		clearPrefix();
		org.joda.time.format.PeriodFormatterBuilder.Literal literal = new org.joda.time.format.PeriodFormatterBuilder.Literal(text);
		append0(literal, literal);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder minimumPrintedDigits(int minDigits) {
		iMinPrintedDigits = minDigits;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder maximumParsedDigits(int maxDigits) {
		iMaxParsedDigits = maxDigits;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder rejectSignedValues(boolean v) {
		iRejectSignedValues = v;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder printZeroRarelyLast() {
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_RARELY_LAST;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder printZeroRarelyFirst() {
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_RARELY_FIRST;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder printZeroIfSupported() {
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_IF_SUPPORTED;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder printZeroAlways() {
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_ALWAYS;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder printZeroNever() {
		iPrintZeroSetting = org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_NEVER;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendPrefix(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return appendPrefix(new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix(text));
	}

	public org.joda.time.format.PeriodFormatterBuilder appendPrefix(java.lang.String singularText, java.lang.String pluralText) {
		if ((singularText == null) || (pluralText == null)) {
			throw new java.lang.IllegalArgumentException();
		}
		return appendPrefix(new org.joda.time.format.PeriodFormatterBuilder.PluralAffix(singularText, pluralText));
	}

	private org.joda.time.format.PeriodFormatterBuilder appendPrefix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix prefix) {
		if (prefix == null) {
			throw new java.lang.IllegalArgumentException();
		}
		if ((iPrefix) != null) {
			prefix = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(iPrefix, prefix);
		}
		iPrefix = prefix;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendYears() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.YEARS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendMonths() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.MONTHS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendWeeks() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.WEEKS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendDays() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.DAYS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendHours() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.HOURS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendMinutes() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.MINUTES);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeconds() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.SECONDS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSecondsWithMillis() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendMillis() {
		appendField(org.joda.time.format.PeriodFormatterBuilder.MILLIS);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendMillis3Digit() {
		appendField(7, 3);
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	private void appendField(int type) {
		appendField(type, iMinPrintedDigits);
	}

	private void appendField(int type, int minPrinted) {
		org.joda.time.format.PeriodFormatterBuilder.FieldFormatter field = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter(minPrinted, iPrintZeroSetting, iMaxParsedDigits, iRejectSignedValues, type, iFieldFormatters, iPrefix, null);
		append0(field, field);
		iFieldFormatters[type] = field;
		iPrefix = null;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSuffix(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return appendSuffix(new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix(text));
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSuffix(java.lang.String singularText, java.lang.String pluralText) {
		if ((singularText == null) || (pluralText == null)) {
			throw new java.lang.IllegalArgumentException();
		}
		return appendSuffix(new org.joda.time.format.PeriodFormatterBuilder.PluralAffix(singularText, pluralText));
	}

	private org.joda.time.format.PeriodFormatterBuilder appendSuffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix suffix) {
		final java.lang.Object originalPrinter;
		final java.lang.Object originalParser;
		if ((iElementPairs.size()) > 0) {
			originalPrinter = iElementPairs.get(((iElementPairs.size()) - 2));
			originalParser = iElementPairs.get(((iElementPairs.size()) - 1));
		}else {
			originalPrinter = null;
			originalParser = null;
		}
		if ((((originalPrinter == null) || (originalParser == null)) || (originalPrinter != originalParser)) || (!(originalPrinter instanceof org.joda.time.format.PeriodFormatterBuilder.FieldFormatter))) {
			throw new java.lang.IllegalStateException("No field to apply suffix to");
		}
		clearPrefix();
		org.joda.time.format.PeriodFormatterBuilder.FieldFormatter newField = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter(((org.joda.time.format.PeriodFormatterBuilder.FieldFormatter) (originalPrinter)), suffix);
		iElementPairs.set(((iElementPairs.size()) - 2), newField);
		iElementPairs.set(((iElementPairs.size()) - 1), newField);
		iFieldFormatters[newField.getFieldType()] = newField;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeparator(java.lang.String text) {
		return appendSeparator(text, text, null, true, true);
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeparatorIfFieldsAfter(java.lang.String text) {
		return appendSeparator(text, text, null, false, true);
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeparatorIfFieldsBefore(java.lang.String text) {
		return appendSeparator(text, text, null, true, false);
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeparator(java.lang.String text, java.lang.String finalText) {
		return appendSeparator(text, finalText, null, true, true);
	}

	public org.joda.time.format.PeriodFormatterBuilder appendSeparator(java.lang.String text, java.lang.String finalText, java.lang.String[] variants) {
		return appendSeparator(text, finalText, variants, true, true);
	}

	private org.joda.time.format.PeriodFormatterBuilder appendSeparator(java.lang.String text, java.lang.String finalText, java.lang.String[] variants, boolean useBefore, boolean useAfter) {
		if ((text == null) || (finalText == null)) {
			throw new java.lang.IllegalArgumentException();
		}
		clearPrefix();
		java.util.List<java.lang.Object> pairs = iElementPairs;
		if ((pairs.size()) == 0) {
			if (useAfter && (useBefore == false)) {
				org.joda.time.format.PeriodFormatterBuilder.Separator separator = new org.joda.time.format.PeriodFormatterBuilder.Separator(text, finalText, variants, org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY, org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY, useBefore, useAfter);
				append0(separator, separator);
			}
			return org.joda.time.format.PeriodFormatterBuilder.this;
		}
		int i;
		org.joda.time.format.PeriodFormatterBuilder.Separator lastSeparator = null;
		for (i = pairs.size(); (--i) >= 0;) {
			if ((pairs.get(i)) instanceof org.joda.time.format.PeriodFormatterBuilder.Separator) {
				lastSeparator = ((org.joda.time.format.PeriodFormatterBuilder.Separator) (pairs.get(i)));
				pairs = pairs.subList((i + 1), pairs.size());
				break;
			}
			i--;
		}
		if ((lastSeparator != null) && ((pairs.size()) == 0)) {
			throw new java.lang.IllegalStateException("Cannot have two adjacent separators");
		}else {
			java.lang.Object[] comp = org.joda.time.format.PeriodFormatterBuilder.createComposite(pairs);
			pairs.clear();
			org.joda.time.format.PeriodFormatterBuilder.Separator separator = new org.joda.time.format.PeriodFormatterBuilder.Separator(text, finalText, variants, ((org.joda.time.format.PeriodPrinter) (comp[0])), ((org.joda.time.format.PeriodParser) (comp[1])), useBefore, useAfter);
			pairs.add(separator);
			pairs.add(separator);
		}
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	private void clearPrefix() throws java.lang.IllegalStateException {
		if ((iPrefix) != null) {
			throw new java.lang.IllegalStateException("Prefix not followed by field");
		}
		iPrefix = null;
	}

	private org.joda.time.format.PeriodFormatterBuilder append0(org.joda.time.format.PeriodPrinter printer, org.joda.time.format.PeriodParser parser) {
		iElementPairs.add(printer);
		iElementPairs.add(parser);
		iNotPrinter |= printer == null;
		iNotParser |= parser == null;
		return org.joda.time.format.PeriodFormatterBuilder.this;
	}

	private static org.joda.time.format.PeriodFormatter toFormatter(java.util.List<java.lang.Object> elementPairs, boolean notPrinter, boolean notParser) {
		if (notPrinter && notParser) {
			throw new java.lang.IllegalStateException("Builder has created neither a printer nor a parser");
		}
		int size = elementPairs.size();
		if ((size >= 2) && ((elementPairs.get(0)) instanceof org.joda.time.format.PeriodFormatterBuilder.Separator)) {
			org.joda.time.format.PeriodFormatterBuilder.Separator sep = ((org.joda.time.format.PeriodFormatterBuilder.Separator) (elementPairs.get(0)));
			org.joda.time.format.PeriodFormatter f = org.joda.time.format.PeriodFormatterBuilder.toFormatter(elementPairs.subList(2, size), notPrinter, notParser);
			sep = sep.finish(f.getPrinter(), f.getParser());
			return new org.joda.time.format.PeriodFormatter(sep, sep);
		}
		java.lang.Object[] comp = org.joda.time.format.PeriodFormatterBuilder.createComposite(elementPairs);
		if (notPrinter) {
			return new org.joda.time.format.PeriodFormatter(null, ((org.joda.time.format.PeriodParser) (comp[1])));
		}else
			if (notParser) {
				return new org.joda.time.format.PeriodFormatter(((org.joda.time.format.PeriodPrinter) (comp[0])), null);
			}else {
				return new org.joda.time.format.PeriodFormatter(((org.joda.time.format.PeriodPrinter) (comp[0])), ((org.joda.time.format.PeriodParser) (comp[1])));
			}
		
	}

	private static java.lang.Object[] createComposite(java.util.List<java.lang.Object> elementPairs) {
		switch (elementPairs.size()) {
			case 0 :
				return new java.lang.Object[]{ org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY , org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY };
			case 1 :
				return new java.lang.Object[]{ elementPairs.get(0) , elementPairs.get(1) };
			default :
				org.joda.time.format.PeriodFormatterBuilder.Composite comp = new org.joda.time.format.PeriodFormatterBuilder.Composite(elementPairs);
				return new java.lang.Object[]{ comp , comp };
		}
	}

	static interface PeriodFieldAffix {
		int calculatePrintedLength(int value);

		void printTo(java.lang.StringBuffer buf, int value);

		void printTo(java.io.Writer out, int value) throws java.io.IOException;

		int parse(java.lang.String periodStr, int position);

		int scan(java.lang.String periodStr, int position);
	}

	static class SimpleAffix implements org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix {
		private final java.lang.String iText;

		SimpleAffix(java.lang.String text) {
			iText = text;
		}

		public int calculatePrintedLength(int value) {
			return iText.length();
		}

		public void printTo(java.lang.StringBuffer buf, int value) {
			buf.append(iText);
		}

		public void printTo(java.io.Writer out, int value) throws java.io.IOException {
			out.write(iText);
		}

		public int parse(java.lang.String periodStr, int position) {
			java.lang.String text = iText;
			int textLength = text.length();
			if (periodStr.regionMatches(true, position, text, 0, textLength)) {
				return position + textLength;
			}
			return ~position;
		}

		public int scan(java.lang.String periodStr, final int position) {
			java.lang.String text = iText;
			int textLength = text.length();
			int sourceLength = periodStr.length();
			search : for (int pos = position; pos < sourceLength; pos++) {
				if (periodStr.regionMatches(true, pos, text, 0, textLength)) {
					return pos;
				}
				switch (periodStr.charAt(pos)) {
					case '0' :
					case '1' :
					case '2' :
					case '3' :
					case '4' :
					case '5' :
					case '6' :
					case '7' :
					case '8' :
					case '9' :
					case '.' :
					case ',' :
					case '+' :
					case '-' :
						break;
					default :
						break search;
				}
			}
			return ~position;
		}
	}

	static class PluralAffix implements org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix {
		private final java.lang.String iSingularText;

		private final java.lang.String iPluralText;

		PluralAffix(java.lang.String singularText, java.lang.String pluralText) {
			iSingularText = singularText;
			iPluralText = pluralText;
		}

		public int calculatePrintedLength(int value) {
			return (value == 1 ? iSingularText : iPluralText).length();
		}

		public void printTo(java.lang.StringBuffer buf, int value) {
			buf.append((value == 1 ? iSingularText : iPluralText));
		}

		public void printTo(java.io.Writer out, int value) throws java.io.IOException {
			out.write((value == 1 ? iSingularText : iPluralText));
		}

		public int parse(java.lang.String periodStr, int position) {
			java.lang.String text1 = iPluralText;
			java.lang.String text2 = iSingularText;
			if ((text1.length()) < (text2.length())) {
				java.lang.String temp = text1;
				text1 = text2;
				text2 = temp;
			}
			if (periodStr.regionMatches(true, position, text1, 0, text1.length())) {
				return position + (text1.length());
			}
			if (periodStr.regionMatches(true, position, text2, 0, text2.length())) {
				return position + (text2.length());
			}
			return ~position;
		}

		public int scan(java.lang.String periodStr, final int position) {
			java.lang.String text1 = iPluralText;
			java.lang.String text2 = iSingularText;
			if ((text1.length()) < (text2.length())) {
				java.lang.String temp = text1;
				text1 = text2;
				text2 = temp;
			}
			int textLength1 = text1.length();
			int textLength2 = text2.length();
			int sourceLength = periodStr.length();
			for (int pos = position; pos < sourceLength; pos++) {
				if (periodStr.regionMatches(true, pos, text1, 0, textLength1)) {
					return pos;
				}
				if (periodStr.regionMatches(true, pos, text2, 0, textLength2)) {
					return pos;
				}
			}
			return ~position;
		}
	}

	static class CompositeAffix implements org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix {
		private final org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix iLeft;

		private final org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix iRight;

		CompositeAffix(org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix left, org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix right) {
			iLeft = left;
			iRight = right;
		}

		public int calculatePrintedLength(int value) {
			return (iLeft.calculatePrintedLength(value)) + (iRight.calculatePrintedLength(value));
		}

		public void printTo(java.lang.StringBuffer buf, int value) {
			iLeft.printTo(buf, value);
			iRight.printTo(buf, value);
		}

		public void printTo(java.io.Writer out, int value) throws java.io.IOException {
			iLeft.printTo(out, value);
			iRight.printTo(out, value);
		}

		public int parse(java.lang.String periodStr, int position) {
			position = iLeft.parse(periodStr, position);
			if (position >= 0) {
				position = iRight.parse(periodStr, position);
			}
			return position;
		}

		public int scan(java.lang.String periodStr, final int position) {
			int pos = iLeft.scan(periodStr, position);
			if (pos >= 0) {
				return iRight.scan(periodStr, pos);
			}
			return ~position;
		}
	}

	static class FieldFormatter implements org.joda.time.format.PeriodParser , org.joda.time.format.PeriodPrinter {
		private final int iMinPrintedDigits;

		private final int iPrintZeroSetting;

		private final int iMaxParsedDigits;

		private final boolean iRejectSignedValues;

		private final int iFieldType;

		private final org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] iFieldFormatters;

		private final org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix iPrefix;

		private final org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix iSuffix;

		FieldFormatter(int minPrintedDigits, int printZeroSetting, int maxParsedDigits, boolean rejectSignedValues, int fieldType, org.joda.time.format.PeriodFormatterBuilder.FieldFormatter[] fieldFormatters, org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix prefix, org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix suffix) {
			iMinPrintedDigits = minPrintedDigits;
			iPrintZeroSetting = printZeroSetting;
			iMaxParsedDigits = maxParsedDigits;
			iRejectSignedValues = rejectSignedValues;
			iFieldType = fieldType;
			iFieldFormatters = fieldFormatters;
			iPrefix = prefix;
			iSuffix = suffix;
		}

		FieldFormatter(org.joda.time.format.PeriodFormatterBuilder.FieldFormatter field, org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix suffix) {
			iMinPrintedDigits = field.iMinPrintedDigits;
			iPrintZeroSetting = field.iPrintZeroSetting;
			iMaxParsedDigits = field.iMaxParsedDigits;
			iRejectSignedValues = field.iRejectSignedValues;
			iFieldType = field.iFieldType;
			iFieldFormatters = field.iFieldFormatters;
			iPrefix = field.iPrefix;
			if ((field.iSuffix) != null) {
				suffix = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(field.iSuffix, suffix);
			}
			iSuffix = suffix;
		}

		public int countFieldsToPrint(org.joda.time.ReadablePeriod period, int stopAt, java.util.Locale locale) {
			if (stopAt <= 0) {
				return 0;
			}
			if (((iPrintZeroSetting) == (org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_ALWAYS)) || ((getFieldValue(period)) != (java.lang.Long.MAX_VALUE))) {
				return 1;
			}
			return 0;
		}

		public int calculatePrintedLength(org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			long valueLong = getFieldValue(period);
			if (valueLong == (java.lang.Long.MAX_VALUE)) {
				return 0;
			}
			int sum = java.lang.Math.max(org.joda.time.format.FormatUtils.calculateDigitCount(valueLong), iMinPrintedDigits);
			if ((iFieldType) >= (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) {
				sum = java.lang.Math.max(sum, 4);
				sum++;
				if (((iFieldType) == (org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS)) && (((java.lang.Math.abs(valueLong)) % (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)) == 0)) {
					sum -= 4;
				}
				valueLong = valueLong / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
			}
			int value = ((int) (valueLong));
			if ((iPrefix) != null) {
				sum += iPrefix.calculatePrintedLength(value);
			}
			if ((iSuffix) != null) {
				sum += iSuffix.calculatePrintedLength(value);
			}
			return sum;
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			long valueLong = getFieldValue(period);
			if (valueLong == (java.lang.Long.MAX_VALUE)) {
				return ;
			}
			int value = ((int) (valueLong));
			if ((iFieldType) >= (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) {
				value = ((int) (valueLong / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)));
			}
			if ((iPrefix) != null) {
				iPrefix.printTo(buf, value);
			}
			int minDigits = iMinPrintedDigits;
			if (minDigits <= 1) {
				org.joda.time.format.FormatUtils.appendUnpaddedInteger(buf, value);
			}else {
				org.joda.time.format.FormatUtils.appendPaddedInteger(buf, value, minDigits);
			}
			if ((iFieldType) >= (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) {
				int dp = ((int) ((java.lang.Math.abs(valueLong)) % (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)));
				if (((iFieldType) == (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) || (dp > 0)) {
					buf.append('.');
					org.joda.time.format.FormatUtils.appendPaddedInteger(buf, dp, 3);
				}
			}
			if ((iSuffix) != null) {
				iSuffix.printTo(buf, value);
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period, java.util.Locale locale) throws java.io.IOException {
			long valueLong = getFieldValue(period);
			if (valueLong == (java.lang.Long.MAX_VALUE)) {
				return ;
			}
			int value = ((int) (valueLong));
			if ((iFieldType) >= (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) {
				value = ((int) (valueLong / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)));
			}
			if ((iPrefix) != null) {
				iPrefix.printTo(out, value);
			}
			int minDigits = iMinPrintedDigits;
			if (minDigits <= 1) {
				org.joda.time.format.FormatUtils.writeUnpaddedInteger(out, value);
			}else {
				org.joda.time.format.FormatUtils.writePaddedInteger(out, value, minDigits);
			}
			if ((iFieldType) >= (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) {
				int dp = ((int) ((java.lang.Math.abs(valueLong)) % (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND)));
				if (((iFieldType) == (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) || (dp > 0)) {
					out.write('.');
					org.joda.time.format.FormatUtils.writePaddedInteger(out, dp, 3);
				}
			}
			if ((iSuffix) != null) {
				iSuffix.printTo(out, value);
			}
		}

		public int parseInto(org.joda.time.ReadWritablePeriod period, java.lang.String text, int position, java.util.Locale locale) {
			boolean mustParse = (iPrintZeroSetting) == (org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_ALWAYS);
			if (position >= (text.length())) {
				return mustParse ? ~position : position;
			}
			if ((iPrefix) != null) {
				position = iPrefix.parse(text, position);
				if (position >= 0) {
					mustParse = true;
				}else {
					if (!mustParse) {
						return ~position;
					}
					return position;
				}
			}
			int suffixPos = -1;
			if (((iSuffix) != null) && (!mustParse)) {
				suffixPos = iSuffix.scan(text, position);
				if (suffixPos >= 0) {
					mustParse = true;
				}else {
					if (!mustParse) {
						return ~suffixPos;
					}
					return suffixPos;
				}
			}
			if ((!mustParse) && (!(isSupported(period.getPeriodType(), iFieldType)))) {
				return position;
			}
			int limit;
			if (suffixPos > 0) {
				limit = java.lang.Math.min(iMaxParsedDigits, (suffixPos - position));
			}else {
				limit = java.lang.Math.min(iMaxParsedDigits, ((text.length()) - position));
			}
			int length = 0;
			int fractPos = -1;
			boolean hasDigits = false;
			while (length < limit) {
				char c = text.charAt((position + length));
				if (((length == 0) && ((c == '-') || (c == '+'))) && (!(iRejectSignedValues))) {
					boolean negative = c == '-';
					if ((((length + 1) >= limit) || ((c = text.charAt(((position + length) + 1))) < '0')) || (c > '9')) {
						break;
					}
					if (negative) {
						length++;
					}else {
						position++;
					}
					limit = java.lang.Math.min((limit + 1), ((text.length()) - position));
					continue;
				}
				if ((c >= '0') && (c <= '9')) {
					hasDigits = true;
				}else {
					if (((c == '.') || (c == ',')) && (((iFieldType) == (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) || ((iFieldType) == (org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS)))) {
						if (fractPos >= 0) {
							break;
						}
						fractPos = (position + length) + 1;
						limit = java.lang.Math.min((limit + 1), ((text.length()) - position));
					}else {
						break;
					}
				}
				length++;
			} 
			if (!hasDigits) {
				return ~position;
			}
			if ((suffixPos >= 0) && ((position + length) != suffixPos)) {
				return position;
			}
			if (((iFieldType) != (org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS)) && ((iFieldType) != (org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS))) {
				setFieldValue(period, iFieldType, parseInt(text, position, length));
			}else
				if (fractPos < 0) {
					setFieldValue(period, org.joda.time.format.PeriodFormatterBuilder.SECONDS, parseInt(text, position, length));
					setFieldValue(period, org.joda.time.format.PeriodFormatterBuilder.MILLIS, 0);
				}else {
					int wholeValue = parseInt(text, position, ((fractPos - position) - 1));
					setFieldValue(period, org.joda.time.format.PeriodFormatterBuilder.SECONDS, wholeValue);
					int fractLen = (position + length) - fractPos;
					int fractValue;
					if (fractLen <= 0) {
						fractValue = 0;
					}else {
						if (fractLen >= 3) {
							fractValue = parseInt(text, fractPos, 3);
						}else {
							fractValue = parseInt(text, fractPos, fractLen);
							if (fractLen == 1) {
								fractValue *= 100;
							}else {
								fractValue *= 10;
							}
						}
						if (wholeValue < 0) {
							fractValue = -fractValue;
						}
					}
					setFieldValue(period, org.joda.time.format.PeriodFormatterBuilder.MILLIS, fractValue);
				}
			
			position += length;
			if ((position >= 0) && ((iSuffix) != null)) {
				position = iSuffix.parse(text, position);
			}
			return position;
		}

		private int parseInt(java.lang.String text, int position, int length) {
			if (length >= 10) {
				return java.lang.Integer.parseInt(text.substring(position, (position + length)));
			}
			if (length <= 0) {
				return 0;
			}
			int value = text.charAt((position++));
			length--;
			boolean negative;
			if (value == '-') {
				if ((--length) < 0) {
					return 0;
				}
				negative = true;
				value = text.charAt((position++));
			}else {
				negative = false;
			}
			value -= '0';
			while ((length--) > 0) {
				value = (((value << 3) + (value << 1)) + (text.charAt((position++)))) - '0';
			} 
			return negative ? -value : value;
		}

		long getFieldValue(org.joda.time.ReadablePeriod period) {
			org.joda.time.PeriodType type;
			if ((iPrintZeroSetting) == (org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_ALWAYS)) {
				type = null;
			}else {
				type = period.getPeriodType();
			}
			if ((type != null) && ((isSupported(type, iFieldType)) == false)) {
				return java.lang.Long.MAX_VALUE;
			}
			long value;
			switch (iFieldType) {
				default :
					return java.lang.Long.MAX_VALUE;
				case org.joda.time.format.PeriodFormatterBuilder.YEARS :
					value = period.get(org.joda.time.DurationFieldType.years());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MONTHS :
					value = period.get(org.joda.time.DurationFieldType.months());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.WEEKS :
					value = period.get(org.joda.time.DurationFieldType.weeks());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.DAYS :
					value = period.get(org.joda.time.DurationFieldType.days());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.HOURS :
					value = period.get(org.joda.time.DurationFieldType.hours());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MINUTES :
					value = period.get(org.joda.time.DurationFieldType.minutes());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS :
					value = period.get(org.joda.time.DurationFieldType.seconds());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MILLIS :
					value = period.get(org.joda.time.DurationFieldType.millis());
					break;
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS :
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS :
					int seconds = period.get(org.joda.time.DurationFieldType.seconds());
					int millis = period.get(org.joda.time.DurationFieldType.millis());
					value = (seconds * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND))) + millis;
					break;
			}
			if (value == 0) {
				switch (iPrintZeroSetting) {
					case org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_NEVER :
						return java.lang.Long.MAX_VALUE;
					case org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_RARELY_LAST :
						if ((isZero(period)) && ((iFieldFormatters[iFieldType]) == (org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.this))) {
							for (int i = (iFieldType) + 1; i <= (org.joda.time.format.PeriodFormatterBuilder.MAX_FIELD); i++) {
								if ((isSupported(type, i)) && ((iFieldFormatters[i]) != null)) {
									return java.lang.Long.MAX_VALUE;
								}
							}
						}else {
							return java.lang.Long.MAX_VALUE;
						}
						break;
					case org.joda.time.format.PeriodFormatterBuilder.PRINT_ZERO_RARELY_FIRST :
						if ((isZero(period)) && ((iFieldFormatters[iFieldType]) == (org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.this))) {
							int i = java.lang.Math.min(iFieldType, 8);
							i--;
							for (; (i >= 0) && (i <= (org.joda.time.format.PeriodFormatterBuilder.MAX_FIELD)); i--) {
								if ((isSupported(type, i)) && ((iFieldFormatters[i]) != null)) {
									return java.lang.Long.MAX_VALUE;
								}
							}
						}else {
							return java.lang.Long.MAX_VALUE;
						}
						break;
				}
			}
			return value;
		}

		boolean isZero(org.joda.time.ReadablePeriod period) {
			for (int i = 0, isize = period.size(); i < isize; i++) {
				if ((period.getValue(i)) != 0) {
					return false;
				}
			}
			return true;
		}

		boolean isSupported(org.joda.time.PeriodType type, int field) {
			switch (field) {
				default :
					return false;
				case org.joda.time.format.PeriodFormatterBuilder.YEARS :
					return type.isSupported(org.joda.time.DurationFieldType.years());
				case org.joda.time.format.PeriodFormatterBuilder.MONTHS :
					return type.isSupported(org.joda.time.DurationFieldType.months());
				case org.joda.time.format.PeriodFormatterBuilder.WEEKS :
					return type.isSupported(org.joda.time.DurationFieldType.weeks());
				case org.joda.time.format.PeriodFormatterBuilder.DAYS :
					return type.isSupported(org.joda.time.DurationFieldType.days());
				case org.joda.time.format.PeriodFormatterBuilder.HOURS :
					return type.isSupported(org.joda.time.DurationFieldType.hours());
				case org.joda.time.format.PeriodFormatterBuilder.MINUTES :
					return type.isSupported(org.joda.time.DurationFieldType.minutes());
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS :
					return type.isSupported(org.joda.time.DurationFieldType.seconds());
				case org.joda.time.format.PeriodFormatterBuilder.MILLIS :
					return type.isSupported(org.joda.time.DurationFieldType.millis());
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS_MILLIS :
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS_OPTIONAL_MILLIS :
					return (type.isSupported(org.joda.time.DurationFieldType.seconds())) || (type.isSupported(org.joda.time.DurationFieldType.millis()));
			}
		}

		void setFieldValue(org.joda.time.ReadWritablePeriod period, int field, int value) {
			switch (field) {
				default :
					break;
				case org.joda.time.format.PeriodFormatterBuilder.YEARS :
					period.setYears(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MONTHS :
					period.setMonths(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.WEEKS :
					period.setWeeks(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.DAYS :
					period.setDays(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.HOURS :
					period.setHours(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MINUTES :
					period.setMinutes(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.SECONDS :
					period.setSeconds(value);
					break;
				case org.joda.time.format.PeriodFormatterBuilder.MILLIS :
					period.setMillis(value);
					break;
			}
		}

		int getFieldType() {
			return iFieldType;
		}
	}

	static class Literal implements org.joda.time.format.PeriodParser , org.joda.time.format.PeriodPrinter {
		static final org.joda.time.format.PeriodFormatterBuilder.Literal EMPTY = new org.joda.time.format.PeriodFormatterBuilder.Literal("");

		private final java.lang.String iText;

		Literal(java.lang.String text) {
			iText = text;
		}

		public int countFieldsToPrint(org.joda.time.ReadablePeriod period, int stopAt, java.util.Locale locale) {
			return 0;
		}

		public int calculatePrintedLength(org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			return iText.length();
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			buf.append(iText);
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period, java.util.Locale locale) throws java.io.IOException {
			out.write(iText);
		}

		public int parseInto(org.joda.time.ReadWritablePeriod period, java.lang.String periodStr, int position, java.util.Locale locale) {
			if (periodStr.regionMatches(true, position, iText, 0, iText.length())) {
				return position + (iText.length());
			}
			return ~position;
		}
	}

	static class Separator implements org.joda.time.format.PeriodParser , org.joda.time.format.PeriodPrinter {
		private final java.lang.String iText;

		private final java.lang.String iFinalText;

		private final java.lang.String[] iParsedForms;

		private final boolean iUseBefore;

		private final boolean iUseAfter;

		private final org.joda.time.format.PeriodPrinter iBeforePrinter;

		private volatile org.joda.time.format.PeriodPrinter iAfterPrinter;

		private final org.joda.time.format.PeriodParser iBeforeParser;

		private volatile org.joda.time.format.PeriodParser iAfterParser;

		Separator(java.lang.String text, java.lang.String finalText, java.lang.String[] variants, org.joda.time.format.PeriodPrinter beforePrinter, org.joda.time.format.PeriodParser beforeParser, boolean useBefore, boolean useAfter) {
			iText = text;
			iFinalText = finalText;
			if (((finalText == null) || (text.equals(finalText))) && ((variants == null) || ((variants.length) == 0))) {
				iParsedForms = new java.lang.String[]{ text };
			}else {
				java.util.TreeSet<java.lang.String> parsedSet = new java.util.TreeSet<java.lang.String>(java.lang.String.CASE_INSENSITIVE_ORDER);
				parsedSet.add(text);
				parsedSet.add(finalText);
				if (variants != null) {
					for (int i = variants.length; (--i) >= 0;) {
						parsedSet.add(variants[i]);
					}
				}
				java.util.ArrayList<java.lang.String> parsedList = new java.util.ArrayList<java.lang.String>(parsedSet);
				java.util.Collections.reverse(parsedList);
				iParsedForms = parsedList.toArray(new java.lang.String[parsedList.size()]);
			}
			iBeforePrinter = beforePrinter;
			iBeforeParser = beforeParser;
			iUseBefore = useBefore;
			iUseAfter = useAfter;
		}

		public int countFieldsToPrint(org.joda.time.ReadablePeriod period, int stopAt, java.util.Locale locale) {
			int sum = iBeforePrinter.countFieldsToPrint(period, stopAt, locale);
			if (sum < stopAt) {
				sum += iAfterPrinter.countFieldsToPrint(period, stopAt, locale);
			}
			return sum;
		}

		public int calculatePrintedLength(org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			org.joda.time.format.PeriodPrinter before = iBeforePrinter;
			org.joda.time.format.PeriodPrinter after = iAfterPrinter;
			int sum = (before.calculatePrintedLength(period, locale)) + (after.calculatePrintedLength(period, locale));
			if (iUseBefore) {
				if ((before.countFieldsToPrint(period, 1, locale)) > 0) {
					if (iUseAfter) {
						int afterCount = after.countFieldsToPrint(period, 2, locale);
						if (afterCount > 0) {
							sum += (afterCount > 1 ? iText : iFinalText).length();
						}
					}else {
						sum += iText.length();
					}
				}
			}else
				if ((iUseAfter) && ((after.countFieldsToPrint(period, 1, locale)) > 0)) {
					sum += iText.length();
				}
			
			return sum;
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			org.joda.time.format.PeriodPrinter before = iBeforePrinter;
			org.joda.time.format.PeriodPrinter after = iAfterPrinter;
			before.printTo(buf, period, locale);
			if (iUseBefore) {
				if ((before.countFieldsToPrint(period, 1, locale)) > 0) {
					if (iUseAfter) {
						int afterCount = after.countFieldsToPrint(period, 2, locale);
						if (afterCount > 0) {
							buf.append((afterCount > 1 ? iText : iFinalText));
						}
					}else {
						buf.append(iText);
					}
				}
			}else
				if ((iUseAfter) && ((after.countFieldsToPrint(period, 1, locale)) > 0)) {
					buf.append(iText);
				}
			
			after.printTo(buf, period, locale);
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.PeriodPrinter before = iBeforePrinter;
			org.joda.time.format.PeriodPrinter after = iAfterPrinter;
			before.printTo(out, period, locale);
			if (iUseBefore) {
				if ((before.countFieldsToPrint(period, 1, locale)) > 0) {
					if (iUseAfter) {
						int afterCount = after.countFieldsToPrint(period, 2, locale);
						if (afterCount > 0) {
							out.write((afterCount > 1 ? iText : iFinalText));
						}
					}else {
						out.write(iText);
					}
				}
			}else
				if ((iUseAfter) && ((after.countFieldsToPrint(period, 1, locale)) > 0)) {
					out.write(iText);
				}
			
			after.printTo(out, period, locale);
		}

		public int parseInto(org.joda.time.ReadWritablePeriod period, java.lang.String periodStr, int position, java.util.Locale locale) {
			int oldPos = position;
			position = iBeforeParser.parseInto(period, periodStr, position, locale);
			if (position < 0) {
				return position;
			}
			boolean found = false;
			if (position > oldPos) {
				java.lang.String[] parsedForms = iParsedForms;
				int length = parsedForms.length;
				for (int i = 0; i < length; i++) {
					java.lang.String parsedForm = parsedForms[i];
					if (((parsedForm == null) || ((parsedForm.length()) == 0)) || (periodStr.regionMatches(true, position, parsedForm, 0, parsedForm.length()))) {
						position += parsedForm.length();
						found = true;
						break;
					}
				}
			}
			oldPos = position;
			position = iAfterParser.parseInto(period, periodStr, position, locale);
			if (position < 0) {
				return position;
			}
			if (found && (position == oldPos)) {
				return ~oldPos;
			}
			if (((position > oldPos) && (!found)) && (!(iUseBefore))) {
				return ~oldPos;
			}
			return position;
		}

		org.joda.time.format.PeriodFormatterBuilder.Separator finish(org.joda.time.format.PeriodPrinter afterPrinter, org.joda.time.format.PeriodParser afterParser) {
			iAfterPrinter = afterPrinter;
			iAfterParser = afterParser;
			return org.joda.time.format.PeriodFormatterBuilder.Separator.this;
		}
	}

	static class Composite implements org.joda.time.format.PeriodParser , org.joda.time.format.PeriodPrinter {
		private final org.joda.time.format.PeriodPrinter[] iPrinters;

		private final org.joda.time.format.PeriodParser[] iParsers;

		Composite(java.util.List<java.lang.Object> elementPairs) {
			java.util.List<java.lang.Object> printerList = new java.util.ArrayList<java.lang.Object>();
			java.util.List<java.lang.Object> parserList = new java.util.ArrayList<java.lang.Object>();
			decompose(elementPairs, printerList, parserList);
			if ((printerList.size()) <= 0) {
				iPrinters = null;
			}else {
				iPrinters = printerList.toArray(new org.joda.time.format.PeriodPrinter[printerList.size()]);
			}
			if ((parserList.size()) <= 0) {
				iParsers = null;
			}else {
				iParsers = parserList.toArray(new org.joda.time.format.PeriodParser[parserList.size()]);
			}
		}

		public int countFieldsToPrint(org.joda.time.ReadablePeriod period, int stopAt, java.util.Locale locale) {
			int sum = 0;
			org.joda.time.format.PeriodPrinter[] printers = iPrinters;
			for (int i = printers.length; (sum < stopAt) && ((--i) >= 0);) {
				sum += printers[i].countFieldsToPrint(period, java.lang.Integer.MAX_VALUE, locale);
			}
			return sum;
		}

		public int calculatePrintedLength(org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			int sum = 0;
			org.joda.time.format.PeriodPrinter[] printers = iPrinters;
			for (int i = printers.length; (--i) >= 0;) {
				sum += printers[i].calculatePrintedLength(period, locale);
			}
			return sum;
		}

		public void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period, java.util.Locale locale) {
			org.joda.time.format.PeriodPrinter[] printers = iPrinters;
			int len = printers.length;
			for (int i = 0; i < len; i++) {
				printers[i].printTo(buf, period, locale);
			}
		}

		public void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period, java.util.Locale locale) throws java.io.IOException {
			org.joda.time.format.PeriodPrinter[] printers = iPrinters;
			int len = printers.length;
			for (int i = 0; i < len; i++) {
				printers[i].printTo(out, period, locale);
			}
		}

		public int parseInto(org.joda.time.ReadWritablePeriod period, java.lang.String periodStr, int position, java.util.Locale locale) {
			org.joda.time.format.PeriodParser[] parsers = iParsers;
			if (parsers == null) {
				throw new java.lang.UnsupportedOperationException();
			}
			int len = parsers.length;
			for (int i = 0; (i < len) && (position >= 0); i++) {
				position = parsers[i].parseInto(period, periodStr, position, locale);
			}
			return position;
		}

		private void decompose(java.util.List<java.lang.Object> elementPairs, java.util.List<java.lang.Object> printerList, java.util.List<java.lang.Object> parserList) {
			int size = elementPairs.size();
			for (int i = 0; i < size; i += 2) {
				java.lang.Object element = elementPairs.get(i);
				if (element instanceof org.joda.time.format.PeriodPrinter) {
					if (element instanceof org.joda.time.format.PeriodFormatterBuilder.Composite) {
						addArrayToList(printerList, ((org.joda.time.format.PeriodFormatterBuilder.Composite) (element)).iPrinters);
					}else {
						printerList.add(element);
					}
				}
				element = elementPairs.get((i + 1));
				if (element instanceof org.joda.time.format.PeriodParser) {
					if (element instanceof org.joda.time.format.PeriodFormatterBuilder.Composite) {
						addArrayToList(parserList, ((org.joda.time.format.PeriodFormatterBuilder.Composite) (element)).iParsers);
					}else {
						parserList.add(element);
					}
				}
			}
		}

		private void addArrayToList(java.util.List<java.lang.Object> list, java.lang.Object[] array) {
			if (array != null) {
				for (int i = 0; i < (array.length); i++) {
					list.add(array[i]);
				}
			}
		}
	}
}


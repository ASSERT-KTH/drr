

package org.apache.commons.math.fraction;


public class FractionFormat extends java.text.Format implements java.io.Serializable {
	private static final long serialVersionUID = -6337346779577272306L;

	private java.text.NumberFormat denominatorFormat;

	private java.text.NumberFormat numeratorFormat;

	public FractionFormat() {
		this(org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat());
	}

	public FractionFormat(java.text.NumberFormat format) {
		this(format, ((java.text.NumberFormat) (format.clone())));
	}

	public FractionFormat(java.text.NumberFormat numeratorFormat, java.text.NumberFormat denominatorFormat) {
		super();
		org.apache.commons.math.fraction.FractionFormat.this.numeratorFormat = numeratorFormat;
		org.apache.commons.math.fraction.FractionFormat.this.denominatorFormat = denominatorFormat;
	}

	public static java.lang.String formatFraction(org.apache.commons.math.fraction.Fraction f) {
		return org.apache.commons.math.fraction.FractionFormat.getImproperInstance().format(f);
	}

	public static java.util.Locale[] getAvailableLocales() {
		return java.text.NumberFormat.getAvailableLocales();
	}

	public static org.apache.commons.math.fraction.FractionFormat getImproperInstance() {
		return org.apache.commons.math.fraction.FractionFormat.getImproperInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math.fraction.FractionFormat getImproperInstance(java.util.Locale locale) {
		java.text.NumberFormat f = org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(locale);
		return new org.apache.commons.math.fraction.FractionFormat(f);
	}

	public static org.apache.commons.math.fraction.FractionFormat getProperInstance() {
		return org.apache.commons.math.fraction.FractionFormat.getProperInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math.fraction.FractionFormat getProperInstance(java.util.Locale locale) {
		java.text.NumberFormat f = org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(locale);
		return new org.apache.commons.math.fraction.ProperFractionFormat(f);
	}

	protected static java.text.NumberFormat getDefaultNumberFormat() {
		return org.apache.commons.math.fraction.FractionFormat.getDefaultNumberFormat(java.util.Locale.getDefault());
	}

	private static java.text.NumberFormat getDefaultNumberFormat(java.util.Locale locale) {
		java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance(locale);
		nf.setMaximumFractionDigits(0);
		nf.setParseIntegerOnly(true);
		return nf;
	}

	public java.lang.StringBuffer format(org.apache.commons.math.fraction.Fraction fraction, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		getNumeratorFormat().format(fraction.getNumerator(), toAppendTo, pos);
		toAppendTo.append(" / ");
		getDenominatorFormat().format(fraction.getDenominator(), toAppendTo, pos);
		return toAppendTo;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.StringBuffer ret = null;
		if (obj instanceof org.apache.commons.math.fraction.Fraction) {
			ret = format(((org.apache.commons.math.fraction.Fraction) (obj)), toAppendTo, pos);
		}else
			if (obj instanceof java.lang.Number) {
				try {
					ret = format(new org.apache.commons.math.fraction.Fraction(((java.lang.Number) (obj)).doubleValue()), toAppendTo, pos);
				} catch (org.apache.commons.math.ConvergenceException ex) {
					throw new java.lang.IllegalArgumentException("Cannot convert given object to a fraction.");
				}
			}else {
				throw new java.lang.IllegalArgumentException("Cannot format given object as a fraction");
			}
		
		return ret;
	}

	public java.text.NumberFormat getDenominatorFormat() {
		return denominatorFormat;
	}

	public java.text.NumberFormat getNumeratorFormat() {
		return numeratorFormat;
	}

	public org.apache.commons.math.fraction.Fraction parse(java.lang.String source) throws java.text.ParseException {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math.fraction.Fraction result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw org.apache.commons.math.MathRuntimeException.createParseException("unparseable fraction number: \"{0}\"", new java.lang.Object[]{ source }, parsePosition.getErrorIndex());
		}
		return result;
	}

	public org.apache.commons.math.fraction.Fraction parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number num = getNumeratorFormat().parse(source, pos);
		if (num == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		int startIndex = pos.getIndex();
		char c = org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(source, pos);
		switch (c) {
			case 0 :
				return new org.apache.commons.math.fraction.Fraction(num.intValue(), 1);
			case '/' :
				break;
			default :
				pos.setIndex(initialIndex);
				pos.setErrorIndex(startIndex);
				return null;
		}
		org.apache.commons.math.fraction.FractionFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number den = getDenominatorFormat().parse(source, pos);
		if (den == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		return new org.apache.commons.math.fraction.Fraction(num.intValue(), den.intValue());
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		return parse(source, pos);
	}

	public void setDenominatorFormat(java.text.NumberFormat format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("denominator format can not be null.");
		}
		org.apache.commons.math.fraction.FractionFormat.this.denominatorFormat = format;
	}

	public void setNumeratorFormat(java.text.NumberFormat format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("numerator format can not be null.");
		}
		org.apache.commons.math.fraction.FractionFormat.this.numeratorFormat = format;
	}

	protected static void parseAndIgnoreWhitespace(java.lang.String source, java.text.ParsePosition pos) {
		org.apache.commons.math.fraction.FractionFormat.parseNextCharacter(source, pos);
		pos.setIndex(((pos.getIndex()) - 1));
	}

	protected static char parseNextCharacter(java.lang.String source, java.text.ParsePosition pos) {
		int index = pos.getIndex();
		int n = source.length();
		char ret = 0;
		if (index < n) {
			char c;
			do {
				c = source.charAt((index++));
			} while ((java.lang.Character.isWhitespace(c)) && (index < n) );
			pos.setIndex(index);
			if (index < n) {
				ret = c;
			}
		}
		return ret;
	}
}




package org.apache.commons.math.complex;


public class ComplexFormat extends java.text.Format implements java.io.Serializable {
	private static final long serialVersionUID = -6337346779577272306L;

	private static final java.lang.String DEFAULT_IMAGINARY_CHARACTER = "i";

	private java.lang.String imaginaryCharacter;

	private java.text.NumberFormat imaginaryFormat;

	private java.text.NumberFormat realFormat;

	public ComplexFormat() {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat());
	}

	public ComplexFormat(java.text.NumberFormat format) {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, format);
	}

	public ComplexFormat(java.text.NumberFormat realFormat, java.text.NumberFormat imaginaryFormat) {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, realFormat, imaginaryFormat);
	}

	public ComplexFormat(java.lang.String imaginaryCharacter) {
		this(imaginaryCharacter, org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat());
	}

	public ComplexFormat(java.lang.String imaginaryCharacter, java.text.NumberFormat format) {
		this(imaginaryCharacter, format, ((java.text.NumberFormat) (format.clone())));
	}

	public ComplexFormat(java.lang.String imaginaryCharacter, java.text.NumberFormat realFormat, java.text.NumberFormat imaginaryFormat) {
		super();
		setImaginaryCharacter(imaginaryCharacter);
		setImaginaryFormat(imaginaryFormat);
		setRealFormat(realFormat);
	}

	public static java.lang.String formatComplex(org.apache.commons.math.complex.Complex c) {
		return org.apache.commons.math.complex.ComplexFormat.getInstance().format(c);
	}

	public java.lang.StringBuffer format(org.apache.commons.math.complex.Complex complex, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		double re = complex.getReal();
		formatDouble(re, getRealFormat(), toAppendTo, pos);
		double im = complex.getImaginary();
		if (im < 0.0) {
			toAppendTo.append(" - ");
			formatDouble((-im), getImaginaryFormat(), toAppendTo, pos);
			toAppendTo.append(getImaginaryCharacter());
		}else
			if ((im > 0.0) || (java.lang.Double.isNaN(im))) {
				toAppendTo.append(" + ");
				formatDouble(im, getImaginaryFormat(), toAppendTo, pos);
				toAppendTo.append(getImaginaryCharacter());
			}
		
		return toAppendTo;
	}

	public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		java.lang.StringBuffer ret = null;
		if (obj instanceof org.apache.commons.math.complex.Complex) {
			ret = format(((org.apache.commons.math.complex.Complex) (obj)), toAppendTo, pos);
		}else
			if (obj instanceof java.lang.Number) {
				ret = format(new org.apache.commons.math.complex.Complex(((java.lang.Number) (obj)).doubleValue(), 0.0), toAppendTo, pos);
			}else {
				throw new java.lang.IllegalArgumentException("Cannot format given Object as a Date");
			}
		
		return ret;
	}

	private java.lang.StringBuffer formatDouble(double value, java.text.NumberFormat format, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		if ((java.lang.Double.isNaN(value)) || (java.lang.Double.isInfinite(value))) {
			toAppendTo.append('(');
			toAppendTo.append(value);
			toAppendTo.append(')');
		}else {
			format.format(value, toAppendTo, pos);
		}
		return toAppendTo;
	}

	public static java.util.Locale[] getAvailableLocales() {
		return java.text.NumberFormat.getAvailableLocales();
	}

	private static java.text.NumberFormat getDefaultNumberFormat() {
		return org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat(java.util.Locale.getDefault());
	}

	private static java.text.NumberFormat getDefaultNumberFormat(java.util.Locale locale) {
		java.text.NumberFormat nf = java.text.NumberFormat.getInstance(locale);
		nf.setMaximumFractionDigits(2);
		return nf;
	}

	public java.lang.String getImaginaryCharacter() {
		return imaginaryCharacter;
	}

	public java.text.NumberFormat getImaginaryFormat() {
		return imaginaryFormat;
	}

	public static org.apache.commons.math.complex.ComplexFormat getInstance() {
		return org.apache.commons.math.complex.ComplexFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math.complex.ComplexFormat getInstance(java.util.Locale locale) {
		java.text.NumberFormat f = org.apache.commons.math.complex.ComplexFormat.getDefaultNumberFormat(locale);
		return new org.apache.commons.math.complex.ComplexFormat(f);
	}

	public java.text.NumberFormat getRealFormat() {
		return realFormat;
	}

	public org.apache.commons.math.complex.Complex parse(java.lang.String source) throws java.text.ParseException {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math.complex.Complex result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new java.text.ParseException((("Unparseable complex number: \"" + source) + "\""), parsePosition.getErrorIndex());
		}
		return result;
	}

	public org.apache.commons.math.complex.Complex parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		parseAndIgnoreWhitespace(source, pos);
		java.lang.Number re = parseNumber(source, getRealFormat(), pos);
		if (re == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		int startIndex = pos.getIndex();
		char c = parseNextCharacter(source, pos);
		int sign = 0;
		switch (c) {
			case 0 :
				return new org.apache.commons.math.complex.Complex(re.doubleValue(), 0.0);
			case '-' :
				sign = -1;
				break;
			case '+' :
				sign = 1;
				break;
			default :
				pos.setIndex(initialIndex);
				pos.setErrorIndex(startIndex);
				return null;
		}
		parseAndIgnoreWhitespace(source, pos);
		java.lang.Number im = parseNumber(source, getRealFormat(), pos);
		if (im == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		int n = getImaginaryCharacter().length();
		startIndex = pos.getIndex();
		int endIndex = startIndex + n;
		if ((source.substring(startIndex, endIndex).compareTo(getImaginaryCharacter())) != 0) {
			pos.setIndex(initialIndex);
			pos.setErrorIndex(startIndex);
			return null;
		}
		pos.setIndex(endIndex);
		return new org.apache.commons.math.complex.Complex(re.doubleValue(), ((im.doubleValue()) * sign));
	}

	private void parseAndIgnoreWhitespace(java.lang.String source, java.text.ParsePosition pos) {
		parseNextCharacter(source, pos);
		pos.setIndex(((pos.getIndex()) - 1));
	}

	private char parseNextCharacter(java.lang.String source, java.text.ParsePosition pos) {
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

	private java.lang.Number parseNumber(java.lang.String source, double value, java.text.ParsePosition pos) {
		java.lang.Number ret = null;
		java.lang.StringBuffer sb = new java.lang.StringBuffer();
		sb.append('(');
		sb.append(value);
		sb.append(')');
		int n = sb.length();
		int startIndex = pos.getIndex();
		int endIndex = startIndex + n;
		if (endIndex < (source.length())) {
			if ((source.substring(startIndex, endIndex).compareTo(sb.toString())) == 0) {
				ret = new java.lang.Double(value);
				pos.setIndex(endIndex);
			}
		}
		return ret;
	}

	private java.lang.Number parseNumber(java.lang.String source, java.text.NumberFormat format, java.text.ParsePosition pos) {
		int startIndex = pos.getIndex();
		java.lang.Number number = format.parse(source, pos);
		int endIndex = pos.getIndex();
		if (startIndex == endIndex) {
			double[] special = new double[]{ java.lang.Double.NaN , java.lang.Double.POSITIVE_INFINITY , java.lang.Double.NEGATIVE_INFINITY };
			for (int i = 0; i < (special.length); ++i) {
				number = parseNumber(source, special[i], pos);
				if (number != null) {
					break;
				}
			}
		}
		return number;
	}

	public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) {
		return parse(source, pos);
	}

	public void setImaginaryCharacter(java.lang.String imaginaryCharacter) {
		if ((imaginaryCharacter == null) || ((imaginaryCharacter.length()) == 0)) {
			throw new java.lang.IllegalArgumentException("imaginaryCharacter must be a non-empty string.");
		}
		org.apache.commons.math.complex.ComplexFormat.this.imaginaryCharacter = imaginaryCharacter;
	}

	public void setImaginaryFormat(java.text.NumberFormat imaginaryFormat) {
		if (imaginaryFormat == null) {
			throw new java.lang.IllegalArgumentException("imaginaryFormat can not be null.");
		}
		org.apache.commons.math.complex.ComplexFormat.this.imaginaryFormat = imaginaryFormat;
	}

	public void setRealFormat(java.text.NumberFormat realFormat) {
		if (realFormat == null) {
			throw new java.lang.IllegalArgumentException("realFormat can not be null.");
		}
		org.apache.commons.math.complex.ComplexFormat.this.realFormat = realFormat;
	}
}


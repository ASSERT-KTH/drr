

package org.apache.commons.math.complex;


public class ComplexFormat {
	private static final java.lang.String DEFAULT_IMAGINARY_CHARACTER = "i";

	private final java.lang.String imaginaryCharacter;

	private final java.text.NumberFormat imaginaryFormat;

	private final java.text.NumberFormat realFormat;

	public ComplexFormat() {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public ComplexFormat(java.text.NumberFormat format) {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, format);
	}

	public ComplexFormat(java.text.NumberFormat realFormat, java.text.NumberFormat imaginaryFormat) {
		this(org.apache.commons.math.complex.ComplexFormat.DEFAULT_IMAGINARY_CHARACTER, realFormat, imaginaryFormat);
	}

	public ComplexFormat(java.lang.String imaginaryCharacter) {
		this(imaginaryCharacter, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public ComplexFormat(java.lang.String imaginaryCharacter, java.text.NumberFormat format) {
		this(imaginaryCharacter, format, format);
	}

	public ComplexFormat(java.lang.String imaginaryCharacter, java.text.NumberFormat realFormat, java.text.NumberFormat imaginaryFormat) {
		if (imaginaryCharacter == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((imaginaryCharacter.length()) == 0) {
			throw new org.apache.commons.math.exception.NoDataException();
		}
		if (imaginaryFormat == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.IMAGINARY_FORMAT);
		}
		if (realFormat == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.REAL_FORMAT);
		}
		this.imaginaryCharacter = imaginaryCharacter;
		this.imaginaryFormat = imaginaryFormat;
		this.realFormat = realFormat;
	}

	public static java.util.Locale[] getAvailableLocales() {
		return java.text.NumberFormat.getAvailableLocales();
	}

	public java.lang.String format(org.apache.commons.math.complex.Complex c) {
		return format(c, new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public java.lang.String format(java.lang.Double c) {
		return format(new org.apache.commons.math.complex.Complex(c, 0), new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public java.lang.StringBuffer format(org.apache.commons.math.complex.Complex complex, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		double re = complex.getReal();
		org.apache.commons.math.util.CompositeFormat.formatDouble(re, getRealFormat(), toAppendTo, pos);
		double im = complex.getImaginary();
		java.lang.StringBuffer imAppendTo = new java.lang.StringBuffer();
		if (im < 0.0) {
			toAppendTo.append(" - ");
			imAppendTo = formatImaginary((-im), new java.lang.StringBuffer(), pos);
			toAppendTo.append(imAppendTo);
			toAppendTo.append(getImaginaryCharacter());
		}else
			if ((im > 0.0) || (java.lang.Double.isNaN(im))) {
				toAppendTo.append(" + ");
				imAppendTo = formatImaginary(im, new java.lang.StringBuffer(), pos);
				toAppendTo.append(imAppendTo);
				toAppendTo.append(getImaginaryCharacter());
			}
		
		return toAppendTo;
	}

	private java.lang.StringBuffer formatImaginary(double absIm, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		if (absIm < 0) {
			throw new org.apache.commons.math.exception.MathInternalError();
		}
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		org.apache.commons.math.util.CompositeFormat.formatDouble(absIm, getImaginaryFormat(), toAppendTo, pos);
		if (toAppendTo.toString().equals("1")) {
			toAppendTo.setLength(0);
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
				throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_COMPLEX, obj.getClass().getName());
			}
		
		return ret;
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
		java.text.NumberFormat f = org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(locale);
		return new org.apache.commons.math.complex.ComplexFormat(f);
	}

	public static org.apache.commons.math.complex.ComplexFormat getInstance(java.lang.String imaginaryCharacter, java.util.Locale locale) {
		java.text.NumberFormat f = org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(locale);
		return new org.apache.commons.math.complex.ComplexFormat(imaginaryCharacter, f);
	}

	public java.text.NumberFormat getRealFormat() {
		return realFormat;
	}

	public org.apache.commons.math.complex.Complex parse(java.lang.String source) {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math.complex.Complex result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math.complex.Complex.class);
		}
		return result;
	}

	public org.apache.commons.math.complex.Complex parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number re = org.apache.commons.math.util.CompositeFormat.parseNumber(source, getRealFormat(), pos);
		if (re == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		int startIndex = pos.getIndex();
		char c = org.apache.commons.math.util.CompositeFormat.parseNextCharacter(source, pos);
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
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number im = org.apache.commons.math.util.CompositeFormat.parseNumber(source, getRealFormat(), pos);
		if (im == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, getImaginaryCharacter(), pos))) {
			return null;
		}
		return new org.apache.commons.math.complex.Complex(re.doubleValue(), ((im.doubleValue()) * sign));
	}
}


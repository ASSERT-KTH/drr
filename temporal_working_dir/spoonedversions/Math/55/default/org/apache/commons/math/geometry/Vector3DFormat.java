

package org.apache.commons.math.geometry;


public class Vector3DFormat {
	private static final long serialVersionUID = -5447606608652576301L;

	private static final java.lang.String DEFAULT_PREFIX = "{";

	private static final java.lang.String DEFAULT_SUFFIX = "}";

	private static final java.lang.String DEFAULT_SEPARATOR = "; ";

	private final java.lang.String prefix;

	private final java.lang.String suffix;

	private final java.lang.String separator;

	private final java.lang.String trimmedPrefix;

	private final java.lang.String trimmedSuffix;

	private final java.lang.String trimmedSeparator;

	private final java.text.NumberFormat format;

	public Vector3DFormat() {
		this(org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_PREFIX, org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_SUFFIX, org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_SEPARATOR, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector3DFormat(final java.text.NumberFormat format) {
		this(org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_PREFIX, org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_SUFFIX, org.apache.commons.math.geometry.Vector3DFormat.DEFAULT_SEPARATOR, format);
	}

	public Vector3DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator) {
		this(prefix, suffix, separator, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector3DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator, final java.text.NumberFormat format) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.separator = separator;
		trimmedPrefix = prefix.trim();
		trimmedSuffix = suffix.trim();
		trimmedSeparator = separator.trim();
		this.format = format;
	}

	public static java.util.Locale[] getAvailableLocales() {
		return java.text.NumberFormat.getAvailableLocales();
	}

	public java.lang.String getPrefix() {
		return prefix;
	}

	public java.lang.String getSuffix() {
		return suffix;
	}

	public java.lang.String getSeparator() {
		return separator;
	}

	public java.text.NumberFormat getFormat() {
		return format;
	}

	public static org.apache.commons.math.geometry.Vector3DFormat getInstance() {
		return org.apache.commons.math.geometry.Vector3DFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math.geometry.Vector3DFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math.geometry.Vector3DFormat(org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	public java.lang.String format(org.apache.commons.math.geometry.Vector3D v) {
		return format(v, new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public java.lang.StringBuffer format(org.apache.commons.math.geometry.Vector3D vector, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		toAppendTo.append(prefix);
		org.apache.commons.math.util.CompositeFormat.formatDouble(vector.getX(), format, toAppendTo, pos);
		toAppendTo.append(separator);
		org.apache.commons.math.util.CompositeFormat.formatDouble(vector.getY(), format, toAppendTo, pos);
		toAppendTo.append(separator);
		org.apache.commons.math.util.CompositeFormat.formatDouble(vector.getZ(), format, toAppendTo, pos);
		toAppendTo.append(suffix);
		return toAppendTo;
	}

	public org.apache.commons.math.geometry.Vector3D parse(java.lang.String source) {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math.geometry.Vector3D result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math.geometry.Vector3D.class);
		}
		return result;
	}

	public org.apache.commons.math.geometry.Vector3D parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))) {
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number x = org.apache.commons.math.util.CompositeFormat.parseNumber(source, format, pos);
		if (x == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSeparator, pos))) {
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number y = org.apache.commons.math.util.CompositeFormat.parseNumber(source, format, pos);
		if (y == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSeparator, pos))) {
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		java.lang.Number z = org.apache.commons.math.util.CompositeFormat.parseNumber(source, format, pos);
		if (z == null) {
			pos.setIndex(initialIndex);
			return null;
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))) {
			return null;
		}
		return new org.apache.commons.math.geometry.Vector3D(x.doubleValue(), y.doubleValue(), z.doubleValue());
	}
}


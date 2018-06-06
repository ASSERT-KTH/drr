

package org.apache.commons.math.geometry;


public abstract class VectorFormat<S extends org.apache.commons.math.geometry.Space> {
	public static final java.lang.String DEFAULT_PREFIX = "{";

	public static final java.lang.String DEFAULT_SUFFIX = "}";

	public static final java.lang.String DEFAULT_SEPARATOR = "; ";

	private final java.lang.String prefix;

	private final java.lang.String suffix;

	private final java.lang.String separator;

	private final java.lang.String trimmedPrefix;

	private final java.lang.String trimmedSuffix;

	private final java.lang.String trimmedSeparator;

	private final java.text.NumberFormat format;

	protected VectorFormat() {
		this(org.apache.commons.math.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math.geometry.VectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	protected VectorFormat(final java.text.NumberFormat format) {
		this(org.apache.commons.math.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math.geometry.VectorFormat.DEFAULT_SEPARATOR, format);
	}

	protected VectorFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator) {
		this(prefix, suffix, separator, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	protected VectorFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator, final java.text.NumberFormat format) {
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

	public java.lang.String format(org.apache.commons.math.geometry.Vector<S> vector) {
		return format(vector, new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public abstract java.lang.StringBuffer format(org.apache.commons.math.geometry.Vector<S> vector, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos);

	protected java.lang.StringBuffer format(java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos, double... coordinates) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		toAppendTo.append(prefix);
		for (int i = 0; i < (coordinates.length); ++i) {
			if (i > 0) {
				toAppendTo.append(separator);
			}
			org.apache.commons.math.util.CompositeFormat.formatDouble(coordinates[i], format, toAppendTo, pos);
		}
		toAppendTo.append(suffix);
		return toAppendTo;
	}

	public abstract org.apache.commons.math.geometry.Vector<S> parse(java.lang.String source) throws org.apache.commons.math.exception.MathParseException;

	public abstract org.apache.commons.math.geometry.Vector<S> parse(java.lang.String source, java.text.ParsePosition pos);

	protected double[] parseCoordinates(int dimension, java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		double[] coordinates = new double[dimension];
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))) {
			return null;
		}
		for (int i = 0; i < dimension; ++i) {
			org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
			if (i > 0) {
				if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSeparator, pos))) {
					return null;
				}
			}
			org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
			java.lang.Number c = org.apache.commons.math.util.CompositeFormat.parseNumber(source, format, pos);
			if (c == null) {
				pos.setIndex(initialIndex);
				return null;
			}
			coordinates[i] = c.doubleValue();
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))) {
			return null;
		}
		return coordinates;
	}
}


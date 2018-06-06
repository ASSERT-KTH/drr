

package org.apache.commons.math.linear;


public class RealVectorFormat {
	private static final long serialVersionUID = -708767813036157690L;

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

	public RealVectorFormat() {
		this(org.apache.commons.math.linear.RealVectorFormat.DEFAULT_PREFIX, org.apache.commons.math.linear.RealVectorFormat.DEFAULT_SUFFIX, org.apache.commons.math.linear.RealVectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public RealVectorFormat(final java.text.NumberFormat format) {
		this(org.apache.commons.math.linear.RealVectorFormat.DEFAULT_PREFIX, org.apache.commons.math.linear.RealVectorFormat.DEFAULT_SUFFIX, org.apache.commons.math.linear.RealVectorFormat.DEFAULT_SEPARATOR, format);
	}

	public RealVectorFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator) {
		this(prefix, suffix, separator, org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat());
	}

	public RealVectorFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator, final java.text.NumberFormat format) {
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

	public static org.apache.commons.math.linear.RealVectorFormat getInstance() {
		return org.apache.commons.math.linear.RealVectorFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math.linear.RealVectorFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math.linear.RealVectorFormat(org.apache.commons.math.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	public java.lang.String format(org.apache.commons.math.linear.RealVector v) {
		return format(v, new java.lang.StringBuffer(), new java.text.FieldPosition(0)).toString();
	}

	public java.lang.StringBuffer format(org.apache.commons.math.linear.RealVector vector, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) {
		pos.setBeginIndex(0);
		pos.setEndIndex(0);
		toAppendTo.append(prefix);
		for (int i = 0; i < (vector.getDimension()); ++i) {
			if (i > 0) {
				toAppendTo.append(separator);
			}
			org.apache.commons.math.util.CompositeFormat.formatDouble(vector.getEntry(i), format, toAppendTo, pos);
		}
		toAppendTo.append(suffix);
		return toAppendTo;
	}

	public org.apache.commons.math.linear.ArrayRealVector parse(java.lang.String source) {
		final java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		final org.apache.commons.math.linear.ArrayRealVector result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math.linear.ArrayRealVector.class);
		}
		return result;
	}

	public org.apache.commons.math.linear.ArrayRealVector parse(java.lang.String source, java.text.ParsePosition pos) {
		int initialIndex = pos.getIndex();
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedPrefix, pos))) {
			return null;
		}
		java.util.List<java.lang.Number> components = new java.util.ArrayList<java.lang.Number>();
		for (boolean loop = true; loop;) {
			if (!(components.isEmpty())) {
				org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
				if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSeparator, pos))) {
					loop = false;
				}
			}
			if (loop) {
				org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
				java.lang.Number component = org.apache.commons.math.util.CompositeFormat.parseNumber(source, format, pos);
				if (component != null) {
					components.add(component);
				}else {
					pos.setIndex(initialIndex);
					return null;
				}
			}
		}
		org.apache.commons.math.util.CompositeFormat.parseAndIgnoreWhitespace(source, pos);
		if (!(org.apache.commons.math.util.CompositeFormat.parseFixedstring(source, trimmedSuffix, pos))) {
			return null;
		}
		double[] data = new double[components.size()];
		for (int i = 0; i < (data.length); ++i) {
			data[i] = components.get(i).doubleValue();
		}
		return new org.apache.commons.math.linear.ArrayRealVector(data, false);
	}
}


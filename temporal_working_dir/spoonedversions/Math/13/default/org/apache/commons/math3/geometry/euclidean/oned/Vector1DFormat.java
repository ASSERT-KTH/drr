

package org.apache.commons.math3.geometry.euclidean.oned;


public class Vector1DFormat extends org.apache.commons.math3.geometry.VectorFormat<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> {
	public Vector1DFormat() {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector1DFormat(final java.text.NumberFormat format) {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, format);
	}

	public Vector1DFormat(final java.lang.String prefix, final java.lang.String suffix) {
		super(prefix, suffix, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector1DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.text.NumberFormat format) {
		super(prefix, suffix, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, format);
	}

	public static org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat getInstance() {
		return org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math3.geometry.euclidean.oned.Vector1DFormat(org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	@java.lang.Override
	public java.lang.StringBuffer format(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> vector, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
		final org.apache.commons.math3.geometry.euclidean.oned.Vector1D p1 = ((org.apache.commons.math3.geometry.euclidean.oned.Vector1D) (vector));
		return format(toAppendTo, pos, p1.getX());
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.oned.Vector1D parse(final java.lang.String source) throws org.apache.commons.math3.exception.MathParseException {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math3.geometry.euclidean.oned.Vector1D result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math3.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math3.geometry.euclidean.oned.Vector1D.class);
		}
		return result;
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.oned.Vector1D parse(final java.lang.String source, final java.text.ParsePosition pos) {
		final double[] coordinates = parseCoordinates(1, source, pos);
		if (coordinates == null) {
			return null;
		}
		return new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(coordinates[0]);
	}
}


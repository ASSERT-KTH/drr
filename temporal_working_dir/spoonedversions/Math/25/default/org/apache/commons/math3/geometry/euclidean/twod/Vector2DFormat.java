

package org.apache.commons.math3.geometry.euclidean.twod;


public class Vector2DFormat extends org.apache.commons.math3.geometry.VectorFormat<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> {
	public Vector2DFormat() {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector2DFormat(final java.text.NumberFormat format) {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, format);
	}

	public Vector2DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator) {
		super(prefix, suffix, separator, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector2DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator, final java.text.NumberFormat format) {
		super(prefix, suffix, separator, format);
	}

	public static org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat getInstance() {
		return org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2DFormat(org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	@java.lang.Override
	public java.lang.StringBuffer format(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D> vector, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
		final org.apache.commons.math3.geometry.euclidean.twod.Vector2D p2 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D) (vector));
		return format(toAppendTo, pos, p2.getX(), p2.getY());
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D parse(final java.lang.String source) {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math3.geometry.euclidean.twod.Vector2D result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math3.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math3.geometry.euclidean.twod.Vector2D.class);
		}
		return result;
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.twod.Vector2D parse(final java.lang.String source, final java.text.ParsePosition pos) {
		final double[] coordinates = parseCoordinates(2, source, pos);
		if (coordinates == null) {
			return null;
		}
		return new org.apache.commons.math3.geometry.euclidean.twod.Vector2D(coordinates[0], coordinates[1]);
	}
}


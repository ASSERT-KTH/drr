

package org.apache.commons.math3.geometry.euclidean.threed;


public class Vector3DFormat extends org.apache.commons.math3.geometry.VectorFormat<org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D> {
	public Vector3DFormat() {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector3DFormat(final java.text.NumberFormat format) {
		super(org.apache.commons.math3.geometry.VectorFormat.DEFAULT_PREFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SUFFIX, org.apache.commons.math3.geometry.VectorFormat.DEFAULT_SEPARATOR, format);
	}

	public Vector3DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator) {
		super(prefix, suffix, separator, org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat());
	}

	public Vector3DFormat(final java.lang.String prefix, final java.lang.String suffix, final java.lang.String separator, final java.text.NumberFormat format) {
		super(prefix, suffix, separator, format);
	}

	public static org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat getInstance() {
		return org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat.getInstance(java.util.Locale.getDefault());
	}

	public static org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat getInstance(final java.util.Locale locale) {
		return new org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat(org.apache.commons.math3.util.CompositeFormat.getDefaultNumberFormat(locale));
	}

	@java.lang.Override
	public java.lang.StringBuffer format(final org.apache.commons.math3.geometry.Vector<org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D> vector, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
		final org.apache.commons.math3.geometry.euclidean.threed.Vector3D v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D) (vector));
		return format(toAppendTo, pos, v3.getX(), v3.getY(), v3.getZ());
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D parse(final java.lang.String source) {
		java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
		org.apache.commons.math3.geometry.euclidean.threed.Vector3D result = parse(source, parsePosition);
		if ((parsePosition.getIndex()) == 0) {
			throw new org.apache.commons.math3.exception.MathParseException(source, parsePosition.getErrorIndex(), org.apache.commons.math3.geometry.euclidean.threed.Vector3D.class);
		}
		return result;
	}

	@java.lang.Override
	public org.apache.commons.math3.geometry.euclidean.threed.Vector3D parse(final java.lang.String source, final java.text.ParsePosition pos) {
		final double[] coordinates = parseCoordinates(3, source, pos);
		if (coordinates == null) {
			return null;
		}
		return new org.apache.commons.math3.geometry.euclidean.threed.Vector3D(coordinates[0], coordinates[1], coordinates[2]);
	}
}


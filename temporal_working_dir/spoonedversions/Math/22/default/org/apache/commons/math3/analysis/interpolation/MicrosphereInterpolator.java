

package org.apache.commons.math3.analysis.interpolation;


public class MicrosphereInterpolator implements org.apache.commons.math3.analysis.interpolation.MultivariateInterpolator {
	public static final int DEFAULT_MICROSPHERE_ELEMENTS = 2000;

	public static final int DEFAULT_BRIGHTNESS_EXPONENT = 2;

	private final int microsphereElements;

	private final int brightnessExponent;

	public MicrosphereInterpolator() {
		this(org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS, org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT);
	}

	public MicrosphereInterpolator(final int elements, final int exponent) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (exponent < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(exponent);
		}
		if (elements <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(elements);
		}
		microsphereElements = elements;
		brightnessExponent = exponent;
	}

	public org.apache.commons.math3.analysis.MultivariateFunction interpolate(final double[][] xval, final double[] yval) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException {
		final org.apache.commons.math3.random.UnitSphereRandomVectorGenerator rand = new org.apache.commons.math3.random.UnitSphereRandomVectorGenerator(xval[0].length);
		return new org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction(xval, yval, brightnessExponent, microsphereElements, rand);
	}
}


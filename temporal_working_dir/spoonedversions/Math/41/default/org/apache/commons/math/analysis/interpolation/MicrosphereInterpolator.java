

package org.apache.commons.math.analysis.interpolation;


public class MicrosphereInterpolator implements org.apache.commons.math.analysis.interpolation.MultivariateRealInterpolator {
	public static final int DEFAULT_MICROSPHERE_ELEMENTS = 2000;

	public static final int DEFAULT_BRIGHTNESS_EXPONENT = 2;

	private final int microsphereElements;

	private final int brightnessExponent;

	public MicrosphereInterpolator() {
		this(org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS, org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT);
	}

	public MicrosphereInterpolator(final int elements, final int exponent) {
		if (exponent < 0) {
			throw new org.apache.commons.math.exception.NotPositiveException(exponent);
		}
		if (elements <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(elements);
		}
		microsphereElements = elements;
		brightnessExponent = exponent;
	}

	public org.apache.commons.math.analysis.MultivariateFunction interpolate(final double[][] xval, final double[] yval) {
		final org.apache.commons.math.random.UnitSphereRandomVectorGenerator rand = new org.apache.commons.math.random.UnitSphereRandomVectorGenerator(xval[0].length);
		return new org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction(xval, yval, brightnessExponent, microsphereElements, rand);
	}
}


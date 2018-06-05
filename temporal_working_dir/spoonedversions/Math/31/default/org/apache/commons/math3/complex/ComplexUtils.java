

package org.apache.commons.math3.complex;


public class ComplexUtils {
	private ComplexUtils() {
		super();
	}

	public static org.apache.commons.math3.complex.Complex polar2Complex(double r, double theta) {
		if (r < 0) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE, r);
		}
		return new org.apache.commons.math3.complex.Complex((r * (org.apache.commons.math3.util.FastMath.cos(theta))), (r * (org.apache.commons.math3.util.FastMath.sin(theta))));
	}
}


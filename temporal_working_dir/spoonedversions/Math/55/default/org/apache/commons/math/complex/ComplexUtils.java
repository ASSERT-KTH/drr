

package org.apache.commons.math.complex;


public class ComplexUtils {
	private ComplexUtils() {
		super();
	}

	public static org.apache.commons.math.complex.Complex polar2Complex(double r, double theta) {
		if (r < 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE, r);
		}
		return new org.apache.commons.math.complex.Complex((r * (org.apache.commons.math.util.FastMath.cos(theta))), (r * (org.apache.commons.math.util.FastMath.sin(theta))));
	}
}


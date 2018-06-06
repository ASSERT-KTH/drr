

package org.apache.commons.math.complex;


public class ComplexUtils {
	private ComplexUtils() {
		super();
	}

	public static org.apache.commons.math.complex.Complex polar2Complex(double r, double theta) {
		if (r < 0) {
			throw new java.lang.IllegalArgumentException("Complex modulus must not be negative");
		}
		return new org.apache.commons.math.complex.Complex((r * (java.lang.Math.cos(theta))), (r * (java.lang.Math.sin(theta))));
	}
}


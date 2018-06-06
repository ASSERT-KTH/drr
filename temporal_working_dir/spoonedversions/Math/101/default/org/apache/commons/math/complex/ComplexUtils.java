

package org.apache.commons.math.complex;


public class ComplexUtils {
	private ComplexUtils() {
		super();
	}

	public static org.apache.commons.math.complex.Complex acos(org.apache.commons.math.complex.Complex z) {
		return z.acos();
	}

	public static org.apache.commons.math.complex.Complex asin(org.apache.commons.math.complex.Complex z) {
		return z.asin();
	}

	public static org.apache.commons.math.complex.Complex atan(org.apache.commons.math.complex.Complex z) {
		return z.atan();
	}

	public static org.apache.commons.math.complex.Complex cos(org.apache.commons.math.complex.Complex z) {
		return z.cos();
	}

	public static org.apache.commons.math.complex.Complex cosh(org.apache.commons.math.complex.Complex z) {
		return z.cosh();
	}

	public static org.apache.commons.math.complex.Complex exp(org.apache.commons.math.complex.Complex z) {
		return z.exp();
	}

	public static org.apache.commons.math.complex.Complex log(org.apache.commons.math.complex.Complex z) {
		return z.log();
	}

	public static org.apache.commons.math.complex.Complex polar2Complex(double r, double theta) {
		if (r < 0) {
			throw new java.lang.IllegalArgumentException("Complex modulus must not be negative");
		}
		return new org.apache.commons.math.complex.Complex((r * (java.lang.Math.cos(theta))), (r * (java.lang.Math.sin(theta))));
	}

	public static org.apache.commons.math.complex.Complex pow(org.apache.commons.math.complex.Complex y, org.apache.commons.math.complex.Complex x) {
		return y.pow(x);
	}

	public static org.apache.commons.math.complex.Complex sin(org.apache.commons.math.complex.Complex z) {
		return z.sin();
	}

	public static org.apache.commons.math.complex.Complex sinh(org.apache.commons.math.complex.Complex z) {
		return z.sinh();
	}

	public static org.apache.commons.math.complex.Complex sqrt(org.apache.commons.math.complex.Complex z) {
		return z.sqrt();
	}

	public static org.apache.commons.math.complex.Complex sqrt1z(org.apache.commons.math.complex.Complex z) {
		return z.sqrt1z();
	}

	public static org.apache.commons.math.complex.Complex tan(org.apache.commons.math.complex.Complex z) {
		return z.tan();
	}

	public static org.apache.commons.math.complex.Complex tanh(org.apache.commons.math.complex.Complex z) {
		return z.tanh();
	}
}


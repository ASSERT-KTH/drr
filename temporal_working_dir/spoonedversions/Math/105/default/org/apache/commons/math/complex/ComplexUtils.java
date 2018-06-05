

package org.apache.commons.math.complex;


public class ComplexUtils {
	private ComplexUtils() {
		super();
	}

	public static org.apache.commons.math.complex.Complex acos(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return org.apache.commons.math.complex.Complex.I.negate().multiply(org.apache.commons.math.complex.ComplexUtils.log(z.add(org.apache.commons.math.complex.Complex.I.multiply(org.apache.commons.math.complex.ComplexUtils.sqrt1z(z)))));
	}

	public static org.apache.commons.math.complex.Complex asin(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return org.apache.commons.math.complex.Complex.I.negate().multiply(org.apache.commons.math.complex.ComplexUtils.log(org.apache.commons.math.complex.ComplexUtils.sqrt1z(z).add(org.apache.commons.math.complex.Complex.I.multiply(z))));
	}

	public static org.apache.commons.math.complex.Complex atan(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return org.apache.commons.math.complex.Complex.I.multiply(org.apache.commons.math.complex.ComplexUtils.log(org.apache.commons.math.complex.Complex.I.add(z).divide(org.apache.commons.math.complex.Complex.I.subtract(z)))).divide(new org.apache.commons.math.complex.Complex(2.0, 0.0));
	}

	public static org.apache.commons.math.complex.Complex cos(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a = z.getReal();
		double b = z.getImaginary();
		return new org.apache.commons.math.complex.Complex(((java.lang.Math.cos(a)) * (org.apache.commons.math.util.MathUtils.cosh(b))), ((-(java.lang.Math.sin(a))) * (org.apache.commons.math.util.MathUtils.sinh(b))));
	}

	public static org.apache.commons.math.complex.Complex cosh(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a = z.getReal();
		double b = z.getImaginary();
		return new org.apache.commons.math.complex.Complex(((org.apache.commons.math.util.MathUtils.cosh(a)) * (java.lang.Math.cos(b))), ((org.apache.commons.math.util.MathUtils.sinh(a)) * (java.lang.Math.sin(b))));
	}

	public static org.apache.commons.math.complex.Complex exp(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double b = z.getImaginary();
		double expA = java.lang.Math.exp(z.getReal());
		return new org.apache.commons.math.complex.Complex((expA * (java.lang.Math.cos(b))), (expA * (java.lang.Math.sin(b))));
	}

	public static org.apache.commons.math.complex.Complex log(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return new org.apache.commons.math.complex.Complex(java.lang.Math.log(z.abs()), java.lang.Math.atan2(z.getImaginary(), z.getReal()));
	}

	public static org.apache.commons.math.complex.Complex polar2Complex(double r, double theta) {
		if (r < 0) {
			throw new java.lang.IllegalArgumentException("Complex modulus must not be negative");
		}
		return new org.apache.commons.math.complex.Complex((r * (java.lang.Math.cos(theta))), (r * (java.lang.Math.sin(theta))));
	}

	public static org.apache.commons.math.complex.Complex pow(org.apache.commons.math.complex.Complex y, org.apache.commons.math.complex.Complex x) {
		return org.apache.commons.math.complex.ComplexUtils.exp(x.multiply(org.apache.commons.math.complex.ComplexUtils.log(y)));
	}

	public static org.apache.commons.math.complex.Complex sin(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a = z.getReal();
		double b = z.getImaginary();
		return new org.apache.commons.math.complex.Complex(((java.lang.Math.sin(a)) * (org.apache.commons.math.util.MathUtils.cosh(b))), ((java.lang.Math.cos(a)) * (org.apache.commons.math.util.MathUtils.sinh(b))));
	}

	public static org.apache.commons.math.complex.Complex sinh(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a = z.getReal();
		double b = z.getImaginary();
		return new org.apache.commons.math.complex.Complex(((org.apache.commons.math.util.MathUtils.sinh(a)) * (java.lang.Math.cos(b))), ((org.apache.commons.math.util.MathUtils.cosh(a)) * (java.lang.Math.sin(b))));
	}

	public static org.apache.commons.math.complex.Complex sqrt(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a = z.getReal();
		double b = z.getImaginary();
		if ((a == 0.0) && (b == 0.0)) {
			return new org.apache.commons.math.complex.Complex(0.0, 0.0);
		}
		double t = java.lang.Math.sqrt((((java.lang.Math.abs(a)) + (z.abs())) / 2.0));
		if (a >= 0.0) {
			return new org.apache.commons.math.complex.Complex(t, (b / (2.0 * t)));
		}else {
			return new org.apache.commons.math.complex.Complex(((java.lang.Math.abs(b)) / (2.0 * t)), ((org.apache.commons.math.util.MathUtils.indicator(b)) * t));
		}
	}

	public static org.apache.commons.math.complex.Complex sqrt1z(org.apache.commons.math.complex.Complex z) {
		return org.apache.commons.math.complex.ComplexUtils.sqrt(org.apache.commons.math.complex.Complex.ONE.subtract(z.multiply(z)));
	}

	public static org.apache.commons.math.complex.Complex tan(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a2 = 2.0 * (z.getReal());
		double b2 = 2.0 * (z.getImaginary());
		double d = (java.lang.Math.cos(a2)) + (org.apache.commons.math.util.MathUtils.cosh(b2));
		return new org.apache.commons.math.complex.Complex(((java.lang.Math.sin(a2)) / d), ((org.apache.commons.math.util.MathUtils.sinh(b2)) / d));
	}

	public static org.apache.commons.math.complex.Complex tanh(org.apache.commons.math.complex.Complex z) {
		if (z.isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double a2 = 2.0 * (z.getReal());
		double b2 = 2.0 * (z.getImaginary());
		double d = (org.apache.commons.math.util.MathUtils.cosh(a2)) + (java.lang.Math.cos(b2));
		return new org.apache.commons.math.complex.Complex(((org.apache.commons.math.util.MathUtils.sinh(a2)) / d), ((java.lang.Math.sin(b2)) / d));
	}
}


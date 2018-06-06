

package org.apache.commons.math.complex;


public class Complex implements java.io.Serializable {
	private static final long serialVersionUID = -6530173849413811929L;

	public static final org.apache.commons.math.complex.Complex I = new org.apache.commons.math.complex.Complex(0.0, 1.0);

	public static final org.apache.commons.math.complex.Complex NaN = new org.apache.commons.math.complex.Complex(java.lang.Double.NaN, java.lang.Double.NaN);

	public static final org.apache.commons.math.complex.Complex ONE = new org.apache.commons.math.complex.Complex(1.0, 0.0);

	public static final org.apache.commons.math.complex.Complex ZERO = new org.apache.commons.math.complex.Complex(0.0, 0.0);

	protected double imaginary;

	protected double real;

	public Complex(double real, double imaginary) {
		super();
		org.apache.commons.math.complex.Complex.this.real = real;
		org.apache.commons.math.complex.Complex.this.imaginary = imaginary;
	}

	public double abs() {
		if (isNaN()) {
			return java.lang.Double.NaN;
		}
		if (isInfinite()) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		if ((java.lang.Math.abs(real)) < (java.lang.Math.abs(imaginary))) {
			if ((imaginary) == 0.0) {
				return java.lang.Math.abs(real);
			}
			double q = (real) / (imaginary);
			return (java.lang.Math.abs(imaginary)) * (java.lang.Math.sqrt((1 + (q * q))));
		}else {
			if ((real) == 0.0) {
				return java.lang.Math.abs(imaginary);
			}
			double q = (imaginary) / (real);
			return (java.lang.Math.abs(real)) * (java.lang.Math.sqrt((1 + (q * q))));
		}
	}

	public org.apache.commons.math.complex.Complex add(org.apache.commons.math.complex.Complex rhs) {
		return new org.apache.commons.math.complex.Complex(((real) + (rhs.getReal())), ((imaginary) + (rhs.getImaginary())));
	}

	public org.apache.commons.math.complex.Complex conjugate() {
		if (isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return new org.apache.commons.math.complex.Complex(real, (-(imaginary)));
	}

	public org.apache.commons.math.complex.Complex divide(org.apache.commons.math.complex.Complex rhs) {
		if ((isNaN()) || (rhs.isNaN())) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double c = rhs.getReal();
		double d = rhs.getImaginary();
		if ((c == 0.0) && (d == 0.0)) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		if ((rhs.isInfinite()) && (!(isInfinite()))) {
			return org.apache.commons.math.complex.Complex.ZERO;
		}
		if ((java.lang.Math.abs(c)) < (java.lang.Math.abs(d))) {
			if (d == 0.0) {
				return new org.apache.commons.math.complex.Complex(((real) / c), ((imaginary) / c));
			}
			double q = c / d;
			double denominator = (c * q) + d;
			return new org.apache.commons.math.complex.Complex(((((real) * q) + (imaginary)) / denominator), ((((imaginary) * q) - (real)) / denominator));
		}else {
			if (c == 0.0) {
				return new org.apache.commons.math.complex.Complex(((imaginary) / d), ((-(real)) / c));
			}
			double q = d / c;
			double denominator = (d * q) + c;
			return new org.apache.commons.math.complex.Complex(((((imaginary) * q) + (real)) / denominator), (((imaginary) - ((real) * q)) / denominator));
		}
	}

	public boolean equals(java.lang.Object other) {
		boolean ret;
		if ((org.apache.commons.math.complex.Complex.this) == other) {
			ret = true;
		}else
			if (other == null) {
				ret = false;
			}else {
				try {
					org.apache.commons.math.complex.Complex rhs = ((org.apache.commons.math.complex.Complex) (other));
					if (rhs.isNaN()) {
						ret = org.apache.commons.math.complex.Complex.this.isNaN();
					}else {
						ret = ((java.lang.Double.doubleToRawLongBits(real)) == (java.lang.Double.doubleToRawLongBits(rhs.getReal()))) && ((java.lang.Double.doubleToRawLongBits(imaginary)) == (java.lang.Double.doubleToRawLongBits(rhs.getImaginary())));
					}
				} catch (java.lang.ClassCastException ex) {
					ret = false;
				}
			}
		
		return ret;
	}

	public int hashCode() {
		if (isNaN()) {
			return 7;
		}
		return 37 * ((17 * (org.apache.commons.math.util.MathUtils.hash(imaginary))) + (org.apache.commons.math.util.MathUtils.hash(real)));
	}

	public double getImaginary() {
		return imaginary;
	}

	public double getReal() {
		return real;
	}

	public boolean isNaN() {
		return (java.lang.Double.isNaN(real)) || (java.lang.Double.isNaN(imaginary));
	}

	public boolean isInfinite() {
		return (!(isNaN())) && ((java.lang.Double.isInfinite(real)) || (java.lang.Double.isInfinite(imaginary)));
	}

	public org.apache.commons.math.complex.Complex multiply(org.apache.commons.math.complex.Complex rhs) {
		if ((isNaN()) || (rhs.isNaN())) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return new org.apache.commons.math.complex.Complex((((real) * (rhs.real)) - ((imaginary) * (rhs.imaginary))), (((real) * (rhs.imaginary)) + ((imaginary) * (rhs.real))));
	}

	public org.apache.commons.math.complex.Complex negate() {
		if (isNaN()) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return new org.apache.commons.math.complex.Complex((-(real)), (-(imaginary)));
	}

	public org.apache.commons.math.complex.Complex subtract(org.apache.commons.math.complex.Complex rhs) {
		if ((isNaN()) || (rhs.isNaN())) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return new org.apache.commons.math.complex.Complex(((real) - (rhs.getReal())), ((imaginary) - (rhs.getImaginary())));
	}
}


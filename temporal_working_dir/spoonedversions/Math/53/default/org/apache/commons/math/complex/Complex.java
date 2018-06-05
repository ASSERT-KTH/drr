

package org.apache.commons.math.complex;


public class Complex implements java.io.Serializable , org.apache.commons.math.FieldElement<org.apache.commons.math.complex.Complex> {
	public static final org.apache.commons.math.complex.Complex I = new org.apache.commons.math.complex.Complex(0.0, 1.0);

	public static final org.apache.commons.math.complex.Complex NaN = new org.apache.commons.math.complex.Complex(java.lang.Double.NaN, java.lang.Double.NaN);

	public static final org.apache.commons.math.complex.Complex INF = new org.apache.commons.math.complex.Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);

	public static final org.apache.commons.math.complex.Complex ONE = new org.apache.commons.math.complex.Complex(1.0, 0.0);

	public static final org.apache.commons.math.complex.Complex ZERO = new org.apache.commons.math.complex.Complex(0.0, 0.0);

	private static final long serialVersionUID = -6195664516687396620L;

	private final double imaginary;

	private final double real;

	private final transient boolean isNaN;

	private final transient boolean isInfinite;

	public Complex(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
		isNaN = (java.lang.Double.isNaN(real)) || (java.lang.Double.isNaN(imaginary));
		isInfinite = (!(isNaN)) && ((java.lang.Double.isInfinite(real)) || (java.lang.Double.isInfinite(imaginary)));
	}

	public double abs() {
		if (isNaN) {
			return java.lang.Double.NaN;
		}
		if (isInfinite()) {
			return java.lang.Double.POSITIVE_INFINITY;
		}
		if ((org.apache.commons.math.util.FastMath.abs(real)) < (org.apache.commons.math.util.FastMath.abs(imaginary))) {
			if ((imaginary) == 0.0) {
				return org.apache.commons.math.util.FastMath.abs(real);
			}
			double q = (real) / (imaginary);
			return (org.apache.commons.math.util.FastMath.abs(imaginary)) * (org.apache.commons.math.util.FastMath.sqrt((1 + (q * q))));
		}else {
			if ((real) == 0.0) {
				return org.apache.commons.math.util.FastMath.abs(imaginary);
			}
			double q = (imaginary) / (real);
			return (org.apache.commons.math.util.FastMath.abs(real)) * (org.apache.commons.math.util.FastMath.sqrt((1 + (q * q))));
		}
	}

	public org.apache.commons.math.complex.Complex add(org.apache.commons.math.complex.Complex rhs) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(rhs);
		return createComplex(((real) + (rhs.getReal())), ((imaginary) + (rhs.getImaginary())));
	}

	public org.apache.commons.math.complex.Complex conjugate() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(real, (-(imaginary)));
	}

	public org.apache.commons.math.complex.Complex divide(org.apache.commons.math.complex.Complex rhs) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(rhs);
		if ((isNaN) || (rhs.isNaN)) {
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
		if ((org.apache.commons.math.util.FastMath.abs(c)) < (org.apache.commons.math.util.FastMath.abs(d))) {
			double q = c / d;
			double denominator = (c * q) + d;
			return createComplex(((((real) * q) + (imaginary)) / denominator), ((((imaginary) * q) - (real)) / denominator));
		}else {
			double q = d / c;
			double denominator = (d * q) + c;
			return createComplex(((((imaginary) * q) + (real)) / denominator), (((imaginary) - ((real) * q)) / denominator));
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math.complex.Complex.this) == other) {
			return true;
		}
		if (other instanceof org.apache.commons.math.complex.Complex) {
			org.apache.commons.math.complex.Complex rhs = ((org.apache.commons.math.complex.Complex) (other));
			if (rhs.isNaN) {
				return isNaN;
			}else {
				return ((real) == (rhs.real)) && ((imaginary) == (rhs.imaginary));
			}
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		if (isNaN) {
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
		return isNaN;
	}

	public boolean isInfinite() {
		return isInfinite;
	}

	public org.apache.commons.math.complex.Complex multiply(org.apache.commons.math.complex.Complex rhs) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(rhs);
		if ((isNaN) || (rhs.isNaN)) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		if ((((java.lang.Double.isInfinite(real)) || (java.lang.Double.isInfinite(imaginary))) || (java.lang.Double.isInfinite(rhs.real))) || (java.lang.Double.isInfinite(rhs.imaginary))) {
			return org.apache.commons.math.complex.Complex.INF;
		}
		return createComplex((((real) * (rhs.real)) - ((imaginary) * (rhs.imaginary))), (((real) * (rhs.imaginary)) + ((imaginary) * (rhs.real))));
	}

	public org.apache.commons.math.complex.Complex multiply(double rhs) {
		if ((isNaN) || (java.lang.Double.isNaN(rhs))) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		if (((java.lang.Double.isInfinite(real)) || (java.lang.Double.isInfinite(imaginary))) || (java.lang.Double.isInfinite(rhs))) {
			return org.apache.commons.math.complex.Complex.INF;
		}
		return createComplex(((real) * rhs), ((imaginary) * rhs));
	}

	public org.apache.commons.math.complex.Complex negate() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex((-(real)), (-(imaginary)));
	}

	public org.apache.commons.math.complex.Complex subtract(org.apache.commons.math.complex.Complex rhs) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(rhs);
		if ((isNaN) || (rhs.isNaN)) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(((real) - (rhs.getReal())), ((imaginary) - (rhs.getImaginary())));
	}

	public org.apache.commons.math.complex.Complex acos() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return org.apache.commons.math.complex.Complex.this.add(org.apache.commons.math.complex.Complex.this.sqrt1z().multiply(org.apache.commons.math.complex.Complex.I)).log().multiply(org.apache.commons.math.complex.Complex.I.negate());
	}

	public org.apache.commons.math.complex.Complex asin() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return sqrt1z().add(org.apache.commons.math.complex.Complex.this.multiply(org.apache.commons.math.complex.Complex.I)).log().multiply(org.apache.commons.math.complex.Complex.I.negate());
	}

	public org.apache.commons.math.complex.Complex atan() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return org.apache.commons.math.complex.Complex.this.add(org.apache.commons.math.complex.Complex.I).divide(org.apache.commons.math.complex.Complex.I.subtract(org.apache.commons.math.complex.Complex.this)).log().multiply(org.apache.commons.math.complex.Complex.I.divide(createComplex(2.0, 0.0)));
	}

	public org.apache.commons.math.complex.Complex cos() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(((org.apache.commons.math.util.FastMath.cos(real)) * (org.apache.commons.math.util.MathUtils.cosh(imaginary))), ((-(org.apache.commons.math.util.FastMath.sin(real))) * (org.apache.commons.math.util.MathUtils.sinh(imaginary))));
	}

	public org.apache.commons.math.complex.Complex cosh() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(((org.apache.commons.math.util.MathUtils.cosh(real)) * (org.apache.commons.math.util.FastMath.cos(imaginary))), ((org.apache.commons.math.util.MathUtils.sinh(real)) * (org.apache.commons.math.util.FastMath.sin(imaginary))));
	}

	public org.apache.commons.math.complex.Complex exp() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double expReal = org.apache.commons.math.util.FastMath.exp(real);
		return createComplex((expReal * (org.apache.commons.math.util.FastMath.cos(imaginary))), (expReal * (org.apache.commons.math.util.FastMath.sin(imaginary))));
	}

	public org.apache.commons.math.complex.Complex log() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(org.apache.commons.math.util.FastMath.log(abs()), org.apache.commons.math.util.FastMath.atan2(imaginary, real));
	}

	public org.apache.commons.math.complex.Complex pow(org.apache.commons.math.complex.Complex x) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x);
		return org.apache.commons.math.complex.Complex.this.log().multiply(x).exp();
	}

	public org.apache.commons.math.complex.Complex sin() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(((org.apache.commons.math.util.FastMath.sin(real)) * (org.apache.commons.math.util.MathUtils.cosh(imaginary))), ((org.apache.commons.math.util.FastMath.cos(real)) * (org.apache.commons.math.util.MathUtils.sinh(imaginary))));
	}

	public org.apache.commons.math.complex.Complex sinh() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		return createComplex(((org.apache.commons.math.util.MathUtils.sinh(real)) * (org.apache.commons.math.util.FastMath.cos(imaginary))), ((org.apache.commons.math.util.MathUtils.cosh(real)) * (org.apache.commons.math.util.FastMath.sin(imaginary))));
	}

	public org.apache.commons.math.complex.Complex sqrt() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		if (((real) == 0.0) && ((imaginary) == 0.0)) {
			return createComplex(0.0, 0.0);
		}
		double t = org.apache.commons.math.util.FastMath.sqrt((((org.apache.commons.math.util.FastMath.abs(real)) + (abs())) / 2.0));
		if ((real) >= 0.0) {
			return createComplex(t, ((imaginary) / (2.0 * t)));
		}else {
			return createComplex(((org.apache.commons.math.util.FastMath.abs(imaginary)) / (2.0 * t)), ((org.apache.commons.math.util.MathUtils.indicator(imaginary)) * t));
		}
	}

	public org.apache.commons.math.complex.Complex sqrt1z() {
		return createComplex(1.0, 0.0).subtract(org.apache.commons.math.complex.Complex.this.multiply(org.apache.commons.math.complex.Complex.this)).sqrt();
	}

	public org.apache.commons.math.complex.Complex tan() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double real2 = 2.0 * (real);
		double imaginary2 = 2.0 * (imaginary);
		double d = (org.apache.commons.math.util.FastMath.cos(real2)) + (org.apache.commons.math.util.MathUtils.cosh(imaginary2));
		return createComplex(((org.apache.commons.math.util.FastMath.sin(real2)) / d), ((org.apache.commons.math.util.MathUtils.sinh(imaginary2)) / d));
	}

	public org.apache.commons.math.complex.Complex tanh() {
		if (isNaN) {
			return org.apache.commons.math.complex.Complex.NaN;
		}
		double real2 = 2.0 * (real);
		double imaginary2 = 2.0 * (imaginary);
		double d = (org.apache.commons.math.util.MathUtils.cosh(real2)) + (org.apache.commons.math.util.FastMath.cos(imaginary2));
		return createComplex(((org.apache.commons.math.util.MathUtils.sinh(real2)) / d), ((org.apache.commons.math.util.FastMath.sin(imaginary2)) / d));
	}

	public double getArgument() {
		return org.apache.commons.math.util.FastMath.atan2(getImaginary(), getReal());
	}

	public java.util.List<org.apache.commons.math.complex.Complex> nthRoot(int n) throws java.lang.IllegalArgumentException {
		if (n <= 0) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N, n);
		}
		java.util.List<org.apache.commons.math.complex.Complex> result = new java.util.ArrayList<org.apache.commons.math.complex.Complex>();
		if (isNaN) {
			result.add(org.apache.commons.math.complex.Complex.NaN);
			return result;
		}
		if (isInfinite()) {
			result.add(org.apache.commons.math.complex.Complex.INF);
			return result;
		}
		final double nthRootOfAbs = org.apache.commons.math.util.FastMath.pow(abs(), (1.0 / n));
		final double nthPhi = (getArgument()) / n;
		final double slice = (2 * (org.apache.commons.math.util.FastMath.PI)) / n;
		double innerPart = nthPhi;
		for (int k = 0; k < n; k++) {
			final double realPart = nthRootOfAbs * (org.apache.commons.math.util.FastMath.cos(innerPart));
			final double imaginaryPart = nthRootOfAbs * (org.apache.commons.math.util.FastMath.sin(innerPart));
			result.add(createComplex(realPart, imaginaryPart));
			innerPart += slice;
		}
		return result;
	}

	protected org.apache.commons.math.complex.Complex createComplex(double realPart, double imaginaryPart) {
		return new org.apache.commons.math.complex.Complex(realPart, imaginaryPart);
	}

	protected final java.lang.Object readResolve() {
		return createComplex(real, imaginary);
	}

	public org.apache.commons.math.complex.ComplexField getField() {
		return org.apache.commons.math.complex.ComplexField.getInstance();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return ((("(" + (real)) + ", ") + (imaginary)) + ")";
	}
}


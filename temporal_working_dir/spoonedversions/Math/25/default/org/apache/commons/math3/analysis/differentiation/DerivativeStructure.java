

package org.apache.commons.math3.analysis.differentiation;


public class DerivativeStructure implements java.io.Serializable , org.apache.commons.math3.FieldElement<org.apache.commons.math3.analysis.differentiation.DerivativeStructure> {
	private static final long serialVersionUID = 20120730L;

	private transient org.apache.commons.math3.analysis.differentiation.DSCompiler compiler;

	private final double[] data;

	private DerivativeStructure(final org.apache.commons.math3.analysis.differentiation.DSCompiler compiler) {
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this.compiler = compiler;
		this.data = new double[compiler.getSize()];
	}

	public DerivativeStructure(final int variables, final int order) {
		this(org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(variables, order));
	}

	public DerivativeStructure(final int variables, final int order, final double value) {
		this(variables, order);
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this.data[0] = value;
	}

	public DerivativeStructure(final int variables, final int order, final int index, final double value) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
		this(variables, order, value);
		if (index >= variables) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(index, variables, false);
		}
		if (order > 0) {
			data[org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(index, order).getSize()] = 1.0;
		}
	}

	public DerivativeStructure(final double a1, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds1, final double a2, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds2) throws org.apache.commons.math3.exception.DimensionMismatchException {
		this(ds1.compiler);
		compiler.checkCompatibility(ds2.compiler);
		compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0, data, 0);
	}

	public DerivativeStructure(final double a1, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds1, final double a2, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds2, final double a3, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds3) throws org.apache.commons.math3.exception.DimensionMismatchException {
		this(ds1.compiler);
		compiler.checkCompatibility(ds2.compiler);
		compiler.checkCompatibility(ds3.compiler);
		compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0, a3, ds3.data, 0, data, 0);
	}

	public DerivativeStructure(final double a1, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds1, final double a2, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds2, final double a3, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds3, final double a4, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds4) throws org.apache.commons.math3.exception.DimensionMismatchException {
		this(ds1.compiler);
		compiler.checkCompatibility(ds2.compiler);
		compiler.checkCompatibility(ds3.compiler);
		compiler.checkCompatibility(ds4.compiler);
		compiler.linearCombination(a1, ds1.data, 0, a2, ds2.data, 0, a3, ds3.data, 0, a4, ds4.data, 0, data, 0);
	}

	private DerivativeStructure(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds) {
		org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this.compiler = ds.compiler;
		this.data = ds.data.clone();
	}

	public int getFreeParameters() {
		return compiler.getFreeParameters();
	}

	public int getOrder() {
		return compiler.getOrder();
	}

	public double getValue() {
		return data[0];
	}

	public double getPartialDerivative(final int... orders) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		return data[compiler.getPartialDerivativeIndex(orders)];
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure add(final double a) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		ds.data[0] += a;
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure add(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure a) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(a.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		compiler.add(data, 0, a.data, 0, ds.data, 0);
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure subtract(final double a) {
		return add((-a));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure subtract(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure a) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(a.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		compiler.subtract(data, 0, a.data, 0, ds.data, 0);
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure multiply(final int n) {
		return multiply(((double) (n)));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure multiply(final double a) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] *= a;
		}
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure multiply(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure a) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(a.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.multiply(data, 0, a.data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure divide(final double a) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] /= a;
		}
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure divide(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure a) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(a.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.divide(data, 0, a.data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure remainder(final double a) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this);
		ds.data[0] = (ds.data[0]) % a;
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure remainder(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure a) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(a.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.remainder(data, 0, a.data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure negate() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] = -(data[i]);
		}
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure abs() {
		if ((java.lang.Double.doubleToLongBits(data[0])) < 0) {
			return negate();
		}else {
			return org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this;
		}
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure ceil() {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), org.apache.commons.math3.util.FastMath.ceil(data[0]));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure floor() {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), org.apache.commons.math3.util.FastMath.floor(data[0]));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure rint() {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), org.apache.commons.math3.util.FastMath.rint(data[0]));
	}

	public long round() {
		return org.apache.commons.math3.util.FastMath.round(data[0]);
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure signum() {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), org.apache.commons.math3.util.FastMath.signum(data[0]));
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure copySign(final double sign) {
		long m = java.lang.Double.doubleToLongBits(data[0]);
		long s = java.lang.Double.doubleToLongBits(sign);
		if (((m >= 0) && (s >= 0)) || ((m < 0) && (s < 0))) {
			return org.apache.commons.math3.analysis.differentiation.DerivativeStructure.this;
		}
		return negate();
	}

	public int getExponent() {
		return org.apache.commons.math3.util.FastMath.getExponent(data[0]);
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure scalb(final int n) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] = org.apache.commons.math3.util.FastMath.scalb(data[i], n);
		}
		return ds;
	}

	public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure hypot(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure x, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure y) throws org.apache.commons.math3.exception.DimensionMismatchException {
		x.compiler.checkCompatibility(y.compiler);
		if ((java.lang.Double.isInfinite(x.data[0])) || (java.lang.Double.isInfinite(y.data[0]))) {
			return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(x.compiler.getFreeParameters(), x.compiler.getFreeParameters(), java.lang.Double.POSITIVE_INFINITY);
		}else
			if ((java.lang.Double.isNaN(x.data[0])) || (java.lang.Double.isNaN(y.data[0]))) {
				return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(x.compiler.getFreeParameters(), x.compiler.getFreeParameters(), java.lang.Double.NaN);
			}else {
				final int expX = x.getExponent();
				final int expY = y.getExponent();
				if (expX > (expY + 27)) {
					return x.abs();
				}else
					if (expY > (expX + 27)) {
						return y.abs();
					}else {
						final int middleExp = (expX + expY) / 2;
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure scaledX = x.scalb((-middleExp));
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure scaledY = y.scalb((-middleExp));
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure scaledH = scaledX.multiply(scaledX).add(scaledY.multiply(scaledY)).sqrt();
						return scaledH.scalb(middleExp);
					}
				
			}
		
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure reciprocal() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.pow(data, 0, (-1), result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure sqrt() {
		return rootN(2);
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure cbrt() {
		return rootN(3);
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure rootN(final int n) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.rootN(data, 0, n, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.Field<org.apache.commons.math3.analysis.differentiation.DerivativeStructure> getField() {
		return new org.apache.commons.math3.Field<org.apache.commons.math3.analysis.differentiation.DerivativeStructure>() {
			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure getZero() {
				return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), 0.0);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure getOne() {
				return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler.getFreeParameters(), compiler.getOrder(), 1.0);
			}

			public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.analysis.differentiation.DerivativeStructure>> getRuntimeClass() {
				return org.apache.commons.math3.analysis.differentiation.DerivativeStructure.class;
			}
		};
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure pow(final double p) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.pow(data, 0, p, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure pow(final int n) {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.pow(data, 0, n, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure pow(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure e) throws org.apache.commons.math3.exception.DimensionMismatchException {
		compiler.checkCompatibility(e.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.pow(data, 0, e.data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure exp() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.exp(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure expm1() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.expm1(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure log() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.log(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure log1p() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.log1p(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure cos() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.cos(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure sin() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.sin(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure tan() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.tan(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure acos() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.acos(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure asin() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.asin(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure atan() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.atan(data, 0, result.data, 0);
		return result;
	}

	public static org.apache.commons.math3.analysis.differentiation.DerivativeStructure atan2(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure y, final org.apache.commons.math3.analysis.differentiation.DerivativeStructure x) throws org.apache.commons.math3.exception.DimensionMismatchException {
		y.compiler.checkCompatibility(x.compiler);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(y.compiler);
		y.compiler.atan2(y.data, 0, x.data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure cosh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.cosh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure sinh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.sinh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure tanh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.tanh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure acosh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.acosh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure asinh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.asinh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure atanh() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure result = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		compiler.atanh(data, 0, result.data, 0);
		return result;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure toDegrees() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] = org.apache.commons.math3.util.FastMath.toDegrees(data[i]);
		}
		return ds;
	}

	public org.apache.commons.math3.analysis.differentiation.DerivativeStructure toRadians() {
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(compiler);
		for (int i = 0; i < (ds.data.length); ++i) {
			ds.data[i] = org.apache.commons.math3.util.FastMath.toRadians(data[i]);
		}
		return ds;
	}

	public double taylor(final double... delta) {
		return compiler.taylor(data, 0, delta);
	}

	private java.lang.Object writeReplace() {
		return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject(compiler.getFreeParameters(), compiler.getOrder(), data);
	}

	private static class DataTransferObject implements java.io.Serializable {
		private static final long serialVersionUID = 20120730L;

		private final int variables;

		private final int order;

		private final double[] data;

		public DataTransferObject(final int variables, final int order, final double[] data) {
			this.variables = variables;
			this.order = order;
			this.data = data;
		}

		private java.lang.Object readResolve() {
			final org.apache.commons.math3.analysis.differentiation.DerivativeStructure ds = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(variables, order);
			java.lang.System.arraycopy(data, 0, ds.data, 0, ds.data.length);
			return ds;
		}
	}
}


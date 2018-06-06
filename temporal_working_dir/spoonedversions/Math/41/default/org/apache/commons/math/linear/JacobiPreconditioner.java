

package org.apache.commons.math.linear;


public class JacobiPreconditioner extends org.apache.commons.math.linear.InvertibleRealLinearOperator {
	private final org.apache.commons.math.linear.ArrayRealVector diag;

	public JacobiPreconditioner(final double[] diag, final boolean deep) {
		this.diag = new org.apache.commons.math.linear.ArrayRealVector(diag, deep);
	}

	public static org.apache.commons.math.linear.JacobiPreconditioner create(final org.apache.commons.math.linear.RealLinearOperator a) throws org.apache.commons.math.linear.NonSquareOperatorException {
		final int n = a.getColumnDimension();
		if ((a.getRowDimension()) != n) {
			throw new org.apache.commons.math.linear.NonSquareOperatorException(a.getRowDimension(), n);
		}
		final double[] diag = new double[n];
		if (a instanceof org.apache.commons.math.linear.AbstractRealMatrix) {
			final org.apache.commons.math.linear.AbstractRealMatrix m = ((org.apache.commons.math.linear.AbstractRealMatrix) (a));
			for (int i = 0; i < n; i++) {
				diag[i] = m.getEntry(i, i);
			}
		}else {
			final org.apache.commons.math.linear.ArrayRealVector x = new org.apache.commons.math.linear.ArrayRealVector(n);
			for (int i = 0; i < n; i++) {
				x.set(0.0);
				x.setEntry(i, 1.0);
				diag[i] = a.operate(x).getEntry(i);
			}
		}
		return new org.apache.commons.math.linear.JacobiPreconditioner(diag, false);
	}

	@java.lang.Override
	public int getColumnDimension() {
		return diag.getDimension();
	}

	@java.lang.Override
	public int getRowDimension() {
		return diag.getDimension();
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector operate(final org.apache.commons.math.linear.RealVector x) {
		return x.ebeMultiply(diag);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealVector b) {
		return b.ebeDivide(diag);
	}
}


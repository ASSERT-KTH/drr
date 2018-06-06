

package org.apache.commons.math3.linear;


public class JacobiPreconditioner extends org.apache.commons.math3.linear.RealLinearOperator {
	private final org.apache.commons.math3.linear.ArrayRealVector diag;

	public JacobiPreconditioner(final double[] diag, final boolean deep) {
		this.diag = new org.apache.commons.math3.linear.ArrayRealVector(diag, deep);
	}

	public static org.apache.commons.math3.linear.JacobiPreconditioner create(final org.apache.commons.math3.linear.RealLinearOperator a) throws org.apache.commons.math3.linear.NonSquareOperatorException {
		final int n = a.getColumnDimension();
		if ((a.getRowDimension()) != n) {
			throw new org.apache.commons.math3.linear.NonSquareOperatorException(a.getRowDimension(), n);
		}
		final double[] diag = new double[n];
		if (a instanceof org.apache.commons.math3.linear.AbstractRealMatrix) {
			final org.apache.commons.math3.linear.AbstractRealMatrix m = ((org.apache.commons.math3.linear.AbstractRealMatrix) (a));
			for (int i = 0; i < n; i++) {
				diag[i] = m.getEntry(i, i);
			}
		}else {
			final org.apache.commons.math3.linear.ArrayRealVector x = new org.apache.commons.math3.linear.ArrayRealVector(n);
			for (int i = 0; i < n; i++) {
				x.set(0.0);
				x.setEntry(i, 1.0);
				diag[i] = a.operate(x).getEntry(i);
			}
		}
		return new org.apache.commons.math3.linear.JacobiPreconditioner(diag, false);
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
	public org.apache.commons.math3.linear.RealVector operate(final org.apache.commons.math3.linear.RealVector x) {
		return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.util.MathArrays.ebeDivide(x.toArray(), diag.toArray()), false);
	}

	public org.apache.commons.math3.linear.RealLinearOperator sqrt() {
		final org.apache.commons.math3.linear.RealVector sqrtDiag = diag.map(new org.apache.commons.math3.analysis.function.Sqrt());
		return new org.apache.commons.math3.linear.RealLinearOperator() {
			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector operate(final org.apache.commons.math3.linear.RealVector x) {
				return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.util.MathArrays.ebeDivide(x.toArray(), sqrtDiag.toArray()), false);
			}

			@java.lang.Override
			public int getRowDimension() {
				return sqrtDiag.getDimension();
			}

			@java.lang.Override
			public int getColumnDimension() {
				return sqrtDiag.getDimension();
			}
		};
	}
}


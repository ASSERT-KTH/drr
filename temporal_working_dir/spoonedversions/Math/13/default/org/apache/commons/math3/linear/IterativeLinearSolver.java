

package org.apache.commons.math3.linear;


public abstract class IterativeLinearSolver {
	private final org.apache.commons.math3.util.IterationManager manager;

	public IterativeLinearSolver(final int maxIterations) {
		this.manager = new org.apache.commons.math3.util.IterationManager(maxIterations);
	}

	public IterativeLinearSolver(final org.apache.commons.math3.util.IterationManager manager) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(manager);
		this.manager = manager;
	}

	protected static void checkParameters(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x0) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		org.apache.commons.math3.util.MathUtils.checkNotNull(b);
		org.apache.commons.math3.util.MathUtils.checkNotNull(x0);
		if ((a.getRowDimension()) != (a.getColumnDimension())) {
			throw new org.apache.commons.math3.linear.NonSquareOperatorException(a.getRowDimension(), a.getColumnDimension());
		}
		if ((b.getDimension()) != (a.getRowDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(b.getDimension(), a.getRowDimension());
		}
		if ((x0.getDimension()) != (a.getColumnDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(x0.getDimension(), a.getColumnDimension());
		}
	}

	public org.apache.commons.math3.util.IterationManager getIterationManager() {
		return manager;
	}

	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math3.linear.RealVector x = new org.apache.commons.math3.linear.ArrayRealVector(a.getColumnDimension());
		x.set(0.0);
		return solveInPlace(a, b, x);
	}

	public org.apache.commons.math3.linear.RealVector solve(org.apache.commons.math3.linear.RealLinearOperator a, org.apache.commons.math3.linear.RealVector b, org.apache.commons.math3.linear.RealVector x0) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(x0);
		return solveInPlace(a, b, x0.copy());
	}

	public abstract org.apache.commons.math3.linear.RealVector solveInPlace(org.apache.commons.math3.linear.RealLinearOperator a, org.apache.commons.math3.linear.RealVector b, org.apache.commons.math3.linear.RealVector x0) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.NonSquareOperatorException;
}




package org.apache.commons.math.linear;


public abstract class IterativeLinearSolver {
	private final org.apache.commons.math.util.IterationManager manager;

	public IterativeLinearSolver(final int maxIterations) {
		this.manager = new org.apache.commons.math.util.IterationManager(maxIterations);
	}

	public IterativeLinearSolver(final org.apache.commons.math.util.IterationManager manager) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(manager);
		this.manager = manager;
	}

	protected static void checkParameters(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		org.apache.commons.math.util.MathUtils.checkNotNull(b);
		org.apache.commons.math.util.MathUtils.checkNotNull(x0);
		if ((a.getRowDimension()) != (a.getColumnDimension())) {
			throw new org.apache.commons.math.linear.NonSquareOperatorException(a.getRowDimension(), a.getColumnDimension());
		}
		if ((b.getDimension()) != (a.getRowDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(b.getDimension(), a.getRowDimension());
		}
		if ((x0.getDimension()) != (a.getColumnDimension())) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(x0.getDimension(), a.getColumnDimension());
		}
	}

	public org.apache.commons.math.util.IterationManager getIterationManager() {
		return manager;
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealLinearOperator a, org.apache.commons.math.linear.RealVector b) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		x.set(0.0);
		return solveInPlace(a, b, x);
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealLinearOperator a, org.apache.commons.math.linear.RealVector b, org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x0);
		return solveInPlace(a, b, x0.copy());
	}

	public abstract org.apache.commons.math.linear.RealVector solveInPlace(org.apache.commons.math.linear.RealLinearOperator a, org.apache.commons.math.linear.RealVector b, org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException;
}


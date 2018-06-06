

package org.apache.commons.math.linear;


public abstract class PreconditionedIterativeLinearSolver extends org.apache.commons.math.linear.IterativeLinearSolver {
	public PreconditionedIterativeLinearSolver(final int maxIterations) {
		super(maxIterations);
	}

	public PreconditionedIterativeLinearSolver(final org.apache.commons.math.util.IterationManager manager) throws org.apache.commons.math.exception.NullArgumentException {
		super(manager);
	}

	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealLinearOperator minv, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x0);
		return solveInPlace(a, minv, b, x0.copy());
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		x.set(0.0);
		return solveInPlace(a, null, b, x);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x0);
		return solveInPlace(a, null, b, x0.copy());
	}

	protected static void checkParameters(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealLinearOperator minv, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.linear.IterativeLinearSolver.checkParameters(a, b, x0);
		if (minv != null) {
			if ((minv.getColumnDimension()) != (minv.getRowDimension())) {
				throw new org.apache.commons.math.linear.NonSquareOperatorException(minv.getColumnDimension(), minv.getRowDimension());
			}
			if ((minv.getRowDimension()) != (a.getRowDimension())) {
				throw new org.apache.commons.math.exception.DimensionMismatchException(minv.getRowDimension(), a.getRowDimension());
			}
		}
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealLinearOperator a, org.apache.commons.math.linear.RealLinearOperator minv, org.apache.commons.math.linear.RealVector b) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, minv, b, x);
	}

	public abstract org.apache.commons.math.linear.RealVector solveInPlace(org.apache.commons.math.linear.RealLinearOperator a, org.apache.commons.math.linear.RealLinearOperator minv, org.apache.commons.math.linear.RealVector b, org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException;

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		return solveInPlace(a, null, b, x0);
	}
}


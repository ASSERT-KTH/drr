

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;


public class GaussNewtonOptimizer extends org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer {
	private final boolean useLU;

	public GaussNewtonOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker) {
		this(true, checker);
	}

	public GaussNewtonOptimizer(final boolean useLU, org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker) {
		super(checker);
		this.useLU = useLU;
	}

	@java.lang.Override
	public org.apache.commons.math3.optim.PointVectorValuePair doOptimize() {
		final org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker = getConvergenceChecker();
		if (checker == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		final double[] targetValues = getTarget();
		final int nR = targetValues.length;
		final org.apache.commons.math3.linear.RealMatrix weightMatrix = getWeight();
		final double[] residualsWeights = new double[nR];
		for (int i = 0; i < nR; i++) {
			residualsWeights[i] = weightMatrix.getEntry(i, i);
		}
		final double[] currentPoint = getStartPoint();
		final int nC = currentPoint.length;
		org.apache.commons.math3.optim.PointVectorValuePair current = null;
		int iter = 0;
		for (boolean converged = false; !converged;) {
			++iter;
			org.apache.commons.math3.optim.PointVectorValuePair previous = current;
			final double[] currentObjective = computeObjectiveValue(currentPoint);
			final double[] currentResiduals = computeResiduals(currentObjective);
			final org.apache.commons.math3.linear.RealMatrix weightedJacobian = computeWeightedJacobian(currentPoint);
			current = new org.apache.commons.math3.optim.PointVectorValuePair(currentPoint, currentObjective);
			final double[] b = new double[nC];
			final double[][] a = new double[nC][nC];
			for (int i = 0; i < nR; ++i) {
				final double[] grad = weightedJacobian.getRow(i);
				final double weight = residualsWeights[i];
				final double residual = currentResiduals[i];
				final double wr = weight * residual;
				for (int j = 0; j < nC; ++j) {
					b[j] += wr * (grad[j]);
				}
				for (int k = 0; k < nC; ++k) {
					double[] ak = a[k];
					double wgk = weight * (grad[k]);
					for (int l = 0; l < nC; ++l) {
						ak[l] += wgk * (grad[l]);
					}
				}
			}
			try {
				org.apache.commons.math3.linear.RealMatrix mA = new org.apache.commons.math3.linear.BlockRealMatrix(a);
				org.apache.commons.math3.linear.DecompositionSolver solver = useLU ? new org.apache.commons.math3.linear.LUDecomposition(mA).getSolver() : new org.apache.commons.math3.linear.QRDecomposition(mA).getSolver();
				final double[] dX = solver.solve(new org.apache.commons.math3.linear.ArrayRealVector(b, false)).toArray();
				for (int i = 0; i < nC; ++i) {
					currentPoint[i] += dX[i];
				}
			} catch (org.apache.commons.math3.linear.SingularMatrixException e) {
				throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM);
			}
			if (previous != null) {
				converged = checker.converged(iter, previous, current);
				if (converged) {
					setCost(computeCost(currentResiduals));
					return current;
				}
			}
		}
		throw new org.apache.commons.math3.exception.MathInternalError();
	}
}


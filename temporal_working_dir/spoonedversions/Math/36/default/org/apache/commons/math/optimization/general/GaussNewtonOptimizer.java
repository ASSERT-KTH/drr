

package org.apache.commons.math.optimization.general;


public class GaussNewtonOptimizer extends org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer {
	private final boolean useLU;

	public GaussNewtonOptimizer() {
		this(true);
	}

	public GaussNewtonOptimizer(org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> checker) {
		this(true, checker);
	}

	public GaussNewtonOptimizer(final boolean useLU) {
		this(useLU, new org.apache.commons.math.optimization.SimpleVectorValueChecker());
	}

	public GaussNewtonOptimizer(final boolean useLU, org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> checker) {
		super(checker);
		this.useLU = useLU;
	}

	@java.lang.Override
	public org.apache.commons.math.optimization.PointVectorValuePair doOptimize() {
		final org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.PointVectorValuePair> checker = getConvergenceChecker();
		org.apache.commons.math.optimization.PointVectorValuePair current = null;
		int iter = 0;
		for (boolean converged = false; !converged;) {
			++iter;
			org.apache.commons.math.optimization.PointVectorValuePair previous = current;
			updateResidualsAndCost();
			updateJacobian();
			current = new org.apache.commons.math.optimization.PointVectorValuePair(point, objective);
			final double[] targetValues = getTargetRef();
			final double[] residualsWeights = getWeightRef();
			final double[] b = new double[cols];
			final double[][] a = new double[cols][cols];
			for (int i = 0; i < (rows); ++i) {
				final double[] grad = weightedResidualJacobian[i];
				final double weight = residualsWeights[i];
				final double residual = (objective[i]) - (targetValues[i]);
				final double wr = weight * residual;
				for (int j = 0; j < (cols); ++j) {
					b[j] += wr * (grad[j]);
				}
				for (int k = 0; k < (cols); ++k) {
					double[] ak = a[k];
					double wgk = weight * (grad[k]);
					for (int l = 0; l < (cols); ++l) {
						ak[l] += wgk * (grad[l]);
					}
				}
			}
			try {
				org.apache.commons.math.linear.RealMatrix mA = new org.apache.commons.math.linear.BlockRealMatrix(a);
				org.apache.commons.math.linear.DecompositionSolver solver = useLU ? new org.apache.commons.math.linear.LUDecomposition(mA).getSolver() : new org.apache.commons.math.linear.QRDecomposition(mA).getSolver();
				final double[] dX = solver.solve(new org.apache.commons.math.linear.ArrayRealVector(b, false)).toArray();
				for (int i = 0; i < (cols); ++i) {
					point[i] += dX[i];
				}
			} catch (org.apache.commons.math.linear.SingularMatrixException e) {
				throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM);
			}
			if (checker != null) {
				if (previous != null) {
					converged = checker.converged(iter, previous, current);
				}
			}
		}
		return current;
	}
}


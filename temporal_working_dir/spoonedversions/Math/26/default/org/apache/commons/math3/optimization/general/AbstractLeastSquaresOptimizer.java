

package org.apache.commons.math3.optimization.general;


public abstract class AbstractLeastSquaresOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer<org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction> implements org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer {
	private static final double DEFAULT_SINGULARITY_THRESHOLD = 1.0E-14;

	protected double[][] weightedResidualJacobian;

	protected int cols;

	protected int rows;

	protected double[] point;

	protected double[] objective;

	protected double[] weightedResiduals;

	protected double cost;

	private org.apache.commons.math3.analysis.MultivariateMatrixFunction jF;

	private int jacobianEvaluations;

	@java.lang.Deprecated
	protected AbstractLeastSquaresOptimizer() {
	}

	protected AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> checker) {
		super(checker);
	}

	public int getJacobianEvaluations() {
		return jacobianEvaluations;
	}

	protected void updateJacobian() {
		++(jacobianEvaluations);
		weightedResidualJacobian = jF.value(point);
		if ((weightedResidualJacobian.length) != (rows)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(weightedResidualJacobian.length, rows);
		}
		final double[] residualsWeights = getWeightRef();
		for (int i = 0; i < (rows); i++) {
			final double[] ji = weightedResidualJacobian[i];
			double wi = org.apache.commons.math3.util.FastMath.sqrt(residualsWeights[i]);
			for (int j = 0; j < (cols); ++j) {
				weightedResidualJacobian[i][j] = (-(ji[j])) * wi;
			}
		}
	}

	protected void updateResidualsAndCost() {
		objective = computeObjectiveValue(point);
		if ((objective.length) != (rows)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(objective.length, rows);
		}
		final double[] targetValues = getTargetRef();
		final double[] residualsWeights = getWeightRef();
		cost = 0;
		for (int i = 0; i < (rows); i++) {
			final double residual = (targetValues[i]) - (objective[i]);
			weightedResiduals[i] = residual * (org.apache.commons.math3.util.FastMath.sqrt(residualsWeights[i]));
			cost += ((residualsWeights[i]) * residual) * residual;
		}
		cost = org.apache.commons.math3.util.FastMath.sqrt(cost);
	}

	public double getRMS() {
		return org.apache.commons.math3.util.FastMath.sqrt(((getChiSquare()) / (rows)));
	}

	public double getChiSquare() {
		return (cost) * (cost);
	}

	public double[][] getCovariances() {
		return getCovariances(org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.DEFAULT_SINGULARITY_THRESHOLD);
	}

	public double[][] getCovariances(double threshold) {
		updateJacobian();
		double[][] jTj = new double[cols][cols];
		for (int i = 0; i < (cols); ++i) {
			for (int j = i; j < (cols); ++j) {
				double sum = 0;
				for (int k = 0; k < (rows); ++k) {
					sum += (weightedResidualJacobian[k][i]) * (weightedResidualJacobian[k][j]);
				}
				jTj[i][j] = sum;
				jTj[j][i] = sum;
			}
		}
		final org.apache.commons.math3.linear.DecompositionSolver solver = new org.apache.commons.math3.linear.QRDecomposition(org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(jTj), threshold).getSolver();
		return solver.getInverse().getData();
	}

	public double[] guessParametersErrors() {
		if ((rows) <= (cols)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM, rows, cols, false);
		}
		double[] errors = new double[cols];
		final double c = org.apache.commons.math3.util.FastMath.sqrt(((getChiSquare()) / ((rows) - (cols))));
		double[][] covar = getCovariances();
		for (int i = 0; i < (errors.length); ++i) {
			errors[i] = (org.apache.commons.math3.util.FastMath.sqrt(covar[i][i])) * c;
		}
		return errors;
	}

	public double[] getSigma() {
		final double[] sig = new double[cols];
		final double[][] cov = getCovariances();
		for (int i = 0; i < (sig.length); ++i) {
			sig[i] = org.apache.commons.math3.util.FastMath.sqrt(cov[i][i]);
		}
		return sig;
	}

	@java.lang.Override
	public org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, final org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction f, final double[] target, final double[] weights, final double[] startPoint) {
		jacobianEvaluations = 0;
		jF = f.jacobian();
		point = startPoint.clone();
		rows = target.length;
		cols = point.length;
		weightedResidualJacobian = new double[rows][cols];
		org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.this.weightedResiduals = new double[rows];
		cost = java.lang.Double.POSITIVE_INFINITY;
		return super.optimize(maxEval, f, target, weights, startPoint);
	}
}


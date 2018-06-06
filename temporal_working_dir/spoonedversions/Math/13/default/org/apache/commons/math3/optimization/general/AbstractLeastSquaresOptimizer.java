

package org.apache.commons.math3.optimization.general;


@java.lang.Deprecated
public abstract class AbstractLeastSquaresOptimizer extends org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer<org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction> implements org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer {
	@java.lang.Deprecated
	private static final double DEFAULT_SINGULARITY_THRESHOLD = 1.0E-14;

	@java.lang.Deprecated
	protected double[][] weightedResidualJacobian;

	@java.lang.Deprecated
	protected int cols;

	@java.lang.Deprecated
	protected int rows;

	@java.lang.Deprecated
	protected double[] point;

	@java.lang.Deprecated
	protected double[] objective;

	@java.lang.Deprecated
	protected double[] weightedResiduals;

	@java.lang.Deprecated
	protected double cost;

	private org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction jF;

	private int jacobianEvaluations;

	private org.apache.commons.math3.linear.RealMatrix weightMatrixSqrt;

	@java.lang.Deprecated
	protected AbstractLeastSquaresOptimizer() {
	}

	protected AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> checker) {
		super(checker);
	}

	public int getJacobianEvaluations() {
		return jacobianEvaluations;
	}

	@java.lang.Deprecated
	protected void updateJacobian() {
		final org.apache.commons.math3.linear.RealMatrix weightedJacobian = computeWeightedJacobian(point);
		weightedResidualJacobian = weightedJacobian.scalarMultiply((-1)).getData();
	}

	protected org.apache.commons.math3.linear.RealMatrix computeWeightedJacobian(double[] params) {
		++(jacobianEvaluations);
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsPoint = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[params.length];
		final int nC = params.length;
		for (int i = 0; i < nC; ++i) {
			dsPoint[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(nC, 1, i, params[i]);
		}
		final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsValue = jF.value(dsPoint);
		final int nR = getTarget().length;
		if ((dsValue.length) != nR) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(dsValue.length, nR);
		}
		final double[][] jacobianData = new double[nR][nC];
		for (int i = 0; i < nR; ++i) {
			int[] orders = new int[nC];
			for (int j = 0; j < nC; ++j) {
				orders[j] = 1;
				jacobianData[i][j] = dsValue[i].getPartialDerivative(orders);
				orders[j] = 0;
			}
		}
		return weightMatrixSqrt.multiply(org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(jacobianData));
	}

	@java.lang.Deprecated
	protected void updateResidualsAndCost() {
		objective = computeObjectiveValue(point);
		final double[] res = computeResiduals(objective);
		cost = computeCost(res);
		final org.apache.commons.math3.linear.ArrayRealVector residuals = new org.apache.commons.math3.linear.ArrayRealVector(res);
		weightedResiduals = weightMatrixSqrt.operate(residuals).toArray();
	}

	protected double computeCost(double[] residuals) {
		final org.apache.commons.math3.linear.ArrayRealVector r = new org.apache.commons.math3.linear.ArrayRealVector(residuals);
		return org.apache.commons.math3.util.FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
	}

	public double getRMS() {
		return org.apache.commons.math3.util.FastMath.sqrt(((getChiSquare()) / (rows)));
	}

	public double getChiSquare() {
		return (cost) * (cost);
	}

	public org.apache.commons.math3.linear.RealMatrix getWeightSquareRoot() {
		return weightMatrixSqrt.copy();
	}

	protected void setCost(double cost) {
		org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.this.cost = cost;
	}

	@java.lang.Deprecated
	public double[][] getCovariances() {
		return getCovariances(org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.DEFAULT_SINGULARITY_THRESHOLD);
	}

	@java.lang.Deprecated
	public double[][] getCovariances(double threshold) {
		return computeCovariances(point, threshold);
	}

	public double[][] computeCovariances(double[] params, double threshold) {
		final org.apache.commons.math3.linear.RealMatrix j = computeWeightedJacobian(params);
		final org.apache.commons.math3.linear.RealMatrix jTj = j.transpose().multiply(j);
		final org.apache.commons.math3.linear.DecompositionSolver solver = new org.apache.commons.math3.linear.QRDecomposition(jTj, threshold).getSolver();
		return solver.getInverse().getData();
	}

	@java.lang.Deprecated
	public double[] guessParametersErrors() {
		if ((rows) <= (cols)) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DEGREES_OF_FREEDOM, rows, cols, false);
		}
		double[] errors = new double[cols];
		final double c = org.apache.commons.math3.util.FastMath.sqrt(((getChiSquare()) / ((rows) - (cols))));
		double[][] covar = computeCovariances(point, 1.0E-14);
		for (int i = 0; i < (errors.length); ++i) {
			errors[i] = (org.apache.commons.math3.util.FastMath.sqrt(covar[i][i])) * c;
		}
		return errors;
	}

	public double[] computeSigma(double[] params, double covarianceSingularityThreshold) {
		final int nC = params.length;
		final double[] sig = new double[nC];
		final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
		for (int i = 0; i < nC; ++i) {
			sig[i] = org.apache.commons.math3.util.FastMath.sqrt(cov[i][i]);
		}
		return sig;
	}

	@java.lang.Override
	@java.lang.Deprecated
	public org.apache.commons.math3.optimization.PointVectorValuePair optimize(int maxEval, final org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction f, final double[] target, final double[] weights, final double[] startPoint) {
		return optimizeInternal(maxEval, org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(f), new org.apache.commons.math3.optimization.Target(target), new org.apache.commons.math3.optimization.Weight(weights), new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	@java.lang.Deprecated
	public org.apache.commons.math3.optimization.PointVectorValuePair optimize(final int maxEval, final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction f, final double[] target, final double[] weights, final double[] startPoint) {
		return optimizeInternal(maxEval, f, new org.apache.commons.math3.optimization.Target(target), new org.apache.commons.math3.optimization.Weight(weights), new org.apache.commons.math3.optimization.InitialGuess(startPoint));
	}

	@java.lang.Deprecated
	protected org.apache.commons.math3.optimization.PointVectorValuePair optimizeInternal(final int maxEval, final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction f, org.apache.commons.math3.optimization.OptimizationData... optData) {
		return super.optimizeInternal(maxEval, org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
	}

	@java.lang.Override
	protected void setUp() {
		super.setUp();
		jacobianEvaluations = 0;
		weightMatrixSqrt = squareRoot(getWeight());
		jF = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction) (getObjectiveFunction())));
		point = getStartPoint();
		rows = getTarget().length;
		cols = point.length;
	}

	protected double[] computeResiduals(double[] objectiveValue) {
		final double[] target = getTarget();
		if ((objectiveValue.length) != (target.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(target.length, objectiveValue.length);
		}
		final double[] residuals = new double[target.length];
		for (int i = 0; i < (target.length); i++) {
			residuals[i] = (target[i]) - (objectiveValue[i]);
		}
		return residuals;
	}

	private org.apache.commons.math3.linear.RealMatrix squareRoot(org.apache.commons.math3.linear.RealMatrix m) {
		final org.apache.commons.math3.linear.EigenDecomposition dec = new org.apache.commons.math3.linear.EigenDecomposition(m);
		return dec.getSquareRoot();
	}
}


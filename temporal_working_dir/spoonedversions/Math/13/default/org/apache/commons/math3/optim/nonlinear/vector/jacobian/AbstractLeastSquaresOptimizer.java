

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;


public abstract class AbstractLeastSquaresOptimizer extends org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer {
	private org.apache.commons.math3.linear.RealMatrix weightMatrixSqrt;

	private double cost;

	protected AbstractLeastSquaresOptimizer(org.apache.commons.math3.optim.ConvergenceChecker<org.apache.commons.math3.optim.PointVectorValuePair> checker) {
		super(checker);
	}

	protected org.apache.commons.math3.linear.RealMatrix computeWeightedJacobian(double[] params) {
		return weightMatrixSqrt.multiply(org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(computeJacobian(params)));
	}

	protected double computeCost(double[] residuals) {
		final org.apache.commons.math3.linear.ArrayRealVector r = new org.apache.commons.math3.linear.ArrayRealVector(residuals);
		return org.apache.commons.math3.util.FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
	}

	public double getRMS() {
		return org.apache.commons.math3.util.FastMath.sqrt(((getChiSquare()) / (getTargetSize())));
	}

	public double getChiSquare() {
		return (cost) * (cost);
	}

	public org.apache.commons.math3.linear.RealMatrix getWeightSquareRoot() {
		return weightMatrixSqrt.copy();
	}

	protected void setCost(double cost) {
		org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.this.cost = cost;
	}

	public double[][] computeCovariances(double[] params, double threshold) {
		final org.apache.commons.math3.linear.RealMatrix j = computeWeightedJacobian(params);
		final org.apache.commons.math3.linear.RealMatrix jTj = j.transpose().multiply(j);
		final org.apache.commons.math3.linear.DecompositionSolver solver = new org.apache.commons.math3.linear.QRDecomposition(jTj, threshold).getSolver();
		return solver.getInverse().getData();
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
	public org.apache.commons.math3.optim.PointVectorValuePair optimize(org.apache.commons.math3.optim.OptimizationData... optData) throws org.apache.commons.math3.exception.TooManyEvaluationsException {
		parseOptimizationData(optData);
		return super.optimize(optData);
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

	private void parseOptimizationData(org.apache.commons.math3.optim.OptimizationData... optData) {
		for (org.apache.commons.math3.optim.OptimizationData data : optData) {
			if (data instanceof org.apache.commons.math3.optim.nonlinear.vector.Weight) {
				weightMatrixSqrt = squareRoot(((org.apache.commons.math3.optim.nonlinear.vector.Weight) (data)).getWeight());
				break;
			}
		}
	}

	private org.apache.commons.math3.linear.RealMatrix squareRoot(org.apache.commons.math3.linear.RealMatrix m) {
		if (m instanceof org.apache.commons.math3.linear.DiagonalMatrix) {
			final int dim = m.getRowDimension();
			final org.apache.commons.math3.linear.RealMatrix sqrtM = new org.apache.commons.math3.linear.DiagonalMatrix(dim);
			for (int i = 0; i < dim; i++) {
				sqrtM.setEntry(i, i, org.apache.commons.math3.util.FastMath.sqrt(m.getEntry(i, i)));
			}
			return sqrtM;
		}else {
			final org.apache.commons.math3.linear.EigenDecomposition dec = new org.apache.commons.math3.linear.EigenDecomposition(m);
			return dec.getSquareRoot();
		}
	}
}


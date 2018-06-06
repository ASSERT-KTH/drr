

package org.apache.commons.math.optimization.general;


public abstract class AbstractLeastSquaresOptimizer implements org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer {
	private static final long serialVersionUID = 5413193243329026789L;

	public static final int DEFAULT_MAX_ITERATIONS = 100;

	private int maxIterations;

	private int iterations;

	private int objectiveEvaluations;

	private int jacobianEvaluations;

	protected org.apache.commons.math.optimization.VectorialConvergenceChecker checker;

	protected double[][] jacobian;

	protected int cols;

	protected int rows;

	private org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction f;

	private org.apache.commons.math.analysis.MultivariateMatrixFunction jF;

	protected double[] target;

	protected double[] weights;

	protected double[] point;

	protected double[] objective;

	protected double[] residuals;

	protected double cost;

	protected AbstractLeastSquaresOptimizer() {
		setConvergenceChecker(new org.apache.commons.math.optimization.SimpleVectorialValueChecker());
		setMaxIterations(org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.DEFAULT_MAX_ITERATIONS);
	}

	public void setMaxIterations(int maxIterations) {
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return maxIterations;
	}

	public int getIterations() {
		return iterations;
	}

	public int getEvaluations() {
		return objectiveEvaluations;
	}

	public int getJacobianEvaluations() {
		return jacobianEvaluations;
	}

	public void setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker checker) {
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.checker = checker;
	}

	public org.apache.commons.math.optimization.VectorialConvergenceChecker getConvergenceChecker() {
		return checker;
	}

	protected void incrementIterationsCounter() throws org.apache.commons.math.optimization.OptimizationException {
		if ((++(iterations)) > (maxIterations)) {
			if ((++(iterations)) > (maxIterations)) {
				throw new org.apache.commons.math.optimization.OptimizationException(new org.apache.commons.math.MaxIterationsExceededException(maxIterations));
			}
		}
	}

	protected void updateJacobian() throws org.apache.commons.math.FunctionEvaluationException {
		++(jacobianEvaluations);
		jacobian = jF.value(point);
		if ((jacobian.length) != (rows)) {
			throw new org.apache.commons.math.FunctionEvaluationException(point, "dimension mismatch {0} != {1}", jacobian.length, rows);
		}
		for (int i = 0; i < (rows); i++) {
			final double[] ji = jacobian[i];
			final double factor = -(java.lang.Math.sqrt(weights[i]));
			for (int j = 0; j < (cols); ++j) {
				ji[j] *= factor;
			}
		}
	}

	protected void updateResidualsAndCost() throws org.apache.commons.math.FunctionEvaluationException {
		++(objectiveEvaluations);
		objective = f.value(point);
		if ((objective.length) != (rows)) {
			throw new org.apache.commons.math.FunctionEvaluationException(point, "dimension mismatch {0} != {1}", objective.length, rows);
		}
		cost = 0;
		for (int i = 0, index = 0; i < (rows); i++ , index += cols) {
			final double residual = (target[i]) - (objective[i]);
			residuals[i] = residual;
			cost += ((weights[i]) * residual) * residual;
		}
		cost = java.lang.Math.sqrt(cost);
	}

	public double getRMS() {
		double criterion = 0;
		for (int i = 0; i < (rows); ++i) {
			final double residual = residuals[i];
			criterion += ((weights[i]) * residual) * residual;
		}
		return java.lang.Math.sqrt((criterion / (rows)));
	}

	public double getChiSquare() {
		double chiSquare = 0;
		for (int i = 0; i < (rows); ++i) {
			final double residual = residuals[i];
			chiSquare += (residual * residual) / (weights[i]);
		}
		return chiSquare;
	}

	public double[][] getCovariances() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		updateJacobian();
		double[][] jTj = new double[cols][cols];
		for (int i = 0; i < (cols); ++i) {
			for (int j = i; j < (cols); ++j) {
				double sum = 0;
				for (int k = 0; k < (rows); ++k) {
					sum += (jacobian[k][i]) * (jacobian[k][j]);
				}
				jTj[i][j] = sum;
				jTj[j][i] = sum;
			}
		}
		try {
			org.apache.commons.math.linear.RealMatrix inverse = new org.apache.commons.math.linear.decomposition.LUDecompositionImpl(org.apache.commons.math.linear.MatrixUtils.createRealMatrix(jTj)).getSolver().getInverse();
			return inverse.getData();
		} catch (org.apache.commons.math.linear.InvalidMatrixException ime) {
			throw new org.apache.commons.math.optimization.OptimizationException("unable to compute covariances: singular problem");
		}
	}

	public double[] guessParametersErrors() throws org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		if ((rows) <= (cols)) {
			throw new org.apache.commons.math.optimization.OptimizationException("no degrees of freedom ({0} measurements, {1} parameters)", rows, cols);
		}
		double[] errors = new double[cols];
		final double c = java.lang.Math.sqrt(((getChiSquare()) / ((rows) - (cols))));
		double[][] covar = getCovariances();
		for (int i = 0; i < (errors.length); ++i) {
			errors[i] = (java.lang.Math.sqrt(covar[i][i])) * c;
		}
		return errors;
	}

	public org.apache.commons.math.optimization.VectorialPointValuePair optimize(final org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction f, final double[] target, final double[] weights, final double[] startPoint) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException {
		if ((target.length) != (weights.length)) {
			throw new org.apache.commons.math.optimization.OptimizationException("dimension mismatch {0} != {1}", target.length, weights.length);
		}
		iterations = 0;
		objectiveEvaluations = 0;
		jacobianEvaluations = 0;
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.f = f;
		jF = f.jacobian();
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.target = target.clone();
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.weights = weights.clone();
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.point = startPoint.clone();
		org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.this.residuals = new double[target.length];
		rows = target.length;
		cols = point.length;
		jacobian = new double[rows][cols];
		cost = java.lang.Double.POSITIVE_INFINITY;
		return doOptimize();
	}

	protected abstract org.apache.commons.math.optimization.VectorialPointValuePair doOptimize() throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException, org.apache.commons.math.optimization.OptimizationException;
}


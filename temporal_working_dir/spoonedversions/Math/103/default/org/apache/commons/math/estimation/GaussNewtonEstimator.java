

package org.apache.commons.math.estimation;


public class GaussNewtonEstimator implements java.io.Serializable , org.apache.commons.math.estimation.Estimator {
	public GaussNewtonEstimator(int maxIterations, double convergence, double steadyStateThreshold) {
		org.apache.commons.math.estimation.GaussNewtonEstimator.this.maxIterations = maxIterations;
		org.apache.commons.math.estimation.GaussNewtonEstimator.this.steadyStateThreshold = steadyStateThreshold;
		org.apache.commons.math.estimation.GaussNewtonEstimator.this.convergence = convergence;
	}

	public void estimate(org.apache.commons.math.estimation.EstimationProblem problem) throws org.apache.commons.math.estimation.EstimationException {
		int iterations = 0;
		double previous = 0.0;
		double current = 0.0;
		do {
			if ((++iterations) > (maxIterations)) {
				throw new org.apache.commons.math.estimation.EstimationException("unable to converge in {0} iterations", new java.lang.String[]{ java.lang.Integer.toString(maxIterations) });
			}
			linearEstimate(problem);
			previous = current;
			current = evaluateCriterion(problem);
		} while ((iterations < 2) || (((java.lang.Math.abs((previous - current))) > (current * (steadyStateThreshold))) && ((java.lang.Math.abs(current)) > (convergence))) );
	}

	public void linearEstimate(org.apache.commons.math.estimation.EstimationProblem problem) throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] parameters = problem.getUnboundParameters();
		org.apache.commons.math.estimation.WeightedMeasurement[] measurements = problem.getMeasurements();
		org.apache.commons.math.linear.RealMatrix b = new org.apache.commons.math.linear.RealMatrixImpl(parameters.length, 1);
		org.apache.commons.math.linear.RealMatrix a = new org.apache.commons.math.linear.RealMatrixImpl(parameters.length, parameters.length);
		double[] grad = new double[parameters.length];
		org.apache.commons.math.linear.RealMatrixImpl bDecrement = new org.apache.commons.math.linear.RealMatrixImpl(parameters.length, 1);
		double[][] bDecrementData = bDecrement.getDataRef();
		org.apache.commons.math.linear.RealMatrixImpl wGradGradT = new org.apache.commons.math.linear.RealMatrixImpl(parameters.length, parameters.length);
		double[][] wggData = wGradGradT.getDataRef();
		for (int i = 0; i < (measurements.length); ++i) {
			if (!(measurements[i].isIgnored())) {
				double weight = measurements[i].getWeight();
				double residual = measurements[i].getResidual();
				for (int j = 0; j < (parameters.length); ++j) {
					grad[j] = measurements[i].getPartial(parameters[j]);
					bDecrementData[j][0] = (weight * residual) * (grad[j]);
				}
				for (int k = 0; k < (parameters.length); ++k) {
					double[] wggRow = wggData[k];
					double gk = grad[k];
					for (int l = 0; l < (parameters.length); ++l) {
						wggRow[l] = (weight * gk) * (grad[l]);
					}
				}
				a = a.add(wGradGradT);
				b = b.add(bDecrement);
			}
		}
		try {
			org.apache.commons.math.linear.RealMatrix dX = a.solve(b);
			for (int i = 0; i < (parameters.length); ++i) {
				parameters[i].setEstimate(((parameters[i].getEstimate()) + (dX.getEntry(i, 0))));
			}
		} catch (org.apache.commons.math.linear.InvalidMatrixException e) {
			throw new org.apache.commons.math.estimation.EstimationException(e);
		}
	}

	private double evaluateCriterion(org.apache.commons.math.estimation.EstimationProblem problem) {
		double criterion = 0.0;
		org.apache.commons.math.estimation.WeightedMeasurement[] measurements = problem.getMeasurements();
		for (int i = 0; i < (measurements.length); ++i) {
			double residual = measurements[i].getResidual();
			criterion += ((measurements[i].getWeight()) * residual) * residual;
		}
		return criterion;
	}

	public double getRMS(org.apache.commons.math.estimation.EstimationProblem problem) {
		double criterion = evaluateCriterion(problem);
		int n = problem.getMeasurements().length;
		return java.lang.Math.sqrt((criterion / n));
	}

	private int maxIterations;

	private double steadyStateThreshold;

	private double convergence;

	private static final long serialVersionUID = -7606628156644194170L;
}


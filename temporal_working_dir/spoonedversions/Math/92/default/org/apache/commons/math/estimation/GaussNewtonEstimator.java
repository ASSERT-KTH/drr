

package org.apache.commons.math.estimation;


public class GaussNewtonEstimator extends org.apache.commons.math.estimation.AbstractEstimator implements java.io.Serializable {
	public GaussNewtonEstimator(int maxCostEval, double convergence, double steadyStateThreshold) {
		setMaxCostEval(maxCostEval);
		org.apache.commons.math.estimation.GaussNewtonEstimator.this.steadyStateThreshold = steadyStateThreshold;
		org.apache.commons.math.estimation.GaussNewtonEstimator.this.convergence = convergence;
	}

	public void estimate(org.apache.commons.math.estimation.EstimationProblem problem) throws org.apache.commons.math.estimation.EstimationException {
		initializeEstimate(problem);
		double[] grad = new double[parameters.length];
		org.apache.commons.math.linear.RealVectorImpl bDecrement = new org.apache.commons.math.linear.RealVectorImpl(parameters.length);
		double[] bDecrementData = bDecrement.getDataRef();
		org.apache.commons.math.linear.RealMatrix wGradGradT = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(parameters.length, parameters.length);
		double previous = java.lang.Double.POSITIVE_INFINITY;
		do {
			incrementJacobianEvaluationsCounter();
			org.apache.commons.math.linear.RealVector b = new org.apache.commons.math.linear.RealVectorImpl(parameters.length);
			org.apache.commons.math.linear.RealMatrix a = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(parameters.length, parameters.length);
			for (int i = 0; i < (measurements.length); ++i) {
				if (!(measurements[i].isIgnored())) {
					double weight = measurements[i].getWeight();
					double residual = measurements[i].getResidual();
					for (int j = 0; j < (parameters.length); ++j) {
						grad[j] = measurements[i].getPartial(parameters[j]);
						bDecrementData[j] = (weight * residual) * (grad[j]);
					}
					for (int k = 0; k < (parameters.length); ++k) {
						double gk = grad[k];
						for (int l = 0; l < (parameters.length); ++l) {
							wGradGradT.setEntry(k, l, ((weight * gk) * (grad[l])));
						}
					}
					a = a.add(wGradGradT);
					b = b.add(bDecrement);
				}
			}
			try {
				org.apache.commons.math.linear.RealVector dX = new org.apache.commons.math.linear.LUDecompositionImpl(a).getSolver().solve(b);
				for (int i = 0; i < (parameters.length); ++i) {
					parameters[i].setEstimate(((parameters[i].getEstimate()) + (dX.getEntry(i))));
				}
			} catch (org.apache.commons.math.linear.InvalidMatrixException e) {
				throw new org.apache.commons.math.estimation.EstimationException("unable to solve: singular problem", null);
			}
			previous = cost;
			updateResidualsAndCost();
		} while (((getCostEvaluations()) < 2) || (((java.lang.Math.abs((previous - (cost)))) > ((cost) * (steadyStateThreshold))) && ((java.lang.Math.abs(cost)) > (convergence))) );
	}

	private double steadyStateThreshold;

	private double convergence;

	private static final long serialVersionUID = 5485001826076289109L;
}


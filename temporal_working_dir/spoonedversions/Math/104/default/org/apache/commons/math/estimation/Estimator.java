

package org.apache.commons.math.estimation;


public interface Estimator {
	public void estimate(org.apache.commons.math.estimation.EstimationProblem problem) throws org.apache.commons.math.estimation.EstimationException;

	public double getRMS(org.apache.commons.math.estimation.EstimationProblem problem);
}


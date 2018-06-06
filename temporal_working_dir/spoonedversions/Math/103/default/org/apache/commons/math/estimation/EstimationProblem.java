

package org.apache.commons.math.estimation;


public interface EstimationProblem {
	public org.apache.commons.math.estimation.WeightedMeasurement[] getMeasurements();

	public org.apache.commons.math.estimation.EstimatedParameter[] getUnboundParameters();

	public org.apache.commons.math.estimation.EstimatedParameter[] getAllParameters();
}


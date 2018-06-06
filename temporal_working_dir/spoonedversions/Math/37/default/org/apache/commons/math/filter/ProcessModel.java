

package org.apache.commons.math.filter;


public interface ProcessModel {
	org.apache.commons.math.linear.RealMatrix getStateTransitionMatrix();

	org.apache.commons.math.linear.RealMatrix getControlMatrix();

	org.apache.commons.math.linear.RealMatrix getProcessNoise();

	org.apache.commons.math.linear.RealVector getInitialStateEstimate();

	org.apache.commons.math.linear.RealMatrix getInitialErrorCovariance();
}




package org.apache.commons.math3.filter;


public interface ProcessModel {
	org.apache.commons.math3.linear.RealMatrix getStateTransitionMatrix();

	org.apache.commons.math3.linear.RealMatrix getControlMatrix();

	org.apache.commons.math3.linear.RealMatrix getProcessNoise();

	org.apache.commons.math3.linear.RealVector getInitialStateEstimate();

	org.apache.commons.math3.linear.RealMatrix getInitialErrorCovariance();
}


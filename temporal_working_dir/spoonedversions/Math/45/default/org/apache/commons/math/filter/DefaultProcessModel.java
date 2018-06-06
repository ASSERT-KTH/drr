

package org.apache.commons.math.filter;


public class DefaultProcessModel implements org.apache.commons.math.filter.ProcessModel {
	private org.apache.commons.math.linear.RealMatrix stateTransitionMatrix;

	private org.apache.commons.math.linear.RealMatrix controlMatrix;

	private org.apache.commons.math.linear.RealMatrix processNoiseCovMatrix;

	private org.apache.commons.math.linear.RealVector initialStateEstimateVector;

	private org.apache.commons.math.linear.RealMatrix initialErrorCovMatrix;

	public DefaultProcessModel(final double[][] stateTransition, final double[][] control, final double[][] processNoise, final double[] initialStateEstimate, final double[][] initialErrorCovariance) {
		this(new org.apache.commons.math.linear.Array2DRowRealMatrix(stateTransition), new org.apache.commons.math.linear.Array2DRowRealMatrix(control), new org.apache.commons.math.linear.Array2DRowRealMatrix(processNoise), new org.apache.commons.math.linear.ArrayRealVector(initialStateEstimate), new org.apache.commons.math.linear.Array2DRowRealMatrix(initialErrorCovariance));
	}

	public DefaultProcessModel(final double[][] stateTransition, final double[][] control, final double[][] processNoise) {
		this(new org.apache.commons.math.linear.Array2DRowRealMatrix(stateTransition), new org.apache.commons.math.linear.Array2DRowRealMatrix(control), new org.apache.commons.math.linear.Array2DRowRealMatrix(processNoise), null, null);
	}

	public DefaultProcessModel(final org.apache.commons.math.linear.RealMatrix stateTransition, final org.apache.commons.math.linear.RealMatrix control, final org.apache.commons.math.linear.RealMatrix processNoise, final org.apache.commons.math.linear.RealVector initialStateEstimate, final org.apache.commons.math.linear.RealMatrix initialErrorCovariance) {
		org.apache.commons.math.filter.DefaultProcessModel.this.stateTransitionMatrix = stateTransition;
		org.apache.commons.math.filter.DefaultProcessModel.this.controlMatrix = control;
		org.apache.commons.math.filter.DefaultProcessModel.this.processNoiseCovMatrix = processNoise;
		org.apache.commons.math.filter.DefaultProcessModel.this.initialStateEstimateVector = initialStateEstimate;
		org.apache.commons.math.filter.DefaultProcessModel.this.initialErrorCovMatrix = initialErrorCovariance;
	}

	public org.apache.commons.math.linear.RealMatrix getStateTransitionMatrix() {
		return stateTransitionMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix getControlMatrix() {
		return controlMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix getProcessNoise() {
		return processNoiseCovMatrix;
	}

	public org.apache.commons.math.linear.RealVector getInitialStateEstimate() {
		return initialStateEstimateVector;
	}

	public org.apache.commons.math.linear.RealMatrix getInitialErrorCovariance() {
		return initialErrorCovMatrix;
	}
}


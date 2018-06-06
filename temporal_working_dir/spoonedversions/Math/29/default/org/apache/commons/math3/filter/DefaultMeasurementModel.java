

package org.apache.commons.math3.filter;


public class DefaultMeasurementModel implements org.apache.commons.math3.filter.MeasurementModel {
	private org.apache.commons.math3.linear.RealMatrix measurementMatrix;

	private org.apache.commons.math3.linear.RealMatrix measurementNoise;

	public DefaultMeasurementModel(final double[][] measMatrix, final double[][] measNoise) {
		this(new org.apache.commons.math3.linear.Array2DRowRealMatrix(measMatrix), new org.apache.commons.math3.linear.Array2DRowRealMatrix(measNoise));
	}

	public DefaultMeasurementModel(final org.apache.commons.math3.linear.RealMatrix measMatrix, final org.apache.commons.math3.linear.RealMatrix measNoise) {
		org.apache.commons.math3.filter.DefaultMeasurementModel.this.measurementMatrix = measMatrix;
		org.apache.commons.math3.filter.DefaultMeasurementModel.this.measurementNoise = measNoise;
	}

	public org.apache.commons.math3.linear.RealMatrix getMeasurementMatrix() {
		return measurementMatrix;
	}

	public org.apache.commons.math3.linear.RealMatrix getMeasurementNoise() {
		return measurementNoise;
	}
}


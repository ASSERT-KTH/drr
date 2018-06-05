

package org.apache.commons.math3.filter;


public interface MeasurementModel {
	org.apache.commons.math3.linear.RealMatrix getMeasurementMatrix();

	org.apache.commons.math3.linear.RealMatrix getMeasurementNoise();
}


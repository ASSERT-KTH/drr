

package org.apache.commons.math.filter;


public interface MeasurementModel {
	org.apache.commons.math.linear.RealMatrix getMeasurementMatrix();

	org.apache.commons.math.linear.RealMatrix getMeasurementNoise();
}


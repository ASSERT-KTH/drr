

package org.apache.commons.math.distribution;


public interface WeibullDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	double getShape();

	double getScale();

	void setShape(double alpha);

	void setScale(double beta);
}


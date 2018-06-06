

package org.apache.commons.math.distribution;


public interface CauchyDistribution extends org.apache.commons.math.distribution.ContinuousDistribution {
	double getMedian();

	double getScale();

	void setMedian(double median);

	void setScale(double s);
}




package org.apache.commons.math.distribution;


public interface Distribution {
	double cumulativeProbability(double x);

	double cumulativeProbability(double x0, double x1);

	double getNumericalMean();

	double getNumericalVariance();

	boolean isSupportLowerBoundInclusive();

	boolean isSupportUpperBoundInclusive();

	boolean isSupportConnected();
}


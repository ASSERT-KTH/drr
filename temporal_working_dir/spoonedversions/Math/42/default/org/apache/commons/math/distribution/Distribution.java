

package org.apache.commons.math.distribution;


public interface Distribution {
	double probability(double x);

	double cumulativeProbability(double x);

	double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.exception.NumberIsTooLargeException;

	double getNumericalMean();

	double getNumericalVariance();

	boolean isSupportLowerBoundInclusive();

	boolean isSupportUpperBoundInclusive();

	boolean isSupportConnected();
}


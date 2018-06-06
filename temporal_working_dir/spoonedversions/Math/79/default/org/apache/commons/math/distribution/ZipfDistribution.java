

package org.apache.commons.math.distribution;


public interface ZipfDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	int getNumberOfElements();

	void setNumberOfElements(int n);

	double getExponent();

	void setExponent(double s);
}


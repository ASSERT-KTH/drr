

package org.apache.commons.math.distribution;


public interface ZipfDistribution extends org.apache.commons.math.distribution.IntegerDistribution {
	public int getNumberOfElements();

	public void setNumberOfElements(int n);

	public double getExponent();

	public void setExponent(double s);
}




package org.apache.commons.math.stat.correlation;


public class StorelessBivariateCovariance {
	private double deltaX = 0.0;

	private double deltaY = 0.0;

	private double meanX = 0.0;

	private double meanY = 0.0;

	private double n = 0;

	private double covarianceNumerator = 0.0;

	private boolean biasCorrected = true;

	public StorelessBivariateCovariance() {
	}

	public StorelessBivariateCovariance(boolean biasCorrected) {
		org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.this.biasCorrected = biasCorrected;
	}

	public void increment(double x, double y) {
		(n)++;
		deltaX = x - (meanX);
		deltaY = y - (meanY);
		meanX += (deltaX) / (n);
		meanY += (deltaY) / (n);
		covarianceNumerator += ((((n) - 1.0) / (n)) * (deltaX)) * (deltaY);
	}

	public double getN() {
		return n;
	}

	public double getResult() throws java.lang.IllegalArgumentException {
		if ((n) < 2)
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION, n, 2);
		
		if (biasCorrected) {
			return (covarianceNumerator) / ((n) - 1.0);
		}else {
			return (covarianceNumerator) / (n);
		}
	}
}


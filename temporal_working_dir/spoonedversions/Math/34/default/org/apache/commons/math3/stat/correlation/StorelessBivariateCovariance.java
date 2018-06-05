

package org.apache.commons.math3.stat.correlation;


class StorelessBivariateCovariance {
	private double meanX;

	private double meanY;

	private double n;

	private double covarianceNumerator;

	private boolean biasCorrected;

	public StorelessBivariateCovariance() {
		this(true);
	}

	public StorelessBivariateCovariance(final boolean biasCorrection) {
		meanX = meanY = 0.0;
		n = 0;
		covarianceNumerator = 0.0;
		biasCorrected = biasCorrection;
	}

	public void increment(final double x, final double y) {
		(n)++;
		final double deltaX = x - (meanX);
		final double deltaY = y - (meanY);
		meanX += deltaX / (n);
		meanY += deltaY / (n);
		covarianceNumerator += ((((n) - 1.0) / (n)) * deltaX) * deltaY;
	}

	public double getN() {
		return n;
	}

	public double getResult() throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		if ((n) < 2) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION, n, 2, true);
		}
		if (biasCorrected) {
			return (covarianceNumerator) / ((n) - 1.0);
		}else {
			return (covarianceNumerator) / (n);
		}
	}
}


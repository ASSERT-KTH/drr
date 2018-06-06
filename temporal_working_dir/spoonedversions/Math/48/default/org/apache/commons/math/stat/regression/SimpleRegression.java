

package org.apache.commons.math.stat.regression;


public class SimpleRegression implements java.io.Serializable {
	private static final long serialVersionUID = -3004689053607543335L;

	private double sumX = 0.0;

	private double sumXX = 0.0;

	private double sumY = 0.0;

	private double sumYY = 0.0;

	private double sumXY = 0.0;

	private long n = 0;

	private double xbar = 0;

	private double ybar = 0;

	public SimpleRegression() {
		super();
	}

	public void addData(double x, double y) {
		if ((n) == 0) {
			xbar = x;
			ybar = y;
		}else {
			double dx = x - (xbar);
			double dy = y - (ybar);
			sumXX += ((dx * dx) * ((double) (n))) / ((n) + 1.0);
			sumYY += ((dy * dy) * ((double) (n))) / ((n) + 1.0);
			sumXY += ((dx * dy) * ((double) (n))) / ((n) + 1.0);
			xbar += dx / ((n) + 1.0);
			ybar += dy / ((n) + 1.0);
		}
		sumX += x;
		sumY += y;
		(n)++;
	}

	public void removeData(double x, double y) {
		if ((n) > 0) {
			double dx = x - (xbar);
			double dy = y - (ybar);
			sumXX -= ((dx * dx) * ((double) (n))) / ((n) - 1.0);
			sumYY -= ((dy * dy) * ((double) (n))) / ((n) - 1.0);
			sumXY -= ((dx * dy) * ((double) (n))) / ((n) - 1.0);
			xbar -= dx / ((n) - 1.0);
			ybar -= dy / ((n) - 1.0);
			sumX -= x;
			sumY -= y;
			(n)--;
		}
	}

	public void addData(double[][] data) {
		for (int i = 0; i < (data.length); i++) {
			addData(data[i][0], data[i][1]);
		}
	}

	public void removeData(double[][] data) {
		for (int i = 0; (i < (data.length)) && ((n) > 0); i++) {
			removeData(data[i][0], data[i][1]);
		}
	}

	public void clear() {
		sumX = 0.0;
		sumXX = 0.0;
		sumY = 0.0;
		sumYY = 0.0;
		sumXY = 0.0;
		n = 0;
	}

	public long getN() {
		return n;
	}

	public double predict(double x) {
		double b1 = getSlope();
		return (getIntercept(b1)) + (b1 * x);
	}

	public double getIntercept() {
		return getIntercept(getSlope());
	}

	public double getSlope() {
		if ((n) < 2) {
			return java.lang.Double.NaN;
		}
		if ((org.apache.commons.math.util.FastMath.abs(sumXX)) < (10 * (java.lang.Double.MIN_VALUE))) {
			return java.lang.Double.NaN;
		}
		return (sumXY) / (sumXX);
	}

	public double getSumSquaredErrors() {
		return org.apache.commons.math.util.FastMath.max(0.0, ((sumYY) - (((sumXY) * (sumXY)) / (sumXX))));
	}

	public double getTotalSumSquares() {
		if ((n) < 2) {
			return java.lang.Double.NaN;
		}
		return sumYY;
	}

	public double getXSumSquares() {
		if ((n) < 2) {
			return java.lang.Double.NaN;
		}
		return sumXX;
	}

	public double getSumOfCrossProducts() {
		return sumXY;
	}

	public double getRegressionSumSquares() {
		return getRegressionSumSquares(getSlope());
	}

	public double getMeanSquareError() {
		if ((n) < 3) {
			return java.lang.Double.NaN;
		}
		return (getSumSquaredErrors()) / ((n) - 2);
	}

	public double getR() {
		double b1 = getSlope();
		double result = org.apache.commons.math.util.FastMath.sqrt(getRSquare());
		if (b1 < 0) {
			result = -result;
		}
		return result;
	}

	public double getRSquare() {
		double ssto = getTotalSumSquares();
		return (ssto - (getSumSquaredErrors())) / ssto;
	}

	public double getInterceptStdErr() {
		return org.apache.commons.math.util.FastMath.sqrt(((getMeanSquareError()) * ((1.0 / ((double) (n))) + (((xbar) * (xbar)) / (sumXX)))));
	}

	public double getSlopeStdErr() {
		return org.apache.commons.math.util.FastMath.sqrt(((getMeanSquareError()) / (sumXX)));
	}

	public double getSlopeConfidenceInterval() throws org.apache.commons.math.MathException {
		return getSlopeConfidenceInterval(0.05);
	}

	public double getSlopeConfidenceInterval(double alpha) throws org.apache.commons.math.MathException {
		if ((alpha >= 1) || (alpha <= 0)) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.SIGNIFICANCE_LEVEL, alpha, 0, 1);
		}
		org.apache.commons.math.distribution.TDistribution distribution = new org.apache.commons.math.distribution.TDistributionImpl(((n) - 2));
		return (getSlopeStdErr()) * (distribution.inverseCumulativeProbability((1.0 - (alpha / 2.0))));
	}

	public double getSignificance() throws org.apache.commons.math.MathException {
		org.apache.commons.math.distribution.TDistribution distribution = new org.apache.commons.math.distribution.TDistributionImpl(((n) - 2));
		return 2.0 * (1.0 - (distribution.cumulativeProbability(((org.apache.commons.math.util.FastMath.abs(getSlope())) / (getSlopeStdErr())))));
	}

	private double getIntercept(double slope) {
		return ((sumY) - (slope * (sumX))) / (n);
	}

	private double getRegressionSumSquares(double slope) {
		return (slope * slope) * (sumXX);
	}
}


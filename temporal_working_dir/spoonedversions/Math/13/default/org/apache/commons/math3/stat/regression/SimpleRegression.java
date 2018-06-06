

package org.apache.commons.math3.stat.regression;


public class SimpleRegression implements java.io.Serializable , org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression {
	private static final long serialVersionUID = -3004689053607543335L;

	private double sumX = 0.0;

	private double sumXX = 0.0;

	private double sumY = 0.0;

	private double sumYY = 0.0;

	private double sumXY = 0.0;

	private long n = 0;

	private double xbar = 0;

	private double ybar = 0;

	private final boolean hasIntercept;

	public SimpleRegression() {
		this(true);
	}

	public SimpleRegression(boolean includeIntercept) {
		super();
		hasIntercept = includeIntercept;
	}

	public void addData(final double x, final double y) {
		if ((n) == 0) {
			xbar = x;
			ybar = y;
		}else {
			if (hasIntercept) {
				final double fact1 = 1.0 + (n);
				final double fact2 = (n) / (1.0 + (n));
				final double dx = x - (xbar);
				final double dy = y - (ybar);
				sumXX += (dx * dx) * fact2;
				sumYY += (dy * dy) * fact2;
				sumXY += (dx * dy) * fact2;
				xbar += dx / fact1;
				ybar += dy / fact1;
			}
		}
		if (!(hasIntercept)) {
			sumXX += x * x;
			sumYY += y * y;
			sumXY += x * y;
		}
		sumX += x;
		sumY += y;
		(n)++;
	}

	public void removeData(final double x, final double y) {
		if ((n) > 0) {
			if (hasIntercept) {
				final double fact1 = (n) - 1.0;
				final double fact2 = (n) / ((n) - 1.0);
				final double dx = x - (xbar);
				final double dy = y - (ybar);
				sumXX -= (dx * dx) * fact2;
				sumYY -= (dy * dy) * fact2;
				sumXY -= (dx * dy) * fact2;
				xbar -= dx / fact1;
				ybar -= dy / fact1;
			}else {
				final double fact1 = (n) - 1.0;
				sumXX -= x * x;
				sumYY -= y * y;
				sumXY -= x * y;
				xbar -= x / fact1;
				ybar -= y / fact1;
			}
			sumX -= x;
			sumY -= y;
			(n)--;
		}
	}

	public void addData(final double[][] data) throws org.apache.commons.math3.stat.regression.ModelSpecificationException {
		for (int i = 0; i < (data.length); i++) {
			if ((data[i].length) < 2) {
				throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION, data[i].length, 2);
			}
			addData(data[i][0], data[i][1]);
		}
	}

	public void addObservation(final double[] x, final double y) throws org.apache.commons.math3.stat.regression.ModelSpecificationException {
		if ((x == null) || ((x.length) == 0)) {
			throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_REGRESSION_OBSERVATION, (x != null ? x.length : 0), 1);
		}
		addData(x[0], y);
	}

	public void addObservations(final double[][] x, final double[] y) throws org.apache.commons.math3.stat.regression.ModelSpecificationException {
		if (((x == null) || (y == null)) || ((x.length) != (y.length))) {
			throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE, (x == null ? 0 : x.length), (y == null ? 0 : y.length));
		}
		boolean obsOk = true;
		for (int i = 0; i < (x.length); i++) {
			if (((x[i]) == null) || ((x[i].length) == 0)) {
				obsOk = false;
			}
		}
		if (!obsOk) {
			throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, 0, 1);
		}
		for (int i = 0; i < (x.length); i++) {
			addData(x[i][0], y[i]);
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

	public double predict(final double x) {
		final double b1 = getSlope();
		if (hasIntercept) {
			return (getIntercept(b1)) + (b1 * x);
		}
		return b1 * x;
	}

	public double getIntercept() {
		return hasIntercept ? getIntercept(getSlope()) : 0.0;
	}

	public boolean hasIntercept() {
		return hasIntercept;
	}

	public double getSlope() {
		if ((n) < 2) {
			return java.lang.Double.NaN;
		}
		if ((org.apache.commons.math3.util.FastMath.abs(sumXX)) < (10 * (java.lang.Double.MIN_VALUE))) {
			return java.lang.Double.NaN;
		}
		return (sumXY) / (sumXX);
	}

	public double getSumSquaredErrors() {
		return org.apache.commons.math3.util.FastMath.max(0.0, ((sumYY) - (((sumXY) * (sumXY)) / (sumXX))));
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
		return hasIntercept ? (getSumSquaredErrors()) / ((n) - 2) : (getSumSquaredErrors()) / ((n) - 1);
	}

	public double getR() {
		double b1 = getSlope();
		double result = org.apache.commons.math3.util.FastMath.sqrt(getRSquare());
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
		if (!(hasIntercept)) {
			return java.lang.Double.NaN;
		}
		return org.apache.commons.math3.util.FastMath.sqrt(((getMeanSquareError()) * ((1.0 / (n)) + (((xbar) * (xbar)) / (sumXX)))));
	}

	public double getSlopeStdErr() {
		return org.apache.commons.math3.util.FastMath.sqrt(((getMeanSquareError()) / (sumXX)));
	}

	public double getSlopeConfidenceInterval() throws org.apache.commons.math3.exception.OutOfRangeException {
		return getSlopeConfidenceInterval(0.05);
	}

	public double getSlopeConfidenceInterval(final double alpha) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((n) < 3) {
			return java.lang.Double.NaN;
		}
		if ((alpha >= 1) || (alpha <= 0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.SIGNIFICANCE_LEVEL, alpha, 0, 1);
		}
		org.apache.commons.math3.distribution.TDistribution distribution = new org.apache.commons.math3.distribution.TDistribution(((n) - 2));
		return (getSlopeStdErr()) * (distribution.inverseCumulativeProbability((1.0 - (alpha / 2.0))));
	}

	public double getSignificance() {
		if ((n) < 3) {
			return java.lang.Double.NaN;
		}
		org.apache.commons.math3.distribution.TDistribution distribution = new org.apache.commons.math3.distribution.TDistribution(((n) - 2));
		return 2.0 * (1.0 - (distribution.cumulativeProbability(((org.apache.commons.math3.util.FastMath.abs(getSlope())) / (getSlopeStdErr())))));
	}

	private double getIntercept(final double slope) {
		if (hasIntercept) {
			return ((sumY) - (slope * (sumX))) / (n);
		}
		return 0.0;
	}

	private double getRegressionSumSquares(final double slope) {
		return (slope * slope) * (sumXX);
	}

	public org.apache.commons.math3.stat.regression.RegressionResults regress() throws org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.stat.regression.ModelSpecificationException {
		if (hasIntercept) {
			if ((n) < 3) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION);
			}
			if ((org.apache.commons.math3.util.FastMath.abs(sumXX)) > (org.apache.commons.math3.util.Precision.SAFE_MIN)) {
				final double[] params = new double[]{ getIntercept() , getSlope() };
				final double mse = getMeanSquareError();
				final double _syy = (sumYY) + (((sumY) * (sumY)) / (n));
				final double[] vcv = new double[]{ mse * ((((xbar) * (xbar)) / (sumXX)) + (1.0 / (n))) , ((-(xbar)) * mse) / (sumXX) , mse / (sumXX) };
				return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 2, sumY, _syy, getSumSquaredErrors(), true, false);
			}else {
				final double[] params = new double[]{ (sumY) / (n) , java.lang.Double.NaN };
				final double[] vcv = new double[]{ (ybar) / ((n) - 1.0) , java.lang.Double.NaN , java.lang.Double.NaN };
				return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, sumY, sumYY, getSumSquaredErrors(), true, false);
			}
		}else {
			if ((n) < 2) {
				throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION);
			}
			if (!(java.lang.Double.isNaN(sumXX))) {
				final double[] vcv = new double[]{ (getMeanSquareError()) / (sumXX) };
				final double[] params = new double[]{ (sumXY) / (sumXX) };
				return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, sumY, sumYY, getSumSquaredErrors(), false, false);
			}else {
				final double[] vcv = new double[]{ java.lang.Double.NaN };
				final double[] params = new double[]{ java.lang.Double.NaN };
				return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, false, false);
			}
		}
	}

	public org.apache.commons.math3.stat.regression.RegressionResults regress(int[] variablesToInclude) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if ((variablesToInclude == null) || ((variablesToInclude.length) == 0)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_ZERO_LENGTH_OR_NULL_NOT_ALLOWED);
		}
		if (((variablesToInclude.length) > 2) || (((variablesToInclude.length) > 1) && (!(hasIntercept)))) {
			throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZE_EXCEEDS_MAX_VARIABLES, (((variablesToInclude.length) > 1) && (!(hasIntercept)) ? 1 : 2));
		}
		if (hasIntercept) {
			if ((variablesToInclude.length) == 2) {
				if ((variablesToInclude[0]) == 1) {
					throw new org.apache.commons.math3.stat.regression.ModelSpecificationException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_INCREASING_SEQUENCE);
				}else
					if ((variablesToInclude[0]) != 0) {
						throw new org.apache.commons.math3.exception.OutOfRangeException(variablesToInclude[0], 0, 1);
					}
				
				if ((variablesToInclude[1]) != 1) {
					throw new org.apache.commons.math3.exception.OutOfRangeException(variablesToInclude[0], 0, 1);
				}
				return regress();
			}else {
				if (((variablesToInclude[0]) != 1) && ((variablesToInclude[0]) != 0)) {
					throw new org.apache.commons.math3.exception.OutOfRangeException(variablesToInclude[0], 0, 1);
				}
				final double _mean = ((sumY) * (sumY)) / (n);
				final double _syy = (sumYY) + _mean;
				if ((variablesToInclude[0]) == 0) {
					final double[] vcv = new double[]{ (sumYY) / (((n) - 1) * (n)) };
					final double[] params = new double[]{ ybar };
					return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, sumY, (_syy + _mean), sumYY, true, false);
				}else
					if ((variablesToInclude[0]) == 1) {
						final double _sxx = (sumXX) + (((sumX) * (sumX)) / (n));
						final double _sxy = (sumXY) + (((sumX) * (sumY)) / (n));
						final double _sse = org.apache.commons.math3.util.FastMath.max(0.0, (_syy - ((_sxy * _sxy) / _sxx)));
						final double _mse = _sse / ((n) - 1);
						if (!(java.lang.Double.isNaN(_sxx))) {
							final double[] vcv = new double[]{ _mse / _sxx };
							final double[] params = new double[]{ _sxy / _sxx };
							return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, sumY, _syy, _sse, false, false);
						}else {
							final double[] vcv = new double[]{ java.lang.Double.NaN };
							final double[] params = new double[]{ java.lang.Double.NaN };
							return new org.apache.commons.math3.stat.regression.RegressionResults(params, new double[][]{ vcv }, true, n, 1, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, false, false);
						}
					}
				
			}
		}else {
			if ((variablesToInclude[0]) != 0) {
				throw new org.apache.commons.math3.exception.OutOfRangeException(variablesToInclude[0], 0, 0);
			}
			return regress();
		}
		return null;
	}
}


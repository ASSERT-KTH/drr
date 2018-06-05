

package org.apache.commons.math.stat.descriptive.moment;


public class VectorialCovariance implements java.io.Serializable {
	private static final long serialVersionUID = 4118372414238930270L;

	private double[] sums;

	private double[] productsSums;

	private long n;

	public VectorialCovariance(int dimension) {
		sums = new double[dimension];
		productsSums = new double[(dimension * (dimension + 1)) / 2];
		n = 0;
	}

	public void increment(double[] v) throws org.apache.commons.math.DimensionMismatchException {
		if ((v.length) != (sums.length)) {
			throw new org.apache.commons.math.DimensionMismatchException(v.length, sums.length);
		}
		int k = 0;
		for (int i = 0; i < (v.length); ++i) {
			sums[i] += v[i];
			for (int j = 0; j <= i; ++j) {
				productsSums[(k++)] += (v[i]) * (v[j]);
			}
		}
		(n)++;
	}

	public org.apache.commons.math.linear.RealMatrix getResult() {
		int dimension = sums.length;
		org.apache.commons.math.linear.RealMatrixImpl result = new org.apache.commons.math.linear.RealMatrixImpl(dimension, dimension);
		if ((n) > 1) {
			double[][] resultData = result.getDataRef();
			double c = 1.0 / ((n) * ((n) - 1));
			int k = 0;
			for (int i = 0; i < dimension; ++i) {
				for (int j = 0; j <= i; ++j) {
					double e = c * (((n) * (productsSums[(k++)])) - ((sums[i]) * (sums[j])));
					resultData[i][j] = e;
					resultData[j][i] = e;
				}
			}
		}
		return result;
	}

	public long getN() {
		return n;
	}
}


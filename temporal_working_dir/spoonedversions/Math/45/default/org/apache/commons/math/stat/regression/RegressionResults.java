

package org.apache.commons.math.stat.regression;


public class RegressionResults implements java.io.Serializable {
	private static final int SSE_IDX = 0;

	private static final int SST_IDX = 1;

	private static final int RSQ_IDX = 2;

	private static final int MSE_IDX = 3;

	private static final int ADJRSQ_IDX = 4;

	private static final long serialVersionUID = 1L;

	private final double[] parameters;

	private final double[][] varCovData;

	private final boolean isSymmetricVCD;

	private final int rank;

	private final long nobs;

	private final boolean containsConstant;

	private final double[] globalFitInfo;

	private final java.lang.String indexOutOfBound = "Index is outside of the 0 to number of variables - 1 range";

	@java.lang.SuppressWarnings(value = "unused")
	private RegressionResults() {
		this.parameters = null;
		this.varCovData = null;
		this.rank = -1;
		this.nobs = -1;
		this.containsConstant = false;
		this.isSymmetricVCD = false;
		this.globalFitInfo = null;
	}

	public RegressionResults(final double[] parameters, final double[][] varcov, final boolean isSymmetricCompressed, final long nobs, final int rank, final double sumy, final double sumysq, final double sse, final boolean containsConstant, final boolean copyData) {
		if (copyData) {
			this.parameters = org.apache.commons.math.util.MathUtils.copyOf(parameters);
			this.varCovData = new double[varcov.length][];
			for (int i = 0; i < (varcov.length); i++) {
				org.apache.commons.math.stat.regression.RegressionResults.this.varCovData[i] = org.apache.commons.math.util.MathUtils.copyOf(varcov[i]);
			}
		}else {
			this.parameters = parameters;
			this.varCovData = varcov;
		}
		this.isSymmetricVCD = isSymmetricCompressed;
		this.nobs = nobs;
		this.rank = rank;
		this.containsConstant = containsConstant;
		this.globalFitInfo = new double[5];
		java.util.Arrays.fill(org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo, java.lang.Double.NaN);
		if (rank > 0) {
			org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SST_IDX] = (containsConstant) ? sumysq - ((sumy * sumy) / ((double) (nobs))) : sumysq;
		}
		org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SSE_IDX] = sse;
		org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.MSE_IDX] = (org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SSE_IDX]) / ((double) (nobs - rank));
		org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.RSQ_IDX] = 1.0 - ((org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SSE_IDX]) / (org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SST_IDX]));
		if (!containsConstant) {
			org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.ADJRSQ_IDX] = 1.0 - ((1.0 - (org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.RSQ_IDX])) * (((double) (nobs)) / ((double) (nobs - rank))));
		}else {
			org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.ADJRSQ_IDX] = 1.0 - ((sse * (nobs - 1.0)) / ((globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SST_IDX]) * (nobs - rank)));
		}
	}

	public double getParameterEstimate(int index) throws java.lang.IndexOutOfBoundsException {
		if ((parameters) == null) {
			return java.lang.Double.NaN;
		}
		if ((index < 0) || (index >= (org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length))) {
			throw new java.lang.IndexOutOfBoundsException(indexOutOfBound);
		}
		return org.apache.commons.math.stat.regression.RegressionResults.this.parameters[index];
	}

	public double[] getParameterEstimates() {
		if ((org.apache.commons.math.stat.regression.RegressionResults.this.parameters) == null) {
			return null;
		}
		return org.apache.commons.math.util.MathUtils.copyOf(parameters);
	}

	public double getStdErrorOfEstimate(int index) throws java.lang.IndexOutOfBoundsException {
		if ((parameters) == null) {
			return java.lang.Double.NaN;
		}
		if ((index < 0) || (index >= (org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length))) {
			throw new java.lang.IndexOutOfBoundsException(indexOutOfBound);
		}
		double var = org.apache.commons.math.stat.regression.RegressionResults.this.getVcvElement(index, index);
		if ((!(java.lang.Double.isNaN(var))) && (var > (java.lang.Double.MIN_VALUE))) {
			return org.apache.commons.math.util.FastMath.sqrt(var);
		}
		return java.lang.Double.NaN;
	}

	public double[] getStdErrorOfEstimates() {
		if ((parameters) == null) {
			return null;
		}
		double[] se = new double[org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length];
		for (int i = 0; i < (org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length); i++) {
			double var = org.apache.commons.math.stat.regression.RegressionResults.this.getVcvElement(i, i);
			if ((!(java.lang.Double.isNaN(var))) && (var > (java.lang.Double.MIN_VALUE))) {
				se[i] = org.apache.commons.math.util.FastMath.sqrt(var);
				continue;
			}
			se[i] = java.lang.Double.NaN;
		}
		return se;
	}

	public double getCovarianceOfParameters(int i, int j) throws java.lang.IndexOutOfBoundsException {
		if ((parameters) == null) {
			return java.lang.Double.NaN;
		}
		if ((i < 0) || (i >= (org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length))) {
			throw new java.lang.IndexOutOfBoundsException((" Row index is outside of the 0 " + "to number of variables - 1 range"));
		}
		if ((j < 0) || (j >= (org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length))) {
			throw new java.lang.IndexOutOfBoundsException((" Column index is outside of the 0" + " to number of variables - 1 range"));
		}
		return org.apache.commons.math.stat.regression.RegressionResults.this.getVcvElement(i, j);
	}

	public int getNumberOfParameters() {
		if ((org.apache.commons.math.stat.regression.RegressionResults.this.parameters) == null) {
			return -1;
		}
		return org.apache.commons.math.stat.regression.RegressionResults.this.parameters.length;
	}

	public long getN() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.nobs;
	}

	public double getTotalSumSquares() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SST_IDX];
	}

	public double getRegressionSumSquares() {
		return (org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SST_IDX]) - (org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SSE_IDX]);
	}

	public double getErrorSumSquares() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.SSE_IDX];
	}

	public double getMeanSquareError() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.MSE_IDX];
	}

	public double getRSquared() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.RSQ_IDX];
	}

	public double getAdjustedRSquared() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.globalFitInfo[org.apache.commons.math.stat.regression.RegressionResults.ADJRSQ_IDX];
	}

	public boolean hasIntercept() {
		return org.apache.commons.math.stat.regression.RegressionResults.this.containsConstant;
	}

	private double getVcvElement(int i, int j) {
		if (org.apache.commons.math.stat.regression.RegressionResults.this.isSymmetricVCD) {
			if ((org.apache.commons.math.stat.regression.RegressionResults.this.varCovData.length) > 1) {
				if (i == j) {
					return varCovData[i][i];
				}else
					if (i >= (varCovData[j].length)) {
						return varCovData[i][j];
					}else {
						return varCovData[j][i];
					}
				
			}else {
				if (i > j) {
					return varCovData[0][((((i + 1) * i) / 2) + j)];
				}else {
					return varCovData[0][((((j + 1) * j) / 2) + i)];
				}
			}
		}else {
			return org.apache.commons.math.stat.regression.RegressionResults.this.varCovData[i][j];
		}
	}
}


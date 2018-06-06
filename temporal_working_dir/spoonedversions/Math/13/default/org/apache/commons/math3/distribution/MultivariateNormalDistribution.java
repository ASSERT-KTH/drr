

package org.apache.commons.math3.distribution;


public class MultivariateNormalDistribution extends org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution {
	private final double[] means;

	private final org.apache.commons.math3.linear.RealMatrix covarianceMatrix;

	private final org.apache.commons.math3.linear.RealMatrix covarianceMatrixInverse;

	private final double covarianceMatrixDeterminant;

	private final org.apache.commons.math3.linear.RealMatrix samplingMatrix;

	public MultivariateNormalDistribution(final double[] means, final double[][] covariances) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException, org.apache.commons.math3.linear.SingularMatrixException {
		this(new org.apache.commons.math3.random.Well19937c(), means, covariances);
	}

	public MultivariateNormalDistribution(org.apache.commons.math3.random.RandomGenerator rng, final double[] means, final double[][] covariances) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException, org.apache.commons.math3.linear.SingularMatrixException {
		super(rng, means.length);
		final int dim = means.length;
		if ((covariances.length) != dim) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(covariances.length, dim);
		}
		for (int i = 0; i < dim; i++) {
			if (dim != (covariances[i].length)) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(covariances[i].length, dim);
			}
		}
		this.means = org.apache.commons.math3.util.MathArrays.copyOf(means);
		covarianceMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix(covariances);
		final org.apache.commons.math3.linear.EigenDecomposition covMatDec = new org.apache.commons.math3.linear.EigenDecomposition(covarianceMatrix);
		covarianceMatrixInverse = covMatDec.getSolver().getInverse();
		covarianceMatrixDeterminant = covMatDec.getDeterminant();
		final double[] covMatEigenvalues = covMatDec.getRealEigenvalues();
		for (int i = 0; i < (covMatEigenvalues.length); i++) {
			if ((covMatEigenvalues[i]) < 0) {
				throw new org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException(covMatEigenvalues[i], i, 0);
			}
		}
		final org.apache.commons.math3.linear.Array2DRowRealMatrix covMatEigenvectors = new org.apache.commons.math3.linear.Array2DRowRealMatrix(dim, dim);
		for (int v = 0; v < dim; v++) {
			final double[] evec = covMatDec.getEigenvector(v).toArray();
			covMatEigenvectors.setColumn(v, evec);
		}
		final org.apache.commons.math3.linear.RealMatrix tmpMatrix = covMatEigenvectors.transpose();
		for (int row = 0; row < dim; row++) {
			final double factor = org.apache.commons.math3.util.FastMath.sqrt(covMatEigenvalues[row]);
			for (int col = 0; col < dim; col++) {
				tmpMatrix.multiplyEntry(row, col, factor);
			}
		}
		samplingMatrix = covMatEigenvectors.multiply(tmpMatrix);
	}

	public double[] getMeans() {
		return org.apache.commons.math3.util.MathArrays.copyOf(means);
	}

	public org.apache.commons.math3.linear.RealMatrix getCovariances() {
		return covarianceMatrix.copy();
	}

	public double density(final double[] vals) throws org.apache.commons.math3.exception.DimensionMismatchException {
		final int dim = getDimension();
		if ((vals.length) != dim) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(vals.length, dim);
		}
		return ((org.apache.commons.math3.util.FastMath.pow((2 * (org.apache.commons.math3.util.FastMath.PI)), ((-dim) / 2))) * (org.apache.commons.math3.util.FastMath.pow(covarianceMatrixDeterminant, (-0.5)))) * (getExponentTerm(vals));
	}

	public double[] getStandardDeviations() {
		final int dim = getDimension();
		final double[] std = new double[dim];
		final double[][] s = covarianceMatrix.getData();
		for (int i = 0; i < dim; i++) {
			std[i] = org.apache.commons.math3.util.FastMath.sqrt(s[i][i]);
		}
		return std;
	}

	public double[] sample() {
		final int dim = getDimension();
		final double[] normalVals = new double[dim];
		for (int i = 0; i < dim; i++) {
			normalVals[i] = random.nextGaussian();
		}
		final double[] vals = samplingMatrix.operate(normalVals);
		for (int i = 0; i < dim; i++) {
			vals[i] += means[i];
		}
		return vals;
	}

	private double getExponentTerm(final double[] values) {
		final double[] centered = new double[values.length];
		for (int i = 0; i < (centered.length); i++) {
			centered[i] = (values[i]) - (getMeans()[i]);
		}
		final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
		double sum = 0;
		for (int i = 0; i < (preMultiplied.length); i++) {
			sum += (preMultiplied[i]) * (centered[i]);
		}
		return org.apache.commons.math3.util.FastMath.exp(((-0.5) * sum));
	}
}




package org.apache.commons.math3.stat.correlation;


public class SpearmansCorrelation {
	private final org.apache.commons.math3.linear.RealMatrix data;

	private final org.apache.commons.math3.stat.ranking.RankingAlgorithm rankingAlgorithm;

	private final org.apache.commons.math3.stat.correlation.PearsonsCorrelation rankCorrelation;

	public SpearmansCorrelation() {
		this(new org.apache.commons.math3.stat.ranking.NaturalRanking());
	}

	public SpearmansCorrelation(final org.apache.commons.math3.stat.ranking.RankingAlgorithm rankingAlgorithm) {
		data = null;
		this.rankingAlgorithm = rankingAlgorithm;
		rankCorrelation = null;
	}

	public SpearmansCorrelation(final org.apache.commons.math3.linear.RealMatrix dataMatrix) {
		this(dataMatrix, new org.apache.commons.math3.stat.ranking.NaturalRanking());
	}

	public SpearmansCorrelation(final org.apache.commons.math3.linear.RealMatrix dataMatrix, final org.apache.commons.math3.stat.ranking.RankingAlgorithm rankingAlgorithm) {
		this.data = dataMatrix.copy();
		this.rankingAlgorithm = rankingAlgorithm;
		rankTransform(data);
		rankCorrelation = new org.apache.commons.math3.stat.correlation.PearsonsCorrelation(data);
	}

	public org.apache.commons.math3.linear.RealMatrix getCorrelationMatrix() {
		return rankCorrelation.getCorrelationMatrix();
	}

	public org.apache.commons.math3.stat.correlation.PearsonsCorrelation getRankCorrelation() {
		return rankCorrelation;
	}

	public org.apache.commons.math3.linear.RealMatrix computeCorrelationMatrix(org.apache.commons.math3.linear.RealMatrix matrix) {
		org.apache.commons.math3.linear.RealMatrix matrixCopy = matrix.copy();
		rankTransform(matrixCopy);
		return new org.apache.commons.math3.stat.correlation.PearsonsCorrelation().computeCorrelationMatrix(matrixCopy);
	}

	public org.apache.commons.math3.linear.RealMatrix computeCorrelationMatrix(double[][] matrix) {
		return computeCorrelationMatrix(new org.apache.commons.math3.linear.BlockRealMatrix(matrix));
	}

	public double correlation(final double[] xArray, final double[] yArray) {
		if ((xArray.length) != (yArray.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(xArray.length, yArray.length);
		}else
			if ((xArray.length) < 2) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION, xArray.length, 2);
			}else {
				return new org.apache.commons.math3.stat.correlation.PearsonsCorrelation().correlation(rankingAlgorithm.rank(xArray), rankingAlgorithm.rank(yArray));
			}
		
	}

	private void rankTransform(org.apache.commons.math3.linear.RealMatrix matrix) {
		for (int i = 0; i < (matrix.getColumnDimension()); i++) {
			matrix.setColumn(i, rankingAlgorithm.rank(matrix.getColumn(i)));
		}
	}
}


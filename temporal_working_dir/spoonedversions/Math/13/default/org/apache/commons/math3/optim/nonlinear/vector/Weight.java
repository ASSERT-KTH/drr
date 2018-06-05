

package org.apache.commons.math3.optim.nonlinear.vector;


public class Weight implements org.apache.commons.math3.optim.OptimizationData {
	private final org.apache.commons.math3.linear.RealMatrix weightMatrix;

	public Weight(double[] weight) {
		final int dim = weight.length;
		weightMatrix = new org.apache.commons.math3.linear.DiagonalMatrix(weight);
	}

	public Weight(org.apache.commons.math3.linear.RealMatrix weight) {
		if ((weight.getColumnDimension()) != (weight.getRowDimension())) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(weight.getColumnDimension(), weight.getRowDimension());
		}
		weightMatrix = weight.copy();
	}

	public org.apache.commons.math3.linear.RealMatrix getWeight() {
		return weightMatrix.copy();
	}
}


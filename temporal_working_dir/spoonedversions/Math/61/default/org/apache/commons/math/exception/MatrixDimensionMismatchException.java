

package org.apache.commons.math.exception;


public class MatrixDimensionMismatchException extends org.apache.commons.math.exception.MultiDimensionMismatchException {
	private static final long serialVersionUID = -8415396756375798143L;

	public MatrixDimensionMismatchException(int wrongRowDim, int wrongColDim, int expectedRowDim, int expectedColDim) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2, new java.lang.Integer[]{ wrongRowDim , wrongColDim }, new java.lang.Integer[]{ expectedRowDim , expectedColDim });
	}

	public int getWrongRowDimension() {
		return getWrongDimensions()[0];
	}

	public int getExpectedRowDimension() {
		return getExpectedDimensions()[0];
	}

	public int getWrongColumnDimension() {
		return getWrongDimensions()[1];
	}

	public int getExpectedColumnDimension() {
		return getExpectedDimensions()[1];
	}
}


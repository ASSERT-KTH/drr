

package org.apache.commons.math.linear;


public class RealMatrixImpl implements java.io.Serializable , org.apache.commons.math.linear.RealMatrix {
	private static final long serialVersionUID = 4970229902484487012L;

	protected double[][] data = null;

	protected double[][] lu = null;

	protected int[] permutation = null;

	protected int parity = 1;

	private static final double TOO_SMALL = 1.0E-11;

	public RealMatrixImpl() {
	}

	public RealMatrixImpl(int rowDimension, int columnDimension) {
		if ((rowDimension <= 0) || (columnDimension <= 0)) {
			throw new java.lang.IllegalArgumentException("row and column dimensions must be postive");
		}
		data = new double[rowDimension][columnDimension];
		lu = null;
	}

	public RealMatrixImpl(double[][] d) {
		copyIn(d);
		lu = null;
	}

	public RealMatrixImpl(double[][] d, boolean copyArray) {
		if (copyArray) {
			copyIn(d);
		}else {
			if (d == null) {
				throw new java.lang.NullPointerException();
			}
			final int nRows = d.length;
			if (nRows == 0) {
				throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
			}
			final int nCols = d[0].length;
			if (nCols == 0) {
				throw new java.lang.IllegalArgumentException("Matrix must have at least one column.");
			}
			for (int r = 1; r < nRows; r++) {
				if ((d[r].length) != nCols) {
					throw new java.lang.IllegalArgumentException("All input rows must have the same length.");
				}
			}
			data = d;
		}
		lu = null;
	}

	public RealMatrixImpl(double[] v) {
		final int nRows = v.length;
		data = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = v[row];
		}
	}

	public org.apache.commons.math.linear.RealMatrix copy() {
		return new org.apache.commons.math.linear.RealMatrixImpl(copyOut(), false);
	}

	public org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return add(((org.apache.commons.math.linear.RealMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			final int rowCount = getRowDimension();
			final int columnCount = getColumnDimension();
			if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
				throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
			}
			final double[][] outData = new double[rowCount][columnCount];
			for (int row = 0; row < rowCount; row++) {
				final double[] dataRow = data[row];
				final double[] outDataRow = outData[row];
				for (int col = 0; col < columnCount; col++) {
					outDataRow[col] = (dataRow[col]) + (m.getEntry(row, col));
				}
			}
			return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.RealMatrixImpl add(org.apache.commons.math.linear.RealMatrixImpl m) throws java.lang.IllegalArgumentException {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] mRow = m.data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) + (mRow[col]);
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix subtract(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return subtract(((org.apache.commons.math.linear.RealMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			final int rowCount = getRowDimension();
			final int columnCount = getColumnDimension();
			if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
				throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
			}
			final double[][] outData = new double[rowCount][columnCount];
			for (int row = 0; row < rowCount; row++) {
				final double[] dataRow = data[row];
				final double[] outDataRow = outData[row];
				for (int col = 0; col < columnCount; col++) {
					outDataRow[col] = (dataRow[col]) - (m.getEntry(row, col));
				}
			}
			return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.RealMatrixImpl subtract(org.apache.commons.math.linear.RealMatrixImpl m) throws java.lang.IllegalArgumentException {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] mRow = m.data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) - (mRow[col]);
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix scalarAdd(double d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) + d;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix scalarMultiply(double d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final double[] dataRow = data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = (dataRow[col]) * d;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix multiply(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return multiply(((org.apache.commons.math.linear.RealMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			if ((org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
				throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
			}
			final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
			final int nCols = m.getColumnDimension();
			final int nSum = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
			final double[][] outData = new double[nRows][nCols];
			for (int row = 0; row < nRows; row++) {
				final double[] dataRow = data[row];
				final double[] outDataRow = outData[row];
				for (int col = 0; col < nCols; col++) {
					double sum = 0;
					for (int i = 0; i < nSum; i++) {
						sum += (dataRow[i]) * (m.getEntry(i, col));
					}
					outDataRow[col] = sum;
				}
			}
			return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.RealMatrixImpl multiply(org.apache.commons.math.linear.RealMatrixImpl m) throws java.lang.IllegalArgumentException {
		if ((org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
		}
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final int nCols = m.getColumnDimension();
		final int nSum = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		final double[][] outData = new double[nRows][nCols];
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			final double[] outDataRow = outData[row];
			for (int col = 0; col < nCols; col++) {
				double sum = 0;
				for (int i = 0; i < nSum; i++) {
					sum += (dataRow[i]) * (m.data[i][col]);
				}
				outDataRow[col] = sum;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix preMultiply(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		return m.multiply(org.apache.commons.math.linear.RealMatrixImpl.this);
	}

	public double[][] getData() {
		return copyOut();
	}

	public double[][] getDataRef() {
		return data;
	}

	public double getNorm() {
		double maxColSum = 0;
		for (int col = 0; col < (org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()); col++) {
			double sum = 0;
			for (int row = 0; row < (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()); row++) {
				sum += java.lang.Math.abs(data[row][col]);
			}
			maxColSum = java.lang.Math.max(maxColSum, sum);
		}
		return maxColSum;
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math.linear.MatrixIndexException {
		if ((((((startRow < 0) || (startRow > endRow)) || (endRow > (data.length))) || (startColumn < 0)) || (startColumn > endColumn)) || (endColumn > (data[0].length))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		}
		final double[][] subMatrixData = new double[(endRow - startRow) + 1][(endColumn - startColumn) + 1];
		for (int i = startRow; i <= endRow; i++) {
			java.lang.System.arraycopy(data[i], startColumn, subMatrixData[(i - startRow)], 0, ((endColumn - startColumn) + 1));
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(subMatrixData, false);
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math.linear.MatrixIndexException {
		if (((selectedRows.length) * (selectedColumns.length)) == 0) {
			throw new org.apache.commons.math.linear.MatrixIndexException("selected row and column index arrays must be non-empty");
		}
		final double[][] subMatrixData = new double[selectedRows.length][selectedColumns.length];
		try {
			for (int i = 0; i < (selectedRows.length); i++) {
				final double[] subI = subMatrixData[i];
				final double[] dataSelectedI = data[selectedRows[i]];
				for (int j = 0; j < (selectedColumns.length); j++) {
					subI[j] = dataSelectedI[selectedColumns[j]];
				}
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix dimension mismatch");
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(subMatrixData, false);
	}

	public void setSubMatrix(double[][] subMatrix, int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if ((row < 0) || (column < 0)) {
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		}
		final int nRows = subMatrix.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		final int nCols = subMatrix[0].length;
		if (nCols == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one column.");
		}
		for (int r = 1; r < nRows; r++) {
			if ((subMatrix[r].length) != nCols) {
				throw new java.lang.IllegalArgumentException("All input rows must have the same length.");
			}
		}
		if ((data) == null) {
			if ((row > 0) || (column > 0))
				throw new org.apache.commons.math.linear.MatrixIndexException("matrix must be initialized to perfom this method");
			
			data = new double[nRows][nCols];
			java.lang.System.arraycopy(subMatrix, 0, data, 0, subMatrix.length);
		}
		if (((nRows + row) > (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension())) || ((nCols + column) > (org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension())))
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(subMatrix[i], 0, data[(row + i)], column, nCols);
		}
		lu = null;
	}

	public org.apache.commons.math.linear.RealMatrix getRowMatrix(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		final int ncols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		final double[][] out = new double[1][ncols];
		java.lang.System.arraycopy(data[row], 0, out[0], 0, ncols);
		return new org.apache.commons.math.linear.RealMatrixImpl(out, false);
	}

	public org.apache.commons.math.linear.RealMatrix getColumnMatrix(int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final double[][] out = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			out[row][0] = data[row][column];
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(out, false);
	}

	public org.apache.commons.math.linear.RealVector getColumnVector(int column) throws org.apache.commons.math.linear.MatrixIndexException {
		return new org.apache.commons.math.linear.RealVectorImpl(getColumn(column), false);
	}

	public org.apache.commons.math.linear.RealVector getRowVector(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		return new org.apache.commons.math.linear.RealVectorImpl(getRow(row), false);
	}

	public double[] getRow(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		final int ncols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		final double[] out = new double[ncols];
		java.lang.System.arraycopy(data[row], 0, out, 0, ncols);
		return out;
	}

	public double[] getColumn(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final double[] out = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			out[row] = data[row][col];
		}
		return out;
	}

	public double getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			return data[row][column];
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix entry does not exist");
		}
	}

	public org.apache.commons.math.linear.RealMatrix transpose() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final double[][] outData = new double[nCols][nRows];
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				outData[col][row] = dataRow[col];
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.RealMatrix inverse() throws org.apache.commons.math.linear.InvalidMatrixException {
		return solve(org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(getRowDimension()));
	}

	public double getDeterminant() throws org.apache.commons.math.linear.InvalidMatrixException {
		if (!(isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("matrix is not square");
		}
		if (isSingular()) {
			return 0.0;
		}else {
			double det = parity;
			for (int i = 0; i < (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()); i++) {
				det *= lu[i][i];
			}
			return det;
		}
	}

	public boolean isSquare() {
		return (org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) == (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension());
	}

	public boolean isSingular() {
		if ((lu) == null) {
			try {
				luDecompose();
				return false;
			} catch (org.apache.commons.math.linear.InvalidMatrixException ex) {
				return true;
			}
		}else {
			return false;
		}
	}

	public int getRowDimension() {
		return data.length;
	}

	public int getColumnDimension() {
		return data[0].length;
	}

	public double getTrace() throws java.lang.IllegalArgumentException {
		if (!(isSquare())) {
			throw new java.lang.IllegalArgumentException("matrix is not square");
		}
		double trace = data[0][0];
		for (int i = 1; i < (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()); i++) {
			trace += data[i][i];
		}
		return trace;
	}

	public double[] operate(double[] v) throws java.lang.IllegalArgumentException {
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		if ((v.length) != nCols) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		final double[] out = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			double sum = 0;
			for (int i = 0; i < nCols; i++) {
				sum += (dataRow[i]) * (v[i]);
			}
			out[row] = sum;
		}
		return out;
	}

	public org.apache.commons.math.linear.RealVector operate(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		try {
			return operate(((org.apache.commons.math.linear.RealVectorImpl) (v)));
		} catch (java.lang.ClassCastException cce) {
			final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
			final int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
			if ((v.getDimension()) != nCols) {
				throw new java.lang.IllegalArgumentException("vector has wrong length");
			}
			final double[] out = new double[nRows];
			for (int row = 0; row < nRows; row++) {
				final double[] dataRow = data[row];
				double sum = 0;
				for (int i = 0; i < nCols; i++) {
					sum += (dataRow[i]) * (v.getEntry(i));
				}
				out[row] = sum;
			}
			return new org.apache.commons.math.linear.RealVectorImpl(out, false);
		}
	}

	public org.apache.commons.math.linear.RealVectorImpl operate(org.apache.commons.math.linear.RealVectorImpl v) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.RealVectorImpl(operate(v.getDataRef()), false);
	}

	public double[] preMultiply(double[] v) throws java.lang.IllegalArgumentException {
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		if ((v.length) != nRows) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		final int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		final double[] out = new double[nCols];
		for (int col = 0; col < nCols; col++) {
			double sum = 0;
			for (int i = 0; i < nRows; i++) {
				sum += (data[i][col]) * (v[i]);
			}
			out[col] = sum;
		}
		return out;
	}

	public org.apache.commons.math.linear.RealVector preMultiply(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		try {
			return preMultiply(((org.apache.commons.math.linear.RealVectorImpl) (v)));
		} catch (java.lang.ClassCastException cce) {
			final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
			if ((v.getDimension()) != nRows) {
				throw new java.lang.IllegalArgumentException("vector has wrong length");
			}
			final int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
			final double[] out = new double[nCols];
			for (int col = 0; col < nCols; col++) {
				double sum = 0;
				for (int i = 0; i < nRows; i++) {
					sum += (data[i][col]) * (v.getEntry(i));
				}
				out[col] = sum;
			}
			return new org.apache.commons.math.linear.RealVectorImpl(out, false);
		}
	}

	org.apache.commons.math.linear.RealVectorImpl preMultiply(org.apache.commons.math.linear.RealVectorImpl v) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.RealVectorImpl(preMultiply(v.getDataRef()), false);
	}

	public double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final int nCol = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		if ((b.length) != nRows) {
			throw new java.lang.IllegalArgumentException("constant vector has wrong length");
		}
		if (!(isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("coefficient matrix is not square");
		}
		if (isSingular()) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
		}
		final double[] bp = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			bp[row] = b[permutation[row]];
		}
		for (int col = 0; col < nCol; col++) {
			for (int i = col + 1; i < nCol; i++) {
				bp[i] -= (bp[col]) * (lu[i][col]);
			}
		}
		for (int col = nCol - 1; col >= 0; col--) {
			bp[col] /= lu[col][col];
			for (int i = 0; i < col; i++) {
				bp[i] -= (bp[col]) * (lu[i][col]);
			}
		}
		return bp;
	}

	public org.apache.commons.math.linear.RealVector solve(org.apache.commons.math.linear.RealVector b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		try {
			return solve(((org.apache.commons.math.linear.RealVectorImpl) (b)));
		} catch (java.lang.ClassCastException cce) {
			final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
			final int nCol = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
			if ((b.getDimension()) != nRows) {
				throw new java.lang.IllegalArgumentException("constant vector has wrong length");
			}
			if (!(isSquare())) {
				throw new org.apache.commons.math.linear.InvalidMatrixException("coefficient matrix is not square");
			}
			if (isSingular()) {
				throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
			}
			final double[] bp = new double[nRows];
			for (int row = 0; row < nRows; row++) {
				bp[row] = b.getEntry(permutation[row]);
			}
			for (int col = 0; col < nCol; col++) {
				for (int i = col + 1; i < nCol; i++) {
					bp[i] -= (bp[col]) * (lu[i][col]);
				}
			}
			for (int col = nCol - 1; col >= 0; col--) {
				bp[col] /= lu[col][col];
				for (int i = 0; i < col; i++) {
					bp[i] -= (bp[col]) * (lu[i][col]);
				}
			}
			return new org.apache.commons.math.linear.RealVectorImpl(bp, false);
		}
	}

	org.apache.commons.math.linear.RealVectorImpl solve(org.apache.commons.math.linear.RealVectorImpl b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		return new org.apache.commons.math.linear.RealVectorImpl(solve(b.getDataRef()), false);
	}

	public org.apache.commons.math.linear.RealMatrix solve(org.apache.commons.math.linear.RealMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.getRowDimension()) != (org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (!(org.apache.commons.math.linear.RealMatrixImpl.this.isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("coefficient matrix is not square");
		}
		if (org.apache.commons.math.linear.RealMatrixImpl.this.isSingular()) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
		}
		final int nCol = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		final int nColB = b.getColumnDimension();
		final int nRowB = b.getRowDimension();
		final double[][] bp = new double[nRowB][nColB];
		for (int row = 0; row < nRowB; row++) {
			final double[] bpRow = bp[row];
			final int pRow = permutation[row];
			for (int col = 0; col < nColB; col++) {
				bpRow[col] = b.getEntry(pRow, col);
			}
		}
		for (int col = 0; col < nCol; col++) {
			final double[] bpCol = bp[col];
			for (int i = col + 1; i < nCol; i++) {
				final double[] bpI = bp[i];
				final double luICol = lu[i][col];
				for (int j = 0; j < nColB; j++) {
					bpI[j] -= (bpCol[j]) * luICol;
				}
			}
		}
		for (int col = nCol - 1; col >= 0; col--) {
			final double[] bpCol = bp[col];
			final double luDiag = lu[col][col];
			for (int j = 0; j < nColB; j++) {
				bpCol[j] /= luDiag;
			}
			for (int i = 0; i < col; i++) {
				final double[] bpI = bp[i];
				final double luICol = lu[i][col];
				for (int j = 0; j < nColB; j++) {
					bpI[j] -= (bpCol[j]) * luICol;
				}
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(bp, false);
	}

	public void luDecompose() throws org.apache.commons.math.linear.InvalidMatrixException {
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		if (nRows != nCols) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("LU decomposition requires that the matrix be square.");
		}
		lu = getData();
		permutation = new int[nRows];
		for (int row = 0; row < nRows; row++) {
			permutation[row] = row;
		}
		parity = 1;
		for (int col = 0; col < nCols; col++) {
			double sum = 0;
			for (int row = 0; row < col; row++) {
				final double[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < row; i++) {
					sum -= (luRow[i]) * (lu[i][col]);
				}
				luRow[col] = sum;
			}
			int max = col;
			double largest = 0.0;
			for (int row = col; row < nRows; row++) {
				final double[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < col; i++) {
					sum -= (luRow[i]) * (lu[i][col]);
				}
				luRow[col] = sum;
				if ((java.lang.Math.abs(sum)) > largest) {
					largest = java.lang.Math.abs(sum);
					max = row;
				}
			}
			if ((java.lang.Math.abs(lu[max][col])) < (org.apache.commons.math.linear.RealMatrixImpl.TOO_SMALL)) {
				lu = null;
				throw new org.apache.commons.math.linear.InvalidMatrixException("matrix is singular");
			}
			if (max != col) {
				double tmp = 0;
				for (int i = 0; i < nCols; i++) {
					tmp = lu[max][i];
					lu[max][i] = lu[col][i];
					lu[col][i] = tmp;
				}
				int temp = permutation[max];
				permutation[max] = permutation[col];
				permutation[col] = temp;
				parity = -(parity);
			}
			final double luDiag = lu[col][col];
			for (int row = col + 1; row < nRows; row++) {
				lu[row][col] /= luDiag;
			}
		}
	}

	public java.lang.String toString() {
		java.lang.StringBuffer res = new java.lang.StringBuffer();
		res.append("RealMatrixImpl{");
		if ((data) != null) {
			for (int i = 0; i < (data.length); i++) {
				if (i > 0) {
					res.append(",");
				}
				res.append("{");
				for (int j = 0; j < (data[0].length); j++) {
					if (j > 0) {
						res.append(",");
					}
					res.append(data[i][j]);
				}
				res.append("}");
			}
		}
		res.append("}");
		return res.toString();
	}

	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math.linear.RealMatrixImpl.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.linear.RealMatrixImpl) == false) {
			return false;
		}
		org.apache.commons.math.linear.RealMatrix m = ((org.apache.commons.math.linear.RealMatrix) (object));
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				if ((dataRow[col]) != (m.getEntry(row, col))) {
					return false;
				}
			}
		}
		return true;
	}

	public int hashCode() {
		int ret = 7;
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		ret = (ret * 31) + nRows;
		ret = (ret * 31) + nCols;
		for (int row = 0; row < nRows; row++) {
			final double[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (org.apache.commons.math.util.MathUtils.hash(dataRow[col])));
			}
		}
		return ret;
	}

	protected org.apache.commons.math.linear.RealMatrix getLUMatrix() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((lu) == null) {
			luDecompose();
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(lu);
	}

	protected int[] getPermutation() {
		final int[] out = new int[permutation.length];
		java.lang.System.arraycopy(permutation, 0, out, 0, permutation.length);
		return out;
	}

	private double[][] copyOut() {
		final int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		final double[][] out = new double[nRows][org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()];
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(data[i], 0, out[i], 0, data[i].length);
		}
		return out;
	}

	private void copyIn(double[][] in) {
		setSubMatrix(in, 0, 0);
	}

	private boolean isValidCoordinate(int row, int col) {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		return !((((row < 0) || (row > (nRows - 1))) || (col < 0)) || (col > (nCols - 1)));
	}
}


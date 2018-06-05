

package org.apache.commons.math.linear;


public class BigMatrixImpl implements java.io.Serializable , org.apache.commons.math.linear.BigMatrix {
	private static final long serialVersionUID = -1011428905656140431L;

	protected java.math.BigDecimal[][] data = null;

	protected java.math.BigDecimal[][] lu = null;

	protected int[] permutation = null;

	protected int parity = 1;

	private int roundingMode = java.math.BigDecimal.ROUND_HALF_UP;

	private int scale = 64;

	private static final java.math.BigDecimal TOO_SMALL = new java.math.BigDecimal(1.0E-11);

	static final java.math.BigDecimal ZERO = new java.math.BigDecimal(0);

	static final java.math.BigDecimal ONE = new java.math.BigDecimal(1);

	public BigMatrixImpl() {
	}

	public BigMatrixImpl(int rowDimension, int columnDimension) {
		if ((rowDimension <= 0) || (columnDimension <= 0)) {
			throw new java.lang.IllegalArgumentException("row and column dimensions must be positive");
		}
		data = new java.math.BigDecimal[rowDimension][columnDimension];
		lu = null;
	}

	public BigMatrixImpl(java.math.BigDecimal[][] d) {
		org.apache.commons.math.linear.BigMatrixImpl.this.copyIn(d);
		lu = null;
	}

	public BigMatrixImpl(java.math.BigDecimal[][] d, boolean copyArray) {
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

	public BigMatrixImpl(double[][] d) {
		final int nRows = d.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		final int nCols = d[0].length;
		if (nCols == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one column.");
		}
		for (int row = 1; row < nRows; row++) {
			if ((d[row].length) != nCols) {
				throw new java.lang.IllegalArgumentException("All input rows must have the same length.");
			}
		}
		org.apache.commons.math.linear.BigMatrixImpl.this.copyIn(d);
		lu = null;
	}

	public BigMatrixImpl(java.lang.String[][] d) {
		final int nRows = d.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		final int nCols = d[0].length;
		if (nCols == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one column.");
		}
		for (int row = 1; row < nRows; row++) {
			if ((d[row].length) != nCols) {
				throw new java.lang.IllegalArgumentException("All input rows must have the same length.");
			}
		}
		org.apache.commons.math.linear.BigMatrixImpl.this.copyIn(d);
		lu = null;
	}

	public BigMatrixImpl(java.math.BigDecimal[] v) {
		final int nRows = v.length;
		data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = v[row];
		}
	}

	public org.apache.commons.math.linear.BigMatrix copy() {
		return new org.apache.commons.math.linear.BigMatrixImpl(org.apache.commons.math.linear.BigMatrixImpl.this.copyOut(), false);
	}

	public org.apache.commons.math.linear.BigMatrix add(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return add(((org.apache.commons.math.linear.BigMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			final int rowCount = getRowDimension();
			final int columnCount = getColumnDimension();
			if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
				throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
			}
			final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
			for (int row = 0; row < rowCount; row++) {
				final java.math.BigDecimal[] dataRow = data[row];
				final java.math.BigDecimal[] outDataRow = outData[row];
				for (int col = 0; col < columnCount; col++) {
					outDataRow[col] = dataRow[col].add(m.getEntry(row, col));
				}
			}
			return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.BigMatrixImpl add(org.apache.commons.math.linear.BigMatrixImpl m) throws java.lang.IllegalArgumentException {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			final java.math.BigDecimal[] mRow = m.data[row];
			final java.math.BigDecimal[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = dataRow[col].add(mRow[col]);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix subtract(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return subtract(((org.apache.commons.math.linear.BigMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			final int rowCount = getRowDimension();
			final int columnCount = getColumnDimension();
			if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
				throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
			}
			final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
			for (int row = 0; row < rowCount; row++) {
				final java.math.BigDecimal[] dataRow = data[row];
				final java.math.BigDecimal[] outDataRow = outData[row];
				for (int col = 0; col < columnCount; col++) {
					outDataRow[col] = dataRow[col].subtract(getEntry(row, col));
				}
			}
			return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.BigMatrixImpl subtract(org.apache.commons.math.linear.BigMatrixImpl m) throws java.lang.IllegalArgumentException {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		if ((columnCount != (m.getColumnDimension())) || (rowCount != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			final java.math.BigDecimal[] mRow = m.data[row];
			final java.math.BigDecimal[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = dataRow[col].subtract(mRow[col]);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix scalarAdd(java.math.BigDecimal d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			final java.math.BigDecimal[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = dataRow[col].add(d);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix scalarMultiply(java.math.BigDecimal d) {
		final int rowCount = getRowDimension();
		final int columnCount = getColumnDimension();
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			final java.math.BigDecimal[] outDataRow = outData[row];
			for (int col = 0; col < columnCount; col++) {
				outDataRow[col] = dataRow[col].multiply(d);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix multiply(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return multiply(((org.apache.commons.math.linear.BigMatrixImpl) (m)));
		} catch (java.lang.ClassCastException cce) {
			if ((org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
				throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
			}
			final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
			final int nCols = m.getColumnDimension();
			final int nSum = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
			final java.math.BigDecimal[][] outData = new java.math.BigDecimal[nRows][nCols];
			for (int row = 0; row < nRows; row++) {
				final java.math.BigDecimal[] dataRow = data[row];
				final java.math.BigDecimal[] outDataRow = outData[row];
				for (int col = 0; col < nCols; col++) {
					java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
					for (int i = 0; i < nSum; i++) {
						sum = sum.add(dataRow[i].multiply(m.getEntry(i, col)));
					}
					outDataRow[col] = sum;
				}
			}
			return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
		}
	}

	public org.apache.commons.math.linear.BigMatrixImpl multiply(org.apache.commons.math.linear.BigMatrixImpl m) throws java.lang.IllegalArgumentException {
		if ((org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
		}
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final int nCols = m.getColumnDimension();
		final int nSum = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[nRows][nCols];
		for (int row = 0; row < nRows; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			final java.math.BigDecimal[] outDataRow = outData[row];
			for (int col = 0; col < nCols; col++) {
				java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
				for (int i = 0; i < nSum; i++) {
					sum = sum.add(dataRow[i].multiply(m.data[i][col]));
				}
				outDataRow[col] = sum;
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix preMultiply(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		return m.multiply(org.apache.commons.math.linear.BigMatrixImpl.this);
	}

	public java.math.BigDecimal[][] getData() {
		return copyOut();
	}

	public double[][] getDataAsDoubleArray() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final double[][] d = new double[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				d[i][j] = data[i][j].doubleValue();
			}
		}
		return d;
	}

	public java.math.BigDecimal[][] getDataRef() {
		return data;
	}

	public int getRoundingMode() {
		return roundingMode;
	}

	public void setRoundingMode(int roundingMode) {
		org.apache.commons.math.linear.BigMatrixImpl.this.roundingMode = roundingMode;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		org.apache.commons.math.linear.BigMatrixImpl.this.scale = scale;
	}

	public java.math.BigDecimal getNorm() {
		java.math.BigDecimal maxColSum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
		for (int col = 0; col < (org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()); col++) {
			java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int row = 0; row < (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()); row++) {
				sum = sum.add(data[row][col].abs());
			}
			maxColSum = maxColSum.max(sum);
		}
		return maxColSum;
	}

	public org.apache.commons.math.linear.BigMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) throws org.apache.commons.math.linear.MatrixIndexException {
		if ((((((startRow < 0) || (startRow > endRow)) || (endRow > (data.length))) || (startColumn < 0)) || (startColumn > endColumn)) || (endColumn > (data[0].length))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		}
		final java.math.BigDecimal[][] subMatrixData = new java.math.BigDecimal[(endRow - startRow) + 1][(endColumn - startColumn) + 1];
		for (int i = startRow; i <= endRow; i++) {
			java.lang.System.arraycopy(data[i], startColumn, subMatrixData[(i - startRow)], 0, ((endColumn - startColumn) + 1));
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(subMatrixData, false);
	}

	public org.apache.commons.math.linear.BigMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math.linear.MatrixIndexException {
		if (((selectedRows.length) * (selectedColumns.length)) == 0) {
			throw new org.apache.commons.math.linear.MatrixIndexException("selected row and column index arrays must be non-empty");
		}
		final java.math.BigDecimal[][] subMatrixData = new java.math.BigDecimal[selectedRows.length][selectedColumns.length];
		try {
			for (int i = 0; i < (selectedRows.length); i++) {
				final java.math.BigDecimal[] subI = subMatrixData[i];
				final java.math.BigDecimal[] dataSelectedI = data[selectedRows[i]];
				for (int j = 0; j < (selectedColumns.length); j++) {
					subI[j] = dataSelectedI[selectedColumns[j]];
				}
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix dimension mismatch");
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(subMatrixData, false);
	}

	public void setSubMatrix(java.math.BigDecimal[][] subMatrix, int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
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
			
			data = new java.math.BigDecimal[nRows][nCols];
			java.lang.System.arraycopy(subMatrix, 0, data, 0, subMatrix.length);
		}
		if (((nRows + row) > (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension())) || ((nCols + column) > (org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension())))
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(subMatrix[i], 0, data[(row + i)], column, nCols);
		}
		lu = null;
	}

	public org.apache.commons.math.linear.BigMatrix getRowMatrix(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		final int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[][] out = new java.math.BigDecimal[1][ncols];
		java.lang.System.arraycopy(data[row], 0, out[0], 0, ncols);
		return new org.apache.commons.math.linear.BigMatrixImpl(out, false);
	}

	public org.apache.commons.math.linear.BigMatrix getColumnMatrix(int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final java.math.BigDecimal[][] out = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			out[row][0] = data[row][column];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(out, false);
	}

	public java.math.BigDecimal[] getRow(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		final int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[] out = new java.math.BigDecimal[ncols];
		java.lang.System.arraycopy(data[row], 0, out, 0, ncols);
		return out;
	}

	public double[] getRowAsDoubleArray(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		final int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final double[] out = new double[ncols];
		for (int i = 0; i < ncols; i++) {
			out[i] = data[row][i].doubleValue();
		}
		return out;
	}

	public java.math.BigDecimal[] getColumn(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final java.math.BigDecimal[] out = new java.math.BigDecimal[nRows];
		for (int i = 0; i < nRows; i++) {
			out[i] = data[i][col];
		}
		return out;
	}

	public double[] getColumnAsDoubleArray(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		final int nrows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final double[] out = new double[nrows];
		for (int i = 0; i < nrows; i++) {
			out[i] = data[i][col].doubleValue();
		}
		return out;
	}

	public java.math.BigDecimal getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			return data[row][column];
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix entry does not exist");
		}
	}

	public double getEntryAsDouble(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		return getEntry(row, column).doubleValue();
	}

	public org.apache.commons.math.linear.BigMatrix transpose() {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[][] outData = new java.math.BigDecimal[nCols][nRows];
		for (int row = 0; row < nRows; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				outData[col][row] = dataRow[col];
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData, false);
	}

	public org.apache.commons.math.linear.BigMatrix inverse() throws org.apache.commons.math.linear.InvalidMatrixException {
		return solve(org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(getRowDimension()));
	}

	public java.math.BigDecimal getDeterminant() throws org.apache.commons.math.linear.InvalidMatrixException {
		if (!(isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("matrix is not square");
		}
		if (isSingular()) {
			return org.apache.commons.math.linear.BigMatrixImpl.ZERO;
		}else {
			java.math.BigDecimal det = (parity) == 1 ? org.apache.commons.math.linear.BigMatrixImpl.ONE : org.apache.commons.math.linear.BigMatrixImpl.ONE.negate();
			for (int i = 0; i < (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()); i++) {
				det = det.multiply(lu[i][i]);
			}
			return det;
		}
	}

	public boolean isSquare() {
		return (org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) == (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension());
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

	public java.math.BigDecimal getTrace() throws java.lang.IllegalArgumentException {
		if (!(isSquare())) {
			throw new java.lang.IllegalArgumentException("matrix is not square");
		}
		java.math.BigDecimal trace = data[0][0];
		for (int i = 1; i < (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()); i++) {
			trace = trace.add(data[i][i]);
		}
		return trace;
	}

	public java.math.BigDecimal[] operate(java.math.BigDecimal[] v) throws java.lang.IllegalArgumentException {
		if ((v.length) != (org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension())) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[] out = new java.math.BigDecimal[v.length];
		for (int row = 0; row < nRows; row++) {
			java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int i = 0; i < nCols; i++) {
				sum = sum.add(data[row][i].multiply(v[i]));
			}
			out[row] = sum;
		}
		return out;
	}

	public java.math.BigDecimal[] operate(double[] v) throws java.lang.IllegalArgumentException {
		final java.math.BigDecimal[] bd = new java.math.BigDecimal[v.length];
		for (int i = 0; i < (bd.length); i++) {
			bd[i] = new java.math.BigDecimal(v[i]);
		}
		return operate(bd);
	}

	public java.math.BigDecimal[] preMultiply(java.math.BigDecimal[] v) throws java.lang.IllegalArgumentException {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		if ((v.length) != nRows) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		final int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final java.math.BigDecimal[] out = new java.math.BigDecimal[nCols];
		for (int col = 0; col < nCols; col++) {
			java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int i = 0; i < nRows; i++) {
				sum = sum.add(data[i][col].multiply(v[i]));
			}
			out[col] = sum;
		}
		return out;
	}

	public java.math.BigDecimal[] solve(java.math.BigDecimal[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		if ((b.length) != nRows) {
			throw new java.lang.IllegalArgumentException("constant vector has wrong length");
		}
		final org.apache.commons.math.linear.BigMatrix bMatrix = new org.apache.commons.math.linear.BigMatrixImpl(b);
		final java.math.BigDecimal[][] solution = ((org.apache.commons.math.linear.BigMatrixImpl) (solve(bMatrix))).getDataRef();
		final java.math.BigDecimal[] out = new java.math.BigDecimal[nRows];
		for (int row = 0; row < nRows; row++) {
			out[row] = solution[row][0];
		}
		return out;
	}

	public java.math.BigDecimal[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		final java.math.BigDecimal[] bd = new java.math.BigDecimal[b.length];
		for (int i = 0; i < (bd.length); i++) {
			bd[i] = new java.math.BigDecimal(b[i]);
		}
		return solve(bd);
	}

	public org.apache.commons.math.linear.BigMatrix solve(org.apache.commons.math.linear.BigMatrix b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		if ((b.getRowDimension()) != (org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Incorrect row dimension");
		}
		if (!(org.apache.commons.math.linear.BigMatrixImpl.this.isSquare())) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("coefficient matrix is not square");
		}
		if (org.apache.commons.math.linear.BigMatrixImpl.this.isSingular()) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("Matrix is singular.");
		}
		final int nCol = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		final int nColB = b.getColumnDimension();
		final int nRowB = b.getRowDimension();
		final java.math.BigDecimal[][] bp = new java.math.BigDecimal[nRowB][nColB];
		for (int row = 0; row < nRowB; row++) {
			final java.math.BigDecimal[] bpRow = bp[row];
			for (int col = 0; col < nColB; col++) {
				bpRow[col] = b.getEntry(permutation[row], col);
			}
		}
		for (int col = 0; col < nCol; col++) {
			for (int i = col + 1; i < nCol; i++) {
				final java.math.BigDecimal[] bpI = bp[i];
				final java.math.BigDecimal[] luI = lu[i];
				for (int j = 0; j < nColB; j++) {
					bpI[j] = bpI[j].subtract(bp[col][j].multiply(luI[col]));
				}
			}
		}
		for (int col = nCol - 1; col >= 0; col--) {
			final java.math.BigDecimal[] bpCol = bp[col];
			final java.math.BigDecimal luDiag = lu[col][col];
			for (int j = 0; j < nColB; j++) {
				bpCol[j] = bpCol[j].divide(luDiag, scale, roundingMode);
			}
			for (int i = 0; i < col; i++) {
				final java.math.BigDecimal[] bpI = bp[i];
				final java.math.BigDecimal[] luI = lu[i];
				for (int j = 0; j < nColB; j++) {
					bpI[j] = bpI[j].subtract(bp[col][j].multiply(luI[col]));
				}
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(bp, false);
	}

	public void luDecompose() throws org.apache.commons.math.linear.InvalidMatrixException {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		if (nRows != nCols) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("LU decomposition requires that the matrix be square.");
		}
		lu = org.apache.commons.math.linear.BigMatrixImpl.this.getData();
		permutation = new int[nRows];
		for (int row = 0; row < nRows; row++) {
			permutation[row] = row;
		}
		parity = 1;
		for (int col = 0; col < nCols; col++) {
			java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int row = 0; row < col; row++) {
				final java.math.BigDecimal[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < row; i++) {
					sum = sum.subtract(luRow[i].multiply(lu[i][col]));
				}
				luRow[col] = sum;
			}
			int max = col;
			java.math.BigDecimal largest = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int row = col; row < nRows; row++) {
				final java.math.BigDecimal[] luRow = lu[row];
				sum = luRow[col];
				for (int i = 0; i < col; i++) {
					sum = sum.subtract(luRow[i].multiply(lu[i][col]));
				}
				luRow[col] = sum;
				if ((sum.abs().compareTo(largest)) == 1) {
					largest = sum.abs();
					max = row;
				}
			}
			if ((lu[max][col].abs().compareTo(org.apache.commons.math.linear.BigMatrixImpl.TOO_SMALL)) <= 0) {
				lu = null;
				throw new org.apache.commons.math.linear.InvalidMatrixException("matrix is singular");
			}
			if (max != col) {
				java.math.BigDecimal tmp = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
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
			final java.math.BigDecimal luDiag = lu[col][col];
			for (int row = col + 1; row < nRows; row++) {
				final java.math.BigDecimal[] luRow = lu[row];
				luRow[col] = luRow[col].divide(luDiag, scale, roundingMode);
			}
		}
	}

	public java.lang.String toString() {
		java.lang.StringBuffer res = new java.lang.StringBuffer();
		res.append("BigMatrixImpl{");
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
		if (object == (org.apache.commons.math.linear.BigMatrixImpl.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.linear.BigMatrixImpl) == false) {
			return false;
		}
		final org.apache.commons.math.linear.BigMatrix m = ((org.apache.commons.math.linear.BigMatrix) (object));
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; row++) {
			final java.math.BigDecimal[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				if (!(dataRow[col].equals(m.getEntry(row, col)))) {
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
			final java.math.BigDecimal[] dataRow = data[row];
			for (int col = 0; col < nCols; col++) {
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (dataRow[col].hashCode()));
			}
		}
		return ret;
	}

	protected org.apache.commons.math.linear.BigMatrix getLUMatrix() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((lu) == null) {
			luDecompose();
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(lu);
	}

	protected int[] getPermutation() {
		final int[] out = new int[permutation.length];
		java.lang.System.arraycopy(permutation, 0, out, 0, permutation.length);
		return out;
	}

	private java.math.BigDecimal[][] copyOut() {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final java.math.BigDecimal[][] out = new java.math.BigDecimal[nRows][org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()];
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(data[i], 0, out[i], 0, data[i].length);
		}
		return out;
	}

	private void copyIn(java.math.BigDecimal[][] in) {
		setSubMatrix(in, 0, 0);
	}

	private void copyIn(double[][] in) {
		final int nRows = in.length;
		final int nCols = in[0].length;
		data = new java.math.BigDecimal[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			final java.math.BigDecimal[] dataI = data[i];
			final double[] inI = in[i];
			for (int j = 0; j < nCols; j++) {
				dataI[j] = new java.math.BigDecimal(inI[j]);
			}
		}
		lu = null;
	}

	private void copyIn(java.lang.String[][] in) {
		final int nRows = in.length;
		final int nCols = in[0].length;
		data = new java.math.BigDecimal[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			final java.math.BigDecimal[] dataI = data[i];
			final java.lang.String[] inI = in[i];
			for (int j = 0; j < nCols; j++) {
				dataI[j] = new java.math.BigDecimal(inI[j]);
			}
		}
		lu = null;
	}

	private boolean isValidCoordinate(int row, int col) {
		final int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		final int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		return !((((row < 0) || (row >= nRows)) || (col < 0)) || (col >= nCols));
	}
}


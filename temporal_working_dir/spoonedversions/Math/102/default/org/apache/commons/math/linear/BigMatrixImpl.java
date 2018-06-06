

package org.apache.commons.math.linear;


public class BigMatrixImpl implements java.io.Serializable , org.apache.commons.math.linear.BigMatrix {
	private static final long serialVersionUID = -1011428905656140431L;

	private java.math.BigDecimal[][] data = null;

	private java.math.BigDecimal[][] lu = null;

	private int[] permutation = null;

	private int parity = 1;

	private int roundingMode = java.math.BigDecimal.ROUND_HALF_UP;

	private int scale = 64;

	protected static java.math.BigDecimal TOO_SMALL = new java.math.BigDecimal(1.0E-11);

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

	public BigMatrixImpl(double[][] d) {
		int nRows = d.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		int nCols = d[0].length;
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
		int nRows = d.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		int nCols = d[0].length;
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
		int nRows = v.length;
		data = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = v[row];
		}
	}

	public org.apache.commons.math.linear.BigMatrix copy() {
		return new org.apache.commons.math.linear.BigMatrixImpl(org.apache.commons.math.linear.BigMatrixImpl.this.copyOut());
	}

	public org.apache.commons.math.linear.BigMatrix add(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		if (((org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) != (m.getColumnDimension())) || ((org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()) != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		int rowCount = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = data[row][col].add(m.getEntry(row, col));
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.BigMatrix subtract(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		if (((org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) != (m.getColumnDimension())) || ((org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()) != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		int rowCount = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = data[row][col].subtract(m.getEntry(row, col));
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.BigMatrix scalarAdd(java.math.BigDecimal d) {
		int rowCount = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = data[row][col].add(d);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.BigMatrix scalarMultiply(java.math.BigDecimal d) {
		int rowCount = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] outData = new java.math.BigDecimal[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = data[row][col].multiply(d);
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.BigMatrix multiply(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		if ((org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
		}
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int nCols = m.getColumnDimension();
		int nSum = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] outData = new java.math.BigDecimal[nRows][nCols];
		java.math.BigDecimal sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				sum = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
				for (int i = 0; i < nSum; i++) {
					sum = sum.add(data[row][i].multiply(m.getEntry(i, col)));
				}
				outData[row][col] = sum;
			}
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.BigMatrix preMultiply(org.apache.commons.math.linear.BigMatrix m) throws java.lang.IllegalArgumentException {
		return m.multiply(org.apache.commons.math.linear.BigMatrixImpl.this);
	}

	public java.math.BigDecimal[][] getData() {
		return copyOut();
	}

	public double[][] getDataAsDoubleArray() {
		int nRows = getRowDimension();
		int nCols = getColumnDimension();
		double[][] d = new double[nRows][nCols];
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
		org.apache.commons.math.linear.BigMatrixImpl subMatrix = new org.apache.commons.math.linear.BigMatrixImpl(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		java.math.BigDecimal[][] subMatrixData = subMatrix.getDataRef();
		for (int i = startRow; i <= endRow; i++) {
			for (int j = startColumn; j <= endColumn; j++) {
				subMatrixData[(i - startRow)][(j - startColumn)] = data[i][j];
			}
		}
		return subMatrix;
	}

	public org.apache.commons.math.linear.BigMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math.linear.MatrixIndexException {
		if (((selectedRows.length) * (selectedColumns.length)) == 0) {
			throw new org.apache.commons.math.linear.MatrixIndexException("selected row and column index arrays must be non-empty");
		}
		org.apache.commons.math.linear.BigMatrixImpl subMatrix = new org.apache.commons.math.linear.BigMatrixImpl(selectedRows.length, selectedColumns.length);
		java.math.BigDecimal[][] subMatrixData = subMatrix.getDataRef();
		try {
			for (int i = 0; i < (selectedRows.length); i++) {
				for (int j = 0; j < (selectedColumns.length); j++) {
					subMatrixData[i][j] = data[selectedRows[i]][selectedColumns[j]];
				}
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix dimension mismatch");
		}
		return subMatrix;
	}

	public void setSubMatrix(java.math.BigDecimal[][] subMatrix, int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if ((row < 0) || (column < 0)) {
			throw new org.apache.commons.math.linear.MatrixIndexException("invalid row or column index selection");
		}
		int nRows = subMatrix.length;
		if (nRows == 0) {
			throw new java.lang.IllegalArgumentException("Matrix must have at least one row.");
		}
		int nCols = subMatrix[0].length;
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
		int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[][] out = new java.math.BigDecimal[1][ncols];
		java.lang.System.arraycopy(data[row], 0, out[0], 0, ncols);
		return new org.apache.commons.math.linear.BigMatrixImpl(out);
	}

	public org.apache.commons.math.linear.BigMatrix getColumnMatrix(int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		java.math.BigDecimal[][] out = new java.math.BigDecimal[nRows][1];
		for (int row = 0; row < nRows; row++) {
			out[row][0] = data[row][column];
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(out);
	}

	public java.math.BigDecimal[] getRow(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[] out = new java.math.BigDecimal[ncols];
		java.lang.System.arraycopy(data[row], 0, out, 0, ncols);
		return out;
	}

	public double[] getRowAsDoubleArray(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		int ncols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		double[] out = new double[ncols];
		for (int i = 0; i < ncols; i++) {
			out[i] = data[row][i].doubleValue();
		}
		return out;
	}

	public java.math.BigDecimal[] getColumn(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		java.math.BigDecimal[] out = new java.math.BigDecimal[nRows];
		for (int i = 0; i < nRows; i++) {
			out[i] = data[i][col];
		}
		return out;
	}

	public double[] getColumnAsDoubleArray(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		int nrows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		double[] out = new double[nrows];
		for (int i = 0; i < nrows; i++) {
			out[i] = data[i][col].doubleValue();
		}
		return out;
	}

	public java.math.BigDecimal getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix entry does not exist");
		}
		return data[row][column];
	}

	public double getEntryAsDouble(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		return getEntry(row, column).doubleValue();
	}

	public org.apache.commons.math.linear.BigMatrix transpose() {
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		org.apache.commons.math.linear.BigMatrixImpl out = new org.apache.commons.math.linear.BigMatrixImpl(nCols, nRows);
		java.math.BigDecimal[][] outData = out.getDataRef();
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				outData[col][row] = data[row][col];
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.BigMatrix inverse() throws org.apache.commons.math.linear.InvalidMatrixException {
		return solve(org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension()));
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
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[] out = new java.math.BigDecimal[v.length];
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
		java.math.BigDecimal[] bd = new java.math.BigDecimal[v.length];
		for (int i = 0; i < (bd.length); i++) {
			bd[i] = new java.math.BigDecimal(v[i]);
		}
		return operate(bd);
	}

	public java.math.BigDecimal[] preMultiply(java.math.BigDecimal[] v) throws java.lang.IllegalArgumentException {
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		if ((v.length) != nRows) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		java.math.BigDecimal[] out = new java.math.BigDecimal[nCols];
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
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		if ((b.length) != nRows) {
			throw new java.lang.IllegalArgumentException("constant vector has wrong length");
		}
		org.apache.commons.math.linear.BigMatrix bMatrix = new org.apache.commons.math.linear.BigMatrixImpl(b);
		java.math.BigDecimal[][] solution = ((org.apache.commons.math.linear.BigMatrixImpl) (solve(bMatrix))).getDataRef();
		java.math.BigDecimal[] out = new java.math.BigDecimal[nRows];
		for (int row = 0; row < nRows; row++) {
			out[row] = solution[row][0];
		}
		return out;
	}

	public java.math.BigDecimal[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		java.math.BigDecimal[] bd = new java.math.BigDecimal[b.length];
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
		int nCol = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		int nColB = b.getColumnDimension();
		int nRowB = b.getRowDimension();
		java.math.BigDecimal[][] bp = new java.math.BigDecimal[nRowB][nColB];
		for (int row = 0; row < nRowB; row++) {
			for (int col = 0; col < nColB; col++) {
				bp[row][col] = b.getEntry(permutation[row], col);
			}
		}
		for (int col = 0; col < nCol; col++) {
			for (int i = col + 1; i < nCol; i++) {
				for (int j = 0; j < nColB; j++) {
					bp[i][j] = bp[i][j].subtract(bp[col][j].multiply(lu[i][col]));
				}
			}
		}
		for (int col = nCol - 1; col >= 0; col--) {
			for (int j = 0; j < nColB; j++) {
				bp[col][j] = bp[col][j].divide(lu[col][col], scale, roundingMode);
			}
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < nColB; j++) {
					bp[i][j] = bp[i][j].subtract(bp[col][j].multiply(lu[i][col]));
				}
			}
		}
		org.apache.commons.math.linear.BigMatrixImpl outMat = new org.apache.commons.math.linear.BigMatrixImpl(bp);
		return outMat;
	}

	public void luDecompose() throws org.apache.commons.math.linear.InvalidMatrixException {
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
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
				sum = lu[row][col];
				for (int i = 0; i < row; i++) {
					sum = sum.subtract(lu[row][i].multiply(lu[i][col]));
				}
				lu[row][col] = sum;
			}
			int max = col;
			java.math.BigDecimal largest = org.apache.commons.math.linear.BigMatrixImpl.ZERO;
			for (int row = col; row < nRows; row++) {
				sum = lu[row][col];
				for (int i = 0; i < col; i++) {
					sum = sum.subtract(lu[row][i].multiply(lu[i][col]));
				}
				lu[row][col] = sum;
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
			for (int row = col + 1; row < nRows; row++) {
				lu[row][col] = lu[row][col].divide(lu[col][col], scale, roundingMode);
			}
		}
	}

	public java.lang.String toString() {
		java.lang.StringBuffer res = new java.lang.StringBuffer();
		res.append("BigMatrixImpl{");
		if ((data) != null) {
			for (int i = 0; i < (data.length); i++) {
				if (i > 0)
					res.append(",");
				
				res.append("{");
				for (int j = 0; j < (data[0].length); j++) {
					if (j > 0)
						res.append(",");
					
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
		org.apache.commons.math.linear.BigMatrix m = ((org.apache.commons.math.linear.BigMatrix) (object));
		int nRows = getRowDimension();
		int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				if (!(data[row][col].equals(m.getEntry(row, col)))) {
					return false;
				}
			}
		}
		return true;
	}

	public int hashCode() {
		int ret = 7;
		int nRows = getRowDimension();
		int nCols = getColumnDimension();
		ret = (ret * 31) + nRows;
		ret = (ret * 31) + nCols;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (data[row][col].hashCode()));
			}
		}
		return ret;
	}

	protected org.apache.commons.math.linear.BigMatrix getIdentity(int dimension) {
		return org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(dimension);
	}

	protected org.apache.commons.math.linear.BigMatrix getLUMatrix() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((lu) == null) {
			luDecompose();
		}
		return new org.apache.commons.math.linear.BigMatrixImpl(lu);
	}

	protected int[] getPermutation() {
		int[] out = new int[permutation.length];
		java.lang.System.arraycopy(permutation, 0, out, 0, permutation.length);
		return out;
	}

	private java.math.BigDecimal[][] copyOut() {
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		java.math.BigDecimal[][] out = new java.math.BigDecimal[nRows][org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension()];
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(data[i], 0, out[i], 0, data[i].length);
		}
		return out;
	}

	private void copyIn(java.math.BigDecimal[][] in) {
		setSubMatrix(in, 0, 0);
	}

	private void copyIn(double[][] in) {
		int nRows = in.length;
		int nCols = in[0].length;
		data = new java.math.BigDecimal[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				data[i][j] = new java.math.BigDecimal(in[i][j]);
			}
		}
		lu = null;
	}

	private void copyIn(java.lang.String[][] in) {
		int nRows = in.length;
		int nCols = in[0].length;
		data = new java.math.BigDecimal[nRows][nCols];
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				data[i][j] = new java.math.BigDecimal(in[i][j]);
			}
		}
		lu = null;
	}

	private boolean isValidCoordinate(int row, int col) {
		int nRows = org.apache.commons.math.linear.BigMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.BigMatrixImpl.this.getColumnDimension();
		return !((((row < 0) || (row >= nRows)) || (col < 0)) || (col >= nCols));
	}
}


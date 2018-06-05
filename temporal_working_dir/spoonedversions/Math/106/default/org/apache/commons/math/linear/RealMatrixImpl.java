

package org.apache.commons.math.linear;


public class RealMatrixImpl implements java.io.Serializable , org.apache.commons.math.linear.RealMatrix {
	private static final long serialVersionUID = 4237564493130426188L;

	private double[][] data = null;

	private double[][] lu = null;

	private int[] permutation = null;

	private int parity = 1;

	protected static double TOO_SMALL = 1.0E-11;

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
		org.apache.commons.math.linear.RealMatrixImpl.this.copyIn(d);
		lu = null;
	}

	public RealMatrixImpl(double[] v) {
		int nRows = v.length;
		data = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			data[row][0] = v[row];
		}
	}

	public org.apache.commons.math.linear.RealMatrix copy() {
		return new org.apache.commons.math.linear.RealMatrixImpl(org.apache.commons.math.linear.RealMatrixImpl.this.copyOut());
	}

	public org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		if (((org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) != (m.getColumnDimension())) || ((org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()) != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		int rowCount = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = (data[row][col]) + (m.getEntry(row, col));
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.RealMatrix subtract(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		if (((org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) != (m.getColumnDimension())) || ((org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()) != (m.getRowDimension()))) {
			throw new java.lang.IllegalArgumentException("matrix dimension mismatch");
		}
		int rowCount = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = (data[row][col]) - (m.getEntry(row, col));
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.RealMatrix scalarAdd(double d) {
		int rowCount = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = (data[row][col]) + d;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.RealMatrix scalarMultiply(double d) {
		int rowCount = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int columnCount = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] outData = new double[rowCount][columnCount];
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columnCount; col++) {
				outData[row][col] = (data[row][col]) * d;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData);
	}

	public org.apache.commons.math.linear.RealMatrix multiply(org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		if ((org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()) != (m.getRowDimension())) {
			throw new java.lang.IllegalArgumentException("Matrices are not multiplication compatible.");
		}
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int nCols = m.getColumnDimension();
		int nSum = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] outData = new double[nRows][nCols];
		double sum = 0;
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				sum = 0;
				for (int i = 0; i < nSum; i++) {
					sum += (data[row][i]) * (m.getEntry(i, col));
				}
				outData[row][col] = sum;
			}
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(outData);
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
		org.apache.commons.math.linear.RealMatrixImpl subMatrix = new org.apache.commons.math.linear.RealMatrixImpl(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		double[][] subMatrixData = subMatrix.getDataRef();
		for (int i = startRow; i <= endRow; i++) {
			for (int j = startColumn; j <= endColumn; j++) {
				subMatrixData[(i - startRow)][(j - startColumn)] = data[i][j];
			}
		}
		return subMatrix;
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) throws org.apache.commons.math.linear.MatrixIndexException {
		if (((selectedRows.length) * (selectedColumns.length)) == 0) {
			throw new org.apache.commons.math.linear.MatrixIndexException("selected row and column index arrays must be non-empty");
		}
		org.apache.commons.math.linear.RealMatrixImpl subMatrix = new org.apache.commons.math.linear.RealMatrixImpl(selectedRows.length, selectedColumns.length);
		double[][] subMatrixData = subMatrix.getDataRef();
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

	public void setSubMatrix(double[][] subMatrix, int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
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
		int ncols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[][] out = new double[1][ncols];
		java.lang.System.arraycopy(data[row], 0, out[0], 0, ncols);
		return new org.apache.commons.math.linear.RealMatrixImpl(out);
	}

	public org.apache.commons.math.linear.RealMatrix getColumnMatrix(int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		double[][] out = new double[nRows][1];
		for (int row = 0; row < nRows; row++) {
			out[row][0] = data[row][column];
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(out);
	}

	public double[] getRow(int row) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, 0))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal row argument");
		}
		int ncols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[] out = new double[ncols];
		java.lang.System.arraycopy(data[row], 0, out, 0, ncols);
		return out;
	}

	public double[] getColumn(int col) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(0, col))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("illegal column argument");
		}
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		double[] out = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			out[row] = data[row][col];
		}
		return out;
	}

	public double getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		if (!(isValidCoordinate(row, column))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("matrix entry does not exist");
		}
		return data[row][column];
	}

	public org.apache.commons.math.linear.RealMatrix transpose() {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		org.apache.commons.math.linear.RealMatrixImpl out = new org.apache.commons.math.linear.RealMatrixImpl(nCols, nRows);
		double[][] outData = out.getDataRef();
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				outData[col][row] = data[row][col];
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix inverse() throws org.apache.commons.math.linear.InvalidMatrixException {
		return solve(org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension()));
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
		if ((v.length) != (org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension())) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[] out = new double[v.length];
		for (int row = 0; row < nRows; row++) {
			double sum = 0;
			for (int i = 0; i < nCols; i++) {
				sum += (data[row][i]) * (v[i]);
			}
			out[row] = sum;
		}
		return out;
	}

	public double[] preMultiply(double[] v) throws java.lang.IllegalArgumentException {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		if ((v.length) != nRows) {
			throw new java.lang.IllegalArgumentException("vector has wrong length");
		}
		int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		double[] out = new double[nCols];
		for (int col = 0; col < nCols; col++) {
			double sum = 0;
			for (int i = 0; i < nRows; i++) {
				sum += (data[i][col]) * (v[i]);
			}
			out[col] = sum;
		}
		return out;
	}

	public double[] solve(double[] b) throws java.lang.IllegalArgumentException, org.apache.commons.math.linear.InvalidMatrixException {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		if ((b.length) != nRows) {
			throw new java.lang.IllegalArgumentException("constant vector has wrong length");
		}
		org.apache.commons.math.linear.RealMatrix bMatrix = new org.apache.commons.math.linear.RealMatrixImpl(b);
		double[][] solution = ((org.apache.commons.math.linear.RealMatrixImpl) (solve(bMatrix))).getDataRef();
		double[] out = new double[nRows];
		for (int row = 0; row < nRows; row++) {
			out[row] = solution[row][0];
		}
		return out;
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
		int nCol = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		int nColB = b.getColumnDimension();
		int nRowB = b.getRowDimension();
		double[][] bp = new double[nRowB][nColB];
		for (int row = 0; row < nRowB; row++) {
			for (int col = 0; col < nColB; col++) {
				bp[row][col] = b.getEntry(permutation[row], col);
			}
		}
		for (int col = 0; col < nCol; col++) {
			for (int i = col + 1; i < nCol; i++) {
				for (int j = 0; j < nColB; j++) {
					bp[i][j] -= (bp[col][j]) * (lu[i][col]);
				}
			}
		}
		for (int col = nCol - 1; col >= 0; col--) {
			for (int j = 0; j < nColB; j++) {
				bp[col][j] /= lu[col][col];
			}
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < nColB; j++) {
					bp[i][j] -= (bp[col][j]) * (lu[i][col]);
				}
			}
		}
		org.apache.commons.math.linear.RealMatrixImpl outMat = new org.apache.commons.math.linear.RealMatrixImpl(bp);
		return outMat;
	}

	public void luDecompose() throws org.apache.commons.math.linear.InvalidMatrixException {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		if (nRows != nCols) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("LU decomposition requires that the matrix be square.");
		}
		lu = org.apache.commons.math.linear.RealMatrixImpl.this.getData();
		permutation = new int[nRows];
		for (int row = 0; row < nRows; row++) {
			permutation[row] = row;
		}
		parity = 1;
		for (int col = 0; col < nCols; col++) {
			double sum = 0;
			for (int row = 0; row < col; row++) {
				sum = lu[row][col];
				for (int i = 0; i < row; i++) {
					sum -= (lu[row][i]) * (lu[i][col]);
				}
				lu[row][col] = sum;
			}
			int max = col;
			double largest = 0.0;
			for (int row = col; row < nRows; row++) {
				sum = lu[row][col];
				for (int i = 0; i < col; i++) {
					sum -= (lu[row][i]) * (lu[i][col]);
				}
				lu[row][col] = sum;
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
			for (int row = col + 1; row < nRows; row++) {
				lu[row][col] /= lu[col][col];
			}
		}
	}

	public java.lang.String toString() {
		java.lang.StringBuffer res = new java.lang.StringBuffer();
		res.append("RealMatrixImpl{");
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
		if (object == (org.apache.commons.math.linear.RealMatrixImpl.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.linear.RealMatrixImpl) == false) {
			return false;
		}
		org.apache.commons.math.linear.RealMatrix m = ((org.apache.commons.math.linear.RealMatrix) (object));
		int nRows = getRowDimension();
		int nCols = getColumnDimension();
		if (((m.getColumnDimension()) != nCols) || ((m.getRowDimension()) != nRows)) {
			return false;
		}
		for (int row = 0; row < nRows; row++) {
			for (int col = 0; col < nCols; col++) {
				if ((java.lang.Double.doubleToLongBits(data[row][col])) != (java.lang.Double.doubleToLongBits(m.getEntry(row, col)))) {
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
				ret = (ret * 31) + (((11 * (row + 1)) + (17 * (col + 1))) * (org.apache.commons.math.util.MathUtils.hash(data[row][col])));
			}
		}
		return ret;
	}

	protected org.apache.commons.math.linear.RealMatrix getIdentity(int dimension) {
		return org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(dimension);
	}

	protected org.apache.commons.math.linear.RealMatrix getLUMatrix() throws org.apache.commons.math.linear.InvalidMatrixException {
		if ((lu) == null) {
			luDecompose();
		}
		return new org.apache.commons.math.linear.RealMatrixImpl(lu);
	}

	protected int[] getPermutation() {
		int[] out = new int[permutation.length];
		java.lang.System.arraycopy(permutation, 0, out, 0, permutation.length);
		return out;
	}

	private double[][] copyOut() {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		double[][] out = new double[nRows][org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension()];
		for (int i = 0; i < nRows; i++) {
			java.lang.System.arraycopy(data[i], 0, out[i], 0, data[i].length);
		}
		return out;
	}

	private void copyIn(double[][] in) {
		setSubMatrix(in, 0, 0);
	}

	private boolean isValidCoordinate(int row, int col) {
		int nRows = org.apache.commons.math.linear.RealMatrixImpl.this.getRowDimension();
		int nCols = org.apache.commons.math.linear.RealMatrixImpl.this.getColumnDimension();
		return !((((row < 0) || (row > (nRows - 1))) || (col < 0)) || (col > (nCols - 1)));
	}
}


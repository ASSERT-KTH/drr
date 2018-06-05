

package org.apache.commons.math.linear;


public class OpenMapRealMatrix extends org.apache.commons.math.linear.AbstractRealMatrix implements java.io.Serializable , org.apache.commons.math.linear.SparseRealMatrix {
	private static final long serialVersionUID = -5962461716457143437L;

	private final int rowDimension;

	private final int columnDimension;

	private final org.apache.commons.math.util.OpenIntToDoubleHashMap entries;

	public OpenMapRealMatrix(int rowDimension, int columnDimension) {
		super(rowDimension, columnDimension);
		this.rowDimension = rowDimension;
		this.columnDimension = columnDimension;
		this.entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
	}

	public OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix matrix) {
		this.rowDimension = matrix.rowDimension;
		this.columnDimension = matrix.columnDimension;
		this.entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(matrix.entries);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.OpenMapRealMatrix copy() {
		return new org.apache.commons.math.linear.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix.this);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.OpenMapRealMatrix createMatrix(int rowDimension, int columnDimension) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.OpenMapRealMatrix(rowDimension, columnDimension);
	}

	@java.lang.Override
	public int getColumnDimension() {
		return columnDimension;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.OpenMapRealMatrix add(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return add(((org.apache.commons.math.linear.OpenMapRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			return ((org.apache.commons.math.linear.OpenMapRealMatrix) (super.add(m)));
		}
	}

	public org.apache.commons.math.linear.OpenMapRealMatrix add(org.apache.commons.math.linear.OpenMapRealMatrix m) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.OpenMapRealMatrix.this, m);
		final org.apache.commons.math.linear.OpenMapRealMatrix out = new org.apache.commons.math.linear.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix.this);
		for (org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); iterator.hasNext();) {
			iterator.advance();
			final int row = (iterator.key()) / (columnDimension);
			final int col = (iterator.key()) - (row * (columnDimension));
			out.setEntry(row, col, ((getEntry(row, col)) + (iterator.value())));
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.OpenMapRealMatrix subtract(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return subtract(((org.apache.commons.math.linear.OpenMapRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			return ((org.apache.commons.math.linear.OpenMapRealMatrix) (super.subtract(m)));
		}
	}

	public org.apache.commons.math.linear.OpenMapRealMatrix subtract(org.apache.commons.math.linear.OpenMapRealMatrix m) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.OpenMapRealMatrix.this, m);
		final org.apache.commons.math.linear.OpenMapRealMatrix out = new org.apache.commons.math.linear.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix.this);
		for (org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); iterator.hasNext();) {
			iterator.advance();
			final int row = (iterator.key()) / (columnDimension);
			final int col = (iterator.key()) - (row * (columnDimension));
			out.setEntry(row, col, ((getEntry(row, col)) - (iterator.value())));
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix multiply(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return multiply(((org.apache.commons.math.linear.OpenMapRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.OpenMapRealMatrix.this, m);
			final int outCols = m.getColumnDimension();
			final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rowDimension, outCols);
			for (org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext();) {
				iterator.advance();
				final double value = iterator.value();
				final int key = iterator.key();
				final int i = key / (columnDimension);
				final int k = key % (columnDimension);
				for (int j = 0; j < outCols; ++j) {
					out.addToEntry(i, j, (value * (m.getEntry(k, j))));
				}
			}
			return out;
		}
	}

	public org.apache.commons.math.linear.OpenMapRealMatrix multiply(org.apache.commons.math.linear.OpenMapRealMatrix m) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.OpenMapRealMatrix.this, m);
		final int outCols = m.getColumnDimension();
		org.apache.commons.math.linear.OpenMapRealMatrix out = new org.apache.commons.math.linear.OpenMapRealMatrix(rowDimension, outCols);
		for (org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext();) {
			iterator.advance();
			final double value = iterator.value();
			final int key = iterator.key();
			final int i = key / (columnDimension);
			final int k = key % (columnDimension);
			for (int j = 0; j < outCols; ++j) {
				final int rightKey = m.computeKey(k, j);
				if (m.entries.containsKey(rightKey)) {
					final int outKey = out.computeKey(i, j);
					final double outValue = (out.entries.get(outKey)) + (value * (m.entries.get(rightKey)));
					if (outValue == 0.0) {
						out.entries.remove(outKey);
					}else {
						out.entries.put(outKey, outValue);
					}
				}
			}
		}
		return out;
	}

	@java.lang.Override
	public double getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, column);
		return entries.get(computeKey(row, column));
	}

	@java.lang.Override
	public int getRowDimension() {
		return rowDimension;
	}

	@java.lang.Override
	public void setEntry(int row, int column, double value) throws org.apache.commons.math.linear.MatrixIndexException {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, column);
		if (value == 0.0) {
			entries.remove(computeKey(row, column));
		}else {
			entries.put(computeKey(row, column), value);
		}
	}

	@java.lang.Override
	public void addToEntry(int row, int column, double increment) throws org.apache.commons.math.linear.MatrixIndexException {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, column);
		final int key = computeKey(row, column);
		final double value = (entries.get(key)) + increment;
		if (value == 0.0) {
			entries.remove(key);
		}else {
			entries.put(key, value);
		}
	}

	@java.lang.Override
	public void multiplyEntry(int row, int column, double factor) throws org.apache.commons.math.linear.MatrixIndexException {
		org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, row);
		org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.OpenMapRealMatrix.this, column);
		final int key = computeKey(row, column);
		final double value = (entries.get(key)) * factor;
		if (value == 0.0) {
			entries.remove(key);
		}else {
			entries.put(key, value);
		}
	}

	private int computeKey(int row, int column) {
		return (row * (columnDimension)) + column;
	}
}


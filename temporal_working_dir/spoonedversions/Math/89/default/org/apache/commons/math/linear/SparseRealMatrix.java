

package org.apache.commons.math.linear;


public class SparseRealMatrix extends org.apache.commons.math.linear.AbstractRealMatrix {
	private static final long serialVersionUID = -5962461716457143437L;

	private final int rowDimension;

	private final int columnDimension;

	private org.apache.commons.math.util.OpenIntToDoubleHashMap entries;

	public SparseRealMatrix(int rowDimension, int columnDimension) {
		super(rowDimension, columnDimension);
		this.rowDimension = rowDimension;
		this.columnDimension = columnDimension;
		org.apache.commons.math.linear.SparseRealMatrix.this.entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
	}

	public SparseRealMatrix(org.apache.commons.math.linear.SparseRealMatrix matrix) {
		this.rowDimension = matrix.rowDimension;
		this.columnDimension = matrix.columnDimension;
		org.apache.commons.math.linear.SparseRealMatrix.this.entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(matrix.entries);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix copy() {
		return new org.apache.commons.math.linear.SparseRealMatrix(org.apache.commons.math.linear.SparseRealMatrix.this);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix createMatrix(int rowDimension, int columnDimension) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.SparseRealMatrix(rowDimension, columnDimension);
	}

	@java.lang.Override
	public int getColumnDimension() {
		return columnDimension;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix add(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return add(((org.apache.commons.math.linear.SparseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			return super.add(m);
		}
	}

	public org.apache.commons.math.linear.RealMatrix add(org.apache.commons.math.linear.SparseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkAdditionCompatible(m);
		final org.apache.commons.math.linear.RealMatrix out = new org.apache.commons.math.linear.SparseRealMatrix(org.apache.commons.math.linear.SparseRealMatrix.this);
		for (org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); iterator.hasNext();) {
			iterator.advance();
			final int row = (iterator.key()) / (columnDimension);
			final int col = (iterator.key()) - (row * (columnDimension));
			out.setEntry(row, col, ((getEntry(row, col)) + (iterator.value())));
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix subtract(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return subtract(((org.apache.commons.math.linear.SparseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			return super.add(m);
		}
	}

	public org.apache.commons.math.linear.RealMatrix subtract(org.apache.commons.math.linear.SparseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkAdditionCompatible(m);
		final org.apache.commons.math.linear.RealMatrix out = new org.apache.commons.math.linear.SparseRealMatrix(org.apache.commons.math.linear.SparseRealMatrix.this);
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
			return multiply(((org.apache.commons.math.linear.SparseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			checkMultiplicationCompatible(m);
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

	public org.apache.commons.math.linear.SparseRealMatrix multiply(org.apache.commons.math.linear.SparseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkMultiplicationCompatible(m);
		final int outCols = m.getColumnDimension();
		org.apache.commons.math.linear.SparseRealMatrix out = new org.apache.commons.math.linear.SparseRealMatrix(rowDimension, outCols);
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
		checkRowIndex(row);
		checkColumnIndex(column);
		return entries.get(computeKey(row, column));
	}

	@java.lang.Override
	public int getRowDimension() {
		return rowDimension;
	}

	@java.lang.Override
	public void setEntry(int row, int column, double value) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
		if (value == 0.0) {
			entries.remove(computeKey(row, column));
		}else {
			entries.put(computeKey(row, column), value);
		}
	}

	@java.lang.Override
	public void addToEntry(int row, int column, double increment) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
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
		checkRowIndex(row);
		checkColumnIndex(column);
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


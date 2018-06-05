

package org.apache.commons.math.linear;


public class SparseFieldMatrix<T extends org.apache.commons.math.FieldElement<T>> extends org.apache.commons.math.linear.AbstractFieldMatrix<T> {
	private static final long serialVersionUID = 9078068119297757342L;

	private final org.apache.commons.math.util.OpenIntToFieldHashMap<T> entries;

	private final int rowDimension;

	private final int columnDimension;

	public SparseFieldMatrix(final org.apache.commons.math.Field<T> field) {
		super(field);
		rowDimension = 0;
		columnDimension = 0;
		entries = new org.apache.commons.math.util.OpenIntToFieldHashMap<T>(field);
	}

	public SparseFieldMatrix(final org.apache.commons.math.Field<T> field, final int rowDimension, final int columnDimension) throws java.lang.IllegalArgumentException {
		super(field, rowDimension, columnDimension);
		this.rowDimension = rowDimension;
		this.columnDimension = columnDimension;
		entries = new org.apache.commons.math.util.OpenIntToFieldHashMap<T>(field);
	}

	public SparseFieldMatrix(org.apache.commons.math.linear.SparseFieldMatrix<T> other) {
		super(other.getField(), other.getRowDimension(), other.getColumnDimension());
		rowDimension = other.getRowDimension();
		columnDimension = other.getColumnDimension();
		entries = new org.apache.commons.math.util.OpenIntToFieldHashMap<T>(other.entries);
	}

	public SparseFieldMatrix(org.apache.commons.math.linear.FieldMatrix<T> other) {
		super(other.getField(), other.getRowDimension(), other.getColumnDimension());
		rowDimension = other.getRowDimension();
		columnDimension = other.getColumnDimension();
		entries = new org.apache.commons.math.util.OpenIntToFieldHashMap<T>(getField());
		for (int i = 0; i < (rowDimension); i++) {
			for (int j = 0; j < (columnDimension); j++) {
				setEntry(i, j, other.getEntry(i, j));
			}
		}
	}

	@java.lang.Override
	public void addToEntry(int row, int column, T increment) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
		final int key = computeKey(row, column);
		final T value = entries.get(key).add(increment);
		if (getField().getZero().equals(value)) {
			entries.remove(key);
		}else {
			entries.put(key, value);
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.FieldMatrix<T> copy() {
		return new org.apache.commons.math.linear.SparseFieldMatrix<T>(org.apache.commons.math.linear.SparseFieldMatrix.this);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.FieldMatrix<T> createMatrix(int rowDimension, int columnDimension) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.SparseFieldMatrix<T>(getField(), rowDimension, columnDimension);
	}

	@java.lang.Override
	public int getColumnDimension() {
		return columnDimension;
	}

	@java.lang.Override
	public T getEntry(int row, int column) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
		return entries.get(computeKey(row, column));
	}

	@java.lang.Override
	public int getRowDimension() {
		return rowDimension;
	}

	@java.lang.Override
	public void multiplyEntry(int row, int column, T factor) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
		final int key = computeKey(row, column);
		final T value = entries.get(key).multiply(factor);
		if (getField().getZero().equals(value)) {
			entries.remove(key);
		}else {
			entries.put(key, value);
		}
	}

	@java.lang.Override
	public void setEntry(int row, int column, T value) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		checkColumnIndex(column);
		if (getField().getZero().equals(value)) {
			entries.remove(computeKey(row, column));
		}else {
			entries.put(computeKey(row, column), value);
		}
	}

	private int computeKey(int row, int column) {
		return (row * (columnDimension)) + column;
	}
}


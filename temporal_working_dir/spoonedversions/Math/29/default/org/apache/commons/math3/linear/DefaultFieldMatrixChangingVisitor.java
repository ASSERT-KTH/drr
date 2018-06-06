

package org.apache.commons.math3.linear;


public class DefaultFieldMatrixChangingVisitor<T extends org.apache.commons.math3.FieldElement<T>> implements org.apache.commons.math3.linear.FieldMatrixChangingVisitor<T> {
	private final T zero;

	public DefaultFieldMatrixChangingVisitor(final T zero) {
		this.zero = zero;
	}

	public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
	}

	public T visit(int row, int column, T value) {
		return value;
	}

	public T end() {
		return zero;
	}
}


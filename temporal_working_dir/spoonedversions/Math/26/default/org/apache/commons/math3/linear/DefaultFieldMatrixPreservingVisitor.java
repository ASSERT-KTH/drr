

package org.apache.commons.math3.linear;


public class DefaultFieldMatrixPreservingVisitor<T extends org.apache.commons.math3.FieldElement<T>> implements org.apache.commons.math3.linear.FieldMatrixPreservingVisitor<T> {
	private final T zero;

	public DefaultFieldMatrixPreservingVisitor(final T zero) {
		this.zero = zero;
	}

	public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
	}

	public void visit(int row, int column, T value) {
	}

	public T end() {
		return zero;
	}
}


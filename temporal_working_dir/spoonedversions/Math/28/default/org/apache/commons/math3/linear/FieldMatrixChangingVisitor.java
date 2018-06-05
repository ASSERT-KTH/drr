

package org.apache.commons.math3.linear;


public interface FieldMatrixChangingVisitor<T extends org.apache.commons.math3.FieldElement<?>> {
	void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn);

	T visit(int row, int column, T value);

	T end();
}


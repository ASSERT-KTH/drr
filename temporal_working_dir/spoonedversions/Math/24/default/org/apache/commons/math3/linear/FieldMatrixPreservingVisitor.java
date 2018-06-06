

package org.apache.commons.math3.linear;


public interface FieldMatrixPreservingVisitor<T extends org.apache.commons.math3.FieldElement<?>> {
	void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn);

	void visit(int row, int column, T value);

	T end();
}


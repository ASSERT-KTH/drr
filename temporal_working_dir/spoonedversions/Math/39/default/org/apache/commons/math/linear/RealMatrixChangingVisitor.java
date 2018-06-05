

package org.apache.commons.math.linear;


public interface RealMatrixChangingVisitor {
	void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn);

	double visit(int row, int column, double value);

	double end();
}


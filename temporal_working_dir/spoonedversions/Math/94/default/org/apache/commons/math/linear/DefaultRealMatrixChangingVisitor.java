

package org.apache.commons.math.linear;


public class DefaultRealMatrixChangingVisitor implements org.apache.commons.math.linear.RealMatrixChangingVisitor {
	private static final long serialVersionUID = 892744666836410796L;

	public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
	}

	public double visit(int row, int column, double value) throws org.apache.commons.math.linear.MatrixVisitorException {
		return value;
	}

	public double end() {
		return 0;
	}
}


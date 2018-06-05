

package org.apache.commons.math;


public class DimensionMismatchException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -1316089546353786411L;

	public DimensionMismatchException(int dimension1, int dimension2) {
		super("dimension mismatch {0} != {1}", dimension1, dimension2);
		org.apache.commons.math.DimensionMismatchException.this.dimension1 = dimension1;
		org.apache.commons.math.DimensionMismatchException.this.dimension2 = dimension2;
	}

	public int getDimension1() {
		return dimension1;
	}

	public int getDimension2() {
		return dimension2;
	}

	private int dimension1;

	private int dimension2;
}


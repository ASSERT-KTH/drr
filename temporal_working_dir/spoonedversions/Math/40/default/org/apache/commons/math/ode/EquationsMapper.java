

package org.apache.commons.math.ode;


public class EquationsMapper implements java.io.Serializable {
	private static final long serialVersionUID = 20110925L;

	private final int firstIndex;

	private final int dimension;

	public EquationsMapper(final int firstIndex, final int dimension) {
		this.firstIndex = firstIndex;
		this.dimension = dimension;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public int getDimension() {
		return dimension;
	}

	public void extractEquationData(double[] complete, double[] equationData) throws org.apache.commons.math.exception.DimensionMismatchException {
		if ((equationData.length) != (dimension)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(equationData.length, dimension);
		}
		java.lang.System.arraycopy(complete, firstIndex, equationData, 0, dimension);
	}

	public void insertEquationData(double[] equationData, double[] complete) throws org.apache.commons.math.exception.DimensionMismatchException {
		if ((equationData.length) != (dimension)) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(equationData.length, dimension);
		}
		java.lang.System.arraycopy(equationData, 0, complete, firstIndex, dimension);
	}
}


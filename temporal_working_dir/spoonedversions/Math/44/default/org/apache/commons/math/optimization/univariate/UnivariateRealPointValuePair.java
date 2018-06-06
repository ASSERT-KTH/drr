

package org.apache.commons.math.optimization.univariate;


public class UnivariateRealPointValuePair implements java.io.Serializable {
	private static final long serialVersionUID = 1003888396256744753L;

	private final double point;

	private final double value;

	public UnivariateRealPointValuePair(final double point, final double value) {
		this.point = point;
		this.value = value;
	}

	public double getPoint() {
		return point;
	}

	public double getValue() {
		return value;
	}
}


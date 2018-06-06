

package org.apache.commons.math.distribution;


public abstract class AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.Distribution {
	private static final long serialVersionUID = -38038050983108802L;

	protected AbstractDistribution() {
		super();
	}

	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw new java.lang.IllegalArgumentException("lower endpoint must be less than or equal to upper endpoint");
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}
}


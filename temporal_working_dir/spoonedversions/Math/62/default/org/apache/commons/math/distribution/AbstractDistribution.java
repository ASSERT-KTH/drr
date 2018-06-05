

package org.apache.commons.math.distribution;


public abstract class AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.Distribution {
	private static final long serialVersionUID = -38038050983108802L;

	protected AbstractDistribution() {
		super();
	}

	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT, x0, x1);
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}
}


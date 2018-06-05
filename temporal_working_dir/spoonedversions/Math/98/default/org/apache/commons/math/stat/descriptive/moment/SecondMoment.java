

package org.apache.commons.math.stat.descriptive.moment;


public class SecondMoment extends org.apache.commons.math.stat.descriptive.moment.FirstMoment implements java.io.Serializable {
	private static final long serialVersionUID = 3942403127395076445L;

	protected double m2;

	public SecondMoment() {
		super();
		m2 = java.lang.Double.NaN;
	}

	public void increment(final double d) {
		if ((n) < 1) {
			m1 = m2 = 0.0;
		}
		super.increment(d);
		m2 += ((((double) (n)) - 1) * (dev)) * (nDev);
	}

	public void clear() {
		super.clear();
		m2 = java.lang.Double.NaN;
	}

	public double getResult() {
		return m2;
	}
}


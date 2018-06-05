

package org.apache.commons.math.stat.descriptive.moment;


public class ThirdMoment extends org.apache.commons.math.stat.descriptive.moment.SecondMoment implements java.io.Serializable {
	private static final long serialVersionUID = -7818711964045118679L;

	protected double m3;

	protected double nDevSq;

	public ThirdMoment() {
		super();
		m3 = java.lang.Double.NaN;
		nDevSq = java.lang.Double.NaN;
	}

	public void increment(final double d) {
		if ((n) < 1) {
			m3 = m2 = m1 = 0.0;
		}
		double prevM2 = m2;
		super.increment(d);
		nDevSq = (nDev) * (nDev);
		double n0 = ((double) (n));
		m3 = ((m3) - ((3.0 * (nDev)) * prevM2)) + ((((n0 - 1) * (n0 - 2)) * (nDevSq)) * (dev));
	}

	public double getResult() {
		return m3;
	}

	public void clear() {
		super.clear();
		m3 = java.lang.Double.NaN;
		nDevSq = java.lang.Double.NaN;
	}
}


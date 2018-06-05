

package org.apache.commons.math.stat.descriptive.moment;


public class FirstMoment extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -803343206421984070L;

	protected long n;

	protected double m1;

	protected double dev;

	protected double nDev;

	public FirstMoment() {
		n = 0;
		m1 = java.lang.Double.NaN;
		dev = java.lang.Double.NaN;
		nDev = java.lang.Double.NaN;
	}

	public void increment(final double d) {
		if ((n) == 0) {
			m1 = 0.0;
		}
		(n)++;
		double n0 = ((double) (n));
		dev = d - (m1);
		nDev = (dev) / n0;
		m1 += nDev;
	}

	public void clear() {
		m1 = java.lang.Double.NaN;
		n = 0;
		dev = java.lang.Double.NaN;
		nDev = java.lang.Double.NaN;
	}

	public double getResult() {
		return m1;
	}

	public long getN() {
		return n;
	}
}


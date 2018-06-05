

package org.apache.commons.math.distribution;


public abstract class AbstractIntegerDistribution extends org.apache.commons.math.distribution.AbstractDistribution implements java.io.Serializable , org.apache.commons.math.distribution.IntegerDistribution {
	private static final long serialVersionUID = -1146319659338487221L;

	protected AbstractIntegerDistribution() {
		super();
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		return cumulativeProbability(((int) (java.lang.Math.floor(x))));
	}

	@java.lang.Override
	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw new java.lang.IllegalArgumentException("lower endpoint must be less than or equal to upper endpoint");
		}
		if ((java.lang.Math.floor(x0)) < x0) {
			return cumulativeProbability((((int) (java.lang.Math.floor(x0))) + 1), ((int) (java.lang.Math.floor(x1))));
		}else {
			return cumulativeProbability(((int) (java.lang.Math.floor(x0))), ((int) (java.lang.Math.floor(x1))));
		}
	}

	public abstract double cumulativeProbability(int x) throws org.apache.commons.math.MathException;

	public double probability(double x) {
		double fl = java.lang.Math.floor(x);
		if (fl == x) {
			return org.apache.commons.math.distribution.AbstractIntegerDistribution.this.probability(((int) (x)));
		}else {
			return 0;
		}
	}

	public double cumulativeProbability(int x0, int x1) throws org.apache.commons.math.MathException {
		if (x0 > x1) {
			throw new java.lang.IllegalArgumentException("lower endpoint must be less than or equal to upper endpoint");
		}
		return (cumulativeProbability(x1)) - (cumulativeProbability((x0 - 1)));
	}

	public int inverseCumulativeProbability(final double p) throws org.apache.commons.math.MathException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new java.lang.IllegalArgumentException("p must be between 0 and 1.0 (inclusive)");
		}
		int x0 = getDomainLowerBound(p);
		int x1 = getDomainUpperBound(p);
		double pm;
		while (x0 < x1) {
			int xm = x0 + ((x1 - x0) / 2);
			pm = cumulativeProbability(xm);
			if (pm > p) {
				if (xm == x1) {
					--x1;
				}else {
					x1 = xm;
				}
			}else {
				if (xm == x0) {
					++x0;
				}else {
					x0 = xm;
				}
			}
		} 
		pm = cumulativeProbability(x0);
		while (pm > p) {
			--x0;
			pm = cumulativeProbability(x0);
		} 
		return x0;
	}

	protected abstract int getDomainLowerBound(double p);

	protected abstract int getDomainUpperBound(double p);
}


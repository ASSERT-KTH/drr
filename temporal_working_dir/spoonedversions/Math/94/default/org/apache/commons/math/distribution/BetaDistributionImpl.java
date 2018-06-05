

package org.apache.commons.math.distribution;


public class BetaDistributionImpl extends org.apache.commons.math.distribution.AbstractContinuousDistribution implements org.apache.commons.math.distribution.BetaDistribution {
	private static final long serialVersionUID = -1221965979403477668L;

	private double alpha;

	private double beta;

	private double z;

	public BetaDistributionImpl(double alpha, double beta) {
		org.apache.commons.math.distribution.BetaDistributionImpl.this.alpha = alpha;
		org.apache.commons.math.distribution.BetaDistributionImpl.this.beta = beta;
		z = java.lang.Double.NaN;
	}

	public void setAlpha(double alpha) {
		org.apache.commons.math.distribution.BetaDistributionImpl.this.alpha = alpha;
		z = java.lang.Double.NaN;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setBeta(double beta) {
		org.apache.commons.math.distribution.BetaDistributionImpl.this.beta = beta;
		z = java.lang.Double.NaN;
	}

	public double getBeta() {
		return beta;
	}

	private void recomputeZ() {
		if (java.lang.Double.isNaN(z)) {
			z = ((org.apache.commons.math.special.Gamma.logGamma(alpha)) + (org.apache.commons.math.special.Gamma.logGamma(beta))) - (org.apache.commons.math.special.Gamma.logGamma(((alpha) + (beta))));
		}
	}

	public double density(java.lang.Double x) throws org.apache.commons.math.MathException {
		recomputeZ();
		if ((x < 0) || (x > 1)) {
			return 0;
		}else
			if (x == 0) {
				if ((alpha) < 1) {
					throw new org.apache.commons.math.MathException("Cannot compute beta density at 0 when alpha = {0,number}", new java.lang.Double[]{ alpha });
				}
				return 0;
			}else
				if (x == 1) {
					if ((beta) < 1) {
						throw new org.apache.commons.math.MathException("Cannot compute beta density at 1 when beta = %.3g", new java.lang.Double[]{ beta });
					}
					return 0;
				}else {
					double logX = java.lang.Math.log(x);
					double log1mX = java.lang.Math.log1p((-x));
					return java.lang.Math.exp((((((alpha) - 1) * logX) + (((beta) - 1) * log1mX)) - (z)));
				}
			
		
	}

	public double inverseCumulativeProbability(double p) throws org.apache.commons.math.MathException {
		if (p == 0) {
			return 0;
		}else
			if (p == 1) {
				return 1;
			}else {
				return super.inverseCumulativeProbability(p);
			}
		
	}

	protected double getInitialDomain(double p) {
		return p;
	}

	protected double getDomainLowerBound(double p) {
		return 0;
	}

	protected double getDomainUpperBound(double p) {
		return 1;
	}

	public double cumulativeProbability(double x) throws org.apache.commons.math.MathException {
		if (x <= 0) {
			return 0;
		}else
			if (x >= 1) {
				return 1;
			}else {
				return org.apache.commons.math.special.Beta.regularizedBeta(x, alpha, beta);
			}
		
	}

	public double cumulativeProbability(double x0, double x1) throws org.apache.commons.math.MathException {
		return (cumulativeProbability(x1)) - (cumulativeProbability(x0));
	}
}


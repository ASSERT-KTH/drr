

package org.apache.commons.math3.random;


public class StableRandomGenerator implements org.apache.commons.math3.random.NormalizedRandomGenerator {
	private final org.apache.commons.math3.random.RandomGenerator generator;

	private final double alpha;

	private final double beta;

	private final double zeta;

	public StableRandomGenerator(final org.apache.commons.math3.random.RandomGenerator generator, double alpha, double beta) {
		if (generator == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if (!((alpha > 0.0) && (alpha <= 2.0))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT, alpha, 0, 2);
		}
		if (!((beta >= (-1.0)) && (beta <= 1.0))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_SIMPLE, beta, (-1), 1);
		}
		this.generator = generator;
		this.alpha = alpha;
		this.beta = beta;
		if ((alpha < 2.0) && (beta != 0.0)) {
			zeta = beta * (org.apache.commons.math3.util.FastMath.tan((((org.apache.commons.math3.util.FastMath.PI) * alpha) / 2)));
		}else {
			zeta = 0.0;
		}
	}

	public double nextNormalizedDouble() {
		double omega = -(org.apache.commons.math3.util.FastMath.log(generator.nextDouble()));
		double phi = (org.apache.commons.math3.util.FastMath.PI) * ((generator.nextDouble()) - 0.5);
		if ((alpha) == 2.0) {
			return (org.apache.commons.math3.util.FastMath.sqrt((2.0 * omega))) * (org.apache.commons.math3.util.FastMath.sin(phi));
		}
		double x;
		if ((beta) == 0.0) {
			if ((alpha) == 1.0) {
				x = org.apache.commons.math3.util.FastMath.tan(phi);
			}else {
				x = ((org.apache.commons.math3.util.FastMath.pow((omega * (org.apache.commons.math3.util.FastMath.cos(((1 - (alpha)) * phi)))), ((1.0 / (alpha)) - 1.0))) * (org.apache.commons.math3.util.FastMath.sin(((alpha) * phi)))) / (org.apache.commons.math3.util.FastMath.pow(org.apache.commons.math3.util.FastMath.cos(phi), (1.0 / (alpha))));
			}
		}else {
			double cosPhi = org.apache.commons.math3.util.FastMath.cos(phi);
			if ((org.apache.commons.math3.util.FastMath.abs(((alpha) - 1.0))) > 1.0E-8) {
				double alphaPhi = (alpha) * phi;
				double invAlphaPhi = phi - alphaPhi;
				x = ((((org.apache.commons.math3.util.FastMath.sin(alphaPhi)) + ((zeta) * (org.apache.commons.math3.util.FastMath.cos(alphaPhi)))) / cosPhi) * ((org.apache.commons.math3.util.FastMath.cos(invAlphaPhi)) + ((zeta) * (org.apache.commons.math3.util.FastMath.sin(invAlphaPhi))))) / (org.apache.commons.math3.util.FastMath.pow((omega * cosPhi), ((1 - (alpha)) / (alpha))));
			}else {
				double betaPhi = ((org.apache.commons.math3.util.FastMath.PI) / 2) + ((beta) * phi);
				x = (2.0 / (org.apache.commons.math3.util.FastMath.PI)) * ((betaPhi * (org.apache.commons.math3.util.FastMath.tan(phi))) - ((beta) * (org.apache.commons.math3.util.FastMath.log((((((org.apache.commons.math3.util.FastMath.PI) / 2.0) * omega) * cosPhi) / betaPhi)))));
				if ((alpha) != 1.0) {
					x = x + ((beta) * (org.apache.commons.math3.util.FastMath.tan((((org.apache.commons.math3.util.FastMath.PI) * (alpha)) / 2))));
				}
			}
		}
		return x;
	}
}


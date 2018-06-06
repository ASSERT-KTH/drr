

package org.apache.commons.math3.analysis.integration.gauss;


public class LegendreRuleFactory extends org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory<java.lang.Double> {
	@java.lang.Override
	protected org.apache.commons.math3.util.Pair<java.lang.Double[], java.lang.Double[]> computeRule(int numberOfPoints) {
		if (numberOfPoints <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_POINTS, numberOfPoints);
		}
		if (numberOfPoints == 1) {
			return new org.apache.commons.math3.util.Pair<java.lang.Double[], java.lang.Double[]>(new java.lang.Double[]{ 0.0 }, new java.lang.Double[]{ 2.0 });
		}
		final java.lang.Double[] previousPoints = getRuleInternal((numberOfPoints - 1)).getFirst();
		final java.lang.Double[] points = new java.lang.Double[numberOfPoints];
		final java.lang.Double[] weights = new java.lang.Double[numberOfPoints];
		final int iMax = numberOfPoints / 2;
		for (int i = 0; i < iMax; i++) {
			double a = i == 0 ? -1 : previousPoints[(i - 1)].doubleValue();
			double b = iMax == 1 ? 1 : previousPoints[i].doubleValue();
			double pma = 1;
			double pa = a;
			double pmb = 1;
			double pb = b;
			for (int j = 1; j < numberOfPoints; j++) {
				final int two_j_p_1 = (2 * j) + 1;
				final int j_p_1 = j + 1;
				final double ppa = (((two_j_p_1 * a) * pa) - (j * pma)) / j_p_1;
				final double ppb = (((two_j_p_1 * b) * pb) - (j * pmb)) / j_p_1;
				pma = pa;
				pa = ppa;
				pmb = pb;
				pb = ppb;
			}
			double c = 0.5 * (a + b);
			double pmc = 1;
			double pc = c;
			boolean done = false;
			while (!done) {
				done = (b - a) <= (java.lang.Math.ulp(c));
				pmc = 1;
				pc = c;
				for (int j = 1; j < numberOfPoints; j++) {
					final double ppc = (((((2 * j) + 1) * c) * pc) - (j * pmc)) / (j + 1);
					pmc = pc;
					pc = ppc;
				}
				if (!done) {
					if ((pa * pc) <= 0) {
						b = c;
						pmb = pmc;
						pb = pc;
					}else {
						a = c;
						pma = pmc;
						pa = pc;
					}
					c = 0.5 * (a + b);
				}
			} 
			final double d = numberOfPoints * (pmc - (c * pc));
			final double w = (2 * (1 - (c * c))) / (d * d);
			points[i] = c;
			weights[i] = w;
			final int idx = (numberOfPoints - i) - 1;
			points[idx] = -c;
			weights[idx] = w;
		}
		if ((numberOfPoints % 2) != 0) {
			double pmc = 1;
			for (int j = 1; j < numberOfPoints; j += 2) {
				pmc = ((-j) * pmc) / (j + 1);
			}
			final double d = numberOfPoints * pmc;
			final double w = 2 / (d * d);
			points[iMax] = 0.0;
			weights[iMax] = w;
		}
		return new org.apache.commons.math3.util.Pair<java.lang.Double[], java.lang.Double[]>(points, weights);
	}
}


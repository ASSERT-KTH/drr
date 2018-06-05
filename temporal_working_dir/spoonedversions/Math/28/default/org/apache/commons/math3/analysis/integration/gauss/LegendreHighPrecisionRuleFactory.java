

package org.apache.commons.math3.analysis.integration.gauss;


public class LegendreHighPrecisionRuleFactory extends org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory<java.math.BigDecimal> {
	private final java.math.MathContext mContext;

	private final java.math.BigDecimal two;

	private final java.math.BigDecimal minusOne;

	private final java.math.BigDecimal oneHalf;

	public LegendreHighPrecisionRuleFactory() {
		this(java.math.MathContext.DECIMAL128);
	}

	public LegendreHighPrecisionRuleFactory(java.math.MathContext mContext) {
		this.mContext = mContext;
		two = new java.math.BigDecimal("2", mContext);
		minusOne = new java.math.BigDecimal("-1", mContext);
		oneHalf = new java.math.BigDecimal("0.5", mContext);
	}

	@java.lang.Override
	protected org.apache.commons.math3.util.Pair<java.math.BigDecimal[], java.math.BigDecimal[]> computeRule(int numberOfPoints) {
		if (numberOfPoints == 1) {
			return new org.apache.commons.math3.util.Pair<java.math.BigDecimal[], java.math.BigDecimal[]>(new java.math.BigDecimal[]{ java.math.BigDecimal.ZERO }, new java.math.BigDecimal[]{ two });
		}
		final java.math.BigDecimal[] previousPoints = getRuleInternal((numberOfPoints - 1)).getFirst();
		final java.math.BigDecimal[] points = new java.math.BigDecimal[numberOfPoints];
		final java.math.BigDecimal[] weights = new java.math.BigDecimal[numberOfPoints];
		final int iMax = numberOfPoints / 2;
		for (int i = 0; i < iMax; i++) {
			java.math.BigDecimal a = i == 0 ? minusOne : previousPoints[(i - 1)];
			java.math.BigDecimal b = iMax == 1 ? java.math.BigDecimal.ONE : previousPoints[i];
			java.math.BigDecimal pma = java.math.BigDecimal.ONE;
			java.math.BigDecimal pa = a;
			java.math.BigDecimal pmb = java.math.BigDecimal.ONE;
			java.math.BigDecimal pb = b;
			for (int j = 1; j < numberOfPoints; j++) {
				final java.math.BigDecimal b_two_j_p_1 = new java.math.BigDecimal(((2 * j) + 1), mContext);
				final java.math.BigDecimal b_j = new java.math.BigDecimal(j, mContext);
				final java.math.BigDecimal b_j_p_1 = new java.math.BigDecimal((j + 1), mContext);
				java.math.BigDecimal tmp1 = a.multiply(b_two_j_p_1, mContext);
				tmp1 = pa.multiply(tmp1, mContext);
				java.math.BigDecimal tmp2 = pma.multiply(b_j, mContext);
				java.math.BigDecimal ppa = tmp1.subtract(tmp2, mContext);
				ppa = ppa.divide(b_j_p_1, mContext);
				tmp1 = b.multiply(b_two_j_p_1, mContext);
				tmp1 = pb.multiply(tmp1, mContext);
				tmp2 = pmb.multiply(b_j, mContext);
				java.math.BigDecimal ppb = tmp1.subtract(tmp2, mContext);
				ppb = ppb.divide(b_j_p_1, mContext);
				pma = pa;
				pa = ppa;
				pmb = pb;
				pb = ppb;
			}
			java.math.BigDecimal c = a.add(b, mContext).multiply(oneHalf, mContext);
			java.math.BigDecimal pmc = java.math.BigDecimal.ONE;
			java.math.BigDecimal pc = c;
			boolean done = false;
			while (!done) {
				java.math.BigDecimal tmp1 = b.subtract(a, mContext);
				java.math.BigDecimal tmp2 = c.ulp().multiply(java.math.BigDecimal.TEN, mContext);
				done = (tmp1.compareTo(tmp2)) <= 0;
				pmc = java.math.BigDecimal.ONE;
				pc = c;
				for (int j = 1; j < numberOfPoints; j++) {
					final java.math.BigDecimal b_two_j_p_1 = new java.math.BigDecimal(((2 * j) + 1), mContext);
					final java.math.BigDecimal b_j = new java.math.BigDecimal(j, mContext);
					final java.math.BigDecimal b_j_p_1 = new java.math.BigDecimal((j + 1), mContext);
					tmp1 = c.multiply(b_two_j_p_1, mContext);
					tmp1 = pc.multiply(tmp1, mContext);
					tmp2 = pmc.multiply(b_j, mContext);
					java.math.BigDecimal ppc = tmp1.subtract(tmp2, mContext);
					ppc = ppc.divide(b_j_p_1, mContext);
					pmc = pc;
					pc = ppc;
				}
				if (!done) {
					if (((pa.signum()) * (pc.signum())) <= 0) {
						b = c;
						pmb = pmc;
						pb = pc;
					}else {
						a = c;
						pma = pmc;
						pa = pc;
					}
					c = a.add(b, mContext).multiply(oneHalf, mContext);
				}
			} 
			final java.math.BigDecimal nP = new java.math.BigDecimal(numberOfPoints, mContext);
			java.math.BigDecimal tmp1 = pmc.subtract(c.multiply(pc, mContext), mContext);
			tmp1 = tmp1.multiply(nP);
			tmp1 = tmp1.pow(2, mContext);
			java.math.BigDecimal tmp2 = c.pow(2, mContext);
			tmp2 = java.math.BigDecimal.ONE.subtract(tmp2, mContext);
			tmp2 = tmp2.multiply(two, mContext);
			tmp2 = tmp2.divide(tmp1, mContext);
			points[i] = c;
			weights[i] = tmp2;
			final int idx = (numberOfPoints - i) - 1;
			points[idx] = c.negate(mContext);
			weights[idx] = tmp2;
		}
		if ((numberOfPoints % 2) == 1) {
			java.math.BigDecimal pmc = java.math.BigDecimal.ONE;
			for (int j = 1; j < numberOfPoints; j += 2) {
				final java.math.BigDecimal b_j = new java.math.BigDecimal(j, mContext);
				final java.math.BigDecimal b_j_p_1 = new java.math.BigDecimal((j + 1), mContext);
				pmc = pmc.multiply(b_j, mContext);
				pmc = pmc.divide(b_j_p_1, mContext);
				pmc = pmc.negate(mContext);
			}
			final java.math.BigDecimal nP = new java.math.BigDecimal(numberOfPoints, mContext);
			java.math.BigDecimal tmp1 = pmc.multiply(nP, mContext);
			tmp1 = tmp1.pow(2, mContext);
			java.math.BigDecimal tmp2 = two.divide(tmp1, mContext);
			points[iMax] = java.math.BigDecimal.ZERO;
			weights[iMax] = tmp2;
		}
		return new org.apache.commons.math3.util.Pair<java.math.BigDecimal[], java.math.BigDecimal[]>(points, weights);
	}
}


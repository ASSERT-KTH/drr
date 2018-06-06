

package org.apache.commons.math3.analysis.integration.gauss;


public abstract class BaseRuleFactory<T extends java.lang.Number> {
	private final java.util.Map<java.lang.Integer, org.apache.commons.math3.util.Pair<T[], T[]>> pointsAndWeights = new java.util.TreeMap<java.lang.Integer, org.apache.commons.math3.util.Pair<T[], T[]>>();

	private final java.util.Map<java.lang.Integer, org.apache.commons.math3.util.Pair<double[], double[]>> pointsAndWeightsDouble = new java.util.TreeMap<java.lang.Integer, org.apache.commons.math3.util.Pair<double[], double[]>>();

	public org.apache.commons.math3.util.Pair<double[], double[]> getRule(int numberOfPoints) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		org.apache.commons.math3.util.Pair<double[], double[]> cached = pointsAndWeightsDouble.get(numberOfPoints);
		if (cached == null) {
			final org.apache.commons.math3.util.Pair<T[], T[]> rule = getRuleInternal(numberOfPoints);
			cached = org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.convertToDouble(rule);
			pointsAndWeightsDouble.put(numberOfPoints, cached);
		}
		return new org.apache.commons.math3.util.Pair<double[], double[]>(cached.getFirst().clone(), cached.getSecond().clone());
	}

	protected synchronized org.apache.commons.math3.util.Pair<T[], T[]> getRuleInternal(int numberOfPoints) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		final org.apache.commons.math3.util.Pair<T[], T[]> rule = pointsAndWeights.get(numberOfPoints);
		if (rule == null) {
			addRule(computeRule(numberOfPoints));
			return getRuleInternal(numberOfPoints);
		}
		return rule;
	}

	protected void addRule(org.apache.commons.math3.util.Pair<T[], T[]> rule) {
		if ((rule.getFirst().length) != (rule.getSecond().length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(rule.getFirst().length, rule.getSecond().length);
		}
		pointsAndWeights.put(rule.getFirst().length, rule);
	}

	protected abstract org.apache.commons.math3.util.Pair<T[], T[]> computeRule(int numberOfPoints);

	private static <T extends java.lang.Number> org.apache.commons.math3.util.Pair<double[], double[]> convertToDouble(org.apache.commons.math3.util.Pair<T[], T[]> rule) {
		final T[] pT = rule.getFirst();
		final T[] wT = rule.getSecond();
		final int len = pT.length;
		final double[] pD = new double[len];
		final double[] wD = new double[len];
		for (int i = 0; i < len; i++) {
			pD[i] = pT[i].doubleValue();
			wD[i] = wT[i].doubleValue();
		}
		return new org.apache.commons.math3.util.Pair<double[], double[]>(pD, wD);
	}
}


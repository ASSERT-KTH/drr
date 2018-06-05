

package org.apache.commons.math3.distribution;


public class MixtureMultivariateRealDistribution<T extends org.apache.commons.math3.distribution.MultivariateRealDistribution> extends org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution {
	private final double[] weight;

	private final java.util.List<T> distribution;

	public MixtureMultivariateRealDistribution(java.util.List<org.apache.commons.math3.util.Pair<java.lang.Double, T>> components) {
		this(new org.apache.commons.math3.random.Well19937c(), components);
	}

	public MixtureMultivariateRealDistribution(org.apache.commons.math3.random.RandomGenerator rng, java.util.List<org.apache.commons.math3.util.Pair<java.lang.Double, T>> components) {
		super(rng, components.get(0).getSecond().getDimension());
		final int numComp = components.size();
		final int dim = getDimension();
		double weightSum = 0;
		for (int i = 0; i < numComp; i++) {
			final org.apache.commons.math3.util.Pair<java.lang.Double, T> comp = components.get(i);
			if ((comp.getSecond().getDimension()) != dim) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(comp.getSecond().getDimension(), dim);
			}
			if ((comp.getFirst()) < 0) {
				throw new org.apache.commons.math3.exception.NotPositiveException(comp.getFirst());
			}
			weightSum += comp.getFirst();
		}
		if (java.lang.Double.isInfinite(weightSum)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW);
		}
		distribution = new java.util.ArrayList<T>();
		weight = new double[numComp];
		for (int i = 0; i < numComp; i++) {
			final org.apache.commons.math3.util.Pair<java.lang.Double, T> comp = components.get(i);
			weight[i] = (comp.getFirst()) / weightSum;
			distribution.add(comp.getSecond());
		}
	}

	public double density(final double[] values) {
		double p = 0;
		for (int i = 0; i < (weight.length); i++) {
			p += (weight[i]) * (distribution.get(i).density(values));
		}
		return p;
	}

	public double[] sample() {
		double[] vals = null;
		final double randomValue = random.nextDouble();
		double sum = 0;
		for (int i = 0; i < (weight.length); i++) {
			sum += weight[i];
			if (randomValue <= sum) {
				vals = distribution.get(i).sample();
				break;
			}
		}
		if (vals == null) {
			vals = distribution.get(((weight.length) - 1)).sample();
		}
		return vals;
	}

	public void reseedRandomGenerator(long seed) {
		super.reseedRandomGenerator(seed);
		for (int i = 0; i < (distribution.size()); i++) {
			distribution.get(i).reseedRandomGenerator(((i + 1) + seed));
		}
	}

	public java.util.List<org.apache.commons.math3.util.Pair<java.lang.Double, T>> getComponents() {
		final java.util.List<org.apache.commons.math3.util.Pair<java.lang.Double, T>> list = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Double, T>>();
		for (int i = 0; i < (weight.length); i++) {
			list.add(new org.apache.commons.math3.util.Pair<java.lang.Double, T>(weight[i], distribution.get(i)));
		}
		return list;
	}
}


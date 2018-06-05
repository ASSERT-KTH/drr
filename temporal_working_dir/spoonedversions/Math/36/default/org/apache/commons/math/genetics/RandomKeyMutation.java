

package org.apache.commons.math.genetics;


public class RandomKeyMutation implements org.apache.commons.math.genetics.MutationPolicy {
	public org.apache.commons.math.genetics.Chromosome mutate(final org.apache.commons.math.genetics.Chromosome original) {
		if (!(original instanceof org.apache.commons.math.genetics.RandomKey<?>)) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS, original.getClass().getSimpleName());
		}
		org.apache.commons.math.genetics.RandomKey<?> originalRk = ((org.apache.commons.math.genetics.RandomKey<?>) (original));
		java.util.List<java.lang.Double> repr = originalRk.getRepresentation();
		int rInd = org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator().nextInt(repr.size());
		java.util.List<java.lang.Double> newRepr = new java.util.ArrayList<java.lang.Double>(repr);
		newRepr.set(rInd, org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator().nextDouble());
		return originalRk.newFixedLengthChromosome(newRepr);
	}
}


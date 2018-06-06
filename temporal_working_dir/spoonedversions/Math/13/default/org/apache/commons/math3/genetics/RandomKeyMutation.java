

package org.apache.commons.math3.genetics;


public class RandomKeyMutation implements org.apache.commons.math3.genetics.MutationPolicy {
	public org.apache.commons.math3.genetics.Chromosome mutate(final org.apache.commons.math3.genetics.Chromosome original) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (!(original instanceof org.apache.commons.math3.genetics.RandomKey<?>)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS, original.getClass().getSimpleName());
		}
		org.apache.commons.math3.genetics.RandomKey<?> originalRk = ((org.apache.commons.math3.genetics.RandomKey<?>) (original));
		java.util.List<java.lang.Double> repr = originalRk.getRepresentation();
		int rInd = org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextInt(repr.size());
		java.util.List<java.lang.Double> newRepr = new java.util.ArrayList<java.lang.Double>(repr);
		newRepr.set(rInd, org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextDouble());
		return originalRk.newFixedLengthChromosome(newRepr);
	}
}


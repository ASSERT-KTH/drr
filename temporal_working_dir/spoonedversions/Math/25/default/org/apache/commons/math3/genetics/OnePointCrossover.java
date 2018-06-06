

package org.apache.commons.math3.genetics;


public class OnePointCrossover<T> implements org.apache.commons.math3.genetics.CrossoverPolicy {
	@java.lang.SuppressWarnings(value = "unchecked")
	public org.apache.commons.math3.genetics.ChromosomePair crossover(final org.apache.commons.math3.genetics.Chromosome first, final org.apache.commons.math3.genetics.Chromosome second) {
		if (!((first instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>) && (second instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
		}
		return crossover(((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (first)), ((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (second)));
	}

	private org.apache.commons.math3.genetics.ChromosomePair crossover(final org.apache.commons.math3.genetics.AbstractListChromosome<T> first, final org.apache.commons.math3.genetics.AbstractListChromosome<T> second) {
		final int length = first.getLength();
		if (length != (second.getLength())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(second.getLength(), length);
		}
		final java.util.List<T> parent1Rep = first.getRepresentation();
		final java.util.List<T> parent2Rep = second.getRepresentation();
		final java.util.ArrayList<T> child1Rep = new java.util.ArrayList<T>(first.getLength());
		final java.util.ArrayList<T> child2Rep = new java.util.ArrayList<T>(second.getLength());
		final int crossoverIndex = 1 + (org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextInt((length - 2)));
		for (int i = 0; i < crossoverIndex; i++) {
			child1Rep.add(parent1Rep.get(i));
			child2Rep.add(parent2Rep.get(i));
		}
		for (int i = crossoverIndex; i < length; i++) {
			child1Rep.add(parent2Rep.get(i));
			child2Rep.add(parent1Rep.get(i));
		}
		return new org.apache.commons.math3.genetics.ChromosomePair(first.newFixedLengthChromosome(child1Rep), second.newFixedLengthChromosome(child2Rep));
	}
}


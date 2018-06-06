

package org.apache.commons.math3.genetics;


public class NPointCrossover<T> implements org.apache.commons.math3.genetics.CrossoverPolicy {
	private final int crossoverPoints;

	public NPointCrossover(final int crossoverPoints) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		if (crossoverPoints <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(crossoverPoints);
		}
		this.crossoverPoints = crossoverPoints;
	}

	public int getCrossoverPoints() {
		return crossoverPoints;
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	public org.apache.commons.math3.genetics.ChromosomePair crossover(final org.apache.commons.math3.genetics.Chromosome first, final org.apache.commons.math3.genetics.Chromosome second) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (!((first instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>) && (second instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
		}
		return mate(((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (first)), ((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (second)));
	}

	private org.apache.commons.math3.genetics.ChromosomePair mate(final org.apache.commons.math3.genetics.AbstractListChromosome<T> first, final org.apache.commons.math3.genetics.AbstractListChromosome<T> second) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		final int length = first.getLength();
		if (length != (second.getLength())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(second.getLength(), length);
		}
		if ((crossoverPoints) >= length) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(crossoverPoints, length, false);
		}
		final java.util.List<T> parent1Rep = first.getRepresentation();
		final java.util.List<T> parent2Rep = second.getRepresentation();
		final java.util.ArrayList<T> child1Rep = new java.util.ArrayList<T>(first.getLength());
		final java.util.ArrayList<T> child2Rep = new java.util.ArrayList<T>(second.getLength());
		final org.apache.commons.math3.random.RandomGenerator random = org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator();
		java.util.ArrayList<T> c1 = child1Rep;
		java.util.ArrayList<T> c2 = child2Rep;
		int remainingPoints = crossoverPoints;
		int lastIndex = 0;
		for (int i = 0; i < (crossoverPoints); i++ , remainingPoints--) {
			final int crossoverIndex = (1 + lastIndex) + (random.nextInt(((length - lastIndex) - remainingPoints)));
			for (int j = lastIndex; j < crossoverIndex; j++) {
				c1.add(parent1Rep.get(j));
				c2.add(parent2Rep.get(j));
			}
			java.util.ArrayList<T> tmp = c1;
			c1 = c2;
			c2 = tmp;
			lastIndex = crossoverIndex;
		}
		for (int j = lastIndex; j < length; j++) {
			c1.add(parent1Rep.get(j));
			c2.add(parent2Rep.get(j));
		}
		return new org.apache.commons.math3.genetics.ChromosomePair(first.newFixedLengthChromosome(child1Rep), second.newFixedLengthChromosome(child2Rep));
	}
}


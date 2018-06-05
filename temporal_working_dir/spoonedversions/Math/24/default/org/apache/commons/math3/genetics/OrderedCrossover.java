

package org.apache.commons.math3.genetics;


public class OrderedCrossover<T> implements org.apache.commons.math3.genetics.CrossoverPolicy {
	@java.lang.SuppressWarnings(value = "unchecked")
	public org.apache.commons.math3.genetics.ChromosomePair crossover(final org.apache.commons.math3.genetics.Chromosome first, final org.apache.commons.math3.genetics.Chromosome second) {
		if (!((first instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>) && (second instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
		}
		return mate(((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (first)), ((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (second)));
	}

	protected org.apache.commons.math3.genetics.ChromosomePair mate(final org.apache.commons.math3.genetics.AbstractListChromosome<T> first, final org.apache.commons.math3.genetics.AbstractListChromosome<T> second) {
		final int length = first.getLength();
		if (length != (second.getLength())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(second.getLength(), length);
		}
		final java.util.List<T> parent1Rep = first.getRepresentation();
		final java.util.List<T> parent2Rep = second.getRepresentation();
		final java.util.List<T> child1 = new java.util.ArrayList<T>(length);
		final java.util.List<T> child2 = new java.util.ArrayList<T>(length);
		final java.util.Set<T> child1Set = new java.util.HashSet<T>(length);
		final java.util.Set<T> child2Set = new java.util.HashSet<T>(length);
		final org.apache.commons.math3.random.RandomGenerator random = org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator();
		int a = random.nextInt(length);
		int b;
		do {
			b = random.nextInt(length);
		} while (a == b );
		final int lb = org.apache.commons.math3.util.FastMath.min(a, b);
		final int ub = org.apache.commons.math3.util.FastMath.max(a, b);
		child1.addAll(parent1Rep.subList(lb, (ub + 1)));
		child1Set.addAll(child1);
		child2.addAll(parent2Rep.subList(lb, (ub + 1)));
		child2Set.addAll(child2);
		for (int i = 1; i <= length; i++) {
			final int idx = (ub + i) % length;
			final T item1 = parent1Rep.get(idx);
			final T item2 = parent2Rep.get(idx);
			if (!(child1Set.contains(item2))) {
				child1.add(item2);
				child1Set.add(item2);
			}
			if (!(child2Set.contains(item1))) {
				child2.add(item1);
				child2Set.add(item1);
			}
		}
		java.util.Collections.rotate(child1, lb);
		java.util.Collections.rotate(child2, lb);
		return new org.apache.commons.math3.genetics.ChromosomePair(first.newFixedLengthChromosome(child1), second.newFixedLengthChromosome(child2));
	}
}


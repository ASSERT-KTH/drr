

package org.apache.commons.math3.genetics;


public class CycleCrossover<T> implements org.apache.commons.math3.genetics.CrossoverPolicy {
	private final boolean randomStart;

	public CycleCrossover() {
		this(false);
	}

	public CycleCrossover(final boolean randomStart) {
		this.randomStart = randomStart;
	}

	public boolean isRandomStart() {
		return randomStart;
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	public org.apache.commons.math3.genetics.ChromosomePair crossover(final org.apache.commons.math3.genetics.Chromosome first, final org.apache.commons.math3.genetics.Chromosome second) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (!((first instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>) && (second instanceof org.apache.commons.math3.genetics.AbstractListChromosome<?>))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME);
		}
		return mate(((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (first)), ((org.apache.commons.math3.genetics.AbstractListChromosome<T>) (second)));
	}

	protected org.apache.commons.math3.genetics.ChromosomePair mate(final org.apache.commons.math3.genetics.AbstractListChromosome<T> first, final org.apache.commons.math3.genetics.AbstractListChromosome<T> second) throws org.apache.commons.math3.exception.DimensionMismatchException {
		final int length = first.getLength();
		if (length != (second.getLength())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(second.getLength(), length);
		}
		final java.util.List<T> parent1Rep = first.getRepresentation();
		final java.util.List<T> parent2Rep = second.getRepresentation();
		final java.util.List<T> child1Rep = new java.util.ArrayList<T>(second.getRepresentation());
		final java.util.List<T> child2Rep = new java.util.ArrayList<T>(first.getRepresentation());
		final java.util.Set<java.lang.Integer> visitedIndices = new java.util.HashSet<java.lang.Integer>(length);
		final java.util.List<java.lang.Integer> indices = new java.util.ArrayList<java.lang.Integer>(length);
		int idx = randomStart ? org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextInt(length) : 0;
		int cycle = 1;
		while ((visitedIndices.size()) < length) {
			indices.add(idx);
			T item = parent2Rep.get(idx);
			idx = parent1Rep.indexOf(item);
			while (idx != (indices.get(0))) {
				indices.add(idx);
				item = parent2Rep.get(idx);
				idx = parent1Rep.indexOf(item);
			} 
			if (((cycle++) % 2) != 0) {
				for (int i : indices) {
					T tmp = child1Rep.get(i);
					child1Rep.set(i, child2Rep.get(i));
					child2Rep.set(i, tmp);
				}
			}
			visitedIndices.addAll(indices);
			idx = ((indices.get(0)) + 1) % length;
			while ((visitedIndices.contains(idx)) && ((visitedIndices.size()) < length)) {
				idx++;
				if (idx >= length) {
					idx = 0;
				}
			} 
			indices.clear();
		} 
		return new org.apache.commons.math3.genetics.ChromosomePair(first.newFixedLengthChromosome(child1Rep), second.newFixedLengthChromosome(child2Rep));
	}
}


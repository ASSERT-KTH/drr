

package org.apache.commons.math3.genetics;


public class GeneticAlgorithm {
	private static org.apache.commons.math3.random.RandomGenerator randomGenerator = new org.apache.commons.math3.random.JDKRandomGenerator();

	private final org.apache.commons.math3.genetics.CrossoverPolicy crossoverPolicy;

	private final double crossoverRate;

	private final org.apache.commons.math3.genetics.MutationPolicy mutationPolicy;

	private final double mutationRate;

	private final org.apache.commons.math3.genetics.SelectionPolicy selectionPolicy;

	private int generationsEvolved = 0;

	public GeneticAlgorithm(final org.apache.commons.math3.genetics.CrossoverPolicy crossoverPolicy, final double crossoverRate, final org.apache.commons.math3.genetics.MutationPolicy mutationPolicy, final double mutationRate, final org.apache.commons.math3.genetics.SelectionPolicy selectionPolicy) {
		if ((crossoverRate < 0) || (crossoverRate > 1)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSOVER_RATE, crossoverRate, 0, 1);
		}
		if ((mutationRate < 0) || (mutationRate > 1)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.MUTATION_RATE, mutationRate, 0, 1);
		}
		this.crossoverPolicy = crossoverPolicy;
		this.crossoverRate = crossoverRate;
		this.mutationPolicy = mutationPolicy;
		this.mutationRate = mutationRate;
		this.selectionPolicy = selectionPolicy;
	}

	public static synchronized void setRandomGenerator(final org.apache.commons.math3.random.RandomGenerator random) {
		org.apache.commons.math3.genetics.GeneticAlgorithm.randomGenerator = random;
	}

	public static synchronized org.apache.commons.math3.random.RandomGenerator getRandomGenerator() {
		return org.apache.commons.math3.genetics.GeneticAlgorithm.randomGenerator;
	}

	public org.apache.commons.math3.genetics.Population evolve(final org.apache.commons.math3.genetics.Population initial, final org.apache.commons.math3.genetics.StoppingCondition condition) {
		org.apache.commons.math3.genetics.Population current = initial;
		generationsEvolved = 0;
		while (!(condition.isSatisfied(current))) {
			current = nextGeneration(current);
			(generationsEvolved)++;
		} 
		return current;
	}

	public org.apache.commons.math3.genetics.Population nextGeneration(final org.apache.commons.math3.genetics.Population current) {
		org.apache.commons.math3.genetics.Population nextGeneration = current.nextGeneration();
		org.apache.commons.math3.random.RandomGenerator randGen = org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator();
		while ((nextGeneration.getPopulationSize()) < (nextGeneration.getPopulationLimit())) {
			org.apache.commons.math3.genetics.ChromosomePair pair = getSelectionPolicy().select(current);
			if ((randGen.nextDouble()) < (getCrossoverRate())) {
				pair = getCrossoverPolicy().crossover(pair.getFirst(), pair.getSecond());
			}
			if ((randGen.nextDouble()) < (getMutationRate())) {
				pair = new org.apache.commons.math3.genetics.ChromosomePair(getMutationPolicy().mutate(pair.getFirst()), getMutationPolicy().mutate(pair.getSecond()));
			}
			nextGeneration.addChromosome(pair.getFirst());
			if ((nextGeneration.getPopulationSize()) < (nextGeneration.getPopulationLimit())) {
				nextGeneration.addChromosome(pair.getSecond());
			}
		} 
		return nextGeneration;
	}

	public org.apache.commons.math3.genetics.CrossoverPolicy getCrossoverPolicy() {
		return crossoverPolicy;
	}

	public double getCrossoverRate() {
		return crossoverRate;
	}

	public org.apache.commons.math3.genetics.MutationPolicy getMutationPolicy() {
		return mutationPolicy;
	}

	public double getMutationRate() {
		return mutationRate;
	}

	public org.apache.commons.math3.genetics.SelectionPolicy getSelectionPolicy() {
		return selectionPolicy;
	}

	public int getGenerationsEvolved() {
		return generationsEvolved;
	}
}


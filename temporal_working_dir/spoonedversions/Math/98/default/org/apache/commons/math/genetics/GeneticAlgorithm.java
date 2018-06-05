

package org.apache.commons.math.genetics;


public class GeneticAlgorithm {
	private org.apache.commons.math.genetics.CrossoverPolicy crossoverPolicy;

	private double crossoverRate;

	private org.apache.commons.math.genetics.MutationPolicy mutationPolicy;

	private double mutationRate;

	private org.apache.commons.math.genetics.SelectionPolicy selectionPolicy;

	public org.apache.commons.math.genetics.Population evolve(org.apache.commons.math.genetics.Population initial, org.apache.commons.math.genetics.StoppingCondition condition) {
		org.apache.commons.math.genetics.Population current = initial;
		while (!(condition.isSatisfied(current))) {
			current = nextGeneration(current);
		} 
		return current;
	}

	private org.apache.commons.math.genetics.CrossoverPolicy getCrossoverPolicy() {
		return crossoverPolicy;
	}

	private double getCrossoverRate() {
		return crossoverRate;
	}

	private org.apache.commons.math.genetics.MutationPolicy getMutationPolicy() {
		return mutationPolicy;
	}

	private double getMutationRate() {
		return mutationRate;
	}

	private org.apache.commons.math.genetics.SelectionPolicy getSelectionPolicy() {
		return selectionPolicy;
	}

	private org.apache.commons.math.genetics.Population nextGeneration(org.apache.commons.math.genetics.Population current) {
		org.apache.commons.math.genetics.Population nextGeneration = current.nextGeneration();
		while ((nextGeneration.getPopulationSize()) < (nextGeneration.getPopulationLimit())) {
			org.apache.commons.math.genetics.ChromosomePair pair = getSelectionPolicy().select(current);
			if ((java.lang.Math.random()) < (getCrossoverRate())) {
				pair = getCrossoverPolicy().crossover(pair.getFirst(), pair.getSecond());
			}
			if ((java.lang.Math.random()) < (getMutationRate())) {
				nextGeneration.addChromosome(getMutationPolicy().mutate(pair.getFirst()));
				if ((nextGeneration.getPopulationSize()) < (nextGeneration.getPopulationLimit())) {
					nextGeneration.addChromosome(getMutationPolicy().mutate(pair.getSecond()));
				}
			}
		} 
		return nextGeneration;
	}

	public void setCrossoverPolicy(org.apache.commons.math.genetics.CrossoverPolicy value) {
		org.apache.commons.math.genetics.GeneticAlgorithm.this.crossoverPolicy = value;
	}

	public void setCrossoverRate(double value) {
		org.apache.commons.math.genetics.GeneticAlgorithm.this.crossoverRate = value;
	}

	public void setMutationPolicy(org.apache.commons.math.genetics.MutationPolicy value) {
		org.apache.commons.math.genetics.GeneticAlgorithm.this.mutationPolicy = value;
	}

	public void setMutationRate(double value) {
		org.apache.commons.math.genetics.GeneticAlgorithm.this.mutationRate = value;
	}

	public void setSelectionPolicy(org.apache.commons.math.genetics.SelectionPolicy value) {
		org.apache.commons.math.genetics.GeneticAlgorithm.this.selectionPolicy = value;
	}
}


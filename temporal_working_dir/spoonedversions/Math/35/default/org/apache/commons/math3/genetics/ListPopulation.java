

package org.apache.commons.math3.genetics;


public abstract class ListPopulation implements org.apache.commons.math3.genetics.Population {
	private java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomes;

	private int populationLimit;

	public ListPopulation(final java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomes, final int populationLimit) {
		if ((chromosomes.size()) > populationLimit) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(org.apache.commons.math3.exception.util.LocalizedFormats.LIST_OF_CHROMOSOMES_BIGGER_THAN_POPULATION_SIZE, chromosomes.size(), populationLimit, false);
		}
		if (populationLimit <= 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE, populationLimit);
		}
		org.apache.commons.math3.genetics.ListPopulation.this.chromosomes = chromosomes;
		org.apache.commons.math3.genetics.ListPopulation.this.populationLimit = populationLimit;
	}

	public ListPopulation(final int populationLimit) {
		if (populationLimit <= 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.POPULATION_LIMIT_NOT_POSITIVE, populationLimit);
		}
		org.apache.commons.math3.genetics.ListPopulation.this.populationLimit = populationLimit;
		org.apache.commons.math3.genetics.ListPopulation.this.chromosomes = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>(populationLimit);
	}

	public void setChromosomes(final java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomes) {
		org.apache.commons.math3.genetics.ListPopulation.this.chromosomes = chromosomes;
	}

	public java.util.List<org.apache.commons.math3.genetics.Chromosome> getChromosomes() {
		return chromosomes;
	}

	public void addChromosome(final org.apache.commons.math3.genetics.Chromosome chromosome) {
		org.apache.commons.math3.genetics.ListPopulation.this.chromosomes.add(chromosome);
	}

	public org.apache.commons.math3.genetics.Chromosome getFittestChromosome() {
		org.apache.commons.math3.genetics.Chromosome bestChromosome = org.apache.commons.math3.genetics.ListPopulation.this.chromosomes.get(0);
		for (org.apache.commons.math3.genetics.Chromosome chromosome : org.apache.commons.math3.genetics.ListPopulation.this.chromosomes) {
			if ((chromosome.compareTo(bestChromosome)) > 0) {
				bestChromosome = chromosome;
			}
		}
		return bestChromosome;
	}

	public int getPopulationLimit() {
		return org.apache.commons.math3.genetics.ListPopulation.this.populationLimit;
	}

	public void setPopulationLimit(final int populationLimit) {
		org.apache.commons.math3.genetics.ListPopulation.this.populationLimit = populationLimit;
	}

	public int getPopulationSize() {
		return org.apache.commons.math3.genetics.ListPopulation.this.chromosomes.size();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.math3.genetics.ListPopulation.this.chromosomes.toString();
	}

	public java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> iterator() {
		return chromosomes.iterator();
	}
}


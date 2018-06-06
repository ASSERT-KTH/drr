

package org.apache.commons.math3.genetics;


public class ElitisticListPopulation extends org.apache.commons.math3.genetics.ListPopulation {
	private double elitismRate = 0.9;

	public ElitisticListPopulation(final java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomes, final int populationLimit, final double elitismRate) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooLargeException, org.apache.commons.math3.exception.OutOfRangeException {
		super(chromosomes, populationLimit);
		setElitismRate(elitismRate);
	}

	public ElitisticListPopulation(final int populationLimit, final double elitismRate) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		super(populationLimit);
		setElitismRate(elitismRate);
	}

	public org.apache.commons.math3.genetics.Population nextGeneration() {
		org.apache.commons.math3.genetics.ElitisticListPopulation nextGeneration = new org.apache.commons.math3.genetics.ElitisticListPopulation(getPopulationLimit(), getElitismRate());
		final java.util.List<org.apache.commons.math3.genetics.Chromosome> oldChromosomes = getChromosomeList();
		java.util.Collections.sort(oldChromosomes);
		int boundIndex = ((int) (org.apache.commons.math3.util.FastMath.ceil(((1.0 - (getElitismRate())) * (oldChromosomes.size())))));
		for (int i = boundIndex; i < (oldChromosomes.size()); i++) {
			nextGeneration.addChromosome(oldChromosomes.get(i));
		}
		return nextGeneration;
	}

	public void setElitismRate(final double elitismRate) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((elitismRate < 0) || (elitismRate > 1)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.ELITISM_RATE, elitismRate, 0, 1);
		}
		org.apache.commons.math3.genetics.ElitisticListPopulation.this.elitismRate = elitismRate;
	}

	public double getElitismRate() {
		return org.apache.commons.math3.genetics.ElitisticListPopulation.this.elitismRate;
	}
}


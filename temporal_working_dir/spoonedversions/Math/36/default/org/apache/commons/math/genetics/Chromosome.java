

package org.apache.commons.math.genetics;


public abstract class Chromosome implements java.lang.Comparable<org.apache.commons.math.genetics.Chromosome> , org.apache.commons.math.genetics.Fitness {
	private double fitness = java.lang.Double.MIN_VALUE;

	public double getFitness() {
		if ((org.apache.commons.math.genetics.Chromosome.this.fitness) == (java.lang.Double.MIN_VALUE)) {
			org.apache.commons.math.genetics.Chromosome.this.fitness = fitness();
		}
		return org.apache.commons.math.genetics.Chromosome.this.fitness;
	}

	public int compareTo(final org.apache.commons.math.genetics.Chromosome another) {
		return ((java.lang.Double) (org.apache.commons.math.genetics.Chromosome.this.getFitness())).compareTo(another.getFitness());
	}

	protected boolean isSame(final org.apache.commons.math.genetics.Chromosome another) {
		return false;
	}

	protected org.apache.commons.math.genetics.Chromosome findSameChromosome(final org.apache.commons.math.genetics.Population population) {
		for (org.apache.commons.math.genetics.Chromosome anotherChr : population) {
			if (org.apache.commons.math.genetics.Chromosome.this.isSame(anotherChr)) {
				return anotherChr;
			}
		}
		return null;
	}

	public void searchForFitnessUpdate(final org.apache.commons.math.genetics.Population population) {
		org.apache.commons.math.genetics.Chromosome sameChromosome = findSameChromosome(population);
		if (sameChromosome != null) {
			fitness = sameChromosome.getFitness();
		}
	}
}


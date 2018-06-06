

package org.apache.commons.math3.genetics;


public abstract class Chromosome implements java.lang.Comparable<org.apache.commons.math3.genetics.Chromosome> , org.apache.commons.math3.genetics.Fitness {
	private static final double NO_FITNESS = java.lang.Double.NEGATIVE_INFINITY;

	private double fitness = org.apache.commons.math3.genetics.Chromosome.NO_FITNESS;

	public double getFitness() {
		if ((org.apache.commons.math3.genetics.Chromosome.this.fitness) == (org.apache.commons.math3.genetics.Chromosome.NO_FITNESS)) {
			org.apache.commons.math3.genetics.Chromosome.this.fitness = fitness();
		}
		return org.apache.commons.math3.genetics.Chromosome.this.fitness;
	}

	public int compareTo(final org.apache.commons.math3.genetics.Chromosome another) {
		return ((java.lang.Double) (org.apache.commons.math3.genetics.Chromosome.this.getFitness())).compareTo(another.getFitness());
	}

	protected boolean isSame(final org.apache.commons.math3.genetics.Chromosome another) {
		return false;
	}

	protected org.apache.commons.math3.genetics.Chromosome findSameChromosome(final org.apache.commons.math3.genetics.Population population) {
		for (org.apache.commons.math3.genetics.Chromosome anotherChr : population) {
			if (org.apache.commons.math3.genetics.Chromosome.this.isSame(anotherChr)) {
				return anotherChr;
			}
		}
		return null;
	}

	public void searchForFitnessUpdate(final org.apache.commons.math3.genetics.Population population) {
		org.apache.commons.math3.genetics.Chromosome sameChromosome = findSameChromosome(population);
		if (sameChromosome != null) {
			fitness = sameChromosome.getFitness();
		}
	}
}


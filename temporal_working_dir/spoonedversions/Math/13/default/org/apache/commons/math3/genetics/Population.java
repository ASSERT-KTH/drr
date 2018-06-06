

package org.apache.commons.math3.genetics;


public interface Population extends java.lang.Iterable<org.apache.commons.math3.genetics.Chromosome> {
	int getPopulationSize();

	int getPopulationLimit();

	org.apache.commons.math3.genetics.Population nextGeneration();

	void addChromosome(org.apache.commons.math3.genetics.Chromosome chromosome) throws org.apache.commons.math3.exception.NumberIsTooLargeException;

	org.apache.commons.math3.genetics.Chromosome getFittestChromosome();
}


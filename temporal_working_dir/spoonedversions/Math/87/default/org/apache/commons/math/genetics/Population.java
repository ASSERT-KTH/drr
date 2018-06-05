

package org.apache.commons.math.genetics;


public interface Population {
	int getPopulationSize();

	int getPopulationLimit();

	org.apache.commons.math.genetics.Population nextGeneration();

	void addChromosome(org.apache.commons.math.genetics.Chromosome chromosome);

	org.apache.commons.math.genetics.Chromosome getFittestChromosome();
}




package org.apache.commons.math3.genetics;


public interface CrossoverPolicy {
	org.apache.commons.math3.genetics.ChromosomePair crossover(org.apache.commons.math3.genetics.Chromosome first, org.apache.commons.math3.genetics.Chromosome second);
}


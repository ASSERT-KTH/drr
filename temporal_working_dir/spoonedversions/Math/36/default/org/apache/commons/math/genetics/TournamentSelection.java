

package org.apache.commons.math.genetics;


public class TournamentSelection implements org.apache.commons.math.genetics.SelectionPolicy {
	private int arity;

	public TournamentSelection(final int arity) {
		org.apache.commons.math.genetics.TournamentSelection.this.arity = arity;
	}

	public org.apache.commons.math.genetics.ChromosomePair select(final org.apache.commons.math.genetics.Population population) {
		return new org.apache.commons.math.genetics.ChromosomePair(tournament(((org.apache.commons.math.genetics.ListPopulation) (population))), tournament(((org.apache.commons.math.genetics.ListPopulation) (population))));
	}

	private org.apache.commons.math.genetics.Chromosome tournament(final org.apache.commons.math.genetics.ListPopulation population) {
		if ((population.getPopulationSize()) < (org.apache.commons.math.genetics.TournamentSelection.this.arity)) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.TOO_LARGE_TOURNAMENT_ARITY, arity, population.getPopulationSize());
		}
		org.apache.commons.math.genetics.ListPopulation tournamentPopulation = new org.apache.commons.math.genetics.ListPopulation(org.apache.commons.math.genetics.TournamentSelection.this.arity) {
			public org.apache.commons.math.genetics.Population nextGeneration() {
				return null;
			}
		};
		java.util.List<org.apache.commons.math.genetics.Chromosome> chromosomes = new java.util.ArrayList<org.apache.commons.math.genetics.Chromosome>(population.getChromosomes());
		for (int i = 0; i < (org.apache.commons.math.genetics.TournamentSelection.this.arity); i++) {
			int rind = org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator().nextInt(chromosomes.size());
			tournamentPopulation.addChromosome(chromosomes.get(rind));
			chromosomes.remove(rind);
		}
		return tournamentPopulation.getFittestChromosome();
	}

	public int getArity() {
		return arity;
	}

	public void setArity(final int arity) {
		org.apache.commons.math.genetics.TournamentSelection.this.arity = arity;
	}
}


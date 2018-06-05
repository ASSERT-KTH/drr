

package org.apache.commons.math3.genetics;


public class BinaryMutation implements org.apache.commons.math3.genetics.MutationPolicy {
	public org.apache.commons.math3.genetics.Chromosome mutate(org.apache.commons.math3.genetics.Chromosome original) {
		if (!(original instanceof org.apache.commons.math3.genetics.BinaryChromosome)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME);
		}
		org.apache.commons.math3.genetics.BinaryChromosome origChrom = ((org.apache.commons.math3.genetics.BinaryChromosome) (original));
		java.util.List<java.lang.Integer> newRepr = new java.util.ArrayList<java.lang.Integer>(origChrom.getRepresentation());
		int geneIndex = org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextInt(origChrom.getLength());
		newRepr.set(geneIndex, ((origChrom.getRepresentation().get(geneIndex)) == 0 ? 1 : 0));
		org.apache.commons.math3.genetics.Chromosome newChrom = origChrom.newFixedLengthChromosome(newRepr);
		return newChrom;
	}
}


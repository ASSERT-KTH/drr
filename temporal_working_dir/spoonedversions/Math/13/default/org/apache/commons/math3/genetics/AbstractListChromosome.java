

package org.apache.commons.math3.genetics;


public abstract class AbstractListChromosome<T> extends org.apache.commons.math3.genetics.Chromosome {
	private final java.util.List<T> representation;

	public AbstractListChromosome(final java.util.List<T> representation) throws org.apache.commons.math3.genetics.InvalidRepresentationException {
		checkValidity(representation);
		this.representation = java.util.Collections.unmodifiableList(new java.util.ArrayList<T>(representation));
	}

	public AbstractListChromosome(final T[] representation) throws org.apache.commons.math3.genetics.InvalidRepresentationException {
		this(java.util.Arrays.asList(representation));
	}

	protected abstract void checkValidity(java.util.List<T> chromosomeRepresentation) throws org.apache.commons.math3.genetics.InvalidRepresentationException;

	protected java.util.List<T> getRepresentation() {
		return representation;
	}

	public int getLength() {
		return getRepresentation().size();
	}

	public abstract org.apache.commons.math3.genetics.AbstractListChromosome<T> newFixedLengthChromosome(final java.util.List<T> chromosomeRepresentation);

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format("(f=%s %s)", getFitness(), getRepresentation());
	}
}


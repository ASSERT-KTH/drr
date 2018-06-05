

package org.apache.commons.math3.genetics;


public class ChromosomePair {
	private final org.apache.commons.math3.genetics.Chromosome first;

	private final org.apache.commons.math3.genetics.Chromosome second;

	public ChromosomePair(final org.apache.commons.math3.genetics.Chromosome c1, final org.apache.commons.math3.genetics.Chromosome c2) {
		super();
		first = c1;
		second = c2;
	}

	public org.apache.commons.math3.genetics.Chromosome getFirst() {
		return first;
	}

	public org.apache.commons.math3.genetics.Chromosome getSecond() {
		return second;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format("(%s,%s)", getFirst(), getSecond());
	}
}


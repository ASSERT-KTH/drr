

package org.apache.commons.math.genetics;


public class ChromosomePair {
	private org.apache.commons.math.genetics.Chromosome first;

	private org.apache.commons.math.genetics.Chromosome second;

	public ChromosomePair(org.apache.commons.math.genetics.Chromosome c1, org.apache.commons.math.genetics.Chromosome c2) {
		super();
		first = c1;
		second = c2;
	}

	public org.apache.commons.math.genetics.Chromosome getFirst() {
		return first;
	}

	public org.apache.commons.math.genetics.Chromosome getSecond() {
		return second;
	}
}


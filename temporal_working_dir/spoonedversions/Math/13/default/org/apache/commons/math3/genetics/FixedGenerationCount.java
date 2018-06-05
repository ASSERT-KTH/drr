

package org.apache.commons.math3.genetics;


public class FixedGenerationCount implements org.apache.commons.math3.genetics.StoppingCondition {
	private int numGenerations = 0;

	private final int maxGenerations;

	public FixedGenerationCount(final int maxGenerations) throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (maxGenerations <= 0) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(maxGenerations, 1, true);
		}
		this.maxGenerations = maxGenerations;
	}

	public boolean isSatisfied(final org.apache.commons.math3.genetics.Population population) {
		if ((org.apache.commons.math3.genetics.FixedGenerationCount.this.numGenerations) < (org.apache.commons.math3.genetics.FixedGenerationCount.this.maxGenerations)) {
			(numGenerations)++;
			return false;
		}
		return true;
	}

	public int getNumGenerations() {
		return numGenerations;
	}
}


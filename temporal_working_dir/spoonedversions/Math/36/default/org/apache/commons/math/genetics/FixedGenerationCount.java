

package org.apache.commons.math.genetics;


public class FixedGenerationCount implements org.apache.commons.math.genetics.StoppingCondition {
	private int numGenerations = 0;

	private final int maxGenerations;

	public FixedGenerationCount(final int maxGenerations) {
		if (maxGenerations <= 0) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(maxGenerations, 1, true);
		}
		this.maxGenerations = maxGenerations;
	}

	public boolean isSatisfied(final org.apache.commons.math.genetics.Population population) {
		if ((org.apache.commons.math.genetics.FixedGenerationCount.this.numGenerations) < (org.apache.commons.math.genetics.FixedGenerationCount.this.maxGenerations)) {
			(numGenerations)++;
			return false;
		}
		return true;
	}

	public int getNumGenerations() {
		return numGenerations;
	}
}




package org.apache.commons.math3.genetics;


public interface MutationPolicy {
	org.apache.commons.math3.genetics.Chromosome mutate(org.apache.commons.math3.genetics.Chromosome original) throws org.apache.commons.math3.exception.MathIllegalArgumentException;
}


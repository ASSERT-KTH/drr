

package org.apache.commons.math3.linear;


public interface FieldDecompositionSolver<T extends org.apache.commons.math3.FieldElement<T>> {
	org.apache.commons.math3.linear.FieldVector<T> solve(final org.apache.commons.math3.linear.FieldVector<T> b);

	org.apache.commons.math3.linear.FieldMatrix<T> solve(final org.apache.commons.math3.linear.FieldMatrix<T> b);

	boolean isNonSingular();

	org.apache.commons.math3.linear.FieldMatrix<T> getInverse();
}


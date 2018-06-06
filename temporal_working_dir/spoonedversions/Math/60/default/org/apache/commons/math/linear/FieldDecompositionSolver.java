

package org.apache.commons.math.linear;


public interface FieldDecompositionSolver<T extends org.apache.commons.math.FieldElement<T>> {
	T[] solve(final T[] b);

	org.apache.commons.math.linear.FieldVector<T> solve(final org.apache.commons.math.linear.FieldVector<T> b);

	org.apache.commons.math.linear.FieldMatrix<T> solve(final org.apache.commons.math.linear.FieldMatrix<T> b);

	boolean isNonSingular();

	org.apache.commons.math.linear.FieldMatrix<T> getInverse();
}


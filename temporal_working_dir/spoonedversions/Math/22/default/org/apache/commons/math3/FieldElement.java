

package org.apache.commons.math3;


public interface FieldElement<T> {
	T add(T a) throws org.apache.commons.math3.exception.NullArgumentException;

	T subtract(T a) throws org.apache.commons.math3.exception.NullArgumentException;

	T negate();

	T multiply(int n);

	T multiply(T a) throws org.apache.commons.math3.exception.NullArgumentException;

	T divide(T a) throws org.apache.commons.math3.exception.MathArithmeticException, org.apache.commons.math3.exception.NullArgumentException;

	T reciprocal() throws org.apache.commons.math3.exception.MathArithmeticException;

	org.apache.commons.math3.Field<T> getField();
}


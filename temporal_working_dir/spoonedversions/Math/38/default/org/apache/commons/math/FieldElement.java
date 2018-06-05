

package org.apache.commons.math;


public interface FieldElement<T> {
	T add(T a);

	T subtract(T a);

	T negate();

	T multiply(int n);

	T multiply(T a);

	T divide(T a) throws java.lang.ArithmeticException;

	T reciprocal();

	org.apache.commons.math.Field<T> getField();
}


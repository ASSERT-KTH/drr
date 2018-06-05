

package org.apache.commons.math3;


public interface FieldElement<T> {
	T add(T a);

	T subtract(T a);

	T negate();

	T multiply(int n);

	T multiply(T a);

	T divide(T a);

	T reciprocal();

	org.apache.commons.math3.Field<T> getField();
}


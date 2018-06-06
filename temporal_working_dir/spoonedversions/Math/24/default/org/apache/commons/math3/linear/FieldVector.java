

package org.apache.commons.math3.linear;


public interface FieldVector<T extends org.apache.commons.math3.FieldElement<T>> {
	org.apache.commons.math3.Field<T> getField();

	org.apache.commons.math3.linear.FieldVector<T> copy();

	org.apache.commons.math3.linear.FieldVector<T> add(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> subtract(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapAdd(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapAddToSelf(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapSubtract(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapSubtractToSelf(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapMultiply(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapMultiplyToSelf(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapDivide(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapDivideToSelf(T d);

	org.apache.commons.math3.linear.FieldVector<T> mapInv();

	org.apache.commons.math3.linear.FieldVector<T> mapInvToSelf();

	org.apache.commons.math3.linear.FieldVector<T> ebeMultiply(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> ebeDivide(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	T[] getData();

	T dotProduct(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> projection(org.apache.commons.math3.linear.FieldVector<T> v) throws java.lang.IllegalArgumentException;

	org.apache.commons.math3.linear.FieldMatrix<T> outerProduct(org.apache.commons.math3.linear.FieldVector<T> v);

	T getEntry(int index);

	void setEntry(int index, T value);

	int getDimension();

	org.apache.commons.math3.linear.FieldVector<T> append(org.apache.commons.math3.linear.FieldVector<T> v);

	org.apache.commons.math3.linear.FieldVector<T> append(T d);

	org.apache.commons.math3.linear.FieldVector<T> getSubVector(int index, int n);

	void setSubVector(int index, org.apache.commons.math3.linear.FieldVector<T> v);

	void set(T value);

	T[] toArray();
}


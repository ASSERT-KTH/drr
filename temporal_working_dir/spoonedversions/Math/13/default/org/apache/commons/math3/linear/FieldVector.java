

package org.apache.commons.math3.linear;


public interface FieldVector<T extends org.apache.commons.math3.FieldElement<T>> {
	org.apache.commons.math3.Field<T> getField();

	org.apache.commons.math3.linear.FieldVector<T> copy();

	org.apache.commons.math3.linear.FieldVector<T> add(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> subtract(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> mapAdd(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapAddToSelf(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapSubtract(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapSubtractToSelf(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapMultiply(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapMultiplyToSelf(T d) throws org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapDivide(T d) throws org.apache.commons.math3.exception.MathArithmeticException, org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapDivideToSelf(T d) throws org.apache.commons.math3.exception.MathArithmeticException, org.apache.commons.math3.exception.NullArgumentException;

	org.apache.commons.math3.linear.FieldVector<T> mapInv() throws org.apache.commons.math3.exception.MathArithmeticException;

	org.apache.commons.math3.linear.FieldVector<T> mapInvToSelf() throws org.apache.commons.math3.exception.MathArithmeticException;

	org.apache.commons.math3.linear.FieldVector<T> ebeMultiply(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> ebeDivide(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathArithmeticException;

	@java.lang.Deprecated
	T[] getData();

	T dotProduct(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	org.apache.commons.math3.linear.FieldVector<T> projection(org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathArithmeticException;

	org.apache.commons.math3.linear.FieldMatrix<T> outerProduct(org.apache.commons.math3.linear.FieldVector<T> v);

	T getEntry(int index) throws org.apache.commons.math3.exception.OutOfRangeException;

	void setEntry(int index, T value) throws org.apache.commons.math3.exception.OutOfRangeException;

	int getDimension();

	org.apache.commons.math3.linear.FieldVector<T> append(org.apache.commons.math3.linear.FieldVector<T> v);

	org.apache.commons.math3.linear.FieldVector<T> append(T d);

	org.apache.commons.math3.linear.FieldVector<T> getSubVector(int index, int n) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException;

	void setSubVector(int index, org.apache.commons.math3.linear.FieldVector<T> v) throws org.apache.commons.math3.exception.OutOfRangeException;

	void set(T value);

	T[] toArray();
}


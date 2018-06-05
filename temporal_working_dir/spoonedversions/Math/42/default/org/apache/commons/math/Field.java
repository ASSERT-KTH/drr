

package org.apache.commons.math;


public interface Field<T> {
	T getZero();

	T getOne();

	java.lang.Class<? extends org.apache.commons.math.FieldElement<T>> getRuntimeClass();
}


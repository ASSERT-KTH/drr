

package org.apache.commons.math3.complex;


public class ComplexField implements java.io.Serializable , org.apache.commons.math3.Field<org.apache.commons.math3.complex.Complex> {
	private static final long serialVersionUID = -6130362688700788798L;

	private ComplexField() {
	}

	public static org.apache.commons.math3.complex.ComplexField getInstance() {
		return org.apache.commons.math3.complex.ComplexField.LazyHolder.INSTANCE;
	}

	public org.apache.commons.math3.complex.Complex getOne() {
		return org.apache.commons.math3.complex.Complex.ONE;
	}

	public org.apache.commons.math3.complex.Complex getZero() {
		return org.apache.commons.math3.complex.Complex.ZERO;
	}

	public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.complex.Complex>> getRuntimeClass() {
		return org.apache.commons.math3.complex.Complex.class;
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.complex.ComplexField INSTANCE = new org.apache.commons.math3.complex.ComplexField();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.complex.ComplexField.LazyHolder.INSTANCE;
	}
}


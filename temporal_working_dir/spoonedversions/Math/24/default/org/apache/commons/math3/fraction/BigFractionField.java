

package org.apache.commons.math3.fraction;


public class BigFractionField implements java.io.Serializable , org.apache.commons.math3.Field<org.apache.commons.math3.fraction.BigFraction> {
	private static final long serialVersionUID = -1699294557189741703L;

	private BigFractionField() {
	}

	public static org.apache.commons.math3.fraction.BigFractionField getInstance() {
		return org.apache.commons.math3.fraction.BigFractionField.LazyHolder.INSTANCE;
	}

	public org.apache.commons.math3.fraction.BigFraction getOne() {
		return org.apache.commons.math3.fraction.BigFraction.ONE;
	}

	public org.apache.commons.math3.fraction.BigFraction getZero() {
		return org.apache.commons.math3.fraction.BigFraction.ZERO;
	}

	public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.BigFraction>> getRuntimeClass() {
		return org.apache.commons.math3.fraction.BigFraction.class;
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.fraction.BigFractionField INSTANCE = new org.apache.commons.math3.fraction.BigFractionField();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.fraction.BigFractionField.LazyHolder.INSTANCE;
	}
}


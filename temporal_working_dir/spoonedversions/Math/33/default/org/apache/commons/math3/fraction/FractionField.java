

package org.apache.commons.math3.fraction;


public class FractionField implements java.io.Serializable , org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> {
	private static final long serialVersionUID = -1257768487499119313L;

	private FractionField() {
	}

	public static org.apache.commons.math3.fraction.FractionField getInstance() {
		return org.apache.commons.math3.fraction.FractionField.LazyHolder.INSTANCE;
	}

	public org.apache.commons.math3.fraction.Fraction getOne() {
		return org.apache.commons.math3.fraction.Fraction.ONE;
	}

	public org.apache.commons.math3.fraction.Fraction getZero() {
		return org.apache.commons.math3.fraction.Fraction.ZERO;
	}

	public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> getRuntimeClass() {
		return org.apache.commons.math3.fraction.Fraction.class;
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.fraction.FractionField INSTANCE = new org.apache.commons.math3.fraction.FractionField();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.fraction.FractionField.LazyHolder.INSTANCE;
	}
}


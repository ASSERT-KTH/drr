

package org.apache.commons.math3.util;


public class Decimal64Field implements org.apache.commons.math3.Field<org.apache.commons.math3.util.Decimal64> {
	private static final org.apache.commons.math3.util.Decimal64Field INSTANCE = new org.apache.commons.math3.util.Decimal64Field();

	private Decimal64Field() {
	}

	public static final org.apache.commons.math3.util.Decimal64Field getInstance() {
		return org.apache.commons.math3.util.Decimal64Field.INSTANCE;
	}

	public org.apache.commons.math3.util.Decimal64 getZero() {
		return org.apache.commons.math3.util.Decimal64.ZERO;
	}

	public org.apache.commons.math3.util.Decimal64 getOne() {
		return org.apache.commons.math3.util.Decimal64.ONE;
	}

	public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.util.Decimal64>> getRuntimeClass() {
		return org.apache.commons.math3.util.Decimal64.class;
	}
}


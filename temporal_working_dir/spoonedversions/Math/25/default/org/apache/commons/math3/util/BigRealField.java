

package org.apache.commons.math3.util;


public class BigRealField implements java.io.Serializable , org.apache.commons.math3.Field<org.apache.commons.math3.util.BigReal> {
	private static final long serialVersionUID = 4756431066541037559L;

	private BigRealField() {
	}

	public static org.apache.commons.math3.util.BigRealField getInstance() {
		return org.apache.commons.math3.util.BigRealField.LazyHolder.INSTANCE;
	}

	public org.apache.commons.math3.util.BigReal getOne() {
		return org.apache.commons.math3.util.BigReal.ONE;
	}

	public org.apache.commons.math3.util.BigReal getZero() {
		return org.apache.commons.math3.util.BigReal.ZERO;
	}

	public java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.util.BigReal>> getRuntimeClass() {
		return org.apache.commons.math3.util.BigReal.class;
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.util.BigRealField INSTANCE = new org.apache.commons.math3.util.BigRealField();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.util.BigRealField.LazyHolder.INSTANCE;
	}
}


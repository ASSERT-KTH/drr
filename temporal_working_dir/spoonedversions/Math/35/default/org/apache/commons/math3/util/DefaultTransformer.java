

package org.apache.commons.math3.util;


public class DefaultTransformer implements java.io.Serializable , org.apache.commons.math3.util.NumberTransformer {
	private static final long serialVersionUID = 4019938025047800455L;

	public double transform(java.lang.Object o) throws org.apache.commons.math3.exception.MathIllegalArgumentException, org.apache.commons.math3.exception.NullArgumentException {
		if (o == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.OBJECT_TRANSFORMATION);
		}
		if (o instanceof java.lang.Number) {
			return ((java.lang.Number) (o)).doubleValue();
		}
		try {
			return java.lang.Double.valueOf(o.toString()).doubleValue();
		} catch (java.lang.NumberFormatException e) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_TRANSFORM_TO_DOUBLE, o.toString());
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math3.util.DefaultTransformer.this) == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		return other instanceof org.apache.commons.math3.util.DefaultTransformer;
	}

	@java.lang.Override
	public int hashCode() {
		return 401993047;
	}
}


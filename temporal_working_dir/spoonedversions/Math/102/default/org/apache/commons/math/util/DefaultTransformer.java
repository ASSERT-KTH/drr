

package org.apache.commons.math.util;


public class DefaultTransformer implements java.io.Serializable , org.apache.commons.math.util.NumberTransformer {
	private static final long serialVersionUID = 4019938025047800455L;

	public double transform(java.lang.Object o) throws org.apache.commons.math.MathException {
		if (o == null) {
			throw new org.apache.commons.math.MathException("Conversion Exception in Transformation, Object is null", new java.lang.Object[0]);
		}
		if (o instanceof java.lang.Number) {
			return ((java.lang.Number) (o)).doubleValue();
		}
		try {
			return new java.lang.Double(o.toString()).doubleValue();
		} catch (java.lang.Exception e) {
			throw new org.apache.commons.math.MathException("Conversion Exception in Transformation: {0}", new java.lang.Object[]{ e.getMessage() }, e);
		}
	}
}


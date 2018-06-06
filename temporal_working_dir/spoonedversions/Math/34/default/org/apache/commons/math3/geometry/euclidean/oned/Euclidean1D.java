

package org.apache.commons.math3.geometry.euclidean.oned;


public class Euclidean1D implements java.io.Serializable , org.apache.commons.math3.geometry.Space {
	private static final long serialVersionUID = -1178039568877797126L;

	private Euclidean1D() {
	}

	public static org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D getInstance() {
		return org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.LazyHolder.INSTANCE;
	}

	public int getDimension() {
		return 1;
	}

	public org.apache.commons.math3.geometry.Space getSubSpace() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N, 1);
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D INSTANCE = new org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D.LazyHolder.INSTANCE;
	}
}


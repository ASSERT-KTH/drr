

package org.apache.commons.math.geometry.euclidean.twod;


public class Euclidean2D implements java.io.Serializable , org.apache.commons.math.geometry.Space {
	private static final long serialVersionUID = 4793432849757649566L;

	private Euclidean2D() {
	}

	public static org.apache.commons.math.geometry.euclidean.twod.Euclidean2D getInstance() {
		return org.apache.commons.math.geometry.euclidean.twod.Euclidean2D.LazyHolder.INSTANCE;
	}

	public int getDimension() {
		return 2;
	}

	public org.apache.commons.math.geometry.euclidean.oned.Euclidean1D getSubSpace() {
		return org.apache.commons.math.geometry.euclidean.oned.Euclidean1D.getInstance();
	}

	private static class LazyHolder {
		private static final org.apache.commons.math.geometry.euclidean.twod.Euclidean2D INSTANCE = new org.apache.commons.math.geometry.euclidean.twod.Euclidean2D();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math.geometry.euclidean.twod.Euclidean2D.LazyHolder.INSTANCE;
	}
}


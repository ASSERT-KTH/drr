

package org.apache.commons.math3.geometry.euclidean.threed;


public class Euclidean3D implements java.io.Serializable , org.apache.commons.math3.geometry.Space {
	private static final long serialVersionUID = 6249091865814886817L;

	private Euclidean3D() {
	}

	public static org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D getInstance() {
		return org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D.LazyHolder.INSTANCE;
	}

	public int getDimension() {
		return 3;
	}

	public org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D getSubSpace() {
		return org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D.getInstance();
	}

	private static class LazyHolder {
		private static final org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D INSTANCE = new org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D();
	}

	private java.lang.Object readResolve() {
		return org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D.LazyHolder.INSTANCE;
	}
}


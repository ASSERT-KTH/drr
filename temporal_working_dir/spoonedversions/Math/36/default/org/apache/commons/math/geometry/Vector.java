

package org.apache.commons.math.geometry;


public interface Vector<S extends org.apache.commons.math.geometry.Space> extends java.io.Serializable {
	org.apache.commons.math.geometry.Space getSpace();

	org.apache.commons.math.geometry.Vector<S> getZero();

	double getNorm1();

	double getNorm();

	double getNormSq();

	double getNormInf();

	org.apache.commons.math.geometry.Vector<S> add(org.apache.commons.math.geometry.Vector<S> v);

	org.apache.commons.math.geometry.Vector<S> add(double factor, org.apache.commons.math.geometry.Vector<S> v);

	org.apache.commons.math.geometry.Vector<S> subtract(org.apache.commons.math.geometry.Vector<S> v);

	org.apache.commons.math.geometry.Vector<S> subtract(double factor, org.apache.commons.math.geometry.Vector<S> v);

	org.apache.commons.math.geometry.Vector<S> negate();

	org.apache.commons.math.geometry.Vector<S> normalize();

	org.apache.commons.math.geometry.Vector<S> scalarMultiply(double a);

	boolean isNaN();

	boolean isInfinite();

	double distance1(org.apache.commons.math.geometry.Vector<S> v);

	double distance(org.apache.commons.math.geometry.Vector<S> v);

	double distanceInf(org.apache.commons.math.geometry.Vector<S> v);

	double distanceSq(org.apache.commons.math.geometry.Vector<S> v);

	double dotProduct(org.apache.commons.math.geometry.Vector<S> v);

	java.lang.String toString(final java.text.NumberFormat format);
}




package org.apache.commons.math3.stat.clustering;


public interface Clusterable<T> {
	double distanceFrom(T p);

	T centroidOf(java.util.Collection<T> p);
}


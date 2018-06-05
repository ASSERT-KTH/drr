

package org.apache.commons.math3.geometry;


public interface Space extends java.io.Serializable {
	int getDimension();

	org.apache.commons.math3.geometry.Space getSubSpace();
}


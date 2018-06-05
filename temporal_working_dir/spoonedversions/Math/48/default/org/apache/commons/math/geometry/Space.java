

package org.apache.commons.math.geometry;


public interface Space extends java.io.Serializable {
	int getDimension();

	org.apache.commons.math.geometry.Space getSubSpace();
}


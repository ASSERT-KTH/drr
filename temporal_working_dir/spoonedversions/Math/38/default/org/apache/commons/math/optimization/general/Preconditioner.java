

package org.apache.commons.math.optimization.general;


public interface Preconditioner {
	double[] precondition(double[] point, double[] r);
}


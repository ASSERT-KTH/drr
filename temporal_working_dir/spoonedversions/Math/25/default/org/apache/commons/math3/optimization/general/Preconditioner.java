

package org.apache.commons.math3.optimization.general;


public interface Preconditioner {
	double[] precondition(double[] point, double[] r);
}


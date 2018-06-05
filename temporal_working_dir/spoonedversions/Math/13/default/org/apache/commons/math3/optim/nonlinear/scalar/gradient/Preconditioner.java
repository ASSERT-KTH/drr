

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;


public interface Preconditioner {
	double[] precondition(double[] point, double[] r);
}


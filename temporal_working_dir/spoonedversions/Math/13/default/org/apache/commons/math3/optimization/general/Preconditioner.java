

package org.apache.commons.math3.optimization.general;


@java.lang.Deprecated
public interface Preconditioner {
	double[] precondition(double[] point, double[] r);
}


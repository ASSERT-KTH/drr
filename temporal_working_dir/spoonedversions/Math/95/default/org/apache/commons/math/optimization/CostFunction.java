

package org.apache.commons.math.optimization;


public interface CostFunction {
	public double cost(double[] x) throws org.apache.commons.math.optimization.CostException;
}


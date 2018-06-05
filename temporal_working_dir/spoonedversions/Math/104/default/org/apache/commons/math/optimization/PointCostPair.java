

package org.apache.commons.math.optimization;


public class PointCostPair {
	public PointCostPair(double[] point, double cost) {
		this.point = ((double[]) (point.clone()));
		this.cost = cost;
	}

	public final double[] point;

	public final double cost;
}


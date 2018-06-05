

package org.apache.commons.math.optimization;


public class PointCostPair {
	public PointCostPair(double[] point, double cost) {
		this.point = ((double[]) (point.clone()));
		this.cost = cost;
	}

	public double[] getPoint() {
		return ((double[]) (point.clone()));
	}

	public double getCost() {
		return cost;
	}

	private final double[] point;

	private final double cost;
}


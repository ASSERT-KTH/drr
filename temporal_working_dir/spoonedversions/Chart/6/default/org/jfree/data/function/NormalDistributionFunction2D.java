

package org.jfree.data.function;


public class NormalDistributionFunction2D implements org.jfree.data.function.Function2D {
	private double mean;

	private double std;

	public NormalDistributionFunction2D(double mean, double std) {
		org.jfree.data.function.NormalDistributionFunction2D.this.mean = mean;
		org.jfree.data.function.NormalDistributionFunction2D.this.std = std;
	}

	public double getMean() {
		return org.jfree.data.function.NormalDistributionFunction2D.this.mean;
	}

	public double getStandardDeviation() {
		return org.jfree.data.function.NormalDistributionFunction2D.this.std;
	}

	public double getValue(double x) {
		return (java.lang.Math.exp(((((-1.0) * (x - (org.jfree.data.function.NormalDistributionFunction2D.this.mean))) * (x - (org.jfree.data.function.NormalDistributionFunction2D.this.mean))) / ((2 * (org.jfree.data.function.NormalDistributionFunction2D.this.std)) * (org.jfree.data.function.NormalDistributionFunction2D.this.std))))) / (java.lang.Math.sqrt((((2 * (java.lang.Math.PI)) * (org.jfree.data.function.NormalDistributionFunction2D.this.std)) * (org.jfree.data.function.NormalDistributionFunction2D.this.std))));
	}
}


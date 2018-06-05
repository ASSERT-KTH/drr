

package org.jfree.data.function;


public class NormalDistributionFunction2D implements java.io.Serializable , org.jfree.data.function.Function2D {
	private double mean;

	private double std;

	private double factor;

	private double denominator;

	public NormalDistributionFunction2D(double mean, double std) {
		if (std <= 0) {
			throw new java.lang.IllegalArgumentException("Requires 'std' > 0.");
		}
		org.jfree.data.function.NormalDistributionFunction2D.this.mean = mean;
		org.jfree.data.function.NormalDistributionFunction2D.this.std = std;
		org.jfree.data.function.NormalDistributionFunction2D.this.factor = 1 / (std * (java.lang.Math.sqrt((2.0 * (java.lang.Math.PI)))));
		org.jfree.data.function.NormalDistributionFunction2D.this.denominator = (2 * std) * std;
	}

	public double getMean() {
		return org.jfree.data.function.NormalDistributionFunction2D.this.mean;
	}

	public double getStandardDeviation() {
		return org.jfree.data.function.NormalDistributionFunction2D.this.std;
	}

	public double getValue(double x) {
		double z = x - (org.jfree.data.function.NormalDistributionFunction2D.this.mean);
		return (org.jfree.data.function.NormalDistributionFunction2D.this.factor) * (java.lang.Math.exp((((-z) * z) / (org.jfree.data.function.NormalDistributionFunction2D.this.denominator))));
	}

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof org.jfree.data.function.NormalDistributionFunction2D)) {
			return false;
		}
		org.jfree.data.function.NormalDistributionFunction2D that = ((org.jfree.data.function.NormalDistributionFunction2D) (obj));
		if ((org.jfree.data.function.NormalDistributionFunction2D.this.mean) != (that.mean)) {
			return false;
		}
		if ((org.jfree.data.function.NormalDistributionFunction2D.this.std) != (that.std)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 29;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.NormalDistributionFunction2D.this.mean);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.function.NormalDistributionFunction2D.this.std);
		return result;
	}
}


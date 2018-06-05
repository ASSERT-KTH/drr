

package org.jfree.data.xy;


public abstract class AbstractXYZDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.data.xy.XYZDataset {
	public double getZValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number z = getZ(series, item);
		if (z != null) {
			result = z.doubleValue();
		}
		return result;
	}
}


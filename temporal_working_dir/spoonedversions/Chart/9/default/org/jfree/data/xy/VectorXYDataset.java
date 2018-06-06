

package org.jfree.data.xy;


public interface VectorXYDataset extends org.jfree.data.xy.XYDataset {
	public double getVectorXValue(int series, int item);

	public double getVectorYValue(int series, int item);

	public org.jfree.data.xy.Vector getVector(int series, int item);
}


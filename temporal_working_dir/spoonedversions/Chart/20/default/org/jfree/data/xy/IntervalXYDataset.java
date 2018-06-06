

package org.jfree.data.xy;


public interface IntervalXYDataset extends org.jfree.data.xy.XYDataset {
	public java.lang.Number getStartX(int series, int item);

	public double getStartXValue(int series, int item);

	public java.lang.Number getEndX(int series, int item);

	public double getEndXValue(int series, int item);

	public java.lang.Number getStartY(int series, int item);

	public double getStartYValue(int series, int item);

	public java.lang.Number getEndY(int series, int item);

	public double getEndYValue(int series, int item);
}


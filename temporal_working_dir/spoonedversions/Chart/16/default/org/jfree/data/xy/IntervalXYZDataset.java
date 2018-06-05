

package org.jfree.data.xy;


public interface IntervalXYZDataset extends org.jfree.data.xy.XYZDataset {
	public java.lang.Number getStartXValue(int series, int item);

	public java.lang.Number getEndXValue(int series, int item);

	public java.lang.Number getStartYValue(int series, int item);

	public java.lang.Number getEndYValue(int series, int item);

	public java.lang.Number getStartZValue(int series, int item);

	public java.lang.Number getEndZValue(int series, int item);
}




package org.jfree.data.general;


public interface HeatMapDataset {
	public int getXSampleCount();

	public int getYSampleCount();

	public double getMinimumXValue();

	public double getMaximumXValue();

	public double getMinimumYValue();

	public double getMaximumYValue();

	public double getXValue(int xIndex);

	public double getYValue(int yIndex);

	public double getZValue(int xIndex, int yIndex);

	public java.lang.Number getZ(int xIndex, int yIndex);
}


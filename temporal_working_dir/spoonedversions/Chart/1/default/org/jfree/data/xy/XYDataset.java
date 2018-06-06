

package org.jfree.data.xy;


public interface XYDataset extends org.jfree.data.general.SeriesDataset {
	public org.jfree.data.DomainOrder getDomainOrder();

	public int getItemCount(int series);

	public java.lang.Number getX(int series, int item);

	public double getXValue(int series, int item);

	public java.lang.Number getY(int series, int item);

	public double getYValue(int series, int item);
}


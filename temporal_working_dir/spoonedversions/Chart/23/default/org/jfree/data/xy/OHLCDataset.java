

package org.jfree.data.xy;


public interface OHLCDataset extends org.jfree.data.xy.XYDataset {
	public java.lang.Number getHigh(int series, int item);

	public double getHighValue(int series, int item);

	public java.lang.Number getLow(int series, int item);

	public double getLowValue(int series, int item);

	public java.lang.Number getOpen(int series, int item);

	public double getOpenValue(int series, int item);

	public java.lang.Number getClose(int series, int item);

	public double getCloseValue(int series, int item);

	public java.lang.Number getVolume(int series, int item);

	public double getVolumeValue(int series, int item);
}


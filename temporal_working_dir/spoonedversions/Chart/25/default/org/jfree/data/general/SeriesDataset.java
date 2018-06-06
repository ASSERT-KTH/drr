

package org.jfree.data.general;


public interface SeriesDataset extends org.jfree.data.general.Dataset {
	public int getSeriesCount();

	public java.lang.Comparable getSeriesKey(int series);

	public int indexOf(java.lang.Comparable seriesKey);
}


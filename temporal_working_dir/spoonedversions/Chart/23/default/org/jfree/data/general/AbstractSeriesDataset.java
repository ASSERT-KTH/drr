

package org.jfree.data.general;


public abstract class AbstractSeriesDataset extends org.jfree.data.general.AbstractDataset implements java.io.Serializable , org.jfree.data.general.SeriesChangeListener , org.jfree.data.general.SeriesDataset {
	private static final long serialVersionUID = -6074996219705033171L;

	protected AbstractSeriesDataset() {
		super();
	}

	public abstract int getSeriesCount();

	public abstract java.lang.Comparable getSeriesKey(int series);

	public int indexOf(java.lang.Comparable seriesKey) {
		int seriesCount = getSeriesCount();
		for (int s = 0; s < seriesCount; s++) {
			if (getSeriesKey(s).equals(seriesKey)) {
				return s;
			}
		}
		return -1;
	}

	public void seriesChanged(org.jfree.data.general.SeriesChangeEvent event) {
		fireDatasetChanged();
	}
}


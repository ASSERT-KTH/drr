

package org.jfree.data.xy;


public class DefaultOHLCDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.chart.util.PublicCloneable , org.jfree.data.xy.OHLCDataset {
	private java.lang.Comparable key;

	private org.jfree.data.xy.OHLCDataItem[] data;

	public DefaultOHLCDataset(java.lang.Comparable key, org.jfree.data.xy.OHLCDataItem[] data) {
		org.jfree.data.xy.DefaultOHLCDataset.this.key = key;
		org.jfree.data.xy.DefaultOHLCDataset.this.data = data;
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.key;
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Long(org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getDate().getTime());
	}

	public java.util.Date getXDate(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getDate();
	}

	public java.lang.Number getY(int series, int item) {
		return getClose(series, item);
	}

	public java.lang.Number getHigh(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getHigh();
	}

	public double getHighValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number high = getHigh(series, item);
		if (high != null) {
			result = high.doubleValue();
		}
		return result;
	}

	public java.lang.Number getLow(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getLow();
	}

	public double getLowValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number low = getLow(series, item);
		if (low != null) {
			result = low.doubleValue();
		}
		return result;
	}

	public java.lang.Number getOpen(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getOpen();
	}

	public double getOpenValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number open = getOpen(series, item);
		if (open != null) {
			result = open.doubleValue();
		}
		return result;
	}

	public java.lang.Number getClose(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getClose();
	}

	public double getCloseValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number close = getClose(series, item);
		if (close != null) {
			result = close.doubleValue();
		}
		return result;
	}

	public java.lang.Number getVolume(int series, int item) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data[item].getVolume();
	}

	public double getVolumeValue(int series, int item) {
		double result = java.lang.Double.NaN;
		java.lang.Number volume = getVolume(series, item);
		if (volume != null) {
			result = volume.doubleValue();
		}
		return result;
	}

	public int getSeriesCount() {
		return 1;
	}

	public int getItemCount(int series) {
		return org.jfree.data.xy.DefaultOHLCDataset.this.data.length;
	}

	public void sortDataByDate() {
		java.util.Arrays.sort(org.jfree.data.xy.DefaultOHLCDataset.this.data);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.xy.DefaultOHLCDataset.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultOHLCDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultOHLCDataset that = ((org.jfree.data.xy.DefaultOHLCDataset) (obj));
		if (!(org.jfree.data.xy.DefaultOHLCDataset.this.key.equals(that.key))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultOHLCDataset.this.data, that.data))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.xy.DefaultOHLCDataset clone = ((org.jfree.data.xy.DefaultOHLCDataset) (super.clone()));
		clone.data = new org.jfree.data.xy.OHLCDataItem[org.jfree.data.xy.DefaultOHLCDataset.this.data.length];
		java.lang.System.arraycopy(org.jfree.data.xy.DefaultOHLCDataset.this.data, 0, clone.data, 0, org.jfree.data.xy.DefaultOHLCDataset.this.data.length);
		return clone;
	}
}


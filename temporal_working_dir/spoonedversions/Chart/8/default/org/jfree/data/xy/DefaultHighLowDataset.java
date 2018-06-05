

package org.jfree.data.xy;


public class DefaultHighLowDataset extends org.jfree.data.xy.AbstractXYDataset implements org.jfree.data.xy.OHLCDataset {
	private java.lang.Comparable seriesKey;

	private java.util.Date[] date;

	private java.lang.Number[] high;

	private java.lang.Number[] low;

	private java.lang.Number[] open;

	private java.lang.Number[] close;

	private java.lang.Number[] volume;

	public DefaultHighLowDataset(java.lang.Comparable seriesKey, java.util.Date[] date, double[] high, double[] low, double[] open, double[] close, double[] volume) {
		if (seriesKey == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		if (date == null) {
			throw new java.lang.IllegalArgumentException("Null 'date' argument.");
		}
		org.jfree.data.xy.DefaultHighLowDataset.this.seriesKey = seriesKey;
		org.jfree.data.xy.DefaultHighLowDataset.this.date = date;
		org.jfree.data.xy.DefaultHighLowDataset.this.high = org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(high);
		org.jfree.data.xy.DefaultHighLowDataset.this.low = org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(low);
		org.jfree.data.xy.DefaultHighLowDataset.this.open = org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(open);
		org.jfree.data.xy.DefaultHighLowDataset.this.close = org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(close);
		org.jfree.data.xy.DefaultHighLowDataset.this.volume = org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(volume);
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return org.jfree.data.xy.DefaultHighLowDataset.this.seriesKey;
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Long(org.jfree.data.xy.DefaultHighLowDataset.this.date[item].getTime());
	}

	public java.util.Date getXDate(int series, int item) {
		return org.jfree.data.xy.DefaultHighLowDataset.this.date[item];
	}

	public java.lang.Number getY(int series, int item) {
		return getClose(series, item);
	}

	public java.lang.Number getHigh(int series, int item) {
		return org.jfree.data.xy.DefaultHighLowDataset.this.high[item];
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
		return org.jfree.data.xy.DefaultHighLowDataset.this.low[item];
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
		return org.jfree.data.xy.DefaultHighLowDataset.this.open[item];
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
		return org.jfree.data.xy.DefaultHighLowDataset.this.close[item];
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
		return org.jfree.data.xy.DefaultHighLowDataset.this.volume[item];
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
		return org.jfree.data.xy.DefaultHighLowDataset.this.date.length;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.DefaultHighLowDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.DefaultHighLowDataset)) {
			return false;
		}
		org.jfree.data.xy.DefaultHighLowDataset that = ((org.jfree.data.xy.DefaultHighLowDataset) (obj));
		if (!(org.jfree.data.xy.DefaultHighLowDataset.this.seriesKey.equals(that.seriesKey))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.date, that.date))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.open, that.open))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.high, that.high))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.low, that.low))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.close, that.close))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.data.xy.DefaultHighLowDataset.this.volume, that.volume))) {
			return false;
		}
		return true;
	}

	public static java.lang.Number[] createNumberArray(double[] data) {
		java.lang.Number[] result = new java.lang.Number[data.length];
		for (int i = 0; i < (data.length); i++) {
			result[i] = new java.lang.Double(data[i]);
		}
		return result;
	}
}


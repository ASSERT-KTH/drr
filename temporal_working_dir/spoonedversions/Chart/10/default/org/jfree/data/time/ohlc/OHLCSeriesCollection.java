

package org.jfree.data.time.ohlc;


public class OHLCSeriesCollection extends org.jfree.data.xy.AbstractXYDataset implements java.io.Serializable , org.jfree.data.xy.OHLCDataset {
	private java.util.List data;

	private org.jfree.data.time.TimePeriodAnchor xPosition = org.jfree.data.time.TimePeriodAnchor.MIDDLE;

	public OHLCSeriesCollection() {
		org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data = new java.util.ArrayList();
	}

	public void addSeries(org.jfree.data.time.ohlc.OHLCSeries series) {
		if (series == null) {
			throw new java.lang.IllegalArgumentException("Null 'series' argument.");
		}
		org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.add(series);
		series.addChangeListener(org.jfree.data.time.ohlc.OHLCSeriesCollection.this);
		fireDatasetChanged();
	}

	public int getSeriesCount() {
		return org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.size();
	}

	public org.jfree.data.time.ohlc.OHLCSeries getSeries(int series) {
		if ((series < 0) || (series >= (getSeriesCount()))) {
			throw new java.lang.IllegalArgumentException("Series index out of bounds");
		}
		return ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
	}

	public java.lang.Comparable getSeriesKey(int series) {
		return getSeries(series).getKey();
	}

	public int getItemCount(int series) {
		return getSeries(series).getItemCount();
	}

	protected synchronized long getX(org.jfree.data.time.RegularTimePeriod period) {
		long result = 0L;
		if ((org.jfree.data.time.ohlc.OHLCSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.START)) {
			result = period.getFirstMillisecond();
		}else
			if ((org.jfree.data.time.ohlc.OHLCSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.MIDDLE)) {
				result = period.getMiddleMillisecond();
			}else
				if ((org.jfree.data.time.ohlc.OHLCSeriesCollection.this.xPosition) == (org.jfree.data.time.TimePeriodAnchor.END)) {
					result = period.getLastMillisecond();
				}
			
		
		return result;
	}

	public double getXValue(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		org.jfree.data.time.RegularTimePeriod period = di.getPeriod();
		return getX(period);
	}

	public java.lang.Number getX(int series, int item) {
		return new java.lang.Double(getXValue(series, item));
	}

	public java.lang.Number getY(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		return new java.lang.Double(di.getYValue());
	}

	public double getOpenValue(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		return di.getOpenValue();
	}

	public java.lang.Number getOpen(int series, int item) {
		return new java.lang.Double(getOpenValue(series, item));
	}

	public double getCloseValue(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		return di.getCloseValue();
	}

	public java.lang.Number getClose(int series, int item) {
		return new java.lang.Double(getCloseValue(series, item));
	}

	public double getHighValue(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		return di.getHighValue();
	}

	public java.lang.Number getHigh(int series, int item) {
		return new java.lang.Double(getHighValue(series, item));
	}

	public double getLowValue(int series, int item) {
		org.jfree.data.time.ohlc.OHLCSeries s = ((org.jfree.data.time.ohlc.OHLCSeries) (org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data.get(series)));
		org.jfree.data.time.ohlc.OHLCItem di = ((org.jfree.data.time.ohlc.OHLCItem) (s.getDataItem(item)));
		return di.getLowValue();
	}

	public java.lang.Number getLow(int series, int item) {
		return new java.lang.Double(getLowValue(series, item));
	}

	public java.lang.Number getVolume(int series, int item) {
		return null;
	}

	public double getVolumeValue(int series, int item) {
		return java.lang.Double.NaN;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.ohlc.OHLCSeriesCollection.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.ohlc.OHLCSeriesCollection)) {
			return false;
		}
		org.jfree.data.time.ohlc.OHLCSeriesCollection that = ((org.jfree.data.time.ohlc.OHLCSeriesCollection) (obj));
		return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data, that.data);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.time.ohlc.OHLCSeriesCollection clone = ((org.jfree.data.time.ohlc.OHLCSeriesCollection) (super.clone()));
		clone.data = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.data.time.ohlc.OHLCSeriesCollection.this.data)));
		return clone;
	}
}


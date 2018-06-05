

package org.jfree.data.time.ohlc;


public class OHLCSeries extends org.jfree.data.ComparableObjectSeries {
	public OHLCSeries(java.lang.Comparable key) {
		super(key, true, false);
	}

	public org.jfree.data.time.RegularTimePeriod getPeriod(int index) {
		final org.jfree.data.time.ohlc.OHLCItem item = ((org.jfree.data.time.ohlc.OHLCItem) (getDataItem(index)));
		return item.getPeriod();
	}

	public org.jfree.data.ComparableObjectItem getDataItem(int index) {
		return super.getDataItem(index);
	}

	public void add(org.jfree.data.time.RegularTimePeriod period, double open, double high, double low, double close) {
		if ((getItemCount()) > 0) {
			org.jfree.data.time.ohlc.OHLCItem item0 = ((org.jfree.data.time.ohlc.OHLCItem) (org.jfree.data.time.ohlc.OHLCSeries.this.getDataItem(0)));
			if (!(period.getClass().equals(item0.getPeriod().getClass()))) {
				throw new java.lang.IllegalArgumentException("Can't mix RegularTimePeriod class types.");
			}
		}
		super.add(new org.jfree.data.time.ohlc.OHLCItem(period, open, high, low, close), true);
	}
}


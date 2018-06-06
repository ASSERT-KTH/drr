

package org.jfree.data.time.ohlc;


public class OHLCItem extends org.jfree.data.ComparableObjectItem {
	public OHLCItem(org.jfree.data.time.RegularTimePeriod period, double open, double high, double low, double close) {
		super(period, new org.jfree.data.time.ohlc.OHLC(open, high, low, close));
	}

	public org.jfree.data.time.RegularTimePeriod getPeriod() {
		return ((org.jfree.data.time.RegularTimePeriod) (getComparable()));
	}

	public double getYValue() {
		return getCloseValue();
	}

	public double getOpenValue() {
		org.jfree.data.time.ohlc.OHLC ohlc = ((org.jfree.data.time.ohlc.OHLC) (getObject()));
		if (ohlc != null) {
			return ohlc.getOpen();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getHighValue() {
		org.jfree.data.time.ohlc.OHLC ohlc = ((org.jfree.data.time.ohlc.OHLC) (getObject()));
		if (ohlc != null) {
			return ohlc.getHigh();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getLowValue() {
		org.jfree.data.time.ohlc.OHLC ohlc = ((org.jfree.data.time.ohlc.OHLC) (getObject()));
		if (ohlc != null) {
			return ohlc.getLow();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getCloseValue() {
		org.jfree.data.time.ohlc.OHLC ohlc = ((org.jfree.data.time.ohlc.OHLC) (getObject()));
		if (ohlc != null) {
			return ohlc.getClose();
		}else {
			return java.lang.Double.NaN;
		}
	}
}


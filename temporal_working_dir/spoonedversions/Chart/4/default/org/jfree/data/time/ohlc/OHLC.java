

package org.jfree.data.time.ohlc;


public class OHLC implements java.io.Serializable {
	private double open;

	private double close;

	private double high;

	private double low;

	public OHLC(double open, double high, double low, double close) {
		org.jfree.data.time.ohlc.OHLC.this.open = open;
		org.jfree.data.time.ohlc.OHLC.this.close = close;
		org.jfree.data.time.ohlc.OHLC.this.high = high;
		org.jfree.data.time.ohlc.OHLC.this.low = low;
	}

	public double getOpen() {
		return org.jfree.data.time.ohlc.OHLC.this.open;
	}

	public double getClose() {
		return org.jfree.data.time.ohlc.OHLC.this.close;
	}

	public double getHigh() {
		return org.jfree.data.time.ohlc.OHLC.this.high;
	}

	public double getLow() {
		return org.jfree.data.time.ohlc.OHLC.this.low;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.time.ohlc.OHLC.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.time.ohlc.OHLC)) {
			return false;
		}
		org.jfree.data.time.ohlc.OHLC that = ((org.jfree.data.time.ohlc.OHLC) (obj));
		if ((org.jfree.data.time.ohlc.OHLC.this.open) != (that.open)) {
			return false;
		}
		if ((org.jfree.data.time.ohlc.OHLC.this.close) != (that.close)) {
			return false;
		}
		if ((org.jfree.data.time.ohlc.OHLC.this.high) != (that.high)) {
			return false;
		}
		if ((org.jfree.data.time.ohlc.OHLC.this.low) != (that.low)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.time.ohlc.OHLC.this.open);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.time.ohlc.OHLC.this.high);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.time.ohlc.OHLC.this.low);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.time.ohlc.OHLC.this.close);
		return result;
	}
}


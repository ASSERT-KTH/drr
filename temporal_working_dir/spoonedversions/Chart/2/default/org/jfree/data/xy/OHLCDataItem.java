

package org.jfree.data.xy;


public class OHLCDataItem implements java.io.Serializable , java.lang.Comparable {
	private static final long serialVersionUID = 7753817154401169901L;

	private java.util.Date date;

	private java.lang.Number open;

	private java.lang.Number high;

	private java.lang.Number low;

	private java.lang.Number close;

	private java.lang.Number volume;

	public OHLCDataItem(java.util.Date date, double open, double high, double low, double close, double volume) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("Null 'date' argument.");
		}
		org.jfree.data.xy.OHLCDataItem.this.date = date;
		org.jfree.data.xy.OHLCDataItem.this.open = new java.lang.Double(open);
		org.jfree.data.xy.OHLCDataItem.this.high = new java.lang.Double(high);
		org.jfree.data.xy.OHLCDataItem.this.low = new java.lang.Double(low);
		org.jfree.data.xy.OHLCDataItem.this.close = new java.lang.Double(close);
		org.jfree.data.xy.OHLCDataItem.this.volume = new java.lang.Double(volume);
	}

	public java.util.Date getDate() {
		return org.jfree.data.xy.OHLCDataItem.this.date;
	}

	public java.lang.Number getOpen() {
		return org.jfree.data.xy.OHLCDataItem.this.open;
	}

	public java.lang.Number getHigh() {
		return org.jfree.data.xy.OHLCDataItem.this.high;
	}

	public java.lang.Number getLow() {
		return org.jfree.data.xy.OHLCDataItem.this.low;
	}

	public java.lang.Number getClose() {
		return org.jfree.data.xy.OHLCDataItem.this.close;
	}

	public java.lang.Number getVolume() {
		return org.jfree.data.xy.OHLCDataItem.this.volume;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.OHLCDataItem.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.OHLCDataItem)) {
			return false;
		}
		org.jfree.data.xy.OHLCDataItem that = ((org.jfree.data.xy.OHLCDataItem) (obj));
		if (!(org.jfree.data.xy.OHLCDataItem.this.date.equals(that.date))) {
			return false;
		}
		if (!(org.jfree.data.xy.OHLCDataItem.this.high.equals(that.high))) {
			return false;
		}
		if (!(org.jfree.data.xy.OHLCDataItem.this.low.equals(that.low))) {
			return false;
		}
		if (!(org.jfree.data.xy.OHLCDataItem.this.open.equals(that.open))) {
			return false;
		}
		if (!(org.jfree.data.xy.OHLCDataItem.this.close.equals(that.close))) {
			return false;
		}
		return true;
	}

	public int compareTo(java.lang.Object object) {
		if (object instanceof org.jfree.data.xy.OHLCDataItem) {
			org.jfree.data.xy.OHLCDataItem item = ((org.jfree.data.xy.OHLCDataItem) (object));
			return org.jfree.data.xy.OHLCDataItem.this.date.compareTo(item.date);
		}else {
			throw new java.lang.ClassCastException("OHLCDataItem.compareTo().");
		}
	}
}


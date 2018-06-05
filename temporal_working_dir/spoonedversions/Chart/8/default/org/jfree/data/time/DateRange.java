

package org.jfree.data.time;


public class DateRange extends org.jfree.data.Range implements java.io.Serializable {
	private static final long serialVersionUID = -4705682568375418157L;

	private long lowerDate;

	private long upperDate;

	public DateRange() {
		this(new java.util.Date(0), new java.util.Date(1));
	}

	public DateRange(java.util.Date lower, java.util.Date upper) {
		super(lower.getTime(), upper.getTime());
		org.jfree.data.time.DateRange.this.lowerDate = lower.getTime();
		org.jfree.data.time.DateRange.this.upperDate = upper.getTime();
	}

	public DateRange(double lower, double upper) {
		super(lower, upper);
		org.jfree.data.time.DateRange.this.lowerDate = ((long) (lower));
		org.jfree.data.time.DateRange.this.upperDate = ((long) (upper));
	}

	public DateRange(org.jfree.data.Range other) {
		this(other.getLowerBound(), other.getUpperBound());
	}

	public java.util.Date getLowerDate() {
		return new java.util.Date(org.jfree.data.time.DateRange.this.lowerDate);
	}

	public java.util.Date getUpperDate() {
		return new java.util.Date(org.jfree.data.time.DateRange.this.upperDate);
	}

	public java.lang.String toString() {
		java.text.DateFormat df = java.text.DateFormat.getDateTimeInstance();
		return ((("[" + (df.format(getLowerDate()))) + " --> ") + (df.format(getUpperDate()))) + "]";
	}
}


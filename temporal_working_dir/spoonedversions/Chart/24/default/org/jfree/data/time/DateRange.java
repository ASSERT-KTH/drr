

package org.jfree.data.time;


public class DateRange extends org.jfree.data.Range implements java.io.Serializable {
	private static final long serialVersionUID = -4705682568375418157L;

	private java.util.Date lowerDate;

	private java.util.Date upperDate;

	public DateRange() {
		this(new java.util.Date(0), new java.util.Date(1));
	}

	public DateRange(java.util.Date lower, java.util.Date upper) {
		super(lower.getTime(), upper.getTime());
		org.jfree.data.time.DateRange.this.lowerDate = lower;
		org.jfree.data.time.DateRange.this.upperDate = upper;
	}

	public DateRange(double lower, double upper) {
		super(lower, upper);
		org.jfree.data.time.DateRange.this.lowerDate = new java.util.Date(((long) (lower)));
		org.jfree.data.time.DateRange.this.upperDate = new java.util.Date(((long) (upper)));
	}

	public DateRange(org.jfree.data.Range other) {
		this(other.getLowerBound(), other.getUpperBound());
	}

	public java.util.Date getLowerDate() {
		return org.jfree.data.time.DateRange.this.lowerDate;
	}

	public java.util.Date getUpperDate() {
		return org.jfree.data.time.DateRange.this.upperDate;
	}

	public java.lang.String toString() {
		java.text.DateFormat df = java.text.DateFormat.getDateTimeInstance();
		return ((("[" + (df.format(org.jfree.data.time.DateRange.this.lowerDate))) + " --> ") + (df.format(org.jfree.data.time.DateRange.this.upperDate))) + "]";
	}
}


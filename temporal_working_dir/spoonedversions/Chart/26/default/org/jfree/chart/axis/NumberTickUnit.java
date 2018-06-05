

package org.jfree.chart.axis;


public class NumberTickUnit extends org.jfree.chart.axis.TickUnit implements java.io.Serializable {
	private static final long serialVersionUID = 3849459506627654442L;

	private java.text.NumberFormat formatter;

	public NumberTickUnit(double size) {
		this(size, java.text.NumberFormat.getNumberInstance());
	}

	public NumberTickUnit(double size, java.text.NumberFormat formatter) {
		super(size);
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.axis.NumberTickUnit.this.formatter = formatter;
	}

	public java.lang.String valueToString(double value) {
		return org.jfree.chart.axis.NumberTickUnit.this.formatter.format(value);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.NumberTickUnit.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.NumberTickUnit)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.axis.NumberTickUnit that = ((org.jfree.chart.axis.NumberTickUnit) (obj));
		if (!(org.jfree.chart.axis.NumberTickUnit.this.formatter.equals(that.formatter))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (29 * result) + ((org.jfree.chart.axis.NumberTickUnit.this.formatter) != null ? org.jfree.chart.axis.NumberTickUnit.this.formatter.hashCode() : 0);
		return result;
	}
}


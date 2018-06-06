

package org.jfree.chart.axis;


public abstract class TickUnit implements java.io.Serializable , java.lang.Comparable {
	private static final long serialVersionUID = 510179855057013974L;

	private double size;

	private int minorTickCount;

	public TickUnit(double size) {
		org.jfree.chart.axis.TickUnit.this.size = size;
	}

	public TickUnit(double size, int minorTickCount) {
		org.jfree.chart.axis.TickUnit.this.size = size;
		org.jfree.chart.axis.TickUnit.this.minorTickCount = minorTickCount;
	}

	public double getSize() {
		return org.jfree.chart.axis.TickUnit.this.size;
	}

	public int getMinorTickCount() {
		return org.jfree.chart.axis.TickUnit.this.minorTickCount;
	}

	public java.lang.String valueToString(double value) {
		return java.lang.String.valueOf(value);
	}

	public int compareTo(java.lang.Object object) {
		if (object instanceof org.jfree.chart.axis.TickUnit) {
			org.jfree.chart.axis.TickUnit other = ((org.jfree.chart.axis.TickUnit) (object));
			if ((org.jfree.chart.axis.TickUnit.this.size) > (other.getSize())) {
				return 1;
			}else
				if ((org.jfree.chart.axis.TickUnit.this.size) < (other.getSize())) {
					return -1;
				}else {
					return 0;
				}
			
		}else {
			return -1;
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.TickUnit.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.TickUnit)) {
			return false;
		}
		org.jfree.chart.axis.TickUnit that = ((org.jfree.chart.axis.TickUnit) (obj));
		if ((org.jfree.chart.axis.TickUnit.this.size) != (that.size)) {
			return false;
		}
		if ((org.jfree.chart.axis.TickUnit.this.minorTickCount) != (that.minorTickCount)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		long temp = (org.jfree.chart.axis.TickUnit.this.size) != (+0.0) ? java.lang.Double.doubleToLongBits(org.jfree.chart.axis.TickUnit.this.size) : 0L;
		return ((int) (temp ^ (temp >>> 32)));
	}
}


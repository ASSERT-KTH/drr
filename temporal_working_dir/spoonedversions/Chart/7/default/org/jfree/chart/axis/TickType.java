

package org.jfree.chart.axis;


public final class TickType implements java.io.Serializable {
	public static final org.jfree.chart.axis.TickType MAJOR = new org.jfree.chart.axis.TickType("MAJOR");

	public static final org.jfree.chart.axis.TickType MINOR = new org.jfree.chart.axis.TickType("MINOR");

	private java.lang.String name;

	private TickType(java.lang.String name) {
		org.jfree.chart.axis.TickType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.TickType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.TickType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.TickType)) {
			return false;
		}
		org.jfree.chart.axis.TickType that = ((org.jfree.chart.axis.TickType) (obj));
		if (!(org.jfree.chart.axis.TickType.this.name.equals(that.name))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.chart.axis.TickType.this.equals(org.jfree.chart.axis.TickType.MAJOR)) {
			result = org.jfree.chart.axis.TickType.MAJOR;
		}else
			if (org.jfree.chart.axis.TickType.this.equals(org.jfree.chart.axis.TickType.MINOR)) {
				result = org.jfree.chart.axis.TickType.MINOR;
			}
		
		return result;
	}
}


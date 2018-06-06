

package org.jfree.chart.util;


public final class HorizontalAlignment implements java.io.Serializable {
	private static final long serialVersionUID = -8249740987565309567L;

	public static final org.jfree.chart.util.HorizontalAlignment LEFT = new org.jfree.chart.util.HorizontalAlignment("HorizontalAlignment.LEFT");

	public static final org.jfree.chart.util.HorizontalAlignment RIGHT = new org.jfree.chart.util.HorizontalAlignment("HorizontalAlignment.RIGHT");

	public static final org.jfree.chart.util.HorizontalAlignment CENTER = new org.jfree.chart.util.HorizontalAlignment("HorizontalAlignment.CENTER");

	private java.lang.String name;

	private HorizontalAlignment(java.lang.String name) {
		org.jfree.chart.util.HorizontalAlignment.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.HorizontalAlignment.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.HorizontalAlignment.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.HorizontalAlignment)) {
			return false;
		}
		org.jfree.chart.util.HorizontalAlignment that = ((org.jfree.chart.util.HorizontalAlignment) (obj));
		if (!(org.jfree.chart.util.HorizontalAlignment.this.name.equals(that.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.HorizontalAlignment.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.util.HorizontalAlignment result = null;
		if (org.jfree.chart.util.HorizontalAlignment.this.equals(org.jfree.chart.util.HorizontalAlignment.LEFT)) {
			result = org.jfree.chart.util.HorizontalAlignment.LEFT;
		}else
			if (org.jfree.chart.util.HorizontalAlignment.this.equals(org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
				result = org.jfree.chart.util.HorizontalAlignment.RIGHT;
			}else
				if (org.jfree.chart.util.HorizontalAlignment.this.equals(org.jfree.chart.util.HorizontalAlignment.CENTER)) {
					result = org.jfree.chart.util.HorizontalAlignment.CENTER;
				}
			
		
		return result;
	}
}


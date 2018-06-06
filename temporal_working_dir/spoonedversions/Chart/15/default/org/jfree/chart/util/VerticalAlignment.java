

package org.jfree.chart.util;


public final class VerticalAlignment implements java.io.Serializable {
	private static final long serialVersionUID = 7272397034325429853L;

	public static final org.jfree.chart.util.VerticalAlignment TOP = new org.jfree.chart.util.VerticalAlignment("VerticalAlignment.TOP");

	public static final org.jfree.chart.util.VerticalAlignment BOTTOM = new org.jfree.chart.util.VerticalAlignment("VerticalAlignment.BOTTOM");

	public static final org.jfree.chart.util.VerticalAlignment CENTER = new org.jfree.chart.util.VerticalAlignment("VerticalAlignment.CENTER");

	private java.lang.String name;

	private VerticalAlignment(java.lang.String name) {
		org.jfree.chart.util.VerticalAlignment.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.VerticalAlignment.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.VerticalAlignment.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.VerticalAlignment)) {
			return false;
		}
		org.jfree.chart.util.VerticalAlignment alignment = ((org.jfree.chart.util.VerticalAlignment) (obj));
		if (!(org.jfree.chart.util.VerticalAlignment.this.name.equals(alignment.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.VerticalAlignment.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.VerticalAlignment.this.equals(org.jfree.chart.util.VerticalAlignment.TOP)) {
			return org.jfree.chart.util.VerticalAlignment.TOP;
		}else
			if (org.jfree.chart.util.VerticalAlignment.this.equals(org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
				return org.jfree.chart.util.VerticalAlignment.BOTTOM;
			}else
				if (org.jfree.chart.util.VerticalAlignment.this.equals(org.jfree.chart.util.VerticalAlignment.CENTER)) {
					return org.jfree.chart.util.VerticalAlignment.CENTER;
				}else {
					return null;
				}
			
		
	}
}




package org.jfree.chart.axis;


public final class CategoryAnchor implements java.io.Serializable {
	private static final long serialVersionUID = -2604142742210173810L;

	public static final org.jfree.chart.axis.CategoryAnchor START = new org.jfree.chart.axis.CategoryAnchor("CategoryAnchor.START");

	public static final org.jfree.chart.axis.CategoryAnchor MIDDLE = new org.jfree.chart.axis.CategoryAnchor("CategoryAnchor.MIDDLE");

	public static final org.jfree.chart.axis.CategoryAnchor END = new org.jfree.chart.axis.CategoryAnchor("CategoryAnchor.END");

	private java.lang.String name;

	private CategoryAnchor(java.lang.String name) {
		org.jfree.chart.axis.CategoryAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.CategoryAnchor.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.CategoryAnchor.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CategoryAnchor)) {
			return false;
		}
		org.jfree.chart.axis.CategoryAnchor position = ((org.jfree.chart.axis.CategoryAnchor) (obj));
		if (!(org.jfree.chart.axis.CategoryAnchor.this.name.equals(position.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.axis.CategoryAnchor.this.equals(org.jfree.chart.axis.CategoryAnchor.START)) {
			return org.jfree.chart.axis.CategoryAnchor.START;
		}else
			if (org.jfree.chart.axis.CategoryAnchor.this.equals(org.jfree.chart.axis.CategoryAnchor.MIDDLE)) {
				return org.jfree.chart.axis.CategoryAnchor.MIDDLE;
			}else
				if (org.jfree.chart.axis.CategoryAnchor.this.equals(org.jfree.chart.axis.CategoryAnchor.END)) {
					return org.jfree.chart.axis.CategoryAnchor.END;
				}
			
		
		return null;
	}
}


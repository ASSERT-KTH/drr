

package org.jfree.chart.axis;


public final class CategoryLabelWidthType implements java.io.Serializable {
	private static final long serialVersionUID = -6976024792582949656L;

	public static final org.jfree.chart.axis.CategoryLabelWidthType CATEGORY = new org.jfree.chart.axis.CategoryLabelWidthType("CategoryLabelWidthType.CATEGORY");

	public static final org.jfree.chart.axis.CategoryLabelWidthType RANGE = new org.jfree.chart.axis.CategoryLabelWidthType("CategoryLabelWidthType.RANGE");

	private java.lang.String name;

	private CategoryLabelWidthType(java.lang.String name) {
		if (name == null) {
			throw new java.lang.IllegalArgumentException("Null 'name' argument.");
		}
		org.jfree.chart.axis.CategoryLabelWidthType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.CategoryLabelWidthType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.CategoryLabelWidthType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CategoryLabelWidthType)) {
			return false;
		}
		org.jfree.chart.axis.CategoryLabelWidthType t = ((org.jfree.chart.axis.CategoryLabelWidthType) (obj));
		if (!(org.jfree.chart.axis.CategoryLabelWidthType.this.name.equals(t.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.axis.CategoryLabelWidthType.this.equals(org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY)) {
			return org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY;
		}else
			if (org.jfree.chart.axis.CategoryLabelWidthType.this.equals(org.jfree.chart.axis.CategoryLabelWidthType.RANGE)) {
				return org.jfree.chart.axis.CategoryLabelWidthType.RANGE;
			}
		
		return null;
	}
}


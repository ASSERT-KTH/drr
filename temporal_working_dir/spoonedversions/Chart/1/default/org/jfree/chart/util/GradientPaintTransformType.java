

package org.jfree.chart.util;


public final class GradientPaintTransformType implements java.io.Serializable {
	private static final long serialVersionUID = 8331561784933982450L;

	public static final org.jfree.chart.util.GradientPaintTransformType VERTICAL = new org.jfree.chart.util.GradientPaintTransformType("GradientPaintTransformType.VERTICAL");

	public static final org.jfree.chart.util.GradientPaintTransformType HORIZONTAL = new org.jfree.chart.util.GradientPaintTransformType("GradientPaintTransformType.HORIZONTAL");

	public static final org.jfree.chart.util.GradientPaintTransformType CENTER_VERTICAL = new org.jfree.chart.util.GradientPaintTransformType("GradientPaintTransformType.CENTER_VERTICAL");

	public static final org.jfree.chart.util.GradientPaintTransformType CENTER_HORIZONTAL = new org.jfree.chart.util.GradientPaintTransformType("GradientPaintTransformType.CENTER_HORIZONTAL");

	private java.lang.String name;

	private GradientPaintTransformType(java.lang.String name) {
		org.jfree.chart.util.GradientPaintTransformType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.GradientPaintTransformType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.GradientPaintTransformType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.GradientPaintTransformType)) {
			return false;
		}
		org.jfree.chart.util.GradientPaintTransformType t = ((org.jfree.chart.util.GradientPaintTransformType) (obj));
		if (!(org.jfree.chart.util.GradientPaintTransformType.this.name.equals(t.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.GradientPaintTransformType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.util.GradientPaintTransformType result = null;
		if (org.jfree.chart.util.GradientPaintTransformType.this.equals(org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL)) {
			result = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
		}else
			if (org.jfree.chart.util.GradientPaintTransformType.this.equals(org.jfree.chart.util.GradientPaintTransformType.VERTICAL)) {
				result = org.jfree.chart.util.GradientPaintTransformType.VERTICAL;
			}else
				if (org.jfree.chart.util.GradientPaintTransformType.this.equals(org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL)) {
					result = org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL;
				}else
					if (org.jfree.chart.util.GradientPaintTransformType.this.equals(org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL)) {
						result = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
					}
				
			
		
		return result;
	}
}


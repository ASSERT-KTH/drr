

package org.jfree.chart.block;


public final class LengthConstraintType implements java.io.Serializable {
	private static final long serialVersionUID = -1156658804028142978L;

	public static final org.jfree.chart.block.LengthConstraintType NONE = new org.jfree.chart.block.LengthConstraintType("LengthConstraintType.NONE");

	public static final org.jfree.chart.block.LengthConstraintType RANGE = new org.jfree.chart.block.LengthConstraintType("RectangleConstraintType.RANGE");

	public static final org.jfree.chart.block.LengthConstraintType FIXED = new org.jfree.chart.block.LengthConstraintType("LengthConstraintType.FIXED");

	private java.lang.String name;

	private LengthConstraintType(java.lang.String name) {
		org.jfree.chart.block.LengthConstraintType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.block.LengthConstraintType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.block.LengthConstraintType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.LengthConstraintType)) {
			return false;
		}
		org.jfree.chart.block.LengthConstraintType that = ((org.jfree.chart.block.LengthConstraintType) (obj));
		if (!(org.jfree.chart.block.LengthConstraintType.this.name.equals(that.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.block.LengthConstraintType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.block.LengthConstraintType.this.equals(org.jfree.chart.block.LengthConstraintType.NONE)) {
			return org.jfree.chart.block.LengthConstraintType.NONE;
		}else
			if (org.jfree.chart.block.LengthConstraintType.this.equals(org.jfree.chart.block.LengthConstraintType.RANGE)) {
				return org.jfree.chart.block.LengthConstraintType.RANGE;
			}else
				if (org.jfree.chart.block.LengthConstraintType.this.equals(org.jfree.chart.block.LengthConstraintType.FIXED)) {
					return org.jfree.chart.block.LengthConstraintType.FIXED;
				}
			
		
		return null;
	}
}


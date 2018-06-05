

package org.jfree.chart.util;


public final class LengthAdjustmentType implements java.io.Serializable {
	private static final long serialVersionUID = -6097408511380545010L;

	public static final org.jfree.chart.util.LengthAdjustmentType NO_CHANGE = new org.jfree.chart.util.LengthAdjustmentType("NO_CHANGE");

	public static final org.jfree.chart.util.LengthAdjustmentType EXPAND = new org.jfree.chart.util.LengthAdjustmentType("EXPAND");

	public static final org.jfree.chart.util.LengthAdjustmentType CONTRACT = new org.jfree.chart.util.LengthAdjustmentType("CONTRACT");

	private java.lang.String name;

	private LengthAdjustmentType(java.lang.String name) {
		org.jfree.chart.util.LengthAdjustmentType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.LengthAdjustmentType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.LengthAdjustmentType.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.LengthAdjustmentType)) {
			return false;
		}
		final org.jfree.chart.util.LengthAdjustmentType that = ((org.jfree.chart.util.LengthAdjustmentType) (obj));
		if (!(org.jfree.chart.util.LengthAdjustmentType.this.name.equals(that.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.LengthAdjustmentType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.LengthAdjustmentType.this.equals(org.jfree.chart.util.LengthAdjustmentType.NO_CHANGE)) {
			return org.jfree.chart.util.LengthAdjustmentType.NO_CHANGE;
		}else
			if (org.jfree.chart.util.LengthAdjustmentType.this.equals(org.jfree.chart.util.LengthAdjustmentType.EXPAND)) {
				return org.jfree.chart.util.LengthAdjustmentType.EXPAND;
			}else
				if (org.jfree.chart.util.LengthAdjustmentType.this.equals(org.jfree.chart.util.LengthAdjustmentType.CONTRACT)) {
					return org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
				}
			
		
		return null;
	}
}


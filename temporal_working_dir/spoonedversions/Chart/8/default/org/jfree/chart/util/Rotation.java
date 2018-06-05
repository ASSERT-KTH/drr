

package org.jfree.chart.util;


public final class Rotation implements java.io.Serializable {
	private static final long serialVersionUID = -4662815260201591676L;

	public static final org.jfree.chart.util.Rotation CLOCKWISE = new org.jfree.chart.util.Rotation("Rotation.CLOCKWISE", (-1.0));

	public static final org.jfree.chart.util.Rotation ANTICLOCKWISE = new org.jfree.chart.util.Rotation("Rotation.ANTICLOCKWISE", 1.0);

	private java.lang.String name;

	private double factor;

	private Rotation(final java.lang.String name, final double factor) {
		org.jfree.chart.util.Rotation.this.name = name;
		org.jfree.chart.util.Rotation.this.factor = factor;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.Rotation.this.name;
	}

	public double getFactor() {
		return org.jfree.chart.util.Rotation.this.factor;
	}

	public boolean equals(final java.lang.Object o) {
		if ((org.jfree.chart.util.Rotation.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.chart.util.Rotation)) {
			return false;
		}
		final org.jfree.chart.util.Rotation rotation = ((org.jfree.chart.util.Rotation) (o));
		if ((org.jfree.chart.util.Rotation.this.factor) != (rotation.factor)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		final long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.util.Rotation.this.factor);
		return ((int) (temp ^ (temp >>> 32)));
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.util.Rotation.this.equals(org.jfree.chart.util.Rotation.CLOCKWISE)) {
			return org.jfree.chart.util.Rotation.CLOCKWISE;
		}else
			if (org.jfree.chart.util.Rotation.this.equals(org.jfree.chart.util.Rotation.ANTICLOCKWISE)) {
				return org.jfree.chart.util.Rotation.ANTICLOCKWISE;
			}
		
		return null;
	}
}


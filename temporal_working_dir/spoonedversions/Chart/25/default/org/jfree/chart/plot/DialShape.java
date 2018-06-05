

package org.jfree.chart.plot;


public final class DialShape implements java.io.Serializable {
	private static final long serialVersionUID = -3471933055190251131L;

	public static final org.jfree.chart.plot.DialShape CIRCLE = new org.jfree.chart.plot.DialShape("DialShape.CIRCLE");

	public static final org.jfree.chart.plot.DialShape CHORD = new org.jfree.chart.plot.DialShape("DialShape.CHORD");

	public static final org.jfree.chart.plot.DialShape PIE = new org.jfree.chart.plot.DialShape("DialShape.PIE");

	private java.lang.String name;

	private DialShape(java.lang.String name) {
		org.jfree.chart.plot.DialShape.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.plot.DialShape.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.plot.DialShape.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.DialShape)) {
			return false;
		}
		org.jfree.chart.plot.DialShape shape = ((org.jfree.chart.plot.DialShape) (obj));
		if (!(org.jfree.chart.plot.DialShape.this.name.equals(shape.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.plot.DialShape.this.equals(org.jfree.chart.plot.DialShape.CIRCLE)) {
			return org.jfree.chart.plot.DialShape.CIRCLE;
		}else
			if (org.jfree.chart.plot.DialShape.this.equals(org.jfree.chart.plot.DialShape.CHORD)) {
				return org.jfree.chart.plot.DialShape.CHORD;
			}else
				if (org.jfree.chart.plot.DialShape.this.equals(org.jfree.chart.plot.DialShape.PIE)) {
					return org.jfree.chart.plot.DialShape.PIE;
				}
			
		
		return null;
	}
}


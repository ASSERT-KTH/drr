

package org.jfree.chart;


public final class LegendRenderingOrder implements java.io.Serializable {
	private static final long serialVersionUID = -3832486612685808616L;

	public static final org.jfree.chart.LegendRenderingOrder STANDARD = new org.jfree.chart.LegendRenderingOrder("LegendRenderingOrder.STANDARD");

	public static final org.jfree.chart.LegendRenderingOrder REVERSE = new org.jfree.chart.LegendRenderingOrder("LegendRenderingOrder.REVERSE");

	private java.lang.String name;

	private LegendRenderingOrder(java.lang.String name) {
		org.jfree.chart.LegendRenderingOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.LegendRenderingOrder.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.LegendRenderingOrder.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.LegendRenderingOrder)) {
			return false;
		}
		org.jfree.chart.LegendRenderingOrder order = ((org.jfree.chart.LegendRenderingOrder) (obj));
		if (!(org.jfree.chart.LegendRenderingOrder.this.name.equals(order.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.LegendRenderingOrder.this.equals(org.jfree.chart.LegendRenderingOrder.STANDARD)) {
			return org.jfree.chart.LegendRenderingOrder.STANDARD;
		}else
			if (org.jfree.chart.LegendRenderingOrder.this.equals(org.jfree.chart.LegendRenderingOrder.REVERSE)) {
				return org.jfree.chart.LegendRenderingOrder.REVERSE;
			}
		
		return null;
	}
}


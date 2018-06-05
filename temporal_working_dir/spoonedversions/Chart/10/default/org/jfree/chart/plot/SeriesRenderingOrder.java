

package org.jfree.chart.plot;


public final class SeriesRenderingOrder implements java.io.Serializable {
	private static final long serialVersionUID = 209336477448807735L;

	public static final org.jfree.chart.plot.SeriesRenderingOrder FORWARD = new org.jfree.chart.plot.SeriesRenderingOrder("SeriesRenderingOrder.FORWARD");

	public static final org.jfree.chart.plot.SeriesRenderingOrder REVERSE = new org.jfree.chart.plot.SeriesRenderingOrder("SeriesRenderingOrder.REVERSE");

	private java.lang.String name;

	private SeriesRenderingOrder(java.lang.String name) {
		org.jfree.chart.plot.SeriesRenderingOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.plot.SeriesRenderingOrder.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.plot.SeriesRenderingOrder.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.SeriesRenderingOrder)) {
			return false;
		}
		org.jfree.chart.plot.SeriesRenderingOrder order = ((org.jfree.chart.plot.SeriesRenderingOrder) (obj));
		if (!(org.jfree.chart.plot.SeriesRenderingOrder.this.name.equals(order.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.plot.SeriesRenderingOrder.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.plot.SeriesRenderingOrder.this.equals(org.jfree.chart.plot.SeriesRenderingOrder.FORWARD)) {
			return org.jfree.chart.plot.SeriesRenderingOrder.FORWARD;
		}else
			if (org.jfree.chart.plot.SeriesRenderingOrder.this.equals(org.jfree.chart.plot.SeriesRenderingOrder.REVERSE)) {
				return org.jfree.chart.plot.SeriesRenderingOrder.REVERSE;
			}
		
		return null;
	}
}




package org.jfree.chart.plot;


public final class DatasetRenderingOrder implements java.io.Serializable {
	private static final long serialVersionUID = -600593412366385072L;

	public static final org.jfree.chart.plot.DatasetRenderingOrder FORWARD = new org.jfree.chart.plot.DatasetRenderingOrder("DatasetRenderingOrder.FORWARD");

	public static final org.jfree.chart.plot.DatasetRenderingOrder REVERSE = new org.jfree.chart.plot.DatasetRenderingOrder("DatasetRenderingOrder.REVERSE");

	private java.lang.String name;

	private DatasetRenderingOrder(java.lang.String name) {
		org.jfree.chart.plot.DatasetRenderingOrder.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.plot.DatasetRenderingOrder.this.name;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.chart.plot.DatasetRenderingOrder.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.chart.plot.DatasetRenderingOrder)) {
			return false;
		}
		org.jfree.chart.plot.DatasetRenderingOrder order = ((org.jfree.chart.plot.DatasetRenderingOrder) (o));
		if (!(org.jfree.chart.plot.DatasetRenderingOrder.this.name.equals(order.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.plot.DatasetRenderingOrder.this.equals(org.jfree.chart.plot.DatasetRenderingOrder.FORWARD)) {
			return org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
		}else
			if (org.jfree.chart.plot.DatasetRenderingOrder.this.equals(org.jfree.chart.plot.DatasetRenderingOrder.REVERSE)) {
				return org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;
			}
		
		return null;
	}
}


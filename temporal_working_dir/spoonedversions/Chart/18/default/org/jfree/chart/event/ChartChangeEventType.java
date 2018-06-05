

package org.jfree.chart.event;


public final class ChartChangeEventType implements java.io.Serializable {
	private static final long serialVersionUID = 5481917022435735602L;

	public static final org.jfree.chart.event.ChartChangeEventType GENERAL = new org.jfree.chart.event.ChartChangeEventType("ChartChangeEventType.GENERAL");

	public static final org.jfree.chart.event.ChartChangeEventType NEW_DATASET = new org.jfree.chart.event.ChartChangeEventType("ChartChangeEventType.NEW_DATASET");

	public static final org.jfree.chart.event.ChartChangeEventType DATASET_UPDATED = new org.jfree.chart.event.ChartChangeEventType("ChartChangeEventType.DATASET_UPDATED");

	private java.lang.String name;

	private ChartChangeEventType(java.lang.String name) {
		org.jfree.chart.event.ChartChangeEventType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.event.ChartChangeEventType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.event.ChartChangeEventType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.event.ChartChangeEventType)) {
			return false;
		}
		org.jfree.chart.event.ChartChangeEventType that = ((org.jfree.chart.event.ChartChangeEventType) (obj));
		if (!(org.jfree.chart.event.ChartChangeEventType.this.name.equals(that.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.event.ChartChangeEventType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.event.ChartChangeEventType.this.equals(org.jfree.chart.event.ChartChangeEventType.GENERAL)) {
			return org.jfree.chart.event.ChartChangeEventType.GENERAL;
		}else
			if (org.jfree.chart.event.ChartChangeEventType.this.equals(org.jfree.chart.event.ChartChangeEventType.NEW_DATASET)) {
				return org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
			}else
				if (org.jfree.chart.event.ChartChangeEventType.this.equals(org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED)) {
					return org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED;
				}
			
		
		return null;
	}
}


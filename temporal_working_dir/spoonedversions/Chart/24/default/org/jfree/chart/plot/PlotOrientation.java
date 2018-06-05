

package org.jfree.chart.plot;


public final class PlotOrientation implements java.io.Serializable {
	private static final long serialVersionUID = -2508771828190337782L;

	public static final org.jfree.chart.plot.PlotOrientation HORIZONTAL = new org.jfree.chart.plot.PlotOrientation("PlotOrientation.HORIZONTAL");

	public static final org.jfree.chart.plot.PlotOrientation VERTICAL = new org.jfree.chart.plot.PlotOrientation("PlotOrientation.VERTICAL");

	private java.lang.String name;

	private PlotOrientation(java.lang.String name) {
		org.jfree.chart.plot.PlotOrientation.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.plot.PlotOrientation.this.name;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.chart.plot.PlotOrientation.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.chart.plot.PlotOrientation)) {
			return false;
		}
		org.jfree.chart.plot.PlotOrientation orientation = ((org.jfree.chart.plot.PlotOrientation) (o));
		if (!(org.jfree.chart.plot.PlotOrientation.this.name.equals(orientation.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.chart.plot.PlotOrientation.this.equals(org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			result = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
		}else
			if (org.jfree.chart.plot.PlotOrientation.this.equals(org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				result = org.jfree.chart.plot.PlotOrientation.VERTICAL;
			}
		
		return result;
	}
}


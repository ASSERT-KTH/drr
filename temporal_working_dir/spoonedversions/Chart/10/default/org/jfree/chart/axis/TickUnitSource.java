

package org.jfree.chart.axis;


public interface TickUnitSource {
	public org.jfree.chart.axis.TickUnit getLargerTickUnit(org.jfree.chart.axis.TickUnit unit);

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(org.jfree.chart.axis.TickUnit unit);

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(double size);
}


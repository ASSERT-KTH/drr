

package org.jfree.chart.plot;


public interface Selectable {
	public boolean canSelectByPoint();

	public boolean canSelectByRegion();

	public void select(double x, double y, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source);

	public void select(java.awt.geom.GeneralPath region, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source);

	public void clearSelection();
}


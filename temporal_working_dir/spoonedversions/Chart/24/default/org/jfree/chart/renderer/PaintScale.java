

package org.jfree.chart.renderer;


public interface PaintScale {
	public double getLowerBound();

	public double getUpperBound();

	public java.awt.Paint getPaint(double value);
}


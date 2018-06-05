

package org.jfree.chart.plot;


public interface DrawingSupplier {
	public java.awt.Paint getNextPaint();

	public java.awt.Paint getNextOutlinePaint();

	public java.awt.Paint getNextFillPaint();

	public java.awt.Stroke getNextStroke();

	public java.awt.Stroke getNextOutlineStroke();

	public java.awt.Shape getNextShape();
}


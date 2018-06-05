

package org.jfree.chart.panel;


public class RegionSelectionHandler extends org.jfree.chart.panel.AbstractMouseHandler {
	private java.awt.geom.GeneralPath selection;

	private java.awt.geom.Point2D lastPoint;

	private java.awt.Stroke outlineStroke;

	private java.awt.Paint outlinePaint;

	private java.awt.Paint fillPaint;

	public RegionSelectionHandler() {
		this(new java.awt.BasicStroke(1.0F), java.awt.Color.darkGray, new java.awt.Color(255, 0, 255, 50));
	}

	public RegionSelectionHandler(java.awt.Stroke outlineStroke, java.awt.Paint outlinePaint, java.awt.Paint fillPaint) {
		super();
		org.jfree.chart.panel.RegionSelectionHandler.this.selection = new java.awt.geom.GeneralPath();
		org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint = null;
		org.jfree.chart.panel.RegionSelectionHandler.this.outlineStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.panel.RegionSelectionHandler.this.outlinePaint = java.awt.Color.darkGray;
		org.jfree.chart.panel.RegionSelectionHandler.this.fillPaint = new java.awt.Color(255, 0, 255, 50);
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.panel.RegionSelectionHandler.this.fillPaint;
	}

	public void setFillPaint(java.awt.Paint paint) {
		org.jfree.chart.panel.RegionSelectionHandler.this.fillPaint = paint;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.panel.RegionSelectionHandler.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.panel.RegionSelectionHandler.this.outlinePaint = paint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.panel.RegionSelectionHandler.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.panel.RegionSelectionHandler.this.outlineStroke = stroke;
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		java.awt.geom.Rectangle2D dataArea = panel.getScreenDataArea();
		if (dataArea.contains(e.getPoint())) {
			org.jfree.chart.JFreeChart chart = panel.getChart();
			if ((chart.getPlot()) instanceof org.jfree.chart.plot.Selectable) {
				org.jfree.chart.plot.Selectable s = ((org.jfree.chart.plot.Selectable) (chart.getPlot()));
				if (!(e.isShiftDown())) {
					s.clearSelection();
					chart.setNotify(true);
				}
				java.awt.Point pt = e.getPoint();
				org.jfree.chart.panel.RegionSelectionHandler.this.selection.moveTo(((float) (pt.getX())), ((float) (pt.getY())));
				org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint = new java.awt.Point(pt);
			}
		}
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		java.awt.Point pt = e.getPoint();
		java.awt.geom.Point2D pt2 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(pt.x, pt.y, panel.getScreenDataArea());
		if ((pt2.distance(org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint)) > 5) {
			org.jfree.chart.panel.RegionSelectionHandler.this.selection.lineTo(((float) (pt2.getX())), ((float) (pt2.getY())));
			org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint = pt2;
		}
		panel.setSelectionShape(selection);
		panel.setSelectionFillPaint(org.jfree.chart.panel.RegionSelectionHandler.this.fillPaint);
		panel.setSelectionOutlinePaint(org.jfree.chart.panel.RegionSelectionHandler.this.outlinePaint);
		panel.repaint();
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		org.jfree.chart.panel.RegionSelectionHandler.this.selection.closePath();
		org.jfree.chart.JFreeChart chart = panel.getChart();
		org.jfree.chart.plot.Plot plot = chart.getPlot();
		if (!(plot instanceof org.jfree.chart.plot.Selectable)) {
			return ;
		}
		org.jfree.chart.plot.Selectable p = ((org.jfree.chart.plot.Selectable) (plot));
		if (p.canSelectByRegion()) {
			p.select(org.jfree.chart.panel.RegionSelectionHandler.this.selection, panel.getScreenDataArea(), panel);
		}
		panel.setSelectionShape(null);
		org.jfree.chart.panel.RegionSelectionHandler.this.selection.reset();
		org.jfree.chart.panel.RegionSelectionHandler.this.lastPoint = null;
		panel.repaint();
		panel.clearLiveMouseHandler();
	}
}


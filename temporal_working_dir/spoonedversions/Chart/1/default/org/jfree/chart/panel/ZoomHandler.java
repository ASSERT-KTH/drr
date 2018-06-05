

package org.jfree.chart.panel;


public class ZoomHandler extends org.jfree.chart.panel.AbstractMouseHandler {
	private java.awt.geom.Point2D zoomPoint;

	private java.awt.geom.Rectangle2D zoomRectangle;

	public ZoomHandler() {
		super();
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		org.jfree.chart.ChartPanel chartPanel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		java.awt.geom.Rectangle2D screenDataArea = chartPanel.getScreenDataArea(e.getX(), e.getY());
		if (screenDataArea != null) {
			org.jfree.chart.panel.ZoomHandler.this.zoomPoint = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(e.getX(), e.getY(), screenDataArea);
		}else {
			org.jfree.chart.panel.ZoomHandler.this.zoomPoint = null;
		}
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.ZoomHandler.this.zoomPoint) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (panel.getGraphics()));
		if (!(panel.getUseBuffer())) {
			drawZoomRectangle(panel, g2, true);
		}
		boolean hZoom = false;
		boolean vZoom = false;
		if ((panel.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			hZoom = panel.isRangeZoomable();
			vZoom = panel.isDomainZoomable();
		}else {
			hZoom = panel.isDomainZoomable();
			vZoom = panel.isRangeZoomable();
		}
		java.awt.geom.Rectangle2D scaledDataArea = panel.getScreenDataArea(((int) (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())), ((int) (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
		if (hZoom && vZoom) {
			double xmax = java.lang.Math.min(e.getX(), scaledDataArea.getMaxX());
			double ymax = java.lang.Math.min(e.getY(), scaledDataArea.getMaxY());
			org.jfree.chart.panel.ZoomHandler.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX(), org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY(), (xmax - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())), (ymax - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
		}else
			if (hZoom) {
				double xmax = java.lang.Math.min(e.getX(), scaledDataArea.getMaxX());
				org.jfree.chart.panel.ZoomHandler.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX(), scaledDataArea.getMinY(), (xmax - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())), scaledDataArea.getHeight());
			}else
				if (vZoom) {
					double ymax = java.lang.Math.min(e.getY(), scaledDataArea.getMaxY());
					org.jfree.chart.panel.ZoomHandler.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(scaledDataArea.getMinX(), org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY(), scaledDataArea.getWidth(), (ymax - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
				}
			
		
		panel.setZoomRectangle(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle);
		if (panel.getUseBuffer()) {
			panel.repaint();
		}else {
			drawZoomRectangle(panel, g2, true);
		}
		g2.dispose();
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.ZoomHandler.this.zoomRectangle) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		boolean hZoom = false;
		boolean vZoom = false;
		if ((panel.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			hZoom = panel.isRangeZoomable();
			vZoom = panel.isDomainZoomable();
		}else {
			hZoom = panel.isDomainZoomable();
			vZoom = panel.isRangeZoomable();
		}
		boolean zoomTrigger1 = hZoom && ((java.lang.Math.abs(((e.getX()) - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())))) >= (panel.getZoomTriggerDistance()));
		boolean zoomTrigger2 = vZoom && ((java.lang.Math.abs(((e.getY()) - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())))) >= (panel.getZoomTriggerDistance()));
		if (zoomTrigger1 || zoomTrigger2) {
			if ((hZoom && ((e.getX()) < (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX()))) || (vZoom && ((e.getY()) < (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())))) {
				panel.restoreAutoBounds();
			}else {
				double x;
				double y;
				double w;
				double h;
				java.awt.geom.Rectangle2D screenDataArea = panel.getScreenDataArea(((int) (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())), ((int) (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
				double maxX = screenDataArea.getMaxX();
				double maxY = screenDataArea.getMaxY();
				if (!vZoom) {
					x = org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX();
					y = screenDataArea.getMinY();
					w = java.lang.Math.min(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle.getWidth(), (maxX - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())));
					h = screenDataArea.getHeight();
				}else
					if (!hZoom) {
						x = screenDataArea.getMinX();
						y = org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY();
						w = screenDataArea.getWidth();
						h = java.lang.Math.min(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle.getHeight(), (maxY - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
					}else {
						x = org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX();
						y = org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY();
						w = java.lang.Math.min(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle.getWidth(), (maxX - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getX())));
						h = java.lang.Math.min(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle.getHeight(), (maxY - (org.jfree.chart.panel.ZoomHandler.this.zoomPoint.getY())));
					}
				
				java.awt.geom.Rectangle2D zoomArea = new java.awt.geom.Rectangle2D.Double(x, y, w, h);
				panel.zoom(zoomArea);
			}
			org.jfree.chart.panel.ZoomHandler.this.zoomPoint = null;
			org.jfree.chart.panel.ZoomHandler.this.zoomRectangle = null;
			panel.setZoomRectangle(null);
			panel.clearLiveMouseHandler();
		}else {
			java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (panel.getGraphics()));
			if (panel.getUseBuffer()) {
				panel.repaint();
			}else {
				drawZoomRectangle(panel, g2, true);
			}
			g2.dispose();
			org.jfree.chart.panel.ZoomHandler.this.zoomPoint = null;
			org.jfree.chart.panel.ZoomHandler.this.zoomRectangle = null;
			panel.setZoomRectangle(null);
			panel.clearLiveMouseHandler();
		}
	}

	private void drawZoomRectangle(org.jfree.chart.ChartPanel panel, java.awt.Graphics2D g2, boolean xor) {
		if ((org.jfree.chart.panel.ZoomHandler.this.zoomRectangle) != null) {
			if (xor) {
				g2.setXORMode(java.awt.Color.gray);
			}
			if (panel.getFillZoomRectangle()) {
				g2.setPaint(panel.getZoomFillPaint());
				g2.fill(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle);
			}else {
				g2.setPaint(panel.getZoomOutlinePaint());
				g2.draw(org.jfree.chart.panel.ZoomHandler.this.zoomRectangle);
			}
			if (xor) {
				g2.setPaintMode();
			}
		}
	}
}




package org.jfree.chart.panel;


public class PanHandler extends org.jfree.chart.panel.AbstractMouseHandler {
	private double panW;

	private double panH;

	private java.awt.Point panLast;

	public PanHandler() {
		super();
		org.jfree.chart.panel.PanHandler.this.panLast = null;
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		org.jfree.chart.plot.Plot plot = panel.getChart().getPlot();
		if (!(plot instanceof org.jfree.chart.plot.Pannable)) {
			return ;
		}
		org.jfree.chart.plot.Pannable pannable = ((org.jfree.chart.plot.Pannable) (plot));
		if ((pannable.isDomainPannable()) || (pannable.isRangePannable())) {
			java.awt.geom.Rectangle2D screenDataArea = panel.getScreenDataArea(e.getX(), e.getY());
			if ((screenDataArea != null) && (screenDataArea.contains(e.getPoint()))) {
				org.jfree.chart.panel.PanHandler.this.panW = screenDataArea.getWidth();
				org.jfree.chart.panel.PanHandler.this.panH = screenDataArea.getHeight();
				org.jfree.chart.panel.PanHandler.this.panLast = e.getPoint();
				panel.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.MOVE_CURSOR));
			}
		}
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.PanHandler.this.panLast) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
		org.jfree.chart.JFreeChart chart = panel.getChart();
		double dx = (e.getX()) - (org.jfree.chart.panel.PanHandler.this.panLast.getX());
		double dy = (e.getY()) - (org.jfree.chart.panel.PanHandler.this.panLast.getY());
		if ((dx == 0.0) && (dy == 0.0)) {
			return ;
		}
		double wPercent = (-dx) / (org.jfree.chart.panel.PanHandler.this.panW);
		double hPercent = dy / (org.jfree.chart.panel.PanHandler.this.panH);
		boolean old = chart.getPlot().isNotify();
		chart.getPlot().setNotify(false);
		org.jfree.chart.plot.Pannable p = ((org.jfree.chart.plot.Pannable) (chart.getPlot()));
		org.jfree.chart.plot.PlotRenderingInfo info = panel.getChartRenderingInfo().getPlotInfo();
		if ((p.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			p.panDomainAxes(wPercent, info, org.jfree.chart.panel.PanHandler.this.panLast);
			p.panRangeAxes(hPercent, info, org.jfree.chart.panel.PanHandler.this.panLast);
		}else {
			p.panDomainAxes(hPercent, info, org.jfree.chart.panel.PanHandler.this.panLast);
			p.panRangeAxes(wPercent, info, org.jfree.chart.panel.PanHandler.this.panLast);
		}
		org.jfree.chart.panel.PanHandler.this.panLast = e.getPoint();
		chart.getPlot().setNotify(old);
		return ;
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.panel.PanHandler.this.panLast) != null) {
			org.jfree.chart.ChartPanel panel = ((org.jfree.chart.ChartPanel) (e.getSource()));
			org.jfree.chart.panel.PanHandler.this.panLast = null;
			panel.setCursor(java.awt.Cursor.getDefaultCursor());
			panel.clearLiveMouseHandler();
		}
	}
}


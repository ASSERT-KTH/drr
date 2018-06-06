

package org.jfree.chart;


class MouseWheelHandler implements java.awt.event.MouseWheelListener , java.io.Serializable {
	private org.jfree.chart.ChartPanel chartPanel;

	double zoomFactor;

	public MouseWheelHandler(org.jfree.chart.ChartPanel chartPanel) {
		org.jfree.chart.MouseWheelHandler.this.chartPanel = chartPanel;
		org.jfree.chart.MouseWheelHandler.this.zoomFactor = 0.1;
		org.jfree.chart.MouseWheelHandler.this.chartPanel.addMouseWheelListener(org.jfree.chart.MouseWheelHandler.this);
	}

	public double getZoomFactor() {
		return org.jfree.chart.MouseWheelHandler.this.zoomFactor;
	}

	public void setZoomFactor(double zoomFactor) {
		org.jfree.chart.MouseWheelHandler.this.zoomFactor = zoomFactor;
	}

	public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.MouseWheelHandler.this.chartPanel.getChart();
		if (chart == null) {
			return ;
		}
		org.jfree.chart.plot.Plot plot = chart.getPlot();
		if (plot instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable zoomable = ((org.jfree.chart.plot.Zoomable) (plot));
			handleZoomable(zoomable, e);
		}else
			if (plot instanceof org.jfree.chart.plot.PiePlot) {
				org.jfree.chart.plot.PiePlot pp = ((org.jfree.chart.plot.PiePlot) (plot));
				pp.handleMouseWheelRotation(e.getWheelRotation());
			}
		
	}

	private void handleZoomable(org.jfree.chart.plot.Zoomable zoomable, java.awt.event.MouseWheelEvent e) {
		org.jfree.chart.ChartRenderingInfo info = org.jfree.chart.MouseWheelHandler.this.chartPanel.getChartRenderingInfo();
		org.jfree.chart.plot.PlotRenderingInfo pinfo = info.getPlotInfo();
		java.awt.geom.Point2D p = org.jfree.chart.MouseWheelHandler.this.chartPanel.translateScreenToJava2D(e.getPoint());
		if (!(pinfo.getDataArea().contains(p))) {
			return ;
		}
		org.jfree.chart.plot.Plot plot = ((org.jfree.chart.plot.Plot) (zoomable));
		boolean notifyState = plot.isNotify();
		plot.setNotify(false);
		int clicks = e.getWheelRotation();
		double zf = 1.0 + (org.jfree.chart.MouseWheelHandler.this.zoomFactor);
		if (clicks < 0) {
			zf = 1.0 / zf;
		}
		if (chartPanel.isDomainZoomable()) {
			zoomable.zoomDomainAxes(zf, pinfo, p, true);
		}
		if (chartPanel.isRangeZoomable()) {
			zoomable.zoomRangeAxes(zf, pinfo, p, true);
		}
		plot.setNotify(notifyState);
	}
}


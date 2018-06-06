

package org.jfree.chart;


public class PolarChartPanel extends org.jfree.chart.ChartPanel {
	private static final java.lang.String POLAR_ZOOM_IN_ACTION_COMMAND = "Polar Zoom In";

	private static final java.lang.String POLAR_ZOOM_OUT_ACTION_COMMAND = "Polar Zoom Out";

	private static final java.lang.String POLAR_AUTO_RANGE_ACTION_COMMAND = "Polar Auto Range";

	public PolarChartPanel(org.jfree.chart.JFreeChart chart) {
		this(chart, true);
	}

	public PolarChartPanel(org.jfree.chart.JFreeChart chart, boolean useBuffer) {
		super(chart, useBuffer);
		checkChart(chart);
		setMinimumDrawWidth(200);
		setMinimumDrawHeight(200);
		setMaximumDrawWidth(2000);
		setMaximumDrawHeight(2000);
	}

	public void setChart(org.jfree.chart.JFreeChart chart) {
		checkChart(chart);
		super.setChart(chart);
	}

	protected javax.swing.JPopupMenu createPopupMenu(boolean properties, boolean save, boolean print, boolean zoom) {
		javax.swing.JPopupMenu result = super.createPopupMenu(properties, save, print, zoom);
		int zoomInIndex = getPopupMenuItem(result, "Zoom In");
		int zoomOutIndex = getPopupMenuItem(result, "Zoom Out");
		int autoIndex = getPopupMenuItem(result, "Auto Range");
		if (zoom) {
			javax.swing.JMenuItem zoomIn = new javax.swing.JMenuItem("Zoom In");
			zoomIn.setActionCommand(org.jfree.chart.PolarChartPanel.POLAR_ZOOM_IN_ACTION_COMMAND);
			zoomIn.addActionListener(org.jfree.chart.PolarChartPanel.this);
			javax.swing.JMenuItem zoomOut = new javax.swing.JMenuItem("Zoom Out");
			zoomOut.setActionCommand(org.jfree.chart.PolarChartPanel.POLAR_ZOOM_OUT_ACTION_COMMAND);
			zoomOut.addActionListener(org.jfree.chart.PolarChartPanel.this);
			javax.swing.JMenuItem auto = new javax.swing.JMenuItem("Auto Range");
			auto.setActionCommand(org.jfree.chart.PolarChartPanel.POLAR_AUTO_RANGE_ACTION_COMMAND);
			auto.addActionListener(org.jfree.chart.PolarChartPanel.this);
			if (zoomInIndex != (-1)) {
				result.remove(zoomInIndex);
			}else {
				zoomInIndex = (result.getComponentCount()) - 1;
			}
			result.add(zoomIn, zoomInIndex);
			if (zoomOutIndex != (-1)) {
				result.remove(zoomOutIndex);
			}else {
				zoomOutIndex = zoomInIndex + 1;
			}
			result.add(zoomOut, zoomOutIndex);
			if (autoIndex != (-1)) {
				result.remove(autoIndex);
			}else {
				autoIndex = zoomOutIndex + 1;
			}
			result.add(auto, autoIndex);
		}
		return result;
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals(org.jfree.chart.PolarChartPanel.POLAR_ZOOM_IN_ACTION_COMMAND)) {
			org.jfree.chart.plot.PolarPlot plot = ((org.jfree.chart.plot.PolarPlot) (getChart().getPlot()));
			plot.zoom(0.5);
		}else
			if (command.equals(org.jfree.chart.PolarChartPanel.POLAR_ZOOM_OUT_ACTION_COMMAND)) {
				org.jfree.chart.plot.PolarPlot plot = ((org.jfree.chart.plot.PolarPlot) (getChart().getPlot()));
				plot.zoom(2.0);
			}else
				if (command.equals(org.jfree.chart.PolarChartPanel.POLAR_AUTO_RANGE_ACTION_COMMAND)) {
					org.jfree.chart.plot.PolarPlot plot = ((org.jfree.chart.plot.PolarPlot) (getChart().getPlot()));
					plot.getAxis().setAutoRange(true);
				}else {
					super.actionPerformed(event);
				}
			
		
	}

	private void checkChart(org.jfree.chart.JFreeChart chart) {
		org.jfree.chart.plot.Plot plot = chart.getPlot();
		if (!(plot instanceof org.jfree.chart.plot.PolarPlot)) {
			throw new java.lang.IllegalArgumentException("plot is not a PolarPlot");
		}
	}

	private int getPopupMenuItem(javax.swing.JPopupMenu menu, java.lang.String text) {
		int index = -1;
		for (int i = 0; (index == (-1)) && (i < (menu.getComponentCount())); i++) {
			java.awt.Component comp = menu.getComponent(i);
			if (comp instanceof javax.swing.JMenuItem) {
				javax.swing.JMenuItem item = ((javax.swing.JMenuItem) (comp));
				if (text.equals(item.getText())) {
					index = i;
				}
			}
		}
		return index;
	}
}


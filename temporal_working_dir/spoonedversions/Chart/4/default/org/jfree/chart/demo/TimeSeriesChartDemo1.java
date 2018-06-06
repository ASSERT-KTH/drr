

package org.jfree.chart.demo;


public class TimeSeriesChartDemo1 extends org.jfree.chart.util.ApplicationFrame {
	public TimeSeriesChartDemo1(java.lang.String title) {
		super(title);
		org.jfree.chart.ChartPanel chartPanel = ((org.jfree.chart.ChartPanel) (org.jfree.chart.demo.TimeSeriesChartDemo1.createDemoPanel()));
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		setContentPane(chartPanel);
	}

	private static org.jfree.chart.JFreeChart createChart(org.jfree.data.xy.XYDataset dataset) {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createTimeSeriesChart("Legal & General Unit Trust Prices", "Date", "Price Per Unit", dataset, true, true, false);
		chart.setBackgroundPaint(java.awt.Color.white);
		org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (chart.getPlot()));
		plot.setBackgroundPaint(java.awt.Color.lightGray);
		plot.setDomainGridlinePaint(java.awt.Color.white);
		plot.setRangeGridlinePaint(java.awt.Color.white);
		plot.setAxisOffset(new org.jfree.chart.util.RectangleInsets(5.0, 5.0, 5.0, 5.0));
		plot.setDomainCrosshairVisible(true);
		plot.setRangeCrosshairVisible(true);
		org.jfree.chart.renderer.xy.XYItemRenderer r = plot.getRenderer();
		if (r instanceof org.jfree.chart.renderer.xy.XYLineAndShapeRenderer) {
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer) (r));
			renderer.setBaseShapesVisible(true);
			renderer.setBaseShapesFilled(true);
			renderer.setDrawSeriesLineAsPath(true);
		}
		org.jfree.chart.axis.DateAxis axis = ((org.jfree.chart.axis.DateAxis) (plot.getDomainAxis()));
		axis.setDateFormatOverride(new java.text.SimpleDateFormat("MMM-yyyy"));
		return chart;
	}

	private static org.jfree.data.xy.XYDataset createDataset() {
		org.jfree.data.time.TimeSeries s1 = new org.jfree.data.time.TimeSeries("L&G European Index Trust");
		s1.add(new org.jfree.data.time.Month(2, 2001), 181.8);
		s1.add(new org.jfree.data.time.Month(3, 2001), 167.3);
		s1.add(new org.jfree.data.time.Month(4, 2001), 153.8);
		s1.add(new org.jfree.data.time.Month(5, 2001), 167.6);
		s1.add(new org.jfree.data.time.Month(6, 2001), 158.8);
		s1.add(new org.jfree.data.time.Month(7, 2001), 148.3);
		s1.add(new org.jfree.data.time.Month(8, 2001), 153.9);
		s1.add(new org.jfree.data.time.Month(9, 2001), 142.7);
		s1.add(new org.jfree.data.time.Month(10, 2001), 123.2);
		s1.add(new org.jfree.data.time.Month(11, 2001), 131.8);
		s1.add(new org.jfree.data.time.Month(12, 2001), 139.6);
		s1.add(new org.jfree.data.time.Month(1, 2002), 142.9);
		s1.add(new org.jfree.data.time.Month(2, 2002), 138.7);
		s1.add(new org.jfree.data.time.Month(3, 2002), 137.3);
		s1.add(new org.jfree.data.time.Month(4, 2002), 143.9);
		s1.add(new org.jfree.data.time.Month(5, 2002), 139.8);
		s1.add(new org.jfree.data.time.Month(6, 2002), 137.0);
		s1.add(new org.jfree.data.time.Month(7, 2002), 132.8);
		org.jfree.data.time.TimeSeries s2 = new org.jfree.data.time.TimeSeries("L&G UK Index Trust");
		s2.add(new org.jfree.data.time.Month(2, 2001), 129.6);
		s2.add(new org.jfree.data.time.Month(3, 2001), 123.2);
		s2.add(new org.jfree.data.time.Month(4, 2001), 117.2);
		s2.add(new org.jfree.data.time.Month(5, 2001), 124.1);
		s2.add(new org.jfree.data.time.Month(6, 2001), 122.6);
		s2.add(new org.jfree.data.time.Month(7, 2001), 119.2);
		s2.add(new org.jfree.data.time.Month(8, 2001), 116.5);
		s2.add(new org.jfree.data.time.Month(9, 2001), 112.7);
		s2.add(new org.jfree.data.time.Month(10, 2001), 101.5);
		s2.add(new org.jfree.data.time.Month(11, 2001), 106.1);
		s2.add(new org.jfree.data.time.Month(12, 2001), 110.3);
		s2.add(new org.jfree.data.time.Month(1, 2002), 111.7);
		s2.add(new org.jfree.data.time.Month(2, 2002), 111.0);
		s2.add(new org.jfree.data.time.Month(3, 2002), 109.6);
		s2.add(new org.jfree.data.time.Month(4, 2002), 113.2);
		s2.add(new org.jfree.data.time.Month(5, 2002), 111.6);
		s2.add(new org.jfree.data.time.Month(6, 2002), 108.8);
		s2.add(new org.jfree.data.time.Month(7, 2002), 101.6);
		org.jfree.data.time.TimeSeriesCollection dataset = new org.jfree.data.time.TimeSeriesCollection();
		dataset.addSeries(s1);
		dataset.addSeries(s2);
		return dataset;
	}

	public static javax.swing.JPanel createDemoPanel() {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.demo.TimeSeriesChartDemo1.createChart(org.jfree.chart.demo.TimeSeriesChartDemo1.createDataset());
		org.jfree.chart.ChartPanel panel = new org.jfree.chart.ChartPanel(chart);
		panel.setFillZoomRectangle(true);
		panel.setMouseWheelEnabled(true);
		return panel;
	}

	public static void main(java.lang.String[] args) {
		org.jfree.chart.demo.TimeSeriesChartDemo1 demo = new org.jfree.chart.demo.TimeSeriesChartDemo1("Time Series Chart Demo 1");
		demo.pack();
		org.jfree.chart.util.RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}
}


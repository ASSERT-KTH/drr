

package org.jfree.chart.demo;


public class BarChartDemo1 extends org.jfree.chart.util.ApplicationFrame {
	public BarChartDemo1(java.lang.String title) {
		super(title);
		org.jfree.data.category.CategoryDataset dataset = org.jfree.chart.demo.BarChartDemo1.createDataset();
		org.jfree.chart.JFreeChart chart = org.jfree.chart.demo.BarChartDemo1.createChart(dataset);
		org.jfree.chart.ChartPanel chartPanel = new org.jfree.chart.ChartPanel(chart);
		chartPanel.setFillZoomRectangle(true);
		chartPanel.setMouseWheelEnabled(true);
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		setContentPane(chartPanel);
	}

	private static org.jfree.data.category.CategoryDataset createDataset() {
		java.lang.String series1 = "First";
		java.lang.String series2 = "Second";
		java.lang.String series3 = "Third";
		java.lang.String category1 = "Category 1";
		java.lang.String category2 = "Category 2";
		java.lang.String category3 = "Category 3";
		java.lang.String category4 = "Category 4";
		java.lang.String category5 = "Category 5";
		org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
		dataset.addValue(1.0, series1, category1);
		dataset.addValue(4.0, series1, category2);
		dataset.addValue(3.0, series1, category3);
		dataset.addValue(5.0, series1, category4);
		dataset.addValue(5.0, series1, category5);
		dataset.addValue(5.0, series2, category1);
		dataset.addValue(7.0, series2, category2);
		dataset.addValue(6.0, series2, category3);
		dataset.addValue(8.0, series2, category4);
		dataset.addValue(4.0, series2, category5);
		dataset.addValue(4.0, series3, category1);
		dataset.addValue(3.0, series3, category2);
		dataset.addValue(2.0, series3, category3);
		dataset.addValue(3.0, series3, category4);
		dataset.addValue(6.0, series3, category5);
		return dataset;
	}

	private static org.jfree.chart.JFreeChart createChart(org.jfree.data.category.CategoryDataset dataset) {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Bar Chart Demo 1", "Category", "Value", dataset, true);
		org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (chart.getPlot()));
		org.jfree.chart.axis.NumberAxis rangeAxis = ((org.jfree.chart.axis.NumberAxis) (plot.getRangeAxis()));
		rangeAxis.setStandardTickUnits(org.jfree.chart.axis.NumberAxis.createIntegerTickUnits());
		org.jfree.chart.renderer.category.BarRenderer renderer = ((org.jfree.chart.renderer.category.BarRenderer) (plot.getRenderer()));
		renderer.setDrawBarOutline(false);
		java.awt.GradientPaint gp0 = new java.awt.GradientPaint(0.0F, 0.0F, java.awt.Color.blue, 0.0F, 0.0F, new java.awt.Color(0, 0, 64));
		java.awt.GradientPaint gp1 = new java.awt.GradientPaint(0.0F, 0.0F, java.awt.Color.green, 0.0F, 0.0F, new java.awt.Color(0, 64, 0));
		java.awt.GradientPaint gp2 = new java.awt.GradientPaint(0.0F, 0.0F, java.awt.Color.red, 0.0F, 0.0F, new java.awt.Color(64, 0, 0));
		renderer.setSeriesPaint(0, gp0);
		renderer.setSeriesPaint(1, gp1);
		renderer.setSeriesPaint(2, gp2);
		org.jfree.chart.axis.CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(((java.lang.Math.PI) / 6.0)));
		return chart;
	}

	public static void main(java.lang.String[] args) {
		org.jfree.chart.demo.BarChartDemo1 demo = new org.jfree.chart.demo.BarChartDemo1("Bar Chart Demo 1");
		demo.pack();
		org.jfree.chart.util.RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}
}


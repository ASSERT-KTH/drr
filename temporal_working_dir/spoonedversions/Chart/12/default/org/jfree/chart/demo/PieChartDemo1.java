

package org.jfree.chart.demo;


public class PieChartDemo1 extends org.jfree.chart.util.ApplicationFrame {
	public PieChartDemo1(java.lang.String title) {
		super(title);
		setContentPane(org.jfree.chart.demo.PieChartDemo1.createDemoPanel());
	}

	private static org.jfree.data.general.PieDataset createDataset() {
		org.jfree.data.general.DefaultPieDataset dataset = new org.jfree.data.general.DefaultPieDataset();
		dataset.setValue("One", new java.lang.Double(43.2));
		dataset.setValue("Two", new java.lang.Double(10.0));
		dataset.setValue("Three", new java.lang.Double(27.5));
		dataset.setValue("Four", new java.lang.Double(17.5));
		dataset.setValue("Five", new java.lang.Double(11.0));
		dataset.setValue("Six", new java.lang.Double(19.4));
		return dataset;
	}

	private static org.jfree.chart.JFreeChart createChart(org.jfree.data.general.PieDataset dataset) {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createPieChart("Pie Chart Demo 1", dataset, true, true, false);
		org.jfree.chart.plot.PiePlot plot = ((org.jfree.chart.plot.PiePlot) (chart.getPlot()));
		plot.setSectionOutlinesVisible(false);
		plot.setLabelFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10));
		plot.setNoDataMessage("No data available");
		plot.setSimpleLabels(true);
		return chart;
	}

	public static javax.swing.JPanel createDemoPanel() {
		org.jfree.chart.JFreeChart chart = org.jfree.chart.demo.PieChartDemo1.createChart(org.jfree.chart.demo.PieChartDemo1.createDataset());
		return new org.jfree.chart.ChartPanel(chart);
	}

	public static void main(java.lang.String[] args) {
		org.jfree.chart.demo.PieChartDemo1 demo = new org.jfree.chart.demo.PieChartDemo1("Pie Chart Demo 1");
		demo.pack();
		org.jfree.chart.util.RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}
}




package org.jfree.chart;


public class ChartFrame extends javax.swing.JFrame {
	private org.jfree.chart.ChartPanel chartPanel;

	public ChartFrame(java.lang.String title, org.jfree.chart.JFreeChart chart) {
		this(title, chart, false);
	}

	public ChartFrame(java.lang.String title, org.jfree.chart.JFreeChart chart, boolean scrollPane) {
		super(title);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		org.jfree.chart.ChartFrame.this.chartPanel = new org.jfree.chart.ChartPanel(chart);
		if (scrollPane) {
			setContentPane(new javax.swing.JScrollPane(org.jfree.chart.ChartFrame.this.chartPanel));
		}else {
			setContentPane(org.jfree.chart.ChartFrame.this.chartPanel);
		}
	}

	public org.jfree.chart.ChartPanel getChartPanel() {
		return org.jfree.chart.ChartFrame.this.chartPanel;
	}
}


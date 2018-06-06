

package org.jfree.chart.ui;


public class StrokeChooserPanel extends javax.swing.JPanel {
	private javax.swing.JComboBox selector;

	public StrokeChooserPanel(org.jfree.chart.ui.StrokeSample current, org.jfree.chart.ui.StrokeSample[] available) {
		setLayout(new java.awt.BorderLayout());
		org.jfree.chart.ui.StrokeChooserPanel.this.selector = new javax.swing.JComboBox(available);
		org.jfree.chart.ui.StrokeChooserPanel.this.selector.setSelectedItem(current);
		org.jfree.chart.ui.StrokeChooserPanel.this.selector.setRenderer(new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(1)));
		add(org.jfree.chart.ui.StrokeChooserPanel.this.selector);
		org.jfree.chart.ui.StrokeChooserPanel.this.selector.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				getSelector().transferFocus();
			}
		});
	}

	protected final javax.swing.JComboBox getSelector() {
		return org.jfree.chart.ui.StrokeChooserPanel.this.selector;
	}

	public java.awt.Stroke getSelectedStroke() {
		org.jfree.chart.ui.StrokeSample sample = ((org.jfree.chart.ui.StrokeSample) (org.jfree.chart.ui.StrokeChooserPanel.this.selector.getSelectedItem()));
		return sample.getStroke();
	}
}




package org.jfree.chart.ui;


public class StrokeSample extends javax.swing.JComponent implements javax.swing.ListCellRenderer {
	private java.awt.Stroke stroke;

	private java.awt.Dimension preferredSize;

	public StrokeSample(java.awt.Stroke stroke) {
		org.jfree.chart.ui.StrokeSample.this.stroke = stroke;
		org.jfree.chart.ui.StrokeSample.this.preferredSize = new java.awt.Dimension(80, 18);
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.ui.StrokeSample.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		org.jfree.chart.ui.StrokeSample.this.stroke = stroke;
		repaint();
	}

	public java.awt.Dimension getPreferredSize() {
		return org.jfree.chart.ui.StrokeSample.this.preferredSize;
	}

	public void paintComponent(java.awt.Graphics g) {
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
		g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
		java.awt.Dimension size = getSize();
		java.awt.Insets insets = getInsets();
		double xx = insets.left;
		double yy = insets.top;
		double ww = ((size.getWidth()) - (insets.left)) - (insets.right);
		double hh = ((size.getHeight()) - (insets.top)) - (insets.bottom);
		java.awt.geom.Point2D one = new java.awt.geom.Point2D.Double((xx + 6), (yy + (hh / 2)));
		java.awt.geom.Point2D two = new java.awt.geom.Point2D.Double(((xx + ww) - 6), (yy + (hh / 2)));
		java.awt.geom.Ellipse2D circle1 = new java.awt.geom.Ellipse2D.Double(((one.getX()) - 5), ((one.getY()) - 5), 10, 10);
		java.awt.geom.Ellipse2D circle2 = new java.awt.geom.Ellipse2D.Double(((two.getX()) - 6), ((two.getY()) - 5), 10, 10);
		g2.draw(circle1);
		g2.fill(circle1);
		g2.draw(circle2);
		g2.fill(circle2);
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(one, two);
		if ((org.jfree.chart.ui.StrokeSample.this.stroke) != null) {
			g2.setStroke(org.jfree.chart.ui.StrokeSample.this.stroke);
		}else {
			g2.setStroke(new java.awt.BasicStroke(0.0F));
		}
		g2.draw(line);
	}

	public java.awt.Component getListCellRendererComponent(javax.swing.JList list, java.lang.Object value, int index, boolean isSelected, boolean cellHasFocus) {
		if (value instanceof org.jfree.chart.ui.StrokeSample) {
			final org.jfree.chart.ui.StrokeSample in = ((org.jfree.chart.ui.StrokeSample) (value));
			setStroke(in.getStroke());
		}
		return org.jfree.chart.ui.StrokeSample.this;
	}
}


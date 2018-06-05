

package org.jfree.chart.ui;


public class PaintSample extends javax.swing.JComponent {
	private java.awt.Paint paint;

	private java.awt.Dimension preferredSize;

	public PaintSample(java.awt.Paint paint) {
		org.jfree.chart.ui.PaintSample.this.paint = paint;
		org.jfree.chart.ui.PaintSample.this.preferredSize = new java.awt.Dimension(80, 12);
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.ui.PaintSample.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		org.jfree.chart.ui.PaintSample.this.paint = paint;
		repaint();
	}

	public java.awt.Dimension getPreferredSize() {
		return org.jfree.chart.ui.PaintSample.this.preferredSize;
	}

	public void paintComponent(java.awt.Graphics g) {
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
		java.awt.Dimension size = getSize();
		java.awt.Insets insets = getInsets();
		double xx = insets.left;
		double yy = insets.top;
		double ww = (((size.getWidth()) - (insets.left)) - (insets.right)) - 1;
		double hh = (((size.getHeight()) - (insets.top)) - (insets.bottom)) - 1;
		java.awt.geom.Rectangle2D area = new java.awt.geom.Rectangle2D.Double(xx, yy, ww, hh);
		g2.setPaint(org.jfree.chart.ui.PaintSample.this.paint);
		g2.fill(area);
		g2.setPaint(java.awt.Color.black);
		g2.draw(area);
	}
}


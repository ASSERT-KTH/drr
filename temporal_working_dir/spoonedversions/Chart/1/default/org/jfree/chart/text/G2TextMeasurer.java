

package org.jfree.chart.text;


public class G2TextMeasurer implements org.jfree.chart.text.TextMeasurer {
	private java.awt.Graphics2D g2;

	public G2TextMeasurer(java.awt.Graphics2D g2) {
		org.jfree.chart.text.G2TextMeasurer.this.g2 = g2;
	}

	public float getStringWidth(java.lang.String text, int start, int end) {
		java.awt.FontMetrics fm = org.jfree.chart.text.G2TextMeasurer.this.g2.getFontMetrics();
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(text.substring(start, end), org.jfree.chart.text.G2TextMeasurer.this.g2, fm);
		float result = ((float) (bounds.getWidth()));
		return result;
	}
}


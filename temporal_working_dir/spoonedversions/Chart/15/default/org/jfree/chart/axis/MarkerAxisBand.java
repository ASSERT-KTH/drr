

package org.jfree.chart.axis;


public class MarkerAxisBand implements java.io.Serializable {
	private static final long serialVersionUID = -1729482413886398919L;

	private org.jfree.chart.axis.NumberAxis axis;

	private double topOuterGap;

	private double topInnerGap;

	private double bottomOuterGap;

	private double bottomInnerGap;

	private java.awt.Font font;

	private java.util.List markers;

	public MarkerAxisBand(org.jfree.chart.axis.NumberAxis axis, double topOuterGap, double topInnerGap, double bottomOuterGap, double bottomInnerGap, java.awt.Font font) {
		org.jfree.chart.axis.MarkerAxisBand.this.axis = axis;
		org.jfree.chart.axis.MarkerAxisBand.this.topOuterGap = topOuterGap;
		org.jfree.chart.axis.MarkerAxisBand.this.topInnerGap = topInnerGap;
		org.jfree.chart.axis.MarkerAxisBand.this.bottomOuterGap = bottomOuterGap;
		org.jfree.chart.axis.MarkerAxisBand.this.bottomInnerGap = bottomInnerGap;
		org.jfree.chart.axis.MarkerAxisBand.this.font = font;
		org.jfree.chart.axis.MarkerAxisBand.this.markers = new java.util.ArrayList();
	}

	public void addMarker(org.jfree.chart.plot.IntervalMarker marker) {
		org.jfree.chart.axis.MarkerAxisBand.this.markers.add(marker);
	}

	public double getHeight(java.awt.Graphics2D g2) {
		double result = 0.0;
		if ((org.jfree.chart.axis.MarkerAxisBand.this.markers.size()) > 0) {
			java.awt.font.LineMetrics metrics = org.jfree.chart.axis.MarkerAxisBand.this.font.getLineMetrics("123g", g2.getFontRenderContext());
			result = ((((org.jfree.chart.axis.MarkerAxisBand.this.topOuterGap) + (org.jfree.chart.axis.MarkerAxisBand.this.topInnerGap)) + (metrics.getHeight())) + (org.jfree.chart.axis.MarkerAxisBand.this.bottomInnerGap)) + (org.jfree.chart.axis.MarkerAxisBand.this.bottomOuterGap);
		}
		return result;
	}

	private void drawStringInRect(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D bounds, java.awt.Font font, java.lang.String text) {
		g2.setFont(font);
		java.awt.FontMetrics fm = g2.getFontMetrics(font);
		java.awt.geom.Rectangle2D r = org.jfree.chart.text.TextUtilities.getTextBounds(text, g2, fm);
		double x = bounds.getX();
		if ((r.getWidth()) < (bounds.getWidth())) {
			x = x + (((bounds.getWidth()) - (r.getWidth())) / 2);
		}
		java.awt.font.LineMetrics metrics = font.getLineMetrics(text, g2.getFontRenderContext());
		g2.drawString(text, ((float) (x)), ((float) (((bounds.getMaxY()) - (org.jfree.chart.axis.MarkerAxisBand.this.bottomInnerGap)) - (metrics.getDescent()))));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, double x, double y) {
		double h = getHeight(g2);
		java.util.Iterator iterator = org.jfree.chart.axis.MarkerAxisBand.this.markers.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.IntervalMarker marker = ((org.jfree.chart.plot.IntervalMarker) (iterator.next()));
			double start = java.lang.Math.max(marker.getStartValue(), org.jfree.chart.axis.MarkerAxisBand.this.axis.getRange().getLowerBound());
			double end = java.lang.Math.min(marker.getEndValue(), org.jfree.chart.axis.MarkerAxisBand.this.axis.getRange().getUpperBound());
			double s = org.jfree.chart.axis.MarkerAxisBand.this.axis.valueToJava2D(start, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			double e = org.jfree.chart.axis.MarkerAxisBand.this.axis.valueToJava2D(end, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			java.awt.geom.Rectangle2D r = new java.awt.geom.Rectangle2D.Double(s, (y + (org.jfree.chart.axis.MarkerAxisBand.this.topOuterGap)), (e - s), ((h - (org.jfree.chart.axis.MarkerAxisBand.this.topOuterGap)) - (org.jfree.chart.axis.MarkerAxisBand.this.bottomOuterGap)));
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
			g2.setPaint(marker.getPaint());
			g2.fill(r);
			g2.setPaint(marker.getOutlinePaint());
			g2.draw(r);
			g2.setComposite(originalComposite);
			g2.setPaint(java.awt.Color.black);
			drawStringInRect(g2, r, org.jfree.chart.axis.MarkerAxisBand.this.font, marker.getLabel());
		} 
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.MarkerAxisBand.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.MarkerAxisBand)) {
			return false;
		}
		org.jfree.chart.axis.MarkerAxisBand that = ((org.jfree.chart.axis.MarkerAxisBand) (obj));
		if ((org.jfree.chart.axis.MarkerAxisBand.this.topOuterGap) != (that.topOuterGap)) {
			return false;
		}
		if ((org.jfree.chart.axis.MarkerAxisBand.this.topInnerGap) != (that.topInnerGap)) {
			return false;
		}
		if ((org.jfree.chart.axis.MarkerAxisBand.this.bottomInnerGap) != (that.bottomInnerGap)) {
			return false;
		}
		if ((org.jfree.chart.axis.MarkerAxisBand.this.bottomOuterGap) != (that.bottomOuterGap)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.MarkerAxisBand.this.font, that.font))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.MarkerAxisBand.this.markers, that.markers))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 37;
		result = (19 * result) + (org.jfree.chart.axis.MarkerAxisBand.this.font.hashCode());
		result = (19 * result) + (org.jfree.chart.axis.MarkerAxisBand.this.markers.hashCode());
		return result;
	}
}


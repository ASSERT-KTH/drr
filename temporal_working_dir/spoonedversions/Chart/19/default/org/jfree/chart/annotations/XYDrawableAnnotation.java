

package org.jfree.chart.annotations;


public class XYDrawableAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -6540812859722691020L;

	private double x;

	private double y;

	private double width;

	private double height;

	private org.jfree.chart.Drawable drawable;

	public XYDrawableAnnotation(double x, double y, double width, double height, org.jfree.chart.Drawable drawable) {
		if (drawable == null) {
			throw new java.lang.IllegalArgumentException("Null 'drawable' argument.");
		}
		org.jfree.chart.annotations.XYDrawableAnnotation.this.x = x;
		org.jfree.chart.annotations.XYDrawableAnnotation.this.y = y;
		org.jfree.chart.annotations.XYDrawableAnnotation.this.width = width;
		org.jfree.chart.annotations.XYDrawableAnnotation.this.height = height;
		org.jfree.chart.annotations.XYDrawableAnnotation.this.drawable = drawable;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		float j2DX = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYDrawableAnnotation.this.x, dataArea, domainEdge)));
		float j2DY = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYDrawableAnnotation.this.y, dataArea, rangeEdge)));
		java.awt.geom.Rectangle2D area = new java.awt.geom.Rectangle2D.Double((j2DX - ((org.jfree.chart.annotations.XYDrawableAnnotation.this.width) / 2.0)), (j2DY - ((org.jfree.chart.annotations.XYDrawableAnnotation.this.height) / 2.0)), org.jfree.chart.annotations.XYDrawableAnnotation.this.width, org.jfree.chart.annotations.XYDrawableAnnotation.this.height);
		org.jfree.chart.annotations.XYDrawableAnnotation.this.drawable.draw(g2, area);
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, area, rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYDrawableAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYDrawableAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYDrawableAnnotation that = ((org.jfree.chart.annotations.XYDrawableAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYDrawableAnnotation.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDrawableAnnotation.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDrawableAnnotation.this.width) != (that.width)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDrawableAnnotation.this.height) != (that.height)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYDrawableAnnotation.this.drawable, that.drawable))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		long temp;
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYDrawableAnnotation.this.x);
		result = ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYDrawableAnnotation.this.y);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYDrawableAnnotation.this.width);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYDrawableAnnotation.this.height);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


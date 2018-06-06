

package org.jfree.chart.annotations;


public class XYDataImageAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.lang.Cloneable , org.jfree.chart.annotations.XYAnnotationBoundsInfo , org.jfree.chart.util.PublicCloneable {
	private transient java.awt.Image image;

	private double x;

	private double y;

	private double w;

	private double h;

	private boolean includeInDataBounds;

	public XYDataImageAnnotation(java.awt.Image image, double x, double y, double w, double h) {
		this(image, x, y, w, h, false);
	}

	public XYDataImageAnnotation(java.awt.Image image, double x, double y, double w, double h, boolean includeInDataBounds) {
		if (image == null) {
			throw new java.lang.IllegalArgumentException("Null 'image' argument.");
		}
		org.jfree.chart.annotations.XYDataImageAnnotation.this.image = image;
		org.jfree.chart.annotations.XYDataImageAnnotation.this.x = x;
		org.jfree.chart.annotations.XYDataImageAnnotation.this.y = y;
		org.jfree.chart.annotations.XYDataImageAnnotation.this.w = w;
		org.jfree.chart.annotations.XYDataImageAnnotation.this.h = h;
		org.jfree.chart.annotations.XYDataImageAnnotation.this.includeInDataBounds = includeInDataBounds;
	}

	public java.awt.Image getImage() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.image;
	}

	public double getX() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.x;
	}

	public double getY() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.y;
	}

	public double getWidth() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.w;
	}

	public double getHeight() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.h;
	}

	public boolean getIncludeInDataBounds() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.includeInDataBounds;
	}

	public org.jfree.data.Range getXRange() {
		return new org.jfree.data.Range(org.jfree.chart.annotations.XYDataImageAnnotation.this.x, ((org.jfree.chart.annotations.XYDataImageAnnotation.this.x) + (org.jfree.chart.annotations.XYDataImageAnnotation.this.w)));
	}

	public org.jfree.data.Range getYRange() {
		return new org.jfree.data.Range(org.jfree.chart.annotations.XYDataImageAnnotation.this.y, ((org.jfree.chart.annotations.XYDataImageAnnotation.this.y) + (org.jfree.chart.annotations.XYDataImageAnnotation.this.h)));
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.axis.AxisLocation xAxisLocation = plot.getDomainAxisLocation();
		org.jfree.chart.axis.AxisLocation yAxisLocation = plot.getRangeAxisLocation();
		org.jfree.chart.util.RectangleEdge xEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(xAxisLocation, orientation);
		org.jfree.chart.util.RectangleEdge yEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(yAxisLocation, orientation);
		float j2DX0 = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYDataImageAnnotation.this.x, dataArea, xEdge)));
		float j2DY0 = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYDataImageAnnotation.this.y, dataArea, yEdge)));
		float j2DX1 = ((float) (domainAxis.valueToJava2D(((org.jfree.chart.annotations.XYDataImageAnnotation.this.x) + (org.jfree.chart.annotations.XYDataImageAnnotation.this.w)), dataArea, xEdge)));
		float j2DY1 = ((float) (rangeAxis.valueToJava2D(((org.jfree.chart.annotations.XYDataImageAnnotation.this.y) + (org.jfree.chart.annotations.XYDataImageAnnotation.this.h)), dataArea, yEdge)));
		float xx0 = 0.0F;
		float yy0 = 0.0F;
		float xx1 = 0.0F;
		float yy1 = 0.0F;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			xx0 = j2DY0;
			xx1 = j2DY1;
			yy0 = j2DX0;
			yy1 = j2DX1;
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				xx0 = j2DX0;
				xx1 = j2DX1;
				yy0 = j2DY0;
				yy1 = j2DY1;
			}
		
		g2.drawImage(org.jfree.chart.annotations.XYDataImageAnnotation.this.image, ((int) (xx0)), ((int) (java.lang.Math.min(yy0, yy1))), ((int) (xx1 - xx0)), ((int) (java.lang.Math.abs((yy1 - yy0)))), null);
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, new java.awt.geom.Rectangle2D.Float(xx0, yy0, (xx1 - xx0), (yy1 - yy0)), rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYDataImageAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYDataImageAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYDataImageAnnotation that = ((org.jfree.chart.annotations.XYDataImageAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYDataImageAnnotation.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDataImageAnnotation.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDataImageAnnotation.this.w) != (that.w)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDataImageAnnotation.this.h) != (that.h)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYDataImageAnnotation.this.includeInDataBounds) != (that.includeInDataBounds)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYDataImageAnnotation.this.image, that.image))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.annotations.XYDataImageAnnotation.this.image.hashCode();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
	}
}


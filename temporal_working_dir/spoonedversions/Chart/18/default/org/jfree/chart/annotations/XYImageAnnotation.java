

package org.jfree.chart.annotations;


public class XYImageAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4364694501921559958L;

	private double x;

	private double y;

	private transient java.awt.Image image;

	private org.jfree.chart.util.RectangleAnchor anchor;

	public XYImageAnnotation(double x, double y, java.awt.Image image) {
		this(x, y, image, org.jfree.chart.util.RectangleAnchor.CENTER);
	}

	public XYImageAnnotation(double x, double y, java.awt.Image image, org.jfree.chart.util.RectangleAnchor anchor) {
		if (image == null) {
			throw new java.lang.IllegalArgumentException("Null 'image' argument.");
		}
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYImageAnnotation.this.x = x;
		org.jfree.chart.annotations.XYImageAnnotation.this.y = y;
		org.jfree.chart.annotations.XYImageAnnotation.this.image = image;
		org.jfree.chart.annotations.XYImageAnnotation.this.anchor = anchor;
	}

	public double getX() {
		return org.jfree.chart.annotations.XYImageAnnotation.this.x;
	}

	public double getY() {
		return org.jfree.chart.annotations.XYImageAnnotation.this.y;
	}

	public java.awt.Image getImage() {
		return org.jfree.chart.annotations.XYImageAnnotation.this.image;
	}

	public org.jfree.chart.util.RectangleAnchor getImageAnchor() {
		return org.jfree.chart.annotations.XYImageAnnotation.this.anchor;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.axis.AxisLocation domainAxisLocation = plot.getDomainAxisLocation();
		org.jfree.chart.axis.AxisLocation rangeAxisLocation = plot.getRangeAxisLocation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(domainAxisLocation, orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(rangeAxisLocation, orientation);
		float j2DX = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYImageAnnotation.this.x, dataArea, domainEdge)));
		float j2DY = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYImageAnnotation.this.y, dataArea, rangeEdge)));
		float xx = 0.0F;
		float yy = 0.0F;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			xx = j2DY;
			yy = j2DX;
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				xx = j2DX;
				yy = j2DY;
			}
		
		int w = org.jfree.chart.annotations.XYImageAnnotation.this.image.getWidth(null);
		int h = org.jfree.chart.annotations.XYImageAnnotation.this.image.getHeight(null);
		java.awt.geom.Rectangle2D imageRect = new java.awt.geom.Rectangle2D.Double(0, 0, w, h);
		java.awt.geom.Point2D anchorPoint = org.jfree.chart.util.RectangleAnchor.coordinates(imageRect, org.jfree.chart.annotations.XYImageAnnotation.this.anchor);
		xx = xx - ((float) (anchorPoint.getX()));
		yy = yy - ((float) (anchorPoint.getY()));
		g2.drawImage(org.jfree.chart.annotations.XYImageAnnotation.this.image, ((int) (xx)), ((int) (yy)), null);
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, new java.awt.geom.Rectangle2D.Float(xx, yy, w, h), rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYImageAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYImageAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYImageAnnotation that = ((org.jfree.chart.annotations.XYImageAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYImageAnnotation.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYImageAnnotation.this.y) != (that.y)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYImageAnnotation.this.image, that.image))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYImageAnnotation.this.anchor.equals(that.anchor))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.annotations.XYImageAnnotation.this.image.hashCode();
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


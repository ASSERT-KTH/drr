

package org.jfree.chart.annotations;


public class XYTitleAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4364694501921559958L;

	private org.jfree.chart.util.XYCoordinateType coordinateType;

	private double x;

	private double y;

	private double maxWidth;

	private double maxHeight;

	private org.jfree.chart.title.Title title;

	private org.jfree.chart.util.RectangleAnchor anchor;

	public XYTitleAnnotation(double x, double y, org.jfree.chart.title.Title title) {
		this(x, y, title, org.jfree.chart.util.RectangleAnchor.CENTER);
	}

	public XYTitleAnnotation(double x, double y, org.jfree.chart.title.Title title, org.jfree.chart.util.RectangleAnchor anchor) {
		super();
		if (title == null) {
			throw new java.lang.IllegalArgumentException("Null 'title' argument.");
		}
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType = org.jfree.chart.util.XYCoordinateType.RELATIVE;
		org.jfree.chart.annotations.XYTitleAnnotation.this.x = x;
		org.jfree.chart.annotations.XYTitleAnnotation.this.y = y;
		org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth = 0.0;
		org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight = 0.0;
		org.jfree.chart.annotations.XYTitleAnnotation.this.title = title;
		org.jfree.chart.annotations.XYTitleAnnotation.this.anchor = anchor;
	}

	public org.jfree.chart.util.XYCoordinateType getCoordinateType() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType;
	}

	public double getX() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.x;
	}

	public double getY() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.y;
	}

	public org.jfree.chart.title.Title getTitle() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.title;
	}

	public org.jfree.chart.util.RectangleAnchor getTitleAnchor() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.anchor;
	}

	public double getMaxWidth() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth;
	}

	public void setMaxWidth(double max) {
		org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth = max;
		fireAnnotationChanged();
	}

	public double getMaxHeight() {
		return org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight;
	}

	public void setMaxHeight(double max) {
		org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight = max;
		fireAnnotationChanged();
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.axis.AxisLocation domainAxisLocation = plot.getDomainAxisLocation();
		org.jfree.chart.axis.AxisLocation rangeAxisLocation = plot.getRangeAxisLocation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(domainAxisLocation, orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(rangeAxisLocation, orientation);
		org.jfree.data.Range xRange = domainAxis.getRange();
		org.jfree.data.Range yRange = rangeAxis.getRange();
		double anchorX = 0.0;
		double anchorY = 0.0;
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType) == (org.jfree.chart.util.XYCoordinateType.RELATIVE)) {
			anchorX = (xRange.getLowerBound()) + ((org.jfree.chart.annotations.XYTitleAnnotation.this.x) * (xRange.getLength()));
			anchorY = (yRange.getLowerBound()) + ((org.jfree.chart.annotations.XYTitleAnnotation.this.y) * (yRange.getLength()));
		}else {
			anchorX = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYTitleAnnotation.this.x, dataArea, domainEdge);
			anchorY = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYTitleAnnotation.this.y, dataArea, rangeEdge);
		}
		float j2DX = ((float) (domainAxis.valueToJava2D(anchorX, dataArea, domainEdge)));
		float j2DY = ((float) (rangeAxis.valueToJava2D(anchorY, dataArea, rangeEdge)));
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
		
		double maxW = dataArea.getWidth();
		double maxH = dataArea.getHeight();
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType) == (org.jfree.chart.util.XYCoordinateType.RELATIVE)) {
			if ((org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth) > 0.0) {
				maxW = maxW * (org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth);
			}
			if ((org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight) > 0.0) {
				maxH = maxH * (org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight);
			}
		}
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType) == (org.jfree.chart.util.XYCoordinateType.DATA)) {
			maxW = org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth;
			maxH = org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight;
		}
		org.jfree.chart.block.RectangleConstraint rc = new org.jfree.chart.block.RectangleConstraint(new org.jfree.data.Range(0, maxW), new org.jfree.data.Range(0, maxH));
		org.jfree.chart.util.Size2D size = org.jfree.chart.annotations.XYTitleAnnotation.this.title.arrange(g2, rc);
		java.awt.geom.Rectangle2D titleRect = new java.awt.geom.Rectangle2D.Double(0, 0, size.width, size.height);
		java.awt.geom.Point2D anchorPoint = org.jfree.chart.util.RectangleAnchor.coordinates(titleRect, org.jfree.chart.annotations.XYTitleAnnotation.this.anchor);
		xx = xx - ((float) (anchorPoint.getX()));
		yy = yy - ((float) (anchorPoint.getY()));
		titleRect.setRect(xx, yy, titleRect.getWidth(), titleRect.getHeight());
		org.jfree.chart.block.BlockParams p = new org.jfree.chart.block.BlockParams();
		if (info != null) {
			if ((info.getOwner().getEntityCollection()) != null) {
				p.setGenerateEntities(true);
			}
		}
		java.lang.Object result = org.jfree.chart.annotations.XYTitleAnnotation.this.title.draw(g2, titleRect, p);
		if (info != null) {
			if (result instanceof org.jfree.chart.block.EntityBlockResult) {
				org.jfree.chart.block.EntityBlockResult ebr = ((org.jfree.chart.block.EntityBlockResult) (result));
				info.getOwner().getEntityCollection().addAll(ebr.getEntityCollection());
			}
			java.lang.String toolTip = getToolTipText();
			java.lang.String url = getURL();
			if ((toolTip != null) || (url != null)) {
				addEntity(info, new java.awt.geom.Rectangle2D.Float(xx, yy, ((float) (size.width)), ((float) (size.height))), rendererIndex, toolTip, url);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYTitleAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYTitleAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYTitleAnnotation that = ((org.jfree.chart.annotations.XYTitleAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType) != (that.coordinateType)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.x) != (that.x)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.y) != (that.y)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth) != (that.maxWidth)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight) != (that.maxHeight)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYTitleAnnotation.this.title, that.title))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.XYTitleAnnotation.this.anchor.equals(that.anchor))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.anchor);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.coordinateType);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.x);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.y);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.maxWidth);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.maxHeight);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.annotations.XYTitleAnnotation.this.title);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


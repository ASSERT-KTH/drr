

package org.jfree.chart.annotations;


public class XYLineAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -80535465244091334L;

	private double x1;

	private double y1;

	private double x2;

	private double y2;

	private transient java.awt.Stroke stroke;

	private transient java.awt.Paint paint;

	public XYLineAnnotation(double x1, double y1, double x2, double y2) {
		this(x1, y1, x2, y2, new java.awt.BasicStroke(1.0F), java.awt.Color.black);
	}

	public XYLineAnnotation(double x1, double y1, double x2, double y2, java.awt.Stroke stroke, java.awt.Paint paint) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.XYLineAnnotation.this.x1 = x1;
		org.jfree.chart.annotations.XYLineAnnotation.this.y1 = y1;
		org.jfree.chart.annotations.XYLineAnnotation.this.x2 = x2;
		org.jfree.chart.annotations.XYLineAnnotation.this.y2 = y2;
		org.jfree.chart.annotations.XYLineAnnotation.this.stroke = stroke;
		org.jfree.chart.annotations.XYLineAnnotation.this.paint = paint;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		float j2DX1 = 0.0F;
		float j2DX2 = 0.0F;
		float j2DY1 = 0.0F;
		float j2DY2 = 0.0F;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			j2DX1 = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.x1, dataArea, domainEdge)));
			j2DY1 = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.y1, dataArea, rangeEdge)));
			j2DX2 = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.x2, dataArea, domainEdge)));
			j2DY2 = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.y2, dataArea, rangeEdge)));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				j2DY1 = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.x1, dataArea, domainEdge)));
				j2DX1 = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.y1, dataArea, rangeEdge)));
				j2DY2 = ((float) (domainAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.x2, dataArea, domainEdge)));
				j2DX2 = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYLineAnnotation.this.y2, dataArea, rangeEdge)));
			}
		
		g2.setPaint(org.jfree.chart.annotations.XYLineAnnotation.this.paint);
		g2.setStroke(org.jfree.chart.annotations.XYLineAnnotation.this.stroke);
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Float(j2DX1, j2DY1, j2DX2, j2DY2);
		boolean visible = org.jfree.chart.util.ShapeUtilities.clipLine(line, dataArea);
		if (visible) {
			g2.draw(line);
		}
		java.lang.String toolTip = getToolTipText();
		java.lang.String url = getURL();
		if ((toolTip != null) || (url != null)) {
			addEntity(info, org.jfree.chart.util.ShapeUtilities.createLineRegion(line, 1.0F), rendererIndex, toolTip, url);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYLineAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYLineAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYLineAnnotation that = ((org.jfree.chart.annotations.XYLineAnnotation) (obj));
		if ((org.jfree.chart.annotations.XYLineAnnotation.this.x1) != (that.x1)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYLineAnnotation.this.y1) != (that.y1)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYLineAnnotation.this.x2) != (that.x2)) {
			return false;
		}
		if ((org.jfree.chart.annotations.XYLineAnnotation.this.y2) != (that.y2)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYLineAnnotation.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYLineAnnotation.this.stroke, that.stroke))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		long temp;
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYLineAnnotation.this.x1);
		result = ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYLineAnnotation.this.x2);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYLineAnnotation.this.y1);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYLineAnnotation.this.y2);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYLineAnnotation.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYLineAnnotation.this.stroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYLineAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYLineAnnotation.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}




package org.jfree.chart.annotations;


public class XYShapeAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8553218317600684041L;

	private transient java.awt.Shape shape;

	private transient java.awt.Stroke stroke;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Paint fillPaint;

	public XYShapeAnnotation(java.awt.Shape shape) {
		this(shape, new java.awt.BasicStroke(1.0F), java.awt.Color.black);
	}

	public XYShapeAnnotation(java.awt.Shape shape, java.awt.Stroke stroke, java.awt.Paint outlinePaint) {
		this(shape, stroke, outlinePaint, null);
	}

	public XYShapeAnnotation(java.awt.Shape shape, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Paint fillPaint) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.annotations.XYShapeAnnotation.this.shape = shape;
		org.jfree.chart.annotations.XYShapeAnnotation.this.stroke = stroke;
		org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint = outlinePaint;
		org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint = fillPaint;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		java.awt.geom.Rectangle2D bounds = org.jfree.chart.annotations.XYShapeAnnotation.this.shape.getBounds2D();
		double x0 = bounds.getMinX();
		double x1 = bounds.getMaxX();
		double xx0 = domainAxis.valueToJava2D(x0, dataArea, domainEdge);
		double xx1 = domainAxis.valueToJava2D(x1, dataArea, domainEdge);
		double m00 = (xx1 - xx0) / (x1 - x0);
		double m02 = xx0 - (x0 * m00);
		double y0 = bounds.getMaxY();
		double y1 = bounds.getMinY();
		double yy0 = rangeAxis.valueToJava2D(y0, dataArea, rangeEdge);
		double yy1 = rangeAxis.valueToJava2D(y1, dataArea, rangeEdge);
		double m11 = (yy1 - yy0) / (y1 - y0);
		double m12 = yy0 - (m11 * y0);
		java.awt.Shape s = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			java.awt.geom.AffineTransform t1 = new java.awt.geom.AffineTransform(0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
			java.awt.geom.AffineTransform t2 = new java.awt.geom.AffineTransform(m11, 0.0F, 0.0F, m00, m12, m02);
			s = t1.createTransformedShape(org.jfree.chart.annotations.XYShapeAnnotation.this.shape);
			s = t2.createTransformedShape(s);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				java.awt.geom.AffineTransform t = new java.awt.geom.AffineTransform(m00, 0, 0, m11, m02, m12);
				s = t.createTransformedShape(org.jfree.chart.annotations.XYShapeAnnotation.this.shape);
			}
		
		if ((org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint) != null) {
			g2.setPaint(org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint);
			g2.fill(s);
		}
		if (((org.jfree.chart.annotations.XYShapeAnnotation.this.stroke) != null) && ((org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint) != null)) {
			g2.setPaint(org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint);
			g2.setStroke(org.jfree.chart.annotations.XYShapeAnnotation.this.stroke);
			g2.draw(s);
		}
		addEntity(info, s, rendererIndex, getToolTipText(), getURL());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYShapeAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYShapeAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYShapeAnnotation that = ((org.jfree.chart.annotations.XYShapeAnnotation) (obj));
		if (!(org.jfree.chart.annotations.XYShapeAnnotation.this.shape.equals(that.shape))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYShapeAnnotation.this.stroke, that.stroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint, that.fillPaint))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.annotations.XYShapeAnnotation.this.shape.hashCode());
		if ((org.jfree.chart.annotations.XYShapeAnnotation.this.stroke) != null) {
			result = (37 * result) + (org.jfree.chart.annotations.XYShapeAnnotation.this.stroke.hashCode());
		}
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.annotations.XYShapeAnnotation.this.shape, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYShapeAnnotation.this.stroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYShapeAnnotation.this.shape = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.annotations.XYShapeAnnotation.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.annotations.XYShapeAnnotation.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYShapeAnnotation.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}




package org.jfree.chart.annotations;


public class XYBoxAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 6764703772526757457L;

	private double x0;

	private double y0;

	private double x1;

	private double y1;

	private transient java.awt.Stroke stroke;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Paint fillPaint;

	public XYBoxAnnotation(double x0, double y0, double x1, double y1) {
		this(x0, y0, x1, y1, new java.awt.BasicStroke(1.0F), java.awt.Color.black);
	}

	public XYBoxAnnotation(double x0, double y0, double x1, double y1, java.awt.Stroke stroke, java.awt.Paint outlinePaint) {
		this(x0, y0, x1, y1, stroke, outlinePaint, null);
	}

	public XYBoxAnnotation(double x0, double y0, double x1, double y1, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Paint fillPaint) {
		org.jfree.chart.annotations.XYBoxAnnotation.this.x0 = x0;
		org.jfree.chart.annotations.XYBoxAnnotation.this.y0 = y0;
		org.jfree.chart.annotations.XYBoxAnnotation.this.x1 = x1;
		org.jfree.chart.annotations.XYBoxAnnotation.this.y1 = y1;
		org.jfree.chart.annotations.XYBoxAnnotation.this.stroke = stroke;
		org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint = outlinePaint;
		org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint = fillPaint;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		double transX0 = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYBoxAnnotation.this.x0, dataArea, domainEdge);
		double transY0 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYBoxAnnotation.this.y0, dataArea, rangeEdge);
		double transX1 = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYBoxAnnotation.this.x1, dataArea, domainEdge);
		double transY1 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYBoxAnnotation.this.y1, dataArea, rangeEdge);
		java.awt.geom.Rectangle2D box = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			box = new java.awt.geom.Rectangle2D.Double(transY0, transX1, (transY1 - transY0), (transX0 - transX1));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				box = new java.awt.geom.Rectangle2D.Double(transX0, transY1, (transX1 - transX0), (transY0 - transY1));
			}
		
		if ((org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint) != null) {
			g2.setPaint(org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint);
			g2.fill(box);
		}
		if (((org.jfree.chart.annotations.XYBoxAnnotation.this.stroke) != null) && ((org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint) != null)) {
			g2.setPaint(org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint);
			g2.setStroke(org.jfree.chart.annotations.XYBoxAnnotation.this.stroke);
			g2.draw(box);
		}
		addEntity(info, box, rendererIndex, getToolTipText(), getURL());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYBoxAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYBoxAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYBoxAnnotation that = ((org.jfree.chart.annotations.XYBoxAnnotation) (obj));
		if (!((org.jfree.chart.annotations.XYBoxAnnotation.this.x0) == (that.x0))) {
			return false;
		}
		if (!((org.jfree.chart.annotations.XYBoxAnnotation.this.y0) == (that.y0))) {
			return false;
		}
		if (!((org.jfree.chart.annotations.XYBoxAnnotation.this.x1) == (that.x1))) {
			return false;
		}
		if (!((org.jfree.chart.annotations.XYBoxAnnotation.this.y1) == (that.y1))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYBoxAnnotation.this.stroke, that.stroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint, that.fillPaint))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		long temp;
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYBoxAnnotation.this.x0);
		result = ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYBoxAnnotation.this.x1);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYBoxAnnotation.this.y0);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.XYBoxAnnotation.this.y1);
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYBoxAnnotation.this.stroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYBoxAnnotation.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.annotations.XYBoxAnnotation.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYBoxAnnotation.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


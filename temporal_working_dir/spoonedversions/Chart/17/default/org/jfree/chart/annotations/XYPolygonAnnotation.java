

package org.jfree.chart.annotations;


public class XYPolygonAnnotation extends org.jfree.chart.annotations.AbstractXYAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -6984203651995900036L;

	private double[] polygon;

	private transient java.awt.Stroke stroke;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Paint fillPaint;

	public XYPolygonAnnotation(double[] polygon) {
		this(polygon, new java.awt.BasicStroke(1.0F), java.awt.Color.black);
	}

	public XYPolygonAnnotation(double[] polygon, java.awt.Stroke stroke, java.awt.Paint outlinePaint) {
		this(polygon, stroke, outlinePaint, null);
	}

	public XYPolygonAnnotation(double[] polygon, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Paint fillPaint) {
		if (polygon == null) {
			throw new java.lang.IllegalArgumentException("Null 'polygon' argument.");
		}
		if (((polygon.length) % 2) != 0) {
			throw new java.lang.IllegalArgumentException(("The 'polygon' array must " + "contain an even number of items."));
		}
		org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon = ((double[]) (polygon.clone()));
		org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke = stroke;
		org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint = outlinePaint;
		org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint = fillPaint;
	}

	public double[] getPolygonCoordinates() {
		return ((double[]) (org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon.clone()));
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		if ((org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon.length) < 4) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		java.awt.geom.GeneralPath area = new java.awt.geom.GeneralPath();
		double x = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[0], dataArea, domainEdge);
		double y = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[1], dataArea, rangeEdge);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			area.moveTo(((float) (y)), ((float) (x)));
			for (int i = 2; i < (org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon.length); i += 2) {
				x = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[i], dataArea, domainEdge);
				y = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[(i + 1)], dataArea, rangeEdge);
				area.lineTo(((float) (y)), ((float) (x)));
			}
			area.closePath();
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				area.moveTo(((float) (x)), ((float) (y)));
				for (int i = 2; i < (org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon.length); i += 2) {
					x = domainAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[i], dataArea, domainEdge);
					y = rangeAxis.valueToJava2D(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon[(i + 1)], dataArea, rangeEdge);
					area.lineTo(((float) (x)), ((float) (y)));
				}
				area.closePath();
			}
		
		if ((org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint) != null) {
			g2.setPaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint);
			g2.fill(area);
		}
		if (((org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke) != null) && ((org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint) != null)) {
			g2.setPaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint);
			g2.setStroke(org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke);
			g2.draw(area);
		}
		addEntity(info, area, rendererIndex, getToolTipText(), getURL());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.XYPolygonAnnotation.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.annotations.XYPolygonAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.XYPolygonAnnotation that = ((org.jfree.chart.annotations.XYPolygonAnnotation) (obj));
		if (!(java.util.Arrays.equals(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon, that.polygon))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke, that.stroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint, that.fillPaint))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForDoubleArray(org.jfree.chart.annotations.XYPolygonAnnotation.this.polygon));
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint));
		result = (37 * result) + (org.jfree.chart.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint));
		if ((org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke) != null) {
			result = (37 * result) + (org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke.hashCode());
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.XYPolygonAnnotation.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.annotations.XYPolygonAnnotation.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.XYPolygonAnnotation.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}


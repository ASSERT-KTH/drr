

package org.jfree.chart.annotations;


public class CategoryLineAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.annotations.CategoryAnnotation , org.jfree.chart.util.PublicCloneable {
	static final long serialVersionUID = 3477740483341587984L;

	private java.lang.Comparable category1;

	private double value1;

	private java.lang.Comparable category2;

	private double value2;

	private transient java.awt.Paint paint = java.awt.Color.black;

	private transient java.awt.Stroke stroke = new java.awt.BasicStroke(1.0F);

	public CategoryLineAnnotation(java.lang.Comparable category1, double value1, java.lang.Comparable category2, double value2, java.awt.Paint paint, java.awt.Stroke stroke) {
		if (category1 == null) {
			throw new java.lang.IllegalArgumentException("Null 'category1' argument.");
		}
		if (category2 == null) {
			throw new java.lang.IllegalArgumentException("Null 'category2' argument.");
		}
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.annotations.CategoryLineAnnotation.this.category1 = category1;
		org.jfree.chart.annotations.CategoryLineAnnotation.this.value1 = value1;
		org.jfree.chart.annotations.CategoryLineAnnotation.this.category2 = category2;
		org.jfree.chart.annotations.CategoryLineAnnotation.this.value2 = value2;
		org.jfree.chart.annotations.CategoryLineAnnotation.this.paint = paint;
		org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke = stroke;
	}

	public java.lang.Comparable getCategory1() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.category1;
	}

	public void setCategory1(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.annotations.CategoryLineAnnotation.this.category1 = category;
	}

	public double getValue1() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.value1;
	}

	public void setValue1(double value) {
		org.jfree.chart.annotations.CategoryLineAnnotation.this.value1 = value;
	}

	public java.lang.Comparable getCategory2() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.category2;
	}

	public void setCategory2(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.annotations.CategoryLineAnnotation.this.category2 = category;
	}

	public double getValue2() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.value2;
	}

	public void setValue2(double value) {
		org.jfree.chart.annotations.CategoryLineAnnotation.this.value2 = value;
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.annotations.CategoryLineAnnotation.this.paint = paint;
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke = stroke;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset();
		int catIndex1 = dataset.getColumnIndex(org.jfree.chart.annotations.CategoryLineAnnotation.this.category1);
		int catIndex2 = dataset.getColumnIndex(org.jfree.chart.annotations.CategoryLineAnnotation.this.category2);
		int catCount = dataset.getColumnCount();
		double lineX1 = 0.0F;
		double lineY1 = 0.0F;
		double lineX2 = 0.0F;
		double lineY2 = 0.0F;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			lineY1 = domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor.MIDDLE, catIndex1, catCount, dataArea, domainEdge);
			lineX1 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryLineAnnotation.this.value1, dataArea, rangeEdge);
			lineY2 = domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor.MIDDLE, catIndex2, catCount, dataArea, domainEdge);
			lineX2 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryLineAnnotation.this.value2, dataArea, rangeEdge);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				lineX1 = domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor.MIDDLE, catIndex1, catCount, dataArea, domainEdge);
				lineY1 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryLineAnnotation.this.value1, dataArea, rangeEdge);
				lineX2 = domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor.MIDDLE, catIndex2, catCount, dataArea, domainEdge);
				lineY2 = rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryLineAnnotation.this.value2, dataArea, rangeEdge);
			}
		
		g2.setPaint(org.jfree.chart.annotations.CategoryLineAnnotation.this.paint);
		g2.setStroke(org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke);
		g2.drawLine(((int) (lineX1)), ((int) (lineY1)), ((int) (lineX2)), ((int) (lineY2)));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.CategoryLineAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.CategoryLineAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.CategoryLineAnnotation that = ((org.jfree.chart.annotations.CategoryLineAnnotation) (obj));
		if (!(org.jfree.chart.annotations.CategoryLineAnnotation.this.category1.equals(that.getCategory1()))) {
			return false;
		}
		if ((org.jfree.chart.annotations.CategoryLineAnnotation.this.value1) != (that.getValue1())) {
			return false;
		}
		if (!(org.jfree.chart.annotations.CategoryLineAnnotation.this.category2.equals(that.getCategory2()))) {
			return false;
		}
		if ((org.jfree.chart.annotations.CategoryLineAnnotation.this.value2) != (that.getValue2())) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.annotations.CategoryLineAnnotation.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke, that.stroke))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.annotations.CategoryLineAnnotation.this.category1.hashCode());
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.CategoryLineAnnotation.this.value1);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.annotations.CategoryLineAnnotation.this.category2.hashCode());
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.CategoryLineAnnotation.this.value2);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		result = (37 * result) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(org.jfree.chart.annotations.CategoryLineAnnotation.this.paint));
		result = (37 * result) + (org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.annotations.CategoryLineAnnotation.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.CategoryLineAnnotation.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.annotations.CategoryLineAnnotation.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}
}


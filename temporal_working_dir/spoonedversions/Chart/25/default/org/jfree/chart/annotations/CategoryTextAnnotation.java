

package org.jfree.chart.annotations;


public class CategoryTextAnnotation extends org.jfree.chart.annotations.TextAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.annotations.CategoryAnnotation {
	private static final long serialVersionUID = 3333360090781320147L;

	private java.lang.Comparable category;

	private org.jfree.chart.axis.CategoryAnchor categoryAnchor;

	private double value;

	public CategoryTextAnnotation(java.lang.String text, java.lang.Comparable category, double value) {
		super(text);
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.annotations.CategoryTextAnnotation.this.category = category;
		org.jfree.chart.annotations.CategoryTextAnnotation.this.value = value;
		org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor = org.jfree.chart.axis.CategoryAnchor.MIDDLE;
	}

	public java.lang.Comparable getCategory() {
		return org.jfree.chart.annotations.CategoryTextAnnotation.this.category;
	}

	public void setCategory(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.annotations.CategoryTextAnnotation.this.category = category;
	}

	public org.jfree.chart.axis.CategoryAnchor getCategoryAnchor() {
		return org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor;
	}

	public void setCategoryAnchor(org.jfree.chart.axis.CategoryAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor = anchor;
	}

	public double getValue() {
		return org.jfree.chart.annotations.CategoryTextAnnotation.this.value;
	}

	public void setValue(double value) {
		org.jfree.chart.annotations.CategoryTextAnnotation.this.value = value;
	}

	public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset();
		int catIndex = dataset.getColumnIndex(org.jfree.chart.annotations.CategoryTextAnnotation.this.category);
		int catCount = dataset.getColumnCount();
		float anchorX = 0.0F;
		float anchorY = 0.0F;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(plot.getDomainAxisLocation(), orientation);
		org.jfree.chart.util.RectangleEdge rangeEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(plot.getRangeAxisLocation(), orientation);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			anchorY = ((float) (domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor, catIndex, catCount, dataArea, domainEdge)));
			anchorX = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryTextAnnotation.this.value, dataArea, rangeEdge)));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				anchorX = ((float) (domainAxis.getCategoryJava2DCoordinate(org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor, catIndex, catCount, dataArea, domainEdge)));
				anchorY = ((float) (rangeAxis.valueToJava2D(org.jfree.chart.annotations.CategoryTextAnnotation.this.value, dataArea, rangeEdge)));
			}
		
		g2.setFont(getFont());
		g2.setPaint(getPaint());
		org.jfree.chart.text.TextUtilities.drawRotatedString(getText(), g2, anchorX, anchorY, getTextAnchor(), getRotationAngle(), getRotationAnchor());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.CategoryTextAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.CategoryTextAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.CategoryTextAnnotation that = ((org.jfree.chart.annotations.CategoryTextAnnotation) (obj));
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.CategoryTextAnnotation.this.category.equals(that.getCategory()))) {
			return false;
		}
		if (!(org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor.equals(that.getCategoryAnchor()))) {
			return false;
		}
		if ((org.jfree.chart.annotations.CategoryTextAnnotation.this.value) != (that.getValue())) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = (37 * result) + (org.jfree.chart.annotations.CategoryTextAnnotation.this.category.hashCode());
		result = (37 * result) + (org.jfree.chart.annotations.CategoryTextAnnotation.this.categoryAnchor.hashCode());
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.annotations.CategoryTextAnnotation.this.value);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}


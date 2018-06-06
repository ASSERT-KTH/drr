

package org.jfree.chart.axis;


public class CategoryLabelPosition implements java.io.Serializable {
	private static final long serialVersionUID = 5168681143844183864L;

	private org.jfree.chart.util.RectangleAnchor categoryAnchor;

	private org.jfree.chart.text.TextBlockAnchor labelAnchor;

	private org.jfree.chart.text.TextAnchor rotationAnchor;

	private double angle;

	private org.jfree.chart.axis.CategoryLabelWidthType widthType;

	private float widthRatio;

	public CategoryLabelPosition() {
		this(org.jfree.chart.util.RectangleAnchor.CENTER, org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0, org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.95F);
	}

	public CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor categoryAnchor, org.jfree.chart.text.TextBlockAnchor labelAnchor) {
		this(categoryAnchor, labelAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0, org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.95F);
	}

	public CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor categoryAnchor, org.jfree.chart.text.TextBlockAnchor labelAnchor, org.jfree.chart.axis.CategoryLabelWidthType widthType, float widthRatio) {
		this(categoryAnchor, labelAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0, widthType, widthRatio);
	}

	public CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor categoryAnchor, org.jfree.chart.text.TextBlockAnchor labelAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle, org.jfree.chart.axis.CategoryLabelWidthType widthType, float widthRatio) {
		if (categoryAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'categoryAnchor' argument.");
		}
		if (labelAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelAnchor' argument.");
		}
		if (rotationAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'rotationAnchor' argument.");
		}
		if (widthType == null) {
			throw new java.lang.IllegalArgumentException("Null 'widthType' argument.");
		}
		org.jfree.chart.axis.CategoryLabelPosition.this.categoryAnchor = categoryAnchor;
		org.jfree.chart.axis.CategoryLabelPosition.this.labelAnchor = labelAnchor;
		org.jfree.chart.axis.CategoryLabelPosition.this.rotationAnchor = rotationAnchor;
		org.jfree.chart.axis.CategoryLabelPosition.this.angle = angle;
		org.jfree.chart.axis.CategoryLabelPosition.this.widthType = widthType;
		org.jfree.chart.axis.CategoryLabelPosition.this.widthRatio = widthRatio;
	}

	public org.jfree.chart.util.RectangleAnchor getCategoryAnchor() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.categoryAnchor;
	}

	public org.jfree.chart.text.TextBlockAnchor getLabelAnchor() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.labelAnchor;
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.rotationAnchor;
	}

	public double getAngle() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.angle;
	}

	public org.jfree.chart.axis.CategoryLabelWidthType getWidthType() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.widthType;
	}

	public float getWidthRatio() {
		return org.jfree.chart.axis.CategoryLabelPosition.this.widthRatio;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.CategoryLabelPosition.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CategoryLabelPosition)) {
			return false;
		}
		org.jfree.chart.axis.CategoryLabelPosition that = ((org.jfree.chart.axis.CategoryLabelPosition) (obj));
		if (!(org.jfree.chart.axis.CategoryLabelPosition.this.categoryAnchor.equals(that.categoryAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.axis.CategoryLabelPosition.this.labelAnchor.equals(that.labelAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.axis.CategoryLabelPosition.this.rotationAnchor.equals(that.rotationAnchor))) {
			return false;
		}
		if ((org.jfree.chart.axis.CategoryLabelPosition.this.angle) != (that.angle)) {
			return false;
		}
		if ((org.jfree.chart.axis.CategoryLabelPosition.this.widthType) != (that.widthType)) {
			return false;
		}
		if ((org.jfree.chart.axis.CategoryLabelPosition.this.widthRatio) != (that.widthRatio)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 19;
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPosition.this.categoryAnchor.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPosition.this.labelAnchor.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPosition.this.rotationAnchor.hashCode());
		return result;
	}
}


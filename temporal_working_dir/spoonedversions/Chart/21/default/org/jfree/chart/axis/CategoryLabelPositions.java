

package org.jfree.chart.axis;


public class CategoryLabelPositions implements java.io.Serializable {
	private static final long serialVersionUID = -8999557901920364580L;

	public static final org.jfree.chart.axis.CategoryLabelPositions STANDARD = new org.jfree.chart.axis.CategoryLabelPositions(new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.BOTTOM, org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.TOP, org.jfree.chart.text.TextBlockAnchor.TOP_CENTER), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.RIGHT, org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.LEFT, org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F));

	public static final org.jfree.chart.axis.CategoryLabelPositions UP_90 = new org.jfree.chart.axis.CategoryLabelPositions(new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.BOTTOM, org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT, org.jfree.chart.text.TextAnchor.CENTER_LEFT, ((-(java.lang.Math.PI)) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.TOP, org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT, org.jfree.chart.text.TextAnchor.CENTER_RIGHT, ((-(java.lang.Math.PI)) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.RIGHT, org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER, org.jfree.chart.text.TextAnchor.BOTTOM_CENTER, ((-(java.lang.Math.PI)) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.9F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.LEFT, org.jfree.chart.text.TextBlockAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.TOP_CENTER, ((-(java.lang.Math.PI)) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.9F));

	public static final org.jfree.chart.axis.CategoryLabelPositions DOWN_90 = new org.jfree.chart.axis.CategoryLabelPositions(new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.BOTTOM, org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT, org.jfree.chart.text.TextAnchor.CENTER_RIGHT, ((java.lang.Math.PI) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.TOP, org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT, org.jfree.chart.text.TextAnchor.CENTER_LEFT, ((java.lang.Math.PI) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.3F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.RIGHT, org.jfree.chart.text.TextBlockAnchor.TOP_CENTER, org.jfree.chart.text.TextAnchor.TOP_CENTER, ((java.lang.Math.PI) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.9F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.LEFT, org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER, org.jfree.chart.text.TextAnchor.BOTTOM_CENTER, ((java.lang.Math.PI) / 2.0), org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY, 0.9F));

	public static final org.jfree.chart.axis.CategoryLabelPositions UP_45 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(((java.lang.Math.PI) / 4.0));

	public static final org.jfree.chart.axis.CategoryLabelPositions DOWN_45 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions(((java.lang.Math.PI) / 4.0));

	public static org.jfree.chart.axis.CategoryLabelPositions createUpRotationLabelPositions(double angle) {
		return new org.jfree.chart.axis.CategoryLabelPositions(new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.BOTTOM, org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT, org.jfree.chart.text.TextAnchor.BOTTOM_LEFT, (-angle), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.TOP, org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT, org.jfree.chart.text.TextAnchor.TOP_RIGHT, (-angle), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.RIGHT, org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT, org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT, (-angle), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.LEFT, org.jfree.chart.text.TextBlockAnchor.TOP_LEFT, org.jfree.chart.text.TextAnchor.TOP_LEFT, (-angle), org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F));
	}

	public static org.jfree.chart.axis.CategoryLabelPositions createDownRotationLabelPositions(double angle) {
		return new org.jfree.chart.axis.CategoryLabelPositions(new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.BOTTOM, org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT, org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT, angle, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.TOP, org.jfree.chart.text.TextBlockAnchor.TOP_LEFT, org.jfree.chart.text.TextAnchor.TOP_LEFT, angle, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.RIGHT, org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT, org.jfree.chart.text.TextAnchor.TOP_RIGHT, angle, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F), new org.jfree.chart.axis.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor.LEFT, org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT, org.jfree.chart.text.TextAnchor.BOTTOM_LEFT, angle, org.jfree.chart.axis.CategoryLabelWidthType.RANGE, 0.5F));
	}

	private org.jfree.chart.axis.CategoryLabelPosition positionForAxisAtTop;

	private org.jfree.chart.axis.CategoryLabelPosition positionForAxisAtBottom;

	private org.jfree.chart.axis.CategoryLabelPosition positionForAxisAtLeft;

	private org.jfree.chart.axis.CategoryLabelPosition positionForAxisAtRight;

	public CategoryLabelPositions() {
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtTop = new org.jfree.chart.axis.CategoryLabelPosition();
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtBottom = new org.jfree.chart.axis.CategoryLabelPosition();
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtLeft = new org.jfree.chart.axis.CategoryLabelPosition();
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtRight = new org.jfree.chart.axis.CategoryLabelPosition();
	}

	public CategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPosition top, org.jfree.chart.axis.CategoryLabelPosition bottom, org.jfree.chart.axis.CategoryLabelPosition left, org.jfree.chart.axis.CategoryLabelPosition right) {
		if (top == null) {
			throw new java.lang.IllegalArgumentException("Null 'top' argument.");
		}
		if (bottom == null) {
			throw new java.lang.IllegalArgumentException("Null 'bottom' argument.");
		}
		if (left == null) {
			throw new java.lang.IllegalArgumentException("Null 'left' argument.");
		}
		if (right == null) {
			throw new java.lang.IllegalArgumentException("Null 'right' argument.");
		}
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtTop = top;
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtBottom = bottom;
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtLeft = left;
		org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtRight = right;
	}

	public org.jfree.chart.axis.CategoryLabelPosition getLabelPosition(org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.chart.axis.CategoryLabelPosition result = null;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result = org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtTop;
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtBottom;
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					result = org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtLeft;
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result = org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtRight;
					}
				
			
		
		return result;
	}

	public static org.jfree.chart.axis.CategoryLabelPositions replaceTopPosition(org.jfree.chart.axis.CategoryLabelPositions base, org.jfree.chart.axis.CategoryLabelPosition top) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		if (top == null) {
			throw new java.lang.IllegalArgumentException("Null 'top' argument.");
		}
		return new org.jfree.chart.axis.CategoryLabelPositions(top, base.getLabelPosition(org.jfree.chart.util.RectangleEdge.BOTTOM), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.LEFT), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.RIGHT));
	}

	public static org.jfree.chart.axis.CategoryLabelPositions replaceBottomPosition(org.jfree.chart.axis.CategoryLabelPositions base, org.jfree.chart.axis.CategoryLabelPosition bottom) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		if (bottom == null) {
			throw new java.lang.IllegalArgumentException("Null 'bottom' argument.");
		}
		return new org.jfree.chart.axis.CategoryLabelPositions(base.getLabelPosition(org.jfree.chart.util.RectangleEdge.TOP), bottom, base.getLabelPosition(org.jfree.chart.util.RectangleEdge.LEFT), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.RIGHT));
	}

	public static org.jfree.chart.axis.CategoryLabelPositions replaceLeftPosition(org.jfree.chart.axis.CategoryLabelPositions base, org.jfree.chart.axis.CategoryLabelPosition left) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		if (left == null) {
			throw new java.lang.IllegalArgumentException("Null 'left' argument.");
		}
		return new org.jfree.chart.axis.CategoryLabelPositions(base.getLabelPosition(org.jfree.chart.util.RectangleEdge.TOP), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.BOTTOM), left, base.getLabelPosition(org.jfree.chart.util.RectangleEdge.RIGHT));
	}

	public static org.jfree.chart.axis.CategoryLabelPositions replaceRightPosition(org.jfree.chart.axis.CategoryLabelPositions base, org.jfree.chart.axis.CategoryLabelPosition right) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		if (right == null) {
			throw new java.lang.IllegalArgumentException("Null 'right' argument.");
		}
		return new org.jfree.chart.axis.CategoryLabelPositions(base.getLabelPosition(org.jfree.chart.util.RectangleEdge.TOP), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.BOTTOM), base.getLabelPosition(org.jfree.chart.util.RectangleEdge.LEFT), right);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.CategoryLabelPositions.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CategoryLabelPositions)) {
			return false;
		}
		org.jfree.chart.axis.CategoryLabelPositions that = ((org.jfree.chart.axis.CategoryLabelPositions) (obj));
		if (!(org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtTop.equals(that.positionForAxisAtTop))) {
			return false;
		}
		if (!(org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtBottom.equals(that.positionForAxisAtBottom))) {
			return false;
		}
		if (!(org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtLeft.equals(that.positionForAxisAtLeft))) {
			return false;
		}
		if (!(org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtRight.equals(that.positionForAxisAtRight))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 19;
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtTop.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtBottom.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtLeft.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryLabelPositions.this.positionForAxisAtRight.hashCode());
		return result;
	}
}


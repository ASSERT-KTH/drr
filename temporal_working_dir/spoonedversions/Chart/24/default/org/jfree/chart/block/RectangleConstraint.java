

package org.jfree.chart.block;


public class RectangleConstraint {
	public static final org.jfree.chart.block.RectangleConstraint NONE = new org.jfree.chart.block.RectangleConstraint(0.0, null, org.jfree.chart.block.LengthConstraintType.NONE, 0.0, null, org.jfree.chart.block.LengthConstraintType.NONE);

	private double width;

	private org.jfree.data.Range widthRange;

	private org.jfree.chart.block.LengthConstraintType widthConstraintType;

	private double height;

	private org.jfree.data.Range heightRange;

	private org.jfree.chart.block.LengthConstraintType heightConstraintType;

	public RectangleConstraint(double w, double h) {
		this(w, null, org.jfree.chart.block.LengthConstraintType.FIXED, h, null, org.jfree.chart.block.LengthConstraintType.FIXED);
	}

	public RectangleConstraint(org.jfree.data.Range w, org.jfree.data.Range h) {
		this(0.0, w, org.jfree.chart.block.LengthConstraintType.RANGE, 0.0, h, org.jfree.chart.block.LengthConstraintType.RANGE);
	}

	public RectangleConstraint(org.jfree.data.Range w, double h) {
		this(0.0, w, org.jfree.chart.block.LengthConstraintType.RANGE, h, null, org.jfree.chart.block.LengthConstraintType.FIXED);
	}

	public RectangleConstraint(double w, org.jfree.data.Range h) {
		this(w, null, org.jfree.chart.block.LengthConstraintType.FIXED, 0.0, h, org.jfree.chart.block.LengthConstraintType.RANGE);
	}

	public RectangleConstraint(double w, org.jfree.data.Range widthRange, org.jfree.chart.block.LengthConstraintType widthConstraintType, double h, org.jfree.data.Range heightRange, org.jfree.chart.block.LengthConstraintType heightConstraintType) {
		if (widthConstraintType == null) {
			throw new java.lang.IllegalArgumentException("Null 'widthType' argument.");
		}
		if (heightConstraintType == null) {
			throw new java.lang.IllegalArgumentException("Null 'heightType' argument.");
		}
		org.jfree.chart.block.RectangleConstraint.this.width = w;
		org.jfree.chart.block.RectangleConstraint.this.widthRange = widthRange;
		org.jfree.chart.block.RectangleConstraint.this.widthConstraintType = widthConstraintType;
		org.jfree.chart.block.RectangleConstraint.this.height = h;
		org.jfree.chart.block.RectangleConstraint.this.heightRange = heightRange;
		org.jfree.chart.block.RectangleConstraint.this.heightConstraintType = heightConstraintType;
	}

	public double getWidth() {
		return org.jfree.chart.block.RectangleConstraint.this.width;
	}

	public org.jfree.data.Range getWidthRange() {
		return org.jfree.chart.block.RectangleConstraint.this.widthRange;
	}

	public org.jfree.chart.block.LengthConstraintType getWidthConstraintType() {
		return org.jfree.chart.block.RectangleConstraint.this.widthConstraintType;
	}

	public double getHeight() {
		return org.jfree.chart.block.RectangleConstraint.this.height;
	}

	public org.jfree.data.Range getHeightRange() {
		return org.jfree.chart.block.RectangleConstraint.this.heightRange;
	}

	public org.jfree.chart.block.LengthConstraintType getHeightConstraintType() {
		return org.jfree.chart.block.RectangleConstraint.this.heightConstraintType;
	}

	public org.jfree.chart.block.RectangleConstraint toUnconstrainedWidth() {
		if ((org.jfree.chart.block.RectangleConstraint.this.widthConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			return org.jfree.chart.block.RectangleConstraint.this;
		}else {
			return new org.jfree.chart.block.RectangleConstraint(org.jfree.chart.block.RectangleConstraint.this.width, org.jfree.chart.block.RectangleConstraint.this.widthRange, org.jfree.chart.block.LengthConstraintType.NONE, org.jfree.chart.block.RectangleConstraint.this.height, org.jfree.chart.block.RectangleConstraint.this.heightRange, org.jfree.chart.block.RectangleConstraint.this.heightConstraintType);
		}
	}

	public org.jfree.chart.block.RectangleConstraint toUnconstrainedHeight() {
		if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			return org.jfree.chart.block.RectangleConstraint.this;
		}else {
			return new org.jfree.chart.block.RectangleConstraint(org.jfree.chart.block.RectangleConstraint.this.width, org.jfree.chart.block.RectangleConstraint.this.widthRange, org.jfree.chart.block.RectangleConstraint.this.widthConstraintType, 0.0, org.jfree.chart.block.RectangleConstraint.this.heightRange, org.jfree.chart.block.LengthConstraintType.NONE);
		}
	}

	public org.jfree.chart.block.RectangleConstraint toFixedWidth(double width) {
		return new org.jfree.chart.block.RectangleConstraint(width, org.jfree.chart.block.RectangleConstraint.this.widthRange, org.jfree.chart.block.LengthConstraintType.FIXED, org.jfree.chart.block.RectangleConstraint.this.height, org.jfree.chart.block.RectangleConstraint.this.heightRange, org.jfree.chart.block.RectangleConstraint.this.heightConstraintType);
	}

	public org.jfree.chart.block.RectangleConstraint toFixedHeight(double height) {
		return new org.jfree.chart.block.RectangleConstraint(org.jfree.chart.block.RectangleConstraint.this.width, org.jfree.chart.block.RectangleConstraint.this.widthRange, org.jfree.chart.block.RectangleConstraint.this.widthConstraintType, height, org.jfree.chart.block.RectangleConstraint.this.heightRange, org.jfree.chart.block.LengthConstraintType.FIXED);
	}

	public org.jfree.chart.block.RectangleConstraint toRangeWidth(org.jfree.data.Range range) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		return new org.jfree.chart.block.RectangleConstraint(range.getUpperBound(), range, org.jfree.chart.block.LengthConstraintType.RANGE, org.jfree.chart.block.RectangleConstraint.this.height, org.jfree.chart.block.RectangleConstraint.this.heightRange, org.jfree.chart.block.RectangleConstraint.this.heightConstraintType);
	}

	public org.jfree.chart.block.RectangleConstraint toRangeHeight(org.jfree.data.Range range) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		return new org.jfree.chart.block.RectangleConstraint(org.jfree.chart.block.RectangleConstraint.this.width, org.jfree.chart.block.RectangleConstraint.this.widthRange, org.jfree.chart.block.RectangleConstraint.this.widthConstraintType, range.getUpperBound(), range, org.jfree.chart.block.LengthConstraintType.RANGE);
	}

	public java.lang.String toString() {
		return ((((("RectangleConstraint[" + (org.jfree.chart.block.RectangleConstraint.this.widthConstraintType.toString())) + ": width=") + (org.jfree.chart.block.RectangleConstraint.this.width)) + ", height=") + (org.jfree.chart.block.RectangleConstraint.this.height)) + "]";
	}

	public org.jfree.chart.util.Size2D calculateConstrainedSize(org.jfree.chart.util.Size2D base) {
		org.jfree.chart.util.Size2D result = new org.jfree.chart.util.Size2D();
		if ((org.jfree.chart.block.RectangleConstraint.this.widthConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			result.width = base.width;
			if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
				result.height = base.height;
			}else
				if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					result.height = org.jfree.chart.block.RectangleConstraint.this.heightRange.constrain(base.height);
				}else
					if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						result.height = org.jfree.chart.block.RectangleConstraint.this.height;
					}
				
			
		}else
			if ((org.jfree.chart.block.RectangleConstraint.this.widthConstraintType) == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
				result.width = org.jfree.chart.block.RectangleConstraint.this.widthRange.constrain(base.width);
				if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
					result.height = base.height;
				}else
					if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
						result.height = org.jfree.chart.block.RectangleConstraint.this.heightRange.constrain(base.height);
					}else
						if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							result.height = org.jfree.chart.block.RectangleConstraint.this.height;
						}
					
				
			}else
				if ((org.jfree.chart.block.RectangleConstraint.this.widthConstraintType) == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
					result.width = org.jfree.chart.block.RectangleConstraint.this.width;
					if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						result.height = base.height;
					}else
						if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							result.height = org.jfree.chart.block.RectangleConstraint.this.heightRange.constrain(base.height);
						}else
							if ((org.jfree.chart.block.RectangleConstraint.this.heightConstraintType) == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
								result.height = org.jfree.chart.block.RectangleConstraint.this.height;
							}
						
					
				}
			
		
		return result;
	}
}


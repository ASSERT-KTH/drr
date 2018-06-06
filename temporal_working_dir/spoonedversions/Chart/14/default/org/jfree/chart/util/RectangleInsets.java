

package org.jfree.chart.util;


public class RectangleInsets implements java.io.Serializable {
	private static final long serialVersionUID = 1902273207559319996L;

	public static final org.jfree.chart.util.RectangleInsets ZERO_INSETS = new org.jfree.chart.util.RectangleInsets(org.jfree.chart.util.UnitType.ABSOLUTE, 0.0, 0.0, 0.0, 0.0);

	private org.jfree.chart.util.UnitType unitType;

	private double top;

	private double left;

	private double bottom;

	private double right;

	public RectangleInsets() {
		this(1.0, 1.0, 1.0, 1.0);
	}

	public RectangleInsets(double top, double left, double bottom, double right) {
		this(org.jfree.chart.util.UnitType.ABSOLUTE, top, left, bottom, right);
	}

	public RectangleInsets(org.jfree.chart.util.UnitType unitType, double top, double left, double bottom, double right) {
		if (unitType == null) {
			throw new java.lang.IllegalArgumentException("Null 'unitType' argument.");
		}
		org.jfree.chart.util.RectangleInsets.this.unitType = unitType;
		org.jfree.chart.util.RectangleInsets.this.top = top;
		org.jfree.chart.util.RectangleInsets.this.bottom = bottom;
		org.jfree.chart.util.RectangleInsets.this.left = left;
		org.jfree.chart.util.RectangleInsets.this.right = right;
	}

	public org.jfree.chart.util.UnitType getUnitType() {
		return org.jfree.chart.util.RectangleInsets.this.unitType;
	}

	public double getTop() {
		return org.jfree.chart.util.RectangleInsets.this.top;
	}

	public double getBottom() {
		return org.jfree.chart.util.RectangleInsets.this.bottom;
	}

	public double getLeft() {
		return org.jfree.chart.util.RectangleInsets.this.left;
	}

	public double getRight() {
		return org.jfree.chart.util.RectangleInsets.this.right;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.RectangleInsets.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.RectangleInsets)) {
			return false;
		}
		final org.jfree.chart.util.RectangleInsets that = ((org.jfree.chart.util.RectangleInsets) (obj));
		if ((that.unitType) != (org.jfree.chart.util.RectangleInsets.this.unitType)) {
			return false;
		}
		if ((org.jfree.chart.util.RectangleInsets.this.left) != (that.left)) {
			return false;
		}
		if ((org.jfree.chart.util.RectangleInsets.this.right) != (that.right)) {
			return false;
		}
		if ((org.jfree.chart.util.RectangleInsets.this.top) != (that.top)) {
			return false;
		}
		if ((org.jfree.chart.util.RectangleInsets.this.bottom) != (that.bottom)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		long temp;
		result = ((org.jfree.chart.util.RectangleInsets.this.unitType) != null) ? org.jfree.chart.util.RectangleInsets.this.unitType.hashCode() : 0;
		temp = ((org.jfree.chart.util.RectangleInsets.this.top) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.util.RectangleInsets.this.top) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = ((org.jfree.chart.util.RectangleInsets.this.bottom) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.util.RectangleInsets.this.bottom) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = ((org.jfree.chart.util.RectangleInsets.this.left) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.util.RectangleInsets.this.left) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = ((org.jfree.chart.util.RectangleInsets.this.right) != (+0.0)) ? java.lang.Double.doubleToLongBits(org.jfree.chart.util.RectangleInsets.this.right) : 0L;
		result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.String toString() {
		return ((((((("RectangleInsets[t=" + (org.jfree.chart.util.RectangleInsets.this.top)) + ",l=") + (org.jfree.chart.util.RectangleInsets.this.left)) + ",b=") + (org.jfree.chart.util.RectangleInsets.this.bottom)) + ",r=") + (org.jfree.chart.util.RectangleInsets.this.right)) + "]";
	}

	public java.awt.geom.Rectangle2D createAdjustedRectangle(java.awt.geom.Rectangle2D base, org.jfree.chart.util.LengthAdjustmentType horizontal, org.jfree.chart.util.LengthAdjustmentType vertical) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		double x = base.getX();
		double y = base.getY();
		double w = base.getWidth();
		double h = base.getHeight();
		if (horizontal == (org.jfree.chart.util.LengthAdjustmentType.EXPAND)) {
			double leftOutset = calculateLeftOutset(w);
			x = x - leftOutset;
			w = (w + leftOutset) + (calculateRightOutset(w));
		}else
			if (horizontal == (org.jfree.chart.util.LengthAdjustmentType.CONTRACT)) {
				double leftMargin = calculateLeftInset(w);
				x = x + leftMargin;
				w = (w - leftMargin) - (calculateRightInset(w));
			}
		
		if (vertical == (org.jfree.chart.util.LengthAdjustmentType.EXPAND)) {
			double topMargin = calculateTopOutset(h);
			y = y - topMargin;
			h = (h + topMargin) + (calculateBottomOutset(h));
		}else
			if (vertical == (org.jfree.chart.util.LengthAdjustmentType.CONTRACT)) {
				double topMargin = calculateTopInset(h);
				y = y + topMargin;
				h = (h - topMargin) - (calculateBottomInset(h));
			}
		
		return new java.awt.geom.Rectangle2D.Double(x, y, w, h);
	}

	public java.awt.geom.Rectangle2D createInsetRectangle(java.awt.geom.Rectangle2D base) {
		return createInsetRectangle(base, true, true);
	}

	public java.awt.geom.Rectangle2D createInsetRectangle(java.awt.geom.Rectangle2D base, boolean horizontal, boolean vertical) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		double topMargin = 0.0;
		double bottomMargin = 0.0;
		if (vertical) {
			topMargin = calculateTopInset(base.getHeight());
			bottomMargin = calculateBottomInset(base.getHeight());
		}
		double leftMargin = 0.0;
		double rightMargin = 0.0;
		if (horizontal) {
			leftMargin = calculateLeftInset(base.getWidth());
			rightMargin = calculateRightInset(base.getWidth());
		}
		return new java.awt.geom.Rectangle2D.Double(((base.getX()) + leftMargin), ((base.getY()) + topMargin), (((base.getWidth()) - leftMargin) - rightMargin), (((base.getHeight()) - topMargin) - bottomMargin));
	}

	public java.awt.geom.Rectangle2D createOutsetRectangle(java.awt.geom.Rectangle2D base) {
		return createOutsetRectangle(base, true, true);
	}

	public java.awt.geom.Rectangle2D createOutsetRectangle(java.awt.geom.Rectangle2D base, boolean horizontal, boolean vertical) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Null 'base' argument.");
		}
		double topMargin = 0.0;
		double bottomMargin = 0.0;
		if (vertical) {
			topMargin = calculateTopOutset(base.getHeight());
			bottomMargin = calculateBottomOutset(base.getHeight());
		}
		double leftMargin = 0.0;
		double rightMargin = 0.0;
		if (horizontal) {
			leftMargin = calculateLeftOutset(base.getWidth());
			rightMargin = calculateRightOutset(base.getWidth());
		}
		return new java.awt.geom.Rectangle2D.Double(((base.getX()) - leftMargin), ((base.getY()) - topMargin), (((base.getWidth()) + leftMargin) + rightMargin), (((base.getHeight()) + topMargin) + bottomMargin));
	}

	public double calculateTopInset(double height) {
		double result = org.jfree.chart.util.RectangleInsets.this.top;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (org.jfree.chart.util.RectangleInsets.this.top) * height;
		}
		return result;
	}

	public double calculateTopOutset(double height) {
		double result = org.jfree.chart.util.RectangleInsets.this.top;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (height / ((1 - (org.jfree.chart.util.RectangleInsets.this.top)) - (org.jfree.chart.util.RectangleInsets.this.bottom))) * (org.jfree.chart.util.RectangleInsets.this.top);
		}
		return result;
	}

	public double calculateBottomInset(double height) {
		double result = org.jfree.chart.util.RectangleInsets.this.bottom;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (org.jfree.chart.util.RectangleInsets.this.bottom) * height;
		}
		return result;
	}

	public double calculateBottomOutset(double height) {
		double result = org.jfree.chart.util.RectangleInsets.this.bottom;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (height / ((1 - (org.jfree.chart.util.RectangleInsets.this.top)) - (org.jfree.chart.util.RectangleInsets.this.bottom))) * (org.jfree.chart.util.RectangleInsets.this.bottom);
		}
		return result;
	}

	public double calculateLeftInset(double width) {
		double result = org.jfree.chart.util.RectangleInsets.this.left;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (org.jfree.chart.util.RectangleInsets.this.left) * width;
		}
		return result;
	}

	public double calculateLeftOutset(double width) {
		double result = org.jfree.chart.util.RectangleInsets.this.left;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (width / ((1 - (org.jfree.chart.util.RectangleInsets.this.left)) - (org.jfree.chart.util.RectangleInsets.this.right))) * (org.jfree.chart.util.RectangleInsets.this.left);
		}
		return result;
	}

	public double calculateRightInset(double width) {
		double result = org.jfree.chart.util.RectangleInsets.this.right;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (org.jfree.chart.util.RectangleInsets.this.right) * width;
		}
		return result;
	}

	public double calculateRightOutset(double width) {
		double result = org.jfree.chart.util.RectangleInsets.this.right;
		if ((org.jfree.chart.util.RectangleInsets.this.unitType) == (org.jfree.chart.util.UnitType.RELATIVE)) {
			result = (width / ((1 - (org.jfree.chart.util.RectangleInsets.this.left)) - (org.jfree.chart.util.RectangleInsets.this.right))) * (org.jfree.chart.util.RectangleInsets.this.right);
		}
		return result;
	}

	public double trimWidth(double width) {
		return (width - (calculateLeftInset(width))) - (calculateRightInset(width));
	}

	public double extendWidth(double width) {
		return (width + (calculateLeftOutset(width))) + (calculateRightOutset(width));
	}

	public double trimHeight(double height) {
		return (height - (calculateTopInset(height))) - (calculateBottomInset(height));
	}

	public double extendHeight(double height) {
		return (height + (calculateTopOutset(height))) + (calculateBottomOutset(height));
	}

	public void trim(java.awt.geom.Rectangle2D area) {
		double w = area.getWidth();
		double h = area.getHeight();
		double l = calculateLeftInset(w);
		double r = calculateRightInset(w);
		double t = calculateTopInset(h);
		double b = calculateBottomInset(h);
		area.setRect(((area.getX()) + l), ((area.getY()) + t), ((w - l) - r), ((h - t) - b));
	}
}


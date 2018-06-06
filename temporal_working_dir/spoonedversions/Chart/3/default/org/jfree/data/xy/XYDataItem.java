

package org.jfree.data.xy;


public class XYDataItem implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable {
	private static final long serialVersionUID = 2751513470325494890L;

	private java.lang.Number x;

	private java.lang.Number y;

	private boolean selected;

	public XYDataItem(java.lang.Number x, java.lang.Number y) {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("Null 'x' argument.");
		}
		org.jfree.data.xy.XYDataItem.this.x = x;
		org.jfree.data.xy.XYDataItem.this.y = y;
		org.jfree.data.xy.XYDataItem.this.selected = false;
	}

	public XYDataItem(double x, double y) {
		this(new java.lang.Double(x), new java.lang.Double(y));
	}

	public java.lang.Number getX() {
		return org.jfree.data.xy.XYDataItem.this.x;
	}

	public double getXValue() {
		return org.jfree.data.xy.XYDataItem.this.x.doubleValue();
	}

	public java.lang.Number getY() {
		return org.jfree.data.xy.XYDataItem.this.y;
	}

	public double getYValue() {
		double result = java.lang.Double.NaN;
		if ((org.jfree.data.xy.XYDataItem.this.y) != null) {
			result = org.jfree.data.xy.XYDataItem.this.y.doubleValue();
		}
		return result;
	}

	public void setY(double y) {
		setY(new java.lang.Double(y));
	}

	public void setY(java.lang.Number y) {
		org.jfree.data.xy.XYDataItem.this.y = y;
	}

	public boolean isSelected() {
		return org.jfree.data.xy.XYDataItem.this.selected;
	}

	public void setSelected(boolean selected) {
		org.jfree.data.xy.XYDataItem.this.selected = selected;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.xy.XYDataItem) {
			org.jfree.data.xy.XYDataItem dataItem = ((org.jfree.data.xy.XYDataItem) (o1));
			double compare = (org.jfree.data.xy.XYDataItem.this.x.doubleValue()) - (dataItem.getX().doubleValue());
			if (compare > 0.0) {
				result = 1;
			}else {
				if (compare < 0.0) {
					result = -1;
				}else {
					result = 0;
				}
			}
		}else {
			result = 1;
		}
		return result;
	}

	public java.lang.Object clone() {
		java.lang.Object clone = null;
		try {
			clone = super.clone();
		} catch (java.lang.CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.xy.XYDataItem.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.xy.XYDataItem)) {
			return false;
		}
		org.jfree.data.xy.XYDataItem that = ((org.jfree.data.xy.XYDataItem) (obj));
		if (!(org.jfree.data.xy.XYDataItem.this.x.equals(that.x))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.xy.XYDataItem.this.y, that.y))) {
			return false;
		}
		if ((org.jfree.data.xy.XYDataItem.this.selected) != (that.selected)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.xy.XYDataItem.this.x.hashCode();
		result = (29 * result) + ((org.jfree.data.xy.XYDataItem.this.y) != null ? org.jfree.data.xy.XYDataItem.this.y.hashCode() : 0);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.data.xy.XYDataItem.this.selected);
		return result;
	}

	public java.lang.String toString() {
		return ((("[" + (getXValue())) + ", ") + (getYValue())) + "]";
	}
}


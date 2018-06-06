

package org.jfree.chart.axis;


public class AxisSpace implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2490732595134766305L;

	private double top;

	private double bottom;

	private double left;

	private double right;

	public AxisSpace() {
		org.jfree.chart.axis.AxisSpace.this.top = 0.0;
		org.jfree.chart.axis.AxisSpace.this.bottom = 0.0;
		org.jfree.chart.axis.AxisSpace.this.left = 0.0;
		org.jfree.chart.axis.AxisSpace.this.right = 0.0;
	}

	public double getTop() {
		return org.jfree.chart.axis.AxisSpace.this.top;
	}

	public void setTop(double space) {
		org.jfree.chart.axis.AxisSpace.this.top = space;
	}

	public double getBottom() {
		return org.jfree.chart.axis.AxisSpace.this.bottom;
	}

	public void setBottom(double space) {
		org.jfree.chart.axis.AxisSpace.this.bottom = space;
	}

	public double getLeft() {
		return org.jfree.chart.axis.AxisSpace.this.left;
	}

	public void setLeft(double space) {
		org.jfree.chart.axis.AxisSpace.this.left = space;
	}

	public double getRight() {
		return org.jfree.chart.axis.AxisSpace.this.right;
	}

	public void setRight(double space) {
		org.jfree.chart.axis.AxisSpace.this.right = space;
	}

	public void add(double space, org.jfree.chart.util.RectangleEdge edge) {
		if (edge == null) {
			throw new java.lang.IllegalArgumentException("Null 'edge' argument.");
		}
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			org.jfree.chart.axis.AxisSpace.this.top += space;
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				org.jfree.chart.axis.AxisSpace.this.bottom += space;
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					org.jfree.chart.axis.AxisSpace.this.left += space;
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						org.jfree.chart.axis.AxisSpace.this.right += space;
					}else {
						throw new java.lang.IllegalStateException("Unrecognised 'edge' argument.");
					}
				
			
		
	}

	public void ensureAtLeast(org.jfree.chart.axis.AxisSpace space) {
		org.jfree.chart.axis.AxisSpace.this.top = java.lang.Math.max(org.jfree.chart.axis.AxisSpace.this.top, space.top);
		org.jfree.chart.axis.AxisSpace.this.bottom = java.lang.Math.max(org.jfree.chart.axis.AxisSpace.this.bottom, space.bottom);
		org.jfree.chart.axis.AxisSpace.this.left = java.lang.Math.max(org.jfree.chart.axis.AxisSpace.this.left, space.left);
		org.jfree.chart.axis.AxisSpace.this.right = java.lang.Math.max(org.jfree.chart.axis.AxisSpace.this.right, space.right);
	}

	public void ensureAtLeast(double space, org.jfree.chart.util.RectangleEdge edge) {
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			if ((org.jfree.chart.axis.AxisSpace.this.top) < space) {
				org.jfree.chart.axis.AxisSpace.this.top = space;
			}
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				if ((org.jfree.chart.axis.AxisSpace.this.bottom) < space) {
					org.jfree.chart.axis.AxisSpace.this.bottom = space;
				}
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					if ((org.jfree.chart.axis.AxisSpace.this.left) < space) {
						org.jfree.chart.axis.AxisSpace.this.left = space;
					}
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						if ((org.jfree.chart.axis.AxisSpace.this.right) < space) {
							org.jfree.chart.axis.AxisSpace.this.right = space;
						}
					}else {
						throw new java.lang.IllegalStateException("AxisSpace.ensureAtLeast(): unrecognised AxisLocation.");
					}
				
			
		
	}

	public java.awt.geom.Rectangle2D shrink(java.awt.geom.Rectangle2D area, java.awt.geom.Rectangle2D result) {
		if (result == null) {
			result = new java.awt.geom.Rectangle2D.Double();
		}
		result.setRect(((area.getX()) + (org.jfree.chart.axis.AxisSpace.this.left)), ((area.getY()) + (org.jfree.chart.axis.AxisSpace.this.top)), (((area.getWidth()) - (org.jfree.chart.axis.AxisSpace.this.left)) - (org.jfree.chart.axis.AxisSpace.this.right)), (((area.getHeight()) - (org.jfree.chart.axis.AxisSpace.this.top)) - (org.jfree.chart.axis.AxisSpace.this.bottom)));
		return result;
	}

	public java.awt.geom.Rectangle2D expand(java.awt.geom.Rectangle2D area, java.awt.geom.Rectangle2D result) {
		if (result == null) {
			result = new java.awt.geom.Rectangle2D.Double();
		}
		result.setRect(((area.getX()) - (org.jfree.chart.axis.AxisSpace.this.left)), ((area.getY()) - (org.jfree.chart.axis.AxisSpace.this.top)), (((area.getWidth()) + (org.jfree.chart.axis.AxisSpace.this.left)) + (org.jfree.chart.axis.AxisSpace.this.right)), (((area.getHeight()) + (org.jfree.chart.axis.AxisSpace.this.top)) + (org.jfree.chart.axis.AxisSpace.this.bottom)));
		return result;
	}

	public java.awt.geom.Rectangle2D reserved(java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		java.awt.geom.Rectangle2D result = null;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result = new java.awt.geom.Rectangle2D.Double(area.getX(), area.getY(), area.getWidth(), org.jfree.chart.axis.AxisSpace.this.top);
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = new java.awt.geom.Rectangle2D.Double(area.getX(), ((area.getMaxY()) - (org.jfree.chart.axis.AxisSpace.this.top)), area.getWidth(), org.jfree.chart.axis.AxisSpace.this.bottom);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					result = new java.awt.geom.Rectangle2D.Double(area.getX(), area.getY(), org.jfree.chart.axis.AxisSpace.this.left, area.getHeight());
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result = new java.awt.geom.Rectangle2D.Double(((area.getMaxX()) - (org.jfree.chart.axis.AxisSpace.this.right)), area.getY(), org.jfree.chart.axis.AxisSpace.this.right, area.getHeight());
					}
				
			
		
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.AxisSpace.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.AxisSpace)) {
			return false;
		}
		org.jfree.chart.axis.AxisSpace that = ((org.jfree.chart.axis.AxisSpace) (obj));
		if ((org.jfree.chart.axis.AxisSpace.this.top) != (that.top)) {
			return false;
		}
		if ((org.jfree.chart.axis.AxisSpace.this.bottom) != (that.bottom)) {
			return false;
		}
		if ((org.jfree.chart.axis.AxisSpace.this.left) != (that.left)) {
			return false;
		}
		if ((org.jfree.chart.axis.AxisSpace.this.right) != (that.right)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 23;
		long l = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.AxisSpace.this.top);
		result = (37 * result) + ((int) (l ^ (l >>> 32)));
		l = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.AxisSpace.this.bottom);
		result = (37 * result) + ((int) (l ^ (l >>> 32)));
		l = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.AxisSpace.this.left);
		result = (37 * result) + ((int) (l ^ (l >>> 32)));
		l = java.lang.Double.doubleToLongBits(org.jfree.chart.axis.AxisSpace.this.right);
		result = (37 * result) + ((int) (l ^ (l >>> 32)));
		return result;
	}

	public java.lang.String toString() {
		return (((((((((super.toString()) + "[left=") + (org.jfree.chart.axis.AxisSpace.this.left)) + ",right=") + (org.jfree.chart.axis.AxisSpace.this.right)) + ",top=") + (org.jfree.chart.axis.AxisSpace.this.top)) + ",bottom=") + (org.jfree.chart.axis.AxisSpace.this.bottom)) + "]";
	}
}


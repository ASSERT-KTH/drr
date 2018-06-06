

package org.jfree.data.xy;


public class VectorDataItem extends org.jfree.data.ComparableObjectItem {
	public VectorDataItem(double x, double y, double deltaX, double deltaY) {
		super(new org.jfree.data.xy.XYCoordinate(x, y), new org.jfree.data.xy.Vector(deltaX, deltaY));
	}

	public double getXValue() {
		org.jfree.data.xy.XYCoordinate xy = ((org.jfree.data.xy.XYCoordinate) (getComparable()));
		return xy.getX();
	}

	public double getYValue() {
		org.jfree.data.xy.XYCoordinate xy = ((org.jfree.data.xy.XYCoordinate) (getComparable()));
		return xy.getY();
	}

	public org.jfree.data.xy.Vector getVector() {
		return ((org.jfree.data.xy.Vector) (getObject()));
	}

	public double getVectorX() {
		org.jfree.data.xy.Vector vi = ((org.jfree.data.xy.Vector) (getObject()));
		if (vi != null) {
			return vi.getX();
		}else {
			return java.lang.Double.NaN;
		}
	}

	public double getVectorY() {
		org.jfree.data.xy.Vector vi = ((org.jfree.data.xy.Vector) (getObject()));
		if (vi != null) {
			return vi.getY();
		}else {
			return java.lang.Double.NaN;
		}
	}
}




package org.jfree.chart.axis;


public final class AxisLocation implements java.io.Serializable {
	private static final long serialVersionUID = -3276922179323563410L;

	public static final org.jfree.chart.axis.AxisLocation TOP_OR_LEFT = new org.jfree.chart.axis.AxisLocation("AxisLocation.TOP_OR_LEFT");

	public static final org.jfree.chart.axis.AxisLocation TOP_OR_RIGHT = new org.jfree.chart.axis.AxisLocation("AxisLocation.TOP_OR_RIGHT");

	public static final org.jfree.chart.axis.AxisLocation BOTTOM_OR_LEFT = new org.jfree.chart.axis.AxisLocation("AxisLocation.BOTTOM_OR_LEFT");

	public static final org.jfree.chart.axis.AxisLocation BOTTOM_OR_RIGHT = new org.jfree.chart.axis.AxisLocation("AxisLocation.BOTTOM_OR_RIGHT");

	private java.lang.String name;

	private AxisLocation(java.lang.String name) {
		org.jfree.chart.axis.AxisLocation.this.name = name;
	}

	public org.jfree.chart.axis.AxisLocation getOpposite() {
		return org.jfree.chart.axis.AxisLocation.getOpposite(org.jfree.chart.axis.AxisLocation.this);
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.AxisLocation.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.AxisLocation.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.AxisLocation)) {
			return false;
		}
		org.jfree.chart.axis.AxisLocation location = ((org.jfree.chart.axis.AxisLocation) (obj));
		if (!(org.jfree.chart.axis.AxisLocation.this.name.equals(location.toString()))) {
			return false;
		}
		return true;
	}

	public static org.jfree.chart.axis.AxisLocation getOpposite(org.jfree.chart.axis.AxisLocation location) {
		if (location == null) {
			throw new java.lang.IllegalArgumentException("Null 'location' argument.");
		}
		org.jfree.chart.axis.AxisLocation result = null;
		if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT)) {
			result = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
		}else
			if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT)) {
				result = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
			}else
				if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT)) {
					result = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
				}else
					if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT)) {
						result = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
					}else {
						throw new java.lang.IllegalStateException("AxisLocation not recognised.");
					}
				
			
		
		return result;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.axis.AxisLocation.this.equals(org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT)) {
			return org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
		}else
			if (org.jfree.chart.axis.AxisLocation.this.equals(org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT)) {
				return org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
			}else
				if (org.jfree.chart.axis.AxisLocation.this.equals(org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT)) {
					return org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
				}else
					if (org.jfree.chart.axis.AxisLocation.this.equals(org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT)) {
						return org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
					}
				
			
		
		return null;
	}
}


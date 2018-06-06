

package org.jfree.chart.util;


public final class RectangleAnchor implements java.io.Serializable {
	private static final long serialVersionUID = -2457494205644416327L;

	public static final org.jfree.chart.util.RectangleAnchor CENTER = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.CENTER");

	public static final org.jfree.chart.util.RectangleAnchor TOP = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.TOP");

	public static final org.jfree.chart.util.RectangleAnchor TOP_LEFT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.TOP_LEFT");

	public static final org.jfree.chart.util.RectangleAnchor TOP_RIGHT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.TOP_RIGHT");

	public static final org.jfree.chart.util.RectangleAnchor BOTTOM = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.BOTTOM");

	public static final org.jfree.chart.util.RectangleAnchor BOTTOM_LEFT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.BOTTOM_LEFT");

	public static final org.jfree.chart.util.RectangleAnchor BOTTOM_RIGHT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.BOTTOM_RIGHT");

	public static final org.jfree.chart.util.RectangleAnchor LEFT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.LEFT");

	public static final org.jfree.chart.util.RectangleAnchor RIGHT = new org.jfree.chart.util.RectangleAnchor("RectangleAnchor.RIGHT");

	private java.lang.String name;

	private RectangleAnchor(final java.lang.String name) {
		org.jfree.chart.util.RectangleAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.RectangleAnchor.this.name;
	}

	public boolean equals(final java.lang.Object obj) {
		if ((org.jfree.chart.util.RectangleAnchor.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.RectangleAnchor)) {
			return false;
		}
		final org.jfree.chart.util.RectangleAnchor order = ((org.jfree.chart.util.RectangleAnchor) (obj));
		if (!(org.jfree.chart.util.RectangleAnchor.this.name.equals(order.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.RectangleAnchor.this.name.hashCode();
	}

	public static java.awt.geom.Point2D coordinates(final java.awt.geom.Rectangle2D rectangle, final org.jfree.chart.util.RectangleAnchor anchor) {
		java.awt.geom.Point2D result = new java.awt.geom.Point2D.Double();
		if (anchor == (org.jfree.chart.util.RectangleAnchor.CENTER)) {
			result.setLocation(rectangle.getCenterX(), rectangle.getCenterY());
		}else
			if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP)) {
				result.setLocation(rectangle.getCenterX(), rectangle.getMinY());
			}else
				if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
					result.setLocation(rectangle.getCenterX(), rectangle.getMaxY());
				}else
					if (anchor == (org.jfree.chart.util.RectangleAnchor.LEFT)) {
						result.setLocation(rectangle.getMinX(), rectangle.getCenterY());
					}else
						if (anchor == (org.jfree.chart.util.RectangleAnchor.RIGHT)) {
							result.setLocation(rectangle.getMaxX(), rectangle.getCenterY());
						}else
							if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
								result.setLocation(rectangle.getMinX(), rectangle.getMinY());
							}else
								if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
									result.setLocation(rectangle.getMaxX(), rectangle.getMinY());
								}else
									if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
										result.setLocation(rectangle.getMinX(), rectangle.getMaxY());
									}else
										if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
											result.setLocation(rectangle.getMaxX(), rectangle.getMaxY());
										}
									
								
							
						
					
				
			
		
		return result;
	}

	public static java.awt.geom.Rectangle2D createRectangle(final org.jfree.chart.util.Size2D dimensions, final double anchorX, final double anchorY, final org.jfree.chart.util.RectangleAnchor anchor) {
		java.awt.geom.Rectangle2D result = null;
		final double w = dimensions.getWidth();
		final double h = dimensions.getHeight();
		if (anchor == (org.jfree.chart.util.RectangleAnchor.CENTER)) {
			result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
		}else
			if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP)) {
				result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
			}else
				if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
					result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
				}else
					if (anchor == (org.jfree.chart.util.RectangleAnchor.LEFT)) {
						result = new java.awt.geom.Rectangle2D.Double(anchorX, (anchorY - (h / 2.0)), w, h);
					}else
						if (anchor == (org.jfree.chart.util.RectangleAnchor.RIGHT)) {
							result = new java.awt.geom.Rectangle2D.Double((anchorX - w), (anchorY - (h / 2.0)), w, h);
						}else
							if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
								result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
							}else
								if (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
									result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
								}else
									if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
										result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
									}else
										if (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
											result = new java.awt.geom.Rectangle2D.Double((anchorX - (w / 2.0)), (anchorY - (h / 2.0)), w, h);
										}
									
								
							
						
					
				
			
		
		return result;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.util.RectangleAnchor result = null;
		if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.CENTER)) {
			result = org.jfree.chart.util.RectangleAnchor.CENTER;
		}else
			if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.TOP)) {
				result = org.jfree.chart.util.RectangleAnchor.TOP;
			}else
				if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
					result = org.jfree.chart.util.RectangleAnchor.BOTTOM;
				}else
					if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.LEFT)) {
						result = org.jfree.chart.util.RectangleAnchor.LEFT;
					}else
						if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.RIGHT)) {
							result = org.jfree.chart.util.RectangleAnchor.RIGHT;
						}else
							if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
								result = org.jfree.chart.util.RectangleAnchor.TOP_LEFT;
							}else
								if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
									result = org.jfree.chart.util.RectangleAnchor.TOP_RIGHT;
								}else
									if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
										result = org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT;
									}else
										if (org.jfree.chart.util.RectangleAnchor.this.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
											result = org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT;
										}
									
								
							
						
					
				
			
		
		return result;
	}
}




package org.jfree.chart.util;


public final class Align {
	public static final int CENTER = 0;

	public static final int TOP = 1;

	public static final int BOTTOM = 2;

	public static final int LEFT = 4;

	public static final int RIGHT = 8;

	public static final int TOP_LEFT = (org.jfree.chart.util.Align.TOP) | (org.jfree.chart.util.Align.LEFT);

	public static final int TOP_RIGHT = (org.jfree.chart.util.Align.TOP) | (org.jfree.chart.util.Align.RIGHT);

	public static final int BOTTOM_LEFT = (org.jfree.chart.util.Align.BOTTOM) | (org.jfree.chart.util.Align.LEFT);

	public static final int BOTTOM_RIGHT = (org.jfree.chart.util.Align.BOTTOM) | (org.jfree.chart.util.Align.RIGHT);

	public static final int FIT_HORIZONTAL = (org.jfree.chart.util.Align.LEFT) | (org.jfree.chart.util.Align.RIGHT);

	public static final int FIT_VERTICAL = (org.jfree.chart.util.Align.TOP) | (org.jfree.chart.util.Align.BOTTOM);

	public static final int FIT = (org.jfree.chart.util.Align.FIT_HORIZONTAL) | (org.jfree.chart.util.Align.FIT_VERTICAL);

	public static final int NORTH = org.jfree.chart.util.Align.TOP;

	public static final int SOUTH = org.jfree.chart.util.Align.BOTTOM;

	public static final int WEST = org.jfree.chart.util.Align.LEFT;

	public static final int EAST = org.jfree.chart.util.Align.RIGHT;

	public static final int NORTH_WEST = (org.jfree.chart.util.Align.NORTH) | (org.jfree.chart.util.Align.WEST);

	public static final int NORTH_EAST = (org.jfree.chart.util.Align.NORTH) | (org.jfree.chart.util.Align.EAST);

	public static final int SOUTH_WEST = (org.jfree.chart.util.Align.SOUTH) | (org.jfree.chart.util.Align.WEST);

	public static final int SOUTH_EAST = (org.jfree.chart.util.Align.SOUTH) | (org.jfree.chart.util.Align.EAST);

	private Align() {
		super();
	}

	public static void align(java.awt.geom.Rectangle2D rect, java.awt.geom.Rectangle2D frame, int align) {
		double x = (frame.getCenterX()) - ((rect.getWidth()) / 2.0);
		double y = (frame.getCenterY()) - ((rect.getHeight()) / 2.0);
		double w = rect.getWidth();
		double h = rect.getHeight();
		if ((align & (org.jfree.chart.util.Align.FIT_VERTICAL)) == (org.jfree.chart.util.Align.FIT_VERTICAL)) {
			h = frame.getHeight();
		}
		if ((align & (org.jfree.chart.util.Align.FIT_HORIZONTAL)) == (org.jfree.chart.util.Align.FIT_HORIZONTAL)) {
			w = frame.getWidth();
		}
		if ((align & (org.jfree.chart.util.Align.TOP)) == (org.jfree.chart.util.Align.TOP)) {
			y = frame.getMinY();
		}
		if ((align & (org.jfree.chart.util.Align.BOTTOM)) == (org.jfree.chart.util.Align.BOTTOM)) {
			y = (frame.getMaxY()) - h;
		}
		if ((align & (org.jfree.chart.util.Align.LEFT)) == (org.jfree.chart.util.Align.LEFT)) {
			x = frame.getX();
		}
		if ((align & (org.jfree.chart.util.Align.RIGHT)) == (org.jfree.chart.util.Align.RIGHT)) {
			x = (frame.getMaxX()) - w;
		}
		rect.setRect(x, y, w, h);
	}
}


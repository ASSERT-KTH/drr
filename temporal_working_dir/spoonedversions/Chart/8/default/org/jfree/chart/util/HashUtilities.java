

package org.jfree.chart.util;


public class HashUtilities {
	public static int hashCodeForPaint(java.awt.Paint p) {
		if (p == null) {
			return 0;
		}
		int result = 0;
		if (p instanceof java.awt.GradientPaint) {
			java.awt.GradientPaint gp = ((java.awt.GradientPaint) (p));
			result = 193;
			result = (37 * result) + (gp.getColor1().hashCode());
			result = (37 * result) + (gp.getPoint1().hashCode());
			result = (37 * result) + (gp.getColor2().hashCode());
			result = (37 * result) + (gp.getPoint2().hashCode());
		}else {
			result = p.hashCode();
		}
		return result;
	}

	public static int hashCodeForDoubleArray(double[] a) {
		if (a == null) {
			return 0;
		}
		int result = 193;
		long temp;
		for (int i = 0; i < (a.length); i++) {
			temp = java.lang.Double.doubleToLongBits(a[i]);
			result = (29 * result) + ((int) (temp ^ (temp >>> 32)));
		}
		return result;
	}

	public static int hashCode(int pre, boolean b) {
		return (37 * pre) + (b ? 0 : 1);
	}

	public static int hashCode(int pre, int i) {
		return (37 * pre) + i;
	}

	public static int hashCode(int pre, double d) {
		long l = java.lang.Double.doubleToLongBits(d);
		return (37 * pre) + ((int) (l ^ (l >>> 32)));
	}

	public static int hashCode(int pre, java.awt.Paint p) {
		return (37 * pre) + (org.jfree.chart.util.HashUtilities.hashCodeForPaint(p));
	}

	public static int hashCode(int pre, java.awt.Stroke s) {
		int h = s != null ? s.hashCode() : 0;
		return (37 * pre) + h;
	}

	public static int hashCode(int pre, java.lang.String s) {
		int h = s != null ? s.hashCode() : 0;
		return (37 * pre) + h;
	}

	public static int hashCode(int pre, java.lang.Comparable c) {
		int h = c != null ? c.hashCode() : 0;
		return (37 * pre) + h;
	}

	public static int hashCode(int pre, java.lang.Object obj) {
		int h = obj != null ? obj.hashCode() : 0;
		return (37 * pre) + h;
	}
}


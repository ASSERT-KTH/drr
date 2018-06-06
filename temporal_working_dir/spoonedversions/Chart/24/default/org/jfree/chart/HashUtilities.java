

package org.jfree.chart;


public class HashUtilities {
	public static int hashCodeForPaint(java.awt.Paint p) {
		if (p == null)
			return 0;
		
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
}


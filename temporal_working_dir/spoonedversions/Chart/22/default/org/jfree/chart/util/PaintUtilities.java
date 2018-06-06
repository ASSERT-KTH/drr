

package org.jfree.chart.util;


public class PaintUtilities {
	private PaintUtilities() {
	}

	public static boolean equal(java.awt.Paint p1, java.awt.Paint p2) {
		if (p1 == null) {
			return p2 == null;
		}
		if (p2 == null) {
			return false;
		}
		boolean result = false;
		if ((p1 instanceof java.awt.GradientPaint) && (p2 instanceof java.awt.GradientPaint)) {
			java.awt.GradientPaint gp1 = ((java.awt.GradientPaint) (p1));
			java.awt.GradientPaint gp2 = ((java.awt.GradientPaint) (p2));
			result = (((((gp1.getColor1().equals(gp2.getColor1())) && (gp1.getColor2().equals(gp2.getColor2()))) && (gp1.getPoint1().equals(gp2.getPoint1()))) && (gp1.getPoint2().equals(gp2.getPoint2()))) && ((gp1.isCyclic()) == (gp2.isCyclic()))) && ((gp1.getTransparency()) == (gp1.getTransparency()));
		}else {
			result = p1.equals(p2);
		}
		return result;
	}

	public static java.lang.String colorToString(java.awt.Color c) {
		try {
			java.lang.reflect.Field[] fields = java.awt.Color.class.getFields();
			for (int i = 0; i < (fields.length); i++) {
				java.lang.reflect.Field f = fields[i];
				if (((java.lang.reflect.Modifier.isPublic(f.getModifiers())) && (java.lang.reflect.Modifier.isFinal(f.getModifiers()))) && (java.lang.reflect.Modifier.isStatic(f.getModifiers()))) {
					java.lang.String name = f.getName();
					java.lang.Object oColor = f.get(null);
					if (oColor instanceof java.awt.Color) {
						if (c.equals(oColor)) {
							return name;
						}
					}
				}
			}
		} catch (java.lang.Exception e) {
		}
		java.lang.String color = java.lang.Integer.toHexString(((c.getRGB()) & 16777215));
		java.lang.StringBuffer retval = new java.lang.StringBuffer(7);
		retval.append("#");
		int fillUp = 6 - (color.length());
		for (int i = 0; i < fillUp; i++) {
			retval.append("0");
		}
		retval.append(color);
		return retval.toString();
	}

	public static java.awt.Color stringToColor(java.lang.String value) {
		if (value == null) {
			return java.awt.Color.black;
		}
		try {
			return java.awt.Color.decode(value);
		} catch (java.lang.NumberFormatException nfe) {
			try {
				final java.lang.reflect.Field f = java.awt.Color.class.getField(value);
				return ((java.awt.Color) (f.get(null)));
			} catch (java.lang.Exception ce) {
				return java.awt.Color.black;
			}
		}
	}
}


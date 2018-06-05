

package org.jfree.chart.util;


public final class Layer implements java.io.Serializable {
	private static final long serialVersionUID = -1470104570733183430L;

	public static final org.jfree.chart.util.Layer FOREGROUND = new org.jfree.chart.util.Layer("Layer.FOREGROUND");

	public static final org.jfree.chart.util.Layer BACKGROUND = new org.jfree.chart.util.Layer("Layer.BACKGROUND");

	private java.lang.String name;

	private Layer(java.lang.String name) {
		org.jfree.chart.util.Layer.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.util.Layer.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.util.Layer.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.Layer)) {
			return false;
		}
		org.jfree.chart.util.Layer layer = ((org.jfree.chart.util.Layer) (obj));
		if (!(org.jfree.chart.util.Layer.this.name.equals(layer.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.util.Layer.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.util.Layer result = null;
		if (org.jfree.chart.util.Layer.this.equals(org.jfree.chart.util.Layer.FOREGROUND)) {
			result = org.jfree.chart.util.Layer.FOREGROUND;
		}else
			if (org.jfree.chart.util.Layer.this.equals(org.jfree.chart.util.Layer.BACKGROUND)) {
				result = org.jfree.chart.util.Layer.BACKGROUND;
			}
		
		return result;
	}
}


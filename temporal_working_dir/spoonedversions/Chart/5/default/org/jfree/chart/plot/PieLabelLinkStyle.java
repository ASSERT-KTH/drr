

package org.jfree.chart.plot;


public final class PieLabelLinkStyle implements java.io.Serializable {
	public static final org.jfree.chart.plot.PieLabelLinkStyle STANDARD = new org.jfree.chart.plot.PieLabelLinkStyle("PieLabelLinkStyle.STANDARD");

	public static final org.jfree.chart.plot.PieLabelLinkStyle QUAD_CURVE = new org.jfree.chart.plot.PieLabelLinkStyle("PieLabelLinkStyle.QUAD_CURVE");

	public static final org.jfree.chart.plot.PieLabelLinkStyle CUBIC_CURVE = new org.jfree.chart.plot.PieLabelLinkStyle("PieLabelLinkStyle.CUBIC_CURVE");

	private java.lang.String name;

	private PieLabelLinkStyle(java.lang.String name) {
		org.jfree.chart.plot.PieLabelLinkStyle.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.plot.PieLabelLinkStyle.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.plot.PieLabelLinkStyle.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PieLabelLinkStyle)) {
			return false;
		}
		org.jfree.chart.plot.PieLabelLinkStyle style = ((org.jfree.chart.plot.PieLabelLinkStyle) (obj));
		if (!(org.jfree.chart.plot.PieLabelLinkStyle.this.name.equals(style.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.plot.PieLabelLinkStyle.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.chart.plot.PieLabelLinkStyle.this.equals(org.jfree.chart.plot.PieLabelLinkStyle.STANDARD)) {
			result = org.jfree.chart.plot.PieLabelLinkStyle.STANDARD;
		}else
			if (org.jfree.chart.plot.PieLabelLinkStyle.this.equals(org.jfree.chart.plot.PieLabelLinkStyle.QUAD_CURVE)) {
				result = org.jfree.chart.plot.PieLabelLinkStyle.QUAD_CURVE;
			}else
				if (org.jfree.chart.plot.PieLabelLinkStyle.this.equals(org.jfree.chart.plot.PieLabelLinkStyle.CUBIC_CURVE)) {
					result = org.jfree.chart.plot.PieLabelLinkStyle.CUBIC_CURVE;
				}
			
		
		return result;
	}
}


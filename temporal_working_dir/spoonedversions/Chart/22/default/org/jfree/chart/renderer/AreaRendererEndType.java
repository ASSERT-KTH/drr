

package org.jfree.chart.renderer;


public final class AreaRendererEndType implements java.io.Serializable {
	private static final long serialVersionUID = -1774146392916359839L;

	public static final org.jfree.chart.renderer.AreaRendererEndType TAPER = new org.jfree.chart.renderer.AreaRendererEndType("AreaRendererEndType.TAPER");

	public static final org.jfree.chart.renderer.AreaRendererEndType TRUNCATE = new org.jfree.chart.renderer.AreaRendererEndType("AreaRendererEndType.TRUNCATE");

	public static final org.jfree.chart.renderer.AreaRendererEndType LEVEL = new org.jfree.chart.renderer.AreaRendererEndType("AreaRendererEndType.LEVEL");

	private java.lang.String name;

	private AreaRendererEndType(java.lang.String name) {
		org.jfree.chart.renderer.AreaRendererEndType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.renderer.AreaRendererEndType.this.name;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.chart.renderer.AreaRendererEndType.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.chart.renderer.AreaRendererEndType)) {
			return false;
		}
		org.jfree.chart.renderer.AreaRendererEndType t = ((org.jfree.chart.renderer.AreaRendererEndType) (o));
		if (!(org.jfree.chart.renderer.AreaRendererEndType.this.name.equals(t.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		java.lang.Object result = null;
		if (org.jfree.chart.renderer.AreaRendererEndType.this.equals(org.jfree.chart.renderer.AreaRendererEndType.LEVEL)) {
			result = org.jfree.chart.renderer.AreaRendererEndType.LEVEL;
		}else
			if (org.jfree.chart.renderer.AreaRendererEndType.this.equals(org.jfree.chart.renderer.AreaRendererEndType.TAPER)) {
				result = org.jfree.chart.renderer.AreaRendererEndType.TAPER;
			}else
				if (org.jfree.chart.renderer.AreaRendererEndType.this.equals(org.jfree.chart.renderer.AreaRendererEndType.TRUNCATE)) {
					result = org.jfree.chart.renderer.AreaRendererEndType.TRUNCATE;
				}
			
		
		return result;
	}
}


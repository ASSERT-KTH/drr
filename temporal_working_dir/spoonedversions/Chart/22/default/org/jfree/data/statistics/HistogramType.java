

package org.jfree.data.statistics;


public class HistogramType implements java.io.Serializable {
	private static final long serialVersionUID = 2618927186251997727L;

	public static final org.jfree.data.statistics.HistogramType FREQUENCY = new org.jfree.data.statistics.HistogramType("FREQUENCY");

	public static final org.jfree.data.statistics.HistogramType RELATIVE_FREQUENCY = new org.jfree.data.statistics.HistogramType("RELATIVE_FREQUENCY");

	public static final org.jfree.data.statistics.HistogramType SCALE_AREA_TO_1 = new org.jfree.data.statistics.HistogramType("SCALE_AREA_TO_1");

	private java.lang.String name;

	private HistogramType(java.lang.String name) {
		org.jfree.data.statistics.HistogramType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.statistics.HistogramType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.data.statistics.HistogramType.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.statistics.HistogramType)) {
			return false;
		}
		org.jfree.data.statistics.HistogramType t = ((org.jfree.data.statistics.HistogramType) (obj));
		if (!(org.jfree.data.statistics.HistogramType.this.name.equals(t.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.statistics.HistogramType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.data.statistics.HistogramType.this.equals(org.jfree.data.statistics.HistogramType.FREQUENCY)) {
			return org.jfree.data.statistics.HistogramType.FREQUENCY;
		}else
			if (org.jfree.data.statistics.HistogramType.this.equals(org.jfree.data.statistics.HistogramType.RELATIVE_FREQUENCY)) {
				return org.jfree.data.statistics.HistogramType.RELATIVE_FREQUENCY;
			}else
				if (org.jfree.data.statistics.HistogramType.this.equals(org.jfree.data.statistics.HistogramType.SCALE_AREA_TO_1)) {
					return org.jfree.data.statistics.HistogramType.SCALE_AREA_TO_1;
				}
			
		
		return null;
	}
}


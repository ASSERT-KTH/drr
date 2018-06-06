

package org.jfree.data;


public final class RangeType implements java.io.Serializable {
	private static final long serialVersionUID = -9073319010650549239L;

	public static final org.jfree.data.RangeType FULL = new org.jfree.data.RangeType("RangeType.FULL");

	public static final org.jfree.data.RangeType POSITIVE = new org.jfree.data.RangeType("RangeType.POSITIVE");

	public static final org.jfree.data.RangeType NEGATIVE = new org.jfree.data.RangeType("RangeType.NEGATIVE");

	private java.lang.String name;

	private RangeType(java.lang.String name) {
		org.jfree.data.RangeType.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.data.RangeType.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.data.RangeType.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.RangeType)) {
			return false;
		}
		org.jfree.data.RangeType that = ((org.jfree.data.RangeType) (obj));
		if (!(org.jfree.data.RangeType.this.name.equals(that.toString()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.data.RangeType.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.data.RangeType.this.equals(org.jfree.data.RangeType.FULL)) {
			return org.jfree.data.RangeType.FULL;
		}else
			if (org.jfree.data.RangeType.this.equals(org.jfree.data.RangeType.POSITIVE)) {
				return org.jfree.data.RangeType.POSITIVE;
			}else
				if (org.jfree.data.RangeType.this.equals(org.jfree.data.RangeType.NEGATIVE)) {
					return org.jfree.data.RangeType.NEGATIVE;
				}
			
		
		return null;
	}
}


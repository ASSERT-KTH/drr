

package org.jfree.data;


public class ComparableObjectItem implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable {
	private static final long serialVersionUID = 2751513470325494890L;

	private java.lang.Comparable x;

	private java.lang.Object obj;

	public ComparableObjectItem(java.lang.Comparable x, java.lang.Object y) {
		if (x == null) {
			throw new java.lang.IllegalArgumentException("Null 'x' argument.");
		}
		org.jfree.data.ComparableObjectItem.this.x = x;
		org.jfree.data.ComparableObjectItem.this.obj = y;
	}

	protected java.lang.Comparable getComparable() {
		return org.jfree.data.ComparableObjectItem.this.x;
	}

	protected java.lang.Object getObject() {
		return org.jfree.data.ComparableObjectItem.this.obj;
	}

	protected void setObject(java.lang.Object y) {
		org.jfree.data.ComparableObjectItem.this.obj = y;
	}

	public int compareTo(java.lang.Object o1) {
		int result;
		if (o1 instanceof org.jfree.data.ComparableObjectItem) {
			org.jfree.data.ComparableObjectItem that = ((org.jfree.data.ComparableObjectItem) (o1));
			return org.jfree.data.ComparableObjectItem.this.x.compareTo(that.x);
		}else {
			result = 1;
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.ComparableObjectItem.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.ComparableObjectItem)) {
			return false;
		}
		org.jfree.data.ComparableObjectItem that = ((org.jfree.data.ComparableObjectItem) (obj));
		if (!(org.jfree.data.ComparableObjectItem.this.x.equals(that.x))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.ComparableObjectItem.this.obj, that.obj))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.ComparableObjectItem.this.x.hashCode();
		result = (29 * result) + ((org.jfree.data.ComparableObjectItem.this.obj) != null ? org.jfree.data.ComparableObjectItem.this.obj.hashCode() : 0);
		return result;
	}
}


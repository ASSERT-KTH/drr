

package org.jfree.data;


public class KeyedObject implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 2677930479256885863L;

	private java.lang.Comparable key;

	private java.lang.Object object;

	public KeyedObject(java.lang.Comparable key, java.lang.Object object) {
		org.jfree.data.KeyedObject.this.key = key;
		org.jfree.data.KeyedObject.this.object = object;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.data.KeyedObject.this.key;
	}

	public java.lang.Object getObject() {
		return org.jfree.data.KeyedObject.this.object;
	}

	public void setObject(java.lang.Object object) {
		org.jfree.data.KeyedObject.this.object = object;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.KeyedObject clone = ((org.jfree.data.KeyedObject) (super.clone()));
		if ((org.jfree.data.KeyedObject.this.object) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.data.KeyedObject.this.object));
			clone.object = pc.clone();
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.KeyedObject.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.KeyedObject)) {
			return false;
		}
		org.jfree.data.KeyedObject that = ((org.jfree.data.KeyedObject) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.KeyedObject.this.key, that.key))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.KeyedObject.this.object, that.object))) {
			return false;
		}
		return true;
	}
}


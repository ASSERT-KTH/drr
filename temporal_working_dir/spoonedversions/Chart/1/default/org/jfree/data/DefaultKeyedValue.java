

package org.jfree.data;


public class DefaultKeyedValue implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.KeyedValue {
	private static final long serialVersionUID = -7388924517460437712L;

	private java.lang.Comparable key;

	private java.lang.Number value;

	public DefaultKeyedValue(java.lang.Comparable key, java.lang.Number value) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.data.DefaultKeyedValue.this.key = key;
		org.jfree.data.DefaultKeyedValue.this.value = value;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.data.DefaultKeyedValue.this.key;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.DefaultKeyedValue.this.value;
	}

	public synchronized void setValue(java.lang.Number value) {
		org.jfree.data.DefaultKeyedValue.this.value = value;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.DefaultKeyedValue.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.DefaultKeyedValue)) {
			return false;
		}
		org.jfree.data.DefaultKeyedValue that = ((org.jfree.data.DefaultKeyedValue) (obj));
		if (!(org.jfree.data.DefaultKeyedValue.this.key.equals(that.key))) {
			return false;
		}
		if ((org.jfree.data.DefaultKeyedValue.this.value) != null ? !(org.jfree.data.DefaultKeyedValue.this.value.equals(that.value)) : (that.value) != null) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = ((org.jfree.data.DefaultKeyedValue.this.key) != null) ? org.jfree.data.DefaultKeyedValue.this.key.hashCode() : 0;
		result = (29 * result) + ((org.jfree.data.DefaultKeyedValue.this.value) != null ? org.jfree.data.DefaultKeyedValue.this.value.hashCode() : 0);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.DefaultKeyedValue clone = ((org.jfree.data.DefaultKeyedValue) (super.clone()));
		return clone;
	}

	public java.lang.String toString() {
		return ((("(" + (org.jfree.data.DefaultKeyedValue.this.key.toString())) + ", ") + (org.jfree.data.DefaultKeyedValue.this.value.toString())) + ")";
	}
}


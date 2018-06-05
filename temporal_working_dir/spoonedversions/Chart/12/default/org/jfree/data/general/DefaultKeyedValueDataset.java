

package org.jfree.data.general;


public class DefaultKeyedValueDataset extends org.jfree.data.general.AbstractDataset implements java.io.Serializable , org.jfree.data.general.KeyedValueDataset {
	private static final long serialVersionUID = -8149484339560406750L;

	private org.jfree.data.KeyedValue data;

	public DefaultKeyedValueDataset() {
		this(null);
	}

	public DefaultKeyedValueDataset(java.lang.Comparable key, java.lang.Number value) {
		this(new org.jfree.data.DefaultKeyedValue(key, value));
	}

	public DefaultKeyedValueDataset(org.jfree.data.KeyedValue data) {
		org.jfree.data.general.DefaultKeyedValueDataset.this.data = data;
	}

	public java.lang.Comparable getKey() {
		java.lang.Comparable result = null;
		if ((org.jfree.data.general.DefaultKeyedValueDataset.this.data) != null) {
			result = org.jfree.data.general.DefaultKeyedValueDataset.this.data.getKey();
		}
		return result;
	}

	public java.lang.Number getValue() {
		java.lang.Number result = null;
		if ((org.jfree.data.general.DefaultKeyedValueDataset.this.data) != null) {
			result = org.jfree.data.general.DefaultKeyedValueDataset.this.data.getValue();
		}
		return result;
	}

	public void updateValue(java.lang.Number value) {
		if ((org.jfree.data.general.DefaultKeyedValueDataset.this.data) == null) {
			throw new java.lang.RuntimeException("updateValue: can't update null.");
		}
		setValue(org.jfree.data.general.DefaultKeyedValueDataset.this.data.getKey(), value);
	}

	public void setValue(java.lang.Comparable key, java.lang.Number value) {
		org.jfree.data.general.DefaultKeyedValueDataset.this.data = new org.jfree.data.DefaultKeyedValue(key, value);
		notifyListeners(new org.jfree.data.general.DatasetChangeEvent(org.jfree.data.general.DefaultKeyedValueDataset.this, org.jfree.data.general.DefaultKeyedValueDataset.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.DefaultKeyedValueDataset.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.KeyedValueDataset)) {
			return false;
		}
		org.jfree.data.general.KeyedValueDataset that = ((org.jfree.data.general.KeyedValueDataset) (obj));
		if ((org.jfree.data.general.DefaultKeyedValueDataset.this.data) == null) {
			if (((that.getKey()) != null) || ((that.getValue()) != null)) {
				return false;
			}
			return true;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.general.DefaultKeyedValueDataset.this.data.getKey(), that.getKey()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.general.DefaultKeyedValueDataset.this.data.getValue(), that.getValue()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return (org.jfree.data.general.DefaultKeyedValueDataset.this.data) != null ? org.jfree.data.general.DefaultKeyedValueDataset.this.data.hashCode() : 0;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.general.DefaultKeyedValueDataset clone = ((org.jfree.data.general.DefaultKeyedValueDataset) (super.clone()));
		return clone;
	}
}


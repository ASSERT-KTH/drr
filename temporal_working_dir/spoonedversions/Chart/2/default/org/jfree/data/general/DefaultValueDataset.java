

package org.jfree.data.general;


public class DefaultValueDataset extends org.jfree.data.general.AbstractDataset implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable , org.jfree.data.general.ValueDataset {
	private static final long serialVersionUID = 8137521217249294891L;

	private java.lang.Number value;

	public DefaultValueDataset() {
		this(null);
	}

	public DefaultValueDataset(double value) {
		this(new java.lang.Double(value));
	}

	public DefaultValueDataset(java.lang.Number value) {
		super();
		org.jfree.data.general.DefaultValueDataset.this.value = value;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.general.DefaultValueDataset.this.value;
	}

	public void setValue(java.lang.Number value) {
		org.jfree.data.general.DefaultValueDataset.this.value = value;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.DefaultValueDataset.this)) {
			return true;
		}
		if (obj instanceof org.jfree.data.general.ValueDataset) {
			org.jfree.data.general.ValueDataset vd = ((org.jfree.data.general.ValueDataset) (obj));
			return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.general.DefaultValueDataset.this.value, vd.getValue());
		}
		return false;
	}

	public int hashCode() {
		return (org.jfree.data.general.DefaultValueDataset.this.value) != null ? org.jfree.data.general.DefaultValueDataset.this.value.hashCode() : 0;
	}
}


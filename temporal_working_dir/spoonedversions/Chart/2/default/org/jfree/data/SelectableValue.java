

package org.jfree.data;


public class SelectableValue implements java.io.Serializable , java.lang.Cloneable , org.jfree.data.Value {
	private java.lang.Number value;

	private boolean selected;

	public SelectableValue(java.lang.Number value) {
		this(value, false);
	}

	public SelectableValue(java.lang.Number value, boolean selected) {
		org.jfree.data.SelectableValue.this.value = value;
		org.jfree.data.SelectableValue.this.selected = selected;
	}

	public java.lang.Number getValue() {
		return org.jfree.data.SelectableValue.this.value;
	}

	public boolean isSelected() {
		return org.jfree.data.SelectableValue.this.selected;
	}

	public void setSelected(boolean selected) {
		org.jfree.data.SelectableValue.this.selected = selected;
	}
}


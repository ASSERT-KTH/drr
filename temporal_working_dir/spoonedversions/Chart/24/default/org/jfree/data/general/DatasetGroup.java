

package org.jfree.data.general;


public class DatasetGroup implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -3640642179674185688L;

	private java.lang.String id;

	public DatasetGroup() {
		super();
		org.jfree.data.general.DatasetGroup.this.id = "NOID";
	}

	public DatasetGroup(java.lang.String id) {
		if (id == null) {
			throw new java.lang.IllegalArgumentException("Null 'id' argument.");
		}
		org.jfree.data.general.DatasetGroup.this.id = id;
	}

	public java.lang.String getID() {
		return org.jfree.data.general.DatasetGroup.this.id;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.DatasetGroup.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.DatasetGroup)) {
			return false;
		}
		org.jfree.data.general.DatasetGroup that = ((org.jfree.data.general.DatasetGroup) (obj));
		if (!(org.jfree.data.general.DatasetGroup.this.id.equals(that.id))) {
			return false;
		}
		return true;
	}
}




package com.google.javascript.rhino;


public class InputId implements java.io.Serializable {
	public static final long serialVersionUID = 1L;

	private final java.lang.String id;

	public InputId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getIdName() {
		return id;
	}

	@java.lang.Override
	public int hashCode() {
		return id.hashCode();
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((com.google.javascript.rhino.InputId.this) == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if ((getClass()) != (obj.getClass()))
			return false;
		
		return id.equals(((com.google.javascript.rhino.InputId) (obj)).id);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "InputId: " + (getIdName());
	}
}


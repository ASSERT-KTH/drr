

package org.apache.commons.lang;


public class IllegalClassException extends java.lang.IllegalArgumentException {
	private static final long serialVersionUID = 8063272569377254819L;

	public IllegalClassException(java.lang.Class expected, java.lang.Object actual) {
		super(((("Expected: " + (org.apache.commons.lang.IllegalClassException.safeGetClassName(expected))) + ", actual: ") + (actual == null ? "null" : actual.getClass().getName())));
	}

	public IllegalClassException(java.lang.Class expected, java.lang.Class actual) {
		super(((("Expected: " + (org.apache.commons.lang.IllegalClassException.safeGetClassName(expected))) + ", actual: ") + (org.apache.commons.lang.IllegalClassException.safeGetClassName(actual))));
	}

	public IllegalClassException(java.lang.String message) {
		super(message);
	}

	private static final java.lang.String safeGetClassName(java.lang.Class cls) {
		return cls == null ? null : cls.getName();
	}
}


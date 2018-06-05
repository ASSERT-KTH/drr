

package org.apache.commons.lang;


public class IncompleteArgumentException extends java.lang.IllegalArgumentException {
	private static final long serialVersionUID = 4954193403612068178L;

	public IncompleteArgumentException(java.lang.String argName) {
		super((argName + " is incomplete."));
	}

	public IncompleteArgumentException(java.lang.String argName, java.lang.String[] items) {
		super(((argName + " is missing the following items: ") + (org.apache.commons.lang.IncompleteArgumentException.safeArrayToString(items))));
	}

	private static final java.lang.String safeArrayToString(java.lang.Object[] array) {
		return array == null ? null : java.util.Arrays.asList(array).toString();
	}
}




package org.apache.commons.lang;


public class NullArgumentException extends java.lang.IllegalArgumentException {
	private static final long serialVersionUID = 1174360235354917591L;

	public NullArgumentException(java.lang.String argName) {
		super(((argName == null ? "Argument" : argName) + " must not be null."));
	}
}


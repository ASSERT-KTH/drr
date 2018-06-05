

package org.apache.commons.math.linear;


public class MatrixIndexException extends org.apache.commons.math.MathRuntimeException {
	private static final long serialVersionUID = 8120540015829487660L;

	@java.lang.Deprecated
	public MatrixIndexException(final java.lang.String pattern, final java.lang.Object... arguments) {
		this(new org.apache.commons.math.exception.util.DummyLocalizable(pattern), arguments);
	}

	public MatrixIndexException(final org.apache.commons.math.exception.util.Localizable pattern, final java.lang.Object... arguments) {
		super(pattern, arguments);
	}
}


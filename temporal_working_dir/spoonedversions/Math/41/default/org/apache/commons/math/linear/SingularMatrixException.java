

package org.apache.commons.math.linear;


public class SingularMatrixException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -4206514844735401070L;

	public SingularMatrixException() {
		super(org.apache.commons.math.exception.util.LocalizedFormats.SINGULAR_MATRIX);
	}
}


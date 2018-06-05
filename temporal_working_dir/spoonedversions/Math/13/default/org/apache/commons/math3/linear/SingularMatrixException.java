

package org.apache.commons.math3.linear;


public class SingularMatrixException extends org.apache.commons.math3.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -4206514844735401070L;

	public SingularMatrixException() {
		super(org.apache.commons.math3.exception.util.LocalizedFormats.SINGULAR_MATRIX);
	}
}


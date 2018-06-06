

package org.apache.commons.math.linear;


public class SingularMatrixException extends org.apache.commons.math.linear.InvalidMatrixException {
	private static final long serialVersionUID = -7379143356784298432L;

	public SingularMatrixException() {
		super(org.apache.commons.math.util.LocalizedFormats.SINGULAR_MATRIX);
	}
}




package org.apache.commons.math.linear;


public class IllConditionedOperatorException extends org.apache.commons.math.exception.MathIllegalArgumentException {
	private static final long serialVersionUID = -7883263944530490135L;

	public IllConditionedOperatorException(final double cond) {
		super(org.apache.commons.math.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR, cond);
	}
}


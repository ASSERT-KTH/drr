

package org.apache.commons.math.exception;


public class MathParseException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathParseException(java.lang.String wrong, int position, java.lang.Class<?> type) {
		super(null, null, org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE, wrong, new java.lang.Integer(position), type.getName());
	}

	public MathParseException(java.lang.String wrong, int position) {
		super(null, null, org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_PARSE, wrong, new java.lang.Integer(position));
	}
}


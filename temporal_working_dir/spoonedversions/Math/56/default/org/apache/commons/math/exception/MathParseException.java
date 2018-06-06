

package org.apache.commons.math.exception;


public class MathParseException extends org.apache.commons.math.exception.MathRuntimeException {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathParseException(java.lang.String wrong, int position, java.lang.Class<?> type) {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE, wrong, java.lang.Integer.valueOf(position), type.getName());
	}

	public MathParseException(java.lang.String wrong, int position) {
		addMessage(org.apache.commons.math.exception.util.LocalizedFormats.CANNOT_PARSE, wrong, java.lang.Integer.valueOf(position));
	}
}


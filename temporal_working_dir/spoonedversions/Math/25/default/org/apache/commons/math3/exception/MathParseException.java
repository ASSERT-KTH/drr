

package org.apache.commons.math3.exception;


public class MathParseException extends org.apache.commons.math3.exception.MathIllegalStateException implements org.apache.commons.math3.exception.util.ExceptionContextProvider {
	private static final long serialVersionUID = -6024911025449780478L;

	public MathParseException(java.lang.String wrong, int position, java.lang.Class<?> type) {
		getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE_AS_TYPE, wrong, java.lang.Integer.valueOf(position), type.getName());
	}

	public MathParseException(java.lang.String wrong, int position) {
		getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_PARSE, wrong, java.lang.Integer.valueOf(position));
	}
}


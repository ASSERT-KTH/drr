

package org.apache.commons.math.exception;


public class MathIllegalArgumentException extends java.lang.IllegalArgumentException {
	private static final long serialVersionUID = -6024911025449780478L;

	private final org.apache.commons.math.exception.Localizable specific;

	private final org.apache.commons.math.exception.Localizable general;

	private final java.lang.Object[] arguments;

	protected MathIllegalArgumentException(org.apache.commons.math.exception.Localizable specific, org.apache.commons.math.exception.Localizable general, java.lang.Object... args) {
		this.specific = specific;
		this.general = general;
		arguments = flatten(args).toArray();
	}

	protected MathIllegalArgumentException(org.apache.commons.math.exception.Localizable general, java.lang.Object... args) {
		this(null, general, args);
	}

	public java.lang.String getMessage(final java.util.Locale locale) {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		if ((specific) != null) {
			sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(locale, specific, arguments));
			sb.append(": ");
		}
		sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(locale, general, arguments));
		return sb.toString();
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		return getMessage(java.util.Locale.US);
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		return getMessage(java.util.Locale.getDefault());
	}

	private java.util.List<java.lang.Object> flatten(java.lang.Object[] array) {
		final java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
		if (array != null) {
			for (java.lang.Object o : array) {
				if (o instanceof java.lang.Object[]) {
					list.addAll(flatten(((java.lang.Object[]) (o))));
				}else {
					list.add(o);
				}
			}
		}
		return list;
	}
}


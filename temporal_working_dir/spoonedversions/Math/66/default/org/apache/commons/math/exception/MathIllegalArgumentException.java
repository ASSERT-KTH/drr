

package org.apache.commons.math.exception;


public class MathIllegalArgumentException extends java.lang.IllegalArgumentException {
	private final org.apache.commons.math.util.Localizable specific;

	private final org.apache.commons.math.util.Localizable general;

	private final java.lang.Object[] arguments;

	protected MathIllegalArgumentException(org.apache.commons.math.util.Localizable specific, org.apache.commons.math.util.Localizable general, java.lang.Object... args) {
		this.specific = specific;
		this.general = general;
		arguments = flatten(args).toArray();
	}

	protected MathIllegalArgumentException(org.apache.commons.math.util.Localizable general, java.lang.Object... args) {
		this(null, general, args);
	}

	@java.lang.Override
	public java.lang.String getMessage() {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		if ((specific) != null) {
			sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(java.util.Locale.US, specific, arguments));
			sb.append(": ");
		}
		sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(java.util.Locale.US, general, arguments));
		return sb.toString();
	}

	@java.lang.Override
	public java.lang.String getLocalizedMessage() {
		final java.lang.StringBuilder sb = new java.lang.StringBuilder();
		if ((specific) != null) {
			sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(java.util.Locale.getDefault(), specific, arguments));
			sb.append(": ");
		}
		sb.append(org.apache.commons.math.exception.MessageFactory.buildMessage(java.util.Locale.getDefault(), general, arguments));
		return sb.toString();
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


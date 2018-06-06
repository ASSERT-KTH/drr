

package org.apache.commons.math.ode.events;


public class EventException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -898215297400035290L;

	@java.lang.Deprecated
	public EventException(final java.lang.String specifier, final java.lang.Object... parts) {
		super(specifier, parts);
	}

	public EventException(final org.apache.commons.math.util.Localizable specifier, final java.lang.Object... parts) {
		super(specifier, parts);
	}

	public EventException(final java.lang.Throwable cause) {
		super(cause);
	}
}




package org.apache.commons.math.estimation;


@java.lang.Deprecated
public class EstimationException extends org.apache.commons.math.MathException {
	private static final long serialVersionUID = -573038581493881337L;

	public EstimationException(java.lang.String specifier, java.lang.Object... parts) {
		this(new org.apache.commons.math.exception.util.DummyLocalizable(specifier), parts);
	}

	public EstimationException(org.apache.commons.math.exception.util.Localizable specifier, java.lang.Object... parts) {
		super(specifier, parts);
	}
}


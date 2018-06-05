

package org.apache.commons.math.exception.util;


public class DummyLocalizable implements org.apache.commons.math.exception.util.Localizable {
	private static final long serialVersionUID = 8843275624471387299L;

	private final java.lang.String source;

	public DummyLocalizable(final java.lang.String source) {
		this.source = source;
	}

	public java.lang.String getSourceString() {
		return source;
	}

	public java.lang.String getLocalizedString(java.util.Locale locale) {
		return source;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return source;
	}
}


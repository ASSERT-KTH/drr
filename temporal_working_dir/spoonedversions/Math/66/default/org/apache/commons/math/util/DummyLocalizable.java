

package org.apache.commons.math.util;


public class DummyLocalizable implements org.apache.commons.math.util.Localizable {
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

	public java.lang.String toString() {
		return source;
	}
}


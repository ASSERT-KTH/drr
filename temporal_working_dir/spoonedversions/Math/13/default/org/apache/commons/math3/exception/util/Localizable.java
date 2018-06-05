

package org.apache.commons.math3.exception.util;


public interface Localizable extends java.io.Serializable {
	java.lang.String getSourceString();

	java.lang.String getLocalizedString(java.util.Locale locale);
}


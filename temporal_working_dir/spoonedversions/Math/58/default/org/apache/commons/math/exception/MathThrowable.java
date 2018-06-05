

package org.apache.commons.math.exception;


public interface MathThrowable {
	org.apache.commons.math.exception.util.Localizable getSpecificPattern();

	org.apache.commons.math.exception.util.Localizable getGeneralPattern();

	java.lang.Object[] getArguments();

	java.lang.String getMessage(final java.util.Locale locale);

	java.lang.String getMessage();

	java.lang.String getLocalizedMessage();
}


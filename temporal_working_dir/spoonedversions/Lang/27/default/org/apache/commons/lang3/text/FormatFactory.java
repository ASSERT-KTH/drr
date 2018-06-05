

package org.apache.commons.lang3.text;


public interface FormatFactory {
	java.text.Format getFormat(java.lang.String name, java.lang.String arguments, java.util.Locale locale);
}


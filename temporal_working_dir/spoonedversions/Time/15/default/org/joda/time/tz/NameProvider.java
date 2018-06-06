

package org.joda.time.tz;


public interface NameProvider {
	java.lang.String getShortName(java.util.Locale locale, java.lang.String id, java.lang.String nameKey);

	java.lang.String getName(java.util.Locale locale, java.lang.String id, java.lang.String nameKey);
}




package org.joda.time.tz;


public interface Provider {
	org.joda.time.DateTimeZone getZone(java.lang.String id);

	java.util.Set<java.lang.String> getAvailableIDs();
}


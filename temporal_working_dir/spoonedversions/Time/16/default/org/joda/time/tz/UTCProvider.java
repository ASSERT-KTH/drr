

package org.joda.time.tz;


public final class UTCProvider implements org.joda.time.tz.Provider {
	public UTCProvider() {
		super();
	}

	public org.joda.time.DateTimeZone getZone(java.lang.String id) {
		if ("UTC".equalsIgnoreCase(id)) {
			return org.joda.time.DateTimeZone.UTC;
		}
		return null;
	}

	public java.util.Set<java.lang.String> getAvailableIDs() {
		return java.util.Collections.singleton("UTC");
	}
}


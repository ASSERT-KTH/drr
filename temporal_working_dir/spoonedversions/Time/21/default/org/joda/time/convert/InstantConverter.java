

package org.joda.time.convert;


public interface InstantConverter extends org.joda.time.convert.Converter {
	org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone);

	org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono);

	long getInstantMillis(java.lang.Object object, org.joda.time.Chronology chrono);
}


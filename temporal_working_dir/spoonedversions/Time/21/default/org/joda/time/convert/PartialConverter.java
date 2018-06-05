

package org.joda.time.convert;


public interface PartialConverter extends org.joda.time.convert.Converter {
	org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.DateTimeZone zone);

	org.joda.time.Chronology getChronology(java.lang.Object object, org.joda.time.Chronology chrono);

	int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono);

	int[] getPartialValues(org.joda.time.ReadablePartial fieldSource, java.lang.Object object, org.joda.time.Chronology chrono, org.joda.time.format.DateTimeFormatter parser);
}


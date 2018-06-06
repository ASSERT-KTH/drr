

package org.joda.time.format;


public interface DateTimePrinter {
	int estimatePrintedLength();

	void printTo(java.lang.StringBuffer buf, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale);

	void printTo(java.io.Writer out, long instant, org.joda.time.Chronology chrono, int displayOffset, org.joda.time.DateTimeZone displayZone, java.util.Locale locale) throws java.io.IOException;

	void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePartial partial, java.util.Locale locale);

	void printTo(java.io.Writer out, org.joda.time.ReadablePartial partial, java.util.Locale locale) throws java.io.IOException;
}


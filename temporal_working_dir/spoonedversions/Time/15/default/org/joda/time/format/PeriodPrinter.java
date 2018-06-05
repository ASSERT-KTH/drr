

package org.joda.time.format;


public interface PeriodPrinter {
	int calculatePrintedLength(org.joda.time.ReadablePeriod period, java.util.Locale locale);

	int countFieldsToPrint(org.joda.time.ReadablePeriod period, int stopAt, java.util.Locale locale);

	void printTo(java.lang.StringBuffer buf, org.joda.time.ReadablePeriod period, java.util.Locale locale);

	void printTo(java.io.Writer out, org.joda.time.ReadablePeriod period, java.util.Locale locale) throws java.io.IOException;
}




package org.joda.time.convert;


public interface PeriodConverter extends org.joda.time.convert.Converter {
	void setInto(org.joda.time.ReadWritablePeriod period, java.lang.Object object, org.joda.time.Chronology chrono);

	org.joda.time.PeriodType getPeriodType(java.lang.Object object);
}


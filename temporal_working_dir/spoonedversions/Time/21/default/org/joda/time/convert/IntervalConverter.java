

package org.joda.time.convert;


public interface IntervalConverter extends org.joda.time.convert.Converter {
	boolean isReadableInterval(java.lang.Object object, org.joda.time.Chronology chrono);

	void setInto(org.joda.time.ReadWritableInterval writableInterval, java.lang.Object object, org.joda.time.Chronology chrono);
}


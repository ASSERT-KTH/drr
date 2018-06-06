

package org.jfree.chart.axis;


public interface Timeline {
	long toTimelineValue(long millisecond);

	long toTimelineValue(java.util.Date date);

	long toMillisecond(long timelineValue);

	boolean containsDomainValue(long millisecond);

	boolean containsDomainValue(java.util.Date date);

	boolean containsDomainRange(long fromMillisecond, long toMillisecond);

	boolean containsDomainRange(java.util.Date fromDate, java.util.Date toDate);
}


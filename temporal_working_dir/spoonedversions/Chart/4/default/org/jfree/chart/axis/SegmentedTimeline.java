

package org.jfree.chart.axis;


public class SegmentedTimeline implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.axis.Timeline {
	private static final long serialVersionUID = 1093779862539903110L;

	public static final long DAY_SEGMENT_SIZE = ((24 * 60) * 60) * 1000;

	public static final long HOUR_SEGMENT_SIZE = (60 * 60) * 1000;

	public static final long FIFTEEN_MINUTE_SEGMENT_SIZE = (15 * 60) * 1000;

	public static final long MINUTE_SEGMENT_SIZE = 60 * 1000;

	public static long FIRST_MONDAY_AFTER_1900;

	public static java.util.TimeZone NO_DST_TIME_ZONE;

	public static java.util.TimeZone DEFAULT_TIME_ZONE = java.util.TimeZone.getDefault();

	private java.util.Calendar workingCalendarNoDST;

	private java.util.Calendar workingCalendar = java.util.Calendar.getInstance();

	private long segmentSize;

	private int segmentsIncluded;

	private int segmentsExcluded;

	private int groupSegmentCount;

	private long startTime;

	private long segmentsIncludedSize;

	private long segmentsExcludedSize;

	private long segmentsGroupSize;

	private java.util.List exceptionSegments = new java.util.ArrayList();

	private org.jfree.chart.axis.SegmentedTimeline baseTimeline;

	private boolean adjustForDaylightSaving = false;

	static {
		int offset = java.util.TimeZone.getDefault().getRawOffset();
		org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE = new java.util.SimpleTimeZone(offset, ("UTC-" + offset));
		java.util.Calendar cal = new java.util.GregorianCalendar(org.jfree.chart.axis.SegmentedTimeline.NO_DST_TIME_ZONE);
		cal.set(1900, 0, 1, 0, 0, 0);
		cal.set(java.util.Calendar.MILLISECOND, 0);
		while ((cal.get(java.util.Calendar.DAY_OF_WEEK)) != (java.util.Calendar.MONDAY)) {
			cal.add(java.util.Calendar.DATE, 1);
		} 
		org.jfree.chart.axis.SegmentedTimeline.FIRST_MONDAY_AFTER_1900 = cal.getTime().getTime();
	}

	public SegmentedTimeline(long segmentSize, int segmentsIncluded, int segmentsExcluded) {
		org.jfree.chart.axis.SegmentedTimeline.this.segmentSize = segmentSize;
		org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded = segmentsIncluded;
		org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcluded = segmentsExcluded;
		org.jfree.chart.axis.SegmentedTimeline.this.groupSegmentCount = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded) + (org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcluded);
		org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded) * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize);
		org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcludedSize = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcluded) * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize);
		org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize) + (org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcludedSize);
		int offset = java.util.TimeZone.getDefault().getRawOffset();
		java.util.TimeZone z = new java.util.SimpleTimeZone(offset, ("UTC-" + offset));
		org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST = new java.util.GregorianCalendar(z, java.util.Locale.getDefault());
	}

	public static long firstMondayAfter1900() {
		int offset = java.util.TimeZone.getDefault().getRawOffset();
		java.util.TimeZone z = new java.util.SimpleTimeZone(offset, ("UTC-" + offset));
		java.util.Calendar cal = new java.util.GregorianCalendar(z);
		cal.set(1900, 0, 1, 0, 0, 0);
		cal.set(java.util.Calendar.MILLISECOND, 0);
		while ((cal.get(java.util.Calendar.DAY_OF_WEEK)) != (java.util.Calendar.MONDAY)) {
			cal.add(java.util.Calendar.DATE, 1);
		} 
		return cal.getTime().getTime();
	}

	public static org.jfree.chart.axis.SegmentedTimeline newMondayThroughFridayTimeline() {
		org.jfree.chart.axis.SegmentedTimeline timeline = new org.jfree.chart.axis.SegmentedTimeline(org.jfree.chart.axis.SegmentedTimeline.DAY_SEGMENT_SIZE, 5, 2);
		timeline.setStartTime(org.jfree.chart.axis.SegmentedTimeline.firstMondayAfter1900());
		return timeline;
	}

	public static org.jfree.chart.axis.SegmentedTimeline newFifteenMinuteTimeline() {
		org.jfree.chart.axis.SegmentedTimeline timeline = new org.jfree.chart.axis.SegmentedTimeline(org.jfree.chart.axis.SegmentedTimeline.FIFTEEN_MINUTE_SEGMENT_SIZE, 28, 68);
		timeline.setStartTime(((org.jfree.chart.axis.SegmentedTimeline.firstMondayAfter1900()) + (36 * (timeline.getSegmentSize()))));
		timeline.setBaseTimeline(org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline());
		return timeline;
	}

	public boolean getAdjustForDaylightSaving() {
		return org.jfree.chart.axis.SegmentedTimeline.this.adjustForDaylightSaving;
	}

	public void setAdjustForDaylightSaving(boolean adjust) {
		org.jfree.chart.axis.SegmentedTimeline.this.adjustForDaylightSaving = adjust;
	}

	public void setStartTime(long millisecond) {
		org.jfree.chart.axis.SegmentedTimeline.this.startTime = millisecond;
	}

	public long getStartTime() {
		return org.jfree.chart.axis.SegmentedTimeline.this.startTime;
	}

	public int getSegmentsExcluded() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcluded;
	}

	public long getSegmentsExcludedSize() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcludedSize;
	}

	public int getGroupSegmentCount() {
		return org.jfree.chart.axis.SegmentedTimeline.this.groupSegmentCount;
	}

	public long getSegmentsGroupSize() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize;
	}

	public int getSegmentsIncluded() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded;
	}

	public long getSegmentsIncludedSize() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize;
	}

	public long getSegmentSize() {
		return org.jfree.chart.axis.SegmentedTimeline.this.segmentSize;
	}

	public java.util.List getExceptionSegments() {
		return java.util.Collections.unmodifiableList(org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments);
	}

	public void setExceptionSegments(java.util.List exceptionSegments) {
		org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments = exceptionSegments;
	}

	public org.jfree.chart.axis.SegmentedTimeline getBaseTimeline() {
		return org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline;
	}

	public void setBaseTimeline(org.jfree.chart.axis.SegmentedTimeline baseTimeline) {
		if (baseTimeline != null) {
			if ((baseTimeline.getSegmentSize()) < (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) {
				throw new java.lang.IllegalArgumentException(("baseTimeline.getSegmentSize() " + "is smaller than segmentSize"));
			}else
				if ((baseTimeline.getStartTime()) > (org.jfree.chart.axis.SegmentedTimeline.this.startTime)) {
					throw new java.lang.IllegalArgumentException("baseTimeline.getStartTime() is after startTime");
				}else
					if (((baseTimeline.getSegmentSize()) % (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) != 0) {
						throw new java.lang.IllegalArgumentException(("baseTimeline.getSegmentSize() is not multiple of " + "segmentSize"));
					}else
						if ((((org.jfree.chart.axis.SegmentedTimeline.this.startTime) - (baseTimeline.getStartTime())) % (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) != 0) {
							throw new java.lang.IllegalArgumentException("baseTimeline is not aligned");
						}
					
				
			
		}
		org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline = baseTimeline;
	}

	public long toTimelineValue(long millisecond) {
		long result;
		long rawMilliseconds = millisecond - (org.jfree.chart.axis.SegmentedTimeline.this.startTime);
		long groupMilliseconds = rawMilliseconds % (org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize);
		long groupIndex = rawMilliseconds / (org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize);
		if (groupMilliseconds >= (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize)) {
			result = toTimelineValue(((org.jfree.chart.axis.SegmentedTimeline.this.startTime) + ((org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize) * (groupIndex + 1))));
		}else {
			org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(millisecond);
			if (segment.inExceptionSegments()) {
				int p;
				while ((p = binarySearchExceptionSegments(segment)) >= 0) {
					segment = getSegment((millisecond = (((org.jfree.chart.axis.SegmentedTimeline.Segment) (org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments.get(p))).getSegmentEnd()) + 1));
				} 
				result = toTimelineValue(millisecond);
			}else {
				long shiftedSegmentedValue = millisecond - (org.jfree.chart.axis.SegmentedTimeline.this.startTime);
				long x = shiftedSegmentedValue % (org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize);
				long y = shiftedSegmentedValue / (org.jfree.chart.axis.SegmentedTimeline.this.segmentsGroupSize);
				long wholeExceptionsBeforeDomainValue = getExceptionSegmentCount(org.jfree.chart.axis.SegmentedTimeline.this.startTime, (millisecond - 1));
				if (x < (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize)) {
					result = (((org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize) * y) + x) - (wholeExceptionsBeforeDomainValue * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize));
				}else {
					result = ((org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize) * (y + 1)) - (wholeExceptionsBeforeDomainValue * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize));
				}
			}
		}
		return result;
	}

	public long toTimelineValue(java.util.Date date) {
		return toTimelineValue(getTime(date));
	}

	public long toMillisecond(long timelineValue) {
		org.jfree.chart.axis.SegmentedTimeline.Segment result = new org.jfree.chart.axis.SegmentedTimeline.Segment((((org.jfree.chart.axis.SegmentedTimeline.this.startTime) + timelineValue) + ((timelineValue / (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncludedSize)) * (org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcludedSize))));
		long lastIndex = org.jfree.chart.axis.SegmentedTimeline.this.startTime;
		while (lastIndex <= (result.segmentStart)) {
			long exceptionSegmentCount;
			while ((exceptionSegmentCount = getExceptionSegmentCount(lastIndex, ((((result.millisecond) / (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) - 1))) > 0) {
				lastIndex = result.segmentStart;
				for (int i = 0; i < exceptionSegmentCount; i++) {
					do {
						result.inc();
					} while (result.inExcludeSegments() );
				}
			} 
			lastIndex = result.segmentStart;
			while ((result.inExceptionSegments()) || (result.inExcludeSegments())) {
				result.inc();
				lastIndex += org.jfree.chart.axis.SegmentedTimeline.this.segmentSize;
			} 
			lastIndex++;
		} 
		return getTimeFromLong(result.millisecond);
	}

	public long getTimeFromLong(long date) {
		long result = date;
		if (org.jfree.chart.axis.SegmentedTimeline.this.adjustForDaylightSaving) {
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.setTime(new java.util.Date(date));
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.set(org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.YEAR), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.MONTH), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.DATE), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.HOUR_OF_DAY), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.MINUTE), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.SECOND));
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.set(java.util.Calendar.MILLISECOND, org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.get(java.util.Calendar.MILLISECOND));
			result = org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.getTime().getTime();
		}
		return result;
	}

	public boolean containsDomainValue(long millisecond) {
		org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(millisecond);
		return segment.inIncludeSegments();
	}

	public boolean containsDomainValue(java.util.Date date) {
		return containsDomainValue(getTime(date));
	}

	public boolean containsDomainRange(long domainValueStart, long domainValueEnd) {
		if (domainValueEnd < domainValueStart) {
			throw new java.lang.IllegalArgumentException((((("domainValueEnd (" + domainValueEnd) + ") < domainValueStart (") + domainValueStart) + ")"));
		}
		org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(domainValueStart);
		boolean contains = true;
		do {
			contains = segment.inIncludeSegments();
			if (segment.contains(domainValueEnd)) {
				break;
			}else {
				segment.inc();
			}
		} while (contains );
		return contains;
	}

	public boolean containsDomainRange(java.util.Date dateDomainValueStart, java.util.Date dateDomainValueEnd) {
		return containsDomainRange(getTime(dateDomainValueStart), getTime(dateDomainValueEnd));
	}

	public void addException(long millisecond) {
		addException(new org.jfree.chart.axis.SegmentedTimeline.Segment(millisecond));
	}

	public void addException(long fromDomainValue, long toDomainValue) {
		addException(new org.jfree.chart.axis.SegmentedTimeline.SegmentRange(fromDomainValue, toDomainValue));
	}

	public void addException(java.util.Date exceptionDate) {
		addException(getTime(exceptionDate));
	}

	public void addExceptions(java.util.List exceptionList) {
		for (java.util.Iterator iter = exceptionList.iterator(); iter.hasNext();) {
			addException(((java.util.Date) (iter.next())));
		}
	}

	private void addException(org.jfree.chart.axis.SegmentedTimeline.Segment segment) {
		if (segment.inIncludeSegments()) {
			int p = binarySearchExceptionSegments(segment);
			org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments.add((-(p + 1)), segment);
		}
	}

	public void addBaseTimelineException(long domainValue) {
		org.jfree.chart.axis.SegmentedTimeline.Segment baseSegment = org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline.getSegment(domainValue);
		if (baseSegment.inIncludeSegments()) {
			org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(baseSegment.getSegmentStart());
			while ((segment.getSegmentStart()) <= (baseSegment.getSegmentEnd())) {
				if (segment.inIncludeSegments()) {
					long fromDomainValue = segment.getSegmentStart();
					long toDomainValue;
					do {
						toDomainValue = segment.getSegmentEnd();
						segment.inc();
					} while (segment.inIncludeSegments() );
					addException(fromDomainValue, toDomainValue);
				}else {
					segment.inc();
				}
			} 
		}
	}

	public void addBaseTimelineException(java.util.Date date) {
		addBaseTimelineException(getTime(date));
	}

	public void addBaseTimelineExclusions(long fromBaseDomainValue, long toBaseDomainValue) {
		org.jfree.chart.axis.SegmentedTimeline.Segment baseSegment = org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline.getSegment(fromBaseDomainValue);
		while (((baseSegment.getSegmentStart()) <= toBaseDomainValue) && (!(baseSegment.inExcludeSegments()))) {
			baseSegment.inc();
		} 
		while ((baseSegment.getSegmentStart()) <= toBaseDomainValue) {
			long baseExclusionRangeEnd = ((baseSegment.getSegmentStart()) + ((org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline.getSegmentsExcluded()) * (org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline.getSegmentSize()))) - 1;
			org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(baseSegment.getSegmentStart());
			while ((segment.getSegmentStart()) <= baseExclusionRangeEnd) {
				if (segment.inIncludeSegments()) {
					long fromDomainValue = segment.getSegmentStart();
					long toDomainValue;
					do {
						toDomainValue = segment.getSegmentEnd();
						segment.inc();
					} while (segment.inIncludeSegments() );
					addException(new org.jfree.chart.axis.SegmentedTimeline.BaseTimelineSegmentRange(fromDomainValue, toDomainValue));
				}else {
					segment.inc();
				}
			} 
			baseSegment.inc(org.jfree.chart.axis.SegmentedTimeline.this.baseTimeline.getGroupSegmentCount());
		} 
	}

	public long getExceptionSegmentCount(long fromMillisecond, long toMillisecond) {
		if (toMillisecond < fromMillisecond) {
			return 0;
		}
		int n = 0;
		for (java.util.Iterator iter = org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments.iterator(); iter.hasNext();) {
			org.jfree.chart.axis.SegmentedTimeline.Segment segment = ((org.jfree.chart.axis.SegmentedTimeline.Segment) (iter.next()));
			org.jfree.chart.axis.SegmentedTimeline.Segment intersection = segment.intersect(fromMillisecond, toMillisecond);
			if (intersection != null) {
				n += intersection.getSegmentCount();
			}
		}
		return n;
	}

	public org.jfree.chart.axis.SegmentedTimeline.Segment getSegment(long millisecond) {
		return new org.jfree.chart.axis.SegmentedTimeline.Segment(millisecond);
	}

	public org.jfree.chart.axis.SegmentedTimeline.Segment getSegment(java.util.Date date) {
		return getSegment(getTime(date));
	}

	private boolean equals(java.lang.Object o, java.lang.Object p) {
		return (o == p) || ((o != null) && (o.equals(p)));
	}

	public boolean equals(java.lang.Object o) {
		if (o instanceof org.jfree.chart.axis.SegmentedTimeline) {
			org.jfree.chart.axis.SegmentedTimeline other = ((org.jfree.chart.axis.SegmentedTimeline) (o));
			boolean b0 = (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize) == (other.getSegmentSize());
			boolean b1 = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded) == (other.getSegmentsIncluded());
			boolean b2 = (org.jfree.chart.axis.SegmentedTimeline.this.segmentsExcluded) == (other.getSegmentsExcluded());
			boolean b3 = (org.jfree.chart.axis.SegmentedTimeline.this.startTime) == (other.getStartTime());
			boolean b4 = equals(org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments, other.getExceptionSegments());
			return (((b0 && b1) && b2) && b3) && b4;
		}else {
			return false;
		}
	}

	public int hashCode() {
		int result = 19;
		result = (37 * result) + ((int) ((org.jfree.chart.axis.SegmentedTimeline.this.segmentSize) ^ ((org.jfree.chart.axis.SegmentedTimeline.this.segmentSize) >>> 32)));
		result = (37 * result) + ((int) ((org.jfree.chart.axis.SegmentedTimeline.this.startTime) ^ ((org.jfree.chart.axis.SegmentedTimeline.this.startTime) >>> 32)));
		return result;
	}

	private int binarySearchExceptionSegments(org.jfree.chart.axis.SegmentedTimeline.Segment segment) {
		int low = 0;
		int high = (org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments.size()) - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			org.jfree.chart.axis.SegmentedTimeline.Segment midSegment = ((org.jfree.chart.axis.SegmentedTimeline.Segment) (org.jfree.chart.axis.SegmentedTimeline.this.exceptionSegments.get(mid)));
			if ((segment.contains(midSegment)) || (midSegment.contains(segment))) {
				return mid;
			}
			if (midSegment.before(segment)) {
				low = mid + 1;
			}else
				if (midSegment.after(segment)) {
					high = mid - 1;
				}else {
					throw new java.lang.IllegalStateException("Invalid condition.");
				}
			
		} 
		return -(low + 1);
	}

	public long getTime(java.util.Date date) {
		long result = date.getTime();
		if (org.jfree.chart.axis.SegmentedTimeline.this.adjustForDaylightSaving) {
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.setTime(date);
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.set(org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.YEAR), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.MONTH), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.DATE), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.HOUR_OF_DAY), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.MINUTE), org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.SECOND));
			org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.set(java.util.Calendar.MILLISECOND, org.jfree.chart.axis.SegmentedTimeline.this.workingCalendar.get(java.util.Calendar.MILLISECOND));
			java.util.Date revisedDate = org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.getTime();
			result = revisedDate.getTime();
		}
		return result;
	}

	public java.util.Date getDate(long value) {
		org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.setTime(new java.util.Date(value));
		return org.jfree.chart.axis.SegmentedTimeline.this.workingCalendarNoDST.getTime();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.SegmentedTimeline clone = ((org.jfree.chart.axis.SegmentedTimeline) (super.clone()));
		return clone;
	}

	public class Segment implements java.io.Serializable , java.lang.Cloneable , java.lang.Comparable {
		protected long segmentNumber;

		protected long segmentStart;

		protected long segmentEnd;

		protected long millisecond;

		protected Segment() {
		}

		protected Segment(long millisecond) {
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber = calculateSegmentNumber(millisecond);
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart = (org.jfree.chart.axis.SegmentedTimeline.this.startTime) + ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber) * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize));
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd = ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart) + (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) - 1;
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond = millisecond;
		}

		public long calculateSegmentNumber(long millis) {
			if (millis >= (org.jfree.chart.axis.SegmentedTimeline.this.startTime)) {
				return (millis - (org.jfree.chart.axis.SegmentedTimeline.this.startTime)) / (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize);
			}else {
				return ((millis - (org.jfree.chart.axis.SegmentedTimeline.this.startTime)) / (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize)) - 1;
			}
		}

		public long getSegmentNumber() {
			return org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber;
		}

		public long getSegmentCount() {
			return 1;
		}

		public long getSegmentStart() {
			return org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart;
		}

		public long getSegmentEnd() {
			return org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd;
		}

		public long getMillisecond() {
			return org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond;
		}

		public java.util.Date getDate() {
			return org.jfree.chart.axis.SegmentedTimeline.this.getDate(org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond);
		}

		public boolean contains(long millis) {
			return ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart) <= millis) && (millis <= (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd));
		}

		public boolean contains(long from, long to) {
			return ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart) <= from) && (to <= (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd));
		}

		public boolean contains(org.jfree.chart.axis.SegmentedTimeline.Segment segment) {
			return contains(segment.getSegmentStart(), segment.getSegmentEnd());
		}

		public boolean contained(long from, long to) {
			return (from <= (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart)) && ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd) <= to);
		}

		public org.jfree.chart.axis.SegmentedTimeline.Segment intersect(long from, long to) {
			if ((from <= (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart)) && ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd) <= to)) {
				return org.jfree.chart.axis.SegmentedTimeline.Segment.this;
			}else {
				return null;
			}
		}

		public boolean before(org.jfree.chart.axis.SegmentedTimeline.Segment other) {
			return (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd) < (other.getSegmentStart());
		}

		public boolean after(org.jfree.chart.axis.SegmentedTimeline.Segment other) {
			return (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart) > (other.getSegmentEnd());
		}

		public boolean equals(java.lang.Object object) {
			if (object instanceof org.jfree.chart.axis.SegmentedTimeline.Segment) {
				org.jfree.chart.axis.SegmentedTimeline.Segment other = ((org.jfree.chart.axis.SegmentedTimeline.Segment) (object));
				return ((((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber) == (other.getSegmentNumber())) && ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart) == (other.getSegmentStart()))) && ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd) == (other.getSegmentEnd()))) && ((org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond) == (other.getMillisecond()));
			}else {
				return false;
			}
		}

		public org.jfree.chart.axis.SegmentedTimeline.Segment copy() {
			try {
				return ((org.jfree.chart.axis.SegmentedTimeline.Segment) (org.jfree.chart.axis.SegmentedTimeline.Segment.this.clone()));
			} catch (java.lang.CloneNotSupportedException e) {
				return null;
			}
		}

		public int compareTo(java.lang.Object object) {
			org.jfree.chart.axis.SegmentedTimeline.Segment other = ((org.jfree.chart.axis.SegmentedTimeline.Segment) (object));
			if (org.jfree.chart.axis.SegmentedTimeline.Segment.this.before(other)) {
				return -1;
			}else
				if (org.jfree.chart.axis.SegmentedTimeline.Segment.this.after(other)) {
					return +1;
				}else {
					return 0;
				}
			
		}

		public boolean inIncludeSegments() {
			if ((getSegmentNumberRelativeToGroup()) < (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded)) {
				return !(inExceptionSegments());
			}else {
				return false;
			}
		}

		public boolean inExcludeSegments() {
			return (getSegmentNumberRelativeToGroup()) >= (org.jfree.chart.axis.SegmentedTimeline.this.segmentsIncluded);
		}

		private long getSegmentNumberRelativeToGroup() {
			long p = (org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber) % (org.jfree.chart.axis.SegmentedTimeline.this.groupSegmentCount);
			if (p < 0) {
				p += org.jfree.chart.axis.SegmentedTimeline.this.groupSegmentCount;
			}
			return p;
		}

		public boolean inExceptionSegments() {
			return (binarySearchExceptionSegments(org.jfree.chart.axis.SegmentedTimeline.Segment.this)) >= 0;
		}

		public void inc(long n) {
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber += n;
			long m = n * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize);
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart += m;
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd += m;
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond += m;
		}

		public void inc() {
			inc(1);
		}

		public void dec(long n) {
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentNumber -= n;
			long m = n * (org.jfree.chart.axis.SegmentedTimeline.this.segmentSize);
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart -= m;
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd -= m;
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond -= m;
		}

		public void dec() {
			dec(1);
		}

		public void moveIndexToStart() {
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond = org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentStart;
		}

		public void moveIndexToEnd() {
			org.jfree.chart.axis.SegmentedTimeline.Segment.this.millisecond = org.jfree.chart.axis.SegmentedTimeline.Segment.this.segmentEnd;
		}
	}

	protected class SegmentRange extends org.jfree.chart.axis.SegmentedTimeline.Segment {
		private long segmentCount;

		public SegmentRange(long fromMillisecond, long toMillisecond) {
			org.jfree.chart.axis.SegmentedTimeline.Segment start = getSegment(fromMillisecond);
			org.jfree.chart.axis.SegmentedTimeline.Segment end = getSegment(toMillisecond);
			org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.millisecond = fromMillisecond;
			org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentNumber = calculateSegmentNumber(fromMillisecond);
			org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentStart = start.segmentStart;
			org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentEnd = end.segmentEnd;
			org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentCount = ((end.getSegmentNumber()) - (start.getSegmentNumber())) + 1;
		}

		public long getSegmentCount() {
			return org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentCount;
		}

		public org.jfree.chart.axis.SegmentedTimeline.Segment intersect(long from, long to) {
			long start = java.lang.Math.max(from, org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentStart);
			long end = java.lang.Math.min(to, org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentEnd);
			if (start <= end) {
				return new org.jfree.chart.axis.SegmentedTimeline.SegmentRange(start, end);
			}else {
				return null;
			}
		}

		public boolean inIncludeSegments() {
			for (org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentStart); (segment.getSegmentStart()) < (org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentEnd); segment.inc()) {
				if (!(segment.inIncludeSegments())) {
					return false;
				}
			}
			return true;
		}

		public boolean inExcludeSegments() {
			for (org.jfree.chart.axis.SegmentedTimeline.Segment segment = getSegment(org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentStart); (segment.getSegmentStart()) < (org.jfree.chart.axis.SegmentedTimeline.SegmentRange.this.segmentEnd); segment.inc()) {
				if (!(segment.inExceptionSegments())) {
					return false;
				}
			}
			return true;
		}

		public void inc(long n) {
			throw new java.lang.IllegalArgumentException("Not implemented in SegmentRange");
		}
	}

	protected class BaseTimelineSegmentRange extends org.jfree.chart.axis.SegmentedTimeline.SegmentRange {
		public BaseTimelineSegmentRange(long fromDomainValue, long toDomainValue) {
			super(fromDomainValue, toDomainValue);
		}
	}
}


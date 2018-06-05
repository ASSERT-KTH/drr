

package org.joda.time.chrono;


final class BasicWeekyearDateTimeField extends org.joda.time.field.ImpreciseDateTimeField {
	private static final long serialVersionUID = 6215066916806820644L;

	private static final long WEEK_53 = (53L - 1) * (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK);

	private final org.joda.time.chrono.BasicChronology iChronology;

	BasicWeekyearDateTimeField(org.joda.time.chrono.BasicChronology chronology) {
		super(org.joda.time.DateTimeFieldType.weekyear(), chronology.getAverageMillisPerYear());
		iChronology = chronology;
	}

	public boolean isLenient() {
		return false;
	}

	public int get(long instant) {
		return iChronology.getWeekyear(instant);
	}

	public long add(long instant, int years) {
		if (years == 0) {
			return instant;
		}
		return set(instant, ((get(instant)) + years));
	}

	public long add(long instant, long value) {
		return add(instant, org.joda.time.field.FieldUtils.safeToInt(value));
	}

	public long addWrapField(long instant, int years) {
		return add(instant, years);
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		if (minuendInstant < subtrahendInstant) {
			return -(getDifference(subtrahendInstant, minuendInstant));
		}
		int minuendWeekyear = get(minuendInstant);
		int subtrahendWeekyear = get(subtrahendInstant);
		long minuendRem = remainder(minuendInstant);
		long subtrahendRem = remainder(subtrahendInstant);
		if ((subtrahendRem >= (org.joda.time.chrono.BasicWeekyearDateTimeField.WEEK_53)) && ((iChronology.getWeeksInYear(minuendWeekyear)) <= 52)) {
			subtrahendRem -= org.joda.time.DateTimeConstants.MILLIS_PER_WEEK;
		}
		int difference = minuendWeekyear - subtrahendWeekyear;
		if (minuendRem < subtrahendRem) {
			difference--;
		}
		return difference;
	}

	public long set(long instant, int year) {
		org.joda.time.field.FieldUtils.verifyValueBounds(org.joda.time.chrono.BasicWeekyearDateTimeField.this, java.lang.Math.abs(year), iChronology.getMinYear(), iChronology.getMaxYear());
		int thisWeekyear = get(instant);
		if (thisWeekyear == year) {
			return instant;
		}
		int thisDow = iChronology.getDayOfWeek(instant);
		int weeksInFromYear = iChronology.getWeeksInYear(thisWeekyear);
		int weeksInToYear = iChronology.getWeeksInYear(year);
		int maxOutWeeks = weeksInToYear < weeksInFromYear ? weeksInToYear : weeksInFromYear;
		int setToWeek = iChronology.getWeekOfWeekyear(instant);
		if (setToWeek > maxOutWeeks) {
			setToWeek = maxOutWeeks;
		}
		long workInstant = instant;
		workInstant = iChronology.setYear(workInstant, year);
		int workWoyYear = get(workInstant);
		if (workWoyYear < year) {
			workInstant += org.joda.time.DateTimeConstants.MILLIS_PER_WEEK;
		}else
			if (workWoyYear > year) {
				workInstant -= org.joda.time.DateTimeConstants.MILLIS_PER_WEEK;
			}
		
		int currentWoyWeek = iChronology.getWeekOfWeekyear(workInstant);
		workInstant = workInstant + ((setToWeek - currentWoyWeek) * ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK)));
		workInstant = iChronology.dayOfWeek().set(workInstant, thisDow);
		return workInstant;
	}

	public org.joda.time.DurationField getRangeDurationField() {
		return null;
	}

	public boolean isLeap(long instant) {
		return (iChronology.getWeeksInYear(iChronology.getWeekyear(instant))) > 52;
	}

	public int getLeapAmount(long instant) {
		return (iChronology.getWeeksInYear(iChronology.getWeekyear(instant))) - 52;
	}

	public org.joda.time.DurationField getLeapDurationField() {
		return iChronology.weeks();
	}

	public int getMinimumValue() {
		return iChronology.getMinYear();
	}

	public int getMaximumValue() {
		return iChronology.getMaxYear();
	}

	public long roundFloor(long instant) {
		instant = iChronology.weekOfWeekyear().roundFloor(instant);
		int wow = iChronology.getWeekOfWeekyear(instant);
		if (wow > 1) {
			instant -= ((long) (org.joda.time.DateTimeConstants.MILLIS_PER_WEEK)) * (wow - 1);
		}
		return instant;
	}

	public long remainder(long instant) {
		return instant - (roundFloor(instant));
	}

	private java.lang.Object readResolve() {
		return iChronology.weekyear();
	}
}


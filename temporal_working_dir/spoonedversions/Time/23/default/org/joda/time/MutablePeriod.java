

package org.joda.time;


public class MutablePeriod extends org.joda.time.base.BasePeriod implements java.io.Serializable , java.lang.Cloneable , org.joda.time.ReadWritablePeriod {
	private static final long serialVersionUID = 3436451121567212165L;

	@org.joda.convert.FromString
	public static org.joda.time.MutablePeriod parse(java.lang.String str) {
		return org.joda.time.MutablePeriod.parse(str, org.joda.time.format.ISOPeriodFormat.standard());
	}

	public static org.joda.time.MutablePeriod parse(java.lang.String str, org.joda.time.format.PeriodFormatter formatter) {
		return formatter.parsePeriod(str).toMutablePeriod();
	}

	public MutablePeriod() {
		super(0L, null, null);
	}

	public MutablePeriod(org.joda.time.PeriodType type) {
		super(0L, type, null);
	}

	public MutablePeriod(int hours, int minutes, int seconds, int millis) {
		super(0, 0, 0, 0, hours, minutes, seconds, millis, org.joda.time.PeriodType.standard());
	}

	public MutablePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
		super(years, months, weeks, days, hours, minutes, seconds, millis, org.joda.time.PeriodType.standard());
	}

	public MutablePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, org.joda.time.PeriodType type) {
		super(years, months, weeks, days, hours, minutes, seconds, millis, type);
	}

	public MutablePeriod(long duration) {
		super(duration, null, null);
	}

	public MutablePeriod(long duration, org.joda.time.PeriodType type) {
		super(duration, type, null);
	}

	public MutablePeriod(long duration, org.joda.time.Chronology chronology) {
		super(duration, null, chronology);
	}

	public MutablePeriod(long duration, org.joda.time.PeriodType type, org.joda.time.Chronology chronology) {
		super(duration, type, chronology);
	}

	public MutablePeriod(long startInstant, long endInstant) {
		super(startInstant, endInstant, null, null);
	}

	public MutablePeriod(long startInstant, long endInstant, org.joda.time.PeriodType type) {
		super(startInstant, endInstant, type, null);
	}

	public MutablePeriod(long startInstant, long endInstant, org.joda.time.Chronology chrono) {
		super(startInstant, endInstant, null, chrono);
	}

	public MutablePeriod(long startInstant, long endInstant, org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		super(startInstant, endInstant, type, chrono);
	}

	public MutablePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableInstant endInstant) {
		super(startInstant, endInstant, null);
	}

	public MutablePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableInstant endInstant, org.joda.time.PeriodType type) {
		super(startInstant, endInstant, type);
	}

	public MutablePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableDuration duration) {
		super(startInstant, duration, null);
	}

	public MutablePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableDuration duration, org.joda.time.PeriodType type) {
		super(startInstant, duration, type);
	}

	public MutablePeriod(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant endInstant) {
		super(duration, endInstant, null);
	}

	public MutablePeriod(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant endInstant, org.joda.time.PeriodType type) {
		super(duration, endInstant, type);
	}

	public MutablePeriod(java.lang.Object period) {
		super(period, null, null);
	}

	public MutablePeriod(java.lang.Object period, org.joda.time.PeriodType type) {
		super(period, type, null);
	}

	public MutablePeriod(java.lang.Object period, org.joda.time.Chronology chrono) {
		super(period, null, chrono);
	}

	public MutablePeriod(java.lang.Object period, org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		super(period, type, chrono);
	}

	public void clear() {
		super.setValues(new int[size()]);
	}

	public void setValue(int index, int value) {
		super.setValue(index, value);
	}

	public void set(org.joda.time.DurationFieldType field, int value) {
		super.setField(field, value);
	}

	public void setPeriod(org.joda.time.ReadablePeriod period) {
		super.setPeriod(period);
	}

	public void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
		super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
	}

	public void setPeriod(org.joda.time.ReadableInterval interval) {
		if (interval == null) {
			setPeriod(0L);
		}else {
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(interval.getChronology());
			setPeriod(interval.getStartMillis(), interval.getEndMillis(), chrono);
		}
	}

	public void setPeriod(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		if (start == end) {
			setPeriod(0L);
		}else {
			long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
			long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getIntervalChronology(start, end);
			setPeriod(startMillis, endMillis, chrono);
		}
	}

	public void setPeriod(long startInstant, long endInstant) {
		setPeriod(startInstant, endInstant, null);
	}

	public void setPeriod(long startInstant, long endInstant, org.joda.time.Chronology chrono) {
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		setValues(chrono.get(org.joda.time.MutablePeriod.this, startInstant, endInstant));
	}

	public void setPeriod(org.joda.time.ReadableDuration duration) {
		setPeriod(duration, null);
	}

	public void setPeriod(org.joda.time.ReadableDuration duration, org.joda.time.Chronology chrono) {
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		setPeriod(durationMillis, chrono);
	}

	public void setPeriod(long duration) {
		setPeriod(duration, null);
	}

	public void setPeriod(long duration, org.joda.time.Chronology chrono) {
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		setValues(chrono.get(org.joda.time.MutablePeriod.this, duration));
	}

	public void add(org.joda.time.DurationFieldType field, int value) {
		super.addField(field, value);
	}

	public void add(org.joda.time.ReadablePeriod period) {
		super.addPeriod(period);
	}

	public void add(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
		setPeriod(org.joda.time.field.FieldUtils.safeAdd(getYears(), years), org.joda.time.field.FieldUtils.safeAdd(getMonths(), months), org.joda.time.field.FieldUtils.safeAdd(getWeeks(), weeks), org.joda.time.field.FieldUtils.safeAdd(getDays(), days), org.joda.time.field.FieldUtils.safeAdd(getHours(), hours), org.joda.time.field.FieldUtils.safeAdd(getMinutes(), minutes), org.joda.time.field.FieldUtils.safeAdd(getSeconds(), seconds), org.joda.time.field.FieldUtils.safeAdd(getMillis(), millis));
	}

	public void add(org.joda.time.ReadableInterval interval) {
		if (interval != null) {
			add(interval.toPeriod(getPeriodType()));
		}
	}

	public void add(org.joda.time.ReadableDuration duration) {
		if (duration != null) {
			add(new org.joda.time.Period(duration.getMillis(), getPeriodType()));
		}
	}

	public void add(long duration) {
		add(new org.joda.time.Period(duration, getPeriodType()));
	}

	public void add(long duration, org.joda.time.Chronology chrono) {
		add(new org.joda.time.Period(duration, getPeriodType(), chrono));
	}

	public void mergePeriod(org.joda.time.ReadablePeriod period) {
		super.mergePeriod(period);
	}

	public int getYears() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.YEAR_INDEX);
	}

	public int getMonths() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.MONTH_INDEX);
	}

	public int getWeeks() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.WEEK_INDEX);
	}

	public int getDays() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.DAY_INDEX);
	}

	public int getHours() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.HOUR_INDEX);
	}

	public int getMinutes() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.MINUTE_INDEX);
	}

	public int getSeconds() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.SECOND_INDEX);
	}

	public int getMillis() {
		return getPeriodType().getIndexedField(org.joda.time.MutablePeriod.this, org.joda.time.PeriodType.MILLI_INDEX);
	}

	public void setYears(int years) {
		super.setField(org.joda.time.DurationFieldType.years(), years);
	}

	public void addYears(int years) {
		super.addField(org.joda.time.DurationFieldType.years(), years);
	}

	public void setMonths(int months) {
		super.setField(org.joda.time.DurationFieldType.months(), months);
	}

	public void addMonths(int months) {
		super.addField(org.joda.time.DurationFieldType.months(), months);
	}

	public void setWeeks(int weeks) {
		super.setField(org.joda.time.DurationFieldType.weeks(), weeks);
	}

	public void addWeeks(int weeks) {
		super.addField(org.joda.time.DurationFieldType.weeks(), weeks);
	}

	public void setDays(int days) {
		super.setField(org.joda.time.DurationFieldType.days(), days);
	}

	public void addDays(int days) {
		super.addField(org.joda.time.DurationFieldType.days(), days);
	}

	public void setHours(int hours) {
		super.setField(org.joda.time.DurationFieldType.hours(), hours);
	}

	public void addHours(int hours) {
		super.addField(org.joda.time.DurationFieldType.hours(), hours);
	}

	public void setMinutes(int minutes) {
		super.setField(org.joda.time.DurationFieldType.minutes(), minutes);
	}

	public void addMinutes(int minutes) {
		super.addField(org.joda.time.DurationFieldType.minutes(), minutes);
	}

	public void setSeconds(int seconds) {
		super.setField(org.joda.time.DurationFieldType.seconds(), seconds);
	}

	public void addSeconds(int seconds) {
		super.addField(org.joda.time.DurationFieldType.seconds(), seconds);
	}

	public void setMillis(int millis) {
		super.setField(org.joda.time.DurationFieldType.millis(), millis);
	}

	public void addMillis(int millis) {
		super.addField(org.joda.time.DurationFieldType.millis(), millis);
	}

	public org.joda.time.MutablePeriod copy() {
		return ((org.joda.time.MutablePeriod) (clone()));
	}

	public java.lang.Object clone() {
		try {
			return super.clone();
		} catch (java.lang.CloneNotSupportedException ex) {
			throw new java.lang.InternalError("Clone error");
		}
	}
}


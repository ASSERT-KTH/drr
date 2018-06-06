

package org.joda.time.base;


public abstract class BaseDuration extends org.joda.time.base.AbstractDuration implements java.io.Serializable , org.joda.time.ReadableDuration {
	private static final long serialVersionUID = 2581698638990L;

	private long iMillis;

	protected BaseDuration(long duration) {
		super();
		iMillis = duration;
	}

	protected BaseDuration(long startInstant, long endInstant) {
		super();
		iMillis = org.joda.time.field.FieldUtils.safeAdd(endInstant, (-startInstant));
	}

	protected BaseDuration(org.joda.time.ReadableInstant start, org.joda.time.ReadableInstant end) {
		super();
		if (start == end) {
			iMillis = 0L;
		}else {
			long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(start);
			long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(end);
			iMillis = org.joda.time.field.FieldUtils.safeAdd(endMillis, (-startMillis));
		}
	}

	protected BaseDuration(java.lang.Object duration) {
		super();
		org.joda.time.convert.DurationConverter converter = org.joda.time.convert.ConverterManager.getInstance().getDurationConverter(duration);
		iMillis = converter.getDurationMillis(duration);
	}

	public long getMillis() {
		return iMillis;
	}

	protected void setMillis(long duration) {
		iMillis = duration;
	}

	public org.joda.time.Period toPeriod(org.joda.time.PeriodType type) {
		return new org.joda.time.Period(getMillis(), type);
	}

	public org.joda.time.Period toPeriod(org.joda.time.Chronology chrono) {
		return new org.joda.time.Period(getMillis(), chrono);
	}

	public org.joda.time.Period toPeriod(org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		return new org.joda.time.Period(getMillis(), type, chrono);
	}

	public org.joda.time.Period toPeriodFrom(org.joda.time.ReadableInstant startInstant) {
		return new org.joda.time.Period(startInstant, org.joda.time.base.BaseDuration.this);
	}

	public org.joda.time.Period toPeriodFrom(org.joda.time.ReadableInstant startInstant, org.joda.time.PeriodType type) {
		return new org.joda.time.Period(startInstant, org.joda.time.base.BaseDuration.this, type);
	}

	public org.joda.time.Period toPeriodTo(org.joda.time.ReadableInstant endInstant) {
		return new org.joda.time.Period(org.joda.time.base.BaseDuration.this, endInstant);
	}

	public org.joda.time.Period toPeriodTo(org.joda.time.ReadableInstant endInstant, org.joda.time.PeriodType type) {
		return new org.joda.time.Period(org.joda.time.base.BaseDuration.this, endInstant, type);
	}

	public org.joda.time.Interval toIntervalFrom(org.joda.time.ReadableInstant startInstant) {
		return new org.joda.time.Interval(startInstant, org.joda.time.base.BaseDuration.this);
	}

	public org.joda.time.Interval toIntervalTo(org.joda.time.ReadableInstant endInstant) {
		return new org.joda.time.Interval(org.joda.time.base.BaseDuration.this, endInstant);
	}
}


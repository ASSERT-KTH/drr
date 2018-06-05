

package org.joda.time.base;


public abstract class BasePeriod extends org.joda.time.base.AbstractPeriod implements java.io.Serializable , org.joda.time.ReadablePeriod {
	private static final long serialVersionUID = -2110953284060001145L;

	private org.joda.time.PeriodType iType;

	private int[] iValues;

	protected BasePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, org.joda.time.PeriodType type) {
		super();
		type = checkPeriodType(type);
		iType = type;
		setPeriodInternal(years, months, weeks, days, hours, minutes, seconds, millis);
	}

	protected BasePeriod(long startInstant, long endInstant, org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		super();
		type = checkPeriodType(type);
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		iType = type;
		iValues = chrono.get(org.joda.time.base.BasePeriod.this, startInstant, endInstant);
	}

	protected BasePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableInstant endInstant, org.joda.time.PeriodType type) {
		super();
		type = checkPeriodType(type);
		if ((startInstant == null) && (endInstant == null)) {
			iType = type;
			iValues = new int[size()];
		}else {
			long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(startInstant);
			long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(endInstant);
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getIntervalChronology(startInstant, endInstant);
			iType = type;
			iValues = chrono.get(org.joda.time.base.BasePeriod.this, startMillis, endMillis);
		}
	}

	protected BasePeriod(org.joda.time.ReadablePartial start, org.joda.time.ReadablePartial end, org.joda.time.PeriodType type) {
		super();
		if ((start == null) || (end == null)) {
			throw new java.lang.IllegalArgumentException("ReadablePartial objects must not be null");
		}
		if (((start instanceof org.joda.time.base.BaseLocal) && (end instanceof org.joda.time.base.BaseLocal)) && ((start.getClass()) == (end.getClass()))) {
			type = checkPeriodType(type);
			long startMillis = ((org.joda.time.base.BaseLocal) (start)).getLocalMillis();
			long endMillis = ((org.joda.time.base.BaseLocal) (end)).getLocalMillis();
			org.joda.time.Chronology chrono = start.getChronology();
			chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
			iType = type;
			iValues = chrono.get(org.joda.time.base.BasePeriod.this, startMillis, endMillis);
		}else {
			if ((start.size()) != (end.size())) {
				throw new java.lang.IllegalArgumentException("ReadablePartial objects must have the same set of fields");
			}
			for (int i = 0, isize = start.size(); i < isize; i++) {
				if ((start.getFieldType(i)) != (end.getFieldType(i))) {
					throw new java.lang.IllegalArgumentException("ReadablePartial objects must have the same set of fields");
				}
			}
			if ((org.joda.time.DateTimeUtils.isContiguous(start)) == false) {
				throw new java.lang.IllegalArgumentException("ReadablePartial objects must be contiguous");
			}
			iType = checkPeriodType(type);
			org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getChronology(start.getChronology()).withUTC();
			iValues = chrono.get(org.joda.time.base.BasePeriod.this, chrono.set(start, 0L), chrono.set(end, 0L));
		}
	}

	protected BasePeriod(org.joda.time.ReadableInstant startInstant, org.joda.time.ReadableDuration duration, org.joda.time.PeriodType type) {
		super();
		type = checkPeriodType(type);
		long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(startInstant);
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		long endMillis = org.joda.time.field.FieldUtils.safeAdd(startMillis, durationMillis);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(startInstant);
		iType = type;
		iValues = chrono.get(org.joda.time.base.BasePeriod.this, startMillis, endMillis);
	}

	protected BasePeriod(org.joda.time.ReadableDuration duration, org.joda.time.ReadableInstant endInstant, org.joda.time.PeriodType type) {
		super();
		type = checkPeriodType(type);
		long durationMillis = org.joda.time.DateTimeUtils.getDurationMillis(duration);
		long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(endInstant);
		long startMillis = org.joda.time.field.FieldUtils.safeSubtract(endMillis, durationMillis);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(endInstant);
		iType = type;
		iValues = chrono.get(org.joda.time.base.BasePeriod.this, startMillis, endMillis);
	}

	protected BasePeriod(long duration, org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		super();
		type = checkPeriodType(type);
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		iType = type;
		iValues = chrono.get(org.joda.time.base.BasePeriod.this, duration);
	}

	protected BasePeriod(java.lang.Object period, org.joda.time.PeriodType type, org.joda.time.Chronology chrono) {
		super();
		org.joda.time.convert.PeriodConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPeriodConverter(period);
		type = (type == null) ? converter.getPeriodType(period) : type;
		type = checkPeriodType(type);
		iType = type;
		if ((org.joda.time.base.BasePeriod.this) instanceof org.joda.time.ReadWritablePeriod) {
			iValues = new int[size()];
			chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
			converter.setInto(((org.joda.time.ReadWritablePeriod) (org.joda.time.base.BasePeriod.this)), period, chrono);
		}else {
			iValues = new org.joda.time.MutablePeriod(period, type, chrono).getValues();
		}
	}

	protected BasePeriod(int[] values, org.joda.time.PeriodType type) {
		super();
		iType = type;
		iValues = values;
	}

	protected org.joda.time.PeriodType checkPeriodType(org.joda.time.PeriodType type) {
		return org.joda.time.DateTimeUtils.getPeriodType(type);
	}

	public org.joda.time.PeriodType getPeriodType() {
		return iType;
	}

	public int size() {
		return iType.size();
	}

	public org.joda.time.DurationFieldType getFieldType(int index) {
		return iType.getFieldType(index);
	}

	public int getValue(int index) {
		return iValues[index];
	}

	public org.joda.time.Duration toDurationFrom(org.joda.time.ReadableInstant startInstant) {
		long startMillis = org.joda.time.DateTimeUtils.getInstantMillis(startInstant);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(startInstant);
		long endMillis = chrono.add(org.joda.time.base.BasePeriod.this, startMillis, 1);
		return new org.joda.time.Duration(startMillis, endMillis);
	}

	public org.joda.time.Duration toDurationTo(org.joda.time.ReadableInstant endInstant) {
		long endMillis = org.joda.time.DateTimeUtils.getInstantMillis(endInstant);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(endInstant);
		long startMillis = chrono.add(org.joda.time.base.BasePeriod.this, endMillis, (-1));
		return new org.joda.time.Duration(startMillis, endMillis);
	}

	private void checkAndUpdate(org.joda.time.DurationFieldType type, int[] values, int newValue) {
		int index = indexOf(type);
		if (index == (-1)) {
			if (newValue != 0) {
				throw new java.lang.IllegalArgumentException((("Period does not support field '" + (type.getName())) + "'"));
			}
		}else {
			values[index] = newValue;
		}
	}

	protected void setPeriod(org.joda.time.ReadablePeriod period) {
		if (period == null) {
			setValues(new int[size()]);
		}else {
			setPeriodInternal(period);
		}
	}

	private void setPeriodInternal(org.joda.time.ReadablePeriod period) {
		int[] newValues = new int[size()];
		for (int i = 0, isize = period.size(); i < isize; i++) {
			org.joda.time.DurationFieldType type = period.getFieldType(i);
			int value = period.getValue(i);
			checkAndUpdate(type, newValues, value);
		}
		iValues = newValues;
	}

	protected void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
		setPeriodInternal(years, months, weeks, days, hours, minutes, seconds, millis);
	}

	private void setPeriodInternal(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) {
		int[] newValues = new int[size()];
		checkAndUpdate(org.joda.time.DurationFieldType.years(), newValues, years);
		checkAndUpdate(org.joda.time.DurationFieldType.months(), newValues, months);
		checkAndUpdate(org.joda.time.DurationFieldType.weeks(), newValues, weeks);
		checkAndUpdate(org.joda.time.DurationFieldType.days(), newValues, days);
		checkAndUpdate(org.joda.time.DurationFieldType.hours(), newValues, hours);
		checkAndUpdate(org.joda.time.DurationFieldType.minutes(), newValues, minutes);
		checkAndUpdate(org.joda.time.DurationFieldType.seconds(), newValues, seconds);
		checkAndUpdate(org.joda.time.DurationFieldType.millis(), newValues, millis);
		iValues = newValues;
	}

	protected void setField(org.joda.time.DurationFieldType field, int value) {
		setFieldInto(iValues, field, value);
	}

	protected void setFieldInto(int[] values, org.joda.time.DurationFieldType field, int value) {
		int index = indexOf(field);
		if (index == (-1)) {
			if ((value != 0) || (field == null)) {
				throw new java.lang.IllegalArgumentException((("Period does not support field '" + field) + "'"));
			}
		}else {
			values[index] = value;
		}
	}

	protected void addField(org.joda.time.DurationFieldType field, int value) {
		addFieldInto(iValues, field, value);
	}

	protected void addFieldInto(int[] values, org.joda.time.DurationFieldType field, int value) {
		int index = indexOf(field);
		if (index == (-1)) {
			if ((value != 0) || (field == null)) {
				throw new java.lang.IllegalArgumentException((("Period does not support field '" + field) + "'"));
			}
		}else {
			values[index] = org.joda.time.field.FieldUtils.safeAdd(values[index], value);
		}
	}

	protected void mergePeriod(org.joda.time.ReadablePeriod period) {
		if (period != null) {
			iValues = mergePeriodInto(getValues(), period);
		}
	}

	protected int[] mergePeriodInto(int[] values, org.joda.time.ReadablePeriod period) {
		for (int i = 0, isize = period.size(); i < isize; i++) {
			org.joda.time.DurationFieldType type = period.getFieldType(i);
			int value = period.getValue(i);
			checkAndUpdate(type, values, value);
		}
		return values;
	}

	protected void addPeriod(org.joda.time.ReadablePeriod period) {
		if (period != null) {
			iValues = addPeriodInto(getValues(), period);
		}
	}

	protected int[] addPeriodInto(int[] values, org.joda.time.ReadablePeriod period) {
		for (int i = 0, isize = period.size(); i < isize; i++) {
			org.joda.time.DurationFieldType type = period.getFieldType(i);
			int value = period.getValue(i);
			if (value != 0) {
				int index = indexOf(type);
				if (index == (-1)) {
					throw new java.lang.IllegalArgumentException((("Period does not support field '" + (type.getName())) + "'"));
				}else {
					values[index] = org.joda.time.field.FieldUtils.safeAdd(getValue(index), value);
				}
			}
		}
		return values;
	}

	protected void setValue(int index, int value) {
		iValues[index] = value;
	}

	protected void setValues(int[] values) {
		iValues = values;
	}
}


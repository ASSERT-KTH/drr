

package org.joda.time.chrono;


public abstract class BaseChronology extends org.joda.time.Chronology implements java.io.Serializable {
	private static final long serialVersionUID = -7310865996721419676L;

	protected BaseChronology() {
		super();
	}

	public abstract org.joda.time.DateTimeZone getZone();

	public abstract org.joda.time.Chronology withUTC();

	public abstract org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone);

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		long instant = year().set(0, year);
		instant = monthOfYear().set(instant, monthOfYear);
		instant = dayOfMonth().set(instant, dayOfMonth);
		return millisOfDay().set(instant, millisOfDay);
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		long instant = year().set(0, year);
		instant = monthOfYear().set(instant, monthOfYear);
		instant = dayOfMonth().set(instant, dayOfMonth);
		instant = hourOfDay().set(instant, hourOfDay);
		instant = minuteOfHour().set(instant, minuteOfHour);
		instant = secondOfMinute().set(instant, secondOfMinute);
		return millisOfSecond().set(instant, millisOfSecond);
	}

	public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		instant = hourOfDay().set(instant, hourOfDay);
		instant = minuteOfHour().set(instant, minuteOfHour);
		instant = secondOfMinute().set(instant, secondOfMinute);
		return millisOfSecond().set(instant, millisOfSecond);
	}

	public void validate(org.joda.time.ReadablePartial partial, int[] values) {
		int size = partial.size();
		for (int i = 0; i < size; i++) {
			int value = values[i];
			org.joda.time.DateTimeField field = partial.getField(i);
			if (value < (field.getMinimumValue())) {
				throw new org.joda.time.IllegalFieldValueException(field.getType(), java.lang.Integer.valueOf(value), java.lang.Integer.valueOf(field.getMinimumValue()), null);
			}
			if (value > (field.getMaximumValue())) {
				throw new org.joda.time.IllegalFieldValueException(field.getType(), java.lang.Integer.valueOf(value), null, java.lang.Integer.valueOf(field.getMaximumValue()));
			}
		}
		for (int i = 0; i < size; i++) {
			int value = values[i];
			org.joda.time.DateTimeField field = partial.getField(i);
			if (value < (field.getMinimumValue(partial, values))) {
				throw new org.joda.time.IllegalFieldValueException(field.getType(), java.lang.Integer.valueOf(value), java.lang.Integer.valueOf(field.getMinimumValue(partial, values)), null);
			}
			if (value > (field.getMaximumValue(partial, values))) {
				throw new org.joda.time.IllegalFieldValueException(field.getType(), java.lang.Integer.valueOf(value), null, java.lang.Integer.valueOf(field.getMaximumValue(partial, values)));
			}
		}
	}

	public int[] get(org.joda.time.ReadablePartial partial, long instant) {
		int size = partial.size();
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = partial.getFieldType(i).getField(org.joda.time.chrono.BaseChronology.this).get(instant);
		}
		return values;
	}

	public long set(org.joda.time.ReadablePartial partial, long instant) {
		for (int i = 0, isize = partial.size(); i < isize; i++) {
			instant = partial.getFieldType(i).getField(org.joda.time.chrono.BaseChronology.this).set(instant, partial.getValue(i));
		}
		return instant;
	}

	public int[] get(org.joda.time.ReadablePeriod period, long startInstant, long endInstant) {
		int size = period.size();
		int[] values = new int[size];
		if (startInstant != endInstant) {
			for (int i = 0; i < size; i++) {
				org.joda.time.DurationField field = period.getFieldType(i).getField(org.joda.time.chrono.BaseChronology.this);
				int value = field.getDifference(endInstant, startInstant);
				startInstant = field.add(startInstant, value);
				values[i] = value;
			}
		}
		return values;
	}

	public int[] get(org.joda.time.ReadablePeriod period, long duration) {
		int size = period.size();
		int[] values = new int[size];
		if (duration != 0) {
			long current = 0;
			for (int i = 0; i < size; i++) {
				org.joda.time.DurationField field = period.getFieldType(i).getField(org.joda.time.chrono.BaseChronology.this);
				if (field.isPrecise()) {
					int value = field.getDifference(duration, current);
					current = field.add(current, value);
					values[i] = value;
				}
			}
		}
		return values;
	}

	public long add(org.joda.time.ReadablePeriod period, long instant, int scalar) {
		if ((scalar != 0) && (period != null)) {
			for (int i = 0, isize = period.size(); i < isize; i++) {
				long value = period.getValue(i);
				if (value != 0) {
					instant = period.getFieldType(i).getField(org.joda.time.chrono.BaseChronology.this).add(instant, (value * scalar));
				}
			}
		}
		return instant;
	}

	public long add(long instant, long duration, int scalar) {
		if ((duration == 0) || (scalar == 0)) {
			return instant;
		}
		long add = org.joda.time.field.FieldUtils.safeMultiply(duration, scalar);
		return org.joda.time.field.FieldUtils.safeAdd(instant, add);
	}

	public org.joda.time.DurationField millis() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.millis());
	}

	public org.joda.time.DateTimeField millisOfSecond() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.millisOfSecond(), millis());
	}

	public org.joda.time.DateTimeField millisOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.millisOfDay(), millis());
	}

	public org.joda.time.DurationField seconds() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.seconds());
	}

	public org.joda.time.DateTimeField secondOfMinute() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.secondOfMinute(), seconds());
	}

	public org.joda.time.DateTimeField secondOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.secondOfDay(), seconds());
	}

	public org.joda.time.DurationField minutes() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.minutes());
	}

	public org.joda.time.DateTimeField minuteOfHour() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.minuteOfHour(), minutes());
	}

	public org.joda.time.DateTimeField minuteOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.minuteOfDay(), minutes());
	}

	public org.joda.time.DurationField hours() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.hours());
	}

	public org.joda.time.DateTimeField hourOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.hourOfDay(), hours());
	}

	public org.joda.time.DateTimeField clockhourOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.clockhourOfDay(), hours());
	}

	public org.joda.time.DurationField halfdays() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.halfdays());
	}

	public org.joda.time.DateTimeField hourOfHalfday() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.hourOfHalfday(), hours());
	}

	public org.joda.time.DateTimeField clockhourOfHalfday() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.clockhourOfHalfday(), hours());
	}

	public org.joda.time.DateTimeField halfdayOfDay() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.halfdayOfDay(), halfdays());
	}

	public org.joda.time.DurationField days() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.days());
	}

	public org.joda.time.DateTimeField dayOfWeek() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.dayOfWeek(), days());
	}

	public org.joda.time.DateTimeField dayOfMonth() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.dayOfMonth(), days());
	}

	public org.joda.time.DateTimeField dayOfYear() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.dayOfYear(), days());
	}

	public org.joda.time.DurationField weeks() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.weeks());
	}

	public org.joda.time.DateTimeField weekOfWeekyear() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.weekOfWeekyear(), weeks());
	}

	public org.joda.time.DurationField weekyears() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.weekyears());
	}

	public org.joda.time.DateTimeField weekyear() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.weekyear(), weekyears());
	}

	public org.joda.time.DateTimeField weekyearOfCentury() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.weekyearOfCentury(), weekyears());
	}

	public org.joda.time.DurationField months() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.months());
	}

	public org.joda.time.DateTimeField monthOfYear() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.monthOfYear(), months());
	}

	public org.joda.time.DurationField years() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.years());
	}

	public org.joda.time.DateTimeField year() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.year(), years());
	}

	public org.joda.time.DateTimeField yearOfEra() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.yearOfEra(), years());
	}

	public org.joda.time.DateTimeField yearOfCentury() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.yearOfCentury(), years());
	}

	public org.joda.time.DurationField centuries() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.centuries());
	}

	public org.joda.time.DateTimeField centuryOfEra() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.centuryOfEra(), centuries());
	}

	public org.joda.time.DurationField eras() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(org.joda.time.DurationFieldType.eras());
	}

	public org.joda.time.DateTimeField era() {
		return org.joda.time.field.UnsupportedDateTimeField.getInstance(org.joda.time.DateTimeFieldType.era(), eras());
	}

	public abstract java.lang.String toString();
}


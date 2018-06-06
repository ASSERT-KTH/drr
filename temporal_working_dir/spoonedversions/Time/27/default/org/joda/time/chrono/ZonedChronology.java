

package org.joda.time.chrono;


public final class ZonedChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = -1079258847191166848L;

	public static org.joda.time.chrono.ZonedChronology getInstance(org.joda.time.Chronology base, org.joda.time.DateTimeZone zone) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Must supply a chronology");
		}
		base = base.withUTC();
		if (base == null) {
			throw new java.lang.IllegalArgumentException("UTC chronology must not be null");
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("DateTimeZone must not be null");
		}
		return new org.joda.time.chrono.ZonedChronology(base, zone);
	}

	static boolean useTimeArithmetic(org.joda.time.DurationField field) {
		return (field != null) && ((field.getUnitMillis()) < ((org.joda.time.DateTimeConstants.MILLIS_PER_HOUR) * 12));
	}

	private ZonedChronology(org.joda.time.Chronology base, org.joda.time.DateTimeZone zone) {
		super(base, zone);
	}

	public org.joda.time.DateTimeZone getZone() {
		return ((org.joda.time.DateTimeZone) (getParam()));
	}

	public org.joda.time.Chronology withUTC() {
		return getBase();
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getParam())) {
			return org.joda.time.chrono.ZonedChronology.this;
		}
		if (zone == (org.joda.time.DateTimeZone.UTC)) {
			return getBase();
		}
		return new org.joda.time.chrono.ZonedChronology(getBase(), zone);
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		return localToUTC(getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay));
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		return localToUTC(getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
	}

	public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		return localToUTC(getBase().getDateTimeMillis((instant + (getZone().getOffset(instant))), hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
	}

	private long localToUTC(long instant) {
		org.joda.time.DateTimeZone zone = getZone();
		int offset = zone.getOffsetFromLocal(instant);
		instant -= offset;
		if (offset != (zone.getOffset(instant))) {
			throw new java.lang.IllegalArgumentException(("Illegal instant due to time zone offset transition: " + (org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new org.joda.time.Instant(instant)))));
		}
		return instant;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		java.util.HashMap<java.lang.Object, java.lang.Object> converted = new java.util.HashMap<java.lang.Object, java.lang.Object>();
		fields.eras = convertField(fields.eras, converted);
		fields.centuries = convertField(fields.centuries, converted);
		fields.years = convertField(fields.years, converted);
		fields.months = convertField(fields.months, converted);
		fields.weekyears = convertField(fields.weekyears, converted);
		fields.weeks = convertField(fields.weeks, converted);
		fields.days = convertField(fields.days, converted);
		fields.halfdays = convertField(fields.halfdays, converted);
		fields.hours = convertField(fields.hours, converted);
		fields.minutes = convertField(fields.minutes, converted);
		fields.seconds = convertField(fields.seconds, converted);
		fields.millis = convertField(fields.millis, converted);
		fields.year = convertField(fields.year, converted);
		fields.yearOfEra = convertField(fields.yearOfEra, converted);
		fields.yearOfCentury = convertField(fields.yearOfCentury, converted);
		fields.centuryOfEra = convertField(fields.centuryOfEra, converted);
		fields.era = convertField(fields.era, converted);
		fields.dayOfWeek = convertField(fields.dayOfWeek, converted);
		fields.dayOfMonth = convertField(fields.dayOfMonth, converted);
		fields.dayOfYear = convertField(fields.dayOfYear, converted);
		fields.monthOfYear = convertField(fields.monthOfYear, converted);
		fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted);
		fields.weekyear = convertField(fields.weekyear, converted);
		fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted);
		fields.millisOfSecond = convertField(fields.millisOfSecond, converted);
		fields.millisOfDay = convertField(fields.millisOfDay, converted);
		fields.secondOfMinute = convertField(fields.secondOfMinute, converted);
		fields.secondOfDay = convertField(fields.secondOfDay, converted);
		fields.minuteOfHour = convertField(fields.minuteOfHour, converted);
		fields.minuteOfDay = convertField(fields.minuteOfDay, converted);
		fields.hourOfDay = convertField(fields.hourOfDay, converted);
		fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted);
		fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted);
		fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted);
		fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted);
	}

	private org.joda.time.DurationField convertField(org.joda.time.DurationField field, java.util.HashMap<java.lang.Object, java.lang.Object> converted) {
		if ((field == null) || (!(field.isSupported()))) {
			return field;
		}
		if (converted.containsKey(field)) {
			return ((org.joda.time.DurationField) (converted.get(field)));
		}
		org.joda.time.chrono.ZonedChronology.ZonedDurationField zonedField = new org.joda.time.chrono.ZonedChronology.ZonedDurationField(field, getZone());
		converted.put(field, zonedField);
		return zonedField;
	}

	private org.joda.time.DateTimeField convertField(org.joda.time.DateTimeField field, java.util.HashMap<java.lang.Object, java.lang.Object> converted) {
		if ((field == null) || (!(field.isSupported()))) {
			return field;
		}
		if (converted.containsKey(field)) {
			return ((org.joda.time.DateTimeField) (converted.get(field)));
		}
		org.joda.time.chrono.ZonedChronology.ZonedDateTimeField zonedField = new org.joda.time.chrono.ZonedChronology.ZonedDateTimeField(field, getZone(), convertField(field.getDurationField(), converted), convertField(field.getRangeDurationField(), converted), convertField(field.getLeapDurationField(), converted));
		converted.put(field, zonedField);
		return zonedField;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.chrono.ZonedChronology.this) == obj) {
			return true;
		}
		if ((obj instanceof org.joda.time.chrono.ZonedChronology) == false) {
			return false;
		}
		org.joda.time.chrono.ZonedChronology chrono = ((org.joda.time.chrono.ZonedChronology) (obj));
		return (getBase().equals(chrono.getBase())) && (getZone().equals(chrono.getZone()));
	}

	public int hashCode() {
		return (326565 + ((getZone().hashCode()) * 11)) + ((getBase().hashCode()) * 7);
	}

	public java.lang.String toString() {
		return ((("ZonedChronology[" + (getBase())) + ", ") + (getZone().getID())) + ']';
	}

	static class ZonedDurationField extends org.joda.time.field.BaseDurationField {
		private static final long serialVersionUID = -485345310999208286L;

		final org.joda.time.DurationField iField;

		final boolean iTimeField;

		final org.joda.time.DateTimeZone iZone;

		ZonedDurationField(org.joda.time.DurationField field, org.joda.time.DateTimeZone zone) {
			super(field.getType());
			if (!(field.isSupported())) {
				throw new java.lang.IllegalArgumentException();
			}
			iField = field;
			iTimeField = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(field);
			iZone = zone;
		}

		public boolean isPrecise() {
			return iTimeField ? iField.isPrecise() : (iField.isPrecise()) && (org.joda.time.chrono.ZonedChronology.ZonedDurationField.this.iZone.isFixed());
		}

		public long getUnitMillis() {
			return iField.getUnitMillis();
		}

		public int getValue(long duration, long instant) {
			return iField.getValue(duration, addOffset(instant));
		}

		public long getValueAsLong(long duration, long instant) {
			return iField.getValueAsLong(duration, addOffset(instant));
		}

		public long getMillis(int value, long instant) {
			return iField.getMillis(value, addOffset(instant));
		}

		public long getMillis(long value, long instant) {
			return iField.getMillis(value, addOffset(instant));
		}

		public long add(long instant, int value) {
			int offset = getOffsetToAdd(instant);
			instant = iField.add((instant + offset), value);
			return instant - (iTimeField ? offset : getOffsetFromLocalToSubtract(instant));
		}

		public long add(long instant, long value) {
			int offset = getOffsetToAdd(instant);
			instant = iField.add((instant + offset), value);
			return instant - (iTimeField ? offset : getOffsetFromLocalToSubtract(instant));
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			int offset = getOffsetToAdd(subtrahendInstant);
			return iField.getDifference((minuendInstant + (iTimeField ? offset : getOffsetToAdd(minuendInstant))), (subtrahendInstant + offset));
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			int offset = getOffsetToAdd(subtrahendInstant);
			return iField.getDifferenceAsLong((minuendInstant + (iTimeField ? offset : getOffsetToAdd(minuendInstant))), (subtrahendInstant + offset));
		}

		private int getOffsetToAdd(long instant) {
			int offset = org.joda.time.chrono.ZonedChronology.ZonedDurationField.this.iZone.getOffset(instant);
			long sum = instant + offset;
			if (((instant ^ sum) < 0) && ((instant ^ offset) >= 0)) {
				throw new java.lang.ArithmeticException("Adding time zone offset caused overflow");
			}
			return offset;
		}

		private int getOffsetFromLocalToSubtract(long instant) {
			int offset = org.joda.time.chrono.ZonedChronology.ZonedDurationField.this.iZone.getOffsetFromLocal(instant);
			long diff = instant - offset;
			if (((instant ^ diff) < 0) && ((instant ^ offset) < 0)) {
				throw new java.lang.ArithmeticException("Subtracting time zone offset caused overflow");
			}
			return offset;
		}

		private long addOffset(long instant) {
			return iZone.convertUTCToLocal(instant);
		}
	}

	static final class ZonedDateTimeField extends org.joda.time.field.BaseDateTimeField {
		private static final long serialVersionUID = -3968986277775529794L;

		final org.joda.time.DateTimeField iField;

		final org.joda.time.DateTimeZone iZone;

		final org.joda.time.DurationField iDurationField;

		final boolean iTimeField;

		final org.joda.time.DurationField iRangeDurationField;

		final org.joda.time.DurationField iLeapDurationField;

		ZonedDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DateTimeZone zone, org.joda.time.DurationField durationField, org.joda.time.DurationField rangeDurationField, org.joda.time.DurationField leapDurationField) {
			super(field.getType());
			if (!(field.isSupported())) {
				throw new java.lang.IllegalArgumentException();
			}
			iField = field;
			iZone = zone;
			iDurationField = durationField;
			iTimeField = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(durationField);
			iRangeDurationField = rangeDurationField;
			iLeapDurationField = leapDurationField;
		}

		public boolean isLenient() {
			return iField.isLenient();
		}

		public int get(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.get(localInstant);
		}

		public java.lang.String getAsText(long instant, java.util.Locale locale) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.getAsText(localInstant, locale);
		}

		public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.getAsShortText(localInstant, locale);
		}

		public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
			return iField.getAsText(fieldValue, locale);
		}

		public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
			return iField.getAsShortText(fieldValue, locale);
		}

		public long add(long instant, int value) {
			if (iTimeField) {
				int offset = getOffsetToAdd(instant);
				long localInstant = iField.add((instant + offset), value);
				return localInstant - offset;
			}else {
				long localInstant = iZone.convertUTCToLocal(instant);
				localInstant = iField.add(localInstant, value);
				return iZone.convertLocalToUTC(localInstant, false);
			}
		}

		public long add(long instant, long value) {
			if (iTimeField) {
				int offset = getOffsetToAdd(instant);
				long localInstant = iField.add((instant + offset), value);
				return localInstant - offset;
			}else {
				long localInstant = iZone.convertUTCToLocal(instant);
				localInstant = iField.add(localInstant, value);
				return iZone.convertLocalToUTC(localInstant, false);
			}
		}

		public long addWrapField(long instant, int value) {
			if (iTimeField) {
				int offset = getOffsetToAdd(instant);
				long localInstant = iField.addWrapField((instant + offset), value);
				return localInstant - offset;
			}else {
				long localInstant = iZone.convertUTCToLocal(instant);
				localInstant = iField.addWrapField(localInstant, value);
				return iZone.convertLocalToUTC(localInstant, false);
			}
		}

		public long set(long instant, int value) {
			long localInstant = iZone.convertUTCToLocal(instant);
			localInstant = iField.set(localInstant, value);
			long result = iZone.convertLocalToUTC(localInstant, false);
			if ((get(result)) != value) {
				throw new org.joda.time.IllegalFieldValueException(iField.getType(), new java.lang.Integer(value), (((("Illegal instant due to time zone offset transition: " + (org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new org.joda.time.Instant(localInstant)))) + " (") + (iZone.getID())) + ")"));
			}
			return result;
		}

		public long set(long instant, java.lang.String text, java.util.Locale locale) {
			long localInstant = iZone.convertUTCToLocal(instant);
			localInstant = iField.set(localInstant, text, locale);
			return iZone.convertLocalToUTC(localInstant, false);
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			int offset = getOffsetToAdd(subtrahendInstant);
			return iField.getDifference((minuendInstant + (iTimeField ? offset : getOffsetToAdd(minuendInstant))), (subtrahendInstant + offset));
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			int offset = getOffsetToAdd(subtrahendInstant);
			return iField.getDifferenceAsLong((minuendInstant + (iTimeField ? offset : getOffsetToAdd(minuendInstant))), (subtrahendInstant + offset));
		}

		public final org.joda.time.DurationField getDurationField() {
			return iDurationField;
		}

		public final org.joda.time.DurationField getRangeDurationField() {
			return iRangeDurationField;
		}

		public boolean isLeap(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.isLeap(localInstant);
		}

		public int getLeapAmount(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.getLeapAmount(localInstant);
		}

		public final org.joda.time.DurationField getLeapDurationField() {
			return iLeapDurationField;
		}

		public long roundFloor(long instant) {
			if (iTimeField) {
				int offset = getOffsetToAdd(instant);
				instant = iField.roundFloor((instant + offset));
				return instant - offset;
			}else {
				long localInstant = iZone.convertUTCToLocal(instant);
				localInstant = iField.roundFloor(localInstant);
				return iZone.convertLocalToUTC(localInstant, false);
			}
		}

		public long roundCeiling(long instant) {
			if (iTimeField) {
				int offset = getOffsetToAdd(instant);
				instant = iField.roundCeiling((instant + offset));
				return instant - offset;
			}else {
				long localInstant = iZone.convertUTCToLocal(instant);
				localInstant = iField.roundCeiling(localInstant);
				return iZone.convertLocalToUTC(localInstant, false);
			}
		}

		public long remainder(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.remainder(localInstant);
		}

		public int getMinimumValue() {
			return iField.getMinimumValue();
		}

		public int getMinimumValue(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.getMinimumValue(localInstant);
		}

		public int getMinimumValue(org.joda.time.ReadablePartial instant) {
			return iField.getMinimumValue(instant);
		}

		public int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values) {
			return iField.getMinimumValue(instant, values);
		}

		public int getMaximumValue() {
			return iField.getMaximumValue();
		}

		public int getMaximumValue(long instant) {
			long localInstant = iZone.convertUTCToLocal(instant);
			return iField.getMaximumValue(localInstant);
		}

		public int getMaximumValue(org.joda.time.ReadablePartial instant) {
			return iField.getMaximumValue(instant);
		}

		public int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values) {
			return iField.getMaximumValue(instant, values);
		}

		public int getMaximumTextLength(java.util.Locale locale) {
			return iField.getMaximumTextLength(locale);
		}

		public int getMaximumShortTextLength(java.util.Locale locale) {
			return iField.getMaximumShortTextLength(locale);
		}

		private int getOffsetToAdd(long instant) {
			int offset = org.joda.time.chrono.ZonedChronology.ZonedDateTimeField.this.iZone.getOffset(instant);
			long sum = instant + offset;
			if (((instant ^ sum) < 0) && ((instant ^ offset) >= 0)) {
				throw new java.lang.ArithmeticException("Adding time zone offset caused overflow");
			}
			return offset;
		}
	}
}


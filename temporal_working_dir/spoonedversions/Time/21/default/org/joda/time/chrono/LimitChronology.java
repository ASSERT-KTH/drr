

package org.joda.time.chrono;


public final class LimitChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = 7670866536893052522L;

	public static org.joda.time.chrono.LimitChronology getInstance(org.joda.time.Chronology base, org.joda.time.ReadableDateTime lowerLimit, org.joda.time.ReadableDateTime upperLimit) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Must supply a chronology");
		}
		lowerLimit = (lowerLimit == null) ? null : lowerLimit.toDateTime();
		upperLimit = (upperLimit == null) ? null : upperLimit.toDateTime();
		if ((lowerLimit != null) && (upperLimit != null)) {
			if (!(lowerLimit.isBefore(upperLimit))) {
				throw new java.lang.IllegalArgumentException("The lower limit must be come before than the upper limit");
			}
		}
		return new org.joda.time.chrono.LimitChronology(base, ((org.joda.time.DateTime) (lowerLimit)), ((org.joda.time.DateTime) (upperLimit)));
	}

	final org.joda.time.DateTime iLowerLimit;

	final org.joda.time.DateTime iUpperLimit;

	private transient org.joda.time.chrono.LimitChronology iWithUTC;

	private LimitChronology(org.joda.time.Chronology base, org.joda.time.DateTime lowerLimit, org.joda.time.DateTime upperLimit) {
		super(base, null);
		iLowerLimit = lowerLimit;
		iUpperLimit = upperLimit;
	}

	public org.joda.time.DateTime getLowerLimit() {
		return iLowerLimit;
	}

	public org.joda.time.DateTime getUpperLimit() {
		return iUpperLimit;
	}

	public org.joda.time.Chronology withUTC() {
		return withZone(org.joda.time.DateTimeZone.UTC);
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.LimitChronology.this;
		}
		if ((zone == (org.joda.time.DateTimeZone.UTC)) && ((iWithUTC) != null)) {
			return iWithUTC;
		}
		org.joda.time.DateTime lowerLimit = iLowerLimit;
		if (lowerLimit != null) {
			org.joda.time.MutableDateTime mdt = lowerLimit.toMutableDateTime();
			mdt.setZoneRetainFields(zone);
			lowerLimit = mdt.toDateTime();
		}
		org.joda.time.DateTime upperLimit = iUpperLimit;
		if (upperLimit != null) {
			org.joda.time.MutableDateTime mdt = upperLimit.toMutableDateTime();
			mdt.setZoneRetainFields(zone);
			upperLimit = mdt.toDateTime();
		}
		org.joda.time.chrono.LimitChronology chrono = org.joda.time.chrono.LimitChronology.getInstance(getBase().withZone(zone), lowerLimit, upperLimit);
		if (zone == (org.joda.time.DateTimeZone.UTC)) {
			iWithUTC = chrono;
		}
		return chrono;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
		checkLimits(instant, "resulting");
		return instant;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		checkLimits(instant, "resulting");
		return instant;
	}

	public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		checkLimits(instant, null);
		instant = getBase().getDateTimeMillis(instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		checkLimits(instant, "resulting");
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
		org.joda.time.chrono.LimitChronology.LimitDurationField limitField = new org.joda.time.chrono.LimitChronology.LimitDurationField(field);
		converted.put(field, limitField);
		return limitField;
	}

	private org.joda.time.DateTimeField convertField(org.joda.time.DateTimeField field, java.util.HashMap<java.lang.Object, java.lang.Object> converted) {
		if ((field == null) || (!(field.isSupported()))) {
			return field;
		}
		if (converted.containsKey(field)) {
			return ((org.joda.time.DateTimeField) (converted.get(field)));
		}
		org.joda.time.chrono.LimitChronology.LimitDateTimeField limitField = new org.joda.time.chrono.LimitChronology.LimitDateTimeField(field, convertField(field.getDurationField(), converted), convertField(field.getRangeDurationField(), converted), convertField(field.getLeapDurationField(), converted));
		converted.put(field, limitField);
		return limitField;
	}

	void checkLimits(long instant, java.lang.String desc) {
		org.joda.time.DateTime limit;
		if (((limit = iLowerLimit) != null) && (instant < (limit.getMillis()))) {
			throw new org.joda.time.chrono.LimitChronology.LimitException(desc, true);
		}
		if (((limit = iUpperLimit) != null) && (instant >= (limit.getMillis()))) {
			throw new org.joda.time.chrono.LimitChronology.LimitException(desc, false);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.chrono.LimitChronology.this) == obj) {
			return true;
		}
		if ((obj instanceof org.joda.time.chrono.LimitChronology) == false) {
			return false;
		}
		org.joda.time.chrono.LimitChronology chrono = ((org.joda.time.chrono.LimitChronology) (obj));
		return ((getBase().equals(chrono.getBase())) && (org.joda.time.field.FieldUtils.equals(getLowerLimit(), chrono.getLowerLimit()))) && (org.joda.time.field.FieldUtils.equals(getUpperLimit(), chrono.getUpperLimit()));
	}

	public int hashCode() {
		int hash = 317351877;
		hash += ((getLowerLimit()) != null) ? getLowerLimit().hashCode() : 0;
		hash += ((getUpperLimit()) != null) ? getUpperLimit().hashCode() : 0;
		hash += (getBase().hashCode()) * 7;
		return hash;
	}

	public java.lang.String toString() {
		return ((((("LimitChronology[" + (getBase().toString())) + ", ") + ((getLowerLimit()) == null ? "NoLimit" : getLowerLimit().toString())) + ", ") + ((getUpperLimit()) == null ? "NoLimit" : getUpperLimit().toString())) + ']';
	}

	private class LimitException extends java.lang.IllegalArgumentException {
		private static final long serialVersionUID = -5924689995607498581L;

		private final boolean iIsLow;

		LimitException(java.lang.String desc, boolean isLow) {
			super(desc);
			iIsLow = isLow;
		}

		public java.lang.String getMessage() {
			java.lang.StringBuffer buf = new java.lang.StringBuffer(85);
			buf.append("The");
			java.lang.String desc = super.getMessage();
			if (desc != null) {
				buf.append(' ');
				buf.append(desc);
			}
			buf.append(" instant is ");
			org.joda.time.format.DateTimeFormatter p = org.joda.time.format.ISODateTimeFormat.dateTime();
			p = p.withChronology(getBase());
			if (iIsLow) {
				buf.append("below the supported minimum of ");
				p.printTo(buf, getLowerLimit().getMillis());
			}else {
				buf.append("above the supported maximum of ");
				p.printTo(buf, getUpperLimit().getMillis());
			}
			buf.append(" (");
			buf.append(getBase());
			buf.append(')');
			return buf.toString();
		}

		public java.lang.String toString() {
			return "IllegalArgumentException: " + (getMessage());
		}
	}

	private class LimitDurationField extends org.joda.time.field.DecoratedDurationField {
		private static final long serialVersionUID = 8049297699408782284L;

		LimitDurationField(org.joda.time.DurationField field) {
			super(field, field.getType());
		}

		public int getValue(long duration, long instant) {
			checkLimits(instant, null);
			return getWrappedField().getValue(duration, instant);
		}

		public long getValueAsLong(long duration, long instant) {
			checkLimits(instant, null);
			return getWrappedField().getValueAsLong(duration, instant);
		}

		public long getMillis(int value, long instant) {
			checkLimits(instant, null);
			return getWrappedField().getMillis(value, instant);
		}

		public long getMillis(long value, long instant) {
			checkLimits(instant, null);
			return getWrappedField().getMillis(value, instant);
		}

		public long add(long instant, int amount) {
			checkLimits(instant, null);
			long result = getWrappedField().add(instant, amount);
			checkLimits(result, "resulting");
			return result;
		}

		public long add(long instant, long amount) {
			checkLimits(instant, null);
			long result = getWrappedField().add(instant, amount);
			checkLimits(result, "resulting");
			return result;
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			checkLimits(minuendInstant, "minuend");
			checkLimits(subtrahendInstant, "subtrahend");
			return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			checkLimits(minuendInstant, "minuend");
			checkLimits(subtrahendInstant, "subtrahend");
			return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
		}
	}

	private class LimitDateTimeField extends org.joda.time.field.DecoratedDateTimeField {
		private static final long serialVersionUID = -2435306746995699312L;

		private final org.joda.time.DurationField iDurationField;

		private final org.joda.time.DurationField iRangeDurationField;

		private final org.joda.time.DurationField iLeapDurationField;

		LimitDateTimeField(org.joda.time.DateTimeField field, org.joda.time.DurationField durationField, org.joda.time.DurationField rangeDurationField, org.joda.time.DurationField leapDurationField) {
			super(field, field.getType());
			iDurationField = durationField;
			iRangeDurationField = rangeDurationField;
			iLeapDurationField = leapDurationField;
		}

		public int get(long instant) {
			checkLimits(instant, null);
			return getWrappedField().get(instant);
		}

		public java.lang.String getAsText(long instant, java.util.Locale locale) {
			checkLimits(instant, null);
			return getWrappedField().getAsText(instant, locale);
		}

		public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
			checkLimits(instant, null);
			return getWrappedField().getAsShortText(instant, locale);
		}

		public long add(long instant, int amount) {
			checkLimits(instant, null);
			long result = getWrappedField().add(instant, amount);
			checkLimits(result, "resulting");
			return result;
		}

		public long add(long instant, long amount) {
			checkLimits(instant, null);
			long result = getWrappedField().add(instant, amount);
			checkLimits(result, "resulting");
			return result;
		}

		public long addWrapField(long instant, int amount) {
			checkLimits(instant, null);
			long result = getWrappedField().addWrapField(instant, amount);
			checkLimits(result, "resulting");
			return result;
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			checkLimits(minuendInstant, "minuend");
			checkLimits(subtrahendInstant, "subtrahend");
			return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			checkLimits(minuendInstant, "minuend");
			checkLimits(subtrahendInstant, "subtrahend");
			return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
		}

		public long set(long instant, int value) {
			checkLimits(instant, null);
			long result = getWrappedField().set(instant, value);
			checkLimits(result, "resulting");
			return result;
		}

		public long set(long instant, java.lang.String text, java.util.Locale locale) {
			checkLimits(instant, null);
			long result = getWrappedField().set(instant, text, locale);
			checkLimits(result, "resulting");
			return result;
		}

		public final org.joda.time.DurationField getDurationField() {
			return iDurationField;
		}

		public final org.joda.time.DurationField getRangeDurationField() {
			return iRangeDurationField;
		}

		public boolean isLeap(long instant) {
			checkLimits(instant, null);
			return getWrappedField().isLeap(instant);
		}

		public int getLeapAmount(long instant) {
			checkLimits(instant, null);
			return getWrappedField().getLeapAmount(instant);
		}

		public final org.joda.time.DurationField getLeapDurationField() {
			return iLeapDurationField;
		}

		public long roundFloor(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().roundFloor(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public long roundCeiling(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().roundCeiling(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public long roundHalfFloor(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().roundHalfFloor(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public long roundHalfCeiling(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().roundHalfCeiling(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public long roundHalfEven(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().roundHalfEven(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public long remainder(long instant) {
			checkLimits(instant, null);
			long result = getWrappedField().remainder(instant);
			checkLimits(result, "resulting");
			return result;
		}

		public int getMinimumValue(long instant) {
			checkLimits(instant, null);
			return getWrappedField().getMinimumValue(instant);
		}

		public int getMaximumValue(long instant) {
			checkLimits(instant, null);
			return getWrappedField().getMaximumValue(instant);
		}

		public int getMaximumTextLength(java.util.Locale locale) {
			return getWrappedField().getMaximumTextLength(locale);
		}

		public int getMaximumShortTextLength(java.util.Locale locale) {
			return getWrappedField().getMaximumShortTextLength(locale);
		}
	}
}


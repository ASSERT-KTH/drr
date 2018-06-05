

package org.joda.time.chrono;


public final class GJChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = -2545574827706931671L;

	private static long convertByYear(long instant, org.joda.time.Chronology from, org.joda.time.Chronology to) {
		return to.getDateTimeMillis(from.year().get(instant), from.monthOfYear().get(instant), from.dayOfMonth().get(instant), from.millisOfDay().get(instant));
	}

	private static long convertByWeekyear(final long instant, org.joda.time.Chronology from, org.joda.time.Chronology to) {
		long newInstant;
		newInstant = to.weekyear().set(0, from.weekyear().get(instant));
		newInstant = to.weekOfWeekyear().set(newInstant, from.weekOfWeekyear().get(instant));
		newInstant = to.dayOfWeek().set(newInstant, from.dayOfWeek().get(instant));
		newInstant = to.millisOfDay().set(newInstant, from.millisOfDay().get(instant));
		return newInstant;
	}

	static final org.joda.time.Instant DEFAULT_CUTOVER = new org.joda.time.Instant((-12219292800000L));

	private static final java.util.Map<org.joda.time.DateTimeZone, java.util.ArrayList<org.joda.time.chrono.GJChronology>> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, java.util.ArrayList<org.joda.time.chrono.GJChronology>>();

	public static org.joda.time.chrono.GJChronology getInstanceUTC() {
		return org.joda.time.chrono.GJChronology.getInstance(org.joda.time.DateTimeZone.UTC, org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER, 4);
	}

	public static org.joda.time.chrono.GJChronology getInstance() {
		return org.joda.time.chrono.GJChronology.getInstance(org.joda.time.DateTimeZone.getDefault(), org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER, 4);
	}

	public static org.joda.time.chrono.GJChronology getInstance(org.joda.time.DateTimeZone zone) {
		return org.joda.time.chrono.GJChronology.getInstance(zone, org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER, 4);
	}

	public static org.joda.time.chrono.GJChronology getInstance(org.joda.time.DateTimeZone zone, org.joda.time.ReadableInstant gregorianCutover) {
		return org.joda.time.chrono.GJChronology.getInstance(zone, gregorianCutover, 4);
	}

	public static synchronized org.joda.time.chrono.GJChronology getInstance(org.joda.time.DateTimeZone zone, org.joda.time.ReadableInstant gregorianCutover, int minDaysInFirstWeek) {
		zone = org.joda.time.DateTimeUtils.getZone(zone);
		org.joda.time.Instant cutoverInstant;
		if (gregorianCutover == null) {
			cutoverInstant = org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER;
		}else {
			cutoverInstant = gregorianCutover.toInstant();
		}
		org.joda.time.chrono.GJChronology chrono;
		java.util.ArrayList<org.joda.time.chrono.GJChronology> chronos = org.joda.time.chrono.GJChronology.cCache.get(zone);
		if (chronos == null) {
			chronos = new java.util.ArrayList<org.joda.time.chrono.GJChronology>(2);
			org.joda.time.chrono.GJChronology.cCache.put(zone, chronos);
		}else {
			for (int i = chronos.size(); (--i) >= 0;) {
				chrono = chronos.get(i);
				if ((minDaysInFirstWeek == (chrono.getMinimumDaysInFirstWeek())) && (cutoverInstant.equals(chrono.getGregorianCutover()))) {
					return chrono;
				}
			}
		}
		if (zone == (org.joda.time.DateTimeZone.UTC)) {
			chrono = new org.joda.time.chrono.GJChronology(org.joda.time.chrono.JulianChronology.getInstance(zone, minDaysInFirstWeek), org.joda.time.chrono.GregorianChronology.getInstance(zone, minDaysInFirstWeek), cutoverInstant);
		}else {
			chrono = org.joda.time.chrono.GJChronology.getInstance(org.joda.time.DateTimeZone.UTC, cutoverInstant, minDaysInFirstWeek);
			chrono = new org.joda.time.chrono.GJChronology(org.joda.time.chrono.ZonedChronology.getInstance(chrono, zone), chrono.iJulianChronology, chrono.iGregorianChronology, chrono.iCutoverInstant);
		}
		chronos.add(chrono);
		return chrono;
	}

	public static org.joda.time.chrono.GJChronology getInstance(org.joda.time.DateTimeZone zone, long gregorianCutover, int minDaysInFirstWeek) {
		org.joda.time.Instant cutoverInstant;
		if (gregorianCutover == (org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER.getMillis())) {
			cutoverInstant = null;
		}else {
			cutoverInstant = new org.joda.time.Instant(gregorianCutover);
		}
		return org.joda.time.chrono.GJChronology.getInstance(zone, cutoverInstant, minDaysInFirstWeek);
	}

	private org.joda.time.chrono.JulianChronology iJulianChronology;

	private org.joda.time.chrono.GregorianChronology iGregorianChronology;

	private org.joda.time.Instant iCutoverInstant;

	private long iCutoverMillis;

	private long iGapDuration;

	private GJChronology(org.joda.time.chrono.JulianChronology julian, org.joda.time.chrono.GregorianChronology gregorian, org.joda.time.Instant cutoverInstant) {
		super(null, new java.lang.Object[]{ julian , gregorian , cutoverInstant });
	}

	private GJChronology(org.joda.time.Chronology base, org.joda.time.chrono.JulianChronology julian, org.joda.time.chrono.GregorianChronology gregorian, org.joda.time.Instant cutoverInstant) {
		super(base, new java.lang.Object[]{ julian , gregorian , cutoverInstant });
	}

	private java.lang.Object readResolve() {
		return org.joda.time.chrono.GJChronology.getInstance(getZone(), iCutoverInstant, getMinimumDaysInFirstWeek());
	}

	public org.joda.time.DateTimeZone getZone() {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getZone();
		}
		return org.joda.time.DateTimeZone.UTC;
	}

	public org.joda.time.Chronology withUTC() {
		return withZone(org.joda.time.DateTimeZone.UTC);
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.GJChronology.this;
		}
		return org.joda.time.chrono.GJChronology.getInstance(zone, iCutoverInstant, getMinimumDaysInFirstWeek());
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
		}
		long instant = iGregorianChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
		if (instant < (iCutoverMillis)) {
			instant = iJulianChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
			if (instant >= (iCutoverMillis)) {
				throw new java.lang.IllegalArgumentException("Specified date does not exist");
			}
		}
		return instant;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if ((base = getBase()) != null) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		}
		long instant = iGregorianChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		if (instant < (iCutoverMillis)) {
			instant = iJulianChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
			if (instant >= (iCutoverMillis)) {
				throw new java.lang.IllegalArgumentException("Specified date does not exist");
			}
		}
		return instant;
	}

	public org.joda.time.Instant getGregorianCutover() {
		return iCutoverInstant;
	}

	public int getMinimumDaysInFirstWeek() {
		return iGregorianChronology.getMinimumDaysInFirstWeek();
	}

	public boolean equals(java.lang.Object obj) {
		return super.equals(obj);
	}

	public int hashCode() {
		return (((("GJ".hashCode()) * 11) + (iJulianChronology.hashCode())) + (iGregorianChronology.hashCode())) + (iCutoverInstant.hashCode());
	}

	public java.lang.String toString() {
		java.lang.StringBuffer sb = new java.lang.StringBuffer(60);
		sb.append("GJChronology");
		sb.append('[');
		sb.append(getZone().getID());
		if ((iCutoverMillis) != (org.joda.time.chrono.GJChronology.DEFAULT_CUTOVER.getMillis())) {
			sb.append(",cutover=");
			org.joda.time.format.DateTimeFormatter printer;
			if ((withUTC().dayOfYear().remainder(iCutoverMillis)) == 0) {
				printer = org.joda.time.format.ISODateTimeFormat.date();
			}else {
				printer = org.joda.time.format.ISODateTimeFormat.dateTime();
			}
			printer.withChronology(withUTC()).printTo(sb, iCutoverMillis);
		}
		if ((getMinimumDaysInFirstWeek()) != 4) {
			sb.append(",mdfw=");
			sb.append(getMinimumDaysInFirstWeek());
		}
		sb.append(']');
		return sb.toString();
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		java.lang.Object[] params = ((java.lang.Object[]) (getParam()));
		org.joda.time.chrono.JulianChronology julian = ((org.joda.time.chrono.JulianChronology) (params[0]));
		org.joda.time.chrono.GregorianChronology gregorian = ((org.joda.time.chrono.GregorianChronology) (params[1]));
		org.joda.time.Instant cutoverInstant = ((org.joda.time.Instant) (params[2]));
		iCutoverMillis = cutoverInstant.getMillis();
		iJulianChronology = julian;
		iGregorianChronology = gregorian;
		iCutoverInstant = cutoverInstant;
		if ((getBase()) != null) {
			return ;
		}
		if ((julian.getMinimumDaysInFirstWeek()) != (gregorian.getMinimumDaysInFirstWeek())) {
			throw new java.lang.IllegalArgumentException();
		}
		iGapDuration = (iCutoverMillis) - (julianToGregorianByYear(iCutoverMillis));
		fields.copyFieldsFrom(gregorian);
		if ((gregorian.millisOfDay().get(iCutoverMillis)) == 0) {
			fields.millisOfSecond = new org.joda.time.chrono.GJChronology.CutoverField(julian.millisOfSecond(), fields.millisOfSecond, iCutoverMillis);
			fields.millisOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.millisOfDay(), fields.millisOfDay, iCutoverMillis);
			fields.secondOfMinute = new org.joda.time.chrono.GJChronology.CutoverField(julian.secondOfMinute(), fields.secondOfMinute, iCutoverMillis);
			fields.secondOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.secondOfDay(), fields.secondOfDay, iCutoverMillis);
			fields.minuteOfHour = new org.joda.time.chrono.GJChronology.CutoverField(julian.minuteOfHour(), fields.minuteOfHour, iCutoverMillis);
			fields.minuteOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.minuteOfDay(), fields.minuteOfDay, iCutoverMillis);
			fields.hourOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.hourOfDay(), fields.hourOfDay, iCutoverMillis);
			fields.hourOfHalfday = new org.joda.time.chrono.GJChronology.CutoverField(julian.hourOfHalfday(), fields.hourOfHalfday, iCutoverMillis);
			fields.clockhourOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.clockhourOfDay(), fields.clockhourOfDay, iCutoverMillis);
			fields.clockhourOfHalfday = new org.joda.time.chrono.GJChronology.CutoverField(julian.clockhourOfHalfday(), fields.clockhourOfHalfday, iCutoverMillis);
			fields.halfdayOfDay = new org.joda.time.chrono.GJChronology.CutoverField(julian.halfdayOfDay(), fields.halfdayOfDay, iCutoverMillis);
		}
		{
			fields.era = new org.joda.time.chrono.GJChronology.CutoverField(julian.era(), fields.era, iCutoverMillis);
		}
		{
			long cutover = gregorian.year().roundCeiling(iCutoverMillis);
			fields.dayOfYear = new org.joda.time.chrono.GJChronology.CutoverField(julian.dayOfYear(), fields.dayOfYear, cutover);
		}
		{
			long cutover = gregorian.weekyear().roundCeiling(iCutoverMillis);
			fields.weekOfWeekyear = new org.joda.time.chrono.GJChronology.CutoverField(julian.weekOfWeekyear(), fields.weekOfWeekyear, cutover, true);
		}
		{
			fields.year = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.year(), fields.year, iCutoverMillis);
			fields.years = fields.year.getDurationField();
			fields.yearOfEra = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.yearOfEra(), fields.yearOfEra, fields.years, iCutoverMillis);
			fields.yearOfCentury = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.yearOfCentury(), fields.yearOfCentury, fields.years, iCutoverMillis);
			fields.centuryOfEra = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.centuryOfEra(), fields.centuryOfEra, iCutoverMillis);
			fields.centuries = fields.centuryOfEra.getDurationField();
			fields.monthOfYear = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.monthOfYear(), fields.monthOfYear, iCutoverMillis);
			fields.months = fields.monthOfYear.getDurationField();
			fields.weekyear = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.weekyear(), fields.weekyear, null, iCutoverMillis, true);
			fields.weekyearOfCentury = new org.joda.time.chrono.GJChronology.ImpreciseCutoverField(julian.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, iCutoverMillis);
			fields.weekyears = fields.weekyear.getDurationField();
		}
		{
			org.joda.time.chrono.GJChronology.CutoverField cf = new org.joda.time.chrono.GJChronology.CutoverField(julian.dayOfMonth(), fields.dayOfMonth, iCutoverMillis);
			cf.iRangeDurationField = fields.months;
			fields.dayOfMonth = cf;
		}
	}

	long julianToGregorianByYear(long instant) {
		return org.joda.time.chrono.GJChronology.convertByYear(instant, iJulianChronology, iGregorianChronology);
	}

	long gregorianToJulianByYear(long instant) {
		return org.joda.time.chrono.GJChronology.convertByYear(instant, iGregorianChronology, iJulianChronology);
	}

	long julianToGregorianByWeekyear(long instant) {
		return org.joda.time.chrono.GJChronology.convertByWeekyear(instant, iJulianChronology, iGregorianChronology);
	}

	long gregorianToJulianByWeekyear(long instant) {
		return org.joda.time.chrono.GJChronology.convertByWeekyear(instant, iGregorianChronology, iJulianChronology);
	}

	private class CutoverField extends org.joda.time.field.BaseDateTimeField {
		private static final long serialVersionUID = 3528501219481026402L;

		final org.joda.time.DateTimeField iJulianField;

		final org.joda.time.DateTimeField iGregorianField;

		final long iCutover;

		final boolean iConvertByWeekyear;

		protected org.joda.time.DurationField iDurationField;

		protected org.joda.time.DurationField iRangeDurationField;

		CutoverField(org.joda.time.DateTimeField julianField, org.joda.time.DateTimeField gregorianField, long cutoverMillis) {
			this(julianField, gregorianField, cutoverMillis, false);
		}

		CutoverField(org.joda.time.DateTimeField julianField, org.joda.time.DateTimeField gregorianField, long cutoverMillis, boolean convertByWeekyear) {
			super(gregorianField.getType());
			iJulianField = julianField;
			iGregorianField = gregorianField;
			iCutover = cutoverMillis;
			iConvertByWeekyear = convertByWeekyear;
			iDurationField = gregorianField.getDurationField();
			org.joda.time.DurationField rangeField = gregorianField.getRangeDurationField();
			if (rangeField == null) {
				rangeField = julianField.getRangeDurationField();
			}
			iRangeDurationField = rangeField;
		}

		public boolean isLenient() {
			return false;
		}

		public int get(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.get(instant);
			}else {
				return iJulianField.get(instant);
			}
		}

		public java.lang.String getAsText(long instant, java.util.Locale locale) {
			if (instant >= (iCutover)) {
				return iGregorianField.getAsText(instant, locale);
			}else {
				return iJulianField.getAsText(instant, locale);
			}
		}

		public java.lang.String getAsText(int fieldValue, java.util.Locale locale) {
			return iGregorianField.getAsText(fieldValue, locale);
		}

		public java.lang.String getAsShortText(long instant, java.util.Locale locale) {
			if (instant >= (iCutover)) {
				return iGregorianField.getAsShortText(instant, locale);
			}else {
				return iJulianField.getAsShortText(instant, locale);
			}
		}

		public java.lang.String getAsShortText(int fieldValue, java.util.Locale locale) {
			return iGregorianField.getAsShortText(fieldValue, locale);
		}

		public long add(long instant, int value) {
			return iGregorianField.add(instant, value);
		}

		public long add(long instant, long value) {
			return iGregorianField.add(instant, value);
		}

		public int[] add(org.joda.time.ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {
			if (valueToAdd == 0) {
				return values;
			}
			if (org.joda.time.DateTimeUtils.isContiguous(partial)) {
				long instant = 0L;
				for (int i = 0, isize = partial.size(); i < isize; i++) {
					instant = partial.getFieldType(i).getField(org.joda.time.chrono.GJChronology.this).set(instant, values[i]);
				}
				instant = add(instant, valueToAdd);
				return org.joda.time.chrono.GJChronology.this.get(partial, instant);
			}else {
				return super.add(partial, fieldIndex, values, valueToAdd);
			}
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
		}

		public long set(long instant, int value) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.set(instant, value);
				if (instant < (iCutover)) {
					if ((instant + (iGapDuration)) < (iCutover)) {
						instant = gregorianToJulian(instant);
					}
					if ((get(instant)) != value) {
						throw new org.joda.time.IllegalFieldValueException(iGregorianField.getType(), java.lang.Integer.valueOf(value), null, null);
					}
				}
			}else {
				instant = iJulianField.set(instant, value);
				if (instant >= (iCutover)) {
					if ((instant - (iGapDuration)) >= (iCutover)) {
						instant = julianToGregorian(instant);
					}
					if ((get(instant)) != value) {
						throw new org.joda.time.IllegalFieldValueException(iJulianField.getType(), java.lang.Integer.valueOf(value), null, null);
					}
				}
			}
			return instant;
		}

		public long set(long instant, java.lang.String text, java.util.Locale locale) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.set(instant, text, locale);
				if (instant < (iCutover)) {
					if ((instant + (iGapDuration)) < (iCutover)) {
						instant = gregorianToJulian(instant);
					}
				}
			}else {
				instant = iJulianField.set(instant, text, locale);
				if (instant >= (iCutover)) {
					if ((instant - (iGapDuration)) >= (iCutover)) {
						instant = julianToGregorian(instant);
					}
				}
			}
			return instant;
		}

		public org.joda.time.DurationField getDurationField() {
			return iDurationField;
		}

		public org.joda.time.DurationField getRangeDurationField() {
			return iRangeDurationField;
		}

		public boolean isLeap(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.isLeap(instant);
			}else {
				return iJulianField.isLeap(instant);
			}
		}

		public int getLeapAmount(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.getLeapAmount(instant);
			}else {
				return iJulianField.getLeapAmount(instant);
			}
		}

		public org.joda.time.DurationField getLeapDurationField() {
			return iGregorianField.getLeapDurationField();
		}

		public int getMinimumValue() {
			return iJulianField.getMinimumValue();
		}

		public int getMinimumValue(org.joda.time.ReadablePartial partial) {
			return iJulianField.getMinimumValue(partial);
		}

		public int getMinimumValue(org.joda.time.ReadablePartial partial, int[] values) {
			return iJulianField.getMinimumValue(partial, values);
		}

		public int getMinimumValue(long instant) {
			if (instant < (iCutover)) {
				return iJulianField.getMinimumValue(instant);
			}
			int min = iGregorianField.getMinimumValue(instant);
			instant = iGregorianField.set(instant, min);
			if (instant < (iCutover)) {
				min = iGregorianField.get(iCutover);
			}
			return min;
		}

		public int getMaximumValue() {
			return iGregorianField.getMaximumValue();
		}

		public int getMaximumValue(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.getMaximumValue(instant);
			}
			int max = iJulianField.getMaximumValue(instant);
			instant = iJulianField.set(instant, max);
			if (instant >= (iCutover)) {
				max = iJulianField.get(iJulianField.add(iCutover, (-1)));
			}
			return max;
		}

		public int getMaximumValue(org.joda.time.ReadablePartial partial) {
			long instant = org.joda.time.chrono.GJChronology.getInstanceUTC().set(partial, 0L);
			return getMaximumValue(instant);
		}

		public int getMaximumValue(org.joda.time.ReadablePartial partial, int[] values) {
			org.joda.time.Chronology chrono = org.joda.time.chrono.GJChronology.getInstanceUTC();
			long instant = 0L;
			for (int i = 0, isize = partial.size(); i < isize; i++) {
				org.joda.time.DateTimeField field = partial.getFieldType(i).getField(chrono);
				if ((values[i]) <= (field.getMaximumValue(instant))) {
					instant = field.set(instant, values[i]);
				}
			}
			return getMaximumValue(instant);
		}

		public long roundFloor(long instant) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.roundFloor(instant);
				if (instant < (iCutover)) {
					if ((instant + (iGapDuration)) < (iCutover)) {
						instant = gregorianToJulian(instant);
					}
				}
			}else {
				instant = iJulianField.roundFloor(instant);
			}
			return instant;
		}

		public long roundCeiling(long instant) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.roundCeiling(instant);
			}else {
				instant = iJulianField.roundCeiling(instant);
				if (instant >= (iCutover)) {
					if ((instant - (iGapDuration)) >= (iCutover)) {
						instant = julianToGregorian(instant);
					}
				}
			}
			return instant;
		}

		public int getMaximumTextLength(java.util.Locale locale) {
			return java.lang.Math.max(iJulianField.getMaximumTextLength(locale), iGregorianField.getMaximumTextLength(locale));
		}

		public int getMaximumShortTextLength(java.util.Locale locale) {
			return java.lang.Math.max(iJulianField.getMaximumShortTextLength(locale), iGregorianField.getMaximumShortTextLength(locale));
		}

		protected long julianToGregorian(long instant) {
			if (iConvertByWeekyear) {
				return julianToGregorianByWeekyear(instant);
			}else {
				return julianToGregorianByYear(instant);
			}
		}

		protected long gregorianToJulian(long instant) {
			if (iConvertByWeekyear) {
				return gregorianToJulianByWeekyear(instant);
			}else {
				return gregorianToJulianByYear(instant);
			}
		}
	}

	private final class ImpreciseCutoverField extends org.joda.time.chrono.GJChronology.CutoverField {
		private static final long serialVersionUID = 3410248757173576441L;

		ImpreciseCutoverField(org.joda.time.DateTimeField julianField, org.joda.time.DateTimeField gregorianField, long cutoverMillis) {
			this(julianField, gregorianField, null, cutoverMillis, false);
		}

		ImpreciseCutoverField(org.joda.time.DateTimeField julianField, org.joda.time.DateTimeField gregorianField, org.joda.time.DurationField durationField, long cutoverMillis) {
			this(julianField, gregorianField, durationField, cutoverMillis, false);
		}

		ImpreciseCutoverField(org.joda.time.DateTimeField julianField, org.joda.time.DateTimeField gregorianField, org.joda.time.DurationField durationField, long cutoverMillis, boolean convertByWeekyear) {
			super(julianField, gregorianField, cutoverMillis, convertByWeekyear);
			if (durationField == null) {
				durationField = new org.joda.time.chrono.GJChronology.LinkedDurationField(iDurationField, org.joda.time.chrono.GJChronology.ImpreciseCutoverField.this);
			}
			iDurationField = durationField;
		}

		public long add(long instant, int value) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.add(instant, value);
				if (instant < (iCutover)) {
					if ((instant + (iGapDuration)) < (iCutover)) {
						instant = gregorianToJulian(instant);
					}
				}
			}else {
				instant = iJulianField.add(instant, value);
				if (instant >= (iCutover)) {
					if ((instant - (iGapDuration)) >= (iCutover)) {
						instant = julianToGregorian(instant);
					}
				}
			}
			return instant;
		}

		public long add(long instant, long value) {
			if (instant >= (iCutover)) {
				instant = iGregorianField.add(instant, value);
				if (instant < (iCutover)) {
					if ((instant + (iGapDuration)) < (iCutover)) {
						instant = gregorianToJulian(instant);
					}
				}
			}else {
				instant = iJulianField.add(instant, value);
				if (instant >= (iCutover)) {
					if ((instant - (iGapDuration)) >= (iCutover)) {
						instant = julianToGregorian(instant);
					}
				}
			}
			return instant;
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			if (minuendInstant >= (iCutover)) {
				if (subtrahendInstant >= (iCutover)) {
					return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
				}
				minuendInstant = gregorianToJulian(minuendInstant);
				return iJulianField.getDifference(minuendInstant, subtrahendInstant);
			}else {
				if (subtrahendInstant < (iCutover)) {
					return iJulianField.getDifference(minuendInstant, subtrahendInstant);
				}
				minuendInstant = julianToGregorian(minuendInstant);
				return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
			}
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			if (minuendInstant >= (iCutover)) {
				if (subtrahendInstant >= (iCutover)) {
					return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
				}
				minuendInstant = gregorianToJulian(minuendInstant);
				return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
			}else {
				if (subtrahendInstant < (iCutover)) {
					return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
				}
				minuendInstant = julianToGregorian(minuendInstant);
				return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
			}
		}

		public int getMinimumValue(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.getMinimumValue(instant);
			}else {
				return iJulianField.getMinimumValue(instant);
			}
		}

		public int getMaximumValue(long instant) {
			if (instant >= (iCutover)) {
				return iGregorianField.getMaximumValue(instant);
			}else {
				return iJulianField.getMaximumValue(instant);
			}
		}
	}

	private static class LinkedDurationField extends org.joda.time.field.DecoratedDurationField {
		private static final long serialVersionUID = 4097975388007713084L;

		private final org.joda.time.chrono.GJChronology.ImpreciseCutoverField iField;

		LinkedDurationField(org.joda.time.DurationField durationField, org.joda.time.chrono.GJChronology.ImpreciseCutoverField dateTimeField) {
			super(durationField, durationField.getType());
			iField = dateTimeField;
		}

		public long add(long instant, int value) {
			return iField.add(instant, value);
		}

		public long add(long instant, long value) {
			return iField.add(instant, value);
		}

		public int getDifference(long minuendInstant, long subtrahendInstant) {
			return iField.getDifference(minuendInstant, subtrahendInstant);
		}

		public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
			return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
		}
	}
}


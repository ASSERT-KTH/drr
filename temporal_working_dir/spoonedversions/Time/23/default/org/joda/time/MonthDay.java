

package org.joda.time;


public final class MonthDay extends org.joda.time.base.BasePartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 2954560699050434609L;

	private static final org.joda.time.DateTimeFieldType[] FIELD_TYPES = new org.joda.time.DateTimeFieldType[]{ org.joda.time.DateTimeFieldType.monthOfYear() , org.joda.time.DateTimeFieldType.dayOfMonth() };

	private static final org.joda.time.format.DateTimeFormatter PARSER = new org.joda.time.format.DateTimeFormatterBuilder().appendOptional(org.joda.time.format.ISODateTimeFormat.localDateParser().getParser()).appendOptional(org.joda.time.format.DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

	public static final int MONTH_OF_YEAR = 0;

	public static final int DAY_OF_MONTH = 1;

	@org.joda.convert.FromString
	public static org.joda.time.MonthDay parse(java.lang.String str) {
		return org.joda.time.MonthDay.parse(str, org.joda.time.MonthDay.PARSER);
	}

	public static org.joda.time.MonthDay parse(java.lang.String str, org.joda.time.format.DateTimeFormatter formatter) {
		org.joda.time.LocalDate date = formatter.parseLocalDate(str);
		return new org.joda.time.MonthDay(date.getMonthOfYear(), date.getDayOfMonth());
	}

	public static org.joda.time.MonthDay fromCalendarFields(java.util.Calendar calendar) {
		if (calendar == null) {
			throw new java.lang.IllegalArgumentException("The calendar must not be null");
		}
		return new org.joda.time.MonthDay(((calendar.get(java.util.Calendar.MONTH)) + 1), calendar.get(java.util.Calendar.DAY_OF_MONTH));
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	public static org.joda.time.MonthDay fromDateFields(java.util.Date date) {
		if (date == null) {
			throw new java.lang.IllegalArgumentException("The date must not be null");
		}
		return new org.joda.time.MonthDay(((date.getMonth()) + 1), date.getDate());
	}

	public MonthDay() {
		super();
	}

	public MonthDay(org.joda.time.DateTimeZone zone) {
		super(org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public MonthDay(org.joda.time.Chronology chronology) {
		super(chronology);
	}

	public MonthDay(long instant) {
		super(instant);
	}

	public MonthDay(long instant, org.joda.time.Chronology chronology) {
		super(instant, chronology);
	}

	public MonthDay(java.lang.Object instant) {
		super(instant, null, org.joda.time.format.ISODateTimeFormat.localDateParser());
	}

	public MonthDay(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super(instant, org.joda.time.DateTimeUtils.getChronology(chronology), org.joda.time.format.ISODateTimeFormat.localDateParser());
	}

	public MonthDay(int monthOfYear, int dayOfMonth) {
		this(monthOfYear, dayOfMonth, null);
	}

	public MonthDay(int monthOfYear, int dayOfMonth, org.joda.time.Chronology chronology) {
		super(new int[]{ monthOfYear , dayOfMonth }, chronology);
	}

	MonthDay(org.joda.time.MonthDay partial, int[] values) {
		super(partial, values);
	}

	MonthDay(org.joda.time.MonthDay partial, org.joda.time.Chronology chrono) {
		super(partial, chrono);
	}

	private java.lang.Object readResolve() {
		if ((org.joda.time.DateTimeZone.UTC.equals(getChronology().getZone())) == false) {
			return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, getChronology().withUTC());
		}
		return org.joda.time.MonthDay.this;
	}

	public int size() {
		return 2;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		switch (index) {
			case org.joda.time.MonthDay.MONTH_OF_YEAR :
				return chrono.monthOfYear();
			case org.joda.time.MonthDay.DAY_OF_MONTH :
				return chrono.dayOfMonth();
			default :
				throw new java.lang.IndexOutOfBoundsException(("Invalid index: " + index));
		}
	}

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return org.joda.time.MonthDay.FIELD_TYPES[index];
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		return ((org.joda.time.DateTimeFieldType[]) (org.joda.time.MonthDay.FIELD_TYPES.clone()));
	}

	public org.joda.time.MonthDay withChronologyRetainFields(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		newChronology = newChronology.withUTC();
		if (newChronology == (getChronology())) {
			return org.joda.time.MonthDay.this;
		}else {
			org.joda.time.MonthDay newMonthDay = new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newChronology);
			newChronology.validate(newMonthDay, getValues());
			return newMonthDay;
		}
	}

	public org.joda.time.MonthDay withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		int index = indexOfSupported(fieldType);
		if (value == (getValue(index))) {
			return org.joda.time.MonthDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.MonthDay.this, index, newValues, value);
		return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newValues);
	}

	public org.joda.time.MonthDay withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.MonthDay.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).add(org.joda.time.MonthDay.this, index, newValues, amount);
		return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newValues);
	}

	public org.joda.time.MonthDay withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.MonthDay.this;
		}
		int[] newValues = getValues();
		for (int i = 0; i < (period.size()); i++) {
			org.joda.time.DurationFieldType fieldType = period.getFieldType(i);
			int index = indexOf(fieldType);
			if (index >= 0) {
				newValues = getField(index).add(org.joda.time.MonthDay.this, index, newValues, org.joda.time.field.FieldUtils.safeMultiply(period.getValue(i), scalar));
			}
		}
		return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newValues);
	}

	public org.joda.time.MonthDay plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.MonthDay plusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), months);
	}

	public org.joda.time.MonthDay plusDays(int days) {
		return withFieldAdded(org.joda.time.DurationFieldType.days(), days);
	}

	public org.joda.time.MonthDay minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.MonthDay minusMonths(int months) {
		return withFieldAdded(org.joda.time.DurationFieldType.months(), org.joda.time.field.FieldUtils.safeNegate(months));
	}

	public org.joda.time.MonthDay minusDays(int days) {
		return withFieldAdded(org.joda.time.DurationFieldType.days(), org.joda.time.field.FieldUtils.safeNegate(days));
	}

	public org.joda.time.LocalDate toLocalDate(int year) {
		return new org.joda.time.LocalDate(year, getMonthOfYear(), getDayOfMonth(), getChronology());
	}

	public int getMonthOfYear() {
		return getValue(org.joda.time.MonthDay.MONTH_OF_YEAR);
	}

	public int getDayOfMonth() {
		return getValue(org.joda.time.MonthDay.DAY_OF_MONTH);
	}

	public org.joda.time.MonthDay withMonthOfYear(int monthOfYear) {
		int[] newValues = getValues();
		newValues = getChronology().monthOfYear().set(org.joda.time.MonthDay.this, org.joda.time.MonthDay.MONTH_OF_YEAR, newValues, monthOfYear);
		return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newValues);
	}

	public org.joda.time.MonthDay withDayOfMonth(int dayOfMonth) {
		int[] newValues = getValues();
		newValues = getChronology().dayOfMonth().set(org.joda.time.MonthDay.this, org.joda.time.MonthDay.DAY_OF_MONTH, newValues, dayOfMonth);
		return new org.joda.time.MonthDay(org.joda.time.MonthDay.this, newValues);
	}

	public org.joda.time.MonthDay.Property property(org.joda.time.DateTimeFieldType type) {
		return new org.joda.time.MonthDay.Property(org.joda.time.MonthDay.this, indexOfSupported(type));
	}

	public org.joda.time.MonthDay.Property monthOfYear() {
		return new org.joda.time.MonthDay.Property(org.joda.time.MonthDay.this, org.joda.time.MonthDay.MONTH_OF_YEAR);
	}

	public org.joda.time.MonthDay.Property dayOfMonth() {
		return new org.joda.time.MonthDay.Property(org.joda.time.MonthDay.this, org.joda.time.MonthDay.DAY_OF_MONTH);
	}

	@org.joda.convert.ToString
	public java.lang.String toString() {
		java.util.List<org.joda.time.DateTimeFieldType> fields = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
		fields.add(org.joda.time.DateTimeFieldType.monthOfYear());
		fields.add(org.joda.time.DateTimeFieldType.dayOfMonth());
		return org.joda.time.format.ISODateTimeFormat.forFields(fields, true, true).print(org.joda.time.MonthDay.this);
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.MonthDay.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.MonthDay.this);
	}

	public static class Property extends org.joda.time.field.AbstractPartialFieldProperty implements java.io.Serializable {
		private static final long serialVersionUID = 5727734012190224363L;

		private final org.joda.time.MonthDay iBase;

		private final int iFieldIndex;

		Property(org.joda.time.MonthDay partial, int fieldIndex) {
			super();
			iBase = partial;
			iFieldIndex = fieldIndex;
		}

		public org.joda.time.DateTimeField getField() {
			return iBase.getField(iFieldIndex);
		}

		protected org.joda.time.ReadablePartial getReadablePartial() {
			return iBase;
		}

		public org.joda.time.MonthDay getMonthDay() {
			return iBase;
		}

		public int get() {
			return iBase.getValue(iFieldIndex);
		}

		public org.joda.time.MonthDay addToCopy(int valueToAdd) {
			int[] newValues = iBase.getValues();
			newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.MonthDay(iBase, newValues);
		}

		public org.joda.time.MonthDay addWrapFieldToCopy(int valueToAdd) {
			int[] newValues = iBase.getValues();
			newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.MonthDay(iBase, newValues);
		}

		public org.joda.time.MonthDay setCopy(int value) {
			int[] newValues = iBase.getValues();
			newValues = getField().set(iBase, iFieldIndex, newValues, value);
			return new org.joda.time.MonthDay(iBase, newValues);
		}

		public org.joda.time.MonthDay setCopy(java.lang.String text, java.util.Locale locale) {
			int[] newValues = iBase.getValues();
			newValues = getField().set(iBase, iFieldIndex, newValues, text, locale);
			return new org.joda.time.MonthDay(iBase, newValues);
		}

		public org.joda.time.MonthDay setCopy(java.lang.String text) {
			return setCopy(text, null);
		}
	}
}


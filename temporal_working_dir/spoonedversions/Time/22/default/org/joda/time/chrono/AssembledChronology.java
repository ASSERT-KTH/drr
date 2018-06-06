

package org.joda.time.chrono;


public abstract class AssembledChronology extends org.joda.time.chrono.BaseChronology {
	private static final long serialVersionUID = -6728465968995518215L;

	private final org.joda.time.Chronology iBase;

	private final java.lang.Object iParam;

	private transient org.joda.time.DurationField iMillis;

	private transient org.joda.time.DurationField iSeconds;

	private transient org.joda.time.DurationField iMinutes;

	private transient org.joda.time.DurationField iHours;

	private transient org.joda.time.DurationField iHalfdays;

	private transient org.joda.time.DurationField iDays;

	private transient org.joda.time.DurationField iWeeks;

	private transient org.joda.time.DurationField iWeekyears;

	private transient org.joda.time.DurationField iMonths;

	private transient org.joda.time.DurationField iYears;

	private transient org.joda.time.DurationField iCenturies;

	private transient org.joda.time.DurationField iEras;

	private transient org.joda.time.DateTimeField iMillisOfSecond;

	private transient org.joda.time.DateTimeField iMillisOfDay;

	private transient org.joda.time.DateTimeField iSecondOfMinute;

	private transient org.joda.time.DateTimeField iSecondOfDay;

	private transient org.joda.time.DateTimeField iMinuteOfHour;

	private transient org.joda.time.DateTimeField iMinuteOfDay;

	private transient org.joda.time.DateTimeField iHourOfDay;

	private transient org.joda.time.DateTimeField iClockhourOfDay;

	private transient org.joda.time.DateTimeField iHourOfHalfday;

	private transient org.joda.time.DateTimeField iClockhourOfHalfday;

	private transient org.joda.time.DateTimeField iHalfdayOfDay;

	private transient org.joda.time.DateTimeField iDayOfWeek;

	private transient org.joda.time.DateTimeField iDayOfMonth;

	private transient org.joda.time.DateTimeField iDayOfYear;

	private transient org.joda.time.DateTimeField iWeekOfWeekyear;

	private transient org.joda.time.DateTimeField iWeekyear;

	private transient org.joda.time.DateTimeField iWeekyearOfCentury;

	private transient org.joda.time.DateTimeField iMonthOfYear;

	private transient org.joda.time.DateTimeField iYear;

	private transient org.joda.time.DateTimeField iYearOfEra;

	private transient org.joda.time.DateTimeField iYearOfCentury;

	private transient org.joda.time.DateTimeField iCenturyOfEra;

	private transient org.joda.time.DateTimeField iEra;

	private transient int iBaseFlags;

	protected AssembledChronology(org.joda.time.Chronology base, java.lang.Object param) {
		iBase = base;
		iParam = param;
		setFields();
	}

	public org.joda.time.DateTimeZone getZone() {
		org.joda.time.Chronology base;
		if ((base = iBase) != null) {
			return base.getZone();
		}
		return null;
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if (((base = iBase) != null) && (((iBaseFlags) & 6) == 6)) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
		}
		return super.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
	}

	public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if (((base = iBase) != null) && (((iBaseFlags) & 5) == 5)) {
			return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		}
		return super.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
	}

	public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws java.lang.IllegalArgumentException {
		org.joda.time.Chronology base;
		if (((base = iBase) != null) && (((iBaseFlags) & 1) == 1)) {
			return base.getDateTimeMillis(instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		}
		return super.getDateTimeMillis(instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
	}

	public final org.joda.time.DurationField millis() {
		return iMillis;
	}

	public final org.joda.time.DateTimeField millisOfSecond() {
		return iMillisOfSecond;
	}

	public final org.joda.time.DateTimeField millisOfDay() {
		return iMillisOfDay;
	}

	public final org.joda.time.DurationField seconds() {
		return iSeconds;
	}

	public final org.joda.time.DateTimeField secondOfMinute() {
		return iSecondOfMinute;
	}

	public final org.joda.time.DateTimeField secondOfDay() {
		return iSecondOfDay;
	}

	public final org.joda.time.DurationField minutes() {
		return iMinutes;
	}

	public final org.joda.time.DateTimeField minuteOfHour() {
		return iMinuteOfHour;
	}

	public final org.joda.time.DateTimeField minuteOfDay() {
		return iMinuteOfDay;
	}

	public final org.joda.time.DurationField hours() {
		return iHours;
	}

	public final org.joda.time.DateTimeField hourOfDay() {
		return iHourOfDay;
	}

	public final org.joda.time.DateTimeField clockhourOfDay() {
		return iClockhourOfDay;
	}

	public final org.joda.time.DurationField halfdays() {
		return iHalfdays;
	}

	public final org.joda.time.DateTimeField hourOfHalfday() {
		return iHourOfHalfday;
	}

	public final org.joda.time.DateTimeField clockhourOfHalfday() {
		return iClockhourOfHalfday;
	}

	public final org.joda.time.DateTimeField halfdayOfDay() {
		return iHalfdayOfDay;
	}

	public final org.joda.time.DurationField days() {
		return iDays;
	}

	public final org.joda.time.DateTimeField dayOfWeek() {
		return iDayOfWeek;
	}

	public final org.joda.time.DateTimeField dayOfMonth() {
		return iDayOfMonth;
	}

	public final org.joda.time.DateTimeField dayOfYear() {
		return iDayOfYear;
	}

	public final org.joda.time.DurationField weeks() {
		return iWeeks;
	}

	public final org.joda.time.DateTimeField weekOfWeekyear() {
		return iWeekOfWeekyear;
	}

	public final org.joda.time.DurationField weekyears() {
		return iWeekyears;
	}

	public final org.joda.time.DateTimeField weekyear() {
		return iWeekyear;
	}

	public final org.joda.time.DateTimeField weekyearOfCentury() {
		return iWeekyearOfCentury;
	}

	public final org.joda.time.DurationField months() {
		return iMonths;
	}

	public final org.joda.time.DateTimeField monthOfYear() {
		return iMonthOfYear;
	}

	public final org.joda.time.DurationField years() {
		return iYears;
	}

	public final org.joda.time.DateTimeField year() {
		return iYear;
	}

	public final org.joda.time.DateTimeField yearOfEra() {
		return iYearOfEra;
	}

	public final org.joda.time.DateTimeField yearOfCentury() {
		return iYearOfCentury;
	}

	public final org.joda.time.DurationField centuries() {
		return iCenturies;
	}

	public final org.joda.time.DateTimeField centuryOfEra() {
		return iCenturyOfEra;
	}

	public final org.joda.time.DurationField eras() {
		return iEras;
	}

	public final org.joda.time.DateTimeField era() {
		return iEra;
	}

	protected abstract void assemble(org.joda.time.chrono.AssembledChronology.Fields fields);

	protected final org.joda.time.Chronology getBase() {
		return iBase;
	}

	protected final java.lang.Object getParam() {
		return iParam;
	}

	private void setFields() {
		org.joda.time.chrono.AssembledChronology.Fields fields = new org.joda.time.chrono.AssembledChronology.Fields();
		if ((iBase) != null) {
			fields.copyFieldsFrom(iBase);
		}
		assemble(fields);
		{
			org.joda.time.DurationField f;
			iMillis = ((f = fields.millis) != null) ? f : super.millis();
			iSeconds = ((f = fields.seconds) != null) ? f : super.seconds();
			iMinutes = ((f = fields.minutes) != null) ? f : super.minutes();
			iHours = ((f = fields.hours) != null) ? f : super.hours();
			iHalfdays = ((f = fields.halfdays) != null) ? f : super.halfdays();
			iDays = ((f = fields.days) != null) ? f : super.days();
			iWeeks = ((f = fields.weeks) != null) ? f : super.weeks();
			iWeekyears = ((f = fields.weekyears) != null) ? f : super.weekyears();
			iMonths = ((f = fields.months) != null) ? f : super.months();
			iYears = ((f = fields.years) != null) ? f : super.years();
			iCenturies = ((f = fields.centuries) != null) ? f : super.centuries();
			iEras = ((f = fields.eras) != null) ? f : super.eras();
		}
		{
			org.joda.time.DateTimeField f;
			iMillisOfSecond = ((f = fields.millisOfSecond) != null) ? f : super.millisOfSecond();
			iMillisOfDay = ((f = fields.millisOfDay) != null) ? f : super.millisOfDay();
			iSecondOfMinute = ((f = fields.secondOfMinute) != null) ? f : super.secondOfMinute();
			iSecondOfDay = ((f = fields.secondOfDay) != null) ? f : super.secondOfDay();
			iMinuteOfHour = ((f = fields.minuteOfHour) != null) ? f : super.minuteOfHour();
			iMinuteOfDay = ((f = fields.minuteOfDay) != null) ? f : super.minuteOfDay();
			iHourOfDay = ((f = fields.hourOfDay) != null) ? f : super.hourOfDay();
			iClockhourOfDay = ((f = fields.clockhourOfDay) != null) ? f : super.clockhourOfDay();
			iHourOfHalfday = ((f = fields.hourOfHalfday) != null) ? f : super.hourOfHalfday();
			iClockhourOfHalfday = ((f = fields.clockhourOfHalfday) != null) ? f : super.clockhourOfHalfday();
			iHalfdayOfDay = ((f = fields.halfdayOfDay) != null) ? f : super.halfdayOfDay();
			iDayOfWeek = ((f = fields.dayOfWeek) != null) ? f : super.dayOfWeek();
			iDayOfMonth = ((f = fields.dayOfMonth) != null) ? f : super.dayOfMonth();
			iDayOfYear = ((f = fields.dayOfYear) != null) ? f : super.dayOfYear();
			iWeekOfWeekyear = ((f = fields.weekOfWeekyear) != null) ? f : super.weekOfWeekyear();
			iWeekyear = ((f = fields.weekyear) != null) ? f : super.weekyear();
			iWeekyearOfCentury = ((f = fields.weekyearOfCentury) != null) ? f : super.weekyearOfCentury();
			iMonthOfYear = ((f = fields.monthOfYear) != null) ? f : super.monthOfYear();
			iYear = ((f = fields.year) != null) ? f : super.year();
			iYearOfEra = ((f = fields.yearOfEra) != null) ? f : super.yearOfEra();
			iYearOfCentury = ((f = fields.yearOfCentury) != null) ? f : super.yearOfCentury();
			iCenturyOfEra = ((f = fields.centuryOfEra) != null) ? f : super.centuryOfEra();
			iEra = ((f = fields.era) != null) ? f : super.era();
		}
		int flags;
		if ((iBase) == null) {
			flags = 0;
		}else {
			flags = ((((((iHourOfDay) == (iBase.hourOfDay())) && ((iMinuteOfHour) == (iBase.minuteOfHour()))) && ((iSecondOfMinute) == (iBase.secondOfMinute()))) && ((iMillisOfSecond) == (iBase.millisOfSecond())) ? 1 : 0) | ((iMillisOfDay) == (iBase.millisOfDay()) ? 2 : 0)) | ((((iYear) == (iBase.year())) && ((iMonthOfYear) == (iBase.monthOfYear()))) && ((iDayOfMonth) == (iBase.dayOfMonth())) ? 4 : 0);
		}
		iBaseFlags = flags;
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		in.defaultReadObject();
		setFields();
	}

	public static final class Fields {
		public org.joda.time.DurationField millis;

		public org.joda.time.DurationField seconds;

		public org.joda.time.DurationField minutes;

		public org.joda.time.DurationField hours;

		public org.joda.time.DurationField halfdays;

		public org.joda.time.DurationField days;

		public org.joda.time.DurationField weeks;

		public org.joda.time.DurationField weekyears;

		public org.joda.time.DurationField months;

		public org.joda.time.DurationField years;

		public org.joda.time.DurationField centuries;

		public org.joda.time.DurationField eras;

		public org.joda.time.DateTimeField millisOfSecond;

		public org.joda.time.DateTimeField millisOfDay;

		public org.joda.time.DateTimeField secondOfMinute;

		public org.joda.time.DateTimeField secondOfDay;

		public org.joda.time.DateTimeField minuteOfHour;

		public org.joda.time.DateTimeField minuteOfDay;

		public org.joda.time.DateTimeField hourOfDay;

		public org.joda.time.DateTimeField clockhourOfDay;

		public org.joda.time.DateTimeField hourOfHalfday;

		public org.joda.time.DateTimeField clockhourOfHalfday;

		public org.joda.time.DateTimeField halfdayOfDay;

		public org.joda.time.DateTimeField dayOfWeek;

		public org.joda.time.DateTimeField dayOfMonth;

		public org.joda.time.DateTimeField dayOfYear;

		public org.joda.time.DateTimeField weekOfWeekyear;

		public org.joda.time.DateTimeField weekyear;

		public org.joda.time.DateTimeField weekyearOfCentury;

		public org.joda.time.DateTimeField monthOfYear;

		public org.joda.time.DateTimeField year;

		public org.joda.time.DateTimeField yearOfEra;

		public org.joda.time.DateTimeField yearOfCentury;

		public org.joda.time.DateTimeField centuryOfEra;

		public org.joda.time.DateTimeField era;

		Fields() {
		}

		public void copyFieldsFrom(org.joda.time.Chronology chrono) {
			{
				org.joda.time.DurationField f;
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.millis()))) {
					millis = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.seconds()))) {
					seconds = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.minutes()))) {
					minutes = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.hours()))) {
					hours = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.halfdays()))) {
					halfdays = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.days()))) {
					days = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.weeks()))) {
					weeks = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.weekyears()))) {
					weekyears = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.months()))) {
					months = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.years()))) {
					years = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.centuries()))) {
					centuries = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.eras()))) {
					eras = f;
				}
			}
			{
				org.joda.time.DateTimeField f;
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.millisOfSecond()))) {
					millisOfSecond = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.millisOfDay()))) {
					millisOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.secondOfMinute()))) {
					secondOfMinute = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.secondOfDay()))) {
					secondOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.minuteOfHour()))) {
					minuteOfHour = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.minuteOfDay()))) {
					minuteOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.hourOfDay()))) {
					hourOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.clockhourOfDay()))) {
					clockhourOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.hourOfHalfday()))) {
					hourOfHalfday = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.clockhourOfHalfday()))) {
					clockhourOfHalfday = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.halfdayOfDay()))) {
					halfdayOfDay = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.dayOfWeek()))) {
					dayOfWeek = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.dayOfMonth()))) {
					dayOfMonth = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.dayOfYear()))) {
					dayOfYear = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.weekOfWeekyear()))) {
					weekOfWeekyear = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.weekyear()))) {
					weekyear = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.weekyearOfCentury()))) {
					weekyearOfCentury = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.monthOfYear()))) {
					monthOfYear = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.year()))) {
					year = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.yearOfEra()))) {
					yearOfEra = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.yearOfCentury()))) {
					yearOfCentury = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.centuryOfEra()))) {
					centuryOfEra = f;
				}
				if (org.joda.time.chrono.AssembledChronology.Fields.isSupported((f = chrono.era()))) {
					era = f;
				}
			}
		}

		private static boolean isSupported(org.joda.time.DurationField field) {
			return field == null ? false : field.isSupported();
		}

		private static boolean isSupported(org.joda.time.DateTimeField field) {
			return field == null ? false : field.isSupported();
		}
	}
}


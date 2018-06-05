

package org.joda.time.base;


public abstract class BaseDateTime extends org.joda.time.base.AbstractDateTime implements java.io.Serializable , org.joda.time.ReadableDateTime {
	private static final long serialVersionUID = -6728882245981L;

	private long iMillis;

	private org.joda.time.Chronology iChronology;

	public BaseDateTime() {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance());
	}

	public BaseDateTime(org.joda.time.DateTimeZone zone) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public BaseDateTime(org.joda.time.Chronology chronology) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), chronology);
	}

	public BaseDateTime(long instant) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance());
	}

	public BaseDateTime(long instant, org.joda.time.DateTimeZone zone) {
		this(instant, org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public BaseDateTime(long instant, org.joda.time.Chronology chronology) {
		super();
		iChronology = checkChronology(chronology);
		iMillis = checkInstant(instant, iChronology);
	}

	public BaseDateTime(java.lang.Object instant, org.joda.time.DateTimeZone zone) {
		super();
		org.joda.time.convert.InstantConverter converter = org.joda.time.convert.ConverterManager.getInstance().getInstantConverter(instant);
		org.joda.time.Chronology chrono = checkChronology(converter.getChronology(instant, zone));
		iChronology = chrono;
		iMillis = checkInstant(converter.getInstantMillis(instant, chrono), chrono);
	}

	public BaseDateTime(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super();
		org.joda.time.convert.InstantConverter converter = org.joda.time.convert.ConverterManager.getInstance().getInstantConverter(instant);
		iChronology = checkChronology(converter.getChronology(instant, chronology));
		iMillis = checkInstant(converter.getInstantMillis(instant, chronology), iChronology);
	}

	public BaseDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) {
		this(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, org.joda.time.chrono.ISOChronology.getInstance());
	}

	public BaseDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.DateTimeZone zone) {
		this(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, org.joda.time.chrono.ISOChronology.getInstance(zone));
	}

	public BaseDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, org.joda.time.Chronology chronology) {
		super();
		iChronology = checkChronology(chronology);
		long instant = iChronology.getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
		iMillis = checkInstant(instant, iChronology);
	}

	protected org.joda.time.Chronology checkChronology(org.joda.time.Chronology chronology) {
		return org.joda.time.DateTimeUtils.getChronology(chronology);
	}

	protected long checkInstant(long instant, org.joda.time.Chronology chronology) {
		return instant;
	}

	public long getMillis() {
		return iMillis;
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	protected void setMillis(long instant) {
		iMillis = checkInstant(instant, iChronology);
	}

	protected void setChronology(org.joda.time.Chronology chronology) {
		iChronology = checkChronology(chronology);
	}
}


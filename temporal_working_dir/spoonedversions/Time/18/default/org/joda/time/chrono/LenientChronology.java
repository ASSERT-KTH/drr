

package org.joda.time.chrono;


public final class LenientChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = -3148237568046877177L;

	public static org.joda.time.chrono.LenientChronology getInstance(org.joda.time.Chronology base) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Must supply a chronology");
		}
		return new org.joda.time.chrono.LenientChronology(base);
	}

	private transient org.joda.time.Chronology iWithUTC;

	private LenientChronology(org.joda.time.Chronology base) {
		super(base, null);
	}

	public org.joda.time.Chronology withUTC() {
		if ((iWithUTC) == null) {
			if ((getZone()) == (org.joda.time.DateTimeZone.UTC)) {
				iWithUTC = org.joda.time.chrono.LenientChronology.this;
			}else {
				iWithUTC = org.joda.time.chrono.LenientChronology.getInstance(getBase().withUTC());
			}
		}
		return iWithUTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (org.joda.time.DateTimeZone.UTC)) {
			return withUTC();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.LenientChronology.this;
		}
		return org.joda.time.chrono.LenientChronology.getInstance(getBase().withZone(zone));
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		fields.year = convertField(fields.year);
		fields.yearOfEra = convertField(fields.yearOfEra);
		fields.yearOfCentury = convertField(fields.yearOfCentury);
		fields.centuryOfEra = convertField(fields.centuryOfEra);
		fields.era = convertField(fields.era);
		fields.dayOfWeek = convertField(fields.dayOfWeek);
		fields.dayOfMonth = convertField(fields.dayOfMonth);
		fields.dayOfYear = convertField(fields.dayOfYear);
		fields.monthOfYear = convertField(fields.monthOfYear);
		fields.weekOfWeekyear = convertField(fields.weekOfWeekyear);
		fields.weekyear = convertField(fields.weekyear);
		fields.weekyearOfCentury = convertField(fields.weekyearOfCentury);
		fields.millisOfSecond = convertField(fields.millisOfSecond);
		fields.millisOfDay = convertField(fields.millisOfDay);
		fields.secondOfMinute = convertField(fields.secondOfMinute);
		fields.secondOfDay = convertField(fields.secondOfDay);
		fields.minuteOfHour = convertField(fields.minuteOfHour);
		fields.minuteOfDay = convertField(fields.minuteOfDay);
		fields.hourOfDay = convertField(fields.hourOfDay);
		fields.hourOfHalfday = convertField(fields.hourOfHalfday);
		fields.clockhourOfDay = convertField(fields.clockhourOfDay);
		fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday);
		fields.halfdayOfDay = convertField(fields.halfdayOfDay);
	}

	private final org.joda.time.DateTimeField convertField(org.joda.time.DateTimeField field) {
		return org.joda.time.field.LenientDateTimeField.getInstance(field, getBase());
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.chrono.LenientChronology.this) == obj) {
			return true;
		}
		if ((obj instanceof org.joda.time.chrono.LenientChronology) == false) {
			return false;
		}
		org.joda.time.chrono.LenientChronology chrono = ((org.joda.time.chrono.LenientChronology) (obj));
		return getBase().equals(chrono.getBase());
	}

	public int hashCode() {
		return 236548278 + ((getBase().hashCode()) * 7);
	}

	public java.lang.String toString() {
		return ("LenientChronology[" + (getBase().toString())) + ']';
	}
}


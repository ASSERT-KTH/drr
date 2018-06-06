

package org.joda.time.chrono;


public final class StrictChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = 6633006628097111960L;

	public static org.joda.time.chrono.StrictChronology getInstance(org.joda.time.Chronology base) {
		if (base == null) {
			throw new java.lang.IllegalArgumentException("Must supply a chronology");
		}
		return new org.joda.time.chrono.StrictChronology(base);
	}

	private transient org.joda.time.Chronology iWithUTC;

	private StrictChronology(org.joda.time.Chronology base) {
		super(base, null);
	}

	public org.joda.time.Chronology withUTC() {
		if ((iWithUTC) == null) {
			if ((getZone()) == (org.joda.time.DateTimeZone.UTC)) {
				iWithUTC = org.joda.time.chrono.StrictChronology.this;
			}else {
				iWithUTC = org.joda.time.chrono.StrictChronology.getInstance(getBase().withUTC());
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
			return org.joda.time.chrono.StrictChronology.this;
		}
		return org.joda.time.chrono.StrictChronology.getInstance(getBase().withZone(zone));
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		fields.year = org.joda.time.chrono.StrictChronology.convertField(fields.year);
		fields.yearOfEra = org.joda.time.chrono.StrictChronology.convertField(fields.yearOfEra);
		fields.yearOfCentury = org.joda.time.chrono.StrictChronology.convertField(fields.yearOfCentury);
		fields.centuryOfEra = org.joda.time.chrono.StrictChronology.convertField(fields.centuryOfEra);
		fields.era = org.joda.time.chrono.StrictChronology.convertField(fields.era);
		fields.dayOfWeek = org.joda.time.chrono.StrictChronology.convertField(fields.dayOfWeek);
		fields.dayOfMonth = org.joda.time.chrono.StrictChronology.convertField(fields.dayOfMonth);
		fields.dayOfYear = org.joda.time.chrono.StrictChronology.convertField(fields.dayOfYear);
		fields.monthOfYear = org.joda.time.chrono.StrictChronology.convertField(fields.monthOfYear);
		fields.weekOfWeekyear = org.joda.time.chrono.StrictChronology.convertField(fields.weekOfWeekyear);
		fields.weekyear = org.joda.time.chrono.StrictChronology.convertField(fields.weekyear);
		fields.weekyearOfCentury = org.joda.time.chrono.StrictChronology.convertField(fields.weekyearOfCentury);
		fields.millisOfSecond = org.joda.time.chrono.StrictChronology.convertField(fields.millisOfSecond);
		fields.millisOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.millisOfDay);
		fields.secondOfMinute = org.joda.time.chrono.StrictChronology.convertField(fields.secondOfMinute);
		fields.secondOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.secondOfDay);
		fields.minuteOfHour = org.joda.time.chrono.StrictChronology.convertField(fields.minuteOfHour);
		fields.minuteOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.minuteOfDay);
		fields.hourOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.hourOfDay);
		fields.hourOfHalfday = org.joda.time.chrono.StrictChronology.convertField(fields.hourOfHalfday);
		fields.clockhourOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.clockhourOfDay);
		fields.clockhourOfHalfday = org.joda.time.chrono.StrictChronology.convertField(fields.clockhourOfHalfday);
		fields.halfdayOfDay = org.joda.time.chrono.StrictChronology.convertField(fields.halfdayOfDay);
	}

	private static final org.joda.time.DateTimeField convertField(org.joda.time.DateTimeField field) {
		return org.joda.time.field.StrictDateTimeField.getInstance(field);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.chrono.StrictChronology.this) == obj) {
			return true;
		}
		if ((obj instanceof org.joda.time.chrono.StrictChronology) == false) {
			return false;
		}
		org.joda.time.chrono.StrictChronology chrono = ((org.joda.time.chrono.StrictChronology) (obj));
		return getBase().equals(chrono.getBase());
	}

	public int hashCode() {
		return 352831696 + ((getBase().hashCode()) * 7);
	}

	public java.lang.String toString() {
		return ("StrictChronology[" + (getBase().toString())) + ']';
	}
}


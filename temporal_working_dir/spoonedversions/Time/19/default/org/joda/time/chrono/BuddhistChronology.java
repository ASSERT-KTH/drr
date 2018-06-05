

package org.joda.time.chrono;


public final class BuddhistChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = -3474595157769370126L;

	public static final int BE = org.joda.time.DateTimeConstants.CE;

	private static final org.joda.time.DateTimeField ERA_FIELD = new org.joda.time.chrono.BasicSingleEraDateTimeField("BE");

	private static final int BUDDHIST_OFFSET = 543;

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.BuddhistChronology> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.BuddhistChronology>();

	private static final org.joda.time.chrono.BuddhistChronology INSTANCE_UTC = org.joda.time.chrono.BuddhistChronology.getInstance(org.joda.time.DateTimeZone.UTC);

	public static org.joda.time.chrono.BuddhistChronology getInstanceUTC() {
		return org.joda.time.chrono.BuddhistChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.BuddhistChronology getInstance() {
		return org.joda.time.chrono.BuddhistChronology.getInstance(org.joda.time.DateTimeZone.getDefault());
	}

	public static synchronized org.joda.time.chrono.BuddhistChronology getInstance(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		org.joda.time.chrono.BuddhistChronology chrono = org.joda.time.chrono.BuddhistChronology.cCache.get(zone);
		if (chrono == null) {
			chrono = new org.joda.time.chrono.BuddhistChronology(org.joda.time.chrono.GJChronology.getInstance(zone, null), null);
			org.joda.time.DateTime lowerLimit = new org.joda.time.DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
			chrono = new org.joda.time.chrono.BuddhistChronology(org.joda.time.chrono.LimitChronology.getInstance(chrono, lowerLimit, null), "");
			org.joda.time.chrono.BuddhistChronology.cCache.put(zone, chrono);
		}
		return chrono;
	}

	private BuddhistChronology(org.joda.time.Chronology base, java.lang.Object param) {
		super(base, param);
	}

	private java.lang.Object readResolve() {
		org.joda.time.Chronology base = getBase();
		return base == null ? org.joda.time.chrono.BuddhistChronology.getInstanceUTC() : org.joda.time.chrono.BuddhistChronology.getInstance(base.getZone());
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.BuddhistChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.BuddhistChronology.this;
		}
		return org.joda.time.chrono.BuddhistChronology.getInstance(zone);
	}

	public boolean equals(java.lang.Object obj) {
		return super.equals(obj);
	}

	public int hashCode() {
		return (("Buddhist".hashCode()) * 11) + (getZone().hashCode());
	}

	public java.lang.String toString() {
		java.lang.String str = "BuddhistChronology";
		org.joda.time.DateTimeZone zone = getZone();
		if (zone != null) {
			str = ((str + '[') + (zone.getID())) + ']';
		}
		return str;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getParam()) == null) {
			org.joda.time.DateTimeField field = fields.year;
			fields.year = new org.joda.time.field.OffsetDateTimeField(new org.joda.time.field.SkipUndoDateTimeField(org.joda.time.chrono.BuddhistChronology.this, field), org.joda.time.chrono.BuddhistChronology.BUDDHIST_OFFSET);
			field = fields.yearOfEra;
			fields.yearOfEra = new org.joda.time.field.DelegatedDateTimeField(fields.year, org.joda.time.DateTimeFieldType.yearOfEra());
			field = fields.weekyear;
			fields.weekyear = new org.joda.time.field.OffsetDateTimeField(new org.joda.time.field.SkipUndoDateTimeField(org.joda.time.chrono.BuddhistChronology.this, field), org.joda.time.chrono.BuddhistChronology.BUDDHIST_OFFSET);
			field = new org.joda.time.field.OffsetDateTimeField(fields.yearOfEra, 99);
			fields.centuryOfEra = new org.joda.time.field.DividedDateTimeField(field, org.joda.time.DateTimeFieldType.centuryOfEra(), 100);
			field = new org.joda.time.field.RemainderDateTimeField(((org.joda.time.field.DividedDateTimeField) (fields.centuryOfEra)));
			fields.yearOfCentury = new org.joda.time.field.OffsetDateTimeField(field, org.joda.time.DateTimeFieldType.yearOfCentury(), 1);
			field = new org.joda.time.field.RemainderDateTimeField(fields.weekyear, org.joda.time.DateTimeFieldType.weekyearOfCentury(), 100);
			fields.weekyearOfCentury = new org.joda.time.field.OffsetDateTimeField(field, org.joda.time.DateTimeFieldType.weekyearOfCentury(), 1);
			fields.era = org.joda.time.chrono.BuddhistChronology.ERA_FIELD;
		}
	}
}


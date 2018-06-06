

package org.joda.time.chrono;


public final class ISOChronology extends org.joda.time.chrono.AssembledChronology {
	private static final long serialVersionUID = -6212696554273812441L;

	private static final org.joda.time.chrono.ISOChronology INSTANCE_UTC;

	private static final int FAST_CACHE_SIZE = 64;

	private static final org.joda.time.chrono.ISOChronology[] cFastCache;

	private static final java.util.Map<org.joda.time.DateTimeZone, org.joda.time.chrono.ISOChronology> cCache = new java.util.HashMap<org.joda.time.DateTimeZone, org.joda.time.chrono.ISOChronology>();

	static {
		cFastCache = new org.joda.time.chrono.ISOChronology[org.joda.time.chrono.ISOChronology.FAST_CACHE_SIZE];
		INSTANCE_UTC = new org.joda.time.chrono.ISOChronology(org.joda.time.chrono.GregorianChronology.getInstanceUTC());
		org.joda.time.chrono.ISOChronology.cCache.put(org.joda.time.DateTimeZone.UTC, org.joda.time.chrono.ISOChronology.INSTANCE_UTC);
	}

	public static org.joda.time.chrono.ISOChronology getInstanceUTC() {
		return org.joda.time.chrono.ISOChronology.INSTANCE_UTC;
	}

	public static org.joda.time.chrono.ISOChronology getInstance() {
		return org.joda.time.chrono.ISOChronology.getInstance(org.joda.time.DateTimeZone.getDefault());
	}

	public static org.joda.time.chrono.ISOChronology getInstance(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		int index = (java.lang.System.identityHashCode(zone)) & ((org.joda.time.chrono.ISOChronology.FAST_CACHE_SIZE) - 1);
		org.joda.time.chrono.ISOChronology chrono = org.joda.time.chrono.ISOChronology.cFastCache[index];
		if ((chrono != null) && ((chrono.getZone()) == zone)) {
			return chrono;
		}
		synchronized(org.joda.time.chrono.ISOChronology.cCache) {
			chrono = org.joda.time.chrono.ISOChronology.cCache.get(zone);
			if (chrono == null) {
				chrono = new org.joda.time.chrono.ISOChronology(org.joda.time.chrono.ZonedChronology.getInstance(org.joda.time.chrono.ISOChronology.INSTANCE_UTC, zone));
				org.joda.time.chrono.ISOChronology.cCache.put(zone, chrono);
			}
		}
		org.joda.time.chrono.ISOChronology.cFastCache[index] = chrono;
		return chrono;
	}

	private ISOChronology(org.joda.time.Chronology base) {
		super(base, null);
	}

	public org.joda.time.Chronology withUTC() {
		return org.joda.time.chrono.ISOChronology.INSTANCE_UTC;
	}

	public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
		if (zone == null) {
			zone = org.joda.time.DateTimeZone.getDefault();
		}
		if (zone == (getZone())) {
			return org.joda.time.chrono.ISOChronology.this;
		}
		return org.joda.time.chrono.ISOChronology.getInstance(zone);
	}

	public java.lang.String toString() {
		java.lang.String str = "ISOChronology";
		org.joda.time.DateTimeZone zone = getZone();
		if (zone != null) {
			str = ((str + '[') + (zone.getID())) + ']';
		}
		return str;
	}

	protected void assemble(org.joda.time.chrono.AssembledChronology.Fields fields) {
		if ((getBase().getZone()) == (org.joda.time.DateTimeZone.UTC)) {
			fields.centuryOfEra = new org.joda.time.field.DividedDateTimeField(org.joda.time.chrono.ISOYearOfEraDateTimeField.INSTANCE, org.joda.time.DateTimeFieldType.centuryOfEra(), 100);
			fields.yearOfCentury = new org.joda.time.field.RemainderDateTimeField(((org.joda.time.field.DividedDateTimeField) (fields.centuryOfEra)), org.joda.time.DateTimeFieldType.yearOfCentury());
			fields.weekyearOfCentury = new org.joda.time.field.RemainderDateTimeField(((org.joda.time.field.DividedDateTimeField) (fields.centuryOfEra)), org.joda.time.DateTimeFieldType.weekyearOfCentury());
			fields.centuries = fields.centuryOfEra.getDurationField();
		}
	}

	public boolean equals(java.lang.Object obj) {
		return super.equals(obj);
	}

	public int hashCode() {
		return (("ISO".hashCode()) * 11) + (getZone().hashCode());
	}

	private java.lang.Object writeReplace() {
		return new org.joda.time.chrono.ISOChronology.Stub(getZone());
	}

	private static final class Stub implements java.io.Serializable {
		private static final long serialVersionUID = -6212696554273812441L;

		private transient org.joda.time.DateTimeZone iZone;

		Stub(org.joda.time.DateTimeZone zone) {
			iZone = zone;
		}

		private java.lang.Object readResolve() {
			return org.joda.time.chrono.ISOChronology.getInstance(iZone);
		}

		private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
			out.writeObject(iZone);
		}

		private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
			iZone = ((org.joda.time.DateTimeZone) (in.readObject()));
		}
	}
}


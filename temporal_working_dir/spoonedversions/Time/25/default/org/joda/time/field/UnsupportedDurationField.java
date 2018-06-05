

package org.joda.time.field;


public final class UnsupportedDurationField extends org.joda.time.DurationField implements java.io.Serializable {
	private static final long serialVersionUID = -6390301302770925357L;

	private static java.util.HashMap<org.joda.time.DurationFieldType, org.joda.time.field.UnsupportedDurationField> cCache;

	public static synchronized org.joda.time.field.UnsupportedDurationField getInstance(org.joda.time.DurationFieldType type) {
		org.joda.time.field.UnsupportedDurationField field;
		if ((org.joda.time.field.UnsupportedDurationField.cCache) == null) {
			org.joda.time.field.UnsupportedDurationField.cCache = new java.util.HashMap<org.joda.time.DurationFieldType, org.joda.time.field.UnsupportedDurationField>(7);
			field = null;
		}else {
			field = org.joda.time.field.UnsupportedDurationField.cCache.get(type);
		}
		if (field == null) {
			field = new org.joda.time.field.UnsupportedDurationField(type);
			org.joda.time.field.UnsupportedDurationField.cCache.put(type, field);
		}
		return field;
	}

	private final org.joda.time.DurationFieldType iType;

	private UnsupportedDurationField(org.joda.time.DurationFieldType type) {
		iType = type;
	}

	public final org.joda.time.DurationFieldType getType() {
		return iType;
	}

	public java.lang.String getName() {
		return iType.getName();
	}

	public boolean isSupported() {
		return false;
	}

	public boolean isPrecise() {
		return true;
	}

	public int getValue(long duration) {
		throw unsupported();
	}

	public long getValueAsLong(long duration) {
		throw unsupported();
	}

	public int getValue(long duration, long instant) {
		throw unsupported();
	}

	public long getValueAsLong(long duration, long instant) {
		throw unsupported();
	}

	public long getMillis(int value) {
		throw unsupported();
	}

	public long getMillis(long value) {
		throw unsupported();
	}

	public long getMillis(int value, long instant) {
		throw unsupported();
	}

	public long getMillis(long value, long instant) {
		throw unsupported();
	}

	public long add(long instant, int value) {
		throw unsupported();
	}

	public long add(long instant, long value) {
		throw unsupported();
	}

	public int getDifference(long minuendInstant, long subtrahendInstant) {
		throw unsupported();
	}

	public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
		throw unsupported();
	}

	public long getUnitMillis() {
		return 0;
	}

	public int compareTo(org.joda.time.DurationField durationField) {
		return 0;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.field.UnsupportedDurationField.this) == obj) {
			return true;
		}else
			if (obj instanceof org.joda.time.field.UnsupportedDurationField) {
				org.joda.time.field.UnsupportedDurationField other = ((org.joda.time.field.UnsupportedDurationField) (obj));
				if ((other.getName()) == null) {
					return (getName()) == null;
				}
				return other.getName().equals(getName());
			}
		
		return false;
	}

	public int hashCode() {
		return getName().hashCode();
	}

	public java.lang.String toString() {
		return ("UnsupportedDurationField[" + (getName())) + ']';
	}

	private java.lang.Object readResolve() {
		return org.joda.time.field.UnsupportedDurationField.getInstance(iType);
	}

	private java.lang.UnsupportedOperationException unsupported() {
		return new java.lang.UnsupportedOperationException(((iType) + " field is unsupported"));
	}
}


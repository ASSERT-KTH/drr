

package org.joda.time.field;


public class LenientDateTimeField extends org.joda.time.field.DelegatedDateTimeField {
	private static final long serialVersionUID = 8714085824173290599L;

	private final org.joda.time.Chronology iBase;

	public static org.joda.time.DateTimeField getInstance(org.joda.time.DateTimeField field, org.joda.time.Chronology base) {
		if (field == null) {
			return null;
		}
		if (field instanceof org.joda.time.field.StrictDateTimeField) {
			field = ((org.joda.time.field.StrictDateTimeField) (field)).getWrappedField();
		}
		if (field.isLenient()) {
			return field;
		}
		return new org.joda.time.field.LenientDateTimeField(field, base);
	}

	protected LenientDateTimeField(org.joda.time.DateTimeField field, org.joda.time.Chronology base) {
		super(field);
		iBase = base;
	}

	public final boolean isLenient() {
		return true;
	}

	public long set(long instant, int value) {
		long localInstant = iBase.getZone().convertUTCToLocal(instant);
		long difference = org.joda.time.field.FieldUtils.safeSubtract(value, get(instant));
		localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
		return iBase.getZone().convertLocalToUTC(localInstant, false);
	}
}


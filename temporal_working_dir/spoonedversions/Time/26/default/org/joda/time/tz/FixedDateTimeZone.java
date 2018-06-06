

package org.joda.time.tz;


public final class FixedDateTimeZone extends org.joda.time.DateTimeZone {
	private static final long serialVersionUID = -3513011772763289092L;

	private final java.lang.String iNameKey;

	private final int iWallOffset;

	private final int iStandardOffset;

	public FixedDateTimeZone(java.lang.String id, java.lang.String nameKey, int wallOffset, int standardOffset) {
		super(id);
		iNameKey = nameKey;
		iWallOffset = wallOffset;
		iStandardOffset = standardOffset;
	}

	public java.lang.String getNameKey(long instant) {
		return iNameKey;
	}

	public int getOffset(long instant) {
		return iWallOffset;
	}

	public int getStandardOffset(long instant) {
		return iStandardOffset;
	}

	public int getOffsetFromLocal(long instantLocal) {
		return iWallOffset;
	}

	public boolean isFixed() {
		return true;
	}

	public long nextTransition(long instant) {
		return instant;
	}

	public long previousTransition(long instant) {
		return instant;
	}

	public java.util.TimeZone toTimeZone() {
		java.lang.String id = getID();
		if (((id.length()) == 6) && ((id.startsWith("+")) || (id.startsWith("-")))) {
			return java.util.TimeZone.getTimeZone(("GMT" + (getID())));
		}
		return new java.util.SimpleTimeZone(iWallOffset, getID());
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.tz.FixedDateTimeZone.this) == obj) {
			return true;
		}
		if (obj instanceof org.joda.time.tz.FixedDateTimeZone) {
			org.joda.time.tz.FixedDateTimeZone other = ((org.joda.time.tz.FixedDateTimeZone) (obj));
			return ((getID().equals(other.getID())) && ((iStandardOffset) == (other.iStandardOffset))) && ((iWallOffset) == (other.iWallOffset));
		}
		return false;
	}

	public int hashCode() {
		return ((getID().hashCode()) + (37 * (iStandardOffset))) + (31 * (iWallOffset));
	}
}




package org.joda.time.tz;


public class CachedDateTimeZone extends org.joda.time.DateTimeZone {
	private static final long serialVersionUID = 5472298452022250685L;

	private static final int cInfoCacheMask;

	static {
		java.lang.Integer i;
		try {
			i = java.lang.Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
		} catch (java.lang.SecurityException e) {
			i = null;
		}
		int cacheSize;
		if (i == null) {
			cacheSize = 512;
		}else {
			cacheSize = i.intValue();
			cacheSize--;
			int shift = 0;
			while (cacheSize > 0) {
				shift++;
				cacheSize >>= 1;
			} 
			cacheSize = 1 << shift;
		}
		cInfoCacheMask = cacheSize - 1;
	}

	public static org.joda.time.tz.CachedDateTimeZone forZone(org.joda.time.DateTimeZone zone) {
		if (zone instanceof org.joda.time.tz.CachedDateTimeZone) {
			return ((org.joda.time.tz.CachedDateTimeZone) (zone));
		}
		return new org.joda.time.tz.CachedDateTimeZone(zone);
	}

	private final org.joda.time.DateTimeZone iZone;

	private final org.joda.time.tz.CachedDateTimeZone.Info[] iInfoCache = new org.joda.time.tz.CachedDateTimeZone.Info[(org.joda.time.tz.CachedDateTimeZone.cInfoCacheMask) + 1];

	private CachedDateTimeZone(org.joda.time.DateTimeZone zone) {
		super(zone.getID());
		iZone = zone;
	}

	public org.joda.time.DateTimeZone getUncachedZone() {
		return iZone;
	}

	public java.lang.String getNameKey(long instant) {
		return getInfo(instant).getNameKey(instant);
	}

	public int getOffset(long instant) {
		return getInfo(instant).getOffset(instant);
	}

	public int getStandardOffset(long instant) {
		return getInfo(instant).getStandardOffset(instant);
	}

	public boolean isFixed() {
		return iZone.isFixed();
	}

	public long nextTransition(long instant) {
		return iZone.nextTransition(instant);
	}

	public long previousTransition(long instant) {
		return iZone.previousTransition(instant);
	}

	public int hashCode() {
		return iZone.hashCode();
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.tz.CachedDateTimeZone.this) == obj) {
			return true;
		}
		if (obj instanceof org.joda.time.tz.CachedDateTimeZone) {
			return iZone.equals(((org.joda.time.tz.CachedDateTimeZone) (obj)).iZone);
		}
		return false;
	}

	private org.joda.time.tz.CachedDateTimeZone.Info getInfo(long millis) {
		int period = ((int) (millis >> 32));
		org.joda.time.tz.CachedDateTimeZone.Info[] cache = iInfoCache;
		int index = period & (org.joda.time.tz.CachedDateTimeZone.cInfoCacheMask);
		org.joda.time.tz.CachedDateTimeZone.Info info = cache[index];
		if ((info == null) || (((int) ((info.iPeriodStart) >> 32)) != period)) {
			info = createInfo(millis);
			cache[index] = info;
		}
		return info;
	}

	private org.joda.time.tz.CachedDateTimeZone.Info createInfo(long millis) {
		long periodStart = millis & (4294967295L << 32);
		org.joda.time.tz.CachedDateTimeZone.Info info = new org.joda.time.tz.CachedDateTimeZone.Info(iZone, periodStart);
		long end = periodStart | 4294967295L;
		org.joda.time.tz.CachedDateTimeZone.Info chain = info;
		while (true) {
			long next = iZone.nextTransition(periodStart);
			if ((next == periodStart) || (next > end)) {
				break;
			}
			periodStart = next;
			chain = chain.iNextInfo = new org.joda.time.tz.CachedDateTimeZone.Info(iZone, periodStart);
		} 
		return info;
	}

	private static final class Info {
		public final long iPeriodStart;

		public final org.joda.time.DateTimeZone iZoneRef;

		org.joda.time.tz.CachedDateTimeZone.Info iNextInfo;

		private java.lang.String iNameKey;

		private int iOffset = java.lang.Integer.MIN_VALUE;

		private int iStandardOffset = java.lang.Integer.MIN_VALUE;

		Info(org.joda.time.DateTimeZone zone, long periodStart) {
			iPeriodStart = periodStart;
			iZoneRef = zone;
		}

		public java.lang.String getNameKey(long millis) {
			if (((iNextInfo) == null) || (millis < (iNextInfo.iPeriodStart))) {
				if ((iNameKey) == null) {
					iNameKey = iZoneRef.getNameKey(iPeriodStart);
				}
				return iNameKey;
			}
			return iNextInfo.getNameKey(millis);
		}

		public int getOffset(long millis) {
			if (((iNextInfo) == null) || (millis < (iNextInfo.iPeriodStart))) {
				if ((iOffset) == (java.lang.Integer.MIN_VALUE)) {
					iOffset = iZoneRef.getOffset(iPeriodStart);
				}
				return iOffset;
			}
			return iNextInfo.getOffset(millis);
		}

		public int getStandardOffset(long millis) {
			if (((iNextInfo) == null) || (millis < (iNextInfo.iPeriodStart))) {
				if ((iStandardOffset) == (java.lang.Integer.MIN_VALUE)) {
					iStandardOffset = iZoneRef.getStandardOffset(iPeriodStart);
				}
				return iStandardOffset;
			}
			return iNextInfo.getStandardOffset(millis);
		}
	}
}


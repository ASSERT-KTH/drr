

package org.joda.time;


public abstract class DateTimeZone implements java.io.Serializable {
	private static final long serialVersionUID = 5546345482340108586L;

	public static final org.joda.time.DateTimeZone UTC = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, 0);

	private static org.joda.time.tz.Provider cProvider;

	private static org.joda.time.tz.NameProvider cNameProvider;

	private static java.util.Set<java.lang.String> cAvailableIDs;

	private static volatile org.joda.time.DateTimeZone cDefault;

	private static org.joda.time.format.DateTimeFormatter cOffsetFormatter;

	private static java.util.Map<java.lang.String, java.lang.ref.SoftReference<org.joda.time.DateTimeZone>> iFixedOffsetCache;

	private static java.util.Map<java.lang.String, java.lang.String> cZoneIdConversion;

	static {
		org.joda.time.DateTimeZone.setProvider0(null);
		org.joda.time.DateTimeZone.setNameProvider0(null);
	}

	public static org.joda.time.DateTimeZone getDefault() {
		org.joda.time.DateTimeZone zone = org.joda.time.DateTimeZone.cDefault;
		if (zone == null) {
			synchronized(org.joda.time.DateTimeZone.class) {
				zone = org.joda.time.DateTimeZone.cDefault;
				if (zone == null) {
					org.joda.time.DateTimeZone temp = null;
					try {
						try {
							java.lang.String id = java.lang.System.getProperty("user.timezone");
							if (id != null) {
								temp = org.joda.time.DateTimeZone.forID(id);
							}
						} catch (java.lang.RuntimeException ex) {
						}
						if (temp == null) {
							temp = org.joda.time.DateTimeZone.forTimeZone(java.util.TimeZone.getDefault());
						}
					} catch (java.lang.IllegalArgumentException ex) {
					}
					if (temp == null) {
						temp = org.joda.time.DateTimeZone.UTC;
					}
					org.joda.time.DateTimeZone.cDefault = zone = temp;
				}
			}
		}
		return zone;
	}

	public static void setDefault(org.joda.time.DateTimeZone zone) throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("DateTimeZone.setDefault"));
		}
		if (zone == null) {
			throw new java.lang.IllegalArgumentException("The datetime zone must not be null");
		}
		synchronized(org.joda.time.DateTimeZone.class) {
			org.joda.time.DateTimeZone.cDefault = zone;
		}
	}

	public static org.joda.time.DateTimeZone forID(java.lang.String id) {
		if (id == null) {
			return org.joda.time.DateTimeZone.getDefault();
		}
		if (id.equals("UTC")) {
			return org.joda.time.DateTimeZone.UTC;
		}
		org.joda.time.DateTimeZone zone = org.joda.time.DateTimeZone.cProvider.getZone(id);
		if (zone != null) {
			return zone;
		}
		if ((id.startsWith("+")) || (id.startsWith("-"))) {
			int offset = org.joda.time.DateTimeZone.parseOffset(id);
			if (offset == 0L) {
				return org.joda.time.DateTimeZone.UTC;
			}else {
				id = org.joda.time.DateTimeZone.printOffset(offset);
				return org.joda.time.DateTimeZone.fixedOffsetZone(id, offset);
			}
		}
		throw new java.lang.IllegalArgumentException((("The datetime zone id '" + id) + "' is not recognised"));
	}

	public static org.joda.time.DateTimeZone forOffsetHours(int hoursOffset) throws java.lang.IllegalArgumentException {
		return org.joda.time.DateTimeZone.forOffsetHoursMinutes(hoursOffset, 0);
	}

	public static org.joda.time.DateTimeZone forOffsetHoursMinutes(int hoursOffset, int minutesOffset) throws java.lang.IllegalArgumentException {
		if ((hoursOffset == 0) && (minutesOffset == 0)) {
			return org.joda.time.DateTimeZone.UTC;
		}
		if ((minutesOffset < 0) || (minutesOffset > 59)) {
			throw new java.lang.IllegalArgumentException(("Minutes out of range: " + minutesOffset));
		}
		int offset = 0;
		try {
			int hoursInMinutes = org.joda.time.field.FieldUtils.safeMultiply(hoursOffset, 60);
			if (hoursInMinutes < 0) {
				minutesOffset = org.joda.time.field.FieldUtils.safeAdd(hoursInMinutes, (-minutesOffset));
			}else {
				minutesOffset = org.joda.time.field.FieldUtils.safeAdd(hoursInMinutes, minutesOffset);
			}
			offset = org.joda.time.field.FieldUtils.safeMultiply(minutesOffset, org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
		} catch (java.lang.ArithmeticException ex) {
			throw new java.lang.IllegalArgumentException("Offset is too large");
		}
		return org.joda.time.DateTimeZone.forOffsetMillis(offset);
	}

	public static org.joda.time.DateTimeZone forOffsetMillis(int millisOffset) {
		java.lang.String id = org.joda.time.DateTimeZone.printOffset(millisOffset);
		return org.joda.time.DateTimeZone.fixedOffsetZone(id, millisOffset);
	}

	public static org.joda.time.DateTimeZone forTimeZone(java.util.TimeZone zone) {
		if (zone == null) {
			return org.joda.time.DateTimeZone.getDefault();
		}
		final java.lang.String id = zone.getID();
		if (id.equals("UTC")) {
			return org.joda.time.DateTimeZone.UTC;
		}
		org.joda.time.DateTimeZone dtz = null;
		java.lang.String convId = org.joda.time.DateTimeZone.getConvertedId(id);
		if (convId != null) {
			dtz = org.joda.time.DateTimeZone.cProvider.getZone(convId);
		}
		if (dtz == null) {
			dtz = org.joda.time.DateTimeZone.cProvider.getZone(id);
		}
		if (dtz != null) {
			return dtz;
		}
		if (convId == null) {
			convId = zone.getDisplayName();
			if ((convId.startsWith("GMT+")) || (convId.startsWith("GMT-"))) {
				convId = convId.substring(3);
				int offset = org.joda.time.DateTimeZone.parseOffset(convId);
				if (offset == 0L) {
					return org.joda.time.DateTimeZone.UTC;
				}else {
					convId = org.joda.time.DateTimeZone.printOffset(offset);
					return org.joda.time.DateTimeZone.fixedOffsetZone(convId, offset);
				}
			}
		}
		throw new java.lang.IllegalArgumentException((("The datetime zone id '" + id) + "' is not recognised"));
	}

	private static synchronized org.joda.time.DateTimeZone fixedOffsetZone(java.lang.String id, int offset) {
		if (offset == 0) {
			return org.joda.time.DateTimeZone.UTC;
		}
		if ((org.joda.time.DateTimeZone.iFixedOffsetCache) == null) {
			org.joda.time.DateTimeZone.iFixedOffsetCache = new java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<org.joda.time.DateTimeZone>>();
		}
		org.joda.time.DateTimeZone zone;
		java.lang.ref.Reference<org.joda.time.DateTimeZone> ref = org.joda.time.DateTimeZone.iFixedOffsetCache.get(id);
		if (ref != null) {
			zone = ref.get();
			if (zone != null) {
				return zone;
			}
		}
		zone = new org.joda.time.tz.FixedDateTimeZone(id, null, offset, offset);
		org.joda.time.DateTimeZone.iFixedOffsetCache.put(id, new java.lang.ref.SoftReference<org.joda.time.DateTimeZone>(zone));
		return zone;
	}

	public static java.util.Set<java.lang.String> getAvailableIDs() {
		return org.joda.time.DateTimeZone.cAvailableIDs;
	}

	public static org.joda.time.tz.Provider getProvider() {
		return org.joda.time.DateTimeZone.cProvider;
	}

	public static void setProvider(org.joda.time.tz.Provider provider) throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("DateTimeZone.setProvider"));
		}
		org.joda.time.DateTimeZone.setProvider0(provider);
	}

	private static void setProvider0(org.joda.time.tz.Provider provider) {
		if (provider == null) {
			provider = org.joda.time.DateTimeZone.getDefaultProvider();
		}
		java.util.Set<java.lang.String> ids = provider.getAvailableIDs();
		if ((ids == null) || ((ids.size()) == 0)) {
			throw new java.lang.IllegalArgumentException("The provider doesn't have any available ids");
		}
		if (!(ids.contains("UTC"))) {
			throw new java.lang.IllegalArgumentException("The provider doesn't support UTC");
		}
		if (!(org.joda.time.DateTimeZone.UTC.equals(provider.getZone("UTC")))) {
			throw new java.lang.IllegalArgumentException("Invalid UTC zone provided");
		}
		org.joda.time.DateTimeZone.cProvider = provider;
		org.joda.time.DateTimeZone.cAvailableIDs = ids;
	}

	private static org.joda.time.tz.Provider getDefaultProvider() {
		org.joda.time.tz.Provider provider = null;
		try {
			java.lang.String providerClass = java.lang.System.getProperty("org.joda.time.DateTimeZone.Provider");
			if (providerClass != null) {
				try {
					provider = ((org.joda.time.tz.Provider) (java.lang.Class.forName(providerClass).newInstance()));
				} catch (java.lang.Exception ex) {
					java.lang.Thread thread = java.lang.Thread.currentThread();
					thread.getThreadGroup().uncaughtException(thread, ex);
				}
			}
		} catch (java.lang.SecurityException ex) {
		}
		if (provider == null) {
			try {
				provider = new org.joda.time.tz.ZoneInfoProvider("org/joda/time/tz/data");
			} catch (java.lang.Exception ex) {
				java.lang.Thread thread = java.lang.Thread.currentThread();
				thread.getThreadGroup().uncaughtException(thread, ex);
			}
		}
		if (provider == null) {
			provider = new org.joda.time.tz.UTCProvider();
		}
		return provider;
	}

	public static org.joda.time.tz.NameProvider getNameProvider() {
		return org.joda.time.DateTimeZone.cNameProvider;
	}

	public static void setNameProvider(org.joda.time.tz.NameProvider nameProvider) throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("DateTimeZone.setNameProvider"));
		}
		org.joda.time.DateTimeZone.setNameProvider0(nameProvider);
	}

	private static void setNameProvider0(org.joda.time.tz.NameProvider nameProvider) {
		if (nameProvider == null) {
			nameProvider = org.joda.time.DateTimeZone.getDefaultNameProvider();
		}
		org.joda.time.DateTimeZone.cNameProvider = nameProvider;
	}

	private static org.joda.time.tz.NameProvider getDefaultNameProvider() {
		org.joda.time.tz.NameProvider nameProvider = null;
		try {
			java.lang.String providerClass = java.lang.System.getProperty("org.joda.time.DateTimeZone.NameProvider");
			if (providerClass != null) {
				try {
					nameProvider = ((org.joda.time.tz.NameProvider) (java.lang.Class.forName(providerClass).newInstance()));
				} catch (java.lang.Exception ex) {
					java.lang.Thread thread = java.lang.Thread.currentThread();
					thread.getThreadGroup().uncaughtException(thread, ex);
				}
			}
		} catch (java.lang.SecurityException ex) {
		}
		if (nameProvider == null) {
			nameProvider = new org.joda.time.tz.DefaultNameProvider();
		}
		return nameProvider;
	}

	private static synchronized java.lang.String getConvertedId(java.lang.String id) {
		java.util.Map<java.lang.String, java.lang.String> map = org.joda.time.DateTimeZone.cZoneIdConversion;
		if (map == null) {
			map = new java.util.HashMap<java.lang.String, java.lang.String>();
			map.put("GMT", "UTC");
			map.put("MIT", "Pacific/Apia");
			map.put("HST", "Pacific/Honolulu");
			map.put("AST", "America/Anchorage");
			map.put("PST", "America/Los_Angeles");
			map.put("MST", "America/Denver");
			map.put("PNT", "America/Phoenix");
			map.put("CST", "America/Chicago");
			map.put("EST", "America/New_York");
			map.put("IET", "America/Indianapolis");
			map.put("PRT", "America/Puerto_Rico");
			map.put("CNT", "America/St_Johns");
			map.put("AGT", "America/Buenos_Aires");
			map.put("BET", "America/Sao_Paulo");
			map.put("WET", "Europe/London");
			map.put("ECT", "Europe/Paris");
			map.put("ART", "Africa/Cairo");
			map.put("CAT", "Africa/Harare");
			map.put("EET", "Europe/Bucharest");
			map.put("EAT", "Africa/Addis_Ababa");
			map.put("MET", "Asia/Tehran");
			map.put("NET", "Asia/Yerevan");
			map.put("PLT", "Asia/Karachi");
			map.put("IST", "Asia/Calcutta");
			map.put("BST", "Asia/Dhaka");
			map.put("VST", "Asia/Saigon");
			map.put("CTT", "Asia/Shanghai");
			map.put("JST", "Asia/Tokyo");
			map.put("ACT", "Australia/Darwin");
			map.put("AET", "Australia/Sydney");
			map.put("SST", "Pacific/Guadalcanal");
			map.put("NST", "Pacific/Auckland");
			org.joda.time.DateTimeZone.cZoneIdConversion = map;
		}
		return map.get(id);
	}

	private static int parseOffset(java.lang.String str) {
		org.joda.time.Chronology chrono = new org.joda.time.chrono.BaseChronology() {
			public org.joda.time.DateTimeZone getZone() {
				return null;
			}

			public org.joda.time.Chronology withUTC() {
				return this;
			}

			public org.joda.time.Chronology withZone(org.joda.time.DateTimeZone zone) {
				return this;
			}

			public java.lang.String toString() {
				return getClass().getName();
			}
		};
		return -((int) (org.joda.time.DateTimeZone.offsetFormatter().withChronology(chrono).parseMillis(str)));
	}

	private static java.lang.String printOffset(int offset) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer();
		if (offset >= 0) {
			buf.append('+');
		}else {
			buf.append('-');
			offset = -offset;
		}
		int hours = offset / (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR);
		org.joda.time.format.FormatUtils.appendPaddedInteger(buf, hours, 2);
		offset -= hours * ((int) (org.joda.time.DateTimeConstants.MILLIS_PER_HOUR));
		int minutes = offset / (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
		buf.append(':');
		org.joda.time.format.FormatUtils.appendPaddedInteger(buf, minutes, 2);
		offset -= minutes * (org.joda.time.DateTimeConstants.MILLIS_PER_MINUTE);
		if (offset == 0) {
			return buf.toString();
		}
		int seconds = offset / (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
		buf.append(':');
		org.joda.time.format.FormatUtils.appendPaddedInteger(buf, seconds, 2);
		offset -= seconds * (org.joda.time.DateTimeConstants.MILLIS_PER_SECOND);
		if (offset == 0) {
			return buf.toString();
		}
		buf.append('.');
		org.joda.time.format.FormatUtils.appendPaddedInteger(buf, offset, 3);
		return buf.toString();
	}

	private static synchronized org.joda.time.format.DateTimeFormatter offsetFormatter() {
		if ((org.joda.time.DateTimeZone.cOffsetFormatter) == null) {
			org.joda.time.DateTimeZone.cOffsetFormatter = new org.joda.time.format.DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter();
		}
		return org.joda.time.DateTimeZone.cOffsetFormatter;
	}

	private final java.lang.String iID;

	protected DateTimeZone(java.lang.String id) {
		if (id == null) {
			throw new java.lang.IllegalArgumentException("Id must not be null");
		}
		iID = id;
	}

	public final java.lang.String getID() {
		return iID;
	}

	public abstract java.lang.String getNameKey(long instant);

	public final java.lang.String getShortName(long instant) {
		return getShortName(instant, null);
	}

	public java.lang.String getShortName(long instant, java.util.Locale locale) {
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		java.lang.String nameKey = getNameKey(instant);
		if (nameKey == null) {
			return iID;
		}
		java.lang.String name = org.joda.time.DateTimeZone.cNameProvider.getShortName(locale, iID, nameKey);
		if (name != null) {
			return name;
		}
		return org.joda.time.DateTimeZone.printOffset(getOffset(instant));
	}

	public final java.lang.String getName(long instant) {
		return getName(instant, null);
	}

	public java.lang.String getName(long instant, java.util.Locale locale) {
		if (locale == null) {
			locale = java.util.Locale.getDefault();
		}
		java.lang.String nameKey = getNameKey(instant);
		if (nameKey == null) {
			return iID;
		}
		java.lang.String name = org.joda.time.DateTimeZone.cNameProvider.getName(locale, iID, nameKey);
		if (name != null) {
			return name;
		}
		return org.joda.time.DateTimeZone.printOffset(getOffset(instant));
	}

	public abstract int getOffset(long instant);

	public final int getOffset(org.joda.time.ReadableInstant instant) {
		if (instant == null) {
			return getOffset(org.joda.time.DateTimeUtils.currentTimeMillis());
		}
		return getOffset(instant.getMillis());
	}

	public abstract int getStandardOffset(long instant);

	public boolean isStandardOffset(long instant) {
		return (getOffset(instant)) == (getStandardOffset(instant));
	}

	public int getOffsetFromLocal(long instantLocal) {
		int offsetLocal = getOffset(instantLocal);
		int offsetAdjusted = getOffset((instantLocal - offsetLocal));
		if (offsetLocal != offsetAdjusted) {
			if ((offsetLocal - offsetAdjusted) < 0) {
				long nextLocal = nextTransition((instantLocal - offsetLocal));
				long nextAdjusted = nextTransition((instantLocal - offsetAdjusted));
				if (nextLocal != nextAdjusted) {
					return offsetLocal;
				}
			}
		}
		return offsetAdjusted;
	}

	public long convertUTCToLocal(long instantUTC) {
		int offset = getOffset(instantUTC);
		long instantLocal = instantUTC + offset;
		if (((instantUTC ^ instantLocal) < 0) && ((instantUTC ^ offset) >= 0)) {
			throw new java.lang.ArithmeticException("Adding time zone offset caused overflow");
		}
		return instantLocal;
	}

	public long convertLocalToUTC(long instantLocal, boolean strict) {
		int offsetLocal = getOffset(instantLocal);
		int offset = getOffset((instantLocal - offsetLocal));
		if (offsetLocal != offset) {
			if (strict || (offsetLocal < 0)) {
				long nextLocal = nextTransition((instantLocal - offsetLocal));
				if (nextLocal == (instantLocal - offsetLocal)) {
					nextLocal = java.lang.Long.MAX_VALUE;
				}
				long nextAdjusted = nextTransition((instantLocal - offset));
				if (nextAdjusted == (instantLocal - offset)) {
					nextAdjusted = java.lang.Long.MAX_VALUE;
				}
				if (nextLocal != nextAdjusted) {
					if (strict) {
						throw new java.lang.IllegalArgumentException((((("Illegal instant due to time zone offset transition: " + (org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new org.joda.time.Instant(instantLocal)))) + " (") + (getID())) + ")"));
					}else {
						offset = offsetLocal;
					}
				}
			}
		}
		long instantUTC = instantLocal - offset;
		if (((instantLocal ^ instantUTC) < 0) && ((instantLocal ^ offset) < 0)) {
			throw new java.lang.ArithmeticException("Subtracting time zone offset caused overflow");
		}
		return instantUTC;
	}

	public long getMillisKeepLocal(org.joda.time.DateTimeZone newZone, long oldInstant) {
		if (newZone == null) {
			newZone = org.joda.time.DateTimeZone.getDefault();
		}
		if (newZone == (org.joda.time.DateTimeZone.this)) {
			return oldInstant;
		}
		long instantLocal = oldInstant + (getOffset(oldInstant));
		return instantLocal - (newZone.getOffsetFromLocal(instantLocal));
	}

	public boolean isLocalDateTimeGap(org.joda.time.LocalDateTime localDateTime) {
		if (isFixed()) {
			return false;
		}
		try {
			localDateTime.toDateTime(org.joda.time.DateTimeZone.this);
			return false;
		} catch (java.lang.IllegalArgumentException ex) {
			return true;
		}
	}

	public abstract boolean isFixed();

	public abstract long nextTransition(long instant);

	public abstract long previousTransition(long instant);

	public java.util.TimeZone toTimeZone() {
		return java.util.TimeZone.getTimeZone(iID);
	}

	public abstract boolean equals(java.lang.Object object);

	public int hashCode() {
		return 57 + (getID().hashCode());
	}

	public java.lang.String toString() {
		return getID();
	}

	protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
		return new org.joda.time.DateTimeZone.Stub(iID);
	}

	private static final class Stub implements java.io.Serializable {
		private static final long serialVersionUID = -6471952376487863581L;

		private transient java.lang.String iID;

		Stub(java.lang.String id) {
			iID = id;
		}

		private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
			out.writeUTF(iID);
		}

		private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
			iID = in.readUTF();
		}

		private java.lang.Object readResolve() throws java.io.ObjectStreamException {
			return org.joda.time.DateTimeZone.forID(iID);
		}
	}
}


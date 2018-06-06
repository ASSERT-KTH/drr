

package org.joda.time.tz;


public class DateTimeZoneBuilder {
	public static org.joda.time.DateTimeZone readFrom(java.io.InputStream in, java.lang.String id) throws java.io.IOException {
		if (in instanceof java.io.DataInput) {
			return org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput) (in)), id);
		}else {
			return org.joda.time.tz.DateTimeZoneBuilder.readFrom(((java.io.DataInput) (new java.io.DataInputStream(in))), id);
		}
	}

	public static org.joda.time.DateTimeZone readFrom(java.io.DataInput in, java.lang.String id) throws java.io.IOException {
		switch (in.readUnsignedByte()) {
			case 'F' :
				org.joda.time.DateTimeZone fixed = new org.joda.time.tz.FixedDateTimeZone(id, in.readUTF(), ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in))), ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in))));
				if (fixed.equals(org.joda.time.DateTimeZone.UTC)) {
					fixed = org.joda.time.DateTimeZone.UTC;
				}
				return fixed;
			case 'C' :
				return org.joda.time.tz.CachedDateTimeZone.forZone(org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.readFrom(in, id));
			case 'P' :
				return org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.readFrom(in, id);
			default :
				throw new java.io.IOException("Invalid encoding");
		}
	}

	static void writeMillis(java.io.DataOutput out, long millis) throws java.io.IOException {
		if ((millis % (30 * 60000L)) == 0) {
			long units = millis / (30 * 60000L);
			if (((units << (64 - 6)) >> (64 - 6)) == units) {
				out.writeByte(((int) (units & 63)));
				return ;
			}
		}
		if ((millis % 60000L) == 0) {
			long minutes = millis / 60000L;
			if (((minutes << (64 - 30)) >> (64 - 30)) == minutes) {
				out.writeInt((1073741824 | ((int) (minutes & 1073741823))));
				return ;
			}
		}
		if ((millis % 1000L) == 0) {
			long seconds = millis / 1000L;
			if (((seconds << (64 - 38)) >> (64 - 38)) == seconds) {
				out.writeByte((128 | ((int) ((seconds >> 32) & 63))));
				out.writeInt(((int) (seconds & -1)));
				return ;
			}
		}
		out.writeByte((millis < 0 ? 255 : 192));
		out.writeLong(millis);
	}

	static long readMillis(java.io.DataInput in) throws java.io.IOException {
		int v = in.readUnsignedByte();
		switch (v >> 6) {
			case 0 :
			default :
				v = (v << (32 - 6)) >> (32 - 6);
				return v * (30 * 60000L);
			case 1 :
				v = (v << (32 - 6)) >> (32 - 30);
				v |= (in.readUnsignedByte()) << 16;
				v |= (in.readUnsignedByte()) << 8;
				v |= in.readUnsignedByte();
				return v * 60000L;
			case 2 :
				long w = (((long) (v)) << (64 - 6)) >> (64 - 38);
				w |= (in.readUnsignedByte()) << 24;
				w |= (in.readUnsignedByte()) << 16;
				w |= (in.readUnsignedByte()) << 8;
				w |= in.readUnsignedByte();
				return w * 1000L;
			case 3 :
				return in.readLong();
		}
	}

	private static org.joda.time.DateTimeZone buildFixedZone(java.lang.String id, java.lang.String nameKey, int wallOffset, int standardOffset) {
		if (((("UTC".equals(id)) && (id.equals(nameKey))) && (wallOffset == 0)) && (standardOffset == 0)) {
			return org.joda.time.DateTimeZone.UTC;
		}
		return new org.joda.time.tz.FixedDateTimeZone(id, nameKey, wallOffset, standardOffset);
	}

	private final java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.RuleSet> iRuleSets;

	public DateTimeZoneBuilder() {
		iRuleSets = new java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.RuleSet>(10);
	}

	public org.joda.time.tz.DateTimeZoneBuilder addCutover(int year, char mode, int monthOfYear, int dayOfMonth, int dayOfWeek, boolean advanceDayOfWeek, int millisOfDay) {
		if ((iRuleSets.size()) > 0) {
			org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear = new org.joda.time.tz.DateTimeZoneBuilder.OfYear(mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
			org.joda.time.tz.DateTimeZoneBuilder.RuleSet lastRuleSet = iRuleSets.get(((iRuleSets.size()) - 1));
			lastRuleSet.setUpperLimit(year, ofYear);
		}
		iRuleSets.add(new org.joda.time.tz.DateTimeZoneBuilder.RuleSet());
		return org.joda.time.tz.DateTimeZoneBuilder.this;
	}

	public org.joda.time.tz.DateTimeZoneBuilder setStandardOffset(int standardOffset) {
		getLastRuleSet().setStandardOffset(standardOffset);
		return org.joda.time.tz.DateTimeZoneBuilder.this;
	}

	public org.joda.time.tz.DateTimeZoneBuilder setFixedSavings(java.lang.String nameKey, int saveMillis) {
		getLastRuleSet().setFixedSavings(nameKey, saveMillis);
		return org.joda.time.tz.DateTimeZoneBuilder.this;
	}

	public org.joda.time.tz.DateTimeZoneBuilder addRecurringSavings(java.lang.String nameKey, int saveMillis, int fromYear, int toYear, char mode, int monthOfYear, int dayOfMonth, int dayOfWeek, boolean advanceDayOfWeek, int millisOfDay) {
		if (fromYear <= toYear) {
			org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear = new org.joda.time.tz.DateTimeZoneBuilder.OfYear(mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence recurrence = new org.joda.time.tz.DateTimeZoneBuilder.Recurrence(ofYear, nameKey, saveMillis);
			org.joda.time.tz.DateTimeZoneBuilder.Rule rule = new org.joda.time.tz.DateTimeZoneBuilder.Rule(recurrence, fromYear, toYear);
			getLastRuleSet().addRule(rule);
		}
		return org.joda.time.tz.DateTimeZoneBuilder.this;
	}

	private org.joda.time.tz.DateTimeZoneBuilder.RuleSet getLastRuleSet() {
		if ((iRuleSets.size()) == 0) {
			addCutover(java.lang.Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
		}
		return iRuleSets.get(((iRuleSets.size()) - 1));
	}

	public org.joda.time.DateTimeZone toDateTimeZone(java.lang.String id, boolean outputID) {
		if (id == null) {
			throw new java.lang.IllegalArgumentException();
		}
		java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Transition> transitions = new java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Transition>();
		org.joda.time.tz.DateTimeZoneBuilder.DSTZone tailZone = null;
		long millis = java.lang.Long.MIN_VALUE;
		int saveMillis = 0;
		int ruleSetCount = iRuleSets.size();
		for (int i = 0; i < ruleSetCount; i++) {
			org.joda.time.tz.DateTimeZoneBuilder.RuleSet rs = iRuleSets.get(i);
			org.joda.time.tz.DateTimeZoneBuilder.Transition next = rs.firstTransition(millis);
			if (next == null) {
				continue;
			}
			addTransition(transitions, next);
			millis = next.getMillis();
			saveMillis = next.getSaveMillis();
			rs = new org.joda.time.tz.DateTimeZoneBuilder.RuleSet(rs);
			while ((next = rs.nextTransition(millis, saveMillis)) != null) {
				if (addTransition(transitions, next)) {
					if (tailZone != null) {
						break;
					}
				}
				millis = next.getMillis();
				saveMillis = next.getSaveMillis();
				if ((tailZone == null) && (i == (ruleSetCount - 1))) {
					tailZone = rs.buildTailZone(id);
				}
			} 
			millis = rs.getUpperLimit(saveMillis);
		}
		if ((transitions.size()) == 0) {
			if (tailZone != null) {
				return tailZone;
			}
			return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, "UTC", 0, 0);
		}
		if (((transitions.size()) == 1) && (tailZone == null)) {
			org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(0);
			return org.joda.time.tz.DateTimeZoneBuilder.buildFixedZone(id, tr.getNameKey(), tr.getWallOffset(), tr.getStandardOffset());
		}
		org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone zone = org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.create(id, outputID, transitions, tailZone);
		if (zone.isCachable()) {
			return org.joda.time.tz.CachedDateTimeZone.forZone(zone);
		}
		return zone;
	}

	private boolean addTransition(java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Transition> transitions, org.joda.time.tz.DateTimeZoneBuilder.Transition tr) {
		int size = transitions.size();
		if (size == 0) {
			transitions.add(tr);
			return true;
		}
		org.joda.time.tz.DateTimeZoneBuilder.Transition last = transitions.get((size - 1));
		if (!(tr.isTransitionFrom(last))) {
			return false;
		}
		int offsetForLast = 0;
		if (size >= 2) {
			offsetForLast = transitions.get((size - 2)).getWallOffset();
		}
		int offsetForNew = last.getWallOffset();
		long lastLocal = (last.getMillis()) + offsetForLast;
		long newLocal = (tr.getMillis()) + offsetForNew;
		if (newLocal != lastLocal) {
			transitions.add(tr);
			return true;
		}
		transitions.remove((size - 1));
		return addTransition(transitions, tr);
	}

	public void writeTo(java.lang.String zoneID, java.io.OutputStream out) throws java.io.IOException {
		if (out instanceof java.io.DataOutput) {
			writeTo(zoneID, ((java.io.DataOutput) (out)));
		}else {
			writeTo(zoneID, ((java.io.DataOutput) (new java.io.DataOutputStream(out))));
		}
	}

	public void writeTo(java.lang.String zoneID, java.io.DataOutput out) throws java.io.IOException {
		org.joda.time.DateTimeZone zone = toDateTimeZone(zoneID, false);
		if (zone instanceof org.joda.time.tz.FixedDateTimeZone) {
			out.writeByte('F');
			out.writeUTF(zone.getNameKey(0));
			org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, zone.getOffset(0));
			org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, zone.getStandardOffset(0));
		}else {
			if (zone instanceof org.joda.time.tz.CachedDateTimeZone) {
				out.writeByte('C');
				zone = ((org.joda.time.tz.CachedDateTimeZone) (zone)).getUncachedZone();
			}else {
				out.writeByte('P');
			}
			((org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone) (zone)).writeTo(out);
		}
	}

	private static final class OfYear {
		static org.joda.time.tz.DateTimeZoneBuilder.OfYear readFrom(java.io.DataInput in) throws java.io.IOException {
			return new org.joda.time.tz.DateTimeZoneBuilder.OfYear(((char) (in.readUnsignedByte())), ((int) (in.readUnsignedByte())), ((int) (in.readByte())), ((int) (in.readUnsignedByte())), in.readBoolean(), ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in))));
		}

		final char iMode;

		final int iMonthOfYear;

		final int iDayOfMonth;

		final int iDayOfWeek;

		final boolean iAdvance;

		final int iMillisOfDay;

		OfYear(char mode, int monthOfYear, int dayOfMonth, int dayOfWeek, boolean advanceDayOfWeek, int millisOfDay) {
			if (((mode != 'u') && (mode != 'w')) && (mode != 's')) {
				throw new java.lang.IllegalArgumentException(("Unknown mode: " + mode));
			}
			iMode = mode;
			iMonthOfYear = monthOfYear;
			iDayOfMonth = dayOfMonth;
			iDayOfWeek = dayOfWeek;
			iAdvance = advanceDayOfWeek;
			iMillisOfDay = millisOfDay;
		}

		public long setInstant(int year, int standardOffset, int saveMillis) {
			int offset;
			if ((iMode) == 'w') {
				offset = standardOffset + saveMillis;
			}else
				if ((iMode) == 's') {
					offset = standardOffset;
				}else {
					offset = 0;
				}
			
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			long millis = chrono.year().set(0, year);
			millis = chrono.monthOfYear().set(millis, iMonthOfYear);
			millis = chrono.millisOfDay().set(millis, iMillisOfDay);
			millis = setDayOfMonth(chrono, millis);
			if ((iDayOfWeek) != 0) {
				millis = setDayOfWeek(chrono, millis);
			}
			return millis - offset;
		}

		public long next(long instant, int standardOffset, int saveMillis) {
			int offset;
			if ((iMode) == 'w') {
				offset = standardOffset + saveMillis;
			}else
				if ((iMode) == 's') {
					offset = standardOffset;
				}else {
					offset = 0;
				}
			
			instant += offset;
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			long next = chrono.monthOfYear().set(instant, iMonthOfYear);
			next = chrono.millisOfDay().set(next, 0);
			next = chrono.millisOfDay().add(next, iMillisOfDay);
			next = setDayOfMonthNext(chrono, next);
			if ((iDayOfWeek) == 0) {
				if (next <= instant) {
					next = chrono.year().add(next, 1);
					next = setDayOfMonthNext(chrono, next);
				}
			}else {
				next = setDayOfWeek(chrono, next);
				if (next <= instant) {
					next = chrono.year().add(next, 1);
					next = chrono.monthOfYear().set(next, iMonthOfYear);
					next = setDayOfMonthNext(chrono, next);
					next = setDayOfWeek(chrono, next);
				}
			}
			return next - offset;
		}

		public long previous(long instant, int standardOffset, int saveMillis) {
			int offset;
			if ((iMode) == 'w') {
				offset = standardOffset + saveMillis;
			}else
				if ((iMode) == 's') {
					offset = standardOffset;
				}else {
					offset = 0;
				}
			
			instant += offset;
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			long prev = chrono.monthOfYear().set(instant, iMonthOfYear);
			prev = chrono.millisOfDay().set(prev, 0);
			prev = chrono.millisOfDay().add(prev, iMillisOfDay);
			prev = setDayOfMonthPrevious(chrono, prev);
			if ((iDayOfWeek) == 0) {
				if (prev >= instant) {
					prev = chrono.year().add(prev, (-1));
					prev = setDayOfMonthPrevious(chrono, prev);
				}
			}else {
				prev = setDayOfWeek(chrono, prev);
				if (prev >= instant) {
					prev = chrono.year().add(prev, (-1));
					prev = chrono.monthOfYear().set(prev, iMonthOfYear);
					prev = setDayOfMonthPrevious(chrono, prev);
					prev = setDayOfWeek(chrono, prev);
				}
			}
			return prev - offset;
		}

		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.tz.DateTimeZoneBuilder.OfYear.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.tz.DateTimeZoneBuilder.OfYear) {
				org.joda.time.tz.DateTimeZoneBuilder.OfYear other = ((org.joda.time.tz.DateTimeZoneBuilder.OfYear) (obj));
				return ((((((iMode) == (other.iMode)) && ((iMonthOfYear) == (other.iMonthOfYear))) && ((iDayOfMonth) == (other.iDayOfMonth))) && ((iDayOfWeek) == (other.iDayOfWeek))) && ((iAdvance) == (other.iAdvance))) && ((iMillisOfDay) == (other.iMillisOfDay));
			}
			return false;
		}

		public void writeTo(java.io.DataOutput out) throws java.io.IOException {
			out.writeByte(iMode);
			out.writeByte(iMonthOfYear);
			out.writeByte(iDayOfMonth);
			out.writeByte(iDayOfWeek);
			out.writeBoolean(iAdvance);
			org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iMillisOfDay);
		}

		private long setDayOfMonthNext(org.joda.time.Chronology chrono, long next) {
			try {
				next = setDayOfMonth(chrono, next);
			} catch (java.lang.IllegalArgumentException e) {
				if (((iMonthOfYear) == 2) && ((iDayOfMonth) == 29)) {
					while ((chrono.year().isLeap(next)) == false) {
						next = chrono.year().add(next, 1);
					} 
					next = setDayOfMonth(chrono, next);
				}else {
					throw e;
				}
			}
			return next;
		}

		private long setDayOfMonthPrevious(org.joda.time.Chronology chrono, long prev) {
			try {
				prev = setDayOfMonth(chrono, prev);
			} catch (java.lang.IllegalArgumentException e) {
				if (((iMonthOfYear) == 2) && ((iDayOfMonth) == 29)) {
					while ((chrono.year().isLeap(prev)) == false) {
						prev = chrono.year().add(prev, (-1));
					} 
					prev = setDayOfMonth(chrono, prev);
				}else {
					throw e;
				}
			}
			return prev;
		}

		private long setDayOfMonth(org.joda.time.Chronology chrono, long instant) {
			if ((iDayOfMonth) >= 0) {
				instant = chrono.dayOfMonth().set(instant, iDayOfMonth);
			}else {
				instant = chrono.dayOfMonth().set(instant, 1);
				instant = chrono.monthOfYear().add(instant, 1);
				instant = chrono.dayOfMonth().add(instant, iDayOfMonth);
			}
			return instant;
		}

		private long setDayOfWeek(org.joda.time.Chronology chrono, long instant) {
			int dayOfWeek = chrono.dayOfWeek().get(instant);
			int daysToAdd = (iDayOfWeek) - dayOfWeek;
			if (daysToAdd != 0) {
				if (iAdvance) {
					if (daysToAdd < 0) {
						daysToAdd += 7;
					}
				}else {
					if (daysToAdd > 0) {
						daysToAdd -= 7;
					}
				}
				instant = chrono.dayOfWeek().add(instant, daysToAdd);
			}
			return instant;
		}
	}

	private static final class Recurrence {
		static org.joda.time.tz.DateTimeZoneBuilder.Recurrence readFrom(java.io.DataInput in) throws java.io.IOException {
			return new org.joda.time.tz.DateTimeZoneBuilder.Recurrence(org.joda.time.tz.DateTimeZoneBuilder.OfYear.readFrom(in), in.readUTF(), ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in))));
		}

		final org.joda.time.tz.DateTimeZoneBuilder.OfYear iOfYear;

		final java.lang.String iNameKey;

		final int iSaveMillis;

		Recurrence(org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear, java.lang.String nameKey, int saveMillis) {
			iOfYear = ofYear;
			iNameKey = nameKey;
			iSaveMillis = saveMillis;
		}

		public org.joda.time.tz.DateTimeZoneBuilder.OfYear getOfYear() {
			return iOfYear;
		}

		public long next(long instant, int standardOffset, int saveMillis) {
			return iOfYear.next(instant, standardOffset, saveMillis);
		}

		public long previous(long instant, int standardOffset, int saveMillis) {
			return iOfYear.previous(instant, standardOffset, saveMillis);
		}

		public java.lang.String getNameKey() {
			return iNameKey;
		}

		public int getSaveMillis() {
			return iSaveMillis;
		}

		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.tz.DateTimeZoneBuilder.Recurrence.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.tz.DateTimeZoneBuilder.Recurrence) {
				org.joda.time.tz.DateTimeZoneBuilder.Recurrence other = ((org.joda.time.tz.DateTimeZoneBuilder.Recurrence) (obj));
				return (((iSaveMillis) == (other.iSaveMillis)) && (iNameKey.equals(other.iNameKey))) && (iOfYear.equals(other.iOfYear));
			}
			return false;
		}

		public void writeTo(java.io.DataOutput out) throws java.io.IOException {
			iOfYear.writeTo(out);
			out.writeUTF(iNameKey);
			org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iSaveMillis);
		}

		org.joda.time.tz.DateTimeZoneBuilder.Recurrence rename(java.lang.String nameKey) {
			return new org.joda.time.tz.DateTimeZoneBuilder.Recurrence(iOfYear, nameKey, iSaveMillis);
		}

		org.joda.time.tz.DateTimeZoneBuilder.Recurrence renameAppend(java.lang.String appendNameKey) {
			return rename(((iNameKey) + appendNameKey).intern());
		}
	}

	private static final class Rule {
		final org.joda.time.tz.DateTimeZoneBuilder.Recurrence iRecurrence;

		final int iFromYear;

		final int iToYear;

		Rule(org.joda.time.tz.DateTimeZoneBuilder.Recurrence recurrence, int fromYear, int toYear) {
			iRecurrence = recurrence;
			iFromYear = fromYear;
			iToYear = toYear;
		}

		public int getFromYear() {
			return iFromYear;
		}

		public int getToYear() {
			return iToYear;
		}

		public org.joda.time.tz.DateTimeZoneBuilder.OfYear getOfYear() {
			return iRecurrence.getOfYear();
		}

		public java.lang.String getNameKey() {
			return iRecurrence.getNameKey();
		}

		public int getSaveMillis() {
			return iRecurrence.getSaveMillis();
		}

		public long next(final long instant, int standardOffset, int saveMillis) {
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			final int wallOffset = standardOffset + saveMillis;
			long testInstant = instant;
			int year;
			if (instant == (java.lang.Long.MIN_VALUE)) {
				year = java.lang.Integer.MIN_VALUE;
			}else {
				year = chrono.year().get((instant + wallOffset));
			}
			if (year < (iFromYear)) {
				testInstant = (chrono.year().set(0, iFromYear)) - wallOffset;
				testInstant -= 1;
			}
			long next = iRecurrence.next(testInstant, standardOffset, saveMillis);
			if (next > instant) {
				year = chrono.year().get((next + wallOffset));
				if (year > (iToYear)) {
					next = instant;
				}
			}
			return next;
		}
	}

	private static final class Transition {
		private final long iMillis;

		private final java.lang.String iNameKey;

		private final int iWallOffset;

		private final int iStandardOffset;

		Transition(long millis, org.joda.time.tz.DateTimeZoneBuilder.Transition tr) {
			iMillis = millis;
			iNameKey = tr.iNameKey;
			iWallOffset = tr.iWallOffset;
			iStandardOffset = tr.iStandardOffset;
		}

		Transition(long millis, org.joda.time.tz.DateTimeZoneBuilder.Rule rule, int standardOffset) {
			iMillis = millis;
			iNameKey = rule.getNameKey();
			iWallOffset = standardOffset + (rule.getSaveMillis());
			iStandardOffset = standardOffset;
		}

		Transition(long millis, java.lang.String nameKey, int wallOffset, int standardOffset) {
			iMillis = millis;
			iNameKey = nameKey;
			iWallOffset = wallOffset;
			iStandardOffset = standardOffset;
		}

		public long getMillis() {
			return iMillis;
		}

		public java.lang.String getNameKey() {
			return iNameKey;
		}

		public int getWallOffset() {
			return iWallOffset;
		}

		public int getStandardOffset() {
			return iStandardOffset;
		}

		public int getSaveMillis() {
			return (iWallOffset) - (iStandardOffset);
		}

		public boolean isTransitionFrom(org.joda.time.tz.DateTimeZoneBuilder.Transition other) {
			if (other == null) {
				return true;
			}
			return ((iMillis) > (other.iMillis)) && (((iWallOffset) != (other.iWallOffset)) || (!(iNameKey.equals(other.iNameKey))));
		}
	}

	private static final class RuleSet {
		private static final int YEAR_LIMIT;

		static {
			long now = org.joda.time.DateTimeUtils.currentTimeMillis();
			YEAR_LIMIT = (org.joda.time.chrono.ISOChronology.getInstanceUTC().year().get(now)) + 100;
		}

		private int iStandardOffset;

		private java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Rule> iRules;

		private java.lang.String iInitialNameKey;

		private int iInitialSaveMillis;

		private int iUpperYear;

		private org.joda.time.tz.DateTimeZoneBuilder.OfYear iUpperOfYear;

		RuleSet() {
			iRules = new java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Rule>(10);
			iUpperYear = java.lang.Integer.MAX_VALUE;
		}

		RuleSet(org.joda.time.tz.DateTimeZoneBuilder.RuleSet rs) {
			iStandardOffset = rs.iStandardOffset;
			iRules = new java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Rule>(rs.iRules);
			iInitialNameKey = rs.iInitialNameKey;
			iInitialSaveMillis = rs.iInitialSaveMillis;
			iUpperYear = rs.iUpperYear;
			iUpperOfYear = rs.iUpperOfYear;
		}

		public int getStandardOffset() {
			return iStandardOffset;
		}

		public void setStandardOffset(int standardOffset) {
			iStandardOffset = standardOffset;
		}

		public void setFixedSavings(java.lang.String nameKey, int saveMillis) {
			iInitialNameKey = nameKey;
			iInitialSaveMillis = saveMillis;
		}

		public void addRule(org.joda.time.tz.DateTimeZoneBuilder.Rule rule) {
			if (!(iRules.contains(rule))) {
				iRules.add(rule);
			}
		}

		public void setUpperLimit(int year, org.joda.time.tz.DateTimeZoneBuilder.OfYear ofYear) {
			iUpperYear = year;
			iUpperOfYear = ofYear;
		}

		public org.joda.time.tz.DateTimeZoneBuilder.Transition firstTransition(final long firstMillis) {
			if ((iInitialNameKey) != null) {
				return new org.joda.time.tz.DateTimeZoneBuilder.Transition(firstMillis, iInitialNameKey, ((iStandardOffset) + (iInitialSaveMillis)), iStandardOffset);
			}
			java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Rule> copy = new java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Rule>(iRules);
			long millis = java.lang.Long.MIN_VALUE;
			int saveMillis = 0;
			org.joda.time.tz.DateTimeZoneBuilder.Transition first = null;
			org.joda.time.tz.DateTimeZoneBuilder.Transition next;
			while ((next = nextTransition(millis, saveMillis)) != null) {
				millis = next.getMillis();
				if (millis == firstMillis) {
					first = new org.joda.time.tz.DateTimeZoneBuilder.Transition(firstMillis, next);
					break;
				}
				if (millis > firstMillis) {
					if (first == null) {
						for (org.joda.time.tz.DateTimeZoneBuilder.Rule rule : copy) {
							if ((rule.getSaveMillis()) == 0) {
								first = new org.joda.time.tz.DateTimeZoneBuilder.Transition(firstMillis, rule, iStandardOffset);
								break;
							}
						}
					}
					if (first == null) {
						first = new org.joda.time.tz.DateTimeZoneBuilder.Transition(firstMillis, next.getNameKey(), iStandardOffset, iStandardOffset);
					}
					break;
				}
				first = new org.joda.time.tz.DateTimeZoneBuilder.Transition(firstMillis, next);
				saveMillis = next.getSaveMillis();
			} 
			iRules = copy;
			return first;
		}

		public org.joda.time.tz.DateTimeZoneBuilder.Transition nextTransition(final long instant, final int saveMillis) {
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			org.joda.time.tz.DateTimeZoneBuilder.Rule nextRule = null;
			long nextMillis = java.lang.Long.MAX_VALUE;
			java.util.Iterator<org.joda.time.tz.DateTimeZoneBuilder.Rule> it = iRules.iterator();
			while (it.hasNext()) {
				org.joda.time.tz.DateTimeZoneBuilder.Rule rule = it.next();
				long next = rule.next(instant, iStandardOffset, saveMillis);
				if (next <= instant) {
					it.remove();
					continue;
				}
				if (next <= nextMillis) {
					nextRule = rule;
					nextMillis = next;
				}
			} 
			if (nextRule == null) {
				return null;
			}
			if ((chrono.year().get(nextMillis)) >= (org.joda.time.tz.DateTimeZoneBuilder.RuleSet.YEAR_LIMIT)) {
				return null;
			}
			if ((iUpperYear) < (java.lang.Integer.MAX_VALUE)) {
				long upperMillis = iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
				if (nextMillis >= upperMillis) {
					return null;
				}
			}
			return new org.joda.time.tz.DateTimeZoneBuilder.Transition(nextMillis, nextRule, iStandardOffset);
		}

		public long getUpperLimit(int saveMillis) {
			if ((iUpperYear) == (java.lang.Integer.MAX_VALUE)) {
				return java.lang.Long.MAX_VALUE;
			}
			return iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
		}

		public org.joda.time.tz.DateTimeZoneBuilder.DSTZone buildTailZone(java.lang.String id) {
			if ((iRules.size()) == 2) {
				org.joda.time.tz.DateTimeZoneBuilder.Rule startRule = iRules.get(0);
				org.joda.time.tz.DateTimeZoneBuilder.Rule endRule = iRules.get(1);
				if (((startRule.getToYear()) == (java.lang.Integer.MAX_VALUE)) && ((endRule.getToYear()) == (java.lang.Integer.MAX_VALUE))) {
					return new org.joda.time.tz.DateTimeZoneBuilder.DSTZone(id, iStandardOffset, startRule.iRecurrence, endRule.iRecurrence);
				}
			}
			return null;
		}
	}

	private static final class DSTZone extends org.joda.time.DateTimeZone {
		private static final long serialVersionUID = 6941492635554961361L;

		static org.joda.time.tz.DateTimeZoneBuilder.DSTZone readFrom(java.io.DataInput in, java.lang.String id) throws java.io.IOException {
			return new org.joda.time.tz.DateTimeZoneBuilder.DSTZone(id, ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in))), org.joda.time.tz.DateTimeZoneBuilder.Recurrence.readFrom(in), org.joda.time.tz.DateTimeZoneBuilder.Recurrence.readFrom(in));
		}

		final int iStandardOffset;

		final org.joda.time.tz.DateTimeZoneBuilder.Recurrence iStartRecurrence;

		final org.joda.time.tz.DateTimeZoneBuilder.Recurrence iEndRecurrence;

		DSTZone(java.lang.String id, int standardOffset, org.joda.time.tz.DateTimeZoneBuilder.Recurrence startRecurrence, org.joda.time.tz.DateTimeZoneBuilder.Recurrence endRecurrence) {
			super(id);
			iStandardOffset = standardOffset;
			iStartRecurrence = startRecurrence;
			iEndRecurrence = endRecurrence;
		}

		public java.lang.String getNameKey(long instant) {
			return findMatchingRecurrence(instant).getNameKey();
		}

		public int getOffset(long instant) {
			return (iStandardOffset) + (findMatchingRecurrence(instant).getSaveMillis());
		}

		public int getStandardOffset(long instant) {
			return iStandardOffset;
		}

		public boolean isFixed() {
			return false;
		}

		public long nextTransition(long instant) {
			int standardOffset = iStandardOffset;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence startRecurrence = iStartRecurrence;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence endRecurrence = iEndRecurrence;
			long start;
			long end;
			try {
				start = startRecurrence.next(instant, standardOffset, endRecurrence.getSaveMillis());
				if ((instant > 0) && (start < 0)) {
					start = instant;
				}
			} catch (java.lang.IllegalArgumentException e) {
				start = instant;
			} catch (java.lang.ArithmeticException e) {
				start = instant;
			}
			try {
				end = endRecurrence.next(instant, standardOffset, startRecurrence.getSaveMillis());
				if ((instant > 0) && (end < 0)) {
					end = instant;
				}
			} catch (java.lang.IllegalArgumentException e) {
				end = instant;
			} catch (java.lang.ArithmeticException e) {
				end = instant;
			}
			return start > end ? end : start;
		}

		public long previousTransition(long instant) {
			instant++;
			int standardOffset = iStandardOffset;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence startRecurrence = iStartRecurrence;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence endRecurrence = iEndRecurrence;
			long start;
			long end;
			try {
				start = startRecurrence.previous(instant, standardOffset, endRecurrence.getSaveMillis());
				if ((instant < 0) && (start > 0)) {
					start = instant;
				}
			} catch (java.lang.IllegalArgumentException e) {
				start = instant;
			} catch (java.lang.ArithmeticException e) {
				start = instant;
			}
			try {
				end = endRecurrence.previous(instant, standardOffset, startRecurrence.getSaveMillis());
				if ((instant < 0) && (end > 0)) {
					end = instant;
				}
			} catch (java.lang.IllegalArgumentException e) {
				end = instant;
			} catch (java.lang.ArithmeticException e) {
				end = instant;
			}
			return (start > end ? start : end) - 1;
		}

		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.tz.DateTimeZoneBuilder.DSTZone.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.tz.DateTimeZoneBuilder.DSTZone) {
				org.joda.time.tz.DateTimeZoneBuilder.DSTZone other = ((org.joda.time.tz.DateTimeZoneBuilder.DSTZone) (obj));
				return (((getID().equals(other.getID())) && ((iStandardOffset) == (other.iStandardOffset))) && (iStartRecurrence.equals(other.iStartRecurrence))) && (iEndRecurrence.equals(other.iEndRecurrence));
			}
			return false;
		}

		public void writeTo(java.io.DataOutput out) throws java.io.IOException {
			org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iStandardOffset);
			iStartRecurrence.writeTo(out);
			iEndRecurrence.writeTo(out);
		}

		private org.joda.time.tz.DateTimeZoneBuilder.Recurrence findMatchingRecurrence(long instant) {
			int standardOffset = iStandardOffset;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence startRecurrence = iStartRecurrence;
			org.joda.time.tz.DateTimeZoneBuilder.Recurrence endRecurrence = iEndRecurrence;
			long start;
			long end;
			try {
				start = startRecurrence.next(instant, standardOffset, endRecurrence.getSaveMillis());
			} catch (java.lang.IllegalArgumentException e) {
				start = instant;
			} catch (java.lang.ArithmeticException e) {
				start = instant;
			}
			try {
				end = endRecurrence.next(instant, standardOffset, startRecurrence.getSaveMillis());
			} catch (java.lang.IllegalArgumentException e) {
				end = instant;
			} catch (java.lang.ArithmeticException e) {
				end = instant;
			}
			return start > end ? startRecurrence : endRecurrence;
		}
	}

	private static final class PrecalculatedZone extends org.joda.time.DateTimeZone {
		private static final long serialVersionUID = 7811976468055766265L;

		static org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone readFrom(java.io.DataInput in, java.lang.String id) throws java.io.IOException {
			int poolSize = in.readUnsignedShort();
			java.lang.String[] pool = new java.lang.String[poolSize];
			for (int i = 0; i < poolSize; i++) {
				pool[i] = in.readUTF();
			}
			int size = in.readInt();
			long[] transitions = new long[size];
			int[] wallOffsets = new int[size];
			int[] standardOffsets = new int[size];
			java.lang.String[] nameKeys = new java.lang.String[size];
			for (int i = 0; i < size; i++) {
				transitions[i] = org.joda.time.tz.DateTimeZoneBuilder.readMillis(in);
				wallOffsets[i] = ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in)));
				standardOffsets[i] = ((int) (org.joda.time.tz.DateTimeZoneBuilder.readMillis(in)));
				try {
					int index;
					if (poolSize < 256) {
						index = in.readUnsignedByte();
					}else {
						index = in.readUnsignedShort();
					}
					nameKeys[i] = pool[index];
				} catch (java.lang.ArrayIndexOutOfBoundsException e) {
					throw new java.io.IOException("Invalid encoding");
				}
			}
			org.joda.time.tz.DateTimeZoneBuilder.DSTZone tailZone = null;
			if (in.readBoolean()) {
				tailZone = org.joda.time.tz.DateTimeZoneBuilder.DSTZone.readFrom(in, id);
			}
			return new org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone(id, transitions, wallOffsets, standardOffsets, nameKeys, tailZone);
		}

		static org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone create(java.lang.String id, boolean outputID, java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder.Transition> transitions, org.joda.time.tz.DateTimeZoneBuilder.DSTZone tailZone) {
			int size = transitions.size();
			if (size == 0) {
				throw new java.lang.IllegalArgumentException();
			}
			long[] trans = new long[size];
			int[] wallOffsets = new int[size];
			int[] standardOffsets = new int[size];
			java.lang.String[] nameKeys = new java.lang.String[size];
			org.joda.time.tz.DateTimeZoneBuilder.Transition last = null;
			for (int i = 0; i < size; i++) {
				org.joda.time.tz.DateTimeZoneBuilder.Transition tr = transitions.get(i);
				if (!(tr.isTransitionFrom(last))) {
					throw new java.lang.IllegalArgumentException(id);
				}
				trans[i] = tr.getMillis();
				wallOffsets[i] = tr.getWallOffset();
				standardOffsets[i] = tr.getStandardOffset();
				nameKeys[i] = tr.getNameKey();
				last = tr;
			}
			java.lang.String[] zoneNameData = new java.lang.String[5];
			java.lang.String[][] zoneStrings = new java.text.DateFormatSymbols(java.util.Locale.ENGLISH).getZoneStrings();
			for (int j = 0; j < (zoneStrings.length); j++) {
				java.lang.String[] set = zoneStrings[j];
				if (((set != null) && ((set.length) == 5)) && (id.equals(set[0]))) {
					zoneNameData = set;
				}
			}
			org.joda.time.Chronology chrono = org.joda.time.chrono.ISOChronology.getInstanceUTC();
			for (int i = 0; i < ((nameKeys.length) - 1); i++) {
				java.lang.String curNameKey = nameKeys[i];
				java.lang.String nextNameKey = nameKeys[(i + 1)];
				long curOffset = wallOffsets[i];
				long nextOffset = wallOffsets[(i + 1)];
				long curStdOffset = standardOffsets[i];
				long nextStdOffset = standardOffsets[(i + 1)];
				org.joda.time.Period p = new org.joda.time.Period(trans[i], trans[(i + 1)], org.joda.time.PeriodType.yearMonthDay(), chrono);
				if ((((((((curOffset != nextOffset) && (curStdOffset == nextStdOffset)) && (curNameKey.equals(nextNameKey))) && ((p.getYears()) == 0)) && ((p.getMonths()) > 4)) && ((p.getMonths()) < 8)) && (curNameKey.equals(zoneNameData[2]))) && (curNameKey.equals(zoneNameData[4]))) {
					if (org.joda.time.tz.ZoneInfoCompiler.verbose()) {
						java.lang.System.out.println(("Fixing duplicate name key - " + nextNameKey));
						java.lang.System.out.println(((("     - " + (new org.joda.time.DateTime(trans[i], chrono))) + " - ") + (new org.joda.time.DateTime(trans[(i + 1)], chrono))));
					}
					if (curOffset > nextOffset) {
						nameKeys[i] = (curNameKey + "-Summer").intern();
					}else
						if (curOffset < nextOffset) {
							nameKeys[(i + 1)] = (nextNameKey + "-Summer").intern();
							i++;
						}
					
				}
			}
			if (tailZone != null) {
				if (tailZone.iStartRecurrence.getNameKey().equals(tailZone.iEndRecurrence.getNameKey())) {
					if (org.joda.time.tz.ZoneInfoCompiler.verbose()) {
						java.lang.System.out.println(("Fixing duplicate recurrent name key - " + (tailZone.iStartRecurrence.getNameKey())));
					}
					if ((tailZone.iStartRecurrence.getSaveMillis()) > 0) {
						tailZone = new org.joda.time.tz.DateTimeZoneBuilder.DSTZone(tailZone.getID(), tailZone.iStandardOffset, tailZone.iStartRecurrence.renameAppend("-Summer"), tailZone.iEndRecurrence);
					}else {
						tailZone = new org.joda.time.tz.DateTimeZoneBuilder.DSTZone(tailZone.getID(), tailZone.iStandardOffset, tailZone.iStartRecurrence, tailZone.iEndRecurrence.renameAppend("-Summer"));
					}
				}
			}
			return new org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone((outputID ? id : ""), trans, wallOffsets, standardOffsets, nameKeys, tailZone);
		}

		private final long[] iTransitions;

		private final int[] iWallOffsets;

		private final int[] iStandardOffsets;

		private final java.lang.String[] iNameKeys;

		private final org.joda.time.tz.DateTimeZoneBuilder.DSTZone iTailZone;

		private PrecalculatedZone(java.lang.String id, long[] transitions, int[] wallOffsets, int[] standardOffsets, java.lang.String[] nameKeys, org.joda.time.tz.DateTimeZoneBuilder.DSTZone tailZone) {
			super(id);
			iTransitions = transitions;
			iWallOffsets = wallOffsets;
			iStandardOffsets = standardOffsets;
			iNameKeys = nameKeys;
			iTailZone = tailZone;
		}

		public java.lang.String getNameKey(long instant) {
			long[] transitions = iTransitions;
			int i = java.util.Arrays.binarySearch(transitions, instant);
			if (i >= 0) {
				return iNameKeys[i];
			}
			i = ~i;
			if (i < (transitions.length)) {
				if (i > 0) {
					return iNameKeys[(i - 1)];
				}
				return "UTC";
			}
			if ((iTailZone) == null) {
				return iNameKeys[(i - 1)];
			}
			return iTailZone.getNameKey(instant);
		}

		public int getOffset(long instant) {
			long[] transitions = iTransitions;
			int i = java.util.Arrays.binarySearch(transitions, instant);
			if (i >= 0) {
				return iWallOffsets[i];
			}
			i = ~i;
			if (i < (transitions.length)) {
				if (i > 0) {
					return iWallOffsets[(i - 1)];
				}
				return 0;
			}
			if ((iTailZone) == null) {
				return iWallOffsets[(i - 1)];
			}
			return iTailZone.getOffset(instant);
		}

		public int getStandardOffset(long instant) {
			long[] transitions = iTransitions;
			int i = java.util.Arrays.binarySearch(transitions, instant);
			if (i >= 0) {
				return iStandardOffsets[i];
			}
			i = ~i;
			if (i < (transitions.length)) {
				if (i > 0) {
					return iStandardOffsets[(i - 1)];
				}
				return 0;
			}
			if ((iTailZone) == null) {
				return iStandardOffsets[(i - 1)];
			}
			return iTailZone.getStandardOffset(instant);
		}

		public boolean isFixed() {
			return false;
		}

		public long nextTransition(long instant) {
			long[] transitions = iTransitions;
			int i = java.util.Arrays.binarySearch(transitions, instant);
			i = (i >= 0) ? i + 1 : ~i;
			if (i < (transitions.length)) {
				return transitions[i];
			}
			if ((iTailZone) == null) {
				return instant;
			}
			long end = transitions[((transitions.length) - 1)];
			if (instant < end) {
				instant = end;
			}
			return iTailZone.nextTransition(instant);
		}

		public long previousTransition(long instant) {
			long[] transitions = iTransitions;
			int i = java.util.Arrays.binarySearch(transitions, instant);
			if (i >= 0) {
				if (instant > (java.lang.Long.MIN_VALUE)) {
					return instant - 1;
				}
				return instant;
			}
			i = ~i;
			if (i < (transitions.length)) {
				if (i > 0) {
					long prev = transitions[(i - 1)];
					if (prev > (java.lang.Long.MIN_VALUE)) {
						return prev - 1;
					}
				}
				return instant;
			}
			if ((iTailZone) != null) {
				long prev = iTailZone.previousTransition(instant);
				if (prev < instant) {
					return prev;
				}
			}
			long prev = transitions[(i - 1)];
			if (prev > (java.lang.Long.MIN_VALUE)) {
				return prev - 1;
			}
			return instant;
		}

		public boolean equals(java.lang.Object obj) {
			if ((org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.this) == obj) {
				return true;
			}
			if (obj instanceof org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone) {
				org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone other = ((org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone) (obj));
				return (((((getID().equals(other.getID())) && (java.util.Arrays.equals(iTransitions, other.iTransitions))) && (java.util.Arrays.equals(iNameKeys, other.iNameKeys))) && (java.util.Arrays.equals(iWallOffsets, other.iWallOffsets))) && (java.util.Arrays.equals(iStandardOffsets, other.iStandardOffsets))) && ((iTailZone) == null ? null == (other.iTailZone) : iTailZone.equals(other.iTailZone));
			}
			return false;
		}

		public void writeTo(java.io.DataOutput out) throws java.io.IOException {
			int size = iTransitions.length;
			java.util.Set<java.lang.String> poolSet = new java.util.HashSet<java.lang.String>();
			for (int i = 0; i < size; i++) {
				poolSet.add(iNameKeys[i]);
			}
			int poolSize = poolSet.size();
			if (poolSize > 65535) {
				throw new java.lang.UnsupportedOperationException("String pool is too large");
			}
			java.lang.String[] pool = new java.lang.String[poolSize];
			java.util.Iterator<java.lang.String> it = poolSet.iterator();
			for (int i = 0; it.hasNext(); i++) {
				pool[i] = it.next();
			}
			out.writeShort(poolSize);
			for (int i = 0; i < poolSize; i++) {
				out.writeUTF(pool[i]);
			}
			out.writeInt(size);
			for (int i = 0; i < size; i++) {
				org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iTransitions[i]);
				org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iWallOffsets[i]);
				org.joda.time.tz.DateTimeZoneBuilder.writeMillis(out, iStandardOffsets[i]);
				java.lang.String nameKey = iNameKeys[i];
				for (int j = 0; j < poolSize; j++) {
					if (pool[j].equals(nameKey)) {
						if (poolSize < 256) {
							out.writeByte(j);
						}else {
							out.writeShort(j);
						}
						break;
					}
				}
			}
			out.writeBoolean(((iTailZone) != null));
			if ((iTailZone) != null) {
				iTailZone.writeTo(out);
			}
		}

		public boolean isCachable() {
			if ((iTailZone) != null) {
				return true;
			}
			long[] transitions = iTransitions;
			if ((transitions.length) <= 1) {
				return false;
			}
			double distances = 0;
			int count = 0;
			for (int i = 1; i < (transitions.length); i++) {
				long diff = (transitions[i]) - (transitions[(i - 1)]);
				if (diff < (((((366L + 365) * 24) * 60) * 60) * 1000)) {
					distances += ((double) (diff));
					count++;
				}
			}
			if (count > 0) {
				double avg = distances / count;
				avg /= ((24 * 60) * 60) * 1000;
				if (avg >= 25) {
					return true;
				}
			}
			return false;
		}
	}
}


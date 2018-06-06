

package org.joda.time.tz;


public class ZoneInfoCompiler {
	static org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear cStartOfYear;

	static org.joda.time.Chronology cLenientISO;

	static java.lang.ThreadLocal<java.lang.Boolean> cVerbose = new java.lang.ThreadLocal<java.lang.Boolean>();

	static {
		org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(java.lang.Boolean.FALSE);
	}

	public static boolean verbose() {
		return org.joda.time.tz.ZoneInfoCompiler.cVerbose.get();
	}

	public static void main(java.lang.String[] args) throws java.lang.Exception {
		if ((args.length) == 0) {
			org.joda.time.tz.ZoneInfoCompiler.printUsage();
			return ;
		}
		java.io.File inputDir = null;
		java.io.File outputDir = null;
		boolean verbose = false;
		int i;
		for (i = 0; i < (args.length); i++) {
			try {
				if ("-src".equals(args[i])) {
					inputDir = new java.io.File(args[(++i)]);
				}else
					if ("-dst".equals(args[i])) {
						outputDir = new java.io.File(args[(++i)]);
					}else
						if ("-verbose".equals(args[i])) {
							verbose = true;
						}else
							if ("-?".equals(args[i])) {
								org.joda.time.tz.ZoneInfoCompiler.printUsage();
								return ;
							}else {
								break;
							}
						
					
				
			} catch (java.lang.IndexOutOfBoundsException e) {
				org.joda.time.tz.ZoneInfoCompiler.printUsage();
				return ;
			}
		}
		if (i >= (args.length)) {
			org.joda.time.tz.ZoneInfoCompiler.printUsage();
			return ;
		}
		java.io.File[] sources = new java.io.File[(args.length) - i];
		for (int j = 0; i < (args.length); i++ , j++) {
			sources[j] = (inputDir == null) ? new java.io.File(args[i]) : new java.io.File(inputDir, args[i]);
		}
		org.joda.time.tz.ZoneInfoCompiler.cVerbose.set(verbose);
		org.joda.time.tz.ZoneInfoCompiler zic = new org.joda.time.tz.ZoneInfoCompiler();
		zic.compile(outputDir, sources);
	}

	private static void printUsage() {
		java.lang.System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
		java.lang.System.out.println("where possible options include:");
		java.lang.System.out.println("  -src <directory>    Specify where to read source files");
		java.lang.System.out.println("  -dst <directory>    Specify where to write generated files");
		java.lang.System.out.println("  -verbose            Output verbosely (default false)");
	}

	static org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear getStartOfYear() {
		if ((org.joda.time.tz.ZoneInfoCompiler.cStartOfYear) == null) {
			org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
		}
		return org.joda.time.tz.ZoneInfoCompiler.cStartOfYear;
	}

	static org.joda.time.Chronology getLenientISOChronology() {
		if ((org.joda.time.tz.ZoneInfoCompiler.cLenientISO) == null) {
			org.joda.time.tz.ZoneInfoCompiler.cLenientISO = org.joda.time.chrono.LenientChronology.getInstance(org.joda.time.chrono.ISOChronology.getInstanceUTC());
		}
		return org.joda.time.tz.ZoneInfoCompiler.cLenientISO;
	}

	static void writeZoneInfoMap(java.io.DataOutputStream dout, java.util.Map<java.lang.String, org.joda.time.DateTimeZone> zimap) throws java.io.IOException {
		java.util.Map<java.lang.String, java.lang.Short> idToIndex = new java.util.HashMap<java.lang.String, java.lang.Short>(zimap.size());
		java.util.TreeMap<java.lang.Short, java.lang.String> indexToId = new java.util.TreeMap<java.lang.Short, java.lang.String>();
		short count = 0;
		for (java.util.Map.Entry<java.lang.String, org.joda.time.DateTimeZone> entry : zimap.entrySet()) {
			java.lang.String id = ((java.lang.String) (entry.getKey()));
			if (!(idToIndex.containsKey(id))) {
				java.lang.Short index = java.lang.Short.valueOf(count);
				idToIndex.put(id, index);
				indexToId.put(index, id);
				if ((++count) == 0) {
					throw new java.lang.InternalError("Too many time zone ids");
				}
			}
			id = ((org.joda.time.DateTimeZone) (entry.getValue())).getID();
			if (!(idToIndex.containsKey(id))) {
				java.lang.Short index = java.lang.Short.valueOf(count);
				idToIndex.put(id, index);
				indexToId.put(index, id);
				if ((++count) == 0) {
					throw new java.lang.InternalError("Too many time zone ids");
				}
			}
		}
		dout.writeShort(indexToId.size());
		for (java.lang.String id : indexToId.values()) {
			dout.writeUTF(id);
		}
		dout.writeShort(zimap.size());
		for (java.util.Map.Entry<java.lang.String, org.joda.time.DateTimeZone> entry : zimap.entrySet()) {
			java.lang.String id = entry.getKey();
			dout.writeShort(idToIndex.get(id).shortValue());
			id = entry.getValue().getID();
			dout.writeShort(idToIndex.get(id).shortValue());
		}
	}

	static int parseYear(java.lang.String str, int def) {
		str = str.toLowerCase();
		if ((str.equals("minimum")) || (str.equals("min"))) {
			return java.lang.Integer.MIN_VALUE;
		}else
			if ((str.equals("maximum")) || (str.equals("max"))) {
				return java.lang.Integer.MAX_VALUE;
			}else
				if (str.equals("only")) {
					return def;
				}
			
		
		return java.lang.Integer.parseInt(str);
	}

	static int parseMonth(java.lang.String str) {
		org.joda.time.DateTimeField field = org.joda.time.chrono.ISOChronology.getInstanceUTC().monthOfYear();
		return field.get(field.set(0, str, java.util.Locale.ENGLISH));
	}

	static int parseDayOfWeek(java.lang.String str) {
		org.joda.time.DateTimeField field = org.joda.time.chrono.ISOChronology.getInstanceUTC().dayOfWeek();
		return field.get(field.set(0, str, java.util.Locale.ENGLISH));
	}

	static java.lang.String parseOptional(java.lang.String str) {
		return str.equals("-") ? null : str;
	}

	static int parseTime(java.lang.String str) {
		org.joda.time.format.DateTimeFormatter p = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
		org.joda.time.MutableDateTime mdt = new org.joda.time.MutableDateTime(0, org.joda.time.tz.ZoneInfoCompiler.getLenientISOChronology());
		int pos = 0;
		if (str.startsWith("-")) {
			pos = 1;
		}
		int newPos = p.parseInto(mdt, str, pos);
		if (newPos == (~pos)) {
			throw new java.lang.IllegalArgumentException(str);
		}
		int millis = ((int) (mdt.getMillis()));
		if (pos == 1) {
			millis = -millis;
		}
		return millis;
	}

	static char parseZoneChar(char c) {
		switch (c) {
			case 's' :
			case 'S' :
				return 's';
			case 'u' :
			case 'U' :
			case 'g' :
			case 'G' :
			case 'z' :
			case 'Z' :
				return 'u';
			case 'w' :
			case 'W' :
			default :
				return 'w';
		}
	}

	static boolean test(java.lang.String id, org.joda.time.DateTimeZone tz) {
		if (!(id.equals(tz.getID()))) {
			return true;
		}
		long millis = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
		long end = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
		int offset = tz.getOffset(millis);
		java.lang.String key = tz.getNameKey(millis);
		java.util.List<java.lang.Long> transitions = new java.util.ArrayList<java.lang.Long>();
		while (true) {
			long next = tz.nextTransition(millis);
			if ((next == millis) || (next > end)) {
				break;
			}
			millis = next;
			int nextOffset = tz.getOffset(millis);
			java.lang.String nextKey = tz.getNameKey(millis);
			if ((offset == nextOffset) && (key.equals(nextKey))) {
				java.lang.System.out.println(((("*d* Error in " + (tz.getID())) + " ") + (new org.joda.time.DateTime(millis, org.joda.time.chrono.ISOChronology.getInstanceUTC()))));
				return false;
			}
			if ((nextKey == null) || (((nextKey.length()) < 3) && (!("??".equals(nextKey))))) {
				java.lang.System.out.println(((((("*s* Error in " + (tz.getID())) + " ") + (new org.joda.time.DateTime(millis, org.joda.time.chrono.ISOChronology.getInstanceUTC()))) + ", nameKey=") + nextKey));
				return false;
			}
			transitions.add(java.lang.Long.valueOf(millis));
			offset = nextOffset;
			key = nextKey;
		} 
		millis = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
		end = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
		for (int i = transitions.size(); (--i) >= 0;) {
			long prev = tz.previousTransition(millis);
			if ((prev == millis) || (prev < end)) {
				break;
			}
			millis = prev;
			long trans = transitions.get(i).longValue();
			if ((trans - 1) != millis) {
				java.lang.System.out.println(((((("*r* Error in " + (tz.getID())) + " ") + (new org.joda.time.DateTime(millis, org.joda.time.chrono.ISOChronology.getInstanceUTC()))) + " != ") + (new org.joda.time.DateTime((trans - 1), org.joda.time.chrono.ISOChronology.getInstanceUTC()))));
				return false;
			}
		}
		return true;
	}

	private java.util.Map<java.lang.String, org.joda.time.tz.ZoneInfoCompiler.RuleSet> iRuleSets;

	private java.util.List<org.joda.time.tz.ZoneInfoCompiler.Zone> iZones;

	private java.util.List<java.lang.String> iLinks;

	public ZoneInfoCompiler() {
		iRuleSets = new java.util.HashMap<java.lang.String, org.joda.time.tz.ZoneInfoCompiler.RuleSet>();
		iZones = new java.util.ArrayList<org.joda.time.tz.ZoneInfoCompiler.Zone>();
		iLinks = new java.util.ArrayList<java.lang.String>();
	}

	public java.util.Map<java.lang.String, org.joda.time.DateTimeZone> compile(java.io.File outputDir, java.io.File[] sources) throws java.io.IOException {
		if (sources != null) {
			for (int i = 0; i < (sources.length); i++) {
				java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(sources[i]));
				parseDataFile(in);
				in.close();
			}
		}
		if (outputDir != null) {
			if (!(outputDir.exists())) {
				throw new java.io.IOException(("Destination directory doesn't exist: " + outputDir));
			}
			if (!(outputDir.isDirectory())) {
				throw new java.io.IOException(("Destination is not a directory: " + outputDir));
			}
		}
		java.util.Map<java.lang.String, org.joda.time.DateTimeZone> map = new java.util.TreeMap<java.lang.String, org.joda.time.DateTimeZone>();
		java.lang.System.out.println("Writing zoneinfo files");
		for (int i = 0; i < (iZones.size()); i++) {
			org.joda.time.tz.ZoneInfoCompiler.Zone zone = iZones.get(i);
			org.joda.time.tz.DateTimeZoneBuilder builder = new org.joda.time.tz.DateTimeZoneBuilder();
			zone.addToBuilder(builder, iRuleSets);
			final org.joda.time.DateTimeZone original = builder.toDateTimeZone(zone.iName, true);
			org.joda.time.DateTimeZone tz = original;
			if (org.joda.time.tz.ZoneInfoCompiler.test(tz.getID(), tz)) {
				map.put(tz.getID(), tz);
				if (outputDir != null) {
					if (org.joda.time.tz.ZoneInfoCompiler.verbose()) {
						java.lang.System.out.println(("Writing " + (tz.getID())));
					}
					java.io.File file = new java.io.File(outputDir, tz.getID());
					if (!(file.getParentFile().exists())) {
						file.getParentFile().mkdirs();
					}
					java.io.OutputStream out = new java.io.FileOutputStream(file);
					builder.writeTo(zone.iName, out);
					out.close();
					java.io.InputStream in = new java.io.FileInputStream(file);
					org.joda.time.DateTimeZone tz2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(in, tz.getID());
					in.close();
					if (!(original.equals(tz2))) {
						java.lang.System.out.println((("*e* Error in " + (tz.getID())) + ": Didn't read properly from file"));
					}
				}
			}
		}
		for (int pass = 0; pass < 2; pass++) {
			for (int i = 0; i < (iLinks.size()); i += 2) {
				java.lang.String id = iLinks.get(i);
				java.lang.String alias = iLinks.get((i + 1));
				org.joda.time.DateTimeZone tz = map.get(id);
				if (tz == null) {
					if (pass > 0) {
						java.lang.System.out.println((((("Cannot find time zone '" + id) + "' to link alias '") + alias) + "' to"));
					}
				}else {
					map.put(alias, tz);
				}
			}
		}
		if (outputDir != null) {
			java.lang.System.out.println("Writing ZoneInfoMap");
			java.io.File file = new java.io.File(outputDir, "ZoneInfoMap");
			if (!(file.getParentFile().exists())) {
				file.getParentFile().mkdirs();
			}
			java.io.OutputStream out = new java.io.FileOutputStream(file);
			java.io.DataOutputStream dout = new java.io.DataOutputStream(out);
			java.util.Map<java.lang.String, org.joda.time.DateTimeZone> zimap = new java.util.TreeMap<java.lang.String, org.joda.time.DateTimeZone>(java.lang.String.CASE_INSENSITIVE_ORDER);
			zimap.putAll(map);
			org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(dout, zimap);
			dout.close();
		}
		return map;
	}

	public void parseDataFile(java.io.BufferedReader in) throws java.io.IOException {
		org.joda.time.tz.ZoneInfoCompiler.Zone zone = null;
		java.lang.String line;
		while ((line = in.readLine()) != null) {
			java.lang.String trimmed = line.trim();
			if (((trimmed.length()) == 0) || ((trimmed.charAt(0)) == '#')) {
				continue;
			}
			int index = line.indexOf('#');
			if (index >= 0) {
				line = line.substring(0, index);
			}
			java.util.StringTokenizer st = new java.util.StringTokenizer(line, " \t");
			if ((java.lang.Character.isWhitespace(line.charAt(0))) && (st.hasMoreTokens())) {
				if (zone != null) {
					zone.chain(st);
				}
				continue;
			}else {
				if (zone != null) {
					iZones.add(zone);
				}
				zone = null;
			}
			if (st.hasMoreTokens()) {
				java.lang.String token = st.nextToken();
				if (token.equalsIgnoreCase("Rule")) {
					org.joda.time.tz.ZoneInfoCompiler.Rule r = new org.joda.time.tz.ZoneInfoCompiler.Rule(st);
					org.joda.time.tz.ZoneInfoCompiler.RuleSet rs = iRuleSets.get(r.iName);
					if (rs == null) {
						rs = new org.joda.time.tz.ZoneInfoCompiler.RuleSet(r);
						iRuleSets.put(r.iName, rs);
					}else {
						rs.addRule(r);
					}
				}else
					if (token.equalsIgnoreCase("Zone")) {
						zone = new org.joda.time.tz.ZoneInfoCompiler.Zone(st);
					}else
						if (token.equalsIgnoreCase("Link")) {
							iLinks.add(st.nextToken());
							iLinks.add(st.nextToken());
						}else {
							java.lang.System.out.println(("Unknown line: " + line));
						}
					
				
			}
		} 
		if (zone != null) {
			iZones.add(zone);
		}
	}

	static class DateTimeOfYear {
		public final int iMonthOfYear;

		public final int iDayOfMonth;

		public final int iDayOfWeek;

		public final boolean iAdvanceDayOfWeek;

		public final int iMillisOfDay;

		public final char iZoneChar;

		DateTimeOfYear() {
			iMonthOfYear = 1;
			iDayOfMonth = 1;
			iDayOfWeek = 0;
			iAdvanceDayOfWeek = false;
			iMillisOfDay = 0;
			iZoneChar = 'w';
		}

		DateTimeOfYear(java.util.StringTokenizer st) {
			int month = 1;
			int day = 1;
			int dayOfWeek = 0;
			int millis = 0;
			boolean advance = false;
			char zoneChar = 'w';
			if (st.hasMoreTokens()) {
				month = org.joda.time.tz.ZoneInfoCompiler.parseMonth(st.nextToken());
				if (st.hasMoreTokens()) {
					java.lang.String str = st.nextToken();
					if (str.startsWith("last")) {
						day = -1;
						dayOfWeek = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(str.substring(4));
						advance = false;
					}else {
						try {
							day = java.lang.Integer.parseInt(str);
							dayOfWeek = 0;
							advance = false;
						} catch (java.lang.NumberFormatException e) {
							int index = str.indexOf(">=");
							if (index > 0) {
								day = java.lang.Integer.parseInt(str.substring((index + 2)));
								dayOfWeek = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(str.substring(0, index));
								advance = true;
							}else {
								index = str.indexOf("<=");
								if (index > 0) {
									day = java.lang.Integer.parseInt(str.substring((index + 2)));
									dayOfWeek = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(str.substring(0, index));
									advance = false;
								}else {
									throw new java.lang.IllegalArgumentException(str);
								}
							}
						}
					}
					if (st.hasMoreTokens()) {
						str = st.nextToken();
						zoneChar = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar(str.charAt(((str.length()) - 1)));
						if (str.equals("24:00")) {
							org.joda.time.LocalDate date = day == (-1) ? new org.joda.time.LocalDate(2001, month, 1).plusMonths(1) : new org.joda.time.LocalDate(2001, month, day).plusDays(1);
							advance = day != (-1);
							month = date.getMonthOfYear();
							day = date.getDayOfMonth();
							dayOfWeek = (((dayOfWeek - 1) + 1) % 7) + 1;
						}else {
							millis = org.joda.time.tz.ZoneInfoCompiler.parseTime(str);
						}
					}
				}
			}
			iMonthOfYear = month;
			iDayOfMonth = day;
			iDayOfWeek = dayOfWeek;
			iAdvanceDayOfWeek = advance;
			iMillisOfDay = millis;
			iZoneChar = zoneChar;
		}

		public void addRecurring(org.joda.time.tz.DateTimeZoneBuilder builder, java.lang.String nameKey, int saveMillis, int fromYear, int toYear) {
			builder.addRecurringSavings(nameKey, saveMillis, fromYear, toYear, iZoneChar, iMonthOfYear, iDayOfMonth, iDayOfWeek, iAdvanceDayOfWeek, iMillisOfDay);
		}

		public void addCutover(org.joda.time.tz.DateTimeZoneBuilder builder, int year) {
			builder.addCutover(year, iZoneChar, iMonthOfYear, iDayOfMonth, iDayOfWeek, iAdvanceDayOfWeek, iMillisOfDay);
		}

		public java.lang.String toString() {
			return (((((((((((((((("MonthOfYear: " + (iMonthOfYear)) + "\n") + "DayOfMonth: ") + (iDayOfMonth)) + "\n") + "DayOfWeek: ") + (iDayOfWeek)) + "\n") + "AdvanceDayOfWeek: ") + (iAdvanceDayOfWeek)) + "\n") + "MillisOfDay: ") + (iMillisOfDay)) + "\n") + "ZoneChar: ") + (iZoneChar)) + "\n";
		}
	}

	private static class Rule {
		public final java.lang.String iName;

		public final int iFromYear;

		public final int iToYear;

		public final java.lang.String iType;

		public final org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear iDateTimeOfYear;

		public final int iSaveMillis;

		public final java.lang.String iLetterS;

		Rule(java.util.StringTokenizer st) {
			iName = st.nextToken().intern();
			iFromYear = org.joda.time.tz.ZoneInfoCompiler.parseYear(st.nextToken(), 0);
			iToYear = org.joda.time.tz.ZoneInfoCompiler.parseYear(st.nextToken(), iFromYear);
			if ((iToYear) < (iFromYear)) {
				throw new java.lang.IllegalArgumentException();
			}
			iType = org.joda.time.tz.ZoneInfoCompiler.parseOptional(st.nextToken());
			iDateTimeOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear(st);
			iSaveMillis = org.joda.time.tz.ZoneInfoCompiler.parseTime(st.nextToken());
			iLetterS = org.joda.time.tz.ZoneInfoCompiler.parseOptional(st.nextToken());
		}

		public void addRecurring(org.joda.time.tz.DateTimeZoneBuilder builder, java.lang.String nameFormat) {
			java.lang.String nameKey = formatName(nameFormat);
			iDateTimeOfYear.addRecurring(builder, nameKey, iSaveMillis, iFromYear, iToYear);
		}

		private java.lang.String formatName(java.lang.String nameFormat) {
			int index = nameFormat.indexOf('/');
			if (index > 0) {
				if ((iSaveMillis) == 0) {
					return nameFormat.substring(0, index).intern();
				}else {
					return nameFormat.substring((index + 1)).intern();
				}
			}
			index = nameFormat.indexOf("%s");
			if (index < 0) {
				return nameFormat;
			}
			java.lang.String left = nameFormat.substring(0, index);
			java.lang.String right = nameFormat.substring((index + 2));
			java.lang.String name;
			if ((iLetterS) == null) {
				name = left.concat(right);
			}else {
				name = (left + (iLetterS)) + right;
			}
			return name.intern();
		}

		public java.lang.String toString() {
			return (((((((((((((((((("[Rule]\n" + "Name: ") + (iName)) + "\n") + "FromYear: ") + (iFromYear)) + "\n") + "ToYear: ") + (iToYear)) + "\n") + "Type: ") + (iType)) + "\n") + (iDateTimeOfYear)) + "SaveMillis: ") + (iSaveMillis)) + "\n") + "LetterS: ") + (iLetterS)) + "\n";
		}
	}

	private static class RuleSet {
		private java.util.List<org.joda.time.tz.ZoneInfoCompiler.Rule> iRules;

		RuleSet(org.joda.time.tz.ZoneInfoCompiler.Rule rule) {
			iRules = new java.util.ArrayList<org.joda.time.tz.ZoneInfoCompiler.Rule>();
			iRules.add(rule);
		}

		void addRule(org.joda.time.tz.ZoneInfoCompiler.Rule rule) {
			if (!(rule.iName.equals(iRules.get(0).iName))) {
				throw new java.lang.IllegalArgumentException("Rule name mismatch");
			}
			iRules.add(rule);
		}

		public void addRecurring(org.joda.time.tz.DateTimeZoneBuilder builder, java.lang.String nameFormat) {
			for (int i = 0; i < (iRules.size()); i++) {
				org.joda.time.tz.ZoneInfoCompiler.Rule rule = iRules.get(i);
				rule.addRecurring(builder, nameFormat);
			}
		}
	}

	private static class Zone {
		public final java.lang.String iName;

		public final int iOffsetMillis;

		public final java.lang.String iRules;

		public final java.lang.String iFormat;

		public final int iUntilYear;

		public final org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear iUntilDateTimeOfYear;

		private org.joda.time.tz.ZoneInfoCompiler.Zone iNext;

		Zone(java.util.StringTokenizer st) {
			this(st.nextToken(), st);
		}

		private Zone(java.lang.String name, java.util.StringTokenizer st) {
			iName = name.intern();
			iOffsetMillis = org.joda.time.tz.ZoneInfoCompiler.parseTime(st.nextToken());
			iRules = org.joda.time.tz.ZoneInfoCompiler.parseOptional(st.nextToken());
			iFormat = st.nextToken().intern();
			int year = java.lang.Integer.MAX_VALUE;
			org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dtOfYear = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
			if (st.hasMoreTokens()) {
				year = java.lang.Integer.parseInt(st.nextToken());
				if (st.hasMoreTokens()) {
					dtOfYear = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear(st);
				}
			}
			iUntilYear = year;
			iUntilDateTimeOfYear = dtOfYear;
		}

		void chain(java.util.StringTokenizer st) {
			if ((iNext) != null) {
				iNext.chain(st);
			}else {
				iNext = new org.joda.time.tz.ZoneInfoCompiler.Zone(iName, st);
			}
		}

		public void addToBuilder(org.joda.time.tz.DateTimeZoneBuilder builder, java.util.Map<java.lang.String, org.joda.time.tz.ZoneInfoCompiler.RuleSet> ruleSets) {
			org.joda.time.tz.ZoneInfoCompiler.Zone.addToBuilder(org.joda.time.tz.ZoneInfoCompiler.Zone.this, builder, ruleSets);
		}

		private static void addToBuilder(org.joda.time.tz.ZoneInfoCompiler.Zone zone, org.joda.time.tz.DateTimeZoneBuilder builder, java.util.Map<java.lang.String, org.joda.time.tz.ZoneInfoCompiler.RuleSet> ruleSets) {
			for (; zone != null; zone = zone.iNext) {
				builder.setStandardOffset(zone.iOffsetMillis);
				if ((zone.iRules) == null) {
					builder.setFixedSavings(zone.iFormat, 0);
				}else {
					try {
						int saveMillis = org.joda.time.tz.ZoneInfoCompiler.parseTime(zone.iRules);
						builder.setFixedSavings(zone.iFormat, saveMillis);
					} catch (java.lang.Exception e) {
						org.joda.time.tz.ZoneInfoCompiler.RuleSet rs = ruleSets.get(zone.iRules);
						if (rs == null) {
							throw new java.lang.IllegalArgumentException(("Rules not found: " + (zone.iRules)));
						}
						rs.addRecurring(builder, zone.iFormat);
					}
				}
				if ((zone.iUntilYear) == (java.lang.Integer.MAX_VALUE)) {
					break;
				}
				zone.iUntilDateTimeOfYear.addCutover(builder, zone.iUntilYear);
			}
		}

		public java.lang.String toString() {
			java.lang.String str = ((((((((((((((("[Zone]\n" + "Name: ") + (iName)) + "\n") + "OffsetMillis: ") + (iOffsetMillis)) + "\n") + "Rules: ") + (iRules)) + "\n") + "Format: ") + (iFormat)) + "\n") + "UntilYear: ") + (iUntilYear)) + "\n") + (iUntilDateTimeOfYear);
			if ((iNext) == null) {
				return str;
			}
			return (str + "...\n") + (iNext.toString());
		}
	}
}




package org.joda.time.format;


public class ISODateTimeFormat {
	private static org.joda.time.format.DateTimeFormatter ye;

	private static org.joda.time.format.DateTimeFormatter mye;

	private static org.joda.time.format.DateTimeFormatter dme;

	private static org.joda.time.format.DateTimeFormatter we;

	private static org.joda.time.format.DateTimeFormatter wwe;

	private static org.joda.time.format.DateTimeFormatter dwe;

	private static org.joda.time.format.DateTimeFormatter dye;

	private static org.joda.time.format.DateTimeFormatter hde;

	private static org.joda.time.format.DateTimeFormatter mhe;

	private static org.joda.time.format.DateTimeFormatter sme;

	private static org.joda.time.format.DateTimeFormatter fse;

	private static org.joda.time.format.DateTimeFormatter ze;

	private static org.joda.time.format.DateTimeFormatter lte;

	private static org.joda.time.format.DateTimeFormatter ym;

	private static org.joda.time.format.DateTimeFormatter ymd;

	private static org.joda.time.format.DateTimeFormatter ww;

	private static org.joda.time.format.DateTimeFormatter wwd;

	private static org.joda.time.format.DateTimeFormatter hm;

	private static org.joda.time.format.DateTimeFormatter hms;

	private static org.joda.time.format.DateTimeFormatter hmsl;

	private static org.joda.time.format.DateTimeFormatter hmsf;

	private static org.joda.time.format.DateTimeFormatter dh;

	private static org.joda.time.format.DateTimeFormatter dhm;

	private static org.joda.time.format.DateTimeFormatter dhms;

	private static org.joda.time.format.DateTimeFormatter dhmsl;

	private static org.joda.time.format.DateTimeFormatter dhmsf;

	private static org.joda.time.format.DateTimeFormatter t;

	private static org.joda.time.format.DateTimeFormatter tx;

	private static org.joda.time.format.DateTimeFormatter tt;

	private static org.joda.time.format.DateTimeFormatter ttx;

	private static org.joda.time.format.DateTimeFormatter dt;

	private static org.joda.time.format.DateTimeFormatter dtx;

	private static org.joda.time.format.DateTimeFormatter wdt;

	private static org.joda.time.format.DateTimeFormatter wdtx;

	private static org.joda.time.format.DateTimeFormatter od;

	private static org.joda.time.format.DateTimeFormatter odt;

	private static org.joda.time.format.DateTimeFormatter odtx;

	private static org.joda.time.format.DateTimeFormatter bd;

	private static org.joda.time.format.DateTimeFormatter bt;

	private static org.joda.time.format.DateTimeFormatter btx;

	private static org.joda.time.format.DateTimeFormatter btt;

	private static org.joda.time.format.DateTimeFormatter bttx;

	private static org.joda.time.format.DateTimeFormatter bdt;

	private static org.joda.time.format.DateTimeFormatter bdtx;

	private static org.joda.time.format.DateTimeFormatter bod;

	private static org.joda.time.format.DateTimeFormatter bodt;

	private static org.joda.time.format.DateTimeFormatter bodtx;

	private static org.joda.time.format.DateTimeFormatter bwd;

	private static org.joda.time.format.DateTimeFormatter bwdt;

	private static org.joda.time.format.DateTimeFormatter bwdtx;

	private static org.joda.time.format.DateTimeFormatter dpe;

	private static org.joda.time.format.DateTimeFormatter tpe;

	private static org.joda.time.format.DateTimeFormatter dp;

	private static org.joda.time.format.DateTimeFormatter ldp;

	private static org.joda.time.format.DateTimeFormatter tp;

	private static org.joda.time.format.DateTimeFormatter ltp;

	private static org.joda.time.format.DateTimeFormatter dtp;

	private static org.joda.time.format.DateTimeFormatter dotp;

	private static org.joda.time.format.DateTimeFormatter ldotp;

	protected ISODateTimeFormat() {
		super();
	}

	public static org.joda.time.format.DateTimeFormatter forFields(java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean extended, boolean strictISO) {
		if ((fields == null) || ((fields.size()) == 0)) {
			throw new java.lang.IllegalArgumentException("The fields must not be null or empty");
		}
		java.util.Set<org.joda.time.DateTimeFieldType> workingFields = new java.util.HashSet<org.joda.time.DateTimeFieldType>(fields);
		int inputSize = workingFields.size();
		boolean reducedPrec = false;
		org.joda.time.format.DateTimeFormatterBuilder bld = new org.joda.time.format.DateTimeFormatterBuilder();
		if (workingFields.contains(org.joda.time.DateTimeFieldType.monthOfYear())) {
			reducedPrec = org.joda.time.format.ISODateTimeFormat.dateByMonth(bld, workingFields, extended, strictISO);
		}else
			if (workingFields.contains(org.joda.time.DateTimeFieldType.dayOfYear())) {
				reducedPrec = org.joda.time.format.ISODateTimeFormat.dateByOrdinal(bld, workingFields, extended, strictISO);
			}else
				if (workingFields.contains(org.joda.time.DateTimeFieldType.weekOfWeekyear())) {
					reducedPrec = org.joda.time.format.ISODateTimeFormat.dateByWeek(bld, workingFields, extended, strictISO);
				}else
					if (workingFields.contains(org.joda.time.DateTimeFieldType.dayOfMonth())) {
						reducedPrec = org.joda.time.format.ISODateTimeFormat.dateByMonth(bld, workingFields, extended, strictISO);
					}else
						if (workingFields.contains(org.joda.time.DateTimeFieldType.dayOfWeek())) {
							reducedPrec = org.joda.time.format.ISODateTimeFormat.dateByWeek(bld, workingFields, extended, strictISO);
						}else
							if (workingFields.remove(org.joda.time.DateTimeFieldType.year())) {
								bld.append(org.joda.time.format.ISODateTimeFormat.yearElement());
								reducedPrec = true;
							}else
								if (workingFields.remove(org.joda.time.DateTimeFieldType.weekyear())) {
									bld.append(org.joda.time.format.ISODateTimeFormat.weekyearElement());
									reducedPrec = true;
								}
							
						
					
				
			
		
		boolean datePresent = (workingFields.size()) < inputSize;
		org.joda.time.format.ISODateTimeFormat.time(bld, workingFields, extended, strictISO, reducedPrec, datePresent);
		if ((bld.canBuildFormatter()) == false) {
			throw new java.lang.IllegalArgumentException(("No valid format for fields: " + fields));
		}
		try {
			fields.retainAll(workingFields);
		} catch (java.lang.UnsupportedOperationException ex) {
		}
		return bld.toFormatter();
	}

	private static boolean dateByMonth(org.joda.time.format.DateTimeFormatterBuilder bld, java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean extended, boolean strictISO) {
		boolean reducedPrec = false;
		if (fields.remove(org.joda.time.DateTimeFieldType.year())) {
			bld.append(org.joda.time.format.ISODateTimeFormat.yearElement());
			if (fields.remove(org.joda.time.DateTimeFieldType.monthOfYear())) {
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfMonth())) {
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendMonthOfYear(2);
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendDayOfMonth(2);
				}else {
					bld.appendLiteral('-');
					bld.appendMonthOfYear(2);
					reducedPrec = true;
				}
			}else {
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfMonth())) {
					org.joda.time.format.ISODateTimeFormat.checkNotStrictISO(fields, strictISO);
					bld.appendLiteral('-');
					bld.appendLiteral('-');
					bld.appendDayOfMonth(2);
				}else {
					reducedPrec = true;
				}
			}
		}else
			if (fields.remove(org.joda.time.DateTimeFieldType.monthOfYear())) {
				bld.appendLiteral('-');
				bld.appendLiteral('-');
				bld.appendMonthOfYear(2);
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfMonth())) {
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendDayOfMonth(2);
				}else {
					reducedPrec = true;
				}
			}else
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfMonth())) {
					bld.appendLiteral('-');
					bld.appendLiteral('-');
					bld.appendLiteral('-');
					bld.appendDayOfMonth(2);
				}
			
		
		return reducedPrec;
	}

	private static boolean dateByOrdinal(org.joda.time.format.DateTimeFormatterBuilder bld, java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean extended, boolean strictISO) {
		boolean reducedPrec = false;
		if (fields.remove(org.joda.time.DateTimeFieldType.year())) {
			bld.append(org.joda.time.format.ISODateTimeFormat.yearElement());
			if (fields.remove(org.joda.time.DateTimeFieldType.dayOfYear())) {
				org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
				bld.appendDayOfYear(3);
			}else {
				reducedPrec = true;
			}
		}else
			if (fields.remove(org.joda.time.DateTimeFieldType.dayOfYear())) {
				bld.appendLiteral('-');
				bld.appendDayOfYear(3);
			}
		
		return reducedPrec;
	}

	private static boolean dateByWeek(org.joda.time.format.DateTimeFormatterBuilder bld, java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean extended, boolean strictISO) {
		boolean reducedPrec = false;
		if (fields.remove(org.joda.time.DateTimeFieldType.weekyear())) {
			bld.append(org.joda.time.format.ISODateTimeFormat.weekyearElement());
			if (fields.remove(org.joda.time.DateTimeFieldType.weekOfWeekyear())) {
				org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
				bld.appendLiteral('W');
				bld.appendWeekOfWeekyear(2);
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfWeek())) {
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendDayOfWeek(1);
				}else {
					reducedPrec = true;
				}
			}else {
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfWeek())) {
					org.joda.time.format.ISODateTimeFormat.checkNotStrictISO(fields, strictISO);
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendLiteral('W');
					bld.appendLiteral('-');
					bld.appendDayOfWeek(1);
				}else {
					reducedPrec = true;
				}
			}
		}else
			if (fields.remove(org.joda.time.DateTimeFieldType.weekOfWeekyear())) {
				bld.appendLiteral('-');
				bld.appendLiteral('W');
				bld.appendWeekOfWeekyear(2);
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfWeek())) {
					org.joda.time.format.ISODateTimeFormat.appendSeparator(bld, extended);
					bld.appendDayOfWeek(1);
				}else {
					reducedPrec = true;
				}
			}else
				if (fields.remove(org.joda.time.DateTimeFieldType.dayOfWeek())) {
					bld.appendLiteral('-');
					bld.appendLiteral('W');
					bld.appendLiteral('-');
					bld.appendDayOfWeek(1);
				}
			
		
		return reducedPrec;
	}

	private static void time(org.joda.time.format.DateTimeFormatterBuilder bld, java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean extended, boolean strictISO, boolean reducedPrec, boolean datePresent) {
		boolean hour = fields.remove(org.joda.time.DateTimeFieldType.hourOfDay());
		boolean minute = fields.remove(org.joda.time.DateTimeFieldType.minuteOfHour());
		boolean second = fields.remove(org.joda.time.DateTimeFieldType.secondOfMinute());
		boolean milli = fields.remove(org.joda.time.DateTimeFieldType.millisOfSecond());
		if ((((!hour) && (!minute)) && (!second)) && (!milli)) {
			return ;
		}
		if (((hour || minute) || second) || milli) {
			if (strictISO && reducedPrec) {
				throw new java.lang.IllegalArgumentException(("No valid ISO8601 format for fields because Date was reduced precision: " + fields));
			}
			if (datePresent) {
				bld.appendLiteral('T');
			}
		}
		if (((hour && minute) && second) || ((hour && (!second)) && (!milli))) {
		}else {
			if (strictISO && datePresent) {
				throw new java.lang.IllegalArgumentException(("No valid ISO8601 format for fields because Time was truncated: " + fields));
			}
			if ((!hour) && (((minute && second) || (minute && (!milli))) || second)) {
			}else {
				if (strictISO) {
					throw new java.lang.IllegalArgumentException(("No valid ISO8601 format for fields: " + fields));
				}
			}
		}
		if (hour) {
			bld.appendHourOfDay(2);
		}else
			if ((minute || second) || milli) {
				bld.appendLiteral('-');
			}
		
		if ((extended && hour) && minute) {
			bld.appendLiteral(':');
		}
		if (minute) {
			bld.appendMinuteOfHour(2);
		}else
			if (second || milli) {
				bld.appendLiteral('-');
			}
		
		if ((extended && minute) && second) {
			bld.appendLiteral(':');
		}
		if (second) {
			bld.appendSecondOfMinute(2);
		}else
			if (milli) {
				bld.appendLiteral('-');
			}
		
		if (milli) {
			bld.appendLiteral('.');
			bld.appendMillisOfSecond(3);
		}
	}

	private static void checkNotStrictISO(java.util.Collection<org.joda.time.DateTimeFieldType> fields, boolean strictISO) {
		if (strictISO) {
			throw new java.lang.IllegalArgumentException(("No valid ISO8601 format for fields: " + fields));
		}
	}

	private static void appendSeparator(org.joda.time.format.DateTimeFormatterBuilder bld, boolean extended) {
		if (extended) {
			bld.appendLiteral('-');
		}
	}

	public static org.joda.time.format.DateTimeFormatter dateParser() {
		if ((org.joda.time.format.ISODateTimeFormat.dp) == null) {
			org.joda.time.format.DateTimeParser tOffset = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('T').append(org.joda.time.format.ISODateTimeFormat.offsetElement()).toParser();
			org.joda.time.format.ISODateTimeFormat.dp = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.dateElementParser()).appendOptional(tOffset).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dp;
	}

	public static org.joda.time.format.DateTimeFormatter localDateParser() {
		if ((org.joda.time.format.ISODateTimeFormat.ldp) == null) {
			org.joda.time.format.ISODateTimeFormat.ldp = org.joda.time.format.ISODateTimeFormat.dateElementParser().withZoneUTC();
		}
		return org.joda.time.format.ISODateTimeFormat.ldp;
	}

	public static org.joda.time.format.DateTimeFormatter dateElementParser() {
		if ((org.joda.time.format.ISODateTimeFormat.dpe) == null) {
			org.joda.time.format.ISODateTimeFormat.dpe = new org.joda.time.format.DateTimeFormatterBuilder().append(null, new org.joda.time.format.DateTimeParser[]{ new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.yearElement()).appendOptional(new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.monthElement()).appendOptional(org.joda.time.format.ISODateTimeFormat.dayOfMonthElement().getParser()).toParser()).toParser() , new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.weekyearElement()).append(org.joda.time.format.ISODateTimeFormat.weekElement()).appendOptional(org.joda.time.format.ISODateTimeFormat.dayOfWeekElement().getParser()).toParser() , new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.yearElement()).append(org.joda.time.format.ISODateTimeFormat.dayOfYearElement()).toParser() }).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dpe;
	}

	public static org.joda.time.format.DateTimeFormatter timeParser() {
		if ((org.joda.time.format.ISODateTimeFormat.tp) == null) {
			org.joda.time.format.ISODateTimeFormat.tp = new org.joda.time.format.DateTimeFormatterBuilder().appendOptional(org.joda.time.format.ISODateTimeFormat.literalTElement().getParser()).append(org.joda.time.format.ISODateTimeFormat.timeElementParser()).appendOptional(org.joda.time.format.ISODateTimeFormat.offsetElement().getParser()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.tp;
	}

	public static org.joda.time.format.DateTimeFormatter localTimeParser() {
		if ((org.joda.time.format.ISODateTimeFormat.ltp) == null) {
			org.joda.time.format.ISODateTimeFormat.ltp = new org.joda.time.format.DateTimeFormatterBuilder().appendOptional(org.joda.time.format.ISODateTimeFormat.literalTElement().getParser()).append(org.joda.time.format.ISODateTimeFormat.timeElementParser()).toFormatter().withZoneUTC();
		}
		return org.joda.time.format.ISODateTimeFormat.ltp;
	}

	public static org.joda.time.format.DateTimeFormatter timeElementParser() {
		if ((org.joda.time.format.ISODateTimeFormat.tpe) == null) {
			org.joda.time.format.DateTimeParser decimalPoint = new org.joda.time.format.DateTimeFormatterBuilder().append(null, new org.joda.time.format.DateTimeParser[]{ new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('.').toParser() , new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral(',').toParser() }).toParser();
			org.joda.time.format.ISODateTimeFormat.tpe = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourElement()).append(null, new org.joda.time.format.DateTimeParser[]{ new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.minuteElement()).append(null, new org.joda.time.format.DateTimeParser[]{ new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.secondElement()).appendOptional(new org.joda.time.format.DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfSecond(1, 9).toParser()).toParser() , new org.joda.time.format.DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfMinute(1, 9).toParser() , null }).toParser() , new org.joda.time.format.DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfHour(1, 9).toParser() , null }).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.tpe;
	}

	public static org.joda.time.format.DateTimeFormatter dateTimeParser() {
		if ((org.joda.time.format.ISODateTimeFormat.dtp) == null) {
			org.joda.time.format.DateTimeParser time = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('T').append(org.joda.time.format.ISODateTimeFormat.timeElementParser()).appendOptional(org.joda.time.format.ISODateTimeFormat.offsetElement().getParser()).toParser();
			org.joda.time.format.ISODateTimeFormat.dtp = new org.joda.time.format.DateTimeFormatterBuilder().append(null, new org.joda.time.format.DateTimeParser[]{ time , org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser().getParser() }).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dtp;
	}

	public static org.joda.time.format.DateTimeFormatter dateOptionalTimeParser() {
		if ((org.joda.time.format.ISODateTimeFormat.dotp) == null) {
			org.joda.time.format.DateTimeParser timeOrOffset = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('T').appendOptional(org.joda.time.format.ISODateTimeFormat.timeElementParser().getParser()).appendOptional(org.joda.time.format.ISODateTimeFormat.offsetElement().getParser()).toParser();
			org.joda.time.format.ISODateTimeFormat.dotp = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.dateElementParser()).appendOptional(timeOrOffset).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dotp;
	}

	public static org.joda.time.format.DateTimeFormatter localDateOptionalTimeParser() {
		if ((org.joda.time.format.ISODateTimeFormat.ldotp) == null) {
			org.joda.time.format.DateTimeParser time = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('T').append(org.joda.time.format.ISODateTimeFormat.timeElementParser()).toParser();
			org.joda.time.format.ISODateTimeFormat.ldotp = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.dateElementParser()).appendOptional(time).toFormatter().withZoneUTC();
		}
		return org.joda.time.format.ISODateTimeFormat.ldotp;
	}

	public static org.joda.time.format.DateTimeFormatter date() {
		return org.joda.time.format.ISODateTimeFormat.yearMonthDay();
	}

	public static org.joda.time.format.DateTimeFormatter time() {
		if ((org.joda.time.format.ISODateTimeFormat.t) == null) {
			org.joda.time.format.ISODateTimeFormat.t = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction()).append(org.joda.time.format.ISODateTimeFormat.offsetElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.t;
	}

	public static org.joda.time.format.DateTimeFormatter timeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.tx) == null) {
			org.joda.time.format.ISODateTimeFormat.tx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourMinuteSecond()).append(org.joda.time.format.ISODateTimeFormat.offsetElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.tx;
	}

	public static org.joda.time.format.DateTimeFormatter tTime() {
		if ((org.joda.time.format.ISODateTimeFormat.tt) == null) {
			org.joda.time.format.ISODateTimeFormat.tt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.time()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.tt;
	}

	public static org.joda.time.format.DateTimeFormatter tTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.ttx) == null) {
			org.joda.time.format.ISODateTimeFormat.ttx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.timeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ttx;
	}

	public static org.joda.time.format.DateTimeFormatter dateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.dt) == null) {
			org.joda.time.format.ISODateTimeFormat.dt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.tTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dt;
	}

	public static org.joda.time.format.DateTimeFormatter dateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.dtx) == null) {
			org.joda.time.format.ISODateTimeFormat.dtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.tTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dtx;
	}

	public static org.joda.time.format.DateTimeFormatter ordinalDate() {
		if ((org.joda.time.format.ISODateTimeFormat.od) == null) {
			org.joda.time.format.ISODateTimeFormat.od = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.yearElement()).append(org.joda.time.format.ISODateTimeFormat.dayOfYearElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.od;
	}

	public static org.joda.time.format.DateTimeFormatter ordinalDateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.odt) == null) {
			org.joda.time.format.ISODateTimeFormat.odt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.ordinalDate()).append(org.joda.time.format.ISODateTimeFormat.tTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.odt;
	}

	public static org.joda.time.format.DateTimeFormatter ordinalDateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.odtx) == null) {
			org.joda.time.format.ISODateTimeFormat.odtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.ordinalDate()).append(org.joda.time.format.ISODateTimeFormat.tTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.odtx;
	}

	public static org.joda.time.format.DateTimeFormatter weekDate() {
		return org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
	}

	public static org.joda.time.format.DateTimeFormatter weekDateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.wdt) == null) {
			org.joda.time.format.ISODateTimeFormat.wdt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.weekDate()).append(org.joda.time.format.ISODateTimeFormat.tTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.wdt;
	}

	public static org.joda.time.format.DateTimeFormatter weekDateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.wdtx) == null) {
			org.joda.time.format.ISODateTimeFormat.wdtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.weekDate()).append(org.joda.time.format.ISODateTimeFormat.tTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.wdtx;
	}

	public static org.joda.time.format.DateTimeFormatter basicDate() {
		if ((org.joda.time.format.ISODateTimeFormat.bd) == null) {
			org.joda.time.format.ISODateTimeFormat.bd = new org.joda.time.format.DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(org.joda.time.DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.dayOfMonth(), 2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bd;
	}

	public static org.joda.time.format.DateTimeFormatter basicTime() {
		if ((org.joda.time.format.ISODateTimeFormat.bt) == null) {
			org.joda.time.format.ISODateTimeFormat.bt = new org.joda.time.format.DateTimeFormatterBuilder().appendFixedDecimal(org.joda.time.DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bt;
	}

	public static org.joda.time.format.DateTimeFormatter basicTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.btx) == null) {
			org.joda.time.format.ISODateTimeFormat.btx = new org.joda.time.format.DateTimeFormatterBuilder().appendFixedDecimal(org.joda.time.DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.btx;
	}

	public static org.joda.time.format.DateTimeFormatter basicTTime() {
		if ((org.joda.time.format.ISODateTimeFormat.btt) == null) {
			org.joda.time.format.ISODateTimeFormat.btt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.basicTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.btt;
	}

	public static org.joda.time.format.DateTimeFormatter basicTTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.bttx) == null) {
			org.joda.time.format.ISODateTimeFormat.bttx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bttx;
	}

	public static org.joda.time.format.DateTimeFormatter basicDateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.bdt) == null) {
			org.joda.time.format.ISODateTimeFormat.bdt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bdt;
	}

	public static org.joda.time.format.DateTimeFormatter basicDateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.bdtx) == null) {
			org.joda.time.format.ISODateTimeFormat.bdtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bdtx;
	}

	public static org.joda.time.format.DateTimeFormatter basicOrdinalDate() {
		if ((org.joda.time.format.ISODateTimeFormat.bod) == null) {
			org.joda.time.format.ISODateTimeFormat.bod = new org.joda.time.format.DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(org.joda.time.DateTimeFieldType.dayOfYear(), 3).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bod;
	}

	public static org.joda.time.format.DateTimeFormatter basicOrdinalDateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.bodt) == null) {
			org.joda.time.format.ISODateTimeFormat.bodt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicOrdinalDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bodt;
	}

	public static org.joda.time.format.DateTimeFormatter basicOrdinalDateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.bodtx) == null) {
			org.joda.time.format.ISODateTimeFormat.bodtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicOrdinalDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bodtx;
	}

	public static org.joda.time.format.DateTimeFormatter basicWeekDate() {
		if ((org.joda.time.format.ISODateTimeFormat.bwd) == null) {
			org.joda.time.format.ISODateTimeFormat.bwd = new org.joda.time.format.DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(org.joda.time.DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(org.joda.time.DateTimeFieldType.dayOfWeek(), 1).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bwd;
	}

	public static org.joda.time.format.DateTimeFormatter basicWeekDateTime() {
		if ((org.joda.time.format.ISODateTimeFormat.bwdt) == null) {
			org.joda.time.format.ISODateTimeFormat.bwdt = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicWeekDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTime()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bwdt;
	}

	public static org.joda.time.format.DateTimeFormatter basicWeekDateTimeNoMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.bwdtx) == null) {
			org.joda.time.format.ISODateTimeFormat.bwdtx = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.basicWeekDate()).append(org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.bwdtx;
	}

	public static org.joda.time.format.DateTimeFormatter year() {
		return org.joda.time.format.ISODateTimeFormat.yearElement();
	}

	public static org.joda.time.format.DateTimeFormatter yearMonth() {
		if ((org.joda.time.format.ISODateTimeFormat.ym) == null) {
			org.joda.time.format.ISODateTimeFormat.ym = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.yearElement()).append(org.joda.time.format.ISODateTimeFormat.monthElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ym;
	}

	public static org.joda.time.format.DateTimeFormatter yearMonthDay() {
		if ((org.joda.time.format.ISODateTimeFormat.ymd) == null) {
			org.joda.time.format.ISODateTimeFormat.ymd = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.yearElement()).append(org.joda.time.format.ISODateTimeFormat.monthElement()).append(org.joda.time.format.ISODateTimeFormat.dayOfMonthElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ymd;
	}

	public static org.joda.time.format.DateTimeFormatter weekyear() {
		return org.joda.time.format.ISODateTimeFormat.weekyearElement();
	}

	public static org.joda.time.format.DateTimeFormatter weekyearWeek() {
		if ((org.joda.time.format.ISODateTimeFormat.ww) == null) {
			org.joda.time.format.ISODateTimeFormat.ww = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.weekyearElement()).append(org.joda.time.format.ISODateTimeFormat.weekElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ww;
	}

	public static org.joda.time.format.DateTimeFormatter weekyearWeekDay() {
		if ((org.joda.time.format.ISODateTimeFormat.wwd) == null) {
			org.joda.time.format.ISODateTimeFormat.wwd = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.weekyearElement()).append(org.joda.time.format.ISODateTimeFormat.weekElement()).append(org.joda.time.format.ISODateTimeFormat.dayOfWeekElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.wwd;
	}

	public static org.joda.time.format.DateTimeFormatter hour() {
		return org.joda.time.format.ISODateTimeFormat.hourElement();
	}

	public static org.joda.time.format.DateTimeFormatter hourMinute() {
		if ((org.joda.time.format.ISODateTimeFormat.hm) == null) {
			org.joda.time.format.ISODateTimeFormat.hm = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourElement()).append(org.joda.time.format.ISODateTimeFormat.minuteElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.hm;
	}

	public static org.joda.time.format.DateTimeFormatter hourMinuteSecond() {
		if ((org.joda.time.format.ISODateTimeFormat.hms) == null) {
			org.joda.time.format.ISODateTimeFormat.hms = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourElement()).append(org.joda.time.format.ISODateTimeFormat.minuteElement()).append(org.joda.time.format.ISODateTimeFormat.secondElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.hms;
	}

	public static org.joda.time.format.DateTimeFormatter hourMinuteSecondMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.hmsl) == null) {
			org.joda.time.format.ISODateTimeFormat.hmsl = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourElement()).append(org.joda.time.format.ISODateTimeFormat.minuteElement()).append(org.joda.time.format.ISODateTimeFormat.secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.hmsl;
	}

	public static org.joda.time.format.DateTimeFormatter hourMinuteSecondFraction() {
		if ((org.joda.time.format.ISODateTimeFormat.hmsf) == null) {
			org.joda.time.format.ISODateTimeFormat.hmsf = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.hourElement()).append(org.joda.time.format.ISODateTimeFormat.minuteElement()).append(org.joda.time.format.ISODateTimeFormat.secondElement()).append(org.joda.time.format.ISODateTimeFormat.fractionElement()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.hmsf;
	}

	public static org.joda.time.format.DateTimeFormatter dateHour() {
		if ((org.joda.time.format.ISODateTimeFormat.dh) == null) {
			org.joda.time.format.ISODateTimeFormat.dh = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.hour()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dh;
	}

	public static org.joda.time.format.DateTimeFormatter dateHourMinute() {
		if ((org.joda.time.format.ISODateTimeFormat.dhm) == null) {
			org.joda.time.format.ISODateTimeFormat.dhm = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.hourMinute()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dhm;
	}

	public static org.joda.time.format.DateTimeFormatter dateHourMinuteSecond() {
		if ((org.joda.time.format.ISODateTimeFormat.dhms) == null) {
			org.joda.time.format.ISODateTimeFormat.dhms = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.hourMinuteSecond()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dhms;
	}

	public static org.joda.time.format.DateTimeFormatter dateHourMinuteSecondMillis() {
		if ((org.joda.time.format.ISODateTimeFormat.dhmsl) == null) {
			org.joda.time.format.ISODateTimeFormat.dhmsl = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dhmsl;
	}

	public static org.joda.time.format.DateTimeFormatter dateHourMinuteSecondFraction() {
		if ((org.joda.time.format.ISODateTimeFormat.dhmsf) == null) {
			org.joda.time.format.ISODateTimeFormat.dhmsf = new org.joda.time.format.DateTimeFormatterBuilder().append(org.joda.time.format.ISODateTimeFormat.date()).append(org.joda.time.format.ISODateTimeFormat.literalTElement()).append(org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction()).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dhmsf;
	}

	private static org.joda.time.format.DateTimeFormatter yearElement() {
		if ((org.joda.time.format.ISODateTimeFormat.ye) == null) {
			org.joda.time.format.ISODateTimeFormat.ye = new org.joda.time.format.DateTimeFormatterBuilder().appendYear(4, 9).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ye;
	}

	private static org.joda.time.format.DateTimeFormatter monthElement() {
		if ((org.joda.time.format.ISODateTimeFormat.mye) == null) {
			org.joda.time.format.ISODateTimeFormat.mye = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.mye;
	}

	private static org.joda.time.format.DateTimeFormatter dayOfMonthElement() {
		if ((org.joda.time.format.ISODateTimeFormat.dme) == null) {
			org.joda.time.format.ISODateTimeFormat.dme = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dme;
	}

	private static org.joda.time.format.DateTimeFormatter weekyearElement() {
		if ((org.joda.time.format.ISODateTimeFormat.we) == null) {
			org.joda.time.format.ISODateTimeFormat.we = new org.joda.time.format.DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.we;
	}

	private static org.joda.time.format.DateTimeFormatter weekElement() {
		if ((org.joda.time.format.ISODateTimeFormat.wwe) == null) {
			org.joda.time.format.ISODateTimeFormat.wwe = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.wwe;
	}

	private static org.joda.time.format.DateTimeFormatter dayOfWeekElement() {
		if ((org.joda.time.format.ISODateTimeFormat.dwe) == null) {
			org.joda.time.format.ISODateTimeFormat.dwe = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dwe;
	}

	private static org.joda.time.format.DateTimeFormatter dayOfYearElement() {
		if ((org.joda.time.format.ISODateTimeFormat.dye) == null) {
			org.joda.time.format.ISODateTimeFormat.dye = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.dye;
	}

	private static org.joda.time.format.DateTimeFormatter literalTElement() {
		if ((org.joda.time.format.ISODateTimeFormat.lte) == null) {
			org.joda.time.format.ISODateTimeFormat.lte = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('T').toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.lte;
	}

	private static org.joda.time.format.DateTimeFormatter hourElement() {
		if ((org.joda.time.format.ISODateTimeFormat.hde) == null) {
			org.joda.time.format.ISODateTimeFormat.hde = new org.joda.time.format.DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.hde;
	}

	private static org.joda.time.format.DateTimeFormatter minuteElement() {
		if ((org.joda.time.format.ISODateTimeFormat.mhe) == null) {
			org.joda.time.format.ISODateTimeFormat.mhe = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.mhe;
	}

	private static org.joda.time.format.DateTimeFormatter secondElement() {
		if ((org.joda.time.format.ISODateTimeFormat.sme) == null) {
			org.joda.time.format.ISODateTimeFormat.sme = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.sme;
	}

	private static org.joda.time.format.DateTimeFormatter fractionElement() {
		if ((org.joda.time.format.ISODateTimeFormat.fse) == null) {
			org.joda.time.format.ISODateTimeFormat.fse = new org.joda.time.format.DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.fse;
	}

	private static org.joda.time.format.DateTimeFormatter offsetElement() {
		if ((org.joda.time.format.ISODateTimeFormat.ze) == null) {
			org.joda.time.format.ISODateTimeFormat.ze = new org.joda.time.format.DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
		}
		return org.joda.time.format.ISODateTimeFormat.ze;
	}
}


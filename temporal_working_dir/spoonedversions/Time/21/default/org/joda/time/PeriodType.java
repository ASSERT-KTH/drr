

package org.joda.time;


public class PeriodType implements java.io.Serializable {
	private static final long serialVersionUID = 2274324892792009998L;

	private static final java.util.Map<org.joda.time.PeriodType, java.lang.Object> cTypes = new java.util.HashMap<org.joda.time.PeriodType, java.lang.Object>(32);

	static int YEAR_INDEX = 0;

	static int MONTH_INDEX = 1;

	static int WEEK_INDEX = 2;

	static int DAY_INDEX = 3;

	static int HOUR_INDEX = 4;

	static int MINUTE_INDEX = 5;

	static int SECOND_INDEX = 6;

	static int MILLI_INDEX = 7;

	private static org.joda.time.PeriodType cStandard;

	private static org.joda.time.PeriodType cYMDTime;

	private static org.joda.time.PeriodType cYMD;

	private static org.joda.time.PeriodType cYWDTime;

	private static org.joda.time.PeriodType cYWD;

	private static org.joda.time.PeriodType cYDTime;

	private static org.joda.time.PeriodType cYD;

	private static org.joda.time.PeriodType cDTime;

	private static org.joda.time.PeriodType cTime;

	private static org.joda.time.PeriodType cYears;

	private static org.joda.time.PeriodType cMonths;

	private static org.joda.time.PeriodType cWeeks;

	private static org.joda.time.PeriodType cDays;

	private static org.joda.time.PeriodType cHours;

	private static org.joda.time.PeriodType cMinutes;

	private static org.joda.time.PeriodType cSeconds;

	private static org.joda.time.PeriodType cMillis;

	public static org.joda.time.PeriodType standard() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cStandard;
		if (type == null) {
			type = new org.joda.time.PeriodType("Standard", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.months() , org.joda.time.DurationFieldType.weeks() , org.joda.time.DurationFieldType.days() , org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 });
			org.joda.time.PeriodType.cStandard = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearMonthDayTime() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYMDTime;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearMonthDayTime", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.months() , org.joda.time.DurationFieldType.days() , org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ 0 , 1 , -1 , 2 , 3 , 4 , 5 , 6 });
			org.joda.time.PeriodType.cYMDTime = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearMonthDay() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYMD;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearMonthDay", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.months() , org.joda.time.DurationFieldType.days() }, new int[]{ 0 , 1 , -1 , 2 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cYMD = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearWeekDayTime() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYWDTime;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearWeekDayTime", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.weeks() , org.joda.time.DurationFieldType.days() , org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ 0 , -1 , 1 , 2 , 3 , 4 , 5 , 6 });
			org.joda.time.PeriodType.cYWDTime = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearWeekDay() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYWD;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearWeekDay", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.weeks() , org.joda.time.DurationFieldType.days() }, new int[]{ 0 , -1 , 1 , 2 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cYWD = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearDayTime() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYDTime;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearDayTime", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.days() , org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ 0 , -1 , -1 , 1 , 2 , 3 , 4 , 5 });
			org.joda.time.PeriodType.cYDTime = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType yearDay() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYD;
		if (type == null) {
			type = new org.joda.time.PeriodType("YearDay", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() , org.joda.time.DurationFieldType.days() }, new int[]{ 0 , -1 , -1 , 1 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cYD = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType dayTime() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cDTime;
		if (type == null) {
			type = new org.joda.time.PeriodType("DayTime", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.days() , org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ -1 , -1 , -1 , 0 , 1 , 2 , 3 , 4 });
			org.joda.time.PeriodType.cDTime = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType time() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cTime;
		if (type == null) {
			type = new org.joda.time.PeriodType("Time", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.hours() , org.joda.time.DurationFieldType.minutes() , org.joda.time.DurationFieldType.seconds() , org.joda.time.DurationFieldType.millis() }, new int[]{ -1 , -1 , -1 , -1 , 0 , 1 , 2 , 3 });
			org.joda.time.PeriodType.cTime = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType years() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cYears;
		if (type == null) {
			type = new org.joda.time.PeriodType("Years", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.years() }, new int[]{ 0 , -1 , -1 , -1 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cYears = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType months() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cMonths;
		if (type == null) {
			type = new org.joda.time.PeriodType("Months", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.months() }, new int[]{ -1 , 0 , -1 , -1 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cMonths = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType weeks() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cWeeks;
		if (type == null) {
			type = new org.joda.time.PeriodType("Weeks", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.weeks() }, new int[]{ -1 , -1 , 0 , -1 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cWeeks = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType days() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cDays;
		if (type == null) {
			type = new org.joda.time.PeriodType("Days", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.days() }, new int[]{ -1 , -1 , -1 , 0 , -1 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cDays = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType hours() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cHours;
		if (type == null) {
			type = new org.joda.time.PeriodType("Hours", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.hours() }, new int[]{ -1 , -1 , -1 , -1 , 0 , -1 , -1 , -1 });
			org.joda.time.PeriodType.cHours = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType minutes() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cMinutes;
		if (type == null) {
			type = new org.joda.time.PeriodType("Minutes", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.minutes() }, new int[]{ -1 , -1 , -1 , -1 , -1 , 0 , -1 , -1 });
			org.joda.time.PeriodType.cMinutes = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType seconds() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cSeconds;
		if (type == null) {
			type = new org.joda.time.PeriodType("Seconds", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.seconds() }, new int[]{ -1 , -1 , -1 , -1 , -1 , -1 , 0 , -1 });
			org.joda.time.PeriodType.cSeconds = type;
		}
		return type;
	}

	public static org.joda.time.PeriodType millis() {
		org.joda.time.PeriodType type = org.joda.time.PeriodType.cMillis;
		if (type == null) {
			type = new org.joda.time.PeriodType("Millis", new org.joda.time.DurationFieldType[]{ org.joda.time.DurationFieldType.millis() }, new int[]{ -1 , -1 , -1 , -1 , -1 , -1 , -1 , 0 });
			org.joda.time.PeriodType.cMillis = type;
		}
		return type;
	}

	public static synchronized org.joda.time.PeriodType forFields(org.joda.time.DurationFieldType[] types) {
		if ((types == null) || ((types.length) == 0)) {
			throw new java.lang.IllegalArgumentException("Types array must not be null or empty");
		}
		for (int i = 0; i < (types.length); i++) {
			if ((types[i]) == null) {
				throw new java.lang.IllegalArgumentException("Types array must not contain null");
			}
		}
		java.util.Map<org.joda.time.PeriodType, java.lang.Object> cache = org.joda.time.PeriodType.cTypes;
		if (cache.isEmpty()) {
			cache.put(org.joda.time.PeriodType.standard(), org.joda.time.PeriodType.standard());
			cache.put(org.joda.time.PeriodType.yearMonthDayTime(), org.joda.time.PeriodType.yearMonthDayTime());
			cache.put(org.joda.time.PeriodType.yearMonthDay(), org.joda.time.PeriodType.yearMonthDay());
			cache.put(org.joda.time.PeriodType.yearWeekDayTime(), org.joda.time.PeriodType.yearWeekDayTime());
			cache.put(org.joda.time.PeriodType.yearWeekDay(), org.joda.time.PeriodType.yearWeekDay());
			cache.put(org.joda.time.PeriodType.yearDayTime(), org.joda.time.PeriodType.yearDayTime());
			cache.put(org.joda.time.PeriodType.yearDay(), org.joda.time.PeriodType.yearDay());
			cache.put(org.joda.time.PeriodType.dayTime(), org.joda.time.PeriodType.dayTime());
			cache.put(org.joda.time.PeriodType.time(), org.joda.time.PeriodType.time());
			cache.put(org.joda.time.PeriodType.years(), org.joda.time.PeriodType.years());
			cache.put(org.joda.time.PeriodType.months(), org.joda.time.PeriodType.months());
			cache.put(org.joda.time.PeriodType.weeks(), org.joda.time.PeriodType.weeks());
			cache.put(org.joda.time.PeriodType.days(), org.joda.time.PeriodType.days());
			cache.put(org.joda.time.PeriodType.hours(), org.joda.time.PeriodType.hours());
			cache.put(org.joda.time.PeriodType.minutes(), org.joda.time.PeriodType.minutes());
			cache.put(org.joda.time.PeriodType.seconds(), org.joda.time.PeriodType.seconds());
			cache.put(org.joda.time.PeriodType.millis(), org.joda.time.PeriodType.millis());
		}
		org.joda.time.PeriodType inPartType = new org.joda.time.PeriodType(null, types, null);
		java.lang.Object cached = cache.get(inPartType);
		if (cached instanceof org.joda.time.PeriodType) {
			return ((org.joda.time.PeriodType) (cached));
		}
		if (cached != null) {
			throw new java.lang.IllegalArgumentException(("PeriodType does not support fields: " + cached));
		}
		org.joda.time.PeriodType type = org.joda.time.PeriodType.standard();
		java.util.List<org.joda.time.DurationFieldType> list = new java.util.ArrayList<org.joda.time.DurationFieldType>(java.util.Arrays.asList(types));
		if ((list.remove(org.joda.time.DurationFieldType.years())) == false) {
			type = type.withYearsRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.months())) == false) {
			type = type.withMonthsRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.weeks())) == false) {
			type = type.withWeeksRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.days())) == false) {
			type = type.withDaysRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.hours())) == false) {
			type = type.withHoursRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.minutes())) == false) {
			type = type.withMinutesRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.seconds())) == false) {
			type = type.withSecondsRemoved();
		}
		if ((list.remove(org.joda.time.DurationFieldType.millis())) == false) {
			type = type.withMillisRemoved();
		}
		if ((list.size()) > 0) {
			cache.put(inPartType, list);
			throw new java.lang.IllegalArgumentException(("PeriodType does not support fields: " + list));
		}
		org.joda.time.PeriodType checkPartType = new org.joda.time.PeriodType(null, type.iTypes, null);
		org.joda.time.PeriodType checkedType = ((org.joda.time.PeriodType) (cache.get(checkPartType)));
		if (checkedType != null) {
			cache.put(inPartType, checkedType);
			return checkedType;
		}
		cache.put(inPartType, type);
		return type;
	}

	private final java.lang.String iName;

	private final org.joda.time.DurationFieldType[] iTypes;

	private final int[] iIndices;

	protected PeriodType(java.lang.String name, org.joda.time.DurationFieldType[] types, int[] indices) {
		super();
		iName = name;
		iTypes = types;
		iIndices = indices;
	}

	public java.lang.String getName() {
		return iName;
	}

	public int size() {
		return iTypes.length;
	}

	public org.joda.time.DurationFieldType getFieldType(int index) {
		return iTypes[index];
	}

	public boolean isSupported(org.joda.time.DurationFieldType type) {
		return (indexOf(type)) >= 0;
	}

	public int indexOf(org.joda.time.DurationFieldType type) {
		for (int i = 0, isize = size(); i < isize; i++) {
			if ((iTypes[i]) == type) {
				return i;
			}
		}
		return -1;
	}

	public java.lang.String toString() {
		return ("PeriodType[" + (getName())) + "]";
	}

	int getIndexedField(org.joda.time.ReadablePeriod period, int index) {
		int realIndex = iIndices[index];
		return realIndex == (-1) ? 0 : period.getValue(realIndex);
	}

	boolean setIndexedField(org.joda.time.ReadablePeriod period, int index, int[] values, int newValue) {
		int realIndex = iIndices[index];
		if (realIndex == (-1)) {
			throw new java.lang.UnsupportedOperationException("Field is not supported");
		}
		values[realIndex] = newValue;
		return true;
	}

	boolean addIndexedField(org.joda.time.ReadablePeriod period, int index, int[] values, int valueToAdd) {
		if (valueToAdd == 0) {
			return false;
		}
		int realIndex = iIndices[index];
		if (realIndex == (-1)) {
			throw new java.lang.UnsupportedOperationException("Field is not supported");
		}
		values[realIndex] = org.joda.time.field.FieldUtils.safeAdd(values[realIndex], valueToAdd);
		return true;
	}

	public org.joda.time.PeriodType withYearsRemoved() {
		return withFieldRemoved(0, "NoYears");
	}

	public org.joda.time.PeriodType withMonthsRemoved() {
		return withFieldRemoved(1, "NoMonths");
	}

	public org.joda.time.PeriodType withWeeksRemoved() {
		return withFieldRemoved(2, "NoWeeks");
	}

	public org.joda.time.PeriodType withDaysRemoved() {
		return withFieldRemoved(3, "NoDays");
	}

	public org.joda.time.PeriodType withHoursRemoved() {
		return withFieldRemoved(4, "NoHours");
	}

	public org.joda.time.PeriodType withMinutesRemoved() {
		return withFieldRemoved(5, "NoMinutes");
	}

	public org.joda.time.PeriodType withSecondsRemoved() {
		return withFieldRemoved(6, "NoSeconds");
	}

	public org.joda.time.PeriodType withMillisRemoved() {
		return withFieldRemoved(7, "NoMillis");
	}

	private org.joda.time.PeriodType withFieldRemoved(int indicesIndex, java.lang.String name) {
		int fieldIndex = iIndices[indicesIndex];
		if (fieldIndex == (-1)) {
			return org.joda.time.PeriodType.this;
		}
		org.joda.time.DurationFieldType[] types = new org.joda.time.DurationFieldType[(size()) - 1];
		for (int i = 0; i < (iTypes.length); i++) {
			if (i < fieldIndex) {
				types[i] = iTypes[i];
			}else
				if (i > fieldIndex) {
					types[(i - 1)] = iTypes[i];
				}
			
		}
		int[] indices = new int[8];
		for (int i = 0; i < (indices.length); i++) {
			if (i < indicesIndex) {
				indices[i] = iIndices[i];
			}else
				if (i > indicesIndex) {
					indices[i] = ((iIndices[i]) == (-1)) ? -1 : (iIndices[i]) - 1;
				}else {
					indices[i] = -1;
				}
			
		}
		return new org.joda.time.PeriodType(((getName()) + name), types, indices);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.joda.time.PeriodType.this) == obj) {
			return true;
		}
		if ((obj instanceof org.joda.time.PeriodType) == false) {
			return false;
		}
		org.joda.time.PeriodType other = ((org.joda.time.PeriodType) (obj));
		return java.util.Arrays.equals(iTypes, other.iTypes);
	}

	public int hashCode() {
		int hash = 0;
		for (int i = 0; i < (iTypes.length); i++) {
			hash += iTypes[i].hashCode();
		}
		return hash;
	}
}


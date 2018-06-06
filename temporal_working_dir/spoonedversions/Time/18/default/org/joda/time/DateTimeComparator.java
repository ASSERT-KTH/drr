

package org.joda.time;


public class DateTimeComparator implements java.io.Serializable , java.util.Comparator<java.lang.Object> {
	private static final long serialVersionUID = -6097339773320178364L;

	private static final org.joda.time.DateTimeComparator ALL_INSTANCE = new org.joda.time.DateTimeComparator(null, null);

	private static final org.joda.time.DateTimeComparator DATE_INSTANCE = new org.joda.time.DateTimeComparator(org.joda.time.DateTimeFieldType.dayOfYear(), null);

	private static final org.joda.time.DateTimeComparator TIME_INSTANCE = new org.joda.time.DateTimeComparator(null, org.joda.time.DateTimeFieldType.dayOfYear());

	private final org.joda.time.DateTimeFieldType iLowerLimit;

	private final org.joda.time.DateTimeFieldType iUpperLimit;

	public static org.joda.time.DateTimeComparator getInstance() {
		return org.joda.time.DateTimeComparator.ALL_INSTANCE;
	}

	public static org.joda.time.DateTimeComparator getInstance(org.joda.time.DateTimeFieldType lowerLimit) {
		return org.joda.time.DateTimeComparator.getInstance(lowerLimit, null);
	}

	public static org.joda.time.DateTimeComparator getInstance(org.joda.time.DateTimeFieldType lowerLimit, org.joda.time.DateTimeFieldType upperLimit) {
		if ((lowerLimit == null) && (upperLimit == null)) {
			return org.joda.time.DateTimeComparator.ALL_INSTANCE;
		}
		if ((lowerLimit == (org.joda.time.DateTimeFieldType.dayOfYear())) && (upperLimit == null)) {
			return org.joda.time.DateTimeComparator.DATE_INSTANCE;
		}
		if ((lowerLimit == null) && (upperLimit == (org.joda.time.DateTimeFieldType.dayOfYear()))) {
			return org.joda.time.DateTimeComparator.TIME_INSTANCE;
		}
		return new org.joda.time.DateTimeComparator(lowerLimit, upperLimit);
	}

	public static org.joda.time.DateTimeComparator getDateOnlyInstance() {
		return org.joda.time.DateTimeComparator.DATE_INSTANCE;
	}

	public static org.joda.time.DateTimeComparator getTimeOnlyInstance() {
		return org.joda.time.DateTimeComparator.TIME_INSTANCE;
	}

	protected DateTimeComparator(org.joda.time.DateTimeFieldType lowerLimit, org.joda.time.DateTimeFieldType upperLimit) {
		super();
		iLowerLimit = lowerLimit;
		iUpperLimit = upperLimit;
	}

	public org.joda.time.DateTimeFieldType getLowerLimit() {
		return iLowerLimit;
	}

	public org.joda.time.DateTimeFieldType getUpperLimit() {
		return iUpperLimit;
	}

	public int compare(java.lang.Object lhsObj, java.lang.Object rhsObj) {
		org.joda.time.convert.InstantConverter conv = org.joda.time.convert.ConverterManager.getInstance().getInstantConverter(lhsObj);
		org.joda.time.Chronology lhsChrono = conv.getChronology(lhsObj, ((org.joda.time.Chronology) (null)));
		long lhsMillis = conv.getInstantMillis(lhsObj, lhsChrono);
		conv = org.joda.time.convert.ConverterManager.getInstance().getInstantConverter(rhsObj);
		org.joda.time.Chronology rhsChrono = conv.getChronology(rhsObj, ((org.joda.time.Chronology) (null)));
		long rhsMillis = conv.getInstantMillis(rhsObj, rhsChrono);
		if ((iLowerLimit) != null) {
			lhsMillis = iLowerLimit.getField(lhsChrono).roundFloor(lhsMillis);
			rhsMillis = iLowerLimit.getField(rhsChrono).roundFloor(rhsMillis);
		}
		if ((iUpperLimit) != null) {
			lhsMillis = iUpperLimit.getField(lhsChrono).remainder(lhsMillis);
			rhsMillis = iUpperLimit.getField(rhsChrono).remainder(rhsMillis);
		}
		if (lhsMillis < rhsMillis) {
			return -1;
		}else
			if (lhsMillis > rhsMillis) {
				return 1;
			}else {
				return 0;
			}
		
	}

	private java.lang.Object readResolve() {
		return org.joda.time.DateTimeComparator.getInstance(iLowerLimit, iUpperLimit);
	}

	public boolean equals(java.lang.Object object) {
		if (object instanceof org.joda.time.DateTimeComparator) {
			org.joda.time.DateTimeComparator other = ((org.joda.time.DateTimeComparator) (object));
			return (((iLowerLimit) == (other.getLowerLimit())) || (((iLowerLimit) != null) && (iLowerLimit.equals(other.getLowerLimit())))) && (((iUpperLimit) == (other.getUpperLimit())) || (((iUpperLimit) != null) && (iUpperLimit.equals(other.getUpperLimit()))));
		}
		return false;
	}

	public int hashCode() {
		return ((iLowerLimit) == null ? 0 : iLowerLimit.hashCode()) + (123 * ((iUpperLimit) == null ? 0 : iUpperLimit.hashCode()));
	}

	public java.lang.String toString() {
		if ((iLowerLimit) == (iUpperLimit)) {
			return ("DateTimeComparator[" + ((iLowerLimit) == null ? "" : iLowerLimit.getName())) + "]";
		}else {
			return ((("DateTimeComparator[" + ((iLowerLimit) == null ? "" : iLowerLimit.getName())) + "-") + ((iUpperLimit) == null ? "" : iUpperLimit.getName())) + "]";
		}
	}
}


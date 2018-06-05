

package org.joda.time.format;


public class DateTimeParserBucket {
	private final org.joda.time.Chronology iChrono;

	private final long iMillis;

	private org.joda.time.DateTimeZone iZone;

	private int iOffset;

	private java.util.Locale iLocale;

	private java.lang.Integer iPivotYear;

	private org.joda.time.format.DateTimeParserBucket.SavedField[] iSavedFields = new org.joda.time.format.DateTimeParserBucket.SavedField[8];

	private int iSavedFieldsCount;

	private boolean iSavedFieldsShared;

	private java.lang.Object iSavedState;

	public DateTimeParserBucket(long instantLocal, org.joda.time.Chronology chrono, java.util.Locale locale) {
		this(instantLocal, chrono, locale, null);
	}

	public DateTimeParserBucket(long instantLocal, org.joda.time.Chronology chrono, java.util.Locale locale, java.lang.Integer pivotYear) {
		super();
		chrono = org.joda.time.DateTimeUtils.getChronology(chrono);
		iMillis = instantLocal;
		iChrono = chrono.withUTC();
		iLocale = (locale == null) ? java.util.Locale.getDefault() : locale;
		setZone(chrono.getZone());
		iPivotYear = pivotYear;
	}

	public org.joda.time.Chronology getChronology() {
		return iChrono;
	}

	public java.util.Locale getLocale() {
		return iLocale;
	}

	public org.joda.time.DateTimeZone getZone() {
		return iZone;
	}

	public void setZone(org.joda.time.DateTimeZone zone) {
		iSavedState = null;
		iZone = (zone == (org.joda.time.DateTimeZone.UTC)) ? null : zone;
		iOffset = 0;
	}

	public int getOffset() {
		return iOffset;
	}

	public void setOffset(int offset) {
		iSavedState = null;
		iOffset = offset;
		iZone = null;
	}

	public java.lang.Integer getPivotYear() {
		return iPivotYear;
	}

	public void setPivotYear(java.lang.Integer pivotYear) {
		iPivotYear = pivotYear;
	}

	public void saveField(org.joda.time.DateTimeField field, int value) {
		saveField(new org.joda.time.format.DateTimeParserBucket.SavedField(field, value));
	}

	public void saveField(org.joda.time.DateTimeFieldType fieldType, int value) {
		saveField(new org.joda.time.format.DateTimeParserBucket.SavedField(fieldType.getField(iChrono), value));
	}

	public void saveField(org.joda.time.DateTimeFieldType fieldType, java.lang.String text, java.util.Locale locale) {
		saveField(new org.joda.time.format.DateTimeParserBucket.SavedField(fieldType.getField(iChrono), text, locale));
	}

	private void saveField(org.joda.time.format.DateTimeParserBucket.SavedField field) {
		org.joda.time.format.DateTimeParserBucket.SavedField[] savedFields = iSavedFields;
		int savedFieldsCount = iSavedFieldsCount;
		if ((savedFieldsCount == (savedFields.length)) || (iSavedFieldsShared)) {
			org.joda.time.format.DateTimeParserBucket.SavedField[] newArray = new org.joda.time.format.DateTimeParserBucket.SavedField[savedFieldsCount == (savedFields.length) ? savedFieldsCount * 2 : savedFields.length];
			java.lang.System.arraycopy(savedFields, 0, newArray, 0, savedFieldsCount);
			iSavedFields = savedFields = newArray;
			iSavedFieldsShared = false;
		}
		iSavedState = null;
		savedFields[savedFieldsCount] = field;
		iSavedFieldsCount = savedFieldsCount + 1;
	}

	public java.lang.Object saveState() {
		if ((iSavedState) == null) {
			iSavedState = new org.joda.time.format.DateTimeParserBucket.SavedState();
		}
		return iSavedState;
	}

	public boolean restoreState(java.lang.Object savedState) {
		if (savedState instanceof org.joda.time.format.DateTimeParserBucket.SavedState) {
			if (((org.joda.time.format.DateTimeParserBucket.SavedState) (savedState)).restoreState(org.joda.time.format.DateTimeParserBucket.this)) {
				iSavedState = savedState;
				return true;
			}
		}
		return false;
	}

	public long computeMillis() {
		return computeMillis(false, null);
	}

	public long computeMillis(boolean resetFields) {
		return computeMillis(resetFields, null);
	}

	public long computeMillis(boolean resetFields, java.lang.String text) {
		org.joda.time.format.DateTimeParserBucket.SavedField[] savedFields = iSavedFields;
		int count = iSavedFieldsCount;
		if (iSavedFieldsShared) {
			iSavedFields = savedFields = ((org.joda.time.format.DateTimeParserBucket.SavedField[]) (iSavedFields.clone()));
			iSavedFieldsShared = false;
		}
		org.joda.time.format.DateTimeParserBucket.sort(savedFields, count);
		long millis = iMillis;
		try {
			for (int i = 0; i < count; i++) {
				millis = savedFields[i].set(millis, resetFields);
			}
		} catch (org.joda.time.IllegalFieldValueException e) {
			if (text != null) {
				e.prependMessage((("Cannot parse \"" + text) + '"'));
			}
			throw e;
		}
		if ((iZone) == null) {
			millis -= iOffset;
		}else {
			int offset = iZone.getOffsetFromLocal(millis);
			millis -= offset;
			if (offset != (iZone.getOffset(millis))) {
				java.lang.String message = ("Illegal instant due to time zone offset transition (" + (iZone)) + ')';
				if (text != null) {
					message = (("Cannot parse \"" + text) + "\": ") + message;
				}
				throw new java.lang.IllegalArgumentException(message);
			}
		}
		return millis;
	}

	private static void sort(org.joda.time.format.DateTimeParserBucket.SavedField[] array, int high) {
		if (high > 10) {
			java.util.Arrays.sort(array, 0, high);
		}else {
			for (int i = 0; i < high; i++) {
				for (int j = i; (j > 0) && ((array[(j - 1)].compareTo(array[j])) > 0); j--) {
					org.joda.time.format.DateTimeParserBucket.SavedField t = array[j];
					array[j] = array[(j - 1)];
					array[(j - 1)] = t;
				}
			}
		}
	}

	class SavedState {
		final org.joda.time.DateTimeZone iZone;

		final int iOffset;

		final org.joda.time.format.DateTimeParserBucket.SavedField[] iSavedFields;

		final int iSavedFieldsCount;

		SavedState() {
			this.iZone = org.joda.time.format.DateTimeParserBucket.this.iZone;
			this.iOffset = org.joda.time.format.DateTimeParserBucket.this.iOffset;
			this.iSavedFields = org.joda.time.format.DateTimeParserBucket.this.iSavedFields;
			this.iSavedFieldsCount = org.joda.time.format.DateTimeParserBucket.this.iSavedFieldsCount;
		}

		boolean restoreState(org.joda.time.format.DateTimeParserBucket enclosing) {
			if (enclosing != (org.joda.time.format.DateTimeParserBucket.this)) {
				return false;
			}
			enclosing.iZone = org.joda.time.format.DateTimeParserBucket.SavedState.this.iZone;
			enclosing.iOffset = org.joda.time.format.DateTimeParserBucket.SavedState.this.iOffset;
			enclosing.iSavedFields = org.joda.time.format.DateTimeParserBucket.SavedState.this.iSavedFields;
			if ((org.joda.time.format.DateTimeParserBucket.SavedState.this.iSavedFieldsCount) < (enclosing.iSavedFieldsCount)) {
				enclosing.iSavedFieldsShared = true;
			}
			enclosing.iSavedFieldsCount = org.joda.time.format.DateTimeParserBucket.SavedState.this.iSavedFieldsCount;
			return true;
		}
	}

	static class SavedField implements java.lang.Comparable<org.joda.time.format.DateTimeParserBucket.SavedField> {
		final org.joda.time.DateTimeField iField;

		final int iValue;

		final java.lang.String iText;

		final java.util.Locale iLocale;

		SavedField(org.joda.time.DateTimeField field, int value) {
			iField = field;
			iValue = value;
			iText = null;
			iLocale = null;
		}

		SavedField(org.joda.time.DateTimeField field, java.lang.String text, java.util.Locale locale) {
			iField = field;
			iValue = 0;
			iText = text;
			iLocale = locale;
		}

		long set(long millis, boolean reset) {
			if ((iText) == null) {
				millis = iField.set(millis, iValue);
			}else {
				millis = iField.set(millis, iText, iLocale);
			}
			if (reset) {
				millis = iField.roundFloor(millis);
			}
			return millis;
		}

		public int compareTo(org.joda.time.format.DateTimeParserBucket.SavedField obj) {
			org.joda.time.DateTimeField other = obj.iField;
			int result = compareReverse(iField.getRangeDurationField(), other.getRangeDurationField());
			if (result != 0) {
				return result;
			}
			return compareReverse(iField.getDurationField(), other.getDurationField());
		}

		private int compareReverse(org.joda.time.DurationField a, org.joda.time.DurationField b) {
			if ((a == null) || (!(a.isSupported()))) {
				if ((b == null) || (!(b.isSupported()))) {
					return 0;
				}
				return -1;
			}
			if ((b == null) || (!(b.isSupported()))) {
				return 1;
			}
			return -(a.compareTo(b));
		}
	}
}


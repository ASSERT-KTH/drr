

package org.joda.time;


public class IllegalFieldValueException extends java.lang.IllegalArgumentException {
	private static final long serialVersionUID = 6305711765985447737L;

	private static java.lang.String createMessage(java.lang.String fieldName, java.lang.Number value, java.lang.Number lowerBound, java.lang.Number upperBound, java.lang.String explain) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer().append("Value ").append(value).append(" for ").append(fieldName).append(' ');
		if (lowerBound == null) {
			if (upperBound == null) {
				buf.append("is not supported");
			}else {
				buf.append("must not be larger than ").append(upperBound);
			}
		}else
			if (upperBound == null) {
				buf.append("must not be smaller than ").append(lowerBound);
			}else {
				buf.append("must be in the range [").append(lowerBound).append(',').append(upperBound).append(']');
			}
		
		if (explain != null) {
			buf.append(": ").append(explain);
		}
		return buf.toString();
	}

	private static java.lang.String createMessage(java.lang.String fieldName, java.lang.String value) {
		java.lang.StringBuffer buf = new java.lang.StringBuffer().append("Value ");
		if (value == null) {
			buf.append("null");
		}else {
			buf.append('"');
			buf.append(value);
			buf.append('"');
		}
		buf.append(" for ").append(fieldName).append(' ').append("is not supported");
		return buf.toString();
	}

	private final org.joda.time.DateTimeFieldType iDateTimeFieldType;

	private final org.joda.time.DurationFieldType iDurationFieldType;

	private final java.lang.String iFieldName;

	private final java.lang.Number iNumberValue;

	private final java.lang.String iStringValue;

	private final java.lang.Number iLowerBound;

	private final java.lang.Number iUpperBound;

	private java.lang.String iMessage;

	public IllegalFieldValueException(org.joda.time.DateTimeFieldType fieldType, java.lang.Number value, java.lang.Number lowerBound, java.lang.Number upperBound) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldType.getName(), value, lowerBound, upperBound, null));
		iDateTimeFieldType = fieldType;
		iDurationFieldType = null;
		iFieldName = fieldType.getName();
		iNumberValue = value;
		iStringValue = null;
		iLowerBound = lowerBound;
		iUpperBound = upperBound;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(org.joda.time.DateTimeFieldType fieldType, java.lang.Number value, java.lang.String explain) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldType.getName(), value, null, null, explain));
		iDateTimeFieldType = fieldType;
		iDurationFieldType = null;
		iFieldName = fieldType.getName();
		iNumberValue = value;
		iStringValue = null;
		iLowerBound = null;
		iUpperBound = null;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(org.joda.time.DurationFieldType fieldType, java.lang.Number value, java.lang.Number lowerBound, java.lang.Number upperBound) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldType.getName(), value, lowerBound, upperBound, null));
		iDateTimeFieldType = null;
		iDurationFieldType = fieldType;
		iFieldName = fieldType.getName();
		iNumberValue = value;
		iStringValue = null;
		iLowerBound = lowerBound;
		iUpperBound = upperBound;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(java.lang.String fieldName, java.lang.Number value, java.lang.Number lowerBound, java.lang.Number upperBound) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldName, value, lowerBound, upperBound, null));
		iDateTimeFieldType = null;
		iDurationFieldType = null;
		iFieldName = fieldName;
		iNumberValue = value;
		iStringValue = null;
		iLowerBound = lowerBound;
		iUpperBound = upperBound;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(org.joda.time.DateTimeFieldType fieldType, java.lang.String value) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldType.getName(), value));
		iDateTimeFieldType = fieldType;
		iDurationFieldType = null;
		iFieldName = fieldType.getName();
		iStringValue = value;
		iNumberValue = null;
		iLowerBound = null;
		iUpperBound = null;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(org.joda.time.DurationFieldType fieldType, java.lang.String value) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldType.getName(), value));
		iDateTimeFieldType = null;
		iDurationFieldType = fieldType;
		iFieldName = fieldType.getName();
		iStringValue = value;
		iNumberValue = null;
		iLowerBound = null;
		iUpperBound = null;
		iMessage = super.getMessage();
	}

	public IllegalFieldValueException(java.lang.String fieldName, java.lang.String value) {
		super(org.joda.time.IllegalFieldValueException.createMessage(fieldName, value));
		iDateTimeFieldType = null;
		iDurationFieldType = null;
		iFieldName = fieldName;
		iStringValue = value;
		iNumberValue = null;
		iLowerBound = null;
		iUpperBound = null;
		iMessage = super.getMessage();
	}

	public org.joda.time.DateTimeFieldType getDateTimeFieldType() {
		return iDateTimeFieldType;
	}

	public org.joda.time.DurationFieldType getDurationFieldType() {
		return iDurationFieldType;
	}

	public java.lang.String getFieldName() {
		return iFieldName;
	}

	public java.lang.Number getIllegalNumberValue() {
		return iNumberValue;
	}

	public java.lang.String getIllegalStringValue() {
		return iStringValue;
	}

	public java.lang.String getIllegalValueAsString() {
		java.lang.String value = iStringValue;
		if (value == null) {
			value = java.lang.String.valueOf(iNumberValue);
		}
		return value;
	}

	public java.lang.Number getLowerBound() {
		return iLowerBound;
	}

	public java.lang.Number getUpperBound() {
		return iUpperBound;
	}

	public java.lang.String getMessage() {
		return iMessage;
	}

	public void prependMessage(java.lang.String message) {
		if ((iMessage) == null) {
			iMessage = message;
		}else
			if (message != null) {
				iMessage = (message + ": ") + (iMessage);
			}
		
	}
}


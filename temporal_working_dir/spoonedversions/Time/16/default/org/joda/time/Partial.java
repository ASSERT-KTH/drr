

package org.joda.time;


public final class Partial extends org.joda.time.base.AbstractPartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 12324121189002L;

	private final org.joda.time.Chronology iChronology;

	private final org.joda.time.DateTimeFieldType[] iTypes;

	private final int[] iValues;

	private transient org.joda.time.format.DateTimeFormatter[] iFormatter;

	public Partial() {
		this(((org.joda.time.Chronology) (null)));
	}

	public Partial(org.joda.time.Chronology chrono) {
		super();
		iChronology = org.joda.time.DateTimeUtils.getChronology(chrono).withUTC();
		iTypes = new org.joda.time.DateTimeFieldType[0];
		iValues = new int[0];
	}

	public Partial(org.joda.time.DateTimeFieldType type, int value) {
		this(type, value, null);
	}

	public Partial(org.joda.time.DateTimeFieldType type, int value, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology).withUTC();
		iChronology = chronology;
		if (type == null) {
			throw new java.lang.IllegalArgumentException("The field type must not be null");
		}
		iTypes = new org.joda.time.DateTimeFieldType[]{ type };
		iValues = new int[]{ value };
		chronology.validate(org.joda.time.Partial.this, iValues);
	}

	public Partial(org.joda.time.DateTimeFieldType[] types, int[] values) {
		this(types, values, null);
	}

	public Partial(org.joda.time.DateTimeFieldType[] types, int[] values, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology).withUTC();
		iChronology = chronology;
		if (types == null) {
			throw new java.lang.IllegalArgumentException("Types array must not be null");
		}
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Values array must not be null");
		}
		if ((values.length) != (types.length)) {
			throw new java.lang.IllegalArgumentException("Values array must be the same length as the types array");
		}
		if ((types.length) == 0) {
			iTypes = types;
			iValues = values;
			return ;
		}
		for (int i = 0; i < (types.length); i++) {
			if ((types[i]) == null) {
				throw new java.lang.IllegalArgumentException(("Types array must not contain null: index " + i));
			}
		}
		org.joda.time.DurationField lastUnitField = null;
		for (int i = 0; i < (types.length); i++) {
			org.joda.time.DateTimeFieldType loopType = types[i];
			org.joda.time.DurationField loopUnitField = loopType.getDurationType().getField(iChronology);
			if (i > 0) {
				int compare = lastUnitField.compareTo(loopUnitField);
				if ((compare < 0) || ((compare != 0) && ((loopUnitField.isSupported()) == false))) {
					throw new java.lang.IllegalArgumentException(((("Types array must be in order largest-smallest: " + (types[(i - 1)].getName())) + " < ") + (loopType.getName())));
				}else
					if (compare == 0) {
						if ((types[(i - 1)].getRangeDurationType()) == null) {
							if ((loopType.getRangeDurationType()) == null) {
								throw new java.lang.IllegalArgumentException(("Types array must not contain duplicate: " + (loopType.getName())));
							}
						}else {
							if ((loopType.getRangeDurationType()) == null) {
								throw new java.lang.IllegalArgumentException(((("Types array must be in order largest-smallest: " + (types[(i - 1)].getName())) + " < ") + (loopType.getName())));
							}
							org.joda.time.DurationField lastRangeField = types[(i - 1)].getRangeDurationType().getField(iChronology);
							org.joda.time.DurationField loopRangeField = loopType.getRangeDurationType().getField(iChronology);
							if ((lastRangeField.compareTo(loopRangeField)) < 0) {
								throw new java.lang.IllegalArgumentException(((("Types array must be in order largest-smallest: " + (types[(i - 1)].getName())) + " < ") + (loopType.getName())));
							}
							if ((lastRangeField.compareTo(loopRangeField)) == 0) {
								throw new java.lang.IllegalArgumentException(("Types array must not contain duplicate: " + (loopType.getName())));
							}
						}
					}
				
			}
			lastUnitField = loopUnitField;
		}
		iTypes = ((org.joda.time.DateTimeFieldType[]) (types.clone()));
		chronology.validate(org.joda.time.Partial.this, values);
		iValues = ((int[]) (values.clone()));
	}

	public Partial(org.joda.time.ReadablePartial partial) {
		super();
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("The partial must not be null");
		}
		iChronology = org.joda.time.DateTimeUtils.getChronology(partial.getChronology()).withUTC();
		iTypes = new org.joda.time.DateTimeFieldType[partial.size()];
		iValues = new int[partial.size()];
		for (int i = 0; i < (partial.size()); i++) {
			iTypes[i] = partial.getFieldType(i);
			iValues[i] = partial.getValue(i);
		}
	}

	Partial(org.joda.time.Partial partial, int[] values) {
		super();
		iChronology = partial.iChronology;
		iTypes = partial.iTypes;
		iValues = values;
	}

	Partial(org.joda.time.Chronology chronology, org.joda.time.DateTimeFieldType[] types, int[] values) {
		super();
		iChronology = chronology;
		iTypes = types;
		iValues = values;
	}

	public int size() {
		return iTypes.length;
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	protected org.joda.time.DateTimeField getField(int index, org.joda.time.Chronology chrono) {
		return iTypes[index].getField(chrono);
	}

	public org.joda.time.DateTimeFieldType getFieldType(int index) {
		return iTypes[index];
	}

	public org.joda.time.DateTimeFieldType[] getFieldTypes() {
		return ((org.joda.time.DateTimeFieldType[]) (iTypes.clone()));
	}

	public int getValue(int index) {
		return iValues[index];
	}

	public int[] getValues() {
		return ((int[]) (iValues.clone()));
	}

	public org.joda.time.Partial withChronologyRetainFields(org.joda.time.Chronology newChronology) {
		newChronology = org.joda.time.DateTimeUtils.getChronology(newChronology);
		newChronology = newChronology.withUTC();
		if (newChronology == (getChronology())) {
			return org.joda.time.Partial.this;
		}else {
			org.joda.time.Partial newPartial = new org.joda.time.Partial(newChronology, iTypes, iValues);
			newChronology.validate(newPartial, iValues);
			return newPartial;
		}
	}

	public org.joda.time.Partial with(org.joda.time.DateTimeFieldType fieldType, int value) {
		if (fieldType == null) {
			throw new java.lang.IllegalArgumentException("The field type must not be null");
		}
		int index = indexOf(fieldType);
		if (index == (-1)) {
			org.joda.time.DateTimeFieldType[] newTypes = new org.joda.time.DateTimeFieldType[(iTypes.length) + 1];
			int[] newValues = new int[newTypes.length];
			int i = 0;
			org.joda.time.DurationField unitField = fieldType.getDurationType().getField(iChronology);
			if (unitField.isSupported()) {
				for (; i < (iTypes.length); i++) {
					org.joda.time.DateTimeFieldType loopType = iTypes[i];
					org.joda.time.DurationField loopUnitField = loopType.getDurationType().getField(iChronology);
					if (loopUnitField.isSupported()) {
						int compare = unitField.compareTo(loopUnitField);
						if (compare > 0) {
							break;
						}else
							if (compare == 0) {
								org.joda.time.DurationField rangeField = fieldType.getRangeDurationType().getField(iChronology);
								org.joda.time.DurationField loopRangeField = loopType.getRangeDurationType().getField(iChronology);
								if ((rangeField.compareTo(loopRangeField)) > 0) {
									break;
								}
							}
						
					}
				}
			}
			java.lang.System.arraycopy(iTypes, 0, newTypes, 0, i);
			java.lang.System.arraycopy(iValues, 0, newValues, 0, i);
			newTypes[i] = fieldType;
			newValues[i] = value;
			java.lang.System.arraycopy(iTypes, i, newTypes, (i + 1), (((newTypes.length) - i) - 1));
			java.lang.System.arraycopy(iValues, i, newValues, (i + 1), (((newValues.length) - i) - 1));
			org.joda.time.Partial newPartial = new org.joda.time.Partial(iChronology, newTypes, newValues);
			iChronology.validate(newPartial, newValues);
			return newPartial;
		}
		if (value == (getValue(index))) {
			return org.joda.time.Partial.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.Partial.this, index, newValues, value);
		return new org.joda.time.Partial(org.joda.time.Partial.this, newValues);
	}

	public org.joda.time.Partial without(org.joda.time.DateTimeFieldType fieldType) {
		int index = indexOf(fieldType);
		if (index != (-1)) {
			org.joda.time.DateTimeFieldType[] newTypes = new org.joda.time.DateTimeFieldType[(size()) - 1];
			int[] newValues = new int[(size()) - 1];
			java.lang.System.arraycopy(iTypes, 0, newTypes, 0, index);
			java.lang.System.arraycopy(iTypes, (index + 1), newTypes, index, ((newTypes.length) - index));
			java.lang.System.arraycopy(iValues, 0, newValues, 0, index);
			java.lang.System.arraycopy(iValues, (index + 1), newValues, index, ((newValues.length) - index));
			org.joda.time.Partial newPartial = new org.joda.time.Partial(iChronology, newTypes, newValues);
			iChronology.validate(newPartial, newValues);
			return newPartial;
		}
		return org.joda.time.Partial.this;
	}

	public org.joda.time.Partial withField(org.joda.time.DateTimeFieldType fieldType, int value) {
		int index = indexOfSupported(fieldType);
		if (value == (getValue(index))) {
			return org.joda.time.Partial.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).set(org.joda.time.Partial.this, index, newValues, value);
		return new org.joda.time.Partial(org.joda.time.Partial.this, newValues);
	}

	public org.joda.time.Partial withFieldAdded(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.Partial.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).add(org.joda.time.Partial.this, index, newValues, amount);
		return new org.joda.time.Partial(org.joda.time.Partial.this, newValues);
	}

	public org.joda.time.Partial withFieldAddWrapped(org.joda.time.DurationFieldType fieldType, int amount) {
		int index = indexOfSupported(fieldType);
		if (amount == 0) {
			return org.joda.time.Partial.this;
		}
		int[] newValues = getValues();
		newValues = getField(index).addWrapPartial(org.joda.time.Partial.this, index, newValues, amount);
		return new org.joda.time.Partial(org.joda.time.Partial.this, newValues);
	}

	public org.joda.time.Partial withPeriodAdded(org.joda.time.ReadablePeriod period, int scalar) {
		if ((period == null) || (scalar == 0)) {
			return org.joda.time.Partial.this;
		}
		int[] newValues = getValues();
		for (int i = 0; i < (period.size()); i++) {
			org.joda.time.DurationFieldType fieldType = period.getFieldType(i);
			int index = indexOf(fieldType);
			if (index >= 0) {
				newValues = getField(index).add(org.joda.time.Partial.this, index, newValues, org.joda.time.field.FieldUtils.safeMultiply(period.getValue(i), scalar));
			}
		}
		return new org.joda.time.Partial(org.joda.time.Partial.this, newValues);
	}

	public org.joda.time.Partial plus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, 1);
	}

	public org.joda.time.Partial minus(org.joda.time.ReadablePeriod period) {
		return withPeriodAdded(period, (-1));
	}

	public org.joda.time.Partial.Property property(org.joda.time.DateTimeFieldType type) {
		return new org.joda.time.Partial.Property(org.joda.time.Partial.this, indexOfSupported(type));
	}

	public boolean isMatch(org.joda.time.ReadableInstant instant) {
		long millis = org.joda.time.DateTimeUtils.getInstantMillis(instant);
		org.joda.time.Chronology chrono = org.joda.time.DateTimeUtils.getInstantChronology(instant);
		for (int i = 0; i < (iTypes.length); i++) {
			int value = iTypes[i].getField(chrono).get(millis);
			if (value != (iValues[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean isMatch(org.joda.time.ReadablePartial partial) {
		if (partial == null) {
			throw new java.lang.IllegalArgumentException("The partial must not be null");
		}
		for (int i = 0; i < (iTypes.length); i++) {
			int value = partial.get(iTypes[i]);
			if (value != (iValues[i])) {
				return false;
			}
		}
		return true;
	}

	public org.joda.time.format.DateTimeFormatter getFormatter() {
		org.joda.time.format.DateTimeFormatter[] f = iFormatter;
		if (f == null) {
			if ((size()) == 0) {
				return null;
			}
			f = new org.joda.time.format.DateTimeFormatter[2];
			try {
				java.util.List<org.joda.time.DateTimeFieldType> list = new java.util.ArrayList<org.joda.time.DateTimeFieldType>(java.util.Arrays.asList(iTypes));
				f[0] = org.joda.time.format.ISODateTimeFormat.forFields(list, true, false);
				if ((list.size()) == 0) {
					f[1] = f[0];
				}
			} catch (java.lang.IllegalArgumentException ex) {
			}
			iFormatter = f;
		}
		return f[0];
	}

	public java.lang.String toString() {
		org.joda.time.format.DateTimeFormatter[] f = iFormatter;
		if (f == null) {
			getFormatter();
			f = iFormatter;
			if (f == null) {
				return toStringList();
			}
		}
		org.joda.time.format.DateTimeFormatter f1 = f[1];
		if (f1 == null) {
			return toStringList();
		}
		return f1.print(org.joda.time.Partial.this);
	}

	public java.lang.String toStringList() {
		int size = size();
		java.lang.StringBuffer buf = new java.lang.StringBuffer((20 * size));
		buf.append('[');
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				buf.append(',').append(' ');
			}
			buf.append(iTypes[i].getName());
			buf.append('=');
			buf.append(iValues[i]);
		}
		buf.append(']');
		return buf.toString();
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.Partial.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.Partial.this);
	}

	public static class Property extends org.joda.time.field.AbstractPartialFieldProperty implements java.io.Serializable {
		private static final long serialVersionUID = 53278362873888L;

		private final org.joda.time.Partial iPartial;

		private final int iFieldIndex;

		Property(org.joda.time.Partial partial, int fieldIndex) {
			super();
			iPartial = partial;
			iFieldIndex = fieldIndex;
		}

		public org.joda.time.DateTimeField getField() {
			return iPartial.getField(iFieldIndex);
		}

		protected org.joda.time.ReadablePartial getReadablePartial() {
			return iPartial;
		}

		public org.joda.time.Partial getPartial() {
			return iPartial;
		}

		public int get() {
			return iPartial.getValue(iFieldIndex);
		}

		public org.joda.time.Partial addToCopy(int valueToAdd) {
			int[] newValues = iPartial.getValues();
			newValues = getField().add(iPartial, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.Partial(iPartial, newValues);
		}

		public org.joda.time.Partial addWrapFieldToCopy(int valueToAdd) {
			int[] newValues = iPartial.getValues();
			newValues = getField().addWrapField(iPartial, iFieldIndex, newValues, valueToAdd);
			return new org.joda.time.Partial(iPartial, newValues);
		}

		public org.joda.time.Partial setCopy(int value) {
			int[] newValues = iPartial.getValues();
			newValues = getField().set(iPartial, iFieldIndex, newValues, value);
			return new org.joda.time.Partial(iPartial, newValues);
		}

		public org.joda.time.Partial setCopy(java.lang.String text, java.util.Locale locale) {
			int[] newValues = iPartial.getValues();
			newValues = getField().set(iPartial, iFieldIndex, newValues, text, locale);
			return new org.joda.time.Partial(iPartial, newValues);
		}

		public org.joda.time.Partial setCopy(java.lang.String text) {
			return setCopy(text, null);
		}

		public org.joda.time.Partial withMaximumValue() {
			return setCopy(getMaximumValue());
		}

		public org.joda.time.Partial withMinimumValue() {
			return setCopy(getMinimumValue());
		}
	}
}


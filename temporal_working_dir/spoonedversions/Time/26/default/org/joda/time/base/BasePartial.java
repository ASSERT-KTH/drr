

package org.joda.time.base;


public abstract class BasePartial extends org.joda.time.base.AbstractPartial implements java.io.Serializable , org.joda.time.ReadablePartial {
	private static final long serialVersionUID = 2353678632973660L;

	private org.joda.time.Chronology iChronology;

	private int[] iValues;

	protected BasePartial() {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), null);
	}

	protected BasePartial(org.joda.time.Chronology chronology) {
		this(org.joda.time.DateTimeUtils.currentTimeMillis(), chronology);
	}

	protected BasePartial(long instant) {
		this(instant, null);
	}

	protected BasePartial(long instant, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		iValues = chronology.get(org.joda.time.base.BasePartial.this, instant);
	}

	protected BasePartial(java.lang.Object instant, org.joda.time.Chronology chronology) {
		super();
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		chronology = converter.getChronology(instant, chronology);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		iValues = converter.getPartialValues(org.joda.time.base.BasePartial.this, instant, chronology);
	}

	protected BasePartial(java.lang.Object instant, org.joda.time.Chronology chronology, org.joda.time.format.DateTimeFormatter parser) {
		super();
		org.joda.time.convert.PartialConverter converter = org.joda.time.convert.ConverterManager.getInstance().getPartialConverter(instant);
		chronology = converter.getChronology(instant, chronology);
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		iValues = converter.getPartialValues(org.joda.time.base.BasePartial.this, instant, chronology, parser);
	}

	protected BasePartial(int[] values, org.joda.time.Chronology chronology) {
		super();
		chronology = org.joda.time.DateTimeUtils.getChronology(chronology);
		iChronology = chronology.withUTC();
		chronology.validate(org.joda.time.base.BasePartial.this, values);
		iValues = values;
	}

	protected BasePartial(org.joda.time.base.BasePartial base, int[] values) {
		super();
		iChronology = base.iChronology;
		iValues = values;
	}

	protected BasePartial(org.joda.time.base.BasePartial base, org.joda.time.Chronology chrono) {
		super();
		iChronology = chrono.withUTC();
		iValues = base.iValues;
	}

	public int getValue(int index) {
		return iValues[index];
	}

	public int[] getValues() {
		return ((int[]) (iValues.clone()));
	}

	public org.joda.time.Chronology getChronology() {
		return iChronology;
	}

	protected void setValue(int index, int value) {
		org.joda.time.DateTimeField field = getField(index);
		iValues = field.set(org.joda.time.base.BasePartial.this, index, iValues, value);
	}

	protected void setValues(int[] values) {
		getChronology().validate(org.joda.time.base.BasePartial.this, values);
		iValues = values;
	}

	public java.lang.String toString(java.lang.String pattern) {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).print(org.joda.time.base.BasePartial.this);
	}

	public java.lang.String toString(java.lang.String pattern, java.util.Locale locale) throws java.lang.IllegalArgumentException {
		if (pattern == null) {
			return toString();
		}
		return org.joda.time.format.DateTimeFormat.forPattern(pattern).withLocale(locale).print(org.joda.time.base.BasePartial.this);
	}
}


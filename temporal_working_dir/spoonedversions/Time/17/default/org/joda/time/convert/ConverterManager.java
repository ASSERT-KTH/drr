

package org.joda.time.convert;


public final class ConverterManager {
	private static org.joda.time.convert.ConverterManager INSTANCE;

	public static org.joda.time.convert.ConverterManager getInstance() {
		if ((org.joda.time.convert.ConverterManager.INSTANCE) == null) {
			org.joda.time.convert.ConverterManager.INSTANCE = new org.joda.time.convert.ConverterManager();
		}
		return org.joda.time.convert.ConverterManager.INSTANCE;
	}

	private org.joda.time.convert.ConverterSet iInstantConverters;

	private org.joda.time.convert.ConverterSet iPartialConverters;

	private org.joda.time.convert.ConverterSet iDurationConverters;

	private org.joda.time.convert.ConverterSet iPeriodConverters;

	private org.joda.time.convert.ConverterSet iIntervalConverters;

	protected ConverterManager() {
		super();
		iInstantConverters = new org.joda.time.convert.ConverterSet(new org.joda.time.convert.Converter[]{ org.joda.time.convert.ReadableInstantConverter.INSTANCE , org.joda.time.convert.StringConverter.INSTANCE , org.joda.time.convert.CalendarConverter.INSTANCE , org.joda.time.convert.DateConverter.INSTANCE , org.joda.time.convert.LongConverter.INSTANCE , org.joda.time.convert.NullConverter.INSTANCE });
		iPartialConverters = new org.joda.time.convert.ConverterSet(new org.joda.time.convert.Converter[]{ org.joda.time.convert.ReadablePartialConverter.INSTANCE , org.joda.time.convert.ReadableInstantConverter.INSTANCE , org.joda.time.convert.StringConverter.INSTANCE , org.joda.time.convert.CalendarConverter.INSTANCE , org.joda.time.convert.DateConverter.INSTANCE , org.joda.time.convert.LongConverter.INSTANCE , org.joda.time.convert.NullConverter.INSTANCE });
		iDurationConverters = new org.joda.time.convert.ConverterSet(new org.joda.time.convert.Converter[]{ org.joda.time.convert.ReadableDurationConverter.INSTANCE , org.joda.time.convert.ReadableIntervalConverter.INSTANCE , org.joda.time.convert.StringConverter.INSTANCE , org.joda.time.convert.LongConverter.INSTANCE , org.joda.time.convert.NullConverter.INSTANCE });
		iPeriodConverters = new org.joda.time.convert.ConverterSet(new org.joda.time.convert.Converter[]{ org.joda.time.convert.ReadableDurationConverter.INSTANCE , org.joda.time.convert.ReadablePeriodConverter.INSTANCE , org.joda.time.convert.ReadableIntervalConverter.INSTANCE , org.joda.time.convert.StringConverter.INSTANCE , org.joda.time.convert.NullConverter.INSTANCE });
		iIntervalConverters = new org.joda.time.convert.ConverterSet(new org.joda.time.convert.Converter[]{ org.joda.time.convert.ReadableIntervalConverter.INSTANCE , org.joda.time.convert.StringConverter.INSTANCE , org.joda.time.convert.NullConverter.INSTANCE });
	}

	public org.joda.time.convert.InstantConverter getInstantConverter(java.lang.Object object) {
		org.joda.time.convert.InstantConverter converter = ((org.joda.time.convert.InstantConverter) (iInstantConverters.select((object == null ? null : object.getClass()))));
		if (converter != null) {
			return converter;
		}
		throw new java.lang.IllegalArgumentException(("No instant converter found for type: " + (object == null ? "null" : object.getClass().getName())));
	}

	public org.joda.time.convert.InstantConverter[] getInstantConverters() {
		org.joda.time.convert.ConverterSet set = iInstantConverters;
		org.joda.time.convert.InstantConverter[] converters = new org.joda.time.convert.InstantConverter[set.size()];
		set.copyInto(converters);
		return converters;
	}

	public org.joda.time.convert.InstantConverter addInstantConverter(org.joda.time.convert.InstantConverter converter) throws java.lang.SecurityException {
		checkAlterInstantConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.InstantConverter[] removed = new org.joda.time.convert.InstantConverter[1];
		iInstantConverters = iInstantConverters.add(converter, removed);
		return removed[0];
	}

	public org.joda.time.convert.InstantConverter removeInstantConverter(org.joda.time.convert.InstantConverter converter) throws java.lang.SecurityException {
		checkAlterInstantConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.InstantConverter[] removed = new org.joda.time.convert.InstantConverter[1];
		iInstantConverters = iInstantConverters.remove(converter, removed);
		return removed[0];
	}

	private void checkAlterInstantConverters() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("ConverterManager.alterInstantConverters"));
		}
	}

	public org.joda.time.convert.PartialConverter getPartialConverter(java.lang.Object object) {
		org.joda.time.convert.PartialConverter converter = ((org.joda.time.convert.PartialConverter) (iPartialConverters.select((object == null ? null : object.getClass()))));
		if (converter != null) {
			return converter;
		}
		throw new java.lang.IllegalArgumentException(("No partial converter found for type: " + (object == null ? "null" : object.getClass().getName())));
	}

	public org.joda.time.convert.PartialConverter[] getPartialConverters() {
		org.joda.time.convert.ConverterSet set = iPartialConverters;
		org.joda.time.convert.PartialConverter[] converters = new org.joda.time.convert.PartialConverter[set.size()];
		set.copyInto(converters);
		return converters;
	}

	public org.joda.time.convert.PartialConverter addPartialConverter(org.joda.time.convert.PartialConverter converter) throws java.lang.SecurityException {
		checkAlterPartialConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.PartialConverter[] removed = new org.joda.time.convert.PartialConverter[1];
		iPartialConverters = iPartialConverters.add(converter, removed);
		return removed[0];
	}

	public org.joda.time.convert.PartialConverter removePartialConverter(org.joda.time.convert.PartialConverter converter) throws java.lang.SecurityException {
		checkAlterPartialConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.PartialConverter[] removed = new org.joda.time.convert.PartialConverter[1];
		iPartialConverters = iPartialConverters.remove(converter, removed);
		return removed[0];
	}

	private void checkAlterPartialConverters() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("ConverterManager.alterPartialConverters"));
		}
	}

	public org.joda.time.convert.DurationConverter getDurationConverter(java.lang.Object object) {
		org.joda.time.convert.DurationConverter converter = ((org.joda.time.convert.DurationConverter) (iDurationConverters.select((object == null ? null : object.getClass()))));
		if (converter != null) {
			return converter;
		}
		throw new java.lang.IllegalArgumentException(("No duration converter found for type: " + (object == null ? "null" : object.getClass().getName())));
	}

	public org.joda.time.convert.DurationConverter[] getDurationConverters() {
		org.joda.time.convert.ConverterSet set = iDurationConverters;
		org.joda.time.convert.DurationConverter[] converters = new org.joda.time.convert.DurationConverter[set.size()];
		set.copyInto(converters);
		return converters;
	}

	public org.joda.time.convert.DurationConverter addDurationConverter(org.joda.time.convert.DurationConverter converter) throws java.lang.SecurityException {
		checkAlterDurationConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.DurationConverter[] removed = new org.joda.time.convert.DurationConverter[1];
		iDurationConverters = iDurationConverters.add(converter, removed);
		return removed[0];
	}

	public org.joda.time.convert.DurationConverter removeDurationConverter(org.joda.time.convert.DurationConverter converter) throws java.lang.SecurityException {
		checkAlterDurationConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.DurationConverter[] removed = new org.joda.time.convert.DurationConverter[1];
		iDurationConverters = iDurationConverters.remove(converter, removed);
		return removed[0];
	}

	private void checkAlterDurationConverters() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("ConverterManager.alterDurationConverters"));
		}
	}

	public org.joda.time.convert.PeriodConverter getPeriodConverter(java.lang.Object object) {
		org.joda.time.convert.PeriodConverter converter = ((org.joda.time.convert.PeriodConverter) (iPeriodConverters.select((object == null ? null : object.getClass()))));
		if (converter != null) {
			return converter;
		}
		throw new java.lang.IllegalArgumentException(("No period converter found for type: " + (object == null ? "null" : object.getClass().getName())));
	}

	public org.joda.time.convert.PeriodConverter[] getPeriodConverters() {
		org.joda.time.convert.ConverterSet set = iPeriodConverters;
		org.joda.time.convert.PeriodConverter[] converters = new org.joda.time.convert.PeriodConverter[set.size()];
		set.copyInto(converters);
		return converters;
	}

	public org.joda.time.convert.PeriodConverter addPeriodConverter(org.joda.time.convert.PeriodConverter converter) throws java.lang.SecurityException {
		checkAlterPeriodConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.PeriodConverter[] removed = new org.joda.time.convert.PeriodConverter[1];
		iPeriodConverters = iPeriodConverters.add(converter, removed);
		return removed[0];
	}

	public org.joda.time.convert.PeriodConverter removePeriodConverter(org.joda.time.convert.PeriodConverter converter) throws java.lang.SecurityException {
		checkAlterPeriodConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.PeriodConverter[] removed = new org.joda.time.convert.PeriodConverter[1];
		iPeriodConverters = iPeriodConverters.remove(converter, removed);
		return removed[0];
	}

	private void checkAlterPeriodConverters() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("ConverterManager.alterPeriodConverters"));
		}
	}

	public org.joda.time.convert.IntervalConverter getIntervalConverter(java.lang.Object object) {
		org.joda.time.convert.IntervalConverter converter = ((org.joda.time.convert.IntervalConverter) (iIntervalConverters.select((object == null ? null : object.getClass()))));
		if (converter != null) {
			return converter;
		}
		throw new java.lang.IllegalArgumentException(("No interval converter found for type: " + (object == null ? "null" : object.getClass().getName())));
	}

	public org.joda.time.convert.IntervalConverter[] getIntervalConverters() {
		org.joda.time.convert.ConverterSet set = iIntervalConverters;
		org.joda.time.convert.IntervalConverter[] converters = new org.joda.time.convert.IntervalConverter[set.size()];
		set.copyInto(converters);
		return converters;
	}

	public org.joda.time.convert.IntervalConverter addIntervalConverter(org.joda.time.convert.IntervalConverter converter) throws java.lang.SecurityException {
		checkAlterIntervalConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.IntervalConverter[] removed = new org.joda.time.convert.IntervalConverter[1];
		iIntervalConverters = iIntervalConverters.add(converter, removed);
		return removed[0];
	}

	public org.joda.time.convert.IntervalConverter removeIntervalConverter(org.joda.time.convert.IntervalConverter converter) throws java.lang.SecurityException {
		checkAlterIntervalConverters();
		if (converter == null) {
			return null;
		}
		org.joda.time.convert.IntervalConverter[] removed = new org.joda.time.convert.IntervalConverter[1];
		iIntervalConverters = iIntervalConverters.remove(converter, removed);
		return removed[0];
	}

	private void checkAlterIntervalConverters() throws java.lang.SecurityException {
		java.lang.SecurityManager sm = java.lang.System.getSecurityManager();
		if (sm != null) {
			sm.checkPermission(new org.joda.time.JodaTimePermission("ConverterManager.alterIntervalConverters"));
		}
	}

	public java.lang.String toString() {
		return ((((((((("ConverterManager[" + (iInstantConverters.size())) + " instant,") + (iPartialConverters.size())) + " partial,") + (iDurationConverters.size())) + " duration,") + (iPeriodConverters.size())) + " period,") + (iIntervalConverters.size())) + " interval]";
	}
}




package org.joda.time.format;


public class ISOPeriodFormat {
	private static org.joda.time.format.PeriodFormatter cStandard;

	private static org.joda.time.format.PeriodFormatter cAlternate;

	private static org.joda.time.format.PeriodFormatter cAlternateExtended;

	private static org.joda.time.format.PeriodFormatter cAlternateWithWeeks;

	private static org.joda.time.format.PeriodFormatter cAlternateExtendedWihWeeks;

	protected ISOPeriodFormat() {
		super();
	}

	public static org.joda.time.format.PeriodFormatter standard() {
		if ((org.joda.time.format.ISOPeriodFormat.cStandard) == null) {
			org.joda.time.format.ISOPeriodFormat.cStandard = new org.joda.time.format.PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter();
		}
		return org.joda.time.format.ISOPeriodFormat.cStandard;
	}

	public static org.joda.time.format.PeriodFormatter alternate() {
		if ((org.joda.time.format.ISOPeriodFormat.cAlternate) == null) {
			org.joda.time.format.ISOPeriodFormat.cAlternate = new org.joda.time.format.PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
		}
		return org.joda.time.format.ISOPeriodFormat.cAlternate;
	}

	public static org.joda.time.format.PeriodFormatter alternateExtended() {
		if ((org.joda.time.format.ISOPeriodFormat.cAlternateExtended) == null) {
			org.joda.time.format.ISOPeriodFormat.cAlternateExtended = new org.joda.time.format.PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendMonths().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
		}
		return org.joda.time.format.ISOPeriodFormat.cAlternateExtended;
	}

	public static org.joda.time.format.PeriodFormatter alternateWithWeeks() {
		if ((org.joda.time.format.ISOPeriodFormat.cAlternateWithWeeks) == null) {
			org.joda.time.format.ISOPeriodFormat.cAlternateWithWeeks = new org.joda.time.format.PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
		}
		return org.joda.time.format.ISOPeriodFormat.cAlternateWithWeeks;
	}

	public static org.joda.time.format.PeriodFormatter alternateExtendedWithWeeks() {
		if ((org.joda.time.format.ISOPeriodFormat.cAlternateExtendedWihWeeks) == null) {
			org.joda.time.format.ISOPeriodFormat.cAlternateExtendedWihWeeks = new org.joda.time.format.PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
		}
		return org.joda.time.format.ISOPeriodFormat.cAlternateExtendedWihWeeks;
	}
}


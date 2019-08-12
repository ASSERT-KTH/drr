import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.joda.time.Chronology chronology0 = null;
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DurationField durationField1 = null;
        try {
            org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField2 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DurationField durationField1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField4 = new org.joda.time.field.RemainderDateTimeField(dateTimeField0, durationField1, dateTimeFieldType2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Throwable throwable0 = null;
        try {
            boolean boolean1 = org.joda.time.IllegalInstantException.isIllegalInstant(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeField dateTimeField1 = null;
        try {
            org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField2 = new org.joda.time.field.SkipUndoDateTimeField(chronology0, dateTimeField1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = null;
        try {
            org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField4 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray0 = new org.joda.time.DateTimeFieldType[] {};
        java.util.ArrayList<org.joda.time.DateTimeFieldType> dateTimeFieldTypeList1 = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList1, dateTimeFieldTypeArray0);
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fields must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        try {
            org.joda.time.DateTimeField dateTimeField3 = localDate0.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        try {
            org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10.0d, (java.lang.Number) 100.0d, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        try {
            org.joda.time.field.DecoratedDurationField decoratedDurationField4 = new org.joda.time.field.DecoratedDurationField(durationField2, durationFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        try {
            long long10 = buddhistChronology1.getDateTimeMillis(1, (int) (byte) 10, (int) '#', (int) (short) 1, 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.Writer writer0 = null;
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        try {
            org.joda.time.Partial partial5 = partial2.withFieldAdded(durationFieldType3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField2, 0, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.Writer writer0 = null;
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (long) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (org.joda.time.ReadablePartial) partial5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField4 = org.joda.time.field.MillisDurationField.INSTANCE;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField7 = new org.joda.time.field.DividedDateTimeField(dateTimeField3, durationField4, dateTimeFieldType5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        int[] intArray3 = localDate2.getValues();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        try {
            org.joda.time.Partial partial8 = new org.joda.time.Partial(dateTimeFieldTypeArray1, intArray3, (org.joda.time.Chronology) buddhistChronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField9 = new org.joda.time.field.OffsetDateTimeField(dateTimeField4, dateTimeFieldType5, (int) (byte) 0, 62, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = null;
        try {
            org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The MillisProvider must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        try {
            java.lang.String str4 = partial2.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHour();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        int[] intArray3 = localDate2.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str5 = localDate2.toString(dateTimeFormatter4);
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "��:��:��" + "'", str5.equals("��:��:��"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        try {
            long long6 = durationField3.subtract(10L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.Partial partial3 = partial0.withField(dateTimeFieldType1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, dateTimeFieldType1, (int) (byte) 10, 23, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        try {
            long long5 = durationField2.subtract((long) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        try {
            org.joda.time.LocalDate localDate4 = localDate0.withDayOfWeek((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.minuteOfHour();
        try {
            long long9 = buddhistChronology1.getDateTimeMillis(10, 15, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField7 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

//    @Test
//    public void test038() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test038");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        int int8 = dateTime4.getYearOfCentury();
//        try {
//            org.joda.time.DateTime dateTime13 = dateTime4.withTime((int) (short) -1, 0, 1, (int) (byte) 100);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
//    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.ClassLoader classLoader1 = null;
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("15:23:28.966", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"15:23:28.966/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        java.lang.String str6 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate3);
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "��:��:��.000" + "'", str6.equals("��:��:��.000"));
    }

//    @Test
//    public void test041() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test041");
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
//        int[] intArray2 = localDate1.getValues();
//        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
//        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
//        java.lang.String str6 = dateTimeFormatter0.print((long) 100);
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
//        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
//        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
//        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime10);
//        try {
//            org.joda.time.DateTime dateTime13 = dateTime10.withYear((int) (byte) -1);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000-07:52:58 (BuddhistChronology[America/Los_Angeles])");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(dateTimeFormatter0);
//        org.junit.Assert.assertNotNull(intArray2);
//        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "16:00:00.100" + "'", str6.equals("16:00:00.100"));
//        org.junit.Assert.assertNotNull(buddhistChronology8);
//        org.junit.Assert.assertNotNull(durationField9);
//        org.junit.Assert.assertNotNull(dateTime10);
//        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "15:23:29.493" + "'", str11.equals("15:23:29.493"));
//    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        java.lang.String str2 = dateTimeFormatter0.print(0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1970W013" + "'", str2.equals("1970W013"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial0.getFormatter();
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertNull(dateTimeFormatter3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        try {
            int int5 = localDate3.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("1970W013");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970W013\" is malformed at \"W013\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '4', 0, 10, 0, 0, 2562, (org.joda.time.Chronology) julianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2562 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(julianChronology6);
    }

//    @Test
//    public void test048() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test048");
//        org.joda.time.DateTimeZone dateTimeZone6 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology7 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone6);
//        org.joda.time.DateTimeZone dateTimeZone8 = buddhistChronology7.getZone();
//        java.util.Locale locale10 = null;
//        java.lang.String str11 = dateTimeZone8.getName(0L, locale10);
//        try {
//            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(15, (int) (byte) 0, (int) (byte) -1, 19, (int) '#', 10, dateTimeZone8);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology7);
//        org.junit.Assert.assertNotNull(dateTimeZone8);
//        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Pacific Standard Time" + "'", str11.equals("Pacific Standard Time"));
//    }

//    @Test
//    public void test049() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test049");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        int int8 = dateTime4.getYearOfCentury();
//        org.joda.time.DurationFieldType durationFieldType9 = null;
//        try {
//            org.joda.time.DateTime dateTime11 = dateTime4.withFieldAdded(durationFieldType9, 62);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
//    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        try {
            long long11 = buddhistChronology1.getDateTimeMillis((int) (byte) 1, (int) (byte) 0, (int) (short) -1, 0, 15, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        try {
            int int3 = localDate0.get(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2019 + "'", int1 == 2019);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        try {
            java.lang.String str6 = localDate0.toString("Pacific Standard Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset((long) (byte) 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        try {
            org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        try {
            org.joda.time.field.DecoratedDurationField decoratedDurationField5 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

//    @Test
//    public void test056() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test056");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
//        int[] intArray20 = localDate19.getValues();
//        org.joda.time.Partial partial21 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate19);
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = partial21.getFormatter();
//        int[] intArray23 = new int[] {};
//        try {
//            int int24 = skipDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) partial21, intArray23);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertNotNull(intArray20);
//        org.junit.Assert.assertNotNull(dateTimeFormatter22);
//        org.junit.Assert.assertNotNull(intArray23);
//    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Pacific Standard Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Pacific Standard Time\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        java.io.Writer writer1 = null;
        try {
            dateTimeFormatter0.printTo(writer1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withField(dateTimeFieldType7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) (byte) 10, (java.lang.Number) (short) 1, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

//    @Test
//    public void test061() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test061");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        try {
//            java.lang.String str7 = mutableDateTime5.toString("Pacific Standard Time");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.ClassLoader classLoader1 = null;
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("Pacific Standard Time", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"Pacific Standard Time/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.ReadablePartial readablePartial2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        try {
            gJChronology0.validate(readablePartial2, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.time();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial2.getFormatter();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        try {
            org.joda.time.Partial partial6 = partial2.withFieldAdded(durationFieldType4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        try {
            long long9 = buddhistChronology1.getDateTimeMillis((-1L), 10, (int) (short) -1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial2.getFormatter();
        java.util.Locale locale5 = null;
        try {
            java.lang.String str6 = partial2.toString("dayOfYear", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) (byte) 10, "15:23:32.185");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

//    @Test
//    public void test070() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test070");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        long long7 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime6);
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-15573948208434L) + "'", long7 == (-15573948208434L));
//    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.Appendable appendable5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology7 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology7);
        try {
            dateTimeFormatter0.printTo(appendable5, (org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(buddhistChronology7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        org.joda.time.DateTimeField dateTimeField5 = buddhistChronology2.secondOfDay();
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) 365, (org.joda.time.Chronology) buddhistChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("166");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"166\" is malformed at \"6\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

//    @Test
//    public void test075() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test075");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
//        java.util.Locale locale24 = null;
//        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
//        org.joda.time.DurationField durationField26 = org.joda.time.field.MillisDurationField.INSTANCE;
//        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
//        try {
//            org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, durationField26, dateTimeFieldType27, 100);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
//        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
//        org.junit.Assert.assertNotNull(durationField26);
//    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) '4', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-48L) + "'", long2 == (-48L));
    }

//    @Test
//    public void test077() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test077");
//        org.joda.time.DurationFieldType durationFieldType0 = null;
//        try {
//            org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        try {
            org.joda.time.LocalDate.Property property4 = localDate0.property(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = buddhistChronology9.getZone();
        boolean boolean12 = dateTimeZone10.isStandardOffset(10L);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (-1), dateTimeZone10);
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) '4', (int) (byte) 1, (-28800000), (int) (short) -1, (int) (byte) -1, 62, (int) (short) 100, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        int int7 = localDate6.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2019 + "'", int7 == 2019);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException((long) (short) 10, "hi!");
        java.lang.String str3 = illegalInstantException2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.joda.time.IllegalInstantException: Illegal instant due to time zone offset transition (daylight savings time 'gap'): 1970-01-01T00:00:00.010 (hi!)" + "'", str3.equals("org.joda.time.IllegalInstantException: Illegal instant due to time zone offset transition (daylight savings time 'gap'): 1970-01-01T00:00:00.010 (hi!)"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, (int) (short) 100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        try {
            org.joda.time.LocalDate localDate4 = localDate0.withWeekOfWeekyear(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.ReadableDuration readableDuration0 = null;
        long long1 = org.joda.time.DateTimeUtils.getDurationMillis(readableDuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        org.joda.time.ReadablePartial readablePartial3 = null;
        try {
            boolean boolean4 = partial0.isEqual(readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHour();
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = dateTimeFormatter0.parseMutableDateTime("Pacific Standard Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Pacific Standard Time\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 10, (int) (byte) -1, 81, (int) (byte) -1, 0, (int) '4', (-28800000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (long) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

//    @Test
//    public void test090() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test090");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateMidnight dateMidnight10 = dateTime4.toDateMidnight();
//        try {
//            org.joda.time.DateTime dateTime14 = dateTime4.withDate(100, (int) (short) -1, 1);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(dateMidnight10);
//    }

//    @Test
//    public void test091() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test091");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) 'a');
//        try {
//            org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour((int) (short) 100);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(dateTime11);
//    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        try {
            long long6 = copticChronology1.getDateTimeMillis((int) (byte) 1, (int) (byte) 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(copticChronology1);
    }

//    @Test
//    public void test094() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test094");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        int int5 = dateTime3.getYear();
//        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(0);
//        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
//        try {
//            org.joda.time.DateTime.Property property9 = dateTime3.property(dateTimeFieldType8);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2562 + "'", int5 == 2562);
//        org.junit.Assert.assertNotNull(dateTime7);
//    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        try {
            long long5 = julianChronology0.getDateTimeMillis(366, (int) 'a', (int) '#', 2562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(julianChronology0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField2 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        try {
            org.joda.time.Partial.Property property4 = partial2.property(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
    }

//    @Test
//    public void test099() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test099");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        int int5 = dateTime3.getYear();
//        org.joda.time.DateTime dateTime7 = dateTime3.minusDays(15);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2562 + "'", int5 == 2562);
//        org.junit.Assert.assertNotNull(dateTime7);
//    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("15:23:32.185");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) buddhistChronology1, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DateTimeZone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

//    @Test
//    public void test103() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test103");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
//        boolean boolean4 = dateTimeZone2.isStandardOffset(10L);
//        java.lang.String str6 = dateTimeZone2.getName((long) (short) -1);
//        try {
//            org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2, 62);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 62");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeZone2);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Pacific Standard Time" + "'", str6.equals("Pacific Standard Time"));
//    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (long) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.String str5 = illegalFieldValueException4.getIllegalValueAsString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

//    @Test
//    public void test106() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test106");
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
//        java.lang.Appendable appendable1 = null;
//        org.joda.time.DateTimeZone dateTimeZone2 = null;
//        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
//        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone5 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology6 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone5);
//        org.joda.time.DurationField durationField7 = buddhistChronology6.eras();
//        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology6);
//        int int9 = dateTime8.getHourOfDay();
//        org.joda.time.DateTime dateTime10 = localDate4.toDateTime((org.joda.time.ReadableInstant) dateTime8);
//        org.joda.time.DateTimeZone dateTimeZone11 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology12 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone11);
//        org.joda.time.DateTimeZone dateTimeZone13 = buddhistChronology12.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
//        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone13);
//        org.joda.time.LocalDate localDate16 = dateTime8.toLocalDate();
//        boolean boolean17 = copticChronology3.equals((java.lang.Object) localDate16);
//        try {
//            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDate16);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//        org.junit.Assert.assertNotNull(dateTimeFormatter0);
//        org.junit.Assert.assertNotNull(copticChronology3);
//        org.junit.Assert.assertNotNull(buddhistChronology6);
//        org.junit.Assert.assertNotNull(durationField7);
//        org.junit.Assert.assertNotNull(dateTime8);
//        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
//        org.junit.Assert.assertNotNull(dateTime10);
//        org.junit.Assert.assertNotNull(buddhistChronology12);
//        org.junit.Assert.assertNotNull(dateTimeZone13);
//        org.junit.Assert.assertNotNull(dateTime15);
//        org.junit.Assert.assertNotNull(localDate16);
//        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
//    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5d + "'", double1 == 2440587.5d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("Pacific Standard Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Pacific Standard Time\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

//    @Test
//    public void test109() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test109");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
//        java.util.Locale locale24 = null;
//        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
//        long long27 = skipDateTimeField18.remainder((long) 923);
//        long long29 = skipDateTimeField18.roundFloor((long) 10);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
//        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
//        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 923L + "'", long27 == 923L);
//        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
//    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTimeNoMillis();
        java.io.Writer writer1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        int int4 = localDate2.getValue(0);
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2019 + "'", int4 == 2019);
    }

//    @Test
//    public void test111() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test111");
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
//        int[] intArray2 = localDate1.getValues();
//        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
//        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
//        org.joda.time.ReadablePeriod readablePeriod5 = null;
//        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
//        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.DateTime dateTime13 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeZone dateTimeZone14 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
//        org.joda.time.DateTimeZone dateTimeZone16 = buddhistChronology15.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
//        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone16);
//        org.joda.time.ReadablePeriod readablePeriod19 = null;
//        org.joda.time.DateTime dateTime20 = dateTime11.minus(readablePeriod19);
//        org.joda.time.DateTime dateTime21 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
//        try {
//            org.joda.time.DateTime dateTime24 = dateTime11.withField(dateTimeFieldType22, 0);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(dateTimeFormatter0);
//        org.junit.Assert.assertNotNull(intArray2);
//        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
//        org.junit.Assert.assertNotNull(localDate6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(dateTime13);
//        org.junit.Assert.assertNotNull(buddhistChronology15);
//        org.junit.Assert.assertNotNull(dateTimeZone16);
//        org.junit.Assert.assertNotNull(dateTime18);
//        org.junit.Assert.assertNotNull(dateTime20);
//        org.junit.Assert.assertNotNull(dateTime21);
//    }

//    @Test
//    public void test112() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test112");
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
//        java.lang.StringBuffer stringBuffer1 = null;
//        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
//        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
//        int int7 = dateTime6.getHourOfDay();
//        org.joda.time.DateTime dateTime8 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
//        org.joda.time.DateTimeZone dateTimeZone9 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
//        org.joda.time.DateTimeZone dateTimeZone11 = buddhistChronology10.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
//        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone11);
//        org.joda.time.LocalDate localDate14 = dateTime6.toLocalDate();
//        try {
//            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant) dateTime6);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//        org.junit.Assert.assertNotNull(dateTimeFormatter0);
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(durationField5);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
//        org.junit.Assert.assertNotNull(dateTime8);
//        org.junit.Assert.assertNotNull(buddhistChronology10);
//        org.junit.Assert.assertNotNull(dateTimeZone11);
//        org.junit.Assert.assertNotNull(dateTime13);
//        org.junit.Assert.assertNotNull(localDate14);
//    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(100, (int) (short) 100, 15, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, 2019);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        java.lang.String str6 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate3.plus(readablePeriod7);
        int[] intArray13 = new int[] { ' ', (short) -1, 2562, (short) 1 };
        try {
            copticChronology0.validate((org.joda.time.ReadablePartial) localDate8, intArray13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "��:��:��.000" + "'", str6.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        long long6 = buddhistChronology1.add((long) 1, (long) 23, (int) (short) 0);
        try {
            long long12 = buddhistChronology1.getDateTimeMillis(0L, 100, 365, 62, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

//    @Test
//    public void test118() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test118");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
//        try {
//            org.joda.time.DateTime dateTime12 = dateTime4.withTime((-1), (int) (short) -1, 2019, (int) (byte) 1);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(dateTime7);
//    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusYears(62);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfYear();
        java.util.Locale locale9 = null;
        try {
            org.joda.time.LocalDate localDate10 = property7.setCopy("16:00:00.100", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"16:00:00.100\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.DateTimeUtils.setCurrentMillisSystem();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
    }

//    @Test
//    public void test124() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test124");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        int int19 = skipDateTimeField18.getMinimumValue();
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
//    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay(86400000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440588.5d + "'", double1 == 2440588.5d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        long long2 = org.joda.time.field.FieldUtils.safeDivide((-48L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDate0.getFieldTypes();
        org.joda.time.LocalDate.Property property6 = localDate0.monthOfYear();
        java.lang.String str7 = property6.getAsText();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "June" + "'", str7.equals("June"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        boolean boolean2 = gregorianChronology0.equals((java.lang.Object) "dayOfYear");
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

//    @Test
//    public void test129() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test129");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        int[] intArray1 = localDate0.getValues();
//        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
//        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
//        int int7 = dateTime6.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime();
//        org.joda.time.ReadableInstant readableInstant9 = null;
//        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime6, readableInstant9);
//        org.joda.time.LocalTime localTime11 = dateTime6.toLocalTime();
//        try {
//            org.joda.time.DateTime dateTime12 = localDate0.toDateTime(localTime11);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(intArray1);
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(durationField5);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime8);
//        org.junit.Assert.assertNotNull(chronology10);
//        org.junit.Assert.assertNotNull(localTime11);
//    }

//    @Test
//    public void test130() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test130");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int21 = skipDateTimeField18.getMaximumValue();
//        int int23 = skipDateTimeField18.getMaximumValue(0L);
//        long long25 = skipDateTimeField18.roundCeiling((long) (short) 1);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
//        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 365 + "'", int23 == 365);
//        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 86400000L + "'", long25 == 86400000L);
//    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

//    @Test
//    public void test133() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test133");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
//        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
//        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
//        org.joda.time.ReadablePeriod readablePeriod12 = null;
//        org.joda.time.DateTime dateTime13 = dateTime4.minus(readablePeriod12);
//        try {
//            org.joda.time.DateTime dateTime15 = dateTime13.withMonthOfYear(365);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(buddhistChronology8);
//        org.junit.Assert.assertNotNull(dateTimeZone9);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertNotNull(dateTime13);
//    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        int int1 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
    }

//    @Test
//    public void test135() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test135");
//        org.joda.time.Chronology chronology0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
//        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.DateTimeZone dateTimeZone4 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
//        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
//        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
//        int int8 = dateTime7.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
//        int int11 = dateTime7.getYearOfCentury();
//        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
//        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
//        org.joda.time.DateTimeZone dateTimeZone14 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
//        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
//        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
//        int int18 = dateTime17.getHourOfDay();
//        int int19 = dateTime17.getWeekyear();
//        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
//        org.joda.time.DateTime dateTime22 = dateTime17.withMinuteOfHour((int) (short) 0);
//        try {
//            org.joda.time.DateTime dateTime24 = dateTime17.withDayOfMonth((int) (byte) 100);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(property2);
//        org.junit.Assert.assertNotNull(buddhistChronology5);
//        org.junit.Assert.assertNotNull(durationField6);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
//        org.junit.Assert.assertNotNull(gJChronology10);
//        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
//        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField13);
//        org.junit.Assert.assertNotNull(buddhistChronology15);
//        org.junit.Assert.assertNotNull(durationField16);
//        org.junit.Assert.assertNotNull(dateTime17);
//        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
//        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2562 + "'", int19 == 2562);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
//        org.junit.Assert.assertNotNull(dateTime22);
//    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        java.lang.Appendable appendable2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str6 = localDate3.toString(dateTimeFormatter5);
        java.util.Date date7 = localDate3.toDate();
        try {
            dateTimeFormatter0.printTo(appendable2, (org.joda.time.ReadablePartial) localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "��:��:��" + "'", str6.equals("��:��:��"));
        org.junit.Assert.assertNotNull(date7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        try {
            org.joda.time.Partial partial5 = partial2.with(dateTimeFieldType3, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
    }

//    @Test
//    public void test139() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test139");
//        org.joda.time.Chronology chronology0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
//        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.DateTimeZone dateTimeZone4 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
//        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
//        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
//        int int8 = dateTime7.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
//        int int11 = dateTime7.getYearOfCentury();
//        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
//        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
//        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
//        try {
//            org.joda.time.field.DividedDateTimeField dividedDateTimeField16 = new org.joda.time.field.DividedDateTimeField(dateTimeField13, dateTimeFieldType14, 366);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(property2);
//        org.junit.Assert.assertNotNull(buddhistChronology5);
//        org.junit.Assert.assertNotNull(durationField6);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
//        org.junit.Assert.assertNotNull(gJChronology10);
//        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
//        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField13);
//    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.Chronology chronology0 = null;
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("Pacific Standard Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Pacific Standard Time\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        try {
            org.joda.time.LocalDate localDate5 = localDate1.withYearOfCentury((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = buddhistChronology2.eras();
        try {
            org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField5 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((-15573948208434L));
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-07:52:58" + "'", str2.equals("-07:52:58"));
        org.junit.Assert.assertNotNull(localDate3);
    }

//    @Test
//    public void test145() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test145");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        int int5 = dateTime3.getYear();
//        try {
//            org.joda.time.DateTime dateTime7 = dateTime3.withEra(10);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [1,1]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2562 + "'", int5 == 2562);
//    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

//    @Test
//    public void test147() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test147");
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
//        java.io.Writer writer1 = null;
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
//        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone4 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
//        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
//        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
//        int int8 = dateTime7.getHourOfDay();
//        org.joda.time.DateTime dateTime9 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
//        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
//        java.lang.String str11 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime7);
//        try {
//            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateTime7);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//        org.junit.Assert.assertNotNull(dateTimeFormatter0);
//        org.junit.Assert.assertNotNull(dateTimeFormatter2);
//        org.junit.Assert.assertNotNull(buddhistChronology5);
//        org.junit.Assert.assertNotNull(durationField6);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(dateTime10);
//        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2562-W24-6T15:23:41.464-07:00" + "'", str11.equals("2562-W24-6T15:23:41.464-07:00"));
//    }

//    @Test
//    public void test148() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test148");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
//        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (byte) -1);
//        org.joda.time.DateTime dateTime13 = dateTime12.withLaterOffsetAtOverlap();
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(property10);
//        org.junit.Assert.assertNotNull(dateTime12);
//        org.junit.Assert.assertNotNull(dateTime13);
//    }

//    @Test
//    public void test149() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test149");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        int int6 = mutableDateTime5.getMillisOfSecond();
//        int int7 = mutableDateTime5.getDayOfMonth();
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 577 + "'", int6 == 577);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
//    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        java.util.Date date4 = localDate0.toDate();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date4);
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withEra(62);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        java.lang.Appendable appendable2 = null;
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now();
        try {
            dateTimeFormatter0.printTo(appendable2, (org.joda.time.ReadableInstant) dateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTime3);
    }

//    @Test
//    public void test152() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test152");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        try {
//            org.joda.time.DateTime dateTime9 = dateTime4.withDayOfMonth(366);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,30]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream0 = null;
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "��:��:��.000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        try {
            int int7 = localDate0.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

//    @Test
//    public void test156() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test156");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        org.joda.time.ReadableInstant readableInstant6 = null;
//        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime3, readableInstant6);
//        org.joda.time.LocalTime localTime8 = dateTime3.toLocalTime();
//        org.joda.time.DateTime dateTime10 = dateTime3.plusMinutes(0);
//        try {
//            org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra(0);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000-07:52:58 (BuddhistChronology[America/Los_Angeles])");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//        org.junit.Assert.assertNotNull(chronology7);
//        org.junit.Assert.assertNotNull(localTime8);
//        org.junit.Assert.assertNotNull(dateTime10);
//    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(923L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 923 + "'", int1 == 923);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        try {
            org.joda.time.Partial partial6 = partial0.with(dateTimeFieldType4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(0L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.withYear(365);
        long long13 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime9);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 1, (-28799938L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28799938L) + "'", long2 == (-28799938L));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str6 = dateTimeFormatter0.print((long) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology14 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = buddhistChronology14.eras();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology14);
        int int17 = dateTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localDate12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readableDuration19);
        boolean boolean21 = org.joda.time.field.FieldUtils.equals((java.lang.Object) str11, (java.lang.Object) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology25 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = buddhistChronology25.eras();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology25);
        boolean boolean28 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "16:00:00.100" + "'", str6.equals("16:00:00.100"));
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "16:00:00.000" + "'", str11.equals("16:00:00.000"));
        org.junit.Assert.assertNotNull(buddhistChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(buddhistChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        try {
            long long8 = gregorianChronology0.getDateTimeMillis((int) ' ', 2019, 62, (int) (byte) 1, (int) 'a', 3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        boolean boolean3 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) localDate0);
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfYear(577);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 577 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withDayOfWeek(24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int21 = skipDateTimeField18.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField22 = skipDateTimeField18.getWrappedField();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        java.util.Date date25 = localDate23.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDate23.isSupported(dateTimeFieldType26);
        java.util.Locale locale28 = null;
        java.lang.String str29 = skipDateTimeField18.getAsText((org.joda.time.ReadablePartial) localDate23, locale28);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "365" + "'", str29.equals("365"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = buddhistChronology8.millisOfSecond();
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(586, 0, 12, 10, (int) (byte) 10, 2000, 0, (org.joda.time.Chronology) buddhistChronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("16:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"16:00:00.000\" is malformed at \":00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        dateTimeFormatterBuilder1.clear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        java.lang.String str23 = skipDateTimeField18.toString();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "DateTimeField[dayOfYear]" + "'", str23.equals("DateTimeField[dayOfYear]"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology6.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC((long) '#', false, (long) 2019);
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(0, (-28800000), (int) (short) 1, 0, (int) (byte) -1, 10, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 28800035L + "'", long11 == 28800035L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.joda.time.ReadableInstant readableInstant0 = null;
        long long1 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.joda.time.Partial partial7 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Partial partial9 = partial7.minus(readablePeriod8);
        int int10 = partial7.size();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.yearOfEra();
        org.joda.time.Partial partial15 = partial7.withChronologyRetainFields((org.joda.time.Chronology) gJChronology11);
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(577, 19, (-28800000), 2512, (int) ' ', 0, 365, (org.joda.time.Chronology) gJChronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2512 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(partial9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(partial15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        java.io.Writer writer1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        java.lang.String str11 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime7);
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2513-W01-3T16:00:00.000-08:00" + "'", str11.equals("2513-W01-3T16:00:00.000-08:00"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Partial partial6 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial6.minus(readablePeriod7);
        try {
            dateTimeFormatter0.printTo(stringBuffer5, (org.joda.time.ReadablePartial) partial6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(partial8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        java.util.Date date3 = dateTime1.toDate();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(date3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        java.util.Date date1 = localDate0.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        try {
            int int3 = localDate0.get(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(date1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) '4');
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2562, (-28800000), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2562 for  must be in the range [-28800000,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.joda.time.DateTimeUtils.setCurrentMillisOffset(923L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        try {
            long long8 = gregorianChronology0.getDateTimeMillis((int) '#', 366, 166, 2019, 3, 3, 577);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2019 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(62, 577);
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendPattern("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:28.217Z,mdfw=1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendYearOfEra((int) '#', 2512);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeParser[] dateTimeParserArray7 = new org.joda.time.format.DateTimeParser[] { dateTimeParser6 };
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.append(dateTimePrinter5, dateTimeParserArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No parser supplied");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeParserArray7);
    }

//    @Test
//    public void test190() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test190");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
//        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
//        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
//        try {
//            org.joda.time.field.OffsetDateTimeField offsetDateTimeField29 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, dateTimeFieldType25, (int) (byte) 10, 365, 923);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
//        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
//    }

//    @Test
//    public void test191() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test191");
//        org.joda.time.Chronology chronology0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
//        org.joda.time.DateTimeZone dateTimeZone2 = null;
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
//        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
//        int int7 = dateTime6.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) dateTime6, 1);
//        org.joda.time.DateTime dateTime11 = dateTime6.plus((long) (short) 0);
//        org.joda.time.DateTime.Property property12 = dateTime11.dayOfMonth();
//        org.joda.time.LocalDateTime localDateTime13 = dateTime11.toLocalDateTime();
//        try {
//            boolean boolean14 = localDate1.isBefore((org.joda.time.ReadablePartial) localDateTime13);
//            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
//        } catch (java.lang.ClassCastException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(durationField5);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
//        org.junit.Assert.assertNotNull(gJChronology9);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertNotNull(property12);
//        org.junit.Assert.assertNotNull(localDateTime13);
//    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField2 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.junit.Assert.assertNotNull(localDate0);
    }

//    @Test
//    public void test194() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test194");
//        org.joda.time.Chronology chronology0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
//        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.DateTimeZone dateTimeZone4 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
//        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
//        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
//        int int8 = dateTime7.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
//        int int11 = dateTime7.getYearOfCentury();
//        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
//        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
//        org.joda.time.DateTimeZone dateTimeZone14 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
//        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
//        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
//        int int18 = dateTime17.getHourOfDay();
//        int int19 = dateTime17.getWeekyear();
//        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
//        org.joda.time.DateTime dateTime22 = dateTime17.withMinuteOfHour((int) (short) 0);
//        try {
//            org.joda.time.DateTime dateTime24 = dateTime22.withEra(19);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for era must be in the range [1,1]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(property2);
//        org.junit.Assert.assertNotNull(buddhistChronology5);
//        org.junit.Assert.assertNotNull(durationField6);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
//        org.junit.Assert.assertNotNull(gJChronology10);
//        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
//        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField13);
//        org.junit.Assert.assertNotNull(buddhistChronology15);
//        org.junit.Assert.assertNotNull(durationField16);
//        org.junit.Assert.assertNotNull(dateTime17);
//        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
//        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2562 + "'", int19 == 2562);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
//        org.junit.Assert.assertNotNull(dateTime22);
//    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str6 = dateTimeFormatter0.print((long) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withDefaultYear(62);
        java.lang.String str10 = dateTimeFormatter8.print(0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "16:00:00.100" + "'", str6.equals("16:00:00.100"));
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "16:00:00.000" + "'", str10.equals("16:00:00.000"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        java.lang.Number number3 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(durationFieldType0, (java.lang.Number) (-1.0d), (java.lang.Number) 62, number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField0 = null;
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField1 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (byte) -1, 0, 4, (int) '4', 24, (int) (short) 0, (int) (short) 0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gJChronology10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeParser();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

//    @Test
//    public void test203() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test203");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
//        boolean boolean4 = dateTimeZone2.isStandardOffset(10L);
//        java.lang.String str6 = dateTimeZone2.getName((long) (short) -1);
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
//        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2, 1);
//        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology9.getZone();
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeZone2);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Pacific Standard Time" + "'", str6.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(julianChronology9);
//        org.junit.Assert.assertNotNull(dateTimeZone10);
//    }

//    @Test
//    public void test204() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test204");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.ReadableDuration readableDuration7 = null;
//        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
//        org.joda.time.ReadableDuration readableDuration9 = null;
//        org.joda.time.DateTime dateTime10 = dateTime8.plus(readableDuration9);
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(dateTime8);
//        org.junit.Assert.assertNotNull(dateTime10);
//    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

//    @Test
//    public void test206() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test206");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        int int6 = dateTime3.getCenturyOfEra();
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
//    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType1, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

//    @Test
//    public void test208() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test208");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
//        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
//        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
//        int int7 = dateTime6.getHourOfDay();
//        org.joda.time.DateTime dateTime8 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
//        org.joda.time.DateTimeZone dateTimeZone9 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
//        org.joda.time.DateTimeZone dateTimeZone11 = buddhistChronology10.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
//        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone11);
//        org.joda.time.LocalDate localDate14 = dateTime6.toLocalDate();
//        boolean boolean15 = copticChronology1.equals((java.lang.Object) localDate14);
//        org.joda.time.DateTimeZone dateTimeZone16 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology17 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
//        org.joda.time.DateTimeZone dateTimeZone18 = buddhistChronology17.getZone();
//        boolean boolean20 = dateTimeZone18.isStandardOffset(10L);
//        java.lang.String str22 = dateTimeZone18.getName((long) (short) -1);
//        org.joda.time.Chronology chronology23 = copticChronology1.withZone(dateTimeZone18);
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
//        org.junit.Assert.assertNotNull(copticChronology1);
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(durationField5);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
//        org.junit.Assert.assertNotNull(dateTime8);
//        org.junit.Assert.assertNotNull(buddhistChronology10);
//        org.junit.Assert.assertNotNull(dateTimeZone11);
//        org.junit.Assert.assertNotNull(dateTime13);
//        org.junit.Assert.assertNotNull(localDate14);
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertNotNull(buddhistChronology17);
//        org.junit.Assert.assertNotNull(dateTimeZone18);
//        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
//        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Pacific Standard Time" + "'", str22.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(chronology23);
//    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("June");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"June\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

//    @Test
//    public void test210() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test210");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
//        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
//        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
//        org.joda.time.LocalDate localDate12 = dateTime4.toLocalDate();
//        try {
//            org.joda.time.DateTime dateTime14 = dateTime4.withSecondOfMinute(166);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 166 for secondOfMinute must be in the range [0,59]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(buddhistChronology8);
//        org.junit.Assert.assertNotNull(dateTimeZone9);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertNotNull(localDate12);
//    }

//    @Test
//    public void test211() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test211");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
//        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
//        int int12 = dateTime11.getWeekOfWeekyear();
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(property10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
//    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) interval4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(readableInterval5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.joda.time.DateTime dateTime0 = org.joda.time.DateTime.now();
        org.joda.time.DateTime dateTime2 = dateTime0.plusMillis((int) (short) -1);
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withTime(26, (int) (byte) 1, 26, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTime0);
        org.junit.Assert.assertNotNull(dateTime2);
    }

//    @Test
//    public void test214() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test214");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        int int5 = dateTime3.getYear();
//        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(0);
//        int int8 = dateTime3.getHourOfDay();
//        org.joda.time.DateTime dateTime10 = dateTime3.plus((long) 366);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2562 + "'", int5 == 2562);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
//        org.junit.Assert.assertNotNull(dateTime10);
//    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        java.util.Date date2 = localDate0.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localDate0.isSupported(durationFieldType5);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

//    @Test
//    public void test216() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test216");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int21 = skipDateTimeField18.getMaximumValue();
//        org.joda.time.DateTimeField dateTimeField22 = skipDateTimeField18.getWrappedField();
//        java.util.Locale locale24 = null;
//        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) ' ', locale24);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
//        org.junit.Assert.assertNotNull(dateTimeField22);
//        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "32" + "'", str25.equals("32"));
//    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDate0.getFieldTypes();
        java.util.Locale locale7 = null;
        try {
            java.lang.String str8 = localDate0.toString("GregorianChronology[UTC]", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.junit.Assert.assertNotNull(copticChronology0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(62, 577);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendDayOfMonth(23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

//    @Test
//    public void test220() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test220");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        int[] intArray1 = localDate0.getValues();
//        org.joda.time.DateTimeZone dateTimeZone2 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology3 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone2);
//        org.joda.time.DurationField durationField4 = buddhistChronology3.eras();
//        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology3);
//        int int6 = dateTime5.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime();
//        org.joda.time.ReadableInstant readableInstant8 = null;
//        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime5, readableInstant8);
//        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
//        org.joda.time.DateTimeZone dateTimeZone12 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
//        org.joda.time.DateTimeZone dateTimeZone14 = buddhistChronology13.getZone();
//        boolean boolean16 = dateTimeZone14.isStandardOffset(10L);
//        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (-1), dateTimeZone14);
//        try {
//            org.joda.time.DateTime dateTime18 = localDate0.toDateTime(localTime10, dateTimeZone14);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(intArray1);
//        org.junit.Assert.assertNotNull(buddhistChronology3);
//        org.junit.Assert.assertNotNull(durationField4);
//        org.junit.Assert.assertNotNull(dateTime5);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime7);
//        org.junit.Assert.assertNotNull(chronology9);
//        org.junit.Assert.assertNotNull(localTime10);
//        org.junit.Assert.assertNotNull(buddhistChronology13);
//        org.junit.Assert.assertNotNull(dateTimeZone14);
//        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
//    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.Chronology chronology4 = partial0.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        int[] intArray6 = localDate5.getValues();
        org.joda.time.Partial partial7 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = partial7.getFormatter();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        java.util.Date date11 = localDate9.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        int int14 = partial7.compareTo((org.joda.time.ReadablePartial) localDate9);
        try {
            boolean boolean15 = partial0.isBefore((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.String str5 = illegalFieldValueException4.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.joda.time.IllegalFieldValueException: Value 10 for hi! must be in the range [10.0,1]" + "'", str5.equals("org.joda.time.IllegalFieldValueException: Value 10 for hi! must be in the range [10.0,1]"));
    }

//    @Test
//    public void test223() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test223");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
//        java.util.Locale locale24 = null;
//        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
//        long long27 = skipDateTimeField18.remainder((long) ' ');
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
//        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
//        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
//    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.Number number5 = illegalFieldValueException4.getIllegalNumberValue();
        java.lang.String str6 = illegalFieldValueException4.getIllegalValueAsString();
        java.lang.String str7 = illegalFieldValueException4.getFieldName();
        org.junit.Assert.assertTrue("'" + number5 + "' != '" + (short) 10 + "'", number5.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology2.getZone();
        org.joda.time.DateTime dateTime4 = dateTime1.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime1.minusMillis(0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        org.joda.time.IllegalInstantException illegalInstantException7 = new org.joda.time.IllegalInstantException((long) (short) 10, "hi!");
        java.lang.Throwable[] throwableArray8 = illegalInstantException7.getSuppressed();
        illegalFieldValueException4.addSuppressed((java.lang.Throwable) illegalInstantException7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((long) 166);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2440587.5000019213d + "'", double1 == 2440587.5000019213d);
    }

//    @Test
//    public void test228() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test228");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
//        org.joda.time.DateTimeZone dateTimeZone11 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology12 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone11);
//        org.joda.time.DurationField durationField13 = buddhistChronology12.eras();
//        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology12);
//        int int15 = dateTime14.getHourOfDay();
//        org.joda.time.MutableDateTime mutableDateTime16 = dateTime14.toMutableDateTime();
//        int int17 = property10.getDifference((org.joda.time.ReadableInstant) dateTime14);
//        try {
//            org.joda.time.DateTime dateTime19 = property10.setCopy(2000);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfMonth must be in the range [1,30]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(property10);
//        org.junit.Assert.assertNotNull(buddhistChronology12);
//        org.junit.Assert.assertNotNull(durationField13);
//        org.junit.Assert.assertNotNull(dateTime14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
//        org.junit.Assert.assertNotNull(mutableDateTime16);
//        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
//    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int int0 = org.joda.time.chrono.CopticChronology.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.Number number5 = illegalFieldValueException4.getIllegalNumberValue();
        java.lang.String str6 = illegalFieldValueException4.getIllegalValueAsString();
        java.lang.Number number7 = illegalFieldValueException4.getIllegalNumberValue();
        java.lang.Number number8 = illegalFieldValueException4.getUpperBound();
        org.junit.Assert.assertTrue("'" + number5 + "' != '" + (short) 10 + "'", number5.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        org.junit.Assert.assertTrue("'" + number7 + "' != '" + (short) 10 + "'", number7.equals((short) 10));
        org.junit.Assert.assertTrue("'" + number8 + "' != '" + 1L + "'", number8.equals(1L));
    }

//    @Test
//    public void test231() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test231");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
//        try {
//            org.joda.time.DateTime dateTime9 = dateTime4.withEra(0);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for era must be in the range [1,1]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(dateTime7);
//    }

//    @Test
//    public void test232() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test232");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int21 = skipDateTimeField18.getMaximumValue();
//        org.joda.time.DateTimeField dateTimeField22 = skipDateTimeField18.getWrappedField();
//        org.joda.time.DateTimeZone dateTimeZone23 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology24 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone23);
//        org.joda.time.DateTimeField dateTimeField25 = buddhistChronology24.weekOfWeekyear();
//        org.joda.time.DurationField durationField26 = buddhistChronology24.eras();
//        org.joda.time.Chronology chronology27 = null;
//        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
//        org.joda.time.LocalDate.Property property29 = localDate28.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone30 = null;
//        org.joda.time.DateTimeZone dateTimeZone31 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology32 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone31);
//        org.joda.time.DurationField durationField33 = buddhistChronology32.eras();
//        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology32);
//        int int35 = dateTime34.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) dateTime34, 1);
//        int int38 = dateTime34.getYearOfCentury();
//        long long39 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
//        org.joda.time.DateTimeField dateTimeField40 = property29.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField41 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology24, dateTimeField40);
//        long long43 = skipDateTimeField41.roundCeiling((long) 62);
//        int int45 = skipDateTimeField41.get((long) (short) 0);
//        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
//        int[] intArray47 = localDate46.getValues();
//        int int48 = skipDateTimeField41.getMinimumValue((org.joda.time.ReadablePartial) localDate46);
//        java.util.Locale locale49 = null;
//        java.lang.String str50 = skipDateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDate46, locale49);
//        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
//        int[] intArray52 = localDate51.getValues();
//        org.joda.time.LocalDate localDate54 = localDate51.plusYears((int) (short) -1);
//        org.joda.time.LocalDate localDate56 = localDate51.withCenturyOfEra(0);
//        org.joda.time.LocalDate.Property property57 = localDate56.era();
//        org.joda.time.LocalDate localDate58 = property57.getLocalDate();
//        org.joda.time.LocalDate localDate60 = localDate58.withYearOfEra(2000);
//        org.joda.time.DateTimeZone dateTimeZone62 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology63 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone62);
//        org.joda.time.DateTimeField dateTimeField64 = buddhistChronology63.weekOfWeekyear();
//        org.joda.time.DurationField durationField65 = buddhistChronology63.eras();
//        org.joda.time.Chronology chronology66 = null;
//        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(chronology66);
//        org.joda.time.LocalDate.Property property68 = localDate67.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone69 = null;
//        org.joda.time.DateTimeZone dateTimeZone70 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology71 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone70);
//        org.joda.time.DurationField durationField72 = buddhistChronology71.eras();
//        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology71);
//        int int74 = dateTime73.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, (org.joda.time.ReadableInstant) dateTime73, 1);
//        int int77 = dateTime73.getYearOfCentury();
//        long long78 = property68.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
//        org.joda.time.DateTimeField dateTimeField79 = property68.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField80 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology63, dateTimeField79);
//        long long82 = skipDateTimeField80.roundCeiling((long) 62);
//        long long84 = skipDateTimeField80.roundHalfFloor((long) 1);
//        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate();
//        int[] intArray86 = localDate85.getValues();
//        org.joda.time.LocalDate localDate88 = localDate85.plusYears((int) (short) -1);
//        int int89 = localDate88.getDayOfYear();
//        int[] intArray90 = new int[] {};
//        int int91 = skipDateTimeField80.getMinimumValue((org.joda.time.ReadablePartial) localDate88, intArray90);
//        try {
//            int[] intArray93 = skipDateTimeField18.addWrapPartial((org.joda.time.ReadablePartial) localDate58, 2562, intArray90, 586);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
//        org.junit.Assert.assertNotNull(dateTimeField22);
//        org.junit.Assert.assertNotNull(buddhistChronology24);
//        org.junit.Assert.assertNotNull(dateTimeField25);
//        org.junit.Assert.assertNotNull(durationField26);
//        org.junit.Assert.assertNotNull(property29);
//        org.junit.Assert.assertNotNull(buddhistChronology32);
//        org.junit.Assert.assertNotNull(durationField33);
//        org.junit.Assert.assertNotNull(dateTime34);
//        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
//        org.junit.Assert.assertNotNull(gJChronology37);
//        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 62 + "'", int38 == 62);
//        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField40);
//        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 86400000L + "'", long43 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
//        org.junit.Assert.assertNotNull(intArray47);
//        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
//        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "166" + "'", str50.equals("166"));
//        org.junit.Assert.assertNotNull(intArray52);
//        org.junit.Assert.assertNotNull(localDate54);
//        org.junit.Assert.assertNotNull(localDate56);
//        org.junit.Assert.assertNotNull(property57);
//        org.junit.Assert.assertNotNull(localDate58);
//        org.junit.Assert.assertNotNull(localDate60);
//        org.junit.Assert.assertNotNull(buddhistChronology63);
//        org.junit.Assert.assertNotNull(dateTimeField64);
//        org.junit.Assert.assertNotNull(durationField65);
//        org.junit.Assert.assertNotNull(property68);
//        org.junit.Assert.assertNotNull(buddhistChronology71);
//        org.junit.Assert.assertNotNull(durationField72);
//        org.junit.Assert.assertNotNull(dateTime73);
//        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
//        org.junit.Assert.assertNotNull(gJChronology76);
//        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 62 + "'", int77 == 62);
//        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField79);
//        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 86400000L + "'", long82 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
//        org.junit.Assert.assertNotNull(intArray86);
//        org.junit.Assert.assertNotNull(localDate88);
//        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 166 + "'", int89 == 166);
//        org.junit.Assert.assertNotNull(intArray90);
//        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
//    }

//    @Test
//    public void test233() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test233");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int23 = skipDateTimeField18.getDifference((long) (short) 10, 0L);
//        org.joda.time.DateTimeZone dateTimeZone24 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology25 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone24);
//        org.joda.time.DateTimeField dateTimeField26 = buddhistChronology25.weekOfWeekyear();
//        org.joda.time.DurationField durationField27 = buddhistChronology25.eras();
//        org.joda.time.Chronology chronology28 = null;
//        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
//        org.joda.time.LocalDate.Property property30 = localDate29.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone31 = null;
//        org.joda.time.DateTimeZone dateTimeZone32 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology33 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone32);
//        org.joda.time.DurationField durationField34 = buddhistChronology33.eras();
//        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology33);
//        int int36 = dateTime35.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) dateTime35, 1);
//        int int39 = dateTime35.getYearOfCentury();
//        long long40 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
//        org.joda.time.DateTimeField dateTimeField41 = property30.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField42 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology25, dateTimeField41);
//        long long44 = skipDateTimeField42.roundCeiling((long) 62);
//        int int45 = skipDateTimeField42.getMaximumValue();
//        org.joda.time.DateTimeField dateTimeField46 = skipDateTimeField42.getWrappedField();
//        org.joda.time.DateTimeZone dateTimeZone47 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology48 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone47);
//        org.joda.time.DateTimeField dateTimeField49 = buddhistChronology48.weekOfWeekyear();
//        org.joda.time.DurationField durationField50 = buddhistChronology48.eras();
//        org.joda.time.Chronology chronology51 = null;
//        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
//        org.joda.time.LocalDate.Property property53 = localDate52.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone54 = null;
//        org.joda.time.DateTimeZone dateTimeZone55 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology56 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone55);
//        org.joda.time.DurationField durationField57 = buddhistChronology56.eras();
//        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology56);
//        int int59 = dateTime58.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, (org.joda.time.ReadableInstant) dateTime58, 1);
//        int int62 = dateTime58.getYearOfCentury();
//        long long63 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
//        org.joda.time.DateTimeField dateTimeField64 = property53.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField65 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology48, dateTimeField64);
//        long long67 = skipDateTimeField65.roundCeiling((long) 62);
//        int int69 = skipDateTimeField65.get((long) (short) 0);
//        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate();
//        int[] intArray71 = localDate70.getValues();
//        int int72 = skipDateTimeField65.getMinimumValue((org.joda.time.ReadablePartial) localDate70);
//        java.util.Locale locale73 = null;
//        java.lang.String str74 = skipDateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDate70, locale73);
//        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate();
//        int[] intArray77 = localDate76.getValues();
//        try {
//            int[] intArray79 = skipDateTimeField18.add((org.joda.time.ReadablePartial) localDate70, 0, intArray77, 24);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
//        org.junit.Assert.assertNotNull(buddhistChronology25);
//        org.junit.Assert.assertNotNull(dateTimeField26);
//        org.junit.Assert.assertNotNull(durationField27);
//        org.junit.Assert.assertNotNull(property30);
//        org.junit.Assert.assertNotNull(buddhistChronology33);
//        org.junit.Assert.assertNotNull(durationField34);
//        org.junit.Assert.assertNotNull(dateTime35);
//        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
//        org.junit.Assert.assertNotNull(gJChronology38);
//        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 62 + "'", int39 == 62);
//        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField41);
//        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 86400000L + "'", long44 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 366 + "'", int45 == 366);
//        org.junit.Assert.assertNotNull(dateTimeField46);
//        org.junit.Assert.assertNotNull(buddhistChronology48);
//        org.junit.Assert.assertNotNull(dateTimeField49);
//        org.junit.Assert.assertNotNull(durationField50);
//        org.junit.Assert.assertNotNull(property53);
//        org.junit.Assert.assertNotNull(buddhistChronology56);
//        org.junit.Assert.assertNotNull(durationField57);
//        org.junit.Assert.assertNotNull(dateTime58);
//        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 15 + "'", int59 == 15);
//        org.junit.Assert.assertNotNull(gJChronology61);
//        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 62 + "'", int62 == 62);
//        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField64);
//        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 86400000L + "'", long67 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
//        org.junit.Assert.assertNotNull(intArray71);
//        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
//        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "166" + "'", str74.equals("166"));
//        org.junit.Assert.assertNotNull(intArray77);
//    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("��:��:��", "166");
    }

//    @Test
//    public void test235() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test235");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getHourOfDay();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        try {
//            org.joda.time.DateTime dateTime7 = dateTime3.withWeekOfWeekyear(365);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for weekOfWeekyear must be in the range [1,52]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//    }

//    @Test
//    public void test236() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test236");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
//        org.joda.time.DateMidnight dateMidnight10 = dateTime4.toDateMidnight();
//        boolean boolean11 = dateMidnight10.isBeforeNow();
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertNotNull(dateMidnight10);
//        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
//    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        java.io.Writer writer1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property3 = localDate2.yearOfCentury();
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property3);
    }

//    @Test
//    public void test239() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test239");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
//        boolean boolean4 = dateTimeZone2.isStandardOffset(10L);
//        java.lang.String str6 = dateTimeZone2.getName((long) (short) -1);
//        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.DateTime dateTime13 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeZone dateTimeZone14 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
//        org.joda.time.DateTimeZone dateTimeZone16 = buddhistChronology15.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
//        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone16);
//        org.joda.time.MutableDateTime mutableDateTime19 = dateTime11.toMutableDateTime();
//        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) mutableDateTime19);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeZone2);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Pacific Standard Time" + "'", str6.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(dateTime13);
//        org.junit.Assert.assertNotNull(buddhistChronology15);
//        org.junit.Assert.assertNotNull(dateTimeZone16);
//        org.junit.Assert.assertNotNull(dateTime18);
//        org.junit.Assert.assertNotNull(mutableDateTime19);
//        org.junit.Assert.assertNotNull(gJChronology20);
//    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(81, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 81");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 0, 81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("��:��:��.000");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        int[] intArray4 = localDate3.getValues();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        java.lang.String str6 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        int[] intArray8 = localDate7.getValues();
        org.joda.time.LocalDate localDate10 = localDate7.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate12 = localDate7.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate14 = localDate7.plusWeeks((int) (byte) 0);
        org.joda.time.LocalDate localDate15 = localDate3.withFields((org.joda.time.ReadablePartial) localDate14);
        jodaTimePermission1.checkGuard((java.lang.Object) localDate15);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "��:��:��.000" + "'", str6.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

//    @Test
//    public void test245() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test245");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
//        int int4 = dateTime3.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
//        try {
//            org.joda.time.DateTime dateTime7 = dateTime3.withMinuteOfHour((-35));
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35 for minuteOfHour must be in the range [0,59]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTime3);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime5);
//    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.year();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        java.lang.Integer int3 = dateTimeFormatter1.getPivotYear();
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("2512-12-31", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2512-12-31\" is malformed at \"-12-31\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
    }

//    @Test
//    public void test247() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test247");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        int[] intArray1 = localDate0.getValues();
//        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
//        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
//        int[] intArray5 = localDate4.getValues();
//        org.joda.time.Partial partial6 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate4);
//        java.lang.String str7 = partial6.toStringList();
//        boolean boolean8 = localDate0.isAfter((org.joda.time.ReadablePartial) partial6);
//        org.junit.Assert.assertNotNull(intArray1);
//        org.junit.Assert.assertNotNull(localDate3);
//        org.junit.Assert.assertNotNull(intArray5);
//        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[year=2019, monthOfYear=6, dayOfMonth=15]" + "'", str7.equals("[year=2019, monthOfYear=6, dayOfMonth=15]"));
//        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
//    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(15, (int) (short) 0, (int) (short) -1, 16, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DurationField durationField3 = buddhistChronology1.seconds();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology7 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = buddhistChronology7.getZone();
        boolean boolean10 = dateTimeZone8.isStandardOffset(10L);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1), dateTimeZone8);
        int int13 = dateTimeZone8.getOffsetFromLocal((long) 0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj4, dateTimeZone8);
        try {
            org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) buddhistChronology1, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.BuddhistChronology");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(buddhistChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-28800000) + "'", int13 == (-28800000));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        java.util.Locale locale8 = null;
        try {
            java.lang.String str9 = localDate5.toString("2512-12-31T16:00:00.000-08:00", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(durationFieldType0, (java.lang.Number) 577, (java.lang.Number) 923L, (java.lang.Number) (-48L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

//    @Test
//    public void test252() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test252");
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
//        boolean boolean5 = dateTimeZone3.isStandardOffset(10L);
//        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), dateTimeZone3);
//        long long8 = dateTimeZone3.convertUTCToLocal((long) 62);
//        java.util.Locale locale10 = null;
//        java.lang.String str11 = dateTimeZone3.getShortName((long) 2512, locale10);
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(dateTimeZone3);
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
//        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799938L) + "'", long8 == (-28799938L));
//        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "PST" + "'", str11.equals("PST"));
//    }

//    @Test
//    public void test253() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test253");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int22 = skipDateTimeField18.get((long) (short) 0);
//        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
//        int[] intArray24 = localDate23.getValues();
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
//        java.lang.String str26 = localDate23.toString(dateTimeFormatter25);
//        int int27 = localDate23.getYearOfCentury();
//        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
//        int[] intArray29 = localDate28.getValues();
//        int int30 = skipDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray29);
//        long long32 = skipDateTimeField18.roundHalfEven(0L);
//        int int34 = skipDateTimeField18.get((long) 16);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
//        org.junit.Assert.assertNotNull(intArray24);
//        org.junit.Assert.assertNotNull(dateTimeFormatter25);
//        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "��:��:��" + "'", str26.equals("��:��:��"));
//        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
//        org.junit.Assert.assertNotNull(intArray29);
//        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
//        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
//        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
//    }

//    @Test
//    public void test254() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test254");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        int int22 = skipDateTimeField18.get((long) (short) 0);
//        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
//        int[] intArray24 = localDate23.getValues();
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
//        java.lang.String str26 = localDate23.toString(dateTimeFormatter25);
//        int int27 = localDate23.getYearOfCentury();
//        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
//        int[] intArray29 = localDate28.getValues();
//        int int30 = skipDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray29);
//        boolean boolean31 = skipDateTimeField18.isSupported();
//        long long33 = skipDateTimeField18.roundHalfFloor((-3024000000L));
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
//        org.junit.Assert.assertNotNull(intArray24);
//        org.junit.Assert.assertNotNull(dateTimeFormatter25);
//        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "��:��:��" + "'", str26.equals("��:��:��"));
//        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
//        org.junit.Assert.assertNotNull(intArray29);
//        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
//        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3024000000L) + "'", long33 == (-3024000000L));
//    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter0.parseDateTime("2562-W24-6T15:23:39.109-07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2562-W24-6T15:23:39.109-07:00\" is malformed at \"62-W24-6T15:23:39.109-07:00\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

//    @Test
//    public void test256() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test256");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        java.lang.String str8 = gJChronology7.toString();
//        org.joda.time.Chronology chronology9 = gJChronology7.withUTC();
//        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology7.getZone();
//        long long12 = dateTimeZone10.convertUTCToLocal((long) 2512);
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:54.246Z,mdfw=1]" + "'", str8.equals("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:54.246Z,mdfw=1]"));
//        org.junit.Assert.assertNotNull(chronology9);
//        org.junit.Assert.assertNotNull(dateTimeZone10);
//        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28797488L) + "'", long12 == (-28797488L));
//    }

//    @Test
//    public void test257() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test257");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
//        long long11 = gJChronology7.add((long) (byte) -1, (long) 15, (int) (short) 1);
//        org.joda.time.Partial partial12 = new org.joda.time.Partial((org.joda.time.Chronology) gJChronology7);
//        try {
//            java.lang.String str14 = partial12.toString("DateTimeField[dayOfYear]");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(gJChronology7);
//        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14L + "'", long11 == 14L);
//    }

//    @Test
//    public void test258() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test258");
//        org.joda.time.Chronology chronology0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
//        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
//        java.lang.String str3 = property2.getName();
//        org.joda.time.LocalDate localDate5 = property2.addToCopy(23);
//        org.joda.time.DateTimeZone dateTimeZone6 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology7 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone6);
//        org.joda.time.DurationField durationField8 = buddhistChronology7.eras();
//        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology7);
//        int int10 = dateTime9.getMinuteOfHour();
//        org.joda.time.MutableDateTime mutableDateTime11 = dateTime9.toMutableDateTime();
//        org.joda.time.ReadableInstant readableInstant12 = null;
//        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime9, readableInstant12);
//        org.joda.time.LocalTime localTime14 = dateTime9.toLocalTime();
//        try {
//            org.joda.time.DateTime dateTime15 = localDate5.toDateTime(localTime14);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(property2);
//        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "dayOfYear" + "'", str3.equals("dayOfYear"));
//        org.junit.Assert.assertNotNull(localDate5);
//        org.junit.Assert.assertNotNull(buddhistChronology7);
//        org.junit.Assert.assertNotNull(durationField8);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
//        org.junit.Assert.assertNotNull(mutableDateTime11);
//        org.junit.Assert.assertNotNull(chronology13);
//        org.junit.Assert.assertNotNull(localTime14);
//    }

//    @Test
//    public void test259() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test259");
//        org.joda.time.field.DividedDateTimeField dividedDateTimeField0 = null;
//        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
//        int[] intArray2 = localDate1.getValues();
//        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
//        java.lang.String str4 = localDate1.toString(dateTimeFormatter3);
//        org.joda.time.Interval interval5 = localDate1.toInterval();
//        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDate1.getFieldTypes();
//        org.joda.time.LocalDate.Property property7 = localDate1.monthOfYear();
//        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
//        org.joda.time.DateTimeZone dateTimeZone9 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
//        org.joda.time.DateTimeField dateTimeField11 = buddhistChronology10.weekOfWeekyear();
//        org.joda.time.DurationField durationField12 = buddhistChronology10.eras();
//        org.joda.time.Chronology chronology13 = null;
//        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
//        org.joda.time.LocalDate.Property property15 = localDate14.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone16 = null;
//        org.joda.time.DateTimeZone dateTimeZone17 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology18 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone17);
//        org.joda.time.DurationField durationField19 = buddhistChronology18.eras();
//        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology18);
//        int int21 = dateTime20.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) dateTime20, 1);
//        int int24 = dateTime20.getYearOfCentury();
//        long long25 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
//        org.joda.time.DateTimeField dateTimeField26 = property15.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology10, dateTimeField26);
//        long long29 = skipDateTimeField27.roundCeiling((long) 62);
//        int int31 = skipDateTimeField27.get((long) (short) 0);
//        org.joda.time.DateTimeFieldType dateTimeFieldType32 = skipDateTimeField27.getType();
//        try {
//            org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField0, durationField8, dateTimeFieldType32);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//        }
//        org.junit.Assert.assertNotNull(intArray2);
//        org.junit.Assert.assertNotNull(dateTimeFormatter3);
//        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��" + "'", str4.equals("��:��:��"));
//        org.junit.Assert.assertNotNull(interval5);
//        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
//        org.junit.Assert.assertNotNull(property7);
//        org.junit.Assert.assertNotNull(durationField8);
//        org.junit.Assert.assertNotNull(buddhistChronology10);
//        org.junit.Assert.assertNotNull(dateTimeField11);
//        org.junit.Assert.assertNotNull(durationField12);
//        org.junit.Assert.assertNotNull(property15);
//        org.junit.Assert.assertNotNull(buddhistChronology18);
//        org.junit.Assert.assertNotNull(durationField19);
//        org.junit.Assert.assertNotNull(dateTime20);
//        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
//        org.junit.Assert.assertNotNull(gJChronology23);
//        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 62 + "'", int24 == 62);
//        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField26);
//        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 86400000L + "'", long29 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
//        org.junit.Assert.assertNotNull(dateTimeFieldType32);
//    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long8 = dateTimeZone2.convertLocalToUTC((-78689146022000L), true, 1560637430165L);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-78689117644000L) + "'", long8 == (-78689117644000L));
    }

//    @Test
//    public void test261() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test261");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
//        org.joda.time.DateTime dateTime9 = dateTime4.withMonthOfYear(1);
//        int int10 = dateTime4.getMinuteOfDay();
//        org.joda.time.DateTime dateTime12 = dateTime4.withCenturyOfEra(365);
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(dateTime7);
//        org.junit.Assert.assertNotNull(dateTime9);
//        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 923 + "'", int10 == 923);
//        org.junit.Assert.assertNotNull(dateTime12);
//    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:38.463Z,mdfw=1]", "16:00:00.100");
        illegalFieldValueException2.prependMessage("");
        java.lang.String str5 = illegalFieldValueException2.getFieldName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:38.463Z,mdfw=1]" + "'", str5.equals("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:38.463Z,mdfw=1]"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Partial partial5 = partial0.plus(readablePeriod4);
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = partial0.getFieldType((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(partial5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial2.getFormatter();
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = partial2.getFieldType(2512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

//    @Test
//    public void test265() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test265");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        int int20 = skipDateTimeField18.getMinimumValue((long) 2562);
//        org.joda.time.DateTimeZone dateTimeZone21 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology22 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone21);
//        org.joda.time.DateTimeField dateTimeField23 = buddhistChronology22.weekOfWeekyear();
//        org.joda.time.DurationField durationField24 = buddhistChronology22.eras();
//        org.joda.time.Chronology chronology25 = null;
//        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
//        org.joda.time.LocalDate.Property property27 = localDate26.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone28 = null;
//        org.joda.time.DateTimeZone dateTimeZone29 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology30 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone29);
//        org.joda.time.DurationField durationField31 = buddhistChronology30.eras();
//        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology30);
//        int int33 = dateTime32.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) dateTime32, 1);
//        int int36 = dateTime32.getYearOfCentury();
//        long long37 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
//        org.joda.time.DateTimeField dateTimeField38 = property27.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField39 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology22, dateTimeField38);
//        long long41 = skipDateTimeField39.roundCeiling((long) 62);
//        int int42 = skipDateTimeField39.getMaximumValue();
//        org.joda.time.DateTimeField dateTimeField43 = skipDateTimeField39.getWrappedField();
//        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
//        int[] intArray45 = localDate44.getValues();
//        org.joda.time.LocalDate localDate47 = localDate44.plusYears((int) (short) -1);
//        org.joda.time.LocalDate localDate49 = localDate44.withCenturyOfEra(0);
//        org.joda.time.LocalDate.Property property50 = localDate49.era();
//        java.util.Locale locale51 = null;
//        java.lang.String str52 = skipDateTimeField39.getAsShortText((org.joda.time.ReadablePartial) localDate49, locale51);
//        org.joda.time.LocalDate localDate54 = localDate49.withEra(0);
//        java.util.Locale locale56 = null;
//        java.lang.String str57 = skipDateTimeField18.getAsText((org.joda.time.ReadablePartial) localDate49, 0, locale56);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
//        org.junit.Assert.assertNotNull(buddhistChronology22);
//        org.junit.Assert.assertNotNull(dateTimeField23);
//        org.junit.Assert.assertNotNull(durationField24);
//        org.junit.Assert.assertNotNull(property27);
//        org.junit.Assert.assertNotNull(buddhistChronology30);
//        org.junit.Assert.assertNotNull(durationField31);
//        org.junit.Assert.assertNotNull(dateTime32);
//        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
//        org.junit.Assert.assertNotNull(gJChronology35);
//        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 62 + "'", int36 == 62);
//        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField38);
//        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 86400000L + "'", long41 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 366 + "'", int42 == 366);
//        org.junit.Assert.assertNotNull(dateTimeField43);
//        org.junit.Assert.assertNotNull(intArray45);
//        org.junit.Assert.assertNotNull(localDate47);
//        org.junit.Assert.assertNotNull(localDate49);
//        org.junit.Assert.assertNotNull(property50);
//        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "166" + "'", str52.equals("166"));
//        org.junit.Assert.assertNotNull(localDate54);
//        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "0" + "'", str57.equals("0"));
//    }

//    @Test
//    public void test266() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test266");
//        org.joda.time.Partial partial0 = new org.joda.time.Partial();
//        org.joda.time.ReadablePeriod readablePeriod1 = null;
//        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DateTimeField dateTimeField5 = buddhistChronology4.weekOfWeekyear();
//        org.joda.time.DurationField durationField6 = buddhistChronology4.eras();
//        org.joda.time.Chronology chronology7 = null;
//        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
//        org.joda.time.LocalDate.Property property9 = localDate8.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone10 = null;
//        org.joda.time.DateTimeZone dateTimeZone11 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology12 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone11);
//        org.joda.time.DurationField durationField13 = buddhistChronology12.eras();
//        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology12);
//        int int15 = dateTime14.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) dateTime14, 1);
//        int int18 = dateTime14.getYearOfCentury();
//        long long19 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
//        org.joda.time.DateTimeField dateTimeField20 = property9.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField21 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology4, dateTimeField20);
//        long long23 = skipDateTimeField21.roundCeiling((long) 62);
//        int int25 = skipDateTimeField21.get((long) (short) 0);
//        org.joda.time.DateTimeFieldType dateTimeFieldType26 = skipDateTimeField21.getType();
//        try {
//            org.joda.time.Partial partial28 = partial0.withField(dateTimeFieldType26, 6);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(partial2);
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(dateTimeField5);
//        org.junit.Assert.assertNotNull(durationField6);
//        org.junit.Assert.assertNotNull(property9);
//        org.junit.Assert.assertNotNull(buddhistChronology12);
//        org.junit.Assert.assertNotNull(durationField13);
//        org.junit.Assert.assertNotNull(dateTime14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
//        org.junit.Assert.assertNotNull(gJChronology17);
//        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
//        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField20);
//        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
//        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
//        org.junit.Assert.assertNotNull(dateTimeFieldType26);
//    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("org.joda.time.IllegalInstantException: Illegal instant due to time zone offset transition (daylight savings time 'gap'): 1970-01-01T00:00:00.010 (hi!)");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.joda.time.DateTimeField dateTimeField0 = null;
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 6, 16, 166);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        int int7 = property6.getLeapAmount();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeParser();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        java.io.Writer writer5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int[] intArray7 = localDate6.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str9 = localDate6.toString(dateTimeFormatter8);
        try {
            dateTimeFormatter4.printTo(writer5, (org.joda.time.ReadablePartial) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "��:��:��" + "'", str9.equals("��:��:��"));
    }

//    @Test
//    public void test272() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test272");
//        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone1 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
//        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
//        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
//        int int5 = dateTime4.getHourOfDay();
//        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
//        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks((-1));
//        org.junit.Assert.assertNotNull(buddhistChronology2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(dateTime4);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertNotNull(dateTime8);
//    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long9 = dateTimeZone6.adjustOffset((long) '4', true);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(15, 10, 15, (int) (short) 0, 586, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 586 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
    }

//    @Test
//    public void test274() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test274");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
//        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
//        org.joda.time.Chronology chronology4 = null;
//        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
//        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
//        org.joda.time.DateTimeZone dateTimeZone7 = null;
//        org.joda.time.DateTimeZone dateTimeZone8 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
//        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
//        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
//        int int12 = dateTime11.getHourOfDay();
//        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
//        int int15 = dateTime11.getYearOfCentury();
//        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
//        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
//        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
//        long long20 = skipDateTimeField18.roundCeiling((long) 62);
//        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
//        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
//        org.joda.time.DateTimeZone dateTimeZone25 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology26 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone25);
//        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology26);
//        int int28 = localDate27.getYearOfCentury();
//        int[] intArray36 = new int[] { 24, 166, 365, (short) 10, 3, 2562 };
//        int[] intArray38 = skipDateTimeField18.add((org.joda.time.ReadablePartial) localDate27, 577, intArray36, 0);
//        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
//        try {
//            org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, dateTimeFieldType39, 26, 62, 16);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
//        } catch (java.lang.IllegalArgumentException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeField2);
//        org.junit.Assert.assertNotNull(durationField3);
//        org.junit.Assert.assertNotNull(property6);
//        org.junit.Assert.assertNotNull(buddhistChronology9);
//        org.junit.Assert.assertNotNull(durationField10);
//        org.junit.Assert.assertNotNull(dateTime11);
//        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
//        org.junit.Assert.assertNotNull(gJChronology14);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
//        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
//        org.junit.Assert.assertNotNull(dateTimeField17);
//        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
//        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
//        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
//        org.junit.Assert.assertNotNull(buddhistChronology26);
//        org.junit.Assert.assertNotNull(localDate27);
//        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
//        org.junit.Assert.assertNotNull(intArray36);
//        org.junit.Assert.assertNotNull(intArray38);
//    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.adjustOffset((long) '4', true);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        long long7 = cachedDateTimeZone5.nextTransition((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendFractionOfDay(100, 62);
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendYearOfCentury((-1), 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.adjustOffset((long) '4', true);
        try {
            org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -35");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        int int3 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) '#');
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 15, 19, 2562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for  must be in the range [19,2562]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("", (java.lang.Number) 4, (java.lang.Number) 32L, (java.lang.Number) 2440587.5d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        java.lang.String str2 = dateTimeFormatter0.print((long) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withZoneUTC();
        try {
            long long5 = dateTimeFormatter0.parseMillis("GJChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1970W013" + "'", str2.equals("1970W013"));
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendYearOfEra((int) '#', 2512);
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(buddhistChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser();
        java.lang.StringBuffer stringBuffer1 = null;
        try {
            dateTimeFormatter0.printTo(stringBuffer1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property60 = localDate59.yearOfCentury();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        int[] intArray63 = localDate62.getValues();
        try {
            int[] intArray65 = remainderDateTimeField58.add((org.joda.time.ReadablePartial) localDate59, (int) (byte) 0, intArray63, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(intArray63);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime3.withYearOfEra((int) (short) 1);
        int int8 = dateTime3.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay9 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime11 = dateTime3.withDayOfYear(12);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology2.getZone();
        org.joda.time.DateTime dateTime4 = dateTime1.withZoneRetainFields(dateTimeZone3);
        int int5 = dateTime4.getDayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        int int5 = localDate2.getYearOfEra();
        org.joda.time.LocalDate.Property property6 = localDate2.monthOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2512 + "'", int5 == 2512);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfEra();
        org.joda.time.field.SkipDateTimeField skipDateTimeField7 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) gJChronology0, dateTimeField6);
        try {
            long long13 = gJChronology0.getDateTimeMillis((long) (short) 100, (int) ' ', 6, 923, 2562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.yearOfEra();
        org.joda.time.Partial partial8 = partial0.withChronologyRetainFields((org.joda.time.Chronology) gJChronology4);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial11 = partial8.withPeriodAdded(readablePeriod9, (-28800000));
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(partial11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale12 = null;
        int int13 = property10.getMaximumShortTextLength(locale12);
        try {
            org.joda.time.DateTime dateTime15 = property10.addToCopy((-15573948208434L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -15573948208434 * 86400000");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("��:��:��");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"��:��:��\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = dateTime4.toLocalDate();
        org.joda.time.DateTime dateTime14 = dateTime4.minusMinutes(577);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withDate((int) (short) 10, (int) (short) 0, 81);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(81);
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfDay(0, (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        boolean boolean3 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) localDate0);
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = julianChronology0.getZone();
        int int2 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getMinuteOfHour();
        int int5 = dateTime3.getYear();
        org.joda.time.DateTime dateTime7 = dateTime3.plusWeeks(1);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMillis(2512);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime3.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2512 + "'", int5 == 2512);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHour();
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = dateTimeFormatter0.parseMutableDateTime("1970W013");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970W013\" is malformed at \"W013\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 19);
        java.io.Writer writer5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) dateTime10, 1);
        org.joda.time.DateTime dateTime15 = dateTime10.plus((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight16 = dateTime10.toDateMidnight();
        try {
            dateTimeFormatter0.printTo(writer5, (org.joda.time.ReadableInstant) dateMidnight16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withLocale(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
        int int6 = mutableDateTime5.getMillisOfSecond();
        try {
            java.lang.String str8 = mutableDateTime5.toString("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int22 = skipDateTimeField18.get((long) (short) 0);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        int[] intArray24 = localDate23.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str26 = localDate23.toString(dateTimeFormatter25);
        int int27 = localDate23.getYearOfCentury();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        int[] intArray29 = localDate28.getValues();
        int int30 = skipDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray29);
        boolean boolean31 = skipDateTimeField18.isSupported();
        long long33 = skipDateTimeField18.roundCeiling(0L);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "��:��:��" + "'", str26.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 69 + "'", int27 == 69);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(81);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFractionOfMinute(23, 62);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        int int3 = localDate2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate1.withCenturyOfEra(0);
        boolean boolean7 = gJChronology0.equals((java.lang.Object) localDate1);
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate1.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        int[] intArray6 = localDate5.getValues();
        org.joda.time.LocalDate localDate8 = localDate5.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate10 = localDate5.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate12 = localDate5.plusWeeks((int) (byte) 0);
        org.joda.time.LocalDate localDate13 = localDate1.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = buddhistChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = buddhistChronology15.eras();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology23 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = buddhistChronology23.eras();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology23);
        int int26 = dateTime25.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) dateTime25, 1);
        int int29 = dateTime25.getYearOfCentury();
        long long30 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField31 = property20.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField32 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology15, dateTimeField31);
        long long34 = skipDateTimeField32.roundCeiling((long) 62);
        int int36 = skipDateTimeField32.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = skipDateTimeField32.getType();
        org.joda.time.LocalDate localDate39 = localDate1.withField(dateTimeFieldType37, (int) ' ');
        try {
            org.joda.time.DateTimeField dateTimeField41 = localDate1.getField(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(buddhistChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86400000L + "'", long34 == 86400000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = buddhistChronology4.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = buddhistChronology4.eras();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology12 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = buddhistChronology12.eras();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology12);
        int int15 = dateTime14.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) dateTime14, 1);
        int int18 = dateTime14.getYearOfCentury();
        long long19 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeField dateTimeField20 = property9.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField21 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology4, dateTimeField20);
        long long23 = skipDateTimeField21.roundCeiling((long) 62);
        int int24 = skipDateTimeField21.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField25 = skipDateTimeField21.getWrappedField();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        int[] intArray27 = localDate26.getValues();
        org.joda.time.LocalDate localDate29 = localDate26.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate31 = localDate26.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property32 = localDate31.era();
        java.util.Locale locale33 = null;
        java.lang.String str34 = skipDateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDate31, locale33);
        long long36 = buddhistChronology1.set((org.joda.time.ReadablePartial) localDate31, 0L);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        try {
            int[] intArray39 = buddhistChronology1.get(readablePeriod37, (long) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(buddhistChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(buddhistChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 366 + "'", int24 == 366);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "365" + "'", str34.equals("365"));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-77094115622000L) + "'", long36 == (-77094115622000L));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property6 = localDate5.era();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        double double1 = org.joda.time.DateTimeUtils.toJulianDay((-15573948208434L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2260333.4698097915d + "'", double1 == 2260333.4698097915d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime.Property property11 = dateTime9.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime9.plusMonths(100);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        boolean boolean5 = dateTimeZone3.isStandardOffset(10L);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), dateTimeZone3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        java.lang.String str8 = dateTime6.toString(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1970W013" + "'", str8.equals("1970W013"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.Number number5 = illegalFieldValueException4.getIllegalNumberValue();
        java.lang.String str6 = illegalFieldValueException4.getIllegalValueAsString();
        java.lang.Number number7 = illegalFieldValueException4.getIllegalNumberValue();
        java.lang.String str8 = illegalFieldValueException4.getIllegalValueAsString();
        org.junit.Assert.assertTrue("'" + number5 + "' != '" + (short) 10 + "'", number5.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        org.junit.Assert.assertTrue("'" + number7 + "' != '" + (short) 10 + "'", number7.equals((short) 10));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int22 = skipDateTimeField18.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = skipDateTimeField18.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException25 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType23, "15:23:28.966");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType23 };
        java.util.ArrayList<org.joda.time.DateTimeFieldType> dateTimeFieldTypeList27 = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList27, dateTimeFieldTypeArray26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList27, true, true);
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList27, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fields must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = localDate6.toDateMidnight(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        boolean boolean13 = localDate6.equals((java.lang.Object) dateTimeFormatter12);
        org.joda.time.DateTime dateTime14 = localDate6.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDate0.getFieldTypes();
        org.joda.time.LocalDate.Property property6 = localDate0.monthOfYear();
        int int7 = localDate0.size();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = julianChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeUtils.getZone(dateTimeZone1);
        try {
            org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1969");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDate0.getFieldTypes();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int[] intArray7 = localDate6.getValues();
        org.joda.time.Partial partial8 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = partial8.getFormatter();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property11 = localDate10.yearOfCentury();
        java.util.Date date12 = localDate10.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate10.isSupported(dateTimeFieldType13);
        int int15 = partial8.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology17 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = buddhistChronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = buddhistChronology17.eras();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate.Property property22 = localDate21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology25 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = buddhistChronology25.eras();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology25);
        int int28 = dateTime27.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) dateTime27, 1);
        int int31 = dateTime27.getYearOfCentury();
        long long32 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField33 = property22.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField34 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology17, dateTimeField33);
        long long36 = skipDateTimeField34.roundCeiling((long) 62);
        int int37 = skipDateTimeField34.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField38 = skipDateTimeField34.getWrappedField();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        int[] intArray40 = localDate39.getValues();
        org.joda.time.LocalDate localDate42 = localDate39.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate44 = localDate39.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property45 = localDate44.era();
        java.util.Locale locale46 = null;
        java.lang.String str47 = skipDateTimeField34.getAsShortText((org.joda.time.ReadablePartial) localDate44, locale46);
        org.joda.time.LocalDate localDate49 = localDate44.withEra(0);
        int int50 = localDate10.compareTo((org.joda.time.ReadablePartial) localDate44);
        int int51 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buddhistChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(buddhistChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 86400000L + "'", long36 == 86400000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 366 + "'", int37 == 366);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "365" + "'", str47.equals("365"));
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        int int27 = skipUndoDateTimeField24.getMaximumValue((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365 + "'", int27 == 365);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (int) '4', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
        int int6 = mutableDateTime5.getMillisOfSecond();
        int int7 = mutableDateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("GJChronology[UTC]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("923", (-35), 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35 for 923 must be in the range [0,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(12);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.DateMidnight dateMidnight7 = localDate0.toDateMidnight();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime3.withYearOfEra((int) (short) 1);
        int int8 = dateTime3.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay9 = dateTime3.toTimeOfDay();
        int int10 = dateTime3.getHourOfDay();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gJChronology7);
        try {
            long long13 = gJChronology7.getDateTimeMillis(2513, 15, 166, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology26 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology26);
        int int28 = localDate27.getYearOfCentury();
        int[] intArray36 = new int[] { 24, 166, 365, (short) 10, 3, 2562 };
        int[] intArray38 = skipDateTimeField18.add((org.joda.time.ReadablePartial) localDate27, 577, intArray36, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.ISODateTimeFormat.timeParser();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology41 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = buddhistChronology41.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter39.withZone(dateTimeZone42);
        java.lang.String str44 = dateTimeZone42.toString();
        org.joda.time.Interval interval45 = localDate27.toInterval(dateTimeZone42);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(buddhistChronology26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(buddhistChronology41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "America/Los_Angeles" + "'", str44.equals("America/Los_Angeles"));
        org.junit.Assert.assertNotNull(interval45);
    }

//    @Test
//    public void test339() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test339");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
//        boolean boolean4 = dateTimeZone2.isStandardOffset(10L);
//        java.lang.String str6 = dateTimeZone2.getName((long) (short) -1);
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
//        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone2);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeZone2);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Pacific Standard Time" + "'", str6.equals("Pacific Standard Time"));
//    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        org.joda.time.DateTimeField dateTimeField23 = skipDateTimeField18.getWrappedField();
        long long25 = skipDateTimeField18.roundHalfCeiling((long) (byte) 10);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = julianChronology28.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withChronology((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology32 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = buddhistChronology32.weekOfWeekyear();
        org.joda.time.DurationField durationField34 = buddhistChronology32.eras();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.LocalDate.Property property37 = localDate36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology40 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = buddhistChronology40.eras();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology40);
        int int43 = dateTime42.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, (org.joda.time.ReadableInstant) dateTime42, 1);
        int int46 = dateTime42.getYearOfCentury();
        long long47 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeField dateTimeField48 = property37.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField49 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology32, dateTimeField48);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField51 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology28, dateTimeField48, (int) 'a');
        int int52 = skipUndoDateTimeField51.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder53.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder53.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatterBuilder53.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology58 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField59 = buddhistChronology58.weekOfWeekyear();
        org.joda.time.DurationField durationField60 = buddhistChronology58.eras();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology61);
        org.joda.time.LocalDate.Property property63 = localDate62.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology66 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone65);
        org.joda.time.DurationField durationField67 = buddhistChronology66.eras();
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology66);
        int int69 = dateTime68.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone64, (org.joda.time.ReadableInstant) dateTime68, 1);
        int int72 = dateTime68.getYearOfCentury();
        long long73 = property63.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTimeField dateTimeField74 = property63.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField75 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology58, dateTimeField74);
        long long77 = skipDateTimeField75.roundCeiling((long) 62);
        int int79 = skipDateTimeField75.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = skipDateTimeField75.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException82 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType80, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder53.appendText(dateTimeFieldType80);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField85 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField51, dateTimeFieldType80, (int) (byte) 100);
        org.joda.time.ReadablePartial readablePartial86 = null;
        org.joda.time.LocalDate localDate87 = new org.joda.time.LocalDate();
        int[] intArray88 = localDate87.getValues();
        int int89 = remainderDateTimeField85.getMaximumValue(readablePartial86, intArray88);
        int int90 = skipDateTimeField18.getMinimumValue(readablePartial26, intArray88);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(buddhistChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(buddhistChronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 16 + "'", int43 == 16);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(buddhistChronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(buddhistChronology66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 16 + "'", int69 == 16);
        org.junit.Assert.assertNotNull(gJChronology71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 12 + "'", int72 == 12);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 86400000L + "'", long77 == 86400000L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 99 + "'", int89 == 99);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        int int3 = dateTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        int int3 = mutableDateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        java.lang.String str63 = remainderDateTimeField58.getAsShortText(14L);
        int int64 = remainderDateTimeField58.getDivisor();
        int int67 = remainderDateTimeField58.getDifference(0L, (-15573948208434L));
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate();
        java.util.Date date69 = localDate68.toDate();
        org.joda.time.LocalDate localDate71 = localDate68.plusYears(10);
        int[] intArray72 = null;
        int int73 = remainderDateTimeField58.getMinimumValue((org.joda.time.ReadablePartial) localDate68, intArray72);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "2" + "'", str63.equals("2"));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 180254 + "'", int67 == 180254);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '32' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate7 = localDate0.plusYears(26);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.LocalDate localDate8 = localDate6.plusMonths(1);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.io.InputStream inputStream0 = null;
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "org.joda.time.IllegalInstantException: Illegal instant due to time zone offset transition (daylight savings time 'gap'): 1970-01-01T00:00:00.010 (hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime9.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.DateTime dateTime13 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = buddhistChronology15.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime11.minus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        int int22 = dateTime11.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2512 + "'", int22 == 2512);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        long long7 = buddhistChronology2.add((long) 1, (long) 23, (int) (short) 0);
        org.joda.time.DurationField durationField8 = buddhistChronology2.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 24, (org.joda.time.Chronology) buddhistChronology2);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.yearOfEra();
        org.joda.time.Partial partial8 = partial0.withChronologyRetainFields((org.joda.time.Chronology) gJChronology4);
        org.joda.time.Chronology chronology9 = partial8.getChronology();
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfYear();
        int int8 = property7.get();
        org.joda.time.LocalDate localDate9 = property7.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology63 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = buddhistChronology63.weekOfWeekyear();
        org.joda.time.DurationField durationField65 = buddhistChronology63.eras();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(chronology66);
        org.joda.time.LocalDate.Property property68 = localDate67.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology71 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = buddhistChronology71.eras();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology71);
        int int74 = dateTime73.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, (org.joda.time.ReadableInstant) dateTime73, 1);
        int int77 = dateTime73.getYearOfCentury();
        long long78 = property68.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeField dateTimeField79 = property68.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField80 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology63, dateTimeField79);
        long long82 = skipDateTimeField80.roundCeiling((long) 62);
        int int83 = skipDateTimeField80.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField84 = skipDateTimeField80.getWrappedField();
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate();
        int[] intArray86 = localDate85.getValues();
        org.joda.time.LocalDate localDate88 = localDate85.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate90 = localDate85.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property91 = localDate90.era();
        java.util.Locale locale92 = null;
        java.lang.String str93 = skipDateTimeField80.getAsShortText((org.joda.time.ReadablePartial) localDate90, locale92);
        int int94 = remainderDateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) localDate90);
        long long96 = remainderDateTimeField58.roundHalfCeiling((long) '#');
        org.joda.time.DateTimeField dateTimeField97 = remainderDateTimeField58.getWrappedField();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertNotNull(buddhistChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(buddhistChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 16 + "'", int74 == 16);
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 12 + "'", int77 == 12);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 86400000L + "'", long82 == 86400000L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 366 + "'", int83 == 366);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNotNull(localDate88);
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "365" + "'", str93.equals("365"));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 99 + "'", int94 == 99);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField97);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.weekyear();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology5);
        boolean boolean7 = property4.equals((java.lang.Object) dateTime6);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int21 = skipDateTimeField18.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField22 = skipDateTimeField18.getWrappedField();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        int[] intArray24 = localDate23.getValues();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate28 = localDate23.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property29 = localDate28.era();
        java.util.Locale locale30 = null;
        java.lang.String str31 = skipDateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDate28, locale30);
        org.joda.time.LocalDate.Property property32 = localDate28.yearOfCentury();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "365" + "'", str31.equals("365"));
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(100L);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = localDate6.toDateMidnight(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        boolean boolean13 = localDate6.equals((java.lang.Object) dateTimeFormatter12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        try {
            int int15 = localDate6.compareTo(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        java.lang.String str63 = remainderDateTimeField58.getAsShortText(14L);
        int int64 = remainderDateTimeField58.getDivisor();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        int[] intArray66 = localDate65.getValues();
        org.joda.time.LocalDate localDate68 = localDate65.plusYears((int) (short) -1);
        java.util.Date date69 = localDate68.toDate();
        org.joda.time.LocalDate localDate71 = localDate68.withYearOfEra((int) '4');
        java.util.Locale locale73 = null;
        java.lang.String str74 = remainderDateTimeField58.getAsText((org.joda.time.ReadablePartial) localDate68, 923, locale73);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "2" + "'", str63.equals("2"));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "923" + "'", str74.equals("923"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        java.util.Locale locale24 = null;
        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
        long long27 = skipDateTimeField18.remainder((long) 923);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate.Property property30 = localDate29.dayOfYear();
        java.util.Locale locale32 = null;
        java.lang.String str33 = skipDateTimeField18.getAsText((org.joda.time.ReadablePartial) localDate29, 366, locale32);
        java.util.Locale locale36 = null;
        try {
            long long37 = skipDateTimeField18.set(100L, "15:23:32.185", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"15:23:32.185\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 923L + "'", long27 == 923L);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "366" + "'", str33.equals("366"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate1.getFieldType(2019);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2019");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.weekyear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("��:��:��.000");
        java.lang.String str2 = jodaTimePermission1.getActions();
        java.lang.String str3 = jodaTimePermission1.getActions();
        java.lang.String str4 = jodaTimePermission1.getName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology3 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = buddhistChronology3.eras();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology3);
        int int6 = dateTime5.getHourOfDay();
        org.joda.time.DateTime dateTime7 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        java.lang.String str9 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime11 = dateTime5.plusMonths(16);
        int int12 = dateTime11.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(buddhistChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2513-W01-3T16:00:00.035-08:00" + "'", str9.equals("2513-W01-3T16:00:00.035-08:00"));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2514 + "'", int12 == 2514);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology2.getZone();
        org.joda.time.DateTime dateTime4 = dateTime1.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusDays(0);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) '4');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-28799938L));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        java.lang.Number number2 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(durationFieldType0, (java.lang.Number) (-1.0d), number2, (java.lang.Number) 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getHourOfDay();
        int int5 = dateTime3.getYear();
        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(0);
        org.joda.time.DateTime dateTime9 = dateTime7.withSecondOfMinute(15);
        org.joda.time.DateTime dateTime11 = dateTime7.withDayOfWeek(4);
        int int12 = dateTime11.getDayOfWeek();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2512 + "'", int5 == 2512);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        java.util.Locale locale24 = null;
        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
        long long27 = skipDateTimeField18.remainder((long) 923);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate.Property property30 = localDate29.dayOfYear();
        java.util.Locale locale32 = null;
        java.lang.String str33 = skipDateTimeField18.getAsText((org.joda.time.ReadablePartial) localDate29, 366, locale32);
        long long36 = skipDateTimeField18.getDifferenceAsLong((long) 26, 10L);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 923L + "'", long27 == 923L);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "366" + "'", str33.equals("366"));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.weekyear();
        org.joda.time.LocalDate localDate5 = property4.withMinimumValue();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.year();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DurationField durationField4 = buddhistChronology1.halfdays();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(durationFieldType0, "GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:54.246Z,mdfw=1]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.era();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        try {
            int[] intArray7 = buddhistChronology1.get(readablePeriod4, (long) 23, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
        int int26 = skipDateTimeField18.getLeapAmount((long) (short) 1);
        java.util.Locale locale28 = null;
        java.lang.String str29 = skipDateTimeField18.getAsShortText(28800035L, locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        int[] intArray32 = localDate31.getValues();
        org.joda.time.Partial partial33 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate31);
        java.lang.String str34 = dateTimeFormatter30.print((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate31.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.dayOfYear();
        org.joda.time.LocalDate localDate39 = localDate36.withYear(586);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology41 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = buddhistChronology41.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatterBuilder43.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology48 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = buddhistChronology48.weekOfWeekyear();
        org.joda.time.DurationField durationField50 = buddhistChronology48.eras();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology56 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField57 = buddhistChronology56.eras();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology56);
        int int59 = dateTime58.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, (org.joda.time.ReadableInstant) dateTime58, 1);
        int int62 = dateTime58.getYearOfCentury();
        long long63 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeField dateTimeField64 = property53.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField65 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology48, dateTimeField64);
        long long67 = skipDateTimeField65.roundCeiling((long) 62);
        int int69 = skipDateTimeField65.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = skipDateTimeField65.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException72 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType70, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder43.appendText(dateTimeFieldType70);
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField74 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField42, dateTimeFieldType70);
        org.joda.time.LocalDate.Property property75 = localDate36.property(dateTimeFieldType70);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField79 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, dateTimeFieldType70, 166, (int) 'a', 99);
        try {
            long long82 = offsetDateTimeField79.set((long) 2, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6 for dayOfYear must be in the range [167,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "1" + "'", str29.equals("1"));
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "��:��:��.000" + "'", str34.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(buddhistChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(buddhistChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(buddhistChronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 16 + "'", int59 == 16);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 12 + "'", int62 == 12);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 86400000L + "'", long67 == 86400000L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(property75);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        boolean boolean5 = dateTimeZone3.isStandardOffset(10L);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), dateTimeZone3);
        long long8 = dateTimeZone3.convertUTCToLocal((long) 62);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28799938L) + "'", long8 == (-28799938L));
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMillisOfDay(2512);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        try {
            long long61 = skipUndoDateTimeField24.set((-48L), 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfYear must be in the range [2,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        try {
            org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime4.minusMonths((int) '4');
        java.util.GregorianCalendar gregorianCalendar14 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = dateTime4.isSupported(dateTimeFieldType15);
        int int17 = dateTime4.getYearOfCentury();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology2.getZone();
        org.joda.time.DateTime dateTime4 = dateTime1.withZoneRetainFields(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(62);
        int int7 = dateTime1.getDayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(4, 4, 3, 0, 3, 0, 19);
        java.lang.Class<?> wildcardClass8 = dateTime7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        java.lang.String str2 = dateTimeFormatter0.print(100L);
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter0.parseLocalDate("365");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"365\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1969-12-31T16:00:00.100-08:00" + "'", str2.equals("1969-12-31T16:00:00.100-08:00"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.weekyear();
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDate0.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        int[] intArray6 = localDate5.getValues();
        org.joda.time.LocalDate localDate8 = localDate5.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate10 = localDate5.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate12 = localDate5.plusWeeks((int) (byte) 0);
        org.joda.time.LocalDate localDate13 = localDate1.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = buddhistChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = buddhistChronology15.eras();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology23 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = buddhistChronology23.eras();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology23);
        int int26 = dateTime25.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) dateTime25, 1);
        int int29 = dateTime25.getYearOfCentury();
        long long30 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField31 = property20.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField32 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology15, dateTimeField31);
        long long34 = skipDateTimeField32.roundCeiling((long) 62);
        int int36 = skipDateTimeField32.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = skipDateTimeField32.getType();
        org.joda.time.LocalDate localDate39 = localDate1.withField(dateTimeFieldType37, (int) ' ');
        org.joda.time.DateMidnight dateMidnight40 = localDate1.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(buddhistChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86400000L + "'", long34 == 86400000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateMidnight40);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfMinute();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        long long24 = skipDateTimeField22.roundCeiling((long) 62);
        int int26 = skipDateTimeField22.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = skipDateTimeField22.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException29 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 86400000L + "'", long24 == 86400000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears(4);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = buddhistChronology10.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = buddhistChronology10.eras();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate.Property property15 = localDate14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology18 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = buddhistChronology18.eras();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology18);
        int int21 = dateTime20.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, (org.joda.time.ReadableInstant) dateTime20, 1);
        int int24 = dateTime20.getYearOfCentury();
        long long25 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeField dateTimeField26 = property15.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology10, dateTimeField26);
        long long29 = skipDateTimeField27.roundCeiling((long) 62);
        int int31 = skipDateTimeField27.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = skipDateTimeField27.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException34 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType32, "15:23:28.966");
        try {
            org.joda.time.LocalDate localDate36 = localDate8.withField(dateTimeFieldType32, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(buddhistChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(buddhistChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 86400000L + "'", long29 == 86400000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
        int int11 = dateTime7.getYearOfCentury();
        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
        int int18 = dateTime17.getHourOfDay();
        int int19 = dateTime17.getWeekyear();
        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property21 = dateTime17.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2513 + "'", int19 == 2513);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendTwoDigitWeekyear((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder1.appendHourOfDay(62);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendFractionOfHour(6, 166);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusDays((int) (short) 100);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial2.getFormatter();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        java.util.Date date6 = localDate4.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        int int9 = partial2.compareTo((org.joda.time.ReadablePartial) localDate4);
        org.joda.time.Chronology chronology10 = localDate4.getChronology();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.withCenturyOfEra(81);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(4);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed((long) 586);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Partial partial5 = partial0.plus(readablePeriod4);
        java.lang.String str6 = partial0.toStringList();
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(partial5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(24);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.ClassLoader classLoader1 = null;
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("2513-W01-3T16:00:00.035-08:00", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"2513-W01-3T16:00:00.035-08:00/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        }
    }

//    @Test
//    public void test404() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test404");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
//        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
//        org.joda.time.DateTimeZone dateTimeZone4 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
//        org.joda.time.DateTimeZone dateTimeZone6 = buddhistChronology5.getZone();
//        boolean boolean8 = dateTimeZone6.isStandardOffset(10L);
//        java.lang.String str10 = dateTimeZone6.getName((long) (short) -1);
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
//        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6, 1);
//        org.joda.time.chrono.BuddhistChronology buddhistChronology14 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone6);
//        org.joda.time.Chronology chronology15 = buddhistChronology1.withZone(dateTimeZone6);
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(durationField2);
//        org.junit.Assert.assertNotNull(dateTimeField3);
//        org.junit.Assert.assertNotNull(buddhistChronology5);
//        org.junit.Assert.assertNotNull(dateTimeZone6);
//        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
//        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Pacific Standard Time" + "'", str10.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(julianChronology13);
//        org.junit.Assert.assertNotNull(buddhistChronology14);
//        org.junit.Assert.assertNotNull(chronology15);
//    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfEra();
        org.joda.time.field.SkipDateTimeField skipDateTimeField7 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) gJChronology0, dateTimeField6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = buddhistChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = buddhistChronology9.eras();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology17 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = buddhistChronology17.eras();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology17);
        int int20 = dateTime19.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) dateTime19, 1);
        int int23 = dateTime19.getYearOfCentury();
        long long24 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeField dateTimeField25 = property14.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField26 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology9, dateTimeField25);
        long long28 = skipDateTimeField26.roundCeiling((long) 62);
        int int30 = skipDateTimeField26.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = skipDateTimeField26.getType();
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField33 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) skipDateTimeField7, dateTimeFieldType31, (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The divisor must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(buddhistChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 86400000L + "'", long28 == 86400000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField2 = gJChronology0.hours();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        try {
            org.joda.time.field.ScaledDurationField scaledDurationField5 = new org.joda.time.field.ScaledDurationField(durationField2, durationFieldType3, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("32");
        org.joda.time.IllegalInstantException illegalInstantException3 = new org.joda.time.IllegalInstantException("32");
        illegalInstantException1.addSuppressed((java.lang.Throwable) illegalInstantException3);
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException("hi!", (java.lang.Number) (short) 10, (java.lang.Number) 10.0f, (java.lang.Number) 1L);
        java.lang.Number number10 = illegalFieldValueException9.getIllegalNumberValue();
        java.lang.Number number11 = illegalFieldValueException9.getLowerBound();
        illegalFieldValueException9.prependMessage("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:28.217Z,mdfw=1]");
        illegalInstantException1.addSuppressed((java.lang.Throwable) illegalFieldValueException9);
        org.junit.Assert.assertTrue("'" + number10 + "' != '" + (short) 10 + "'", number10.equals((short) 10));
        org.junit.Assert.assertTrue("'" + number11 + "' != '" + 10.0f + "'", number11.equals(10.0f));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = buddhistChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = buddhistChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(buddhistChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendYearOfEra((int) '#', 2512);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder5.appendCenturyOfEra(19, 586);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendCenturyOfEra(365, 100);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatterBuilder16.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder5.appendOptional(dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser17);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
        int int26 = skipDateTimeField18.getLeapAmount((long) (short) 1);
        java.util.Locale locale28 = null;
        java.lang.String str29 = skipDateTimeField18.getAsShortText(28800035L, locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        int[] intArray32 = localDate31.getValues();
        org.joda.time.Partial partial33 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate31);
        java.lang.String str34 = dateTimeFormatter30.print((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate31.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.dayOfYear();
        org.joda.time.LocalDate localDate39 = localDate36.withYear(586);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology41 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = buddhistChronology41.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatterBuilder43.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology48 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = buddhistChronology48.weekOfWeekyear();
        org.joda.time.DurationField durationField50 = buddhistChronology48.eras();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology56 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField57 = buddhistChronology56.eras();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology56);
        int int59 = dateTime58.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, (org.joda.time.ReadableInstant) dateTime58, 1);
        int int62 = dateTime58.getYearOfCentury();
        long long63 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeField dateTimeField64 = property53.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField65 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology48, dateTimeField64);
        long long67 = skipDateTimeField65.roundCeiling((long) 62);
        int int69 = skipDateTimeField65.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = skipDateTimeField65.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException72 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType70, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder43.appendText(dateTimeFieldType70);
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField74 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField42, dateTimeFieldType70);
        org.joda.time.LocalDate.Property property75 = localDate36.property(dateTimeFieldType70);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField79 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, dateTimeFieldType70, 166, (int) 'a', 99);
        long long81 = offsetDateTimeField79.roundCeiling(10L);
        try {
            long long84 = offsetDateTimeField79.set(28800003L, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [167,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "1" + "'", str29.equals("1"));
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "��:��:��.000" + "'", str34.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(buddhistChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(buddhistChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(buddhistChronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 16 + "'", int59 == 16);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 12 + "'", int62 == 12);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 86400000L + "'", long67 == 86400000L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 86400000L + "'", long81 == 86400000L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withLocale(locale2);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYear();
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1969 + "'", int1 == 1969);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = dateTime1.toMutableDateTimeISO();
        boolean boolean3 = mutableDateTime2.isEqualNow();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.joda.time.DateTimeUtils.setCurrentMillisFixed(28800035L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str6 = dateTimeFormatter0.print((long) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime.Property property12 = dateTime10.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "16:00:00.100" + "'", str6.equals("16:00:00.100"));
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00:00:00.035" + "'", str11.equals("00:00:00.035"));
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendCenturyOfEra(365, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = buddhistChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        java.util.Locale locale24 = null;
        java.lang.String str25 = skipDateTimeField18.getAsShortText((int) (short) 0, locale24);
        long long28 = skipDateTimeField18.addWrapField((long) 3, (int) (byte) 0);
        boolean boolean29 = skipDateTimeField18.isSupported();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0" + "'", str25.equals("0"));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology6 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = buddhistChronology6.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = buddhistChronology6.eras();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology14 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = buddhistChronology14.eras();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology14);
        int int17 = dateTime16.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) dateTime16, 1);
        int int20 = dateTime16.getYearOfCentury();
        long long21 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeField dateTimeField22 = property11.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField23 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology6, dateTimeField22);
        long long25 = skipDateTimeField23.roundCeiling((long) 62);
        int int27 = skipDateTimeField23.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = skipDateTimeField23.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException30 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType28, "15:23:28.966");
        boolean boolean31 = localDate0.isSupported(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(buddhistChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(buddhistChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 86400000L + "'", long25 == 86400000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
        int int26 = skipDateTimeField18.getLeapAmount((long) (short) 1);
        java.util.Locale locale28 = null;
        java.lang.String str29 = skipDateTimeField18.getAsShortText(28800035L, locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        int[] intArray32 = localDate31.getValues();
        org.joda.time.Partial partial33 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate31);
        java.lang.String str34 = dateTimeFormatter30.print((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate31.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.dayOfYear();
        org.joda.time.LocalDate localDate39 = localDate36.withYear(586);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology41 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = buddhistChronology41.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatterBuilder43.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology48 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = buddhistChronology48.weekOfWeekyear();
        org.joda.time.DurationField durationField50 = buddhistChronology48.eras();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.LocalDate.Property property53 = localDate52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology56 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField57 = buddhistChronology56.eras();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology56);
        int int59 = dateTime58.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54, (org.joda.time.ReadableInstant) dateTime58, 1);
        int int62 = dateTime58.getYearOfCentury();
        long long63 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeField dateTimeField64 = property53.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField65 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology48, dateTimeField64);
        long long67 = skipDateTimeField65.roundCeiling((long) 62);
        int int69 = skipDateTimeField65.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = skipDateTimeField65.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException72 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType70, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder43.appendText(dateTimeFieldType70);
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField74 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField42, dateTimeFieldType70);
        org.joda.time.LocalDate.Property property75 = localDate36.property(dateTimeFieldType70);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField79 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) skipDateTimeField18, dateTimeFieldType70, 166, (int) 'a', 99);
        long long81 = offsetDateTimeField79.roundCeiling(10L);
        boolean boolean83 = offsetDateTimeField79.isLeap((long) 2562);
        long long85 = offsetDateTimeField79.roundHalfEven((long) 3);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "1" + "'", str29.equals("1"));
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "��:��:��.000" + "'", str34.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(buddhistChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(buddhistChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(buddhistChronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 13 + "'", int62 == 13);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 86400000L + "'", long67 == 86400000L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 86400000L + "'", long81 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate1.plus(readablePeriod5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.DateTime dateTime13 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = buddhistChronology15.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime11.minus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        int int22 = dateTime11.getMillisOfSecond();
        int int23 = dateTime11.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
        int int7 = dateTime6.getHourOfDay();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = buddhistChronology10.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = dateTime6.toLocalDate();
        boolean boolean15 = copticChronology1.equals((java.lang.Object) localDate14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        int[] intArray17 = localDate16.getValues();
        org.joda.time.LocalDate localDate19 = localDate16.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate21 = localDate16.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property22 = localDate21.era();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.lang.String str24 = gregorianChronology23.toString();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology30 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = buddhistChronology30.eras();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology30);
        int int33 = dateTime32.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) dateTime32, 1);
        int int36 = dateTime32.getYearOfCentury();
        long long37 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeField dateTimeField38 = property27.getField();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology40 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone39);
        org.joda.time.DurationField durationField41 = buddhistChronology40.eras();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology40);
        int int43 = dateTime42.getHourOfDay();
        int int44 = dateTime42.getWeekyear();
        long long45 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property27.getMinimumValueOverall();
        java.lang.String str47 = property27.toString();
        org.joda.time.LocalDate localDate48 = property27.roundHalfFloorCopy();
        int[] intArray50 = gregorianChronology23.get((org.joda.time.ReadablePartial) localDate48, (long) 26);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDate21, intArray50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(buddhistChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(buddhistChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "GregorianChronology[UTC]" + "'", str24.equals("GregorianChronology[UTC]"));
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(buddhistChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13 + "'", int36 == 13);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(buddhistChronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2513 + "'", int44 == 2513);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Property[dayOfYear]" + "'", str47.equals("Property[dayOfYear]"));
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(dateTimeField52);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear(81);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendMillisOfDay(1969);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = buddhistChronology2.getZone();
        boolean boolean5 = dateTimeZone3.isStandardOffset(10L);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (-1), dateTimeZone3);
        long long9 = dateTimeZone3.adjustOffset((long) 2, true);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str6 = dateTimeFormatter0.print((long) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology14 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = buddhistChronology14.eras();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology14);
        int int17 = dateTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localDate12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readableDuration19);
        boolean boolean21 = org.joda.time.field.FieldUtils.equals((java.lang.Object) str11, (java.lang.Object) dateTime18);
        int int22 = dateTime18.getYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "16:00:00.100" + "'", str6.equals("16:00:00.100"));
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00:00:00.035" + "'", str11.equals("00:00:00.035"));
        org.junit.Assert.assertNotNull(buddhistChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendFractionOfDay(100, 62);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendSecondOfDay((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        long long24 = skipDateTimeField22.roundCeiling((long) 62);
        int int26 = skipDateTimeField22.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = skipDateTimeField22.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException29 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendFractionOfMinute(12, 2513);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 86400000L + "'", long24 == 86400000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
        int int11 = dateTime7.getYearOfCentury();
        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
        int int18 = dateTime17.getHourOfDay();
        int int19 = dateTime17.getWeekyear();
        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        int int21 = property2.getMinimumValueOverall();
        org.joda.time.LocalDate localDate22 = property2.withMaximumValue();
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology26 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = buddhistChronology26.eras();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology26);
        int int29 = dateTime28.getHourOfDay();
        org.joda.time.DateTime dateTime30 = localDate24.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology32 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = buddhistChronology32.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = dateTime28.toLocalDate();
        int int37 = localDate36.getYearOfEra();
        int int38 = property23.compareTo((org.joda.time.ReadablePartial) localDate36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2513 + "'", int19 == 2513);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(buddhistChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(buddhistChronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2513 + "'", int37 == 2513);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(62, 577);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendWeekOfWeekyear(69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
        int int11 = dateTime7.getYearOfCentury();
        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
        int int18 = dateTime17.getHourOfDay();
        int int19 = dateTime17.getWeekyear();
        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime22 = dateTime17.withMinuteOfHour((int) (short) 0);
        int int23 = dateTime17.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2513 + "'", int19 == 2513);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int[] intArray7 = localDate6.getValues();
        org.joda.time.Partial partial8 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = partial8.getFormatter();
        java.lang.String str10 = dateTime3.toString(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "2513-01-01" + "'", str10.equals("2513-01-01"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        java.lang.String str8 = gJChronology7.toString();
        org.joda.time.Chronology chronology9 = gJChronology7.withUTC();
        org.joda.time.Instant instant10 = gJChronology7.getGregorianCutover();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "GJChronology[America/Los_Angeles,cutover=1970-01-01T08:00:00.035Z,mdfw=1]" + "'", str8.equals("GJChronology[America/Los_Angeles,cutover=1970-01-01T08:00:00.035Z,mdfw=1]"));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime();
        int int10 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.String str12 = mutableDateTime9.toString("12");
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-28800000) + "'", int10 == (-28800000));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "12" + "'", str12.equals("12"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        long long27 = skipUndoDateTimeField24.roundHalfCeiling((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime();
        int int10 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) mutableDateTime9);
        try {
            org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 12");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-28800000) + "'", int10 == (-28800000));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
        int int11 = dateTime7.getYearOfCentury();
        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField13 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = buddhistChronology15.eras();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology15);
        int int18 = dateTime17.getHourOfDay();
        int int19 = dateTime17.getWeekyear();
        long long20 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str21 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2513 + "'", int19 == 2513);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Property[dayOfYear]" + "'", str21.equals("Property[dayOfYear]"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.DateTimeField dateTimeField4 = buddhistChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = buddhistChronology5.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology5);
        int int8 = dateTime7.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant) dateTime7, 1);
        int int11 = dateTime7.getYearOfCentury();
        long long12 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        int int13 = property2.getMaximumValue();
        org.joda.time.LocalDate localDate14 = property2.getLocalDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 365 + "'", int13 == 365);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        java.lang.String str1 = gregorianChronology0.toString();
        org.joda.time.Chronology chronology2 = gregorianChronology0.withUTC();
        try {
            long long10 = gregorianChronology0.getDateTimeMillis(2514, 70, 62, 2019, 12, 62, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2019 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GregorianChronology[UTC]" + "'", str1.equals("GregorianChronology[UTC]"));
        org.junit.Assert.assertNotNull(chronology2);
    }

//    @Test
//    public void test447() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test447");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
//        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
//        boolean boolean4 = dateTimeZone2.isStandardOffset(10L);
//        java.lang.String str6 = dateTimeZone2.getName((long) (short) -1);
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
//        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2, 1);
//        try {
//            long long17 = julianChronology9.getDateTimeMillis(15, 24, (int) (short) 0, 577, 2513, (int) (byte) 0, 12);
//            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 577 for hourOfDay must be in the range [0,23]");
//        } catch (org.joda.time.IllegalFieldValueException e) {
//        }
//        org.junit.Assert.assertNotNull(buddhistChronology1);
//        org.junit.Assert.assertNotNull(dateTimeZone2);
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
//        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Pacific Standard Time" + "'", str6.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(julianChronology9);
//    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        java.lang.String str63 = remainderDateTimeField58.getAsShortText(14L);
        java.util.Locale locale65 = null;
        java.lang.String str66 = remainderDateTimeField58.getAsShortText(923, locale65);
        org.joda.time.DurationField durationField67 = remainderDateTimeField58.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "2" + "'", str63.equals("2"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "923" + "'", str66.equals("923"));
        org.junit.Assert.assertNull(durationField67);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.Partial partial2 = partial0.minus(readablePeriod1);
        int int3 = partial0.size();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology4.yearOfEra();
        org.joda.time.Partial partial8 = partial0.withChronologyRetainFields((org.joda.time.Chronology) gJChronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = partial8.getFieldTypes();
        try {
            int int11 = partial8.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(partial2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(partial8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Chronology chronology2 = iSOChronology0.withZone(dateTimeZone1);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        long long24 = skipDateTimeField22.roundCeiling((long) 62);
        int int26 = skipDateTimeField22.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = skipDateTimeField22.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException29 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendDayOfWeek(12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 86400000L + "'", long24 == 86400000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '10' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = buddhistChronology1.getZone();
        long long6 = buddhistChronology1.add((long) 1, (long) 23, (int) (short) 0);
        org.joda.time.DurationField durationField7 = buddhistChronology1.seconds();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(62, 577);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendYearOfEra(1, 2019);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getYear();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology3 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = buddhistChronology3.eras();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology3);
        int int6 = dateTime5.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime5, readableInstant8);
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        try {
            org.joda.time.DateTime dateTime11 = localDate0.toDateTime(localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1970 + "'", int1 == 1970);
        org.junit.Assert.assertNotNull(buddhistChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        org.joda.time.Interval interval4 = localDate0.toInterval();
        java.lang.Class<?> wildcardClass5 = localDate0.getClass();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        java.util.Date date8 = localDate6.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        int int11 = localDate6.getWeekyear();
        int int12 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate6);
        java.lang.String str13 = localDate0.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "1970-01-01" + "'", str13.equals("1970-01-01"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        java.util.Date date9 = dateTime8.toDate();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org.joda.time.IllegalFieldValueException: Value 10 for hi! must be in the range [10.0,1]", "[year=1969, monthOfYear=12, dayOfMonth=31]", 923, 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 923 + "'", int6 == 923);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        boolean boolean7 = dateTime4.isBeforeNow();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale12 = null;
        int int13 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime15 = property10.addToCopy((long) (byte) 0);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((org.joda.time.Chronology) gJChronology0);
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.yearOfEra();
        java.lang.String str3 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GJChronology[UTC]" + "'", str3.equals("GJChronology[UTC]"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        java.lang.String str3 = property2.getName();
        org.joda.time.LocalDate localDate5 = property2.addToCopy(23);
        java.util.Locale locale7 = null;
        try {
            java.lang.String str8 = localDate5.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "dayOfYear" + "'", str3.equals("dayOfYear"));
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime4.minus(readablePeriod12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology14.getZone();
        org.joda.time.DateTime dateTime16 = dateTime13.toDateTime(dateTimeZone15);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 15, 28800003L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 432000045 + "'", int2 == 432000045);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate4 = localDate1.plusDays(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((org.joda.time.Chronology) buddhistChronology1);
        int int4 = localDate3.getMonthOfYear();
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int22 = skipDateTimeField18.get((long) (short) 0);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        int[] intArray24 = localDate23.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str26 = localDate23.toString(dateTimeFormatter25);
        int int27 = localDate23.getYearOfCentury();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        int[] intArray29 = localDate28.getValues();
        int int30 = skipDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray29);
        boolean boolean31 = skipDateTimeField18.isSupported();
        long long34 = skipDateTimeField18.addWrapField(0L, 2019);
        java.util.Locale locale36 = null;
        java.lang.String str37 = skipDateTimeField18.getAsText(62, locale36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        int[] intArray39 = localDate38.getValues();
        org.joda.time.Partial partial40 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology42 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = buddhistChronology42.weekOfWeekyear();
        org.joda.time.DurationField durationField44 = buddhistChronology42.eras();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.LocalDate.Property property47 = localDate46.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology50 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField51 = buddhistChronology50.eras();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology50);
        int int53 = dateTime52.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48, (org.joda.time.ReadableInstant) dateTime52, 1);
        int int56 = dateTime52.getYearOfCentury();
        long long57 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeField dateTimeField58 = property47.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField59 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology42, dateTimeField58);
        long long61 = skipDateTimeField59.roundCeiling((long) 62);
        int int62 = skipDateTimeField59.getMaximumValue();
        int int64 = skipDateTimeField59.getMaximumValue(0L);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        int[] intArray66 = localDate65.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str68 = localDate65.toString(dateTimeFormatter67);
        org.joda.time.Interval interval69 = localDate65.toInterval();
        java.lang.Class<?> wildcardClass70 = localDate65.getClass();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property72 = localDate71.yearOfCentury();
        java.util.Date date73 = localDate71.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        boolean boolean75 = localDate71.isSupported(dateTimeFieldType74);
        int int76 = localDate71.getWeekyear();
        int int77 = localDate65.compareTo((org.joda.time.ReadablePartial) localDate71);
        int[] intArray83 = new int[] { (-28800000), 577, '#', 2562, '#' };
        int int84 = skipDateTimeField59.getMaximumValue((org.joda.time.ReadablePartial) localDate71, intArray83);
        int int85 = skipDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localDate38, intArray83);
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "��:��:��" + "'", str26.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 70 + "'", int27 == 70);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 365 + "'", int30 == 365);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 16761600000L + "'", long34 == 16761600000L);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "62" + "'", str37.equals("62"));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(buddhistChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(buddhistChronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 13 + "'", int56 == 13);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 86400000L + "'", long61 == 86400000L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 366 + "'", int62 == 366);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 365 + "'", int64 == 365);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "��:��:��" + "'", str68.equals("��:��:��"));
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1970 + "'", int76 == 1970);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 366 + "'", int84 == 366);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        long long22 = skipDateTimeField18.roundHalfFloor((long) 1);
        int int24 = skipDateTimeField18.getMinimumValue((long) 577);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology26 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now((org.joda.time.Chronology) buddhistChronology26);
        int int28 = localDate27.getYearOfCentury();
        int[] intArray36 = new int[] { 24, 166, 365, (short) 10, 3, 2562 };
        int[] intArray38 = skipDateTimeField18.add((org.joda.time.ReadablePartial) localDate27, 577, intArray36, 0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = localDate27.toDateMidnight(dateTimeZone39);
        int int41 = localDate27.getDayOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(buddhistChronology26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology63 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField64 = buddhistChronology63.weekOfWeekyear();
        org.joda.time.DurationField durationField65 = buddhistChronology63.eras();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(chronology66);
        org.joda.time.LocalDate.Property property68 = localDate67.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology71 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = buddhistChronology71.eras();
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology71);
        int int74 = dateTime73.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, (org.joda.time.ReadableInstant) dateTime73, 1);
        int int77 = dateTime73.getYearOfCentury();
        long long78 = property68.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTimeField dateTimeField79 = property68.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField80 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology63, dateTimeField79);
        long long82 = skipDateTimeField80.roundCeiling((long) 62);
        int int83 = skipDateTimeField80.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField84 = skipDateTimeField80.getWrappedField();
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate();
        int[] intArray86 = localDate85.getValues();
        org.joda.time.LocalDate localDate88 = localDate85.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate90 = localDate85.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property91 = localDate90.era();
        java.util.Locale locale92 = null;
        java.lang.String str93 = skipDateTimeField80.getAsShortText((org.joda.time.ReadablePartial) localDate90, locale92);
        int int94 = remainderDateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) localDate90);
        long long97 = remainderDateTimeField58.addWrapField((long) '4', 4);
        boolean boolean99 = remainderDateTimeField58.isLeap((-28797488L));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertNotNull(buddhistChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(buddhistChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 13 + "'", int77 == 13);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 86400000L + "'", long82 == 86400000L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 366 + "'", int83 == 366);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNotNull(localDate88);
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "1" + "'", str93.equals("1"));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 99 + "'", int94 == 99);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 345600052L + "'", long97 == 345600052L);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withChronology(chronology1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        java.lang.String str63 = remainderDateTimeField58.getAsShortText(14L);
        int int64 = remainderDateTimeField58.getDivisor();
        int int67 = remainderDateTimeField58.getDifference(0L, (-15573948208434L));
        long long69 = remainderDateTimeField58.roundHalfEven(0L);
        try {
            long long72 = remainderDateTimeField58.set((long) (byte) -1, 2514);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2514 for dayOfYear must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "2" + "'", str63.equals("2"));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 180254 + "'", int67 == 180254);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears(4);
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.lang.StringBuffer stringBuffer0 = null;
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.weekyear();
        java.lang.String str5 = property4.getName();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsShortText(locale6);
        int int8 = property4.getLeapAmount();
        int int9 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "weekyear" + "'", str5.equals("weekyear"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1970" + "'", str7.equals("1970"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-292275054) + "'", int9 == (-292275054));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = buddhistChronology8.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant13);
        org.joda.time.LocalTime localTime15 = dateTime10.toLocalTime();
        try {
            org.joda.time.DateTime dateTime16 = localDate0.toDateTime(localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = buddhistChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = buddhistChronology2.eras();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = buddhistChronology10.eras();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology10);
        int int13 = dateTime12.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) dateTime12, 1);
        int int16 = dateTime12.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeField dateTimeField18 = property7.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField19 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology2, dateTimeField18);
        long long21 = skipDateTimeField19.roundCeiling((long) 62);
        int int23 = skipDateTimeField19.get((long) (short) 0);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        int[] intArray25 = localDate24.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str27 = localDate24.toString(dateTimeFormatter26);
        int int28 = localDate24.getYearOfCentury();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        int[] intArray30 = localDate29.getValues();
        int int31 = skipDateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDate24, intArray30);
        org.joda.time.field.SkipDateTimeField skipDateTimeField32 = new org.joda.time.field.SkipDateTimeField(chronology0, (org.joda.time.DateTimeField) skipDateTimeField19);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(buddhistChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 86400000L + "'", long21 == 86400000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "��:��:��" + "'", str27.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 70 + "'", int28 == 70);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 365 + "'", int31 == 365);
    }

//    @Test
//    public void test480() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test480");
//        org.joda.time.DateTimeZone dateTimeZone0 = null;
//        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
//        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
//        org.joda.time.DateTimeZone dateTimeZone3 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology4 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone3);
//        org.joda.time.DurationField durationField5 = buddhistChronology4.eras();
//        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology4);
//        int int7 = dateTime6.getHourOfDay();
//        org.joda.time.DateTime dateTime8 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
//        org.joda.time.DateTimeZone dateTimeZone9 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology10 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone9);
//        org.joda.time.DateTimeZone dateTimeZone11 = buddhistChronology10.getZone();
//        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
//        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone11);
//        org.joda.time.LocalDate localDate14 = dateTime6.toLocalDate();
//        boolean boolean15 = copticChronology1.equals((java.lang.Object) localDate14);
//        org.joda.time.DateTimeZone dateTimeZone16 = null;
//        org.joda.time.chrono.BuddhistChronology buddhistChronology17 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
//        org.joda.time.DateTimeZone dateTimeZone18 = buddhistChronology17.getZone();
//        boolean boolean20 = dateTimeZone18.isStandardOffset(10L);
//        java.lang.String str22 = dateTimeZone18.getName((long) (short) -1);
//        org.joda.time.Chronology chronology23 = copticChronology1.withZone(dateTimeZone18);
//        long long25 = dateTimeZone18.convertUTCToLocal(345600052L);
//        org.junit.Assert.assertNotNull(copticChronology1);
//        org.junit.Assert.assertNotNull(buddhistChronology4);
//        org.junit.Assert.assertNotNull(durationField5);
//        org.junit.Assert.assertNotNull(dateTime6);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
//        org.junit.Assert.assertNotNull(dateTime8);
//        org.junit.Assert.assertNotNull(buddhistChronology10);
//        org.junit.Assert.assertNotNull(dateTimeZone11);
//        org.junit.Assert.assertNotNull(dateTime13);
//        org.junit.Assert.assertNotNull(localDate14);
//        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
//        org.junit.Assert.assertNotNull(buddhistChronology17);
//        org.junit.Assert.assertNotNull(dateTimeZone18);
//        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
//        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Pacific Standard Time" + "'", str22.equals("Pacific Standard Time"));
//        org.junit.Assert.assertNotNull(chronology23);
//        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 316800052L + "'", long25 == 316800052L);
//    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int[] intArray2 = localDate1.getValues();
        org.joda.time.Partial partial3 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate1);
        java.lang.String str4 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        int[] intArray6 = localDate5.getValues();
        org.joda.time.LocalDate localDate8 = localDate5.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate10 = localDate5.withCenturyOfEra(0);
        org.joda.time.LocalDate localDate12 = localDate5.plusWeeks((int) (byte) 0);
        org.joda.time.LocalDate localDate13 = localDate1.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology15 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = buddhistChronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = buddhistChronology15.eras();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology23 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = buddhistChronology23.eras();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology23);
        int int26 = dateTime25.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (org.joda.time.ReadableInstant) dateTime25, 1);
        int int29 = dateTime25.getYearOfCentury();
        long long30 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeField dateTimeField31 = property20.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField32 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology15, dateTimeField31);
        long long34 = skipDateTimeField32.roundCeiling((long) 62);
        int int36 = skipDateTimeField32.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = skipDateTimeField32.getType();
        org.joda.time.LocalDate localDate39 = localDate1.withField(dateTimeFieldType37, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology41 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = buddhistChronology41.getZone();
        long long46 = buddhistChronology41.add((long) 1, (long) 23, (int) (short) 0);
        org.joda.time.DurationField durationField47 = buddhistChronology41.hours();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48);
        org.joda.time.DurationField durationField50 = copticChronology49.months();
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField51 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType37, durationField47, durationField50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range duration field must be precise");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "��:��:��.000" + "'", str4.equals("��:��:��.000"));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(buddhistChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(buddhistChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 13 + "'", int29 == 13);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 86400000L + "'", long34 == 86400000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(buddhistChronology41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertNotNull(durationField50);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 62, "��:��:��.000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        long long6 = property4.remainder();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long60 = skipUndoDateTimeField24.roundHalfFloor((long) 586);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        java.io.DataOutput dataOutput2 = null;
        try {
            dateTimeZoneBuilder0.writeTo("GJChronology[America/Los_Angeles,cutover=2019-06-15T22:23:28.217Z,mdfw=1]", dataOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology8 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = buddhistChronology8.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = dateTime4.toLocalDate();
        org.joda.time.LocalDate localDate14 = localDate12.withYear(100);
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(buddhistChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
        try {
            org.joda.time.DateTime dateTime9 = property7.setCopy((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        }
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str3 = localDate0.toString(dateTimeFormatter2);
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.plusYears(366);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = localDate6.toDateMidnight(dateTimeZone8);
        long long14 = dateTimeZone8.adjustOffset((long) 1969, false);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone8);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "��:��:��" + "'", str3.equals("��:��:��"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1969L + "'", long14 == 1969L);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = buddhistChronology1.eras();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = buddhistChronology9.eras();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology9);
        int int12 = dateTime11.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) dateTime11, 1);
        int int15 = dateTime11.getYearOfCentury();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField17 = property6.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField18 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology1, dateTimeField17);
        long long20 = skipDateTimeField18.roundCeiling((long) 62);
        int int21 = skipDateTimeField18.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField22 = skipDateTimeField18.getWrappedField();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        int[] intArray24 = localDate23.getValues();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate28 = localDate23.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property29 = localDate28.era();
        java.util.Locale locale30 = null;
        java.lang.String str31 = skipDateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDate28, locale30);
        long long34 = skipDateTimeField18.add(0L, (-35));
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = skipDateTimeField18.getType();
        boolean boolean36 = skipDateTimeField18.isLenient();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 86400000L + "'", long20 == 86400000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 366 + "'", int21 == 366);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "1" + "'", str31.equals("1"));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3024000000L) + "'", long34 == (-3024000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        java.util.Locale locale60 = null;
        java.lang.String str61 = skipUndoDateTimeField24.getAsShortText(0, locale60);
        int int62 = skipUndoDateTimeField24.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "0" + "'", str61.equals("0"));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = buddhistChronology2.eras();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology2);
        int int5 = dateTime4.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) dateTime4, 1);
        org.joda.time.DateTime dateTime9 = dateTime4.plus((long) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight13 = dateTime12.toDateMidnight();
        org.junit.Assert.assertNotNull(buddhistChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = dateTimeFormatter0.parseMutableDateTime("16:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"16:00:00.100\" is malformed at \":00:00.100\"");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.adjustOffset((long) '4', true);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 923);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6.equals("+00:00:00.100"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology1 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = buddhistChronology1.eras();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology1);
        int int4 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology6 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = buddhistChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology9 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = buddhistChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = buddhistChronology9.eras();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology17 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = buddhistChronology17.eras();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology17);
        int int20 = dateTime19.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) dateTime19, 1);
        int int23 = dateTime19.getYearOfCentury();
        long long24 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeField dateTimeField25 = property14.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField26 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology9, dateTimeField25);
        long long28 = skipDateTimeField26.roundCeiling((long) 62);
        int int29 = skipDateTimeField26.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField30 = skipDateTimeField26.getWrappedField();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        int[] intArray32 = localDate31.getValues();
        org.joda.time.LocalDate localDate34 = localDate31.plusYears((int) (short) -1);
        org.joda.time.LocalDate localDate36 = localDate31.withCenturyOfEra(0);
        org.joda.time.LocalDate.Property property37 = localDate36.era();
        java.util.Locale locale38 = null;
        java.lang.String str39 = skipDateTimeField26.getAsShortText((org.joda.time.ReadablePartial) localDate36, locale38);
        long long41 = buddhistChronology6.set((org.joda.time.ReadablePartial) localDate36, 0L);
        org.joda.time.DateTime dateTime42 = dateTime3.toDateTime((org.joda.time.Chronology) buddhistChronology6);
        java.lang.String str43 = buddhistChronology6.toString();
        org.junit.Assert.assertNotNull(buddhistChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buddhistChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(buddhistChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(buddhistChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 13 + "'", int23 == 13);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 86400000L + "'", long28 == 86400000L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 366 + "'", int29 == 366);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "1" + "'", str39.equals("1"));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-77094029222000L) + "'", long41 == (-77094029222000L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "BuddhistChronology[America/Los_Angeles]" + "'", str43.equals("BuddhistChronology[America/Los_Angeles]"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.io.Writer writer0 = null;
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, 923L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology5 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = buddhistChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = buddhistChronology5.eras();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology13 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = buddhistChronology13.eras();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology13);
        int int16 = dateTime15.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) dateTime15, 1);
        int int19 = dateTime15.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField21 = property10.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField22 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology5, dateTimeField21);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField24 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology1, dateTimeField21, (int) 'a');
        int int25 = skipUndoDateTimeField24.getMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology31 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = buddhistChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = buddhistChronology31.eras();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.LocalDate.Property property36 = localDate35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.BuddhistChronology buddhistChronology39 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = buddhistChronology39.eras();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now((org.joda.time.Chronology) buddhistChronology39);
        int int42 = dateTime41.getHourOfDay();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) dateTime41, 1);
        int int45 = dateTime41.getYearOfCentury();
        long long46 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField47 = property36.getField();
        org.joda.time.field.SkipDateTimeField skipDateTimeField48 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) buddhistChronology31, dateTimeField47);
        long long50 = skipDateTimeField48.roundCeiling((long) 62);
        int int52 = skipDateTimeField48.get((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = skipDateTimeField48.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException55 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType53, "15:23:28.966");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder26.appendText(dateTimeFieldType53);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField58 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) skipUndoDateTimeField24, dateTimeFieldType53, (int) (byte) 100);
        long long61 = remainderDateTimeField58.addWrapField((-78689146022000L), 12);
        java.lang.String str63 = remainderDateTimeField58.getAsShortText(14L);
        java.util.Locale locale65 = null;
        java.lang.String str66 = remainderDateTimeField58.getAsShortText(923, locale65);
        java.lang.String str67 = remainderDateTimeField58.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(buddhistChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(buddhistChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(buddhistChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(buddhistChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-78688109222000L) + "'", long61 == (-78688109222000L));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "2" + "'", str63.equals("2"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "923" + "'", str66.equals("923"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "DateTimeField[dayOfYear]" + "'", str67.equals("DateTimeField[dayOfYear]"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendCenturyOfEra(365, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(1970, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider("15:23:32.185");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"15:23:32.185/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@60dbf04d");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int[] intArray1 = localDate0.getValues();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (short) -1);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate localDate6 = property4.withMinimumValue();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("org.joda.time.IllegalFieldValueException: Value 10 for hi! must be in the range [10.0,1]", "");
        java.lang.String str3 = illegalFieldValueException2.getIllegalValueAsString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }
}


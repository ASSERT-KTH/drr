

package org.joda.time;

import org.junit.Assert;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.chrono.ISOChronology;
import java.util.Locale;
import org.junit.Test;
import org.joda.time.field.UnsupportedDateTimeField;

public class Partial_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        LocalTime localTime0 = new LocalTime(2535L, ((Chronology) (iSOChronology0)));
        LocalTime localTime1 = localTime0.withLocalMillis((-1454L));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localTime1)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertEquals(2, partial1.size());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), (-1779));
        ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        Assert.assertNull(readablePartial0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.withField(dateTimeFieldType0, 5);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics(((String) (null)));
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        Partial partial0 = new Partial(((ReadablePartial) (testLocalDateTime_Basics_MockInstant0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 9);
        Assert.assertEquals(4, partial1.size());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Period period0 = Period.ZERO;
        Days days0 = period0.toStandardDays();
        Weeks weeks0 = days0.toStandardWeeks();
        Partial partial1 = partial0.withPeriodAdded(weeks0, 8);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals(0, partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        Period period0 = Period.days(402);
        Partial partial1 = partial0.minus(period0);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        int[] intArray1 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }, intArray1);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("@z!");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[4];
        Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        Assert.assertNotSame(dateTimeFieldTypeArray1, dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        Assert.assertEquals("year", dateTimeFieldType0.toString());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        UnsupportedDateTimeField unsupportedDateTimeField0 = ((UnsupportedDateTimeField) (partial0.getField(0, ((Chronology) (testDateTime_Basics_MockEqualsChronology0)))));
        Assert.assertFalse(unsupportedDateTimeField0.isLenient());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("");
        TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableDateTime_Basics_MockInstant0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[2] = dateTimeFieldTypeArray0[0];
        dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[2];
        int[] intArray0 = new int[24];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1154);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("Hw[{48,A-_DN");
        TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableDateTime_Basics_MockInstant0.getChronology()));
        try {
            partial0.getField((-4129), ((Chronology) (iSOChronology0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        Partial partial1 = partial0.withPeriodAdded(((ReadablePeriod) (null)), 89);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, ((Chronology) (null)));
        Assert.assertEquals(1, partial0.size());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        CopticChronology copticChronology1 = ((CopticChronology) (partial0.getChronology()));
        Assert.assertEquals(1, CopticChronology.AM);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        int int0 = partial0.size();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        try {
            partial0.getFieldType(1);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        int int0 = partial0.getValue(0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("EW");
        TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (iSOChronology0)));
        int[] intArray0 = new int[9];
        Partial partial1 = new Partial(partial0, intArray0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        Partial partial0 = new Partial();
        int[] intArray0 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        Partial partial0 = new Partial(dateTimeFieldType0, 3, ((Chronology) (null)));
        String string0 = partial0.toString();
        Assert.assertEquals("-W-3", string0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("8utkIlzKRoD zY");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (copticChronology0)));
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        partial0.toString();
        String string0 = partial0.toString(((String) (null)), locale0);
        Assert.assertEquals("[weekyearOfCentury=44]", string0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Assert.assertEquals(0, partial0.size());
        String string0 = partial0.toString();
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
        int[] intArray0 = new int[8];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        partial0.getFormatter();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        LocalTime localTime0 = new LocalTime(2535L, ((Chronology) (iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localTime0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[8];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        LocalDate localDate0 = LocalDate.now();
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (null)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        Period period0 = new Period(((ReadableDuration) (null)), ((ReadableInstant) (null)));
        Partial partial1 = partial0.plus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        Period period0 = new Period(((ReadableDuration) (null)), ((ReadableInstant) (null)));
        Partial partial1 = partial0.withPeriodAdded(period0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.without(dateTimeFieldType0);
        int int0 = partial1.size();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.with(dateTimeFieldType0, 44);
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics(((String) (null)));
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        Partial partial0 = new Partial(((ReadablePartial) (testLocalDateTime_Basics_MockInstant0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        Partial partial1 = partial0.with(dateTimeFieldType0, 9);
        Assert.assertEquals(5, partial1.size());
    }

    @Test(timeout = 4000)
    public void test72() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
        TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (testBasePartial_MockPartial0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 44, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        String string0 = partial1.toString();
        Assert.assertSame(partial1, partial0);
        Assert.assertEquals("-44", string0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Assert.assertEquals(1, partial0.size());
    }

    @Test(timeout = 4000)
    public void test83() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 1326);
        Partial partial0 = partial_Property0.getPartial();
        Assert.assertNull(partial0);
    }

    @Test(timeout = 4000)
    public void test85() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        try {
            partial_Property0.setCopy(((String) (null)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("2002-06-09T02:00:00.000+02:00");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        Assert.assertNotSame(dateTimeFieldTypeArray1, dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Partial partial1 = partial0.minus(((ReadablePeriod) (null)));
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("");
        TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Partial partial1 = partial0.plus(((ReadablePeriod) (null)));
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
        Partial partial1 = partial0.with(dateTimeFieldType0, 5);
        Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        Assert.assertEquals(4, partial1.size());
        Assert.assertEquals(5, partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(((String) (null)));
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        LocalDate localDate0 = LocalDate.now(((Chronology) (copticChronology0)));
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (partial0)));
        Assert.assertTrue(boolean0);
    }
}


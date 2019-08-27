

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
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics("\"");
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
        int[] intArray0 = new int[9];
        intArray0[0] = -803;
        Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (testTimeOfDay_Basics_MockInstant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        intArray0[0] = 9;
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("---.009");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 44);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        DurationFieldType durationFieldType0 = DurationFieldType.years();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 1);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-73), ((Chronology) (copticChronology0)));
        Partial partial1 = partial0.withField(dateTimeFieldType0, 382);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Locale locale0 = Locale.CANADA;
        Partial partial1 = partial_Property0.setCopy("00", locale0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.setCopy(16);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics("\"");
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
        dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[1];
        dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 1);
        Partial partial1 = partial_Property0.addWrapFieldToCopy((-1223));
        Assert.assertEquals(5, partial1.size());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.addToCopy(0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        intArray0[0] = 9;
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Partial partial0 = new Partial();
        MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
        Partial partial1 = partial0.withChronologyRetainFields(mockNullZoneChronology0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        String string0 = partial0.toString("00");
        Assert.assertEquals("00", string0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals(0, partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Partial partial0 = new Partial();
        MutablePeriod mutablePeriod0 = new MutablePeriod(1244L, 1244L);
        Partial partial1 = partial0.plus(mutablePeriod0);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Partial partial0 = new Partial();
        Assert.assertEquals(0, partial0.size());
        Period period0 = new Period(61, 21, 2, 2, (-520), 2, 5, 2);
        Partial partial1 = partial0.minus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        TestDuration_Basics testDuration_Basics0 = new TestDuration_Basics("00");
        TestDuration_Basics.MockDuration testDuration_Basics_MockDuration0 = testDuration_Basics0.new MockDuration((-1758L));
        Duration duration0 = testDuration_Basics_MockDuration0.toDuration();
        Hours hours0 = duration0.toStandardHours();
        Partial partial1 = partial0.minus(hours0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(0);
        Assert.assertEquals("hourOfDay", dateTimeFieldType1.getName());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
        UnsupportedDateTimeField unsupportedDateTimeField0 = ((UnsupportedDateTimeField) (partial0.getField(0, ((Chronology) (mockNullZoneChronology0)))));
        Assert.assertEquals("UnsupportedDateTimeField", unsupportedDateTimeField0.toString());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        try {
            partial0.getFieldType((-6));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("1`)%kI:)PN}'Fg+H,");
        TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        Partial partial0 = new Partial(((ReadablePartial) (testYearMonth_Basics_MockYM0)));
        String string0 = partial0.toStringList();
        Assert.assertEquals("[year=1970, monthOfYear=6]", string0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestMutablePeriod_Basics testMutablePeriod_Basics0 = new TestMutablePeriod_Basics("");
        TestMutablePeriod_Basics.MockMutablePeriod testMutablePeriod_Basics_MockMutablePeriod0 = testMutablePeriod_Basics0.new MockMutablePeriod(((long) (-757)));
        Partial partial1 = partial0.plus(testMutablePeriod_Basics_MockMutablePeriod0);
        String string0 = partial1.toString();
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertEquals("[centuryOfEra=0]", string0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[2];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        int[] intArray0 = new int[2];
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors(")o#!ta@j(/)yi");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, ((Chronology) (iSOChronology0)));
        Assert.assertEquals(2, partial0.size());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        ISOChronology iSOChronology0 = ((ISOChronology) (partial0.getChronology()));
        Assert.assertNotNull(iSOChronology0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        int int0 = partial0.size();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        DateTimeFieldType dateTimeFieldType0 = partial0.getFieldType(0);
        Assert.assertNull(dateTimeFieldType0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        int int0 = partial0.getValue(0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Partial partial0 = new Partial();
        int[] intArray0 = new int[9];
        Partial partial1 = new Partial(partial0, intArray0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        int[] intArray0 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{ -77 }, intArray0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        String string0 = partial0.toString();
        Assert.assertEquals("00", string0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("07:0z^5:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        Partial partial1 = partial0.without(dateTimeFieldType0);
        String string0 = partial1.toString();
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertFalse(dateTimeFormatter0.isOffsetParsed());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        Partial partial0 = new Partial();
        partial0.getFormatter();
        Assert.assertEquals(0, partial0.size());
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("1`)%kI:)PN}'Fg+H,");
        TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        Partial partial0 = new Partial(((ReadablePartial) (testYearMonth_Basics_MockYM0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (testYearMonth_Basics_MockYM0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("00");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("---.000");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("Types array must not contain duplicate: ");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        Period period0 = new Period(((ReadableInstant) (testInstant_Basics_MockInstant0)), ((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Partial partial1 = partial0.withPeriodAdded(period0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Partial partial0 = new Partial(((Chronology) (null)));
        Partial partial1 = partial0.withPeriodAdded(((ReadablePeriod) (null)), 2);
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        DurationFieldType durationFieldType0 = DurationFieldType.years();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-1025));
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        DurationFieldType durationFieldType0 = DurationFieldType.years();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-1114));
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("07:0z^5:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        Partial partial1 = partial0.without(((DateTimeFieldType) (null)));
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        intArray0[0] = 44;
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.with(dateTimeFieldType0, 0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        try {
            TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics("\"");
            TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
            CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
            DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[5];
            DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
            dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
            DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.millisOfDay();
            dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
            dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
            dateTimeFieldTypeArray0[3] = dateTimeFieldTypeArray0[1];
            dateTimeFieldTypeArray0[4] = dateTimeFieldTypeArray0[3];
            int[] intArray0 = new int[9];
            Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
            Partial partial1 = partial0.with(dateTimeFieldType1, 1727);
            Assert.assertEquals(6, partial1.size());
            org.junit.Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.with(dateTimeFieldType0, 0);
        partial1.getFormatter();
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        MockPartial mockPartial0 = new MockPartial();
        ISOChronology iSOChronology0 = ((ISOChronology) (mockPartial0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        int[] intArray0 = new int[9];
        Partial partial0 = new Partial(iSOChronology0, dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertSame(partial0, partial1);
    }

    @Test(timeout = 4000)
    public void test82() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 1915);
        ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        Assert.assertNull(readablePartial0);
    }

    @Test(timeout = 4000)
    public void test85() throws Throwable {
        TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("1`)%kI:)PN}'Fg+H,");
        TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        Partial partial0 = new Partial(((ReadablePartial) (testYearMonth_Basics_MockYM0)));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestMutablePeriod_Basics testMutablePeriod_Basics0 = new TestMutablePeriod_Basics("");
        TestMutablePeriod_Basics.MockMutablePeriod testMutablePeriod_Basics_MockMutablePeriod0 = testMutablePeriod_Basics0.new MockMutablePeriod(((long) (-757)));
        Partial partial1 = partial0.plus(testMutablePeriod_Basics_MockMutablePeriod0);
        String string0 = partial1.toString(((String) (null)), ((Locale) (null)));
        Assert.assertNotSame(partial1, partial0);
        Assert.assertEquals("[centuryOfEra=0]", string0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("-07:05:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        MutablePeriod mutablePeriod0 = new MutablePeriod(((Object) (null)));
        Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 20);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("07:0z^5:34");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-77), ((Chronology) (copticChronology0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (partial0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Partial partial0 = new Partial();
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.getPartial();
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        DateTimeFieldType dateTimeFieldType0 = testLocalDate_Basics_MockInstant0.getFieldType(0);
        Partial partial0 = new Partial(dateTimeFieldType0, 126);
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals(126, partial_Property0.get());
    }
}


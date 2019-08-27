

package org.joda.time;

import org.junit.Assert;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.chrono.ISOChronology;
import java.util.Locale;
import org.junit.Test;

public class Partial_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("*$");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        LocalDateTime localDateTime0 = LocalDateTime.now(((Chronology) (iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localDateTime0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("^|}MOX&[TKWDGQ");
        TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        MutableDateTime mutableDateTime0 = testDateMidnight_Basics_MockInstant0.toMutableDateTime();
        DateTime dateTime0 = mutableDateTime0.toDateTimeISO();
        boolean boolean0 = partial1.isMatch(((ReadableInstant) (dateTime0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        Partial partial2 = partial1.withFieldAddWrapped(durationFieldType0, (-1));
        Assert.assertNotSame(partial2, partial1);
        Assert.assertFalse(partial2.equals(((Object) (partial1))));
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        Partial.Property partial_Property0 = new Partial.Property(partial1, 0);
        Partial partial2 = partial_Property0.setCopy(32);
        Assert.assertTrue(partial2.equals(((Object) (partial1))));
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 25);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
        Partial partial2 = partial1.without(dateTimeFieldType1);
        Assert.assertEquals(1, partial2.size());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("*$");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Partial partial0 = new Partial();
        int int0 = partial0.size();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("*$");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Period period0 = new Period(0L, 0L, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.plus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        Period period0 = Period.seconds(0);
        Partial partial1 = partial0.minus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        int[] intArray0 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{ 1515 }, intArray0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("");
        TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (copticChronology0)));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDate_Basics_MockInstant0.getChronology()));
        DateTimeField dateTimeField0 = partial0.getField(0, ((Chronology) (copticChronology0)));
        Assert.assertNotNull(dateTimeField0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        String string0 = partial1.toStringList();
        Assert.assertEquals("[millisOfDay=32]", string0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        Partial partial0 = new Partial();
        String string0 = partial0.toString();
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        partial0.getFormatter();
        String string0 = partial0.toString();
        Assert.assertEquals("1515", string0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.withPeriodAdded(((ReadablePeriod) (null)), 32);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("*$");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Period period0 = new Period(0L, 0L, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.withPeriodAdded(period0, 857);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        int int0 = partial0.size();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        TestMonthDay_Basics testMonthDay_Basics0 = new TestMonthDay_Basics("N1-/h1p9m");
        TestMonthDay_Basics.MockMD testMonthDay_Basics_MockMD0 = testMonthDay_Basics0.new MockMD();
        CopticChronology copticChronology0 = ((CopticChronology) (testMonthDay_Basics_MockMD0.getChronology()));
        Partial partial0 = new Partial(copticChronology0, ((DateTimeFieldType[]) (null)), ((int[]) (null)));
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = new Partial(partial0, ((int[]) (null)));
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Partial partial0 = new Partial();
        int[] intArray0 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
        Partial partial0 = new Partial(((Chronology) (mockNullZoneChronology0)));
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("Values array must be the same length as the types array");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDate_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 93, ((Chronology) (copticChronology0)));
        Locale locale0 = Locale.ITALIAN;
        String string0 = partial0.toString(((String) (null)), locale0);
        Assert.assertEquals("-093", string0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        Partial partial0 = new Partial();
        String string0 = partial0.toString("d2M`?D");
        Assert.assertEquals("\ufffd2\ufffd`?\ufffd", string0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        String string0 = partial0.toString();
        Assert.assertEquals("1515", string0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        String string0 = partial0.toString();
        Assert.assertEquals("[halfdayOfDay=1]", string0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        String string0 = partial1.toString(((String) (null)));
        Assert.assertEquals("[millisOfDay=32]", string0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        DateTimeFormatter dateTimeFormatter1 = partial0.getFormatter();
        Assert.assertSame(dateTimeFormatter1, dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1, 1);
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localDateTime0)));
        Assert.assertFalse(boolean0);
    }

    //@Test(timeout = 4000)
    public void test54() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("*$");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        LocalDateTime localDateTime0 = LocalDateTime.now(((Chronology) (iSOChronology0)));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localDateTime0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        Instant instant0 = new Instant(1343L);
        boolean boolean0 = partial1.isMatch(((ReadableInstant) (instant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("[halfdayOfDay=1]");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("Values array must be the same length as the types array");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDate_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 93, ((Chronology) (copticChronology0)));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        Partial partial2 = partial1.withFieldAdded(durationFieldType0, 36);
        Assert.assertNotSame(partial2, partial1);
        Assert.assertFalse(partial2.equals(((Object) (partial1))));
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 1);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("Values array must be the same length as the types array");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDate_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 93, ((Chronology) (copticChronology0)));
        Partial partial1 = partial0.with(dateTimeFieldType0, 30);
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        TestMonthDay_Basics testMonthDay_Basics0 = new TestMonthDay_Basics("d2M`?D");
        testMonthDay_Basics0.testCompareTo();
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        Partial partial1 = partial0.with(dateTimeFieldType0, 1);
        Assert.assertEquals(1, partial1.size());
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Partial partial0 = new Partial();
        ISOChronology iSOChronology0 = ((ISOChronology) (partial0.getChronology()));
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        Partial partial0 = new Partial();
        TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics(((String) (null)));
        TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testYearMonthDay_Basics_MockInstant0.getChronology()));
        Partial partial1 = partial0.withChronologyRetainFields(copticChronology0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test75() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        int[] intArray0 = new int[1];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Assert.assertEquals(1, partial0.size());
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics("");
        TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testTimeOfDay_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, ((Chronology) (copticChronology0)));
        Assert.assertEquals(0, partial0.size());
    }

    @Test(timeout = 4000)
    public void test82() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 889);
        Partial partial0 = partial_Property0.getPartial();
        Assert.assertNull(partial0);
    }

    @Test(timeout = 4000)
    public void test83() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 0);
        ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        Assert.assertNull(readablePartial0);
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 1);
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        Partial partial1 = partial0.minus(((ReadablePeriod) (null)));
        Assert.assertSame(partial0, partial1);
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Partial partial0 = new Partial();
        Instant instant0 = new Instant(1343L);
        TestDuration_Basics.MockMutableDuration testDuration_Basics_MockMutableDuration0 = new TestDuration_Basics.MockMutableDuration(424L);
        PeriodType periodType0 = PeriodType.weeks();
        MutablePeriod mutablePeriod0 = new MutablePeriod(((ReadableInstant) (instant0)), ((ReadableDuration) (testDuration_Basics_MockMutableDuration0)), periodType0);
        Period period0 = mutablePeriod0.toPeriod();
        Partial partial1 = partial0.plus(period0);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        Partial partial0 = new Partial();
        Assert.assertEquals(0, partial0.size());
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.with(dateTimeFieldType0, 32);
        Partial partial2 = partial1.withFieldAddWrapped(durationFieldType0, 3);
        Assert.assertNotSame(partial2, partial1);
        Assert.assertFalse(partial2.equals(((Object) (partial1))));
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1515);
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals(1515, partial_Property0.get());
    }
}


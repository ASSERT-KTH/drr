

package org.joda.time;

import org.junit.Assert;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.chrono.ISOChronology;
import java.util.Locale;
import org.junit.Test;

public class Partial_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1872));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 32);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, 289);
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 289);
        boolean boolean0 = partial1.isMatch(((ReadablePartial) (partial0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfHour();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 61;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Partial partial1 = partial0.without(dateTimeFieldType2);
        Assert.assertEquals(2, partial1.size());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 44);
        ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        Assert.assertNull(readablePartial0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        String string0 = partial0.toString();
        Assert.assertEquals("[hourOfHalfday=0]", string0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Partial partial0 = new Partial();
        Period period0 = new Period((-2716), (-2716), 7, 1651);
        Partial partial1 = partial0.withPeriodAdded(period0, 7);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
        Partial partial0 = new Partial(((Chronology) (mockNullZoneChronology0)));
        Instant instant0 = new Instant();
        ISOChronology iSOChronology0 = ((ISOChronology) (instant0.getChronology()));
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Partial partial0 = new Partial();
        int int0 = partial0.size();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.plus(((ReadablePeriod) (null)));
        Assert.assertSame(partial0, partial1);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.minus(((ReadablePeriod) (null)));
        Assert.assertSame(partial0, partial1);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("hP8wgg\t\'c^Z");
        TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        ISOChronology iSOChronology0 = ((ISOChronology) (testDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-1872));
        DateTimeField dateTimeField0 = partial0.getField(0, ((Chronology) (iSOChronology0)));
        Assert.assertNotNull(dateTimeField0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        String string0 = partial0.toStringList();
        Assert.assertEquals("[weekyear=-1850]", string0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1872));
        Partial partial1 = partial0.withPeriodAdded(((ReadablePeriod) (null)), (-1872));
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        Partial partial0 = new Partial();
        ISOChronology iSOChronology0 = ((ISOChronology) (partial0.getChronology()));
        Assert.assertNotNull(iSOChronology0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        int int0 = partial0.size();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        Partial partial0 = new Partial(testDateTime_Basics_MockEqualsChronology0, ((DateTimeFieldType[]) (null)), ((int[]) (null)));
        DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
        try {
            partial0.withFieldAdded(durationFieldType0, 716);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        Partial partial0 = new Partial();
        try {
            partial0.getFieldType((-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        Partial partial0 = new Partial();
        int[] intArray0 = new int[2];
        Partial partial1 = new Partial(partial0, intArray0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        int[] intArray1 = partial0.getValues();
        Assert.assertNotSame(intArray0, intArray1);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1846));
        Locale locale0 = Locale.GERMAN;
        String string0 = partial0.toString(((String) (null)), locale0);
        Assert.assertEquals("-1846", string0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        Partial partial0 = new Partial();
        String string0 = partial0.toString(((String) (null)));
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.minuteOfHour();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 61;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        String string0 = partial0.toString();
        Assert.assertEquals("[year=0, yearOfEra=61, minuteOfHour=0]", string0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1798));
        partial0.getFormatter();
        String string0 = partial0.toString();
        Assert.assertEquals("-1798", string0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertTrue(dateTimeFormatter0.isPrinter());
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        Partial partial0 = new Partial();
        String string0 = partial0.toString();
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1798));
        partial0.getFormatter();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertFalse(dateTimeFormatter0.isOffsetParsed());
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1872));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-1872));
        boolean boolean0 = partial1.isMatch(((ReadablePartial) (partial0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (partial0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        MutableDateTime mutableDateTime0 = new MutableDateTime();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (mutableDateTime0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("hP8wgg\t\'c^Z");
        TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1798));
        DateTime dateTime0 = partial0.toDateTime(testDateTime_Basics_MockInstant0);
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (dateTime0)));
        Assert.assertEquals((-118898102085000L), dateTime0.getMillis());
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.secondOfDay();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        intArray0[1] = 49;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        PeriodType periodType0 = PeriodType.yearWeekDayTime();
        Period period0 = new Period(((long) (32)), 0L, periodType0, ((Chronology) (iSOChronology0)));
        Partial partial1 = partial0.minus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Instant instant0 = new Instant();
        ISOChronology iSOChronology0 = ((ISOChronology) (instant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 0, ((Chronology) (iSOChronology0)));
        Period period0 = Period.hours(873);
        Partial partial1 = partial0.withPeriodAdded(period0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1872));
        Partial partial1 = partial0.withField(dateTimeFieldType0, (-1872));
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1858));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, (-1858));
        Partial partial2 = partial1.withField(dateTimeFieldType0, (-1858));
        Assert.assertTrue(partial2.equals(((Object) (partial0))));
        Assert.assertNotSame(partial2, partial1);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        Partial partial1 = partial0.without(((DateTimeFieldType) (null)));
        Assert.assertSame(partial0, partial1);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1858));
        Partial partial1 = partial0.with(dateTimeFieldType0, 1400);
        Partial.Property partial_Property0 = partial1.property(dateTimeFieldType0);
        Assert.assertEquals(1400, partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        TestMonthDay_Basics testMonthDay_Basics0 = new TestMonthDay_Basics("");
        testMonthDay_Basics0.testCompareTo();
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1858));
        Partial partial1 = partial0.with(dateTimeFieldType0, (-1858));
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("hP8wgg\t\'c^Z");
        TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
        ISOChronology iSOChronology0 = ((ISOChronology) (testDateTime_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, (-1798));
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        LocalDateTime localDateTime0 = new LocalDateTime((-2051L));
        Partial partial0 = new Partial(((ReadablePartial) (localDateTime0)));
        Assert.assertEquals(4, partial0.size());
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("M^H`OzFCJZ?");
        TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
        CopticChronology copticChronology0 = ((CopticChronology) (testLocalDate_Basics_MockInstant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, ((Chronology) (copticChronology0)));
        Assert.assertEquals(0, partial0.size());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1798));
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        partial_Property0.addToCopy(45);
        Assert.assertEquals((-1798), partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test80() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, (-1));
        Partial partial1 = partial_Property0.getPartial();
        Assert.assertEquals(3, partial1.size());
    }

    @Test(timeout = 4000)
    public void test81() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        partial_Property0.withMaximumValue();
        Assert.assertEquals((-1850), partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test82() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1846));
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        partial_Property0.addWrapFieldToCopy((-1846));
        Assert.assertEquals((-1846), partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test84() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[3];
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
        DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.yearOfEra();
        dateTimeFieldTypeArray0[1] = dateTimeFieldType1;
        DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.millisOfSecond();
        dateTimeFieldTypeArray0[2] = dateTimeFieldType2;
        int[] intArray0 = new int[3];
        intArray0[1] = 49;
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
        Assert.assertNotSame(dateTimeFieldTypeArray0, dateTimeFieldTypeArray1);
    }

    @Test(timeout = 4000)
    public void test85() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1846));
        Partial partial1 = partial0.plus(((ReadablePeriod) (null)));
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-1850));
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Instant instant0 = new Instant();
        ISOChronology iSOChronology0 = ((ISOChronology) (instant0.getChronology()));
        Partial partial0 = new Partial(dateTimeFieldType0, 0, ((Chronology) (iSOChronology0)));
        int int0 = partial0.getValue(0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("");
        TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testMutableInterval_Constructors_MockInterval0.getChronology()));
        Partial partial0 = new Partial(((Chronology) (iSOChronology0)));
        int[] intArray0 = partial0.getValues();
        Assert.assertEquals(0, partial0.size());
        Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-1850));
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Partial partial1 = partial_Property0.setCopy((-1850));
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }
}


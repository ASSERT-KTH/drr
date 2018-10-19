

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
        LocalDate localDate0 = LocalDate.now();
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        LocalDate localDate1 = localDate0.plusWeeks((-2));
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (localDate1)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("XA7d{}b[z");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial1.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-33));
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMinimumValue();
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
        Partial partial0 = new Partial(dateTimeFieldType0, 1, ((Chronology) (null)));
        Assert.assertEquals(1, partial0.size());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), (-3365));
        ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
        Assert.assertNull(readablePartial0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        DateTimeField dateTimeField0 = partial_Property0.getField();
        Assert.assertNotNull(dateTimeField0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.addWrapFieldToCopy(0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 2);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        Partial partial2 = partial1.with(dateTimeFieldType0, 0);
        Assert.assertNotSame(partial2, partial1);
        Assert.assertTrue(partial2.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Partial partial0 = new Partial();
        TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("");
        TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
        Partial partial1 = partial0.withChronologyRetainFields(testDateTime_Basics_MockEqualsChronology0);
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        Partial.Property partial_Property1 = partial1.property(dateTimeFieldType0);
        Assert.assertEquals(1, partial_Property1.get());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-292275054));
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals((-292275054), partial_Property0.get());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics(((String) (null)));
        TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
        Partial partial0 = new Partial(((Chronology) (testMutableDateTime_Basics_MockEqualsChronology0)));
        Period period0 = Period.seconds(20);
        Partial partial1 = partial0.plus(period0);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Partial partial0 = new Partial(((Chronology) (null)));
        int[] intArray0 = partial0.getValues();
        Assert.assertArrayEquals(new int[]{  }, intArray0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
        Assert.assertNotNull(dateTimeFieldTypeArray0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestInterval_Constructors testInterval_Constructors0 = new TestInterval_Constructors("yE\"h}W<IV]");
        TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testInterval_Constructors_MockInterval0.getChronology()));
        DateTimeField dateTimeField0 = partial0.getField(0, ((Chronology) (iSOChronology0)));
        Assert.assertNotNull(dateTimeField0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        try {
            partial0.getFieldType(1457);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        LocalDate localDate0 = LocalDate.now();
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertTrue(dateTimeFormatter0.isParser());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        Partial partial0 = new Partial();
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
        Assert.assertNull(dateTimeFormatter0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.withPeriodAdded(((ReadablePeriod) (null)), 2);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Period period0 = Period.years(0);
        Partial partial1 = partial0.withPeriodAdded(period0, 1);
        Assert.assertNotSame(partial1, partial0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Partial partial0 = new Partial(((Chronology) (null)));
        ISOChronology iSOChronology0 = ((ISOChronology) (partial0.getChronology()));
        Assert.assertNotNull(iSOChronology0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        int int0 = partial0.size();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("");
        TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        CopticChronology copticChronology0 = ((CopticChronology) (testYearMonth_Basics_MockYM0.getChronology()));
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[10];
        Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, ((int[]) (null)));
        try {
            partial0.toStringList();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(0);
        Assert.assertSame(dateTimeFieldType0, dateTimeFieldType1);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        int int0 = partial0.getValue(0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
        Assert.assertEquals(0, partial0.size());
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        Partial partial0 = new Partial();
        int[] intArray0 = new int[8];
        Partial partial1 = new Partial(partial0, intArray0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        String string0 = partial1.toString();
        Assert.assertEquals("[era=1]", string0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Locale locale0 = Locale.KOREAN;
        String string0 = partial0.toString(((String) (null)), locale0);
        Assert.assertEquals("00", string0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Partial partial0 = new Partial();
        Assert.assertEquals(0, partial0.size());
        String string0 = partial0.toString();
        Assert.assertEquals("[]", string0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        partial0.getFormatter();
        Assert.assertFalse(partial0.equals(((Object) (partial1))));
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (partial1)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        boolean boolean0 = partial0.isMatch(((ReadablePartial) (partial0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("DtW@]vv");
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial0.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Period period0 = Period.years(0);
        Partial partial1 = partial0.withPeriodAdded(period0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        Partial partial0 = new Partial();
        Partial partial1 = partial0.minus(((ReadablePeriod) (null)));
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 2643);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.withField(dateTimeFieldType0, 0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
        Partial partial0 = new Partial(dateTimeFieldType0, (-292275054));
        Partial partial1 = partial0.with(dateTimeFieldType0, (-292275054));
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        String[] stringArray0 = new String[2];
        TestYearMonth_Basics.main(stringArray0);
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        try {
            DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
            Partial partial0 = new Partial(dateTimeFieldType0, 0);
            DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
            Partial partial1 = partial0.with(dateTimeFieldType1, 2000);
            Assert.assertFalse(partial1.equals(((Object) (partial0))));
            org.junit.Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        TestInterval_Constructors testInterval_Constructors0 = new TestInterval_Constructors("[era=1]");
        TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
        ISOChronology iSOChronology0 = ((ISOChronology) (testInterval_Constructors_MockInterval0.getChronology()));
        Partial partial1 = partial0.withChronologyRetainFields(iSOChronology0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        LocalDate localDate0 = LocalDate.now();
        Partial partial0 = new Partial(((ReadablePartial) (localDate0)));
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test85() throws Throwable {
        DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
        int[] intArray0 = new int[0];
        MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
        Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, ((Chronology) (mockNullZoneChronology0)));
        Assert.assertEquals(0, partial0.size());
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.addToCopy(1);
        Assert.assertFalse(partial1.equals(((Object) (partial0))));
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Partial.Property partial_Property0 = new Partial.Property(((Partial) (null)), 0);
        Partial partial0 = partial_Property0.getPartial();
        Assert.assertNull(partial0);
    }

    @Test(timeout = 4000)
    public void test93() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Period period0 = new Period(0, 0, 0, 898);
        Weeks weeks0 = period0.toStandardWeeks();
        Seconds seconds0 = weeks0.toStandardSeconds();
        Days days0 = seconds0.toStandardDays();
        MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
        Partial partial1 = partial0.minus(mutablePeriod0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test94() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Period period0 = Period.years(0);
        Partial partial1 = partial0.plus(period0);
        Assert.assertTrue(partial1.equals(((Object) (partial0))));
        Assert.assertNotSame(partial1, partial0);
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
        Partial partial1 = partial_Property0.withMaximumValue();
        TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics(((String) (null)));
        TestInstant_Basics.MockInstant testInstant_Basics_MockInstant0 = testInstant_Basics0.new MockInstant();
        boolean boolean0 = partial1.isMatch(((ReadableInstant) (testInstant_Basics_MockInstant0)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test96() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial partial1 = partial0.without(dateTimeFieldType0);
        Assert.assertEquals(0, partial1.size());
    }

    @Test(timeout = 4000)
    public void test97() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
        Partial partial0 = new Partial(dateTimeFieldType0, 0);
        Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
        Assert.assertEquals(0, partial_Property0.get());
    }
}


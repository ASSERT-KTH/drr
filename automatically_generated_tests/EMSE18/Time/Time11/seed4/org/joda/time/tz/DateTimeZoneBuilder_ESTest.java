

package org.joda.time.tz;

import org.junit.Assert;
import org.joda.time.Chronology;
import java.io.DataInput;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import java.io.InputStream;
import org.joda.time.LocalDateTime;
import java.util.Locale;
import org.joda.time.ReadableInstant;
import org.junit.Test;

public class DateTimeZoneBuilder_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.adjustOffset(846377999999L, false);
        Assert.assertEquals(846377999999L, long0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        LocalDateTime localDateTime0 = new LocalDateTime(2805L, ((Chronology) (gJChronology0)));
        LocalDateTime localDateTime1 = localDateTime0.minusWeeks(79);
        LocalDateTime localDateTime2 = localDateTime1.plusHours(3600000);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime2);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("_.:wAeq1|rI", (-333));
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-333), 'u', (-333), 98, 0, false, (-333));
        DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setStandardOffset((-1533));
        Assert.assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("_.:wAeq1|rI", (-333));
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-333), 'u', (-333), 98, 0, false, (-333));
        DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover((-976), 'u', 0, 98, (-292269054), false, (-292269054));
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder3);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        try {
            DateTimeZoneBuilder.readMillis(((DataInput) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        try {
            DateTimeZoneBuilder.readFrom(((InputStream) (null)), "Fixing duplicate recurrent name key - ");
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, '2', 337, 1682, 0, true, 0);
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(1682);
        Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        LocalDateTime localDateTime0 = new LocalDateTime(2833L, ((Chronology) (gJChronology0)));
        LocalDateTime localDateTime1 = localDateTime0.withYearOfEra(79);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-646L));
        Assert.assertEquals(3600000, int0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        Locale locale0 = Locale.ROOT;
        String string0 = cachedDateTimeZone0.getShortName(-9223372036854775808L, locale0);
        Assert.assertEquals("+00:09:21", string0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        LocalDateTime localDateTime0 = new LocalDateTime(2805L, ((Chronology) (gJChronology0)));
        LocalDateTime localDateTime1 = localDateTime0.plusHours(3600000);
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1992);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("UTC", true)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 5, 0, (-605), 'f', (-605), 0, 1407, false, 0);
        Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(7730941132800000L);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        GJChronology gJChronology0 = GJChronology.getInstanceUTC();
        LocalDateTime localDateTime0 = new LocalDateTime(2805L, ((Chronology) (gJChronology0)));
        boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1992);
        dateTimeZoneBuilder0.setFixedSavings("UTC", (-1));
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("UTC", true)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("UTC", (-1));
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", true)));
        Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(9223372036854775807L);
        Assert.assertEquals(846377999999L, long0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffset(((ReadableInstant) (null)));
        Assert.assertEquals(7200000, int0);
    }
}


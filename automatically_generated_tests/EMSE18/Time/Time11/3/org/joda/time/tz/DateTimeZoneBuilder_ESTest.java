

package org.joda.time.tz;

import org.joda.time.Chronology;
import org.junit.Assert;
import org.joda.time.chrono.BuddhistChronology;
import java.io.ByteArrayInputStream;
import org.junit.Test;
import java.io.DataInputStream;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import java.io.InputStream;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInstant;

public class DateTimeZoneBuilder_ESTest  {
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings(((String) (null)), 577);
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(577, 's', 's', 2837, 's', false, 's');
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset((-1876));
        Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addCutover(4, '^', 4, 4, 789, true, 0);
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(0, 's', 789, 58, 0, false, 0);
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(0, 's', 0, 41, 789, false, 1874);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[1] = ((byte) (12));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 74);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals(21600000L, long0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (null)));
        try {
            DateTimeZoneBuilder.readMillis(dataInputStream0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        try {
            DateTimeZoneBuilder.readFrom(((InputStream) (null)), ((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-2622));
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("qR}W}Bdl||T", true)));
        Assert.assertEquals("qR}W}Bdl||T", fixedDateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        MutableDateTime mutableDateTime0 = MutableDateTime.now(((DateTimeZone) (cachedDateTimeZone0)));
        GJChronology gJChronology0 = GJChronology.getInstance(((DateTimeZone) (cachedDateTimeZone0)), ((ReadableInstant) (mutableDateTime0)), 5);
        DateTimeZone dateTimeZone0 = cachedDateTimeZone0.getUncachedZone();
        GJChronology gJChronology1 = ((GJChronology) (gJChronology0.withZone(dateTimeZone0)));
        Assert.assertNotSame(gJChronology0, gJChronology1);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        MutableDateTime mutableDateTime0 = MutableDateTime.now(((DateTimeZone) (cachedDateTimeZone0)));
        GJChronology gJChronology0 = GJChronology.getInstance(((DateTimeZone) (cachedDateTimeZone0)), ((ReadableInstant) (mutableDateTime0)), 5);
        long long0 = gJChronology0.getDateTimeMillis((-331L), 0, 4, 4, 4);
        Assert.assertEquals((-3355996L), long0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(63158400000L);
        Assert.assertEquals(3600000, int0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.forID(((String) (null)))));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset((-9223372036854214808L));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.forID(((String) (null)))));
        String string0 = cachedDateTimeZone0.getShortName((-9223372036854214808L));
        Assert.assertEquals("+00:09:21", string0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("inz;Wpq", 2780, 155, 8, '4', 32, 2441, 32, false, 32);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("4\"|x", 0);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("UTC", false)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        Assert.assertEquals("UTC", fixedDateTimeZone0.toString());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(1393014081320L);
        Assert.assertEquals(3600000, int0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.forID(((String) (null)))));
        String string0 = cachedDateTimeZone0.getNameKey(9223372036854775807L);
        Assert.assertEquals("CEST", string0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.forID(((String) (null)))));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(9223372036854775807L);
        Assert.assertEquals(7200000, int0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(((DateTimeZone) (cachedDateTimeZone0)));
        MutablePeriod mutablePeriod0 = new MutablePeriod(((long) (1)), ((Chronology) (buddhistChronology0)));
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.forID(((String) (null)))));
        int int0 = cachedDateTimeZone0.getOffset(((ReadableInstant) (null)));
        Assert.assertEquals(7200000, int0);
    }
}


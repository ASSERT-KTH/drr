

package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.joda.time.Chronology;
import java.io.DataInput;
import java.io.DataInputStream;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import java.io.InputStream;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.junit.Test;

public class DateTimeZoneBuilder_ESTest  {
    //@Test(timeout = 4000)
    public void test01() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        String string0 = cachedDateTimeZone0.getName((-9223372036854775796L));
        Assert.assertEquals("+00:09:21", string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset(1174);
        dateTimeZoneBuilder0.addCutover(1174, 'w', 1174, (-1380), 1915, true, 1174);
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("X`_f", 115);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setStandardOffset(3342);
        dateTimeZoneBuilder0.addCutover(0, 'u', 0, 0, 999, false, (-1612));
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(3342, 'u', 1484, 0, 0, false, 0);
        Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.setFixedSavings("UTC", (-469));
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("UTC", false)));
        Assert.assertTrue(fixedDateTimeZone0.isFixed());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = ((byte) (99));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals((-29192355840000L), long0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        try {
            DateTimeZoneBuilder.readMillis(((DataInput) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (null)));
        try {
            DateTimeZoneBuilder.readFrom(((DataInput) (dataInputStream0)), ((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    //@Test(timeout = 4000)
    public void test25() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getOffsetFromLocal(1807L);
        Assert.assertEquals(3600000, int0);
    }

    //@Test(timeout = 4000)
    public void test26() throws Throwable {
        DateMidnight dateMidnight0 = new DateMidnight(3, 5, 4, ((Chronology) (null)));
        Assert.assertEquals((-62061898161000L), dateMidnight0.getMillis());
    }

    //@Test(timeout = 4000)
    public void test27() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(846378000000L);
        Assert.assertEquals(846377999999L, long0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.previousTransition(-9223372036854775808L);
        Assert.assertEquals(-9223372036854775808L, long0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(1000L);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(-9223372036854775808L);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addRecurringSavings("\"*[sxR7,L%[_y.j", 2800, 2800, 2800, 'w', 4, (-5), (-5), false, (-1381));
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true)));
        Assert.assertEquals("Buddhist", fixedDateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        dateTimeZoneBuilder0.addRecurringSavings("", 0, 0, 446, 'w', 4, (-5), (-5), true, (-1381));
        dateTimeZoneBuilder0.toDateTimeZone("Buddhist", true);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1281));
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1281), 's', 912, 912, 912, true, (-1281));
        Assert.assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("+02:00", 85, 119, 115, 'X', 1915, (-2396), 85, true, 85);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (null)));
        try {
            DateTimeZoneBuilder.readFrom(((InputStream) (dataInputStream0)), ((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    //@Test(timeout = 4000)
    public void test49() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset(1635642000000L);
        Assert.assertEquals(3600000, int0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        Assert.assertFalse(boolean0);
    }

    //@Test(timeout = 4000)
    public void test32() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        MutableDateTime mutableDateTime0 = new MutableDateTime(((DateTimeZone) (cachedDateTimeZone0)));
        int int0 = cachedDateTimeZone0.getOffset(((ReadableInstant) (mutableDateTime0)));
        Assert.assertEquals(7200000, int0);
    }
}




package org.joda.time.tz;

import org.junit.Assert;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.PipedInputStream;
import org.joda.time.DateTimeZone;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.Test;

public class DateTimeZoneBuilder_ESTest  {
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = ((byte) (62));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals(5, byteArrayInputStream0.available());
        Assert.assertEquals((-3600000L), long0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", ((DataOutput) (dataOutputStream0)));
        Assert.assertEquals("F UTC  ", byteArrayOutputStream0.toString());
        Assert.assertEquals(8, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (pipedOutputStream0)));
        PipedInputStream pipedInputStream0 = new PipedInputStream(70);
        pipedOutputStream0.connect(pipedInputStream0);
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 100000000L);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[0] = ((byte) (66));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals(2, byteArrayInputStream0.available());
        Assert.assertEquals(2013265920000L, long0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[0] = ((byte) (110));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataInputStream dataInputStream0 = new DataInputStream(((InputStream) (byteArrayInputStream0)));
        long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
        Assert.assertEquals(5, byteArrayInputStream0.available());
        Assert.assertEquals((-18119393280000L), long0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        try {
            DateTimeZoneBuilder.readMillis(((DataInput) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        try {
            DateTimeZoneBuilder.readFrom(((InputStream) (null)), "org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    //@Test(timeout = 4000)
    public void test28() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        int int0 = cachedDateTimeZone0.getStandardOffset((-85L));
        Assert.assertEquals(3600000, int0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        long long0 = cachedDateTimeZone0.adjustOffset(-9223372036854775808L, true);
        Assert.assertEquals(-9223372036854775808L, long0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(99);
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(3246, 'w', 19, 19, 99, true, 87);
        DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("7MB+u", 3246);
        Assert.assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(62);
        ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(((OutputStream) (byteArrayOutputStream0)));
        dateTimeZoneBuilder0.writeTo("O2P%", ((OutputStream) (objectOutputStream0)));
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(13, '(', 0, 0, 13, true, 0);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("[y;tJ[T@HQV^r}*4", false)));
        Assert.assertEquals("[y;tJ[T@HQV^r}*4", fixedDateTimeZone0.getID());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", 195, 1097, Integer.MIN_VALUE, ':', 0, (-1010), (-1010), false, 919);
        Assert.assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-720));
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("user.timezone", 92);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(80);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(((OutputStream) (byteArrayOutputStream0)));
        dateTimeZoneBuilder1.writeTo("user.timezone", ((OutputStream) (bufferedOutputStream0)));
        Assert.assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(256);
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (byteArrayOutputStream0)));
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 256);
        Assert.assertEquals("\ufffd       ", byteArrayOutputStream0.toString());
        Assert.assertEquals(9, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (byteArrayOutputStream0)));
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1393023600000L);
        Assert.assertEquals(4, byteArrayOutputStream0.size());
        Assert.assertEquals("AbC\ufffd", byteArrayOutputStream0.toString());
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isStandardOffset(32727193200000L);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        boolean boolean0 = cachedDateTimeZone0.isFixed();
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(2615);
        DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(2615, 'u', (-24), 2615, 377, false, 2615);
        DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder1.addCutover(874, 'u', 874, 377, 83, false, (-24));
        Assert.assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder2);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
        DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", 2615);
        FixedDateTimeZone fixedDateTimeZone0 = ((FixedDateTimeZone) (dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.Days", true)));
        Assert.assertEquals("org.joda.time.Days", fixedDateTimeZone0.toString());
    }

    //@Test(timeout = 4000)
    public void test52() throws Throwable {
        CachedDateTimeZone cachedDateTimeZone0 = ((CachedDateTimeZone) (DateTimeZone.getDefault()));
        String string0 = cachedDateTimeZone0.getNameKey(32718733200000L);
        Assert.assertEquals("CET", string0);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(((OutputStream) (byteArrayOutputStream0)));
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1000000000000000L);
        Assert.assertEquals(9, byteArrayOutputStream0.size());
        Assert.assertEquals("\ufffd \ufffd~\ufffd\u0180 ", byteArrayOutputStream0.toString());
    }
}


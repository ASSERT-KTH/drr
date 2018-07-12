

package org.apache.commons.lang.time;

import org.junit.Assert;
import java.util.LinkedHashSet;
import org.junit.Test;
import java.util.TimeZone;
import static org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue;

public class DurationFormatUtils_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("", Integer.MAX_VALUE);
        DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
        String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 366, 3, 1, 366, (-2897), (-1), 270, true);
        Assert.assertEquals("3", string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx(" 1 days");
        String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 32, 112, 1662, 2, 32, 73, 83, false);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration(3394L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        String string0 = DurationFormatUtils.formatPeriodISO(2960L, 2419200000L);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
        String string0 = ((String) (durationFormatUtils_Token0.getValue()));
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
        boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "H");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
        Assert.assertNotNull(durationFormatUtils_TokenArray0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        String string0 = DurationFormatUtils.formatPeriod((-1L), ((long) (512)), "", false, ((TimeZone) (null)));
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        String string0 = DurationFormatUtils.formatPeriod(((long) (-2378)), ((long) (-2378)), "366");
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration(0L, "", false);
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration((-811L), "");
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("M");
        String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-2359), 366, (-2359), (-2359), (-2378), 366, (-2378), false);
        Assert.assertEquals("366", string0);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration(0L, "The FileFilter must not be null", true);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration(1249L, "He[Z[", false);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration((-3552L), "java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000220java.lang.StringBuffer@00000000230java.lang.StringBuffer@0000000024000java.lang.StringBuffer@0000000025", true);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        String string0 = DurationFormatUtils.formatDuration(0L, "9Ld!OQK2i4|S!d|'K7%", true);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000210java.lang.StringBuffer@00000000220java.lang.StringBuffer@00000000230java.lang.StringBuffer@0000000024001java.lang.StringBuffer@0000000025");
        DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate@0000000002org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate@0000000002");
        durationFormatUtils_Token1.increment();
        durationFormatUtils_Token0.increment();
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("");
        DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000570java.lang.StringBuffer@00000000580java.lang.StringBuffer@00000000590java.lang.StringBuffer@0000000060", 256);
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("s");
        boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("366");
        boolean boolean0 = durationFormatUtils_Token0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("S");
        DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
        durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token1;
        String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 16, 16, 112, 16, 112, 16, 112, true);
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        String string0 = DurationFormatUtils.formatPeriodISO(0L, 2419200000L);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        String string0 = DurationFormatUtils.formatDurationWords(1141L, true, true);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        String string0 = DurationFormatUtils.formatDurationWords(0L, true, false);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        String string0 = DurationFormatUtils.formatDurationWords(2419200000L, false, false);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        String string0 = DurationFormatUtils.formatPeriod(2419200000L, 2419200000L, "");
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        String string0 = DurationFormatUtils.formatDurationHMS(2960L);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
        DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0);
        int int0 = durationFormatUtils_Token0.getCount();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        try {
            LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
            DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(((Object) (null)));
            boolean boolean0 = linkedHashSet0.contains(durationFormatUtils_Token0);
            Assert.assertFalse(boolean0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException expectedException__NullPointerException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        String string0 = DurationFormatUtils.formatDurationISO(416L);
        Assert.assertNotNull(string0);
    }
}


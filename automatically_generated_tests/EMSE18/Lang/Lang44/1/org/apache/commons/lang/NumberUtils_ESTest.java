

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xf");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x0L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        long long0 = NumberUtils.minimum((-1460L), 2341L, 2341L);
        Assert.assertEquals((-1460L), long0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        int int0 = NumberUtils.stringToInt("H", 1);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        int int0 = NumberUtils.stringToInt("H01^i=;?d'", (-1137));
        Assert.assertEquals((-1137), int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        int int0 = NumberUtils.stringToInt("1");
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        int int0 = NumberUtils.minimum(4033, 4033, 4033);
        Assert.assertEquals(4033, int0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        int int0 = NumberUtils.maximum(0, (-194), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Long long0 = NumberUtils.createLong("4");
        Assert.assertEquals(4L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("4");
        Assert.assertEquals(4, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Float float0 = NumberUtils.createFloat("2");
        Assert.assertEquals(2.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Double double0 = NumberUtils.createDouble("2");
        Assert.assertEquals(2.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("97");
        Assert.assertEquals(97, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("4");
        Assert.assertEquals(4, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        try {
            NumberUtils.createFloat("-0xf");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("97");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("1gxu{z^Dj|$fR9lX");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("1d");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("1");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-->54crTa.+\"~X5HU");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+}:");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("EwoVL&LJ./[7");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("6ep=wBQt7K3!=1");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xAn\"");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xaL");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x#$6/o>46N68E4");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0L");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x97");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("..");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        int int0 = NumberUtils.compare(((float) (1668)), (-886.6005F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        int int0 = NumberUtils.compare(0.0F, 2564.7173F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        int int0 = NumberUtils.compare(((float) (0L)), ((float) (0L)));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        int int0 = NumberUtils.compare(2676.5230553072765, 1666.0);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        int int0 = NumberUtils.compare((-3349.2802734375), ((double) (0.0F)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 0.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 68);
        Assert.assertEquals(68, int0);
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        int int0 = NumberUtils.maximum(0, 391, (-1729));
        Assert.assertEquals(391, int0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        int int0 = NumberUtils.maximum((-391), (-391), (-391));
        Assert.assertEquals((-391), int0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        long long0 = NumberUtils.maximum(0L, (-1400L), (-1400L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        long long0 = NumberUtils.maximum((-1820L), (-1309L), ((long) (-391)));
        Assert.assertEquals((-391L), long0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        long long0 = NumberUtils.maximum((-281L), (-281L), 4273L);
        Assert.assertEquals(4273L, long0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        int int0 = NumberUtils.minimum(1793, 2783, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        int int0 = NumberUtils.minimum(790, (-1303), 790);
        Assert.assertEquals((-1303), int0);
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        long long0 = NumberUtils.minimum(374L, 374L, 1L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        long long0 = NumberUtils.minimum(1361L, (-932L), 1361L);
        Assert.assertEquals((-932L), long0);
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber(".7")));
        Assert.assertEquals(0.7F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("0L")));
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber("1d")));
        Assert.assertEquals(1.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0xf")));
        Assert.assertEquals((-15), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Number number0 = NumberUtils.createNumber("--...");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test93() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0xf");
        Assert.assertEquals((-15), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test94() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        int int0 = NumberUtils.stringToInt("K=o?@vLxxJ6", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test97() throws Throwable {
        try {
            NumberUtils.createDouble("v-y?RV)^");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test98() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


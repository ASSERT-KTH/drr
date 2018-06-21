

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0~R");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        long long0 = NumberUtils.maximum(642L, (-471L), 642L);
        Assert.assertEquals(642L, long0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 100);
        Assert.assertEquals(100, int0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        int int0 = NumberUtils.stringToInt("l=-1:", (-1184));
        Assert.assertEquals((-1184), int0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0x...");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (0)), ((long) (0)), 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        long long0 = NumberUtils.minimum((-2367L), 0L, ((long) (1)));
        Assert.assertEquals((-2367L), long0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        int int0 = NumberUtils.minimum(69, 69, 1299);
        Assert.assertEquals(69, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, (-2294L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        int int0 = NumberUtils.maximum(0, (-1628), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-5")));
        Assert.assertEquals((-5), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Long long0 = NumberUtils.createLong("3");
        Assert.assertEquals(3L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Long long0 = NumberUtils.createLong("-5");
        Assert.assertEquals((-5L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0x6");
        Assert.assertEquals(6, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x6");
        Assert.assertEquals((-6), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Float float0 = NumberUtils.createFloat("3");
        Assert.assertEquals(3.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Float float0 = NumberUtils.createFloat("-5");
        Assert.assertEquals((-5.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Double double0 = NumberUtils.createDouble("5");
        Assert.assertEquals(5.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("5");
        Assert.assertEquals(5, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        try {
            NumberUtils.createNumber("l");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        try {
            NumberUtils.createFloat("");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("1l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("5");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("5");
        Assert.assertEquals(5, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        try {
            NumberUtils.createDouble("K*J<r");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("6F");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--q9~T5h173");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("ey.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("4EMqRNU%^4y%}");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xd");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xD/x<=L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0s/H+%.p#:9L$Lne[");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+t)uW*dfY5vGT1<");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0d");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        int int0 = NumberUtils.compare((-3135.4805F), (-3135.4805F));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        int int0 = NumberUtils.compare((-5613.432F), (-1746.16F));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        int int0 = NumberUtils.compare(1.0F, (-3500.439F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        int int0 = NumberUtils.compare((-1.0), (-1.0));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        int int0 = NumberUtils.compare((-2617.8079794794635), ((double) (0)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        int int0 = NumberUtils.compare(179.95663412343947, (-1631.5338216060668));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        int int0 = NumberUtils.maximum(97, 97, 743);
        Assert.assertEquals(743, int0);
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        int int0 = NumberUtils.maximum((-1), 1653, (-1));
        Assert.assertEquals(1653, int0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        int int0 = NumberUtils.maximum((-1423), (-1423), (-1423));
        Assert.assertEquals((-1423), int0);
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        long long0 = NumberUtils.maximum((-2294L), (-16L), 1L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        long long0 = NumberUtils.maximum((-897L), (-897L), (-897L));
        Assert.assertEquals((-897L), long0);
    }

    @Test(timeout = 4000)
    public void test72() throws Throwable {
        int int0 = NumberUtils.minimum(100, 76, (-1184));
        Assert.assertEquals((-1184), int0);
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        int int0 = NumberUtils.minimum(1, 0, 855);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        int int0 = NumberUtils.minimum(0, 4182, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test75() throws Throwable {
        long long0 = NumberUtils.minimum(1878L, 1L, 1878L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        long long0 = NumberUtils.minimum(3082L, 3082L, 1L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("1l")));
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber(".76")));
        Assert.assertEquals(0.76F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("0x6")));
        Assert.assertEquals(6, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        Number number0 = NumberUtils.createNumber("--q9~T5h173");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test94() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test96() throws Throwable {
        int int0 = NumberUtils.stringToInt("3");
        Assert.assertEquals(3, int0);
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




package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0x\"\" is not a valid number.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0K");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        int int0 = NumberUtils.maximum(0, (-1969), (-1969));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 1124L, 0L);
        Assert.assertEquals(1124L, long0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        int int0 = NumberUtils.minimum((-21), (-21), (-21));
        Assert.assertEquals((-21), int0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 69);
        Assert.assertEquals(69, int0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        int int0 = NumberUtils.stringToInt("X;,DDg", (-2560));
        Assert.assertEquals((-2560), int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        int int0 = NumberUtils.stringToInt("8");
        Assert.assertEquals(8, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        long long0 = NumberUtils.minimum(1L, 3718L, 1L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        int int0 = NumberUtils.minimum(0, 0, 1511);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        int int0 = NumberUtils.minimum(2212, 613, 46);
        Assert.assertEquals(46, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), (-2078L), ((long) (0)));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        int int0 = NumberUtils.maximum((-132), (-132), 39);
        Assert.assertEquals(39, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        int int0 = NumberUtils.maximum((-3609), (-3609), (-3609));
        Assert.assertEquals((-3609), int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0x2")));
        Assert.assertEquals((-2), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Long long0 = NumberUtils.createLong("6");
        Assert.assertEquals(6L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("8");
        Assert.assertEquals(8, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Float float0 = NumberUtils.createFloat("-7");
        Assert.assertEquals((-7.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Double double0 = NumberUtils.createDouble("2");
        Assert.assertEquals(2.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-2");
        Assert.assertEquals((-2), bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("3");
        Assert.assertEquals(3, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("-0x2");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        int int0 = NumberUtils.stringToInt("F~OC", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x2");
        Assert.assertEquals((-2), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        try {
            NumberUtils.createDouble("<A!NZd2 o <]");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("8L");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("*");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-- N\"2#,");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("EcY+JUEhtYg2K2=Bl4");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e8L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+?4UA/|rLoSp[>TH#");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xfE?u6uUVVf");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xe#T>/_Yn");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x2");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0K");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x9<<DaPU");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        int int0 = NumberUtils.compare(698.9597F, 698.9597F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        int int0 = NumberUtils.compare(((float) (46)), ((float) (613)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        int int0 = NumberUtils.compare(1.0F, (-902.0F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        int int0 = NumberUtils.compare((-3094.8485434773), (-3094.8485434773));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        int int0 = NumberUtils.compare(((double) (-1)), 2121.089756131454);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        int int0 = NumberUtils.compare(((double) (698.9597F)), (-1.0));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        int int0 = NumberUtils.maximum((-1180), (-1), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        long long0 = NumberUtils.maximum((-1L), (-1L), 594L);
        Assert.assertEquals(594L, long0);
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        long long0 = NumberUtils.maximum((-1368L), (-168L), (-168L));
        Assert.assertEquals((-168L), long0);
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        int int0 = NumberUtils.minimum(1, 1262, (-2749));
        Assert.assertEquals((-2749), int0);
    }

    @Test(timeout = 4000)
    public void test72() throws Throwable {
        long long0 = NumberUtils.minimum(0L, ((long) (-2560)), 2473L);
        Assert.assertEquals((-2560L), long0);
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        long long0 = NumberUtils.minimum(1604L, 1604L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("8L")));
        Assert.assertEquals(8L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        Number number0 = NumberUtils.createNumber("--");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("4");
        Assert.assertEquals(4, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0x9<<DaPU");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test94() throws Throwable {
        Float float0 = NumberUtils.createFloat("3");
        Assert.assertEquals(3.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


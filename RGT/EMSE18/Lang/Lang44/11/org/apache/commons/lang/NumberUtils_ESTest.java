

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0xe;%_7}@{J &ukk@.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        long long0 = NumberUtils.maximum(0L, (-2944L), (-2944L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        long long0 = NumberUtils.minimum((-351L), 1802L, (-351L));
        Assert.assertEquals((-351L), long0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        int int0 = NumberUtils.stringToInt("0", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.stringToInt("J", (-173));
        Assert.assertEquals((-173), int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        int int0 = NumberUtils.stringToInt("3");
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("-4");
        Assert.assertEquals((-4), int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        long long0 = NumberUtils.minimum(1595L, 1595L, 1595L);
        Assert.assertEquals(1595L, long0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, (-351L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        long long0 = NumberUtils.maximum((-15L), (-15L), (-15L));
        Assert.assertEquals((-15L), long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = NumberUtils.maximum((-2209), (-2209), (-2209));
        Assert.assertEquals((-2209), int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-1")));
        Assert.assertEquals((-1), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Long long0 = NumberUtils.createLong("9");
        Assert.assertEquals(9L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Long long0 = NumberUtils.createLong("-4");
        Assert.assertEquals((-4L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("74");
        Assert.assertEquals(74, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-1");
        Assert.assertEquals((-1), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Float float0 = NumberUtils.createFloat("74");
        Assert.assertEquals(74.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Float float0 = NumberUtils.createFloat("-4");
        Assert.assertEquals((-4.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Double double0 = NumberUtils.createDouble("3");
        Assert.assertEquals(3.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Double double0 = NumberUtils.createDouble("-4");
        Assert.assertEquals((-4.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("9");
        Assert.assertEquals(9, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-4");
        Assert.assertEquals((-4), bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("74");
        Assert.assertEquals(74, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        try {
            NumberUtils.createDouble("/JivGS?GZ9ch-<");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("S+BY#z\"5QmT");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        int int0 = NumberUtils.stringToInt("3", 3);
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("d");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("..");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--0T#7UM&oeO80jQ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("ES");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0eE:HYz\"b2f1");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("'KG B[}-|=}]g");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x4f6c\"[7tce");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xDD");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0y6w&");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        int int0 = NumberUtils.compare(0.0F, 0.0F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare((-1575.2489F), ((float) (0)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare(((float) (2368L)), 1.0F);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare((-658.1646), (-1028.8763749355776));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare((-1.0), 1.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 0.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.maximum(24, 24, 43);
        Assert.assertEquals(43, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.maximum(0, 1702, 0);
        Assert.assertEquals(1702, int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = NumberUtils.maximum(0, (-4292), (-4292));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), 2160L, (-714L));
        Assert.assertEquals(2160L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), ((long) (0)), 3094L);
        Assert.assertEquals(3094L, long0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.minimum(1, 118, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int int0 = NumberUtils.minimum(1702, 256, 1702);
        Assert.assertEquals(256, int0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        int int0 = NumberUtils.minimum((-4963), (-4963), (-4963));
        Assert.assertEquals((-4963), int0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, (-236L));
        Assert.assertEquals((-236L), long0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (0)), (-1066L), 1L);
        Assert.assertEquals((-1066L), long0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber(".3")));
        Assert.assertEquals(0.3F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("8L")));
        Assert.assertEquals(8L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber("6D")));
        Assert.assertEquals(6.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Number number0 = NumberUtils.createNumber("--");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        try {
            NumberUtils.createNumber("l");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Long long0 = NumberUtils.createLong("0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        int int0 = NumberUtils.stringToInt("0x");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-4");
        Assert.assertEquals((-4), bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Double double0 = NumberUtils.createDouble("0");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        try {
            NumberUtils.createFloat("Minimum abbreviation width with offset is 7");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


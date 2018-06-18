

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xf0S1dFgax;9U?k");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0}Eyx");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        int int0 = NumberUtils.maximum(48, 0, 0);
        Assert.assertEquals(48, int0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        long long0 = NumberUtils.maximum(631L, 0L, 0L);
        Assert.assertEquals(631L, long0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.minimum((-1), (-1), 0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        long long0 = NumberUtils.minimum((-1593L), (-1L), 1L);
        Assert.assertEquals((-1593L), long0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.stringToInt("?8A", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 2670);
        Assert.assertEquals(2670, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = NumberUtils.stringToInt("2");
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        int int0 = NumberUtils.minimum(0, 641, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.minimum(1, 1, 1);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Long long0 = NumberUtils.createLong("1");
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0xE");
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Float float0 = NumberUtils.createFloat("9");
        Assert.assertEquals(9.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Double double0 = NumberUtils.createDouble("8 ");
        Assert.assertEquals(8.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("2");
        Assert.assertEquals(2, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("2");
        Assert.assertEquals(2, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        try {
            NumberUtils.createFloat("05L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        try {
            NumberUtils.createDouble("-$");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("2");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        int int0 = NumberUtils.stringToInt("el:ROLw]BVt,", (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("2");
        Assert.assertEquals(2, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("05L");
        Assert.assertTrue(boolean0);
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
        boolean boolean0 = NumberUtils.isNumber("d");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("8 ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+`F07{.ua,AH*v");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E3");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3eL");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("..~3.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--r~vxw2@u}nR/Wh @L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x9dFgaxl9U");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x-0x1dFgaxl9U?k");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xE");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xCannot pad a negative amount: ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        int int0 = NumberUtils.compare(2256.0044F, (-978.0F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare(((float) (-20)), 1.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare(((float) (0L)), ((float) (0)));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare(1095.58, ((double) (0)));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 3203.7313251);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(((double) (0L)), ((double) (0L)));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.maximum((-1449), (-1449), 46);
        Assert.assertEquals(46, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.maximum(2, 2064, 2);
        Assert.assertEquals(2064, int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = NumberUtils.maximum((-1), (-1), (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 631L);
        Assert.assertEquals(631L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        long long0 = NumberUtils.maximum((-2712L), 1L, (-2712L));
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        long long0 = NumberUtils.maximum((-2712L), (-2712L), (-2712L));
        Assert.assertEquals((-2712L), long0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int int0 = NumberUtils.minimum(0, (-1059), (-1498));
        Assert.assertEquals((-1498), int0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (2670)), ((long) (2670)), ((long) (-1560)));
        Assert.assertEquals((-1560L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        long long0 = NumberUtils.minimum(0L, ((long) (-1560)), 0L);
        Assert.assertEquals((-1560L), long0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (2064)), ((long) (2064)), ((long) (2064)));
        Assert.assertEquals(2064L, long0);
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("05L")));
        Assert.assertEquals(5L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        try {
            NumberUtils.createNumber("l");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0xd")));
        Assert.assertEquals((-13), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Number number0 = NumberUtils.createNumber("--\"\" is nota valid number");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0x9dFgaxl9U");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


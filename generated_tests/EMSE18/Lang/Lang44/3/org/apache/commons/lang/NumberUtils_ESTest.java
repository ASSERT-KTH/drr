

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x0e(v}8x*2; zzxGID");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        int int0 = NumberUtils.minimum((-1), 100, 100);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 1781);
        Assert.assertEquals(1781, int0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("4");
        Assert.assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt("-4");
        Assert.assertEquals((-4), int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 121L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        long long0 = NumberUtils.minimum(4562L, 1395L, 1395L);
        Assert.assertEquals(1395L, long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberUtils.maximum((-2836L), (-2836L), (-3362L));
        Assert.assertEquals((-2836L), long0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-4")));
        Assert.assertEquals((-4), ((int) (integer0)));
        Assert.assertNotNull(integer0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Long long0 = NumberUtils.createLong("0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Long long0 = NumberUtils.createLong("5");
        Assert.assertEquals(5L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("3");
        Assert.assertEquals(3, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x0e");
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Float float0 = NumberUtils.createFloat("3");
        Assert.assertEquals(3.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Double double0 = NumberUtils.createDouble("99f");
        Assert.assertEquals(99.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("5");
        Assert.assertEquals(5, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-3");
        Assert.assertEquals((-3), bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("5");
        Assert.assertEquals(5, bigDecimal0.shortValue());
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
            NumberUtils.createDouble("P1M");
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
    public void test034() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        int int0 = NumberUtils.stringToInt("", (-1737));
        Assert.assertEquals((-1737), int0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Double double0 = NumberUtils.createDouble("0");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("7f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("d");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0E0e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("++ks/@hy^<x^(*af.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("enXU");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0e-v8x*d; zzxQlID");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("6E$");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xDt*d|kWWv:x)4\\O7");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0zct*d|kW{:x)4\\O7");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x99f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("5");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        int int0 = NumberUtils.compare(200.5728F, 200.5728F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        int int0 = NumberUtils.compare((-1398.31F), ((float) (0)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare(((float) (0)), (-446.0F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare(1.0, ((double) (-2941L)));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare((-1769.54005122), ((double) (2125)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare(1900.0, 1900.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.maximum((-2550), (-2460), (-1737));
        Assert.assertEquals((-1737), int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.maximum((-1), 2125, 0);
        Assert.assertEquals(2125, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.maximum(13, 1, 0);
        Assert.assertEquals(13, int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        long long0 = NumberUtils.maximum((-680L), 0L, 594L);
        Assert.assertEquals(594L, long0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), (-26L), (-26L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        int int0 = NumberUtils.minimum(0, 0, (-374));
        Assert.assertEquals((-374), int0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.minimum(2119, 16, 381);
        Assert.assertEquals(16, int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int int0 = NumberUtils.minimum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum(1L, (-1270L), 574L);
        Assert.assertEquals((-1270L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        long long0 = NumberUtils.minimum((-1445L), (-1421L), ((long) (-2941)));
        Assert.assertEquals((-2941L), long0);
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber("99f")));
        Assert.assertEquals(99.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test091() throws Throwable {
        Number number0 = NumberUtils.createNumber("--");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Long long0 = NumberUtils.createLong("-3");
        Assert.assertEquals((-3L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        try {
            NumberUtils.createFloat("--P1M%.R9R``9");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


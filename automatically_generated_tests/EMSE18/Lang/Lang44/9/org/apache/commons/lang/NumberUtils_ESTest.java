

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xdJV.Lw/@Df@@h-]J8H");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0bP/[(5XN=G|0}x4");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("*;xP 'BIS,Id%U7cc{");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        int int0 = NumberUtils.maximum(0, 1794, 0);
        Assert.assertEquals(1794, int0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        long long0 = NumberUtils.maximum(2973L, 2973L, (-1L));
        Assert.assertEquals(2973L, long0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        long long0 = NumberUtils.maximum(2338L, 0L, 2501L);
        Assert.assertEquals(2501L, long0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        long long0 = NumberUtils.minimum((-1637L), (-1637L), 0L);
        Assert.assertEquals((-1637L), long0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), (-2799));
        Assert.assertEquals((-2799), int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        int int0 = NumberUtils.stringToInt("4");
        Assert.assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (0)), ((long) (0)), ((long) (0)));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        long long0 = NumberUtils.minimum(1L, 1L, 1L);
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        int int0 = NumberUtils.minimum(1665, 1665, 1665);
        Assert.assertEquals(1665, int0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.maximum((-2359), 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Long long0 = NumberUtils.createLong("1");
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("17");
        Assert.assertEquals(17, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Float float0 = NumberUtils.createFloat("4");
        Assert.assertEquals(4.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Float float0 = NumberUtils.createFloat("-6");
        Assert.assertEquals((-6.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Double double0 = NumberUtils.createDouble("17");
        Assert.assertEquals(17.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("7");
        Assert.assertEquals(7, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-6");
        Assert.assertEquals((-6), bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        try {
            NumberUtils.createFloat("-0x2f");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
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
            NumberUtils.createDouble("LsN\"\'d9Euv23oPQR");
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
    public void test035() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("Strings must not be null");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("4");
        Assert.assertEquals(4, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 102);
        Assert.assertEquals(102, int0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("H");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("2f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("6+-$3)#,2%9rgU");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("eBwMe7S]Ls2");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("2E-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0x`");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xE-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0zQZ#.mw@");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x2f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--C");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        int int0 = NumberUtils.compare(5765.706F, ((float) (1665)));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        int int0 = NumberUtils.compare((-1754.596F), 1.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        int int0 = NumberUtils.compare((-1624.6288F), (-1624.6288F));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare(1892.6, 1892.6);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare((-1854.6391494805), 0.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare(1298.51153, (-862.2142929699878));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.maximum(1371, 48, 1494);
        Assert.assertEquals(1494, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.maximum((-2359), (-2359), (-2359));
        Assert.assertEquals((-2359), int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        long long0 = NumberUtils.maximum((-330L), 0L, 231L);
        Assert.assertEquals(231L, long0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        long long0 = NumberUtils.maximum((-2834L), 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        long long0 = NumberUtils.maximum((-17L), (-17L), (-17L));
        Assert.assertEquals((-17L), long0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        int int0 = NumberUtils.minimum(898, 1, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        int int0 = NumberUtils.minimum(0, (-1566), (-863));
        Assert.assertEquals((-1566), int0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.minimum((-303), 410, (-303));
        Assert.assertEquals((-303), int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        long long0 = NumberUtils.minimum(1362L, ((long) (0)), (-4L));
        Assert.assertEquals((-4L), long0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (-2359)), 0L, ((long) (-2359)));
        Assert.assertEquals((-2359L), long0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber("2f")));
        Assert.assertEquals(2.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        try {
            NumberUtils.createNumber("l");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0x2f")));
        Assert.assertEquals((-47), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test091() throws Throwable {
        Number number0 = NumberUtils.createNumber("--%2");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Long long0 = NumberUtils.createLong("-6");
        Assert.assertEquals((-6L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-6");
        Assert.assertEquals((-6), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = NumberUtils.stringToInt("0h@:wo>BAE>");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


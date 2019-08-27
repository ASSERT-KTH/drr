

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0xd");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        int int0 = NumberUtils.maximum(401, 9, (-24));
        Assert.assertEquals(401, int0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        long long0 = NumberUtils.maximum(0L, (-2253L), (-1L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        int int0 = NumberUtils.minimum(260, 119, 260);
        Assert.assertEquals(119, int0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        int int0 = NumberUtils.minimum(0, 260, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        long long0 = NumberUtils.minimum(0L, (-1L), (-2253L));
        Assert.assertEquals((-2253L), long0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), (-183));
        Assert.assertEquals((-183), int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.stringToInt("3");
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 171L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberUtils.minimum(462L, 462L, 462L);
        Assert.assertEquals(462L, long0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        int int0 = NumberUtils.minimum((-685), (-685), (-685));
        Assert.assertEquals((-685), int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        long long0 = NumberUtils.maximum((-1527L), (-1527L), (-1527L));
        Assert.assertEquals((-1527L), long0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.maximum(0, 314, (-1));
        Assert.assertEquals(314, int0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Long long0 = NumberUtils.createLong("3");
        Assert.assertEquals(3L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("1");
        Assert.assertEquals(1, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x3");
        Assert.assertEquals((-3), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Float float0 = NumberUtils.createFloat(".0");
        Assert.assertEquals(0.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Float float0 = NumberUtils.createFloat("3");
        Assert.assertEquals(3.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Double double0 = NumberUtils.createDouble("0");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Double double0 = NumberUtils.createDouble("3");
        Assert.assertEquals(3.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("1");
        Assert.assertEquals(1, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("3");
        Assert.assertEquals(3, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-1");
        Assert.assertEquals((-1), bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        try {
            NumberUtils.createNumber("l");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("3");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("F0#\'T\"gCWPp]p3r");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        try {
            NumberUtils.createFloat("e$!q^0oo3y/g6.^|a");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        int int0 = NumberUtils.stringToInt("F", 260);
        Assert.assertEquals(260, int0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("1l");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("5f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("2D");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("1");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--uPGh.RqIQ9=l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+fB?m'#Goq{Z i=");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("Eh~");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xD9.g+<:x&?*'JE-j/*");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x5f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0e$!q^0oo3y/g6.^|a");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xdrP3u");
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
        int int0 = NumberUtils.compare(1.0F, 0.0F);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare((-0.89194155F), 2277.9167F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare((-1620.9375F), (-1620.9375F));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare(1415.0, 1.0);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare((-4484.2046786662), 190.16);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 0.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.maximum((-27), (-27), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.maximum((-1825), (-216), (-216));
        Assert.assertEquals((-216), int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), ((long) (0)), ((long) (314)));
        Assert.assertEquals(314L, long0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (-216)), 0L, ((long) (-216)));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        int int0 = NumberUtils.minimum(260, 119, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (0)), 719L, (-3421L));
        Assert.assertEquals((-3421L), long0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber(".0")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber("2D")));
        Assert.assertEquals(2.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber("0D")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("6l")));
        Assert.assertEquals(6L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0x3")));
        Assert.assertEquals((-3), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Number number0 = NumberUtils.createNumber("--\"\" is not a valid number.");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Long long0 = NumberUtils.createLong("-1");
        Assert.assertEquals((-1L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        int int0 = NumberUtils.stringToInt("-0x");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        try {
            NumberUtils.createDouble("a");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber("5f")));
        Assert.assertEquals(5.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


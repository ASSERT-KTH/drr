

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x5faR~$!ep96+G");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x9");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        int int0 = NumberUtils.maximum(3467, 0, 0);
        Assert.assertEquals(3467, int0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        long long0 = NumberUtils.maximum(502L, (-1593L), ((long) (1)));
        Assert.assertEquals(502L, long0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        int int0 = NumberUtils.minimum((-1195), (-1195), 0);
        Assert.assertEquals((-1195), int0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.minimum(68, 100, 68);
        Assert.assertEquals(68, int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.stringToInt("3.L", (-22));
        Assert.assertEquals((-22), int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        int int0 = NumberUtils.stringToInt("179");
        Assert.assertEquals(179, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = NumberUtils.minimum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.maximum((-22), (-22), (-22));
        Assert.assertEquals((-22), int0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Long long0 = NumberUtils.createLong("9");
        Assert.assertEquals(9L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("#E");
        Assert.assertEquals(14, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x9");
        Assert.assertEquals((-9), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Float float0 = NumberUtils.createFloat("9");
        Assert.assertEquals(9.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Double double0 = NumberUtils.createDouble("-5");
        Assert.assertEquals((-5.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Double double0 = NumberUtils.createDouble(".0");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Double double0 = NumberUtils.createDouble("9");
        Assert.assertEquals(9.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("9");
        Assert.assertEquals(9, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("9");
        Assert.assertEquals(9, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
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
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("9");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("B!<mS)d3k1* H0&Ik");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 829);
        Assert.assertEquals(829, int0);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3.L");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("8D");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0d");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("7(");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+-;+6'-C:");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E^ a");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e+23!<zh1");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--G1MP:OJ>&?Z3xtFS");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x0D");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x.aR8$!ep96+G");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x5.aR~$!ep96+G");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0~");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("G.L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare(2242.1F, 1860.049F);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare((-1286.5083F), 0.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(0.0F, 0.0F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.compare(((double) (115)), ((double) (-1286.5083F)));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 1.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = NumberUtils.compare(5.3655, 5.3655);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        int int0 = NumberUtils.maximum(0, 102, 115);
        Assert.assertEquals(115, int0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 1L, ((long) (68)));
        Assert.assertEquals(68L, long0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (-1)), ((long) (-1)), ((long) (-1)));
        Assert.assertEquals((-1L), long0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int int0 = NumberUtils.minimum(0, (-1), (-3919));
        Assert.assertEquals((-3919), int0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (9)), 1969L, (-2055L));
        Assert.assertEquals((-2055L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (829)), 0L, 1284L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (179)), 1294L, 1969L);
        Assert.assertEquals(179L, long0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber(".0")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber("8D")));
        Assert.assertEquals(8.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber("0d")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0x0D")));
        Assert.assertEquals((-13), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Number number0 = NumberUtils.createNumber("--G1MP:OJ>&?Z3xtFS");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("1L")));
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = NumberUtils.stringToInt("");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        try {
            NumberUtils.createDouble("1L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}




package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x9");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0yhz8<DFc[A:Ql*f+P");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(" ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        long long0 = NumberUtils.maximum(1667L, 0L, 206L);
        Assert.assertEquals(1667L, long0);
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        int int0 = NumberUtils.minimum(286, 773, (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("W-jYuLj tp:>/BiEd", 102);
        Assert.assertEquals(102, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt(":WqQu0", (-620));
        Assert.assertEquals((-620), int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.stringToInt("8");
        Assert.assertEquals(8, int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        long long0 = NumberUtils.minimum(206L, ((long) (0)), 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberUtils.minimum(634L, 2952L, 655L);
        Assert.assertEquals(634L, long0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        int int0 = NumberUtils.minimum(0, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        int int0 = NumberUtils.minimum(2001, 2001, 2001);
        Assert.assertEquals(2001, int0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.maximum(0, (-1544), (-1544));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Long long0 = NumberUtils.createLong("-0");
        Assert.assertEquals(0L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0x8");
        Assert.assertEquals(8, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Float float0 = NumberUtils.createFloat("0.");
        Assert.assertEquals(0.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Float float0 = NumberUtils.createFloat("1");
        Assert.assertEquals(1.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Double double0 = NumberUtils.createDouble("0e9");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Double double0 = NumberUtils.createDouble("1");
        Assert.assertEquals(1.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("3");
        Assert.assertEquals(3, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("0e9");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("8");
        Assert.assertEquals(8, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        try {
            NumberUtils.createDouble("y53S7}-VXPx?");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("3");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        try {
            NumberUtils.createFloat("");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0xe");
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3L");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("l");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("7f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-d");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0eb");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("----#9j*^G&Fe~o bGwwK");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E@fh0Z>YeO6Q");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("2e+x[C*gZU");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xCannot pad a negative amount: ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x0.hz8<DFc[A:Ql*f+P");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x7f");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("09e9");
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
        int int0 = NumberUtils.compare(((float) (0)), 0.0F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        int int0 = NumberUtils.compare(((float) (-1)), (-177.8F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        int int0 = NumberUtils.compare(0.0F, 2644.4666F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        int int0 = NumberUtils.compare((-0.0F), ((float) (0)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare(0.7194093465805054, (-2496.67704));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare(0.0, ((double) (102)));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare((-1512.26598008), (-1512.26598008));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 941);
        Assert.assertEquals(941, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.maximum(0, 279, 215);
        Assert.assertEquals(279, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.maximum((-1), (-1), (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 1400L);
        Assert.assertEquals(1400L, long0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum((-729L), 0L, (-625L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        long long0 = NumberUtils.maximum((-74L), (-74L), (-74L));
        Assert.assertEquals((-74L), long0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.minimum(0, (-854), 1);
        Assert.assertEquals((-854), int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        long long0 = NumberUtils.minimum(624L, 1L, ((long) (-1)));
        Assert.assertEquals((-1L), long0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum((-1096L), (-1096L), (-1096L));
        Assert.assertEquals((-1096L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber("0e9")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber("7f")));
        Assert.assertEquals(7.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("3L")));
        Assert.assertEquals(3L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber("0f")));
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Number number0 = NumberUtils.createNumber("--2e+x[C*gZU");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Long long0 = NumberUtils.createLong("1");
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0xe")));
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        int int0 = NumberUtils.stringToInt("lRB tj^PCRGE]ow");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Double double0 = NumberUtils.createDouble("09e9");
        Assert.assertEquals(9.0E9, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        Float float0 = ((Float) (NumberUtils.createNumber("09e9")));
        Assert.assertEquals(8.9999995E9F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


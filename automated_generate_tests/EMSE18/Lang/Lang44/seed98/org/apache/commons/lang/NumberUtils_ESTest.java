

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0{]4S");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        int int0 = NumberUtils.maximum((-156), (-1408), (-1081938325));
        Assert.assertEquals((-156), int0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        long long0 = NumberUtils.maximum(412L, (-4378L), 462L);
        Assert.assertEquals(462L, long0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        int int0 = NumberUtils.stringToInt("c37&.", 100);
        Assert.assertEquals(100, int0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("--Minimum abbreviation width is 4");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = NumberUtils.stringToInt("-4");
        Assert.assertEquals((-4), int0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        long long0 = NumberUtils.minimum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        long long0 = NumberUtils.minimum(1639L, 1639L, 299L);
        Assert.assertEquals(299L, long0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = NumberUtils.minimum(264, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        int int0 = NumberUtils.minimum(1, 1, 1);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (0)), ((long) (0)), (-2795L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        int int0 = NumberUtils.maximum(0, 0, 0);
        Assert.assertEquals(0, int0);
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
        Long long0 = NumberUtils.createLong("-4");
        Assert.assertEquals((-4L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("9");
        Assert.assertEquals(9, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-4");
        Assert.assertEquals((-4), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Float float0 = NumberUtils.createFloat("8");
        Assert.assertEquals(8.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Float float0 = NumberUtils.createFloat("-4");
        Assert.assertEquals((-4.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Double double0 = NumberUtils.createDouble("7");
        Assert.assertEquals(7.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Double double0 = NumberUtils.createDouble("-4");
        Assert.assertEquals((-4.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
        Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("7");
        Assert.assertEquals(7, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("-4");
        Assert.assertEquals((-4), bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        try {
            NumberUtils.createFloat("Search and Replace array lengths don't match: ");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        try {
            NumberUtils.createDouble("--");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        try {
            NumberUtils.createDouble(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("94");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        int int0 = NumberUtils.stringToInt("", (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("3L");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("d");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0E7");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(" ");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+m56}T");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("eog");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0-jHL:Bz");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0Ez,P|Ap_");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xf");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xa'(u@0]mq");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0Ec");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int int0 = NumberUtils.compare(1555.934F, (-1.0F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        int int0 = NumberUtils.compare((-861.6098F), 0.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare(((float) (-1)), ((float) (-1)));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(((double) (88.0F)), ((double) (0)));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.compare((-13.571361195054514), 1.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.compare(1.0, 1.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = NumberUtils.maximum((-1408), 0, 3301);
        Assert.assertEquals(3301, int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (-1868)), 1L, 462L);
        Assert.assertEquals(462L, long0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        long long0 = NumberUtils.maximum((-4378L), (-4378L), (-4378L));
        Assert.assertEquals((-4378L), long0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.minimum(0, (-4084), 2324);
        Assert.assertEquals((-4084), int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        int int0 = NumberUtils.minimum((-1), 344, (-710));
        Assert.assertEquals((-710), int0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (0)), (-1446L), 0L);
        Assert.assertEquals((-1446L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        long long0 = NumberUtils.minimum(412L, 462L, (-3745L));
        Assert.assertEquals((-3745L), long0);
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("1L")));
        Assert.assertEquals(1L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("-1L")));
        Assert.assertEquals((-1L), ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Number number0 = NumberUtils.createNumber("--oL^xfvr");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Long long0 = NumberUtils.createLong("9");
        Assert.assertEquals(9L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        int int0 = NumberUtils.stringToInt("3");
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("94");
        Assert.assertEquals(94, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Double double0 = NumberUtils.createDouble("0");
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


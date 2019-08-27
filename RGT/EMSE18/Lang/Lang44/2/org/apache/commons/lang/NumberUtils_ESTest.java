

package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("\"");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        long long0 = NumberUtils.maximum(1223L, ((long) (100)), (-1745L));
        Assert.assertEquals(1223L, long0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        long long0 = NumberUtils.minimum((-1000L), 0L, ((long) (0)));
        Assert.assertEquals((-1000L), long0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        long long0 = NumberUtils.minimum(1212L, 440L, (-1198L));
        Assert.assertEquals((-1198L), long0);
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        int int0 = NumberUtils.stringToInt("]--L", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        int int0 = NumberUtils.stringToInt("Strings must not be null", (-675));
        Assert.assertEquals((-675), int0);
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        int int0 = NumberUtils.stringToInt("7");
        Assert.assertEquals(7, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        long long0 = NumberUtils.minimum(4654326268806809022L, 4654326268806809022L, 4654326268806809022L);
        Assert.assertEquals(4654326268806809022L, long0);
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        int int0 = NumberUtils.minimum(404, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        int int0 = NumberUtils.minimum(2882, 2882, 2338);
        Assert.assertEquals(2338, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        long long0 = NumberUtils.maximum(0L, 0L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        int int0 = NumberUtils.maximum(4126, 0, 4126);
        Assert.assertEquals(4126, int0);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Long long0 = NumberUtils.createLong("469");
        Assert.assertEquals(469L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("7");
        Assert.assertEquals(7, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0xE");
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Float float0 = NumberUtils.createFloat("7");
        Assert.assertEquals(7.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Float float0 = NumberUtils.createFloat("469");
        Assert.assertEquals(469.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Double double0 = NumberUtils.createDouble("2");
        Assert.assertEquals(2.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Double double0 = NumberUtils.createDouble("469");
        Assert.assertEquals(469.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
        Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("469");
        Assert.assertEquals((-43), bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("6");
        Assert.assertEquals(6, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("469");
        Assert.assertEquals(469, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        try {
            NumberUtils.createFloat("Ko");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
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
            NumberUtils.createDouble("\n");
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
    public void test035() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("-0x0E.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("4");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        int int0 = NumberUtils.stringToInt("", 1359);
        Assert.assertEquals(1359, int0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("17l");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("D");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0E");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--Q*PIm.Gi:ex5bz");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0{iG[/[kwVcZf");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("ez`kHB$<obRJ&c}}l5");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-+2do]N4;5eu#");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0E.");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x9E");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0d");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("469");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xd0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0xf+2do]N4;5eu@");
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
        int int0 = NumberUtils.compare(2523.0F, 2523.0F);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        int int0 = NumberUtils.compare((-2673.7146F), 5381.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        int int0 = NumberUtils.compare(0.0F, (-1.0F));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        int int0 = NumberUtils.compare(((double) (4654326268806809022L)), ((double) (4654326268806809022L)));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        int int0 = NumberUtils.compare((-36.312471832603165), 0.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = NumberUtils.compare(1.0, (-706.8737617753086));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        int int0 = NumberUtils.maximum((-1327), (-221), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        int int0 = NumberUtils.maximum((-1327), (-221), (-1327));
        Assert.assertEquals((-221), int0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        int int0 = NumberUtils.maximum((-1490), (-1490), (-1490));
        Assert.assertEquals((-1490), int0);
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (-1490)), (-14L), 2270L);
        Assert.assertEquals(2270L, long0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        long long0 = NumberUtils.maximum((-14L), (-14L), (-14L));
        Assert.assertEquals((-14L), long0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        int int0 = NumberUtils.minimum((-1642), 1359, (-2395));
        Assert.assertEquals((-2395), int0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        int int0 = NumberUtils.minimum(58, (-649), 1);
        Assert.assertEquals((-649), int0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        long long0 = NumberUtils.minimum(509L, 2270L, 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        BigDecimal bigDecimal0 = ((BigDecimal) (NumberUtils.createNumber("-0d")));
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        Long long0 = ((Long) (NumberUtils.createNumber("17l")));
        Assert.assertEquals(17L, ((long) (long0)));
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
    public void test087() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber(" 48d")));
        Assert.assertEquals(48.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        try {
            NumberUtils.createNumber("rre/>(f !1EFA.ge\"");
            Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0xE")));
        Assert.assertEquals((-14), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Number number0 = NumberUtils.createNumber("---0xiG[/[kwVcZf");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("4");
        Assert.assertEquals(4, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Long long0 = NumberUtils.createLong("4");
        Assert.assertEquals(4L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        int int0 = NumberUtils.stringToInt("--");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}




package org.apache.commons.lang;

import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtils_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0}j");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        int int0 = NumberUtils.maximum(4543, 3568, 43);
        Assert.assertEquals(4543, int0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        int int0 = NumberUtils.minimum((-2), (-260), (-260));
        Assert.assertEquals((-260), int0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        int int0 = NumberUtils.minimum(2026, 2026, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        long long0 = NumberUtils.minimum((-3638L), 0L, (-2669L));
        Assert.assertEquals((-3638L), long0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        int int0 = NumberUtils.stringToInt("?b=feHYP", 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        int int0 = NumberUtils.stringToInt(((String) (null)), 4543);
        Assert.assertEquals(4543, int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        int int0 = NumberUtils.stringToInt("1");
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        long long0 = NumberUtils.minimum(0L, ((long) (0)), 0L);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        int int0 = NumberUtils.minimum(2142, 1604, 65);
        Assert.assertEquals(65, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        int int0 = NumberUtils.maximum((-3237), (-475), 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0")));
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("1");
        Assert.assertEquals(1, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0xEd");
        Assert.assertEquals((-237), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("-0x1");
        Assert.assertEquals((-1), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Float float0 = NumberUtils.createFloat("-0");
        Assert.assertEquals((-0.0F), ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Float float0 = NumberUtils.createFloat("6");
        Assert.assertEquals(6.0F, ((float) (float0)), 0.01F);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Double double0 = NumberUtils.createDouble("-0");
        Assert.assertEquals((-0.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Double double0 = NumberUtils.createDouble("3");
        Assert.assertEquals(3.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Double double0 = NumberUtils.createDouble("-5d");
        Assert.assertEquals((-5.0), ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
        Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BigInteger bigInteger0 = NumberUtils.createBigInteger("1");
        Assert.assertEquals(1, bigInteger0.byteValue());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
        Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("1");
        Assert.assertEquals(1, bigDecimal0.byteValue());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        try {
            NumberUtils.createFloat(((String) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("0x0x5b");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("L");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("F");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("5d");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-e");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("--Minimum abbreviation width is 4");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("+haDS(5MP0ltTROLV]Y");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".EeO}\"a)-:,");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0=x?l{~cVpN/");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("...");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x5b");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x.>eO3\"a)-:,");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0xF");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0x0x5b");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("0E.>eO3\"a)-,");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber(".5EeO}\"a)-:,");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("f");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        boolean boolean0 = NumberUtils.isNumber("-0x");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("1");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits("");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        boolean boolean0 = NumberUtils.isDigits(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        int int0 = NumberUtils.compare((-6.3992405F), (-6.3992405F));
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        int int0 = NumberUtils.compare((-6.3992405F), 0.0F);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        int int0 = NumberUtils.compare(242.944F, 1.0F);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        int int0 = NumberUtils.compare(261.9427, (-472.5464122548423));
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        int int0 = NumberUtils.compare((-1806.0), 0.0);
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        int int0 = NumberUtils.compare(0.0, 0.0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        int int0 = NumberUtils.maximum(1, 1, 2906);
        Assert.assertEquals(2906, int0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        int int0 = NumberUtils.maximum((-1806), (-1806), (-1806));
        Assert.assertEquals((-1806), int0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        long long0 = NumberUtils.maximum(((long) (-403)), (-2492L), ((long) (438)));
        Assert.assertEquals(438L, long0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        long long0 = NumberUtils.maximum((-1480L), ((long) (0)), (-1480L));
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        long long0 = NumberUtils.maximum((-283L), (-283L), (-283L));
        Assert.assertEquals((-283L), long0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        int int0 = NumberUtils.minimum((-2), (-260), 0);
        Assert.assertEquals((-260), int0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        int int0 = NumberUtils.minimum(1, 57, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        long long0 = NumberUtils.minimum(5L, 0L, (-13L));
        Assert.assertEquals((-13L), long0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        long long0 = NumberUtils.minimum(((long) (1)), 1458L, ((long) (1)));
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test73() throws Throwable {
        Double double0 = ((Double) (NumberUtils.createNumber("5d")));
        Assert.assertEquals(5.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        try {
            NumberUtils.createNumber("L");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException expectedException__NumberFormatException) {
        }
    }

    @Test(timeout = 4000)
    public void test83() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("-0x5b")));
        Assert.assertEquals((-91), ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test84() throws Throwable {
        Integer integer0 = ((Integer) (NumberUtils.createNumber("0x5b")));
        Assert.assertEquals(91, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        Number number0 = NumberUtils.createNumber(((String) (null)));
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test87() throws Throwable {
        Number number0 = NumberUtils.createNumber("--OIl");
        Assert.assertNull(number0);
    }

    @Test(timeout = 4000)
    public void test89() throws Throwable {
        Long long0 = NumberUtils.createLong("3");
        Assert.assertEquals(3L, ((long) (long0)));
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        Integer integer0 = NumberUtils.createInteger("0");
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        int int0 = NumberUtils.stringToInt(";d");
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        int int0 = NumberUtils.stringToInt("T(\"*[dxrwj#k_", (-1));
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test94() throws Throwable {
        try {
            NumberUtils.createDouble("f");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test95() throws Throwable {
        try {
            NumberUtils.createFloat("");
            Assert.fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test96() throws Throwable {
        NumberUtils numberUtils0 = new NumberUtils();
    }
}


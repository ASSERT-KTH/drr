

package org.apache.commons.lang;

import org.junit.Assert;
import org.junit.Test;

public class BooleanUtils_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("HXA");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("--");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Integer integer0 = new Integer(0);
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
        Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, ((Integer) (null)), integer0);
        Assert.assertNull(integer1);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        Integer integer0 = new Integer(0);
        Integer integer1 = new Integer(0);
        Integer integer2 = BooleanUtils.toIntegerObject(((Boolean) (null)), integer0, integer1, integer1);
        Assert.assertTrue(integer2.equals(((Object) (integer0))));
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Integer integer0 = Integer.getInteger("", 0);
        Integer integer1 = new Integer(0);
        Integer integer2 = BooleanUtils.toIntegerObject(((Boolean) (null)), integer0, integer1, integer0);
        Assert.assertEquals(0, ((int) (integer2)));
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        Integer integer0 = new Integer(753);
        Integer integer1 = new Integer((-2446));
        Integer integer2 = BooleanUtils.toIntegerObject(false, integer1, integer0);
        Assert.assertEquals(753, ((int) (integer2)));
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Integer integer0 = new Integer(1204);
        Integer integer1 = new Integer(85);
        Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
        Assert.assertEquals(85, ((int) (integer2)));
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Boolean boolean0 = Boolean.TRUE;
        int int0 = BooleanUtils.toInteger(boolean0, 2552, (-1766), 1706);
        Assert.assertEquals(2552, int0);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        int int0 = BooleanUtils.toInteger(false, 0, 294);
        Assert.assertEquals(294, int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject((-2763));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean((-1679));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(true);
        String string0 = BooleanUtils.toStringYesNo(boolean0);
        Assert.assertEquals("yes", string0);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        String string0 = BooleanUtils.toStringTrueFalse(((Boolean) (null)));
        Assert.assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        String string0 = BooleanUtils.toStringOnOff(((Boolean) (null)));
        Assert.assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        String string0 = BooleanUtils.toString(false, "--", "--");
        Assert.assertEquals("--", string0);
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "Array element ");
        String string0 = BooleanUtils.toString(boolean0, ((String) (null)), "off", "java.lang.Object");
        Assert.assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        String string0 = BooleanUtils.toString(((Boolean) (null)), "', has a length less than 2", "', has a length less than 2", "");
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Integer integer0 = BooleanUtils.toIntegerObject(true, ((Integer) (null)), ((Integer) (null)));
        Assert.assertNull(integer0);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Integer integer0 = new Integer(0);
        Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
        Assert.assertEquals(0, ((int) (integer1)));
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Integer integer0 = new Integer(68);
        Boolean boolean0 = new Boolean(true);
        Integer integer1 = new Integer((-1));
        Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer0, integer0);
        Assert.assertEquals((-1), ((int) (integer2)));
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Boolean boolean0 = Boolean.TRUE;
        Integer integer0 = new Integer(1204);
        Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        Assert.assertEquals(1204, ((int) (integer1)));
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        int int0 = BooleanUtils.toInteger(true, (-1126), (-2049));
        Assert.assertEquals((-1126), int0);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[1] = true;
        booleanArray0[2] = true;
        boolean boolean0 = BooleanUtils.xor(booleanArray0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[1] = true;
        boolean boolean0 = BooleanUtils.xor(booleanArray0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        String string0 = BooleanUtils.toString(true, ((String) (null)), "");
        Assert.assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        String string0 = BooleanUtils.toString(false, "", "");
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        Boolean boolean0 = Boolean.valueOf(true);
        String string0 = BooleanUtils.toString(boolean0, "{}", "", "/@h%f5R9C");
        Assert.assertEquals("{}", string0);
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        Boolean boolean0 = new Boolean(false);
        String string0 = BooleanUtils.toString(boolean0, "xd vGQ@pVNC;;e7EE", "xd vGQ@pVNC;;e7EE", "xd vGQ@pVNC;;e7EE");
        Assert.assertEquals("xd vGQ@pVNC;;e7EE", string0);
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        Boolean boolean0 = Boolean.valueOf(false);
        boolean boolean1 = BooleanUtils.isFalse(boolean0);
        Assert.assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(true);
        boolean boolean1 = BooleanUtils.isTrue(boolean0);
        Assert.assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Boolean[] booleanArray0 = new Boolean[1];
        Boolean boolean0 = BooleanUtils.toBooleanObject("{}", "org.apache.commons.lang.ArrayUtils", "{}", "qhE~%(Rc$0=8URt6rpG");
        Boolean boolean1 = BooleanUtils.negate(boolean0);
        booleanArray0[0] = boolean1;
        Boolean boolean2 = BooleanUtils.xor(booleanArray0);
        Assert.assertTrue(boolean2);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("The Array must not be null", "The Array must not be null", ((String) (null)), "hzTQf4rT7?b#w7");
        Boolean[] booleanArray0 = new Boolean[8];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        booleanArray0[4] = boolean0;
        booleanArray0[5] = boolean0;
        booleanArray0[6] = boolean0;
        booleanArray0[7] = boolean0;
        Boolean boolean1 = BooleanUtils.xor(booleanArray0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        boolean[] booleanArray0 = new boolean[1];
        boolean boolean0 = BooleanUtils.xor(booleanArray0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        String string0 = BooleanUtils.toStringTrueFalse(boolean0);
        Assert.assertEquals("false", string0);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("", "", "");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(((String) (null)), "", ((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(((String) (null)), ((String) (null)), "QPaE");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("s5$Az8R`aDQV:^", ">\"vv5C,/(4Z^", "s5$Az8R`aDQV:^");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("t$on");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("yes");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("on");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test051() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("{}");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(((String) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("true");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean("#omA$");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("The String did not match either specified value", "x<h<bj+n", "Index: ", "The String did not match either specified value");
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(((String) (null)), "XEc0}!Ic;", "no", ((String) (null)));
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(((String) (null)), "', has a length less than 2", ((String) (null)), "', has a length less than 2");
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(((String) (null)), ((String) (null)), "true", "Y/I7sIA!>7@");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("no");
        Assert.assertFalse(boolean0);
        Assert.assertNotNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
        Assert.assertTrue(boolean0);
        Assert.assertNotNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("off");
        Assert.assertFalse(boolean0);
        Assert.assertNotNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("on");
        Assert.assertTrue(boolean0);
        Assert.assertNotNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("false");
        Assert.assertNotNull(boolean0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("true");
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("#omA$");
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Boolean boolean0 = Boolean.valueOf(true);
        Integer integer0 = new Integer(70);
        Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        Assert.assertEquals(70, ((int) (integer1)));
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Integer integer0 = new Integer((-1156));
        Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
        Assert.assertEquals((-1156), ((int) (integer1)));
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        int int0 = BooleanUtils.toInteger(((Boolean) (null)), 1243, 1243, (-104));
        Assert.assertEquals((-104), int0);
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        Boolean boolean0 = Boolean.valueOf(false);
        int int0 = BooleanUtils.toInteger(boolean0, 1357, 1287, 1357);
        Assert.assertEquals(1287, int0);
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        int int0 = BooleanUtils.toInteger(false, 0, 0);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0, 102, 0, 102);
        Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        Integer integer0 = BooleanUtils.toIntegerObject(((Boolean) (null)));
        Assert.assertNull(integer0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Integer integer0 = BooleanUtils.toIntegerObject(true);
        Assert.assertEquals(1, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Integer integer0 = BooleanUtils.toIntegerObject(false);
        Assert.assertEquals(0, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        int int0 = BooleanUtils.toInteger(true);
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        int int0 = BooleanUtils.toInteger(false);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Integer integer0 = Integer.getInteger("", 1736);
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, ((Integer) (null)), ((Integer) (null)), integer0);
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Integer integer0 = new Integer(853);
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        Integer integer0 = new Integer(69);
        Boolean boolean0 = BooleanUtils.toBooleanObject(((Integer) (null)), integer0, integer0, ((Integer) (null)));
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        Integer integer0 = new Integer(471);
        Boolean boolean0 = BooleanUtils.toBooleanObject(((Integer) (null)), integer0, ((Integer) (null)), integer0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        Integer integer0 = Integer.getInteger("The Integer did not match either specified value");
        Boolean boolean0 = BooleanUtils.toBooleanObject(((Integer) (null)), ((Integer) (null)), ((Integer) (null)), integer0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Integer integer0 = new Integer(102);
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, ((Integer) (null)), integer0, integer0);
        Assert.assertFalse(boolean0);
        Assert.assertNotNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(97, (-653), (-136), 97);
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        Integer integer0 = new Integer((-2089552082));
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
        Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
        Assert.assertNotNull(integer1);
        Assert.assertEquals(1, ((int) (integer1)));
        boolean boolean1 = BooleanUtils.toBoolean(integer1, integer0, integer1);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Integer integer0 = new Integer(0);
        boolean boolean0 = BooleanUtils.toBoolean(((Integer) (null)), ((Integer) (null)), integer0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Integer integer0 = new Integer(753);
        boolean boolean0 = BooleanUtils.toBoolean(((Integer) (null)), integer0, ((Integer) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Integer integer0 = Integer.getInteger(", Length: 0", 0);
        boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean((-188), (-188), 115);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(753, 0, 753);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(((Integer) (null)));
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Integer integer0 = new Integer(753);
        Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
        Assert.assertNotNull(boolean0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(1707);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        Boolean boolean0 = Boolean.TRUE;
        boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
        Assert.assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull(((Boolean) (null)), true);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0, 102, 0, 102);
        boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        boolean boolean0 = BooleanUtils.toBoolean(((Boolean) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        boolean boolean1 = BooleanUtils.toBoolean(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test107() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(true);
        Assert.assertTrue(boolean0);
        int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 115);
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(false);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("", "", "", "Array element ");
        boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
        Assert.assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test110() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 775);
        boolean boolean1 = BooleanUtils.isFalse(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test111() throws Throwable {
        boolean boolean0 = BooleanUtils.isFalse(((Boolean) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test112() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0);
        boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test113() throws Throwable {
        boolean boolean0 = BooleanUtils.isNotTrue(((Boolean) (null)));
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test114() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0, 102, 0, 102);
        boolean boolean1 = BooleanUtils.isTrue(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test115() throws Throwable {
        boolean boolean0 = BooleanUtils.isTrue(((Boolean) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test116() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 775);
        boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test117() throws Throwable {
        Boolean boolean0 = new Boolean(true);
        Boolean boolean1 = BooleanUtils.negate(boolean0);
        Assert.assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test118() throws Throwable {
        Boolean boolean0 = BooleanUtils.negate(((Boolean) (null)));
        Assert.assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = BooleanUtils.negate(boolean0);
        boolean boolean2 = BooleanUtils.toBoolean(boolean1);
        Assert.assertTrue(boolean2);
    }

    @Test(timeout = 4000)
    public void test120() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject("The Array must not be null", "The Array must not be null", ((String) (null)), "hzTQf4rT7?b#w7");
        String string0 = BooleanUtils.toStringOnOff(boolean0);
        Assert.assertEquals("on", string0);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test121() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        String string0 = BooleanUtils.toStringOnOff(((boolean) (boolean0)));
        Assert.assertEquals("off", string0);
    }

    @Test(timeout = 4000)
    public void test122() throws Throwable {
        Boolean boolean0 = BooleanUtils.toBooleanObject(753);
        String string0 = BooleanUtils.toStringTrueFalse(boolean0);
        Assert.assertEquals("true", string0);
        Assert.assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test123() throws Throwable {
        String string0 = BooleanUtils.toStringTrueFalse(true);
        Assert.assertEquals("true", string0);
    }

    @Test(timeout = 4000)
    public void test124() throws Throwable {
        BooleanUtils booleanUtils0 = new BooleanUtils();
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        String string0 = BooleanUtils.toStringYesNo(false);
        Assert.assertEquals("no", string0);
    }

    @Test(timeout = 4000)
    public void test126() throws Throwable {
        String string0 = BooleanUtils.toStringYesNo(((Boolean) (null)));
        Assert.assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        {
            BooleanUtils.toBoolean("tru");
        }
    }
}


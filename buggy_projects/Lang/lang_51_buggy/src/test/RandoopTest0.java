
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, var1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.negate((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringYesNo((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "yes"+ "'", var1.equals("yes"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringYesNo(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "yes"+ "'", var1.equals("yes"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringYesNo(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "no"+ "'", var1.equals("no"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Integer var1 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 1+ "'", var1.equals(1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)0, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "hi!", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.commons.lang.BooleanUtils var0 = new org.apache.commons.lang.BooleanUtils();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "yes", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isFalse((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringOnOff(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "off"+ "'", var1.equals("off"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "true", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Boolean var0 = null;
    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, var2, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isTrue((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (-1), 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "yes", "no", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "no", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringOnOff((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "off"+ "'", var1.equals("off"));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    java.lang.Integer var0 = null;
    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringYesNo((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "no"+ "'", var1.equals("no"));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "true", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    java.lang.Integer var1 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 0+ "'", var1.equals(0));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotFalse((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    int var1 = org.apache.commons.lang.BooleanUtils.toInteger(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotTrue((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    java.lang.Integer var1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 0+ "'", var1.equals(0));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean)false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.negate((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotFalse((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 10, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isFalse((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    java.lang.Boolean[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.xor(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "true", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "yes", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    java.lang.Integer var2 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)10, var2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "hi!", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isTrue((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "false", "no", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    java.lang.Integer var1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 1+ "'", var1.equals(1));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotTrue((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.lang.Integer var2 = null;
    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)0, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    int var1 = org.apache.commons.lang.BooleanUtils.toInteger(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "yes", "", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringOnOff((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "on"+ "'", var1.equals("on"));

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "on", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "true", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringOnOff(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "on"+ "'", var1.equals("on"));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, var1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    java.lang.Boolean var0 = null;
    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringOnOff(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "hi!", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (-1), 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, var1, (java.lang.Integer)0, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    boolean[] var0 = new boolean[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = org.apache.commons.lang.BooleanUtils.xor(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "on", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "on"+ "'", var3.equals("on"));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean)true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.lang.Boolean var0 = null;
    boolean var1 = org.apache.commons.lang.BooleanUtils.isFalse(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "hi!", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (-1), 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "no", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "on"+ "'", var3.equals("on"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean)true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)(-1), var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, var1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "true", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "false", "true", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "false", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "on", "on", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    java.lang.Boolean var0 = null;
    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotTrue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "true", "true", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "true", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "on", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)1, var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "", "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + true+ "'", var1.equals(true));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "true", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "true", "on", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "on", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "false", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)100, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "true", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    java.lang.Boolean var0 = null;
    boolean var1 = org.apache.commons.lang.BooleanUtils.isTrue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)10, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)1, (java.lang.Integer)0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "true", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, var1, (java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    boolean[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = org.apache.commons.lang.BooleanUtils.xor(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "false", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "no", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "yes", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 0, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean)false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "yes", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "false", "yes", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "on", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "off", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, (-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "no", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "yes", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 1, (-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "no", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    java.lang.Boolean var0 = null;
    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringYesNo(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "on", "no", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "no", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "true", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "hi!", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, var1, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + false+ "'", var1.equals(false));

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "off", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    boolean var1 = org.apache.commons.lang.BooleanUtils.toBoolean("no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "", "no", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "off", "no", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "off", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "yes", "false", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "no", "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "off", "", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "no", "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    java.lang.Boolean var0 = null;
    java.lang.String var1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "yes", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "true", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "no", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "off", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    java.lang.Boolean var0 = null;
    boolean var1 = org.apache.commons.lang.BooleanUtils.isNotFalse(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "false", "", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, var1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)(-1), var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, var1, var2, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)0, var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (-1), 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "on", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)(-1), var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, var1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "on", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "on", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "false", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "no", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "on", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "off", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "hi!", "on", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "true", "", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "yes", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "true", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    java.lang.Integer var0 = null;
    java.lang.Integer var1 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, var1, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "", "on", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)(-1), var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "false", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)(-1), var2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)0, var2, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "hi!", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "hi!", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "off", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "false", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "on", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "on"+ "'", var3.equals("on"));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (-1), 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "no", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 0, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    java.lang.Integer var3 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "off", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "false", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "false", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    java.lang.Integer var3 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "off", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)(-1), var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "false", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "no", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (-1), 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "on", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "on", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "on"+ "'", var3.equals("on"));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "false", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "true", "on", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "false", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "no", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "on", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "false", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, (java.lang.Integer)100, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "no", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "yes", "hi!", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), var1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "off", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "on", "", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 100, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 10, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    java.lang.Boolean var0 = null;
    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "yes", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

}

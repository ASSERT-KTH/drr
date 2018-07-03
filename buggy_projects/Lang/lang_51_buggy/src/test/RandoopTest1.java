
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "no", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "yes", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 1, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "yes", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "yes", "hi!", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "on", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "hi!", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    java.lang.Integer var0 = null;
    java.lang.Integer var3 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)(-1), (java.lang.Integer)0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "false", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "true", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "yes", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "yes", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "true", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "on", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "on"+ "'", var3.equals("on"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, var1, (java.lang.Integer)1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "hi!", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)10, var2, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 1, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "false", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, var1, (java.lang.Integer)0, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "off", "no", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    java.lang.Integer var0 = null;
    java.lang.Integer var2 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)10, var2, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 100, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "on", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "no", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "true", "yes", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "off", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "on", "on", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "hi!", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "yes", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "false", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "yes", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "no", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "true", "yes", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, var1, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "true", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 100, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    java.lang.Boolean var0 = null;
    java.lang.Boolean var1 = org.apache.commons.lang.BooleanUtils.negate(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "false", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "hi!", "false", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "off", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "no", "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "", "no", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "hi!", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "false", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), (-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 0, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "on", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "false", "off", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "hi!", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, var1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "hi!", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "hi!", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "false", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)10, var2, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 100, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "off", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "hi!", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 10, 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "on", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "false", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "no", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "yes", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "on", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "hi!", "", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "on", "off", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "on", "on", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "true", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "on", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "no", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, (-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "false", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "no", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "off", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "false", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    java.lang.Boolean var0 = null;
    boolean var2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    java.lang.Integer var0 = null;
    java.lang.Integer var1 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, var1, (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), var2, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, 10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "false", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 1, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 1, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)100, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, 1, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    java.lang.Integer var1 = null;
    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, var1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "hi!", "off", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "on", "yes", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 10, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)100, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "yes", "no", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "yes", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "hi!", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1+ "'", var3.equals(1));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "no", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "true", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 10, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "no", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "hi!", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "yes", "hi!", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "on", "yes", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "true", "off", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "", "false", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    java.lang.Integer var1 = null;
    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), var1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "true", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 10, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, (-1), 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "hi!", "off", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 10, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)10, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "off", "no", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "on", "false", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    java.lang.Integer var1 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, var1, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "true", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "no", "true", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, var1, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)0, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "no", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)10, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "off", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "no", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)10, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "off", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "true", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "true"+ "'", var3.equals("true"));

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)1, var2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "on", "yes", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "false", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "true", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 10, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "off", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "no", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "", "on", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "off"+ "'", var3.equals("off"));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)100, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)1, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, var2, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "no", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "false", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "no", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "false", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)(-1), (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, var1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "true", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "yes", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)100, var2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "yes", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 10, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, (-1), 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "yes", "", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "on", "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, 10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "true", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    java.lang.Integer var2 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)100, var2, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "", "false", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "off", "", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "false", "", "false");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "false", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "false", "hi!", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, var1, (java.lang.Integer)10, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("false", "false", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 10, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "no", "no", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "on", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)(-1), var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)100, var2, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    java.lang.Integer var2 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)0, var2, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    java.lang.Integer var3 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)(-1), var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "hi!", "no");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "", "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "yes", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "yes", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)(-1), (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), var1, (java.lang.Integer)1, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    java.lang.Integer var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), var1, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 10, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "false", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "off", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 100, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    java.lang.Integer var1 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), var1, (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 1, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "yes", "off", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("hi!", "off", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)(-1), (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var1 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, var1, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "off", "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "yes", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "yes"+ "'", var3.equals("yes"));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "no", "yes", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "on", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "on"+ "'", var4.equals("on"));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, (-1), 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "off", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "off", "hi!", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "off", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(100, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "true", "false", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "off", "no", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "", "no", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, (-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 10, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "yes", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    int var3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 0, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 100, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 0, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "yes", "false", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "false"+ "'", var4.equals("false"));

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)(-1), var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(var0, (java.lang.Integer)100, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "true", "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "true"+ "'", var4.equals("true"));

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    java.lang.Integer var3 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)(-1), (java.lang.Integer)100, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(false, "true", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "no", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "no"+ "'", var3.equals("no"));

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "no", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "hi!", "yes", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(1, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "false", "off", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "on", "yes", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "false", "on", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    java.lang.Boolean var0 = null;
    int var4 = org.apache.commons.lang.BooleanUtils.toInteger(var0, 0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 10, 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)100, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "yes", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    java.lang.Integer var1 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, var1, (java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "no", "no", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "no"+ "'", var4.equals("no"));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "off", "", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)100, (java.lang.Integer)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("true", "yes", "on");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "hi!", "off", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, (java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    java.lang.Boolean var0 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(var0, (java.lang.Integer)(-1), (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100+ "'", var4.equals(100));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, (java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 100+ "'", var3.equals(100));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "hi!", "no", "off");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, 10, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "true", "yes", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    java.lang.Integer var3 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, (java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 10+ "'", var3.equals(10));

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 0, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "on", "false", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "", "off", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "on", "off", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "hi!", "hi!", "false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "no", "", "true");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "false", "true", "yes");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "false", "off", "off");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 1, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }


    java.lang.Integer var2 = null;
    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)false, (java.lang.Integer)0, var2, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)true, 1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)true, "off", "false", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "off"+ "'", var4.equals("off"));

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)1, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    java.lang.Integer var3 = null;
    java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + true+ "'", var4.equals(true));

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1), 1, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "", "yes");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer)0, (java.lang.Integer)10, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    java.lang.Boolean var0 = null;
    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString(var0, "", "no", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    java.lang.Integer var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)1, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (-1), 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "", "true", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    java.lang.String var4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean)false, "", "yes", "on");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "yes"+ "'", var4.equals("yes"));

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    int var4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean)false, (-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    java.lang.Integer var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer)100, (java.lang.Integer)0, var2, (java.lang.Integer)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)(-1), (java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1)+ "'", var4.equals((-1)));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    java.lang.Integer var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(var0, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Boolean var4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "false", "off", "true");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    java.lang.Integer var4 = org.apache.commons.lang.BooleanUtils.toIntegerObject((java.lang.Boolean)true, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    java.lang.String var3 = org.apache.commons.lang.BooleanUtils.toString(true, "hi!", "no");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

}


import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(10.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 200L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-1.0d), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1072693248);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1072693248);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(1.0d, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 359.1342053695755d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), 1072693248);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1072693248, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1072693248));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072693248, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10000L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    double var2 = org.apache.commons.math.util.MathUtils.nextAfter(10.0d, 3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000000000000002d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1074790400));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var2 = org.apache.commons.math.util.MathUtils.nextAfter(Double.POSITIVE_INFINITY, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(99, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.104412573075516d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, 10, 1145664607);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(15.104412573075516d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1145664597));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(10000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(10.000000000000002d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-793020320));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, (-1072693248));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1072693348);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    double[] var3 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var8 = new double[] { (-1.0d), 0.0d, 0.0d};
    int var9 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var10 = org.apache.commons.math.util.MathUtils.equals(var3, var8);
    int var11 = org.apache.commons.math.util.MathUtils.hash(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-2081393569));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-2081393569));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double[] var3 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var8 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var9 = org.apache.commons.math.util.MathUtils.hash(var8);
    int var10 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var11 = org.apache.commons.math.util.MathUtils.equals(var3, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(Double.POSITIVE_INFINITY, 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(1072693248);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1232287713188984E10d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    double[] var3 = new double[] { 10.0d, 0.0d, 1.0d};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 118781023);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1048576));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(10.000000000000002d, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0715086071862675E302d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(100, 1072693348);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1072693348);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(3628800.0d, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3628800.0d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(99, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1072693248), 10);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    double var2 = org.apache.commons.math.util.MathUtils.nextAfter(10.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000000000000002d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    double[] var3 = new double[] { 1.0d, 0.0d, 100.0d};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var8 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var9 = org.apache.commons.math.util.MathUtils.hash(var8);
    int var10 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var11 = org.apache.commons.math.util.MathUtils.equals(var3, var8);
    int var12 = org.apache.commons.math.util.MathUtils.hash(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 32535647);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double[] var3 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var8 = new double[] { (-1.0d), 0.0d, 0.0d};
    int var9 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var10 = org.apache.commons.math.util.MathUtils.equals(var3, var8);
    int var11 = org.apache.commons.math.util.MathUtils.hash(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-2081393569));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 32535647);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1048576));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    double[] var3 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var9 = new double[] { 1.0d, 0.0d, 100.0d};
    int var10 = org.apache.commons.math.util.MathUtils.hash(var9);
    double[] var14 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var15 = org.apache.commons.math.util.MathUtils.hash(var14);
    int var16 = org.apache.commons.math.util.MathUtils.hash(var14);
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var9, var14);
    boolean var18 = org.apache.commons.math.util.MathUtils.equals(var3, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(200L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(10.000000000000002d, (-1072693248), 1072693348);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1048576), (-1048576));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(3628800.0d, 1072693248);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3628800.0d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, (-1145664597));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    double[] var3 = new double[] { 1.0d, 0.0d, 100.0d};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var8 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var9 = org.apache.commons.math.util.MathUtils.hash(var8);
    int var10 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var11 = org.apache.commons.math.util.MathUtils.equals(var3, var8);
    int var12 = org.apache.commons.math.util.MathUtils.hash(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1145664607);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm((-2081393569), 118781023);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (-1145664597));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1145664597));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(1.0f, 0, (-1048576));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(99, 1000);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1814400.000000139d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1048576), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1048576));

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (-793020320));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(100.0d, (-1074790400), (-1072693248));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(99, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    double[] var3 = new double[] { (-1.0d), 0.0d, 0.0d};
    int var4 = org.apache.commons.math.util.MathUtils.hash(var3);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-2081393569));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2081393569));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    double[] var0 = null;
    double[] var4 = new double[] { (-1.0d), 1.0d, (-1.0d)};
    int var5 = org.apache.commons.math.util.MathUtils.hash(var4);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var4);
    boolean var7 = org.apache.commons.math.util.MathUtils.equals(var0, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 32535647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double var2 = org.apache.commons.math.util.MathUtils.nextAfter(10.000000000000002d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm((-1074790400), (-2081393569));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), 118781023);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(0.0d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, 1072693348);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1072693347));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1000, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 118781023);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 10, 118781023);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.indicator(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1814400.000000139d, Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0d, 10.000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(200L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1072693248, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790400), (-793020320));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, 1072693348);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1072693248));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1145664597), 1072693248);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080678E43d, (-793020320), 118781023);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(118781023, 100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-793020320));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1145664607);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 1145664607);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080678E43d, (-1072693347), 1072693248);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, (-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, (-1145664597));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1145664607);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.sign(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var2 = org.apache.commons.math.util.MathUtils.nextAfter(15.104412573075516d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15.104412573075514d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(359.1342053695755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.0d, 1072693248);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

}

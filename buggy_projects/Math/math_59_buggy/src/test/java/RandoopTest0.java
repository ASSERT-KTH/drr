
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.Dfp var1 = new org.apache.commons.math.dfp.Dfp(var0);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.6881171418161356E43d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.36787944117144233d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10L);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(4.9E-324d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-323d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(2.6881171418161356E43d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000000002d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7182818284590458d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-322d);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     double var0 = org.apache.commons.math.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.35998908180103406d);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.352135490546587d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0E-323d, 1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-323d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.298342365610589d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-8422692239103173864L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.352135490546587d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20.17587742508833d);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.Dfp var1 = null;
//     org.apache.commons.math.dfp.Dfp var2 = org.apache.commons.math.dfp.DfpField.computeExp(var0, var1);
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.643274665532871E-17d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.35998908180103406d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.34520441705187793d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.6881171418161356E43d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    int var2 = org.apache.commons.math.util.FastMath.max(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8414709848078965d));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sin(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.cbrt(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.atan2(1.0d, 4.9E-324d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1L), var2, true);
    java.lang.String var5 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)"+ "'", var5.equals("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)"));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7031839360032603E-108d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-0.2321040789270661d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2641010744543374d));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.7182818284590458d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0E-323d, 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5E-323d);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.Dfp var1 = null;
//     org.apache.commons.math.dfp.Dfp var2 = null;
//     org.apache.commons.math.dfp.Dfp var3 = org.apache.commons.math.dfp.DfpField.computeLn(var0, var1, var2);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9991050130774393d));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7615941559557649d);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9132181497465548d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.7031839360032603E-108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-248.14669064046043d));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-248.14669064046043d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.28399980025031d));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(20.17587742508833d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1416621831), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1416621831));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7615941559557649d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.6881171418161356E43d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var2 = org.apache.commons.math.util.FastMath.max(20.17587742508833d, 5.298342365610589d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.17587742508833d);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.Dfp var1 = null;
//     org.apache.commons.math.dfp.Dfp var2 = org.apache.commons.math.dfp.Dfp.copysign(var0, var1);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin((-6.28399980025031d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0000000000000002d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000000000000002d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1416621831), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1416621831));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.8E-322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-322d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.34520441705187793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.345204417051878d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1434555694052576E-162d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6663667453928805d);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.6663667453928805d, 2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.4789349207552477E-44d);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.6663667453928805d, (-6.28399980025031d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0359456533851947d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    float var1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.35998908180103406d, 1.5E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.359989081801034d);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
//     java.lang.Throwable var3 = null;
//     var2.addSuppressed(var3);
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1416621831), 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1416621831));

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextDouble();
    long var4 = var1.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 7830967380036616271L);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8373830985134536d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)100.0f);
    java.lang.Number var2 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100.0f+ "'", var2.equals(100.0f));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.141592653589793d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    int var2 = org.apache.commons.math.util.FastMath.min(10, (-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1416621831));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1416621831);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.6663667453928805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9471499617733654d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.5E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.352135490546587d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.4532902016501035d));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-248.14669064046043d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8421709430404007E-14d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(2.8E-322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-322d);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(1.0E-323d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    boolean var2 = var1.nextBoolean();
    double var3 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.6330277796015017d));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    double var1 = org.apache.commons.math.util.FastMath.log(2.8421709430404007E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-31.191623125197538d));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-248.14669064046043d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    int[] var3 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var4 = new org.apache.commons.math.random.MersenneTwister(var3);
    double var5 = var4.nextDouble();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var4.nextInt((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.670167019390977d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8422692239103173864L);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 21.0779393487549d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.8421709430404007E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-31.191623125197538d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.8E-322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-322d);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-0.4532902016501035d), 0.36787944117144233d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.345204417051878d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.6330277796015017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2562545212456016d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(2.8421709430404007E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8421709430404014E-14d);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.6330277796015017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8586330273712336d));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    int var2 = org.apache.commons.math.util.FastMath.min(4, (-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1416621831));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.07707580902446229d));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.7182818284590458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9376558078861459d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.8421709430404014E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var9 = var7.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var13 = var11.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var14 = var9.subtract(var13);
//     org.apache.commons.math.dfp.Dfp var15 = var5.add(var14);
//     
//     // Checks the contract:  equals-hashcode on var5 and var14
//     assertTrue("Contract failed: equals-hashcode on var5 and var14", var5.equals(var14) ? var5.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var15
//     assertTrue("Contract failed: equals-hashcode on var5 and var15", var5.equals(var15) ? var5.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var5
//     assertTrue("Contract failed: equals-hashcode on var14 and var5", var14.equals(var5) ? var14.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var5
//     assertTrue("Contract failed: equals-hashcode on var15 and var5", var15.equals(var5) ? var15.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.6663667453928805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6248955503945084d);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.DfpField var2 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var4 = var2.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var4.getTwo();
//     org.apache.commons.math.dfp.Dfp var6 = org.apache.commons.math.dfp.DfpField.computeExp(var0, var4);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(2.8421709430404007E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6284439969093206E-12d);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    int var2 = org.apache.commons.math.util.FastMath.min(100, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.getTwo();
//     org.apache.commons.math.dfp.Dfp var6 = var4.multiply(2147483647);
//     
//     // Checks the contract:  var6.equals(var6)
//     assertTrue("Contract failed: var6.equals(var6)", var6.equals(var6));
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.36004964460910377d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(9.643274665532871E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.232595164407831E-32d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.670167019390977d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1416621831);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1416621831);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = null;
//     boolean var10 = var8.greaterThan(var9);
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.6284439969093206E-12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.5E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-6.28399980025031d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.881784197001252E-16d);

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     int var8 = var7.intValue();
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
//     org.apache.commons.math.dfp.Dfp var18 = org.apache.commons.math.dfp.DfpField.computeExp(var7, var12);
//     org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var24 = var22.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     boolean var25 = var7.unequal(var24);
//     
//     // Checks the contract:  equals-hashcode on var17 and var24
//     assertTrue("Contract failed: equals-hashcode on var17 and var24", var17.equals(var24) ? var17.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var17
//     assertTrue("Contract failed: equals-hashcode on var24 and var17", var24.equals(var17) ? var24.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(10.0d, 3.1434555694052576E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.DfpField var2 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var4 = var2.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var9 = var4.subtract(var8);
//     int var10 = var9.intValue();
//     org.apache.commons.math.dfp.Dfp var11 = org.apache.commons.math.dfp.DfpField.computeExp(var0, var9);
// 
//   }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.8586330273712336d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6995216443485196d));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.620277154609447d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(3.0359456533851947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 19.820657718318774d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var3 = new byte[] { (byte)10};
    var1.nextBytes(var3);
    byte[] var8 = new byte[] { (byte)100, (byte)10, (byte)1};
    var1.nextBytes(var8);
    double var10 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-0.2321040789270661d));

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(100);
//     var7.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var11 = var7.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var13 = var11.power10(100);
//     org.apache.commons.math.dfp.Dfp var14 = var13.getZero();
//     org.apache.commons.math.dfp.Dfp var15 = var5.multiply(var14);
//     
//     // Checks the contract:  equals-hashcode on var5 and var14
//     assertTrue("Contract failed: equals-hashcode on var5 and var14", var5.equals(var14) ? var5.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var15
//     assertTrue("Contract failed: equals-hashcode on var5 and var15", var5.equals(var15) ? var5.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var5
//     assertTrue("Contract failed: equals-hashcode on var14 and var5", var14.equals(var5) ? var14.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var5
//     assertTrue("Contract failed: equals-hashcode on var15 and var5", var15.equals(var5) ? var15.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-0.6330277796015017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.591588582936028d));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.8373830985134536d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var4, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var10 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var9);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var15 = new org.apache.commons.math.exception.NumberIsTooSmallException(var11, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var20 = new org.apache.commons.math.exception.MathIllegalArgumentException(var16, var17, var19);
    org.apache.commons.math.exception.util.Localizable var21 = var20.getSpecificPattern();
    var15.addSuppressed((java.lang.Throwable)var20);
    boolean var23 = var15.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var24 = var15.getSpecificPattern();
    boolean var25 = var15.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var29 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var27, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var30 = var29.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var35 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var36 = var35.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var37 = new org.apache.commons.math.exception.MathIllegalArgumentException(var30, var36);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.exception.util.Localizable var40 = null;
    java.lang.Object[] var42 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var43 = new org.apache.commons.math.exception.MathIllegalArgumentException(var39, var40, var42);
    org.apache.commons.math.exception.MathIllegalArgumentException var44 = new org.apache.commons.math.exception.MathIllegalArgumentException(var38, var42);
    org.apache.commons.math.exception.MathRuntimeException var45 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var15, var26, var30, var42);
    org.apache.commons.math.exception.util.Localizable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    java.lang.Object[] var49 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var50 = new org.apache.commons.math.exception.MathIllegalArgumentException(var46, var47, var49);
    org.apache.commons.math.exception.util.Localizable var51 = var50.getSpecificPattern();
    java.lang.Object[] var52 = var50.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var53 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var26, var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var4 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var1, var3);
    org.apache.commons.math.exception.util.Localizable var5 = var4.getSpecificPattern();
    java.lang.String var6 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.MathIllegalArgumentException: "+ "'", var6.equals("org.apache.commons.math.exception.MathIllegalArgumentException: "));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.6284439969093206E-12d, (-0.2321040789270661d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 544.622538446541d);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(100);
//     var7.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var10 = var7.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var11 = var7.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var12 = var5.newInstance(var11);
//     
//     // Checks the contract:  var12.equals(var12)
//     assertTrue("Contract failed: var12.equals(var12)", var12.equals(var12));
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.36004964460910377d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7114113595019805d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(byte)0, (java.lang.Number)(short)1, false);
    java.lang.String var5 = var4.toString();
    org.apache.commons.math.exception.util.Localizable var6 = var4.getGeneralPattern();
    boolean var7 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)"+ "'", var5.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.9132181497465548d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.359989081801034d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.359989081801034d);

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     org.apache.commons.math.dfp.Dfp var10 = null;
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var13 = var12.newDfp();
//     org.apache.commons.math.dfp.Dfp var14 = var5.dotrap(1, "", var10, var13);
//     
//     // Checks the contract:  var14.equals(var14)
//     assertTrue("Contract failed: var14.equals(var14)", var14.equals(var14));
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.34520441705187793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.34520441705187793d);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     var9.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
//     org.apache.commons.math.dfp.Dfp var16 = var15.getZero();
//     org.apache.commons.math.dfp.Dfp var17 = var5.add(var16);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var20 = var19.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.Dfp var21 = var17.newInstance(var20);
//     
//     // Checks the contract:  var21.equals(var21)
//     assertTrue("Contract failed: var21.equals(var21)", var21.equals(var21));
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-6.28399980025031d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-267.9630607579132d));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.141592653589793d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(23.620277154609447d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.62027715460945d);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.getZero();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp((byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = var4.multiply(var8);
//     
//     // Checks the contract:  var9.equals(var9)
//     assertTrue("Contract failed: var9.equals(var9)", var9.equals(var9));
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(9.643274665532871E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.643274665532871E-17d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.232595164407831E-32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.232595164407831E-32d);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(2.8421709430404014E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8421709430404014E-14d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.getZero();
    int var5 = var3.classify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5063656411097588d));

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var6 = var5.getTwo();
//     org.apache.commons.math.dfp.DfpField var8 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var10 = var8.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var11 = var8.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var15 = var13.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var17 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var19 = var17.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var20 = var15.subtract(var19);
//     org.apache.commons.math.dfp.Dfp var21 = org.apache.commons.math.dfp.Dfp.copysign(var11, var19);
//     org.apache.commons.math.dfp.Dfp var22 = var5.divide(var11);
//     
//     // Checks the contract:  equals-hashcode on var5 and var20
//     assertTrue("Contract failed: equals-hashcode on var5 and var20", var5.equals(var20) ? var5.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var22
//     assertTrue("Contract failed: equals-hashcode on var5 and var22", var5.equals(var22) ? var5.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var5
//     assertTrue("Contract failed: equals-hashcode on var20 and var5", var20.equals(var5) ? var20.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var5
//     assertTrue("Contract failed: equals-hashcode on var22 and var5", var22.equals(var5) ? var22.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var5 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var7 = var5.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var8 = var3.subtract(var7);
//     org.apache.commons.math.dfp.Dfp var10 = var3.newInstance(7830967380036616271L);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)");
//     
//     // Checks the contract:  equals-hashcode on var8 and var12
//     assertTrue("Contract failed: equals-hashcode on var8 and var12", var8.equals(var12) ? var8.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var8
//     assertTrue("Contract failed: equals-hashcode on var12 and var8", var12.equals(var8) ? var12.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(1L);
    int var2 = var1.nextInt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 485306839);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5091784786580567d);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(23.62027715460945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.620277154609454d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextDouble();
    float var4 = var1.nextFloat();
    var1.setSeed((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.4245175f);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.591588582936028d), 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.591588582936028d));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9376558078861459d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8061733063738288d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2227587494850775E-162d);

  }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
//     org.apache.commons.math.dfp.Dfp var5 = null;
//     org.apache.commons.math.dfp.Dfp var6 = var4.newInstance(var5);
// 
//   }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.6663667453928805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6663667453928807d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9440892412430648d));

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getE();
//     org.apache.commons.math.dfp.Dfp var6 = var4.newInstance(0.42451759467098804d);
// 
//   }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var7 = var3.newInstance((-1416621831));
//     org.apache.commons.math.dfp.Dfp var9 = var7.multiply(1416621831);
//     
//     // Checks the contract:  var9.equals(var9)
//     assertTrue("Contract failed: var9.equals(var9)", var9.equals(var9));
// 
//   }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(2.2562545212456016d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5526952143984976d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.9991050130774393d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9991050130774393d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var11 = var1.getOne();
    int var12 = var11.getRadixDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 25);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.6663667453928807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5877949369993395d);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     var6.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
//     int var13 = var12.intValue();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
//     org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
//     org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
//     org.apache.commons.math.dfp.DfpField var25 = var23.getField();
//     org.apache.commons.math.dfp.Dfp var26 = null;
//     org.apache.commons.math.dfp.Dfp var27 = var25.newDfp(var26);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    int var2 = org.apache.commons.math.util.FastMath.min(485306839, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow(Double.NaN, (-0.21841921301152d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.35998908180103406d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3763903866136108d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100L);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(23.620277154609447d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.0d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.694106911714525d);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(23.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.8291136516208812d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-8422692239103173864L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.6248955503945084d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6248955503945085d);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)1.0E-323d);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    boolean var4 = var3.nextBoolean();
    double var5 = var3.nextGaussian();
    double var6 = var3.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.21841921301152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.2954773017385812d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var8 = var1.newDfp("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var2 = var1.nextGaussian();
    int var4 = var1.nextInt(10);
    long var5 = var1.nextLong();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.nextInt(0);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2791086357065146475L));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-2791086357065146475L), 420988767086167817L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2791086357065146475L));

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, 8422692239103173864L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8422692239103173864L);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    double var1 = org.apache.commons.math.util.FastMath.log(3.1434555694052576E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-371.87346237041066d));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.34520441705187793d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-323d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getE();
//     org.apache.commons.math.dfp.Dfp var5 = var4.rint();
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(2.8421709430404014E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6858739404357614E-7d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.670167019390977d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9545637434217653d);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    boolean var12 = var4.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var13 = var4.getSpecificPattern();
    java.lang.Object[] var14 = var4.getArguments();
    boolean var15 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.8373830985134536d, 3.1434555694052576E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.5877949369993395d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.23077415906422044d));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var13 = var11.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var14 = var13.negate();
    org.apache.commons.math.dfp.DfpField var16 = new org.apache.commons.math.dfp.DfpField(100);
    var16.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var20 = var16.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var22 = var20.power10(100);
    int var23 = var22.intValue();
    org.apache.commons.math.dfp.DfpField var25 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var27 = var25.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var32 = var27.subtract(var31);
    org.apache.commons.math.dfp.Dfp var33 = org.apache.commons.math.dfp.DfpField.computeExp(var22, var27);
    org.apache.commons.math.dfp.Dfp var34 = var13.newInstance(var33);
    org.apache.commons.math.dfp.DfpField var35 = var33.getField();
    org.apache.commons.math.dfp.Dfp var37 = var35.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var38 = var37.getTwo();
    org.apache.commons.math.dfp.DfpField var40 = new org.apache.commons.math.dfp.DfpField(100);
    var40.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var44 = var40.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var46 = var44.power10(100);
    int var47 = var46.intValue();
    org.apache.commons.math.dfp.DfpField var49 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var51 = var49.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var55 = var53.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var56 = var51.subtract(var55);
    org.apache.commons.math.dfp.Dfp var57 = org.apache.commons.math.dfp.DfpField.computeExp(var46, var51);
    org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
    var63.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var67 = var63.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var69 = var67.power10(100);
    int var70 = var69.intValue();
    org.apache.commons.math.dfp.DfpField var72 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var74 = var72.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var76 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var78 = var76.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var79 = var74.subtract(var78);
    org.apache.commons.math.dfp.Dfp var80 = org.apache.commons.math.dfp.DfpField.computeExp(var69, var74);
    boolean var81 = var61.greaterThan(var69);
    org.apache.commons.math.dfp.Dfp var82 = var57.multiply(var61);
    org.apache.commons.math.dfp.Dfp var83 = var4.dotrap(1093980884, "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)", var38, var61);
    org.apache.commons.math.dfp.Dfp var85 = var83.power10K(24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.5282202f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.694106911714525d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2507203741539088d);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     var6.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
//     int var13 = var12.intValue();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
//     org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
//     org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
//     org.apache.commons.math.dfp.DfpField var25 = var23.getField();
//     org.apache.commons.math.dfp.Dfp var27 = var25.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
//     org.apache.commons.math.dfp.Dfp var30 = var28.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
//     org.apache.commons.math.dfp.Dfp var31 = var30.negate();
//     
//     // Checks the contract:  equals-hashcode on var22 and var31
//     assertTrue("Contract failed: equals-hashcode on var22 and var31", var22.equals(var31) ? var22.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var31
//     assertTrue("Contract failed: equals-hashcode on var27 and var31", var27.equals(var31) ? var27.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var31
//     assertTrue("Contract failed: equals-hashcode on var28 and var31", var28.equals(var31) ? var28.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var31
//     assertTrue("Contract failed: equals-hashcode on var30 and var31", var30.equals(var31) ? var30.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var22
//     assertTrue("Contract failed: equals-hashcode on var31 and var22", var31.equals(var22) ? var31.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var27
//     assertTrue("Contract failed: equals-hashcode on var31 and var27", var31.equals(var27) ? var31.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var28
//     assertTrue("Contract failed: equals-hashcode on var31 and var28", var31.equals(var28) ? var31.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var30
//     assertTrue("Contract failed: equals-hashcode on var31 and var30", var31.equals(var30) ? var31.hashCode() == var30.hashCode() : true);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-371.87346237041066d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-371.0d));

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     var6.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
//     int var13 = var12.intValue();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
//     org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
//     org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
//     org.apache.commons.math.dfp.DfpField var25 = var23.getField();
//     org.apache.commons.math.dfp.Dfp var26 = var23.getTwo();
//     java.lang.String var27 = var26.toString();
//     org.apache.commons.math.dfp.Dfp var30 = var26.newInstance((byte)(-1), (byte)0);
//     
//     // Checks the contract:  equals-hashcode on var22 and var30
//     assertTrue("Contract failed: equals-hashcode on var22 and var30", var22.equals(var30) ? var22.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var22
//     assertTrue("Contract failed: equals-hashcode on var30 and var22", var30.equals(var22) ? var30.hashCode() == var22.hashCode() : true);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.49005226916427136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.6858739404357614E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000000142d);

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var7 = var1.newDfp((-1416621831));
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var11 = var9.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var13 = var11.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var16 = var13.newInstance((byte)0, (byte)1);
//     boolean var17 = var7.lessThan(var16);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var21.negate();
//     org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
//     var24.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var28 = var24.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var30 = var28.power10(100);
//     int var31 = var30.intValue();
//     org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var35 = var33.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var37 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var39 = var37.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var40 = var35.subtract(var39);
//     org.apache.commons.math.dfp.Dfp var41 = org.apache.commons.math.dfp.DfpField.computeExp(var30, var35);
//     org.apache.commons.math.dfp.Dfp var42 = var21.newInstance(var41);
//     org.apache.commons.math.dfp.DfpField var43 = var41.getField();
//     org.apache.commons.math.dfp.Dfp var44 = var41.getTwo();
//     org.apache.commons.math.dfp.Dfp var45 = var16.divide(var44);
//     
//     // Checks the contract:  equals-hashcode on var13 and var40
//     assertTrue("Contract failed: equals-hashcode on var13 and var40", var13.equals(var40) ? var13.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var13
//     assertTrue("Contract failed: equals-hashcode on var40 and var13", var40.equals(var13) ? var40.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    int var2 = org.apache.commons.math.util.FastMath.max(485306839, (-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 485306839);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(20.17587742508833d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.698248470456864d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.232595164407831E-32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.232595164407831E-32d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-0.23077415906422044d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.793918745142536d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    long var1 = org.apache.commons.math.util.FastMath.round(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-9223372036854775808L));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(3.698248470456864d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9987739565112981d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.5877949369993395d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5313968495251277d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    long var2 = org.apache.commons.math.util.FastMath.max(7830967380036616271L, (-2791086357065146475L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7830967380036616271L);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 57.40580939343808d);

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = var8.negate();
//     org.apache.commons.math.dfp.Dfp var10 = var8.newInstance();
//     
//     // Checks the contract:  equals-hashcode on var5 and var10
//     assertTrue("Contract failed: equals-hashcode on var5 and var10", var5.equals(var10) ? var5.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var5
//     assertTrue("Contract failed: equals-hashcode on var10 and var5", var10.equals(var5) ? var10.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4711276743037347d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1L, 7830967380036616271L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7830967380036616271L);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.7114113595019805d, (-0.9440892412430648d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7114113595019804d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    double var1 = org.apache.commons.math.util.FastMath.log(23.620277154609454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.162105544595779d);

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     int var8 = var7.intValue();
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
//     org.apache.commons.math.dfp.Dfp var18 = org.apache.commons.math.dfp.DfpField.computeExp(var7, var12);
//     org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
//     var24.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var28 = var24.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var30 = var28.power10(100);
//     int var31 = var30.intValue();
//     org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var35 = var33.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var37 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var39 = var37.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var40 = var35.subtract(var39);
//     org.apache.commons.math.dfp.Dfp var41 = org.apache.commons.math.dfp.DfpField.computeExp(var30, var35);
//     boolean var42 = var22.greaterThan(var30);
//     org.apache.commons.math.dfp.Dfp var43 = var18.multiply(var22);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     var45.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var49 = var45.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var51 = var49.power10(100);
//     org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
//     var53.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var57 = var53.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var59 = var57.power10(100);
//     org.apache.commons.math.dfp.Dfp var60 = var59.getZero();
//     org.apache.commons.math.dfp.Dfp var61 = var49.add(var60);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var66 = var65.negate();
//     org.apache.commons.math.dfp.DfpField var68 = new org.apache.commons.math.dfp.DfpField(100);
//     var68.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var72 = var68.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var74 = var72.power10(100);
//     int var75 = var74.intValue();
//     org.apache.commons.math.dfp.DfpField var77 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var79 = var77.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var81 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var83 = var81.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var84 = var79.subtract(var83);
//     org.apache.commons.math.dfp.Dfp var85 = org.apache.commons.math.dfp.DfpField.computeExp(var74, var79);
//     org.apache.commons.math.dfp.Dfp var86 = var65.newInstance(var85);
//     org.apache.commons.math.dfp.Dfp var87 = var61.newInstance(var85);
//     boolean var88 = var43.lessThan(var87);
//     org.apache.commons.math.dfp.Dfp var89 = null;
//     org.apache.commons.math.dfp.Dfp var90 = var87.subtract(var89);
// 
//   }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.DfpField var6 = var3.getField();
//     org.apache.commons.math.dfp.Dfp var7 = var6.getZero();
//     
//     // Checks the contract:  equals-hashcode on var5 and var7
//     assertTrue("Contract failed: equals-hashcode on var5 and var7", var5.equals(var7) ? var5.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var5
//     assertTrue("Contract failed: equals-hashcode on var7 and var5", var7.equals(var5) ? var7.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.5526952143984976d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 55.23918966750995d);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var6 = var1.newDfp("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.4245175f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, 7830967380036616271L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7830967380036616271L);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(23.620277154609447d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9982991565118507d));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-9223372036854775808L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-9223372036854775808L));

  }

  public void test264() {}
//   public void test264() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     double[] var6 = var5.toSplitDouble();
//     org.apache.commons.math.dfp.Dfp var8 = var5.divide(1416621831);
//     
//     // Checks the contract:  var8.equals(var8)
//     assertTrue("Contract failed: var8.equals(var8)", var8.equals(var8));
// 
//   }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    int var2 = org.apache.commons.math.util.FastMath.min(100, 1093980884);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)100.0f);
    org.apache.commons.math.exception.util.Localizable var2 = var1.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var5 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var6 = var5.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var9 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var7, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.lang.Object[] var14 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var15 = new org.apache.commons.math.exception.MathIllegalArgumentException(var11, var12, var14);
    org.apache.commons.math.exception.util.Localizable var16 = var15.getSpecificPattern();
    java.lang.Object[] var17 = var15.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var18 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var10, var17);
    java.lang.Object[] var19 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var20 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var19);
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var25 = new org.apache.commons.math.exception.NumberIsTooSmallException(var21, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    java.lang.Object[] var29 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var26, var27, var29);
    org.apache.commons.math.exception.util.Localizable var31 = var30.getSpecificPattern();
    var25.addSuppressed((java.lang.Throwable)var30);
    boolean var33 = var25.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var34 = var25.getSpecificPattern();
    boolean var35 = var25.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var39 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var37, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var40 = var39.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var45 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var46 = var45.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var47 = new org.apache.commons.math.exception.MathIllegalArgumentException(var40, var46);
    org.apache.commons.math.exception.util.Localizable var48 = null;
    org.apache.commons.math.exception.util.Localizable var49 = null;
    org.apache.commons.math.exception.util.Localizable var50 = null;
    java.lang.Object[] var52 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var53 = new org.apache.commons.math.exception.MathIllegalArgumentException(var49, var50, var52);
    org.apache.commons.math.exception.MathIllegalArgumentException var54 = new org.apache.commons.math.exception.MathIllegalArgumentException(var48, var52);
    org.apache.commons.math.exception.MathRuntimeException var55 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var25, var36, var40, var52);
    java.lang.Throwable var56 = null;
    org.apache.commons.math.exception.util.Localizable var57 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var61 = new org.apache.commons.math.exception.NumberIsTooSmallException(var57, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var62 = var61.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var63 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var65 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var63, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var66 = var65.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var67 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var69 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var67, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var70 = var69.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var71 = null;
    org.apache.commons.math.exception.util.Localizable var72 = null;
    java.lang.Object[] var74 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var75 = new org.apache.commons.math.exception.MathIllegalArgumentException(var71, var72, var74);
    org.apache.commons.math.exception.util.Localizable var76 = var75.getSpecificPattern();
    java.lang.Object[] var77 = var75.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var78 = new org.apache.commons.math.exception.MathIllegalArgumentException(var66, var70, var77);
    java.lang.Object[] var79 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var80 = new org.apache.commons.math.exception.MathIllegalArgumentException(var66, var79);
    org.apache.commons.math.exception.util.Localizable var81 = null;
    org.apache.commons.math.exception.util.Localizable var82 = null;
    org.apache.commons.math.exception.util.Localizable var83 = null;
    java.lang.Object[] var85 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var86 = new org.apache.commons.math.exception.MathIllegalArgumentException(var82, var83, var85);
    org.apache.commons.math.exception.MathIllegalArgumentException var87 = new org.apache.commons.math.exception.MathIllegalArgumentException(var81, var85);
    org.apache.commons.math.exception.MathRuntimeException var88 = new org.apache.commons.math.exception.MathRuntimeException(var56, var62, var66, var85);
    org.apache.commons.math.exception.MathRuntimeException var89 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var1, var6, var40, var85);
    boolean var90 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1L), var2, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var5, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    var4.addSuppressed((java.lang.Throwable)var9);
    java.lang.Number var11 = var9.getArgument();
    boolean var12 = var9.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 4.9E-324d+ "'", var11.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var6 = var3.newInstance((byte)100, (byte)0);
//     
//     // Checks the contract:  equals-hashcode on var3 and var6
//     assertTrue("Contract failed: equals-hashcode on var3 and var6", var3.equals(var6) ? var3.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var3
//     assertTrue("Contract failed: equals-hashcode on var6 and var3", var6.equals(var3) ? var6.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-371.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.640836539336446E160d));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var13 = var11.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var14 = var13.negate();
    org.apache.commons.math.dfp.DfpField var16 = new org.apache.commons.math.dfp.DfpField(100);
    var16.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var20 = var16.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var22 = var20.power10(100);
    int var23 = var22.intValue();
    org.apache.commons.math.dfp.DfpField var25 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var27 = var25.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var32 = var27.subtract(var31);
    org.apache.commons.math.dfp.Dfp var33 = org.apache.commons.math.dfp.DfpField.computeExp(var22, var27);
    org.apache.commons.math.dfp.Dfp var34 = var13.newInstance(var33);
    org.apache.commons.math.dfp.DfpField var35 = var33.getField();
    org.apache.commons.math.dfp.Dfp var37 = var35.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var38 = var37.getTwo();
    org.apache.commons.math.dfp.DfpField var40 = new org.apache.commons.math.dfp.DfpField(100);
    var40.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var44 = var40.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var46 = var44.power10(100);
    int var47 = var46.intValue();
    org.apache.commons.math.dfp.DfpField var49 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var51 = var49.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var55 = var53.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var56 = var51.subtract(var55);
    org.apache.commons.math.dfp.Dfp var57 = org.apache.commons.math.dfp.DfpField.computeExp(var46, var51);
    org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
    var63.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var67 = var63.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var69 = var67.power10(100);
    int var70 = var69.intValue();
    org.apache.commons.math.dfp.DfpField var72 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var74 = var72.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var76 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var78 = var76.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var79 = var74.subtract(var78);
    org.apache.commons.math.dfp.Dfp var80 = org.apache.commons.math.dfp.DfpField.computeExp(var69, var74);
    boolean var81 = var61.greaterThan(var69);
    org.apache.commons.math.dfp.Dfp var82 = var57.multiply(var61);
    org.apache.commons.math.dfp.Dfp var83 = var4.dotrap(1093980884, "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)", var38, var61);
    org.apache.commons.math.dfp.Dfp var84 = var38.newInstance();
    boolean var85 = var84.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.017453292519943295d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp((-1416621831));
    org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var11 = var9.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var13 = var11.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.Dfp var16 = var13.newInstance((byte)0, (byte)1);
    boolean var17 = var7.lessThan(var16);
    boolean var18 = var16.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    long var1 = org.apache.commons.math.util.FastMath.round(3.8291136516208812d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4L);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(19.820657718318774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20.0d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    boolean var8 = var5.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.7031839360032603E-108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7031839360032603E-108d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    int var2 = org.apache.commons.math.util.FastMath.min(24, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.9991050130774393d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5410551949032283d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.545340318748508d);

  }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
//     org.apache.commons.math.dfp.Dfp var9 = var8.getZero();
//     int var10 = var8.getRadixDigits();
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(100);
//     var12.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var16 = var12.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var17 = var12.getLn5();
//     org.apache.commons.math.dfp.Dfp var18 = var8.multiply(var17);
//     org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var21 = var20.newDfp();
//     org.apache.commons.math.dfp.Dfp var22 = var20.getPi();
//     org.apache.commons.math.dfp.Dfp var23 = var22.rint();
//     org.apache.commons.math.dfp.Dfp var24 = var18.add(var22);
//     
//     // Checks the contract:  var24.equals(var24)
//     assertTrue("Contract failed: var24.equals(var24)", var24.equals(var24));
// 
//   }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p((-6.640836539336446E160d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3859684164526524d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.9987739565112981d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9993867902425457d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.5282202f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-0.9982991565118507d), 1.5E-323d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var7 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)9.643274665532871E-17d, (java.lang.Number)(-0.2321040789270661d), false);
    var2.addSuppressed((java.lang.Throwable)var7);
    java.lang.Number var9 = var7.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-0.2321040789270661d)+ "'", var9.equals((-0.2321040789270661d)));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.7031839360032603E-108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7031839360032607E-108d);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    int var2 = org.apache.commons.math.util.FastMath.max(2147483647, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.5526952143984976d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01810012394019864d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var3 = new byte[] { (byte)10};
    var1.nextBytes(var3);
    int var6 = var1.nextInt(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.545340318748508d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.026971276625980124d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9991050130774393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9991050130774393d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(3.141592653589793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.140692632779267d);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    long var2 = org.apache.commons.math.util.FastMath.max(4L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.8586330273712336d), 0.01810012394019864d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.8586330273712336d));

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.5617368907956974d, (-31.191623125197538d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5617368907956974d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1093980884);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = var5.getOne();
//     org.apache.commons.math.dfp.Dfp var11 = var5.newInstance(0L);
//     
//     // Checks the contract:  equals-hashcode on var5 and var11
//     assertTrue("Contract failed: equals-hashcode on var5 and var11", var5.equals(var11) ? var5.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var5
//     assertTrue("Contract failed: equals-hashcode on var11 and var5", var11.equals(var5) ? var11.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getE();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
//     int var14 = var13.intValue();
//     boolean var15 = var4.unequal(var13);
//     org.apache.commons.math.dfp.DfpField var17 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var19 = var17.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var23 = var21.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var24 = var19.subtract(var23);
//     org.apache.commons.math.dfp.Dfp var25 = org.apache.commons.math.dfp.Dfp.copysign(var4, var19);
//     double var26 = var25.toDouble();
// 
//   }

  public void test306() {}
//   public void test306() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var9 = var1.newDfp((-2791086357065146475L));
//     org.apache.commons.math.dfp.Dfp var10 = null;
//     org.apache.commons.math.dfp.Dfp var11 = var9.subtract(var10);
// 
//   }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.9991050130774393d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.6330277796015017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6330277796015016d));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.23077415906422044d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.23077415906422044d);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.017453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.7581226324091723d));

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.6858739404357614E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6858739404357455E-7d);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.35998908180103406d, 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.35998908180103406d);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    boolean var4 = var3.nextBoolean();
    double var5 = var3.nextGaussian();
    long var6 = var3.nextLong();
    var3.setSeed(1093980884);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.21841921301152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 420988767086167817L);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.21841921301152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-1.0d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(2.4789349207552477E-44d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var6 = var5.rint();
    org.apache.commons.math.dfp.Dfp var7 = var6.getOne();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test319() {}
//   public void test319() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var5 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var7 = var5.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var8 = var3.subtract(var7);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var11 = var10.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp();
//     org.apache.commons.math.dfp.Dfp var13 = var10.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var14 = var10.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var15 = var8.remainder(var14);
//     
//     // Checks the contract:  var15.equals(var15)
//     assertTrue("Contract failed: var15.equals(var15)", var15.equals(var15));
// 
//   }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 57.40580939343808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getE();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
//     int var14 = var13.intValue();
//     boolean var15 = var4.unequal(var13);
//     org.apache.commons.math.dfp.DfpField var17 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var19 = var17.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var23 = var21.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var24 = var19.subtract(var23);
//     org.apache.commons.math.dfp.Dfp var25 = org.apache.commons.math.dfp.Dfp.copysign(var4, var19);
//     org.apache.commons.math.dfp.DfpField var27 = new org.apache.commons.math.dfp.DfpField(100);
//     var27.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var30 = var27.getSqr3();
//     org.apache.commons.math.dfp.DfpField var34 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var36 = var34.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var37 = var36.negate();
//     org.apache.commons.math.dfp.DfpField var39 = new org.apache.commons.math.dfp.DfpField(100);
//     var39.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var43 = var39.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var45 = var43.power10(100);
//     int var46 = var45.intValue();
//     org.apache.commons.math.dfp.DfpField var48 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var50 = var48.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var52 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var54 = var52.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var55 = var50.subtract(var54);
//     org.apache.commons.math.dfp.Dfp var56 = org.apache.commons.math.dfp.DfpField.computeExp(var45, var50);
//     org.apache.commons.math.dfp.Dfp var57 = var36.newInstance(var56);
//     org.apache.commons.math.dfp.DfpField var58 = var56.getField();
//     org.apache.commons.math.dfp.Dfp var60 = var58.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var61 = var58.getZero();
//     org.apache.commons.math.dfp.Dfp var63 = var61.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
//     org.apache.commons.math.dfp.DfpField var65 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var67 = var65.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var68 = var67.negate();
//     org.apache.commons.math.dfp.DfpField var70 = new org.apache.commons.math.dfp.DfpField(100);
//     var70.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var74 = var70.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var76 = var74.power10(100);
//     org.apache.commons.math.dfp.Dfp var77 = var67.multiply(var74);
//     org.apache.commons.math.dfp.Dfp var78 = var30.dotrap(25, "org.apache.commons.math.exception.MathIllegalArgumentException: ", var63, var67);
//     org.apache.commons.math.dfp.Dfp var79 = var25.add(var63);
//     
//     // Checks the contract:  var79.equals(var79)
//     assertTrue("Contract failed: var79.equals(var79)", var79.equals(var79));
// 
//   }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(2.2227587494850775E-162d, 1.7031839360032603E-108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test324() {}
//   public void test324() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = var8.negate();
//     org.apache.commons.math.dfp.Dfp var11 = var9.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     
//     // Checks the contract:  equals-hashcode on var5 and var11
//     assertTrue("Contract failed: equals-hashcode on var5 and var11", var5.equals(var11) ? var5.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var5
//     assertTrue("Contract failed: equals-hashcode on var11 and var5", var11.equals(var5) ? var11.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.232595164407831E-32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.09576850099350494d));

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var6 = var5.getTwo();
//     org.apache.commons.math.dfp.DfpField var8 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var10 = var8.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var11 = var10.negate();
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     var13.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var17 = var13.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var19 = var17.power10(100);
//     int var20 = var19.intValue();
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var26 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var28 = var26.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var29 = var24.subtract(var28);
//     org.apache.commons.math.dfp.Dfp var30 = org.apache.commons.math.dfp.DfpField.computeExp(var19, var24);
//     org.apache.commons.math.dfp.Dfp var31 = var10.newInstance(var30);
//     org.apache.commons.math.dfp.DfpField var32 = var30.getField();
//     org.apache.commons.math.dfp.Dfp var34 = var30.newInstance(0L);
//     boolean var35 = var6.lessThan(var34);
//     
//     // Checks the contract:  equals-hashcode on var5 and var29
//     assertTrue("Contract failed: equals-hashcode on var5 and var29", var5.equals(var29) ? var5.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var34
//     assertTrue("Contract failed: equals-hashcode on var5 and var34", var5.equals(var34) ? var5.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var5
//     assertTrue("Contract failed: equals-hashcode on var29 and var5", var29.equals(var5) ? var29.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var5
//     assertTrue("Contract failed: equals-hashcode on var34 and var5", var34.equals(var5) ? var34.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.6248955503945085d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 35.803877674109984d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.36004964460910377d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3600496446091038d);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6694091958555056d);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(100);
    org.apache.commons.math.dfp.Dfp var6 = var1.getSqr2Reciprocal();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var8 = var1.newDfp(8422692239103173864L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test332() {}
//   public void test332() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     int var8 = var7.intValue();
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
//     org.apache.commons.math.dfp.Dfp var18 = org.apache.commons.math.dfp.DfpField.computeExp(var7, var12);
//     org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
//     var24.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var28 = var24.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var30 = var28.power10(100);
//     int var31 = var30.intValue();
//     org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var35 = var33.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var37 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var39 = var37.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var40 = var35.subtract(var39);
//     org.apache.commons.math.dfp.Dfp var41 = org.apache.commons.math.dfp.DfpField.computeExp(var30, var35);
//     boolean var42 = var22.greaterThan(var30);
//     org.apache.commons.math.dfp.Dfp var43 = var18.multiply(var22);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     var45.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var49 = var45.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var51 = var49.power10(100);
//     org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
//     var53.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var57 = var53.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var59 = var57.power10(100);
//     org.apache.commons.math.dfp.Dfp var60 = var59.getZero();
//     org.apache.commons.math.dfp.Dfp var61 = var49.add(var60);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var66 = var65.negate();
//     org.apache.commons.math.dfp.DfpField var68 = new org.apache.commons.math.dfp.DfpField(100);
//     var68.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var72 = var68.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var74 = var72.power10(100);
//     int var75 = var74.intValue();
//     org.apache.commons.math.dfp.DfpField var77 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var79 = var77.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var81 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var83 = var81.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var84 = var79.subtract(var83);
//     org.apache.commons.math.dfp.Dfp var85 = org.apache.commons.math.dfp.DfpField.computeExp(var74, var79);
//     org.apache.commons.math.dfp.Dfp var86 = var65.newInstance(var85);
//     org.apache.commons.math.dfp.Dfp var87 = var61.newInstance(var85);
//     boolean var88 = var43.lessThan(var87);
//     org.apache.commons.math.dfp.Dfp var90 = var43.newInstance(0);
//     org.apache.commons.math.dfp.Dfp var91 = null;
//     org.apache.commons.math.dfp.Dfp var92 = org.apache.commons.math.dfp.DfpField.computeExp(var43, var91);
// 
//   }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(20.17587742508833d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7223511526939332d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.793918745142536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2307741590642204d));

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.01810012394019864d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.469446951953614E-18d);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     var6.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
//     int var13 = var12.intValue();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
//     org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
//     org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
//     org.apache.commons.math.dfp.DfpField var28 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var30 = var28.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var31 = var30.negate();
//     org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
//     var33.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var37 = var33.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var39 = var37.power10(100);
//     int var40 = var39.intValue();
//     org.apache.commons.math.dfp.DfpField var42 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var44 = var42.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var46 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var48 = var46.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var49 = var44.subtract(var48);
//     org.apache.commons.math.dfp.Dfp var50 = org.apache.commons.math.dfp.DfpField.computeExp(var39, var44);
//     org.apache.commons.math.dfp.Dfp var51 = var30.newInstance(var50);
//     org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var55 = var53.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var56 = var55.getZero();
//     org.apache.commons.math.dfp.Dfp var57 = var24.dotrap(2147483647, "org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)", var51, var55);
//     org.apache.commons.math.dfp.Dfp var58 = null;
//     org.apache.commons.math.dfp.Dfp var59 = var51.remainder(var58);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    long var2 = org.apache.commons.math.util.FastMath.min(7830967380036616271L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4L);

  }

  public void test338() {}
//   public void test338() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.9545637434217653d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.25471222f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.9471499617733654d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.3859684164526524d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0754151025300256d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.6663667453928805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0L);
    org.apache.commons.math.dfp.Dfp[] var6 = var1.getSqr2Split();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(4);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getESplit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var4 = var1.newDfp((-2791086357065146475L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.2954773017385812d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.28730238256267354d);

  }

  public void test346() {}
//   public void test346() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     var1.setIEEEFlagsBits(10);
//     int var8 = var1.getRadixDigits();
//     org.apache.commons.math.dfp.Dfp var9 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var10 = var9.getOne();
//     org.apache.commons.math.dfp.Dfp var12 = var9.newInstance(0);
//     org.apache.commons.math.dfp.Dfp var13 = var12.negate();
//     
//     // Checks the contract:  equals-hashcode on var12 and var13
//     assertTrue("Contract failed: equals-hashcode on var12 and var13", var12.equals(var13) ? var12.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var12
//     assertTrue("Contract failed: equals-hashcode on var13 and var12", var13.equals(var12) ? var13.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1373220393635d);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.0E-323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var4 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var1, var3);
    org.apache.commons.math.exception.util.Localizable var5 = var4.getSpecificPattern();
    org.apache.commons.math.exception.util.Localizable var6 = var4.getGeneralPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8414709848078966d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.15671098f);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-267.9630607579132d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1853555716521891E116d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.2954773017385812d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.29979564110524093d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(8.881784197001252E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.9993867902425457d, (-6.640836539336446E160d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.141592653589793d);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var9 = var7.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var10 = var9.getTwo();
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var14 = var12.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var15 = var14.negate();
//     org.apache.commons.math.dfp.Dfp var18 = var15.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.Dfp var19 = var9.divide(var15);
//     org.apache.commons.math.dfp.Dfp var20 = var5.add(var9);
//     
//     // Checks the contract:  var20.equals(var20)
//     assertTrue("Contract failed: var20.equals(var20)", var20.equals(var20));
// 
//   }

  public void test357() {}
//   public void test357() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var7 = var3.newInstance((byte)(-1));
//     org.apache.commons.math.dfp.Dfp var8 = var3.getZero();
//     
//     // Checks the contract:  equals-hashcode on var5 and var8
//     assertTrue("Contract failed: equals-hashcode on var5 and var8", var5.equals(var8) ? var5.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var5
//     assertTrue("Contract failed: equals-hashcode on var8 and var5", var8.equals(var5) ? var8.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test358() {}
//   public void test358() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p((-6.28399980025031d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4L);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    double var2 = org.apache.commons.math.util.FastMath.max(57.40580939343808d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 57.40580939343808d);

  }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
//     org.apache.commons.math.dfp.Dfp var14 = org.apache.commons.math.dfp.Dfp.copysign(var4, var12);
//     org.apache.commons.math.dfp.Dfp var15 = var4.rint();
//     org.apache.commons.math.dfp.Dfp var17 = var4.newInstance((byte)1);
//     org.apache.commons.math.dfp.Dfp var19 = var4.divide(2147483647);
//     
//     // Checks the contract:  var19.equals(var19)
//     assertTrue("Contract failed: var19.equals(var19)", var19.equals(var19));
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-371.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.529171920409294E-162d);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.DfpField var6 = var3.getField();
//     org.apache.commons.math.dfp.Dfp var7 = var6.getPi();
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var11 = var9.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var12 = var11.negate();
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     var14.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var18 = var14.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var20 = var18.power10(100);
//     int var21 = var20.intValue();
//     org.apache.commons.math.dfp.DfpField var23 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var25 = var23.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var27 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var29 = var27.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var30 = var25.subtract(var29);
//     org.apache.commons.math.dfp.Dfp var31 = org.apache.commons.math.dfp.DfpField.computeExp(var20, var25);
//     org.apache.commons.math.dfp.Dfp var32 = var11.newInstance(var31);
//     org.apache.commons.math.dfp.DfpField var33 = var31.getField();
//     org.apache.commons.math.dfp.Dfp var35 = var33.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     boolean var36 = var7.greaterThan(var35);
//     
//     // Checks the contract:  equals-hashcode on var5 and var30
//     assertTrue("Contract failed: equals-hashcode on var5 and var30", var5.equals(var30) ? var5.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var35
//     assertTrue("Contract failed: equals-hashcode on var5 and var35", var5.equals(var35) ? var5.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var5
//     assertTrue("Contract failed: equals-hashcode on var30 and var5", var30.equals(var5) ? var30.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var5
//     assertTrue("Contract failed: equals-hashcode on var35 and var5", var35.equals(var5) ? var35.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.2507203741539088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.097160224532572d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    long var2 = org.apache.commons.math.util.FastMath.min(6480552030174106886L, (-2791086357065146475L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2791086357065146475L));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, 4589153899890174528L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4589153899890174528L);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    long var2 = org.apache.commons.math.util.FastMath.max(8422692239103173864L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8422692239103173864L);

  }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getE();
//     org.apache.commons.math.dfp.Dfp var6 = var4.power10K(10);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newInstance((byte)0);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
//     org.apache.commons.math.dfp.Dfp var19 = var12.newInstance(7830967380036616271L);
//     org.apache.commons.math.dfp.Dfp var20 = var8.remainder(var12);
//     
//     // Checks the contract:  var20.equals(var20)
//     assertTrue("Contract failed: var20.equals(var20)", var20.equals(var20));
// 
//   }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)100.0f);
    org.apache.commons.math.exception.util.Localizable var2 = var1.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var5 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var6 = var5.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var9 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var7, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.lang.Object[] var14 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var15 = new org.apache.commons.math.exception.MathIllegalArgumentException(var11, var12, var14);
    org.apache.commons.math.exception.util.Localizable var16 = var15.getSpecificPattern();
    java.lang.Object[] var17 = var15.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var18 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var10, var17);
    java.lang.Object[] var19 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var20 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var19);
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var25 = new org.apache.commons.math.exception.NumberIsTooSmallException(var21, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    java.lang.Object[] var29 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var26, var27, var29);
    org.apache.commons.math.exception.util.Localizable var31 = var30.getSpecificPattern();
    var25.addSuppressed((java.lang.Throwable)var30);
    boolean var33 = var25.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var34 = var25.getSpecificPattern();
    boolean var35 = var25.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var39 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var37, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var40 = var39.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var45 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var46 = var45.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var47 = new org.apache.commons.math.exception.MathIllegalArgumentException(var40, var46);
    org.apache.commons.math.exception.util.Localizable var48 = null;
    org.apache.commons.math.exception.util.Localizable var49 = null;
    org.apache.commons.math.exception.util.Localizable var50 = null;
    java.lang.Object[] var52 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var53 = new org.apache.commons.math.exception.MathIllegalArgumentException(var49, var50, var52);
    org.apache.commons.math.exception.MathIllegalArgumentException var54 = new org.apache.commons.math.exception.MathIllegalArgumentException(var48, var52);
    org.apache.commons.math.exception.MathRuntimeException var55 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var25, var36, var40, var52);
    java.lang.Throwable var56 = null;
    org.apache.commons.math.exception.util.Localizable var57 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var61 = new org.apache.commons.math.exception.NumberIsTooSmallException(var57, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var62 = var61.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var63 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var65 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var63, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var66 = var65.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var67 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var69 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var67, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var70 = var69.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var71 = null;
    org.apache.commons.math.exception.util.Localizable var72 = null;
    java.lang.Object[] var74 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var75 = new org.apache.commons.math.exception.MathIllegalArgumentException(var71, var72, var74);
    org.apache.commons.math.exception.util.Localizable var76 = var75.getSpecificPattern();
    java.lang.Object[] var77 = var75.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var78 = new org.apache.commons.math.exception.MathIllegalArgumentException(var66, var70, var77);
    java.lang.Object[] var79 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var80 = new org.apache.commons.math.exception.MathIllegalArgumentException(var66, var79);
    org.apache.commons.math.exception.util.Localizable var81 = null;
    org.apache.commons.math.exception.util.Localizable var82 = null;
    org.apache.commons.math.exception.util.Localizable var83 = null;
    java.lang.Object[] var85 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var86 = new org.apache.commons.math.exception.MathIllegalArgumentException(var82, var83, var85);
    org.apache.commons.math.exception.MathIllegalArgumentException var87 = new org.apache.commons.math.exception.MathIllegalArgumentException(var81, var85);
    org.apache.commons.math.exception.MathRuntimeException var88 = new org.apache.commons.math.exception.MathRuntimeException(var56, var62, var66, var85);
    org.apache.commons.math.exception.MathRuntimeException var89 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var1, var6, var40, var85);
    org.apache.commons.math.exception.NumberIsTooSmallException var93 = new org.apache.commons.math.exception.NumberIsTooSmallException(var6, (java.lang.Number)(-0.21841921301152d), (java.lang.Number)57.40580939343808d, true);
    boolean var94 = var93.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1093980884, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.793918745142536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    boolean var12 = var4.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var13 = var4.getSpecificPattern();
    boolean var14 = var4.getBoundIsAllowed();
    java.lang.String var15 = var4.toString();
    java.lang.Number var16 = var4.getArgument();
    java.lang.Number var17 = var4.getMin();
    java.lang.Number var18 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"+ "'", var15.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 4.9E-324d+ "'", var16.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 100L+ "'", var17.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 100L+ "'", var18.equals(100L));

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.42451759467098804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5288527150443534d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.17747360889018282d));

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(9.643274665532871E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6830689358770354E-18d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-267.9630607579132d), 3.1434555694052576E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-267.9630607579131d));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.8418176412695313d));

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var11 = var1.getLn2();
    var1.setIEEEFlags(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-371.87346237041066d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, (-7019672003112836211L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test383() {}
//   public void test383() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var8 = var7.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var9 = var7.newDfp();
//     org.apache.commons.math.dfp.Dfp var10 = var5.nextAfter(var9);
//     org.apache.commons.math.dfp.Dfp var12 = var9.power10(1093980884);
//     org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var18 = var16.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var21 = var18.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var22 = var9.divide(var18);
//     
//     // Checks the contract:  var22.equals(var22)
//     assertTrue("Contract failed: var22.equals(var22)", var22.equals(var22));
// 
//   }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.3763903866136108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.35956862719904825d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(20.17587742508833d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.008582575688072d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(1.6284439969093206E-12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.570796326793268d);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var7 = var1.getPi();
    org.apache.commons.math.dfp.Dfp var8 = var1.getSqr3();
    int var9 = var8.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
    var1.setRoundingMode(var2);
    org.apache.commons.math.dfp.Dfp var4 = var1.getE();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    var6.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var11 = var6.getLn5();
    org.apache.commons.math.dfp.Dfp[] var12 = var6.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var15 = var6.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var16 = var6.getLn2();
    org.apache.commons.math.dfp.Dfp var18 = var6.newDfp(1093980884);
    boolean var19 = var4.lessThan(var18);
    int var20 = var4.classify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9046745947545269d);

  }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var6 = var5.getTwo();
//     int var7 = var5.log10();
//     org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var12 = var11.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var13 = var11.newDfp();
//     org.apache.commons.math.dfp.Dfp var14 = var11.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var15 = var11.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var17 = var11.newDfp(0.0d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     var19.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var23 = var19.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var25 = var23.power10(100);
//     org.apache.commons.math.dfp.Dfp var26 = var25.getZero();
//     org.apache.commons.math.dfp.Dfp var27 = var25.floor();
//     org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var32 = var31.negate();
//     org.apache.commons.math.dfp.Dfp var35 = var32.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.Dfp var36 = var35.getZero();
//     boolean var37 = var25.equals((java.lang.Object)var36);
//     org.apache.commons.math.dfp.Dfp var39 = var36.power10((-438547670));
//     org.apache.commons.math.dfp.Dfp var40 = var5.dotrap((-159860839), "2.", var17, var36);
//     
//     // Checks the contract:  equals-hashcode on var5 and var26
//     assertTrue("Contract failed: equals-hashcode on var5 and var26", var5.equals(var26) ? var5.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var36
//     assertTrue("Contract failed: equals-hashcode on var5 and var36", var5.equals(var36) ? var5.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var39
//     assertTrue("Contract failed: equals-hashcode on var5 and var39", var5.equals(var39) ? var5.hashCode() == var39.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var40
//     assertTrue("Contract failed: equals-hashcode on var5 and var40", var5.equals(var40) ? var5.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var5
//     assertTrue("Contract failed: equals-hashcode on var26 and var5", var26.equals(var5) ? var26.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var5
//     assertTrue("Contract failed: equals-hashcode on var36 and var5", var36.equals(var5) ? var36.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var39 and var5
//     assertTrue("Contract failed: equals-hashcode on var39 and var5", var39.equals(var5) ? var39.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var5
//     assertTrue("Contract failed: equals-hashcode on var40 and var5", var40.equals(var5) ? var40.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.026971276625980124d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.5063656411097588d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5309649148733836d));

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField((-159860839));
    var1.clearIEEEFlags();

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var4 = var1.newDfp((-9223372036854775808L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.35998908180103406d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9359006698223215d);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    long var2 = org.apache.commons.math.util.FastMath.min(8422692239103173864L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.Dfp var7 = var3.newInstance((byte)(-1));
    org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
    var9.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var12 = var9.getOne();
    org.apache.commons.math.dfp.Dfp var13 = var9.getLn2();
    org.apache.commons.math.dfp.Dfp var15 = var9.newDfp(420988767086167817L);
    org.apache.commons.math.dfp.Dfp var16 = var9.getTwo();
    org.apache.commons.math.dfp.Dfp var18 = var9.newDfp(2147483647);
    boolean var19 = var7.equals((java.lang.Object)2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(35.803877674109984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.9733419714522955d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.14860484011052333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.421639028830578d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.DfpField.RoundingMode var5 = var1.getRoundingMode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(4589153899890174528L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test402() {}
//   public void test402() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var13 = var11.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var14 = var13.negate();
//     org.apache.commons.math.dfp.DfpField var16 = new org.apache.commons.math.dfp.DfpField(100);
//     var16.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var20 = var16.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var22 = var20.power10(100);
//     int var23 = var22.intValue();
//     org.apache.commons.math.dfp.DfpField var25 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var27 = var25.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var32 = var27.subtract(var31);
//     org.apache.commons.math.dfp.Dfp var33 = org.apache.commons.math.dfp.DfpField.computeExp(var22, var27);
//     org.apache.commons.math.dfp.Dfp var34 = var13.newInstance(var33);
//     org.apache.commons.math.dfp.DfpField var35 = var33.getField();
//     org.apache.commons.math.dfp.Dfp var37 = var35.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var38 = var37.getTwo();
//     org.apache.commons.math.dfp.DfpField var40 = new org.apache.commons.math.dfp.DfpField(100);
//     var40.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var44 = var40.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var46 = var44.power10(100);
//     int var47 = var46.intValue();
//     org.apache.commons.math.dfp.DfpField var49 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var51 = var49.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var55 = var53.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var56 = var51.subtract(var55);
//     org.apache.commons.math.dfp.Dfp var57 = org.apache.commons.math.dfp.DfpField.computeExp(var46, var51);
//     org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     var63.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var67 = var63.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var69 = var67.power10(100);
//     int var70 = var69.intValue();
//     org.apache.commons.math.dfp.DfpField var72 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var74 = var72.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var76 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var78 = var76.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var79 = var74.subtract(var78);
//     org.apache.commons.math.dfp.Dfp var80 = org.apache.commons.math.dfp.DfpField.computeExp(var69, var74);
//     boolean var81 = var61.greaterThan(var69);
//     org.apache.commons.math.dfp.Dfp var82 = var57.multiply(var61);
//     org.apache.commons.math.dfp.Dfp var83 = var4.dotrap(1093980884, "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)", var38, var61);
//     org.apache.commons.math.dfp.Dfp var85 = var4.newInstance(0);
//     org.apache.commons.math.dfp.Dfp var86 = null;
//     org.apache.commons.math.dfp.Dfp var87 = org.apache.commons.math.dfp.DfpField.computeExp(var85, var86);
// 
//   }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0f);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.6663667453928807d, 20.17587742508833d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.17587742508833d);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp[] var9 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp[] var10 = var1.getLn5Split();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-1.7581226324091723d), 0.36004964460910377d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.3687972432500903d));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister((-16));

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.23077415906422044d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.004027768904191763d);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    long var2 = org.apache.commons.math.util.FastMath.min(8422692239103173864L, 4589153899890174528L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4589153899890174528L);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.6663667453928807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(420988767086167817L);
    org.apache.commons.math.dfp.Dfp var8 = var1.getTwo();
    int var9 = var1.getRadixDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 25);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.38646686f, 0.25471222f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.38646686f);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    var6.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
    int var13 = var12.intValue();
    org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
    org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
    org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
    org.apache.commons.math.dfp.DfpField var25 = var23.getField();
    org.apache.commons.math.dfp.Dfp var27 = var25.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp[] var28 = var25.getSqr2Split();
    var25.setIEEEFlags(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.026971276625980124d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.999636297167346d);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    int var2 = org.apache.commons.math.util.FastMath.min(4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.6944294770606061d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8855424455189903d);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var8 = var7.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var9 = var7.newDfp();
//     org.apache.commons.math.dfp.Dfp var10 = var5.nextAfter(var9);
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var14 = var12.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var16 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var18 = var16.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var19 = var14.subtract(var18);
//     java.lang.String var20 = var19.toString();
//     org.apache.commons.math.dfp.Dfp var21 = var10.newInstance(var19);
//     
//     // Checks the contract:  var21.equals(var21)
//     assertTrue("Contract failed: var21.equals(var21)", var21.equals(var21));
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.3600496446091038d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.43340057340515503d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    int var2 = org.apache.commons.math.util.FastMath.max(4, 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(3.162105544595779d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9997896180284644d));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(3.162105544595779d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.162105544595779d);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var8 = var7.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var9 = var7.newDfp();
    org.apache.commons.math.dfp.Dfp var10 = var5.nextAfter(var9);
    boolean var11 = var5.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    var6.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
    int var13 = var12.intValue();
    org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
    org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
    org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
    org.apache.commons.math.dfp.DfpField var25 = var23.getField();
    org.apache.commons.math.dfp.Dfp var26 = var23.getTwo();
    java.lang.String var27 = var26.toString();
    org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var32 = var31.getZero();
    org.apache.commons.math.dfp.Dfp var33 = var26.subtract(var31);
    boolean var34 = var31.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "2."+ "'", var27.equals("2."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.999636297167346d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5798286442366183E-4d));

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.DfpField var6 = var3.getField();
//     org.apache.commons.math.dfp.Dfp var7 = var3.getOne();
//     org.apache.commons.math.dfp.Dfp var8 = var3.floor();
//     
//     // Checks the contract:  equals-hashcode on var5 and var8
//     assertTrue("Contract failed: equals-hashcode on var5 and var8", var5.equals(var8) ? var5.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var5
//     assertTrue("Contract failed: equals-hashcode on var8 and var5", var8.equals(var5) ? var8.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-159860839), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-159860839));

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(485306839);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 485306839);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-6.640836539336446E160d), 1.5526952143984976d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6.640836539336446E160d));

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-1.8418176412695313d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.0747322506258183d));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.017453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.13211090992020036d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)1.7031839360032603E-108d);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.34520441705187793d, 0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7536103366262065d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.2562545212456016d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.2562545212456016d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.5263824737783689d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.692797479586075d);

  }

  public void test438() {}
//   public void test438() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.6330277796015017d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var2 = var1.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.Dfp var3 = var2.getOne();
//     org.apache.commons.math.dfp.Dfp var4 = var2.getZero();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var10 = var8.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var13 = var10.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var14 = var10.getOne();
//     org.apache.commons.math.dfp.Dfp var15 = var10.floor();
//     org.apache.commons.math.dfp.Dfp var16 = var2.multiply(var15);
//     
//     // Checks the contract:  var16.equals(var16)
//     assertTrue("Contract failed: var16.equals(var16)", var16.equals(var16));
// 
//   }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.6284439969093206E-12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-27.14339616015673d));

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.5617368907956974d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5092649972156686d);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
    var1.setRoundingMode(var2);
    org.apache.commons.math.dfp.Dfp var4 = var1.getE();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
    int var14 = var13.intValue();
    boolean var15 = var4.unequal(var13);
    org.apache.commons.math.dfp.DfpField var17 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var19 = var17.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var23 = var21.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var24 = var19.subtract(var23);
    org.apache.commons.math.dfp.Dfp var25 = org.apache.commons.math.dfp.Dfp.copysign(var4, var19);
    double var26 = var19.toDouble();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2.8421709430404014E-14d);

  }

  public void test443() {}
//   public void test443() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var9 = var5.negate();
//     
//     // Checks the contract:  equals-hashcode on var5 and var9
//     assertTrue("Contract failed: equals-hashcode on var5 and var9", var5.equals(var9) ? var5.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var5
//     assertTrue("Contract failed: equals-hashcode on var9 and var5", var9.equals(var5) ? var9.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.7536103366262065d, 3.469446951953614E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7536103366262064d);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(20.17587742508833d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.2507203741539088d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(4.008582575688072d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.0d);

  }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-1.3687972432500903d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test449() {}
//   public void test449() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var9 = var1.getSqr3();
//     org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
//     var11.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var14 = var11.getSqr3();
//     org.apache.commons.math.dfp.DfpField var16 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var17 = var16.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var18 = var16.newDfp();
//     org.apache.commons.math.dfp.Dfp var20 = var16.newDfp(100);
//     boolean var21 = var14.lessThan(var20);
//     org.apache.commons.math.dfp.DfpField var23 = new org.apache.commons.math.dfp.DfpField(100);
//     var23.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var27 = var23.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var28 = var23.getRoundingMode();
//     org.apache.commons.math.dfp.DfpField.RoundingMode var29 = var23.getRoundingMode();
//     org.apache.commons.math.dfp.Dfp var31 = var23.newDfp(485306839);
//     org.apache.commons.math.dfp.Dfp var32 = var23.getOne();
//     org.apache.commons.math.dfp.Dfp var33 = org.apache.commons.math.dfp.DfpField.computeLn(var9, var20, var32);
//     
//     // Checks the contract:  var33.equals(var33)
//     assertTrue("Contract failed: var33.equals(var33)", var33.equals(var33));
// 
//   }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.6663667453928807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var6 = var1.newDfp((byte)(-1), (byte)100);
//     org.apache.commons.math.dfp.Dfp var8 = var6.power10K(24);
//     org.apache.commons.math.dfp.Dfp var9 = null;
//     org.apache.commons.math.dfp.Dfp var10 = var6.add(var9);
// 
//   }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.getTwo();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var9 = var8.negate();
    org.apache.commons.math.dfp.Dfp var12 = var9.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.Dfp var13 = var3.divide(var9);
    int var14 = var13.classify();
    boolean var15 = var13.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(6480552030174106886L);
    var1.setSeed(1093980884);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.29979564110524093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3044784348989758d);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.352135490546587d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2109445684116928d);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getE();
    org.apache.commons.math.dfp.Dfp var8 = null;
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    var10.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var14 = var10.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var16 = var14.power10(100);
    org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
    var18.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var22 = var18.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var24 = var22.power10(100);
    org.apache.commons.math.dfp.Dfp var25 = var24.getZero();
    org.apache.commons.math.dfp.Dfp var26 = var14.add(var25);
    org.apache.commons.math.dfp.DfpField var28 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var30 = var28.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var31 = var30.negate();
    org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
    var33.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var37 = var33.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var39 = var37.power10(100);
    int var40 = var39.intValue();
    org.apache.commons.math.dfp.DfpField var42 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var44 = var42.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var46 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var48 = var46.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var49 = var44.subtract(var48);
    org.apache.commons.math.dfp.Dfp var50 = org.apache.commons.math.dfp.DfpField.computeExp(var39, var44);
    org.apache.commons.math.dfp.Dfp var51 = var30.newInstance(var50);
    org.apache.commons.math.dfp.Dfp var52 = var26.newInstance(var50);
    org.apache.commons.math.dfp.DfpField var54 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var56 = var54.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var57 = var54.getLn5();
    org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
    var59.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var63 = var59.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var65 = var63.power10(100);
    org.apache.commons.math.dfp.Dfp var66 = var65.getZero();
    org.apache.commons.math.dfp.Dfp var67 = var65.floor();
    org.apache.commons.math.dfp.Dfp var68 = var57.add(var65);
    int var69 = var57.classify();
    org.apache.commons.math.dfp.Dfp var70 = var52.nextAfter(var57);
    org.apache.commons.math.dfp.Dfp var71 = var5.dotrap(100, "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)", var8, var52);
    org.apache.commons.math.dfp.Dfp var73 = var5.power10K(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(23.140692632779267d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.40890356614612045d));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(-6.28399980025031d), (java.lang.Number)9.643274665532871E-17d, true);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-6.28399980025031d)+ "'", var4.equals((-6.28399980025031d)));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-438547670));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 438547670);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.7393949f, 0.7393949f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7393949f);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.6330277796015016d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-27.14339616015673d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.070415690984569E11d);

  }

  public void test464() {}
//   public void test464() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin((-27.14339616015673d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
    var1.setRoundingMode(var2);
    org.apache.commons.math.dfp.Dfp var4 = var1.getE();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    var6.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var11 = var6.getLn5();
    org.apache.commons.math.dfp.Dfp[] var12 = var6.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var15 = var6.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var16 = var6.getLn2();
    org.apache.commons.math.dfp.Dfp var18 = var6.newDfp(1093980884);
    boolean var19 = var4.lessThan(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var21 = var4.newInstance((-7019672003112836211L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1412375784), 1093980884);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1412375784));

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.Dfp var8 = var1.getSqr2();
    org.apache.commons.math.dfp.Dfp var9 = var1.getLn5();
    boolean var10 = var9.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.6330277796015016d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8062400067844204d);

  }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.8855424455189903d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-2791086357065146475L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2791086357065146475L);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.9440892412430648d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    var6.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
    org.apache.commons.math.dfp.Dfp var13 = var3.multiply(var10);
    int var14 = var3.log10();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-14));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp((-1416621831));
    org.apache.commons.math.dfp.Dfp[] var8 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp("-10.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.9987739565112981d, (-6.640836539336446E160d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-267.9630607579131d), (-0.5063656411097588d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5726860090404664d));

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
    org.apache.commons.math.dfp.Dfp var9 = var8.getZero();
    int var10 = var8.getRadixDigits();
    org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(100);
    var12.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var16 = var12.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var17 = var12.getLn5();
    org.apache.commons.math.dfp.Dfp var18 = var8.multiply(var17);
    org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
    var24.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var28 = var24.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var30 = var28.power10(100);
    int var31 = var30.intValue();
    org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var35 = var33.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var37 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var39 = var37.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var40 = var35.subtract(var39);
    org.apache.commons.math.dfp.Dfp var41 = org.apache.commons.math.dfp.DfpField.computeExp(var30, var35);
    boolean var42 = var22.greaterThan(var30);
    boolean var43 = var18.greaterThan(var22);
    int var44 = var22.log10K();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-4));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    int[] var3 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var4 = new org.apache.commons.math.random.MersenneTwister(var3);
    int var5 = var4.nextInt();
    org.apache.commons.math.random.MersenneTwister var7 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var9 = new byte[] { (byte)10};
    var7.nextBytes(var9);
    byte[] var14 = new byte[] { (byte)100, (byte)10, (byte)1};
    var7.nextBytes(var14);
    var4.nextBytes(var14);
    double var17 = var4.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.888138942422868d));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000000004d);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.6330277796015017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8062400067844204d);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
    org.apache.commons.math.dfp.Dfp var9 = var8.getZero();
    int var10 = var8.getRadixDigits();
    org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(100);
    var12.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var16 = var12.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var17 = var12.getLn5();
    org.apache.commons.math.dfp.Dfp var18 = var8.multiply(var17);
    org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
    var24.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var28 = var24.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var30 = var28.power10(100);
    int var31 = var30.intValue();
    org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var35 = var33.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var37 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var39 = var37.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var40 = var35.subtract(var39);
    org.apache.commons.math.dfp.Dfp var41 = org.apache.commons.math.dfp.DfpField.computeExp(var30, var35);
    boolean var42 = var22.greaterThan(var30);
    boolean var43 = var18.greaterThan(var22);
    org.apache.commons.math.dfp.Dfp var45 = var18.power10(1416621831);
    org.apache.commons.math.dfp.Dfp var47 = var45.newInstance(420988767086167817L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.6882538673612966d);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(8422692239103173864L);
    double var2 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.167406392052442d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.2954773017385812d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0439719471449902d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(25);
    boolean var2 = var1.nextBoolean();
    var1.setSeed(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    int var2 = org.apache.commons.math.util.FastMath.min(100, (-159860839));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-159860839));

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.0000000000000142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5403023058681278d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.3859684164526524d, 0.6663667453928807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.524994848289095d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)(-1));
    org.apache.commons.math.exception.util.Localizable var2 = var1.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var5 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)0.0f);
    org.apache.commons.math.exception.MathRuntimeException var6 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var5);
    java.lang.String var7 = var6.toString();
    java.lang.Throwable var8 = null;
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var14 = var13.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var17 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var15, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var18 = var17.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var21 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var19, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var22 = var21.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.exception.util.Localizable var24 = null;
    java.lang.Object[] var26 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var27 = new org.apache.commons.math.exception.MathIllegalArgumentException(var23, var24, var26);
    org.apache.commons.math.exception.util.Localizable var28 = var27.getSpecificPattern();
    java.lang.Object[] var29 = var27.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var18, var22, var29);
    java.lang.Object[] var31 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var32 = new org.apache.commons.math.exception.MathIllegalArgumentException(var18, var31);
    org.apache.commons.math.exception.util.Localizable var33 = null;
    org.apache.commons.math.exception.util.Localizable var34 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    java.lang.Object[] var37 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var38 = new org.apache.commons.math.exception.MathIllegalArgumentException(var34, var35, var37);
    org.apache.commons.math.exception.MathIllegalArgumentException var39 = new org.apache.commons.math.exception.MathIllegalArgumentException(var33, var37);
    org.apache.commons.math.exception.MathRuntimeException var40 = new org.apache.commons.math.exception.MathRuntimeException(var8, var14, var18, var37);
    java.lang.Number var41 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var42 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var18, var41);
    java.lang.Throwable var43 = null;
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var48 = new org.apache.commons.math.exception.NumberIsTooSmallException(var44, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var49 = var48.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var50 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var52 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var50, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var53 = var52.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var56 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var54, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var57 = var56.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var58 = null;
    org.apache.commons.math.exception.util.Localizable var59 = null;
    java.lang.Object[] var61 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var62 = new org.apache.commons.math.exception.MathIllegalArgumentException(var58, var59, var61);
    org.apache.commons.math.exception.util.Localizable var63 = var62.getSpecificPattern();
    java.lang.Object[] var64 = var62.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var65 = new org.apache.commons.math.exception.MathIllegalArgumentException(var53, var57, var64);
    java.lang.Object[] var66 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var67 = new org.apache.commons.math.exception.MathIllegalArgumentException(var53, var66);
    org.apache.commons.math.exception.util.Localizable var68 = null;
    org.apache.commons.math.exception.util.Localizable var69 = null;
    org.apache.commons.math.exception.util.Localizable var70 = null;
    java.lang.Object[] var72 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var73 = new org.apache.commons.math.exception.MathIllegalArgumentException(var69, var70, var72);
    org.apache.commons.math.exception.MathIllegalArgumentException var74 = new org.apache.commons.math.exception.MathIllegalArgumentException(var68, var72);
    org.apache.commons.math.exception.MathRuntimeException var75 = new org.apache.commons.math.exception.MathRuntimeException(var43, var49, var53, var72);
    org.apache.commons.math.exception.util.Localizable var76 = null;
    org.apache.commons.math.exception.util.Localizable var77 = null;
    java.lang.Object[] var79 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var80 = new org.apache.commons.math.exception.MathIllegalArgumentException(var76, var77, var79);
    org.apache.commons.math.exception.MathRuntimeException var81 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var6, var18, var53, var79);
    org.apache.commons.math.dfp.DfpField var83 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp var84 = var83.getSqr3Reciprocal();
    org.apache.commons.math.dfp.Dfp[] var85 = var83.getSqr2Split();
    org.apache.commons.math.exception.MathIllegalArgumentException var86 = new org.apache.commons.math.exception.MathIllegalArgumentException(var2, var18, (java.lang.Object[])var85);
    java.lang.Number var88 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var90 = new org.apache.commons.math.exception.NumberIsTooSmallException(var2, (java.lang.Number)100L, var88, true);
    org.apache.commons.math.exception.util.Localizable var91 = null;
    org.apache.commons.math.exception.util.Localizable var92 = null;
    java.lang.Object[] var94 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var95 = new org.apache.commons.math.exception.MathIllegalArgumentException(var91, var92, var94);
    org.apache.commons.math.exception.MathIllegalArgumentException var96 = new org.apache.commons.math.exception.MathIllegalArgumentException(var2, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.apache.commons.math.exception.MathRuntimeException: "+ "'", var7.equals("org.apache.commons.math.exception.MathRuntimeException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52.06320514553547d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.Dfp[] var5 = var1.getESplit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3043045862358962d);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    int[] var3 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var4 = new org.apache.commons.math.random.MersenneTwister(var3);
    int var5 = var4.nextInt();
    boolean var6 = var4.nextBoolean();
    var4.setSeed(8422692239103173864L);
    org.apache.commons.math.random.MersenneTwister var10 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var12 = new byte[] { (byte)10};
    var10.nextBytes(var12);
    byte[] var17 = new byte[] { (byte)100, (byte)10, (byte)1};
    var10.nextBytes(var17);
    org.apache.commons.math.random.MersenneTwister var20 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var22 = new byte[] { (byte)10};
    var20.nextBytes(var22);
    var10.nextBytes(var22);
    var4.nextBytes(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var27 = var4.nextInt((-4));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
//     var6.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var10 = var6.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var12 = var10.power10(100);
//     int var13 = var12.intValue();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var17 = var15.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var22 = var17.subtract(var21);
//     org.apache.commons.math.dfp.Dfp var23 = org.apache.commons.math.dfp.DfpField.computeExp(var12, var17);
//     org.apache.commons.math.dfp.Dfp var24 = var3.newInstance(var23);
//     org.apache.commons.math.dfp.DfpField var25 = var23.getField();
//     org.apache.commons.math.dfp.Dfp var27 = var25.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
//     org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
//     org.apache.commons.math.dfp.Dfp var31 = var25.newDfp((-1L));
//     org.apache.commons.math.dfp.Dfp var32 = var25.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var33 = null;
//     org.apache.commons.math.dfp.Dfp var34 = org.apache.commons.math.dfp.Dfp.copysign(var32, var33);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(3.6882538673612966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6085207514685079d);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(2791086357065146475L);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    double var2 = org.apache.commons.math.util.FastMath.max(2.6881171418161356E43d, 0.670167019390977d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.6881171418161356E43d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-27.14339616015673d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.124911632614893d);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-14));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 14);

  }

}

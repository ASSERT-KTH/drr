
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    int var2 = org.apache.commons.math.util.FastMath.min(2, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1412375784), (-16));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-16));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-438547670), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-438547670));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9132181497465548d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9132181497465548d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.5403023058681278d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2673631790022313d));

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }
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
//     org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var48 = var45.getLn5();
//     org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
//     var50.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var54 = var50.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var56 = var54.power10(100);
//     org.apache.commons.math.dfp.Dfp var57 = var56.getZero();
//     org.apache.commons.math.dfp.Dfp var58 = var56.floor();
//     org.apache.commons.math.dfp.Dfp var59 = var48.add(var56);
//     int var60 = var48.classify();
//     org.apache.commons.math.dfp.Dfp var61 = var43.nextAfter(var48);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var67 = var65.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var70 = var67.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.Dfp var71 = var70.negate();
//     org.apache.commons.math.dfp.Dfp var73 = var70.multiply(25);
//     org.apache.commons.math.dfp.Dfp var74 = var48.nextAfter(var73);
//     
//     // Checks the contract:  equals-hashcode on var16 and var67
//     assertTrue("Contract failed: equals-hashcode on var16 and var67", var16.equals(var67) ? var16.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var67
//     assertTrue("Contract failed: equals-hashcode on var40 and var67", var40.equals(var67) ? var40.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var57 and var67
//     assertTrue("Contract failed: equals-hashcode on var57 and var67", var57.equals(var67) ? var57.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var16
//     assertTrue("Contract failed: equals-hashcode on var67 and var16", var67.equals(var16) ? var67.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var40
//     assertTrue("Contract failed: equals-hashcode on var67 and var40", var67.equals(var40) ? var67.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var57
//     assertTrue("Contract failed: equals-hashcode on var67 and var57", var67.equals(var57) ? var67.hashCode() == var57.hashCode() : true);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.000959731301806d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    int var1 = org.apache.commons.math.util.FastMath.round((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-4), (-159860839));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-159860839));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.004027768904191763d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.167406392052442d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3430459756754827d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(3.469446951953614E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.469446951953614E-18d);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.9359006698223215d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    long var1 = org.apache.commons.math.util.FastMath.round(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20L);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }
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
//     org.apache.commons.math.dfp.Dfp var52 = var44.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var53 = var31.multiply(var52);
//     java.lang.String var54 = var53.toString();
//     org.apache.commons.math.dfp.DfpField var56 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var58 = var56.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var59 = var56.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.Dfp var60 = var56.getOne();
//     org.apache.commons.math.dfp.Dfp var61 = var56.getSqr2();
//     org.apache.commons.math.dfp.Dfp var62 = var56.getPi();
//     boolean var63 = var53.equals((java.lang.Object)var62);
//     org.apache.commons.math.dfp.Dfp var65 = var53.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)");
//     
//     // Checks the contract:  equals-hashcode on var22 and var65
//     assertTrue("Contract failed: equals-hashcode on var22 and var65", var22.equals(var65) ? var22.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var65
//     assertTrue("Contract failed: equals-hashcode on var27 and var65", var27.equals(var65) ? var27.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var65
//     assertTrue("Contract failed: equals-hashcode on var28 and var65", var28.equals(var65) ? var28.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var65
//     assertTrue("Contract failed: equals-hashcode on var49 and var65", var49.equals(var65) ? var49.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var22
//     assertTrue("Contract failed: equals-hashcode on var65 and var22", var65.equals(var22) ? var65.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var27
//     assertTrue("Contract failed: equals-hashcode on var65 and var27", var65.equals(var27) ? var65.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var28
//     assertTrue("Contract failed: equals-hashcode on var65 and var28", var65.equals(var28) ? var65.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var49
//     assertTrue("Contract failed: equals-hashcode on var65 and var49", var65.equals(var49) ? var65.hashCode() == var49.hashCode() : true);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
    var9.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
    int var16 = var15.intValue();
    org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var20 = var18.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var25 = var20.subtract(var24);
    org.apache.commons.math.dfp.Dfp var26 = org.apache.commons.math.dfp.DfpField.computeExp(var15, var20);
    org.apache.commons.math.dfp.Dfp var28 = var20.newInstance(10);
    org.apache.commons.math.dfp.Dfp var29 = var4.divide(var20);
    int var30 = var29.log10();
    int var31 = var29.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.5877949369993395d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6742902746709212d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(9.643274665532871E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.643274665532871E-17d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    int[] var3 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var4 = new org.apache.commons.math.random.MersenneTwister(var3);
    int var5 = var4.nextInt();
    boolean var6 = var4.nextBoolean();
    long var7 = var4.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1416621831));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-8084527413797425886L));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.3043045862358962d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.66320749752745d);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
//     org.apache.commons.math.dfp.Dfp var8 = var6.newInstance(0.0d);
//     org.apache.commons.math.dfp.Dfp var10 = var8.newInstance((byte)100);
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var13 = var12.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var14 = var12.newDfp();
//     org.apache.commons.math.dfp.Dfp var16 = var12.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var17 = var8.divide(var16);
//     
//     // Checks the contract:  var17.equals(var17)
//     assertTrue("Contract failed: var17.equals(var17)", var17.equals(var17));
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.8062400067844204d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8062400067844203d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.38646686f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-14), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-14));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.24877852705263082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 14.25395963359692d);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.Dfp var8 = var6.multiply(1093980884);
//     
//     // Checks the contract:  var8.equals(var8)
//     assertTrue("Contract failed: var8.equals(var8)", var8.equals(var8));
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(0);
    boolean var2 = var1.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(14.25395963359692d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.24877852705263082d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.7114113595019805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7114113595019806d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5640057768204683d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.34520441705187793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7014964022718436d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getE();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(6480552030174106886L);
    int var8 = var1.getIEEEFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.6663667453928807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.786072687686807d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.2562545212456016d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.547263044760715d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1), (-16));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.5282202f, 0.4245175f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4245175f);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.getTwo();
//     org.apache.commons.math.dfp.Dfp var6 = var3.newInstance(7830967380036616271L);
//     org.apache.commons.math.dfp.Dfp var7 = var3.rint();
//     org.apache.commons.math.dfp.Dfp var8 = null;
//     org.apache.commons.math.dfp.Dfp var9 = var3.subtract(var8);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.591588582936028d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5310371713763216d));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    boolean var5 = var4.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.8855424455189903d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    long var2 = org.apache.commons.math.util.FastMath.min(2791086357065146475L, (-7019672003112836211L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-7019672003112836211L));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    double var1 = org.apache.commons.math.util.FastMath.log(2.9733419714522955d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0896865631165487d);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.7581226324091723d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(420988767086167817L);
    org.apache.commons.math.dfp.Dfp var8 = var1.getTwo();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp(2147483647);
    int var11 = var1.getRadixDigits();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 25);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-0.6995216443485196d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6438517469625918d));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextGaussian();
    int[] var7 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var8 = new org.apache.commons.math.random.MersenneTwister(var7);
    var1.setSeed(var7);
    boolean var10 = var1.nextBoolean();
    boolean var11 = var1.nextBoolean();
    long var12 = var1.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.2321040789270661d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-8084527413797425886L));

  }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }
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
//     org.apache.commons.math.dfp.Dfp var11 = null;
//     org.apache.commons.math.dfp.Dfp var12 = org.apache.commons.math.dfp.DfpField.computeExp(var5, var11);
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp var30 = var28.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
    int var31 = var30.log10();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-4));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.0439719471449902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0754151025300256d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0754151025300256d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(23.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.0d);

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.DfpField var5 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var6 = var5.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var7 = var5.newDfp();
//     org.apache.commons.math.dfp.Dfp var9 = var5.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var10 = var5.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var11 = var1.newDfp(var10);
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var15 = var13.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var16 = var15.negate();
//     org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
//     var18.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var22 = var18.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var24 = var22.power10(100);
//     int var25 = var24.intValue();
//     org.apache.commons.math.dfp.DfpField var27 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var29 = var27.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var31 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var33 = var31.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var34 = var29.subtract(var33);
//     org.apache.commons.math.dfp.Dfp var35 = org.apache.commons.math.dfp.DfpField.computeExp(var24, var29);
//     org.apache.commons.math.dfp.Dfp var36 = var15.newInstance(var35);
//     org.apache.commons.math.dfp.DfpField var40 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var42 = var40.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var43 = var42.negate();
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     var45.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var49 = var45.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var51 = var49.power10(100);
//     int var52 = var51.intValue();
//     org.apache.commons.math.dfp.DfpField var54 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var56 = var54.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var58 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var60 = var58.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var61 = var56.subtract(var60);
//     org.apache.commons.math.dfp.Dfp var62 = org.apache.commons.math.dfp.DfpField.computeExp(var51, var56);
//     org.apache.commons.math.dfp.Dfp var63 = var42.newInstance(var62);
//     org.apache.commons.math.dfp.DfpField var65 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var67 = var65.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var68 = var67.getZero();
//     org.apache.commons.math.dfp.Dfp var69 = var36.dotrap(2147483647, "org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)", var63, var67);
//     boolean var71 = var67.equals((java.lang.Object)23.620277154609447d);
//     org.apache.commons.math.dfp.Dfp var72 = org.apache.commons.math.dfp.DfpField.computeExp(var10, var67);
//     
//     // Checks the contract:  var72.equals(var72)
//     assertTrue("Contract failed: var72.equals(var72)", var72.equals(var72));
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.6742902746709212d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8211517975812518d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.39186776f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
//     int var8 = var4.log10K();
//     int var9 = var4.classify();
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     var13.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var16 = var13.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var17 = var13.getSqr2Reciprocal();
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
//     org.apache.commons.math.dfp.Dfp var45 = var43.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var46 = var43.getZero();
//     org.apache.commons.math.dfp.Dfp var48 = var46.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
//     org.apache.commons.math.dfp.Dfp var49 = var4.dotrap(485306839, "hi!", var17, var48);
//     org.apache.commons.math.dfp.Dfp var50 = null;
//     org.apache.commons.math.dfp.Dfp var51 = var49.divide(var50);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextGaussian();
    int[] var7 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var8 = new org.apache.commons.math.random.MersenneTwister(var7);
    var1.setSeed(var7);
    boolean var10 = var1.nextBoolean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var1.nextInt((-1412375784));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.2321040789270661d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-0.8586330273712336d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var11 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var13 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var16 = null;
    var15.setRoundingMode(var16);
    org.apache.commons.math.dfp.Dfp var18 = var15.getE();
    org.apache.commons.math.dfp.DfpField var20 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var22 = var20.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var26 = var24.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var27 = var22.subtract(var26);
    int var28 = var27.intValue();
    boolean var29 = var18.unequal(var27);
    org.apache.commons.math.dfp.Dfp var30 = var1.newDfp(var18);
    boolean var31 = var18.isNaN();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.36004964460910377d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.DfpField var6 = var3.getField();
    org.apache.commons.math.dfp.Dfp var7 = var6.getE();
    org.apache.commons.math.dfp.Dfp var8 = var6.getPi();
    org.apache.commons.math.dfp.Dfp var10 = var6.newDfp("-10.");
    boolean var11 = var10.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.7393949f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp[] var9 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var11 = var1.newDfp(0.8373830985134536d);
    org.apache.commons.math.dfp.Dfp var13 = var11.newInstance((byte)(-1));
    org.apache.commons.math.dfp.Dfp var15 = var13.newInstance((byte)(-1));
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.38646686f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.670167019390977d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2330934315450341d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.9987739565112981d, (-3.0747322506258183d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8275119679403398d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0L);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-0.4532902016501035d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.3644663260584178d));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-8422692239103173864L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.36787944117144233d, 2.5091784786580567d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.1455763339910556d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.7393949f, 0.5282202f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7393949f);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.Dfp var6 = var5.getTwo();
    org.apache.commons.math.dfp.Dfp var7 = var6.sqrt();
    double[] var8 = var6.toSplitDouble();
    boolean var9 = var6.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow(Double.NaN, 0.3044784348989758d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var12 = var9.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sin(Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9993867902425457d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.880939915762295d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.8062400067844204d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.21537380563495973d));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var12 = var1.newDfp(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextGaussian();
    int[] var7 = new int[] { 0, 10, 100};
    org.apache.commons.math.random.MersenneTwister var8 = new org.apache.commons.math.random.MersenneTwister(var7);
    var1.setSeed(var7);
    boolean var10 = var1.nextBoolean();
    var1.setSeed(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.2321040789270661d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.8855424455189903d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.424299085053875d);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.40890356614612045d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.DfpField.RoundingMode var7 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var8 = var1.getTwo();
    int var9 = var8.intValue();
    
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

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
    org.apache.commons.math.dfp.Dfp var9 = var7.floor();
    org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var13 = var11.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var14 = var13.negate();
    org.apache.commons.math.dfp.Dfp var17 = var14.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.Dfp var18 = var17.getZero();
    boolean var19 = var7.equals((java.lang.Object)var18);
    org.apache.commons.math.dfp.Dfp var21 = var18.power10((-438547670));
    org.apache.commons.math.dfp.DfpField var23 = new org.apache.commons.math.dfp.DfpField(100);
    var23.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var27 = var23.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var29 = var27.power10(100);
    boolean var30 = var18.lessThan(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     var9.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
//     int var16 = var15.intValue();
//     org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var20 = var18.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var25 = var20.subtract(var24);
//     org.apache.commons.math.dfp.Dfp var26 = org.apache.commons.math.dfp.DfpField.computeExp(var15, var20);
//     org.apache.commons.math.dfp.Dfp var28 = var20.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var29 = var4.divide(var20);
//     org.apache.commons.math.dfp.DfpField var31 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var33 = var31.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var34 = var33.negate();
//     org.apache.commons.math.dfp.DfpField var36 = new org.apache.commons.math.dfp.DfpField(100);
//     var36.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var40 = var36.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var42 = var40.power10(100);
//     int var43 = var42.intValue();
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var49 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var51 = var49.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var52 = var47.subtract(var51);
//     org.apache.commons.math.dfp.Dfp var53 = org.apache.commons.math.dfp.DfpField.computeExp(var42, var47);
//     org.apache.commons.math.dfp.Dfp var54 = var33.newInstance(var53);
//     org.apache.commons.math.dfp.DfpField var55 = var53.getField();
//     org.apache.commons.math.dfp.Dfp var57 = var55.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
//     org.apache.commons.math.dfp.Dfp var58 = var55.getZero();
//     org.apache.commons.math.dfp.Dfp[] var59 = var55.getESplit();
//     org.apache.commons.math.dfp.Dfp var61 = var55.newDfp((-1L));
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
//     org.apache.commons.math.dfp.Dfp var82 = var74.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var83 = var61.multiply(var82);
//     org.apache.commons.math.dfp.Dfp var84 = var4.divide(var61);
//     org.apache.commons.math.dfp.Dfp var85 = var61.getZero();
//     org.apache.commons.math.dfp.Dfp var87 = var61.multiply((-438547670));
//     
//     // Checks the contract:  var87.equals(var87)
//     assertTrue("Contract failed: var87.equals(var87)", var87.equals(var87));
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-6.640836539336446E160d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    double var2 = org.apache.commons.math.util.FastMath.max(2.2562545212456016d, 0.28730238256267354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.2562545212456016d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.6830689358770354E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6830689358770354E-18d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    java.lang.Number var12 = var4.getArgument();
    org.apache.commons.math.exception.util.Localizable var13 = var4.getSpecificPattern();
    java.lang.String var14 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 4.9E-324d+ "'", var12.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"+ "'", var14.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"));

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.DfpField var6 = var3.getField();
    org.apache.commons.math.dfp.Dfp var7 = var6.getE();
    org.apache.commons.math.dfp.Dfp var8 = var6.getPi();
    org.apache.commons.math.dfp.Dfp var9 = var8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.13211090992020036d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.38646686f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(2.8421709430404007E-14d, 1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9319675597738738E-14d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-8422692239103173864L), 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var4 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var1, var3);
    org.apache.commons.math.exception.util.Localizable var5 = var4.getSpecificPattern();
    org.apache.commons.math.exception.util.Localizable var6 = var4.getSpecificPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.570796326793268d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(55.23918966750995d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2147483647);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
    org.apache.commons.math.dfp.DfpField.RoundingMode var11 = null;
    var1.setRoundingMode(var11);
    int var13 = var1.getRadixDigits();
    org.apache.commons.math.dfp.Dfp var15 = var1.newDfp(6480552030174106886L);
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    var19.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var23 = var19.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var24 = var23.sqrt();
    org.apache.commons.math.dfp.DfpField var26 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var28 = var26.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var29 = var28.negate();
    org.apache.commons.math.dfp.Dfp var32 = var29.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.DfpField var34 = new org.apache.commons.math.dfp.DfpField(100);
    var34.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var38 = var34.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var40 = var38.power10(100);
    int var41 = var40.intValue();
    org.apache.commons.math.dfp.DfpField var43 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var45 = var43.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var47 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var49 = var47.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var50 = var45.subtract(var49);
    org.apache.commons.math.dfp.Dfp var51 = org.apache.commons.math.dfp.DfpField.computeExp(var40, var45);
    org.apache.commons.math.dfp.Dfp var53 = var45.newInstance(10);
    org.apache.commons.math.dfp.Dfp var54 = var29.divide(var45);
    org.apache.commons.math.dfp.Dfp var55 = new org.apache.commons.math.dfp.Dfp(var54);
    org.apache.commons.math.dfp.Dfp var56 = var54.negate();
    org.apache.commons.math.dfp.Dfp var57 = var15.dotrap(1416621831, "-2.84217094304040137457322124712194432938285222622898373856514808721840381622314453125000000000000000e-14", var23, var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    double var2 = org.apache.commons.math.util.FastMath.pow((-0.09576850099350494d), 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.489734012788443E-11d);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-248.14669064046043d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(6480552030174106886L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6480552030174106886L);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.exception.MathRuntimeException var1 = new org.apache.commons.math.exception.MathRuntimeException(var0);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
//     java.lang.String var11 = var10.toString();
//     org.apache.commons.math.dfp.Dfp var13 = var10.divide(16);
//     
//     // Checks the contract:  equals-hashcode on var10 and var13
//     assertTrue("Contract failed: equals-hashcode on var10 and var13", var10.equals(var13) ? var10.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var10
//     assertTrue("Contract failed: equals-hashcode on var13 and var10", var13.equals(var10) ? var13.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


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
    boolean var25 = var23.isInfinite();
    int var26 = var23.log10K();
    
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
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.9991050130774393d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9991050130774392d));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1L), var2, true);
    org.apache.commons.math.exception.MathRuntimeException var5 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4);
    java.lang.Object[] var6 = var5.getArguments();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    int[] var6 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var7 = new org.apache.commons.math.random.MersenneTwister(var6);
    var3.setSeed(var6);
    org.apache.commons.math.random.MersenneTwister var9 = new org.apache.commons.math.random.MersenneTwister(var6);
    double var10 = var9.nextGaussian();
    org.apache.commons.math.random.MersenneTwister var12 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var13 = var12.nextGaussian();
    int[] var16 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var17 = new org.apache.commons.math.random.MersenneTwister(var16);
    int[] var20 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var21 = new org.apache.commons.math.random.MersenneTwister(var20);
    var17.setSeed(var20);
    org.apache.commons.math.random.MersenneTwister var23 = new org.apache.commons.math.random.MersenneTwister(var20);
    var12.setSeed(var20);
    var9.setSeed(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.6944294770606061d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister((-7019672003112836211L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var1.nextInt(0);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.692797479586075d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8093334367141565d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.570796326793268d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    int var2 = org.apache.commons.math.util.FastMath.max(438547670, (-1637450989));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 438547670);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(24);
    int var2 = var1.getRadixDigits();
    org.apache.commons.math.dfp.Dfp var4 = var1.newDfp(1.000959731301806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.DfpField.RoundingMode var7 = var1.getRoundingMode();
    var1.setIEEEFlags(98019085);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    long var2 = org.apache.commons.math.util.FastMath.max(4L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4L);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var4 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var1, var3);
    java.lang.Throwable[] var5 = var4.getSuppressed();
    org.apache.commons.math.exception.MathRuntimeException var6 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4);
    java.lang.Throwable[] var7 = var4.getSuppressed();
    java.lang.Object[] var8 = var4.getArguments();
    java.lang.Throwable[] var9 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-0.09576850099350494d), Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.09576850099350492d));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.5282202f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5282202f);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var2 = var1.nextGaussian();
    int var4 = var1.nextInt(10);
    double var5 = var1.nextDouble();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.8486949055044017d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(20);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.16372895f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.16372895f);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(8.881784197001252E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5501637768927253E-17d);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.0d, 0.097160224532572d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.097160224532572d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(23.620277154609454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05829917759049649d);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-371.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-371.87346237041066d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.568107246527538d));

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.28730238256267354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(2.7755575615628914E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.toDegrees(Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


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
    org.apache.commons.math.dfp.Dfp var85 = var4.newInstance(0);
    org.apache.commons.math.dfp.Dfp var87 = var85.newInstance(0);
    org.apache.commons.math.dfp.Dfp var89 = var87.multiply(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    double var4 = var3.nextGaussian();
    int var6 = var3.nextInt(2147483647);
    int var7 = var3.nextInt();
    float var8 = var3.nextFloat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0019203836877835d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 71624475);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 98019085);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.6117214f);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
// 
// 
//     org.apache.commons.math.random.MersenneTwister var0 = new org.apache.commons.math.random.MersenneTwister();
//     org.apache.commons.math.random.MersenneTwister var2 = new org.apache.commons.math.random.MersenneTwister(100);
//     byte[] var4 = new byte[] { (byte)10};
//     var2.nextBytes(var4);
//     var0.nextBytes(var4);
//     double var7 = var0.nextGaussian();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.3340728930572769d);
// 
//   }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
//     org.apache.commons.math.dfp.Dfp var11 = var1.getOne();
//     org.apache.commons.math.dfp.Dfp var13 = var11.divide((-1416621831));
//     
//     // Checks the contract:  var13.equals(var13)
//     assertTrue("Contract failed: var13.equals(var13)", var13.equals(var13));
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.exp(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-267.9630607579131d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.6843418860808015E-14d);

  }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var2 = var1.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.DfpField var4 = new org.apache.commons.math.dfp.DfpField(100);
//     var4.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var8 = var4.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var9 = var4.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var10 = var4.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var11 = var4.newDfp();
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var15 = var13.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var16 = var15.negate();
//     org.apache.commons.math.dfp.Dfp var19 = var16.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
//     var21.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var25 = var21.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var27 = var25.power10(100);
//     int var28 = var27.intValue();
//     org.apache.commons.math.dfp.DfpField var30 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var32 = var30.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var34 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var36 = var34.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var37 = var32.subtract(var36);
//     org.apache.commons.math.dfp.Dfp var38 = org.apache.commons.math.dfp.DfpField.computeExp(var27, var32);
//     org.apache.commons.math.dfp.Dfp var40 = var32.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var41 = var16.divide(var32);
//     org.apache.commons.math.dfp.Dfp var42 = new org.apache.commons.math.dfp.Dfp(var41);
//     org.apache.commons.math.dfp.Dfp var43 = var11.add(var41);
//     org.apache.commons.math.dfp.Dfp var44 = var2.nextAfter(var41);
//     
//     // Checks the contract:  var44.equals(var44)
//     assertTrue("Contract failed: var44.equals(var44)", var44.equals(var44));
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    long var2 = org.apache.commons.math.util.FastMath.max(420988767086167817L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 420988767086167817L);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.9046745947545269d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.570796326793268d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.023227478546206d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp var2 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var3 = var1.getPi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(6480552030174106886L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-9223372036854775808L), 20L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-9223372036854775808L));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.345204417051878d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.1373220393635d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.9991050130774393d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5284850882241159d));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.0f);
    org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var2);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Number var6 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var4, (java.lang.Number)(-1L), var6, true);
    org.apache.commons.math.exception.MathRuntimeException var9 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var8);
    java.lang.Object[] var10 = var9.getArguments();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var13 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var11, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var14 = var13.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var17 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var15, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var18 = var17.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.Localizable var20 = null;
    java.lang.Object[] var22 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var23 = new org.apache.commons.math.exception.MathIllegalArgumentException(var19, var20, var22);
    org.apache.commons.math.exception.util.Localizable var24 = var23.getSpecificPattern();
    java.lang.Object[] var25 = var23.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var26 = new org.apache.commons.math.exception.MathIllegalArgumentException(var14, var18, var25);
    org.apache.commons.math.exception.NotStrictlyPositiveException var28 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var14, (java.lang.Number)10);
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.Localizable var31 = null;
    java.lang.Object[] var33 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var34 = new org.apache.commons.math.exception.MathIllegalArgumentException(var30, var31, var33);
    java.lang.Throwable[] var35 = var34.getSuppressed();
    java.lang.Throwable[] var36 = var34.getSuppressed();
    org.apache.commons.math.exception.MathRuntimeException var37 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var9, var14, var29, (java.lang.Object[])var36);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var40 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var38, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var41 = var40.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var42 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var44 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var42, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var45 = var44.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    java.lang.Object[] var49 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var50 = new org.apache.commons.math.exception.MathIllegalArgumentException(var46, var47, var49);
    org.apache.commons.math.exception.util.Localizable var51 = var50.getSpecificPattern();
    java.lang.Object[] var52 = var50.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var53 = new org.apache.commons.math.exception.MathIllegalArgumentException(var41, var45, var52);
    org.apache.commons.math.exception.NotStrictlyPositiveException var55 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var41, (java.lang.Number)10);
    org.apache.commons.math.dfp.DfpField var57 = new org.apache.commons.math.dfp.DfpField(100);
    var57.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var61 = var57.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var62 = var57.getLn5();
    org.apache.commons.math.dfp.Dfp[] var63 = var57.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var64 = var57.newDfp();
    org.apache.commons.math.dfp.Dfp[] var65 = var57.getLn5Split();
    org.apache.commons.math.exception.MathRuntimeException var66 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var3, var29, var41, (java.lang.Object[])var65);
    org.apache.commons.math.exception.NumberIsTooSmallException var70 = new org.apache.commons.math.exception.NumberIsTooSmallException(var29, (java.lang.Number)(-0.6995216443485196d), (java.lang.Number)(-4), true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var6 = var5.rint();
    int var7 = var5.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.2673631790022313d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.26125254976740614d));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.0439719471449902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9121271895671562d);

  }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }
// 
// 
//     org.apache.commons.math.random.MersenneTwister var0 = new org.apache.commons.math.random.MersenneTwister();
//     int[] var1 = null;
//     var0.setSeed(var1);
//     var0.setSeed(420988767086167817L);
//     byte[] var5 = null;
//     var0.nextBytes(var5);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    double var2 = org.apache.commons.math.util.FastMath.max(35.803877674109984d, 4.008582575688072d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 35.803877674109984d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp[] var8 = var1.getPiSplit();
    org.apache.commons.math.dfp.Dfp var9 = var1.getLn10();
    org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
    var11.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var14 = var11.getLn5Split();
    org.apache.commons.math.dfp.Dfp var15 = var11.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var16 = var11.getLn2();
    org.apache.commons.math.dfp.DfpField.RoundingMode var17 = var11.getRoundingMode();
    var1.setRoundingMode(var17);
    org.apache.commons.math.dfp.Dfp var19 = var1.getSqr3Reciprocal();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
    org.apache.commons.math.dfp.Dfp var31 = var25.newDfp((-1L));
    org.apache.commons.math.dfp.Dfp var32 = var25.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var33 = var25.getLn10();
    org.apache.commons.math.dfp.DfpField var35 = new org.apache.commons.math.dfp.DfpField(100);
    var35.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var38 = var35.getLn5Split();
    org.apache.commons.math.dfp.Dfp var39 = var35.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var40 = var35.getLn2();
    org.apache.commons.math.dfp.DfpField.RoundingMode var41 = var35.getRoundingMode();
    var25.setRoundingMode(var41);
    org.apache.commons.math.dfp.Dfp var44 = var25.newDfp(0.01810012394019864d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }
// 
// 
//     org.apache.commons.math.random.MersenneTwister var0 = new org.apache.commons.math.random.MersenneTwister();
//     int[] var1 = null;
//     var0.setSeed(var1);
//     double var3 = var0.nextDouble();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.5115180290004064d);
// 
//   }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.345204417051878d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.332115735523992d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)(byte)10);
    java.lang.Number var2 = var1.getMin();
    org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-1.888138942422868d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.31204296953418015d));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
    org.apache.commons.math.dfp.Dfp var30 = var25.getE();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var9 = var1.getSqr3();
    org.apache.commons.math.dfp.Dfp var11 = var1.newDfp(4589153899890174528L);
    org.apache.commons.math.dfp.Dfp var13 = var1.newDfp(0.24877852705263082d);
    org.apache.commons.math.dfp.Dfp var14 = var1.newDfp();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.5410551949032283d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9991050130774393d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.3644663260584178d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3644663260584178d);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(2.8E-322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.getTwo();
//     org.apache.commons.math.dfp.Dfp var5 = var3.divide(71624475);
//     
//     // Checks the contract:  var5.equals(var5)
//     assertTrue("Contract failed: var5.equals(var5)", var5.equals(var5));
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
    var9.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
    int var16 = var15.intValue();
    org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var20 = var18.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var25 = var20.subtract(var24);
    org.apache.commons.math.dfp.Dfp var26 = org.apache.commons.math.dfp.DfpField.computeExp(var15, var20);
    org.apache.commons.math.dfp.Dfp var28 = var20.newInstance(10);
    org.apache.commons.math.dfp.Dfp var29 = var4.divide(var20);
    org.apache.commons.math.dfp.Dfp var30 = new org.apache.commons.math.dfp.Dfp(var29);
    org.apache.commons.math.dfp.Dfp var31 = var29.negate();
    org.apache.commons.math.dfp.Dfp var33 = var31.newInstance(0.793918745142536d);
    org.apache.commons.math.dfp.DfpField var35 = new org.apache.commons.math.dfp.DfpField(100);
    var35.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var38 = var35.getSqr3();
    org.apache.commons.math.dfp.DfpField var42 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var44 = var42.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var45 = var44.negate();
    org.apache.commons.math.dfp.DfpField var47 = new org.apache.commons.math.dfp.DfpField(100);
    var47.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var51 = var47.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var53 = var51.power10(100);
    int var54 = var53.intValue();
    org.apache.commons.math.dfp.DfpField var56 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var58 = var56.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var60 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var62 = var60.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var63 = var58.subtract(var62);
    org.apache.commons.math.dfp.Dfp var64 = org.apache.commons.math.dfp.DfpField.computeExp(var53, var58);
    org.apache.commons.math.dfp.Dfp var65 = var44.newInstance(var64);
    org.apache.commons.math.dfp.DfpField var66 = var64.getField();
    org.apache.commons.math.dfp.Dfp var68 = var66.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var69 = var66.getZero();
    org.apache.commons.math.dfp.Dfp var71 = var69.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
    org.apache.commons.math.dfp.DfpField var73 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var75 = var73.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var76 = var75.negate();
    org.apache.commons.math.dfp.DfpField var78 = new org.apache.commons.math.dfp.DfpField(100);
    var78.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var82 = var78.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var84 = var82.power10(100);
    org.apache.commons.math.dfp.Dfp var85 = var75.multiply(var82);
    org.apache.commons.math.dfp.Dfp var86 = var38.dotrap(25, "org.apache.commons.math.exception.MathIllegalArgumentException: ", var71, var75);
    org.apache.commons.math.dfp.Dfp var89 = var86.newInstance((byte)1, (byte)0);
    org.apache.commons.math.dfp.Dfp var90 = org.apache.commons.math.dfp.DfpField.computeExp(var33, var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.545340318748508d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }
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
//     org.apache.commons.math.dfp.Dfp var30 = var28.newInstance("org.apache.commons.math.exception.MathRuntimeException: ");
//     org.apache.commons.math.dfp.Dfp var31 = var30.floor();
//     org.apache.commons.math.dfp.Dfp var34 = var30.newInstance((byte)100, (byte)0);
//     
//     // Checks the contract:  equals-hashcode on var22 and var34
//     assertTrue("Contract failed: equals-hashcode on var22 and var34", var22.equals(var34) ? var22.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var34
//     assertTrue("Contract failed: equals-hashcode on var27 and var34", var27.equals(var34) ? var27.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var34
//     assertTrue("Contract failed: equals-hashcode on var28 and var34", var28.equals(var34) ? var28.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var34
//     assertTrue("Contract failed: equals-hashcode on var30 and var34", var30.equals(var34) ? var30.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var34
//     assertTrue("Contract failed: equals-hashcode on var31 and var34", var31.equals(var34) ? var31.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var22
//     assertTrue("Contract failed: equals-hashcode on var34 and var22", var34.equals(var22) ? var34.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var27
//     assertTrue("Contract failed: equals-hashcode on var34 and var27", var34.equals(var27) ? var34.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var28
//     assertTrue("Contract failed: equals-hashcode on var34 and var28", var34.equals(var28) ? var34.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var30
//     assertTrue("Contract failed: equals-hashcode on var34 and var30", var34.equals(var30) ? var34.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var31
//     assertTrue("Contract failed: equals-hashcode on var34 and var31", var34.equals(var31) ? var34.hashCode() == var31.hashCode() : true);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    java.lang.Number var12 = var4.getArgument();
    org.apache.commons.math.exception.util.Localizable var13 = var4.getSpecificPattern();
    org.apache.commons.math.exception.util.Localizable var14 = var4.getGeneralPattern();
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
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var35 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.util.Localizable var37 = null;
    java.lang.Object[] var39 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var40 = new org.apache.commons.math.exception.MathIllegalArgumentException(var36, var37, var39);
    org.apache.commons.math.exception.util.Localizable var41 = var40.getSpecificPattern();
    var35.addSuppressed((java.lang.Throwable)var40);
    boolean var43 = var35.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var44 = var35.getSpecificPattern();
    boolean var45 = var35.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var49 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var47, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var50 = var49.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var51 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var55 = new org.apache.commons.math.exception.NumberIsTooSmallException(var51, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var56 = var55.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var57 = new org.apache.commons.math.exception.MathIllegalArgumentException(var50, var56);
    org.apache.commons.math.exception.util.Localizable var58 = null;
    org.apache.commons.math.exception.util.Localizable var59 = null;
    org.apache.commons.math.exception.util.Localizable var60 = null;
    java.lang.Object[] var62 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var63 = new org.apache.commons.math.exception.MathIllegalArgumentException(var59, var60, var62);
    org.apache.commons.math.exception.MathIllegalArgumentException var64 = new org.apache.commons.math.exception.MathIllegalArgumentException(var58, var62);
    org.apache.commons.math.exception.MathRuntimeException var65 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var35, var46, var50, var62);
    org.apache.commons.math.exception.util.Localizable var66 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var70 = new org.apache.commons.math.exception.NumberIsTooSmallException(var66, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var71 = null;
    org.apache.commons.math.exception.util.Localizable var72 = null;
    java.lang.Object[] var74 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var75 = new org.apache.commons.math.exception.MathIllegalArgumentException(var71, var72, var74);
    org.apache.commons.math.exception.util.Localizable var76 = var75.getSpecificPattern();
    var70.addSuppressed((java.lang.Throwable)var75);
    boolean var78 = var70.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var79 = var70.getSpecificPattern();
    boolean var80 = var70.getBoundIsAllowed();
    java.lang.String var81 = var70.toString();
    java.lang.Number var82 = var70.getArgument();
    boolean var83 = var70.getBoundIsAllowed();
    java.lang.Throwable[] var84 = var70.getSuppressed();
    org.apache.commons.math.exception.MathRuntimeException var85 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4, var22, var46, (java.lang.Object[])var84);
    java.lang.Number var86 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 4.9E-324d+ "'", var12.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"+ "'", var81.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + 4.9E-324d+ "'", var82.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + 100L+ "'", var86.equals(100L));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.608565f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(55.23918966750995d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.77406577727611E23d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.Dfp var8 = var1.getSqr2();
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
    int var18 = var17.intValue();
    org.apache.commons.math.dfp.Dfp var19 = org.apache.commons.math.dfp.Dfp.copysign(var8, var17);
    org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
    var21.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var24 = var21.getSqr3();
    org.apache.commons.math.dfp.Dfp var26 = var21.newDfp((-1.0d));
    org.apache.commons.math.dfp.Dfp var27 = var8.add(var26);
    int var28 = var8.log10();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.38646686f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.38646686f);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.MathRuntimeException var5 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4);
    java.lang.Object[] var6 = var5.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.9991050130774393d), 0.7114113595019804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9520297188339379d));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.0000000000000004d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.4245175f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4245175f);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var1.getTwo();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var6 = var1.getZero();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
    java.lang.String var9 = var8.toString();
    org.apache.commons.math.dfp.Dfp var10 = var8.floor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0."+ "'", var9.equals("0."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getTwo();
    org.apache.commons.math.dfp.Dfp[] var5 = var1.getPiSplit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    int var8 = var7.intValue();
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
    org.apache.commons.math.dfp.Dfp var18 = org.apache.commons.math.dfp.DfpField.computeExp(var7, var12);
    int var19 = var12.log10K();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-4));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-6084344433391602684L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6084344433391602684L));

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var7 = var1.newDfp((-1416621831));
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     var9.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
//     int var16 = var15.intValue();
//     org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var20 = var18.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var25 = var20.subtract(var24);
//     org.apache.commons.math.dfp.Dfp var26 = org.apache.commons.math.dfp.DfpField.computeExp(var15, var20);
//     boolean var27 = var7.greaterThan(var26);
//     org.apache.commons.math.dfp.DfpField var29 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var31 = var29.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var32 = var31.negate();
//     org.apache.commons.math.dfp.DfpField var34 = new org.apache.commons.math.dfp.DfpField(100);
//     var34.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var38 = var34.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var40 = var38.power10(100);
//     int var41 = var40.intValue();
//     org.apache.commons.math.dfp.DfpField var43 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var45 = var43.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var47 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var49 = var47.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var50 = var45.subtract(var49);
//     org.apache.commons.math.dfp.Dfp var51 = org.apache.commons.math.dfp.DfpField.computeExp(var40, var45);
//     org.apache.commons.math.dfp.Dfp var52 = var31.newInstance(var51);
//     org.apache.commons.math.dfp.DfpField var53 = var51.getField();
//     org.apache.commons.math.dfp.Dfp var54 = var51.getTwo();
//     boolean var55 = var51.isNaN();
//     org.apache.commons.math.dfp.Dfp var57 = var51.multiply(25);
//     org.apache.commons.math.dfp.Dfp var58 = var26.nextAfter(var51);
//     org.apache.commons.math.dfp.DfpField var60 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var62 = var60.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var64 = var62.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var65 = var64.getTwo();
//     int var66 = var64.log10();
//     org.apache.commons.math.dfp.Dfp var67 = new org.apache.commons.math.dfp.Dfp(var64);
//     boolean var68 = var26.unequal(var67);
//     
//     // Checks the contract:  equals-hashcode on var25 and var64
//     assertTrue("Contract failed: equals-hashcode on var25 and var64", var25.equals(var64) ? var25.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var67
//     assertTrue("Contract failed: equals-hashcode on var25 and var67", var25.equals(var67) ? var25.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var64
//     assertTrue("Contract failed: equals-hashcode on var50 and var64", var50.equals(var64) ? var50.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var67
//     assertTrue("Contract failed: equals-hashcode on var50 and var67", var50.equals(var67) ? var50.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var25
//     assertTrue("Contract failed: equals-hashcode on var64 and var25", var64.equals(var25) ? var64.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var50
//     assertTrue("Contract failed: equals-hashcode on var64 and var50", var64.equals(var50) ? var64.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var25
//     assertTrue("Contract failed: equals-hashcode on var67 and var25", var67.equals(var25) ? var67.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var50
//     assertTrue("Contract failed: equals-hashcode on var67 and var50", var67.equals(var50) ? var67.hashCode() == var50.hashCode() : true);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3();
    var1.clearIEEEFlags();
    org.apache.commons.math.dfp.Dfp var6 = var1.getSqr2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp var2 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.Dfp[] var3 = var1.getSqr2Split();
    var1.setIEEEFlags(24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
//     var1.setRoundingMode(var2);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getTwo();
//     double var5 = var4.toDouble();
// 
//   }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.13211090992020036d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.13211090992020036d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


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
    org.apache.commons.math.dfp.Dfp var26 = var25.getLn10();
    org.apache.commons.math.dfp.Dfp var27 = var25.getTwo();
    org.apache.commons.math.dfp.Dfp[] var28 = var25.getPiSplit();
    org.apache.commons.math.dfp.Dfp var29 = var25.getSqr2Reciprocal();
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.2673631790022313d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8414518764429808d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.7536103366262064d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.35131133f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.26125254976740614d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var2 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var3 = var1.getPi();
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(485306839);
//     org.apache.commons.math.dfp.Dfp var6 = null;
//     org.apache.commons.math.dfp.Dfp var7 = var5.nextAfter(var6);
// 
//   }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
    org.apache.commons.math.dfp.Dfp var31 = var25.newDfp((-1L));
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
    org.apache.commons.math.dfp.Dfp var52 = var44.newInstance(10);
    org.apache.commons.math.dfp.Dfp var53 = var31.multiply(var52);
    org.apache.commons.math.dfp.DfpField var54 = var53.getField();
    org.apache.commons.math.dfp.Dfp var55 = var54.getLn5();
    int var56 = var55.classify();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1416621831, 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(536492827);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(byte)0, (java.lang.Number)(short)1, false);
    java.lang.String var5 = var4.toString();
    org.apache.commons.math.exception.util.Localizable var6 = var4.getGeneralPattern();
    java.lang.Object[] var7 = var4.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)"+ "'", var5.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-16.255619765854984d));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.8275119679403398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.30894225967617667d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.23077415906422044d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.23282799932185014d));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var2 = var1.nextGaussian();
    int[] var5 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var6 = new org.apache.commons.math.random.MersenneTwister(var5);
    int[] var9 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var10 = new org.apache.commons.math.random.MersenneTwister(var9);
    var6.setSeed(var9);
    org.apache.commons.math.random.MersenneTwister var12 = new org.apache.commons.math.random.MersenneTwister(var9);
    var1.setSeed(var9);
    int var15 = var1.nextInt(98019085);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 82653655);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var13 = var12.negate();
//     org.apache.commons.math.dfp.DfpField var15 = new org.apache.commons.math.dfp.DfpField(100);
//     var15.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var19 = var15.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var21 = var19.power10(100);
//     int var22 = var21.intValue();
//     org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var26 = var24.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var28 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var30 = var28.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var31 = var26.subtract(var30);
//     org.apache.commons.math.dfp.Dfp var32 = org.apache.commons.math.dfp.DfpField.computeExp(var21, var26);
//     org.apache.commons.math.dfp.Dfp var33 = var12.newInstance(var32);
//     org.apache.commons.math.dfp.DfpField var34 = var32.getField();
//     org.apache.commons.math.dfp.Dfp var35 = var32.getTwo();
//     java.lang.String var36 = var35.toString();
//     org.apache.commons.math.dfp.DfpField var38 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var40 = var38.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var41 = var40.getZero();
//     org.apache.commons.math.dfp.Dfp var42 = var35.subtract(var40);
//     int var43 = var35.log10K();
//     org.apache.commons.math.dfp.Dfp var44 = var35.getTwo();
//     org.apache.commons.math.dfp.Dfp var45 = var8.multiply(var35);
//     
//     // Checks the contract:  equals-hashcode on var5 and var31
//     assertTrue("Contract failed: equals-hashcode on var5 and var31", var5.equals(var31) ? var5.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var41
//     assertTrue("Contract failed: equals-hashcode on var5 and var41", var5.equals(var41) ? var5.hashCode() == var41.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var5
//     assertTrue("Contract failed: equals-hashcode on var31 and var5", var31.equals(var5) ? var31.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var41 and var5
//     assertTrue("Contract failed: equals-hashcode on var41 and var5", var41.equals(var5) ? var41.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var2 = null;
    var1.setRoundingMode(var2);
    org.apache.commons.math.dfp.Dfp var4 = var1.getE();
    org.apache.commons.math.dfp.Dfp[] var5 = var1.getESplit();
    org.apache.commons.math.dfp.Dfp var6 = var1.getSqr2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var6 = var4.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)");
//     
//     // Checks the contract:  equals-hashcode on var3 and var6
//     assertTrue("Contract failed: equals-hashcode on var3 and var6", var3.equals(var6) ? var3.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var3
//     assertTrue("Contract failed: equals-hashcode on var6 and var3", var6.equals(var3) ? var6.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(55.23918966750995d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.887032888638055E23d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3();
    org.apache.commons.math.dfp.Dfp var5 = var1.getZero();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(4L);
    org.apache.commons.math.dfp.Dfp var8 = new org.apache.commons.math.dfp.Dfp(var7);
    int var9 = var8.classify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.28730238256267354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.33282717624530195d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.DfpField var7 = new org.apache.commons.math.dfp.DfpField(100);
    var7.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var11 = var7.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var12 = var7.getRoundingMode();
    org.apache.commons.math.dfp.DfpField.RoundingMode var13 = var7.getRoundingMode();
    var1.setRoundingMode(var13);
    org.apache.commons.math.dfp.Dfp var15 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.Dfp var16 = var1.getLn10();
    java.lang.String var17 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "2.302585092994"+ "'", var17.equals("2.302585092994"));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
    org.apache.commons.math.dfp.Dfp var31 = var25.newDfp((-1L));
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
    org.apache.commons.math.dfp.Dfp var52 = var44.newInstance(10);
    org.apache.commons.math.dfp.Dfp var53 = var31.multiply(var52);
    org.apache.commons.math.dfp.DfpField var54 = var53.getField();
    org.apache.commons.math.dfp.Dfp var57 = var54.newDfp((byte)100, (byte)1);
    org.apache.commons.math.dfp.Dfp[] var58 = var54.getPiSplit();
    org.apache.commons.math.dfp.Dfp[] var59 = var54.getSqr2Split();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    boolean var3 = var1.nextBoolean();
    boolean var4 = var1.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.591588582936028d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


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
    org.apache.commons.math.dfp.Dfp var85 = var4.newInstance(0);
    org.apache.commons.math.dfp.Dfp var87 = var4.divide(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(2.8421709430404014E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8421709430404014E-14d);

  }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-6.28399980025031d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-0.9520297188339379d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.4043984534866818d));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getE();
    int var6 = var1.getRadixDigits();
    org.apache.commons.math.dfp.Dfp var9 = var1.newDfp((byte)10, (byte)1);
    var1.setIEEEFlagsBits(100);
    org.apache.commons.math.dfp.Dfp var12 = var1.getOne();
    org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var17 = var16.getTwo();
    boolean var18 = var12.greaterThan(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    long var2 = org.apache.commons.math.util.FastMath.max(420988767086167817L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 420988767086167817L);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.2109445684116928d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(57.40580939343808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.105427357601002E-15d);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3();
//     int var5 = var1.getIEEEFlags();
//     org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(0.2954773017385812d);
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var10 = var9.newDfp();
//     org.apache.commons.math.dfp.Dfp var11 = var9.getPi();
//     org.apache.commons.math.dfp.Dfp var12 = var11.negate();
//     org.apache.commons.math.dfp.Dfp var13 = var7.remainder(var12);
//     
//     // Checks the contract:  var13.equals(var13)
//     assertTrue("Contract failed: var13.equals(var13)", var13.equals(var13));
// 
//   }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    boolean var2 = var1.nextBoolean();
    var1.setSeed(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var8 = var1.getZero();
    org.apache.commons.math.dfp.Dfp var9 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var10 = var1.getLn2();
    var1.clearIEEEFlags();
    
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

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getESplit();
    org.apache.commons.math.dfp.Dfp var3 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, (-8084527413797425886L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.7031839360032607E-108d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7031839360032607E-108d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(2.4789349207552477E-44d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5744633754886925E-22d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


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
    int var34 = var26.log10K();
    org.apache.commons.math.dfp.Dfp var35 = var26.getTwo();
    org.apache.commons.math.dfp.Dfp var36 = var26.sqrt();
    
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
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.Dfp var8 = var1.getSqr2();
    org.apache.commons.math.dfp.Dfp var9 = var1.getLn10();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(9.643274665532871E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.585726814339603E-6d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.1455763339910556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5260539179442435d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(5.6843418860808015E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.6843418860808015E-14d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.Dfp var8 = var1.getSqr2();
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
    int var18 = var17.intValue();
    org.apache.commons.math.dfp.Dfp var19 = org.apache.commons.math.dfp.Dfp.copysign(var8, var17);
    org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var23 = var21.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var24 = var23.negate();
    org.apache.commons.math.dfp.DfpField var26 = new org.apache.commons.math.dfp.DfpField(100);
    var26.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var30 = var26.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var32 = var30.power10(100);
    int var33 = var32.intValue();
    org.apache.commons.math.dfp.DfpField var35 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var37 = var35.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var39 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var41 = var39.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var42 = var37.subtract(var41);
    org.apache.commons.math.dfp.Dfp var43 = org.apache.commons.math.dfp.DfpField.computeExp(var32, var37);
    org.apache.commons.math.dfp.Dfp var44 = var23.newInstance(var43);
    org.apache.commons.math.dfp.DfpField var45 = var43.getField();
    org.apache.commons.math.dfp.Dfp var47 = var45.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var48 = var45.getZero();
    org.apache.commons.math.dfp.Dfp[] var49 = var45.getESplit();
    org.apache.commons.math.dfp.Dfp var51 = var45.newDfp((-1L));
    org.apache.commons.math.dfp.DfpField var53 = new org.apache.commons.math.dfp.DfpField(100);
    var53.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var57 = var53.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var59 = var57.power10(100);
    int var60 = var59.intValue();
    org.apache.commons.math.dfp.DfpField var62 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var64 = var62.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var66 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var68 = var66.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var69 = var64.subtract(var68);
    org.apache.commons.math.dfp.Dfp var70 = org.apache.commons.math.dfp.DfpField.computeExp(var59, var64);
    org.apache.commons.math.dfp.Dfp var72 = var64.newInstance(10);
    org.apache.commons.math.dfp.Dfp var73 = var51.multiply(var72);
    java.lang.String var74 = var73.toString();
    org.apache.commons.math.dfp.Dfp var75 = var73.ceil();
    org.apache.commons.math.dfp.Dfp var76 = new org.apache.commons.math.dfp.Dfp(var75);
    org.apache.commons.math.dfp.DfpField var78 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var79 = var78.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var80 = var78.newDfp();
    org.apache.commons.math.dfp.Dfp var81 = var78.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var82 = var78.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var84 = var78.newDfp(0.0d);
    boolean var85 = var75.greaterThan(var84);
    org.apache.commons.math.dfp.Dfp var86 = var17.remainder(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "-10."+ "'", var74.equals("-10."));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(3.66320749752745d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 209.88632908900283d);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }
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
//     boolean var59 = var24.greaterThan(var58);
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


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
    org.apache.commons.math.exception.NotStrictlyPositiveException var88 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var2, (java.lang.Number)(-0.6330277796015017d));
    
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

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.7031839360032603E-108d, 0.004027768904191763d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.36807169948293267d);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }
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
//     org.apache.commons.math.dfp.Dfp var84 = var38.newInstance();
//     org.apache.commons.math.dfp.DfpField var86 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var88 = var86.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var90 = var88.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var91 = var38.remainder(var88);
//     
//     // Checks the contract:  equals-hashcode on var32 and var90
//     assertTrue("Contract failed: equals-hashcode on var32 and var90", var32.equals(var90) ? var32.hashCode() == var90.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var90
//     assertTrue("Contract failed: equals-hashcode on var37 and var90", var37.equals(var90) ? var37.hashCode() == var90.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var90
//     assertTrue("Contract failed: equals-hashcode on var56 and var90", var56.equals(var90) ? var56.hashCode() == var90.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var79 and var90
//     assertTrue("Contract failed: equals-hashcode on var79 and var90", var79.equals(var90) ? var79.hashCode() == var90.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var84 and var90
//     assertTrue("Contract failed: equals-hashcode on var84 and var90", var84.equals(var90) ? var84.hashCode() == var90.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var90 and var32
//     assertTrue("Contract failed: equals-hashcode on var90 and var32", var90.equals(var32) ? var90.hashCode() == var32.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var90 and var37
//     assertTrue("Contract failed: equals-hashcode on var90 and var37", var90.equals(var37) ? var90.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var90 and var56
//     assertTrue("Contract failed: equals-hashcode on var90 and var56", var90.equals(var56) ? var90.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var90 and var79
//     assertTrue("Contract failed: equals-hashcode on var90 and var79", var90.equals(var79) ? var90.hashCode() == var79.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var90 and var84
//     assertTrue("Contract failed: equals-hashcode on var90 and var84", var90.equals(var84) ? var90.hashCode() == var84.hashCode() : true);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(438547670);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.5091784786580567d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var5 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var6 = var5.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var9 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var7, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var13 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var11, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var14 = var13.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var19 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var16, var18);
    org.apache.commons.math.exception.util.Localizable var20 = var19.getSpecificPattern();
    java.lang.Object[] var21 = var19.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var22 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var14, var21);
    java.lang.Object[] var23 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var23);
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    java.lang.Object[] var29 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var26, var27, var29);
    org.apache.commons.math.exception.MathIllegalArgumentException var31 = new org.apache.commons.math.exception.MathIllegalArgumentException(var25, var29);
    org.apache.commons.math.exception.MathRuntimeException var32 = new org.apache.commons.math.exception.MathRuntimeException(var0, var6, var10, var29);
    java.lang.Number var33 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var34 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var10, var33);
    java.lang.String var35 = var34.toString();
    java.lang.Number var36 = var34.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: null is smaller than, or equal to, the minimum (0): null is smaller than, or equal to, the minimum (0)"+ "'", var35.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: null is smaller than, or equal to, the minimum (0): null is smaller than, or equal to, the minimum (0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.5877949369993395d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.528307850097425d);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
//     org.apache.commons.math.dfp.Dfp var8 = var6.newInstance(0.0d);
//     org.apache.commons.math.dfp.Dfp var10 = var8.newInstance((byte)100);
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var13 = var12.newDfp();
//     org.apache.commons.math.dfp.Dfp var14 = var12.getPi();
//     org.apache.commons.math.dfp.Dfp var16 = var12.newDfp(485306839);
//     org.apache.commons.math.dfp.Dfp var17 = var8.newInstance(var16);
//     
//     // Checks the contract:  var17.equals(var17)
//     assertTrue("Contract failed: var17.equals(var17)", var17.equals(var17));
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.6330277796015016d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7464524763820894d));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.999636297167346d, (-0.8414709848078965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9996362971673459d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4L);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.3044784348989758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.31444827781322615d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.6438517469625918d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6892671982133692d));

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }
// 
// 
//     org.apache.commons.math.random.MersenneTwister var0 = new org.apache.commons.math.random.MersenneTwister();
//     float var1 = var0.nextFloat();
//     org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(1L);
//     int[] var6 = new int[] { 0, 1};
//     org.apache.commons.math.random.MersenneTwister var7 = new org.apache.commons.math.random.MersenneTwister(var6);
//     var3.setSeed(var6);
//     var0.setSeed(var6);
//     org.apache.commons.math.random.MersenneTwister var10 = new org.apache.commons.math.random.MersenneTwister(var6);
//     int[] var14 = new int[] { 0, 10, 100};
//     org.apache.commons.math.random.MersenneTwister var15 = new org.apache.commons.math.random.MersenneTwister(var14);
//     int var16 = var15.nextInt();
//     boolean var17 = var15.nextBoolean();
//     var15.setSeed(8422692239103173864L);
//     org.apache.commons.math.random.MersenneTwister var21 = new org.apache.commons.math.random.MersenneTwister(100);
//     byte[] var23 = new byte[] { (byte)10};
//     var21.nextBytes(var23);
//     byte[] var28 = new byte[] { (byte)100, (byte)10, (byte)1};
//     var21.nextBytes(var28);
//     org.apache.commons.math.random.MersenneTwister var31 = new org.apache.commons.math.random.MersenneTwister(100);
//     byte[] var33 = new byte[] { (byte)10};
//     var31.nextBytes(var33);
//     var21.nextBytes(var33);
//     var15.nextBytes(var33);
//     var10.nextBytes(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.51813185f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == (-1416621831));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
// 
//   }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.9520297188339379d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9520297188339378d));

  }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.signum(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.8062400067844204d, 7.105427357601002E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8062400067844204d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    java.lang.Number var12 = var4.getMin();
    java.lang.Number var13 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 100L+ "'", var12.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 100L+ "'", var13.equals(100L));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(6.489734012788443E-11d, (-0.9520297188339379d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.001068032622342E9d);

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }
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
//     org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var48 = var47.negate();
//     org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
//     var50.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var54 = var50.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var56 = var54.power10(100);
//     int var57 = var56.intValue();
//     org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var66 = var61.subtract(var65);
//     org.apache.commons.math.dfp.Dfp var67 = org.apache.commons.math.dfp.DfpField.computeExp(var56, var61);
//     org.apache.commons.math.dfp.Dfp var68 = var47.newInstance(var67);
//     org.apache.commons.math.dfp.Dfp var69 = org.apache.commons.math.dfp.Dfp.copysign(var43, var68);
//     org.apache.commons.math.dfp.Dfp var71 = var68.newInstance((byte)(-1));
//     boolean var72 = var68.isInfinite();
//     org.apache.commons.math.dfp.Dfp var74 = var68.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
//     org.apache.commons.math.dfp.Dfp var75 = null;
//     boolean var76 = var68.unequal(var75);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(7.529171920409294E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(3.6882538673612966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 19.974984355438178d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.3859684164526524d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 22.114361288084705d);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-3.0747322506258183d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.0d));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.5063656411097588d), (-0.7464524763820894d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5063656411097588d));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.023227478546206d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    int var8 = var4.log10K();
    int var9 = var4.classify();
    org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
    var13.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var16 = var13.getLn5Split();
    org.apache.commons.math.dfp.Dfp var17 = var13.getSqr2Reciprocal();
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var22 = var21.negate();
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
    org.apache.commons.math.dfp.Dfp var42 = var21.newInstance(var41);
    org.apache.commons.math.dfp.DfpField var43 = var41.getField();
    org.apache.commons.math.dfp.Dfp var45 = var43.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var46 = var43.getZero();
    org.apache.commons.math.dfp.Dfp var48 = var46.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
    org.apache.commons.math.dfp.Dfp var49 = var4.dotrap(485306839, "hi!", var17, var48);
    boolean var50 = var48.isNaN();
    org.apache.commons.math.dfp.Dfp var51 = var48.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(7830967380036616271L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7830967380036616271L);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    boolean var4 = var2.getBoundIsAllowed();
    java.lang.Throwable[] var5 = var2.getSuppressed();
    boolean var6 = var2.getBoundIsAllowed();
    boolean var7 = var2.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var2 = var1.nextGaussian();
    int var4 = var1.nextInt(10);
    int var6 = var1.nextInt(1416621831);
    double var7 = var1.nextDouble();
    double var8 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1093980884);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.6944294770606061d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.49005226916427136d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.9996362971673459d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7852162789071745d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.9471499617733654d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(21.0779393487549d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(2.3430459756754827d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.167406392052442d);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.9991050130774393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5284850882241159d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    int var2 = org.apache.commons.math.util.FastMath.min(438547670, 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14);

  }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }
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
//     int var26 = var4.log10K();
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
//     org.apache.commons.math.dfp.DfpField var52 = var50.getField();
//     org.apache.commons.math.dfp.Dfp var53 = var50.getTwo();
//     java.lang.String var54 = var53.toString();
//     org.apache.commons.math.dfp.DfpField var56 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var58 = var56.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var59 = var58.getZero();
//     org.apache.commons.math.dfp.Dfp var60 = var53.subtract(var58);
//     org.apache.commons.math.dfp.Dfp var61 = var4.add(var53);
//     
//     // Checks the contract:  var61.equals(var61)
//     assertTrue("Contract failed: var61.equals(var61)", var61.equals(var61));
// 
//   }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-1.4043984534866818d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
//     org.apache.commons.math.dfp.Dfp var8 = var7.getZero();
//     org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var11 = var10.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var12 = var10.newDfp();
//     org.apache.commons.math.dfp.Dfp var14 = var10.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var15 = var10.getSqr3Reciprocal();
//     int var16 = var10.getIEEEFlags();
//     org.apache.commons.math.dfp.Dfp var17 = var10.getLn10();
//     org.apache.commons.math.dfp.Dfp var18 = var17.floor();
//     org.apache.commons.math.dfp.Dfp var19 = var7.newInstance(var18);
//     
//     // Checks the contract:  var19.equals(var19)
//     assertTrue("Contract failed: var19.equals(var19)", var19.equals(var19));
// 
//   }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var4 = var3.negate();
//     org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
//     org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
//     var9.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
//     int var16 = var15.intValue();
//     org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var20 = var18.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var25 = var20.subtract(var24);
//     org.apache.commons.math.dfp.Dfp var26 = org.apache.commons.math.dfp.DfpField.computeExp(var15, var20);
//     org.apache.commons.math.dfp.Dfp var28 = var20.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var29 = var4.divide(var20);
//     org.apache.commons.math.dfp.Dfp var30 = new org.apache.commons.math.dfp.Dfp(var29);
//     org.apache.commons.math.dfp.Dfp var31 = var30.getTwo();
//     org.apache.commons.math.dfp.DfpField var33 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var34 = var33.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var35 = var33.newDfp();
//     org.apache.commons.math.dfp.Dfp var36 = var33.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var37 = var33.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var39 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var40 = var39.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var41 = var39.newDfp();
//     org.apache.commons.math.dfp.Dfp var42 = var37.nextAfter(var41);
//     org.apache.commons.math.dfp.Dfp var43 = var30.remainder(var37);
//     
//     // Checks the contract:  var43.equals(var43)
//     assertTrue("Contract failed: var43.equals(var43)", var43.equals(var43));
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-0.23282799932185014d), (-0.23282799932185014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.23282799932185017d));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.2641010744543374d), 0.670167019390977d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.670167019390977d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    org.apache.commons.math.exception.NotStrictlyPositiveException var5 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)(-1L));
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var8 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var6, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var9 = var8.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var10, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var15 = var14.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var9, var15);
    org.apache.commons.math.dfp.DfpField var18 = new org.apache.commons.math.dfp.DfpField(100);
    var18.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var21 = var18.getLn5Split();
    org.apache.commons.math.dfp.Dfp var22 = var18.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var23 = var18.getLn2();
    org.apache.commons.math.dfp.Dfp var24 = var18.getPi();
    org.apache.commons.math.dfp.Dfp[] var25 = var18.getPiSplit();
    org.apache.commons.math.exception.MathIllegalArgumentException var26 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var9, (java.lang.Object[])var25);
    org.apache.commons.math.exception.NotStrictlyPositiveException var28 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)1L);
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var33 = new org.apache.commons.math.exception.NumberIsTooSmallException(var29, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var34 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    java.lang.Object[] var37 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var38 = new org.apache.commons.math.exception.MathIllegalArgumentException(var34, var35, var37);
    org.apache.commons.math.exception.util.Localizable var39 = var38.getSpecificPattern();
    var33.addSuppressed((java.lang.Throwable)var38);
    boolean var41 = var33.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var42 = var33.getSpecificPattern();
    boolean var43 = var33.getBoundIsAllowed();
    var28.addSuppressed((java.lang.Throwable)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.DfpField var8 = new org.apache.commons.math.dfp.DfpField(100);
//     var8.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var12 = var8.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var13 = var8.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var14 = var8.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var17 = var8.newDfp((byte)1, (byte)0);
//     org.apache.commons.math.dfp.Dfp var18 = var8.getLn2();
//     org.apache.commons.math.dfp.Dfp var20 = var18.newInstance((-371.0d));
//     org.apache.commons.math.dfp.Dfp var21 = var6.nextAfter(var18);
//     
//     // Checks the contract:  var21.equals(var21)
//     assertTrue("Contract failed: var21.equals(var21)", var21.equals(var21));
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    var1.setIEEEFlags(4);
    int var6 = var1.getRadixDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 25);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(3.469446951953614E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.5640057768204683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2297507751121999d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var4, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var10 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var9);
    org.apache.commons.math.exception.NotStrictlyPositiveException var12 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var3, (java.lang.Number)(-0.5063656411097588d));
    java.lang.String var13 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: -0.506 is smaller than, or equal to, the minimum (0): -0.506 is smaller than, or equal to, the minimum (0)"+ "'", var13.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: -0.506 is smaller than, or equal to, the minimum (0): -0.506 is smaller than, or equal to, the minimum (0)"));

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh((-248.14669064046043d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test295() {}
//   public void test295() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.DfpField var2 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var4 = var2.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var2.getSqr3Reciprocal();
//     org.apache.commons.math.dfp.Dfp[] var6 = var2.getPiSplit();
//     org.apache.commons.math.dfp.Dfp[] var7 = var2.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var8 = var2.getZero();
//     org.apache.commons.math.dfp.Dfp var9 = org.apache.commons.math.dfp.DfpField.computeExp(var0, var8);
// 
//   }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


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
    boolean var27 = var23.isNaN();
    org.apache.commons.math.dfp.Dfp var29 = var23.multiply(25);
    int var30 = var23.intValue();
    
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
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2147483647);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var5 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var7 = var5.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var8 = var3.subtract(var7);
    int var9 = var8.intValue();
    org.apache.commons.math.dfp.DfpField var10 = var8.getField();
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(25);
    int var13 = var10.getIEEEFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 16);

  }

  public void test298() {}
//   public void test298() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
//     org.apache.commons.math.dfp.Dfp var6 = var5.rint();
//     int var7 = var5.classify();
//     org.apache.commons.math.dfp.Dfp var9 = var5.newInstance(1.5707963267948966d);
//     org.apache.commons.math.dfp.Dfp var10 = var5.getZero();
//     org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var13 = var12.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var14 = var12.newDfp();
//     org.apache.commons.math.dfp.Dfp var15 = var12.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var16 = var12.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var18 = var12.newDfp((-1416621831));
//     org.apache.commons.math.dfp.Dfp var19 = var12.getSqr2Reciprocal();
//     boolean var20 = var10.equals((java.lang.Object)var19);
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var23 = var22.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp();
//     org.apache.commons.math.dfp.Dfp var25 = var22.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var26 = var22.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var28 = var22.newDfp((-1416621831));
//     org.apache.commons.math.dfp.DfpField var30 = new org.apache.commons.math.dfp.DfpField(100);
//     var30.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var34 = var30.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var36 = var34.power10(100);
//     int var37 = var36.intValue();
//     org.apache.commons.math.dfp.DfpField var39 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var41 = var39.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var43 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var45 = var43.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var46 = var41.subtract(var45);
//     org.apache.commons.math.dfp.Dfp var47 = org.apache.commons.math.dfp.DfpField.computeExp(var36, var41);
//     boolean var48 = var28.greaterThan(var47);
//     org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var52 = var50.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var53 = var52.negate();
//     org.apache.commons.math.dfp.DfpField var55 = new org.apache.commons.math.dfp.DfpField(100);
//     var55.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var59 = var55.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var61 = var59.power10(100);
//     int var62 = var61.intValue();
//     org.apache.commons.math.dfp.DfpField var64 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var66 = var64.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var68 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var70 = var68.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var71 = var66.subtract(var70);
//     org.apache.commons.math.dfp.Dfp var72 = org.apache.commons.math.dfp.DfpField.computeExp(var61, var66);
//     org.apache.commons.math.dfp.Dfp var73 = var52.newInstance(var72);
//     org.apache.commons.math.dfp.DfpField var74 = var72.getField();
//     org.apache.commons.math.dfp.Dfp var75 = var72.getTwo();
//     boolean var76 = var72.isNaN();
//     org.apache.commons.math.dfp.Dfp var78 = var72.multiply(25);
//     org.apache.commons.math.dfp.Dfp var79 = var47.nextAfter(var72);
//     org.apache.commons.math.dfp.Dfp var80 = var19.multiply(var72);
//     
//     // Checks the contract:  var80.equals(var80)
//     assertTrue("Contract failed: var80.equals(var80)", var80.equals(var80));
// 
//   }

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.9520297188339379d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.25471222f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.25471222f);

  }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }
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
//     double[] var31 = var28.toSplitDouble();
//     org.apache.commons.math.dfp.Dfp var33 = var28.power10K((-14));
//     org.apache.commons.math.dfp.Dfp var35 = var28.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than, or equal to, the minimum (1)");
//     
//     // Checks the contract:  equals-hashcode on var22 and var35
//     assertTrue("Contract failed: equals-hashcode on var22 and var35", var22.equals(var35) ? var22.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var35
//     assertTrue("Contract failed: equals-hashcode on var27 and var35", var27.equals(var35) ? var27.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var35
//     assertTrue("Contract failed: equals-hashcode on var28 and var35", var28.equals(var35) ? var28.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var35
//     assertTrue("Contract failed: equals-hashcode on var30 and var35", var30.equals(var35) ? var30.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var22
//     assertTrue("Contract failed: equals-hashcode on var35 and var22", var35.equals(var22) ? var35.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var27
//     assertTrue("Contract failed: equals-hashcode on var35 and var27", var35.equals(var27) ? var35.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var28
//     assertTrue("Contract failed: equals-hashcode on var35 and var28", var35.equals(var28) ? var35.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var30
//     assertTrue("Contract failed: equals-hashcode on var35 and var30", var35.equals(var30) ? var35.hashCode() == var30.hashCode() : true);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.8414709848078966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.375426387680723d);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.6995216443485196d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6995216443485195d));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-0.9440892412430648d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var3 = var2.getGeneralPattern();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: 0 is smaller than, or equal to, the minimum (0)"+ "'", var4.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: 0 is smaller than, or equal to, the minimum (0)"));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.694106911714525d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8322640837238667d);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(4.2098876708616781E17d, 2.124911632614893d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    var1.setIEEEFlagsBits(10);
    org.apache.commons.math.dfp.Dfp var9 = var1.newDfp(0.01810012394019864d);
    org.apache.commons.math.dfp.Dfp[] var10 = var1.getLn5Split();
    var1.setIEEEFlags((-16));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    long var2 = org.apache.commons.math.util.FastMath.min(8422692239103173864L, (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9991050130774393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8409870843646944d);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.21537380563495973d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.21213342246977449d));

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(24);
//     org.apache.commons.math.dfp.Dfp var4 = var1.newDfp((byte)10, (byte)10);
//     int var5 = var4.intValue();
//     org.apache.commons.math.dfp.Dfp var6 = null;
//     org.apache.commons.math.dfp.Dfp var7 = var4.nextAfter(var6);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp[] var9 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var11 = var1.newDfp(0.8373830985134536d);
    org.apache.commons.math.dfp.Dfp var13 = var11.newInstance((byte)(-1));
    org.apache.commons.math.dfp.Dfp var15 = var13.newInstance(0.5403023058681278d);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.8211517975812518d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9634262825738988d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
    org.apache.commons.math.dfp.Dfp var14 = org.apache.commons.math.dfp.Dfp.copysign(var4, var12);
    org.apache.commons.math.dfp.Dfp var15 = var4.rint();
    org.apache.commons.math.dfp.Dfp var17 = var4.newInstance((byte)1);
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var22 = var19.getSqr3Reciprocal();
    org.apache.commons.math.dfp.DfpField var24 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var26 = var24.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var28 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var30 = var28.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var31 = var26.subtract(var30);
    org.apache.commons.math.dfp.Dfp var32 = org.apache.commons.math.dfp.Dfp.copysign(var22, var30);
    org.apache.commons.math.dfp.Dfp var33 = var17.add(var22);
    org.apache.commons.math.dfp.DfpField var35 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var37 = var35.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var38 = var37.negate();
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
    org.apache.commons.math.dfp.Dfp var58 = var37.newInstance(var57);
    org.apache.commons.math.dfp.DfpField var59 = var57.getField();
    org.apache.commons.math.dfp.Dfp var61 = var59.newDfp("org.apache.commons.math.exception.NumberIsTooSmallException: -1 is smaller than the minimum (null)");
    org.apache.commons.math.dfp.Dfp var62 = var59.getZero();
    org.apache.commons.math.dfp.Dfp var64 = var62.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
    double[] var65 = var62.toSplitDouble();
    org.apache.commons.math.dfp.DfpField var67 = new org.apache.commons.math.dfp.DfpField(100);
    var67.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var71 = var67.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var73 = var71.power10(100);
    org.apache.commons.math.dfp.Dfp var74 = var73.getZero();
    org.apache.commons.math.dfp.Dfp var75 = var73.floor();
    org.apache.commons.math.dfp.DfpField var77 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var79 = var77.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var80 = var79.negate();
    org.apache.commons.math.dfp.Dfp var83 = var80.newInstance((byte)1, (byte)1);
    org.apache.commons.math.dfp.Dfp var84 = var83.getZero();
    boolean var85 = var73.equals((java.lang.Object)var84);
    org.apache.commons.math.dfp.Dfp var86 = org.apache.commons.math.dfp.Dfp.copysign(var62, var73);
    org.apache.commons.math.dfp.Dfp var87 = var33.multiply(var62);
    org.apache.commons.math.dfp.Dfp var89 = var62.newInstance(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.670167019390977d, (-1.568107246527538d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8731114422058603d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1, 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.8586330273712336d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6534728083049587d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(2.8421709430404014E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.3108872417680944E-30d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var7 = var1.getPi();
    org.apache.commons.math.dfp.Dfp[] var8 = var1.getPiSplit();
    org.apache.commons.math.dfp.Dfp var9 = var1.getE();
    org.apache.commons.math.dfp.Dfp var10 = var9.negate();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    var1.setIEEEFlagsBits((-4));
    org.apache.commons.math.dfp.Dfp var6 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var7 = var1.getLn2();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.5501637768927253E-17d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5501637768927253E-17d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9121271895671562d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7908075060345007d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(52.06320514553547d, 23.62027715460945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.506998849561991E40d);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.5403023058681278d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7350525871447074d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.13211090992020036d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9912860387506858d);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var3.negate();
    org.apache.commons.math.dfp.Dfp var7 = var4.newInstance((byte)1, (byte)1);
    int var8 = var4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.761594155955765d);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(6.3108872417680944E-30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8479780433329283E-10d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.1129943035738381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4575601846855093d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    int var2 = org.apache.commons.math.util.FastMath.max(338087802, 438547670);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 438547670);

  }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }
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
//     org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
//     org.apache.commons.math.dfp.Dfp var45 = var17.newInstance((-9223372036854775808L));
//     org.apache.commons.math.dfp.DfpField var47 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var49 = var47.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var51 = var49.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var52 = var51.getTwo();
//     org.apache.commons.math.dfp.Dfp var53 = var52.sqrt();
//     org.apache.commons.math.dfp.Dfp var54 = var45.divide(var53);
//     
//     // Checks the contract:  equals-hashcode on var16 and var51
//     assertTrue("Contract failed: equals-hashcode on var16 and var51", var16.equals(var51) ? var16.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var51
//     assertTrue("Contract failed: equals-hashcode on var40 and var51", var40.equals(var51) ? var40.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var16
//     assertTrue("Contract failed: equals-hashcode on var51 and var16", var51.equals(var16) ? var51.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var40
//     assertTrue("Contract failed: equals-hashcode on var51 and var40", var51.equals(var40) ? var51.hashCode() == var40.hashCode() : true);
// 
//   }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var5 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var7 = var5.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var8 = var3.subtract(var7);
    org.apache.commons.math.dfp.Dfp var10 = var3.newInstance(7830967380036616271L);
    org.apache.commons.math.dfp.DfpField var12 = new org.apache.commons.math.dfp.DfpField(4);
    org.apache.commons.math.dfp.Dfp[] var13 = var12.getESplit();
    boolean var14 = var10.equals((java.lang.Object)var12);
    boolean var15 = var10.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.51813185f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.51813185f);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.7536103366262064d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5616767122718683d);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.5288527150443534d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5288527150443536d);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.35956862719904825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0653442990798265d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.112994194f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.112994194f);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.0f);
    org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var2);
    java.lang.String var4 = var3.toString();
    java.lang.Throwable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var10 = new org.apache.commons.math.exception.NumberIsTooSmallException(var6, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var11 = var10.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var14 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var12, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var15 = var14.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var18 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var16, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var19 = var18.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.Localizable var21 = null;
    java.lang.Object[] var23 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var20, var21, var23);
    org.apache.commons.math.exception.util.Localizable var25 = var24.getSpecificPattern();
    java.lang.Object[] var26 = var24.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var27 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var19, var26);
    java.lang.Object[] var28 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var29 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var28);
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.util.Localizable var32 = null;
    java.lang.Object[] var34 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var35 = new org.apache.commons.math.exception.MathIllegalArgumentException(var31, var32, var34);
    org.apache.commons.math.exception.MathIllegalArgumentException var36 = new org.apache.commons.math.exception.MathIllegalArgumentException(var30, var34);
    org.apache.commons.math.exception.MathRuntimeException var37 = new org.apache.commons.math.exception.MathRuntimeException(var5, var11, var15, var34);
    java.lang.Number var38 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var39 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var15, var38);
    java.lang.Throwable var40 = null;
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var45 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var46 = var45.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var49 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var47, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var50 = var49.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var51 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var53 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var51, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var54 = var53.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var55 = null;
    org.apache.commons.math.exception.util.Localizable var56 = null;
    java.lang.Object[] var58 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var59 = new org.apache.commons.math.exception.MathIllegalArgumentException(var55, var56, var58);
    org.apache.commons.math.exception.util.Localizable var60 = var59.getSpecificPattern();
    java.lang.Object[] var61 = var59.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var62 = new org.apache.commons.math.exception.MathIllegalArgumentException(var50, var54, var61);
    java.lang.Object[] var63 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var64 = new org.apache.commons.math.exception.MathIllegalArgumentException(var50, var63);
    org.apache.commons.math.exception.util.Localizable var65 = null;
    org.apache.commons.math.exception.util.Localizable var66 = null;
    org.apache.commons.math.exception.util.Localizable var67 = null;
    java.lang.Object[] var69 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var70 = new org.apache.commons.math.exception.MathIllegalArgumentException(var66, var67, var69);
    org.apache.commons.math.exception.MathIllegalArgumentException var71 = new org.apache.commons.math.exception.MathIllegalArgumentException(var65, var69);
    org.apache.commons.math.exception.MathRuntimeException var72 = new org.apache.commons.math.exception.MathRuntimeException(var40, var46, var50, var69);
    org.apache.commons.math.exception.util.Localizable var73 = null;
    org.apache.commons.math.exception.util.Localizable var74 = null;
    java.lang.Object[] var76 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var77 = new org.apache.commons.math.exception.MathIllegalArgumentException(var73, var74, var76);
    org.apache.commons.math.exception.MathRuntimeException var78 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var3, var15, var50, var76);
    java.lang.Object[] var79 = var78.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.MathRuntimeException: "+ "'", var4.equals("org.apache.commons.math.exception.MathRuntimeException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.35956862719904825d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.786072687686807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1947599704703955d);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(24);
    org.apache.commons.math.dfp.Dfp var2 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp[] var3 = var1.getSqr2Split();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.4532902016501035d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
    org.apache.commons.math.dfp.Dfp var5 = var1.getE();
    int var6 = var1.getRadixDigits();
    org.apache.commons.math.dfp.Dfp var9 = var1.newDfp((byte)10, (byte)1);
    var1.setIEEEFlagsBits(100);
    org.apache.commons.math.dfp.Dfp var12 = var1.getE();
    org.apache.commons.math.dfp.Dfp var14 = var1.newDfp((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9046745947545269d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9046745947545269d);

  }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.1373220393635d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.Dfp var8 = var5.newInstance((byte)0, (byte)1);
    org.apache.commons.math.dfp.Dfp var9 = var5.getOne();
    org.apache.commons.math.dfp.Dfp var10 = var9.ceil();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-16), 522135394);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 522135394);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    int[] var6 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var7 = new org.apache.commons.math.random.MersenneTwister(var6);
    var3.setSeed(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var3.nextInt((-14));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
    org.apache.commons.math.dfp.DfpField var6 = var3.getField();
    org.apache.commons.math.dfp.Dfp var7 = var3.getOne();
    org.apache.commons.math.dfp.Dfp var9 = var7.newInstance(1659862644);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }
// 
// 
//     org.apache.commons.math.random.MersenneTwister var0 = new org.apache.commons.math.random.MersenneTwister();
//     float var1 = var0.nextFloat();
//     org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(1L);
//     int[] var6 = new int[] { 0, 1};
//     org.apache.commons.math.random.MersenneTwister var7 = new org.apache.commons.math.random.MersenneTwister(var6);
//     var3.setSeed(var6);
//     var0.setSeed(var6);
//     double var10 = var0.nextDouble();
//     byte[] var11 = null;
//     var0.nextBytes(var11);
// 
//   }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.01810012394019864d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians((-0.26125254976740614d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.004559717172671583d));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


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
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var18 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var16, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var19 = var18.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var24 = new org.apache.commons.math.exception.NumberIsTooSmallException(var20, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var26 = new org.apache.commons.math.exception.MathIllegalArgumentException(var19, var25);
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.exception.util.Localizable var29 = null;
    java.lang.Object[] var31 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var32 = new org.apache.commons.math.exception.MathIllegalArgumentException(var28, var29, var31);
    org.apache.commons.math.exception.MathIllegalArgumentException var33 = new org.apache.commons.math.exception.MathIllegalArgumentException(var27, var31);
    org.apache.commons.math.exception.MathRuntimeException var34 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4, var15, var19, var31);
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var37 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var35, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var38 = var37.getGeneralPattern();
    var4.addSuppressed((java.lang.Throwable)var37);
    org.apache.commons.math.exception.util.Localizable var40 = var4.getGeneralPattern();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp((byte)1);
    org.apache.commons.math.dfp.DfpField.RoundingMode var4 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var5 = var1.getTwo();
    org.apache.commons.math.dfp.Dfp[] var6 = var1.getESplit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }
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
//     org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var48 = var47.negate();
//     org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
//     var50.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var54 = var50.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var56 = var54.power10(100);
//     int var57 = var56.intValue();
//     org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var66 = var61.subtract(var65);
//     org.apache.commons.math.dfp.Dfp var67 = org.apache.commons.math.dfp.DfpField.computeExp(var56, var61);
//     org.apache.commons.math.dfp.Dfp var68 = var47.newInstance(var67);
//     org.apache.commons.math.dfp.Dfp var69 = org.apache.commons.math.dfp.Dfp.copysign(var43, var68);
//     org.apache.commons.math.dfp.DfpField var71 = new org.apache.commons.math.dfp.DfpField(100);
//     var71.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var74 = var71.getOne();
//     org.apache.commons.math.dfp.Dfp var75 = var71.getLn2();
//     org.apache.commons.math.dfp.Dfp var77 = var71.newDfp(420988767086167817L);
//     org.apache.commons.math.dfp.Dfp var78 = var71.getTwo();
//     double[] var79 = var78.toSplitDouble();
//     org.apache.commons.math.dfp.DfpField var81 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var83 = var81.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.DfpField var85 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var87 = var85.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var88 = var83.subtract(var87);
//     org.apache.commons.math.dfp.Dfp var90 = var83.newInstance(7830967380036616271L);
//     org.apache.commons.math.dfp.Dfp var91 = org.apache.commons.math.dfp.DfpField.computeLn(var43, var78, var90);
//     
//     // Checks the contract:  var91.equals(var91)
//     assertTrue("Contract failed: var91.equals(var91)", var91.equals(var91));
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(2791086357065146475L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2791086357065146475L);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(1093980884);
    org.apache.commons.math.dfp.Dfp var9 = var7.multiply(25);
    org.apache.commons.math.dfp.Dfp var11 = var7.newInstance(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


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
    int var20 = var18.intValue();
    
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
    assertTrue(var20 == 1093980884);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.8062400067844204d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9307251471515006d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3Reciprocal();
    org.apache.commons.math.dfp.DfpField var6 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var8 = var6.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var13 = var8.subtract(var12);
    org.apache.commons.math.dfp.Dfp var14 = org.apache.commons.math.dfp.Dfp.copysign(var4, var12);
    org.apache.commons.math.dfp.Dfp var15 = var4.rint();
    org.apache.commons.math.dfp.Dfp var18 = var15.newInstance((byte)1, (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.004027768904191763d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0040358912667031d);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9132181497465548d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7914747737694988d);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(3.6882538673612966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3060306300974318d);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.1853555716521891E116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.9359006698223215d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9359006698223213d);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var8 = var6.newInstance(0.0d);
    org.apache.commons.math.dfp.Dfp var9 = var6.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    int[] var2 = new int[] { 0, 1};
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(var2);
    boolean var4 = var3.nextBoolean();
    double var5 = var3.nextGaussian();
    double var6 = var3.nextDouble();
    var3.setSeed(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.21841921301152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.022821852739475013d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.3060306300974318d, 1.6858739404357455E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3060306300974316d);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    double var2 = org.apache.commons.math.util.FastMath.max(57.40580939343808d, 0.7567276187046601d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 57.40580939343808d);

  }

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
//     org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var10 = var1.newDfp((byte)1, (byte)0);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var11 = null;
//     var1.setRoundingMode(var11);
//     int var13 = var1.getRadixDigits();
//     org.apache.commons.math.dfp.Dfp var16 = var1.newDfp((byte)(-1), (byte)(-1));
//     org.apache.commons.math.dfp.Dfp var17 = var1.getZero();
//     org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
//     var19.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var23 = var19.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var24 = var19.getRoundingMode();
//     org.apache.commons.math.dfp.Dfp var25 = var19.newDfp();
//     org.apache.commons.math.dfp.Dfp var26 = var17.remainder(var25);
//     
//     // Checks the contract:  var26.equals(var26)
//     assertTrue("Contract failed: var26.equals(var26)", var26.equals(var26));
// 
//   }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.43340057340515503d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.122533580560283d);

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }
// 
// 
//     org.apache.commons.math.dfp.Dfp var0 = null;
//     org.apache.commons.math.dfp.DfpField var2 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var3 = var2.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var4 = var2.newDfp();
//     org.apache.commons.math.dfp.Dfp var5 = var2.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var6 = var2.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var8 = var2.newDfp((-1416621831));
//     boolean var9 = var8.isNaN();
//     org.apache.commons.math.dfp.Dfp var10 = org.apache.commons.math.dfp.DfpField.computeExp(var0, var8);
// 
//   }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var5 = var3.newInstance("org.apache.commons.math.exception.NumberIsTooSmallException: 0 is smaller than the minimum (100)");
//     org.apache.commons.math.dfp.Dfp var6 = var5.ceil();
//     org.apache.commons.math.dfp.DfpField var8 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var9 = var8.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var10 = var8.newDfp();
//     org.apache.commons.math.dfp.Dfp var12 = var8.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var13 = var8.getSqr3Reciprocal();
//     int var14 = var8.getIEEEFlags();
//     org.apache.commons.math.dfp.Dfp var15 = var8.getLn10();
//     org.apache.commons.math.dfp.Dfp var16 = var15.floor();
//     org.apache.commons.math.dfp.Dfp var17 = org.apache.commons.math.dfp.DfpField.computeExp(var6, var15);
//     
//     // Checks the contract:  var17.equals(var17)
//     assertTrue("Contract failed: var17.equals(var17)", var17.equals(var17));
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.25471222f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.51813185f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.51813185f);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField((-4));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100L);
    double var2 = var1.nextGaussian();
    int var4 = var1.nextInt(10);
    long var5 = var1.nextLong();
    double var6 = var1.nextGaussian();
    var1.setSeed(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9086743489308475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2791086357065146475L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.49005226916427136d);

  }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }
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
//     org.apache.commons.math.dfp.Dfp var52 = var44.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var53 = var31.multiply(var52);
//     org.apache.commons.math.dfp.Dfp var55 = var53.power10(100);
//     org.apache.commons.math.dfp.Dfp var57 = var55.newInstance(1093980884);
//     org.apache.commons.math.dfp.Dfp var59 = var55.multiply((-1));
//     
//     // Checks the contract:  var59.equals(var59)
//     assertTrue("Contract failed: var59.equals(var59)", var59.equals(var59));
// 
//   }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    double var1 = org.apache.commons.math.util.FastMath.log(23.140692632779267d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.141592653589793d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    long var2 = org.apache.commons.math.util.FastMath.min(2791086357065146475L, 2791086357065146475L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2791086357065146475L);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    boolean var2 = var1.nextBoolean();
    var1.setSeed(1L);
    var1.setSeed(25);
    double var7 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.7125261229939746d);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(3.141592653589793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.5640057768204683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5640057768204683d);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(209.88632908900283d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.232595164407831E-32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.232595164407831E-32d);

  }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.getTwo();
//     org.apache.commons.math.dfp.Dfp var5 = var3.multiply((-1412375784));
//     
//     // Checks the contract:  var5.equals(var5)
//     assertTrue("Contract failed: var5.equals(var5)", var5.equals(var5));
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    long var2 = org.apache.commons.math.util.FastMath.min(9217045021805895505L, 402613113023623976L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 402613113023623976L);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var5 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var6 = var5.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var9 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var7, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var13 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var11, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var14 = var13.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var19 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var16, var18);
    org.apache.commons.math.exception.util.Localizable var20 = var19.getSpecificPattern();
    java.lang.Object[] var21 = var19.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var22 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var14, var21);
    java.lang.Object[] var23 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var23);
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    java.lang.Object[] var29 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var26, var27, var29);
    org.apache.commons.math.exception.MathIllegalArgumentException var31 = new org.apache.commons.math.exception.MathIllegalArgumentException(var25, var29);
    org.apache.commons.math.exception.MathRuntimeException var32 = new org.apache.commons.math.exception.MathRuntimeException(var0, var6, var10, var29);
    java.lang.Object[] var33 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var34 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var33);
    org.apache.commons.math.exception.NotStrictlyPositiveException var36 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var6, (java.lang.Number)(-4));
    java.lang.String var37 = var36.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: -4 is smaller than, or equal to, the minimum (0): -4 is smaller than the minimum (0)"+ "'", var37.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: -4 is smaller than, or equal to, the minimum (0): -4 is smaller than the minimum (0)"));

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(0);
    org.apache.commons.math.random.MersenneTwister var3 = new org.apache.commons.math.random.MersenneTwister(100);
    byte[] var5 = new byte[] { (byte)10};
    var3.nextBytes(var5);
    byte[] var10 = new byte[] { (byte)100, (byte)10, (byte)1};
    var3.nextBytes(var10);
    var1.nextBytes(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var8 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp var9 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var10 = var1.getSqr2();
    org.apache.commons.math.dfp.Dfp var11 = var1.getPi();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(2.424299085053875d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5570160837492575d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    int var2 = org.apache.commons.math.util.FastMath.min(2147483647, 82653655);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 82653655);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.2307741590642204d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8036695700630945d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(19.820657718318774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5203866569580018d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.237160944224742d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp var7 = var1.getPi();
    org.apache.commons.math.dfp.Dfp[] var8 = var1.getPiSplit();
    org.apache.commons.math.dfp.Dfp var9 = var1.getZero();
    org.apache.commons.math.dfp.DfpField.RoundingMode var10 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var11 = var1.getLn5();
    boolean var12 = var11.isInfinite();
    org.apache.commons.math.dfp.Dfp var13 = var11.floor();
    boolean var14 = var11.isNaN();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
    org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var4 = var1.getSqr2Reciprocal();
    org.apache.commons.math.dfp.DfpField.RoundingMode var5 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var6 = var1.getE();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.8373830985134536d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getSqr3();
//     org.apache.commons.math.dfp.Dfp var5 = null;
//     org.apache.commons.math.dfp.Dfp var6 = var4.remainder(var5);
// 
//   }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.692797479586075d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1917952986705818d);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var8 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp var9 = var8.sqrt();
    java.lang.String var10 = var8.toString();
    
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
    assertTrue("'" + var10 + "' != '" + "1.60943791243410037460075933322618763952560135426851772191264789147417898770765776463013387809318"+ "'", var10.equals("1.60943791243410037460075933322618763952560135426851772191264789147417898770765776463013387809318"));

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


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
    org.apache.commons.math.dfp.Dfp var26 = var25.getLn10();
    org.apache.commons.math.dfp.Dfp[] var27 = var25.getLn5Split();
    
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
    assertNotNull(var27);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.5410551949032283d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6008648746946176d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians((-1.3687972432500903d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.023890018686935806d));

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.7114113595019806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01241647055939861d);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var6 = var1.getLn5();
    org.apache.commons.math.dfp.Dfp[] var7 = var1.getSqr2Split();
    org.apache.commons.math.dfp.Dfp var8 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp[] var9 = var1.getLn5Split();
    org.apache.commons.math.dfp.Dfp var11 = var1.newDfp(0.5617368907956974d);
    
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
    assertNotNull(var11);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.0896865631165487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0896865631165487d);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.9347212764125521d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9777489902493827d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.608565f, 0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.608565f);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.2641010744543374d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.27051187780011027d));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    long var1 = org.apache.commons.math.util.FastMath.round(6.3108872417680944E-30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1412375784), 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1412375784));

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.5501637768927253E-17d, 0.8061733063738288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.922866664818473E-17d);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(21.0779393487549d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2949244088581178d));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.1853555716521891E116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.976164608322581d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var6, var8);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getSpecificPattern();
    var4.addSuppressed((java.lang.Throwable)var9);
    boolean var12 = var4.getBoundIsAllowed();
    java.lang.Throwable[] var13 = var4.getSuppressed();
    org.apache.commons.math.exception.MathRuntimeException var14 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.7031839360032607E-108d, 0.7536103366262064d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7031839360032607E-108d);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.9982991565118507d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9982991565118506d));

  }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.5309649148733836d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.DfpField.RoundingMode var6 = var1.getRoundingMode();
    org.apache.commons.math.dfp.Dfp var7 = var1.newDfp();
    org.apache.commons.math.dfp.Dfp var8 = var1.getZero();
    int var9 = var8.log10();
    org.apache.commons.math.dfp.Dfp var11 = var8.power10((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.01241647055939861d, 2.3430459756754827d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.01241647055939861d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(7.529171920409294E-162d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.529171920409295E-162d);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(23.62027715460945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.860069665612773d);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.6830689358770354E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1895078198796989E-6d);

  }

  public void test435() {}
//   public void test435() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(23.140692632779267d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.591588582936028d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    int var2 = org.apache.commons.math.util.FastMath.min(98019085, 485306839);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 98019085);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.33282717624530195d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3949062047092897d);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.01810012394019864d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.011836493209015d));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.8322640837238667d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.014525748507075224d);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)1.2109445684116928d, (java.lang.Number)(-0.21841921301152d), false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


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
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var18 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var16, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var19 = var18.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var24 = new org.apache.commons.math.exception.NumberIsTooSmallException(var20, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var26 = new org.apache.commons.math.exception.MathIllegalArgumentException(var19, var25);
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.exception.util.Localizable var29 = null;
    java.lang.Object[] var31 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var32 = new org.apache.commons.math.exception.MathIllegalArgumentException(var28, var29, var31);
    org.apache.commons.math.exception.MathIllegalArgumentException var33 = new org.apache.commons.math.exception.MathIllegalArgumentException(var27, var31);
    org.apache.commons.math.exception.MathRuntimeException var34 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var4, var15, var19, var31);
    java.lang.Object[] var35 = var34.getArguments();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)0.8211517975812518d, (java.lang.Number)9.643274665532871E-17d, true);
    java.lang.Number var4 = var3.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 9.643274665532871E-17d+ "'", var4.equals(9.643274665532871E-17d));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.5526952143984976d, (-248.14669064046043d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5526952143984973d);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(2.237160944224742d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.237160944224742d);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.7852162789071745d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5795395725456379d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.016676307f, 0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.15671098f);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp[] var29 = var25.getESplit();
    org.apache.commons.math.dfp.Dfp var31 = var25.newDfp((-1L));
    org.apache.commons.math.dfp.Dfp var32 = var25.getSqr2Reciprocal();
    org.apache.commons.math.dfp.Dfp var33 = var25.getLn10();
    org.apache.commons.math.dfp.Dfp var34 = var33.getTwo();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.28730238256267354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5416607724433764d));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextDouble();
    float var4 = var1.nextFloat();
    double var5 = var1.nextDouble();
    double var6 = var1.nextDouble();
    float var7 = var1.nextFloat();
    boolean var8 = var1.nextBoolean();
    double var9 = var1.nextDouble();
    var1.setSeed(25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.4245175f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5263824737783689d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.14860484011052333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.15671098f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.18646718071027224d);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(24);
    org.apache.commons.math.dfp.Dfp var2 = var1.getLn2();
    org.apache.commons.math.dfp.Dfp[] var3 = var1.getLn5Split();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var2 = var1.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var3 = var1.newDfp();
//     org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(100);
//     org.apache.commons.math.dfp.Dfp var6 = var1.getSqr3Reciprocal();
//     int var7 = var1.getIEEEFlags();
//     org.apache.commons.math.dfp.Dfp var8 = var1.getLn10();
//     org.apache.commons.math.dfp.Dfp var9 = var8.negate();
//     org.apache.commons.math.dfp.DfpField var11 = new org.apache.commons.math.dfp.DfpField(100);
//     var11.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var14 = var11.getOne();
//     org.apache.commons.math.dfp.Dfp var15 = var11.getLn2();
//     org.apache.commons.math.dfp.Dfp var16 = var15.rint();
//     int var17 = var15.classify();
//     org.apache.commons.math.dfp.Dfp var19 = var15.newInstance(1.5707963267948966d);
//     org.apache.commons.math.dfp.Dfp var20 = var15.getZero();
//     org.apache.commons.math.dfp.DfpField var22 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp[] var23 = var22.getSqr2Split();
//     org.apache.commons.math.dfp.Dfp var24 = var22.newDfp();
//     org.apache.commons.math.dfp.Dfp var25 = var22.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var26 = var22.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var28 = var22.newDfp((-1416621831));
//     org.apache.commons.math.dfp.Dfp var29 = var22.getSqr2Reciprocal();
//     boolean var30 = var20.equals((java.lang.Object)var29);
//     int var31 = var20.intValue();
//     org.apache.commons.math.dfp.Dfp var32 = var8.divide(var20);
//     
//     // Checks the contract:  var32.equals(var32)
//     assertTrue("Contract failed: var32.equals(var32)", var32.equals(var32));
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


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
    org.apache.commons.math.dfp.Dfp var28 = var25.getZero();
    org.apache.commons.math.dfp.Dfp var30 = var28.newInstance("org.apache.commons.math.exception.MathIllegalArgumentException: ");
    int var31 = var28.classify();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test455() {}
//   public void test455() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp[] var4 = var1.getLn5Split();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getSqr2Reciprocal();
//     org.apache.commons.math.dfp.Dfp var6 = var5.ceil();
//     org.apache.commons.math.dfp.DfpField var8 = new org.apache.commons.math.dfp.DfpField(1);
//     org.apache.commons.math.dfp.Dfp var9 = var8.newDfp();
//     org.apache.commons.math.dfp.Dfp var10 = var8.getPi();
//     org.apache.commons.math.dfp.Dfp var11 = var8.getSqr3();
//     org.apache.commons.math.dfp.DfpField var13 = new org.apache.commons.math.dfp.DfpField(100);
//     var13.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var17 = var13.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.DfpField.RoundingMode var18 = var13.getRoundingMode();
//     org.apache.commons.math.dfp.Dfp var19 = var13.newDfp();
//     org.apache.commons.math.dfp.DfpField var21 = new org.apache.commons.math.dfp.DfpField(100);
//     var21.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var25 = var21.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var27 = var21.newDfp(1093980884);
//     org.apache.commons.math.dfp.Dfp var28 = var21.getSqr2();
//     org.apache.commons.math.dfp.Dfp var29 = var19.add(var28);
//     org.apache.commons.math.dfp.Dfp var30 = org.apache.commons.math.dfp.DfpField.computeLn(var6, var11, var19);
//     
//     // Checks the contract:  var30.equals(var30)
//     assertTrue("Contract failed: var30.equals(var30)", var30.equals(var30));
// 
//   }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }
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
//     org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
//     org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
//     org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
//     org.apache.commons.math.dfp.Dfp var48 = var45.getLn5();
//     org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
//     var50.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var54 = var50.newDfp(0.670167019390977d);
//     org.apache.commons.math.dfp.Dfp var56 = var54.power10(100);
//     org.apache.commons.math.dfp.Dfp var57 = var56.getZero();
//     org.apache.commons.math.dfp.Dfp var58 = var56.floor();
//     org.apache.commons.math.dfp.Dfp var59 = var48.add(var56);
//     int var60 = var48.classify();
//     org.apache.commons.math.dfp.Dfp var61 = var43.nextAfter(var48);
//     org.apache.commons.math.dfp.Dfp var63 = var48.newInstance("hi!");
//     org.apache.commons.math.dfp.Dfp var64 = null;
//     org.apache.commons.math.dfp.Dfp var65 = var63.add(var64);
// 
//   }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.5616767122718683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5616767122718683d);

  }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.421639028830578d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    org.apache.commons.math.random.MersenneTwister var1 = new org.apache.commons.math.random.MersenneTwister(100);
    long var2 = var1.nextLong();
    double var3 = var1.nextDouble();
    float var4 = var1.nextFloat();
    double var5 = var1.nextDouble();
    var1.setSeed((-14));
    boolean var8 = var1.nextBoolean();
    long var9 = var1.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8422692239103173864L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.278369388163781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.4245175f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5263824737783689d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-7243273983598034870L));

  }

  public void test460() {}
//   public void test460() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }
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
//     org.apache.commons.math.dfp.Dfp var52 = var44.newInstance(10);
//     org.apache.commons.math.dfp.Dfp var53 = var31.multiply(var52);
//     org.apache.commons.math.dfp.DfpField var54 = var53.getField();
//     org.apache.commons.math.dfp.Dfp var57 = var54.newDfp((byte)100, (byte)1);
//     org.apache.commons.math.dfp.Dfp var58 = var54.getLn2();
//     org.apache.commons.math.dfp.Dfp var59 = null;
//     org.apache.commons.math.dfp.Dfp var60 = var54.newDfp(var59);
// 
//   }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }
// 
// 
//     org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
//     var1.setIEEEFlags(4);
//     org.apache.commons.math.dfp.Dfp var4 = var1.getOne();
//     org.apache.commons.math.dfp.Dfp var5 = var1.getLn2();
//     org.apache.commons.math.dfp.Dfp var7 = var1.newDfp(420988767086167817L);
//     org.apache.commons.math.dfp.Dfp var8 = var1.getTwo();
//     double[] var9 = var8.toSplitDouble();
//     org.apache.commons.math.dfp.Dfp var11 = var8.divide(98019085);
//     
//     // Checks the contract:  var11.equals(var11)
//     assertTrue("Contract failed: var11.equals(var11)", var11.equals(var11));
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    int var8 = var7.intValue();
    org.apache.commons.math.dfp.DfpField var10 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var12 = var10.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var14 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var16 = var14.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var17 = var12.subtract(var16);
    org.apache.commons.math.dfp.Dfp var18 = org.apache.commons.math.dfp.DfpField.computeExp(var7, var12);
    org.apache.commons.math.dfp.Dfp var20 = var12.newInstance(10);
    int var21 = var12.getRadixDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 25);

  }

  public void test463() {}
//   public void test463() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.8486949055044017d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    org.apache.commons.math.dfp.DfpField var1 = new org.apache.commons.math.dfp.DfpField(100);
    var1.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var5 = var1.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var7 = var5.power10(100);
    org.apache.commons.math.dfp.DfpField var9 = new org.apache.commons.math.dfp.DfpField(100);
    var9.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var13 = var9.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var15 = var13.power10(100);
    org.apache.commons.math.dfp.Dfp var16 = var15.getZero();
    org.apache.commons.math.dfp.Dfp var17 = var5.add(var16);
    org.apache.commons.math.dfp.DfpField var19 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var21 = var19.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var22 = var21.negate();
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
    org.apache.commons.math.dfp.Dfp var42 = var21.newInstance(var41);
    org.apache.commons.math.dfp.Dfp var43 = var17.newInstance(var41);
    org.apache.commons.math.dfp.DfpField var45 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var47 = var45.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var48 = var47.negate();
    org.apache.commons.math.dfp.DfpField var50 = new org.apache.commons.math.dfp.DfpField(100);
    var50.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var54 = var50.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var56 = var54.power10(100);
    int var57 = var56.intValue();
    org.apache.commons.math.dfp.DfpField var59 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var61 = var59.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var63 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var65 = var63.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var66 = var61.subtract(var65);
    org.apache.commons.math.dfp.Dfp var67 = org.apache.commons.math.dfp.DfpField.computeExp(var56, var61);
    org.apache.commons.math.dfp.Dfp var68 = var47.newInstance(var67);
    org.apache.commons.math.dfp.Dfp var69 = org.apache.commons.math.dfp.Dfp.copysign(var43, var68);
    int var70 = var68.getRadixDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 25);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.5501637768927253E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5501637768927253E-17d);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.0000000000000004d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5574077246549038d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.692797479586075d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.8093334367141565d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-0.591588582936028d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var5 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)(short)100, (java.lang.Number)10.0f, true);
    org.apache.commons.math.exception.util.Localizable var6 = var5.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var9 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var7, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var10 = var9.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var13 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var11, (java.lang.Number)0L);
    org.apache.commons.math.exception.util.Localizable var14 = var13.getGeneralPattern();
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var19 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var16, var18);
    org.apache.commons.math.exception.util.Localizable var20 = var19.getSpecificPattern();
    java.lang.Object[] var21 = var19.getArguments();
    org.apache.commons.math.exception.MathIllegalArgumentException var22 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var14, var21);
    java.lang.Object[] var23 = null;
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var23);
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var27 = null;
    java.lang.Object[] var29 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var30 = new org.apache.commons.math.exception.MathIllegalArgumentException(var26, var27, var29);
    org.apache.commons.math.exception.MathIllegalArgumentException var31 = new org.apache.commons.math.exception.MathIllegalArgumentException(var25, var29);
    org.apache.commons.math.exception.MathRuntimeException var32 = new org.apache.commons.math.exception.MathRuntimeException(var0, var6, var10, var29);
    java.lang.Number var33 = null;
    org.apache.commons.math.exception.NotStrictlyPositiveException var34 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var10, var33);
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var39 = new org.apache.commons.math.exception.NumberIsTooSmallException(var35, (java.lang.Number)4.9E-324d, (java.lang.Number)100L, true);
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.exception.util.Localizable var41 = null;
    java.lang.Object[] var43 = new java.lang.Object[] { 0};
    org.apache.commons.math.exception.MathIllegalArgumentException var44 = new org.apache.commons.math.exception.MathIllegalArgumentException(var40, var41, var43);
    org.apache.commons.math.exception.util.Localizable var45 = var44.getSpecificPattern();
    var39.addSuppressed((java.lang.Throwable)var44);
    java.lang.Number var47 = var39.getArgument();
    org.apache.commons.math.exception.util.Localizable var48 = var39.getSpecificPattern();
    org.apache.commons.math.exception.util.Localizable var49 = var39.getGeneralPattern();
    org.apache.commons.math.dfp.DfpField var51 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var53 = var51.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var54 = var53.negate();
    org.apache.commons.math.dfp.DfpField var56 = new org.apache.commons.math.dfp.DfpField(100);
    var56.setIEEEFlags(4);
    org.apache.commons.math.dfp.Dfp var60 = var56.newDfp(0.670167019390977d);
    org.apache.commons.math.dfp.Dfp var62 = var60.power10(100);
    int var63 = var62.intValue();
    org.apache.commons.math.dfp.DfpField var65 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var67 = var65.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.DfpField var69 = new org.apache.commons.math.dfp.DfpField(100);
    org.apache.commons.math.dfp.Dfp var71 = var69.newDfp(2.8421709430404014E-14d);
    org.apache.commons.math.dfp.Dfp var72 = var67.subtract(var71);
    org.apache.commons.math.dfp.Dfp var73 = org.apache.commons.math.dfp.DfpField.computeExp(var62, var67);
    org.apache.commons.math.dfp.Dfp var74 = var53.newInstance(var73);
    org.apache.commons.math.dfp.DfpField var75 = var73.getField();
    org.apache.commons.math.dfp.Dfp[] var76 = var75.getPiSplit();
    org.apache.commons.math.exception.MathIllegalArgumentException var77 = new org.apache.commons.math.exception.MathIllegalArgumentException(var10, var49, (java.lang.Object[])var76);
    java.lang.String var78 = var77.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 4.9E-324d+ "'", var47.equals(4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "org.apache.commons.math.exception.MathIllegalArgumentException: 3.14159265358979323846264338327950288419716939 is smaller than the minimum (9.375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359e-45): 3.14159265358979323846264338327950288419716939 is smaller than, or equal to, the minimum (9.375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359e-45)"+ "'", var78.equals("org.apache.commons.math.exception.MathIllegalArgumentException: 3.14159265358979323846264338327950288419716939 is smaller than the minimum (9.375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359e-45): 3.14159265358979323846264338327950288419716939 is smaller than, or equa
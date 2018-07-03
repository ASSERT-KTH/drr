
import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test1"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    boolean var3 = var2.isSupportConnected();
    double var4 = var2.getNumericalVariance();
    boolean var5 = var2.isSupportLowerBoundInclusive();
    boolean var6 = var2.isSupportConnected();
    double var7 = var2.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 9.869604401089358d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test2"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(1074L, (-18L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-18L));

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test3"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     long var12 = var0.nextPoisson(0.11751201469396123d);
//     long var15 = var0.nextSecureLong(2L, 6917529027641081856L);
//     int var18 = var0.nextInt((-1023), 62);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 3475185729972385792L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-204));
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test4"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    int var12 = var11.ordinal();
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = var13.getNanStrategy();
    java.lang.String var15 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "MAXIMAL"+ "'", var15.equals("MAXIMAL"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test5"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    int var23 = var21.ordinal();
    int var24 = var21.ordinal();
    org.apache.commons.math3.stat.ranking.NaturalRanking var25 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test6"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians((-0.35913938368747433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.006268164718929641d));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test7"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(0.903257199688792d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7853474585516205d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test8"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-127), (-52));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.671779336150837d, 0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test10"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy[] var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
    org.apache.commons.math3.exception.MathArithmeticException var2 = new org.apache.commons.math3.exception.MathArithmeticException(var0, (java.lang.Object[])var1);
    org.apache.commons.math3.exception.util.ExceptionContext var3 = var2.getContext();
    org.apache.commons.math3.exception.util.ExceptionContext var4 = var2.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test11"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(203679771771073536L, 7L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1425758402397514752L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test12"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test13"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(5.272140874989314E49d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 114.48910607490753d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test14"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p((-0.138386904159894d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14894895381244863d));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test15"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    boolean var4 = var0.isSupportConnected();
    double var6 = var0.cumulativeProbability(0.7853474585516205d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.7838750613037808d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test16"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.11695608494089252d), 0.40306506468729153d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.11695608494089252d));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-54));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test18"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(short)0);
    org.apache.commons.math3.exception.NotPositiveException var3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.11751201469396123d);
    var1.addSuppressed((java.lang.Throwable)var3);
    boolean var5 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test19"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(1.4210856E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test20"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     double var19 = var0.nextChiSquare(1.5607966601082315d);
//     double var22 = var0.nextWeibull(0.18508523651945266d, 5.9806034621180615d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-45));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.40306506468729153d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 8.387331276444609d);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test21"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var6, 902511928144852736L);
    java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var6, 6917529027641081856L);
    java.math.BigInteger var12 = org.apache.commons.math3.util.ArithmeticUtils.pow(var10, 0L);
    java.math.BigInteger var14 = org.apache.commons.math3.util.ArithmeticUtils.pow(var10, 1740836582493363456L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test22"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb((-0.22717428012039587d), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.817394240963167d));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test23"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var7 = var3.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var3.getElement((-924));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test24"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    boolean var4 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test25"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextF(0.0d, (-1.4324261860181493d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.4174217812421834d);
// 
//   }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test26"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     int var6 = var0.nextInt(30, 1410065408);
//     double var8 = var0.nextExponential(0.05066297352460297d);
//     double var11 = var0.nextF(6.662756980709212E-6d, 1.0176351058563242d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var14 = var0.nextWeibull(0.0d, 0.038581377435943975d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.6574647734722334E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1046295741);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.21922066181107264d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.74388597596024E-9d);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test27"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(42, 91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-49));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test28"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = var13.getNanStrategy();
    org.apache.commons.math3.random.RandomGenerator var16 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var17 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15, var16);
    java.lang.Class var18 = var15.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var20 = java.lang.Enum.<java.lang.Enum>valueOf(var18, "76e221390e032ec930bac5afa");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test29"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(2.922654681039436d, 1.6978320005436003E-9d, 39.678616286953876d);
    var3.reseedRandomGenerator(0L);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test30"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(3.814697E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-19));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1552941056, (-3222L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test32"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log(1.5599489905203603d, (-0.9070706940443594d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test33"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acos((-1.4699094585831982d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test34"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.533126106571059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.009304805888003156d);

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test35"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     org.apache.commons.math3.distribution.NormalDistribution var5 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var7 = var5.inverseCumulativeProbability(0.4373817081192443d);
//     var5.reseedRandomGenerator(100L);
//     double var10 = var5.getStandardDeviation();
//     double var11 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var5);
//     long var14 = var0.nextLong(0L, 1L);
//     int var17 = var0.nextInt((-34), 15);
//     double var20 = var0.nextGamma(3.1415926535897936d, (-0.8302490352228529d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var22 = var0.nextPoisson((-0.9050225767665427d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.3124457106891479d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.020236939781740158d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-27));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-1.8720754068404453d));
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test36"); }


    org.apache.commons.math3.stat.inference.MannWhitneyUTest var0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var3 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var5 = var4.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var4);
    double var8 = var4.addElementRolling(0.0d);
    double[] var9 = var4.getElements();
    double[] var10 = var4.getElements();
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double var20 = var14.substituteMostRecentElement(2.220446049250313E-16d);
    int var21 = var14.start();
    double[] var22 = var14.getElements();
    double var23 = var0.mannWhitneyUTest(var10, var22);
    org.apache.commons.math3.util.ResizableDoubleArray var24 = new org.apache.commons.math3.util.ResizableDoubleArray(var22);
    org.apache.commons.math3.util.ResizableDoubleArray var25 = new org.apache.commons.math3.util.ResizableDoubleArray(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.6985353583033387d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test37"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin((-0.0019585758637430395d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0019585746115541067d));

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test38"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-1.817394240963167d), 0.4364183473896249d, (-0.0019585758637430395d), 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test39"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.5218635024424644d);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test40"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(1.4699094585831982d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2123982260722745d);

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test41"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     double var15 = var0.nextChiSquare(0.5218635024424644d);
//     long var17 = var0.nextPoisson(9.869604401089358d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextSecureInt(85, 41);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-36));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 64);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0.057859117847628164d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 10L);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test42"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(0.4875474306513526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8834844464237087d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test43"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-165140.37185182082d), (java.lang.Number)(-10), (java.lang.Number)18L);
    java.lang.Number var4 = var3.getHi();
    java.lang.Number var5 = var3.getLo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 18L+ "'", var4.equals(18L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-10)+ "'", var5.equals((-10)));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test44"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    org.apache.commons.math3.random.RandomGenerator var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var11);
    int var13 = var9.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var16 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15);
    org.apache.commons.math3.stat.ranking.TiesStrategy var17 = var16.getTiesStrategy();
    boolean var19 = var17.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var14, var17);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var22 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var23 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var24 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var23);
    org.apache.commons.math3.stat.ranking.TiesStrategy var25 = var24.getTiesStrategy();
    boolean var27 = var25.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var28 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var22, var25);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var25);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    org.apache.commons.math3.util.ResizableDoubleArray var32 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var33 = var32.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var34 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var35 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var34);
    org.apache.commons.math3.stat.ranking.TiesStrategy var36 = var35.getTiesStrategy();
    double[] var39 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var40 = new org.apache.commons.math3.util.ResizableDoubleArray(var39);
    double[] var41 = var40.getInternalValues();
    double[] var42 = var35.rank(var41);
    org.apache.commons.math3.stat.ranking.NaNStrategy var43 = var35.getNanStrategy();
    int var44 = var43.ordinal();
    org.apache.commons.math3.random.RandomGenerator var45 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var46 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var43, var45);
    int var47 = var43.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var48 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var49 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var50 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var49);
    org.apache.commons.math3.stat.ranking.TiesStrategy var51 = var50.getTiesStrategy();
    boolean var53 = var51.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var54 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var48, var51);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var43, var51);
    double[] var58 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var59 = new org.apache.commons.math3.util.ResizableDoubleArray(var58);
    double[] var60 = var59.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var61 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var62 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var61);
    org.apache.commons.math3.stat.ranking.TiesStrategy var63 = var62.getTiesStrategy();
    double[] var66 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var67 = new org.apache.commons.math3.util.ResizableDoubleArray(var66);
    double[] var68 = var67.getInternalValues();
    double[] var69 = var62.rank(var68);
    double var70 = var55.mannWhitneyUTest(var60, var68);
    double var71 = var30.mannWhitneyU(var33, var68);
    double[] var74 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var75 = new org.apache.commons.math3.util.ResizableDoubleArray(var74);
    double[] var76 = var75.getInternalValues();
    double var77 = var29.mannWhitneyU(var68, var76);
    org.apache.commons.math3.util.ResizableDoubleArray var78 = new org.apache.commons.math3.util.ResizableDoubleArray(var76);
    double[] var81 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var82 = new org.apache.commons.math3.util.ResizableDoubleArray(var81);
    double[] var83 = var82.getInternalValues();
    var78.addElements(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 150.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test45"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(2.9813740568701674d, 0.9990581771644061d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.9813740568701674d);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test46"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acosh(0.05338287470879381d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test47"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt(1.6591722380939804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1838513055935498d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test48"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(12, 111);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test49"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test50"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(1.8969306447972577E157d, (-8360));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test51"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.7853474585516205d, 2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.083076693439845d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-29), (-38));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test53"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    boolean var12 = var3.equals((java.lang.Object)9.550073087603984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test54"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent((-1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test55"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test56"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(1.2123982260722745d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2123982260722748d);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test57"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     var0.reSeedSecure(10L);
//     double var17 = var0.nextWeibull(0.3172440566036945d, 2.0827949296372137d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var20 = var0.nextWeibull(0.6985353583033387d, (-0.22070453140096552d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-126));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 24.025122548858985d);
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test58"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextSecureLong((-1L), 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-1L));
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test59"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)251.0d, (java.lang.Number)0.05785107761175086d, true);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test60"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy[] var3 = org.apache.commons.math3.stat.ranking.TiesStrategy.values();
    org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)(-0.215551206382648d), (java.lang.Object[])var3);
    org.apache.commons.math3.exception.MathIllegalStateException var5 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, (java.lang.Object[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test61"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(9.869604401089358d, 1.9572102603976436d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.852684087769282E-5d);

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test62"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     var0.reSeed();
//     double var21 = var0.nextGamma((-0.9070706940443594d), 3.8335692830401955d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-84));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1.4709228568158544E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 7.657573167350508d);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test63"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    java.lang.Object[] var5 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var6 = new org.apache.commons.math3.exception.MaxCountExceededException(var2, (java.lang.Number)(short)(-1), var5);
    org.apache.commons.math3.exception.MathIllegalStateException var7 = new org.apache.commons.math3.exception.MathIllegalStateException(var1, var5);
    org.apache.commons.math3.exception.MathArithmeticException var8 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var5);
    org.apache.commons.math3.exception.util.ExceptionContext var9 = var8.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test64"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    var3.addElement(0.0d);
    var3.setElement(1, 2.9524258967767216d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-50));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test65"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    var1.addElement(8.71681867595783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test66"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-2.245945181602119d), 0.9999987733545931d, 0.46049838059322834d, (-95));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test67"); }


    double var2 = org.apache.commons.math3.util.FastMath.min((-6.12684151706252E-4d), 1.1931993509471547E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6.12684151706252E-4d));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test68"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum((-0.6267123454455888d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test69"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     double var15 = var0.nextChiSquare(0.5218635024424644d);
//     long var17 = var0.nextPoisson(9.869604401089358d);
//     var0.reSeed(3L);
//     double var21 = var0.nextT(0.23016257191669184d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-72));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 70);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0.057859117847628164d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 10L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 34.75739448681458d);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test70"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(31.85489831527096d, 1.0176351058563242d);
    double var3 = var2.getNumericalMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 31.85489831527096d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test71"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)0.7853474585516205d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test72"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double[] var19 = var14.getElements();
    var3.addElements(var19);
    int var21 = var3.getNumElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 4);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test73"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(4.8236156220057326E-63d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.418797445463427E-65d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test74"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(1.0176351058563242d, 4.846013790589009d, 0.7853981633974483d);
    double var5 = var3.density(22.140692632779277d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6.163344796162179E-6d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test75"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh((-0.8390715290764524d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7628881244594873d));

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.811764803218308d, 1.69677425296479d, 0.0d, (-57));
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test77"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var11 = new org.apache.commons.math3.exception.MathArithmeticException(var8, var10);
    org.apache.commons.math3.exception.MathInternalError var12 = new org.apache.commons.math3.exception.MathInternalError(var7, var10);
    org.apache.commons.math3.exception.MathIllegalArgumentException var13 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var6, var10);
    org.apache.commons.math3.exception.MathInternalError var14 = new org.apache.commons.math3.exception.MathInternalError(var5, var10);
    org.apache.commons.math3.exception.MathInternalError var15 = new org.apache.commons.math3.exception.MathInternalError(var4, var10);
    org.apache.commons.math3.exception.MaxCountExceededException var16 = new org.apache.commons.math3.exception.MaxCountExceededException(var2, (java.lang.Number)1L, var10);
    org.apache.commons.math3.exception.MaxCountExceededException var17 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)0.8611658242554283d, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test78"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-165140.37185182082d), (java.lang.Number)(-10), (java.lang.Number)18L);
    java.lang.String var4 = var3.toString();
    java.lang.Number var5 = var3.getLo();
    org.apache.commons.math3.exception.util.ExceptionContext var6 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math3.exception.OutOfRangeException: -165,140.372 out of [-10, 18] range"+ "'", var4.equals("org.apache.commons.math3.exception.OutOfRangeException: -165,140.372 out of [-10, 18] range"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-10)+ "'", var5.equals((-10)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(6548440436062887936L, 4524524291707106304L);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test80"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.asin(1.532532173776735d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test81"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 6.163344796162179E-6d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test82"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.99999994f, 31.195724084720606d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(7L, 6548440436062887936L);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test84"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.9677566915462853E-9d, (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test85"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs((-1.1368685E-13f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1368685E-13f);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("76e221390e032ec930bac5afa");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test87"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    java.lang.Class var23 = var9.getDeclaringClass();
    java.lang.Class var24 = var9.getDeclaringClass();
    org.apache.commons.math3.stat.ranking.TiesStrategy var25 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var26 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var25);
    org.apache.commons.math3.stat.ranking.TiesStrategy var27 = var26.getTiesStrategy();
    double[] var30 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var31 = new org.apache.commons.math3.util.ResizableDoubleArray(var30);
    double[] var32 = var31.getInternalValues();
    double[] var33 = var26.rank(var32);
    org.apache.commons.math3.stat.ranking.NaNStrategy var34 = var26.getNanStrategy();
    int var35 = var34.ordinal();
    org.apache.commons.math3.random.RandomGenerator var36 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var37 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var34, var36);
    org.apache.commons.math3.stat.ranking.NaturalRanking var38 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var34);
    boolean var39 = var9.equals((java.lang.Object)var38);
    org.apache.commons.math3.stat.ranking.TiesStrategy var40 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var41 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var40);
    org.apache.commons.math3.stat.ranking.TiesStrategy var42 = var41.getTiesStrategy();
    double[] var45 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var46 = new org.apache.commons.math3.util.ResizableDoubleArray(var45);
    double[] var47 = var46.getInternalValues();
    double[] var48 = var41.rank(var47);
    org.apache.commons.math3.stat.ranking.NaNStrategy var49 = var41.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var50 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var49);
    org.apache.commons.math3.stat.ranking.TiesStrategy var51 = var50.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var52 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var51);
    org.apache.commons.math3.stat.ranking.NaturalRanking var53 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var51);
    double[] var56 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var57 = new org.apache.commons.math3.util.ResizableDoubleArray(var56);
    double[] var58 = var53.rank(var56);
    org.apache.commons.math3.util.ResizableDoubleArray var59 = new org.apache.commons.math3.util.ResizableDoubleArray(var58);
    double[] var60 = var38.rank(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test88"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.MathArithmeticException var2 = new org.apache.commons.math3.exception.MathArithmeticException();
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(short)(-1), var7);
    org.apache.commons.math3.exception.MathIllegalStateException var9 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var2, var3, var7);
    org.apache.commons.math3.exception.MathArithmeticException var10 = new org.apache.commons.math3.exception.MathArithmeticException(var1, var7);
    org.apache.commons.math3.exception.MathInternalError var11 = new org.apache.commons.math3.exception.MathInternalError(var0, var7);
    org.apache.commons.math3.exception.util.ExceptionContext var12 = var11.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test89"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    float var11 = var3.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = var3.copy();
    var3.contract();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setContractionCriteria(1.0000002f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test90"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-1.20748015729388d), (java.lang.Number)1.7598948720186276d, (java.lang.Number)0.056362217600843124d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test91"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)36, (java.lang.Number)(-95), true);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test92"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    boolean var4 = var0.isSupportLowerBoundInclusive();
    boolean var5 = var0.isSupportLowerBoundInclusive();
    boolean var6 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test93"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.5666361150813415d, 3.141592653589793d, 0.4373817081192443d, (-67));
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-51), 1.1368683E-13f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test95"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    double var5 = var0.inverseCumulativeProbability(0.0d);
    double var6 = var0.getSupportLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NEGATIVE_INFINITY);

  }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test96"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt(100, 14348907);
//     var0.reSeed(1L);
//     java.util.Collection var8 = null;
//     java.lang.Object[] var10 = var0.nextSample(var8, 69);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test97"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-38), (-276308199));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test98"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(5.892635459924929d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362.3590097163484d);

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test99"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     double var18 = var0.nextGaussian((-0.5954271189370909d), 0.6198239740031684d);
//     var0.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var22 = var0.nextLong(46440L, 0L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-4));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "cbff7af"+ "'", var15.equals("cbff7af"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-1.0234917754783677d));
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test100"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    var0.setElement(76, 1.32219005396715E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test101"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test102"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
    org.apache.commons.math3.exception.MaxCountExceededException var10 = new org.apache.commons.math3.exception.MaxCountExceededException(var6, (java.lang.Number)(byte)(-1), var9);
    org.apache.commons.math3.exception.MathIllegalStateException var11 = new org.apache.commons.math3.exception.MathIllegalStateException(var5, var9);
    org.apache.commons.math3.exception.MaxCountExceededException var12 = new org.apache.commons.math3.exception.MaxCountExceededException(var3, (java.lang.Number)2.993222846126381d, var9);
    org.apache.commons.math3.exception.MathIllegalArgumentException var13 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var2, var9);
    org.apache.commons.math3.exception.MaxCountExceededException var14 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)18, var9);
    java.lang.Number var15 = var14.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 18+ "'", var15.equals(18));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test103"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getSupportLowerBound();
    double var7 = var0.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test104"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-172L), 179L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7L);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test105"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)1.170318942725924d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test106"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(9.999999f, 32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test107"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt(100, 14348907);
//     var0.reSeed(1L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var9 = var0.nextPoisson((-0.1494681981443936d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 5343073);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test108"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 114.0342117814617d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test109"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0L, 46440L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test110"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos((-0.22717428012039587d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9743067075574819d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test111"); }


    java.lang.Number var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)(-0.7116919606539285d), (java.lang.Number)3.120508200469428E-11d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test112"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-1.6610594882707213d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6610594882707213d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(6917529027641081856L, (-288911044138658496L));
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test114"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var16 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15);
    org.apache.commons.math3.stat.ranking.NaNStrategy var17 = var16.getNanStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test115"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)2.220446049250313E-16d);
    org.apache.commons.math3.exception.util.ExceptionContext var2 = var1.getContext();
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var7 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var3, (java.lang.Number)(-1.8969306447972577E157d), (java.lang.Number)(-1L), true);
    var1.addSuppressed((java.lang.Throwable)var7);
    boolean var9 = var7.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test116"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-84));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test117"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)1.1559327705920959d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test118"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.660619669242163d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test119"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 68);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test120"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     double var11 = var0.nextCauchy((-0.812595528807679d), 31.85489831527096d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextSecureInt(74, 28);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-0.7780331245288088d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.9999999988837014d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-14.853672247458112d));
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test121"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    int var4 = var0.start();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.discardMostRecentElements((-8360));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test122"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { (-1L)};
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(byte)(-1), var7);
    org.apache.commons.math3.exception.MathIllegalStateException var9 = new org.apache.commons.math3.exception.MathIllegalStateException(var3, var7);
    org.apache.commons.math3.exception.MaxCountExceededException var10 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)79, var7);
    org.apache.commons.math3.exception.MathIllegalArgumentException var11 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test123"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    float var9 = var3.getContractionCriteria();
    var3.setExpansionFactor(2.5f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode(71);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.5f);

  }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test124"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     double var5 = var0.nextF(0.14782604738794858d, 3.1415926535897936d);
//     java.lang.String var7 = var0.nextHexString(21);
//     double var10 = var0.nextGamma((-0.6212103591877449d), 0.020492736543359383d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.07969545158846986d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "4be36dd37eb625b8ab190"+ "'", var7.equals("4be36dd37eb625b8ab190"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0.03937192387339185d);
// 
//   }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test125"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     var0.reSeedSecure();
//     int var9 = var0.nextInt((-127), (-70));
//     double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
//     double var14 = var0.nextT(0.7209210669314736d);
//     long var16 = var0.nextPoisson(2.7495685662163734E-10d);
//     var0.reSeedSecure(15L);
//     java.util.Collection var19 = null;
//     java.lang.Object[] var21 = var0.nextSample(var19, 24);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test126"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var6, 902511928144852736L);
    java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var6, 6917529027641081856L);
    java.math.BigInteger var12 = org.apache.commons.math3.util.ArithmeticUtils.pow(var10, 0L);
    java.math.BigInteger var13 = null;
    java.math.BigInteger var15 = org.apache.commons.math3.util.ArithmeticUtils.pow(var13, 0L);
    java.math.BigInteger var16 = null;
    java.math.BigInteger var18 = org.apache.commons.math3.util.ArithmeticUtils.pow(var16, 0L);
    java.math.BigInteger var19 = org.apache.commons.math3.util.ArithmeticUtils.pow(var15, var18);
    java.math.BigInteger var20 = org.apache.commons.math3.util.ArithmeticUtils.pow(var10, var19);
    java.math.BigInteger var22 = org.apache.commons.math3.util.ArithmeticUtils.pow(var20, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test127"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.MathArithmeticException var2 = new org.apache.commons.math3.exception.MathArithmeticException();
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(short)(-1), var7);
    org.apache.commons.math3.exception.MathIllegalStateException var9 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var2, var3, var7);
    org.apache.commons.math3.exception.MathArithmeticException var10 = new org.apache.commons.math3.exception.MathArithmeticException(var1, var7);
    org.apache.commons.math3.exception.NullArgumentException var11 = new org.apache.commons.math3.exception.NullArgumentException(var0, var7);
    org.apache.commons.math3.exception.util.Localizable var12 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var16 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var12, (java.lang.Number)(-1.0d), (java.lang.Number)30, false);
    var11.addSuppressed((java.lang.Throwable)var16);
    org.apache.commons.math3.exception.util.Localizable var18 = null;
    org.apache.commons.math3.exception.OutOfRangeException var22 = new org.apache.commons.math3.exception.OutOfRangeException(var18, (java.lang.Number)(-25), (java.lang.Number)31.85489831527096d, (java.lang.Number)0.020492736543359383d);
    var16.addSuppressed((java.lang.Throwable)var22);
    java.lang.Throwable[] var24 = var16.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test128"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-18L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test129"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.99999994f));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test130"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(0, 361175020);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 361175020);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test131"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(14, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-769949696));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test132"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(629, (-18));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 647);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test133"); }


    long var2 = org.apache.commons.math3.util.FastMath.min((-18L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-18L));

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test134"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(24, (-42));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-42));

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test135"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)0.44721359549995804d, (java.lang.Number)0.009304805888003156d, false);

  }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test136"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
//     double var3 = var0.getStandardDeviation();
//     double var4 = var0.getNumericalVariance();
//     double var5 = var0.getNumericalVariance();
//     double var6 = var0.getStandardDeviation();
//     double var7 = var0.getSupportLowerBound();
//     double var8 = var0.sample();
//     boolean var9 = var0.isSupportUpperBoundInclusive();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.2300078991508468d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test137"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    double[] var11 = var3.getElements();
    double[] var12 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var13 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var13.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test138"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     var0.reSeedSecure(0L);
//     double var13 = var0.nextGamma(1.7266655891834315d, (-4.9E-324d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var0.nextBinomial((-276308207), (-6.12684151706252E-4d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-61));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-4.9E-324d));
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test139"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(1.5415703049858722d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2176032516561348d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test140"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    boolean var3 = var2.isSupportConnected();
    double var4 = var2.getSupportUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.POSITIVE_INFINITY);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test141"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    double[] var6 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var7 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
    double[] var8 = var7.getInternalValues();
    double[] var9 = var2.rank(var8);
    org.apache.commons.math3.stat.ranking.NaNStrategy var10 = var2.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var12);
    org.apache.commons.math3.stat.ranking.TiesStrategy var14 = var13.getTiesStrategy();
    double[] var17 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var17);
    double[] var19 = var18.getInternalValues();
    double[] var20 = var13.rank(var19);
    org.apache.commons.math3.stat.ranking.NaNStrategy var21 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var22 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var23 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var22);
    org.apache.commons.math3.stat.ranking.TiesStrategy var24 = var23.getTiesStrategy();
    double[] var27 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var28 = new org.apache.commons.math3.util.ResizableDoubleArray(var27);
    double[] var29 = var28.getInternalValues();
    double[] var30 = var23.rank(var29);
    org.apache.commons.math3.stat.ranking.NaNStrategy var31 = var23.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var32 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var31);
    org.apache.commons.math3.stat.ranking.TiesStrategy var33 = var32.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var34 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21, var33);
    int var35 = var33.ordinal();
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var36 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var10, var33);
    org.apache.commons.math3.random.RandomGenerator var37 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var38 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10, var37);
    org.apache.commons.math3.stat.ranking.TiesStrategy var39 = var38.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var40 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var39);
    org.apache.commons.math3.stat.ranking.NaturalRanking var41 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var39);
    org.apache.commons.math3.stat.ranking.NaturalRanking var42 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test142"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum((-1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test143"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(203679771771073536L, (-3042L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 203679771771070494L);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test144"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh((-0.8390715290764524d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3731644178712397d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.981374056870167d, 0.10244782475453244d, 11.932745954929619d, 0);
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test146"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test147"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    var0.reSeed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test148"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-180L), 1740836582493363456L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1740836582493363456L);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test149"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)0.5678042461411295d);

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test150"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(0.0d, (-0.011754646363680897d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var13 = var0.nextChiSquare((-0.6017998293367545d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.m
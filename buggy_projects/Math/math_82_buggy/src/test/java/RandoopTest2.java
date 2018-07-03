
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
    int var23 = var19.getRowDimension();
    double[][] var24 = var19.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var26 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, false);
    double[][] var27 = var26.getDataRef();
    boolean var28 = var26.isSingular();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    double var4 = var3.getConstantTerm();
    org.apache.commons.math.linear.RealVector var5 = var3.getCoefficients();
    double var6 = var3.getConstantTerm();
    org.apache.commons.math.linear.RealVector var7 = var3.getCoefficients();
    double var8 = var3.getConstantTerm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(2.302585092994046d, 0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapSinhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var5 = var4.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var6 = var4.mapAsin();
    org.apache.commons.math.linear.RealVector var7 = var4.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var9 = null;
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var13 = new org.apache.commons.math.optimization.linear.LinearConstraint(var7, 363.7393755555636d, var9, (org.apache.commons.math.linear.RealVector)var11, 10.0d);
    org.apache.commons.math.linear.RealVector var14 = var11.mapExp();
    org.apache.commons.math.linear.RealVector var15 = var1.projection((org.apache.commons.math.linear.RealVector)var11);
    org.apache.commons.math.linear.RealVector var16 = var1.mapCoshToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13, var15);
    org.apache.commons.math.linear.RealVector var19 = var18.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var20 = var18.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var21 = var18.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var25 = var24.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var26 = var24.mapLog1p();
    var18.setSubVector(0, (org.apache.commons.math.linear.RealVector)var24);
    org.apache.commons.math.linear.RealVector var28 = var24.mapCosh();
    org.apache.commons.math.linear.RealVector var29 = var24.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var32 = var31.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var33 = var31.mapAsin();
    org.apache.commons.math.linear.RealVector var34 = var31.mapCbrt();
    org.apache.commons.math.linear.RealVector var35 = var31.mapUlp();
    org.apache.commons.math.linear.RealVector var36 = var31.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var37 = var24.subtract(var31);
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var40 = var39.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var41 = var39.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var42 = var24.ebeMultiply(var39);
    org.apache.commons.math.linear.RealVector var43 = var39.mapSin();
    double var44 = var1.getL1Distance(var39);
    org.apache.commons.math.linear.RealVector var45 = var1.mapTanhToSelf();
    org.apache.commons.math.linear.RealVector var46 = var1.mapSignumToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
//     org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
//     org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
//     org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
//     var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
//     double[] var16 = var12.getData();
//     org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var20 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
//     org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 1.0d, true);
//     org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var16, var20);
//     org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var16);
//     double[] var30 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
//     double[] var35 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var36 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var35);
//     org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var40 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var42 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var40, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var43 = new org.apache.commons.math.linear.ArrayRealVector(var38, var40);
//     double[] var44 = var36.operate(var40);
//     double var45 = org.apache.commons.math.util.MathUtils.distance1(var30, var40);
//     double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var40);
//     org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(var40);
//     org.apache.commons.math.linear.RealVector var49 = var47.append(0.0d);
//     org.apache.commons.math.linear.RealVector var50 = var47.mapLog10();
//     org.apache.commons.math.linear.RealVector var51 = var47.mapSqrtToSelf();
//     org.apache.commons.math.linear.RealVector var52 = null;
//     org.apache.commons.math.linear.RealVector var53 = var47.subtract(var52);
// 
//   }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var8 = var1.mapMultiply(1.0d);
    org.apache.commons.math.optimization.linear.Relationship var9 = null;
    org.apache.commons.math.optimization.linear.LinearConstraint var11 = new org.apache.commons.math.optimization.linear.LinearConstraint(var8, var9, (-1.0d));
    org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var15 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, "", var15);
    boolean var17 = var11.equals((java.lang.Object)"");
    org.apache.commons.math.optimization.linear.Relationship var18 = var11.getRelationship();
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var21 = var20.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var22 = var20.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(var20, false);
    org.apache.commons.math.linear.RealVector var25 = var24.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var28 = var24.dotProduct((org.apache.commons.math.linear.RealVector)var27);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var31 = var30.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var32 = var30.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var30, false);
    org.apache.commons.math.linear.RealVector var35 = var30.mapSinhToSelf();
    double var36 = var27.getLInfDistance((org.apache.commons.math.linear.RealVector)var30);
    boolean var37 = var11.equals((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.optimization.linear.Relationship var8 = null;
    java.lang.Double[] var10 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var10);
    org.apache.commons.math.linear.RealVector var12 = var11.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var11);
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    double[] var20 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var21 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var20);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var27 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var25, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var23, var25);
    double[] var29 = var21.operate(var25);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.optimization.linear.Relationship var32 = null;
    double[] var35 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var36 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var35);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var40 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var42 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var40, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var43 = new org.apache.commons.math.linear.ArrayRealVector(var38, var40);
    double[] var44 = var36.operate(var40);
    org.apache.commons.math.linear.ArrayRealVector var45 = new org.apache.commons.math.linear.ArrayRealVector(var40);
    org.apache.commons.math.optimization.linear.LinearConstraint var47 = new org.apache.commons.math.optimization.linear.LinearConstraint(var25, 50.0d, var32, var40, 2.302585092994046d);
    double var48 = var17.getValue(var40);
    double var49 = var11.getL1Distance(var40);
    org.apache.commons.math.linear.RealVector var51 = var11.mapSubtractToSelf(12.543080634815244d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.LinearConstraint var53 = new org.apache.commons.math.optimization.linear.LinearConstraint(var6, 8.85125285761032d, var8, var51, 0.9957901442164848d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2.9066992099956157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.RealMatrix var5 = var3.scalarAdd(10.0d);
    double var6 = var3.getFrobeniusNorm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
    java.lang.String var5 = var4.getSeparator();
    java.lang.String var6 = var4.getSeparator();
    java.lang.String var7 = var4.getSuffix();
    java.lang.String var8 = var4.getSuffix();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var5.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var6.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException("", var1);
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var2);
    java.lang.String var4 = var3.getPattern();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.ConvergenceException: "+ "'", var4.equals("org.apache.commons.math.ConvergenceException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    org.apache.commons.math.linear.RealVectorFormat var3 = new org.apache.commons.math.linear.RealVectorFormat("{1}", "Array2DRowRealMatrix{{1.0}}", "Array2DRowRealMatrix{{1.0}}");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var6 = var2.getSubVector(0, (-1694235892));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    java.text.NumberFormat var0 = null;
    org.apache.commons.math.linear.RealVectorFormat var1 = new org.apache.commons.math.linear.RealVectorFormat(var0);
    java.lang.String var2 = var1.getSeparator();
    double[] var4 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var4, 1.0d);
    double[] var9 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var9);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    double[] var18 = var10.operate(var14);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var4, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var20 = var1.formatToCharacterIterator((java.lang.Object)var19);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "; "+ "'", var2.equals("; "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var9 = var5.dotProduct((org.apache.commons.math.linear.RealVector)var8);
    org.apache.commons.math.linear.RealVector var11 = var8.append(0.9957901442164848d);
    org.apache.commons.math.linear.RealVector var12 = var8.mapAsin();
    org.apache.commons.math.linear.RealVector var13 = var8.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var17, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(var15, var17);
    org.apache.commons.math.linear.RealVector var21 = var20.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var22 = var20.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var23 = var20.mapUlp();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.RealVector var27 = var26.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var26);
    boolean var29 = var20.equals((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var30 = var8.dotProduct(var20);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("Array2DRowRealMatrix{{1.0}}", "Array2DRowRealMatrix{{1.0}}", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double var3 = var2.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.luDecompose();
      fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    double[][] var9 = var6.getDataRef();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var12 = var11.mapLog10();
    boolean var13 = var6.equals((java.lang.Object)var11);
    int var14 = var6.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var6.getTrace();
      fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var4 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var4, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(var2, var4);
//     org.apache.commons.math.linear.RealVector var8 = var7.mapCoshToSelf();
//     org.apache.commons.math.linear.RealVector var9 = var7.mapAtanToSelf();
//     org.apache.commons.math.linear.RealVector var10 = var7.mapUlp();
//     org.apache.commons.math.linear.RealVector var11 = var7.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var12 = var7.mapCosToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var0, var7);
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
//     java.lang.String var8 = var6.toString();
//     org.apache.commons.math.linear.ArrayRealVector var9 = null;
//     org.apache.commons.math.linear.ArrayRealVector var10 = var6.subtract(var9);
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var0, 2.0d);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
    int var23 = var19.getRowDimension();
    double[][] var24 = var19.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var26 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, false);
    double[][] var27 = var26.getDataRef();
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var32 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var34 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var32, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30, var32);
    org.apache.commons.math.optimization.RealPointValuePair var38 = new org.apache.commons.math.optimization.RealPointValuePair(var32, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(var32, true);
    int var41 = var40.getDimension();
    java.lang.Double[] var43 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var44 = new org.apache.commons.math.linear.ArrayRealVector(var43);
    org.apache.commons.math.linear.RealVector var45 = var44.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var44);
    org.apache.commons.math.linear.RealVector var47 = var40.add((org.apache.commons.math.linear.RealVector)var46);
    org.apache.commons.math.linear.ArrayRealVector var49 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var51 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var53 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var51, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var54 = new org.apache.commons.math.linear.ArrayRealVector(var49, var51);
    org.apache.commons.math.optimization.RealPointValuePair var57 = new org.apache.commons.math.optimization.RealPointValuePair(var51, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var59 = new org.apache.commons.math.linear.ArrayRealVector(var51, true);
    int var60 = var59.getDimension();
    java.lang.Double[] var62 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var63 = new org.apache.commons.math.linear.ArrayRealVector(var62);
    org.apache.commons.math.linear.RealVector var64 = var63.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var65 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var63);
    org.apache.commons.math.linear.RealVector var66 = var59.add((org.apache.commons.math.linear.RealVector)var65);
    java.lang.Double[] var68 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var69 = new org.apache.commons.math.linear.ArrayRealVector(var68);
    org.apache.commons.math.linear.ArrayRealVector var70 = var65.projection(var69);
    org.apache.commons.math.linear.RealVector var71 = var46.ebeMultiply((org.apache.commons.math.linear.RealVector)var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.setRowVector(101, (org.apache.commons.math.linear.RealVector)var46);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var1.mapRint();
    org.apache.commons.math.linear.RealVector var8 = var1.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var9 = var1.mapLog();
    org.apache.commons.math.linear.RealVector var10 = var1.mapLog();
    org.apache.commons.math.linear.RealVector var11 = var1.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var14 = var13.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var15 = var13.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var13, false);
    org.apache.commons.math.linear.RealVector var18 = var13.mapTan();
    org.apache.commons.math.linear.RealVector var19 = var13.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var13, false);
    org.apache.commons.math.linear.RealVector var23 = var13.mapMultiply((-1.0d));
    org.apache.commons.math.linear.RealVector var24 = var13.mapInvToSelf();
    double var25 = var13.getLInfNorm();
    double var26 = var13.getLInfNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var27 = var1.outerProduct(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double var22 = var19.getDeterminant();
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var28 = new org.apache.commons.math.optimization.RealPointValuePair(var24, 0.0d);
    double[][] var29 = new double[][] { var24};
    org.apache.commons.math.linear.Array2DRowRealMatrix var31 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var29, true);
    double var32 = var31.getFrobeniusNorm();
    double[] var35 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var37 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var35, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var39 = new org.apache.commons.math.optimization.RealPointValuePair(var35, 0.0d);
    double[][] var40 = new double[][] { var35};
    org.apache.commons.math.linear.Array2DRowRealMatrix var42 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var40, true);
    double var43 = var42.getFrobeniusNorm();
    var31.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var42);
    org.apache.commons.math.linear.RealMatrix var45 = var42.inverse();
    int var46 = var42.getRowDimension();
    double[][] var47 = var42.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var49 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var47, false);
    var49.multiplyEntry(0, 0, 0.03933967394071772d);
    double[][] var54 = var49.getData();
    org.apache.commons.math.linear.RealMatrix var55 = var19.preMultiply((org.apache.commons.math.linear.RealMatrix)var49);
    double var56 = var49.getTrace();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var57 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var62 = var49.walkInColumnOrder(var57, 1073741824, 1073741824, 1073741824, (-1694235892));
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.03933967394071772d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var23 = var8.getRowMatrix(0);
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var27 = var26.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var28 = var26.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var26, false);
    org.apache.commons.math.linear.RealVector var31 = var26.mapTan();
    double[] var33 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var35 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var33, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var37 = new org.apache.commons.math.optimization.RealPointValuePair(var33, 0.0d);
    double[][] var38 = new double[][] { var33};
    org.apache.commons.math.linear.Array2DRowRealMatrix var40 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var38, true);
    org.apache.commons.math.linear.RealMatrix var41 = var40.copy();
    double var42 = var40.getTrace();
    boolean var43 = var26.equals((java.lang.Object)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setColumnVector(1079574528, (org.apache.commons.math.linear.RealVector)var26);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var7 = var5.mapDivideToSelf(0.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    org.apache.commons.math.linear.RealVector var15 = var14.mapCoshToSelf();
    java.lang.String var16 = var14.toString();
    org.apache.commons.math.linear.RealVector var17 = var14.mapRint();
    org.apache.commons.math.linear.RealVector var18 = var14.mapAbsToSelf();
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var14);
    org.apache.commons.math.linear.RealVector var20 = var14.mapExpm1();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var21 = var5.subtract(var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "{1.54}"+ "'", var16.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var27 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var25, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var29 = new org.apache.commons.math.optimization.RealPointValuePair(var25, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var32 = new org.apache.commons.math.optimization.RealPointValuePair(var25, 50.0d, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setSubVector(2, var25);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.optimization.OptimizationException var1 = new org.apache.commons.math.optimization.OptimizationException(var0);
    java.io.IOException var2 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var1);
    java.lang.Object[] var7 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var8 = new org.apache.commons.math.MathRuntimeException("hi!", var7);
    java.lang.NullPointerException var9 = org.apache.commons.math.MathRuntimeException.createNullPointerException("Maximal number of iterations ({0}) exceeded", var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException((java.lang.Throwable)var2, "Array2DRowRealMatrix{}", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    java.lang.String var4 = var1.toString();
    org.apache.commons.math.linear.RealVector var5 = var1.mapAcosToSelf();
    org.apache.commons.math.linear.RealVector var6 = var1.mapSinhToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(3.9066992099956157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var8 = var1.mapMultiply(1.0d);
    org.apache.commons.math.optimization.linear.Relationship var9 = null;
    org.apache.commons.math.optimization.linear.LinearConstraint var11 = new org.apache.commons.math.optimization.linear.LinearConstraint(var8, var9, (-1.0d));
    org.apache.commons.math.linear.RealVector var12 = var11.getCoefficients();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapLog1p();
    org.apache.commons.math.linear.RealVector var5 = var1.mapMultiply(0.5430806348152439d);
    org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7, var9);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCoshToSelf();
    java.lang.String var14 = var12.toString();
    org.apache.commons.math.linear.RealVector var16 = var12.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var17 = var12.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var12, false);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var21, var23);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var29 = var28.mapCosToSelf();
    double var30 = var21.dotProduct(var29);
    org.apache.commons.math.linear.ArrayRealVector var31 = var19.append(var21);
    org.apache.commons.math.linear.RealVector var32 = var21.mapSqrt();
    org.apache.commons.math.linear.RealVector var33 = var21.mapTanhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var34 = var1.add(var21);
    org.apache.commons.math.linear.RealVector var35 = var34.mapSignum();
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var39 = var38.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var40 = var38.mapAsin();
    org.apache.commons.math.linear.RealVector var41 = var38.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var43 = null;
    org.apache.commons.math.linear.ArrayRealVector var45 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var47 = new org.apache.commons.math.optimization.linear.LinearConstraint(var41, 363.7393755555636d, var43, (org.apache.commons.math.linear.RealVector)var45, 10.0d);
    org.apache.commons.math.linear.RealVector var48 = var45.copy();
    org.apache.commons.math.linear.ArrayRealVector var50 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var51 = var50.getData();
    org.apache.commons.math.linear.ArrayRealVector var52 = new org.apache.commons.math.linear.ArrayRealVector(var51);
    org.apache.commons.math.linear.RealVector var53 = var52.mapLog1pToSelf();
    double var54 = var45.getDistance(var52);
    var34.setSubVector(0, (org.apache.commons.math.linear.RealVector)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "{1.54}"+ "'", var14.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var1.mapRint();
    org.apache.commons.math.linear.RealVector var8 = var1.mapExpm1();
    org.apache.commons.math.linear.RealVector var10 = var1.mapPow(0.9957901442164848d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var13 = var12.getData();
    double[] var14 = var12.getData();
    org.apache.commons.math.linear.RealVector var15 = var12.mapAtanToSelf();
    int var16 = var12.getDimension();
    org.apache.commons.math.linear.RealVector var17 = var12.mapLog10ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var18 = var1.ebeMultiply(var12);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    org.apache.commons.math.linear.RealVector var12 = var8.mapPowToSelf(20.0d);
    org.apache.commons.math.linear.RealVector var14 = var8.mapAddToSelf(100.0d);
    org.apache.commons.math.linear.RealVector var16 = var8.mapSubtractToSelf(9.425947759839367E159d);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var19 = var18.getData();
    double[] var20 = var18.getData();
    java.lang.Double[] var22 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var22);
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(var22);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var22);
    org.apache.commons.math.linear.ArrayRealVector var26 = var18.append(var25);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var8, var25);
    java.lang.Double[] var29 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var29);
    java.lang.Double[] var32 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var32);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var37 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var39 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var37, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(var35, var37);
    org.apache.commons.math.linear.RealVector var41 = var33.subtract(var37);
    boolean var42 = var30.equals((java.lang.Object)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var43 = var8.ebeMultiply(var37);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 2, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapAsin();
    org.apache.commons.math.linear.RealVector var8 = var5.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var10 = null;
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var14 = new org.apache.commons.math.optimization.linear.LinearConstraint(var8, 363.7393755555636d, var10, (org.apache.commons.math.linear.RealVector)var12, 10.0d);
    double var15 = var1.getL1Distance(var12);
    java.lang.Double[] var17 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var27 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var25, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var23, var25);
    org.apache.commons.math.linear.RealVector var29 = var21.subtract(var25);
    boolean var30 = var18.equals((java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var31 = var12.ebeMultiply(var25);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(3.9066992099956157d, 5981.260539780036d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.9957901442164848d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4978950721082424d);

  }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
//     double[][] var17 = new double[][] { var12};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
//     double var20 = var19.getFrobeniusNorm();
//     var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
//     org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
//     int var23 = var19.getRowDimension();
//     double[][] var24 = var19.getData();
//     org.apache.commons.math.linear.Array2DRowRealMatrix var26 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, false);
//     double[][] var27 = var26.getDataRef();
//     int var28 = var26.getColumnDimension();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var29 = null;
//     double var30 = var26.walkInColumnOrder(var29);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0d), 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }
// 
// 
//     int[] var0 = null;
//     int[] var1 = new int[] { };
//     int[] var2 = new int[] { };
//     int var3 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var2);
//     int[] var4 = new int[] { };
//     int[] var5 = new int[] { };
//     int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var5);
//     double var7 = org.apache.commons.math.util.MathUtils.distance(var1, var4);
//     int[] var8 = new int[] { };
//     int[] var9 = new int[] { };
//     int var10 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var9);
//     int[] var11 = new int[] { };
//     int[] var12 = new int[] { };
//     int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var12);
//     int[] var14 = new int[] { };
//     int[] var15 = new int[] { };
//     int var16 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var15);
//     double var17 = org.apache.commons.math.util.MathUtils.distance(var11, var14);
//     int[] var18 = new int[] { };
//     int[] var19 = new int[] { };
//     int var20 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var19);
//     int var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var18);
//     double var22 = org.apache.commons.math.util.MathUtils.distance(var8, var14);
//     int var23 = org.apache.commons.math.util.MathUtils.distance1(var4, var8);
//     int var24 = org.apache.commons.math.util.MathUtils.distance1(var0, var4);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    org.apache.commons.math.linear.RealMatrix var10 = var8.transpose();
    int var11 = var8.getColumnDimension();
    double[] var13 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var13, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var17 = new org.apache.commons.math.optimization.RealPointValuePair(var13, 0.0d);
    double[][] var18 = new double[][] { var13};
    org.apache.commons.math.linear.Array2DRowRealMatrix var20 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var18, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var21 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var18);
    org.apache.commons.math.linear.RealMatrix var22 = var8.preMultiply((org.apache.commons.math.linear.RealMatrix)var21);
    double[] var26 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var27 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var29, var31);
    double[] var35 = var27.operate(var31);
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var44 = var42.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var45 = var42.mapRintToSelf();
    org.apache.commons.math.linear.RealVector var47 = var42.mapSubtractToSelf(0.5430806348152439d);
    double[] var48 = var42.getData();
    boolean var49 = org.apache.commons.math.util.MathUtils.equals(var35, var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setColumn(1, var35);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertTrue(var49 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    java.lang.String var4 = var1.toString();
    org.apache.commons.math.linear.RealVector var6 = var1.mapSubtractToSelf(1.3440585709080678E43d);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var10 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var10, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var8, var10);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var10, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var10, true);
    int var19 = var18.getDimension();
    java.lang.Double[] var21 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var22);
    org.apache.commons.math.linear.RealVector var25 = var18.add((org.apache.commons.math.linear.RealVector)var24);
    java.lang.Double[] var27 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var27);
    org.apache.commons.math.linear.ArrayRealVector var29 = var24.projection(var28);
    org.apache.commons.math.linear.RealVector var30 = var29.mapSinh();
    org.apache.commons.math.linear.RealVector var31 = var29.mapLog10ToSelf();
    org.apache.commons.math.linear.RealVector var32 = var29.mapAcosToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var33 = var1.getDistance(var32);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    java.lang.Double[] var11 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var11);
    org.apache.commons.math.linear.RealVector var13 = var12.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var12);
    boolean var15 = var6.equals((java.lang.Object)var12);
    org.apache.commons.math.linear.RealVector var16 = var6.mapExpm1();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(2.302585092994046d);
    int var2 = var1.getIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    double var4 = var0.getTrace();
    boolean var5 = var0.isSingular();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    double[] var8 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var8, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var12 = new org.apache.commons.math.optimization.RealPointValuePair(var8, 0.0d);
    double[][] var13 = new double[][] { var8};
    org.apache.commons.math.linear.Array2DRowRealMatrix var15 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var13, true);
    double var16 = var15.getFrobeniusNorm();
    double[] var19 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var19, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var23 = new org.apache.commons.math.optimization.RealPointValuePair(var19, 0.0d);
    double[][] var24 = new double[][] { var19};
    org.apache.commons.math.linear.Array2DRowRealMatrix var26 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, true);
    double var27 = var26.getFrobeniusNorm();
    var15.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var26);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var34 = new org.apache.commons.math.optimization.RealPointValuePair(var30, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var37 = new org.apache.commons.math.optimization.RealPointValuePair(var30, 50.0d, true);
    double[] var38 = var26.operate(var30);
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var40 = var1.ebeMultiply(var30);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10099L, (-10000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
//     org.apache.commons.math.linear.RealVector var5 = var1.mapUlp();
//     org.apache.commons.math.linear.RealVector var6 = var1.mapRint();
//     org.apache.commons.math.linear.RealVector var8 = var1.mapAddToSelf(1.3440585709080678E43d);
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
//     org.apache.commons.math.linear.RealVector var16 = var15.mapCoshToSelf();
//     java.lang.String var17 = var15.toString();
//     org.apache.commons.math.linear.RealVector var19 = var15.mapAddToSelf(10.0d);
//     org.apache.commons.math.linear.RealVector var20 = var15.mapLog10();
//     org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(var15, false);
//     org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var26 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(var24, var26);
//     org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var32 = var31.mapCosToSelf();
//     double var33 = var24.dotProduct(var32);
//     org.apache.commons.math.linear.ArrayRealVector var34 = var22.append(var24);
//     org.apache.commons.math.linear.RealVector var35 = var24.mapSqrt();
//     org.apache.commons.math.linear.RealVector var36 = var24.mapLog1p();
//     double var37 = var1.dotProduct(var24);
//     org.apache.commons.math.linear.RealVector var38 = null;
//     org.apache.commons.math.linear.RealVector var39 = var1.ebeDivide(var38);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(10000L, (-1L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var28, var30);
    org.apache.commons.math.linear.RealVector var34 = var26.subtract(var30);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30);
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    java.lang.String var44 = var42.toString();
    org.apache.commons.math.linear.RealVector var45 = var42.mapRint();
    org.apache.commons.math.linear.RealVector var46 = var42.mapAbsToSelf();
    boolean var47 = var42.isInfinite();
    org.apache.commons.math.linear.RealVector var49 = var42.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var50 = var42.mapCeil();
    double var51 = var35.getDistance(var42);
    org.apache.commons.math.linear.ArrayRealVector var52 = var22.add(var42);
    double var54 = var22.getEntry(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "{1.54}"+ "'", var44.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 3.9066992099956157d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    java.lang.String var12 = var1.toString();
    org.apache.commons.math.linear.RealVector var13 = var1.mapAsinToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.RealMatrix var12 = var3.transpose();
    java.lang.String var13 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.luDecompose();
      fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Array2DRowRealMatrix{{0.0},{-1.0}}"+ "'", var13.equals("Array2DRowRealMatrix{{0.0},{-1.0}}"));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    java.lang.String var12 = var1.toString();
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction((org.apache.commons.math.linear.RealVector)var1, 0.03933967394071772d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = var16.getData();
    org.apache.commons.math.linear.RealVector var18 = var16.mapSignum();
    double[] var19 = var16.toArray();
    int var20 = org.apache.commons.math.util.MathUtils.hash(var19);
    org.apache.commons.math.linear.RealVector var21 = var1.ebeDivide(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
    org.apache.commons.math.linear.RealVector var16 = var12.mapCosh();
    org.apache.commons.math.linear.RealVector var17 = var12.mapSinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var6 = new org.apache.commons.math.optimization.RealPointValuePair(var2, 0.0d);
    double[][] var7 = new double[][] { var2};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    java.lang.IllegalArgumentException var11 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", (java.lang.Object[])var7);
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    int var13 = var12.getColumnDimension();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var19 = var12.walkInRowOrder(var14, (-100), (-71876953), (-1), 1010);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    java.lang.String var4 = org.apache.commons.math.linear.RealVectorFormat.formatRealVector(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }


    org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
    java.lang.String var1 = var0.getSeparator();
    org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var5 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var5, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(var3, var5);
    org.apache.commons.math.linear.RealVector var9 = var8.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var10 = var8.mapAtanToSelf();
    java.text.AttributedCharacterIterator var11 = var0.formatToCharacterIterator((java.lang.Object)var8);
    java.lang.String var12 = var0.getSeparator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var14 = var0.parse("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "; "+ "'", var1.equals("; "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "; "+ "'", var12.equals("; "));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRintToSelf();
    org.apache.commons.math.linear.RealVector var11 = var6.mapPowToSelf((-47.69741490700596d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1732.4286165853446d, 0.0d, 1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    double[] var3 = var1.getData();
    org.apache.commons.math.linear.RealVector var5 = var1.mapDivideToSelf(1.0007739047737187d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var27 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var30 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 50.0d, true);
    double[] var31 = var19.operate(var23);
    org.apache.commons.math.linear.ArrayRealVector var32 = new org.apache.commons.math.linear.ArrayRealVector(var23);
    org.apache.commons.math.linear.RealVector var33 = var32.mapSin();
    var32.set(2.4463520074491627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "", var3);
    java.lang.Object[] var8 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var9 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var8);
    org.apache.commons.math.MathRuntimeException var10 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var0, "hi!", var8);
    java.lang.Object[] var11 = var0.getArguments();
    java.lang.Throwable[] var12 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 1.3246090892520057d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(var1, 100, (-100));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException();
    boolean var5 = var3.equals((java.lang.Object)var4);
    org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7, var9);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var15 = var12.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var19 = var18.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var20 = var18.mapLog1p();
    var12.setSubVector(0, (org.apache.commons.math.linear.RealVector)var18);
    double[] var22 = var18.getData();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(var24, var26);
    org.apache.commons.math.optimization.RealPointValuePair var32 = new org.apache.commons.math.optimization.RealPointValuePair(var26, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var22, var26);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var26, false);
    double var36 = var3.getValue(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2.0d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var11 = var6.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var6, false);
    org.apache.commons.math.linear.RealVector var14 = var6.mapCosh();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var18 = var17.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var19 = var17.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var17, false);
    org.apache.commons.math.linear.RealVector var22 = var17.mapSinhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var25 = var24.getData();
    org.apache.commons.math.linear.RealVector var26 = var24.mapSignum();
    double[] var27 = var24.toArray();
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var30 = var29.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var31 = var29.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var29, false);
    org.apache.commons.math.linear.RealVector var34 = var33.mapLog1pToSelf();
    org.apache.commons.math.linear.RealVector var35 = var33.mapTan();
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var44 = var42.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var45 = var42.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var48 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var49 = var48.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var50 = var48.mapLog1p();
    var42.setSubVector(0, (org.apache.commons.math.linear.RealVector)var48);
    double[] var52 = var48.getData();
    org.apache.commons.math.linear.ArrayRealVector var54 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var56 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var58 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var56, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var59 = new org.apache.commons.math.linear.ArrayRealVector(var54, var56);
    org.apache.commons.math.optimization.RealPointValuePair var62 = new org.apache.commons.math.optimization.RealPointValuePair(var56, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var63 = new org.apache.commons.math.linear.ArrayRealVector(var52, var56);
    org.apache.commons.math.linear.ArrayRealVector var64 = new org.apache.commons.math.linear.ArrayRealVector(var52);
    double[] var65 = var64.toArray();
    org.apache.commons.math.linear.RealVector var66 = var33.add(var65);
    org.apache.commons.math.linear.ArrayRealVector var67 = new org.apache.commons.math.linear.ArrayRealVector(var24, var65);
    org.apache.commons.math.linear.RealVector var68 = var17.add(var65);
    org.apache.commons.math.linear.ArrayRealVector var70 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var71 = var70.getData();
    double[] var72 = var70.getData();
    double[] var73 = null;
    double var74 = org.apache.commons.math.util.MathUtils.distanceInf(var72, var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var65, var72);
    var6.setSubVector(0, var65);
    org.apache.commons.math.linear.RealVector var78 = var6.mapMultiplyToSelf(368.35449607240486d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var11 = var6.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var6, false);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var17, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(var15, var17);
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosToSelf();
    double var24 = var15.dotProduct(var23);
    org.apache.commons.math.linear.ArrayRealVector var25 = var13.append(var15);
    org.apache.commons.math.linear.RealVector var26 = var15.mapSqrt();
    org.apache.commons.math.linear.RealVector var27 = var15.mapCos();
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var30 = var29.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var31 = var29.mapAcos();
    java.lang.String var32 = var29.toString();
    org.apache.commons.math.linear.RealVector var33 = var29.mapSinh();
    org.apache.commons.math.linear.ArrayRealVector var34 = var15.ebeMultiply(var29);
    org.apache.commons.math.linear.RealVector var35 = var34.mapCeil();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "{}"+ "'", var32.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var2);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    double[] var11 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var11);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var14, var16);
    double[] var20 = var12.operate(var16);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16);
    org.apache.commons.math.optimization.linear.Relationship var23 = null;
    double[] var26 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var27 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var29, var31);
    double[] var35 = var27.operate(var31);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31);
    org.apache.commons.math.optimization.linear.LinearConstraint var38 = new org.apache.commons.math.optimization.linear.LinearConstraint(var16, 50.0d, var23, var31, 2.302585092994046d);
    double var39 = var8.getValue(var31);
    double var40 = var2.getL1Distance(var31);
    org.apache.commons.math.linear.RealVector var41 = var2.mapAsin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2.9066992099956157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    org.apache.commons.math.linear.RealVector var4 = var1.mapSqrtToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapLog1p();
    double[] var4 = var1.toArray();
    org.apache.commons.math.linear.RealVector var6 = var1.mapPow(1.8219365641849925d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    java.lang.String var12 = var1.toString();
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction((org.apache.commons.math.linear.RealVector)var1, 0.03933967394071772d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var18, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16, var18);
    org.apache.commons.math.linear.RealVector var22 = var21.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var23 = var21.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var24 = var21.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var28 = var27.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var29 = var27.mapLog1p();
    var21.setSubVector(0, (org.apache.commons.math.linear.RealVector)var27);
    double[] var31 = var27.getData();
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var35 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var37 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var35, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var33, var35);
    org.apache.commons.math.optimization.RealPointValuePair var41 = new org.apache.commons.math.optimization.RealPointValuePair(var35, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var31, var35);
    org.apache.commons.math.linear.ArrayRealVector var43 = new org.apache.commons.math.linear.ArrayRealVector(var31);
    double[] var45 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var47 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var45, 1.0d);
    double[] var50 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var51 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var50);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var55 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var57 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var55, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var53, var55);
    double[] var59 = var51.operate(var55);
    double var60 = org.apache.commons.math.util.MathUtils.distance1(var45, var55);
    double var61 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var55);
    org.apache.commons.math.linear.ArrayRealVector var62 = new org.apache.commons.math.linear.ArrayRealVector(var55);
    org.apache.commons.math.linear.RealVector var64 = var62.append(0.0d);
    org.apache.commons.math.linear.RealVector var65 = var62.mapLog10();
    boolean var66 = var14.equals((java.lang.Object)var62);
    double[] var69 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var70 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var69);
    org.apache.commons.math.linear.ArrayRealVector var72 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var74 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var76 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var74, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var77 = new org.apache.commons.math.linear.ArrayRealVector(var72, var74);
    double[] var78 = var70.operate(var74);
    org.apache.commons.math.linear.ArrayRealVector var80 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var82 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var84 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var82, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var85 = new org.apache.commons.math.linear.ArrayRealVector(var80, var82);
    org.apache.commons.math.linear.ArrayRealVector var86 = new org.apache.commons.math.linear.ArrayRealVector(var78, var82);
    boolean var87 = var14.equals((java.lang.Object)var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double var10 = var8.getNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var27 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 0.0d);
    double[][] var28 = new double[][] { var23};
    org.apache.commons.math.linear.Array2DRowRealMatrix var30 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var28, true);
    double var31 = var30.getFrobeniusNorm();
    var19.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var30);
    org.apache.commons.math.linear.RealMatrix var33 = var30.inverse();
    int var34 = var30.getRowDimension();
    double[][] var35 = var30.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var37 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var35, false);
    var37.multiplyEntry(0, 0, 0.03933967394071772d);
    org.apache.commons.math.linear.Array2DRowRealMatrix var42 = var8.subtract(var37);
    double[] var44 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var46 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var44, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var48 = new org.apache.commons.math.optimization.RealPointValuePair(var44, 0.0d);
    double[][] var49 = new double[][] { var44};
    org.apache.commons.math.linear.Array2DRowRealMatrix var51 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var49, true);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var55 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var57 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var55, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var53, var55);
    org.apache.commons.math.linear.ArrayRealVector var60 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var62 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var64 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var62, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var65 = new org.apache.commons.math.linear.ArrayRealVector(var60, var62);
    double var66 = var65.getNorm();
    org.apache.commons.math.linear.RealMatrix var67 = var58.outerProduct(var65);
    org.apache.commons.math.linear.RealMatrix var68 = var51.solve(var67);
    org.apache.commons.math.linear.Array2DRowRealMatrix var69 = var37.multiply(var51);
    org.apache.commons.math.linear.RealMatrix var71 = var51.getColumnMatrix(0);
    boolean var72 = var51.isSquare();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 1073741824);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 101);
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var4, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var1.mapRint();
    org.apache.commons.math.linear.RealVector var8 = var1.mapExpm1();
    org.apache.commons.math.linear.RealVector var10 = var1.mapDivideToSelf(0.0d);
    java.lang.String var11 = org.apache.commons.math.linear.RealVectorFormat.formatRealVector((org.apache.commons.math.linear.RealVector)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "{}"+ "'", var11.equals("{}"));

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapLog10();
    org.apache.commons.math.linear.RealVector var3 = var1.mapExpm1ToSelf();
    org.apache.commons.math.linear.RealVector var4 = var1.mapExpm1();
    org.apache.commons.math.linear.RealVector var5 = var1.mapLog1p();
    org.apache.commons.math.linear.RealVector var7 = var1.mapDivideToSelf(1732.4286165853446d);
    
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

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    java.lang.Object[] var5 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var6 = new org.apache.commons.math.MathRuntimeException("hi!", var5);
    java.lang.NullPointerException var7 = org.apache.commons.math.MathRuntimeException.createNullPointerException("hi!", var5);
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("; ", var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.ArithmeticException var9 = org.apache.commons.math.MathRuntimeException.createArithmeticException("Array2DRowRealMatrix{}", var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException((-1694235892));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(2.4258259770489514E8d);
    var1.setMaxIterations(10);
    int var4 = var1.getIterations();
    var1.setMaxIterations(0);
    int var7 = var1.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapSinhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var5 = var4.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var6 = var4.mapAcos();
    java.lang.String var7 = var4.toString();
    org.apache.commons.math.linear.RealVector var8 = var4.mapSignumToSelf();
    org.apache.commons.math.linear.RealVector var9 = var4.mapAsinToSelf();
    var4.set((-4.9E-324d));
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var1, var4);
    org.apache.commons.math.optimization.linear.Relationship var14 = null;
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var18, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16, var18);
    org.apache.commons.math.linear.RealVector var22 = var21.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var23 = var21.mapAtanToSelf();
    double var24 = var21.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.LinearConstraint var26 = new org.apache.commons.math.optimization.linear.LinearConstraint((org.apache.commons.math.linear.RealVector)var12, 1.0007739047737187d, var14, (org.apache.commons.math.linear.RealVector)var21, (-0.26548245743668986d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.9957901442164848d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
    org.apache.commons.math.linear.RealVector var16 = var12.mapCosh();
    org.apache.commons.math.linear.RealVector var17 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var18 = var12.mapUlp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    org.apache.commons.math.linear.RealVector var12 = var1.mapInvToSelf();
    double var13 = var1.getLInfNorm();
    org.apache.commons.math.linear.RealVector var14 = var1.mapCbrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
//     double[][] var17 = new double[][] { var12};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
//     double var20 = var19.getFrobeniusNorm();
//     var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
//     org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
//     double[] var24 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var28 = new org.apache.commons.math.optimization.RealPointValuePair(var24, 0.0d);
//     double[][] var29 = new double[][] { var24};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var31 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var29, true);
//     double var32 = var31.getFrobeniusNorm();
//     double[] var35 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var37 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var35, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var39 = new org.apache.commons.math.optimization.RealPointValuePair(var35, 0.0d);
//     double[][] var40 = new double[][] { var35};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var42 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var40, true);
//     double var43 = var42.getFrobeniusNorm();
//     var31.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var42);
//     org.apache.commons.math.linear.RealMatrix var45 = var42.inverse();
//     int var46 = var42.getRowDimension();
//     double[][] var47 = var42.getData();
//     org.apache.commons.math.linear.RealMatrix var48 = var8.solve((org.apache.commons.math.linear.RealMatrix)var42);
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var49 = null;
//     double var50 = var42.walkInRowOrder(var49);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.RealMatrix var9 = var8.copy();
    boolean var10 = var8.isSingular();
    var8.addToEntry(0, 0, 11.543080634815244d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var18, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16, var18);
    org.apache.commons.math.linear.RealVector var22 = var21.mapCoshToSelf();
    java.lang.String var23 = var21.toString();
    org.apache.commons.math.linear.RealVector var25 = var21.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var26 = var21.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var21, false);
    org.apache.commons.math.linear.RealVector var30 = var28.mapPow(10.0d);
    org.apache.commons.math.linear.RealVector var31 = var8.operate(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "{1.54}"+ "'", var23.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    int var4 = var3.getRowDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-10100L), 3629810L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.copy();
    org.apache.commons.math.optimization.linear.Relationship var4 = null;
    org.apache.commons.math.optimization.linear.LinearConstraint var6 = new org.apache.commons.math.optimization.linear.LinearConstraint(var3, var4, 10.0d);
    double var7 = var6.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.7403039210812912d), (-336392980));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-71876953), 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1660759607);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }
// 
// 
//     double[] var2 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var7 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
//     double[] var11 = var3.operate(var7);
//     org.apache.commons.math.optimization.RealPointValuePair var14 = new org.apache.commons.math.optimization.RealPointValuePair(var7, (-0.7d), false);
//     org.apache.commons.math.optimization.RealPointValuePair var17 = new org.apache.commons.math.optimization.RealPointValuePair(var7, 0.0d, true);
//     double[] var18 = null;
//     double var19 = org.apache.commons.math.util.MathUtils.distance1(var7, var18);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
    int var23 = var19.getRowDimension();
    double var24 = var19.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var27 = var19.createMatrix(1073741824, 10);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.4463520074491627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.729770285637698d);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
//     double[][] var17 = new double[][] { var12};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
//     double var20 = var19.getFrobeniusNorm();
//     var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
//     org.apache.commons.math.linear.RealMatrix var22 = var8.copy();
//     int[] var23 = new int[] { };
//     int[] var24 = new int[] { };
//     int var25 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var24);
//     int[] var26 = new int[] { };
//     int[] var27 = new int[] { };
//     int var28 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var27);
//     double var29 = org.apache.commons.math.util.MathUtils.distance(var23, var26);
//     int[] var30 = new int[] { };
//     int[] var31 = new int[] { };
//     int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var31);
//     int[] var33 = new int[] { };
//     int[] var34 = new int[] { };
//     int var35 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var34);
//     int[] var36 = new int[] { };
//     int[] var37 = new int[] { };
//     int var38 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var37);
//     double var39 = org.apache.commons.math.util.MathUtils.distance(var33, var36);
//     int[] var40 = new int[] { };
//     int[] var41 = new int[] { };
//     int var42 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var41);
//     int var43 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var40);
//     double var44 = org.apache.commons.math.util.MathUtils.distance(var30, var36);
//     int var45 = org.apache.commons.math.util.MathUtils.distance1(var26, var30);
//     int[] var46 = new int[] { };
//     int[] var47 = new int[] { };
//     int var48 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var47);
//     int[] var50 = new int[] { 0};
//     int var51 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var50);
//     int[] var52 = null;
//     int var53 = org.apache.commons.math.util.MathUtils.distance1(var46, var52);
//     org.apache.commons.math.linear.RealMatrix var54 = var8.getSubMatrix(var26, var52);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var8 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5, "", var8);
    java.lang.Object[] var13 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var14 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var13);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var5, "hi!", var13);
    org.apache.commons.math.MathException var16 = new org.apache.commons.math.MathException("}", var13);
    org.apache.commons.math.optimization.OptimizationException var17 = new org.apache.commons.math.optimization.OptimizationException("", var13);
    java.io.EOFException var18 = org.apache.commons.math.MathRuntimeException.createEOFException("org.apache.commons.math.ConvergenceException: Convergence failed", var13);
    java.lang.IllegalStateException var19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("{1}", var13);
    org.apache.commons.math.optimization.OptimizationException var20 = new org.apache.commons.math.optimization.OptimizationException("Maximal number of iterations ({0}) exceeded", var13);
    org.apache.commons.math.linear.NonSquareMatrixException var24 = new org.apache.commons.math.linear.NonSquareMatrixException((-336392981), 1073741824);
    java.lang.Object[] var25 = var24.getArguments();
    java.lang.Object[] var26 = var24.getArguments();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.ConvergenceException var27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, "Array2DRowRealMatrix{{1.0}}", var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var4 = var3.mapFloorToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-0.7d), 0.7853981633974483d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.7d));

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var3 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var2);
    java.lang.Object[] var6 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var7 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3, "", var6);
    org.apache.commons.math.optimization.OptimizationException var8 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var7);
    java.lang.Object[] var9 = var7.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException((java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-0.7403039210812912d), 2.4463520074491627d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var7 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 0.0d);
    double[][] var8 = new double[][] { var3};
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var8, true);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var21 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var23 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var21, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(var19, var21);
    double var25 = var24.getNorm();
    org.apache.commons.math.linear.RealMatrix var26 = var17.outerProduct(var24);
    org.apache.commons.math.linear.RealMatrix var27 = var10.solve(var26);
    double[][] var28 = var10.getDataRef();
    org.apache.commons.math.linear.MatrixIndexException var29 = new org.apache.commons.math.linear.MatrixIndexException("}", (java.lang.Object[])var28);
    java.util.ConcurrentModificationException var30 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("{1}", (java.lang.Object[])var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var11 = var6.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13, var15);
    org.apache.commons.math.optimization.RealPointValuePair var21 = new org.apache.commons.math.optimization.RealPointValuePair(var15, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var15, true);
    int var24 = var23.getDimension();
    java.lang.Double[] var26 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var26);
    org.apache.commons.math.linear.RealVector var28 = var27.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var27);
    org.apache.commons.math.linear.RealVector var30 = var23.add((org.apache.commons.math.linear.RealVector)var29);
    java.lang.Double[] var32 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var32);
    org.apache.commons.math.linear.ArrayRealVector var34 = var29.projection(var33);
    org.apache.commons.math.linear.RealVector var35 = var34.mapCosh();
    java.lang.Double[] var37 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var37);
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var42 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var44 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var42, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var45 = new org.apache.commons.math.linear.ArrayRealVector(var40, var42);
    org.apache.commons.math.linear.RealVector var46 = var38.subtract(var42);
    org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(var42);
    org.apache.commons.math.linear.ArrayRealVector var49 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var51 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var53 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var51, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var54 = new org.apache.commons.math.linear.ArrayRealVector(var49, var51);
    org.apache.commons.math.linear.RealVector var55 = var54.mapCoshToSelf();
    java.lang.String var56 = var54.toString();
    org.apache.commons.math.linear.RealVector var57 = var54.mapRint();
    org.apache.commons.math.linear.RealVector var58 = var54.mapAbsToSelf();
    boolean var59 = var54.isInfinite();
    org.apache.commons.math.linear.RealVector var61 = var54.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var62 = var54.mapCeil();
    double var63 = var47.getDistance(var54);
    org.apache.commons.math.linear.ArrayRealVector var64 = var34.add(var54);
    org.apache.commons.math.linear.RealMatrix var65 = var6.outerProduct(var64);
    org.apache.commons.math.linear.RealVector var66 = var6.mapCbrt();
    org.apache.commons.math.linear.RealVector var67 = var6.mapCeil();
    org.apache.commons.math.linear.ArrayRealVector var69 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var71 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var73 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var71, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var74 = new org.apache.commons.math.linear.ArrayRealVector(var69, var71);
    org.apache.commons.math.linear.RealVector var75 = var69.mapRint();
    org.apache.commons.math.linear.RealVector var76 = var69.mapExpm1();
    org.apache.commons.math.linear.RealVector var78 = var69.mapPow(0.9957901442164848d);
    boolean var79 = var6.equals((java.lang.Object)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "{1.54}"+ "'", var56.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var9 = var8.mapCosToSelf();
    double var10 = var1.dotProduct(var9);
    org.apache.commons.math.linear.RealVector var11 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var12 = var1.mapSqrtToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Double.NEGATIVE_INFINITY, 9.425947759839367E159d, 8.85125285761032d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapLog10();
    org.apache.commons.math.linear.RealVector var3 = var1.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var5, false);
    org.apache.commons.math.linear.RealVector var10 = var1.subtract((org.apache.commons.math.linear.RealVector)var9);
    org.apache.commons.math.linear.RealVector var11 = var9.mapTanhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13, var15);
    org.apache.commons.math.linear.RealVector var19 = var18.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var20 = var18.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var21 = var18.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var25 = var24.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var26 = var24.mapLog1p();
    var18.setSubVector(0, (org.apache.commons.math.linear.RealVector)var24);
    double[] var28 = var24.getData();
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var32 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var34 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var32, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30, var32);
    org.apache.commons.math.optimization.RealPointValuePair var38 = new org.apache.commons.math.optimization.RealPointValuePair(var32, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(var28, var32);
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(var28);
    double[] var42 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var44 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var42, 1.0d);
    double[] var47 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var48 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var47);
    org.apache.commons.math.linear.ArrayRealVector var50 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var52 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var54 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var52, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var55 = new org.apache.commons.math.linear.ArrayRealVector(var50, var52);
    double[] var56 = var48.operate(var52);
    double var57 = org.apache.commons.math.util.MathUtils.distance1(var42, var52);
    double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var52);
    double var59 = var9.getL1Distance(var28);
    org.apache.commons.math.linear.RealVector var61 = var9.mapSubtractToSelf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }
// 
// 
//     org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(50.0d);
//     var1.setMaxIterations(0);
//     int var4 = var1.getMaxIterations();
//     var1.setMaxIterations(0);
//     int var7 = var1.getMaxIterations();
//     org.apache.commons.math.optimization.RealPointValuePair var8 = var1.doOptimize();
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    org.apache.commons.math.linear.RealVector var19 = var11.mapFloorToSelf();
    org.apache.commons.math.linear.RealVector var20 = var11.mapTanToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var3 = var2.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var4 = var2.mapAsin();
//     org.apache.commons.math.linear.RealVector var5 = var2.mapCbrt();
//     org.apache.commons.math.linear.RealVector var6 = var2.mapUlp();
//     org.apache.commons.math.linear.RealVector var7 = var2.mapTanToSelf();
//     org.apache.commons.math.linear.RealVector var8 = var2.mapTanhToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var0, var2);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var19 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var19, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(var17, var19);
    double var23 = var22.getNorm();
    org.apache.commons.math.linear.RealMatrix var24 = var15.outerProduct(var22);
    org.apache.commons.math.linear.RealMatrix var25 = var8.solve(var24);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var31 = var8.walkInRowOrder(var26, 100, (-336392980), (-100), 0);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var1.mapRint();
    org.apache.commons.math.linear.RealVector var8 = var1.mapExpm1();
    org.apache.commons.math.linear.RealVector var10 = var1.mapPow(0.9957901442164848d);
    org.apache.commons.math.linear.RealVector var12 = var1.mapSubtractToSelf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    java.lang.Object[] var7 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var8 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var7);
    java.lang.Object[] var11 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var8, "", var11);
    java.text.ParseException var13 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var11);
    org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var11);
    org.apache.commons.math.optimization.OptimizationException var15 = new org.apache.commons.math.optimization.OptimizationException("", var11);
    org.apache.commons.math.linear.InvalidMatrixException var16 = new org.apache.commons.math.linear.InvalidMatrixException("", var11);
    org.apache.commons.math.optimization.OptimizationException var17 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var16);
    org.apache.commons.math.ConvergenceException var18 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.optimization.RealPointValuePair var3 = new org.apache.commons.math.optimization.RealPointValuePair(var0, 5.0706024009129176E30d, true);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
    org.apache.commons.math.linear.RealVector var10 = var2.subtract(var6);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13, var15);
    org.apache.commons.math.optimization.RealPointValuePair var21 = new org.apache.commons.math.optimization.RealPointValuePair(var15, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var15, true);
    int var24 = var23.getDimension();
    java.lang.Double[] var26 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var26);
    org.apache.commons.math.linear.RealVector var28 = var27.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var27);
    org.apache.commons.math.linear.RealVector var30 = var23.add((org.apache.commons.math.linear.RealVector)var29);
    java.lang.Double[] var32 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var32);
    org.apache.commons.math.linear.ArrayRealVector var34 = var29.projection(var33);
    org.apache.commons.math.linear.RealVector var35 = var34.mapSinh();
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var11, var34);
    org.apache.commons.math.linear.RealVector var37 = var11.mapCbrt();
    org.apache.commons.math.linear.RealVector var39 = var11.mapMultiply((-0.26548245743668986d));
    double var40 = var11.getLInfNorm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1.0d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    org.apache.commons.math.linear.NonSquareMatrixException var2 = new org.apache.commons.math.linear.NonSquareMatrixException(1660759607, 1073741824);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, 1010, 1660759607);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.sign(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(101, 1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1996750847));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
    org.apache.commons.math.linear.RealVector var16 = var12.mapCosh();
    org.apache.commons.math.linear.RealVector var17 = var12.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var20 = var19.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var21 = var19.mapAsin();
    org.apache.commons.math.linear.RealVector var22 = var19.mapCbrt();
    org.apache.commons.math.linear.RealVector var23 = var19.mapUlp();
    org.apache.commons.math.linear.RealVector var24 = var19.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var25 = var12.subtract(var19);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var28 = var27.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var29 = var27.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var30 = var12.ebeMultiply(var27);
    org.apache.commons.math.linear.RealVector var31 = var30.mapInvToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var8 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var8, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6, var8);
    org.apache.commons.math.linear.RealVector var12 = var11.mapSignum();
    double[] var13 = var11.getDataRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumn(10, var13);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var1.mapRint();
    org.apache.commons.math.linear.RealVector var8 = var1.mapExpm1();
    double[] var11 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var11);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var14, var16);
    double[] var20 = var12.operate(var16);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16);
    org.apache.commons.math.optimization.linear.Relationship var23 = null;
    double[] var26 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var27 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var29, var31);
    double[] var35 = var27.operate(var31);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31);
    org.apache.commons.math.optimization.linear.LinearConstraint var38 = new org.apache.commons.math.optimization.linear.LinearConstraint(var16, 50.0d, var23, var31, 2.302585092994046d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var39 = var1.getL1Distance(var31);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 1073741824);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var13 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var13, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(var11, var13);
    org.apache.commons.math.linear.RealVector var17 = var16.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var18 = var16.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var19 = var16.mapUlp();
    org.apache.commons.math.linear.RealVector var20 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var21 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var22 = var6.ebeDivide(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var24 = var6.getEntry((-336392981));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    double[] var4 = var1.toArray();
    int var5 = org.apache.commons.math.util.MathUtils.hash(var4);
    org.apache.commons.math.optimization.RealPointValuePair var7 = new org.apache.commons.math.optimization.RealPointValuePair(var4, 1.9879091522531785E21d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    org.apache.commons.math.optimization.RealPointValuePair var17 = new org.apache.commons.math.optimization.RealPointValuePair(var11, 1.0d, true);
    double[] var18 = var17.getPointRef();
    boolean var19 = org.apache.commons.math.util.MathUtils.equals(var4, var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var3 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var2);
    java.lang.Object[] var6 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var7 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3, "", var6);
    java.lang.IllegalArgumentException var8 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var3);
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException((java.lang.Throwable)var3);
    java.lang.IllegalArgumentException var10 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    org.apache.commons.math.linear.InvalidMatrixException var1 = new org.apache.commons.math.linear.InvalidMatrixException((java.lang.Throwable)var0);
    java.lang.RuntimeException var2 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var0);
    java.lang.String var3 = var0.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Convergence failed"+ "'", var3.equals("Convergence failed"));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var4 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, "", var4);
    java.lang.Object[] var9 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var10 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var9);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1, "hi!", var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ConcurrentModificationException var12 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("Array2DRowRealMatrix{{0.0},{-1.0}}", var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    double[] var28 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var29 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var28);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var33 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var35 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var33, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31, var33);
    double[] var37 = var29.operate(var33);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var33);
    org.apache.commons.math.optimization.linear.Relationship var40 = null;
    double[] var43 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var44 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var43);
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var48 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var50 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var48, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var51 = new org.apache.commons.math.linear.ArrayRealVector(var46, var48);
    double[] var52 = var44.operate(var48);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(var48);
    org.apache.commons.math.optimization.linear.LinearConstraint var55 = new org.apache.commons.math.optimization.linear.LinearConstraint(var33, 50.0d, var40, var48, 2.302585092994046d);
    double var56 = var25.getValue(var48);
    org.apache.commons.math.linear.RealVector var57 = var25.getCoefficients();
    org.apache.commons.math.linear.RealVector var58 = var8.operate(var57);
    double[] var60 = var8.getRow(0);
    double[] var62 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var64 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var62, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var66 = new org.apache.commons.math.optimization.RealPointValuePair(var62, 0.0d);
    double[][] var67 = new double[][] { var62};
    org.apache.commons.math.linear.Array2DRowRealMatrix var69 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var67, true);
    org.apache.commons.math.linear.RealMatrix var70 = var69.copy();
    boolean var71 = var69.isSingular();
    org.apache.commons.math.linear.Array2DRowRealMatrix var72 = var8.subtract(var69);
    org.apache.commons.math.linear.RealMatrix var73 = var8.transpose();
    int var74 = var8.getRowDimension();
    org.apache.commons.math.linear.RealMatrix var76 = var8.scalarMultiply((-0.7d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.RealMatrix var9 = var8.copy();
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var15 = new org.apache.commons.math.optimization.RealPointValuePair(var11, 0.0d);
    double[][] var16 = new double[][] { var11};
    org.apache.commons.math.linear.Array2DRowRealMatrix var18 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var16, true);
    double var19 = var18.getFrobeniusNorm();
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var24 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var22, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var22, 0.0d);
    double[][] var27 = new double[][] { var22};
    org.apache.commons.math.linear.Array2DRowRealMatrix var29 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var27, true);
    double var30 = var29.getFrobeniusNorm();
    var18.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var29);
    org.apache.commons.math.linear.RealMatrix var32 = var18.transpose();
    double[] var34 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var36 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var34, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var38 = new org.apache.commons.math.optimization.RealPointValuePair(var34, 0.0d);
    double[][] var39 = new double[][] { var34};
    org.apache.commons.math.linear.Array2DRowRealMatrix var41 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var39, true);
    double var42 = var41.getFrobeniusNorm();
    double[] var45 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var47 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var45, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var49 = new org.apache.commons.math.optimization.RealPointValuePair(var45, 0.0d);
    double[][] var50 = new double[][] { var45};
    org.apache.commons.math.linear.Array2DRowRealMatrix var52 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var50, true);
    double var53 = var52.getFrobeniusNorm();
    var41.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var52);
    org.apache.commons.math.linear.RealMatrix var55 = var52.inverse();
    int var56 = var52.getRowDimension();
    double[][] var57 = var52.getData();
    org.apache.commons.math.linear.RealMatrix var58 = var18.solve((org.apache.commons.math.linear.RealMatrix)var52);
    org.apache.commons.math.linear.RealMatrix var59 = var8.preMultiply((org.apache.commons.math.linear.RealMatrix)var52);
    double var60 = var8.getTrace();
    int[] var61 = new int[] { };
    int[] var62 = new int[] { };
    int var63 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var62);
    int[] var64 = new int[] { };
    int[] var65 = new int[] { };
    int var66 = org.apache.commons.math.util.MathUtils.distanceInf(var64, var65);
    double var67 = org.apache.commons.math.util.MathUtils.distance(var61, var64);
    int[] var68 = new int[] { };
    int[] var69 = new int[] { };
    int var70 = org.apache.commons.math.util.MathUtils.distanceInf(var68, var69);
    int[] var71 = new int[] { };
    int[] var72 = new int[] { };
    int var73 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var72);
    int[] var74 = new int[] { };
    int[] var75 = new int[] { };
    int var76 = org.apache.commons.math.util.MathUtils.distanceInf(var74, var75);
    double var77 = org.apache.commons.math.util.MathUtils.distance(var71, var74);
    int[] var78 = new int[] { };
    int[] var79 = new int[] { };
    int var80 = org.apache.commons.math.util.MathUtils.distanceInf(var78, var79);
    int var81 = org.apache.commons.math.util.MathUtils.distanceInf(var74, var78);
    double var82 = org.apache.commons.math.util.MathUtils.distance(var68, var74);
    int var83 = org.apache.commons.math.util.MathUtils.distance1(var64, var68);
    int[] var84 = new int[] { };
    int[] var85 = new int[] { };
    int var86 = org.apache.commons.math.util.MathUtils.distanceInf(var84, var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var87 = var8.getSubMatrix(var68, var85);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    java.lang.String var4 = var0.toString();
    double var5 = var0.getDeterminant();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var7 = var0.getColumnMatrix((-100));
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Array2DRowRealMatrix{}"+ "'", var4.equals("Array2DRowRealMatrix{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAtan();
    org.apache.commons.math.linear.RealVector var11 = var6.mapCoshToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    org.apache.commons.math.linear.RealVector var11 = var8.mapExp();
    org.apache.commons.math.linear.RealVector var12 = var8.mapLog();
    org.apache.commons.math.linear.RealVector var13 = var8.mapSqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException();
//     boolean var5 = var3.equals((java.lang.Object)var4);
//     java.lang.Double[] var7 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(var7);
//     org.apache.commons.math.linear.RealVector var9 = var8.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var8);
//     org.apache.commons.math.linear.RealVector var11 = var8.mapAcosToSelf();
//     double var12 = var3.getValue((org.apache.commons.math.linear.RealVector)var8);
//     org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     boolean var15 = var3.equals((java.lang.Object)0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = new org.apache.commons.math.linear.RealVectorFormat();
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var3 = var2.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var4 = var2.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var2, false);
//     org.apache.commons.math.linear.RealVector var7 = var2.mapTan();
//     org.apache.commons.math.linear.RealVector var8 = var2.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var2, false);
//     org.apache.commons.math.linear.RealVector var12 = var2.mapMultiply((-1.0d));
//     org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var16 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var14, var16);
//     org.apache.commons.math.linear.RealVector var20 = var19.mapCoshToSelf();
//     org.apache.commons.math.linear.RealVector var21 = var19.mapAtanToSelf();
//     org.apache.commons.math.linear.RealVector var22 = var19.mapUlp();
//     org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var26 = var25.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var27 = var25.mapLog1p();
//     var19.setSubVector(0, (org.apache.commons.math.linear.RealVector)var25);
//     org.apache.commons.math.linear.RealVector var29 = var25.mapCosh();
//     org.apache.commons.math.linear.RealVector var30 = var25.mapExpm1();
//     org.apache.commons.math.linear.ArrayRealVector var32 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var33 = var32.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var34 = var32.mapAsin();
//     org.apache.commons.math.linear.RealVector var35 = var32.mapCbrt();
//     org.apache.commons.math.linear.RealVector var36 = var32.mapUlp();
//     org.apache.commons.math.linear.RealVector var37 = var32.mapRint();
//     org.apache.commons.math.linear.ArrayRealVector var38 = var25.subtract(var32);
//     org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var41 = var40.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var42 = var40.mapAcos();
//     org.apache.commons.math.linear.ArrayRealVector var43 = var25.ebeMultiply(var40);
//     org.apache.commons.math.linear.RealVector var44 = var40.mapSin();
//     double var45 = var2.getL1Distance(var40);
//     org.apache.commons.math.linear.RealVector var46 = var2.mapAtan();
//     java.text.AttributedCharacterIterator var47 = var0.formatToCharacterIterator((java.lang.Object)var2);
//     double[] var49 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var51 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var49, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var55 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var57 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var55, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var53, var55);
//     org.apache.commons.math.linear.RealVector var59 = var58.mapCoshToSelf();
//     java.lang.String var60 = var58.toString();
//     org.apache.commons.math.linear.RealVector var62 = var58.mapAddToSelf(10.0d);
//     org.apache.commons.math.linear.RealVector var63 = var58.mapLog10();
//     double var64 = var51.getValue((org.apache.commons.math.linear.RealVector)var58);
//     org.apache.commons.math.linear.ArrayRealVector var66 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var68 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var70 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var68, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var71 = new org.apache.commons.math.linear.ArrayRealVector(var66, var68);
//     org.apache.commons.math.linear.RealVector var72 = var71.mapCoshToSelf();
//     org.apache.commons.math.linear.RealVector var73 = var71.mapAtanToSelf();
//     org.apache.commons.math.linear.RealVector var74 = var71.mapUlp();
//     org.apache.commons.math.linear.ArrayRealVector var77 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var78 = var77.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var79 = var77.mapLog1p();
//     var71.setSubVector(0, (org.apache.commons.math.linear.RealVector)var77);
//     org.apache.commons.math.linear.RealVector var81 = var58.append((org.apache.commons.math.linear.RealVector)var77);
//     java.lang.StringBuffer var82 = null;
//     java.text.FieldPosition var83 = null;
//     java.lang.StringBuffer var84 = var0.format((org.apache.commons.math.linear.RealVector)var58, var82, var83);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapSinh();
    org.apache.commons.math.linear.RealVector var24 = var22.mapLog10ToSelf();
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
    double[] var31 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var32 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var31);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var36 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var38 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var36, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(var34, var36);
    double[] var40 = var32.operate(var36);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var26, var36);
    org.apache.commons.math.linear.RealVector var42 = var22.ebeMultiply(var26);
    org.apache.commons.math.linear.Array2DRowRealMatrix var43 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var43.multiplyEntry(100, (-1), 363.7393755555636d);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
    int var23 = var19.getRowDimension();
    double[][] var24 = var19.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var26 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, false);
    org.apache.commons.math.linear.Array2DRowRealMatrix var28 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var24, false);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var35 = new org.apache.commons.math.optimization.RealPointValuePair(var31, 0.0d);
    double[][] var36 = new double[][] { var31};
    org.apache.commons.math.linear.Array2DRowRealMatrix var38 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var36, true);
    double var39 = var38.getFrobeniusNorm();
    double[] var42 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var44 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var42, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var46 = new org.apache.commons.math.optimization.RealPointValuePair(var42, 0.0d);
    double[][] var47 = new double[][] { var42};
    org.apache.commons.math.linear.Array2DRowRealMatrix var49 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var47, true);
    double var50 = var49.getFrobeniusNorm();
    var38.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var49);
    org.apache.commons.math.linear.RealMatrix var52 = var49.inverse();
    double[] var54 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var56 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var54, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var58 = new org.apache.commons.math.optimization.RealPointValuePair(var54, 0.0d);
    double[][] var59 = new double[][] { var54};
    org.apache.commons.math.linear.Array2DRowRealMatrix var61 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var59, true);
    double var62 = var61.getFrobeniusNorm();
    double[] var65 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var67 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var65, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var69 = new org.apache.commons.math.optimization.RealPointValuePair(var65, 0.0d);
    double[][] var70 = new double[][] { var65};
    org.apache.commons.math.linear.Array2DRowRealMatrix var72 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var70, true);
    double var73 = var72.getFrobeniusNorm();
    var61.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var72);
    org.apache.commons.math.linear.RealMatrix var75 = var72.inverse();
    org.apache.commons.math.linear.RealMatrix var76 = var49.solve(var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var28.setColumnMatrix(1660759607, (org.apache.commons.math.linear.RealMatrix)var49);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.324609089252006d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.013310924178631d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    org.apache.commons.math.linear.RealVector var13 = var11.mapAcosToSelf();
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var17, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(var15, var17);
    org.apache.commons.math.linear.RealVector var21 = var20.mapCoshToSelf();
    java.lang.String var22 = var20.toString();
    org.apache.commons.math.linear.RealVector var24 = var20.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var25 = var20.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var20, false);
    org.apache.commons.math.linear.RealVector var28 = var11.ebeMultiply((org.apache.commons.math.linear.RealVector)var20);
    org.apache.commons.math.linear.RealVector var29 = var20.mapAtanToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "{1.54}"+ "'", var22.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }
// 
// 
//     java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
//     org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var2);
//     org.apache.commons.math.linear.ArrayRealVector var5 = null;
//     org.apache.commons.math.linear.ArrayRealVector var6 = var2.append(var5);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    java.lang.Double[] var11 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var11);
    org.apache.commons.math.linear.RealVector var13 = var12.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var12);
    boolean var15 = var6.equals((java.lang.Object)var12);
    org.apache.commons.math.linear.RealVector var17 = var6.mapSubtractToSelf(Double.POSITIVE_INFINITY);
    org.apache.commons.math.linear.RealVector var19 = var6.mapAdd(0.9957901442164848d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var21, var23);
    org.apache.commons.math.linear.RealVector var27 = var26.mapCoshToSelf();
    java.lang.String var28 = var26.toString();
    org.apache.commons.math.linear.RealVector var30 = var26.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var31 = var26.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var35 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var37 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var35, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var33, var35);
    org.apache.commons.math.optimization.RealPointValuePair var41 = new org.apache.commons.math.optimization.RealPointValuePair(var35, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var43 = new org.apache.commons.math.linear.ArrayRealVector(var35, true);
    int var44 = var43.getDimension();
    java.lang.Double[] var46 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(var46);
    org.apache.commons.math.linear.RealVector var48 = var47.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var49 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var47);
    org.apache.commons.math.linear.RealVector var50 = var43.add((org.apache.commons.math.linear.RealVector)var49);
    java.lang.Double[] var52 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(var52);
    org.apache.commons.math.linear.ArrayRealVector var54 = var49.projection(var53);
    org.apache.commons.math.linear.RealVector var55 = var54.mapCosh();
    java.lang.Double[] var57 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var57);
    org.apache.commons.math.linear.ArrayRealVector var60 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var62 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var64 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var62, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var65 = new org.apache.commons.math.linear.ArrayRealVector(var60, var62);
    org.apache.commons.math.linear.RealVector var66 = var58.subtract(var62);
    org.apache.commons.math.linear.ArrayRealVector var67 = new org.apache.commons.math.linear.ArrayRealVector(var62);
    org.apache.commons.math.linear.ArrayRealVector var69 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var71 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var73 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var71, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var74 = new org.apache.commons.math.linear.ArrayRealVector(var69, var71);
    org.apache.commons.math.linear.RealVector var75 = var74.mapCoshToSelf();
    java.lang.String var76 = var74.toString();
    org.apache.commons.math.linear.RealVector var77 = var74.mapRint();
    org.apache.commons.math.linear.RealVector var78 = var74.mapAbsToSelf();
    boolean var79 = var74.isInfinite();
    org.apache.commons.math.linear.RealVector var81 = var74.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var82 = var74.mapCeil();
    double var83 = var67.getDistance(var74);
    org.apache.commons.math.linear.ArrayRealVector var84 = var54.add(var74);
    org.apache.commons.math.linear.RealMatrix var85 = var26.outerProduct(var84);
    org.apache.commons.math.linear.RealVector var86 = var26.mapCbrt();
    org.apache.commons.math.linear.RealMatrix var87 = var6.outerProduct(var26);
    var26.set((-5.967152838277089d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "{1.54}"+ "'", var28.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "{1.54}"+ "'", var76.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
//     java.lang.String var1 = var0.getSeparator();
//     java.lang.Double[] var3 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(var3);
//     org.apache.commons.math.linear.RealVector var5 = var4.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var4);
//     org.apache.commons.math.linear.RealVector var7 = var4.mapExpToSelf();
//     java.text.AttributedCharacterIterator var8 = var0.formatToCharacterIterator((java.lang.Object)var4);
//     org.apache.commons.math.linear.RealVector var9 = null;
//     java.lang.StringBuffer var10 = null;
//     java.text.FieldPosition var11 = null;
//     java.lang.StringBuffer var12 = var0.format(var9, var10, var11);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var9 = var5.dotProduct((org.apache.commons.math.linear.RealVector)var8);
    boolean var10 = var5.isInfinite();
    boolean var11 = var5.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var14, var16);
    double var20 = var11.dotProduct(var16);
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var24 = var22.mapAsin();
    org.apache.commons.math.linear.RealVector var25 = var22.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var27 = null;
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var31 = new org.apache.commons.math.optimization.linear.LinearConstraint(var25, 363.7393755555636d, var27, (org.apache.commons.math.linear.RealVector)var29, 10.0d);
    org.apache.commons.math.linear.RealVector var32 = var29.copy();
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var35 = var34.getData();
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var35);
    org.apache.commons.math.linear.RealVector var37 = var36.mapLog1pToSelf();
    double var38 = var29.getDistance(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var39 = var11.subtract(var36);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var27 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var30 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 50.0d, true);
    double[] var31 = var19.operate(var23);
    boolean var32 = var19.isSingular();
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var37 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var39 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var37, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(var35, var37);
    org.apache.commons.math.linear.RealVector var41 = var40.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var42 = var40.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var43 = var40.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var47 = var46.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var48 = var46.mapLog1p();
    var40.setSubVector(0, (org.apache.commons.math.linear.RealVector)var46);
    double[] var50 = var46.getData();
    org.apache.commons.math.linear.ArrayRealVector var52 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var54 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var56 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var54, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var57 = new org.apache.commons.math.linear.ArrayRealVector(var52, var54);
    org.apache.commons.math.optimization.RealPointValuePair var60 = new org.apache.commons.math.optimization.RealPointValuePair(var54, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var61 = new org.apache.commons.math.linear.ArrayRealVector(var50, var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.setColumn(1079574528, var50);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapLog1p();
    org.apache.commons.math.linear.RealVector var5 = var1.mapMultiply(0.5430806348152439d);
    org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7, var9);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCoshToSelf();
    java.lang.String var14 = var12.toString();
    org.apache.commons.math.linear.RealVector var16 = var12.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var17 = var12.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var12, false);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var21, var23);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var29 = var28.mapCosToSelf();
    double var30 = var21.dotProduct(var29);
    org.apache.commons.math.linear.ArrayRealVector var31 = var19.append(var21);
    org.apache.commons.math.linear.RealVector var32 = var21.mapSqrt();
    org.apache.commons.math.linear.RealVector var33 = var21.mapTanhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var34 = var1.add(var21);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var37 = var36.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var38 = var36.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var40 = new org.apache.commons.math.linear.ArrayRealVector(var36, false);
    org.apache.commons.math.linear.RealVector var41 = var36.mapTan();
    org.apache.commons.math.linear.RealVector var42 = var36.mapLogToSelf();
    org.apache.commons.math.linear.RealVector var43 = var36.mapLogToSelf();
    double var44 = var21.getL1Distance((org.apache.commons.math.linear.RealVector)var36);
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var48 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var50 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var48, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var51 = new org.apache.commons.math.linear.ArrayRealVector(var46, var48);
    org.apache.commons.math.linear.RealVector var52 = var51.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var53 = var51.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var54 = var51.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var57 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var58 = var57.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var59 = var57.mapLog1p();
    var51.setSubVector(0, (org.apache.commons.math.linear.RealVector)var57);
    org.apache.commons.math.linear.RealVector var61 = var57.mapCosh();
    org.apache.commons.math.linear.RealVector var62 = var57.mapExpm1();
    double var63 = var36.dotProduct((org.apache.commons.math.linear.RealVector)var57);
    java.lang.String var64 = org.apache.commons.math.linear.RealVectorFormat.formatRealVector((org.apache.commons.math.linear.RealVector)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "{1.54}"+ "'", var14.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "{}"+ "'", var64.equals("{}"));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var28, var30);
    org.apache.commons.math.linear.RealVector var34 = var26.subtract(var30);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30);
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    java.lang.String var44 = var42.toString();
    org.apache.commons.math.linear.RealVector var45 = var42.mapRint();
    org.apache.commons.math.linear.RealVector var46 = var42.mapAbsToSelf();
    boolean var47 = var42.isInfinite();
    org.apache.commons.math.linear.RealVector var49 = var42.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var50 = var42.mapCeil();
    double var51 = var35.getDistance(var42);
    org.apache.commons.math.linear.ArrayRealVector var52 = var22.add(var42);
    org.apache.commons.math.linear.ArrayRealVector var54 = new org.apache.commons.math.linear.ArrayRealVector(var52, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "{1.54}"+ "'", var44.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapAbs();
    org.apache.commons.math.linear.RealVector var7 = var1.mapTanToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var28 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var30 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var28, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(var26, var28);
    org.apache.commons.math.linear.RealVector var32 = var26.mapRint();
    org.apache.commons.math.linear.RealVector var33 = var26.mapCoshToSelf();
    var22.setSubVector(0, var33);
    double[] var36 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var38 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var36, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var40 = new org.apache.commons.math.optimization.RealPointValuePair(var36, 0.0d);
    double[][] var41 = new double[][] { var36};
    org.apache.commons.math.linear.Array2DRowRealMatrix var43 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var41, true);
    double var44 = var43.getFrobeniusNorm();
    double[] var47 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var49 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var47, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var51 = new org.apache.commons.math.optimization.RealPointValuePair(var47, 0.0d);
    double[][] var52 = new double[][] { var47};
    org.apache.commons.math.linear.Array2DRowRealMatrix var54 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var52, true);
    double var55 = var54.getFrobeniusNorm();
    var43.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var54);
    double[] var58 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var60 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var58, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var62 = new org.apache.commons.math.optimization.RealPointValuePair(var58, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var65 = new org.apache.commons.math.optimization.RealPointValuePair(var58, 50.0d, true);
    double[] var66 = var54.operate(var58);
    org.apache.commons.math.linear.ArrayRealVector var67 = new org.apache.commons.math.linear.ArrayRealVector(var58);
    org.apache.commons.math.linear.RealMatrix var68 = var22.outerProduct((org.apache.commons.math.linear.RealVector)var67);
    org.apache.commons.math.linear.RealVector var69 = var67.mapTanhToSelf();
    org.apache.commons.math.linear.RealVector var70 = var67.mapCos();
    org.apache.commons.math.linear.RealVector var71 = var67.mapAtan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(2, 101);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }
// 
// 
//     double[] var2 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var7 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
//     double[] var11 = var3.operate(var7);
//     double var12 = var3.getFrobeniusNorm();
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var13 = null;
//     double var14 = var3.walkInRowOrder(var13);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapCbrtToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var6);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var11, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapSinh();
    org.apache.commons.math.linear.RealVector var24 = var22.mapLog10ToSelf();
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
    double[] var31 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var32 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var31);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var36 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var38 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var36, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(var34, var36);
    double[] var40 = var32.operate(var36);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var26, var36);
    org.apache.commons.math.linear.RealVector var42 = var22.ebeMultiply(var26);
    org.apache.commons.math.linear.Array2DRowRealMatrix var43 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    org.apache.commons.math.linear.Array2DRowRealMatrix var44 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var45 = var44.getRowDimension();
    int var46 = var44.getRowDimension();
    double var47 = var44.getNorm();
    java.lang.String var48 = var44.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var49 = var43.multiply(var44);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Array2DRowRealMatrix{}"+ "'", var48.equals("Array2DRowRealMatrix{}"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapLog10();
    org.apache.commons.math.linear.RealVector var4 = var1.mapDivideToSelf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    double[] var28 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var29 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var28);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var33 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var35 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var33, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31, var33);
    double[] var37 = var29.operate(var33);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var33);
    org.apache.commons.math.optimization.linear.Relationship var40 = null;
    double[] var43 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var44 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var43);
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var48 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var50 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var48, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var51 = new org.apache.commons.math.linear.ArrayRealVector(var46, var48);
    double[] var52 = var44.operate(var48);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(var48);
    org.apache.commons.math.optimization.linear.LinearConstraint var55 = new org.apache.commons.math.optimization.linear.LinearConstraint(var33, 50.0d, var40, var48, 2.302585092994046d);
    double var56 = var25.getValue(var48);
    org.apache.commons.math.linear.RealVector var57 = var25.getCoefficients();
    org.apache.commons.math.linear.RealVector var58 = var8.operate(var57);
    double[] var60 = var8.getRow(0);
    double[] var62 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var64 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var62, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var66 = new org.apache.commons.math.optimization.RealPointValuePair(var62, 0.0d);
    double[][] var67 = new double[][] { var62};
    org.apache.commons.math.linear.Array2DRowRealMatrix var69 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var67, true);
    org.apache.commons.math.linear.RealMatrix var70 = var69.copy();
    boolean var71 = var69.isSingular();
    org.apache.commons.math.linear.Array2DRowRealMatrix var72 = var8.subtract(var69);
    double[] var74 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var76 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var74, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var78 = new org.apache.commons.math.optimization.RealPointValuePair(var74, 0.0d);
    double[][] var79 = new double[][] { var74};
    org.apache.commons.math.linear.Array2DRowRealMatrix var81 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var79, true);
    double var82 = var81.getFrobeniusNorm();
    double[] var85 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var87 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var85, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var89 = new org.apache.commons.math.optimization.RealPointValuePair(var85, 0.0d);
    double[][] var90 = new double[][] { var85};
    org.apache.commons.math.linear.Array2DRowRealMatrix var92 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var90, true);
    double var93 = var92.getFrobeniusNorm();
    var81.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var92);
    org.apache.commons.math.linear.RealMatrix var95 = var92.inverse();
    int var96 = var92.getRowDimension();
    double[][] var97 = var92.getData();
    org.apache.commons.math.linear.RealMatrix var98 = var72.add((org.apache.commons.math.linear.RealMatrix)var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-336392980), (-1996750847));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    org.apache.commons.math.linear.RealVector var11 = var8.mapExp();
    org.apache.commons.math.linear.RealVector var12 = var8.mapCeilToSelf();
    double[] var15 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var16 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var15);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
    double[] var24 = var16.operate(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var25 = var8.subtract(var24);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var28, var30);
    org.apache.commons.math.linear.RealVector var34 = var26.subtract(var30);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30);
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    java.lang.String var44 = var42.toString();
    org.apache.commons.math.linear.RealVector var45 = var42.mapRint();
    org.apache.commons.math.linear.RealVector var46 = var42.mapAbsToSelf();
    boolean var47 = var42.isInfinite();
    org.apache.commons.math.linear.RealVector var49 = var42.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var50 = var42.mapCeil();
    double var51 = var35.getDistance(var42);
    org.apache.commons.math.linear.ArrayRealVector var52 = var22.add(var42);
    org.apache.commons.math.linear.RealVector var54 = var42.mapPowToSelf(0.0d);
    org.apache.commons.math.linear.RealVector var55 = var42.mapRint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "{1.54}"+ "'", var44.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
    int var23 = var19.getRowDimension();
    double[][] var24 = var19.getData();
    double var25 = var19.getDeterminant();
    double var26 = var19.getTrace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var28 = var19.getRow(2);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var28, var30);
    org.apache.commons.math.linear.RealVector var34 = var26.subtract(var30);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30);
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
    java.lang.String var44 = var42.toString();
    org.apache.commons.math.linear.RealVector var45 = var42.mapRint();
    org.apache.commons.math.linear.RealVector var46 = var42.mapAbsToSelf();
    boolean var47 = var42.isInfinite();
    org.apache.commons.math.linear.RealVector var49 = var42.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var50 = var42.mapCeil();
    double var51 = var35.getDistance(var42);
    org.apache.commons.math.linear.ArrayRealVector var52 = var22.add(var42);
    org.apache.commons.math.linear.ArrayRealVector var55 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var57 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var59 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var57, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var60 = new org.apache.commons.math.linear.ArrayRealVector(var55, var57);
    org.apache.commons.math.linear.RealVector var61 = var60.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var62 = var60.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var63 = var60.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var66 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var67 = var66.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var68 = var66.mapLog1p();
    var60.setSubVector(0, (org.apache.commons.math.linear.RealVector)var66);
    org.apache.commons.math.linear.RealVector var70 = var66.mapCosh();
    org.apache.commons.math.linear.RealVector var71 = var66.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var73 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var74 = var73.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var75 = var73.mapAsin();
    org.apache.commons.math.linear.RealVector var76 = var73.mapCbrt();
    org.apache.commons.math.linear.RealVector var77 = var73.mapUlp();
    org.apache.commons.math.linear.RealVector var78 = var73.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var79 = var66.subtract(var73);
    org.apache.commons.math.linear.RealVector var80 = var73.mapLogToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var42.setSubVector(1073741824, (org.apache.commons.math.linear.RealVector)var73);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "{1.54}"+ "'", var44.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
//     double[][] var17 = new double[][] { var12};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
//     double var20 = var19.getFrobeniusNorm();
//     var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
//     org.apache.commons.math.linear.RealMatrix var22 = var19.inverse();
//     int var23 = var19.getRowDimension();
//     double[][] var24 = var19.getData();
//     double var25 = var19.getDeterminant();
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var26 = null;
//     double var27 = var19.walkInOptimizedOrder(var26);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    double var5 = var1.getNorm();
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    double[][] var9 = var6.getDataRef();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var12 = var11.mapLog10();
    boolean var13 = var6.equals((java.lang.Object)var11);
    double var14 = var11.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var18, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16, var18);
    org.apache.commons.math.linear.RealVector var22 = var16.mapRint();
    org.apache.commons.math.linear.RealVector var23 = var16.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var27 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var29 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var27, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var25, var27);
    org.apache.commons.math.linear.RealVector var31 = var30.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var32 = var30.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var33 = var30.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var37 = var36.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var38 = var36.mapLog1p();
    var30.setSubVector(0, (org.apache.commons.math.linear.RealVector)var36);
    double[] var40 = var36.getData();
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var44 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var46 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var44, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(var42, var44);
    org.apache.commons.math.optimization.RealPointValuePair var50 = new org.apache.commons.math.optimization.RealPointValuePair(var44, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var51 = new org.apache.commons.math.linear.ArrayRealVector(var40, var44);
    org.apache.commons.math.linear.ArrayRealVector var52 = new org.apache.commons.math.linear.ArrayRealVector(var40);
    double[] var54 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var56 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var54, 1.0d);
    double[] var59 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var60 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var59);
    org.apache.commons.math.linear.ArrayRealVector var62 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var64 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var66 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var64, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var67 = new org.apache.commons.math.linear.ArrayRealVector(var62, var64);
    double[] var68 = var60.operate(var64);
    double var69 = org.apache.commons.math.util.MathUtils.distance1(var54, var64);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var64);
    org.apache.commons.math.linear.ArrayRealVector var71 = new org.apache.commons.math.linear.ArrayRealVector(var64);
    org.apache.commons.math.linear.RealVector var72 = var16.append(var64);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var73 = var11.getDistance(var72);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1694235892), (-336392980));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2030628872));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(1, 0.0d);
    org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog10();
    org.apache.commons.math.linear.RealVector var7 = var5.mapExpm1ToSelf();
    org.apache.commons.math.linear.RealVector var8 = var5.mapCoshToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var3.getLInfDistance((org.apache.commons.math.linear.RealVector)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var2 = var1.getData();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapAbs();
//     org.apache.commons.math.linear.ArrayRealVector var5 = null;
//     double var6 = var1.getL1Distance(var5);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
    double[] var16 = var12.getData();
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 49.73451754256331d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var16);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var5, false);
    org.apache.commons.math.linear.RealVector var10 = var5.mapTan();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    org.apache.commons.math.linear.RealMatrix var20 = var19.copy();
    double var21 = var19.getTrace();
    boolean var22 = var5.equals((java.lang.Object)var19);
    org.apache.commons.math.linear.RealVector var23 = var5.mapLog1pToSelf();
    java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
    org.apache.commons.math.linear.RealVector var27 = var26.mapSinToSelf();
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var5, var26);
    org.apache.commons.math.linear.ArrayRealVector var29 = var1.append(var5);
    org.apache.commons.math.linear.RealVector var30 = var29.mapLog1pToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var8 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var8, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6, var8);
    org.apache.commons.math.linear.RealVector var12 = var11.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var13 = var11.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var14 = var11.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var18 = var17.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var19 = var17.mapLog1p();
    var11.setSubVector(0, (org.apache.commons.math.linear.RealVector)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setColumnVector((-100), (org.apache.commons.math.linear.RealVector)var11);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
//     org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
//     org.apache.commons.math.linear.RealVector var7 = var5.mapTan();
//     org.apache.commons.math.linear.ArrayRealVector var8 = null;
//     double var9 = var5.getLInfDistance(var8);
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10099L, (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9999L);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    java.lang.Object[] var3 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException("hi!", var3);
    java.lang.NullPointerException var5 = org.apache.commons.math.MathRuntimeException.createNullPointerException("Maximal number of iterations ({0}) exceeded", var3);
    java.lang.IllegalArgumentException var6 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }
// 
// 
//     org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(50.0d);
//     var1.setMaxIterations(0);
//     int var4 = var1.getMaxIterations();
//     double[] var6 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
//     double var9 = var8.getConstantTerm();
//     java.util.Collection var10 = null;
//     org.apache.commons.math.optimization.GoalType var11 = null;
//     org.apache.commons.math.optimization.RealPointValuePair var13 = var1.optimize(var8, var10, var11, true);
// 
//   }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    int var9 = var2.getColumnDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var3 = var2.getDataRef();
    org.apache.commons.math.linear.Array2DRowRealMatrix var4 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var6 = var4.getColumnMatrix(101);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    double[] var4 = var1.toArray();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var4);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1p();
    double[] var7 = new double[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var8 = var5.outerProduct(var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var5 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var2, "", var5);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var11 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var10);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var2, "hi!", var10);
    java.lang.Object[] var13 = var2.getArguments();
    java.lang.Object[] var14 = var2.getArguments();
    java.text.ParseException var15 = org.apache.commons.math.MathRuntimeException.createParseException(0, "}", var14);
    java.io.IOException var16 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var15);
    java.lang.String var17 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "org.apache.commons.math.MathRuntimeException$9: }"+ "'", var17.equals("org.apache.commons.math.MathRuntimeException$9: }"));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
    org.apache.commons.math.linear.RealVector var24 = var22.mapUlp();
    org.apache.commons.math.linear.RealVector var25 = var22.mapTanToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapLog10();
    org.apache.commons.math.linear.RealVector var3 = var1.mapExpm1ToSelf();
    org.apache.commons.math.linear.RealVector var4 = var1.mapExpm1();
    java.lang.String var5 = var1.toString();
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = var8.getData();
    org.apache.commons.math.linear.RealVector var10 = var8.mapSignum();
    double[] var11 = var8.toArray();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSubVector(1, var11);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{}"+ "'", var5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double var10 = var8.getNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var27 = new org.apache.commons.math.optimization.RealPointValuePair(var23, 0.0d);
    double[][] var28 = new double[][] { var23};
    org.apache.commons.math.linear.Array2DRowRealMatrix var30 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var28, true);
    double var31 = var30.getFrobeniusNorm();
    var19.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var30);
    org.apache.commons.math.linear.RealMatrix var33 = var30.inverse();
    int var34 = var30.getRowDimension();
    double[][] var35 = var30.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var37 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var35, false);
    var37.multiplyEntry(0, 0, 0.03933967394071772d);
    org.apache.commons.math.linear.Array2DRowRealMatrix var42 = var8.subtract(var37);
    double[] var44 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var46 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var44, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var48 = new org.apache.commons.math.optimization.RealPointValuePair(var44, 0.0d);
    double[][] var49 = new double[][] { var44};
    org.apache.commons.math.linear.Array2DRowRealMatrix var51 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var49, true);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var55 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var57 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var55, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var53, var55);
    org.apache.commons.math.linear.ArrayRealVector var60 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var62 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var64 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var62, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var65 = new org.apache.commons.math.linear.ArrayRealVector(var60, var62);
    double var66 = var65.getNorm();
    org.apache.commons.math.linear.RealMatrix var67 = var58.outerProduct(var65);
    org.apache.commons.math.linear.RealMatrix var68 = var51.solve(var67);
    org.apache.commons.math.linear.Array2DRowRealMatrix var69 = var37.multiply(var51);
    org.apache.commons.math.linear.RealMatrix var71 = var51.getColumnMatrix(0);
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var72 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var77 = var51.walkInOptimizedOrder(var72, 0, (-1), 0, 100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapAcos();
    java.lang.String var8 = var5.toString();
    org.apache.commons.math.linear.RealVector var9 = var5.mapTanToSelf();
    org.apache.commons.math.linear.ArrayRealVector var10 = var1.projection(var5);
    double var11 = var5.getL1Norm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var12 = var5.unitVector();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{}"+ "'", var8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.RealMatrix var4 = var3.transpose();
    double[] var7 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
    double[] var16 = var8.operate(var12);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12);
    org.apache.commons.math.optimization.linear.Relationship var19 = null;
    double[] var22 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var23 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var22);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var27 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var29 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var27, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var25, var27);
    double[] var31 = var23.operate(var27);
    org.apache.commons.math.linear.ArrayRealVector var32 = new org.apache.commons.math.linear.ArrayRealVector(var27);
    org.apache.commons.math.optimization.linear.LinearConstraint var34 = new org.apache.commons.math.optimization.linear.LinearConstraint(var12, 50.0d, var19, var27, 2.302585092994046d);
    double[] var36 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var38 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var36, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var40 = new org.apache.commons.math.optimization.RealPointValuePair(var36, 0.0d);
    double[][] var41 = new double[][] { var36};
    org.apache.commons.math.linear.Array2DRowRealMatrix var43 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var41, true);
    boolean var44 = var34.equals((java.lang.Object)var43);
    double[] var46 = var43.getColumn(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var47 = var3.add(var43);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    org.apache.commons.math.linear.RealMatrix var10 = var8.transpose();
    int var11 = var8.getColumnDimension();
    org.apache.commons.math.linear.RealMatrix var12 = var8.inverse();
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var18 = new org.apache.commons.math.optimization.RealPointValuePair(var14, 0.0d);
    double[][] var19 = new double[][] { var14};
    org.apache.commons.math.linear.Array2DRowRealMatrix var21 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var19, true);
    double var22 = var21.getFrobeniusNorm();
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var27 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var25, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var29 = new org.apache.commons.math.optimization.RealPointValuePair(var25, 0.0d);
    double[][] var30 = new double[][] { var25};
    org.apache.commons.math.linear.Array2DRowRealMatrix var32 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var30, true);
    double var33 = var32.getFrobeniusNorm();
    var21.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var32);
    double[] var36 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var38 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var36, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var40 = new org.apache.commons.math.optimization.RealPointValuePair(var36, 0.0d);
    org.apache.commons.math.optimization.RealPointValuePair var43 = new org.apache.commons.math.optimization.RealPointValuePair(var36, 50.0d, true);
    double[] var44 = var32.operate(var36);
    org.apache.commons.math.linear.ArrayRealVector var46 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var48 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var50 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var48, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var51 = new org.apache.commons.math.linear.ArrayRealVector(var46, var48);
    org.apache.commons.math.linear.RealVector var52 = var51.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var53 = var51.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var54 = var51.mapRintToSelf();
    org.apache.commons.math.linear.RealVector var56 = var51.mapSubtractToSelf(0.5430806348152439d);
    double[] var57 = var51.getData();
    double var58 = org.apache.commons.math.util.MathUtils.distance1(var44, var57);
    double[] var59 = var8.solve(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var61 = var8.getColumn(1073741824);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    var6.setSubVector(0, (org.apache.commons.math.linear.RealVector)var12);
    org.apache.commons.math.linear.RealVector var16 = var12.mapCosh();
    org.apache.commons.math.linear.RealVector var17 = var12.mapCosToSelf();
    var12.set(0.004209855783515182d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var25 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var23, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var21, var23);
    org.apache.commons.math.linear.RealVector var27 = var26.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var28 = var26.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var29 = var26.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var32 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var33 = var32.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var34 = var32.mapLog1p();
    var26.setSubVector(0, (org.apache.commons.math.linear.RealVector)var32);
    org.apache.commons.math.linear.RealVector var36 = var32.mapCosh();
    org.apache.commons.math.linear.RealVector var37 = var32.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var40 = var39.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var41 = var39.mapAsin();
    org.apache.commons.math.linear.RealVector var42 = var39.mapCbrt();
    org.apache.commons.math.linear.RealVector var43 = var39.mapUlp();
    org.apache.commons.math.linear.RealVector var44 = var39.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var45 = var32.subtract(var39);
    org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var48 = var47.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var49 = var47.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var50 = var32.ebeMultiply(var47);
    org.apache.commons.math.linear.RealVector var51 = var47.mapAcosToSelf();
    org.apache.commons.math.linear.RealVector var52 = var47.mapAtanToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var53 = var12.outerProduct(var52);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    double[][] var17 = new double[][] { var12};
    org.apache.commons.math.linear.Array2DRowRealMatrix var19 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17, true);
    double var20 = var19.getFrobeniusNorm();
    var8.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var19);
    double var22 = var19.getDeterminant();
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var28 = new org.apache.commons.math.optimization.RealPointValuePair(var24, 0.0d);
    double[][] var29 = new double[][] { var24};
    org.apache.commons.math.linear.Array2DRowRealMatrix var31 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var29, true);
    double var32 = var31.getFrobeniusNorm();
    double[] var35 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var37 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var35, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var39 = new org.apache.commons.math.optimization.RealPointValuePair(var35, 0.0d);
    double[][] var40 = new double[][] { var35};
    org.apache.commons.math.linear.Array2DRowRealMatrix var42 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var40, true);
    double var43 = var42.getFrobeniusNorm();
    var31.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var42);
    org.apache.commons.math.linear.RealMatrix var45 = var42.inverse();
    int var46 = var42.getRowDimension();
    double[][] var47 = var42.getData();
    org.apache.commons.math.linear.Array2DRowRealMatrix var49 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var47, false);
    var49.multiplyEntry(0, 0, 0.03933967394071772d);
    double[][] var54 = var49.getData();
    org.apache.commons.math.linear.RealMatrix var55 = var19.preMultiply((org.apache.commons.math.linear.RealMatrix)var49);
    double var56 = var49.getTrace();
    double var57 = var49.getDeterminant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.03933967394071772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.03933967394071772d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
    int var12 = var11.getDimension();
    java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
    org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
    org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
    java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
    org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
    org.apache.commons.math.linear.RealVector var23 = var22.mapSinh();
    org.apache.commons.math.linear.RealVector var24 = var22.mapLog10ToSelf();
    org.apache.commons.math.linear.RealVector var26 = var22.mapAdd(0.0d);
    double[] var28 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var30 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var28, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var32 = new org.apache.commons.math.optimization.RealPointValuePair(var28, 0.0d);
    double[][] var33 = new double[][] { var28};
    org.apache.commons.math.linear.Array2DRowRealMatrix var35 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var33, true);
    double var36 = var35.getFrobeniusNorm();
    double[] var39 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var43 = new org.apache.commons.math.optimization.RealPointValuePair(var39, 0.0d);
    double[][] var44 = new double[][] { var39};
    org.apache.commons.math.linear.Array2DRowRealMatrix var46 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var44, true);
    double var47 = var46.getFrobeniusNorm();
    var35.setRowMat
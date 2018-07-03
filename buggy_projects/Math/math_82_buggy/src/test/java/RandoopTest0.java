
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 10L);
// 
//   }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     int[] var0 = null;
//     int[] var3 = new int[] { 1, 0};
//     int var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var3);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0d, 1.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1, 10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double[] var2 = new double[] { 10.0d, (-1.0d)};
    org.apache.commons.math.optimization.linear.Relationship var4 = null;
    double[] var6 = new double[] { 100.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.LinearConstraint var8 = new org.apache.commons.math.optimization.linear.LinearConstraint(var2, 100.0d, var4, var6, 0.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(100.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 50.0d);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 1.0d};
//     double[] var3 = null;
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(var2, var3);
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.linear.Array2DRowRealMatrix var1 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var0);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(100.0d, 50.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 49.73451754256331d);

  }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     org.apache.commons.math.linear.RealVector var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(var0);
// 
//   }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var3 = new java.lang.Object[] { ""};
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "", var3);
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var5.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    org.apache.commons.math.linear.Array2DRowRealMatrix var1 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var2 = var0.subtract((org.apache.commons.math.linear.RealMatrix)var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0d, 10.0d, 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(var0);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var3 = var0.getRowMatrix(100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var6 = var0.getSubMatrix(10, 0, 1, (-1));
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.linear.RealVector var4 = null;
//     double var5 = var3.getValue(var4);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.walkInColumnOrder(var1, 10, (-1), 100, 10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     double[] var1 = new double[] { 10.0d};
//     org.apache.commons.math.linear.ArrayRealVector var2 = null;
//     org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(var1, var2);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     double[] var2 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var0, var2);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    double[] var3 = new double[] { (-1.0d), 100.0d, 100.0d};
    double[] var6 = new double[] { (-1.0d), (-1.0d)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var2 = var0.scalarMultiply(10.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var3 = var0.scalarAdd(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
    org.apache.commons.math.linear.Array2DRowRealMatrix var5 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var6 = var5.getRowDimension();
    int var7 = var5.getRowDimension();
    java.lang.StringBuffer var8 = null;
    java.text.FieldPosition var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var10 = var4.format((java.lang.Object)var7, var8, var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double var6 = var5.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var3 = var0.getRowMatrix(1);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var3 = var2.getRowDimension();
    int var4 = var2.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var5 = var0.subtract((org.apache.commons.math.linear.RealMatrix)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10L));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    double[][] var10 = new double[][] { var7};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.copySubMatrix(0, 100, 0, 1, var10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
//     java.lang.String var5 = var4.getSeparator();
//     java.text.ParsePosition var7 = null;
//     java.lang.Object var8 = var4.parseObject("", var7);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.302585092994046d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var4 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, "", var4);
    java.lang.Object[] var9 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var10 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var9);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1, "hi!", var9);
    java.util.NoSuchElementException var12 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    org.apache.commons.math.linear.Array2DRowRealMatrix var4 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var5 = var4.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var6 = var0.multiply(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var3 = var2.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var4 = var0.add((org.apache.commons.math.linear.RealMatrix)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var3 = var2.getRowDimension();
    int var4 = var2.getRowDimension();
    int var5 = var2.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var6 = var0.add(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.Array2DRowRealMatrix var4 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var5 = var4.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var6 = var3.multiply(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var6 = new org.apache.commons.math.optimization.RealPointValuePair(var2, 0.0d);
    double[][] var7 = new double[][] { var2};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var10 = var0.subtract((org.apache.commons.math.linear.RealMatrix)var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var9 = null;
//     double var10 = var8.walkInRowOrder(var9);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
//     java.lang.String var5 = var4.getSeparator();
//     java.text.ParsePosition var7 = null;
//     org.apache.commons.math.linear.ArrayRealVector var8 = var4.parse("org.apache.commons.math.ConvergenceException: Convergence failed", var7);
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var4 = var0.scalarAdd(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 10.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, var1);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var10 = new org.apache.commons.math.optimization.RealPointValuePair(var6, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setColumn(100, var6);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var0, false);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 363.7393755555636d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(2.302585092994046d, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    double[] var7 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    double[][] var9 = new double[][] { var7};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.copySubMatrix(0, 100, 1, 100, var9);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("}", "hi!", "hi!", var3);
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var4.parseObject("}", var6);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int[] var4 = new int[] { (-1), 1};
    int[] var8 = new int[] { 100, (-1), (-1)};
    double[] var10 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var10, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var14 = new org.apache.commons.math.optimization.RealPointValuePair(var10, 0.0d);
    double[][] var15 = new double[][] { var10};
    org.apache.commons.math.linear.Array2DRowRealMatrix var17 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var15, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.copySubMatrix(var4, var8, var15);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var10 = new org.apache.commons.math.optimization.RealPointValuePair(var6, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumn(1, var6);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.Relationship var1 = org.apache.commons.math.optimization.linear.Relationship.valueOf("org.apache.commons.math.ConvergenceException: Convergence failed");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var1.dotProduct(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(50.0d, (-1.0d), 2.302585092994046d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowVector(1, (org.apache.commons.math.linear.RealVector)var9);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var7 = var0.preMultiply((org.apache.commons.math.linear.RealVector)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var3.isSingular();
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

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-100L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.apache.commons.math.optimization.linear.Relationship[] var0 = org.apache.commons.math.optimization.linear.Relationship.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    double var4 = var3.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCosToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var8 = var3.operate((org.apache.commons.math.linear.RealVector)var6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    org.apache.commons.math.linear.RealVector var15 = var9.mapRint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = var6.dotProduct((org.apache.commons.math.linear.RealVector)var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var6 = var0.getSubMatrix((-1), 10, 0, 1);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var6 = var4.parse("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var1 = null;
//     double var2 = var0.walkInOptimizedOrder(var1);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var3 = var0.scalarAdd((-1.0d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var11 = var3.preMultiply(var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    org.apache.commons.math.linear.RealMatrixChangingVisitor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.walkInOptimizedOrder(var4, 100, (-1), 100, 0);
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

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    double[] var9 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var9);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    double[] var18 = var10.operate(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var19 = var1.subtract(var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     int var2 = var0.getRowDimension();
//     int var3 = var0.getRowDimension();
//     var0.setEntry(100, 0, 100.0d);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var3.walkInRowOrder(var12, (-1), 100, 0, 10);
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

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    double[] var4 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var5 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var4);
    org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7, var9);
    double[] var13 = var5.operate(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var14 = var0.operate(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var6 = var1.getSubVector((-1), 10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var9 = var8.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var10 = var8.mapAcos();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var6.getDistance(var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0d), 49.73451754256331d, 0);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(49.73451754256331d, 0.0d, 0);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var8 = var1.mapMultiply(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.unitize();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    org.apache.commons.math.linear.Array2DRowRealMatrix var11 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var12 = var11.getRowDimension();
    int var13 = var11.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setRowMatrix(1, (org.apache.commons.math.linear.RealMatrix)var11);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
//     java.lang.Object var5 = null;
//     java.lang.StringBuffer var6 = null;
//     java.text.FieldPosition var7 = null;
//     java.lang.StringBuffer var8 = var4.format(var5, var6, var7);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var5 = var1.outerProduct(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
//     java.lang.String var5 = var4.getSeparator();
//     java.lang.Object var6 = null;
//     java.lang.String var7 = var4.format(var6);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
    java.lang.String var5 = var4.getSeparator();
    java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var9 = new org.apache.commons.math.MathRuntimeException("hi!", var8);
    java.io.IOException var10 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var4.format((java.lang.Object)var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var5.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    double[] var9 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var9);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    double[] var18 = var10.operate(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var19 = var1.getL1Distance(var18);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    int[] var7 = new int[] { 10, 100, 0};
    int[] var11 = new int[] { 0, 10, (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var12 = var3.getSubMatrix(var7, var11);
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

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
//     java.lang.String var1 = var0.getSuffix();
//     org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var4 = var3.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var5 = var3.mapAsin();
//     java.lang.StringBuffer var6 = null;
//     java.text.FieldPosition var7 = null;
//     java.lang.StringBuffer var8 = var0.format(var5, var6, var7);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var10 = null;
//     double var11 = var8.walkInRowOrder(var10);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     int var2 = var0.getRowDimension();
//     int var3 = var0.getRowDimension();
//     double var6 = var0.getEntry(1, 100);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var11 = var6.ebeDivide(var10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     java.text.NumberFormat var3 = null;
//     org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var4.parseObject("hi!", var6);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double[] var11 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var13 = var8.solve((org.apache.commons.math.linear.RealMatrix)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var5 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var4);
    java.lang.Object[] var8 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5, "", var8);
    java.text.ParseException var10 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var8);
    org.apache.commons.math.optimization.OptimizationException var11 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var10);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var10);
    java.lang.Throwable[] var13 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


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
    org.apache.commons.math.linear.RealVector var19 = var18.mapLogToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var20 = var12.getL1Distance(var18);
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
    assertNotNull(var19);

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     int var2 = var0.getRowDimension();
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var3 = null;
//     double var4 = var0.walkInOptimizedOrder(var3);
// 
//   }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var8 = var0.getSubMatrix(0, 100, 1, 0);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "", var3);
    java.lang.Object[] var8 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var9 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var8);
    org.apache.commons.math.MathRuntimeException var10 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var0, "hi!", var8);
    java.lang.IllegalArgumentException var11 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var13 = var12.getRowDimension();
    int var14 = var12.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var15 = var3.multiply((org.apache.commons.math.linear.RealMatrix)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(363.7393755555636d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6853722608524322d));

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     double[] var2 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var7 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
//     double[] var11 = var3.operate(var7);
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var12 = null;
//     double var13 = var3.walkInColumnOrder(var12);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var5 = var0.scalarMultiply(50.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    java.lang.Double[] var5 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var5);
    org.apache.commons.math.linear.RealVector var7 = var6.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var8 = var0.operate((org.apache.commons.math.linear.RealVector)var6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     int var2 = var0.getRowDimension();
//     double var3 = var0.getNorm();
//     double var6 = var0.getEntry((-1), 100);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.GoalType var1 = org.apache.commons.math.optimization.GoalType.valueOf("{1.54}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double[] var4 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var4, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var8 = new org.apache.commons.math.optimization.RealPointValuePair(var4, 0.0d);
    double[][] var9 = new double[][] { var4};
    org.apache.commons.math.linear.Array2DRowRealMatrix var11 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var9, true);
    double var12 = var11.getFrobeniusNorm();
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var19 = new org.apache.commons.math.optimization.RealPointValuePair(var15, 0.0d);
    double[][] var20 = new double[][] { var15};
    org.apache.commons.math.linear.Array2DRowRealMatrix var22 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var20, true);
    double var23 = var22.getFrobeniusNorm();
    var11.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var25 = var0.multiply(var22);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.apache.commons.math.linear.NonSquareMatrixException var2 = new org.apache.commons.math.linear.NonSquareMatrixException((-1), 0);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var4 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, "", var4);
    java.lang.Object[] var9 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var10 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var9);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1, "hi!", var9);
    java.lang.Object[] var12 = var1.getArguments();
    java.lang.Object[] var13 = var1.getArguments();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException("{1.54}", var13);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.302585092994046d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.302585092994046d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    java.lang.Double[] var7 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    org.apache.commons.math.linear.RealVector var9 = var8.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var10 = var1.outerProduct(var8);
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
    assertNotNull(var9);

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, var3);
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    double[] var9 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var9);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    double[] var18 = var10.operate(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var19 = var1.ebeDivide(var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    int[] var2 = new int[] { 10, 100};
    int[] var3 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = org.apache.commons.math.util.MathUtils.distance1(var2, var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    double var12 = var3.getFrobeniusNorm();
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var35 = var3.subtract(var21);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
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

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, 100L);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    double var5 = var1.getNorm();
    java.lang.Double[] var7 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    org.apache.commons.math.linear.RealVector var9 = var8.mapLogToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var10 = var1.projection(var9);
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
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
    org.apache.commons.math.linear.RealVector var10 = var2.subtract(var6);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var13 = var12.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var14 = var12.mapLog1p();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var15 = var2.projection((org.apache.commons.math.linear.RealVector)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var10 = var9.getData();
    double[] var11 = var9.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var12 = var6.outerProduct(var11);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.Relationship var1 = org.apache.commons.math.optimization.linear.Relationship.valueOf("}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var3.walkInColumnOrder(var12, (-1), 0, (-1), 100);
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

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var6 = var5.unitVector();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = new org.apache.commons.math.linear.ArrayRealVector();
//     double[] var1 = null;
//     org.apache.commons.math.linear.RealVector var2 = var0.projection(var1);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, 1);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCosh();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var8 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var8, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6, var8);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var14 = var13.mapCosToSelf();
    double var15 = var6.dotProduct(var14);
    org.apache.commons.math.linear.RealVector var16 = var1.ebeMultiply(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var3.walkInColumnOrder(var4, (-1), (-1), 100, 10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.walkInOptimizedOrder(var4, 0, 0, 10, 0);
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

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var4 = var0.inverse();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var9 = var8.mapCosToSelf();
    double var10 = var1.dotProduct(var9);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var14 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var14, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var12, var14);
    org.apache.commons.math.linear.RealVector var18 = var17.mapCoshToSelf();
    java.lang.String var19 = var17.toString();
    org.apache.commons.math.linear.RealVector var21 = var17.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var22 = var17.mapLog10();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var23 = var1.dotProduct(var22);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "{1.54}"+ "'", var19.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(2.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(100, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.apache.commons.math.MathException var0 = new org.apache.commons.math.MathException();
    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var10 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var10, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var8, var10);
    org.apache.commons.math.linear.RealVector var14 = var13.mapCoshToSelf();
    java.lang.String var15 = var13.toString();
    org.apache.commons.math.linear.RealVector var16 = var13.mapRint();
    org.apache.commons.math.linear.RealVector var17 = var13.mapAbsToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var18 = var5.projection(var17);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "{1.54}"+ "'", var15.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-1), (-100L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var10 = null;
//     double var11 = var8.walkInOptimizedOrder(var10);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAsin();
    org.apache.commons.math.linear.RealVector var9 = var6.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var11 = null;
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var15 = new org.apache.commons.math.optimization.linear.LinearConstraint(var9, 363.7393755555636d, var11, (org.apache.commons.math.linear.RealVector)var13, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowVector(10, var9);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double[] var6 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var7 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowMatrix(10, (org.apache.commons.math.linear.RealMatrix)var7);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var3 = var2.getDataRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var5 = var2.getRowMatrix(10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
    org.apache.commons.math.optimization.RealPointValuePair var12 = new org.apache.commons.math.optimization.RealPointValuePair(var6, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var6, true);
    int var15 = var14.getDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowVector(1, (org.apache.commons.math.linear.RealVector)var14);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


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
    org.apache.commons.math.linear.Array2DRowRealMatrix var24 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var25 = var19.preMultiply((org.apache.commons.math.linear.RealMatrix)var24);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
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
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var23 = null;
//     double var24 = var19.walkInColumnOrder(var23);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var10 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var10, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var8, var10);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var16 = var15.mapCosToSelf();
    double var17 = var8.dotProduct(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var18 = var6.outerProduct(var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var15 = var14.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var16 = var14.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var14, false);
    org.apache.commons.math.linear.RealVector var19 = var18.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var22 = var18.dotProduct((org.apache.commons.math.linear.RealVector)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var23 = var12.outerProduct(var18);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "", var3);
    org.apache.commons.math.ConvergenceException var7 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var10 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var11 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var7, "", var10);
    java.lang.Object[] var15 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var16 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var15);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var7, "hi!", var15);
    java.lang.Object[] var18 = var7.getArguments();
    org.apache.commons.math.linear.InvalidMatrixException var19 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.ConvergenceException: Convergence failed", var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException((java.lang.Throwable)var4, "{1.54}", var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    org.apache.commons.math.linear.RealMatrixChangingVisitor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.walkInColumnOrder(var2, 0, (-1), 0, 1);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(50.0d, (-0.6853722608524322d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var2);
    double[] var7 = new double[] { 0.0d, 100.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var2.getDistance(var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, (-100L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
//     double[][] var3 = var2.getDataRef();
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var4 = null;
//     double var5 = var2.walkInRowOrder(var4);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
//     java.text.ParsePosition var2 = null;
//     java.lang.Object var3 = var0.parseObject("{1.54}", var2);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var6 = new org.apache.commons.math.optimization.RealPointValuePair(var2, 0.0d);
    double[][] var7 = new double[][] { var2};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.MathRuntimeException var10 = new org.apache.commons.math.MathRuntimeException("{}", (java.lang.Object[])var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var0, true);
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    java.lang.Object[] var1 = null;
    java.util.NoSuchElementException var2 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("Convergence failed", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var12 = var1.ebeDivide(var9);
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
    assertNotNull(var9);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var24 = var19.getRowMatrix((-1));
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

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


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
    org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var22, false);
    org.apache.commons.math.linear.RealVector var27 = var26.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var30 = var26.dotProduct((org.apache.commons.math.linear.RealVector)var29);
    boolean var31 = var26.isInfinite();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var32 = var11.outerProduct(var26);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var13 = var10.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var17 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var18 = var16.mapLog1p();
    var10.setSubVector(0, (org.apache.commons.math.linear.RealVector)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var20 = var1.ebeDivide(var10);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


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
    org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
    org.apache.commons.math.linear.RealMatrixChangingVisitor var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var28 = var8.walkInOptimizedOrder(var23, 1, 100, 0, 1);
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

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


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
    boolean var16 = var1.isNaN();
    java.lang.Double[] var18 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var18);
    org.apache.commons.math.linear.RealVector var20 = var19.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var19);
    org.apache.commons.math.linear.RealVector var22 = var19.mapExpToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var23 = var1.getL1Distance(var22);
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    double[] var3 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var4 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var3);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var8 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var8, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6, var8);
    double[] var12 = var4.operate(var8);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var14 = var0.solve(var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.9066992099956157d, (-0.6853722608524322d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
//     org.apache.commons.math.optimization.linear.Relationship var6 = null;
//     org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
//     double[] var11 = null;
//     double var12 = var8.getLInfDistance(var11);
// 
//   }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     double[] var2 = null;
//     double[] var3 = var0.solve(var2);
// 
//   }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException("hi!", var2);
    java.io.IOException var4 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var3);
    java.lang.Object[] var5 = var3.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var28 = var19.getSubMatrix((-1), (-1), 0, 10);
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

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(10.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.0d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
    boolean var11 = var6.isInfinite();
    org.apache.commons.math.linear.RealVector var13 = var6.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var14 = var6.mapCeil();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = var16.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var18 = var6.dotProduct(var16);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    double var12 = var3.getFrobeniusNorm();
    org.apache.commons.math.linear.RealMatrix var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setColumnMatrix(100, var14);
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
    assertTrue(var12 == 1.0d);

  }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     double[][] var1 = null;
//     var0.setSubMatrix(var1, (-1), 0);
// 
//   }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    double[] var3 = var1.getData();
    double[] var6 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var7 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    double[] var15 = var7.operate(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = var1.getDistance(var11);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
    org.apache.commons.math.linear.RealVector var11 = var4.mapMultiply(1.0d);
    org.apache.commons.math.optimization.linear.Relationship var12 = null;
    org.apache.commons.math.optimization.linear.LinearConstraint var14 = new org.apache.commons.math.optimization.linear.LinearConstraint(var11, var12, (-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var15 = var2.ebeMultiply(var11);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var7 = var5.mapAsin();
//     org.apache.commons.math.linear.RealVector var8 = var5.mapCbrt();
//     org.apache.commons.math.optimization.linear.Relationship var10 = null;
//     org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.optimization.linear.LinearConstraint var14 = new org.apache.commons.math.optimization.linear.LinearConstraint(var8, 363.7393755555636d, var10, (org.apache.commons.math.linear.RealVector)var12, 10.0d);
//     double var15 = var1.getL1Distance(var12);
//     boolean var16 = var1.isNaN();
//     double[] var17 = null;
//     org.apache.commons.math.linear.RealVector var18 = var1.add(var17);
// 
//   }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    double[] var3 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var4 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var5 = var0.add(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4258259770489514E8d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    double[] var13 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var14 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var13);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var18, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var16, var18);
    double[] var22 = var14.operate(var18);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18);
    org.apache.commons.math.optimization.linear.Relationship var25 = null;
    double[] var28 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var29 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var28);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var33 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var35 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var33, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31, var33);
    double[] var37 = var29.operate(var33);
    org.apache.commons.math.linear.ArrayRealVector var38 = new org.apache.commons.math.linear.ArrayRealVector(var33);
    org.apache.commons.math.optimization.linear.LinearConstraint var40 = new org.apache.commons.math.optimization.linear.LinearConstraint(var18, 50.0d, var25, var33, 2.302585092994046d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var41 = var8.ebeDivide(var18);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-0.6853722608524322d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7403039210812912d));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    double var5 = var1.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var7 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var9, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7, var9);
    org.apache.commons.math.optimization.RealPointValuePair var15 = new org.apache.commons.math.optimization.RealPointValuePair(var9, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var9, true);
    int var18 = var17.getDimension();
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var24 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var22, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var20, var22);
    double var26 = var17.dotProduct(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var27 = var1.outerProduct(var22);
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
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var5 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var2, "", var5);
    java.lang.Object[] var10 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var11 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var10);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var2, "hi!", var10);
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("}", var10);
    org.apache.commons.math.optimization.OptimizationException var14 = new org.apache.commons.math.optimization.OptimizationException("", var10);
    java.lang.IllegalArgumentException var15 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var9.walkInRowOrder(var10, 0, 10, 0, (-1));
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var3 = var2.getDataRef();
    double[] var7 = new double[] { 0.0d, (-1.0d), 1.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var8 = var2.preMultiply(var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    java.lang.Object[] var7 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var8 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var7);
    java.lang.Object[] var11 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var8, "", var11);
    java.text.ParseException var13 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var11);
    org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var11);
    org.apache.commons.math.optimization.OptimizationException var15 = new org.apache.commons.math.optimization.OptimizationException("", var11);
    org.apache.commons.math.linear.InvalidMatrixException var16 = new org.apache.commons.math.linear.InvalidMatrixException("", var11);
    org.apache.commons.math.optimization.OptimizationException var17 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var16);
    java.io.IOException var18 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var17);
    java.lang.IllegalArgumentException var19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var12 = var11.mapLog10();
    org.apache.commons.math.linear.RealVector var13 = var11.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var16 = var15.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var17 = var15.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var15, false);
    org.apache.commons.math.linear.RealVector var20 = var11.subtract((org.apache.commons.math.linear.RealVector)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var21 = var9.outerProduct((org.apache.commons.math.linear.RealVector)var19);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


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
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var21 = var20.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var22 = var17.outerProduct(var21);
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
    assertNotNull(var21);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAsin();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var6.dotProduct(var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.apache.commons.math.linear.NonSquareMatrixException var2 = new org.apache.commons.math.linear.NonSquareMatrixException(10, 0);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var3, (-1), (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
//     java.lang.String var4 = var1.toString();
//     org.apache.commons.math.linear.RealVector var5 = var1.mapSignumToSelf();
//     double[] var6 = null;
//     org.apache.commons.math.linear.RealVector var7 = var1.append(var6);
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var11 = var9.getRowVector(1);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var2.walkInOptimizedOrder(var9, (-1), 10, (-1), (-1));
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


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
    org.apache.commons.math.linear.RealVector var23 = var17.mapTanToSelf();
    
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

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    java.lang.Double[] var9 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var11 = var1.add((org.apache.commons.math.linear.RealVector)var10);
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
    assertNotNull(var9);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    double[] var7 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
    double[] var16 = var8.operate(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setRow(1, var16);
      fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException");
    } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test232() {}
//   public void test232() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
//     org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
//     int var12 = var11.getDimension();
//     java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
//     org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
//     org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
//     java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
//     org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
//     org.apache.commons.math.linear.RealVector var23 = null;
//     org.apache.commons.math.linear.RealVector var24 = var17.subtract(var23);
// 
//   }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector((-1), 0.0d);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
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
//     int var8 = org.apache.commons.math.util.MathUtils.distance1(var0, var4);
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = var3.getRow(100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    org.apache.commons.math.optimization.linear.Relationship var11 = var10.getRelationship();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.RealMatrix var9 = var8.copy();
    org.apache.commons.math.linear.Array2DRowRealMatrix var16 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var17 = var16.getDataRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.copySubMatrix(1, 100, 0, 0, var17);
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
    assertNotNull(var17);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
    org.apache.commons.math.linear.NonSquareMatrixException var3 = new org.apache.commons.math.linear.NonSquareMatrixException(100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var0.format((java.lang.Object)1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var1 = var0.transpose();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
//     double[] var5 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
//     double var7 = var6.getNorm();
//     boolean var8 = var2.equals((java.lang.Object)var6);
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var9 = null;
//     double var10 = var6.walkInColumnOrder(var9);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 0, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(10L, (-10L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
    boolean var11 = var6.isInfinite();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var14 = var13.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var15 = var13.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var18 = var17.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var19 = var17.mapAsin();
    org.apache.commons.math.linear.RealVector var20 = var17.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var22 = null;
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var26 = new org.apache.commons.math.optimization.linear.LinearConstraint(var20, 363.7393755555636d, var22, (org.apache.commons.math.linear.RealVector)var24, 10.0d);
    double var27 = var13.getL1Distance(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var28 = var6.add(var24);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(363.7393755555636d, 49.73451754256331d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 49.58011019658426d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var3 = var2.getDataRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = var2.getRow(10);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }
// 
// 
//     double[][] var0 = null;
//     org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var0, true);
// 
//   }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var3.getTrace();
      fail("Expected exception of type org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     java.text.NumberFormat var0 = null;
//     org.apache.commons.math.linear.RealVectorFormat var1 = new org.apache.commons.math.linear.RealVectorFormat(var0);
//     java.text.ParsePosition var3 = null;
//     java.lang.Object var4 = var1.parseObject("{1.54}", var3);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


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
    org.apache.commons.math.linear.RealVector var16 = var1.mapExpm1ToSelf();
    
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
    assertNotNull(var16);

  }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }
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
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var24 = null;
//     double var25 = var19.walkInOptimizedOrder(var24);
// 
//   }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
//     java.lang.String var8 = var6.toString();
//     org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
//     org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
//     boolean var11 = var6.isInfinite();
//     org.apache.commons.math.linear.RealVector var13 = var6.mapAdd(0.0d);
//     double var14 = var6.getL1Norm();
//     org.apache.commons.math.linear.RealVector var15 = null;
//     double var16 = var6.dotProduct(var15);
// 
//   }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     int var1 = var0.getRowDimension();
//     int var2 = var0.getRowDimension();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var3 = null;
//     double var4 = var0.walkInOptimizedOrder(var3);
// 
//   }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
//     org.apache.commons.math.linear.ArrayRealVector var6 = null;
//     var1.set(0, var6);
// 
//   }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


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
    org.apache.commons.math.linear.RealMatrix var46 = var19.solve(var45);
    org.apache.commons.math.linear.Array2DRowRealMatrix var47 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var48 = var47.getRowDimension();
    int var49 = var47.getRowDimension();
    int var50 = var47.getRowDimension();
    double var51 = var47.getTrace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var52 = var19.add(var47);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var11 = new org.apache.commons.math.optimization.RealPointValuePair(var7, 0.0d);
    double[][] var12 = new double[][] { var7};
    org.apache.commons.math.linear.Array2DRowRealMatrix var14 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var12, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.copySubMatrix(100, 0, (-1), 100, var12);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var6 = new org.apache.commons.math.optimization.RealPointValuePair(var2, 0.0d);
    double[][] var7 = new double[][] { var2};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7, true);
    double var10 = var9.getFrobeniusNorm();
    double[] var13 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var13, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var17 = new org.apache.commons.math.optimization.RealPointValuePair(var13, 0.0d);
    double[][] var18 = new double[][] { var13};
    org.apache.commons.math.linear.Array2DRowRealMatrix var20 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var18, true);
    double var21 = var20.getFrobeniusNorm();
    var9.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var20);
    org.apache.commons.math.linear.RealMatrix var23 = var20.inverse();
    int var24 = var20.getRowDimension();
    double[][] var25 = var20.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.NullPointerException var26 = org.apache.commons.math.MathRuntimeException.createNullPointerException("{1.54}", (java.lang.Object[])var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test261() {}
//   public void test261() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }
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
//     org.apache.commons.math.linear.RealMatrix var23 = var8.getRowMatrix(0);
//     org.apache.commons.math.linear.RealMatrix var24 = null;
//     org.apache.commons.math.linear.RealMatrix var25 = var8.multiply(var24);
// 
//   }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(49.58011019658426d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(20.0d, 49.73451754256331d, 49.58011019658426d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.3440585709080678E43d, 49.73451754256331d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.03933967394071772d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var3 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var2);
    java.lang.Object[] var6 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var7 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3, "", var6);
    java.lang.IllegalArgumentException var8 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var3);
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException((java.lang.Throwable)var3);
    java.lang.Object[] var10 = var9.getArguments();
    
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

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.copy();
    org.apache.commons.math.linear.RealVector var5 = var2.mapPowToSelf(0.03933967394071772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     double[] var6 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var7 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var11 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
//     double[] var15 = var7.operate(var11);
//     org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(var11);
//     org.apache.commons.math.optimization.linear.Relationship var18 = null;
//     double[] var21 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var22 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var21);
//     org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var26 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(var24, var26);
//     double[] var30 = var22.operate(var26);
//     org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(var26);
//     org.apache.commons.math.optimization.linear.LinearConstraint var33 = new org.apache.commons.math.optimization.linear.LinearConstraint(var11, 50.0d, var18, var26, 2.302585092994046d);
//     double var34 = var3.getValue(var26);
//     org.apache.commons.math.linear.RealVector var35 = null;
//     double var36 = var3.getValue(var35);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }
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
//     double[] var23 = null;
//     double[] var24 = var8.solve(var23);
// 
//   }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = new org.apache.commons.math.linear.RealVectorFormat();
//     java.text.ParsePosition var2 = null;
//     org.apache.commons.math.linear.ArrayRealVector var3 = var0.parse("Convergence failed", var2);
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(var1, 0, (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var3.getDeterminant();
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

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


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
    org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var25 = var24.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var26 = var24.mapAcos();
    java.lang.String var27 = var24.toString();
    org.apache.commons.math.linear.RealVector var28 = var24.mapSignumToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var29 = var8.operate(var28);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "{}"+ "'", var27.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(363.7393755555636d, (-0.6853722608524322d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, 0, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    java.text.NumberFormat var3 = null;
    org.apache.commons.math.linear.RealVectorFormat var4 = new org.apache.commons.math.linear.RealVectorFormat("", "hi!", "org.apache.commons.math.ConvergenceException: Convergence failed", var3);
    java.lang.String var5 = var4.getSeparator();
    java.lang.Object[] var11 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var12 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var11);
    java.lang.Object[] var15 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, "", var15);
    java.text.ParseException var17 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var15);
    org.apache.commons.math.ConvergenceException var18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var15);
    org.apache.commons.math.optimization.OptimizationException var19 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var18);
    java.lang.StringBuffer var20 = null;
    java.text.FieldPosition var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var22 = var4.format((java.lang.Object)var19, var20, var21);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var5.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(100.0d, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    org.apache.commons.math.linear.RealVector var15 = var14.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var16 = var14.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var17 = var14.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var21 = var20.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var22 = var20.mapLog1p();
    var14.setSubVector(0, (org.apache.commons.math.linear.RealVector)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var24 = var1.projection((org.apache.commons.math.linear.RealVector)var14);
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
    assertNotNull(var11);
    
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

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double[] var10 = var8.getRow(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var12 = var8.getColumnVector(100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.0d, 10.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    double[] var13 = new double[] { 10.0d, (-1.0d), 10.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setRow(1, var13);
      fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException");
    } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var8 = var3.getSubMatrix(0, 10, 0, 100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var4 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, "", var4);
    org.apache.commons.math.linear.InvalidMatrixException var6 = new org.apache.commons.math.linear.InvalidMatrixException("org.apache.commons.math.ConvergenceException: Convergence failed", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    org.apache.commons.math.linear.RealMatrix var10 = var8.transpose();
    int var11 = var8.getColumnDimension();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var8.walkInColumnOrder(var12, 0, 0, 100, (-1));
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

  }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double var9 = var8.getFrobeniusNorm();
//     org.apache.commons.math.linear.RealMatrixChangingVisitor var10 = null;
//     double var11 = var8.walkInOptimizedOrder(var10);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    java.lang.String var4 = var1.toString();
    org.apache.commons.math.linear.RealVector var5 = var1.mapSignumToSelf();
    double[] var8 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var8);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var13 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var13, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(var11, var13);
    double[] var17 = var9.operate(var13);
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var19 = var1.dotProduct(var13);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    java.text.NumberFormat var0 = null;
    org.apache.commons.math.linear.RealVectorFormat var1 = new org.apache.commons.math.linear.RealVectorFormat(var0);
    java.lang.String var2 = var1.getSeparator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.parseObject("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "; "+ "'", var2.equals("; "));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(2.4258259770489514E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-0.6853722608524322d), 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1079574528);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.apache.commons.math.linear.RealVector var7 = var1.append(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var6, 1079574528, 0);
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

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.lang.Object[] var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.ParseException var3 = org.apache.commons.math.MathRuntimeException.createParseException(1079574528, "{1.54}", var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 2.302585092994046d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.apache.commons.math.optimization.linear.NoFeasibleSolutionException var0 = new org.apache.commons.math.optimization.linear.NoFeasibleSolutionException();

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    java.lang.Object[] var3 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException("hi!", var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.NullPointerException var5 = org.apache.commons.math.MathRuntimeException.createNullPointerException("{}", var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, 10);
// 
//   }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var16 = var1.unitVector();
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

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var6);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var43 = var6.getLInfDistance((org.apache.commons.math.linear.RealVector)var42);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var10);
    
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

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    java.lang.Object[] var8 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var9 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var8);
    java.lang.Object[] var12 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var9, "", var12);
    java.text.ParseException var14 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var12);
    org.apache.commons.math.ConvergenceException var15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var12);
    org.apache.commons.math.optimization.OptimizationException var16 = new org.apache.commons.math.optimization.OptimizationException("", var12);
    org.apache.commons.math.linear.InvalidMatrixException var17 = new org.apache.commons.math.linear.InvalidMatrixException("", var12);
    org.apache.commons.math.ConvergenceException var18 = new org.apache.commons.math.ConvergenceException("}", var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var11 = var6.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var6, false);
    double[] var16 = new double[] { (-1.0d)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setSubVector((-1), var16);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var16);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


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
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var28 = var27.mapLog10();
    org.apache.commons.math.linear.RealVector var29 = var27.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var32 = var31.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var33 = var31.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var31, false);
    org.apache.commons.math.linear.RealVector var36 = var27.subtract((org.apache.commons.math.linear.RealVector)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.setColumnVector(10, (org.apache.commons.math.linear.RealVector)var27);
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.03933967394071772d, 49.73451754256331d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.2074402543612646d));

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
//     org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
//     org.apache.commons.math.linear.RealVector var7 = null;
//     double var8 = var1.getDistance(var7);
// 
//   }

  public void test308() {}
//   public void test308() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }
// 
// 
//     double[] var1 = new double[] { 100.0d};
//     org.apache.commons.math.linear.ArrayRealVector var2 = null;
//     org.apache.commons.math.linear.ArrayRealVector var3 = new org.apache.commons.math.linear.ArrayRealVector(var1, var2);
// 
//   }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


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
    org.apache.commons.math.linear.RealVector var32 = var31.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var33 = var31.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var34 = var31.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var38 = var37.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var39 = var37.mapLog1p();
    var31.setSubVector(0, (org.apache.commons.math.linear.RealVector)var37);
    org.apache.commons.math.linear.RealVector var41 = var37.mapCosh();
    org.apache.commons.math.linear.RealVector var42 = var37.mapExpm1();
    org.apache.commons.math.linear.ArrayRealVector var44 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var45 = var44.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var46 = var44.mapAsin();
    org.apache.commons.math.linear.RealVector var47 = var44.mapCbrt();
    org.apache.commons.math.linear.RealVector var48 = var44.mapUlp();
    org.apache.commons.math.linear.RealVector var49 = var44.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var50 = var37.subtract(var44);
    org.apache.commons.math.linear.RealVector var51 = var44.mapLogToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.setSubVector(10, (org.apache.commons.math.linear.RealVector)var44);
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574528, 100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    int var3 = var0.getRowDimension();
    double var4 = var0.getTrace();
    double[] var6 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var10 = new org.apache.commons.math.optimization.RealPointValuePair(var6, 0.0d);
    double[][] var11 = new double[][] { var6};
    org.apache.commons.math.linear.Array2DRowRealMatrix var13 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var11, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var14 = var0.multiply(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    double[] var6 = new double[] { 1.0d, 0.0d};
    org.apache.commons.math.linear.RealVector var7 = var1.append(var6);
    org.apache.commons.math.optimization.RealPointValuePair var10 = new org.apache.commons.math.optimization.RealPointValuePair(var6, (-0.7403039210812912d), true);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var16 = new org.apache.commons.math.optimization.RealPointValuePair(var12, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = org.apache.commons.math.util.MathUtils.distance(var6, var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var12);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var5.mapRint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var12 = var2.add(var11);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
//     org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
//     org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
//     org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
//     org.apache.commons.math.linear.RealVector var12 = var1.mapInvToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var13 = null;
//     org.apache.commons.math.linear.ArrayRealVector var14 = var1.add(var13);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    org.apache.commons.math.optimization.linear.Relationship var14 = null;
    double[] var17 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var18 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17);
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var24 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var22, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var20, var22);
    double[] var26 = var18.operate(var22);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var22);
    org.apache.commons.math.optimization.linear.LinearConstraint var29 = new org.apache.commons.math.optimization.linear.LinearConstraint(var7, 50.0d, var14, var22, 2.302585092994046d);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var33 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var35 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var33, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var31, var33);
    org.apache.commons.math.linear.RealVector var37 = var36.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var38 = var36.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var39 = var36.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var43 = var42.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var44 = var42.mapLog1p();
    var36.setSubVector(0, (org.apache.commons.math.linear.RealVector)var42);
    double[] var46 = var42.getData();
    org.apache.commons.math.linear.ArrayRealVector var48 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var50 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var52 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var50, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(var48, var50);
    org.apache.commons.math.optimization.RealPointValuePair var56 = new org.apache.commons.math.optimization.RealPointValuePair(var50, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var57 = new org.apache.commons.math.linear.ArrayRealVector(var46, var50);
    org.apache.commons.math.linear.ArrayRealVector var58 = new org.apache.commons.math.linear.ArrayRealVector(var46);
    double[] var59 = var58.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var60 = org.apache.commons.math.util.MathUtils.distance1(var7, var59);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


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
    boolean var22 = var19.isSquare();
    
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
    assertTrue(var22 == true);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    double[] var4 = var1.toArray();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var6, false);
    org.apache.commons.math.linear.RealVector var12 = var10.mapDivideToSelf(0.0d);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var1, var10);
    org.apache.commons.math.linear.RealVector var14 = var13.mapSinhToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.4258259770489514E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    int[] var10 = new int[] { };
    int[] var11 = new int[] { };
    int var12 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var11);
    int[] var13 = new int[] { };
    int[] var14 = new int[] { };
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var14);
    double var16 = org.apache.commons.math.util.MathUtils.distance(var10, var13);
    int[] var17 = new int[] { };
    int[] var18 = new int[] { };
    int var19 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var18);
    int[] var20 = new int[] { };
    int[] var21 = new int[] { };
    int var22 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance(var17, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var24 = var8.getSubMatrix(var13, var20);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.multiplyEntry((-1), (-1), 0.0d);
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

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double var3 = var0.getNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var8 = var0.getSubMatrix(0, 0, (-1), 0);
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

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    java.lang.Object[] var3 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var4 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var3);
    java.lang.Object[] var7 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var4, "", var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.NullPointerException var9 = org.apache.commons.math.MathRuntimeException.createNullPointerException("{}", var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(2.9066992099956157d, 0.9957901442164848d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.apache.commons.math.linear.NonSquareMatrixException var2 = new org.apache.commons.math.linear.NonSquareMatrixException(100, 1);
    org.apache.commons.math.optimization.OptimizationException var3 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var2);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    double var12 = var3.getFrobeniusNorm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addToEntry(1079574528, 0, 1.3440585709080678E43d);
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
    assertTrue(var12 == 1.0d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var25 = var8.getRowMatrix(1);
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

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    double[] var3 = var1.getData();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCoshToSelf();
    java.lang.String var12 = var10.toString();
    org.apache.commons.math.linear.RealVector var13 = var10.mapRint();
    org.apache.commons.math.linear.RealVector var14 = var10.mapAbsToSelf();
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var16 = var1.subtract(var15);
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
    assertTrue("'" + var12 + "' != '" + "{1.54}"+ "'", var12.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var13 = var10.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var17 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var18 = var16.mapLog1p();
    var10.setSubVector(0, (org.apache.commons.math.linear.RealVector)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowVector(0, (org.apache.commons.math.linear.RealVector)var16);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }
// 
// 
//     java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var6 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
//     org.apache.commons.math.linear.RealVector var10 = var2.subtract(var6);
//     org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var6);
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var15 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var13, var15);
//     org.apache.commons.math.linear.RealVector var19 = var18.mapCoshToSelf();
//     java.lang.String var20 = var18.toString();
//     org.apache.commons.math.linear.RealVector var21 = var18.mapRint();
//     org.apache.commons.math.linear.RealVector var22 = var18.mapAbsToSelf();
//     boolean var23 = var18.isInfinite();
//     org.apache.commons.math.linear.RealVector var25 = var18.mapAdd(0.0d);
//     org.apache.commons.math.linear.RealVector var26 = var18.mapCeil();
//     double var27 = var11.getDistance(var18);
//     org.apache.commons.math.linear.RealVector var28 = var11.mapAtanToSelf();
//     double[] var29 = null;
//     double var30 = var11.getDistance(var29);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


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
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var17 = var16.getData();
    org.apache.commons.math.linear.RealVector var18 = var16.mapSignum();
    double[] var19 = var16.toArray();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var22 = var21.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var23 = var21.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var21, false);
    org.apache.commons.math.linear.RealVector var27 = var25.mapDivideToSelf(0.0d);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var16, var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var29 = var6.getDistance((org.apache.commons.math.linear.RealVector)var16);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.731030945644E13d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


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
    org.apache.commons.math.linear.RealVector var19 = var17.mapLog10ToSelf();
    double[] var22 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var23 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var22);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var27 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var29 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var27, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(var25, var27);
    double[] var31 = var23.operate(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var32 = var17.projection(var31);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    org.apache.commons.math.ConvergenceException var1 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var4 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, "", var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ConcurrentModificationException var6 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("Array2DRowRealMatrix{{1.0}}", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-1.2074402543612646d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8219365641849925d);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapAbs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.unitize();
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

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.6853722608524322d), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.7d));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.RealVector var8 = var5.mapLog1p();
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAcos();
    double[] var15 = new double[] { 1.0d, 0.0d};
    org.apache.commons.math.linear.RealVector var16 = var10.append(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var17 = var5.outerProduct(var16);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


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
    org.apache.commons.math.linear.RealVector var23 = var17.mapTanh();
    boolean var24 = var17.isInfinite();
    
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
    assertTrue(var24 == false);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var6.walkInColumnOrder(var9, 10, 0, 1, 100);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1073741824);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(1, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var11 = var6.mapAddToSelf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{1.54}"+ "'", var8.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    org.apache.commons.math.linear.RealVectorFormat var0 = new org.apache.commons.math.linear.RealVectorFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var2 = var0.parse("}");
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 1073741824);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1079574528, 1079574528);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-0.7d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


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
    org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
    double var23 = var8.getNorm();
    double[] var26 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var27 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var26);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var29, var31);
    double[] var35 = var27.operate(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var36 = var8.multiply((org.apache.commons.math.linear.RealMatrix)var27);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var12 = var11.getData();
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var12);
    org.apache.commons.math.linear.RealVector var14 = var13.mapCeilToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var15 = var6.subtract(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double var9 = var5.dotProduct((org.apache.commons.math.linear.RealVector)var8);
    org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var13 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var13, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(var11, var13);
    org.apache.commons.math.optimization.RealPointValuePair var19 = new org.apache.commons.math.optimization.RealPointValuePair(var13, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var13, true);
    int var22 = var21.getDimension();
    java.lang.Double[] var24 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var24);
    org.apache.commons.math.linear.RealVector var26 = var25.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var25);
    org.apache.commons.math.linear.RealVector var28 = var21.add((org.apache.commons.math.linear.RealVector)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var29 = var5.getL1Distance((org.apache.commons.math.linear.RealVector)var21);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }
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
//     org.apache.commons.math.linear.RealVector var23 = null;
//     org.apache.commons.math.linear.RealVector var24 = var8.preMultiply(var23);
// 
//   }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var4 = var3.getRowDimension();
    int var5 = var3.getRowDimension();
    double var6 = var3.getNorm();
    java.lang.String var7 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var8 = var2.multiply((org.apache.commons.math.linear.RealMatrix)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Array2DRowRealMatrix{}"+ "'", var7.equals("Array2DRowRealMatrix{}"));

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


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
    double[] var27 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var28 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var27);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var32 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var34 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var32, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30, var32);
    double[] var36 = var28.operate(var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var37 = var19.solve(var36);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


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
    org.apache.commons.math.linear.RealVector var29 = var27.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(var27, false);
    org.apache.commons.math.linear.RealVector var32 = var27.mapTan();
    org.apache.commons.math.linear.ArrayRealVector var33 = var12.subtract(var27);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(49.73451754256331d, 0.0d, 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.8219365641849925d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var3, 1.0d, true);
//     org.apache.commons.math.linear.ArrayRealVector var11 = new org.apache.commons.math.linear.ArrayRealVector(var3, true);
//     int var12 = var11.getDimension();
//     java.lang.Double[] var14 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var14);
//     org.apache.commons.math.linear.RealVector var16 = var15.mapLogToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var15);
//     org.apache.commons.math.linear.RealVector var18 = var11.add((org.apache.commons.math.linear.RealVector)var17);
//     java.lang.Double[] var20 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(var20);
//     org.apache.commons.math.linear.ArrayRealVector var22 = var17.projection(var21);
//     org.apache.commons.math.linear.RealVector var23 = var22.mapCosh();
//     java.lang.Double[] var25 = new java.lang.Double[] { 49.73451754256331d};
//     org.apache.commons.math.linear.ArrayRealVector var26 = new org.apache.commons.math.linear.ArrayRealVector(var25);
//     org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var30 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var32 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var30, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var28, var30);
//     org.apache.commons.math.linear.RealVector var34 = var26.subtract(var30);
//     org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30);
//     org.apache.commons.math.linear.ArrayRealVector var37 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var39 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var41 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var39, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var37, var39);
//     org.apache.commons.math.linear.RealVector var43 = var42.mapCoshToSelf();
//     java.lang.String var44 = var42.toString();
//     org.apache.commons.math.linear.RealVector var45 = var42.mapRint();
//     org.apache.commons.math.linear.RealVector var46 = var42.mapAbsToSelf();
//     boolean var47 = var42.isInfinite();
//     org.apache.commons.math.linear.RealVector var49 = var42.mapAdd(0.0d);
//     org.apache.commons.math.linear.RealVector var50 = var42.mapCeil();
//     double var51 = var35.getDistance(var42);
//     org.apache.commons.math.linear.ArrayRealVector var52 = var22.add(var42);
//     double[] var53 = null;
//     double var54 = var52.getDistance(var53);
// 
//   }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
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
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var14 = var13.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var15 = var13.mapLog1p();
//     var7.setSubVector(0, (org.apache.commons.math.linear.RealVector)var13);
//     double[] var17 = var13.getData();
//     org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var21 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var23 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var21, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(var19, var21);
//     org.apache.commons.math.optimization.RealPointValuePair var27 = new org.apache.commons.math.optimization.RealPointValuePair(var21, 1.0d, true);
//     org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var17, var21);
//     org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(var17);
//     double var30 = org.apache.commons.math.util.MathUtils.distance(var0, var17);
// 
//   }

  public void test364() {}
//   public void test364() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }
// 
// 
//     org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(50.0d);
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var2 = null;
//     java.util.Collection var3 = null;
//     org.apache.commons.math.optimization.GoalType var4 = null;
//     org.apache.commons.math.optimization.RealPointValuePair var6 = var1.optimize(var2, var3, var4, true);
// 
//   }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var23 = var8.getColumnMatrix(100);
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

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.apache.commons.math.optimization.linear.SimplexSolver var1 = new org.apache.commons.math.optimization.linear.SimplexSolver(2.4258259770489514E8d);
    int var2 = var1.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


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
    org.apache.commons.math.linear.RealVector var19 = var18.mapCoshToSelf();
    java.lang.String var20 = var18.toString();
    org.apache.commons.math.linear.RealVector var21 = var18.mapRint();
    org.apache.commons.math.linear.RealVector var22 = var18.mapAbsToSelf();
    boolean var23 = var18.isInfinite();
    org.apache.commons.math.linear.RealVector var25 = var18.mapAdd(0.0d);
    org.apache.commons.math.linear.RealVector var26 = var18.mapCeil();
    double var27 = var11.getDistance(var18);
    org.apache.commons.math.linear.RealVector var28 = var11.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var29 = var11.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var30 = var11.mapFloor();
    org.apache.commons.math.linear.RealVector var31 = var11.mapCosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "{1.54}"+ "'", var20.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException("hi!", var2);
    java.io.IOException var4 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var3);
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.GoalType var1 = org.apache.commons.math.optimization.GoalType.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0d, 363.7393755555636d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var13 = var10.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var17 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var18 = var16.mapLog1p();
    var10.setSubVector(0, (org.apache.commons.math.linear.RealVector)var16);
    double[] var20 = var16.getData();
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var22, var24);
    org.apache.commons.math.optimization.RealPointValuePair var30 = new org.apache.commons.math.optimization.RealPointValuePair(var24, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(var20, var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var32 = var1.dotProduct(var24);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


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
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var27 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var25, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var29 = new org.apache.commons.math.optimization.RealPointValuePair(var25, 0.0d);
    double[][] var30 = new double[][] { var25};
    org.apache.commons.math.linear.Array2DRowRealMatrix var32 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var30, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var33 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.setSubMatrix(var30, 1073741824, 10);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(10, (-100L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    java.lang.String var12 = var1.toString();
    double[] var15 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var16 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var1.getDistance(var15);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var2);
    org.apache.commons.math.linear.RealVector var5 = var4.mapUlpToSelf();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
//     org.apache.commons.math.optimization.linear.Relationship var6 = null;
//     org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
//     org.apache.commons.math.linear.RealVector var12 = var8.mapPowToSelf(20.0d);
//     double[] var13 = null;
//     org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var8, var13);
// 
//   }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var6.walkInRowOrder(var9, 0, 100, 0, 1073741824);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException((-1));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(0, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


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
    int var23 = var19.getRowDimension();
    org.apache.commons.math.linear.RealMatrixChangingVisitor var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var29 = var19.walkInColumnOrder(var24, 1, 1073741824, 0, 100);
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
    assertTrue(var23 == 1);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


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
      double[] var26 = var19.getColumn(10);
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
    assertTrue(var24 == 1.0d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var2 = var0.parse("Maximal number of iterations ({0}) exceeded");
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.apache.commons.math.optimization.linear.UnboundedSolutionException var0 = new org.apache.commons.math.optimization.linear.UnboundedSolutionException();

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    double var10 = var8.getNorm();
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var13 = var12.getData();
    double[] var14 = var12.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var15 = var8.solve(var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


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
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var24 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var22, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var20, var22);
    double var26 = var25.getNorm();
    org.apache.commons.math.linear.RealMatrix var27 = var18.outerProduct(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var28 = var9.outerProduct((org.apache.commons.math.linear.RealVector)var18);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0d), (-1.2074402543612646d), 12.543080634815244d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


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
    org.apache.commons.math.linear.RealVector var19 = var17.mapLog10ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var22, var24);
    org.apache.commons.math.linear.RealVector var28 = var27.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var29 = var27.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var30 = var27.mapUlp();
    java.lang.Double[] var32 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var33 = new org.apache.commons.math.linear.ArrayRealVector(var32);
    org.apache.commons.math.linear.RealVector var34 = var33.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var33);
    boolean var36 = var27.equals((java.lang.Object)var33);
    org.apache.commons.math.linear.RealVector var38 = var27.mapSubtractToSelf(Double.POSITIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setSubVector(100, var38);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, (-100L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


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
    org.apache.commons.math.linear.RealVector var31 = var12.mapTan();
    
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

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(49.73451754256331d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


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
    org.apache.commons.math.linear.RealVector var18 = var12.mapPowToSelf(1.3440585709080678E43d);
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var22 = var21.getData();
    org.apache.commons.math.linear.RealVector var23 = var21.mapSignum();
    org.apache.commons.math.linear.RealVector var24 = var21.mapExp();
    org.apache.commons.math.linear.RealVector var25 = var21.mapCoshToSelf();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.set(1073741824, var21);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


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
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
    org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var16, var20);
    java.lang.String var28 = org.apache.commons.math.linear.RealVectorFormat.formatRealVector((org.apache.commons.math.linear.RealVector)var27);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "{1}"+ "'", var28.equals("{1}"));

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1073741824, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1715.7021615142228d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var25 = var19.getEntry(100, 100);
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

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-0.6853722608524322d), 1715.7021615142228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.Relationship var1 = org.apache.commons.math.optimization.linear.Relationship.valueOf("{}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.0d, 1073741824);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    org.apache.commons.math.linear.RealVectorFormat var0 = new org.apache.commons.math.linear.RealVectorFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.parseObject("Array2DRowRealMatrix{{1.0}}");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.apache.commons.math.optimization.linear.SimplexSolver var0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    int var1 = var0.getMaxIterations();
    var0.setMaxIterations(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


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
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var28 = var27.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var29 = var27.mapAsin();
    org.apache.commons.math.linear.RealVector var30 = var27.mapCbrt();
    org.apache.commons.math.linear.RealVector var31 = var27.mapUlp();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var32 = var8.preMultiply((org.apache.commons.math.linear.RealVector)var27);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
//     org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
//     double[][] var6 = new double[][] { var1};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
//     double[] var10 = var8.getRow(0);
//     double[] var11 = null;
//     boolean var12 = org.apache.commons.math.util.MathUtils.equals(var10, var11);
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var11);
// 
//   }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


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
    org.apache.commons.math.linear.RealMatrixChangingVisitor var61 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var66 = var8.walkInRowOrder(var61, 1, 0, 0, 1079574528);
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

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


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
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var20 = var19.mapLog10();
    org.apache.commons.math.linear.RealVector var21 = var19.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var24 = var23.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var25 = var23.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var23, false);
    org.apache.commons.math.linear.RealVector var28 = var19.subtract((org.apache.commons.math.linear.RealVector)var27);
    double[] var29 = var19.getDataRef();
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var31 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var29, 1.3440585709080678E43d);
    double var32 = var12.getDistance(var29);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);

  }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     java.lang.IllegalArgumentException var1 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var0);
// 
//   }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


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
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
    org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var16, var20);
    org.apache.commons.math.linear.RealVector var28 = var27.mapSqrtToSelf();
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var5 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var4);
    java.lang.Object[] var8 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5, "", var8);
    java.text.ParseException var10 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var8);
    org.apache.commons.math.optimization.OptimizationException var11 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var10);
    org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var11);
    java.lang.RuntimeException var13 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var12);
    java.lang.RuntimeException var14 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


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
    org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
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
    org.apache.commons.math.linear.RealMatrix var48 = var8.solve((org.apache.commons.math.linear.RealMatrix)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var50 = var42.getColumnVector(1079574528);
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
    assertNotNull(var48);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-10L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.linear.RealVector var5 = var1.mapTan();
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var36 = var1.dotProduct(var26);
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
    assertNotNull(var5);
    
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

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.apache.commons.math.optimization.GoalType[] var2 = org.apache.commons.math.optimization.GoalType.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.ParseException var3 = org.apache.commons.math.MathRuntimeException.createParseException(1073741824, "Array2DRowRealMatrix{{1.0}}", (java.lang.Object[])var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "; ");
// 
//   }

  public void test419() {}
//   public void test419() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
//     java.lang.String var4 = var1.toString();
//     org.apache.commons.math.linear.ArrayRealVector var5 = null;
//     org.apache.commons.math.linear.ArrayRealVector var6 = var1.add(var5);
// 
//   }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


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
    int var23 = var19.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var19.addToEntry(10, 101, 0.03933967394071772d);
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
    assertTrue(var23 == 1);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    double var9 = var8.getFrobeniusNorm();
    org.apache.commons.math.linear.RealMatrix var10 = var8.transpose();
    int var11 = var8.getColumnDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var13 = var8.getColumnVector(10);
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

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.RealMatrix var12 = var3.transpose();
    java.lang.String var13 = var3.toString();
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var24 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 0.0d);
    double[][] var25 = new double[][] { var20};
    org.apache.commons.math.linear.Array2DRowRealMatrix var27 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var25, true);
    double var28 = var27.getFrobeniusNorm();
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var35 = new org.apache.commons.math.optimization.RealPointValuePair(var31, 0.0d);
    double[][] var36 = new double[][] { var31};
    org.apache.commons.math.linear.Array2DRowRealMatrix var38 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var36, true);
    double var39 = var38.getFrobeniusNorm();
    var27.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var38);
    org.apache.commons.math.linear.RealMatrix var41 = var38.inverse();
    int var42 = var38.getRowDimension();
    double[][] var43 = var38.getData();
    java.util.NoSuchElementException var44 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("}", (java.lang.Object[])var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.copySubMatrix(1079574528, 10, 101, 1073741824, var43);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Array2DRowRealMatrix{{0.0},{-1.0}}"+ "'", var13.equals("Array2DRowRealMatrix{{0.0},{-1.0}}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


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
    org.apache.commons.math.linear.RealMatrix var22 = var8.transpose();
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
    org.apache.commons.math.linear.RealMatrix var48 = var8.solve((org.apache.commons.math.linear.RealMatrix)var42);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var49 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var54 = var42.walkInColumnOrder(var49, 1079574528, 0, 0, (-1));
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
    assertNotNull(var48);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    double[] var5 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var5, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var5, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var10 = var1.outerProduct(var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-100L), (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10000L);

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "Array2DRowRealMatrix{{0.0},{-1.0}}");
// 
//   }

  public void test427() {}
//   public void test427() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }
// 
// 
//     org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
//     org.apache.commons.math.linear.RealMatrixPreservingVisitor var1 = null;
//     double var2 = var0.walkInRowOrder(var1);
// 
//   }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var6 = null;
    org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var10 = new org.apache.commons.math.optimization.linear.LinearConstraint(var4, 363.7393755555636d, var6, (org.apache.commons.math.linear.RealVector)var8, 10.0d);
    org.apache.commons.math.linear.RealVector var11 = var8.mapExp();
    org.apache.commons.math.linear.RealVector var12 = var8.mapLog();
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var19 = new org.apache.commons.math.linear.ArrayRealVector(var14, var16);
    org.apache.commons.math.optimization.RealPointValuePair var22 = new org.apache.commons.math.optimization.RealPointValuePair(var16, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(var16, true);
    int var25 = var24.getDimension();
    java.lang.Double[] var27 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var27);
    org.apache.commons.math.linear.RealVector var29 = var28.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var28);
    org.apache.commons.math.linear.RealVector var31 = var24.add((org.apache.commons.math.linear.RealVector)var30);
    java.lang.Double[] var33 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var34 = new org.apache.commons.math.linear.ArrayRealVector(var33);
    org.apache.commons.math.linear.ArrayRealVector var35 = var30.projection(var34);
    double[] var36 = var34.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var37 = var8.add(var36);
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    double[] var5 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var5, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var5, 0.0d);
    double[][] var10 = new double[][] { var5};
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var10, true);
    double var13 = var12.getFrobeniusNorm();
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var16, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var20 = new org.apache.commons.math.optimization.RealPointValuePair(var16, 0.0d);
    double[][] var21 = new double[][] { var16};
    org.apache.commons.math.linear.Array2DRowRealMatrix var23 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var21, true);
    double var24 = var23.getFrobeniusNorm();
    var12.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var23);
    org.apache.commons.math.linear.RealMatrix var26 = var23.inverse();
    org.apache.commons.math.linear.RealMatrix var29 = var23.createMatrix(100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowMatrix(1079574528, (org.apache.commons.math.linear.RealMatrix)var23);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var0 = new org.apache.commons.math.linear.Array2DRowRealMatrix();
    int var1 = var0.getRowDimension();
    int var2 = var0.getRowDimension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var3 = var0.transpose();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, (-0.7d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapLog10();
    org.apache.commons.math.linear.RealVector var3 = var1.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var6 = var5.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var5, false);
    org.apache.commons.math.linear.RealVector var10 = var1.subtract((org.apache.commons.math.linear.RealVector)var9);
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
    org.apache.commons.math.linear.RealVector var28 = var24.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.set(1079574528, var24);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
    assertNotNull(var10);
    
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

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    java.lang.String var8 = var6.toString();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRint();
    org.apache.commons.math.linear.RealVector var10 = var6.mapAbsToSelf();
    boolean var11 = var6.isInfinite();
    org.apache.commons.math.linear.RealVector var13 = var6.mapAdd(1.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    double var13 = var12.getL1Norm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test436() {}
//   public void test436() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.RealVector var4 = var1.mapCbrt();
//     org.apache.commons.math.linear.RealVector var5 = var1.mapUlp();
//     org.apache.commons.math.linear.RealVector var6 = var1.mapRint();
//     org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var10 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var10, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var8, var10);
//     org.apache.commons.math.linear.RealVector var14 = var8.mapRint();
//     org.apache.commons.math.linear.RealVector var15 = var8.mapCoshToSelf();
//     org.apache.commons.math.linear.RealVector var16 = var8.mapLog();
//     org.apache.commons.math.linear.ArrayRealVector var17 = var1.ebeMultiply(var8);
//     double[] var18 = null;
//     org.apache.commons.math.linear.RealVector var19 = var8.add(var18);
// 
//   }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(100);
    int var2 = var1.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


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
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
    org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var16, var20);
    org.apache.commons.math.linear.ArrayRealVector var28 = new org.apache.commons.math.linear.ArrayRealVector(var16);
    org.apache.commons.math.linear.ArrayRealVector var30 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var32 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var34 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var32, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var30, var32);
    org.apache.commons.math.linear.RealVector var36 = var35.mapCoshToSelf();
    java.lang.String var37 = var35.toString();
    org.apache.commons.math.linear.RealVector var39 = var35.mapAddToSelf(10.0d);
    org.apache.commons.math.linear.RealVector var40 = var35.mapLog10();
    org.apache.commons.math.linear.ArrayRealVector var42 = new org.apache.commons.math.linear.ArrayRealVector(var35, false);
    org.apache.commons.math.linear.RealVector var43 = var42.mapLog1p();
    org.apache.commons.math.linear.ArrayRealVector var44 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var45 = var28.projection(var44);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "{1.54}"+ "'", var37.equals("{1.54}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    double[][] var9 = var6.getDataRef();
    org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var17 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var18 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var14, "", var17);
    java.lang.String var19 = var14.toString();
    org.apache.commons.math.linear.Array2DRowRealMatrix var24 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var25 = var24.getDataRef();
    java.lang.ArrayIndexOutOfBoundsException var26 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("Convergence failed", (java.lang.Object[])var25);
    org.apache.commons.math.ConvergenceException var27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var14, "; ", (java.lang.Object[])var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.copySubMatrix((-1), 0, 1079574528, 0, var25);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var19.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.RealMatrix var9 = var8.copy();
    org.apache.commons.math.linear.RealMatrixPreservingVisitor var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var8.walkInColumnOrder(var10, 0, 1073741824, 1, 100);
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

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    java.text.NumberFormat var0 = null;
    org.apache.commons.math.linear.RealVectorFormat var1 = new org.apache.commons.math.linear.RealVectorFormat(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.parseObject("Array2DRowRealMatrix{{0.0},{-1.0}}");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAcos();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    org.apache.commons.math.linear.RealVector var11 = var10.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var12 = var10.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var13 = var10.mapUlp();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var1.getDistance(var13);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var5 = new org.apache.commons.math.optimization.RealPointValuePair(var1, 0.0d);
    double[][] var6 = new double[][] { var1};
    org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6, true);
    org.apache.commons.math.linear.RealMatrix var9 = var8.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var11 = var8.getRowMatrix(100);
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

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var1, 1.0d);
    double[] var6 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var7 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var6);
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var11, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(var9, var11);
    double[] var15 = var7.operate(var11);
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(var11);
    org.apache.commons.math.optimization.linear.Relationship var18 = null;
    double[] var21 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var22 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var21);
    org.apache.commons.math.linear.ArrayRealVector var24 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var29 = new org.apache.commons.math.linear.ArrayRealVector(var24, var26);
    double[] var30 = var22.operate(var26);
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(var26);
    org.apache.commons.math.optimization.linear.LinearConstraint var33 = new org.apache.commons.math.optimization.linear.LinearConstraint(var11, 50.0d, var18, var26, 2.302585092994046d);
    double var34 = var3.getValue(var26);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var38 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var40 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var38, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var41 = new org.apache.commons.math.linear.ArrayRealVector(var36, var38);
    org.apache.commons.math.linear.RealVector var42 = var41.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var43 = var41.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var44 = var41.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var47 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var48 = var47.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var49 = var47.mapLog1p();
    var41.setSubVector(0, (org.apache.commons.math.linear.RealVector)var47);
    org.apache.commons.math.linear.RealVector var51 = var47.mapCosh();
    org.apache.commons.math.linear.RealVector var52 = var47.mapExpm1();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var53 = var3.getValue((org.apache.commons.math.linear.RealVector)var47);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var50 = var6.preMultiply(var40);
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

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector((-1), 2.302585092994046d);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test449() {}
//   public void test449() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     double[] var2 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
//     double[] var7 = new double[] { 0.0d, (-1.0d)};
//     org.apache.commons.math.linear.Array2DRowRealMatrix var8 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
//     org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
//     double[] var16 = var8.operate(var12);
//     double var17 = org.apache.commons.math.util.MathUtils.distance1(var2, var12);
//     org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var0, var12);
// 
//   }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var26 = var19.getRowMatrix(101);
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

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.302585092994046d, Double.POSITIVE_INFINITY, 0.5430806348152439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(10L, (-1L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }
// 
// 
//     org.apache.commons.math.linear.RealVectorFormat var0 = org.apache.commons.math.linear.RealVectorFormat.getInstance();
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var3 = var2.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var4 = var2.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var8 = var6.mapAsin();
//     org.apache.commons.math.linear.RealVector var9 = var6.mapCbrt();
//     org.apache.commons.math.optimization.linear.Relationship var11 = null;
//     org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.optimization.linear.LinearConstraint var15 = new org.apache.commons.math.optimization.linear.LinearConstraint(var9, 363.7393755555636d, var11, (org.apache.commons.math.linear.RealVector)var13, 10.0d);
//     double var16 = var2.getL1Distance(var13);
//     boolean var17 = var2.isNaN();
//     org.apache.commons.math.linear.RealVector var18 = var2.mapCeilToSelf();
//     java.lang.StringBuffer var19 = null;
//     java.text.FieldPosition var20 = null;
//     java.lang.StringBuffer var21 = var0.format((org.apache.commons.math.linear.RealVector)var2, var19, var20);
// 
//   }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var3 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
//     java.lang.String var8 = var6.toString();
//     org.apache.commons.math.linear.RealVector var10 = var6.mapAddToSelf(10.0d);
//     org.apache.commons.math.linear.RealVector var11 = var6.mapLog10();
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var13 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction((org.apache.commons.math.linear.RealVector)var6, 363.7393755555636d);
//     double[] var14 = null;
//     org.apache.commons.math.linear.RealMatrix var15 = var6.outerProduct(var14);
// 
//   }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var5, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var9 = new org.apache.commons.math.optimization.RealPointValuePair(var5, 0.0d);
    double[][] var10 = new double[][] { var5};
    org.apache.commons.math.linear.Array2DRowRealMatrix var12 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var10, true);
    org.apache.commons.math.linear.RealMatrix var13 = var12.copy();
    double[] var15 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var17 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var15, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var19 = new org.apache.commons.math.optimization.RealPointValuePair(var15, 0.0d);
    double[][] var20 = new double[][] { var15};
    org.apache.commons.math.linear.Array2DRowRealMatrix var22 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var20, true);
    double var23 = var22.getFrobeniusNorm();
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var28 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var26, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var30 = new org.apache.commons.math.optimization.RealPointValuePair(var26, 0.0d);
    double[][] var31 = new double[][] { var26};
    org.apache.commons.math.linear.Array2DRowRealMatrix var33 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var31, true);
    double var34 = var33.getFrobeniusNorm();
    var22.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var33);
    org.apache.commons.math.linear.RealMatrix var36 = var22.transpose();
    double[] var38 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var40 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var38, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var42 = new org.apache.commons.math.optimization.RealPointValuePair(var38, 0.0d);
    double[][] var43 = new double[][] { var38};
    org.apache.commons.math.linear.Array2DRowRealMatrix var45 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var43, true);
    double var46 = var45.getFrobeniusNorm();
    double[] var49 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var51 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var49, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var53 = new org.apache.commons.math.optimization.RealPointValuePair(var49, 0.0d);
    double[][] var54 = new double[][] { var49};
    org.apache.commons.math.linear.Array2DRowRealMatrix var56 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var54, true);
    double var57 = var56.getFrobeniusNorm();
    var45.setRowMatrix(0, (org.apache.commons.math.linear.RealMatrix)var56);
    org.apache.commons.math.linear.RealMatrix var59 = var56.inverse();
    int var60 = var56.getRowDimension();
    double[][] var61 = var56.getData();
    org.apache.commons.math.linear.RealMatrix var62 = var22.solve((org.apache.commons.math.linear.RealMatrix)var56);
    org.apache.commons.math.linear.RealMatrix var63 = var12.preMultiply((org.apache.commons.math.linear.RealMatrix)var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setRowMatrix(0, var63);
      fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException");
    } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var3, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var1, var3);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var9 = var6.mapRintToSelf();
    org.apache.commons.math.linear.RealVector var11 = var6.mapSubtractToSelf(0.5430806348152439d);
    double[] var12 = var6.getData();
    org.apache.commons.math.linear.ArrayRealVector var14 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var15 = var14.mapLog10();
    org.apache.commons.math.linear.RealVector var16 = var14.mapExpm1ToSelf();
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var19 = var18.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var20 = var18.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var22 = new org.apache.commons.math.linear.ArrayRealVector(var18, false);
    org.apache.commons.math.linear.RealVector var23 = var14.subtract((org.apache.commons.math.linear.RealVector)var22);
    double[] var24 = var14.getDataRef();
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var26 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var24, 1.3440585709080678E43d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var24);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.RealVector var7 = var5.mapLog1pToSelf();
    org.apache.commons.math.linear.RealVector var9 = var5.mapSubtractToSelf(2.9066992099956157d);
    org.apache.commons.math.linear.RealVector var10 = var5.mapLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealVector var13 = var5.getSubVector(0, 1073741824);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test460() {}
//   public void test460() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }
// 
// 
//     org.apache.commons.math.linear.RealVector var0 = null;
//     org.apache.commons.math.optimization.linear.Relationship var2 = null;
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var5 = var4.mapLog10();
//     org.apache.commons.math.linear.RealVector var6 = var4.mapExpm1ToSelf();
//     org.apache.commons.math.linear.RealVector var7 = var4.mapFloor();
//     org.apache.commons.math.optimization.linear.LinearConstraint var9 = new org.apache.commons.math.optimization.linear.LinearConstraint(var0, 0.0d, var2, var7, 49.58011019658426d);
// 
//   }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var0, var5);
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.5430806348152439d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5430806348152439d);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


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
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(var17);
    boolean var19 = var1.equals((java.lang.Object)var17);
    
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
    assertTrue(var19 == false);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(101, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    java.lang.Double[] var1 = new java.lang.Double[] { 49.73451754256331d};
    org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(var1);
    org.apache.commons.math.linear.RealVector var3 = var2.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector)var2);
    org.apache.commons.math.linear.RealVector var5 = var2.mapAbs();
    org.apache.commons.math.linear.RealVector var6 = var2.mapExp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    java.lang.Object[] var5 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var6 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var5);
    java.lang.Object[] var9 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var6, "", var9);
    java.text.ParseException var11 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var9);
    org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var9);
    org.apache.commons.math.optimization.OptimizationException var13 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var12);
    org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var13);
    java.lang.Object[] var20 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var20);
    java.lang.Object[] var24 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var21, "", var24);
    org.apache.commons.math.optimization.OptimizationException var26 = new org.apache.commons.math.optimization.OptimizationException((java.lang.Throwable)var25);
    java.lang.Object[] var27 = var25.getArguments();
    org.apache.commons.math.MaxIterationsExceededException var28 = new org.apache.commons.math.MaxIterationsExceededException(1079574528, "hi!", var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.ConvergenceException var29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var13, "Array2DRowRealMatrix{{1.0}}", var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 10000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10000L);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-10L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1000L));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800L);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.9957901442164848d, 101, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var2 = var1.getData();
    org.apache.commons.math.linear.RealVector var3 = var1.mapSignum();
    double[] var4 = var1.toArray();
    org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var7 = var6.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var8 = var6.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var6, false);
    org.apache.commons.math.linear.RealVector var12 = var10.mapDivideToSelf(0.0d);
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(var1, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEntry(10, 50.0d);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.543080634815244d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4463520074491627d);

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     java.text.NumberFormat var0 = null;
//     org.apache.commons.math.linear.RealVectorFormat var1 = new org.apache.commons.math.linear.RealVectorFormat(var0);
//     java.lang.String var2 = var1.getSeparator();
//     org.apache.commons.math.linear.ArrayRealVector var4 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double[] var6 = new double[] { 1.0d};
//     org.apache.commons.math.optimization.linear.LinearObjectiveFunction var8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var6, 1.0d);
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var4, var6);
//     org.apache.commons.math.linear.RealVector var10 = var9.mapCoshToSelf();
//     java.lang.String var11 = var9.toString();
//     org.apache.commons.math.linear.RealVector var13 = var9.mapAddToSelf(10.0d);
//     java.text.AttributedCharacterIterator var14 = var1.formatToCharacterIterator((java.lang.Object)var13);
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    java.lang.Object[] var8 = new java.lang.Object[] { ' '};
    java.lang.IllegalArgumentException var9 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("hi!", var8);
    java.lang.Object[] var12 = new java.lang.Object[] { 10L};
    org.apache.commons.math.ConvergenceException var13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var9, "", var12);
    java.text.ParseException var14 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "org.apache.commons.math.ConvergenceException: Convergence failed", var12);
    org.apache.commons.math.ConvergenceException var15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", var12);
    org.apache.commons.math.optimization.OptimizationException var16 = new org.apache.commons.math.optimization.OptimizationException("", var12);
    org.apache.commons.math.linear.InvalidMatrixException var17 = new org.apache.commons.math.linear.InvalidMatrixException("", var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ConcurrentModificationException var18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("{}", var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(100.0d, (-0.7403039210812912d), 363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.5430806348152439d, 1.543080634815244d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5430806348152439d);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


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
    boolean var16 = var12.isInfinite();
    
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
    assertTrue(var16 == false);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    org.apache.commons.math.optimization.GoalType[] var1 = org.apache.commons.math.optimization.GoalType.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException("{1.54}", (java.lang.Object[])var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var3 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var2);
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var7 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var7, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(var5, var7);
    double[] var11 = var3.operate(var7);
    org.apache.commons.math.linear.ArrayRealVector var12 = new org.apache.commons.math.linear.ArrayRealVector(var7);
    org.apache.commons.math.optimization.linear.Relationship var14 = null;
    double[] var17 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var18 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var17);
    org.apache.commons.math.linear.ArrayRealVector var20 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var24 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var22, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var25 = new org.apache.commons.math.linear.ArrayRealVector(var20, var22);
    double[] var26 = var18.operate(var22);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var22);
    org.apache.commons.math.optimization.linear.LinearConstraint var29 = new org.apache.commons.math.optimization.linear.LinearConstraint(var7, 50.0d, var14, var22, 2.302585092994046d);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var33 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var31, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var35 = new org.apache.commons.math.optimization.RealPointValuePair(var31, 0.0d);
    double[][] var36 = new double[][] { var31};
    org.apache.commons.math.linear.Array2DRowRealMatrix var38 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var36, true);
    boolean var39 = var29.equals((java.lang.Object)var38);
    double[] var41 = var38.getColumn(0);
    org.apache.commons.math.linear.RealMatrixChangingVisitor var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var47 = var38.walkInColumnOrder(var42, (-1), 1073741824, 1079574528, 10);
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(2.0d, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.0706024009129176E30d);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    org.apache.commons.math.linear.Array2DRowRealMatrix var2 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[] var5 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var6 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var5);
    double var7 = var6.getNorm();
    boolean var8 = var2.equals((java.lang.Object)var6);
    org.apache.commons.math.linear.ArrayRealVector var10 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var12, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var15 = new org.apache.commons.math.linear.ArrayRealVector(var10, var12);
    org.apache.commons.math.linear.RealVector var16 = var15.mapCoshToSelf();
    org.apache.commons.math.linear.RealVector var17 = var15.mapAtanToSelf();
    org.apache.commons.math.linear.RealVector var18 = var15.mapUlp();
    org.apache.commons.math.linear.ArrayRealVector var21 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var22 = var21.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var23 = var21.mapLog1p();
    var15.setSubVector(0, (org.apache.commons.math.linear.RealVector)var21);
    double[] var25 = var21.getData();
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var29 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var31 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var29, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var32 = new org.apache.commons.math.linear.ArrayRealVector(var27, var29);
    org.apache.commons.math.optimization.RealPointValuePair var35 = new org.apache.commons.math.optimization.RealPointValuePair(var29, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var36 = new org.apache.commons.math.linear.ArrayRealVector(var25, var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var37 = var2.solve(var29);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var4 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var2, 1.0d);
    org.apache.commons.math.optimization.RealPointValuePair var6 = new org.apache.commons.math.optimization.RealPointValuePair(var2, 0.0d);
    double[][] var7 = new double[][] { var2};
    org.apache.commons.math.linear.Array2DRowRealMatrix var9 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7, true);
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var7);
    org.apache.commons.math.MathException var11 = new org.apache.commons.math.MathException("{1}", (java.lang.Object[])var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1000L), 1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    org.apache.commons.math.linear.NonSquareMatrixException var2 = new org.apache.commons.math.linear.NonSquareMatrixException(101, (-1));

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var6 = var1.mapTan();
    org.apache.commons.math.linear.RealVector var7 = var1.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
    org.apache.commons.math.linear.RealVector var11 = var1.mapMultiply((-1.0d));
    org.apache.commons.math.linear.ArrayRealVector var13 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var14 = var13.mapSinhToSelf();
    org.apache.commons.math.linear.ArrayRealVector var16 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var17 = var16.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var18 = var16.mapAsin();
    org.apache.commons.math.linear.RealVector var19 = var16.mapCbrt();
    org.apache.commons.math.optimization.linear.Relationship var21 = null;
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.optimization.linear.LinearConstraint var25 = new org.apache.commons.math.optimization.linear.LinearConstraint(var19, 363.7393755555636d, var21, (org.apache.commons.math.linear.RealVector)var23, 10.0d);
    org.apache.commons.math.linear.RealVector var26 = var23.mapExp();
    org.apache.commons.math.linear.RealVector var27 = var13.projection((org.apache.commons.math.linear.RealVector)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.linear.RealMatrix var28 = var1.outerProduct(var13);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.apache.commons.math.linear.RealVectorFormat var1 = org.apache.commons.math.linear.RealVectorFormat.getInstance(var0);
// 
//   }

  public void test488() {}
//   public void test488() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var1 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var2 = var1.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var3 = var1.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var5 = new org.apache.commons.math.linear.ArrayRealVector(var1, false);
//     org.apache.commons.math.linear.RealVector var6 = var5.mapLog1pToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var8 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double var9 = var5.dotProduct((org.apache.commons.math.linear.RealVector)var8);
//     org.apache.commons.math.linear.RealVector var11 = var8.append(0.9957901442164848d);
//     org.apache.commons.math.linear.RealVector var13 = var8.mapSubtract((-1.2074402543612646d));
//     org.apache.commons.math.linear.RealVector var15 = var8.mapDivideToSelf((-1.2074402543612646d));
//     org.apache.commons.math.linear.RealVector var16 = null;
//     double var17 = var8.getDistance(var16);
// 
//   }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


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
    org.apache.commons.math.linear.RealVector var41 = var2.mapSqrtToSelf();
    org.apache.commons.math.linear.RealVector var42 = var2.mapLog();
    org.apache.commons.math.linear.ArrayRealVector var45 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var47 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var49 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var47, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var50 = new org.apache.commons.math.linear.ArrayRealVector(var45, var47);
    org.apache.commons.math.linear.RealVector var51 = var50.mapSignum();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.set(101, var50);
      fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


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
    org.apache.commons.math.linear.ArrayRealVector var18 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var22 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var20, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var23 = new org.apache.commons.math.linear.ArrayRealVector(var18, var20);
    org.apache.commons.math.optimization.RealPointValuePair var26 = new org.apache.commons.math.optimization.RealPointValuePair(var20, 1.0d, true);
    org.apache.commons.math.linear.ArrayRealVector var27 = new org.apache.commons.math.linear.ArrayRealVector(var16, var20);
    org.apache.commons.math.optimization.linear.Relationship var29 = null;
    org.apache.commons.math.linear.ArrayRealVector var31 = new org.apache.commons.math.linear.ArrayRealVector(0);
    org.apache.commons.math.linear.RealVector var32 = var31.mapCosToSelf();
    org.apache.commons.math.linear.RealVector var33 = var31.mapAsin();
    org.apache.commons.math.linear.ArrayRealVector var35 = new org.apache.commons.math.linear.ArrayRealVector(var31, false);
    org.apache.commons.math.linear.RealVector var36 = var31.mapTan();
    org.apache.commons.math.linear.RealVector var37 = var31.mapLogToSelf();
    org.apache.commons.math.linear.ArrayRealVector var39 = new org.apache.commons.math.linear.ArrayRealVector(var31, false);
    org.apache.commons.math.linear.RealVector var41 = var31.mapMultiply((-1.0d));
    org.apache.commons.math.linear.RealVector var42 = var31.mapInvToSelf();
    double[] var45 = new double[] { 0.0d, (-1.0d)};
    org.apache.commons.math.linear.Array2DRowRealMatrix var46 = new org.apache.commons.math.linear.Array2DRowRealMatrix(var45);
    org.apache.commons.math.linear.ArrayRealVector var48 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var50 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var52 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var50, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var53 = new org.apache.commons.math.linear.ArrayRealVector(var48, var50);
    double[] var54 = var46.operate(var50);
    org.apache.commons.math.linear.ArrayRealVector var56 = new org.apache.commons.math.linear.ArrayRealVector(0);
    double[] var58 = new double[] { 1.0d};
    org.apache.commons.math.optimization.linear.LinearObjectiveFunction var60 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(var58, 1.0d);
    org.apache.commons.math.linear.ArrayRealVector var61 = new org.apache.commons.math.linear.ArrayRealVector(var56, var58);
    org.apache.commons.math.linear.ArrayRealVector var62 = new org.apache.commons.math.linear.ArrayRealVector(var54, var58);
    org.apache.commons.math.linear.ArrayRealVector var63 = new org.apache.commons.math.linear.ArrayRealVector(var31, var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.optimization.linear.LinearConstraint var65 = new org.apache.commons.math.optimization.linear.LinearConstraint(var16, (-0.7d), var29, var58, 50.0d);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    org.apache.commons.math.ConvergenceException var0 = new org.apache.commons.math.ConvergenceException();
    java.lang.Object[] var3 = new java.lang.Object[] { 0};
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "", var3);
    java.lang.String var5 = var0.toString();
    org.apache.commons.math.linear.Array2DRowRealMatrix var10 = new org.apache.commons.math.linear.Array2DRowRealMatrix(10, 100);
    double[][] var11 = var10.getDataRef();
    java.lang.ArrayIndexOutOfBoundsException var12 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("Convergence failed", (java.lang.Object[])var11);
    org.apache.commons.math.ConvergenceException var13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var0, "; ", (java.lang.Object[])var11);
    java.lang.Throwable[] var14 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed"+ "'", var5.equals("org.apache.commons.math.ConvergenceException: Convergence failed"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


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
    org.apache.commons.math.optimization.linear.Relationship var61 = null;
    org.apache.commons.math.optimization.linear.LinearConstraint var63 = new org.apache.commons.math.optimization.linear.LinearConstraint(var60, var61, 0.03933967394071772d);
    
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

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1079574528, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1732.4286165853446d);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.9957901442164848d, 2.302585092994046d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9957901442164848d);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 101);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 368.35449607240486d);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test499() {}
//   public void test499() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }
// 
// 
//     org.apache.commons.math.linear.ArrayRealVector var0 = null;
//     org.apache.commons.math.linear.ArrayRealVector var2 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     org.apache.commons.math.linear.RealVector var3 = var2.mapCosToSelf();
//     org.apache.commons.math.linear.RealVector var4 = var2.mapAsin();
//     org.apache.commons.math.linear.ArrayRealVector var6 = new org.apache.commons.math.linear.ArrayRealVector(var2, false);
//     org.apache.commons.math.linear.RealVector var7 = var6.mapLog1pToSelf();
//     org.apache.commons.math.linear.ArrayRealVector var9 = new org.apache.commons.math.linear.ArrayRealVector(0);
//     double var10 = var6.dotProduct((org.apache.commons.math.linear.RealVector)var9);
//     org.apache.commons.math.linear.RealVector var12 = var9.append(0.9957901442164848d);
//     org.apache.commons.math.linear.RealVector var14 = var9.mapSubtract((-1.2074402543612646d));
//     org.apache.commons.math.linear.RealVector var16 = var9.mapDivideToSelf((-1.2074402543612646d));
//     org.apache.commons.math.linear.ArrayRealVector var17 = new org.apache.commons.math.linear.ArrayRealVector(var0, var9);
// 
//   }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    java.lang.Object[] var4 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.MathRuntimeException var5 = new org.apache.commons.math.MathRuntimeException("hi!", var4);
    java.lang.NullPointerException var6 = org.apache.commons.math.MathRuntimeException.createNullPointerException("hi!", var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ConcurrentModificationException var7 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("Array2DRowRealMatrix{{0.0},{-1.0}}", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}

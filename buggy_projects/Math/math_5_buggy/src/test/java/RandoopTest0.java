
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var4 = var1.pow(var3);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var21.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    boolean var7 = var4.equals((java.lang.Object)(-1L));
    org.apache.commons.math3.complex.Complex var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var9 = var4.add(var8);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var3 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var2);
//     java.lang.String var4 = var3.toString();
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     org.apache.commons.math3.exception.NullArgumentException var0 = new org.apache.commons.math3.exception.NullArgumentException();
//     java.lang.Throwable var1 = null;
//     var0.addSuppressed(var1);
// 
//   }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     boolean var14 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var17 = var16.isInfinite();
//     org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var20 = var16.divide(var19);
//     org.apache.commons.math3.complex.Complex var21 = var12.subtract(var16);
//     org.apache.commons.math3.complex.Complex var23 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var24 = var23.sqrt();
//     org.apache.commons.math3.complex.Complex var25 = var21.multiply(var24);
//     
//     // Checks the contract:  equals-hashcode on var23 and var25
//     assertTrue("Contract failed: equals-hashcode on var23 and var25", var23.equals(var25) ? var23.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var25
//     assertTrue("Contract failed: equals-hashcode on var24 and var25", var24.equals(var25) ? var24.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var23
//     assertTrue("Contract failed: equals-hashcode on var25 and var23", var25.equals(var23) ? var25.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var24
//     assertTrue("Contract failed: equals-hashcode on var25 and var24", var25.equals(var24) ? var25.hashCode() == var24.hashCode() : true);
// 
//   }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var7 and var8
//     assertTrue("Contract failed: equals-hashcode on var7 and var8", var7.equals(var8) ? var7.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var7
//     assertTrue("Contract failed: equals-hashcode on var8 and var7", var8.equals(var7) ? var8.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var3);
//     org.apache.commons.math3.exception.NullArgumentException var5 = new org.apache.commons.math3.exception.NullArgumentException(var0, var3);
//     java.lang.Throwable[] var6 = var5.getSuppressed();
//     java.lang.String var7 = var5.toString();
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = var5.multiply(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(byte)1);
//     java.lang.String var3 = var2.toString();
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     double var6 = var5.getReal();
//     double var7 = var5.getReal();
//     org.apache.commons.math3.complex.Complex var8 = var5.reciprocal();
//     
//     // Checks the contract:  equals-hashcode on var5 and var8
//     assertTrue("Contract failed: equals-hashcode on var5 and var8", var5.equals(var8) ? var5.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var5
//     assertTrue("Contract failed: equals-hashcode on var8 and var5", var8.equals(var5) ? var8.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     boolean var14 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var15 = var12.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var12 and var15
//     assertTrue("Contract failed: equals-hashcode on var12 and var15", var12.equals(var15) ? var12.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var12
//     assertTrue("Contract failed: equals-hashcode on var15 and var12", var15.equals(var12) ? var15.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var12 = var9.multiply(var11);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    double var20 = var19.getReal();
    org.apache.commons.math3.complex.Complex var21 = var19.sqrt();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var19.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.009116265160176875d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var6 = var4.pow(var5);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.acos();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
//     org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
//     org.apache.commons.math3.complex.Complex var8 = var2.negate();
//     org.apache.commons.math3.complex.Complex var9 = var2.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var8 and var9
//     assertTrue("Contract failed: equals-hashcode on var8 and var9", var8.equals(var9) ? var8.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var8
//     assertTrue("Contract failed: equals-hashcode on var9 and var8", var9.equals(var8) ? var9.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     org.apache.commons.math3.complex.Complex var9 = var8.cos();
//     org.apache.commons.math3.complex.Complex var10 = var9.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var9 and var10
//     assertTrue("Contract failed: equals-hashcode on var9 and var10", var9.equals(var10) ? var9.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var9
//     assertTrue("Contract failed: equals-hashcode on var10 and var9", var10.equals(var9) ? var10.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    boolean var12 = var11.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    double var17 = var15.getImaginary();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var15.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     org.apache.commons.math3.complex.Complex var9 = var7.log();
//     org.apache.commons.math3.complex.Complex var10 = var7.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var7 and var10
//     assertTrue("Contract failed: equals-hashcode on var7 and var10", var7.equals(var10) ? var7.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var7
//     assertTrue("Contract failed: equals-hashcode on var10 and var7", var10.equals(var7) ? var10.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var5 = var2.multiply(1);
    org.apache.commons.math3.complex.Complex var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var7 = var2.add(var6);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var17 = var6.atan();
    org.apache.commons.math3.complex.Complex var20 = new org.apache.commons.math3.complex.Complex(1.0d, 6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var21 = var6.pow(var20);
    org.apache.commons.math3.complex.Complex var22 = var6.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.ComplexField var8 = var6.getField();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertTrue("'" + var9 + "' != '" + "(0.8414709848078965, 0.0)"+ "'", var9.equals("(0.8414709848078965, 0.0)"));

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.reciprocal();
//     
//     // Checks the contract:  equals-hashcode on var5 and var12
//     assertTrue("Contract failed: equals-hashcode on var5 and var12", var5.equals(var12) ? var5.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var12
//     assertTrue("Contract failed: equals-hashcode on var8 and var12", var8.equals(var12) ? var8.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var12
//     assertTrue("Contract failed: equals-hashcode on var11 and var12", var11.equals(var12) ? var11.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var5
//     assertTrue("Contract failed: equals-hashcode on var12 and var5", var12.equals(var5) ? var12.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var8
//     assertTrue("Contract failed: equals-hashcode on var12 and var8", var12.equals(var8) ? var12.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var11
//     assertTrue("Contract failed: equals-hashcode on var12 and var11", var12.equals(var11) ? var12.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var11 = var6.pow(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var11.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    double var21 = var20.getImaginary();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var23.tan();
    org.apache.commons.math3.complex.Complex var29 = var23.cosh();
    org.apache.commons.math3.complex.Complex var30 = var20.add(var29);
    org.apache.commons.math3.complex.Complex var31 = var12.multiply(var29);
    org.apache.commons.math3.complex.Complex var33 = var29.subtract(0.0d);
    double var34 = var29.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 11013.232920103323d);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
//     org.apache.commons.math3.complex.Complex var13 = var8.divide(1.0d);
//     org.apache.commons.math3.complex.Complex var14 = var8.reciprocal();
//     
//     // Checks the contract:  equals-hashcode on var5 and var14
//     assertTrue("Contract failed: equals-hashcode on var5 and var14", var5.equals(var14) ? var5.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var14
//     assertTrue("Contract failed: equals-hashcode on var8 and var14", var8.equals(var14) ? var8.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var14
//     assertTrue("Contract failed: equals-hashcode on var11 and var14", var11.equals(var14) ? var11.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var14
//     assertTrue("Contract failed: equals-hashcode on var13 and var14", var13.equals(var14) ? var13.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var5
//     assertTrue("Contract failed: equals-hashcode on var14 and var5", var14.equals(var5) ? var14.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var8
//     assertTrue("Contract failed: equals-hashcode on var14 and var8", var14.equals(var8) ? var14.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var11
//     assertTrue("Contract failed: equals-hashcode on var14 and var11", var14.equals(var11) ? var14.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var13
//     assertTrue("Contract failed: equals-hashcode on var14 and var13", var14.equals(var13) ? var14.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var5 = var4.isInfinite();
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
//     org.apache.commons.math3.complex.Complex var9 = var8.sin();
//     org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
//     org.apache.commons.math3.complex.Complex var11 = var2.tan();
//     org.apache.commons.math3.complex.Complex var12 = var11.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var11 and var12
//     assertTrue("Contract failed: equals-hashcode on var11 and var12", var11.equals(var12) ? var11.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var11
//     assertTrue("Contract failed: equals-hashcode on var12 and var11", var12.equals(var11) ? var12.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var3);
    org.apache.commons.math3.exception.NullArgumentException var5 = new org.apache.commons.math3.exception.NullArgumentException(var0, var3);
    org.apache.commons.math3.exception.util.ExceptionContext var6 = var5.getContext();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d, 10.0d);
    boolean var3 = var2.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var17 = var13.subtract(var16);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
//     org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
//     org.apache.commons.math3.complex.Complex var11 = var10.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var10 and var11
//     assertTrue("Contract failed: equals-hashcode on var10 and var11", var10.equals(var11) ? var10.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var10
//     assertTrue("Contract failed: equals-hashcode on var11 and var10", var11.equals(var10) ? var11.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.ComplexField var20 = var18.getField();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var23 = var22.isInfinite();
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var22.divide(var25);
    org.apache.commons.math3.complex.Complex var27 = var22.tan();
    org.apache.commons.math3.complex.Complex var28 = var22.cosh();
    org.apache.commons.math3.complex.Complex var29 = var22.sqrt1z();
    org.apache.commons.math3.complex.Complex var31 = var22.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var33 = var22.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var34 = var18.add(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var36 = var18.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.9984277357858338d, (java.lang.Number)0.8414709848078965d, true);
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     org.apache.commons.math3.exception.NotPositiveException var7 = new org.apache.commons.math3.exception.NotPositiveException(var5, (java.lang.Number)(short)10);
//     var4.addSuppressed((java.lang.Throwable)var7);
//     java.lang.String var9 = var4.toString();
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.009116265160176875d, 0.8414709848078965d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var1.log();
    org.apache.commons.math3.complex.Complex var15 = var14.exp();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var17.acos();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var20.add(0.0d);
    org.apache.commons.math3.complex.Complex var23 = var18.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var14.add(var18);
    org.apache.commons.math3.complex.Complex var25 = var18.log();
    org.apache.commons.math3.complex.Complex var26 = var25.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var1.sin();
    double var15 = var14.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-0.0d));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var1.log();
    org.apache.commons.math3.complex.Complex var15 = var14.exp();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var17.acos();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var20.add(0.0d);
    org.apache.commons.math3.complex.Complex var23 = var18.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var14.add(var18);
    org.apache.commons.math3.complex.Complex var25 = var18.log();
    org.apache.commons.math3.complex.Complex var27 = var18.multiply(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-0.0d), (java.lang.Number)(byte)10, false);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(byte)0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var8 = var1.multiply(0);
    org.apache.commons.math3.complex.Complex var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var10 = var8.subtract(var9);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    java.lang.String var20 = var18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(10.841470984807897, 0.0)"+ "'", var20.equals("(10.841470984807897, 0.0)"));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    org.apache.commons.math3.complex.ComplexField var22 = var15.getField();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var24 = var15.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var8 = var1.multiply(0);
    org.apache.commons.math3.complex.Complex var10 = var1.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.ComplexField var11 = var1.getField();
    org.apache.commons.math3.complex.Complex var13 = var1.subtract((-0.0d));
    org.apache.commons.math3.complex.Complex var14 = var1.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var14 = var12.cos();
//     boolean var15 = var12.isNaN();
//     org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
//     org.apache.commons.math3.complex.Complex var20 = var17.sin();
//     double var21 = var17.getImaginary();
//     org.apache.commons.math3.complex.Complex var23 = var17.subtract(Double.NaN);
//     org.apache.commons.math3.complex.Complex var24 = var17.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var17 and var24
//     assertTrue("Contract failed: equals-hashcode on var17 and var24", var17.equals(var24) ? var17.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var17
//     assertTrue("Contract failed: equals-hashcode on var24 and var17", var24.equals(var17) ? var24.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var14 = var12.cos();
//     boolean var15 = var12.isNaN();
//     org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
//     org.apache.commons.math3.complex.Complex var22 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var24 = var22.multiply(0);
//     org.apache.commons.math3.complex.Complex var27 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var30 = var29.isInfinite();
//     org.apache.commons.math3.complex.Complex var32 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var33 = var29.divide(var32);
//     org.apache.commons.math3.complex.Complex var34 = var33.sin();
//     org.apache.commons.math3.complex.Complex var35 = var27.add(var34);
//     boolean var36 = var24.equals((java.lang.Object)var35);
//     org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var39 = var38.acos();
//     org.apache.commons.math3.complex.Complex var41 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var43 = var41.add(0.0d);
//     org.apache.commons.math3.complex.Complex var44 = var39.divide(var43);
//     org.apache.commons.math3.complex.Complex var45 = var39.sqrt1z();
//     org.apache.commons.math3.complex.Complex var46 = var35.add(var45);
//     org.apache.commons.math3.complex.Complex var47 = var17.subtract(var35);
//     double var48 = var47.abs();
//     org.apache.commons.math3.complex.Complex var49 = var47.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var24 and var49
//     assertTrue("Contract failed: equals-hashcode on var24 and var49", var24.equals(var49) ? var24.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var47 and var49
//     assertTrue("Contract failed: equals-hashcode on var47 and var49", var47.equals(var49) ? var47.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var24
//     assertTrue("Contract failed: equals-hashcode on var49 and var24", var49.equals(var24) ? var49.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var47
//     assertTrue("Contract failed: equals-hashcode on var49 and var47", var49.equals(var47) ? var49.hashCode() == var47.hashCode() : true);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(8.414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    double var3 = var2.getArgument();
    java.lang.String var4 = var2.toString();
    org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
    double var8 = var7.getArgument();
    java.lang.String var9 = var7.toString();
    org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
    org.apache.commons.math3.complex.Complex var11 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var13 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var14 = var13.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var17 = var13.divide(var16);
    org.apache.commons.math3.complex.Complex var18 = var13.tan();
    org.apache.commons.math3.complex.Complex var19 = var11.pow(var18);
    org.apache.commons.math3.complex.ComplexField var20 = var11.getField();
    java.lang.String var21 = var11.toString();
    org.apache.commons.math3.complex.Complex var22 = var11.sqrt1z();
    double var23 = var22.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0.0, 0.0)"+ "'", var4.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0.0, 0.0)"+ "'", var9.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(1.0, 0.0)"+ "'", var21.equals("(1.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var11 = var6.pow(var10);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var18 = var16.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var19 = var18.log();
    org.apache.commons.math3.complex.Complex var20 = var19.atan();
    org.apache.commons.math3.complex.Complex var21 = var20.atan();
    org.apache.commons.math3.complex.Complex var22 = var6.multiply(var21);
    org.apache.commons.math3.complex.Complex var23 = var22.reciprocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(0.0d, 0.0d);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "(0.0, 0.0)"+ "'", var3.equals("(0.0, 0.0)"));

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var12 = var9.multiply(10);
    double var13 = var9.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.8414709848078965d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    double var6 = var5.getReal();
    double var7 = var5.getReal();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var19.sin();
    org.apache.commons.math3.complex.Complex var21 = var9.multiply(var20);
    org.apache.commons.math3.complex.Complex var22 = var20.cos();
    org.apache.commons.math3.complex.Complex var23 = var22.log();
    org.apache.commons.math3.complex.Complex var24 = var5.subtract(var23);
    org.apache.commons.math3.complex.Complex var25 = var23.negate();
    boolean var26 = var25.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
//     org.apache.commons.math3.complex.Complex var7 = var6.log();
//     org.apache.commons.math3.complex.Complex var8 = var7.atan();
//     org.apache.commons.math3.complex.Complex var10 = var8.pow(1.0d);
//     org.apache.commons.math3.complex.Complex var11 = var8.sinh();
//     double var12 = var11.abs();
//     org.apache.commons.math3.complex.Complex var13 = var11.atan();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
// 
//   }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
//     double var3 = var2.getArgument();
//     java.lang.String var4 = var2.toString();
//     org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
//     double var8 = var7.getArgument();
//     java.lang.String var9 = var7.toString();
//     org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
//     org.apache.commons.math3.complex.Complex var12 = var7.multiply((-1.0d));
//     org.apache.commons.math3.complex.Complex var14 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var15 = var14.isInfinite();
//     org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var18 = var14.divide(var17);
//     org.apache.commons.math3.complex.Complex var19 = var14.tan();
//     double var20 = var19.getImaginary();
//     org.apache.commons.math3.complex.Complex var23 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var26 = var25.isInfinite();
//     org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var29 = var25.divide(var28);
//     org.apache.commons.math3.complex.Complex var30 = var29.sin();
//     org.apache.commons.math3.complex.Complex var31 = var23.add(var30);
//     org.apache.commons.math3.complex.Complex var32 = var19.pow(var31);
//     org.apache.commons.math3.complex.Complex var33 = var31.atan();
//     org.apache.commons.math3.complex.Complex var35 = var33.divide(0.6483608274590866d);
//     java.lang.String var36 = var35.toString();
//     org.apache.commons.math3.complex.Complex var37 = var12.divide(var35);
//     
//     // Checks the contract:  equals-hashcode on var1 and var37
//     assertTrue("Contract failed: equals-hashcode on var1 and var37", var1.equals(var37) ? var1.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var37
//     assertTrue("Contract failed: equals-hashcode on var2 and var37", var2.equals(var37) ? var2.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var37
//     assertTrue("Contract failed: equals-hashcode on var6 and var37", var6.equals(var37) ? var6.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var37
//     assertTrue("Contract failed: equals-hashcode on var7 and var37", var7.equals(var37) ? var7.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var37
//     assertTrue("Contract failed: equals-hashcode on var12 and var37", var12.equals(var37) ? var12.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var1
//     assertTrue("Contract failed: equals-hashcode on var37 and var1", var37.equals(var1) ? var37.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var2
//     assertTrue("Contract failed: equals-hashcode on var37 and var2", var37.equals(var2) ? var37.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var6
//     assertTrue("Contract failed: equals-hashcode on var37 and var6", var37.equals(var6) ? var37.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var7
//     assertTrue("Contract failed: equals-hashcode on var37 and var7", var37.equals(var7) ? var37.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var12
//     assertTrue("Contract failed: equals-hashcode on var37 and var12", var37.equals(var12) ? var37.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.ComplexField var16 = var13.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex((-0.0d), 11013.686910042774d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(byte)10, var2, false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    boolean var7 = var5.isNaN();
    org.apache.commons.math3.complex.Complex var8 = var5.exp();
    org.apache.commons.math3.complex.Complex var9 = var8.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var5.sin();
//     org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
//     org.apache.commons.math3.complex.ComplexField var8 = var6.getField();
//     org.apache.commons.math3.complex.Complex var9 = var6.asin();
//     
//     // Checks the contract:  equals-hashcode on var5 and var9
//     assertTrue("Contract failed: equals-hashcode on var5 and var9", var5.equals(var9) ? var5.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var5
//     assertTrue("Contract failed: equals-hashcode on var9 and var5", var9.equals(var5) ? var9.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var12 = var1.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var13 = var1.cosh();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.009116265160176875d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var17 = var15.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.ComplexField var9 = var8.getField();
    org.apache.commons.math3.complex.Complex var10 = var8.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex((-0.4626307887385793d));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
    org.apache.commons.math3.complex.Complex var21 = var16.exp();
    org.apache.commons.math3.complex.Complex var22 = var21.cos();
    org.apache.commons.math3.complex.Complex var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var24 = var21.multiply(var23);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var3.add(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var1.subtract(var3);
    org.apache.commons.math3.complex.Complex var7 = var1.sinh();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = var10.multiply(0);
    org.apache.commons.math3.complex.Complex var15 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var18 = var17.isInfinite();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var21 = var17.divide(var20);
    org.apache.commons.math3.complex.Complex var22 = var21.sin();
    org.apache.commons.math3.complex.Complex var23 = var15.add(var22);
    boolean var24 = var12.equals((java.lang.Object)var23);
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var26.acos();
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var31 = var29.add(0.0d);
    org.apache.commons.math3.complex.Complex var32 = var27.divide(var31);
    org.apache.commons.math3.complex.Complex var33 = var27.sqrt1z();
    org.apache.commons.math3.complex.Complex var34 = var23.add(var33);
    org.apache.commons.math3.complex.Complex var35 = var7.pow(var23);
    double var36 = var35.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(byte)100);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var5 = var4.log();
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
//     org.apache.commons.math3.complex.Complex var10 = var4.pow(var9);
//     org.apache.commons.math3.complex.Complex var12 = var4.multiply(8.414709848078965d);
//     org.apache.commons.math3.complex.Complex var13 = var4.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var4 and var13
//     assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var13
//     assertTrue("Contract failed: equals-hashcode on var12 and var13", var12.equals(var13) ? var12.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var4
//     assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var12
//     assertTrue("Contract failed: equals-hashcode on var13 and var12", var13.equals(var12) ? var13.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(byte)1);
    org.apache.commons.math3.exception.NumberIsTooSmallException var6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var11 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var7, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var6.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math3.exception.util.ExceptionContext var13 = var11.getContext();
    var2.addSuppressed((java.lang.Throwable)var11);
    java.lang.Number var15 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0+ "'", var15.equals(0));

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(short)(-1), (java.lang.Number)(-0.0d), false);
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.subtract(0.0d);
    org.apache.commons.math3.complex.ComplexField var16 = var13.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex((-3.141592653589793d), 1.0d);
    double var3 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.833423582473808d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var11 = var6.pow(var10);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var18 = var16.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var19 = var18.log();
    org.apache.commons.math3.complex.Complex var20 = var19.atan();
    org.apache.commons.math3.complex.Complex var21 = var20.atan();
    org.apache.commons.math3.complex.Complex var22 = var6.multiply(var21);
    org.apache.commons.math3.complex.Complex var23 = var6.sqrt1z();
    org.apache.commons.math3.complex.Complex var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var25 = var6.subtract(var24);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)2.9932228461263786d, (java.lang.Number)Double.NaN, true);
    java.lang.Number var5 = var4.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 2.9932228461263786d+ "'", var5.equals(2.9932228461263786d));

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.5403023058681398d);
//     java.lang.String var3 = var2.toString();
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var8 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var4, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math3.exception.NotPositiveException var11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10);
    var3.addSuppressed((java.lang.Throwable)var11);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.5403023058681398d, 10.841470984807897d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    boolean var6 = var4.isNaN();
    org.apache.commons.math3.complex.Complex var7 = var4.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var13.sin();
//     org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
//     boolean var16 = var4.equals((java.lang.Object)var15);
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var18.acos();
//     org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
//     org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
//     org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
//     org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
//     org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var29 = var28.isInfinite();
//     org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
//     org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var35 = var34.isInfinite();
//     org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
//     org.apache.commons.math3.complex.Complex var39 = var38.sin();
//     org.apache.commons.math3.complex.Complex var40 = var28.multiply(var39);
//     org.apache.commons.math3.complex.Complex var41 = var28.sin();
//     org.apache.commons.math3.complex.Complex var42 = var15.add(var28);
//     org.apache.commons.math3.complex.Complex var44 = var15.divide(0.0d);
//     org.apache.commons.math3.complex.Complex var46 = var44.subtract(0.0d);
//     double var47 = var44.getReal();
//     java.lang.String var48 = var44.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var29 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var47 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var48 + "' != '" + "(NaN, NaN)"+ "'", var48.equals("(NaN, NaN)"));
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    org.apache.commons.math3.complex.Complex var15 = var14.log();
    org.apache.commons.math3.complex.Complex var17 = var14.divide(1.0d);
    boolean var18 = var17.isNaN();
    double var19 = var17.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.6663667453928805d);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var5 = var4.log();
//     double var6 = var4.abs();
//     org.apache.commons.math3.complex.Complex var7 = var4.asin();
//     
//     // Checks the contract:  equals-hashcode on var4 and var7
//     assertTrue("Contract failed: equals-hashcode on var4 and var7", var4.equals(var7) ? var4.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var4
//     assertTrue("Contract failed: equals-hashcode on var7 and var4", var7.equals(var4) ? var7.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    double var21 = var20.getImaginary();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var23.tan();
    org.apache.commons.math3.complex.Complex var29 = var23.cosh();
    org.apache.commons.math3.complex.Complex var30 = var20.add(var29);
    org.apache.commons.math3.complex.Complex var31 = var12.multiply(var29);
    double var32 = var31.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 9267.315951198088d);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var4.pow(var9);
    org.apache.commons.math3.complex.Complex var11 = var10.conjugate();
    org.apache.commons.math3.complex.Complex var12 = var10.conjugate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    org.apache.commons.math3.complex.Complex var11 = var8.sin();
    double var12 = var11.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.7440230792707043d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var3.add(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var1.subtract(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var6.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(6.9746078810578886E-40d, 100.0d);

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var13 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
//     org.apache.commons.math3.complex.Complex var17 = var16.sin();
//     org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
//     org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
//     org.apache.commons.math3.complex.Complex var20 = var18.atan();
//     org.apache.commons.math3.complex.Complex var22 = var20.divide(0.6483608274590866d);
//     org.apache.commons.math3.complex.Complex var23 = var22.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var22 and var23
//     assertTrue("Contract failed: equals-hashcode on var22 and var23", var22.equals(var23) ? var22.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var22
//     assertTrue("Contract failed: equals-hashcode on var23 and var22", var23.equals(var22) ? var23.hashCode() == var22.hashCode() : true);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var8 = var1.multiply(0);
    org.apache.commons.math3.complex.Complex var10 = var1.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var12 = var10.multiply((-9.158529015192103d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1.0f);
    java.lang.Number var2 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.0d);
    java.lang.String var4 = var3.toString();
    org.apache.commons.math3.complex.ComplexField var5 = var3.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(10.0, 0.0)"+ "'", var4.equals("(10.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(100.0d, 6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Number var1 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var1);
//     java.lang.Throwable[] var3 = var2.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var3);
//     org.apache.commons.math3.exception.util.ExceptionContext var5 = var4.getContext();
//     java.lang.String var6 = var4.toString();
// 
//   }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)10);
//     java.lang.Throwable[] var3 = var2.getSuppressed();
//     boolean var4 = var2.getBoundIsAllowed();
//     java.lang.String var5 = var2.toString();
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var12 = var10.log();
    org.apache.commons.math3.complex.Complex var14 = var12.divide(0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply((-1));
    java.util.List var18 = var14.nthRoot(1);
    org.apache.commons.math3.complex.Complex var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var20 = var14.subtract(var19);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var23 = var15.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var29 = var28.isInfinite();
    org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
    org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var35 = var34.isInfinite();
    org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
    org.apache.commons.math3.complex.Complex var39 = var38.sin();
    org.apache.commons.math3.complex.Complex var40 = var28.multiply(var39);
    org.apache.commons.math3.complex.Complex var41 = var28.sin();
    org.apache.commons.math3.complex.Complex var42 = var15.add(var28);
    org.apache.commons.math3.complex.ComplexField var43 = var42.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    double var3 = var2.getArgument();
    java.lang.String var4 = var2.toString();
    org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
    double var8 = var7.getArgument();
    java.lang.String var9 = var7.toString();
    org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
    org.apache.commons.math3.complex.Complex var11 = var2.sqrt1z();
    org.apache.commons.math3.complex.ComplexField var12 = var11.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0.0, 0.0)"+ "'", var4.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0.0, 0.0)"+ "'", var9.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var5 = var4.isInfinite();
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
//     org.apache.commons.math3.complex.Complex var9 = var8.sin();
//     org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
//     org.apache.commons.math3.complex.Complex var12 = var9.multiply(10);
//     java.lang.String var13 = var9.toString();
//     org.apache.commons.math3.complex.Complex var14 = var9.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var9 and var14
//     assertTrue("Contract failed: equals-hashcode on var9 and var14", var9.equals(var14) ? var9.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var9
//     assertTrue("Contract failed: equals-hashcode on var14 and var9", var14.equals(var9) ? var14.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var4 = var3.cos();
    org.apache.commons.math3.complex.Complex var5 = var3.tanh();
    org.apache.commons.math3.complex.Complex var6 = var3.asin();
    org.apache.commons.math3.complex.Complex var8 = var3.divide(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var3.divide(984.5161532381264d);
    org.apache.commons.math3.complex.Complex var11 = var10.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = var2.add(100.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.sqrt();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var7.tan();
    double var13 = var12.getImaginary();
    org.apache.commons.math3.complex.Complex var16 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var19 = var18.isInfinite();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
    org.apache.commons.math3.complex.Complex var23 = var22.sin();
    org.apache.commons.math3.complex.Complex var24 = var16.add(var23);
    org.apache.commons.math3.complex.Complex var25 = var12.pow(var24);
    org.apache.commons.math3.complex.ComplexField var26 = var24.getField();
    org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var29 = var28.isInfinite();
    org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
    org.apache.commons.math3.complex.Complex var33 = var28.tan();
    org.apache.commons.math3.complex.Complex var34 = var28.cosh();
    org.apache.commons.math3.complex.Complex var35 = var28.sqrt1z();
    org.apache.commons.math3.complex.Complex var37 = var28.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var39 = var28.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var40 = var24.add(var28);
    org.apache.commons.math3.complex.Complex var41 = var5.multiply(var28);
    org.apache.commons.math3.complex.Complex var43 = var5.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var44 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var45 = var43.subtract(var44);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var9 = var6.pow(0.0d);
    boolean var10 = var6.isNaN();
    org.apache.commons.math3.complex.Complex var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var12 = var6.pow(var11);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.6663667453928805d, 11013.232920103323d);
    org.apache.commons.math3.complex.Complex var4 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.sqrt();
    org.apache.commons.math3.complex.Complex var7 = var4.pow(Double.NaN);
    org.apache.commons.math3.complex.Complex var8 = var4.exp();
    boolean var9 = var2.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Number var1 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, var1);
//     java.lang.String var3 = var2.toString();
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(9267.315951198088d, 8.414709848078965d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    double var9 = var8.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertTrue(var9 == 9.9498743710662d);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var5 = var4.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var4 and var5
//     assertTrue("Contract failed: equals-hashcode on var4 and var5", var4.equals(var5) ? var4.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var4
//     assertTrue("Contract failed: equals-hashcode on var5 and var4", var5.equals(var4) ? var5.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    boolean var7 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than the minimum (10)"+ "'", var5.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than the minimum (10)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than the minimum (10)"+ "'", var6.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than the minimum (10)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)10.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.0f);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var3);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var5 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var3);
//     org.apache.commons.math3.exception.util.ExceptionContext var6 = var5.getContext();
//     java.lang.String var7 = var5.toString();
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.009116265160176875d);

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)1L, (java.lang.Number)0.0f, false);
//     org.apache.commons.math3.exception.util.ExceptionContext var5 = var4.getContext();
//     java.lang.String var6 = var4.toString();
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isNaN();
    org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var22 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var24 = var22.multiply(0);
    org.apache.commons.math3.complex.Complex var27 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var30 = var29.isInfinite();
    org.apache.commons.math3.complex.Complex var32 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var33 = var29.divide(var32);
    org.apache.commons.math3.complex.Complex var34 = var33.sin();
    org.apache.commons.math3.complex.Complex var35 = var27.add(var34);
    boolean var36 = var24.equals((java.lang.Object)var35);
    org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var39 = var38.acos();
    org.apache.commons.math3.complex.Complex var41 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var43 = var41.add(0.0d);
    org.apache.commons.math3.complex.Complex var44 = var39.divide(var43);
    org.apache.commons.math3.complex.Complex var45 = var39.sqrt1z();
    org.apache.commons.math3.complex.Complex var46 = var35.add(var45);
    org.apache.commons.math3.complex.Complex var47 = var17.subtract(var35);
    org.apache.commons.math3.complex.Complex var48 = var47.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var9 = var2.cos();
    org.apache.commons.math3.complex.Complex var12 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var14 = var12.multiply(0);
    org.apache.commons.math3.complex.Complex var16 = var14.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var17 = var16.log();
    org.apache.commons.math3.complex.Complex var18 = var17.atan();
    org.apache.commons.math3.complex.Complex var19 = var2.divide(var18);
    java.util.List var21 = var2.nthRoot(10);
    org.apache.commons.math3.complex.Complex var22 = var2.conjugate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.841470984807897d, (-9.158529015192103d));
    org.apache.commons.math3.complex.Complex var5 = var1.subtract(var4);
    org.apache.commons.math3.complex.Complex var7 = var4.add(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var17 = var15.log();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var19.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var19.tan();
    org.apache.commons.math3.complex.Complex var26 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var28 = var19.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var29 = var15.multiply(var19);
    double var30 = var19.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 10.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var12 = var10.log();
    org.apache.commons.math3.complex.Complex var14 = var12.divide(0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var15 = var14.cosh();
    org.apache.commons.math3.complex.Complex var16 = var14.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var17 = var15.multiply(Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = var17.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var3.add(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var1.subtract(var3);
    org.apache.commons.math3.complex.Complex var7 = var1.sinh();
    org.apache.commons.math3.complex.Complex var8 = var1.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.subtract(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var5 = var3.subtract(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var13 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
//     org.apache.commons.math3.complex.Complex var17 = var16.sin();
//     org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
//     org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
//     org.apache.commons.math3.complex.Complex var20 = var19.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var19 and var20
//     assertTrue("Contract failed: equals-hashcode on var19 and var20", var19.equals(var20) ? var19.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var19
//     assertTrue("Contract failed: equals-hashcode on var20 and var19", var20.equals(var19) ? var20.hashCode() == var19.hashCode() : true);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf((-0.0d));
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(Double.NaN, 0.009116265160176875d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    double var11 = var10.abs();
    java.lang.String var12 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7.618757681450911E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(-7.618757681450911E-5, 0.0)"+ "'", var12.equals("(-7.618757681450911E-5, 0.0)"));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isNaN();
    org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var20 = var19.cos();
    double var21 = var20.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.0d);
    org.apache.commons.math3.complex.Complex var4 = var3.asin();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var3.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)100.0d);
    boolean var3 = var2.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
//     org.apache.commons.math3.complex.Complex var7 = var6.log();
//     double var8 = var7.getImaginary();
//     org.apache.commons.math3.complex.Complex var10 = var7.pow(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1L);
    boolean var2 = var1.getBoundIsAllowed();
    org.apache.commons.math3.exception.NotPositiveException var4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1L);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Number var6 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var17 = var12.pow(0.9984277357858338d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     java.lang.Object[] var4 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var5 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var2, var4);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var6 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var4);
//     org.apache.commons.math3.exception.NullArgumentException var7 = new org.apache.commons.math3.exception.NullArgumentException(var0, var4);
//     java.lang.String var8 = var7.toString();
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(byte)1, (java.lang.Number)(byte)0, false);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = var2.add(100.0d);
    double var5 = var2.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.9932228461263786d);

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
//     double var3 = var2.getArgument();
//     java.lang.String var4 = var2.toString();
//     org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
//     double var8 = var7.getArgument();
//     java.lang.String var9 = var7.toString();
//     org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
//     org.apache.commons.math3.complex.Complex var11 = var2.sqrt1z();
//     org.apache.commons.math3.complex.Complex var12 = var2.cos();
//     
//     // Checks the contract:  equals-hashcode on var11 and var12
//     assertTrue("Contract failed: equals-hashcode on var11 and var12", var11.equals(var12) ? var11.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var11
//     assertTrue("Contract failed: equals-hashcode on var12 and var11", var12.equals(var11) ? var12.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)2.9932228461263786d, (java.lang.Number)10L, true);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(10.841470984807897d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    org.apache.commons.math3.complex.Complex var15 = var14.log();
    org.apache.commons.math3.complex.Complex var17 = var14.divide(1.0d);
    double var18 = var14.getImaginary();
    org.apache.commons.math3.complex.Complex var19 = var14.tan();
    org.apache.commons.math3.complex.Complex var21 = var19.multiply((-1.3700827124762082E-54d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertTrue(var18 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var19 = var4.exp();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var22 = var21.isInfinite();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var21.divide(var24);
    org.apache.commons.math3.complex.Complex var26 = var25.sin();
    org.apache.commons.math3.complex.Complex var28 = var26.divide(0.0d);
    org.apache.commons.math3.complex.Complex var31 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var33 = var31.multiply(0);
    org.apache.commons.math3.complex.Complex var34 = var33.log();
    org.apache.commons.math3.complex.Complex var36 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var38 = var36.add(0.0d);
    org.apache.commons.math3.complex.Complex var39 = var33.pow(var38);
    org.apache.commons.math3.complex.Complex var41 = var33.multiply(8.414709848078965d);
    org.apache.commons.math3.complex.Complex var42 = var28.multiply(var33);
    org.apache.commons.math3.complex.Complex var43 = var4.divide(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    org.apache.commons.math3.complex.Complex var15 = var14.log();
    org.apache.commons.math3.complex.Complex var17 = var15.pow(100.0d);
    org.apache.commons.math3.complex.Complex var18 = var17.sinh();
    org.apache.commons.math3.complex.Complex var19 = var18.sinh();
    double var20 = var18.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 6.9746078810578886E-40d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var29 = var28.isInfinite();
    org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
    org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var35 = var34.isInfinite();
    org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
    org.apache.commons.math3.complex.Complex var39 = var38.sin();
    org.apache.commons.math3.complex.Complex var40 = var28.multiply(var39);
    org.apache.commons.math3.complex.Complex var41 = var28.sin();
    org.apache.commons.math3.complex.Complex var42 = var15.add(var28);
    org.apache.commons.math3.complex.Complex var43 = var28.atan();
    org.apache.commons.math3.complex.Complex var45 = var28.multiply(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.841470984807897d, 2.736380855151784d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var4.pow(var9);
    org.apache.commons.math3.complex.Complex var12 = var4.multiply(8.414709848078965d);
    org.apache.commons.math3.complex.Complex var14 = var12.multiply(1);
    org.apache.commons.math3.complex.Complex var16 = var12.pow((-0.4626307887385793d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    java.lang.String var22 = var13.toString();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var24.add(0.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.multiply(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var29 = var13.pow(var24);
    org.apache.commons.math3.complex.Complex var30 = var13.negate();
    org.apache.commons.math3.complex.Complex var31 = var13.cosh();
    org.apache.commons.math3.complex.Complex var32 = var31.tan();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var34 = var31.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(8.414709848078965, 0.0)"+ "'", var22.equals("(8.414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var3 = var1.cos();
//     org.apache.commons.math3.complex.Complex var4 = var3.acos();
//     
//     // Checks the contract:  equals-hashcode on var1 and var4
//     assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var1
//     assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1), (java.lang.Number)100.0f, true);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf((-1.3700827124762082E-54d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex((-9.158529015192103d), 9267.315951198088d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var11 = var10.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d);
//     org.apache.commons.math3.complex.Complex var3 = var1.subtract(2.9932228461263786d);
//     org.apache.commons.math3.complex.Complex var4 = var1.asin();
//     
//     // Checks the contract:  equals-hashcode on var1 and var4
//     assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var1
//     assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.0d);
//     java.lang.String var3 = var2.toString();
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    org.apache.commons.math3.complex.ComplexField var11 = var10.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var14 = var12.cos();
//     org.apache.commons.math3.complex.Complex var15 = var14.log();
//     org.apache.commons.math3.complex.Complex var17 = var14.divide(1.0d);
//     double var18 = var14.getImaginary();
//     org.apache.commons.math3.complex.Complex var19 = var14.tan();
//     org.apache.commons.math3.complex.Complex var20 = var14.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var14 and var20
//     assertTrue("Contract failed: equals-hashcode on var14 and var20", var14.equals(var20) ? var14.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var20
//     assertTrue("Contract failed: equals-hashcode on var17 and var20", var17.equals(var20) ? var17.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var14
//     assertTrue("Contract failed: equals-hashcode on var20 and var14", var20.equals(var14) ? var20.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var17
//     assertTrue("Contract failed: equals-hashcode on var20 and var17", var20.equals(var17) ? var20.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(byte)1);
    org.apache.commons.math3.exception.NumberIsTooSmallException var6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var11 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var7, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var6.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math3.exception.util.ExceptionContext var13 = var11.getContext();
    var2.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math3.exception.util.Localizable var15 = null;
    java.lang.Number var16 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var19 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var15, var16, (java.lang.Number)(short)0, true);
    var2.addSuppressed((java.lang.Throwable)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(2.736380855151784d);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)22026.465794806754d, (java.lang.Number)2.9932228461263786d, true);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    boolean var7 = var4.equals((java.lang.Object)(-1L));
    org.apache.commons.math3.complex.Complex var8 = var4.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var14 = var12.cos();
//     boolean var15 = var12.isNaN();
//     org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
//     org.apache.commons.math3.complex.Complex var18 = var12.acos();
//     org.apache.commons.math3.complex.Complex var19 = var12.asin();
//     
//     // Checks the contract:  equals-hashcode on var5 and var19
//     assertTrue("Contract failed: equals-hashcode on var5 and var19", var5.equals(var19) ? var5.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var19
//     assertTrue("Contract failed: equals-hashcode on var11 and var19", var11.equals(var19) ? var11.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var5
//     assertTrue("Contract failed: equals-hashcode on var19 and var5", var19.equals(var5) ? var19.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var11
//     assertTrue("Contract failed: equals-hashcode on var19 and var11", var19.equals(var11) ? var19.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var16 = var15.isInfinite();
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
//     org.apache.commons.math3.complex.Complex var20 = var15.tan();
//     org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
//     java.lang.String var22 = var13.toString();
//     org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var26 = var24.add(0.0d);
//     org.apache.commons.math3.complex.Complex var28 = var24.multiply(10.841470984807897d);
//     org.apache.commons.math3.complex.Complex var29 = var13.pow(var24);
//     org.apache.commons.math3.complex.Complex var30 = var24.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var1 and var30
//     assertTrue("Contract failed: equals-hashcode on var1 and var30", var1.equals(var30) ? var1.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var30
//     assertTrue("Contract failed: equals-hashcode on var4 and var30", var4.equals(var30) ? var4.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var30
//     assertTrue("Contract failed: equals-hashcode on var7 and var30", var7.equals(var30) ? var7.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var30
//     assertTrue("Contract failed: equals-hashcode on var10 and var30", var10.equals(var30) ? var10.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var30
//     assertTrue("Contract failed: equals-hashcode on var15 and var30", var15.equals(var30) ? var15.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var30
//     assertTrue("Contract failed: equals-hashcode on var18 and var30", var18.equals(var30) ? var18.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var30
//     assertTrue("Contract failed: equals-hashcode on var24 and var30", var24.equals(var30) ? var24.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var30
//     assertTrue("Contract failed: equals-hashcode on var26 and var30", var26.equals(var30) ? var26.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var1
//     assertTrue("Contract failed: equals-hashcode on var30 and var1", var30.equals(var1) ? var30.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var4
//     assertTrue("Contract failed: equals-hashcode on var30 and var4", var30.equals(var4) ? var30.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var7
//     assertTrue("Contract failed: equals-hashcode on var30 and var7", var30.equals(var7) ? var30.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var10
//     assertTrue("Contract failed: equals-hashcode on var30 and var10", var30.equals(var10) ? var30.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var15
//     assertTrue("Contract failed: equals-hashcode on var30 and var15", var30.equals(var15) ? var30.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var18
//     assertTrue("Contract failed: equals-hashcode on var30 and var18", var30.equals(var18) ? var30.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var24
//     assertTrue("Contract failed: equals-hashcode on var30 and var24", var30.equals(var24) ? var30.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var26
//     assertTrue("Contract failed: equals-hashcode on var30 and var26", var30.equals(var26) ? var30.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)10.841470984807897d, (java.lang.Number)0.9984277357858338d, true);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    double var21 = var20.getImaginary();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var23.tan();
    org.apache.commons.math3.complex.Complex var29 = var23.cosh();
    org.apache.commons.math3.complex.Complex var30 = var20.add(var29);
    org.apache.commons.math3.complex.Complex var31 = var12.multiply(var29);
    org.apache.commons.math3.complex.Complex var33 = var29.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var39 = var37.add(0.0d);
    org.apache.commons.math3.complex.Complex var40 = var35.subtract(var37);
    org.apache.commons.math3.complex.Complex var41 = var35.sinh();
    org.apache.commons.math3.complex.Complex var42 = var33.subtract(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var8 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var4, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var8.getContext();
    org.apache.commons.math3.exception.NumberIsTooSmallException var14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var15 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var19 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var15, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var14.addSuppressed((java.lang.Throwable)var19);
    org.apache.commons.math3.exception.util.ExceptionContext var21 = var19.getContext();
    java.lang.Number var22 = var19.getMin();
    var8.addSuppressed((java.lang.Throwable)var19);
    org.apache.commons.math3.exception.util.ExceptionContext var24 = var8.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1L)+ "'", var22.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var3 = var2.isInfinite();
    org.apache.commons.math3.complex.Complex var5 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var2.divide(var5);
    org.apache.commons.math3.complex.Complex var7 = var2.tan();
    org.apache.commons.math3.complex.Complex var8 = var2.cosh();
    org.apache.commons.math3.complex.Complex var9 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var11 = var2.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var13 = var2.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var14 = var2.cosh();
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var21 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var24 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var27 = var26.isInfinite();
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var30 = var26.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var30.sin();
    org.apache.commons.math3.complex.Complex var32 = var24.add(var31);
    boolean var33 = var21.equals((java.lang.Object)var32);
    org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var36 = var35.acos();
    org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var40 = var38.add(0.0d);
    org.apache.commons.math3.complex.Complex var41 = var36.divide(var40);
    org.apache.commons.math3.complex.Complex var42 = var36.sqrt1z();
    org.apache.commons.math3.complex.Complex var43 = var32.add(var42);
    org.apache.commons.math3.complex.Complex var45 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var46 = var45.isInfinite();
    org.apache.commons.math3.complex.Complex var48 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var49 = var45.divide(var48);
    org.apache.commons.math3.complex.Complex var51 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var52 = var51.isInfinite();
    org.apache.commons.math3.complex.Complex var54 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var55 = var51.divide(var54);
    org.apache.commons.math3.complex.Complex var56 = var55.sin();
    org.apache.commons.math3.complex.Complex var57 = var45.multiply(var56);
    org.apache.commons.math3.complex.Complex var58 = var45.sin();
    org.apache.commons.math3.complex.Complex var59 = var32.add(var45);
    boolean var60 = var14.equals((java.lang.Object)var32);
    org.apache.commons.math3.complex.Complex var62 = var32.divide(0.0d);
    java.lang.Object[] var63 = new java.lang.Object[] { 0.0d};
    org.apache.commons.math3.exception.NullArgumentException var64 = new org.apache.commons.math3.exception.NullArgumentException(var0, var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1L, (java.lang.Number)2.9932228461263786d, false);

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var9.tan();
//     org.apache.commons.math3.complex.Complex var15 = var9.cosh();
//     org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
//     org.apache.commons.math3.complex.Complex var18 = var6.multiply(1);
//     org.apache.commons.math3.complex.Complex var19 = var6.sqrt1z();
//     double var20 = var19.getImaginary();
//     org.apache.commons.math3.complex.Complex var21 = var19.negate();
//     java.lang.String var22 = var19.toString();
//     org.apache.commons.math3.complex.Complex var23 = var19.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var19 and var23
//     assertTrue("Contract failed: equals-hashcode on var19 and var23", var19.equals(var23) ? var19.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var19
//     assertTrue("Contract failed: equals-hashcode on var23 and var19", var23.equals(var19) ? var23.hashCode() == var19.hashCode() : true);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var18.atan();
    org.apache.commons.math3.complex.Complex var22 = var18.multiply(100.0d);
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var25 = var24.isInfinite();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
    org.apache.commons.math3.complex.Complex var30 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var31 = var30.isInfinite();
    org.apache.commons.math3.complex.Complex var33 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var34 = var30.divide(var33);
    org.apache.commons.math3.complex.Complex var35 = var34.sin();
    org.apache.commons.math3.complex.Complex var36 = var24.multiply(var35);
    org.apache.commons.math3.complex.Complex var38 = var36.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var39 = var18.multiply(var38);
    boolean var40 = var38.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf((-0.0d), 10.841470984807897d);
    org.apache.commons.math3.complex.Complex var4 = var2.add((-3.141592653589793d));
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var27 = var25.atan();
    org.apache.commons.math3.complex.Complex var28 = var27.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var11.log();
    org.apache.commons.math3.complex.Complex var13 = var12.atan();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    double var21 = var20.getImaginary();
    org.apache.commons.math3.complex.Complex var24 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var27 = var26.isInfinite();
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var30 = var26.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var30.sin();
    org.apache.commons.math3.complex.Complex var32 = var24.add(var31);
    org.apache.commons.math3.complex.Complex var33 = var20.pow(var32);
    org.apache.commons.math3.complex.Complex var34 = var32.atan();
    org.apache.commons.math3.complex.Complex var35 = var12.divide(var34);
    org.apache.commons.math3.complex.Complex var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var37 = var34.add(var36);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var13 = var8.divide(1.0d);
    org.apache.commons.math3.complex.Complex var14 = var8.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isNaN();
    org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var20 = var19.reciprocal();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var23 = var22.isInfinite();
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var22.divide(var25);
    org.apache.commons.math3.complex.Complex var27 = var22.tan();
    double var28 = var27.getImaginary();
    org.apache.commons.math3.complex.Complex var30 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var31 = var30.isInfinite();
    org.apache.commons.math3.complex.Complex var33 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var34 = var30.divide(var33);
    org.apache.commons.math3.complex.Complex var35 = var30.tan();
    org.apache.commons.math3.complex.Complex var36 = var30.cosh();
    org.apache.commons.math3.complex.Complex var37 = var27.add(var36);
    double var38 = var36.getImaginary();
    double var39 = var36.getReal();
    org.apache.commons.math3.complex.Complex var40 = var36.tan();
    org.apache.commons.math3.complex.Complex var42 = var40.subtract(11013.232920103323d);
    org.apache.commons.math3.complex.Complex var43 = var20.multiply(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
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
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 11013.232920103323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var9.tan();
//     org.apache.commons.math3.complex.Complex var15 = var9.cosh();
//     org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var19 = var18.isInfinite();
//     org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
//     org.apache.commons.math3.complex.Complex var23 = var18.tan();
//     double var24 = var23.getImaginary();
//     org.apache.commons.math3.complex.Complex var27 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var30 = var29.isInfinite();
//     org.apache.commons.math3.complex.Complex var32 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var33 = var29.divide(var32);
//     org.apache.commons.math3.complex.Complex var34 = var33.sin();
//     org.apache.commons.math3.complex.Complex var35 = var27.add(var34);
//     org.apache.commons.math3.complex.Complex var36 = var23.pow(var35);
//     org.apache.commons.math3.complex.Complex var37 = var15.divide(var36);
//     org.apache.commons.math3.complex.Complex var38 = var36.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var36 and var38
//     assertTrue("Contract failed: equals-hashcode on var36 and var38", var36.equals(var38) ? var36.hashCode() == var38.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var36
//     assertTrue("Contract failed: equals-hashcode on var38 and var36", var38.equals(var36) ? var38.hashCode() == var36.hashCode() : true);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.NullArgumentException var2 = new org.apache.commons.math3.exception.NullArgumentException(var0, var1);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var11.log();
    org.apache.commons.math3.complex.Complex var13 = var12.tan();
    org.apache.commons.math3.complex.Complex var15 = var12.multiply(0);
    boolean var16 = var15.isInfinite();
    double var17 = var15.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3.141592653589793d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var13 = var8.divide(1.0d);
    double var14 = var8.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)11013.686910042774d, (java.lang.Number)0.6663667453928805d, true);
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    double var11 = var10.abs();
    org.apache.commons.math3.complex.Complex var14 = org.apache.commons.math3.complex.Complex.valueOf((-3.141592653589793d), 0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var15 = var10.add(var14);
    org.apache.commons.math3.complex.Complex var16 = var14.tanh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7.618757681450911E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var13.sin();
//     org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
//     boolean var16 = var4.equals((java.lang.Object)var15);
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var18.acos();
//     org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
//     org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
//     org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
//     org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
//     org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var29 = var28.isInfinite();
//     org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
//     org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var35 = var34.isInfinite();
//     org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
//     org.apache.commons.math3.complex.Complex var39 = var38.sin();
//     org.apache.commons.math3.complex.Complex var40 = var28.multiply(var39);
//     org.apache.commons.math3.complex.Complex var41 = var28.sin();
//     org.apache.commons.math3.complex.Complex var42 = var15.add(var28);
//     org.apache.commons.math3.complex.Complex var43 = var15.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var15 and var43
//     assertTrue("Contract failed: equals-hashcode on var15 and var43", var15.equals(var43) ? var15.hashCode() == var43.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var43 and var15
//     assertTrue("Contract failed: equals-hashcode on var43 and var15", var43.equals(var15) ? var43.hashCode() == var15.hashCode() : true);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.MathIllegalArgumentException var2 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var1);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(byte)0, (java.lang.Number)0.8414709848078965d, true);
    org.apache.commons.math3.exception.util.ExceptionContext var4 = var3.getContext();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var17 = var6.atan();
    double var18 = var17.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5752220392306203d);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
//     org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
//     org.apache.commons.math3.complex.Complex var12 = var1.multiply(1.0d);
//     org.apache.commons.math3.complex.Complex var13 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.009116265160176875d);
//     org.apache.commons.math3.complex.Complex var16 = var13.tan();
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var19 = var18.isInfinite();
//     org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
//     org.apache.commons.math3.complex.Complex var23 = var22.sin();
//     org.apache.commons.math3.complex.ComplexField var24 = var23.getField();
//     org.apache.commons.math3.complex.Complex var26 = var23.pow(0.0d);
//     boolean var27 = var23.isNaN();
//     boolean var28 = var13.equals((java.lang.Object)var27);
//     org.apache.commons.math3.complex.Complex var29 = var13.log();
//     org.apache.commons.math3.complex.Complex var30 = var13.cos();
//     org.apache.commons.math3.complex.Complex var31 = var30.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var30 and var31
//     assertTrue("Contract failed: equals-hashcode on var30 and var31", var30.equals(var31) ? var30.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var30
//     assertTrue("Contract failed: equals-hashcode on var31 and var30", var31.equals(var30) ? var31.hashCode() == var30.hashCode() : true);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var5 = var4.isInfinite();
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
//     org.apache.commons.math3.complex.Complex var9 = var8.sin();
//     org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
//     org.apache.commons.math3.complex.Complex var11 = var9.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var9 and var11
//     assertTrue("Contract failed: equals-hashcode on var9 and var11", var9.equals(var11) ? var9.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var9
//     assertTrue("Contract failed: equals-hashcode on var11 and var9", var11.equals(var9) ? var11.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var9.tan();
//     org.apache.commons.math3.complex.Complex var15 = var9.cosh();
//     org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
//     org.apache.commons.math3.complex.Complex var18 = var6.multiply(1);
//     org.apache.commons.math3.complex.Complex var19 = var18.negate();
//     org.apache.commons.math3.complex.Complex var20 = var19.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var19 and var20
//     assertTrue("Contract failed: equals-hashcode on var19 and var20", var19.equals(var20) ? var19.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var19
//     assertTrue("Contract failed: equals-hashcode on var20 and var19", var20.equals(var19) ? var20.hashCode() == var19.hashCode() : true);
// 
//   }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
//     org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
//     org.apache.commons.math3.complex.Complex var7 = var6.log();
//     org.apache.commons.math3.complex.Complex var8 = var7.atan();
//     org.apache.commons.math3.complex.Complex var10 = var8.pow(1.0d);
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var13 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
//     org.apache.commons.math3.complex.Complex var17 = var16.sin();
//     org.apache.commons.math3.complex.Complex var18 = var10.multiply(var17);
//     double var19 = var10.getArgument();
//     org.apache.commons.math3.complex.Complex var20 = var10.sinh();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
// 
//   }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    org.apache.commons.math3.complex.Complex var12 = var10.divide((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var4.atan();
    org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
    org.apache.commons.math3.complex.Complex var8 = var6.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    org.apache.commons.math3.complex.Complex var23 = var15.pow(1.0d);
    org.apache.commons.math3.complex.Complex var25 = var15.pow(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var27 = var15.add(2.833423582473808d);
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var30 = var29.isInfinite();
    org.apache.commons.math3.complex.Complex var32 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var33 = var29.divide(var32);
    org.apache.commons.math3.complex.Complex var34 = var29.tan();
    org.apache.commons.math3.complex.Complex var35 = var29.cosh();
    org.apache.commons.math3.complex.Complex var36 = var29.sqrt1z();
    org.apache.commons.math3.complex.Complex var38 = var29.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var40 = var29.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var41 = var29.cosh();
    org.apache.commons.math3.complex.Complex var42 = var41.negate();
    org.apache.commons.math3.complex.Complex var43 = var27.subtract(var42);
    double var44 = var27.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertTrue(var30 == false);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 12.833423582473808d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf((-0.4626307887385793d), 0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var3 = var2.tan();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(-0.4626307887385793, 0.8414709848078965)"+ "'", var4.equals("(-0.4626307887385793, 0.8414709848078965)"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var12 = var10.sinh();
    org.apache.commons.math3.complex.Complex var15 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var17 = var15.multiply(0);
    org.apache.commons.math3.complex.Complex var18 = var17.log();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var20.add(0.0d);
    org.apache.commons.math3.complex.Complex var23 = var17.pow(var22);
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var25.acos();
    org.apache.commons.math3.complex.Complex var27 = var26.sqrt1z();
    org.apache.commons.math3.complex.Complex var29 = var26.multiply(1);
    double var30 = var26.getImaginary();
    org.apache.commons.math3.complex.Complex var31 = var23.divide(var26);
    boolean var32 = var10.equals((java.lang.Object)var26);
    double var33 = var26.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2.9932228461263786d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2.9932228461263786d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(byte)(-1), (java.lang.Number)1.0f, true);
    java.lang.Number var4 = var3.getMin();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.0f+ "'", var4.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var17 = var15.log();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var19.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var19.tan();
    org.apache.commons.math3.complex.Complex var26 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var28 = var19.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var29 = var15.multiply(var19);
    org.apache.commons.math3.complex.Complex var31 = var19.multiply(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(byte)0, (java.lang.Number)0.8414709848078965d, true);
    boolean var4 = var3.getBoundIsAllowed();
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var13 = var12.isInfinite();
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
//     org.apache.commons.math3.complex.Complex var17 = var16.sin();
//     org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
//     org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
//     org.apache.commons.math3.complex.Complex var20 = var18.atan();
//     org.apache.commons.math3.complex.Complex var21 = var20.log();
//     org.apache.commons.math3.complex.Complex var22 = var21.sin();
//     org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var25 = var24.isInfinite();
//     org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
//     org.apache.commons.math3.complex.Complex var29 = var28.sin();
//     org.apache.commons.math3.complex.Complex var31 = var29.divide(0.0d);
//     org.apache.commons.math3.complex.Complex var32 = var21.divide(var31);
//     org.apache.commons.math3.complex.Complex var33 = var31.tan();
//     double var34 = var31.getReal();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == Double.NaN);
// 
//   }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var3 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var2);
//     java.lang.Throwable[] var4 = var3.getSuppressed();
//     java.lang.String var5 = var3.toString();
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.5752220392306203d);

  }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var5.sin();
//     org.apache.commons.math3.complex.Complex var8 = var6.divide(0.0d);
//     org.apache.commons.math3.complex.Complex var11 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var13 = var11.multiply(0);
//     org.apache.commons.math3.complex.Complex var14 = var13.log();
//     org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var18 = var16.add(0.0d);
//     org.apache.commons.math3.complex.Complex var19 = var13.pow(var18);
//     org.apache.commons.math3.complex.Complex var21 = var13.multiply(8.414709848078965d);
//     org.apache.commons.math3.complex.Complex var22 = var8.multiply(var13);
//     org.apache.commons.math3.complex.Complex var24 = var13.multiply(1.0d);
//     org.apache.commons.math3.complex.Complex var25 = var24.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var13 and var25
//     assertTrue("Contract failed: equals-hashcode on var13 and var25", var13.equals(var25) ? var13.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var25
//     assertTrue("Contract failed: equals-hashcode on var21 and var25", var21.equals(var25) ? var21.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var25
//     assertTrue("Contract failed: equals-hashcode on var24 and var25", var24.equals(var25) ? var24.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var13
//     assertTrue("Contract failed: equals-hashcode on var25 and var13", var25.equals(var13) ? var25.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var21
//     assertTrue("Contract failed: equals-hashcode on var25 and var21", var25.equals(var21) ? var25.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var24
//     assertTrue("Contract failed: equals-hashcode on var25 and var24", var25.equals(var24) ? var25.hashCode() == var24.hashCode() : true);
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(short)0, (java.lang.Number)6.9746078810578886E-40d, true);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 22026.465794806754d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var4 = var3.cos();
    org.apache.commons.math3.complex.Complex var5 = var3.atan();
    boolean var6 = var3.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var5 = var2.multiply(1);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0.0, 2.9932228461263786)"+ "'", var6.equals("(0.0, 2.9932228461263786)"));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)984.5161532381264d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var2.sinh();
    java.lang.String var13 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(11013.232874703393, 0.0)"+ "'", var13.equals("(11013.232874703393, 0.0)"));

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(3.0756143685137425d, 3.0756143685137425d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    org.apache.commons.math3.complex.Complex var23 = var15.pow(1.0d);
    org.apache.commons.math3.complex.Complex var25 = var15.pow(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var27 = var15.subtract(6.9746078810578886E-40d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var5.sin();
//     org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
//     org.apache.commons.math3.complex.Complex var8 = var6.acos();
//     org.apache.commons.math3.complex.Complex var9 = var8.cosh();
//     org.apache.commons.math3.complex.Complex var10 = var9.sqrt1z();
//     org.apache.commons.math3.complex.Complex var11 = var9.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var9 and var11
//     assertTrue("Contract failed: equals-hashcode on var9 and var11", var9.equals(var11) ? var9.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var9
//     assertTrue("Contract failed: equals-hashcode on var11 and var9", var11.equals(var9) ? var11.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf((-9.158529015192103d));
    org.apache.commons.math3.complex.Complex var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var3 = var1.subtract(var2);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(3.141592653589793d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var4 = var3.getMin();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1L)+ "'", var5.equals((-1L)));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    boolean var14 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var17 = var16.isInfinite();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var20 = var16.divide(var19);
    org.apache.commons.math3.complex.Complex var21 = var12.subtract(var16);
    org.apache.commons.math3.complex.Complex var22 = var16.asin();
    org.apache.commons.math3.complex.Complex var23 = var16.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var8 = var7.isInfinite();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
//     org.apache.commons.math3.complex.Complex var12 = var11.sin();
//     org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
//     org.apache.commons.math3.complex.Complex var14 = var12.cos();
//     org.apache.commons.math3.complex.Complex var15 = var14.log();
//     org.apache.commons.math3.complex.Complex var17 = var14.divide(1.0d);
//     org.apache.commons.math3.complex.Complex var18 = var17.asin();
//     org.apache.commons.math3.complex.Complex var19 = var17.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var14 and var19
//     assertTrue("Contract failed: equals-hashcode on var14 and var19", var14.equals(var19) ? var14.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var19
//     assertTrue("Contract failed: equals-hashcode on var17 and var19", var17.equals(var19) ? var17.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var14
//     assertTrue("Contract failed: equals-hashcode on var19 and var14", var19.equals(var14) ? var19.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var17
//     assertTrue("Contract failed: equals-hashcode on var19 and var17", var19.equals(var17) ? var19.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var13 = var8.divide(1.0d);
    boolean var14 = var8.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(11013.232920103323d, (-1.3700827124762082E-54d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    boolean var14 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var17 = var16.isInfinite();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var20 = var16.divide(var19);
    org.apache.commons.math3.complex.Complex var21 = var12.subtract(var16);
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    double var28 = var27.getReal();
    double var29 = var27.getReal();
    org.apache.commons.math3.complex.Complex var30 = var27.sin();
    org.apache.commons.math3.complex.Complex var31 = var21.add(var30);
    org.apache.commons.math3.complex.Complex var32 = var21.atan();
    double var33 = var21.getReal();
    org.apache.commons.math3.complex.Complex var34 = var21.tan();
    java.lang.String var35 = var34.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-9.158529015192103d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "(0.27272393831212516, 0.0)"+ "'", var35.equals("(0.27272393831212516, 0.0)"));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var2 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var7 = var6.log();
    org.apache.commons.math3.complex.Complex var8 = var7.atan();
    org.apache.commons.math3.complex.Complex var10 = var8.pow(1.0d);
    org.apache.commons.math3.complex.Complex var11 = var10.tan();
    org.apache.commons.math3.complex.Complex var12 = var11.tanh();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var11.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var19.acos();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var22.acos();
    org.apache.commons.math3.complex.Complex var24 = var19.subtract(var22);
    java.util.List var26 = var22.nthRoot(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    double var3 = var2.getArgument();
    java.lang.String var4 = var2.toString();
    org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
    double var8 = var7.getArgument();
    java.lang.String var9 = var7.toString();
    org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
    org.apache.commons.math3.complex.Complex var12 = var2.multiply((-1));
    org.apache.commons.math3.complex.Complex var14 = var2.pow(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0.0, 0.0)"+ "'", var4.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0.0, 0.0)"+ "'", var9.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var9.tan();
//     org.apache.commons.math3.complex.Complex var15 = var9.cosh();
//     org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
//     org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
//     org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
//     org.apache.commons.math3.complex.Complex var21 = var16.exp();
//     org.apache.commons.math3.complex.Complex var22 = var21.cos();
//     org.apache.commons.math3.complex.Complex var24 = var21.multiply(0);
//     org.apache.commons.math3.complex.Complex var25 = var21.cosh();
//     org.apache.commons.math3.complex.Complex var26 = var25.reciprocal();
//     double var27 = var25.getArgument();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == Double.NaN);
// 
//   }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    java.lang.Object[] var5 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var6 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var3, var5);
    org.apache.commons.math3.exception.NullArgumentException var7 = new org.apache.commons.math3.exception.NullArgumentException(var2, var5);
    org.apache.commons.math3.exception.NullArgumentException var8 = new org.apache.commons.math3.exception.NullArgumentException(var1, var5);
    org.apache.commons.math3.exception.NullArgumentException var9 = new org.apache.commons.math3.exception.NullArgumentException(var0, var5);
    org.apache.commons.math3.exception.NumberIsTooSmallException var13 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var14 = var13.getMin();
    java.lang.Throwable[] var15 = var13.getSuppressed();
    org.apache.commons.math3.exception.NumberIsTooSmallException var19 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.NullArgumentException var20 = new org.apache.commons.math3.exception.NullArgumentException();
    var19.addSuppressed((java.lang.Throwable)var20);
    var13.addSuppressed((java.lang.Throwable)var19);
    java.lang.Number var24 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var26 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, var24, false);
    var19.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var28 = var26.toString();
    var9.addSuppressed((java.lang.Throwable)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than, or equal to, the minimum (null)"+ "'", var28.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: 1 is smaller than, or equal to, the minimum (null)"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(100.0d, 0.0d);
    boolean var3 = var2.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1, (java.lang.Number)(short)1, true);
    java.lang.Number var4 = var3.getArgument();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var7 = var6.log();
    org.apache.commons.math3.complex.Complex var8 = var7.atan();
    org.apache.commons.math3.complex.Complex var10 = var8.pow(1.0d);
    boolean var11 = var8.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = var2.add(100.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.cos();
    org.apache.commons.math3.complex.Complex var6 = var5.log();
    double var7 = var6.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.22585131401251352d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var7 = var6.log();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var10 = var9.acos();
    org.apache.commons.math3.complex.Complex var12 = var10.add(100.0d);
    org.apache.commons.math3.complex.Complex var14 = var10.add(0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var17 = var15.log();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var19.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var19.tan();
    org.apache.commons.math3.complex.Complex var26 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var28 = var19.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var29 = var15.multiply(var19);
    org.apache.commons.math3.complex.Complex var30 = var15.exp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var4 = var3.getMin();
    java.lang.String var5 = var3.toString();
    java.lang.Number var6 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: -1 is smaller than the minimum (0)"+ "'", var5.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: -1 is smaller than the minimum (0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (-1L)+ "'", var6.equals((-1L)));

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10.0d);
    java.lang.Number var2 = var1.getArgument();
    org.apache.commons.math3.exception.util.ExceptionContext var3 = var1.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 10.0d+ "'", var2.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.subtract(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var4 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var8 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var4, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var8.getContext();
    java.lang.Number var11 = var8.getMin();
    boolean var12 = var8.getBoundIsAllowed();
    java.lang.Number var13 = var8.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1L)+ "'", var11.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (short)1+ "'", var13.equals((short)1));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var4.pow(var9);
    org.apache.commons.math3.complex.Complex var11 = var10.cos();
    org.apache.commons.math3.complex.Complex var12 = var10.sqrt();
    org.apache.commons.math3.complex.Complex var13 = var10.reciprocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf((-1.0d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    double var6 = var5.getReal();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(1.0, 0.0)"+ "'", var7.equals("(1.0, 0.0)"));

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
//     java.lang.Throwable[] var4 = var3.getSuppressed();
//     java.lang.String var5 = var3.toString();
//     java.lang.String var6 = var3.toString();
//     java.lang.Throwable var7 = null;
//     var3.addSuppressed(var7);
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex((-0.4626307887385793d), 100.0d);
    boolean var3 = var2.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)10.841470984807897d, (java.lang.Number)(short)0, false);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var8 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var4, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var8.getContext();
    boolean var11 = var8.getBoundIsAllowed();
    boolean var12 = var8.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var4 = var3.getMin();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.apache.commons.math3.exception.NumberIsTooSmallException var9 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.NullArgumentException var10 = new org.apache.commons.math3.exception.NullArgumentException();
    var9.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Number var14 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var16 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, var14, false);
    var9.addSuppressed((java.lang.Throwable)var16);
    java.lang.Number var18 = var16.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(100.0d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(short)10, (java.lang.Number)(-1.087518441483038d), false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var17 = var6.atan();
    org.apache.commons.math3.complex.Complex var18 = var6.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var5 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math3.exception.NullArgumentException var7 = new org.apache.commons.math3.exception.NullArgumentException(var1, (java.lang.Object[])var6);
    org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var6);
    org.apache.commons.math3.exception.util.ExceptionContext var9 = var8.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var3 = var1.subtract(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var4 = var3.negate();
    org.apache.commons.math3.complex.Complex var5 = var3.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var10 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var7, var9);
    org.apache.commons.math3.exception.NullArgumentException var11 = new org.apache.commons.math3.exception.NullArgumentException(var6, var9);
    java.lang.Throwable[] var12 = var11.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var13 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var5, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.NullArgumentException var14 = new org.apache.commons.math3.exception.NullArgumentException(var4, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.NullArgumentException var15 = new org.apache.commons.math3.exception.NullArgumentException(var3, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.NullArgumentException var16 = new org.apache.commons.math3.exception.NullArgumentException(var2, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.NullArgumentException var17 = new org.apache.commons.math3.exception.NullArgumentException(var1, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.MathIllegalArgumentException var18 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var5 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var1, (java.lang.Number)1L, (java.lang.Number)11013.232920103323d, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math3.exception.NullArgumentException var7 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var9 = var2.cos();
    org.apache.commons.math3.complex.Complex var12 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var14 = var12.multiply(0);
    org.apache.commons.math3.complex.Complex var16 = var14.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var17 = var16.log();
    org.apache.commons.math3.complex.Complex var18 = var17.atan();
    org.apache.commons.math3.complex.Complex var19 = var2.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var2.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
    org.apache.commons.math3.complex.Complex var12 = var10.log();
    org.apache.commons.math3.complex.Complex var14 = var12.divide(0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply((-1));
    java.util.List var18 = var14.nthRoot(1);
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var21 = var20.isInfinite();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var24 = var20.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var20.tan();
    double var26 = var25.getImaginary();
    org.apache.commons.math3.complex.Complex var27 = var25.negate();
    org.apache.commons.math3.complex.Complex var28 = var14.pow(var27);
    org.apache.commons.math3.complex.Complex var29 = var14.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.3700827124762082E-54d), (java.lang.Number)11013.232920103323d, false);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)10.0f);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var4.atan();
    org.apache.commons.math3.complex.Complex var8 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var9 = var8.isInfinite();
    org.apache.commons.math3.complex.Complex var11 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var12 = var8.divide(var11);
    org.apache.commons.math3.complex.Complex var14 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var15 = var14.isInfinite();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var14.divide(var17);
    org.apache.commons.math3.complex.Complex var19 = var18.sin();
    org.apache.commons.math3.complex.Complex var20 = var8.multiply(var19);
    org.apache.commons.math3.complex.Complex var21 = var8.log();
    org.apache.commons.math3.complex.Complex var22 = var21.exp();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var24.acos();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var29 = var27.add(0.0d);
    org.apache.commons.math3.complex.Complex var30 = var25.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var21.add(var25);
    org.apache.commons.math3.complex.Complex var32 = var4.multiply(var31);
    org.apache.commons.math3.complex.Complex var33 = var32.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.22585131401251352d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    double var22 = var13.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    double var5 = var4.getArgument();
    org.apache.commons.math3.complex.ComplexField var6 = var4.getField();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var4.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    java.lang.Throwable[] var5 = var4.getSuppressed();
    org.apache.commons.math3.exception.NullArgumentException var6 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var5);
    org.apache.commons.math3.exception.util.ExceptionContext var7 = var6.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1L);
    java.lang.Number var2 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 1L+ "'", var2.equals(1L));

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 10.841470984807897d);
    org.apache.commons.math3.complex.Complex var4 = var2.subtract(6.9746078810578886E-40d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(byte)1);
    org.apache.commons.math3.exception.NumberIsTooSmallException var6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var11 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var7, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var6.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math3.exception.util.ExceptionContext var13 = var11.getContext();
    var2.addSuppressed((java.lang.Throwable)var11);
    boolean var15 = var2.getBoundIsAllowed();
    java.lang.Number var16 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (byte)1+ "'", var16.equals((byte)1));

  }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }
// 
// 
//     org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)10.0d, (java.lang.Number)11013.232920103323d, true);
//     java.lang.Throwable var4 = null;
//     var3.addSuppressed(var4);
// 
//   }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(6.9746078810578886E-40d);
//     org.apache.commons.math3.complex.Complex var3 = var1.divide(1.0d);
//     org.apache.commons.math3.complex.Complex var4 = var3.asin();
//     
//     // Checks the contract:  equals-hashcode on var1 and var4
//     assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var4
//     assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var1
//     assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var3
//     assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var6.cos();
    org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
    org.apache.commons.math3.complex.Complex var11 = var8.sin();
    org.apache.commons.math3.complex.Complex var12 = var8.reciprocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
    org.apache.commons.math3.complex.Complex var21 = var16.exp();
    org.apache.commons.math3.complex.Complex var22 = var21.cos();
    org.apache.commons.math3.complex.Complex var24 = var21.multiply(0);
    org.apache.commons.math3.complex.Complex var25 = var21.cosh();
    org.apache.commons.math3.complex.Complex var26 = var21.cosh();
    org.apache.commons.math3.complex.Complex var27 = var21.cosh();
    java.lang.String var28 = var21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "(Infinity, NaN)"+ "'", var28.equals("(Infinity, NaN)"));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 8.414709848078965d);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
    org.apache.commons.math3.complex.Complex var21 = var16.exp();
    org.apache.commons.math3.complex.Complex var22 = var21.cos();
    org.apache.commons.math3.complex.Complex var24 = var21.multiply(0);
    org.apache.commons.math3.complex.Complex var25 = var21.cosh();
    org.apache.commons.math3.complex.ComplexField var26 = var21.getField();
    boolean var27 = var21.isInfinite();
    org.apache.commons.math3.complex.Complex var28 = var21.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var4 = var3.isInfinite();
    org.apache.commons.math3.complex.Complex var6 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = var3.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var3.tan();
    org.apache.commons.math3.complex.Complex var9 = var3.cosh();
    org.apache.commons.math3.complex.Complex var10 = var3.sqrt1z();
    org.apache.commons.math3.complex.Complex var11 = var1.multiply(var3);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var22 = var21.isInfinite();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var21.divide(var24);
    org.apache.commons.math3.complex.Complex var26 = var25.sin();
    org.apache.commons.math3.complex.Complex var27 = var19.add(var26);
    boolean var28 = var16.equals((java.lang.Object)var27);
    org.apache.commons.math3.complex.Complex var29 = var11.subtract(var27);
    org.apache.commons.math3.complex.Complex var30 = var27.cos();
    double var31 = var27.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 10.841470984807897d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var4 = var3.isInfinite();
    org.apache.commons.math3.complex.Complex var6 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = var3.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var3.tan();
    org.apache.commons.math3.complex.Complex var9 = var3.cosh();
    org.apache.commons.math3.complex.Complex var10 = var3.sqrt1z();
    org.apache.commons.math3.complex.Complex var11 = var1.multiply(var3);
    org.apache.commons.math3.complex.Complex var12 = var11.reciprocal();
    org.apache.commons.math3.complex.Complex var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var14 = var12.divide(var13);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertNotNull(var12);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10.0d);
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var6 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var2, (java.lang.Number)100.0d, (java.lang.Number)2.833423582473808d, false);
    var1.addSuppressed((java.lang.Throwable)var6);
    org.apache.commons.math3.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var11 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var8, var10);
    var6.addSuppressed((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var2.sqrt1z();
    org.apache.commons.math3.complex.ComplexField var9 = var8.getField();
    java.lang.String var10 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(3.1558490151737137, 0.0)"+ "'", var10.equals("(3.1558490151737137, 0.0)"));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var7 = var4.sqrt();
    org.apache.commons.math3.complex.Complex var8 = var4.reciprocal();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var14 = var12.add(0.0d);
    org.apache.commons.math3.complex.Complex var15 = var10.subtract(var12);
    org.apache.commons.math3.complex.Complex var16 = var10.sinh();
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var21 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var24 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var27 = var26.isInfinite();
    org.apache.commons.math3.complex.Complex var29 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var30 = var26.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var30.sin();
    org.apache.commons.math3.complex.Complex var32 = var24.add(var31);
    boolean var33 = var21.equals((java.lang.Object)var32);
    org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var36 = var35.acos();
    org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var40 = var38.add(0.0d);
    org.apache.commons.math3.complex.Complex var41 = var36.divide(var40);
    org.apache.commons.math3.complex.Complex var42 = var36.sqrt1z();
    org.apache.commons.math3.complex.Complex var43 = var32.add(var42);
    org.apache.commons.math3.complex.Complex var44 = var16.pow(var32);
    org.apache.commons.math3.complex.Complex var46 = var16.multiply(0.6483608274590866d);
    boolean var47 = var16.isInfinite();
    org.apache.commons.math3.complex.Complex var48 = var4.add(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var50 = var4.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var4 = var3.getMin();
    java.lang.Number var5 = var3.getMin();
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var6, var8);
    org.apache.commons.math3.exception.util.Localizable var10 = null;
    org.apache.commons.math3.exception.util.Localizable var11 = null;
    java.lang.Object[] var13 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var14 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var11, var13);
    org.apache.commons.math3.exception.MathIllegalArgumentException var15 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var10, var13);
    org.apache.commons.math3.exception.NullArgumentException var16 = new org.apache.commons.math3.exception.NullArgumentException();
    var15.addSuppressed((java.lang.Throwable)var16);
    var9.addSuppressed((java.lang.Throwable)var16);
    var3.addSuppressed((java.lang.Throwable)var16);
    java.lang.String var20 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.apache.commons.math3.exception.NullArgumentException: null is not allowed"+ "'", var20.equals("org.apache.commons.math3.exception.NullArgumentException: null is not allowed"));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(100.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = var2.add(100.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.sqrt();
    org.apache.commons.math3.complex.Complex var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var7 = var4.multiply(var6);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    org.apache.commons.math3.exception.util.ExceptionContext var2 = var1.getContext();
    java.lang.Number var3 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(35.292993472120365d, 0.5752220392306203d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(1.5707055269358083d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var3);
    org.apache.commons.math3.exception.NullArgumentException var5 = new org.apache.commons.math3.exception.NullArgumentException(var0, var3);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math3.exception.util.ExceptionContext var7 = var5.getContext();
    org.apache.commons.math3.exception.NumberIsTooSmallException var11 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var12 = var11.getMin();
    java.lang.Throwable[] var13 = var11.getSuppressed();
    org.apache.commons.math3.exception.NumberIsTooSmallException var17 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.NullArgumentException var18 = new org.apache.commons.math3.exception.NullArgumentException();
    var17.addSuppressed((java.lang.Throwable)var18);
    var11.addSuppressed((java.lang.Throwable)var17);
    var5.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math3.exception.util.ExceptionContext var22 = var5.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0+ "'", var12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d);
//     org.apache.commons.math3.complex.Complex var3 = var1.subtract(2.9932228461263786d);
//     org.apache.commons.math3.complex.Complex var5 = new org.apache.commons.math3.complex.Complex(0.0d);
//     boolean var6 = var5.isInfinite();
//     org.apache.commons.math3.complex.Complex var7 = var5.cos();
//     org.apache.commons.math3.complex.Complex var8 = var3.add(var5);
//     org.apache.commons.math3.complex.Complex var10 = var3.multiply(0.0d);
//     
//     // Checks the contract:  equals-hashcode on var5 and var10
//     assertTrue("Contract failed: equals-hashcode on var5 and var10", var5.equals(var10) ? var5.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var5
//     assertTrue("Contract failed: equals-hashcode on var10 and var5", var10.equals(var5) ? var10.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(byte)1);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var17 = var15.multiply(Double.NaN);
    boolean var18 = var17.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)8.414709848078965d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var17 = var6.atan();
    org.apache.commons.math3.complex.Complex var20 = new org.apache.commons.math3.complex.Complex(1.0d, 6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var21 = var6.pow(var20);
    org.apache.commons.math3.complex.Complex var22 = var20.negate();
    org.apache.commons.math3.complex.Complex var23 = var20.conjugate();
    org.apache.commons.math3.complex.Complex var25 = var20.multiply(9267.315951198088d);
    double var26 = var20.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 6.9746078810578886E-40d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var3 = var1.subtract(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var5 = new org.apache.commons.math3.complex.Complex(0.0d);
    boolean var6 = var5.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = var5.cos();
    org.apache.commons.math3.complex.Complex var8 = var3.add(var5);
    boolean var9 = var8.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var2.sinh();
    org.apache.commons.math3.complex.Complex var13 = var12.exp();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.9984277357858338d);
    org.apache.commons.math3.complex.Complex var16 = var13.sqrt1z();
    org.apache.commons.math3.complex.ComplexField var17 = var13.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    as
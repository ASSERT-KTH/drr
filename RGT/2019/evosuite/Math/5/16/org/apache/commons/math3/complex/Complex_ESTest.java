/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 19:35:18 GMT 2019
 */

package org.apache.commons.math3.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class Complex_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.pow(0.0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.I;
      ComplexField complexField0 = complex0.ONE.getField();
      assertNotNull(complexField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      String string0 = complex0.I.toString();
      assertEquals("(0.0, 1.0)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.I;
      boolean boolean0 = complex0.isNaN();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.sin();
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.divide(2.2273635587196807E-39);
      Complex complex2 = complex1.cos();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(4.4896128253746495E38, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.multiply(complex0);
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.multiply(complex0);
      Complex complex2 = complex1.add(complex0);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.pow(complex0);
      Complex complex2 = complex1.add(2.0);
      assertNotSame(complex2, complex1);
      assertFalse(complex1.isInfinite());
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.add(776.7732237);
      assertEquals(1553.5464474, complex1.getReal(), 0.01);
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-20.0), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.add(Double.NaN);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = new Complex(1459.7517906822773, 1459.7517906822773);
      Complex complex1 = complex0.NaN.asin();
      Complex complex2 = complex0.ONE.divide(complex1);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(1459.7517906822773, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(1459.7517906822773, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1133.986246749625, 1133.986246749625);
      Complex complex1 = complex0.ZERO.multiply(8);
      Complex complex2 = complex1.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.atan();
      Complex complex2 = complex1.pow((-265.501647));
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = new Complex(0.0, 0.0);
      Complex complex1 = complex0.log();
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(1.0);
      Complex complex1 = complex0.INF.atan();
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.divide(0.5450005531311035);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.divide(0.0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertTrue(complex1.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.divide(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.valueOf(2.0, 0.9999373469035624);
      Complex complex1 = complex0.divide(Double.POSITIVE_INFINITY);
      assertEquals(2.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.9999373469035624, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1133.986246749625, 1133.986246749625);
      Complex complex1 = complex0.reciprocal();
      assertEquals(4.409224551295603E-4, complex1.getReal(), 0.01);
      assertEquals(1133.986246749625, complex0.getReal(), 0.01);
      assertEquals(1133.986246749625, complex0.getImaginary(), 0.01);
      assertEquals((-4.409224551295603E-4), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = new Complex((-1178.4773219755));
      Complex complex1 = complex0.NaN.reciprocal();
      assertEquals((-1178.4773219755), complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.I.reciprocal();
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(boolean0);
      assertFalse(complex1.isNaN());
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.ZERO.reciprocal();
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(776.7732237, complex0.getReal(), 0.01);
      assertFalse(complex0.isNaN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.INF;
      boolean boolean0 = complex0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex0.multiply(complex1);
      boolean boolean0 = complex1.equals(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(776.7732237, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.tanh();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.INF.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.divide(complex0);
      complex1.hashCode();
      assertTrue(complex0.isInfinite());
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1133.986246749625, 1133.986246749625);
      Complex complex1 = complex0.INF.sqrt1z();
      Complex complex2 = complex1.I.multiply(complex1);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(1133.986246749625, complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      assertFalse(complex0.isInfinite());
      assertEquals(1133.986246749625, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = new Complex(1459.7517906822773, 1459.7517906822773);
      Complex complex1 = complex0.INF.createComplex(2768.3971534379725, Double.POSITIVE_INFINITY);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(2768.3971534379725, complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.I.multiply(complex0);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply((-2906));
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = new Complex(Double.NaN);
      Complex complex1 = complex0.INF.multiply(17);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
      assertTrue(complex0.isNaN());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply((-1033));
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.INF.multiply((-20.0));
      assertFalse(complex0.isNaN());
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(776.7732237, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.valueOf(6.283185307179586, Double.POSITIVE_INFINITY);
      Complex complex1 = complex0.multiply(1.0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(6.283185307179586, complex0.getReal(), 0.01);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = (Complex)complex0.I.readResolve();
      Complex complex2 = complex1.pow(Double.POSITIVE_INFINITY);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertTrue(complex2.isNaN());
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.negate();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.subtract(complex0);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.sqrt1z();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.NaN.subtract(0.0);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.subtract(1787.875);
      assertEquals((-1786.875), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = new Complex(1.0);
      Complex complex1 = complex0.subtract(Double.NaN);
      Complex complex2 = complex1.sin();
      assertFalse(complex0.isInfinite());
      assertFalse(complex0.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.NaN.multiply(complex0);
      Complex complex2 = complex1.acos();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertSame(complex2, complex1);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.asin();
      assertEquals(1.5450544524276772, complex1.getReal(), 0.01);
      assertEquals((-7.348626571523015), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      Complex complex2 = complex1.atan();
      assertSame(complex2, complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cosh();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.INF.tan();
      Complex complex2 = complex1.sinh();
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertFalse(complex0.isNaN());
      assertEquals(776.7732237, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-7.635830383612894E-133));
      Complex complex1 = complex0.pow(complex0);
      Complex complex2 = complex1.acos();
      assertEquals(1.5488275771439506E-66, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-2.3988668637216E-132), complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = new Complex(0.0);
      Complex complex1 = complex0.INF.cosh();
      Complex complex2 = complex1.tan();
      assertTrue(complex2.isNaN());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertFalse(complex0.isInfinite());
      assertNotSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1133.986246749625, 1133.986246749625);
      Complex complex1 = complex0.tan();
      assertEquals(1133.986246749625, complex0.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getImaginary(), 0.01);
      assertEquals(1133.986246749625, complex0.getReal(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-2429.719011966097), (-2429.719011966097));
      Complex complex1 = complex0.tan();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-2429.719011966097), complex0.getReal(), 0.01);
      assertEquals((-1.0), complex1.getImaginary(), 0.01);
      assertEquals((-2429.719011966097), complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.sinh();
      Complex complex2 = complex1.cos();
      Complex complex3 = complex2.tanh();
      assertFalse(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex3.isNaN());
      assertTrue(complex1.isInfinite());
      assertEquals((-20.0), complex0.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertNotSame(complex3, complex2);
      assertEquals(776.7732237, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.valueOf(0.0, 0.0);
      Complex complex1 = complex0.INF.conjugate();
      Complex complex2 = complex1.tanh();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(complex1.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex1.getImaginary(), 0.01);
      assertFalse(complex0.isInfinite());
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = new Complex(776.7732237, (-20.0));
      Complex complex1 = complex0.tanh();
      assertEquals(776.7732237, complex0.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.valueOf((-859.93224267), (-859.93224267));
      Complex complex1 = complex0.tanh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals((-859.93224267), complex0.getReal(), 0.01);
      assertEquals((-859.93224267), complex0.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals((-1.0), complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.valueOf(1133.986246749625, 1133.986246749625);
      List<Complex> list0 = complex0.nthRoot(8);
      assertEquals(1133.986246749625, complex0.getImaginary(), 0.01);
      assertEquals(1133.986246749625, complex0.getReal(), 0.01);
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.INF;
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math3.complex.Complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(2136);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.INF.nthRoot(1159);
      assertFalse(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.valueOf((double) 8, Double.NaN);
      assertEquals(Double.NaN, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = Complex.valueOf(Double.NaN);
      assertEquals(Double.NaN, complex0.getImaginary(), 0.01);
  }
}

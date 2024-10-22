/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:23:08 GMT 2014
 */

package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class BrentSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-1184.8292324702188);
      doubleArray0[3] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-1184.8292324702188), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, (-1184.8292324702188), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
      
      double double1 = Double.NaN;
      try {
        double double2 = brentSolver0.solve(double1, double1, doubleArray0[3]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = 0.0;
      double double1 = (-2100.079877913271);
      doubleArray0[4] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2100.079877913271), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2100.079877913271), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      
      double double2 = brentSolver0.solve(doubleArray0[4], double0);
      assertEquals(0.0, double2, 0.01D);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2100.079877913271), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, polynomialFunction0.degree());
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      double double0 = (-2137.1383845888236);
      doubleArray0[12] = double0;
      doubleArray0[4] = doubleArray0[12];
      double double1 = 2982.430490085167;
      doubleArray0[7] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 2982.430490085167, 0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(20, polynomialFunction0.degree());
      
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 2982.430490085167, 0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction1);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(19, polynomialFunction1.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction1);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 2982.430490085167, 0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(19, polynomialFunction1.degree());
      
      double double2 = brentSolver0.solve(doubleArray0[4], doubleArray0[7]);
      assertEquals(3.9003046640829535E-7, double2, 0.01D);
      assertNotSame(polynomialFunction0, polynomialFunction1);
      assertNotSame(polynomialFunction1, polynomialFunction0);
      assertFalse(polynomialFunction0.equals((Object)polynomialFunction1));
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(polynomialFunction1.equals((Object)polynomialFunction0));
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 2982.430490085167, 0.0, 0.0, 0.0, 0.0, (-2137.1383845888236), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(20, polynomialFunction0.degree());
      assertEquals(19, polynomialFunction1.degree());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[8] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(polynomialFunction0);
      //  // Unstable assertion: assertEquals(9, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotNull(brentSolver0);
      //  // Unstable assertion: assertEquals(9, polynomialFunction0.degree());
      //  // Unstable assertion: assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      //  // Unstable assertion: assertEquals(100, brentSolver0.getMaximalIterationCount());
      //  // Unstable assertion: assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(doubleArray0[4], doubleArray0[8]);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,NaN]  Values: [NaN,NaN]
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 392.4518952723;
      double double1 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(6, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(6, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals(392.4518952723, double2, 0.01D);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(6, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 1.0;
      doubleArray0[8] = double0;
      doubleArray0[0] = doubleArray0[8];
      doubleArray0[5] = doubleArray0[0];
      double double1 = (-3101.751960860398);
      doubleArray0[7] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      
      double double2 = brentSolver0.solve(doubleArray0[5], double1, doubleArray0[5]);
      assertEquals(0.31725203057927853, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertEquals(8, polynomialFunction0.degree());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 1.0;
      doubleArray0[8] = double0;
      doubleArray0[0] = doubleArray0[8];
      doubleArray0[3] = doubleArray0[8];
      double double1 = (-3101.751960860398);
      doubleArray0[7] = double1;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(doubleArray0[4], double0, doubleArray0[3]);
      assertEquals(0.31855107784764547, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, (-3101.751960860398), 1.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(8, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 392.4518952723;
      double double1 = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(6, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(6, polynomialFunction0.degree());
      
      double double2 = brentSolver0.solve(double1, doubleArray0[3]);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(6, polynomialFunction0.degree());
      
      double double3 = brentSolver0.solve(double0, double2, double1);
      assertEquals(0.0, double3, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertTrue(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertTrue(double3 == double2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(6, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(4, polynomialFunction0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4, polynomialFunction0.degree());
      
      double double0 = (-1894.5150317733394);
      double double1 = 209.3;
      double double2 = brentSolver0.solve(double0, double1);
      assertEquals((-1894.5150317733394), double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4, polynomialFunction0.degree());
      
      double double3 = brentSolver0.solve(double0, double1, double2);
      assertEquals((-1894.5150317733394), double3, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertTrue(double3 == double0);
      assertTrue(double3 == double2);
      assertFalse(double3 == double1);
      assertTrue(double0 == double3);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double2 == double3);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = (-2074.41);
      doubleArray0[1] = double0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, (-2074.41)}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {0.0, (-2074.41)}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
      
      double double1 = brentSolver0.solve(double0, doubleArray0[0], double0);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, (-2074.41)}, doubleArray0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, polynomialFunctionLagrangeForm0.degree());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double double0 = 183.143;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunctionLagrangeForm0);
      assertEquals(14, polynomialFunctionLagrangeForm0.degree());
      
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) polynomialFunctionLagrangeForm0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(brentSolver0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(14, polynomialFunctionLagrangeForm0.degree());
      
      // Undeclared exception!
      try {
        double double1 = brentSolver0.solve(double0, double0, doubleArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 0.0  Endpoints: [183.143,183.143]
         //
      }
  }
}

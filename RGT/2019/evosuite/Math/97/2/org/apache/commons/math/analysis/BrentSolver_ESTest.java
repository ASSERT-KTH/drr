/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 17:54:31 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class BrentSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-4402.4), 2139.15, 1.5);
      assertEquals(1.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve(1.0, 0.0, 1.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial guess is not in search interval.  Initial: 1.5  Endpoints: [1.0,0.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-3585.035815);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(0.0, (-3585.035815), (-856.152));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3996.95;
      doubleArray0[6] = (-1420.18235779584);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(656.98187963, 0.0, 0.5);
      assertEquals(1.1882214156876596, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = 1405.6561984;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(376.32177341357, 0.0, 1.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 2530.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction1);
      double double0 = brentSolver0.solve(1221.9765642397, (-1641.0), 1.0);
      assertEquals((-2.220446049250313E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-228.7353), Double.NaN);
      assertEquals((-228.7353), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [0.0,0.5]  Values: [-1.0,-1.0]
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setFunctionValueAccuracy(5.3335888594843616E17);
      double double0 = brentSolver0.solve(0.0, 0.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 909.1229749124;
      doubleArray0[1] = (-821.87169698176);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setFunctionValueAccuracy(909.1229749124);
      double double0 = brentSolver0.solve((-1754.66591821859), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 2745.4261982462626;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-1.0), 1702.5488173);
      assertEquals((-2.7428199764026096E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-20.385105642);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-228.7353), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 2745.4261982462626;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      try { 
        brentSolver0.solve(2745.4261982462626, 2149.0974594, Double.NaN);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}

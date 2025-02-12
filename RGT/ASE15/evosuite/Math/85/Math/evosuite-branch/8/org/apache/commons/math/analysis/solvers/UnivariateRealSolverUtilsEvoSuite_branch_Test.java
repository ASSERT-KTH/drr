/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:33:34 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class UnivariateRealSolverUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = 2065.4;
      doubleArray0[1] = double0;
      double double1 = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 2065.4, 0.0}, doubleArray0, 0.01);
      
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double1, double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=2,065, maximum iterations=2,147,483,647, initial=2,065.4, lower bound=1, upper bound=2,065.4, final a value=1, final b value=2,065.4, f(a)=2,065.4, f(b)=4,265,877.16
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 1596.0;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = double0;
      doubleArray0[2] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(2, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {1596.0, 0.0, 1596.0}, doubleArray0, 0.01);
      
      double double1 = 3586.371452308784;
      int int0 = 94;
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[0], double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=94, maximum iterations=94, initial=1,596, lower bound=1,596, upper bound=3,586.371, final a value=1,596, final b value=1,690, f(a)=4,065,358,332, f(b)=4,558,337,196
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = 1596.0;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(1, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {1596.0, 1596.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 2;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[1], double0, doubleArray0[1], int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,596,  initial=1,596, upper bound=1,596
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double double0 = 479.9067805781;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[2], doubleArray0[4]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=479.907, upper bound=0
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      double double1 = (-456.8828097388488);
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double1, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=-456.883, upper bound=0
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 0;
      // Undeclared exception!
      try {
        double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
      }
  }

  //@Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = 1596.0;
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      int int0 = 94;
      double[] doubleArray1 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[0], double0, int0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 1.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = 1.0;
      // Undeclared exception!
      try {
        double double1 = UnivariateRealSolverUtils.solve(univariateRealFunction0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      // Undeclared exception!
      try {
        double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) polynomialFunction0, doubleArray0[2], doubleArray0[2], doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = null;
      double double0 = (-2350.2326268485);
      // Undeclared exception!
      try {
        double[] doubleArray0 = UnivariateRealSolverUtils.bracket(univariateRealFunction0, double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 0.0;
      double double1 = UnivariateRealSolverUtils.midpoint(doubleArray0[1], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }
}

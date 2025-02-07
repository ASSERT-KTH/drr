/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 04:52:10 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class BrentSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2980.51947;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve(1.0E-15, 2980.51947, 274.985319);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-214.2856109958926), 474.840931, 0.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-118.01497689364905), 0.0809256299566336, 1.975723387613125E-5);
      assertEquals(27, brentSolver0.getIterationCount());
      assertEquals((-8.693149611692122E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 115.73000000000002;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-241.51549605505656), 0.0, (-1.9485366637423398));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1748.191498;
      doubleArray0[1] = (-0.008440042058051954);
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-0.008440042058051954), 1748.191498, (-4.411124508693241E-11));
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals((-4.411124508693241E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 1694.9124940138, 276.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0, 1,694.912], Values: [1, 1]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2980.51947;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve(0.0, 1.0E-6);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2980.51947;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 1.5, 115.73);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [1.5, 115.73], Values: [1.5, 115.73]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 3485.36517030764;
      doubleArray0[7] = (-4034.7669848837);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setFunctionValueAccuracy(2514.8968);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0, 75.4904);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.0E-6;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-252.61612198), 1.0E-6);
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2980.51947;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-816.4459777723), -0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setRelativeAccuracy(Double.NaN);
      try { 
        brentSolver0.solve((-214.2856109958926), 474.840931, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2980.51947;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-1.0), 274.985319);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1260.553074164;
      doubleArray0[4] = (-954.8682463026008);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-954.8682463026008), 0.0);
      assertEquals(25, brentSolver0.getIterationCount());
      assertEquals((-1.0719003676412513), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = (-2418.036213431);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-1181.8676), 1469.90344241897);
      assertEquals(43, brentSolver0.getIterationCount());
      assertEquals((-8.297481368481005E-5), double0, 0.01);
  }
}

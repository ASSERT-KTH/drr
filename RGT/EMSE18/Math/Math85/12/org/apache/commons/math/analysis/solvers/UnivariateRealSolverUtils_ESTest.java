/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 01:10:23 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class UnivariateRealSolverUtils_ESTest  {

  //@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.0, 0.0, 0.0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) (-2146515257), (double) (-2146515257), (double) (-2146515257), (-2146515257));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -2,146,515,257
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, (-1971.456988), 2920.1, (-2612.38991277555));
      assertEquals(1429.4246573833566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-984.1655), 0.5, (-1.0));
      assertEquals((-3.917187446594182E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 946.996136156957);
      assertEquals(717.8539213322639, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) sinFunction0, (-696.64), (-348.07));
      assertEquals((-474.38049076833425), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-1.0), (-1967.331));
      assertEquals((-984.1655), double0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, 0.0, (-1742.255024));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,742.255]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-2339.26705), (-2339.26705), 171.0, 1319);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=1, final a value=0, final b value=1, f(a)=0, f(b)=1.718
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 5.0, Double.NaN, 5.0, 994);
      assertArrayEquals(new double[] {Double.NaN, 5.0}, doubleArray0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, 1011.5783597982247, 1011.5783597982247, 1130);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,011.578,  initial=0, upper bound=1,011.578
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, (-1.0), (-1.0), (-313.2), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (double) (-71), (double) (-71), (double) (-71));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0), (-1.0), 0.0, 1514);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=1,514, initial=-1, lower bound=-1, upper bound=0, final a value=-1, final b value=0, f(a)=1.5, f(b)=0.25
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  //@Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-3115.5), (-3115.5), 979.6973895, 990);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=990, maximum iterations=990, initial=-3,115.5, lower bound=-3,115.5, upper bound=979.697, final a value=-3,115.5, final b value=-2,125.5, f(a)=-293,520,691,587,315,070, f(b)=-43,381,586,088,485,528
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, Double.NaN, Double.NaN, Double.NaN);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, Double.NaN, 1012.61, 0.0, 1130);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,012.61,  initial=\uFFFD, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 1227.56918, 312.932289, 312.932289, 18);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=312.932,  initial=1,227.569, upper bound=312.932
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-1967.331), (-544.21283606319), 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=-544.213,  initial=-1,967.331, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  //@Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1779.57138068186, 1779.57138068186, 1779.57138068186, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, 0.0, 1.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(312.932289, 312.932289);
      assertEquals(312.932289, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-247.11), 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 21:08:33 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class BaseSecantSolver_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5, 1429.43, (-1320.280649158825));
      Rint rint0 = new Rint();
      illinoisSolver0.solve(16, (UnivariateRealFunction) rint0, (-1.0), 1429.43, (-1.0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3553.9868468606), 0.333333333333333, 2108.0);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(76, (UnivariateRealFunction) sinc0, (-3553.9868468606), 1.7029898543501842E-8, allowedSolution0);
      assertEquals(1.7029898543501842E-8, illinoisSolver0.getMax(), 0.01);
      assertEquals((-3553.2386646011114), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1638, (UnivariateRealFunction) sinh0, 0.0, 2689.436772655, allowedSolution0);
      assertEquals(2689.436772655, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1655, (UnivariateRealFunction) sinh0, 620.884085313, 0.0, allowedSolution0);
      assertEquals(310.4420426565, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(50, (UnivariateRealFunction) sinh0, (-0.5831911549930796), 2689.436772655, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (50) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(644, (UnivariateRealFunction) sin0, 10.078856591183, (double) 644, allowedSolution0);
      assertEquals(327.0394282955915, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(12.566370614359174, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(32, (UnivariateRealFunction) log0, 0.0, 810.1678022413731, 810.1678022413731);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (32) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(611, (UnivariateRealFunction) sin0, (-0.11618706409090607), (double) 611, allowedSolution0);
      assertEquals(305.44190646795454, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(6.858604444930381E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(611, (UnivariateRealFunction) sin0, 4.0, (double) 611, allowedSolution0);
      assertEquals(307.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(18.84955592153876, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, (-86.653), (double) 1839, 0.6931470632553101, allowedSolution0);
      assertEquals(0.6931470632553101, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.712388980384691), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(611, (UnivariateRealFunction) sin0, 4.0, (double) 611, allowedSolution0);
      assertEquals(307.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(18.849555922165603, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, 5.730619399300113E-7, (double) 1839, (-86.65307583899), allowedSolution0);
      assertEquals((-86.65307583899), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(70.68583470577036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, 5.730619399300113E-7, (double) 1839, (-86.65307583899), allowedSolution0);
      assertEquals((-86.65307583899), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(70.68583470577035, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, 0.6510601771810114, (double) 1839, (-86.65307583899), allowedSolution0);
      assertEquals((-86.65307583899), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1798.5617941801565, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, 19.3609, (double) 1839, (-86.65307583899), allowedSolution0);
      assertEquals((-86.65307583899), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1792.278608872977, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1839, (UnivariateRealFunction) cos0, 0.6510601771810114, (double) 1839, (-1135.9344082141918), allowedSolution0);
      assertEquals((-1135.9344082141918), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1798.5617941801565, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(3496, (UnivariateRealFunction) sin0, 4.0, (double) 3496, allowedSolution0);
      assertEquals(1750.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(823.0972752405258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3496, (UnivariateRealFunction) sin0, 4.0, (double) 3496, allowedSolution0);
      assertEquals(1750.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(823.0972752320165, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(611, (UnivariateRealFunction) sin0, 4.0, (double) 611, allowedSolution0);
      assertEquals(307.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(18.849555922165603, double0, 0.01);
  }
}

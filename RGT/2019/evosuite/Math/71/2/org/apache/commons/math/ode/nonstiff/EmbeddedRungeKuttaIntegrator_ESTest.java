/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 02:26:34 GMT 2019
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class EmbeddedRungeKuttaIntegrator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2714.41), (-2714.41), (-2714.41), (-2714.41));
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 3330.1012);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 527.8081592054236, 0.0, (-981.29515));
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2402.39945271, 1547.266, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      dormandPrince853Integrator0.addEventHandler(eventHandler0, 1547.266, 0.2222222222222222, 1);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, (-293155.99602242117), doubleArray0, 1547.266, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1927.081704789885, 1927.081704789885, (-378.4520521755), (-3363.521));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 1927.081704789885, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2714.41), (-2714.41), (-2714.41), (-2714.41));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.2, doubleArray0, 0.7031968614664952, doubleArray0);
      assertEquals(74, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.7031968614664934, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2714.41);
      doubleArray0[1] = (-2714.41);
      doubleArray0[2] = (-2714.41);
      doubleArray0[3] = (-2714.41);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2714.41), (-2714.41), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-2714.41), fixedStepHandler0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.2839775786010416, doubleArray0, 1226.2461149813, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2839775786010416, 10.0, (-2714.41), 1226.2461149813);
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, (-3210198.6443010992), doubleArray0, 625.03125593419, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2714.41);
      doubleArray0[1] = (-2714.41);
      doubleArray0[2] = (-2714.41);
      doubleArray0[3] = (-2714.41);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2714.41), (-2714.41), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.2839775786010416, doubleArray0, (-2714.41), doubleArray0);
  }
}

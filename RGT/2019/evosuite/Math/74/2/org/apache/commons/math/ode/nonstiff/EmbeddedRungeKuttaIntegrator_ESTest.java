/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 10:36:54 GMT 2019
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
import org.apache.commons.math.ode.sampling.DummyStepHandler;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class EmbeddedRungeKuttaIntegrator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2827.25243194), 5064.1, (-2827.25243194), (-2827.25243194));
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-278.552182164), 0.0, (-2776.9231051259285), (-278.552182164));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1196.8703117503646), 1.0, (-799.31898218), 1.0);
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(8.837707276265386, 2428.1, (-141.9993020253906), (-141.9993020253906));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[10];
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 8.837707276265386, doubleArray0, (-1280.50748707), doubleArray0);
      assertEquals(32, dormandPrince54Integrator0.getEvaluations());
      assertEquals((-1280.50748707), double0, 0.01);
  }

//  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-853.9314533688062), (-4575.4092647), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, 512.84585549, doubleArray0, 0.0, doubleArray1);
  }

//  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, 2428.1, (-126.737), (-126.737));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-3883.1), fixedStepHandler0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(firstOrderConverter0, (-126.737), doubleArray0, 1134.48916, doubleArray0);
  }

//  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-0.008298), (-0.008298), (-0.008298), (-1484.0));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      highamHall54Integrator0.addEventHandler(eventHandler0, (-1484.0), (-296.3), 0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, (-0.008298), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(8.837707276265386, 2428.1, (-141.9993020253906), (-141.9993020253906));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      dormandPrince54Integrator0.addStepHandler(dummyStepHandler0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[10];
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 5, doubleArray0, 8.837707276265386, doubleArray0);
      assertEquals(14, dormandPrince54Integrator0.getEvaluations());
      assertEquals(8.837707276265386, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, 2428.1, (-126.737), (-126.737));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[10];
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 10.0, doubleArray0, 1433.49361, doubleArray0);
      assertEquals(32, dormandPrince54Integrator0.getEvaluations());
      assertEquals(1433.49361, double0, 0.01);
  }
}

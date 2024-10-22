/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 02:45:08 GMT 2019
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(17.00995275094736, 17.00995275094736, 17.00995275094736, 0.0);
      dormandPrince853Integrator0.getMinReduction();
      dormandPrince853Integrator0.setSafety(0.0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, 0.2, (-0.55));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      dormandPrince54Integrator0.addEventHandler(eventHandler0, (-1014.2014735179694), 0.2, 2882);
      double[] doubleArray0 = new double[2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 0.2, doubleArray0);
      doubleArray0[0] = 0.2;
      dormandPrince54Integrator0.getOrder();
      dormandPrince853Integrator0.getSafety();
      dormandPrince54Integrator0.setSafety(0.2);
      dormandPrince54Integrator0.getMinReduction();
      dormandPrince54Integrator0.getOrder();
      dormandPrince853Integrator0.setMaxGrowth(961.3);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1, 0.2, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.getOrder();
      assertEquals(961.3, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(240.155067450005, 240.155067450005, 1826.453526804906, 1826.453526804906);
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, (-939.734784584722), (-939.734784584722), (-0.55));
      double[] doubleArray0 = new double[2];
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(firstOrderConverter0, (-1.0), doubleArray0, (-5637.2777377253), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, 0.2, (-0.55));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      dormandPrince54Integrator0.addEventHandler(eventHandler0, (-1014.2014735179694), 0.2, 2882);
      double[] doubleArray0 = new double[2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 0.2, doubleArray0);
      assertEquals(14, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1, 0.2, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, (-1.0), doubleArray0, 5.43484032576144E-19, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(5, 672.0, (-48.20000000000012), 5);
      highamHall54Integrator0.integrate(firstOrderConverter0, (-1.0), doubleArray0, (-10560.282630431942), doubleArray0);
      assertEquals(134, highamHall54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, (-939.734784584722), (-939.734784584722), (-0.55));
      double[] doubleArray0 = new double[2];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      dormandPrince54Integrator0.integrate(firstOrderConverter0, (-5637.2777377253), doubleArray0, (-1.0), doubleArray0);
      assertEquals(68, dormandPrince54Integrator0.getEvaluations());
  }
}

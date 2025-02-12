/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 02:52:09 GMT 2019
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.GillIntegrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class RungeKuttaIntegrator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1.2835982148785365);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      gillIntegrator0.integrate(firstOrderConverter0, 0, doubleArray0, 0.9777777777777777, doubleArray1);
      assertEquals(8, gillIntegrator0.getEvaluations());
  }

////  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(2.38466765651207);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0);
      classicalRungeKuttaIntegrator0.addStepHandler(stepNormalizer0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, 2.38466765651207, doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2699.29233));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      classicalRungeKuttaIntegrator0.addEventHandler(eventHandler0, 579.504581707183, 2.220446049250313E-16, 294);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, (-2699.29233), doubleArray0, 0.0, doubleArray0);
      assertEquals(8, classicalRungeKuttaIntegrator0.getEvaluations());
  }

////  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, (-2312.9108697642337), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(2.38466765651207);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, 2.3846676565120704, doubleArray0, 0.0, doubleArray0);
      assertEquals(8, classicalRungeKuttaIntegrator0.getEvaluations());
  }
}

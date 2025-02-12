/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 19:10:40 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class AdaptiveStepsizeIntegrator_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      StepProblem stepProblem0 = new StepProblem((-9.332130526430229), (double) 0, 0.01);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1169.64393519, 663.19, (-943.7751298), 1747.852644);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 2287.271678, doubleArray0, (-9.332130526430229), doubleArray0);
      assertEquals(50, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1371.908037113, 1371.908037113, (-3502.7763202994), (-3502.7763202994));
      double double0 = dormandPrince853Integrator0.filterStep(0.0, true, true);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1371.908037113, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1371.908037113, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 10.0, 0.0);
      double[] doubleArray0 = new double[2];
      dormandPrince853Integrator0.setInitialStepSize(0.0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep((FirstOrderDifferentialEquations) null, false, 1124, doubleArray0, (-1941.24), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 1.0E-12);
      dormandPrince54Integrator0.resetInternalState();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2059.60754), 0.0, Double.NaN, Double.NaN);
      double double0 = graggBulirschStoerIntegrator0.getMinStep();
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(2059.60754, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1224.29105513925), 272.032, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(272.032, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1224.29105513925), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-49.500663533991734), (-49.500663533991734), (-49.500663533991734), (-4.436036387594894));
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(49.500663533991734, double0, 0.01);
      assertEquals(49.500663533991734, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3.75), (-3.75), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals((-3.75), double0, 0.01);
      assertEquals(3.75, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 10.0, 0.0);
      double double0 = dormandPrince853Integrator0.filterStep((-663.19), false, false);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1371.908037113, 1371.908037113, (-3502.7763202994), (-3502.7763202994));
      double double0 = dormandPrince853Integrator0.filterStep(1371.908037113, true, true);
      assertEquals(1371.908037113, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1371.908037113, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1224.29105513925), (-1224.29105513925), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.filterStep(0.001, false, false);
      assertEquals((-1224.29105513925), double0, 0.01);
      assertEquals(1224.29105513925, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1.0), 0.0, 0.0, Double.NaN);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[7];
      try { 
        dormandPrince853Integrator0.sanityChecks(testProblem5_0, 2.382468931778144, doubleArray0, 0.75, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 2, initial state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-12, 1.0E-12, 2.38466765651207, 1.0E-12);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.sanityChecks((FirstOrderDifferentialEquations) null, 1.0E-12, doubleArray0, 90.94851033476543, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(132.26848, 132.26848, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.integrate(testProblem5_0, 132.26848, doubleArray0, 132.26848, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(477.4372, (-1143.703), (-690.7260337967986), (-690.7260337967986));
      StepProblem stepProblem0 = new StepProblem((-690.7260337967986), 925.83028882, 0.0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate(stepProblem0, 3607.4160381, (double[]) null, 1.0E-12, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2059.60754), 0.0, Double.NaN, Double.NaN);
      StepProblem stepProblem0 = new StepProblem(Double.NaN, (double) (-1085), (double) 3757);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[3];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, 2, doubleArray0, (-82.729235253891), doubleArray1, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(937.19147334818, (-25.69393346270375), 937.19147334818, 937.19147334818);
      try { 
        graggBulirschStoerIntegrator0.filterStep((-25.69393346270375), false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (9.37E02) reached, integration needs 2.57E01
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-613.5309), (-2.0), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-613.5309), (-2238.0), (-2.0));
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep(stepProblem0, true, 529, doubleArray0, 2147.523601402871, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      StepProblem stepProblem0 = new StepProblem(5.724581311622069E-4, 238.09422520677, 3142.746);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3970.217261348039, 238.09422520677, 1561.76328761375, 238.09422520677);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(stepProblem0, false, (-2552), doubleArray0, (-3429.135), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 1.0E-12);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 1.0E-12);
      double double0 = dormandPrince54Integrator0.getMaxStep();
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 5.333333333333333;
      doubleArray0[1] = 5.333333333333333;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5.333333333333333, 0.0, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 5.333333333333333, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (5.33E00) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 259.7469890935371, (double) 5, 259.7469890935371, (double) 5);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        adamsBashforthIntegrator0.integrate(testProblem5_0, 440.7445, doubleArray0, 2468.0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (2.60E02) reached, integration needs 5.74E00
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-943.7751298);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((double) 0, (-9.332130526430229), (-943.7751298), (-943.7751298));
      StepProblem stepProblem0 = new StepProblem((-9.332130526430229), (double) 5, 0.01);
      stepProblem0.eventOccurred(2957.2312872048383, doubleArray0, false);
      dormandPrince54Integrator0.integrate(stepProblem0, 51.08818800130078, doubleArray0, 0, doubleArray0);
      assertArrayEquals(new double[] {(-1199.2160698065036)}, doubleArray0, 0.01);
      assertEquals(74, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-943.7751298);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((double) 0, (-9.332130526430229), (-943.7751298), (-943.7751298));
      StepProblem stepProblem0 = new StepProblem((-9.332130526430229), (double) 5, 0.01);
      dormandPrince54Integrator0.integrate(stepProblem0, 50.666666666666664, doubleArray0, 0, doubleArray0);
      assertEquals(50, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-943.7751298), (-943.7751298), doubleArray0, doubleArray0);
      StepProblem stepProblem0 = new StepProblem((-9.332130526430229), (double) 5, 0.01);
      highamHall54Integrator0.sanityChecks(stepProblem0, 2287.271678, doubleArray0, (-1475.4297), doubleArray0);
      assertEquals(943.7751298, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 84.32040550667716, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.001);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(84.32040550667716, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((double) 2, (-1192.001), 0.0, 1156.80606291);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.0);
      assertEquals(48.82624294372853, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1224.29105513925), (-1224.29105513925), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getCurrentStepStart();
      assertEquals(1224.29105513925, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-943.7751298), (-943.7751298), doubleArray0, doubleArray0);
      highamHall54Integrator0.setInitialStepSize(94326.0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(943.7751298, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((double) 0, (-9.332130526430229), (-943.7751298), (-943.7751298));
      StepProblem stepProblem0 = new StepProblem((-9.332130526430229), (double) 5, 0.01);
      dormandPrince54Integrator0.integrate(stepProblem0, 50.666666666666664, doubleArray0, 0, doubleArray0);
      assertEquals(74, dormandPrince54Integrator0.getEvaluations());
  }
}

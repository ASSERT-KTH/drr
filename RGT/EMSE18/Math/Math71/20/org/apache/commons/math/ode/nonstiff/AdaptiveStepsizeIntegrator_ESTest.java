/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 13:19:34 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.TestProblem5;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class AdaptiveStepsizeIntegrator_ESTest  {

  ////@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1640.4267359130333, 1.0E-15, 1640.4267359130333, (-3689.54701));
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        graggBulirschStoerIntegrator0.integrate(testProblem5_0, 0.0, doubleArray0, 1640.4267359130333, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (1.64E03) reached, integration needs 1.86E-15
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1674.15721554, 1674.15721554, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize(1674.15721554);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 343, doubleArray0, 1674.15721554, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(1674.15721554, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1674.15721554), double0, 0.01);
  }

  ////@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      dormandPrince54Integrator0.setInitialStepSize(0.0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep((FirstOrderDifferentialEquations) null, true, (-863), (double[]) null, (-1424.2), (double[]) null, (double[]) null, (double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(Double.NaN, Double.NaN, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setInitialStepSize((-390.861492491));
      assertEquals(Double.NaN, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      dormandPrince853Integrator0.resetInternalState();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(555.7, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinStep();
      assertEquals(555.7, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-12.87516502686238), (-12.87516502686238), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinStep();
      assertEquals(12.87516502686238, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-12.87516502686238), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-0.6990506666666666), 1.0E-6, (-2479.054703303), (-2479.054703303));
      double double0 = highamHall54Integrator0.getMaxStep();
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals(8.360924988699914E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 179.698186152048, 0.0);
      double double0 = dormandPrince853Integrator0.filterStep(0.0, false, false);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-571.2205635832614), 1.0E-10, 8.493843768260106E-8, 950.02677241573);
      double double0 = highamHall54Integrator0.filterStep(2.38466765651207, false, true);
      assertEquals(2.3900220994443994E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-1.0E-10), double0, 0.01);
  }

  ////@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.sanityChecks((FirstOrderDifferentialEquations) null, (-149.968850493622), doubleArray0, (-149.968850493622), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  ////@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1674.15721554, 1674.15721554, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      try { 
        dormandPrince54Integrator0.integrate(testProblem5_0, (-1.1888283442072696), doubleArray0, 1.0, doubleArray0);
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
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 0.0, 0.0, (-2705.0), (-1095.4));
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate((FirstOrderDifferentialEquations) null, 0.0, doubleArray0, (-2207.299781468889), doubleArray0);
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[9];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.initializeStep(testProblem5_0, true, 8, doubleArray0, 0.3111643669578199, doubleArray1, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 0.0, (-2207.299781468889), (-2659.548374414), (-2659.548374414));
      TestProblem5 testProblem5_0 = new TestProblem5();
      adamsMoultonIntegrator0.integrate(testProblem5_0, 0.0, doubleArray0, (-2659.548374414), doubleArray0);
      adamsMoultonIntegrator0.initializeStep(testProblem5_0, true, (-205), doubleArray0, 2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(209, testProblem5_0.getCalls());
      assertEquals(209, adamsMoultonIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3.684031498640387E-15, 2896.447847747393, 3.684031498640387E-15, 2896.447847747393);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.initializeStep(testProblem5_0, false, 1237, doubleArray0, 3.684031498640387E-15, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince853Integrator0.getMinStep();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(402.17051449, 0.0, 0.0, 1.0E-15);
      double double0 = dormandPrince853Integrator0.getMaxStep();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(402.17051449, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3024.56, 3024.56, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.filterStep(1655.57947366727, true, true);
      assertEquals(3024.56, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(3024.56, double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(4372.40463961, 0.0, (-2201.02723611), (-3776.04187));
      try { 
        dormandPrince853Integrator0.filterStep((-697.82565965), false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (4.37E03) reached, integration needs 6.98E02
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.001, (-4828.689070162036), 0.001, 1747.688227182617);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, 0, doubleArray0, 0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1331.42026541244;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 1385.2995365, (-89.47848533333332), (-3569.847348086));
      StepProblem stepProblem0 = new StepProblem((double) 8, 1385.2995365, 17.754780218331803);
      graggBulirschStoerIntegrator0.integrate(stepProblem0, 1331.42026541244, doubleArray0, 1.0E-10, doubleArray0);
      assertEquals(43, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3024.56, 3024.56, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(3024.56);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double double0 = graggBulirschStoerIntegrator0.initializeStep(testProblem5_0, true, (-2559), doubleArray0, 2669.40030932664, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(3024.56, double0, 0.01);
      assertEquals(3024.56, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(9.109673143177798E-4, 1674.15721554, 1674.15721554, 9.109673143177798E-4);
      dormandPrince54Integrator0.setInitialStepSize(1674.15721554);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double double0 = dormandPrince54Integrator0.initializeStep(testProblem5_0, false, 343, doubleArray0, 1674.15721554, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals((-1674.15721554), double0, 0.01);
      assertEquals(1.2349504048285527, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  ////@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(65.9286644, 65.9286644, doubleArray0, doubleArray0);
      TestProblem5 testProblem5_0 = new TestProblem5();
      double[] doubleArray1 = new double[2];
      try { 
        highamHall54Integrator0.sanityChecks(testProblem5_0, 65.9286644, doubleArray1, 1066.5916697, doubleArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: state vector has dimension 2, absolute tolerance vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-0.6990506666666666), 1.0E-6, (-2479.054703303), (-2479.054703303));
      highamHall54Integrator0.setInitialStepSize(2112.473);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8.360924988699914E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-0.6990506666666666), 1.0E-6, (-2479.054703303), (-2479.054703303));
      highamHall54Integrator0.setInitialStepSize(1.0E-6);
      assertEquals(8.360924988699914E-4, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1158.8422075), (-2659.548374414), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(1755.561707590752, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(539.0076, (-1341.8462517206592), doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getMaxStep();
      assertEquals((-1341.8462517206592), double0, 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(539.0076, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 0.0, (-2207.299781468889), (-2705.0), (-1095.4));
      TestProblem5 testProblem5_0 = new TestProblem5();
      adamsMoultonIntegrator0.integrate(testProblem5_0, 0.0, doubleArray0, (-2705.0), doubleArray0);
      adamsMoultonIntegrator0.initializeStep(testProblem5_0, false, (-205), doubleArray0, 2, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(209, testProblem5_0.getCalls());
      assertEquals(0.0, adamsMoultonIntegrator0.getMinStep(), 0.01);
  }
}

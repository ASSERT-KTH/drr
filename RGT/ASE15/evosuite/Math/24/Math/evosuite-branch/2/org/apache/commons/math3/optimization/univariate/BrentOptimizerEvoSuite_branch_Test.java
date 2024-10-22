/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:47:45 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Signum;
import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BrentOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 3.0;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getMaxEvaluations();
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, int0);
      
      int int1 = 534;
      assertFalse(int1 == int0);
      
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((double) int0, (double) int1, (double) int0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(harmonicOscillator0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int1, (UnivariateFunction) harmonicOscillator0, goalType0, (double) int0, double0);
      assertEquals(-0.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(1.5, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertEquals(534, brentOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1.5, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(3.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(univariatePointValuePair0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 0.24763683011010923;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      //  // Unstable assertion: assertNull(brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(0, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertNotNull(brentOptimizer0);
      
      int int0 = 2550;
      Sqrt sqrt0 = new Sqrt();
      //  // Unstable assertion: assertNotNull(sqrt0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double double1 = (-1245.8596535739);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) sqrt0, goalType0, (double) int0, double0, double1);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(2550.0, brentOptimizer0.getMin(), 0.01D);
      //  // Unstable assertion: assertEquals((-1245.8596535739), brentOptimizer0.getStartValue(), 0.01D);
      //  // Unstable assertion: assertEquals(2550, brentOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(19, brentOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0.24763683011010923, brentOptimizer0.getMax(), 0.01D);
      //  // Unstable assertion: assertEquals(0.3861310337846926, univariatePointValuePair0.getPoint(), 0.01D);
      //  // Unstable assertion: assertEquals(0.6213944269018613, univariatePointValuePair0.getValue(), 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertNotNull(univariatePointValuePair0);
  }

  //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 0.24763683011010923;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNotNull(brentOptimizer0);
      
      int int0 = 2550;
      GoalType goalType0 = GoalType.MINIMIZE;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      UnivariateFunction univariateFunction0 = cos0.derivative();
      assertNotNull(univariateFunction0);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, double0, (double) int0, double0);
      assertEquals(0.32782294131154294, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(374.18352402641005, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(2550.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(2550, brentOptimizer0.getMaxEvaluations());
      assertEquals(6, brentOptimizer0.getEvaluations());
      assertEquals(0.24763683011010923, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.24763683011010923, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(univariatePointValuePair0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 3.0;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = 534;
      GoalType goalType0 = GoalType.MAXIMIZE;
      Log log0 = new Log();
      assertNotNull(log0);
      
      UnivariateFunction univariateFunction0 = log0.derivative();
      assertNotNull(univariateFunction0);
      
      double double1 = (-2273.9045942040907);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, univariateFunction0, goalType0, (double) int0, double1, double0);
      assertEquals(0.06666666666666667, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(15.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(534, brentOptimizer0.getMaxEvaluations());
      assertEquals((-2273.9045942040907), brentOptimizer0.getMax(), 0.01D);
      assertEquals(3.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(534.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(10, brentOptimizer0.getEvaluations());
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(univariatePointValuePair0);
  }

  //@Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 0.24763683011010923;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = 2550;
      GoalType goalType0 = GoalType.MINIMIZE;
      double double1 = (-1245.8596535739);
      Signum signum0 = new Signum();
      assertNotNull(signum0);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) signum0, goalType0, double0, double1, double0);
      assertEquals((-1.0), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-769.8890222686039), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0.24763683011010923, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(2550, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.24763683011010923, brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals((-1245.8596535739), brentOptimizer0.getMax(), 0.01D);
      assertEquals(4, brentOptimizer0.getEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(univariatePointValuePair0);
  }

  //@Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 1.2745332016519395;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNotNull(brentOptimizer0);
      
      int int0 = 2535;
      Signum signum0 = new Signum();
      assertNotNull(signum0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) signum0, goalType0, double0, (double) int0, double0);
      assertEquals(1.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(1.2745332016519395, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1.2745332016519395, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.2745332016519395, brentOptimizer0.getMin(), 0.01D);
      assertEquals(2, brentOptimizer0.getEvaluations());
      assertEquals(2535.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(2535, brentOptimizer0.getMaxEvaluations());
      assertNotNull(univariatePointValuePair0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 38.42207709322299;
      double double1 = (-26.278335688562645);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -26.278 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = 0.0;
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
      }
  }
}

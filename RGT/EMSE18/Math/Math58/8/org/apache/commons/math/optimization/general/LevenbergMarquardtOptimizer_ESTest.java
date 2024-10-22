/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 00:23:31 GMT 2017
 */

package org.apache.commons.math.optimization.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.CircleVectorial;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class LevenbergMarquardtOptimizer_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-8.330700489088219), (-8.330700489088219), (-8.330700489088219));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(105, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      VectorialPointValuePair vectorialPointValuePair1 = levenbergMarquardtOptimizer0.doOptimize();
      assertFalse(vectorialPointValuePair1.equals((Object)vectorialPointValuePair0));
  }

  //@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // evaluations
         //
         verifyException("org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-8.330700489088219), (-8.330700489088219), (-8.330700489088219));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      levenbergMarquardtOptimizer0.optimize(105, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.rows = 105;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dimensions mismatch: 0 != 105
         //
         verifyException("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-288.73931), (-288.73931), (-288.73931));
      levenbergMarquardtOptimizer0.cols = (-656);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-20.628579483181976), (-20.628579483181976), (-20.628579483181976), (-20.628579483181976), (-20.628579483181976));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[5];
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(105, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-19.44588662098235), (-19.44588662098235), (-19.44588662098235));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[14];
      doubleArray1[2] = Double.NaN;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(105, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // orthogonality tolerance is too small (CONVERGENCE_FAILED), solution is orthogonal to the jacobian
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-1.971776132423054), (-1.971776132423054), (-1.971776132423054));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 703;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(703, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parameters relative tolerance is too small (CONVERGENCE_FAILED), no further improvement in the approximate solution is possible
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      circleVectorial0.addPoint(17, 17);
      VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(17, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      assertNotNull(vectorialPointValuePair0);
  }

  //@Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((-11.600286718621309), (-11.600286718621309), (-11.600286718621309));
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      levenbergMarquardtOptimizer0.optimize(105, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
      levenbergMarquardtOptimizer0.cols = 105;
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }

  //@Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      CircleVectorial circleVectorial0 = new CircleVectorial();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      circleVectorial0.addPoint(17, Double.NEGATIVE_INFINITY);
      // Undeclared exception!
      try { 
        levenbergMarquardtOptimizer0.optimize(17, (DifferentiableMultivariateVectorialFunction) circleVectorial0, doubleArray0, doubleArray0, doubleArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unable to perform Q.R decomposition on the CONVERGENCE_FAILEDx1 jacobian matrix
         //
         verifyException("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", e);
      }
  }
}

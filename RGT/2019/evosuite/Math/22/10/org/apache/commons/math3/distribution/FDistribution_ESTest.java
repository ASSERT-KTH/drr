/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 16:41:17 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class FDistribution_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1.0, 1.0);
      double double0 = fDistribution0.inverseCumulativeProbability(0.15915494309189535);
      assertEquals(1.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.06519949665299417, double0, 0.01);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1.0, 1.0);
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertEquals(1.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1.0, 1.0);
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertFalse(boolean0);
      assertEquals(1.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1.0, 1.0);
      double double0 = fDistribution0.density(1.0);
      assertEquals(0.15915494309189535, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution((-2055.948441811104), 2622.31308282094);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-2,055.948)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(well512a0, 2.5187968110874885E-38, (-2597.7528330669415), 2.5187968110874885E-38);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-2,597.753)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c((-526));
      FDistribution fDistribution0 = new FDistribution(well19937c0, 900.77325644, 900.77325644, 0.0);
      double double0 = fDistribution0.sample();
      assertEquals(0.9241345370114742, double0, 0.01);
      
      double double1 = fDistribution0.getNumericalVariance();
      assertEquals(1.0022252553529707, fDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.004475335773919922, double1, 0.01);
  }
}

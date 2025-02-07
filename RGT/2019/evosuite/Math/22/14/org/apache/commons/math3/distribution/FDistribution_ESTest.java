/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 16:43:38 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class FDistribution_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Well512a well512a0 = new Well512a(1);
      FDistribution fDistribution0 = new FDistribution(well512a0, 0.5, 1959.9470927088755, 0.0);
      double double0 = fDistribution0.sample();
      assertEquals(0.002316283322156942, double0, 0.01);
      assertEquals(0.5, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0010214780611018, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(1138.0, 1138.0);
      assertEquals(1138.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1138.0, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(4.825712712114668E-10, 4.825712712114668E-10, 4.825712712114668E-10);
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertFalse(boolean0);
      assertEquals(4.825712712114668E-10, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(4.825712712114668E-10, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(2836.9414, 1.8279051206232177E83, 796.277398509);
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertEquals(2836.9414, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Well512a well512a0 = new Well512a(1);
      FDistribution fDistribution0 = new FDistribution(well512a0, 0.5, 1959.9470927088755, 0.0);
      double double0 = fDistribution0.density(0.0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.5, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0010214780611018, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(0.0, 2091.161, 2091.161);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(733.39697238429, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (0)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

//  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(4.825712712114668E-10, 4.825712712114668E-10, 4.825712712114668E-10);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01);
      
      fDistribution0.sample();
      double double0 = fDistribution0.sample();
      assertEquals(4.825712712114668E-10, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(4.825712712114668E-10, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.7383148356388368E16, double0, 0.01);
      assertEquals(0.0, fDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(Double.NaN, fDistribution0.getNumericalMean(), 0.01);
  }
}

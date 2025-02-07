/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:59:31 GMT 2014
 */

package org.apache.commons.math.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class FDistributionImplEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 3.399464998481189E-5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(double0, double0);
      assertEquals(3.399464998481189E-5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(3.399464998481189E-5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistributionImpl0);
      
      double double1 = fDistributionImpl0.getDomainLowerBound(double0);
      assertEquals(3.399464998481189E-5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(3.399464998481189E-5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      // Undeclared exception!
      try {
        fDistributionImpl0.setDenominatorDegreesOfFreedom(double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-1.0);
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl(double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = 0.5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(double0, double0);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistributionImpl0);
      
      double double1 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      
      double double2 = Double.POSITIVE_INFINITY;
      assertFalse(double2 == double1);
      
      fDistributionImpl0.setDenominatorDegreesOfFreedom(double2);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertFalse(double0 == double2);
      assertTrue(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      
      double double3 = fDistributionImpl0.getInitialDomain(double1);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.NaN, double3, 0.01D);
      assertFalse(double0 == double2);
      assertTrue(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertTrue(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 1.0;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(double0, double0);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistributionImpl0);
      
      double double1 = fDistributionImpl0.inverseCumulativeProbability(double0);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 0.5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(double0, double0);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistributionImpl0);
      
      double double1 = 0.0;
      double double2 = fDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
  }

  //@Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 0.5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(double0, double0);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertNotNull(fDistributionImpl0);
      
      double double1 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      
      double double2 = fDistributionImpl0.inverseCumulativeProbability(double1);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01D);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01D);
      assertEquals(1.0000001323506196, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertTrue(double1 == double0);
      assertFalse(double0 == double2);
      assertTrue(double0 == double1);
  }
}

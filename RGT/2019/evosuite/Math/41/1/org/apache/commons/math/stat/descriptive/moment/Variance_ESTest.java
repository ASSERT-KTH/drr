/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 23:41:20 GMT 2019
 */

package org.apache.commons.math.stat.descriptive.moment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class Variance_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        variance0.evaluate(doubleArray0, doubleArray0, (-2463.96655963));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weigth array must contain at least one non-zero value
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      boolean boolean0 = variance0.isBiasCorrected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.setBiasCorrected(true);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, Double.NaN);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Variance variance0 = new Variance();
      Variance variance1 = variance0.copy();
      assertNotSame(variance1, variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variance variance0 = new Variance();
      Variance variance1 = new Variance(variance0);
      assertTrue(variance1.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variance variance0 = new Variance();
      variance0.incMoment = false;
      variance0.increment(0.0);
      assertEquals(Double.NaN, variance0.getResult(), 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Variance variance0 = new Variance(false);
      variance0.increment((-1.0));
      assertEquals(1L, variance0.getN());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[2];
      secondMoment0.evaluate(doubleArray0);
      Variance variance0 = new Variance(false, secondMoment0);
      boolean boolean0 = secondMoment0.equals(variance0);
      assertFalse(variance0.isBiasCorrected());
      assertEquals(0.0, variance0.getResult(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variance variance0 = new Variance();
      double double0 = variance0.getResult();
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      secondMoment0.increment((-3075.17592060364));
      Variance variance0 = new Variance(secondMoment0);
      double double0 = variance0.getResult();
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[4];
      secondMoment0.evaluate(doubleArray0);
      Variance variance0 = new Variance(true, secondMoment0);
      double double0 = variance0.getResult();
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(false, secondMoment0);
      variance0.clear();
      assertFalse(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 453.005360448;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, 1, 1);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[9];
      double double0 = variance0.evaluate(doubleArray0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Variance variance0 = new Variance();
      // Undeclared exception!
      try { 
        variance0.evaluate();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input array
         //
         verifyException("org.apache.commons.math.stat.descriptive.moment.Variance", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      Variance variance0 = new Variance(secondMoment0);
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
      assertTrue(variance0.isBiasCorrected());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1967.2671359;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[1];
      double double0 = variance0.evaluate(doubleArray0, (-2494.042), 0, 0);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Variance variance0 = new Variance(false);
      double[] doubleArray0 = new double[6];
      double double0 = variance0.evaluate(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2592.944;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0, Double.NaN, 0, 1);
      assertTrue(variance0.isBiasCorrected());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Variance variance0 = new Variance();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      double double0 = variance0.evaluate(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}

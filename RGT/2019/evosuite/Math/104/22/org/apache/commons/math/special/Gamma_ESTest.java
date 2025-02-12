/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 15:19:04 GMT 2019
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class Gamma_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((double) 1840, 1.7976931348623157E308);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0, 1.7976931348623157E308);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Gamma.logGamma(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Gamma.logGamma(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(Double.NaN, Double.NaN, 0.9999999999999971, (-971));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1.7976931348623157E308, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(0.0, (-262.63281467), 0.0, 1840);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(982.38957, (-2769.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(2.1743961811521265E-4, 0.0, 413.7, 626);
      assertEquals(0.0, double0, 0.01);
  }

//  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      Gamma.regularizedGammaP(0.4973793016430649, 2574.81139);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(391.31454597985, 217.060370180296);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        Gamma.regularizedGammaP(1222.92418, 1222.92418, (-784.322), 1478);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (1,478) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(Double.NaN, 0.9999999999999971);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ((double) 738, Double.NaN, 1.0, 738);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(3.399464998481189E-5, (-571.0), (-468.1282561621), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(418.524038471, 0.0, 418.524038471, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0E-8, 1.0E-8);
      assertEquals(1.7843463706590512E-7, double0, 0.01);
  }
}

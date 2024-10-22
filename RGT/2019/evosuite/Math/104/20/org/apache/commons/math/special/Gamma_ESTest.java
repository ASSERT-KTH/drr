/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 15:17:48 GMT 2019
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
      double double0 = Gamma.logGamma(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = Gamma.logGamma((-103.8056));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(Double.NaN, 1410.4379816, 0.0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(1410.4379816, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP((-103.8056), (-1.0), (-59.59796035547549), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(2681.050004062165, (-1.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(111.991, 0.0, 111.991, 0);
      assertEquals(0.0, double0, 0.01);
  }

//  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      Gamma.regularizedGammaQ(1.0E-8, 1550.835483113);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = Gamma.regularizedGammaP(3228.97, 22857.723379185973);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        Gamma.regularizedGammaP(928.584752375, 3.6899182659531625E-6, 0.0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ((-103.8056), 0.0, (-1.0), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0, (-729.505845824));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(1.0, 0.0, (-907.76), (-568));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Gamma.regularizedGammaQ(3228.97, 0.5023402246705605);
      assertEquals(1.0, double0, 0.01);
  }
}

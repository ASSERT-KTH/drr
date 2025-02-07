/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 04 00:20:37 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class MathUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int int0 = MathUtils.hash((-4105.079798771532));
      assertEquals((-1392430870), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals((-196513505), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MathUtils.equals(doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 1, 1);
      assertEquals((-0.1F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = MathUtils.sinh(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(118.503970899, (-80.457514248));
      assertEquals((-82.55795893074676), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 6709);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = MathUtils.cosh(2312);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 2312);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = MathUtils.log(0.0, 0.2857142686843872);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(428, 1);
      assertEquals(429, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2147483646, 516);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in addition: 2,147,483,646 + 516
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(3952090531849364496L, (long) (byte)126);
      assertEquals(3952090531849364622L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) 10, 10L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-1980L), 6L);
      assertEquals((-1986L), long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-9223372036854775808L), 4668L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in addition: -9,223,372,036,854,775,808 + -4,668
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (-2846));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(125, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1406, 1);
      assertEquals(1406L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(18, 11);
      assertEquals(31824L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1406, (-923));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(62, 37);
      assertEquals(147405545359541742L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((byte)80, 45);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(6192, 6192);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(581, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(492, 1);
      assertEquals(492.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(193, 150);
      assertEquals(99.69673449998051, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1073741824, 1073741824);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(36, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(11, 10);
      assertEquals(2.3978952727983707, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(4, (-529));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3814, 2880);
      assertEquals(2118.8578875418684, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-4283), 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = -4,283, k = 100
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((short) (-1), (short) (-662));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k), got n = -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = MathUtils.compareTo(2.2250738585072014E-308, 1201.8014501, (-4078.548));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int int0 = MathUtils.compareTo(2.404307984052299E-9, 0L, 1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = MathUtils.compareTo(2.404307984052299E-9, (-350.1572663011855), 0.0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN(Double.NaN, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int int0 = MathUtils.compareTo(0.0, 0.0, 0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN(0.0, 0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN((double) 533, (double) 4324, (double) 1.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN((-3158.9226519706), (-2292.4618871914), 1093.7863409347);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equalsIncludingNaN(1.225743062930824E-8, 4793.1684454522, 2146987578);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equalsIncludingNaN(Double.NaN, 3433.83788, (-2397));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN(2.2250738585072014E-308, 0.041666666666621166, 18);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 2312);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[4];
      boolean boolean0 = MathUtils.equals(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathUtils.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = MathUtils.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathUtils.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(17);
      assertEquals(3.55687428096E14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-561));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -561
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((byte)24);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((byte) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(534);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-875));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -875
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = MathUtils.gcd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = MathUtils.gcd(1195, 0);
      assertEquals(1195, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-4298), Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = MathUtils.gcd(245, (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(1503, 627);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long long0 = MathUtils.gcd(0L, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = MathUtils.gcd((-1302L), 0L);
      assertEquals(1302L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = MathUtils.gcd((-5525L), 4611686018427387904L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = MathUtils.lcm(39916800L, (-2053L));
      assertEquals(81949190400L, long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-70));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double double0 = MathUtils.indicator(3744.985138894967);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double double0 = MathUtils.indicator((-1688.166619580888));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      float float0 = MathUtils.indicator(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      float float0 = MathUtils.indicator((-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      int int0 = MathUtils.indicator((int) (byte) (-89));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      long long0 = MathUtils.indicator((-1485L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-1607));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int int0 = MathUtils.lcm(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int int0 = MathUtils.lcm(61, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int int0 = MathUtils.lcm(609, 5);
      assertEquals(3045, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      long long0 = MathUtils.lcm(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = MathUtils.lcm((long) 2312, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(4194304, 4194304);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = MathUtils.lcm((-1623L), (-1623L));
      assertEquals(1623L, long0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-3525192608324255744L), (-738L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-5761L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3183605296591799669L), (long) 22);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 10);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = MathUtils.scalb((-1897.834532772), 101);
      assertEquals((-4.8115821692045745E33), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, (-123));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NEGATIVE_INFINITY, 1475);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      try { 
        MathUtils.normalizeArray(doubleArray0, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      try { 
        MathUtils.normalizeArray(doubleArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      try { 
        MathUtils.normalizeArray(doubleArray0, 3.834E-20);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Array contains an infinite element, \u221E at index 3
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      try { 
        MathUtils.normalizeArray(doubleArray0, 1.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = 17.0;
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, 1.0);
      assertArrayEquals(new double[] {Double.NaN, 1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.round((double) Float.NaN, 10, (-19));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 0, 0, 534);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method 534, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)126);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-67));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      double double0 = MathUtils.sign((-2.9642774844752946E80));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      double double0 = MathUtils.sign((double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double double0 = MathUtils.sign(2.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      float float0 = MathUtils.sign((float) (-1L));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      float float0 = MathUtils.sign((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      float float0 = MathUtils.sign(4.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      int int0 = MathUtils.sign(197);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      int int0 = MathUtils.sign((-2006));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      long long0 = MathUtils.sign((long) (-2846));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      long long0 = MathUtils.sign((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      long long0 = MathUtils.sign(4398046511103L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      short short0 = MathUtils.sign((short)13);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-195));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(Integer.MIN_VALUE, 19);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in subtraction: -2,147,483,648 - 19
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(2988, (-1755));
      assertEquals(4743, int0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(2143431792, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in subtraction: 2,143,431,792 - -2,147,483,648
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      try { 
        MathUtils.pow(0, (-1828));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (0^-1,828)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      int int0 = MathUtils.pow(0, 67);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      int int0 = MathUtils.pow(0, (long) 101);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      try { 
        MathUtils.pow(2454, (-837L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (2,454^-837)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      long long0 = MathUtils.pow(4398046511103L, 4324);
      assertEquals((-19017153114013695L), long0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      try { 
        MathUtils.pow((long) (-5714), (-5714));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-5,714^-5,714)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      long long0 = MathUtils.pow(0L, 3952090531849364496L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      try { 
        MathUtils.pow((-1000L), (-1000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-1,000^-1,000)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, (int) (byte)2);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      try { 
        MathUtils.pow(bigInteger0, (-1711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (1^-1,711)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 362880L);
      assertEquals((short)0, bigInteger1.shortValue());
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        MathUtils.pow(bigInteger0, (-4267615245585081135L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (0^-4,267,615,245,585,081,135)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        MathUtils.pow(bigInteger0, bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-4,294,967,296^-4,294,967,296)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)25;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
      assertEquals((short)0, bigInteger1.shortValue());
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = MathUtils.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      int[] intArray0 = new int[5];
      double double0 = MathUtils.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, false);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1432.832257061414);
      // Undeclared exception!
      try { 
        MathUtils.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = 715.9;
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.INCREASING;
      // Undeclared exception!
      try { 
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 5 and 6 are not increasing (715.9 > 0)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1524.068084462;
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly decreasing (0 <= 0)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-3488);
      MathUtils.OrderDirection mathUtils_OrderDirection0 = MathUtils.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathUtils.checkOrder(doubleArray0, mathUtils_OrderDirection0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not decreasing (-3,488 < 0)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1L;
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-4.59669880564355E61);
      doubleArray0[5] = (double) (-4035746434778044925L);
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertEquals(4.59669880564355E61, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (-6.137038396764154E-208);
      doubleArray0[5] = (-6.137038396764154E-208);
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertEquals(8.679082933508303E-208, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = Double.NaN;
      double double0 = MathUtils.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 17:17:47 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class Fraction_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      int int0 = fraction0.intValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      float float0 = fraction0.floatValue();
      assertEquals(0.4F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      long long0 = fraction0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      double double0 = fraction0.doubleValue();
      assertEquals(0.6666666666666666, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = fraction0.ZERO.subtract(fraction0);
      String string0 = fraction1.toProperString();
      assertEquals("-2/3", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-568), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-3165), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(2005, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-281), (-376), (-376));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-5287), (-5287), 737);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("426 59/1000");
      assertEquals(426.059, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, 621, 621);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(4, 4, 2147483646);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0.0);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction((-3943), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-786));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(1.7976931348623157E308);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The value must not be greater than Integer.MAX_VALUE or NaN
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("<]cPGN.Jz=p{csqB%`");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("0");
      assertEquals(1, fraction0.getDenominator());
      assertEquals(0.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("1 *xM3:vmZDE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1/2");
      assertEquals(2, fraction0.getDenominator());
      assertEquals(0.5, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(426.059);
      Fraction fraction1 = fraction0.TWO_QUARTERS.reduce();
      assertEquals(1, fraction1.getNumerator());
      assertEquals(426059, fraction0.getNumerator());
      assertEquals(0.5F, fraction1.floatValue(), 0.01F);
      assertEquals(426.059, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 3280);
      Fraction fraction1 = fraction0.reduce();
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(1, fraction1.getDenominator());
      assertEquals(3280, fraction0.getDenominator());
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(426.059);
      // Undeclared exception!
      try { 
        fraction0.ZERO.pow((-3259));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 2766);
      // Undeclared exception!
      try { 
        fraction0.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(2766, Integer.MIN_VALUE);
      fraction0.invert();
      assertEquals(1073741824, fraction0.getDenominator());
      assertEquals((-1.2880191206932068E-6), fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 2766);
      // Undeclared exception!
      try { 
        fraction0.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: too large to negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(5608, (-2192));
      Fraction fraction1 = fraction0.abs();
      assertNotSame(fraction1, fraction0);
      assertEquals(153, fraction1.getProperNumerator());
      assertEquals((short)2, fraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      Fraction fraction1 = fraction0.FOUR_FIFTHS.abs();
      assertEquals(0.8F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.pow(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.pow(0);
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.THREE_QUARTERS.pow(1579);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-1125), (-1));
      Fraction fraction1 = Fraction.getFraction((-2009.7894148541573));
      // Undeclared exception!
      try { 
        fraction1.multiplyBy(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(2766, (-2147483623));
      Fraction fraction1 = fraction0.negate();
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2602);
      // Undeclared exception!
      try { 
        fraction1.subtract(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.TWO_THIRDS.reduce();
      Fraction fraction2 = fraction1.ONE_FIFTH.subtract(fraction1);
      assertEquals((-0.46666667F), fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2602);
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.subtract(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.getFraction(0.0);
      Fraction fraction2 = fraction1.subtract(fraction0);
      assertEquals((-0.5F), fraction2.floatValue(), 0.01F);
      assertEquals(2, fraction2.getProperNumerator());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.getFraction(0.0);
      Fraction fraction2 = fraction0.add(fraction1);
      assertSame(fraction2, fraction0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.add(fraction0);
      assertEquals(1.2F, fraction1.floatValue(), 0.01F);
      assertEquals(1, fraction1.getProperNumerator());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      Fraction fraction1 = Fraction.getReducedFraction(Integer.MIN_VALUE, 2750);
      Fraction fraction2 = fraction0.ONE_HALF.add(fraction1);
      // Undeclared exception!
      try { 
        fraction0.THREE_QUARTERS.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-594), (-594));
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fraction0.ZERO.divideBy(fraction0);
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.multiplyBy(fraction1);
      assertEquals(0.0, fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      // Undeclared exception!
      try { 
        fraction0.divideBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.divideBy(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      boolean boolean0 = fraction0.equals("f4j6|{");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = Fraction.getReducedFraction(4, 4);
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(boolean0);
      assertEquals(1, fraction1.getNumerator());
      assertEquals(1.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(260, (-817));
      Fraction fraction1 = Fraction.getReducedFraction(260, (-817));
      boolean boolean0 = fraction0.equals(fraction1);
      assertEquals((-0.3182374541003672), fraction0.doubleValue(), 0.01);
      assertTrue(boolean0);
      assertEquals((-260), fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.ONE_HALF;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-1774), (-1774));
      Fraction fraction1 = fraction0.ONE.invert();
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(0, int0);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(1, fraction1.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ONE_HALF;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(188, 188, 188);
      Fraction fraction1 = Fraction.FOUR_FIFTHS;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(189.0, fraction0.doubleValue(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0.0);
      String string0 = fraction0.toString();
      assertEquals("0/1", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      String string0 = fraction0.toString();
      assertEquals("2/3", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.ONE.reduce();
      Fraction fraction2 = Fraction.getReducedFraction((-2706), (-2706));
      fraction2.ONE.negate();
      Fraction fraction3 = Fraction.getFraction((double) (-2706));
      fraction0.FOUR_FIFTHS.reduce();
      Fraction fraction4 = fraction3.ONE.negate();
      assertEquals((-2706), fraction3.getNumerator());
      assertEquals((-1), fraction4.getProperWhole());
      
      fraction2.ZERO.toProperString();
      assertTrue(fraction2.equals((Object)fraction1));
      
      fraction0.TWO_FIFTHS.hashCode();
      assertEquals(4, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(1, 1);
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals(1, fraction0.getDenominator());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.ONE.negate();
      String string0 = fraction1.toProperString();
      assertEquals("-1", string0);
      assertNotNull(string0);
      assertEquals((-1.0F), fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(426.059);
      String string0 = fraction0.toProperString();
      assertEquals("426 59/1000", string0);
      assertEquals(1000, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(25, 18, 18);
      String string0 = fraction0.toProperString();
      assertEquals("26", string0);
  }
}

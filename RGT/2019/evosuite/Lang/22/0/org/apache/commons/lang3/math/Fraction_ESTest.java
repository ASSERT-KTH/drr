/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 16:44:05 GMT 2019
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
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.ONE_THIRD.abs();
      assertEquals(0.3333333333333333, fraction1.doubleValue(), 0.01);
      
      fraction0.TWO_QUARTERS.toProperString();
      fraction0.longValue();
      fraction0.intValue();
      Fraction fraction2 = fraction0.reduce();
      Fraction fraction3 = fraction2.TWO_QUARTERS.reduce();
      assertEquals(1, fraction3.getNumerator());
      assertEquals(0.5F, fraction3.floatValue(), 0.01F);
      
      String string0 = fraction2.toProperString();
      assertEquals("1/5", string0);
      
      Fraction fraction4 = Fraction.getFraction(0.0);
      fraction0.floatValue();
      Fraction fraction5 = fraction0.multiplyBy(fraction2);
      fraction5.THREE_FIFTHS.hashCode();
      fraction0.getDenominator();
      Fraction fraction6 = fraction2.ONE_QUARTER.divideBy(fraction0);
      assertEquals(1, fraction6.intValue());
      
      fraction4.toString();
      Fraction fraction7 = fraction0.add(fraction5);
      assertEquals(25, fraction7.getDenominator());
      assertEquals(0.04, fraction5.doubleValue(), 0.01);
      assertEquals(0.24F, fraction7.floatValue(), 0.01F);
      
      Fraction fraction8 = fraction0.subtract(fraction4);
      assertSame(fraction8, fraction2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = fraction0.add(fraction0);
      String string0 = fraction1.toProperString();
      assertEquals("1 1/3", string0);
      assertEquals(2, fraction0.getProperNumerator());
      assertEquals(0, fraction0.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      float float0 = fraction0.floatValue();
      assertEquals(0.6666667F, float0, 0.01F);
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
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction1.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("3/5");
      assertEquals(0.6F, fraction0.floatValue(), 0.01F);
      assertEquals(3, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-258), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(629, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1 7/15");
      assertEquals(1.4666666666666666, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-3), (-1527), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(731, 0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(0, (-579760), 3043);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1073741823), 1, 137);
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
        Fraction.getFraction(2337920, 2337920, 2337920);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction((-939), Integer.MIN_VALUE);
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
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-1745));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("Unable to invert zero.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("0 rk");
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
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.reduce();
      assertEquals((short)0, fraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.TWO_QUARTERS.reduce();
      assertEquals(2, fraction1.getDenominator());
      assertEquals(0.5F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 5);
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
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.getFraction(1.0);
      Fraction fraction2 = fraction0.THREE_QUARTERS.subtract(fraction1);
      Fraction fraction3 = fraction0.divideBy(fraction2);
      assertEquals((-1), fraction2.getNumerator());
      assertEquals((-0.8F), fraction3.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 1);
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
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.abs();
      assertEquals((-0.75F), fraction1.floatValue(), 0.01F);
      assertEquals(0.75F, fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(662.15690913);
      Fraction fraction1 = fraction0.TWO_THIRDS.pow((-1));
      assertEquals(662.1569091267495, fraction0.doubleValue(), 0.01);
      assertEquals(1.5, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.THREE_FIFTHS.pow(0);
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.pow(2035);
      assertEquals(0, fraction1.getProperWhole());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
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
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(662.15690913);
      Fraction fraction1 = Fraction.getFraction((-1070), 69, 357);
      // Undeclared exception!
      try { 
        fraction0.multiplyBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.pow(37);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1073741793), (-1073741793));
      Fraction fraction1 = fraction0.TWO_THIRDS.add(fraction0);
      // Undeclared exception!
      try { 
        fraction0.ONE.add(fraction1);
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
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
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
      Fraction fraction0 = Fraction.getFraction((-602.108017699));
      // Undeclared exception!
      try { 
        fraction0.TWO_THIRDS.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.ZERO.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertNotSame(fraction1, fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.getFraction(0.0);
      Fraction fraction2 = fraction0.subtract(fraction1);
      assertSame(fraction2, fraction0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.ONE_QUARTER.multiplyBy(fraction0);
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(629, 25);
      Fraction fraction1 = Fraction.getReducedFraction(0, 1915);
      Fraction fraction2 = fraction0.THREE_QUARTERS.multiplyBy(fraction1);
      assertEquals(25.16, fraction0.doubleValue(), 0.01);
      assertSame(fraction2, fraction1);
      assertEquals(629, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
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
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(46, 46);
      Fraction fraction1 = Fraction.getFraction(0, 46);
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.divideBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(662.15690913);
      boolean boolean0 = fraction0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(662.1569091267495, fraction0.doubleValue(), 0.01);
      assertEquals(3359122, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.negate();
      boolean boolean0 = fraction1.equals(fraction0);
      assertTrue(boolean0);
      assertEquals(0, fraction1.getNumerator());
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      fraction0.hashCode();
      fraction0.hashCode();
      assertEquals(3, fraction0.getNumerator());
      assertEquals(4, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(662.15690913);
      Fraction fraction1 = Fraction.getReducedFraction(69, (-1));
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-69), fraction1.getNumerator());
      assertEquals(1, int0);
      assertEquals(662.1569091267495, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fraction0.invert();
      int int0 = fraction1.compareTo(fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      Fraction fraction1 = Fraction.TWO_THIRDS;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ONE_HALF;
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.ONE_THIRD;
      fraction1.TWO_FIFTHS.toString();
      Fraction fraction2 = fraction0.subtract(fraction1);
      Fraction fraction3 = Fraction.getFraction(0.0);
      Fraction fraction4 = Fraction.getFraction(840, 1189);
      assertEquals(840, fraction4.getNumerator());
      
      Fraction fraction5 = fraction3.TWO_THIRDS.subtract(fraction0);
      fraction0.getProperNumerator();
      int int0 = fraction5.compareTo(fraction2);
      assertEquals(1, int0);
      
      fraction5.intValue();
      assertEquals(1, fraction3.getDenominator());
      assertEquals(7, fraction5.getNumerator());
      
      Fraction fraction6 = fraction2.reduce();
      assertEquals(2, fraction6.getProperNumerator());
      assertSame(fraction6, fraction2);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 402);
      fraction0.toProperString();
      Fraction fraction1 = Fraction.ONE_THIRD;
      Fraction fraction2 = fraction0.TWO_FIFTHS.divideBy(fraction1);
      assertEquals(1.2, fraction2.doubleValue(), 0.01);
      
      Fraction fraction3 = Fraction.getFraction((double) 3043);
      fraction3.ONE_HALF.hashCode();
      assertEquals(3043.0F, fraction3.floatValue(), 0.01F);
      
      Fraction.getFraction(3043, 402);
      Fraction fraction4 = fraction0.reduce();
      Fraction fraction5 = Fraction.TWO_THIRDS;
      Fraction fraction6 = fraction4.TWO_FIFTHS.add(fraction5);
      Fraction fraction7 = Fraction.getFraction("0");
      assertFalse(fraction7.equals((Object)fraction0));
      
      Fraction fraction8 = Fraction.getReducedFraction(402, 3043);
      fraction8.reduce();
      fraction8.THREE_FIFTHS.toString();
      Fraction fraction9 = Fraction.getFraction(3043, 3477, 3477);
      assertEquals(3044.0F, fraction9.floatValue(), 0.01F);
      
      fraction6.equals(fraction8);
      assertTrue(fraction4.equals((Object)fraction7));
      assertEquals(1.0666667F, fraction6.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertEquals("-1", string0);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(69, (-1));
      String string0 = fraction0.toProperString();
      assertEquals("-69", string0);
      assertEquals(1, fraction0.getDenominator());
  }
}

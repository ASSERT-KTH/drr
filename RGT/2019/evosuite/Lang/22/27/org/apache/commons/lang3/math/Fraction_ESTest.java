/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 17:44:15 GMT 2019
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
      Fraction fraction0 = Fraction.ONE_HALF;
      fraction0.getDenominator();
      Fraction fraction1 = fraction0.FOUR_FIFTHS.reduce();
      assertEquals(0.8F, fraction1.floatValue(), 0.01F);
      
      String string0 = fraction0.TWO_THIRDS.toProperString();
      assertEquals("2/3", string0);
      
      Fraction fraction2 = Fraction.ONE_QUARTER;
      int int0 = fraction0.compareTo(fraction2);
      fraction0.getProperNumerator();
      Fraction fraction3 = Fraction.getFraction((-1619), 1);
      Fraction fraction4 = fraction3.FOUR_FIFTHS.add(fraction0);
      Fraction fraction5 = Fraction.ONE_HALF;
      Fraction fraction6 = fraction5.TWO_THIRDS.negate();
      int int1 = fraction2.compareTo(fraction5);
      assertFalse(int1 == int0);
      
      fraction5.ONE.hashCode();
      Fraction fraction7 = Fraction.getReducedFraction(1, 2);
      fraction0.doubleValue();
      fraction2.toString();
      fraction5.floatValue();
      Fraction fraction8 = Fraction.getFraction(0.0);
      double double0 = fraction8.doubleValue();
      assertEquals(0.0, double0, 0.01);
      
      Fraction.getFraction("1/4");
      Fraction fraction9 = fraction6.add(fraction4);
      assertEquals(19, fraction9.getProperNumerator());
      assertEquals((-1619), fraction3.intValue());
      
      Fraction fraction10 = fraction0.abs();
      fraction10.intValue();
      assertTrue(fraction10.equals((Object)fraction7));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      long long0 = fraction0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-974.593));
      String string0 = fraction0.toProperString();
      assertEquals("-974 593/1000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals((byte)0, fraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1089), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1), (-1));
      Fraction fraction1 = fraction0.pow(Integer.MIN_VALUE);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(1L, fraction0.longValue());
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
        Fraction.getFraction(2, Integer.MIN_VALUE);
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
        Fraction.getFraction(0, 0, 0);
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
        Fraction.getFraction((-1265), (-2748), (-1265));
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
        Fraction.getFraction(2100, (-591), 2100);
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
      Fraction fraction0 = Fraction.getFraction("-974 593/1000");
      assertEquals((-974.593F), fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1486), 1057, 66565860);
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
        Fraction.getFraction(1592, 933, 1545307);
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
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1, fraction0.getNumerator());
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(1623, Integer.MIN_VALUE);
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
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-2208));
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
        Fraction.getFraction("2,ewLO^1_2F*|DA=.I$");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("1/4");
      assertEquals(0.25F, fraction0.floatValue(), 0.01F);
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("3 ;E3kb4jsP");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 920);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(0, fraction1.getNumerator());
      assertEquals(920, fraction0.getDenominator());
      assertEquals(1, fraction1.getDenominator());
      assertFalse(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-658.31838));
      Fraction fraction1 = fraction0.TWO_QUARTERS.reduce();
      assertEquals(2, fraction1.getDenominator());
      assertEquals((-5737903), fraction0.getNumerator());
      assertEquals((-658.31836F), fraction0.floatValue(), 0.01F);
      assertEquals(0.5, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.ZERO.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
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
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 6919);
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
      Fraction fraction0 = Fraction.getFraction(31, (-4186));
      Fraction fraction1 = fraction0.abs();
      assertEquals((-0.007405637840420449), fraction0.doubleValue(), 0.01);
      assertEquals(0.0074056378F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(10000, 3103);
      Fraction fraction1 = fraction0.ZERO.negate();
      Fraction fraction2 = fraction1.pow(1519);
      assertEquals(3.2226877F, fraction0.floatValue(), 0.01F);
      assertEquals(0, fraction2.intValue());
      assertEquals(10000, fraction0.getNumerator());
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.TWO_THIRDS.pow(0);
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-658.31838));
      // Undeclared exception!
      try { 
        fraction0.ONE_THIRD.pow((-1885));
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
      Fraction fraction0 = Fraction.getReducedFraction((-2847), 1);
      Fraction fraction1 = Fraction.getReducedFraction(1013, (-2847));
      Fraction fraction2 = Fraction.getFraction(1, 1013);
      Fraction fraction3 = fraction1.add(fraction0);
      Fraction fraction4 = fraction0.add(fraction2);
      // Undeclared exception!
      try { 
        fraction4.subtract(fraction3);
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
      Fraction fraction0 = Fraction.getFraction(46, 46, 46);
      // Undeclared exception!
      try { 
        fraction0.TWO_FIFTHS.pow(46);
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
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      // Undeclared exception!
      try { 
        fraction0.ONE.add(fraction0);
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
      Fraction fraction0 = Fraction.getReducedFraction((-2847), 1);
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals((-2847), fraction0.getNumerator());
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
      assertEquals((-2847.0), fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2097152, (-2147483647));
      // Undeclared exception!
      try { 
        fraction0.ONE_QUARTER.subtract(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang3.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2847), 1);
      Fraction fraction1 = Fraction.THREE_QUARTERS;
      Fraction fraction2 = fraction0.THREE_QUARTERS.add(fraction1);
      assertEquals(1, fraction0.getDenominator());
      assertEquals((-2847.0), fraction0.doubleValue(), 0.01);
      assertEquals(2, fraction2.getDenominator());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2097152, (-2147483645));
      Fraction fraction1 = fraction0.invert();
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.subtract(fraction1);
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
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.THREE_FIFTHS.multiplyBy((Fraction) null);
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
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.TWO_FIFTHS.multiplyBy(fraction0);
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
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
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.TWO_THIRDS.divideBy(fraction0);
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
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.getFraction((-974.593));
      boolean boolean0 = fraction0.equals(fraction1);
      assertEquals((-974593), fraction1.getNumerator());
      assertEquals((-974.593F), fraction1.floatValue(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-658.31838));
      Fraction fraction1 = Fraction.getFraction((-658.31838));
      boolean boolean0 = fraction0.equals(fraction1);
      assertEquals(8716, fraction1.getDenominator());
      assertEquals((-658.3183799908214), fraction1.doubleValue(), 0.01);
      assertTrue(boolean0);
      assertEquals((-5737903), fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.ZERO;
      int int0 = fraction1.compareTo(fraction0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(1073741824, 1073741824);
      Fraction fraction1 = fraction0.divideBy(fraction0);
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(0, int0);
      assertEquals(1, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      String string0 = fraction0.TWO_QUARTERS.toString();
      assertEquals("2/4", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = Fraction.getFraction(956, (-972));
      assertEquals(972, fraction1.getDenominator());
      assertEquals((-0.9835390946502057), fraction1.doubleValue(), 0.01);
      
      Fraction fraction2 = Fraction.getFraction(733.2756723156);
      assertEquals(733.2757F, fraction2.floatValue(), 0.01F);
      
      fraction0.floatValue();
      Fraction fraction3 = Fraction.getFraction((double) 0.25F);
      fraction3.ZERO.toProperString();
      Fraction fraction4 = Fraction.getFraction((-4927.7437819));
      assertEquals((-4927.7437F), fraction4.floatValue(), 0.01F);
      
      int int0 = fraction0.compareTo(fraction3);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(862, 862);
      Fraction fraction1 = Fraction.TWO_FIFTHS;
      Fraction fraction2 = fraction1.ZERO.subtract(fraction0);
      Fraction fraction3 = fraction0.ONE_HALF.multiplyBy(fraction1);
      fraction3.ONE.toProperString();
      Fraction fraction4 = Fraction.THREE_QUARTERS;
      Fraction fraction5 = fraction3.TWO_QUARTERS.subtract(fraction4);
      assertEquals((-1), fraction5.getNumerator());
      assertEquals(0.2, fraction3.doubleValue(), 0.01);
      
      Fraction fraction6 = fraction2.ONE.abs();
      Fraction fraction7 = fraction6.ONE.add(fraction1);
      assertEquals((-1), fraction2.getNumerator());
      assertEquals(1.4, fraction7.doubleValue(), 0.01);
      
      fraction0.equals((Object) null);
      fraction0.getProperWhole();
      fraction4.ZERO.toString();
      fraction1.intValue();
      assertFalse(fraction1.equals((Object)fraction7));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertEquals(1, fraction0.getDenominator());
      assertNotNull(string0);
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.TWO_QUARTERS.invert();
      String string0 = fraction1.toProperString();
      assertEquals(4, fraction1.getNumerator());
      assertEquals(0, fraction0.getProperWhole());
      assertEquals("2", string0);
      assertNotNull(string0);
  }
}

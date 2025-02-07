/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:55:00 GMT 2014
 */

package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class ComplexFormatEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      assertNotNull(complexFormat0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      NumberFormat numberFormat0 = null;
      // Undeclared exception!
      try {
        complexFormat0.setRealFormat(numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // realFormat can not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberFormat numberFormat0 = null;
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryFormat can not be null.
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "";
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = null;
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      assertNotNull(complexFormat0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      String string0 = "6FYV +";
      try {
        Complex complex0 = complexFormat0.parse(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"6FYV +\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      assertNotNull(complexFormat0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      String string0 = "0+whNP$[8QAV";
      try {
        Complex complex0 = complexFormat0.parse(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"0+whNP$[8QAV\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.INF;
      //  // Unstable assertion: assertNotNull(complex0);
      //  // Unstable assertion: assertEquals((-286.0), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(286.0, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.0, complex0.getImaginary(), 0.01D);
      
      String string0 = ComplexFormat.formatComplex(complex0);
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals((-286.0), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(286.0, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.0, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals("-286", string0);
      
      ComplexFormat complexFormat0 = new ComplexFormat();
      //  // Unstable assertion: assertNotNull(complexFormat0);
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      Complex complex1 = complexFormat0.parse(string0);
      //  // Unstable assertion: assertTrue(complex0.equals((Object)complex1));
      //  // Unstable assertion: assertTrue(complex1.equals((Object)complex0));
      //  // Unstable assertion: assertNotNull(complex1);
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertEquals((-286.0), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(286.0, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.0, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(0.0, complex1.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals((-286.0), complex1.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex1.isNaN());
      //  // Unstable assertion: assertEquals(286.0, complex1.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex1.isInfinite());
      //  // Unstable assertion: assertNotSame(complex0, complex1);
      //  // Unstable assertion: assertNotSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      //  // Unstable assertion: assertNotNull(complex0);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals((-849.03882300617), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(2235.8768935188946, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals((-2068.4), complex0.getImaginary(), 0.01D);
      
      Complex complex1 = complex0.tanh();
      //  // Unstable assertion: assertFalse(complex1.equals((Object)complex0));
      //  // Unstable assertion: assertFalse(complex0.equals((Object)complex1));
      //  // Unstable assertion: assertNotNull(complex1);
      //  // Unstable assertion: assertEquals(Double.NaN, complex1.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex1.isNaN());
      //  // Unstable assertion: assertEquals(false, complex1.isInfinite());
      //  // Unstable assertion: assertEquals(-0.0, complex1.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, complex1.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals((-849.03882300617), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(2235.8768935188946, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals((-2068.4), complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertNotSame(complex1, complex0);
      //  // Unstable assertion: assertNotSame(complex0, complex1);
      
      String string0 = ComplexFormat.formatComplex(complex1);
      //  // Unstable assertion: assertFalse(complex1.equals((Object)complex0));
      //  // Unstable assertion: assertFalse(complex0.equals((Object)complex1));
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals(Double.NaN, complex1.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex1.isNaN());
      //  // Unstable assertion: assertEquals(false, complex1.isInfinite());
      //  // Unstable assertion: assertEquals(-0.0, complex1.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.NaN, complex1.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals((-849.03882300617), complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(2235.8768935188946, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals((-2068.4), complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertNotSame(complex1, complex0);
      //  // Unstable assertion: assertNotSame(complex0, complex1);
      //  // Unstable assertion: assertEquals("(NaN)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      
      ComplexFormat complexFormat0 = ComplexFormat.getInstance(locale0);
      assertNotNull(complexFormat0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      
      long long0 = (-264L);
      Long long1 = new Long(long0);
      assertTrue(long1.equals((Object)long0));
      assertEquals((-264L), (long)long1);
      
      String string0 = complexFormat0.format((Object) long1);
      assertTrue(long1.equals((Object)long0));
      assertNotNull(string0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("ja", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("-264", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      assertNotNull(complexFormat0);
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      String string0 = " ";
      int int0 = 0;
      ParsePosition parsePosition0 = new ParsePosition(int0);
      assertNotNull(parsePosition0);
      assertEquals(0, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=0,errorIndex=-1]", parsePosition0.toString());
      assertEquals(-1, parsePosition0.getErrorIndex());
      
      Complex complex0 = complexFormat0.parse(string0, parsePosition0);
      assertNull(complex0);
      assertEquals(0, parsePosition0.getIndex());
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getErrorIndex());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      // Undeclared exception!
      try {
        AttributedCharacterIterator attributedCharacterIterator0 = complexFormat0.formatToCharacterIterator((Object) complex0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      //  // Unstable assertion: assertNotNull(complexFormat0);
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      
      int int0 = 0;
      ParsePosition parsePosition0 = new ParsePosition(int0);
      //  // Unstable assertion: assertNotNull(parsePosition0);
      //  // Unstable assertion: assertEquals(0, parsePosition0.getIndex());
      //  // Unstable assertion: assertEquals(-1, parsePosition0.getErrorIndex());
      //  // Unstable assertion: assertEquals("java.text.ParsePosition[index=0,errorIndex=-1]", parsePosition0.toString());
      
      Complex complex0 = Complex.ONE;
      //  // Unstable assertion: assertNotNull(complex0);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.5, complex0.getImaginary(), 0.01D);
      
      String string0 = ComplexFormat.formatComplex(complex0);
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.5, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals("(Infinity) + 0.5i", string0);
      
      Complex complex1 = (Complex)complexFormat0.parseObject(string0, parsePosition0);
      //  // Unstable assertion: assertTrue(complex1.equals((Object)complex0));
      //  // Unstable assertion: assertTrue(complex0.equals((Object)complex1));
      //  // Unstable assertion: assertNotNull(complex1);
      //  // Unstable assertion: assertEquals(0.5, complex1.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex1.isNaN());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex1.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex1.isInfinite());
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(0.5, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals("java.text.ParsePosition[index=17,errorIndex=0]", parsePosition0.toString());
      //  // Unstable assertion: assertEquals(0, parsePosition0.getErrorIndex());
      //  // Unstable assertion: assertEquals(17, parsePosition0.getIndex());
      //  // Unstable assertion: assertNotSame(complex1, complex0);
      //  // Unstable assertion: assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getInstance();
      assertNotNull(decimalFormat0);
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      
      ComplexFormat complexFormat0 = new ComplexFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertNotNull(complexFormat0);
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
  }
}

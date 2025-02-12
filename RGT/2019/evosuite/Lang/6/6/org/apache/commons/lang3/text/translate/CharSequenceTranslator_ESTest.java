/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 12:30:56 GMT 2019
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class CharSequenceTranslator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(0);
      String string0 = numericEntityEscaper0.translate((CharSequence) "0");
      assertEquals("&#48;", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[1];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(771);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "303", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) "FFFFEE84");
      assertEquals("FFFFEE84", string0);
  }
}

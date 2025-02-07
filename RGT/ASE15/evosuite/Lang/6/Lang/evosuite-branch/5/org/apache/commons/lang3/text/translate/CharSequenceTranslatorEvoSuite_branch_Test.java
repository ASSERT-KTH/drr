/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:14:30 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;

import org.junit.runner.RunWith;

 
public class CharSequenceTranslatorEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(int0);
      assertNotNull(numericEntityEscaper0);
      
      String string0 = ")iV>b s";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      String string1 = mockFile0.getName();
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(")iV>b s", string1);
      assertNotNull(string1);
      
      String string2 = numericEntityEscaper0.translate((CharSequence) string1);
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals(")iV>b s", string2);
      assertNotNull(string2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = (-3034);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(int0, int0);
      assertNotNull(unicodeEscaper0);
      
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      assertNotNull(charSequenceTranslatorArray0[0]);
      
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("IT", locale0.getCountry());
      assertNotNull(locale0);
      
      String string0 = locale0.getDisplayCountry(locale0);
      assertEquals("Italia", string0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("IT", locale0.getCountry());
      assertNotNull(string0);
      
      String string1 = aggregateTranslator0.translate((CharSequence) string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u0049\\u0074\\u0061\\u006C\\u0069\\u0061", string1);
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("IT", locale0.getCountry());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[4];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[0].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[1].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].name());
      
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[2].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].toString());
      
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[1];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[3].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].name());
      
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      assertNotNull(numericEntityUnescaper0);
      
      CharSequence charSequence0 = null;
      PipedReader pipedReader0 = new PipedReader();
      assertEquals(false, pipedReader0.markSupported());
      assertNotNull(pipedReader0);
      
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      assertEquals(false, pipedReader0.markSupported());
      assertEquals(false, pipedReader0.ready());
      assertNotNull(pipedWriter0);
      
      numericEntityUnescaper0.translate(charSequence0, (Writer) pipedWriter0);
      assertEquals(false, pipedReader0.markSupported());
      assertEquals(false, pipedReader0.ready());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      assertNotNull(unicodeUnescaper0);
      
      String string0 = "";
      Writer writer0 = null;
      // Undeclared exception!
      try {
        unicodeUnescaper0.translate((CharSequence) string0, writer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[9];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[0].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].name());
      
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[1].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[2].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].name());
      
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTION0;
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[3].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].name());
      
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[4].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].toString());
      
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTIONArray0[2];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[5].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[6] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[6].toString());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[6].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[6].name());
      
      numericEntityUnescaper_OPTIONArray0[7] = numericEntityUnescaper_OPTIONArray0[2];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[7].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[7].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[7].name());
      
      numericEntityUnescaper_OPTIONArray0[8] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[8].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[8].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[8].name());
      
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      assertNotNull(numericEntityUnescaper0);
      
      CharSequence charSequence0 = null;
      String string0 = numericEntityUnescaper0.translate(charSequence0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      assertNotNull(octalUnescaper0);
      
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = (AggregateTranslator)octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
  }
}

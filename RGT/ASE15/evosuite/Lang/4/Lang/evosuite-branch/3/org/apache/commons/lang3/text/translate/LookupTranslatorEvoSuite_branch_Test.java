/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:13:46 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class LookupTranslatorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 10;
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("A", string0);
      assertNotNull(string0);
      
      CharSequence[][] charSequenceArray0 = new CharSequence[4][8];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      charSequenceArray1[0] = (CharSequence) string0;
      assertNotNull(charSequenceArray1[0]);
      assertEquals("A", charSequenceArray1[0].toString());
      assertEquals(1, charSequenceArray1[0].length());
      
      charSequenceArray1[1] = (CharSequence) string0;
      assertNotNull(charSequenceArray1[1]);
      assertEquals(1, charSequenceArray1[1].length());
      assertEquals("A", charSequenceArray1[1].toString());
      
      charSequenceArray0[1] = charSequenceArray1;
      assertNotNull(charSequenceArray0[1]);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[2] = charSequenceArray1;
      assertNotNull(charSequenceArray0[2]);
      
      charSequenceArray0[3] = charSequenceArray1;
      assertNotNull(charSequenceArray0[3]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate((CharSequence) string0);
      assertEquals("A", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = (-13);
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("FFFFFFF3", string0);
      assertNotNull(string0);
      
      CharSequence[][] charSequenceArray0 = new CharSequence[4][8];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      charSequenceArray1[0] = (CharSequence) string0;
      assertNotNull(charSequenceArray1[0]);
      assertEquals("FFFFFFF3", charSequenceArray1[0].toString());
      assertEquals(8, charSequenceArray1[0].length());
      
      charSequenceArray0[1] = charSequenceArray1;
      assertNotNull(charSequenceArray0[1]);
      
      charSequenceArray0[0] = charSequenceArray1;
      assertNotNull(charSequenceArray0[0]);
      
      charSequenceArray0[2] = charSequenceArray1;
      assertNotNull(charSequenceArray0[2]);
      
      charSequenceArray0[3] = charSequenceArray1;
      assertNotNull(charSequenceArray0[3]);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      assertNotNull(lookupTranslator0);
      
      String string1 = lookupTranslator0.translate((CharSequence) string0);
      assertEquals("FFFFFFF3", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequence[][] charSequenceArrayArray0 = null;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArrayArray0);
      assertNotNull(lookupTranslator0);
  }
}

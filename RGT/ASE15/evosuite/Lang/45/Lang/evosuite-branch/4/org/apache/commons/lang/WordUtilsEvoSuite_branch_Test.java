/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:01:31 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class WordUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "JA]=Ui7enqBmF&H[3";
      String string1 = "'; the SystemUtils roprty Nalue will default tonll.";
      assertNotSame(string1, string0);
      
      int int0 = (-1470);
      int int1 = 8;
      String string2 = WordUtils.abbreviate(string1, int0, int1, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertEquals("';JA]=Ui7enqBmF&H[3", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(int1 == int0);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(int0 == int1);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "JA]=Ui7enqBmF&H[3";
      int int0 = 8;
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("JA]=Ui7eJA]=Ui7enqBmF&H[3", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "JA]=Ui7enqBmF&H[3";
      String string1 = "'; the SystemUtils roprty Nalue will default tonll.";
      assertNotSame(string1, string0);
      
      int int0 = (-1470);
      // Undeclared exception!
      try {
        String string2 = WordUtils.abbreviate(string1, int0, int0, string0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1470
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "vf\\<ghiQ%";
      int int0 = 1124;
      int int1 = (-487);
      String string1 = WordUtils.abbreviate(string0, int0, int1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("vf\\<ghiQ%", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "wgogzu2=[[ ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("wgogzu2=[[ ", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      char char0 = 'z';
      int int0 = (-1);
      String string2 = WordUtils.abbreviate(string1, (int) char0, int0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertEquals("wgogzu2=[[ ", string2);
      assertNotNull(string2);
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "vf\\<ghiQ%";
      int int0 = 1124;
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("vf\\<ghiQ%", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = " ";
      char char0 = 'S';
      String string1 = WordUtils.initials(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = WordUtils.abbreviate(string1, (int) char0, (int) char0, string0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals("", string2);
      assertNotNull(string2);
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = null;
      int int0 = (-4961);
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "wgogzu2=[[ ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("wgogzu2=[[ ", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      char[] charArray0 = new char[1];
      String string2 = WordUtils.initials(string1, charArray0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      assertEquals("w", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.initials(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "uQser.imezone";
      String string1 = WordUtils.swapCase(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("UqSER.IMEZONE", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.capitalizeFully(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", string1);
      assertNotNull(string1);
      
      String string2 = WordUtils.swapCase(string1);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string0);
      assertSame(string1, string2);
      assertSame(string0, string1);
      assertSame(string0, string2);
      assertEquals("", string2);
      assertNotNull(string2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
      
      String string2 = WordUtils.swapCase(string1);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[13];
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0, charArray0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.uncapitalize(string0);
      assertNull(string1);
      
      char[] charArray0 = new char[13];
      String string2 = WordUtils.uncapitalize(string1, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
      
      char[] charArray0 = new char[17];
      String string2 = WordUtils.capitalizeFully(string1, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "wgogzu2=[[ ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("wgogzu2=[[ ", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      char[] charArray0 = new char[5];
      char char0 = 'z';
      charArray0[2] = char0;
      String string2 = WordUtils.capitalizeFully(string1, charArray0);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', 'z', '\u0000', '\u0000'}, charArray0);
      assertEquals("WgogzU2=[[ ", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertTrue(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.capitalize(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "'; the SystemUtils roprty Nalue will default tonll.";
      int int0 = 8;
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("'; the\nSystemUtils\nroprty\nNalue\nwill\ndefault\ntonll.", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = (-1470);
      String string0 = " y:_6:s";
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("y:_6:s", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "JA]=Ui7enqBmF&H[3";
      int int0 = (-1470);
      String string1 = WordUtils.wrap(string0, int0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("JA]=Ui7enqBmF&H[3", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      
      int int1 = 8;
      boolean boolean0 = true;
      String string2 = WordUtils.wrap(string1, int1, string1, boolean0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals("JA]=Ui7eJA]=Ui7enqBmF&H[3nqBmF&H[JA]=Ui7enqBmF&H[33", string2);
      assertNotNull(string2);
      assertFalse(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
      
      int int0 = (-4961);
      String string2 = WordUtils.wrap(string1, int0);
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.initials(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("", string1);
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      assertNotNull(wordUtils0);
  }
}

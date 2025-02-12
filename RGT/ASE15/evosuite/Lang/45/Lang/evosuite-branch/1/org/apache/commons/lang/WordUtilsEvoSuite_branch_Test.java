/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:30:35 GMT 2014
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
      String string0 = "";
      String string1 = "N(ta0o0&AUq=";
      assertNotSame(string1, string0);
      
      int int0 = 6;
      String string2 = WordUtils.abbreviate(string1, int0, int0, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotNull(string2);
      assertEquals("N(ta0o", string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[22];
      char char0 = 'm';
      charArray0[8] = char0;
      String string0 = " lD3M<U{])<S";
      int int0 = 8;
      String string1 = WordUtils.abbreviate(string0, (int) charArray0[8], int0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', 'm', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals(" lD3M<U{])<S", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = " ";
      String string1 = WordUtils.swapCase(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals(" ", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      int int0 = (-9);
      // Undeclared exception!
      try {
        String string2 = WordUtils.abbreviate(string0, int0, int0, string1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -9
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "java.vm]vev[`ndr";
      int int0 = (-1);
      String string1 = WordUtils.abbreviate(string0, int0, int0, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("java.vm]vev[`ndr", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "1W3";
      char[] charArray0 = new char[22];
      char char0 = 'm';
      charArray0[8] = char0;
      String string1 = WordUtils.uncapitalize(string0, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', 'm', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals("1W3", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      String string2 = WordUtils.abbreviate(string1, (int) charArray0[8], (int) charArray0[8], string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', 'm', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string2);
      assertEquals("1W3", string2);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "U!2iJIeq.mG~*";
      char[] charArray0 = new char[15];
      String string1 = "";
      assertNotSame(string1, string0);
      
      String string2 = WordUtils.capitalizeFully(string1);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotNull(string2);
      assertEquals("", string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      
      String string3 = WordUtils.abbreviate(string2, (int) charArray0[1], (int) charArray0[0], string0);
      assertNotSame(string2, string0);
      assertSame(string2, string3);
      assertSame(string2, string1);
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertSame(string1, string3);
      assertSame(string3, string1);
      assertNotSame(string3, string0);
      assertSame(string3, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string3);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string3);
      assertEquals("", string3);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string3));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "+4*qFpTq#";
      char[] charArray0 = new char[1];
      char char0 = '4';
      charArray0[0] = char0;
      String string1 = WordUtils.initials(string0, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertArrayEquals(new char[] {'4'}, charArray0);
      assertNotNull(string1);
      assertEquals("+*", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "1W3";
      char[] charArray0 = new char[22];
      String string1 = WordUtils.uncapitalize(string0, charArray0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals("1W3", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      
      String string2 = WordUtils.initials(string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string2);
      assertEquals("1", string2);
      assertFalse(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[22];
      String string0 = "";
      String string1 = WordUtils.initials(string0, charArray0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "YWqq2 ] dqY";
      int int0 = (-823);
      boolean boolean0 = false;
      String string1 = WordUtils.wrap(string0, int0, string0, boolean0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("YWqq2YWqq2 ] dqY]YWqq2 ] dqYdqY", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      
      String string2 = WordUtils.swapCase(string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotNull(string2);
      assertEquals("ywQQ2ywQQ2 ] DQy]ywQQ2 ] DQyDQy", string2);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.uncapitalize(string0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = WordUtils.swapCase(string1);
      assertSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string2);
      assertSame(string1, string0);
      assertSame(string0, string2);
      assertSame(string0, string1);
      assertNotNull(string2);
      assertEquals("", string2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.swapCase(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.uncapitalize(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "U!2iJIeq.mG~*";
      char[] charArray0 = new char[15];
      String string1 = null;
      String string2 = WordUtils.abbreviate(string1, (int) charArray0[4], (int) charArray0[4], string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNull(string2);
      
      String string3 = WordUtils.capitalizeFully(string2);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNull(string3);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = " ";
      int int0 = (-3346);
      int int1 = 3;
      String string1 = WordUtils.abbreviate(string0, int0, int1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals(" ", string1);
      assertFalse(int0 == int1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertFalse(int1 == int0);
      
      String string2 = WordUtils.capitalizeFully(string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotNull(string2);
      assertEquals(" ", string2);
      assertFalse(int0 == int1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      String string1 = WordUtils.capitalize(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.capitalize(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "U!2iJIeq.mG~*";
      char[] charArray0 = new char[15];
      String string1 = WordUtils.capitalizeFully(string0, charArray0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals("U!2ijieq.mg~*", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "1W3";
      boolean boolean0 = true;
      String string1 = " lD3M<U{])<S";
      assertNotSame(string1, string0);
      
      int int0 = 8;
      String string2 = WordUtils.wrap(string1, int0, string0, boolean0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotNull(string2);
      assertEquals("lD3M<U{]1W3)<S", string2);
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 1726;
      String string0 = null;
      String string1 = WordUtils.wrap(string0, int0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = " ";
      String string1 = WordUtils.uncapitalize(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotNull(string1);
      assertEquals(" ", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = null;
      String string1 = WordUtils.initials(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      assertNotNull(wordUtils0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "U!2iJIeq.mG~*";
      char[] charArray0 = new char[15];
      String string1 = WordUtils.wrap(string0, (int) charArray0[6]);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string1);
      assertEquals("U!2iJIeq.mG~*", string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
  }
}

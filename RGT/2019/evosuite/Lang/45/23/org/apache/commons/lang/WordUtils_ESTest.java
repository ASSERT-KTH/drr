/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 08:45:03 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class WordUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully(" ");
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = WordUtils.initials("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = WordUtils.uncapitalize("Y\"_& 1l\"y{xl");
      assertEquals("y\"_& 1l\"y{xl", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = WordUtils.wrap((String) null, 0, "H,V>?d.k9@", true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = WordUtils.wrap(" Wy>-GPb( I;~Er", 978);
      assertEquals(" Wy>-GPb( I;~Er", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = WordUtils.wrap("7#{}pPRnL_quJ  {fL{F2#{}pPRnL_quJ  {fL{Fy#{}pPRnL_quJ  {fL{F-#{}pPRnL_quJ  {fL{F.#{}pPRnL_quJ  {fL{Fc#{}pPRnL_quJ  {fL{F,", (-2240));
      assertEquals("7#{}pPRnL_quJ\n{fL{F2#{}pPRnL_quJ\n{fL{Fy#{}pPRnL_quJ\n{fL{F-#{}pPRnL_quJ\n{fL{F.#{}pPRnL_quJ\n{fL{Fc#{}pPRnL_quJ\n{fL{F,", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = WordUtils.wrap("u_\"~k (}M+3Je}irh", 0, "N(B", true);
      assertEquals("uN(B_N(B\"N(B~N(BkN(B(N(B}N(BMN(B+N(B3N(BJN(BeN(B}N(BiN(BrN(Bh", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalize("0D5gtMs@]i~:(f|;E", charArray0);
      assertEquals("0D5gtMs@]i~:(f|;E", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = WordUtils.capitalize((String) null, (char[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = WordUtils.capitalize("", (char[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = WordUtils.capitalize("0D5gtMs@]i~:(f|;E");
      assertEquals("0D5gtMs@]i~:(f|;E", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.capitalizeFully("0D5gtMs@]i~:(f|;E", charArray0);
      assertEquals("0D5gtMs@]i~:(f|;E", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = WordUtils.capitalizeFully("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = WordUtils.uncapitalize((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.uncapitalize("SunOS", charArray0);
      assertEquals("SunOS", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = WordUtils.swapCase((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = WordUtils.swapCase("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = WordUtils.swapCase("org.apache.commons.lang.WordUtils");
      assertEquals("ORG.APACHE.COMMONS.LANG.wORDuTILS", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = WordUtils.initials((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = WordUtils.initials("0D5gtMs@]i~:(f|;E");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[0];
      String string0 = WordUtils.initials("B=9SU}HZ", charArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'N';
      String string0 = WordUtils.initials("N(B", charArray0);
      assertEquals("(", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = WordUtils.abbreviate("org.apache.commons.lang.WordUtils", 301, 301, "Org.apache.commons.lang.wordutils");
      assertNotNull(string0);
      assertEquals("org.apache.commons.lang.WordUtils", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = WordUtils.abbreviate((String) null, (-2240), (-29), "os.arch");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = WordUtils.abbreviate("", 978, 978, " ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = WordUtils.abbreviate("Y\"_& 1L\"Y{Xl", 0, 0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = WordUtils.abbreviate("qn!pd-9\"Yok", (-1), (-1), "qn!pd-9\"Yok");
      assertEquals("qn!pd-9\"Yok", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        WordUtils.abbreviate("5.1", (-1312), (-4790), "Ao:.tiw0qub");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = WordUtils.abbreviate("S", (-1727), 0, "BvOsPV-D2k");
      assertEquals("BvOsPV-D2k", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = WordUtils.abbreviate(" ", 0, 0, "T|U\"}QT}muhEv");
      assertEquals("T|U\"}QT}muhEv", string0);
  }
}

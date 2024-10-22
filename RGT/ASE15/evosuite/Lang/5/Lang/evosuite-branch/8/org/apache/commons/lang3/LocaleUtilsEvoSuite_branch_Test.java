/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:44:03 GMT 2014
 */

package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class LocaleUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = null;
      List<Locale> list0 = LocaleUtils.countriesByLanguage(string0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "lt";
      List<Locale> list0 = LocaleUtils.countriesByLanguage(string0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = null;
      List<Locale> list0 = LocaleUtils.languagesByCountry(string0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertNotNull(locale0);
      
      String string0 = locale0.getDisplayVariant();
      assertEquals("", string0);
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertNotNull(string0);
      
      List<Locale> list0 = LocaleUtils.languagesByCountry(string0);
      assertEquals(false, list0.isEmpty());
      assertEquals(44, list0.size());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "A@<'\"?:\\Sp\"*";
      Locale locale0 = new Locale(string0, string0, string0);
      assertEquals("A@<'\"?:\\Sp\"*", locale0.getVariant());
      assertEquals("A@<'\"?:\\SP\"*", locale0.getCountry());
      assertEquals("a@<'\"?:\\sp\"*", locale0.getLanguage());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale0.toString());
      assertNotNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
      assertEquals("A@<'\"?:\\Sp\"*", locale0.getVariant());
      assertEquals("A@<'\"?:\\SP\"*", locale0.getCountry());
      assertEquals("a@<'\"?:\\sp\"*", locale0.getLanguage());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "A@<'\"?:\\Sp\"*";
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      Locale locale1 = new Locale(string0, string0, string0);
      assertEquals("a@<'\"?:\\sp\"*", locale1.getLanguage());
      assertEquals("A@<'\"?:\\SP\"*", locale1.getCountry());
      assertEquals("A@<'\"?:\\Sp\"*", locale1.getVariant());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale1.toString());
      assertFalse(locale1.equals((Object)locale0));
      assertNotNull(locale1);
      assertNotSame(locale1, locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals(false, list0.isEmpty());
      assertEquals(3, list0.size());
      assertEquals("a@<'\"?:\\sp\"*", locale1.getLanguage());
      assertEquals("A@<'\"?:\\SP\"*", locale1.getCountry());
      assertEquals("A@<'\"?:\\Sp\"*", locale1.getVariant());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale1.toString());
      assertFalse(locale0.equals((Object)locale1));
      assertFalse(locale1.equals((Object)locale0));
      assertNotNull(list0);
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertNotNull(locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "A@<'\"?:\\Sp\"*";
      Locale locale0 = new Locale(string0, string0, string0);
      assertEquals("A@<'\"?:\\SP\"*", locale0.getCountry());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale0.toString());
      assertEquals("a@<'\"?:\\sp\"*", locale0.getLanguage());
      assertEquals("A@<'\"?:\\Sp\"*", locale0.getVariant());
      assertNotNull(locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(false, list0.isEmpty());
      assertEquals(3, list0.size());
      assertEquals("A@<'\"?:\\SP\"*", locale0.getCountry());
      assertEquals("a@<'\"?:\\sp\"*_A@<'\"?:\\SP\"*_A@<'\"?:\\Sp\"*", locale0.toString());
      assertEquals("a@<'\"?:\\sp\"*", locale0.getLanguage());
      assertEquals("A@<'\"?:\\Sp\"*", locale0.getVariant());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = null;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "vi_KX^]buEDctkY";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vi_KX^]buEDctkY
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "vi_LsX?O;t>k[Y";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vi_LsX?O;t>k[Y
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "vi_D&ED>kX";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vi_D&ED>kX
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "vi_mbuED>kX";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: vi_mbuED>kX
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "zi_.$buE-t>k1";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: zi_.$buE-t>k1
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "vi__KXbuEDt>kY";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertEquals("vie", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("vi", locale0.getLanguage());
      assertEquals("KXbuEDt>kY", locale0.getVariant());
      assertEquals("vi__KXbuEDt>kY", locale0.toString());
      assertNotNull(locale0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "og.apache<commons.lang3.Local\"Ut#s";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: og.apache<commons.lang3.Local\"Ut#s
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "a| P#x+#2zl";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: a| P#x+#2zl
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "w2EDQ*/";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: w2EDQ*_/
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "^SpP5;A8a";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ^SpP5;A8a
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "w";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: w
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertNotNull(locale0);
      
      String string0 = locale0.toString();
      assertEquals("ja_JP", string0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertNotNull(string0);
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja_JP", locale1.toString());
      assertEquals("ja", locale1.getLanguage());
      assertEquals("JP", locale1.getCountry());
      assertEquals("", locale1.getVariant());
      assertEquals("jpn", locale1.getISO3Language());
      assertEquals("JPN", locale1.getISO3Country());
      assertTrue(locale0.equals((Object)locale1));
      assertTrue(locale1.equals((Object)locale0));
      assertNotNull(locale1);
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "lt";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("lit", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("lt", locale0.toString());
      assertEquals("lt", locale0.getLanguage());
      assertNotNull(locale0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "LjtynU^XV%,#P";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: LjtynU^XV%,#P
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(false, set0.isEmpty());
      assertEquals(156, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja", locale0.getLanguage());
      assertNotNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
      assertNotNull(localeUtils_SyncAvoid0);
  }
}

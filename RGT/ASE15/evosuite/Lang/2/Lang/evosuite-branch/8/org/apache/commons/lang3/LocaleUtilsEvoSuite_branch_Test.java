/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:59:57 GMT 2014
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
      Locale locale0 = Locale.PRC;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertNotNull(locale0);
      
      String string0 = locale0.toString();
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh_CN", string0);
      assertNotNull(string0);
      
      List<Locale> list0 = LocaleUtils.countriesByLanguage(string0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
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
      Locale locale0 = Locale.PRC;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = locale0.toString();
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", string0);
      assertNotNull(string0);
      
      List<Locale> list0 = LocaleUtils.languagesByCountry(string0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertNotNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertNotNull(locale0);
      
      Locale locale1 = Locale.ROOT;
      assertFalse(locale1.equals((Object)locale0));
      assertEquals("", locale1.toString());
      assertEquals("", locale1.getCountry());
      assertEquals("", locale1.getISO3Language());
      assertEquals("", locale1.getISO3Country());
      assertEquals("", locale1.getVariant());
      assertEquals("", locale1.getLanguage());
      assertNotSame(locale1, locale0);
      assertNotNull(locale1);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertFalse(locale1.equals((Object)locale0));
      assertFalse(locale0.equals((Object)locale1));
      assertEquals("", locale1.toString());
      assertEquals("", locale1.getCountry());
      assertEquals("", locale1.getISO3Language());
      assertEquals("", locale1.getISO3Country());
      assertEquals("", locale1.getVariant());
      assertEquals("", locale1.getLanguage());
      assertEquals(false, list0.isEmpty());
      assertEquals(3, list0.size());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertNotSame(locale1, locale0);
      assertNotSame(locale0, locale1);
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "no";
      Locale locale0 = new Locale(string0);
      assertEquals("no", locale0.getLanguage());
      assertEquals("no", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("nor", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertEquals("no", locale0.getLanguage());
      assertEquals("no", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("nor", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "ao_OEimtFI|E";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ao_OEimtFI|E
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "ao_O{Ma8NXmtFI|E";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ao_O{Ma8NXmtFI|E
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "ao_O9mtI6";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ao_O9mtI6
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "ao_^EPtFI|E";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ao_^EPtFI|E
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "ao_29IOEcmt+I|E";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ao_29IOEcmt+I|E
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "sr";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("srp", locale0.getISO3Language());
      assertEquals("sr", locale0.toString());
      assertEquals("sr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "j}*UJ$y";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: j}*UJ$y
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "g=";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: g=
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "^<ihxjy\"vvrw\\MW";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ^<ihxjy\"vvrw\\MW
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "org.apache.commons.lang3.LocaleUtils";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang3.LocaleUtils
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "i";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: i
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = locale0.getDisplayCountry(locale0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("\u4E2D\u56FD", string0);
      assertNotNull(string0);
      
      // Undeclared exception!
      try {
        Locale locale1 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: \u4E2D\u56FD
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = locale0.toString();
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", string0);
      assertNotNull(string0);
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertTrue(locale0.equals((Object)locale1));
      assertTrue(locale1.equals((Object)locale0));
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale1.getISO3Country());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("zh_CN", locale1.toString());
      assertEquals("CN", locale1.getCountry());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("", locale1.getVariant());
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
      assertNotNull(locale1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(false, set0.isEmpty());
      assertEquals(156, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertNotNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "4,zUwpNzs";
      Locale locale0 = new Locale(string0, string0, string0);
      assertEquals("4,zUwpNzs", locale0.getVariant());
      assertEquals("4,zuwpnzs", locale0.getLanguage());
      assertEquals("4,zuwpnzs_4,ZUWPNZS_4,zUwpNzs", locale0.toString());
      assertEquals("4,ZUWPNZS", locale0.getCountry());
      assertNotNull(locale0);
      
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals("4,zUwpNzs", locale0.getVariant());
      assertEquals("4,zuwpnzs", locale0.getLanguage());
      assertEquals("4,zuwpnzs_4,ZUWPNZS_4,zUwpNzs", locale0.toString());
      assertEquals("4,ZUWPNZS", locale0.getCountry());
      assertEquals(3, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
      assertNotNull(localeUtils_SyncAvoid0);
  }
}

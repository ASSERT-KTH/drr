/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:19:03 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang.Entities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class EntitiesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      assertNotNull(entities0);
      
      String string0 = "&;=v['HYcOLl";
      String string1 = entities0.unescape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("&;=v['HYcOLl", string1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      String string0 = "<Z51bVL\\'&&dn#;kie$H";
      entities0.unescape((Writer) stringWriter0, string0);
      assertEquals("<Z51bVL\\'&&dn#;kie$H", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      String string0 = "Illega4lxCapatD ";
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      entities0.unescape((Writer) stringWriter0, string0);
      assertEquals("Illega4lxCapatD ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "K2uf`mEn{";
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      String string1 = entities0.unescape(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("K2uf`mEn{", string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      String string0 = "\\1B,{g&nB!5>g?";
      String string1 = entities0.unescape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("\\1B,{g&nB!5>g?", string1);
  }

  @Test(timeout = 4000)
  public void test05() {}
//   @Test(timeout = 4000)
//   public void test05()  throws Throwable  {
//       Entities entities0 = Entities.HTML40;
//       assertNotNull(entities0);
//       
//       StringWriter stringWriter0 = new StringWriter();
//       assertNotNull(stringWriter0);
//       assertEquals("", stringWriter0.toString());
//       
//       Locale locale0 = Locale.FRANCE;
//       assertNotNull(locale0);
//       assertEquals("fra", locale0.getISO3Language());
//       assertEquals("FR", locale0.getCountry());
//       assertEquals("fr_FR", locale0.toString());
//       assertEquals("", locale0.getVariant());
//       assertEquals("fr", locale0.getLanguage());
//       assertEquals("FRA", locale0.getISO3Country());
//       
//       String string0 = locale0.getDisplayCountry();
//       assertNotNull(string0);
//       assertEquals("fra", locale0.getISO3Language());
//       assertEquals("FR", locale0.getCountry());
//       assertEquals("fr_FR", locale0.toString());
//       assertEquals("", locale0.getVariant());
//       assertEquals("fr", locale0.getLanguage());
//       assertEquals("FRA", locale0.getISO3Country());
//       assertEquals("\u30D5\u30E9\u30F3\u30B9", string0);
//       
//       entities0.escape((Writer) stringWriter0, string0);
//       assertEquals("&#12501;&#12521;&#12531;&#12473;", stringWriter0.toString());
//       assertEquals("fra", locale0.getISO3Language());
//       assertEquals("FR", locale0.getCountry());
//       assertEquals("fr_FR", locale0.toString());
//       assertEquals("", locale0.getVariant());
//       assertEquals("fr", locale0.getLanguage());
//       assertEquals("FRA", locale0.getISO3Country());
//   }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "K2uf`mEn{";
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      assertNotNull(entities_BinaryEntityMap0);
      
      int int0 = entities_BinaryEntityMap0.value(string0);
      assertEquals((-1), int0);
      
      String string1 = entities_BinaryEntityMap0.name(int0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "K2uf`mEn{";
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      assertNotNull(entities_BinaryEntityMap0);
      
      int int0 = 1854;
      entities_BinaryEntityMap0.add(string0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      assertNotNull(entities_LookupEntityMap0);
      
      int int0 = 0;
      String string0 = entities_LookupEntityMap0.name(int0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      assertNotNull(entities_LookupEntityMap0);
      
      int int0 = 2295;
      String string0 = entities_LookupEntityMap0.name(int0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "\\1B,{g&nB!5>g?";
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      assertNotNull(entities_TreeEntityMap0);
      
      int int0 = entities_TreeEntityMap0.value(string0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "\\1B,{g&nB!5>g?";
      Entities entities0 = Entities.XML;
      assertNotNull(entities0);
      
      int int0 = 0;
      String string1 = entities0.escape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("\\1B,{g&amp;nB!5&gt;g?", string1);
      
      StringWriter stringWriter0 = new StringWriter(int0);
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      entities0.unescape((Writer) stringWriter0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("\\1B,{g&nB!5>g?", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "K2uf`mEn{";
      Entities entities0 = Entities.HTML40;
      //  // Unstable assertion: assertNotNull(entities0);
      
      int int0 = entities0.entityValue(string0);
      //  // Unstable assertion: assertEquals(1854, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Entities entities0 = Entities.XML;
      assertNotNull(entities0);
      
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      assertNotNull(entities_HashEntityMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 0;
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(int0);
      assertNotNull(entities_BinaryEntityMap0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities entities0 = new Entities();
      assertNotNull(entities0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      assertNotNull(entities0);
      
      Entities.fillWithHtml40Entities(entities0);
  }
}

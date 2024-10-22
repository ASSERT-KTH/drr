/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:12:06 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "1]Di)!v<_K)`{&g;";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/1]Di)!v<_K)`{&g;/", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertEquals("/1]Di)!v<_K)`{&g;/", string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertNotNull(string2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertNotNull(charset0);
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertNotNull(charsetEncoder0);
      
      String string0 = "\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000";
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("/\\t\\n\\x0B\f\\r \u0085\u1680\u2028\u2029\u205F\u3000/", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("/\\t\\n\\x0B\\u000c\\r \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000/", string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/\\t\\n\\x0B\\u000c\\r \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000/", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "<!--r</scriptx/z0{|";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/<\\!--r<\\/scriptx/z0{|/", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "D,m4<>\\}>1X]>F->";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"D,m4<>\\\\}>1X]>F->\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "O4^m}@g^]>'UW";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"O4^m}@g^]>'UW\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "D.qm\\U>1AX.{]r1\"c-->";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"D.qm\\\\U>1AX.{]r1\\\"c--\\>\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "1";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "1]Di)!v<_K)`{&g;";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "1]Di)!v<_K)`{&g;";
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charset0);
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertNotNull(charsetEncoder0);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("/1]Di)!v<_K)`{&g;/", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(Double.NaN, double0, 0.01D);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ")>~^y2rHE!\\#";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\")>~^\\u007fy2rHE!\\\\#\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
  }
}

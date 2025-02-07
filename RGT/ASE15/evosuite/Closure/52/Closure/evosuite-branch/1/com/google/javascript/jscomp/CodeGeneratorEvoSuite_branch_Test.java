/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:13:45 GMT 2014
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
import sun.nio.cs.US_ASCII;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "ZTsNd6p>`Qy%bk->";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"ZTsNd6p>`Qy%bk->\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "q|p+k>R[\\]>mRc";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"q|p+k>R[\\\\]>mRc\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "5L{H'_<!--~;gJ{";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"5L{H'_<\\!--~;gJ{\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ">JWa|sQ--#Nj!ecOR\">l";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\">JWa|sQ--#Nj!ecOR\\\">l\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "default";
      US_ASCII uS_ASCII0 = (US_ASCII)Charset.forName(string0);
      assertNotNull(uS_ASCII0);
      assertEquals(true, uS_ASCII0.isRegistered());
      assertEquals("US-ASCII", uS_ASCII0.displayName());
      assertEquals(true, uS_ASCII0.canEncode());
      assertEquals("US-ASCII", uS_ASCII0.toString());
      assertEquals("US-ASCII", uS_ASCII0.name());
      
      String string1 = "\t1\n\u000B\f\r \u0085\u1680]s\u2028\u2029\u205Fz\u3000";
      assertNotSame(string1, string0);
      
      String string2 = CodeGenerator.identifierEscape(string1);
      assertNotNull(string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertEquals("\\u00091\\u000a\\u000b\\u000c\\u000d \\u0085\\u1680]s\\u2028\\u2029\\u205fz\\u3000", string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      
      char char0 = '\u0084';
      CharsetEncoder charsetEncoder0 = uS_ASCII0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertEquals(1.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.0F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(true, uS_ASCII0.isRegistered());
      assertEquals("US-ASCII", uS_ASCII0.displayName());
      assertEquals(true, uS_ASCII0.canEncode());
      assertEquals("US-ASCII", uS_ASCII0.toString());
      assertEquals("US-ASCII", uS_ASCII0.name());
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      
      String string3 = CodeGenerator.strEscape(string1, char0, string2, string2, string0, charsetEncoder0);
      assertNotNull(string3);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string3);
      assertNotSame(string3, string0);
      assertNotSame(string3, string2);
      assertNotSame(string3, string1);
      assertNotSame(string0, string2);
      assertNotSame(string0, string3);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string3);
      assertNotSame(string2, string1);
      assertEquals("\u0084\\t1\\n\u000B\f\\r \\u0085\\u1680]s\\u2028\\u2029\\u205fz\\u3000\u0084", string3);
      assertEquals(1.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.0F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(true, uS_ASCII0.isRegistered());
      assertEquals("US-ASCII", uS_ASCII0.displayName());
      assertEquals(true, uS_ASCII0.canEncode());
      assertEquals("US-ASCII", uS_ASCII0.toString());
      assertEquals("US-ASCII", uS_ASCII0.name());
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string3));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string3));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string3));
      assertFalse(string2.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "1";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "hcLR <-->";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("hcLR <-->", string1);
      
      double double0 = CodeGenerator.getSimpleNumber(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "'l";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "0";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "</scriptks(!~V~s_t";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"<\\/scriptks(!~V~s_t\"", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "hcLR <-->";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("/hcLR <--\\>/", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "\u000B@eVCY\u0085\u2028\u2029\u3000";
      CharsetEncoder charsetEncoder0 = null;
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }
}

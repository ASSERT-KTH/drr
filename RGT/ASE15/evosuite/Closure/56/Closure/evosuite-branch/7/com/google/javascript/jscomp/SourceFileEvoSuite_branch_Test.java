/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:20:08 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;

import org.junit.runner.RunWith;

 
public class SourceFileEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "\n";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals(2, simpleRegion0.getEndingLineNumber());
      assertNotNull(simpleRegion0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "US-ASCII";
      String string1 = "\nActual: ";
      assertNotSame(string1, string0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("US-ASCII", sourceFile_Preloaded0.toString());
      assertEquals("US-ASCII", sourceFile_Preloaded0.getName());
      assertEquals("US-ASCII", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 2283;
      Region region0 = sourceFile_Preloaded0.getRegion(int0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("US-ASCII", sourceFile_Preloaded0.toString());
      assertEquals("US-ASCII", sourceFile_Preloaded0.getName());
      assertEquals("US-ASCII", sourceFile_Preloaded0.getOriginalPath());
      assertNull(region0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = (-57);
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertNotNull(simpleRegion0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "qdd";
      String string1 = "";
      assertNotSame(string1, string0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("qdd", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("qdd", sourceFile_Preloaded0.getName());
      assertEquals("qdd", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = (-1177);
      String string2 = sourceFile_Preloaded0.getLine(int0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("qdd", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("qdd", sourceFile_Preloaded0.getName());
      assertEquals("qdd", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNull(string2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "Z)YY~-z";
      int int0 = 0;
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getName());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("Z)YY~-z", string1);
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getName());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.toString());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "\n";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 880;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ".8B*Vv1=;<V2u^U";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.toString());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getOriginalPath();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals(".8B*Vv1=;<V2u^U", string1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.toString());
      assertEquals(".8B*Vv1=;<V2u^U", sourceFile_Preloaded0.getName());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ";5%r.h1W<lt[/WxX";
      SourceFile sourceFile0 = new SourceFile(string0);
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.getOriginalPath());
      assertEquals(false, sourceFile0.isExtern());
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.toString());
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.getName());
      assertNotNull(sourceFile0);
      
      String string1 = sourceFile0.getOriginalPath();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals(";5%r.h1W<lt[/WxX", string1);
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.getOriginalPath());
      assertEquals(false, sourceFile0.isExtern());
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.toString());
      assertEquals(";5%r.h1W<lt[/WxX", sourceFile0.getName());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "US-ASCII";
      String string1 = "\nActual: ";
      assertNotSame(string1, string0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("US-ASCII", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("US-ASCII", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("US-ASCII", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 2283;
      // Undeclared exception!
      try {
        int int1 = sourceFile_Preloaded0.getLineOffset(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected line number between 1 and 2
         // Actual: 2283
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "Not a directory: %s";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getName());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = sourceFile_Preloaded0.getNumLines();
      assertEquals(1, int0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getName());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.toString());
      
      int int1 = sourceFile_Preloaded0.getNumLines();
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.getName());
      assertEquals("Not a directory: %s", sourceFile_Preloaded0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "US-ASCII";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertEquals("US-ASCII", sourceFile_OnDisk0.getName());
      assertEquals("US-ASCII", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("US-ASCII", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = (-3111);
      // Undeclared exception!
      try {
        int int1 = sourceFile_OnDisk0.getLineOffset(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected line number between 1 and 1
         // Actual: -3111
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "[~b.)+P=ATK<1^N(";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = sourceFile_Preloaded0.getNumLines();
      assertEquals(1, int0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      
      int int1 = sourceFile_Preloaded0.getLineOffset(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "\n";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      int int0 = 0;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("", string1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("\n", sourceFile_Preloaded0.getName());
      assertEquals("\n", sourceFile_Preloaded0.toString());
      assertEquals("\n", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(string1);
      
      // Undeclared exception!
      try {
        SourceFile sourceFile0 = SourceFile.fromCode(string1, string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // a source must have a name
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      String string1 = null;
      // Undeclared exception!
      try {
        SourceFile sourceFile0 = SourceFile.fromCode(string1, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // a source must have a name
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = null;
      InputStream inputStream0 = null;
      // Undeclared exception!
      try {
        SourceFile sourceFile0 = SourceFile.fromInputStream(string0, inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromCode(string0, string0, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(sourceFile_OnDisk0);
      
      MockFileReader mockFileReader0 = (MockFileReader)sourceFile_OnDisk0.getCodeReader();
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(false, mockFileReader0.markSupported());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertNotNull(mockFileReader0);
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromReader(string0, (Reader) mockFileReader0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(false, mockFileReader0.markSupported());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertNotNull(sourceFile_Preloaded0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "\n";
      int int0 = 880;
      PipedInputStream pipedInputStream0 = new PipedInputStream(int0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      try {
        SourceFile sourceFile0 = SourceFile.fromInputStream(string0, string0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertNotNull(sourceFile_OnDisk0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "Z)YY~-z";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.toString());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getName();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("Z)YY~-z", string1);
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.toString());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("Z)YY~-z", sourceFile_Preloaded0.getOriginalPath());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "[~b.)+P=ATK<1^N(";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.toString();
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("[~b.)+P=ATK<1^N(", string1);
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      sourceFile_Preloaded0.clearCachedSource();
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.toString());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "[~b.)+P=ATK<1^N(";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(sourceFile_Preloaded0);
      
      String string1 = sourceFile_Preloaded0.getCodeNoCache();
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("[~b.)+P=ATK<1^N(", string1);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "[~b.)+P=ATK<1^N(";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      assertNotNull(sourceFile_Preloaded0);
      
      boolean boolean0 = sourceFile_Preloaded0.isExtern();
      assertFalse(boolean0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
      
      sourceFile_Preloaded0.setIsExtern(boolean0);
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.toString());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getOriginalPath());
      assertEquals(false, sourceFile_Preloaded0.isExtern());
      assertEquals("[~b.)+P=ATK<1^N(", sourceFile_Preloaded0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile$Preloaded";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(charset0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(sourceFile_OnDisk0);
      
      int int0 = 16;
      String string1 = sourceFile_OnDisk0.getLine(int0);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNull(string1);
      
      StringReader stringReader0 = (StringReader)sourceFile_OnDisk0.getCodeReader();
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.toString());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/com.google.javascript.jscomp.SourceFile$Preloaded0com.google.javascript.jscomp.SourceFile$Preloaded", sourceFile_OnDisk0.getName());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.toString());
      assertNotNull(stringReader0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "length is negative";
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0, charset0);
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("length is negative", sourceFile_OnDisk0.getName());
      assertEquals("length is negative", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("length is negative", sourceFile_OnDisk0.toString());
      assertNotNull(sourceFile_OnDisk0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertEquals("/", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/", sourceFile_OnDisk0.getName());
      assertNotNull(sourceFile_OnDisk0);
      
      sourceFile_OnDisk0.clearCachedSource();
      assertEquals("/", sourceFile_OnDisk0.toString());
      assertEquals(false, sourceFile_OnDisk0.isExtern());
      assertEquals("/", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/", sourceFile_OnDisk0.getName());
  }
}

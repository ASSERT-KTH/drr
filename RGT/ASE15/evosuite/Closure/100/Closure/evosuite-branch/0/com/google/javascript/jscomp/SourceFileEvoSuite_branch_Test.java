/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:09:46 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

 
public class SourceFileEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "mVNTSqq*9";
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromCode(string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("mVNTSqq*9", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("mVNTSqq*9", sourceFile_Preloaded0.getName());
      
      int int0 = (-2119);
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_Preloaded0.getRegion(int0);
      assertNotNull(simpleRegion0);
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
      assertEquals("mVNTSqq*9", simpleRegion0.getSourceExcerpt());
      assertEquals(1, simpleRegion0.getEndingLineNumber());
      assertEquals("mVNTSqq*9", sourceFile_Preloaded0.getOriginalPath());
      assertEquals("mVNTSqq*9", sourceFile_Preloaded0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/100/0/run_evosuite.pl_15590_1418324459/com.google.javascript.jscomp.SourceFile/TptW(06JlFO");
      String string0 = "com.google.javascript.jscomp.SourceFile";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertTrue(boolean0);
      
      String string1 = "TptW(06JlFO";
      assertNotSame(string1, string0);
      
      MockFile mockFile0 = new MockFile(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(mockFile0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(sourceFile_OnDisk0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("com.google.javascript.jscomp.SourceFile/TptW(06JlFO", sourceFile_OnDisk0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile/TptW(06JlFO", sourceFile_OnDisk0.getOriginalPath());
      
      int int0 = 0;
      SimpleRegion simpleRegion0 = (SimpleRegion)sourceFile_OnDisk0.getRegion(int0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(simpleRegion0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("com.google.javascript.jscomp.SourceFile/TptW(06JlFO", sourceFile_OnDisk0.getName());
      assertEquals("com.google.javascript.jscomp.SourceFile/TptW(06JlFO", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile", simpleRegion0.getSourceExcerpt());
      assertEquals(2, simpleRegion0.getEndingLineNumber());
      assertEquals(1, simpleRegion0.getBeginningLineNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "Qw-Y2";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("Qw-Y2", sourceFile_Preloaded0.getName());
      assertEquals("Qw-Y2", sourceFile_Preloaded0.getOriginalPath());
      
      int int0 = 4345;
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertNull(string1);
      assertEquals("Qw-Y2", sourceFile_Preloaded0.getName());
      assertEquals("Qw-Y2", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "&V&%C)";
      SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded(string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("&V&%C)", sourceFile_Preloaded0.getName());
      assertEquals("&V&%C)", sourceFile_Preloaded0.getOriginalPath());
      
      int int0 = (-579);
      String string1 = sourceFile_Preloaded0.getLine(int0);
      assertNull(string1);
      assertEquals("&V&%C)", sourceFile_Preloaded0.getName());
      assertEquals("&V&%C)", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getName());
      
      try {
        Reader reader0 = sourceFile_OnDisk0.getCodeReader();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "&V&%C)";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(string0);
      assertNotNull(jSSourceFile0);
      assertEquals("&V&%C)", jSSourceFile0.getName());
      assertEquals("&V&%C)", jSSourceFile0.getOriginalPath());
      
      jSSourceFile0.setOriginalPath(string0);
      assertEquals("&V&%C)", jSSourceFile0.getName());
      assertEquals("&V&%C)", jSSourceFile0.getOriginalPath());
      
      String string1 = jSSourceFile0.getOriginalPath();
      assertNotNull(string1);
      assertEquals("&V&%C)", string1);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("&V&%C)", jSSourceFile0.getName());
      assertEquals("&V&%C)", jSSourceFile0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "&V& x%C)";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("/tmp/&V& x%C)0&V& x%C)", sourceFile_OnDisk0.getName());
      assertEquals("/tmp/&V& x%C)0&V& x%C)", sourceFile_OnDisk0.getOriginalPath());
      
      String string1 = sourceFile_OnDisk0.getOriginalPath();
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("/tmp/&V& x%C)0&V& x%C)", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/tmp/&V& x%C)0&V& x%C)", sourceFile_OnDisk0.getName());
      assertEquals("/tmp/&V& x%C)0&V& x%C)", sourceFile_OnDisk0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      try {
        JSSourceFile jSSourceFile0 = JSSourceFile.fromInputStream(string0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "]";
      PipedReader pipedReader0 = new PipedReader();
      assertNotNull(pipedReader0);
      assertEquals(false, pipedReader0.markSupported());
      
      try {
        SourceFile sourceFile0 = SourceFile.fromReader(string0, (Reader) pipedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      StringBufferInputStream stringBufferInputStream0 = new StringBufferInputStream(string0);
      assertNotNull(stringBufferInputStream0);
      assertEquals(0, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
      
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromInputStream(string0, string0, (InputStream) stringBufferInputStream0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals(0, stringBufferInputStream0.available());
      assertEquals(false, stringBufferInputStream0.markSupported());
      assertEquals("", sourceFile_Preloaded0.getName());
      assertEquals("", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "mVNTSqq*9";
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile(string0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("mVNTSqq*9", sourceFile_OnDisk0.getName());
      assertEquals("mVNTSqq*9", sourceFile_OnDisk0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "";
      SourceFile.Preloaded sourceFile_Preloaded0 = (SourceFile.Preloaded)SourceFile.fromCode(string0, string0, string0);
      assertNotNull(sourceFile_Preloaded0);
      assertEquals("", sourceFile_Preloaded0.getName());
      assertEquals("", sourceFile_Preloaded0.getOriginalPath());
      
      sourceFile_Preloaded0.clearCachedSource();
      assertEquals("", sourceFile_Preloaded0.getName());
      assertEquals("", sourceFile_Preloaded0.getOriginalPath());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "CJp-yQ\"*";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("CJp-yQ\"*", jSSourceFile0.getOriginalPath());
      assertEquals("CJp-yQ\"*", jSSourceFile0.getName());
      
      String string1 = jSSourceFile0.getCodeNoCache();
      assertNotNull(string1);
      assertEquals("CJp-yQ\"*", string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("CJp-yQ\"*", jSSourceFile0.getOriginalPath());
      assertEquals("CJp-yQ\"*", jSSourceFile0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "mVNTSqq*9";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = null;
      SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0, charset0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getName());
      
      int int0 = 2735;
      Region region0 = sourceFile_OnDisk0.getRegion(int0);
      assertNull(region0);
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getName());
      
      StringReader stringReader0 = (StringReader)sourceFile_OnDisk0.getCodeReader();
      assertNotNull(stringReader0);
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("/tmp/mVNTSqq*90mVNTSqq*9", sourceFile_OnDisk0.getName());
      assertEquals(true, stringReader0.ready());
      assertEquals(true, stringReader0.markSupported());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "com.google.javascript.jscomp.SourceFile";
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      SourceFile.OnDisk sourceFile_OnDisk0 = (SourceFile.OnDisk)SourceFile.fromFile((File) mockFile0);
      assertNotNull(sourceFile_OnDisk0);
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getName());
      
      sourceFile_OnDisk0.clearCachedSource();
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.SourceFile/com.google.javascript.jscomp.SourceFile", sourceFile_OnDisk0.getName());
  }
}

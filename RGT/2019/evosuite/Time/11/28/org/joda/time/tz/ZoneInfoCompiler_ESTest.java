/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 21:34:40 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;


public class ZoneInfoCompiler_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, (-858));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "0y9", 0, 0, 121);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("", "");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-verbose";
      stringArray0[1] = "-verbose";
      stringArray0[2] = "-verbose";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("-", "-");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("JST", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, map0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "JST";
      stringArray0[1] = "JST";
      stringArray0[2] = "-";
      stringArray0[3] = "-";
      stringArray0[4] = "*P{uQiP$B";
      stringArray0[5] = "JST";
      stringArray0[6] = "JST";
      stringArray0[7] = "JST";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = ZoneInfoCompiler.verbose();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("KgdNVw`-*@/M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"KgdNVw`-*@/M\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-dst";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfoCompiler.getLenientISOChronology();
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("-oj:7#r I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -oj:7#r I
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2007));
      hashMap0.put("@3", dateTimeZone0);
      hashMap0.put("G.Fqf;JJ|(R=`", dateTimeZone0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap((DataOutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", 391);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("WPxZfvMW~nm7Zd", 4);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"wpxzfvmw~nm7zd\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("min", (-3796));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("maximum", 3398);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("max", (-1026));
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("only", 1497);
      assertEquals(1497, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-dst");
      assertEquals("-dst", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-7 n:R Ij-nG!");
      assertEquals((-25200000), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("79.5MI`i{#");
      assertEquals(284400000, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('_');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("org.joda.time.base.AbstractPartial", true);
      boolean boolean0 = ZoneInfoCompiler.test("org.joda.time.base.AbstractPartial", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(115);
      boolean boolean0 = ZoneInfoCompiler.test("-verbose", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("[in#+B", "[Zone]\nName: ", (File) null);
      try { 
        zoneInfoCompiler0.compile(file0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /var/folders/_v/6v597zmn4_v31cq2n2x1n4fc0000gn/T/[in#+B0[Zone]
         // Name: 
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, fileArray0);
      assertEquals(0, map0.size());
  }

//  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("Vw<#ERtE>tx", "Vw<#ERtE>tx");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/sophie/Documents/defects4j/tmp/run_evosuite.pl_20380_1561411955");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /Users/sophie/Documents/defects4j/tmp/run_evosuite.pl_20380_1561411955/Vw<#ERtE>tx/Vw<#ERtE>tx
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("JST", false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "JST";
      stringArray0[1] = "JST";
      stringArray0[2] = "-";
      stringArray0[3] = "-";
      stringArray0[4] = "*P{uQiP$B";
      stringArray0[5] = "JST";
      stringArray0[6] = "JST";
      stringArray0[7] = "JST";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("[iMn#+B");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2052);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("[iMn#+B");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2052);
      char[] charArray0 = new char[4];
      stringReader0.read(charArray0);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("-00:00:02.007");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, '\'');
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("9", "+[(i0,sbW#k", false);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }
}

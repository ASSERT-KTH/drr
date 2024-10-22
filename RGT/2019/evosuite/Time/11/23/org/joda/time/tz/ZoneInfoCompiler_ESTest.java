/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 21:24:03 GMT 2019
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;


public class ZoneInfoCompiler_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneInfoCompiler.verbose();
      StringTokenizer stringTokenizer0 = new StringTokenizer("\nFromYear: ", "\nFromYear: ");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
      String string0 = ZoneInfoCompiler.parseOptional("org.joda.time.chrono.GJChronology");
      assertNotNull(string0);
      
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.chrono.GJChronology", 1);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1460), 'w', 1, 0, Integer.MIN_VALUE, true, 3825);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("63(u7S:nhlS#b", 1, 15, 1, '~', 3825, 1, 15, true, Integer.MIN_VALUE);
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder3, "\nFromYear: ", 15, 86400000, (-2741));
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = new ZoneInfoCompiler.DateTimeOfYear();
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-verbose";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("only", "O,=8&gkdz43oj");
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, (File[]) null);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("g$,y.}UV-^g4jb");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"g$,y.}UV-^g4jb\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-?";
      ZoneInfoCompiler.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-src";
      stringArray0[1] = "";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Chronology chronology0 = ZoneInfoCompiler.getLenientISOChronology();
      Chronology chronology1 = ZoneInfoCompiler.getLenientISOChronology();
      assertSame(chronology1, chronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(13);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      hashMap0.put("y|5", dateTimeZone0);
      hashMap0.put("uisI)QoGv\"1(", dateTimeZone0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertEquals(46, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0003\u0000\u0003y|5\u0000\r+00:00:00.013\u0000\fuisI)QoGv\"1(\u0000\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("max", 1156);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("maximum", (-1080986873));
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("", 115);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("-");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("-?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -?
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("-5m2=FU#c{rE4|)");
      assertEquals((-18000000), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("5m2=FU#c{rE4|");
      assertEquals(18000000, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('q');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = ZoneInfoCompiler.test("S[Am(", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("Ziuu5GG3qfF6", true);
      boolean boolean0 = ZoneInfoCompiler.test("Ziuu5GG3qfF6", dateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      ZoneInfoCompiler.test("America/Los_Angeles", dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File file0 = MockFile.createTempFile("NoMillis", ",cwnRdW\u0002>I");
      File[] fileArray0 = new File[4];
      fileArray0[0] = file0;
      fileArray0[1] = file0;
      fileArray0[2] = file0;
      fileArray0[3] = file0;
      try { 
        zoneInfoCompiler0.compile(file0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination is not a directory: /var/folders/_v/6v597zmn4_v31cq2n2x1n4fc0000gn/T/NoMillis0,cwnRdW\u0002>I
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, (File[]) null);
      assertEquals(0, map0.size());
  }

//  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("[Zone]\nName: ", "-?");
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        zoneInfoCompiler0.compile(mockFile0, (File[]) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /Users/sophie/Documents/defects4j/tmp/run_evosuite.pl_19921_1561411315/[Zone]
         // Name: /-?
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

//  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[6];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("  -verbose            Output verbosely (default false)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "  -verbose            Output verbosely (default false)");
      stringArray0[0] = "  -verbose            Output verbosely (default false)";
      stringArray0[1] = "<=";
      stringArray0[2] = "";
      stringArray0[3] = "_qy:GZMiqTD?]XYH";
      stringArray0[4] = "maximum";
      stringArray0[5] = "~iA9b!SU;r&5^p:t T";
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

//  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("A(H4]v6/Pd~em");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "A(H4]v6/Pd~em";
      stringArray0[1] = "`y%h+%`if3bu^jh?";
      stringArray0[2] = "?`}H(rAhHXJno-B!";
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
  public void test38()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader(">0ZT#");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 1);
      zoneInfoCompiler0.parseDataFile(bufferedReader0);
  }
}

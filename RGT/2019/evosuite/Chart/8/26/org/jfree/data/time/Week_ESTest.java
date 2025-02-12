/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 19:40:56 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Hour;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SpreadsheetDate;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class Week_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Week week0 = null;
      try {
        week0 = new Week(mockDate0, (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'zone' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

//  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      week0.hashCode();
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      int int0 = week0.compareTo(week0);
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(0, int0);
  }

//  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      int int0 = week0.getYearValue();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(9345, int0);
  }

//  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      String string0 = week0.toString();
      assertEquals("Week 1, 9345", string0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week();
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertEquals(106748L, regularTimePeriod0.getSerialIndex());
  }

//  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      long long0 = week0.getSerialIndex();
      assertEquals(495286L, long0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      long long0 = week0.getMiddleMillisecond();
      assertEquals(1392409281320L, long0);
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Year year0 = new Year();
      Week week0 = new Week(3172, year0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(106842L, week0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Week week0 = null;
      try {
        week0 = new Week(0, (Year) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Week week0 = null;
      try {
        week0 = new Week((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'time' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Week week0 = null;
      try {
        week0 = new Week(date0, zoneInfo0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'locale' argument.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

//  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-5030L));
      Week week0 = new Week(mockDate0);
      RegularTimePeriod regularTimePeriod0 = week0.previous();
      assertEquals(104409L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      Date date0 = Date.from(instant0);
      Week week0 = new Week(date0);
      assertEquals((-1L), week0.getLastMillisecond());
      assertEquals(104411L, week0.getSerialIndex());
  }

//  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week(595, 595);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertNotNull(regularTimePeriod0);
      
      RegularTimePeriod regularTimePeriod1 = regularTimePeriod0.previous();
      assertEquals(31589L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
      assertNull(regularTimePeriod1);
  }

//  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(495287L, regularTimePeriod0.getSerialIndex());
      assertEquals(1392409281319L, regularTimePeriod0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week(1588, 1588);
      Week week1 = (Week)week0.next();
      assertEquals(53, week1.getWeek());
      assertEquals(1392409281319L, week1.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Week week0 = new Week((-2953), 9999);
      RegularTimePeriod regularTimePeriod0 = week0.next();
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertNull(regularTimePeriod0);
      assertEquals(119, week0.getWeek());
  }

//  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      Week week1 = new Week();
      boolean boolean0 = week0.equals(week1);
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertEquals(7, week1.getWeek());
      assertFalse(boolean0);
  }

//  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2513, (-391), 2581, (-1503), 571);
      Week week0 = new Week(mockDate0);
      boolean boolean0 = week0.equals("");
      assertFalse(boolean0);
      assertEquals(17, week0.getWeek());
      assertEquals(76282885859999L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(25);
      Date date0 = spreadsheetDate0.toDate();
      Week week0 = new Week(date0);
      Week week1 = new Week();
      boolean boolean0 = week0.equals(week1);
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertEquals(7, week1.getWeek());
      assertTrue(boolean0);
  }

//  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Week week0 = new Week(0, 0);
      Week week1 = new Week(0, 1);
      boolean boolean0 = week0.equals(week1);
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertEquals(53L, week1.getSerialIndex());
      assertFalse(boolean0);
  }

//  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(25);
      Date date0 = spreadsheetDate0.toDate();
      Week week0 = new Week(date0);
      int int0 = week0.compareTo(spreadsheetDate0);
      assertEquals(1, int0);
      assertEquals(106749L, week0.getSerialIndex());
      assertEquals(1392409281319L, week0.getLastMillisecond());
  }

//  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Week week0 = new Week(1, 2958465);
      Week week1 = new Week();
      int int0 = week0.compareTo(week1);
      assertEquals(7331, int0);
      assertEquals(495286L, week0.getSerialIndex());
      assertEquals(1392409281319L, week1.getLastMillisecond());
      assertEquals(7, week1.getWeek());
  }

//  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Week week0 = new Week();
      Hour hour0 = new Hour();
      int int0 = week0.compareTo(hour0);
      assertEquals(0, int0);
      assertEquals(1392409281319L, week0.getLastMillisecond());
      assertEquals(7, week0.getWeek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Week week0 = Week.parseWeek((String) null);
      assertNull(week0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("~:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not find separator.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("Week 7, 2014");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the week.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Week.parseWeek("The 'week' argument must be in the range 1 - 53.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't evaluate the year.
         //
         verifyException("org.jfree.data.time.Week", e);
      }
  }
}

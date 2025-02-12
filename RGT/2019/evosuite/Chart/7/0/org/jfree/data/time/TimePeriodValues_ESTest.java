/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 18:06:16 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;


public class TimePeriodValues_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues1.getRangeDescription());
      assertEquals("Time", timePeriodValues1.getDomainDescription());
      assertNotSame(timePeriodValues1, timePeriodValues0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Millisecond millisecond0 = new Millisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(millisecond0, "org.jfree.data.gantt.TaskSeriesCollection", "org.jfree.data.gantt.TaskSeriesCollection");
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(29);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Value", "Value", "Pa");
      Second second0 = new Second();
      Millisecond millisecond0 = new Millisecond((-1), second0);
      timePeriodValues0.add((TimePeriod) millisecond0, (double) 0);
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
      assertEquals(0, timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(integer0);
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Value", "Value", "Pa");
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals("Pa", timePeriodValues0.getRangeDescription());
      assertEquals("Value", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "kS7HLc.}Cx-P%$UrM5A", "Domain");
      // Undeclared exception!
      try { 
        timePeriodValues0.add((TimePeriodValue) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null item not allowed.
         //
         verifyException("org.jfree.data.time.TimePeriodValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      Date date0 = hour0.getEnd();
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(date0);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) regularTimePeriod0, (-839.8234283956));
      timePeriodValues0.add(timePeriodValue0);
      assertEquals(1, timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (Number) 23);
      assertEquals(1, timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      timePeriodValues0.delete(23, (-1975));
      assertEquals(0, timePeriodValues0.getMinStartIndex());
      assertEquals(0, timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, 1, 0, (-2263), 1);
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Minute minute0 = new Minute(mockDate0, timeZone0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0);
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 2767);
      timePeriodValues1.setDomainDescription("");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals("", timePeriodValues1.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Week week0 = new Week(3133, 529);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0, "", "");
      boolean boolean0 = timePeriodValues0.equals("");
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 2767);
      assertTrue(timePeriodValues1.equals((Object)timePeriodValues0));
      
      timePeriodValues0.setDescription("");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 2767);
      timePeriodValues0.setRangeDescription("Time");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals("Time", timePeriodValues0.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 2767);
      timePeriodValues1.add((TimePeriod) hour0, (Number) 23);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues1.getMinStartIndex());
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(1, timePeriodValues0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3239L));
      Hour hour0 = new Hour(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      timePeriodValues1.update(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues0.getMaxStartIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(instant0, (String) null, "");
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3257L));
      Date date0 = Date.from(instant0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", (String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }
}

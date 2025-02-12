/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 18:15:35 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;


public class TimePeriodValues_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "3:;NkdH@U", "3:;NkdH@U");
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("3:;NkdH@U", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("3:;NkdH@U", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Week week0 = new Week(date0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      timePeriodValues1.setDomainDescription("c@Uv+)jIlEzk Gt");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals("c@Uv+)jIlEzk Gt", timePeriodValues1.getDomainDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "3:;NkdH@U", "3:;NkdH@U");
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3538);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(serialDate0);
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "", "");
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(integer0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0);
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2255L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "", "");
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "B&ljxS|", "B&ljxS|");
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
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(integer0, "Time", "Time");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-349L));
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      timePeriodValues0.add((TimePeriod) regularTimePeriod0, (Number) integer0);
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
      
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (Number) integer0);
      assertEquals(1, timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      timePeriodValues0.add((TimePeriod) week0, (Number) 1);
      Instant instant0 = MockInstant.ofEpochMilli(53);
      Date date0 = Date.from(instant0);
      Day day0 = new Day(date0, week0.DEFAULT_TIME_ZONE);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) day0, (-217.603959464));
      timePeriodValues0.add(timePeriodValue0);
      assertEquals(1, timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(integer0, "Time", "Time");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-349L));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (Number) integer0);
      timePeriodValues0.delete(1817, 837);
      assertEquals(0, timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      Minute minute0 = new Minute((-960), hour0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0);
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(23, 23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      timePeriodValues1.add((TimePeriod) fixedMillisecond0, (double) 1);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues1.getMinStartIndex());
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(0L, 0L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "", "");
      Object object0 = new Object();
      boolean boolean0 = timePeriodValues0.equals(object0);
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(mockDate0, mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "3:;NkdH@U", "3:;NkdH@U");
      BigInteger bigInteger0 = BigInteger.ZERO;
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      timePeriodValues1.setKey(bigInteger0);
      Object object0 = timePeriodValues1.clone();
      boolean boolean0 = object0.equals(timePeriodValues0);
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
      assertTrue(object0.equals((Object)timePeriodValues1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2255L));
      ZoneInfo zoneInfo0 = (ZoneInfo)RegularTimePeriod.DEFAULT_TIME_ZONE;
      Hour hour0 = new Hour(mockDate0, zoneInfo0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 181);
      timePeriodValues1.setRangeDescription("Domain");
      boolean boolean0 = timePeriodValues1.equals(timePeriodValues0);
      assertEquals("Domain", timePeriodValues1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertTrue(boolean0);
      assertEquals("Value", timePeriodValues1.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues1.getDomainDescription());
      assertNotSame(timePeriodValues1, timePeriodValues0);
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      timePeriodValues0.add((TimePeriod) week0, (Number) 1);
      assertEquals(0, timePeriodValues0.getMaxMiddleIndex());
      
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      timePeriodValues0.add((TimePeriod) week0, (Number) 1);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      timePeriodValues1.update(0, 53);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(3538);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(serialDate0);
      timePeriodValues0.setDomainDescription((String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      timePeriodValues0.hashCode();
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockDate mockDate0 = new MockDate(919, 919, (-1035), 919, 919, 0);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem((RegularTimePeriod) fixedMillisecond0, (double) 0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(timeSeriesDataItem0, (String) null, (String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }
}

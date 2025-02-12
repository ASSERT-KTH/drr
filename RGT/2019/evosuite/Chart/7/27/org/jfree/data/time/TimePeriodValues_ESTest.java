/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 18:40:27 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyChangeEvent;
import java.net.Proxy;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.Date;
import java.util.SimpleTimeZone;
import javax.swing.plaf.synth.SynthPopupMenuUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.SerialDate;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataItem;
import org.junit.runner.RunWith;


public class TimePeriodValues_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minute minute0 = new Minute();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0, (String) null, "?DSto_RHC4=0");
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("?DSto_RHC4=0", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1517), (-1517), (-1517), (-1517), (-1517), (-1517));
      Quarter quarter0 = new Quarter(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0);
      timePeriodValues0.setDomainDescription("&/B#@_");
      assertEquals("&/B#@_", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) 1669L, (double) 1669L);
      Number number0 = xYDataItem0.getX();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0);
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition((-1146));
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Hour hour0 = new Hour(date0);
      timePeriodValues0.add((TimePeriod) hour0, number0);
      Object object0 = timePeriodValues0.clone();
      boolean boolean0 = timePeriodValues0.equals(object0);
      assertEquals(0, timePeriodValues0.getMaxMiddleIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Month month0 = new Month();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(month0);
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue(32);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 32, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.DIRECT;
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(proxy_Type0);
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Month month0 = new Month();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(month0);
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1517), (-1517), (-1517), (-1517), (-1517), (-1517));
      Quarter quarter0 = new Quarter(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem(596.561920689, Double.NaN);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0, "", "");
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod((-1056));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0, "_#)7b:p=Y~ab{J=}71", "_#)7b:p=Y~ab{J=}71");
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals("_#)7b:p=Y~ab{J=}71", timePeriodValues0.getDomainDescription());
      assertEquals("_#)7b:p=Y~ab{J=}71", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SerialDate serialDate0 = SerialDate.createInstance(60);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(serialDate0, "", "");
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate(732, 274, 87);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(732, "java.util.TimeZone");
      Day day0 = new Day(mockDate0, simpleTimeZone0);
      Hour hour0 = new Hour(732, day0);
      Minute minute0 = new Minute(732, hour0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0);
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
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "P@RtVf ", "P@RtVf ");
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(23, 23);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) simpleTimePeriod0, (Number) hour0.FIRST_HOUR_IN_DAY);
      timePeriodValues0.add(timePeriodValue0);
      assertEquals(1, timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Year year0 = new Year(2773);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "i=l", "Failed to clone.");
      timePeriodValues0.add((TimePeriod) year0, (double) 1882L);
      MockDate mockDate0 = new MockDate(2850, (-340), 2773);
      Week week0 = new Week(mockDate0, year0.DEFAULT_TIME_ZONE);
      timePeriodValues0.add((TimePeriod) week0, (double) 1882L);
      assertEquals(1, timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "P@RtVf ", "P@RtVf ");
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      timePeriodValues0.delete(23, 0);
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-1L), (-1L));
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(simpleTimePeriod0, "+o8Ermvya/NF-<c45P", "+o8Ermvya/NF-<c45P");
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
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "P@RtVf ", "P@RtVf ");
      timePeriodValues0.add((TimePeriod) hour0, (Number) 23);
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      timePeriodValues1.update(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) 1669L, (double) 1669L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0);
      boolean boolean0 = timePeriodValues0.equals(xYDataItem0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYDataItem xYDataItem0 = new XYDataItem((double) 1669L, (double) 1669L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(xYDataItem0);
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition((-1146));
      Date date0 = mockSimpleDateFormat0.parse("", parsePosition0);
      Hour hour0 = new Hour(date0);
      TimePeriodValues timePeriodValues1 = new TimePeriodValues(hour0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals("Value", timePeriodValues1.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals("Time", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("+o8Ermvya/NF-<c45P", "+o8Ermvya/NF-<c45P", "");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("+o8Ermvya/NF-<c45P");
      boolean boolean0 = timePeriodValues1.equals(timePeriodValues0);
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals("+o8Ermvya/NF-<c45P", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("_#)7b:p=Y~ab{J=}71", "_#)7b:p=Y~ab{J=}71", "_#)7b:p=Y~ab{J=}71");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      assertTrue(timePeriodValues1.equals((Object)timePeriodValues0));
      
      timePeriodValues1.setRangeDescription((String) null);
      boolean boolean0 = timePeriodValues1.equals(timePeriodValues0);
      assertFalse(boolean0);
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hour hour0 = new Hour();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "P@RtVf ", "P@RtVf ");
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(23, 23);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) simpleTimePeriod0, (Number) hour0.FIRST_HOUR_IN_DAY);
      timePeriodValues1.add(timePeriodValue0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues1.getMaxEndIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minute minute0 = new Minute();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0, (String) null, "?DSto_RHC4=0");
      SynthPopupMenuUI synthPopupMenuUI0 = new SynthPopupMenuUI();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(synthPopupMenuUI0, "?DSto_RHC4=0", "?DSto_RHC4=0", timePeriodValues0);
      propertyChangeEvent0.toString();
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("?DSto_RHC4=0", timePeriodValues0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, "l ^>2K{.FB8XG:<>/?", (String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("l ^>2K{.FB8XG:<>/?", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 18:27:21 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Quarter;
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
      MockDate mockDate0 = new MockDate(0, 0, 0, (-4587), (-3976), 0);
      Quarter quarter0 = new Quarter(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "Value", "6B");
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals("6B", timePeriodValues0.getRangeDescription());
      assertEquals("Value", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 29, 29, 29);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(122, "Gs.1iG_uuZ9\"WiJ");
      Second second0 = new Second(mockDate0, simpleTimeZone0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "Gs.1iG_uuZ9\"WiJ", "Gs.1iG_uuZ9\"WiJ");
      // Undeclared exception!
      try { 
        timePeriodValues0.getValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 484, 101);
      Day day0 = new Day(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0, "c?vlCr T$89bG*vL", "Time");
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("Time", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("c?vlCr T$89bG*vL", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0, "Y", "Y");
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals("Y", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals("Y", timePeriodValues0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Week week0 = new Week();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0, "}EvTF=+:^gsi", "");
      // Undeclared exception!
      try { 
        timePeriodValues0.getTimePeriod(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Week week0 = new Week(52, 449);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), int0);
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "fof1<4&+cZHy", "Index outside valid range.");
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals("Index outside valid range.", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("fof1<4&+cZHy", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "", "");
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
  public void test09()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "E~]d", "E~]d");
      timePeriodValues0.add((TimePeriod) second0, (double) 59);
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-1962L));
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (double) (-1962L));
      timePeriodValues0.delete(0, 0);
      assertEquals(1, timePeriodValues0.getItemCount());
  }

//  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "&2u+{", "&2u+{");
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      timePeriodValues0.add((TimePeriod) regularTimePeriod0, (Number) 0);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) second0, (Number) 59);
      timePeriodValues0.add(timePeriodValue0);
      assertEquals(0, timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "E~]d", "E~]d");
      timePeriodValues0.add((TimePeriod) second0, (double) 59);
      timePeriodValues0.delete(0, 0);
      assertEquals(0, timePeriodValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, (-171));
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 1500);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (Number) integer0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertFalse(timePeriodValues1.equals((Object)timePeriodValues0));
      assertEquals(0, timePeriodValues0.getMaxMiddleIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Week week0 = new Week(52, 449);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(week0);
      boolean boolean0 = timePeriodValues0.equals("TimeSeries.update(TimePeriod, Number):  period does not exist.");
      assertFalse(boolean0);
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Failed to add cloned item.", "k`O6Xu", "Failed to add cloned item.");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("k`O6Xu", "bON\"#PY^", "ImD-L");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals("ImD-L", timePeriodValues1.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals("bON\"#PY^", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "Range", "Range");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues(second0, "", "");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals("", timePeriodValues1.getRangeDescription());
      assertEquals("", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("Null 'columnKey' argument.");
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy((-2713), (-717));
      timePeriodValues1.setRangeDescription("");
      boolean boolean0 = timePeriodValues1.equals(timePeriodValues0);
      assertEquals("", timePeriodValues1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "&2u+{", "&2u+{");
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) second0, (Number) 59);
      timePeriodValues0.add(timePeriodValue0);
      Object object0 = timePeriodValues0.clone();
      boolean boolean0 = timePeriodValues0.equals(object0);
      assertEquals(1, timePeriodValues0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, "&2u+{", "&2u+{");
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) second0, (Number) 59);
      timePeriodValues0.add(timePeriodValue0);
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      Byte byte0 = new Byte((byte)11);
      timePeriodValues1.update(0, byte0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(1, timePeriodValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate(29, 193, 165, (-1370), 4401);
      Hour hour0 = new Hour(mockDate0);
      Minute minute0 = new Minute((-1), hour0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(minute0);
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      
      timePeriodValues0.setDomainDescription((String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "fof1<4&+cZHy", "Index outside valid range.");
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Index outside valid range.", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("fof1<4&+cZHy", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4162, (-2035), 1276, 0, 4162, 0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(mockGregorianCalendar0, (String) null, (String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 18:11:44 GMT 2019
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;


public class TimePeriodValues_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      int int0 = timePeriodValues0.getMaxMiddleIndex();
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      timePeriodValues0.add((TimePeriod) day0, Double.NEGATIVE_INFINITY);
      TimePeriodValues timePeriodValues1 = (TimePeriodValues)timePeriodValues0.clone();
      TimePeriodValue timePeriodValue0 = timePeriodValues1.getDataItem(0);
      timePeriodValues1.add(timePeriodValue0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(1, timePeriodValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
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
  public void test03()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, (String) null, (String) null);
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (Number) null);
      assertEquals(0, timePeriodValues0.getMaxStartIndex());
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Second second0 = new Second();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(second0, (String) null, "Domain");
      int int0 = timePeriodValues0.getMinEndIndex();
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("Domain", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      Year year0 = new Year(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(year0, "{", "{");
      int int0 = timePeriodValues0.getMaxStartIndex();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("{", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), int0);
      assertEquals("{", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      int int0 = timePeriodValues0.getMinStartIndex();
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Month month0 = new Month();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(month0, "5P", "Null item not allowed.");
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
  public void test08()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(701L);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      int int0 = timePeriodValues0.getMaxEndIndex();
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      int int0 = timePeriodValues0.getMinMiddleIndex();
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), int0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimePeriodValues timePeriodValues0 = new TimePeriodValues("", "", "P=Wl4U^a[A$[},.T");
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
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(701L);
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.next();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) regularTimePeriod0, (double) 701L);
      timePeriodValues0.add(timePeriodValue0);
      timePeriodValues0.add((TimePeriod) fixedMillisecond0, (double) 701L);
      assertEquals(1, timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      MockDate mockDate0 = new MockDate(0, 0, 0, (-2878), 3190);
      Year year0 = new Year(mockDate0, day0.DEFAULT_TIME_ZONE);
      timePeriodValues0.add((TimePeriod) year0, (double) (-2878));
      timePeriodValues0.add((TimePeriod) day0, 0.0);
      assertEquals(1, timePeriodValues0.getMaxEndIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "Mya@;z?q.u3G3", "Mya@;z?q.u3G3");
      timePeriodValues0.add((TimePeriod) quarter0, (double) (-274));
      timePeriodValues0.delete(4, (-274));
      assertEquals(0, timePeriodValues0.getMaxEndIndex());
      assertEquals(0, timePeriodValues0.getMaxMiddleIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, (String) null, (String) null);
      // Undeclared exception!
      try { 
        timePeriodValues0.delete(29, 29);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 29, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(fixedMillisecond0, (String) null, (String) null);
      TimePeriodValue timePeriodValue0 = new TimePeriodValue((TimePeriod) fixedMillisecond0, 0.0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValue0);
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Hour hour0 = new Hour(mockDate0);
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(hour0, "", "");
      TimePeriodValues timePeriodValues1 = new TimePeriodValues("");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals("", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals("", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues1.getRangeDescription());
      assertEquals("Time", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertFalse(boolean0);
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      TimePeriodValues timePeriodValues1 = new TimePeriodValues(day0, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "org.jfree.data.statistics.DefaultMultiValueCategoryDataset");
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals((-1), timePeriodValues1.getMaxStartIndex());
      assertEquals("Time", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMaxEndIndex());
      assertEquals((-1), timePeriodValues1.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues1.getMaxMiddleIndex());
      assertEquals("org.jfree.data.statistics.DefaultMultiValueCategoryDataset", timePeriodValues1.getDomainDescription());
      assertEquals((-1), timePeriodValues1.getMinStartIndex());
      assertEquals((-1), timePeriodValues1.getMinEndIndex());
      assertEquals("Value", timePeriodValues0.getRangeDescription());
      assertEquals("org.jfree.data.statistics.DefaultMultiValueCategoryDataset", timePeriodValues1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      Object object0 = timePeriodValues0.clone();
      timePeriodValues0.setRangeDescription("oDdnd,");
      boolean boolean0 = timePeriodValues0.equals(object0);
      assertEquals("oDdnd,", timePeriodValues0.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      timePeriodValues0.add((TimePeriod) day0, Double.NEGATIVE_INFINITY);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(0, timePeriodValues0.getMinMiddleIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Day day0 = new Day();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(day0);
      timePeriodValues0.add((TimePeriod) day0, Double.NEGATIVE_INFINITY);
      TimePeriodValues timePeriodValues1 = timePeriodValues0.createCopy(0, 0);
      Float float0 = new Float((float) 0);
      timePeriodValues1.update(0, float0);
      boolean boolean0 = timePeriodValues0.equals(timePeriodValues1);
      assertEquals(1, timePeriodValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "Mya@;z?q.u3G3", (String) null);
      assertEquals("Mya@;z?q.u3G3", timePeriodValues0.getDomainDescription());
      
      timePeriodValues0.setDomainDescription((String) null);
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals((-1), timePeriodValues0.getMinEndIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      TimePeriodValues timePeriodValues0 = new TimePeriodValues(quarter0, "Mya@;z?q.u3G3", "Mya@;z?q.u3G3");
      timePeriodValues0.hashCode();
      assertEquals((-1), timePeriodValues0.getMaxEndIndex());
      assertEquals((-1), timePeriodValues0.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues0.getMinStartIndex());
      assertEquals("Mya@;z?q.u3G3", timePeriodValues0.getDomainDescription());
      assertEquals((-1), timePeriodValues0.getMaxMiddleIndex());
      assertEquals("Mya@;z?q.u3G3", timePeriodValues0.getRangeDescription());
      assertEquals((-1), timePeriodValues0.getMaxStartIndex());
  }
}

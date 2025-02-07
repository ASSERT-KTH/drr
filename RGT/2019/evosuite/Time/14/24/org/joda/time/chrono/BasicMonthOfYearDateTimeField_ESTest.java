/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 22:29:42 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;


public class BasicMonthOfYearDateTimeField_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.remainder((-149L));
      assertEquals(2678399851L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getLeapDurationField();
      assertEquals("days", durationField0.getName());
  }

//  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[4];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, 0, intArray0, 3);
      assertEquals(13, gJMonthOfYearDateTimeField0.getMaximumValue());
      assertArrayEquals(new int[] {5, 1, 0, 0}, intArray1);
      assertEquals(1, gJMonthOfYearDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 1);
      boolean boolean0 = basicMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 1);
      long long0 = basicMonthOfYearDateTimeField0.addWrapField(0L, 12);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 1);
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      int[] intArray0 = buddhistChronology0.get((ReadablePartial) localDate0, 2687L);
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) localDate0, 396, intArray0, 3111);
      assertArrayEquals(new int[] {2772, 3, 31}, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, 12825000);
      long long0 = basicMonthOfYearDateTimeField0.add(1316L, 0);
      assertEquals(1316L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 0);
      long long0 = basicMonthOfYearDateTimeField0.add(0L, (-779L));
      assertEquals((-2048544000000L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, (-80));
      long long0 = basicMonthOfYearDateTimeField0.add((long) (-80), (long) (-80));
      assertEquals((-210556800080L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add(1422L, (-42521587200000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -42521587200000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((long) 1, 100000000000L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 100000000000
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add(0L, (-21081597322L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -21081597322
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0, 7);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, 1298);
      long long0 = basicMonthOfYearDateTimeField0.add((long) 7, 2629746000L);
      assertEquals(6915706030800000007L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      long long0 = gJMonthOfYearDateTimeField0.add((-1471L), 2629746011L);
      assertEquals(6915564053395198529L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[9];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 3361, intArray0, 0);
      assertEquals(9, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      Partial partial0 = new Partial();
      int[] intArray0 = new int[9];
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, 3361, intArray0, 3361);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, 1, intArray0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,13]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      long long0 = gJMonthOfYearDateTimeField0.getDifferenceAsLong(1, 1814400001L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, (-80));
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong((-80), (-80));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      long long0 = gJMonthOfYearDateTimeField0.set((long) (-1426), 6);
      assertEquals((-15897601426L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount((-2322L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount((-12219292800000L));
      assertEquals(1, int0);
  }
}

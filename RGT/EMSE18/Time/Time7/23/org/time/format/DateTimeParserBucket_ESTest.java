/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 19:09:35 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

public class DateTimeParserBucket_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ITALIAN;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) iSOChronology0, dateTimeField0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "ISOChronology[UTC]", locale0);
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(skipUndoDateTimeField0, 462);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set(2301L, true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1216L, (Chronology) null, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1002L, (-1), (-1));
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2015L), (Chronology) iSOChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRENCH;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(574L, (Chronology) buddhistChronology0, locale0, integer0, 1);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      Integer integer0 = new Integer((-10));
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1820L), (Chronology) julianChronology0, locale0, integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-10), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-44L), (Chronology) ethiopicChronology0, (Locale) null, (Integer) 1, (-1783));
      Integer integer0 = new Integer((-1783));
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals((-1783), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(30);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) gJChronology0, locale0, integer0, 30);
      dateTimeParserBucket0.setOffset((Integer) 1);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(islamicChronology0);
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(2146L, (Chronology) strictChronology0, locale0, (Integer) islamicChronology0.AH, 3181);
      dateTimeParserBucket0.setOffset((Integer) islamicChronology0.AH);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = new Locale("*Uo=0");
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) julianChronology0, locale0, integer0);
      long long0 = dateTimeParserBucket0.computeMillis(false, "*Uo=0");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) cachedDateTimeZone0);
      BuddhistChronology buddhistChronology1 = (BuddhistChronology)buddhistChronology0.withUTC();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) buddhistChronology1, locale0, (Integer) buddhistChronology0.BE, (-2351));
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Locale locale0 = Locale.US;
      Integer integer0 = Integer.valueOf(454);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(16123L, (Chronology) gregorianChronology0, locale0, integer0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(16123L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-345L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(359L, (Chronology) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "y-,{pm`!^^", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      Integer integer0 = new Integer(0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) julianChronology0, locale0, integer0, 0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockZone mockZone0 = new MockZone(498L, 34, 34);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 34 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "yCTE4L$cI-G0]\" ", locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField1 = buddhistChronology0.secondOfDay();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, (-1));
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setOffset((-1691));
      long long0 = dateTimeParserBucket0.computeMillis(false, "");
      assertEquals(-1691, dateTimeParserBucket0.getOffset());
      assertEquals(1347L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1998L, (Chronology) buddhistChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals((-3598002L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 34, 34);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      long long0 = dateTimeParserBucket0.computeMillis(false, "");
      assertEquals(1209513565966L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1067L, (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "*y=IDl3l#", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"4\": Value \"*y=IDl3l#\" for yearOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1686L), (Chronology) buddhistChronology0, locale0, (Integer) 1, (-3480));
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-612L), (Chronology) null, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      DurationField durationField0 = buddhistChronology0.halfdays();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      DurationField durationField0 = buddhistChronology0.days();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 34, 34);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState((DateTimeParserBucket) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 34, 34);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(1209513565966L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MockZone mockZone0 = new MockZone(0L, (-1), 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, mockZone0);
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) zonedChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "S}h_h[:Qf||HF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"S}h_h[:Qf||HF\": Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MockZone mockZone0 = new MockZone(0L, (-1), 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, mockZone0);
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) zonedChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-44L), (Chronology) ethiopicChronology0, (Locale) null, (Integer) 1, (-1783));
      dateTimeParserBucket0.setOffset((Integer) ethiopicChronology0.EE);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals((-45L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      dateTimeParserBucket0.saveField(dateTimeField0, (-985));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Value -985 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1002L, (-1), (-1));
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2015L), (Chronology) iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 34, 34);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 34);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(1209340765966L, long0);
      
      long long1 = dateTimeParserBucket0.computeMillis(true, "");
      assertEquals(1209340765966L, long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "{mKcG9:~v_h*1", locale0);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(false, "");
      assertEquals((-345L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1686L), (Chronology) buddhistChronology0, locale0, (Integer) 1, (-3480));
      Object object0 = new Object();
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      dateTimeParserBucket0.saveField(dateTimeField0, (-985));
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.saveField(dateTimeField0, 693);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1686L), (Chronology) buddhistChronology0, locale0, (Integer) 1, (-3480));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.setPivotYear((Integer) 1);
      assertEquals(0, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      Integer integer0 = new Integer(30);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) gJChronology0, locale0, integer0, 30);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("", locale1.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-344L), (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setOffset((-1691));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-1691), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, locale0, (Integer) ethiopicChronology0.EE, 1424);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1686L), (Chronology) buddhistChronology0, locale0, (Integer) 1, (-3480));
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) iSOChronology0, locale0);
      ISOChronology iSOChronology1 = (ISOChronology)dateTimeParserBucket0.getChronology();
      assertSame(iSOChronology1, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1686L), (Chronology) buddhistChronology0, locale0, (Integer) 1, (-3480));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(9901346400000L, long0);
  }
}

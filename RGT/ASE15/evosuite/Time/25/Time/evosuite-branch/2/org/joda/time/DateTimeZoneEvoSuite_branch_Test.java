/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:57:48 GMT 2014
 */

package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

 
public class DateTimeZoneEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      long long0 = 0L;
      LocalDateTime localDateTime0 = new LocalDateTime(long0);
      assertNotNull(localDateTime0);
      assertEquals(4, localDateTime0.size());
      
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals(4, localDateTime0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "DurationField[";
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertNotNull(zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone dateTimeZone0 = uTCProvider0.getZone(string0);
      assertNull(dateTimeZone0);
      
      long long0 = 0L;
      long long1 = fixedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals((-3600000L), long1);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      int int0 = 27;
      long long0 = cachedDateTimeZone0.getMillisKeepLocal((DateTimeZone) cachedDateTimeZone0, (long) int0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(27L, long0);
  }

  //@Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = null;
      DateTime dateTime0 = new DateTime(object0);
      assertNotNull(dateTime0);
      assertEquals(1392409281320L, dateTime0.getMillis());
      
      int int0 = 4;
      DateTime dateTime1 = dateTime0.withCenturyOfEra(int0);
      assertNotNull(dateTime1);
      assertNotSame(dateTime1, dateTime0);
      assertNotSame(dateTime0, dateTime1);
      assertFalse(dateTime1.equals((Object)dateTime0));
      assertFalse(dateTime0.equals((Object)dateTime1));
      assertEquals((-49098713843680L), dateTime1.getMillis());
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  //@Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = 9223372036854775784L;
      DateMidnight dateMidnight0 = null;
      try {
        dateMidnight0 = new DateMidnight(long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
      }
  }

  //@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Chronology chronology0 = null;
      String string0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      LocalDateTime localDateTime0 = new LocalDateTime((Object) chronology0, (DateTimeZone) cachedDateTimeZone0);
      assertNotNull(localDateTime0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(4, localDateTime0.size());
      
      boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(4, localDateTime0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      
      long long0 = 0L;
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset(long0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertTrue(boolean0);
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      int int0 = 27;
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset((long) int0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      ReadableInstant readableInstant0 = null;
      int int0 = cachedDateTimeZone0.getOffset(readableInstant0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      long long0 = 0L;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertNotNull(gregorianChronology0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      DateMidnight dateMidnight0 = new DateMidnight(long0, (Chronology) gregorianChronology0);
      assertNotNull(dateMidnight0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      int int0 = fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = (-1288);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-00:00:01.288", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.getID());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      
      String string0 = fixedDateTimeZone0.getName((long) int0, locale0);
      assertNotNull(string0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.getID());
      assertEquals("-00:00:01.288", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-1288);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-00:00:01.288", fixedDateTimeZone0.getID());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      boolean boolean0 = true;
      long long0 = fixedDateTimeZone0.convertLocalToUTC((long) int0, boolean0);
      assertEquals("-00:00:01.288", fixedDateTimeZone0.getID());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(0L, long0);
      
      String string0 = fixedDateTimeZone0.getShortName(long0);
      assertNotNull(string0);
      assertEquals("-00:00:01.288", fixedDateTimeZone0.getID());
      assertEquals("-00:00:01.288", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.288", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      long long0 = 0L;
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      
      String string0 = fixedDateTimeZone0.getShortName(long0, locale0);
      assertNotNull(string0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = (-15);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-15:00", fixedDateTimeZone0.getID());
      assertEquals("-15:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      String string0 = fixedDateTimeZone0.getID();
      assertNotNull(string0);
      assertEquals("-15:00", fixedDateTimeZone0.getID());
      assertEquals("-15:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-15:00", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertEquals("-15:00", fixedDateTimeZone0.getID());
      assertEquals("-15:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-15:00", fixedDateTimeZone1.toString());
      assertEquals("-15:00", fixedDateTimeZone1.getID());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      
      ZoneInfo zoneInfo0 = (ZoneInfo)fixedDateTimeZone0.toTimeZone();
      assertNotNull(zoneInfo0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertEquals("-15:00", fixedDateTimeZone0.getID());
      assertEquals("-15:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("GMT-15:00", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone2 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone2);
      assertSame(fixedDateTimeZone2, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone2, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone2);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertEquals("-15:00", fixedDateTimeZone2.getID());
      assertEquals("-15:00", fixedDateTimeZone2.toString());
      assertEquals(true, fixedDateTimeZone2.isFixed());
      assertEquals("-15:00", fixedDateTimeZone0.getID());
      assertEquals("-15:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("GMT-15:00", zoneInfo0.getID());
  }

  //@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      long long0 = (-42521587200009L);
      String string0 = cachedDateTimeZone0.getName(long0);
      assertNotNull(string0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("-00:01:15", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "DurationField[";
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertNotNull(zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals("GMT", zoneInfo0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NameProvider nameProvider0 = null;
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = (DefaultNameProvider)DateTimeZone.getNameProvider();
      assertNotNull(defaultNameProvider0);
      
      DateTimeZone.setNameProvider((NameProvider) defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Provider provider0 = null;
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 8;
      String string0 = "-o";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(int0, string0);
      assertNotNull(simpleTimeZone0);
      assertEquals("java.util.SimpleTimeZone[id=-o,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals("-o", simpleTimeZone0.getID());
      assertEquals(8, simpleTimeZone0.getRawOffset());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("java.util.SimpleTimeZone[id=-o,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals("-o", simpleTimeZone0.getID());
      assertEquals(8, simpleTimeZone0.getRawOffset());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "Europe/London";
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertNotNull(zoneInfo0);
      assertEquals("Europe/London", zoneInfo0.getID());
      
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone.setProvider((Provider) uTCProvider0);
      // Undeclared exception!
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Europe/London' is not recognised
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      
      long long0 = (-1655L);
      String string0 = fixedDateTimeZone0.getShortName(long0);
      assertNotNull(string0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", string0);
      
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone(string0);
      assertNotNull(zoneInfo0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals("UTC", zoneInfo0.getID());
  }

  //@Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forTimeZone(timeZone0);
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = (-10);
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -10
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 0;
      int int1 = 803;
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 803
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(int0, int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "-00:00:00.00";
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      
      long long0 = (-9223372036854775787L);
      String string0 = fixedDateTimeZone0.getNameKey(long0);
      assertNotNull(string0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      // Undeclared exception!
      try {
        DateTimeZone.setDefault(dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
      }
  }

  //@Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      DateTimeZone.setDefault((DateTimeZone) cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone.setProvider((Provider) uTCProvider0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assertNotNull(iSOChronology0);
  }

  //@Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      CachedDateTimeZone cachedDateTimeZone1 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone1);
      assertSame(cachedDateTimeZone1, cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone1.toString());
      assertEquals("Europe/London", cachedDateTimeZone1.getID());
      assertEquals(false, cachedDateTimeZone1.isFixed());
  }

  @Test(timeout = 4000)
  public void test33() {}
//   @Test(timeout = 4000)
//   public void test33()  throws Throwable  {
//       CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
//       assertNotNull(cachedDateTimeZone0);
//       assertEquals(false, cachedDateTimeZone0.isFixed());
//       assertEquals("Europe/London", cachedDateTimeZone0.getID());
//       assertEquals("Europe/London", cachedDateTimeZone0.toString());
//       
//       int int0 = 27;
//       String string0 = cachedDateTimeZone0.getName((long) int0);
//       assertNotNull(string0);
//       assertEquals(false, cachedDateTimeZone0.isFixed());
//       assertEquals("Europe/London", cachedDateTimeZone0.getID());
//       assertEquals("Europe/London", cachedDateTimeZone0.toString());
//       assertEquals("\u82F1\u56FD\u590F\u6642\u9593", string0);
//   }

  //@Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      ZoneInfo zoneInfo0 = (ZoneInfo)cachedDateTimeZone0.toTimeZone();
      assertNotNull(zoneInfo0);
      assertEquals("Europe/London", zoneInfo0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "+CDST";
      // Undeclared exception!
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forID(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+CDST\" is malformed at \"CDST\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test36() {}
//   @Test(timeout = 4000)
//   public void test36()  throws Throwable  {
//       Set<String> set0 = DateTimeZone.getAvailableIDs();
//       assertNotNull(set0);
//       assertEquals(567, set0.size());
//       assertEquals(false, set0.isEmpty());
//   }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 27;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("+27:00", fixedDateTimeZone0.getID());
      assertEquals("+27:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
  }

  //@Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      String string0 = cachedDateTimeZone0.toString();
      assertNotNull(string0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", string0);
  }

  @Test(timeout = 4000)
  public void test39() {}
//   @Test(timeout = 4000)
//   public void test39()  throws Throwable  {
//       ZoneInfoProvider zoneInfoProvider0 = (ZoneInfoProvider)DateTimeZone.getProvider();
//       assertNotNull(zoneInfoProvider0);
//   }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      Object object0 = fixedDateTimeZone0.writeReplace();
      assertNotNull(object0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
  }
}

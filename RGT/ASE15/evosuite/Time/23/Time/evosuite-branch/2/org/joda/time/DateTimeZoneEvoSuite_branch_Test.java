/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:57:54 GMT 2014
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

import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
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
      int int0 = (-1979);
      String string0 = "y,:QL";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(int0, string0);
      assertNotNull(simpleTimeZone0);
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      
      boolean boolean0 = true;
      long long0 = fixedDateTimeZone0.adjustOffset((long) int0, boolean0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals((-1979L), long0);
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      long long0 = (-42521587200016L);
      long long1 = cachedDateTimeZone0.adjustOffset(long0, boolean0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals((-42521587200016L), long1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      assertNotNull(zoneInfo0);
      assertEquals("GMT", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertNotNull(localDateTime0);
      assertEquals(4, localDateTime0.size());
      
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("GMT", zoneInfo0.getID());
      assertEquals(4, localDateTime0.size());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      boolean boolean0 = cachedDateTimeZone0.isFixed();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertFalse(boolean0);
      
      long long0 = 0L;
      long long1 = cachedDateTimeZone0.convertLocalToUTC(long0, boolean0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals((-3600000L), long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = (-2041L);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      //  // Unstable assertion: assertNotNull(cachedDateTimeZone0);
      //  // Unstable assertion: assertEquals(false, cachedDateTimeZone0.isFixed());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.toString());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      DateMidnight dateMidnight0 = new DateMidnight(long0, (DateTimeZone) cachedDateTimeZone0);
      //  // Unstable assertion: assertNotNull(dateMidnight0);
      //  // Unstable assertion: assertEquals(false, cachedDateTimeZone0.isFixed());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.toString());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.getID());
      //  // Unstable assertion: assertEquals((-3600000L), dateMidnight0.getMillis());
      
      int int0 = 60000;
      DateMidnight dateMidnight1 = dateMidnight0.withYear(int0);
      //  // Unstable assertion: assertNotSame(dateMidnight1, dateMidnight0);
      //  // Unstable assertion: assertNotSame(dateMidnight0, dateMidnight1);
      //  // Unstable assertion: assertNotNull(dateMidnight1);
      //  // Unstable assertion: assertEquals(1831249900800000L, dateMidnight1.getMillis());
      //  // Unstable assertion: assertEquals(false, cachedDateTimeZone0.isFixed());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.toString());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.getID());
      //  // Unstable assertion: assertEquals((-3600000L), dateMidnight0.getMillis());
      //  // Unstable assertion: assertFalse(dateMidnight1.equals((Object)dateMidnight0));
      //  // Unstable assertion: assertFalse(dateMidnight0.equals((Object)dateMidnight1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = 9223372036854775807L;
      DateTimeZone dateTimeZone0 = null;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      //  // Unstable assertion: assertNotNull(buddhistChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)buddhistChronology0.getZone();
      //  // Unstable assertion: assertNotNull(cachedDateTimeZone0);
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.getID());
      //  // Unstable assertion: assertEquals("Europe/London", cachedDateTimeZone0.toString());
      //  // Unstable assertion: assertEquals(false, cachedDateTimeZone0.isFixed());
      
      // Undeclared exception!
      try {
        long long1 = cachedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, long0);
       //  fail("Expecting exception: ArithmeticException");
       // Unstable assertion
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
      }
  }

  //@Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertNotNull(localDateTime0);
      assertEquals(4, localDateTime0.size());
      
      boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals(4, localDateTime0.size());
      assertFalse(boolean0);
  }

  //@Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = 1999L;
      LocalDate localDate0 = new LocalDate(long0);
      assertNotNull(localDate0);
      assertEquals(3, localDate0.size());
      
      int int0 = 1465;
      LocalDate localDate1 = localDate0.minusMonths(int0);
      assertNotSame(localDate0, localDate1);
      assertNotSame(localDate1, localDate0);
      assertNotNull(localDate1);
      assertEquals(3, localDate0.size());
      assertEquals(3, localDate1.size());
      assertFalse(localDate0.equals((Object)localDate1));
      assertFalse(localDate1.equals((Object)localDate0));
      
      // Undeclared exception!
      try {
        DateMidnight dateMidnight0 = localDate1.toDateMidnight();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition: 1847-12-01T00:01:15.000
         //
      }
  }

  //@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      long long0 = 30585600006L;
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(long0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(3600000, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 92;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("+00:00:00.092", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.getID());
      
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset((long) int0);
      assertEquals("+00:00:00.092", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.getID());
      assertTrue(boolean0);
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      int int0 = 60000;
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset((long) int0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      ReadableInstant readableInstant0 = null;
      int int1 = fixedDateTimeZone0.getOffset(readableInstant0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  //@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = 10799993L;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      DateMidnight dateMidnight0 = new DateMidnight(long0);
      assertNotNull(dateMidnight0);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      
      int int0 = fixedDateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13() {}
//   @Test(timeout = 4000)
//   public void test13()  throws Throwable  {
//       long long0 = 10799993L;
//       FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
//       assertNotNull(fixedDateTimeZone0);
//       assertEquals("UTC", fixedDateTimeZone0.toString());
//       assertEquals(true, fixedDateTimeZone0.isFixed());
//       assertEquals("UTC", fixedDateTimeZone0.getID());
//       
//       String string0 = fixedDateTimeZone0.getName(long0);
//       assertNotNull(string0);
//       assertEquals("UTC", fixedDateTimeZone0.toString());
//       assertEquals(true, fixedDateTimeZone0.isFixed());
//       assertEquals("UTC", fixedDateTimeZone0.getID());
//       assertEquals("Koordinierte Universalzeit", string0);
//   }

  //@Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      long long0 = (-12219292799970L);
      Locale locale0 = Locale.GERMAN;
      assertNotNull(locale0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      
      String string0 = cachedDateTimeZone0.getName(long0, locale0);
      assertNotNull(string0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("-00:01:15", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = 10799993L;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      String string0 = fixedDateTimeZone0.getShortName(long0);
      assertNotNull(string0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 159;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("+159:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+159:00", fixedDateTimeZone0.getID());
      
      Locale locale0 = Locale.PRC;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      
      String string0 = fixedDateTimeZone0.getShortName((long) int0, locale0);
      assertNotNull(string0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("+159:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+159:00", fixedDateTimeZone0.getID());
      assertEquals("+159:00", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = (-1979);
      String string0 = "y,:QL";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(int0, string0);
      assertNotNull(simpleTimeZone0);
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertNotNull(fixedDateTimeZone1);
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("y,:QL", simpleTimeZone0.getID());
      assertEquals(-1979, simpleTimeZone0.getRawOffset());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals("java.util.SimpleTimeZone[id=y,:QL,offset=-1979,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      DateTimeZone.setNameProvider((NameProvider) defaultNameProvider0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NameProvider nameProvider0 = null;
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Provider provider0 = null;
      DateTimeZone.setProvider(provider0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = (-5);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-05:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-05:00", fixedDateTimeZone0.getID());
      
      ZoneInfo zoneInfo0 = (ZoneInfo)fixedDateTimeZone0.toTimeZone();
      assertNotNull(zoneInfo0);
      assertEquals("-05:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-05:00", fixedDateTimeZone0.getID());
      assertEquals("GMT-05:00", zoneInfo0.getID());
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertNotNull(fixedDateTimeZone1);
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("-05:00", fixedDateTimeZone1.toString());
      assertEquals("-05:00", fixedDateTimeZone1.getID());
      assertEquals("-05:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-05:00", fixedDateTimeZone0.getID());
      assertEquals("GMT-05:00", zoneInfo0.getID());
  }

  //@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone.setProvider((Provider) uTCProvider0);
      ZoneInfo zoneInfo0 = (ZoneInfo)cachedDateTimeZone0.toTimeZone();
      assertNotNull(zoneInfo0);
      assertEquals("Europe/London", zoneInfo0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
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
  public void test23()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)fixedDateTimeZone0.toTimeZone();
      assertNotNull(simpleTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals("UTC", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertNotNull(fixedDateTimeZone1);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals("UTC", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = (-117);
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -117
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 0;
      int int1 = 3710;
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 3710
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = (-28L);
      int int0 = (-1);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("-00:00:00.001", fixedDateTimeZone0.toString());
      assertEquals("-00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      String string0 = fixedDateTimeZone0.getName(long0);
      assertNotNull(string0);
      assertEquals("-00:00:00.001", fixedDateTimeZone0.toString());
      assertEquals("-00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:00.001", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertNotNull(fixedDateTimeZone1);
      assertEquals("-00:00:00.001", fixedDateTimeZone0.toString());
      assertEquals("-00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:00.001", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("-00:00:00.001", fixedDateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = 62035199978L;
      int int0 = 92;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.getID());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.toString());
      
      String string0 = fixedDateTimeZone0.getName(long0);
      assertNotNull(string0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.getID());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.toString());
      assertEquals("+00:00:00.092", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertNotNull(fixedDateTimeZone1);
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone1.toString());
      assertEquals("+00:00:00.092", fixedDateTimeZone1.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.getID());
      assertEquals("+00:00:00.092", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "UTC";
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
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
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      DateTimeZone.setDefault((DateTimeZone) cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
  }

  //@Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      
      TimeZone timeZone0 = null;
      CachedDateTimeZone cachedDateTimeZone1 = (CachedDateTimeZone)DateTimeZone.forTimeZone(timeZone0);
      assertSame(cachedDateTimeZone1, cachedDateTimeZone0);
      assertNotNull(cachedDateTimeZone1);
      assertEquals(false, cachedDateTimeZone1.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone1.toString());
      assertEquals("Europe/London", cachedDateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test32() {}
//   @Test(timeout = 4000)
//   public void test32()  throws Throwable  {
//       Set<String> set0 = DateTimeZone.getAvailableIDs();
//       assertNotNull(set0);
//       assertEquals(false, set0.isEmpty());
//       assertEquals(567, set0.size());
//   }

  //@Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      String string0 = cachedDateTimeZone0.toString();
      assertNotNull(string0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", string0);
  }

  @Test(timeout = 4000)
  public void test34() {}
//   @Test(timeout = 4000)
//   public void test34()  throws Throwable  {
//       ZoneInfoProvider zoneInfoProvider0 = (ZoneInfoProvider)DateTimeZone.getProvider();
//       assertNotNull(zoneInfoProvider0);
//   }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = (DefaultNameProvider)DateTimeZone.getNameProvider();
      assertNotNull(defaultNameProvider0);
  }

  //@Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      
      long long0 = (-42521587200016L);
      String string0 = cachedDateTimeZone0.getShortName(long0);
      assertNotNull(string0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("-00:01:15", string0);
  }

  //@Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertNotNull(cachedDateTimeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      
      Object object0 = cachedDateTimeZone0.writeReplace();
      assertNotNull(object0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 10:17:39 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;


public class FastDateFormat_ESTest {

//  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.UK;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 1, locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer("Friday, 14 February 2014");
      fastDateFormat0.format(date0, stringBuffer0);
      assertEquals("Friday, 14 February 201415/10/82 00:00:00 GMT", stringBuffer0.toString());
      assertEquals(45, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance((-401), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -401
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[EEEE, MMMM d, yyyy]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      fastDateFormat0.getTimeZoneOverridesCalendar();
      assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TwoDigitMonthField");
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, (Locale) null);
      TimeZone timeZone1 = fastDateFormat0.getTimeZone();
      assertSame(timeZone1, timeZone0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

//  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((long) 1, stringBuffer0);
      assertEquals("1/1/70 12:00 AM", stringBuffer0.toString());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("dBOOvY2jx6Xpa", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Friday, 14 February 2014", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance((-2456), timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style -2456
         //
         verifyException("java.text.DateFormat", e);
      }
  }

//  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      Locale locale0 = fastDateFormat0.getLocale();
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      assertEquals("h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(",:Z", (TimeZone) null);
      fastDateFormat0.parsePattern();
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat(",:Z", dateFormatSymbols0);
      DateFormat.getTimeInstance();
      String[] stringArray0 = new String[1];
      Locale locale0 = Locale.KOREAN;
      DateFormatSymbols.getInstance(locale0);
      stringArray0[0] = ",:Z";
      dateFormatSymbols0.setWeekdays(stringArray0);
      ParsePosition parsePosition0 = new ParsePosition((-1));
      // Undeclared exception!
      try { 
        mockSimpleDateFormat0.parse(",:Z", parsePosition0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.UK;
      locale0.getUnicodeLocaleKeys();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ParsePosition parsePosition0 = new ParsePosition(0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer("k");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      mockSimpleDateFormat0.format(date0, stringBuffer0, fieldPosition0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k");
      fastDateFormat0.parsePattern();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      assertEquals(30, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "Illegal pattern component: ");
      Locale locale0 = Locale.CANADA;
      Locale locale1 = Locale.ITALIAN;
      locale0.getDisplayCountry(locale1);
      simpleTimeZone0.observesDaylightTime();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) simpleTimeZone0, locale0);
      fastDateFormat0.getPattern();
      ParsePosition parsePosition0 = new ParsePosition(3);
      fastDateFormat0.parseObject("h:mm:ss 'o''clock' a z", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      
      fastDateFormat0.format((long) 0);
      Locale locale2 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0, locale2);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = fastDateFormat0.format(date0, stringBuffer0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 3);
      fastDateFormat0.format((Object) date0, stringBuffer1, fieldPosition0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2611, 1430, 3588, 0, 3);
      mockGregorianCalendar1.getCalendarType();
      fastDateFormat0.format((Calendar) mockGregorianCalendar1);
      String string0 = fastDateFormat0.format((long) 2611);
      assertEquals("12:00:02 o'clock AM GMT+00:00", string0);
  }

//  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("10/15/82 12:00 AM", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = new DateFormatSymbols();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("<$zZ", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Czn", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("a~D@P8.&vs>=S5o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("I", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<-~<Jym{dk~J[?I`?A+", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">6Kn^0i%(Yq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = new Locale("The validated collection contains null element at index: ", "EEEE, MMMM d, yyyy h:mm:ss a z", "[");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Lh4Wu06", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("EEEE, MMMM d, yyyy h:mm:ss a z", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("No date pattern for locale: ", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("OfJ5AS^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("QP", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("R", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S-q7-I}@MA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated collection contains an element not of type ", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("9kU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("~~/W30");
      List list0 = fastDateFormat0.parsePattern();
      assertEquals(9, fastDateFormat0.getMaxLengthEstimate());
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^!XJN&NI~`", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("+s*>@sYU2=-a6[#FwJ");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+s*>@sYU2=-a6[#FwJ", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",hb-n'.atDs14r");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("e2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("Hffk8nj(<g`7XXvfx");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Hffk8nj(<g`7XXvfx", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: ff
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("gCtX7I", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = new Locale("org.apache.commons.lang.time.FastDateFormat$Pair");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("9i", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("jTZb");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("l]WB:LNME<44");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang.time.FastDateFormat$TimeZoneNameRule", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Gpq XKm,^|$.((", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3, "");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("r$1M-^TO},@4mId{;f", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("u1c!{~ ", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!:ZF 5v_Qx S*(Dx'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0wVIZ>\"&Cm}toPgU", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastDateFormat.getDateTimeInstance(2, 2);
      MockDate mockDate0 = new MockDate(0);
      Locale locale0 = null;
      // Undeclared exception!
      try { 
        NumberFormat.getIntegerInstance((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Ex$R;GnKz+8P/Ss`q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, timeZone0, locale0);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      Object object0 = new Object();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, 5);
      // Undeclared exception!
      try { 
        fastDateFormat0.format(object0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.Object
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      Long long0 = new Long(0L);
      StringBuffer stringBuffer0 = new StringBuffer("iV@&Ddl}p&BS=OFqH%");
      FieldPosition fieldPosition0 = new FieldPosition((-1));
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      boolean boolean0 = fastDateFormat0.equals(mockSimpleDateFormat0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(0, 1, locale0);
      boolean boolean0 = fastDateFormat1.equals(fastDateFormat0);
      assertEquals("EEEE, d MMMM yyyy HH:mm:ss z", fastDateFormat1.getPattern());
      assertEquals(30, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 0, 0, 0, (-1));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 0, 0, 1, 0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      StringBuffer stringBuffer1 = fastDateFormat0.format((Object) mockGregorianCalendar1, stringBuffer0, fieldPosition0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer1);
      assertEquals(95, stringBuffer0.length());
      
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("F");
      Locale locale0 = new Locale("F", "F");
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat1 = new FastDateFormat("F", timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertTrue(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

//  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      String string0 = fastDateFormat0.format(date0);
      assertEquals("10/15/82 12:00 AM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

//  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TwoDigitMonthField");
      Locale locale0 = Locale.forLanguageTag("org.apache.commons.lang.time.FastDateFormat$TwoDigitMonthField");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      MockDate mockDate0 = new MockDate((-1318), 0, 2, (-1318), 0);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("Saturday, November 8, 0581 2:00:00 AM GMT", string0);
  }
}

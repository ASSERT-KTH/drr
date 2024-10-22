/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 10:56:18 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;


public class FastDateFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "yyyy/MM/dd";
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("yyyy/MM/dd");
      Locale locale0 = Locale.GERMANY;
      locale0.getDisplayName();
      locale0.hasExtensions();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      locale0.getDisplayLanguage();
      mockGregorianCalendar0.isLeapYear(0);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      try { 
        fastDateFormat0.parseObject("yyyy/MM/dd");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(0, int0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, locale0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[]", string0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 2, locale0);
      assertEquals(19, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      String string0 = fastDateFormat0.format((-1311L));
      assertEquals("Wednesday, December 31, 1969", string0);
  }

////  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((long) (-1), stringBuffer0);
      assertEquals(17, stringBuffer0.length());
      assertEquals("12/31/69 11:59 PM", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("&8ZZH", timeZone0);
      fastDateFormat0.init();
      assertEquals(11, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = new FastDateFormat("", timeZone0, locale0);
      Locale locale1 = fastDateFormat0.getLocale();
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals("en_GB", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(7, 2042);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2042
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' H'\u6642'mm'\u5206'ss'\u79D2' z", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat.getInstance("-,k");
      MockDate mockDate0 = new MockDate(1, 1, 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 60000, (-2585), 1, 1354);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Tuesday, January 7, 4994", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale.setDefault(locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      fastDateFormat0.getTimeZone();
      fastDateFormat0.equals("org.apache.commons.lang.time.FastDateFormat");
      locale0.hasExtensions();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(fastDateFormat0.MEDIUM);
      FastDateFormat.getTimeInstance(fastDateFormat1.LONG, locale0);
      assertEquals(28, fastDateFormat0.getMaxLengthEstimate());
      assertEquals("HH:mm:ss", fastDateFormat1.getPattern());
      assertEquals(8, fastDateFormat1.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertNotNull(fastDateFormat1);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(0, 0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("d2AhX3EI^=~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("+BPCY=W", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Cxl@3*\u0007-,HqTu", locale0);
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
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("/>FD");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 0, 1, 2, 0);
      mockGregorianCalendar0.add(3, 122);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("dd MMMM yyyy HH:mm:ss z", (TimeZone) null, (Locale) null);
      StringBuffer stringBuffer0 = new StringBuffer("dd MMMM yyyy HH:mm:ss z");
      StringBuffer stringBuffer1 = fastDateFormat1.applyRules(mockGregorianCalendar0, stringBuffer0);
      FastDateFormat.getDateInstance(2, (TimeZone) null);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer1);
      System.setCurrentTimeMillis(0);
      fastDateFormat1.equals(fastDateFormat0);
      System.setCurrentTimeMillis(1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<Locale> linkedHashSet0 = new LinkedHashSet<Locale>();
      Locale locale0 = Locale.UK;
      Locale.getISOLanguages();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance(" 0:KK!wG", locale0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(";ZJH", timeZone0);
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
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("L%", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.KOREAN;
      FastDateFormat fastDateFormat0 = new FastDateFormat("NaNB", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parsePattern();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("E|!O0gDG~&", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("E&SP-@]1", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("h=16~k)s.QS");
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
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("a|Ra_XyRK", locale0);
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
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated array contains null element at index: ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("z?k#?U3u0VWjt8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">##wk'i?'&V_={U", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("26W4I;],G4UN", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("X9K.z-x:P ", locale0);
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
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "y-Y,;,.evl`~~@");
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("y-Y,;,.evl`~~@", (TimeZone) simpleTimeZone0, locale0);
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
        FastDateFormat.getInstance("2b>FF", (Locale) null);
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
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c{qlF", locale0);
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
        FastDateFormat.getInstance("eCPx[ ", (Locale) null);
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
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("f&J.", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = new Locale("gM@[ITc");
      TimeZone timeZone0 = TimeZone.getTimeZone("^!(\"2\"uM-|}l|-!uH");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("gM@[ITc", timeZone0, locale0);
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("iCvvz#yraY8#(}l/@8", (TimeZone) null);
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
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("[?&+jGMjh{Wq8W", locale0);
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
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("sa$l1z", locale0);
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
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang.time.FastDateFormat");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(")pW/d;I$P%[4#E", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^qaZSS", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":%ED{y`tG,A/c9okrH.", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("uT':$!|0+I8H }]9'eR");
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("uT':$!|0+I8H }]9'eR", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("xl@3*=\u0007-,HqTu", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Locale.setDefault(locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      fastDateFormat0.getTimeZone();
      fastDateFormat0.equals("org.apache.commons.lang.time.FastDateFormat");
      Locale locale1 = Locale.US;
      locale1.hasExtensions();
      FastDateFormat.getTimeInstance(0, locale1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(")EEh-r7JT>=#", locale1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat.getDateInstance(0, locale0);
      FastDateFormat.getTimeInstance(3, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1090), 1067, 1067, (-1090), 2);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, locale0);
      fastDateFormat0.hashCode();
      ParsePosition parsePosition0 = new ParsePosition((-1));
      assertEquals("java.text.ParsePosition[index=-1,errorIndex=-1]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer("^{)] .q|e !");
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, 1734);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) fastDateFormat0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.apache.commons.lang.time.FastDateFormat
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      MockDate mockDate0 = new MockDate(2, 870, 0, 0, 1, 0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      fastDateFormat0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("", "&^FIw+Yw~W= ", "&^FIw+Yw~W= ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(1);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals(25, stringBuffer0.length());
      assertEquals("Friday, February 14, 2014", stringBuffer0.toString());
  }

//  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Long long0 = new Long(29L);
      FieldPosition fieldPosition0 = new FieldPosition(1);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) long0, (StringBuffer) null, fieldPosition0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat$UnpaddedMonthField", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("`8MYAt(z)~Xyc");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      TimeZone.setDefault(timeZone0);
      fastDateFormat0.init();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      mockSimpleDateFormat0.getDateFormatSymbols();
      TimeZone timeZone1 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat.getDateInstance(1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?v%o5B[5\u0004F}Ym*,h3", timeZone1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("M/d/yy h:mm a", "&S^FIw+Yw~W= ", "&S^FIw+Yw~W= ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      mockGregorianCalendar0.set(115, 2, 500, 500, 2274);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-58488098738680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=116,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=216,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=54,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals("Sunday, August 3, 0116", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (Locale) null);
      // Undeclared exception!
      try { 
        fastDateFormat0.format(0L, (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("-,k");
      MockDate mockDate0 = new MockDate(2, 2, 0, 3, 0);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("-,3", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("-,k");
      MockDate mockDate0 = new MockDate(3, 2, 2);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("-,24", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      Calendar calendar0 = mockSimpleDateFormat0.getCalendar();
      StringBuffer stringBuffer0 = new StringBuffer("");
      fastDateFormat0.applyRules(calendar0, stringBuffer0);
      assertEquals("8:21:21 PM GMT", stringBuffer0.toString());
      assertEquals(14, stringBuffer0.length());
  }

////  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) simpleTimeZone0);
      assertNotNull(fastDateFormat0);
      
      simpleTimeZone0.setStartRule(2, 1, 2, 1, true);
      simpleTimeZone0.setEndRule(2, 1, 0);
      MockDate mockDate0 = new MockDate(1, 0, 0, 1, 3);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("Monday, December 31, 1900 2:03:00 AM GMT+00:00", string0);
      assertEquals(55, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) simpleTimeZone0);
      MockDate mockDate0 = new MockDate(2, 0, 0, 2, 3);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("Tuesday, December 31, 1901 2:03:00 AM GMT+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("&;Z|H");
      MockDate mockDate0 = new MockDate(2, 2, 0, 0, 3);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("&;+0000|0", string0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }
}

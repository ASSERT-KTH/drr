/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 02:01:30 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

 
public class FastDateFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("~Z");
      MockDate mockDate0 = new MockDate(0, 0, 1, 87, 87);
      StringBuffer stringBuffer0 = new StringBuffer("~Z");
      fastDateFormat0.format((long) 2, stringBuffer0);
      FieldPosition fieldPosition0 = new FieldPosition(87);
      assertEquals("java.text.FieldPosition[field=87,attribute=null,beginIndex=0,endIndex=0]", fieldPosition0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = 192L;
      System.setCurrentTimeMillis(192L);
      System.setCurrentTimeMillis(192L);
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("-}\"k", timeZone0, locale0);
      StringBuffer stringBuffer0 = null;
      // Undeclared exception!
      try { 
        fastDateFormat0.format((-1210L), (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, locale0);
      locale0.getDisplayVariant();
      MockDate mockDate0 = new MockDate(3, 0, 3, 2, 2);
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("03/01/03 2:02 AM", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      String string0 = fastDateFormat0.getPattern();
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "J0a2WDgIP%4iUMN4M", 1, 1, 1, 1, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0);
      String string0 = fastDateFormat0.format(1216L);
      assertEquals("1:00:01 AM GMT+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      ParsePosition parsePosition0 = new ParsePosition(0);
      fastDateFormat0.parseObject("", parsePosition0);
      assertEquals(0, parsePosition0.getErrorIndex());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      Locale locale0 = fastDateFormat0.getLocale();
      assertEquals("en", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(93, "");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("[.99M;#9,", (TimeZone) simpleTimeZone0, locale0);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[[.99M;#9,]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
      fastDateFormat0.getTimeZone();
      assertEquals(18, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "J0a2WDgIP%4iUMN4M", 1, 1, 1, 1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("J0a2WDgIP%4iUMN4M", (TimeZone) simpleTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("~Z");
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertFalse(boolean0);
      assertEquals(6, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      String string0 = fastDateFormat0.format((-2269L));
      assertEquals("12/31/69 11:59 PM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Bi6&U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("^C;U*nv", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      String string0 = "mD&:F/";
      FastDateFormat.getInstance("mD&:F/");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(2);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      timeZone0.observesDaylightTime();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1);
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0);
      Locale.lookup(linkedList0, list1);
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // range=
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("z:8F^;");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("G5Zs=AU'*\"", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?IrI3Igp*k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("^K::'qG$8L\"|N ");
      FastDateFormat.getInstance("^K::'qG$8L\"|N ", timeZone0);
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeInstance(610);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 610
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("LCU]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Negative values should not be possible", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("2/14/14 8:21 PM");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Q:>-i#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("R{:5OEber,g", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("WSmg$", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("_U2X8KxjMQqwox3=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Z8VaXek.Oy kuY}'8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Xk8(", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("The validated character sequence is empty");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-Y.^e", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("H{dW%*bW4EK=xd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("W\"ac`j*4", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("The validated character sequence is empty");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-.^e", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("fit%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Sirmqs]o", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("37j1FE_M&B PGFCTeh.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wsnqS?QV  ;a<dy-FU", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat$TwoDigitMonthField", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("pR", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("a=q#wUN;`b");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("rr*fK>mGNF>Z97-dP", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: rr
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("The validated character sequence is empty");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("tGb{~a_('nehr61)X:", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("0{)uq#k`", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`#d:vC?F8VBG8%;?J`", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("G!><x0M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("#E<lX'$'V", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat.getDateInstance(0, locale0);
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat("kMpyVdad87B", dateFormatSymbols0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'p'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FastDateFormat.getDateTimeInstance(0, 0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = null;
      try {
        mockSimpleDateFormat0 = new MockSimpleDateFormat((String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockDate mockDate0 = new MockDate(1, (-1), 873);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(mockDate0);
      assertEquals(16, attributedCharacterIterator0.getRunLimit());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("D*9", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      Locale locale0 = Locale.UK;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      StringBuffer stringBuffer0 = new StringBuffer(77);
      FieldPosition fieldPosition0 = new FieldPosition(0);
      fastDateFormat0.format((Object) mockGregorianCalendar0, stringBuffer0, fieldPosition0);
      assertEquals(40, stringBuffer0.length());
      assertEquals("Friday, February 14, 2014 8:21:21 PM GMT", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("The validated character sequence is empty");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, timeZone0, (Locale) null);
      Long long0 = new Long(0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertEquals(31, stringBuffer0.length());
      assertEquals(38, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("D*9", dateFormatSymbols0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator(dateFormatSymbols0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.text.DateFormatSymbols
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 2, 0, 2);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Friday, January 2, 0001", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, (-1452), 3168, 95, 100);
      boolean boolean0 = fastDateFormat0.equals(mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-3965), "k&ps#E\"k~|3qYf[|J(G");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(2, (TimeZone) simpleTimeZone0);
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(14, fastDateFormat1.getMaxLengthEstimate());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateTimeInstance(3, 3);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = "J0a2WDgIP%4iUMN4M";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "J0a2WDgIP%4iUMN4M", 1, 1, 1, 1, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0);
      fastDateFormat0.hashCode();
      Locale locale0 = Locale.KOREA;
      FastDateFormat.getTimeZoneDisplay(simpleTimeZone0, true, 0, locale0);
      int int0 = FastDateFormat.SHORT;
      FastDateFormat.getTimeInstance(0, (TimeZone) simpleTimeZone0);
      String string1 = "";
      int int1 = 4382;
      FastDateFormat.getTimeInstance(3, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The pattern must not be null", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      Locale locale0 = Locale.forLanguageTag("$wy~XB0FbV o)[^");
      FastDateFormat fastDateFormat1 = FastDateFormat.getDateInstance(0, locale0);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertEquals(31, fastDateFormat1.getMaxLengthEstimate());
      assertEquals("EEEE, MMMM d, yyyy", fastDateFormat0.getPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("z:8F^;");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("h:mm:ss a z", timeZone0);
      assertEquals(17, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("D*9");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "D*9");
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals(8, stringBuffer0.length());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 1, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1681), (-1681));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("24 aprile 0147 0.00.00 GMT", stringBuffer0.toString());
      assertEquals("d MMMM yyyy H.mm.ss z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "J0a2WDgIP%4iUMN4M", 1, 1, 1, 1, 1, 1, 1, 1);
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1, (TimeZone) simpleTimeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 1, 100);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("12:00:00 AM GMT+00:00", stringBuffer0.toString());
      assertEquals(21, stringBuffer0.length());
  }
}

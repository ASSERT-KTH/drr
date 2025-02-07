/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 09:31:54 GMT 2019
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
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
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(Integer.MIN_VALUE, 0, Integer.MIN_VALUE, 2, 0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1, locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      fastDateFormat0.format(date0, stringBuffer0);
      assertEquals("1582/10/15", stringBuffer0.toString());
      assertEquals(10, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      String string0 = fastDateFormat0.toString();
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals("FastDateFormat[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance(8, 8, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 8
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.getTimeZoneOverridesCalendar();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

//  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("mss+,@,");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      Long long0 = new Long(2416L);
      FieldPosition fieldPosition0 = new FieldPosition(1);
      fastDateFormat0.format((Object) long0, stringBuffer0, fieldPosition0);
      assertEquals("mss+,@,January 1, 1970", stringBuffer0.toString());
      assertEquals(22, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0);
      assertEquals(49, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      fastDateFormat0.getLocale();
      assertEquals("EEEE, MMMM d, yyyy h:mm:ss a z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 0);
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 1829);
      StringBuffer stringBuffer1 = numberFormat0.format(1447L, stringBuffer0, fieldPosition0);
      StringBuffer stringBuffer2 = fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer1);
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer2);
      System.setCurrentTimeMillis(2450L);
      System.setCurrentTimeMillis(747L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("EEEE, MMMM d, yyyy", string0);
  }

//  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      String string0 = fastDateFormat0.format((-4336L));
      assertEquals("12/31/69 11:59 PM", string0);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(1, 0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      fastDateFormat0.parseObject("FastDateFormat[]", parsePosition0);
      Locale locale0 = Locale.US;
      FastDateFormat.getTimeZoneDisplay(timeZone0, true, 0, locale0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("FastDateFormat[]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Z");
      timeZone0.getDisplayName();
      timeZone0.observesDaylightTime();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("Z", timeZone0);
      List list0 = fastDateFormat0.parsePattern();
      System.setCurrentTimeMillis(3435L);
      fastDateFormat0.equals(list0);
      Object object0 = fastDateFormat0.clone();
      boolean boolean0 = fastDateFormat0.equals(object0);
      assertTrue(boolean0);
      
      fastDateFormat0.equals("R2(;");
      System.setCurrentTimeMillis(3435L);
      List list1 = fastDateFormat0.parsePattern();
      assertEquals(1, list1.size());
      
      System.setCurrentTimeMillis(1);
      Locale locale0 = new Locale("EEEE, MMMM d, yyyy", "H(@");
      fastDateFormat0.equals(locale0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
      assertEquals(5, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      Locale locale0 = new Locale("3.k9\"`z", "3.k9\"`z");
      System.setCurrentTimeMillis(2);
      FastDateFormat.getInstance("3.k9\"`z", (TimeZone) null, locale0);
      locale0.getDisplayLanguage();
      System.setCurrentTimeMillis((-1165L));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TimeZoneNameRule");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      locale0.getDisplayVariant((Locale) null);
      Locale.getISOCountries();
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      timeZone0.getDisplayName(false, 0);
      locale0.clone();
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      fastDateFormat0.format(calendar0);
      fastDateFormat0.hashCode();
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0);
      FastDateFormat fastDateFormat2 = FastDateFormat.getInstance("", locale0);
      fastDateFormat2.parsePattern();
      fastDateFormat1.parsePattern();
      System.setCurrentTimeMillis(1644L);
      FastDateFormat fastDateFormat3 = FastDateFormat.getTimeInstance(1, timeZone0);
      fastDateFormat1.equals(fastDateFormat3);
      assertEquals(17, fastDateFormat3.getMaxLengthEstimate());
  }

//  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
      assertNotSame(fastDateFormat1, fastDateFormat0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null, locale0);
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
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4-SAuJOljxg(%", locale0);
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("BHu}p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: B
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("4zClFX<Jf9*=tgoBG>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: C
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("DtNzeP?6~<w<-M,1o");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Greenwich Mean Time", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TimeZoneNameRule");
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      List list0 = fastDateFormat0.parsePattern();
      assertEquals(15, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("I-(Q!>_&}\"$]yj3.Gw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("dJn.h3#U2Jfc'i", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Korean", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("L.", (TimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("SNd/f2\u0000#KM");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(",O}fe`5B.sVMp*0", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("c~H%");
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("d=E|P'TdF7)6hR'", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(" /QK6\"vwI*Lr#)[n", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("#R;0x9<BHN", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("y%T6^7XO(", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("U:oa", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = new FastDateFormat("VJKe76r4LL;F1={P", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.parsePattern();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("1GWqQib0;W.", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("wX#Mvb");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wX#Mvb", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("aSMY)In+mV([nC", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wb3[6F#zcz<SJl@h", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(">,Zel9dRBnr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("foqJ8oeCB<!&g8X", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("@gD3h/\"G", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("i.", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("?jLj|V!U3M#");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?jLj|V!U3M#", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "u&IidVYa.qr~wG!iq");
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("`.>2,ZkloRBDrh", (TimeZone) simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("<null>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("-G5<p,9TX`[TOWVP'ah", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("u");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("u", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = new Locale("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE ahh'\u6642'mm'\u5206'ss'\u79D2' z");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vC", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-216), "xErD;jX+E&8;L");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("xErD;jX+E&8;L", (TimeZone) simpleTimeZone0);
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
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(2);
      assertEquals("MMM d, yyyy", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      locale0.clone();
      MockCalendar.getInstance(locale0);
      String string0 = "SS4J_[.cI7|]$SaE";
      StringBuffer stringBuffer0 = new StringBuffer("SS4J_[.cI7|]$SaE");
      ParsePosition parsePosition0 = new ParsePosition((-4133));
      FastDateFormat.getInstance("1970\uB144 1\uC6D4 1\uC77C \uBAA9\uC694\uC77C", locale0);
      FastDateFormat.getTimeInstance(1);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateInstance(1117, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 1117
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = 0;
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getTimeZoneDisplay(timeZone0, true, 3637, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal style: 3637
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale("");
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0, locale0);
      MockDate mockDate0 = new MockDate();
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-665));
      fastDateFormat0.format((Object) mockDate0, stringBuffer0, fieldPosition0);
      assertTrue(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

//  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREA;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, timeZone0, locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      StringBuffer stringBuffer0 = new StringBuffer("SS4J_[.cI7|]$SaE");
      fastDateFormat0.format((Object) calendar0, stringBuffer0, (FieldPosition) null);
      assertEquals("SS4J_[.cI7|]$SaE2014\uB144 2\uC6D4 14\uC77C \uAE08\uC694\uC77C", stringBuffer0.toString());
      assertEquals(32, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("5,O-#.5*VKsw'j");
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, locale0);
      // Undeclared exception!
      try { 
        fastDateFormat0.formatToCharacterIterator(fastDateFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: org.apache.commons.lang.time.FastDateFormat
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang.time.FastDateFormat$TimeZoneNameRule");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, timeZone0, locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(0);
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(18, fastDateFormat1.getMaxLengthEstimate());
      assertEquals("yyyy'\u5E74'M'\u6708'd'\u65E5' EEEE ahh'\u6642'mm'\u5206'ss'\u79D2' z", fastDateFormat0.getPattern());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      FastDateFormat fastDateFormat1 = new FastDateFormat("", timeZone0, (Locale) null);
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertTrue(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat1);
      
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

//  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 0);
      StringBuffer stringBuffer0 = new StringBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(14, stringBuffer0.length());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62128080000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=90,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

//  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-810), 0, (-810), 2, 0);
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("Monday, October 13, 0814 2:00:00 AM GMT", stringBuffer0.toString());
      assertEquals(39, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      timeZone0.getOffset(1625L);
      MockDate mockDate0 = new MockDate(0, 3418, 0);
      mockDate0.toInstant();
      MockDate.UTC(111, 0, 198, (-37), (-3120), (-37));
      timeZone0.getDisplayName(false, 0);
      mockDate0.setTime(0L);
      timeZone0.inDaylightTime(mockDate0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", timeZone0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getTimeInstance(1, timeZone0);
      ParsePosition parsePosition0 = new ParsePosition(90);
      fastDateFormat1.parseObject("", parsePosition0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      StringBuffer stringBuffer0 = new StringBuffer(889);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 3);
      StringBuffer stringBuffer1 = decimalFormat0.format((double) 0L, stringBuffer0, fieldPosition0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) null, stringBuffer1, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: <null>
         //
         verifyException("org.apache.commons.lang.time.FastDateFormat", e);
      }
  }
}

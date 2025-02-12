/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 19:18:16 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.AttributedCharacterIterator;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

 
public class FastDateFormat_ESTest {

////  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("4wZ]k");
      Locale locale0 = Locale.GERMANY;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("4wZ]k", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat.getDateInstance(0, timeZone0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-758), "4wZ]k");
      Locale locale1 = Locale.GERMANY;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale1);
      StringBuffer stringBuffer0 = new StringBuffer(3);
      fastDateFormat0.format(calendar0, stringBuffer0);
      assertEquals(10, stringBuffer0.length());
      
      MockDate mockDate0 = new MockDate(3, 0, 3, 2, 2, 2);
      String string0 = fastDateFormat0.format((Object) mockDate0);
      assertEquals("41+0000]2", string0);
  }

////  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(3, locale0);
      FastDateFormat.getDateTimeInstance(1, 1, locale0);
      fastDateFormat0.equals(locale0);
      fastDateFormat0.format((-1227L));
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("");
      FastDateFormat fastDateFormat2 = FastDateFormat.getDateTimeInstance(3, 1);
      MockDate mockDate0 = new MockDate(1, (-1069), 1);
      StringBuffer stringBuffer0 = new StringBuffer("31/12/69");
      fastDateFormat2.format((Date) mockDate0, stringBuffer0);
      assertEquals("31/12/6912/1/11 12:00:00 AM GMT", stringBuffer0.toString());
      
      fastDateFormat1.equals("");
      fastDateFormat2.equals("");
      assertEquals(29, fastDateFormat2.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.getPattern();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      ParsePosition parsePosition0 = new ParsePosition(1);
      fastDateFormat0.parseObject("", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.UK;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("`", timeZone0);
      Locale locale1 = fastDateFormat0.getLocale();
      assertNotSame(locale0, locale1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(1);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[h:mm:ss a z]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      assertNotNull(fastDateFormat0);
      
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(21, int0);
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.getTimeZone();
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
      assertFalse(fastDateFormat0.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("");
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k`");
      boolean boolean0 = fastDateFormat0.getTimeZoneOverridesCalendar();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 1, (TimeZone) null);
      assertEquals(33, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("3/2/02 12:00 AM");
      Locale locale0 = Locale.ITALY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, timeZone0, locale0);
      assertEquals(1, FastDateFormat.LONG);
  }

////  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance();
      assertNotSame(fastDateFormat1, fastDateFormat0);
      assertEquals(21, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The pattern must not be null
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":|&m4(A{EAm&>\"@[S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: A
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("MBF'r3gZiR`D&");
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("%H%5`C");
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
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("!a3D9ED<N#C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(".F)VGdtA6#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("G+QN", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("z", locale0);
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("Illegal pattern component: ", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("?JKS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: J
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("K|`", dateFormatSymbols0);
      ParsePosition parsePosition0 = new ParsePosition((-1019));
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Locale locale1 = locale0.stripExtensions();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("K|`", locale1);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "bU;,wC<>MA";
      stringArray0[1] = "K|`";
      stringArray0[2] = "K|`";
      stringArray0[3] = "K|`";
      stringArray0[4] = "K|`";
      stringArray0[5] = "MMMM d, yyyy";
      stringArray0[6] = "K|`";
      dateFormatSymbols0.setShortWeekdays(stringArray0);
      fastDateFormat0.equals(locale1);
      MockDate mockDate0 = new MockDate(0, 0, 1518, 1518, 1518, 3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(".LYk|#!L]s-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: L
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S>PfHR[E('", locale0);
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
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("WR/d%*gTR.PS# ", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("The validated object is not an instance of %s", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("United States", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("X", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("&h\"0Y;2h3~/<kG8*&", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Y
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("Vy0n");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("bG%o9w,v95z`GDh$!7t", timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("c&o", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("e`4a", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: e
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("fz/", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance(":g", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S:iUjwJE5N", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("wy@j)vb_*/FPxmX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("lp+w", timeZone0, (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("org.apache.commons.lang3.time.FastDateFormat", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("yma>pNUmOLe9CTBb^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("qLn", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours((-1));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("sdr.|(", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: r
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("a|H(&tY&?nc(r", (TimeZone) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("S8-u7Jzelw.", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("vF!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("m&s1w0/#x", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: x
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("yZZ|)?]O(7");
      // Undeclared exception!
      try { 
        FastDateFormat.getInstance("yZZ|)?]O(7", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      FastDateFormat.getDateInstance(0, locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 1, locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      StringBuffer stringBuffer0 = new StringBuffer("s(Bl5 J/*J^XE`r");
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0, 492);
      MockDate mockDate0 = new MockDate(1, (-1778), 1);
      StringBuffer stringBuffer1 = new StringBuffer();
      fastDateFormat0.format((Date) mockDate0, stringBuffer1);
      assertEquals(22, stringBuffer1.length());
      assertEquals(29, fastDateFormat0.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ParsePosition parsePosition0 = new ParsePosition((-1019));
      MockDate mockDate0 = new MockDate(0L);
      MockDate mockDate1 = new MockDate();
      mockDate0.getTime();
      mockDate0.toInstant();
      Locale locale0 = Locale.CANADA;
      locale0.getDisplayScript();
      FastDateFormat.getTimeInstance(0, locale0);
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 3;
      intArray0[2] = 632;
      intArray0[3] = 0;
      intArray0[4] = 2;
      intArray0[5] = 3;
      intArray0[6] = 2;
      intArray0[7] = 1;
  }

////  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer(2);
      Calendar calendar0 = MockCalendar.getInstance();
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      fastDateFormat0.format((Object) calendar0, stringBuffer0, fieldPosition0);
      assertEquals("2/14/14 8:21 PM", stringBuffer0.toString());
      assertEquals(21, fastDateFormat0.getMaxLengthEstimate());
  }

////  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      Long long0 = new Long(1);
      AttributedCharacterIterator attributedCharacterIterator0 = fastDateFormat0.formatToCharacterIterator(long0);
      assertEquals(25, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      // Undeclared exception!
      try { 
        fastDateFormat0.format((Object) "lMII");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown class: java.lang.String
         //
         verifyException("org.apache.commons.lang3.time.FastDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0);
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
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("");
      Locale locale0 = Locale.forLanguageTag("");
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("%;=.%y/;HM", locale0);
      fastDateFormat0.equals(fastDateFormat1);
      assertEquals(15, fastDateFormat1.getMaxLengthEstimate());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      Locale.setDefault(locale0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("", locale0);
      FastDateFormat fastDateFormat1 = FastDateFormat.getInstance("");
      boolean boolean0 = fastDateFormat0.equals(fastDateFormat1);
      assertFalse(boolean0);
      assertFalse(fastDateFormat1.getTimeZoneOverridesCalendar());
  }

////  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 695, 695, 2, 0, (-690));
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("Saturday, October 25, 0060", string0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-60248182290000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=60,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=299,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=48,SECOND=30,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

////  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(983, 1, 1249, 0, 2);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals("Saturday, July 3, 0986 12:02:00 AM GMT", stringBuffer0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-31035743880000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=986,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=184,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

////  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("k`");
      MockDate mockDate0 = new MockDate(0L);
      String string0 = fastDateFormat0.format((Object) mockDate0);
      assertEquals("24`", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat(".LYk|#!L]s-");
      TimeZone timeZone0 = mockSimpleDateFormat0.getTimeZone();
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0);
      int int0 = 983;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(983, 1, 1249, 0, 2);
      StringWriter stringWriter0 = new StringWriter();
      int int1 = (-2523);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) ".LYk|#!L]s-");
      stringWriter0.flush();
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      // Undeclared exception!
      try { 
        FastDateFormat.getDateTimeInstance((-2523), 122, timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 122
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = 0;
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      timeZone0.getOffset((long) 0);
      timeZone0.getDisplayName();
      FastDateFormat.getTimeInstance(0, timeZone0);
      Locale locale0 = new Locale("C'`246#I{HI", "Coordinated Universal Time", "C'`246#I{HI");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      StringBuffer stringBuffer0 = new StringBuffer(15);
      Format.Field format_Field0 = mock(Format.Field.class, new ViolatedAssumptionAnswer());
      FieldPosition fieldPosition0 = new FieldPosition(format_Field0);
      // Undeclared exception!
      try { 
        mockSimpleDateFormat0.format((Object) null, stringBuffer0, fieldPosition0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
         verifyException("java.text.DateFormat", e);
      }
  }
}

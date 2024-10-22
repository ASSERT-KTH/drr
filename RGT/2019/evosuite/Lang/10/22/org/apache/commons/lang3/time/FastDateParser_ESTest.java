/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 13:20:12 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class FastDateParser_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("y007/hzXmA&&9\"+", timeZone0, locale0);
      assertEquals("y007/hzXmA&&9\"+", fastDateParser0.getPattern());
  }

////  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "5M8d)fNb3BuK#8*tqoJ");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("MpQ]0%C7", simpleTimeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("5M8d)fNb3BuK#8*tqoJ");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("ky@/\"", timeZone0, locale0);
      assertEquals("ky@/\"", fastDateParser0.getPattern());
  }

////  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("SST", timeZone0, locale0);
      Object object0 = fastDateParser0.parseObject("5Yn!1D=k");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", object0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("]", timeZone0, locale0);
      fastDateParser0.hashCode();
  }

////  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[a>9DI%xJ+uqrd,zh,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("/");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("/", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      fastDateParser0.parseObject("/", parsePosition0);
      assertEquals("java.text.ParsePosition[index=1,errorIndex=-1]", parsePosition0.toString());
      assertEquals(1, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser(".imgL-:[1B", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals(".imgL-:[1B", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("zh", locale1.getLanguage());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone1, timeZone0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser(",", timeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals(",", pattern0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("", timeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("!+{o|,?ED");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("?9zUNp~", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals("?9zUNp~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("FastDateParser[a>9DI%xJ+uqrd,zh,GMT]", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale0);
      Locale locale1 = Locale.ITALY;
      FastDateParser fastDateParser1 = new FastDateParser("a>9DI%xJ+uqrd", timeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("!+{o|,?ED");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("?9zUNp~", timeZone0, locale0);
      try { 
        fastDateParser0.parseObject("?9zUNp~");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"?9zUNp~\" does not match \\?9(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|ACDT|ACST|ACT|ACWST|ADT|AEDT|AEST|AFT|AKDT|AKST|ALMT|AMST|AMT|ANAT|AQTT|ART|AST|AWST|AZOST|AZOT|AZT|BDT|BNT|BOT|Bougainville Standard Time|BRST|BRT|BST|BTT|CAT|CCT|CDT|CEST|CET|CHADT|CHAST|CHOT|ChST|CHUT|CKT|CLST|CLT|COT|CST|CVT|CXT|DAVT|DDUT|EASST|EAST|EAT|ECT|EDT|EEST|EET|EGST|EGT|EST|FJST|FJT|FKT|FNT|GALT|GAMT|GET|GFT|GILT|GMT|GMT\\+01:00|GMT\\+02:00|GMT\\+03:00|GMT\\+04:00|GMT\\+05:00|GMT\\+06:00|GMT\\+07:00|GMT\\+08:00|GMT\\+09:00|GMT\\+10:00|GMT\\+11:00|GMT\\+12:00|GMT\\+13:00|GMT\\+14:00|GMT-01:00|GMT-02:00|GMT-03:00|GMT-04:00|GMT-05:00|GMT-06:00|GMT-07:00|GMT-08:00|GMT-09:00|GMT-10:00|GMT-11:00|GMT-12:00|GST|GYT|HDT|HKT|HOVT|HST|ICT|IDT|IOT|IRDT|IRKT|IRST|IST|JST|KGT|KOST|KRAT|KST|LHDT|LHST|LINT|MAGT|MART|MAWT|MDT|MEST|MET|MHT|MIST|MMT|MSK|MST|MUT|MVT|MYT|NCT|NDT|NFT|NOVT|NPT|NRT|NST|NUT|NZDT|NZST|OMST|ORAT|PDT|PET|PETT|PGT|PHOT|PHT|PKT|PMDT|PMST|PONT|PST|PWT|PYST|PYT|QYZT|RET|ROTT|SAKT|SAMT|SAST|SBT|SCT|SGT|Srednekolymsk Time|SRET|SRT|SST|SYOT|TAHT|TFT|TJT|TKT|TLT|TMT|TOST|TOT|TVT|ULAT|UTC|UYT|UZT|VET|VLAT|VOST|VUT|WAKT|WAST|WAT|WEST|WET|WFT|WGST|WGT|WIB|WIT|WITA|WSDT|WSST|XJT|YAKT|YEKT|\u30A2\u30A4\u30EB\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30A2\u30AF\u30BF\u30A6\u6642\u9593|\u30A2\u30AF\u30C8\u30D9\u6642\u9593|\u30A2\u30AF\u30EC\u6642\u9593|\u30A2\u30BC\u30EB\u30D0\u30A4\u30B8\u30E3\u30F3\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u590F\u6642\u9593|\u30A2\u30BE\u30EC\u30B9\u6642\u9593|\u30A2\u30CA\u30C9\u30A5\u30A4\u30EA\u6642\u9593|\u30A2\u30D5\u30AC\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u590F\u6642\u9593|\u30A2\u30DE\u30BE\u30F3\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u590F\u6642\u9593|\u30A2\u30E9\u30B9\u30AB\u6A19\u6E96\u6642|\u30A2\u30E9\u30D3\u30A2\u6A19\u6E96\u6642|\u30A2\u30EB\u30BC\u30F3\u30C1\u30F3\u6642\u9593|\u30A2\u30EB\u30DE\u30A2\u30BF\u6642\u9593|\u30A2\u30EB\u30E1\u30CB\u30A2\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u590F\u6642\u9593|\u30A4\u30B9\u30E9\u30A8\u30EB\u6A19\u6E96\u6642|\u30A4\u30E9\u30F3\u590F\u6642\u9593|\u30A4\u30E9\u30F3\u6A19\u6E96\u6642|\u30A4\u30EB\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30A4\u30F3\u30C9\u30B7\u30CA\u6642\u9593|\u30A4\u30F3\u30C9\u6A19\u6E96\u6642|\u30A4\u30F3\u30C9\u6D0B\u5730\u57DF\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u590F\u6642\u9593|\u30A4\u30FC\u30B9\u30BF\u30FC\u5CF6\u6642\u9593|\u30A6\u30A7\u30FC\u30AF\u6642\u9593|\u30A6\u30B9\u30C1\u30CD\u30E9\u6642\u9593|\u30A6\u30BA\u30D9\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30A6\u30E9\u30B8\u30AA\u30B9\u30C8\u30AF\u6642\u9593|\u30A6\u30E9\u30FC\u30F3\u30D0\u30FC\u30C8\u30EB\u6642\u9593|\u30A6\u30EB\u30B0\u30A2\u30A4\u6642\u9593|\u30A8\u30AB\u30C6\u30EA\u30F3\u30D6\u30EB\u30B0\u6642\u9593|\u30A8\u30AF\u30A2\u30C9\u30EB\u6642\u9593|\u30AA\u30E0\u30B9\u30AF\u6642\u9593|\u30AA\u30E9\u30EB\u6642\u9593|\u30AB\u30FC\u30DC\u30D9\u30EB\u30C7\u6642\u9593|\u30AC\u30A4\u30A2\u30CA\u6642\u9593|\u30AC\u30E9\u30D1\u30B4\u30B9\u6642\u9593|\u30AC\u30F3\u30D3\u30A2\u6642\u9593|\u30AC\u30FC\u30CA\u6A19\u6E96\u6642|\u30AD\u30B8\u30EB\u30AA\u30EB\u30C0\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u590F\u6642\u9593|\u30AD\u30E5\u30FC\u30D0\u6A19\u6E96\u6642|\u30AD\u30EB\u30AE\u30B9\u30BF\u30F3\u6642\u9593|\u30AE\u30EB\u30D0\u30FC\u30C8\u8AF8\u5CF6\u6642\u9593|\u30AF\u30C3\u30AF\u8AF8\u5CF6\u6642\u9593|\u30AF\u30E9\u30B9\u30CE\u30E4\u30EB\u30B9\u30AF\u6642\u9593|\u30AF\u30EA\u30B9\u30DE\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B0\u30A2\u30E0\u6A19\u6E96\u6642|\u30B0\u30EA\u30CB\u30C3\u30B8\u6A19\u6E96\u6642|\u30B0\u30EB\u30B8\u30A2\u6642\u9593|\u30B3\u30B3\u30B9\u8AF8\u5CF6\u6642\u9593|\u30B3\u30B9\u30E9\u30A8\u6642\u9593|\u30B3\u30ED\u30F3\u30D3\u30A2\u6642\u9593|\u30B5\u30DE\u30E9\u6642\u9593|\u30B5\u30E2\u30A2\u6A19\u6E96\u6642|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u590F\u6642\u9593|\u30B5\u30F3\u30D4\u30A8\u30FC\u30EB\u30FB\u30DF\u30AF\u30ED\u30F3\u8AF8\u5CF6\u6A19\u6E96\u6642|\u30B7\u30F3\u30AC\u30DD\u30FC\u30EB\u6642\u9593|\u30B9\u30EA\u30CA\u30E0\u6642\u9593|\u30BB\u30A4\u30B7\u30A7\u30EB\u6642\u9593|\u30BD\u30ED\u30E2\u30F3\u8AF8\u5CF6\u6642\u9593|\u30BF\u30B8\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30BF\u30D2\u30C1\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u590F\u6642\u9593|\u30C1\u30E3\u30BF\u30E0\u6A19\u6E96\u6642|\u30C1\u30E5\u30FC\u30AF\u6642\u9593|\u30C1\u30E7\u30A4\u30D0\u30EB\u30B5\u30F3\u6642\u9593|\u30C1\u30EA\u590F\u6642\u9593|\u30C1\u30EA\u6642\u9593|\u30C4\u30D0\u30EB\u6642\u9593|\u30C7\u30A4\u30D3\u30B9\u6642\u9593|\u30C7\u30E5\u30E2\u30F3\u30C7\u30E5\u30EB\u30F4\u30A3\u30EB\u6642\u9593|\u30C8\u30B1\u30E9\u30A6\u8AF8\u5CF6\u6642\u9593|\u30C8\u30EB\u30AF\u30E1\u30CB\u30B9\u30BF\u30F3\u6642\u9593|\u30C8\u30F3\u30AC\u590F\u6642\u9593|\u30C8\u30F3\u30AC\u6642\u9593|\u30CA\u30A6\u30EB\u6642\u9593|\u30CB\u30A6\u30A8\u5CF6\u6642\u9593|\u30CB\u30E5\u30FC\u30AB\u30EC\u30C9\u30CB\u30A2\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30B8\u30FC\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u30CB\u30E5\u30FC\u30D5\u30A1\u30F3\u30C9\u30E9\u30F3\u30C9\u6A19\u6E96\u6642|\u30CD\u30D1\u30FC\u30EB\u6642\u9593|\u30CE\u30DC\u30B7\u30D3\u30EB\u30B9\u30AF\u6642\u9593|\u30CE\u30FC\u30D5\u30A9\u30FC\u30AF\u6642\u9593|\u30CF\u30EF\u30A4\u590F\u6642\u9593|\u30CF\u30EF\u30A4\u6A19\u6E96\u6642|\u30D0\u30CC\u30A2\u30C4\u6642\u9593|\u30D0\u30F3\u30B0\u30E9\u30C7\u30B7\u30E5\u6642\u9593|\u30D1\u30AD\u30B9\u30BF\u30F3\u6642\u9593|\u30D1\u30D7\u30A2\u30CB\u30E5\u30FC\u30AE\u30CB\u30A2\u6642\u9593|\u30D1\u30E9\u30AA\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u590F\u6642\u9593|\u30D1\u30E9\u30B0\u30A2\u30A4\u6642\u9593|\u30D4\u30C8\u30B1\u30EB\u30F3\u5CF6\u6A19\u6E96\u6642|\u30D5\u30A3\u30B8\u30FC\u590F\u6642\u9593|\u30D5\u30A3\u30B8\u30FC\u6642\u9593|\u30D5\u30A3\u30EA\u30D4\u30F3\u6642\u9593|\u30D5\u30A7\u30CB\u30C3\u30AF\u30B9\u8AF8\u5CF6\u6642\u9593|\u30D5\u30A7\u30EB\u30CA\u30F3\u30C9\u30FB\u30C7\u30FB\u30CE\u30ED\u30FC\u30CB\u30E3\u6642\u9593|\u30D5\u30A9\u30FC\u30AF\u30E9\u30F3\u30C9\u8AF8\u5CF6\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u590F\u6642\u9593|\u30D6\u30E9\u30B8\u30EB\u6642\u9593|\u30D6\u30EB\u30CD\u30A4\u6642\u9593|\u30D6\u30FC\u30BF\u30F3\u6642\u9593|\u30D9\u30CD\u30BA\u30A8\u30E9\u6642\u9593|\u30DA\u30C8\u30ED\u30D1\u30D6\u30ED\u30D5\u30B9\u30AF\u30AB\u30E0\u30C1\u30E3\u30C4\u30AD\u30FC\u6642\u9593|\u30DA\u30EB\u30FC\u6642\u9593|\u30DB\u30D6\u30C9\u6642\u9593|\u30DC\u30B9\u30C8\u30FC\u30AF\u57FA\u5730\u6642\u9593|\u30DC\u30EA\u30D3\u30A2\u6642\u9593|\u30DD\u30F3\u30DA\u30A4\u6642\u9593|\u30DE\u30AC\u30C0\u30F3\u6642\u9593|\u30DE\u30C3\u30B3\u30FC\u30EA\u30FC\u5CF6\u6642\u9593|\u30DE\u30EB\u30B1\u30B5\u30B9\u6642\u9593|\u30DE\u30EC\u30FC\u30B7\u30A2\u6642\u9593|\u30DE\u30FC\u30B7\u30E3\u30EB\u5CF6\u6642\u9593|\u30DF\u30E3\u30F3\u30DE\u30FC\u6642\u9593|\u30E2\u30B9\u30AF\u30EF\u6A19\u6E96\u6642|\u30E2\u30EB\u30B8\u30D6\u6642\u9593|\u30E2\u30FC\u30BD\u30F3\u6642\u9593|\u30E2\u30FC\u30EA\u30B7\u30E3\u30B9\u6642\u9593|\u30E4\u30AF\u30FC\u30C4\u30AF\u6642\u9593|\u30E9\u30A4\u30F3\u8AF8\u5CF6\u6642\u9593|\u30EC\u30E6\u30CB\u30AA\u30F3\u6642\u9593|\u30ED\u30BC\u30E9\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u590F\u6642\u9593|\u30ED\u30FC\u30C9\u30CF\u30A6\u5CF6\u6A19\u6E96\u6642|\u30EF\u30EA\u30B9\u53CA\u3073\u30D5\u30C4\u30CA\u6642\u9593|\u4E2D\u56FD\u6A19\u6E96\u6642|\u4E2D\u592E\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u4E2D\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u4E2D\u90E8\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u590F\u6642\u9593\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4E2D\u90E8\u6A19\u6E96\u6642|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u30CE\u30FC\u30B6\u30F3\u30C6\u30EA\u30C8\u30EA\u30FC\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u4E2D\u90E8\u6A19\u6E96\u6642\\(\u5357\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2/\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u4ECF\u5357\u65B9\u9818\u304A\u3088\u3073\u5357\u6975\u6642\u9593|\u4ECF\u9818\u30AE\u30A2\u30CA\u6642\u9593|\u5354\u5B9A\u4E16\u754C\u6642|\u5357\u30A2\u30D5\u30EA\u30AB\u6A19\u6E96\u6642|\u5357\u30B8\u30E7\u30FC\u30B8\u30A2\u5CF6\u6A19\u6E96\u6642|\u5927\u897F\u6D0B\u590F\u6642\u9593|\u5927\u897F\u6D0B\u6A19\u6E96\u6642|\u592A\u5E73\u6D0B\u590F\u6642\u9593|\u592A\u5E73\u6D0B\u6A19\u6E96\u6642|\u5C71\u5730\u590F\u6642\u9593|\u5C71\u5730\u6A19\u6E96\u6642|\u65E5\u672C\u6A19\u6E96\u6642|\u662D\u548C\u57FA\u5730\u6642\u9593|\u6771\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u6771\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u6771\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u6771\u30C6\u30A3\u30E2\u30FC\u30EB\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u6771\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593|\u6771\u90E8\u590F\u6642\u9593\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u590F\u6642\u9593\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30AF\u30A4\u30FC\u30F3\u30BA\u30E9\u30F3\u30C9\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30BF\u30B9\u30DE\u30CB\u30A2\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30CB\u30E5\u30FC\u30B5\u30A6\u30B9\u30A6\u30A7\u30FC\u30EB\u30BA\\)|\u6771\u90E8\u6A19\u6E96\u6642\\(\u30D3\u30AF\u30C8\u30EA\u30A2\\)|\u6A3A\u592A\u6642\u9593|\u6E7E\u5CB8\u6A19\u6E96\u6642|\u82F1\u56FD\u590F\u6642\u9593|\u897F\u30A2\u30D5\u30EA\u30AB\u590F\u6642\u9593|\u897F\u30A2\u30D5\u30EA\u30AB\u6642\u9593|\u897F\u30A4\u30F3\u30C9\u30CD\u30B7\u30A2\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u590F\u6642\u9593|\u897F\u30B0\u30EA\u30FC\u30F3\u30E9\u30F3\u30C9\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u590F\u6642\u9593|\u897F\u30B5\u30E2\u30A2\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u590F\u6642\u9593|\u897F\u30E8\u30FC\u30ED\u30C3\u30D1\u6642\u9593|\u897F\u90E8\u6A19\u6E96\u6642\\(\u30AA\u30FC\u30B9\u30C8\u30E9\u30EA\u30A2\\)|\u97D3\u56FD\u6A19\u6E96\u6642|\u9999\u6E2F\u6642\u9593)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("s*(R");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("s*(R", timeZone0, locale0);
      try { 
        fastDateParser0.parse("s*(R");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"s*(R\" does not match (\\p{IsNd}++)\\*\\(
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("$gQ-`Y");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("$gQ-`Y", timeZone0, locale0);
      assertEquals("$gQ-`Y", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("(p{IsNd}{", timeZone0, locale0);
      assertEquals("(p{IsNd}{", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("&@:23H1\"N95@%q<Jv");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("{lAqF4I.UHVUcdi", timeZone0, locale0);
      assertEquals("{lAqF4I.UHVUcdi", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("}?~F|k", timeZone0, locale0);
      assertEquals("}?~F|k", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[G']*+d*+'|[^'A-Za-z]++");
      Locale locale0 = Locale.UK;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[G']*+d*+'|[^'A-Za-z]++", simpleTimeZone0, locale0);
      Object object0 = new Object();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("8#t? JW<!9");
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("8#t? JW<!9", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(607);
      assertEquals(2507, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-923), "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      Locale locale0 = Locale.ROOT;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", simpleTimeZone0, locale0);
      int int0 = fastDateParser0.adjustYear((-923));
      assertEquals(1077, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("a)g:7N1f:i)sy8");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("a)g:7N1f:i)sy8", timeZone0, locale0);
      assertEquals("a)g:7N1f:i)sy8", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("-S,LM9iIel", timeZone0, locale0);
      assertEquals("-S,LM9iIel", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("1ug", timeZone0, locale0);
      assertEquals("1ug", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(7, "2 doesnot match ");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("2 doesnot match ", simpleTimeZone0, locale0);
      assertEquals("2 doesnot match ", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(276, "FastDateParser[a>9DI%xJ+uqrd,zh,GMT]");
      Locale locale0 = Locale.KOREAN;
      FastDateParser fastDateParser0 = new FastDateParser("D3`Br>;r", simpleTimeZone0, locale0);
      assertEquals("D3`Br>;r", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1528, "org.apache.commons.lang3.time.FastDateParser$NumberStrategy");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("K4IC<x}/%]QF;{%o_P", simpleTimeZone0, locale0);
      assertEquals("K4IC<x}/%]QF;{%o_P", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("5<9", timeZone0, locale0);
      assertEquals("5<9", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("M6t\"@2m`");
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("M6t\"@2m`", timeZone0, locale0);
      assertEquals("M6t\"@2m`", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TAIWAN;
      FastDateParser fastDateParser0 = new FastDateParser("7ILyO[", timeZone0, locale0);
      assertEquals("7ILyO[", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(8, "9H'\",=ZN>yx5H@,;yn");
      Locale locale0 = new Locale("9H'\",=ZN>yx5H@,;yn", "9H'\",=ZN>yx5H@,;yn", "9H'\",=ZN>yx5H@,;yn");
      FastDateParser fastDateParser0 = new FastDateParser("9H'\",=ZN>yx5H@,;yn", simpleTimeZone0, locale0);
      assertEquals("9H'\",=ZN>yx5H@,;yn", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser(":<", timeZone0, locale0);
      assertEquals(":<", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser(";-}<Kd", timeZone0, locale0);
      assertEquals(";-}<Kd", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "<^%#tZwXVVIc", 2000, 0, 2000, 0, 2000, 0, 2000, 0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("<^%#tZwXVVIc", simpleTimeZone0, locale0);
      assertEquals("<^%#tZwXVVIc", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-918), "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s=|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Oa-z]++");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s=|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Oa-z]++", simpleTimeZone0, locale0);
      assertEquals("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s=|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Oa-z]++", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-340));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("^", timeZone0, locale0);
      assertEquals("^", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("_b JG5&@7G?]~eCg8e", timeZone0, locale0);
      assertEquals("_b JG5&@7G?]~eCg8e", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("M`t\"@2m'");
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("M`t\"@2m'", timeZone0, locale0);
      assertEquals("M`t\"@2m'", fastDateParser0.getPattern());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 06:52:49 GMT 2019
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.junit.runner.RunWith;

 
public class ExtendedMessageFormat_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<ChoiceFormat, DecimalFormat> hashMap0 = new HashMap<ChoiceFormat, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("ZD;&E{}oQSrqj1c", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 7: }
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, DecimalFormat> hashMap0 = new HashMap<String, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("khH(B\"", hashMap0);
      Format[] formatArray0 = new Format[0];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatsByArgumentIndex(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(" \t\n\r\f");
      String string0 = extendedMessageFormat0.toPattern();
      assertEquals(" \t\n\r\f", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(": ");
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormat((-1341), extendedMessageFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = new Locale(">#MF\"2[8", "6ZUp+Ik0|X1", "");
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat(">#MF\"2[8", locale0);
      Format[] formatArray0 = new Format[1];
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormats(formatArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, DecimalFormat> hashMap0 = new HashMap<Integer, DecimalFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("G'mgmLi9 \"D_H7", hashMap0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      // Undeclared exception!
      try { 
        extendedMessageFormat0.setFormatByArgumentIndex(2, decimalFormat0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("%WJ3{8}4", hashMap0);
      assertEquals("%WJ3{8}4", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("ZJA{8,t,}", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown format type: t
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("ZJ<{8,}", hashMap0);
      assertEquals("ZJ<{8}", extendedMessageFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      HashMap<Locale, MessageFormat> hashMap0 = new HashMap<Locale, MessageFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("vps-sO]7#*cU&DJ{7", locale0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 16
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("5':8_rB", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("dWJ3? {89 ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("WWJ3{8 ,<", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 8
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = new ExtendedMessageFormat("5':8_rB", locale0, hashMap0);
      // Undeclared exception!
      try { 
        extendedMessageFormat0.applyPattern("dWJ3? {89 dj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format argument index at position 7: 89 d
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, MockDateFormat> hashMap0 = new HashMap<Object, MockDateFormat>();
      ExtendedMessageFormat extendedMessageFormat0 = null;
      try {
        extendedMessageFormat0 = new ExtendedMessageFormat("ZJJ{8,{}", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated format element at position 6
         //
         verifyException("org.apache.commons.lang.text.ExtendedMessageFormat", e);
      }
  }
}

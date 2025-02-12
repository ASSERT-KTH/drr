/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 07:12:54 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class NumberUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = NumberUtils.stringToInt(" is not a valid number.");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      try { 
        NumberUtils.createNumber("n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // n is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0");
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.D");
      assertNotNull(number0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.E3");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        NumberUtils.createNumber("]MFY^AK!yA$blG!wE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ]MFY^AK!yA$blG!wE is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.Q[d[cekdOl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.Q[d[cekdOl is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5L");
      assertEquals(5L, number0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Wd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Wd is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        NumberUtils.createNumber("3Kvjwvb@PNEIVlb\",7f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 3Kvjwvb@PNEIVlb\",7f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        NumberUtils.createNumber("E{f_|u68G!$m&XL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // E{f_|u68G!$m&XL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-4l");
      assertEquals((-4L), number0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-pl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -pl is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("4F");
      assertEquals(4.0F, number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.F");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0F");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("4D");
      assertEquals(4.0, number0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        NumberUtils.createNumber("T=e|/paK?jE,6");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"T=e|\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.3");
      assertEquals(0.3F, number0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5E88");
      assertEquals(5.0E88, number0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5E818");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long long0 = NumberUtils.minimum(2763L, 0L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, (-1547), 0);
      assertEquals((-1547), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = NumberUtils.minimum(1, 1, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = NumberUtils.maximum((-284L), (long) 0, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1142L), (-1142L), 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = NumberUtils.maximum((-6135), (-1284), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = NumberUtils.compare(145.552802105, (double) 1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = NumberUtils.compare((-3875.9234612810264), (-1.0));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = NumberUtils.compare((double) (-1), (double) (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = NumberUtils.compare((-1.0F), (float) (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = NumberUtils.compare((-1.0F), (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = NumberUtils.compare((float) 0, (-219.2114F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0-v>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x,pQ8:=+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xE{f_|u68G!$m&XL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5E8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8e543.^LY}NH*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("59ee)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E{f_|u68G!$m&XL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+lbSNS0F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("1E-k|x{8m`tvd',o*Q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5EP");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5L");
      assertTrue(boolean0);
  }
}

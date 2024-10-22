/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 06:56:48 GMT 2019
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
      int int0 = NumberUtils.stringToInt("8E.2");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        NumberUtils.createNumber("e{6E2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"e{6E2\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5");
      assertNotNull(number0);
      assertEquals(5, number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // - is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--4MMPQ");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xv(eqj<jP'<?!}^cd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-v(eqj<jP'<?!}^cd\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".0");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        NumberUtils.createNumber("\"\" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber(",l-$<.o'g*JEI Axe");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0eF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eF is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("1D");
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        NumberUtils.createNumber("!.CdiObz&{}]vYI~[L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // !.CdiObz&{}]vYI~[L is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        NumberUtils.createNumber("v(eqj<jP'<?!}^cd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // v(eqj<jP'<?!}^cd is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("1f");
      assertEquals(1.0F, number0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-1L");
      assertEquals((-1L), number0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0L");
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-{1L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -{1L is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0F");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("8E2");
      assertEquals(800.0F, number0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long long0 = NumberUtils.minimum(2341L, 0L, 2341L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, (-1671L));
      assertEquals((-1671L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = NumberUtils.minimum(1, (-719), 3293);
      assertEquals((-719), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1L), 1994L, (-1L));
      assertEquals(1994L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long long0 = NumberUtils.maximum(1L, (long) 1, (long) 100);
      assertEquals(100L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 3533, 0);
      assertEquals(3533, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = NumberUtils.maximum(97, (-399), 1985);
      assertEquals(1985, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = NumberUtils.compare((-4087.0), (-4087.0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = NumberUtils.compare((double) (-21), 0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = NumberUtils.compare(2530.6928457965223, 1220.512);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = NumberUtils.compare(1.0F, (float) (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = NumberUtils.compare((float) 0, 1.0F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, (float) 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x*x/:^L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("org.apache.commons.lang.NumberUtils");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x1D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x9duLyf8B");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8EL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8E.2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("er9~6= [%v#dY;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8Ee2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+07");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6-(h>oaCC0}S!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("1D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("1f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0L");
      assertTrue(boolean0);
  }
}

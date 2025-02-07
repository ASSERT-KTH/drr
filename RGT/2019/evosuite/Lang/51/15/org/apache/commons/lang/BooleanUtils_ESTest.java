/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 09:28:18 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class BooleanUtils_ESTest {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isNotTrue(boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotTrue((Boolean) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("^vOr");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isFalse(boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2833, 2833, 2833, 2833);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(116);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(68);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Integer integer0 = new Integer((-317));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 863, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 2333, 70);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Integer integer0 = new Integer(76);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Integer integer0 = new Integer((-1911));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Integer integer0 = new Integer(46);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer(89);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-317), 1128, (-317), 1128);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(447, 0, 1341, 447);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1463, 1793, 786, (-2212));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Integer integer0 = new Integer(116);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Integer integer0 = new Integer((-3645));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Integer integer0 = new Integer((-266));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Integer integer0 = new Integer(69);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer((-1008));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 78, 78);
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-3645), 46);
      assertEquals((-3645), int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(116, 116, 110, 110);
      int int0 = BooleanUtils.toInteger(boolean0, 2343, 2343, 0);
      assertEquals(2343, int0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2833, 2833, 2833);
      assertEquals(2833, int0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Integer integer0 = new Integer((-331));
      Integer integer1 = new Integer(835);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      int int0 = BooleanUtils.toInteger(boolean0, (-331), (-2475), (-2884));
      assertEquals((-2475), int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(116, 116, 110, 110);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Integer integer0 = new Integer((-1744));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1744), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(76);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("omSj]vBR[v1R/i?5T[o");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(">*", ">*", "org.apache.commons.lang.math.NumberUtils", "&\"D#76<");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, ":i=&_bMcT|(Dl'd_*", "", ":i=&_bMcT|(Dl'd_*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", (String) null, "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "-0x", "The array must not contain any null elements", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("", (String) null, "Q`'7G%@Z^", "yt/^:N1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("^yr.J[*#~Y", "Xs", "", "^yr.J[*#~Y");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("omSj]vBR[v1R/i?5T[o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("OJ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yEg");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yl!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Y8e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("YeM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("^vOr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("tn&r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("TW:.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("%<D", "%<D", "%<D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "jxgRNhlWKf7;[");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "false", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "*DM?g4", "-~y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("%<D", "omsj]vbr[v1r/i?5t[o", "%<D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("r*HKCM", "%<D", ", '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("^vOr");
      Boolean[] booleanArray0 = new Boolean[6];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("^vOr");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      Boolean[] booleanArray0 = new Boolean[6];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean1;
      booleanArray0[3] = boolean1;
      booleanArray0[4] = boolean1;
      booleanArray0[5] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Array must not be null", "XO+OsU|mO", "The Array must not be null", "The Array must not be null");
      assertNotNull(boolean0);
      
      booleanArray0[0] = boolean0;
      Boolean boolean1 = Boolean.TRUE;
      booleanArray0[1] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }
}

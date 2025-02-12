/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 01:32:16 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.function.Consumer;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class MultidimensionalCounter_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      multidimensionalCounter_Iterator0.getCount();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertEquals((-1), multidimensionalCounter_Iterator0.getCount());
      assertArrayEquals(new int[] {(-1)}, intArray1);
      assertEquals(2534, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 8388607;
      intArray0[1] = 2927;
      intArray0[2] = 228;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      // Undeclared exception!
      try { 
        multidimensionalCounter_Iterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 111;
      intArray0[1] = 2523;
      intArray0[2] = (-732);
      intArray0[3] = 657;
      intArray0[4] = 2492;
      intArray0[5] = 2534;
      intArray0[6] = (-2271);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      // Undeclared exception!
      try { 
        multidimensionalCounter_Iterator0.getCount(2519);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2519
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2146;
      intArray0[1] = 10;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getDimension();
      assertEquals(2, int0);
      assertEquals(21460, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      multidimensionalCounter0.getSizes();
      assertEquals(2534, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getSize();
      assertEquals(2534, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multidimensionalCounter_Iterator0.forEachRemaining(consumer0);
      multidimensionalCounter_Iterator0.next();
      assertEquals(2534, multidimensionalCounter_Iterator0.getCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      MultidimensionalCounter multidimensionalCounter0 = null;
      try {
        multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-127);
      intArray0[1] = (-4513);
      intArray0[2] = (-4513);
      intArray0[3] = (-127);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts((-4513));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -4,513 out of [0, 2,084,554,305] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 8388607;
      intArray0[1] = 2927;
      intArray0[2] = 228;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int[] intArray1 = multidimensionalCounter0.getCounts(8388607);
      assertEquals(1844826404, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {12, 1668, 31}, intArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = (-3);
      intArray0[2] = (-3);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts(2096);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 2,096 out of [0, 9] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2534;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      String string0 = multidimensionalCounter0.toString();
      assertEquals("[0]", string0);
      assertEquals(2534, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2146;
      intArray0[1] = 10;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 2
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-5017);
      intArray0[1] = (-1);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      try { 
        multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -5,017 out of [0, -5,018] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 13;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      try { 
        multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 13 out of [0, 12] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }
}

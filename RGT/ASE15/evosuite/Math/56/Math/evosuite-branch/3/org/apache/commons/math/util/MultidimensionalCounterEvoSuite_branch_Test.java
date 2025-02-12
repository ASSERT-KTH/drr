/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:18:10 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultidimensionalCounterEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 3,648 out of [0, 3,647] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = (-837);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(700569, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-837), (-837)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -837 out of [0, -838] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = (-847);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(717409, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-847), (-847)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      // Undeclared exception!
      try {
        String string0 = multidimensionalCounter0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 2
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      String string0 = multidimensionalCounter0.toString();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(string0);
      assertEquals("[0]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 3413;
      intArray0[2] = int0;
      int[] intArray1 = new int[1];
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray1, intArray0);
      
      intArray1[0] = intArray0[2];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray1);
      assertEquals(3413, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3413}, intArray1);
      assertNotNull(multidimensionalCounter0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray1, intArray0);
      
      // Undeclared exception!
      try {
        int[] intArray2 = multidimensionalCounter0.getCounts(int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 3,413 out of [0, 3,413] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = (-234);
      intArray0[0] = int0;
      int int1 = 3413;
      intArray0[1] = int0;
      intArray0[2] = int1;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(186882228, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-234), (-234), 3413}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      int[] intArray1 = multidimensionalCounter0.getCounts(int1);
      assertEquals(186882228, multidimensionalCounter0.getSize());
      assertEquals(3, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {2688, 628993, 0}, intArray1);
      assertArrayEquals(new int[] {(-234), (-234), 3413}, intArray0);
      assertNotNull(intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(int1 == int0);
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = (-1);
      int int1 = 24;
      int[] intArray0 = new int[1];
      intArray0[0] = int1;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(24, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {24}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      // Undeclared exception!
      try {
        int[] intArray1 = multidimensionalCounter0.getCounts(int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1 out of [0, 24] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      MultidimensionalCounter multidimensionalCounter0 = null;
      try {
        multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = (-1);
      int[] intArray0 = new int[2];
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1), (-1)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1), (-1)}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1), (-1)}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = 1;
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[2] = intArray0[3];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1, 1, 1, 1}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1, 1, 1, 1}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1, 1, 1, 1, 1}, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      int int1 = multidimensionalCounter_Iterator0.getCount();
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1)}, intArray1);
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = (-1);
      int[] intArray0 = new int[2];
      intArray0[0] = int0;
      intArray0[1] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1), (-1)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1), (-1)}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      // Undeclared exception!
      try {
        multidimensionalCounter_Iterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = (-850);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(722500, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-850), (-850)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(722500, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-850), (-850)}, intArray0);
      assertNotNull(multidimensionalCounter_Iterator0);
      
      // Undeclared exception!
      try {
        int int1 = multidimensionalCounter_Iterator0.getCount(intArray0[1]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -850
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = (-837);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(700569, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-837), (-837)}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      int[] intArray1 = multidimensionalCounter0.getSizes();
      assertEquals(700569, multidimensionalCounter0.getSize());
      assertEquals(2, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-837), (-837)}, intArray0);
      assertArrayEquals(new int[] {(-837), (-837)}, intArray1);
      assertNotNull(intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      int int1 = multidimensionalCounter0.getDimension();
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 3648;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertNotNull(multidimensionalCounter0);
      
      int int1 = multidimensionalCounter0.getSize();
      assertEquals(3648, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {3648}, intArray0);
      assertTrue(int1 == int0);
      assertEquals(3648, int1);
  }
}

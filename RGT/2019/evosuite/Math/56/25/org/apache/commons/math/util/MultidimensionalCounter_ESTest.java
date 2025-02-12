/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 01:37:24 GMT 2019
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
      int[] intArray0 = new int[7];
      intArray0[0] = 978797792;
      intArray0[1] = 141;
      intArray0[2] = 1;
      intArray0[3] = (-796);
      intArray0[4] = 18;
      intArray0[5] = (-2123);
      intArray0[6] = (-3640);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      multidimensionalCounter_Iterator0.getCount();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 203;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertEquals((-1), multidimensionalCounter_Iterator0.getCount());
      assertEquals(203, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {(-1)}, intArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-582);
      intArray0[1] = (-1594);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
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
      int[] intArray0 = new int[4];
      intArray0[0] = (-540);
      intArray0[1] = 2123;
      intArray0[2] = 1719;
      intArray0[3] = (-1498);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      // Undeclared exception!
      try { 
        multidimensionalCounter_Iterator0.getCount((-540));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -540
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1424);
      intArray0[1] = (-3386);
      intArray0[2] = 203;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getDimension();
      assertEquals(978797792, multidimensionalCounter0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1424);
      intArray0[1] = (-3386);
      intArray0[2] = 203;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      multidimensionalCounter0.getSizes();
      assertEquals(978797792, multidimensionalCounter0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2535;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int int0 = multidimensionalCounter0.getSize();
      assertEquals(2535, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 203;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multidimensionalCounter_Iterator0.forEachRemaining(consumer0);
      multidimensionalCounter_Iterator0.next();
      assertEquals(203, multidimensionalCounter_Iterator0.getCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[7];
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
      int[] intArray0 = new int[1];
      intArray0[0] = 2410;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts((-3052));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -3,052 out of [0, 2,410] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 203;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      // Undeclared exception!
      try { 
        multidimensionalCounter0.getCounts(203);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 203 out of [0, 203] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      intArray0[1] = 1371;
      intArray0[2] = (-1120);
      intArray0[3] = (-589);
      intArray0[4] = 19;
      intArray0[5] = 181;
      intArray0[6] = 1;
      intArray0[7] = 1;
      intArray0[8] = (-5805);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      int[] intArray1 = multidimensionalCounter0.getCounts(19);
      assertEquals(1698832672, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {0, 1, 0, 53, 6, 75, 0, 0, 2147483623}, intArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 2410;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      String string0 = multidimensionalCounter0.toString();
      assertEquals(2410, multidimensionalCounter0.getSize());
      assertEquals("[0]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      intArray0[1] = 42;
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
      int[] intArray0 = new int[4];
      intArray0[0] = (-540);
      intArray0[1] = 2123;
      intArray0[2] = 1719;
      intArray0[3] = (-1498);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      try { 
        multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -540 out of [0, -541] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      intArray0[1] = 1371;
      intArray0[2] = (-1120);
      intArray0[3] = (-589);
      intArray0[4] = 19;
      intArray0[5] = 181;
      intArray0[6] = 1;
      intArray0[7] = 1;
      intArray0[8] = (-5805);
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      try { 
        multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 out of [0, 0] range
         //
         verifyException("org.apache.commons.math.util.MultidimensionalCounter", e);
      }
  }
}

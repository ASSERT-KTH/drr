/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:37:06 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

 
public class KeyedObjects2DEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      KeyedObjects2D keyedObjects2D2 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(1, keyedObjects2D2.getRowCount());
      assertEquals(1, keyedObjects2D2.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D2);
      assertTrue(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D2));
      assertNotNull(keyedObjects2D2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      KeyedObjects2D keyedObjects2D2 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D2.getRowCount());
      assertEquals(0, keyedObjects2D2.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D2);
      
      keyedObjects2D2.setObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D2.getRowCount());
      assertEquals(1, keyedObjects2D2.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D2);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D1, keyedObjects2D2);
      assertTrue(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D2));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D2));
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D2);
      assertEquals(1, keyedObjects2D2.getRowCount());
      assertEquals(1, keyedObjects2D2.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D2);
      assertTrue(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D2));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      List list0 = keyedObjects2D0.getColumnKeys();
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(list0);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      int int0 = keyedObjects2D1.getRowCount();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(0, int0);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(boolean0);
      
      keyedObjects2D1.setObject((Object) list0, (Comparable) int0, (Comparable) boolean0);
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      
      keyedObjects2D1.removeRow((Comparable) int0);
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      boolean boolean1 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean1 == boolean0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      
      KeyedObjects2D keyedObjects2D2 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D2.getColumnCount());
      assertEquals(0, keyedObjects2D2.getRowCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D2);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D2.setObject(object0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D2.getColumnCount());
      assertEquals(1, keyedObjects2D2.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D2);
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D2));
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D2);
      assertEquals(1, keyedObjects2D2.getColumnCount());
      assertEquals(1, keyedObjects2D2.getRowCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D2, keyedObjects2D0);
      assertNotSame(keyedObjects2D2, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D0, keyedObjects2D2);
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D2.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D2));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      List list0 = keyedObjects2D0.getColumnKeys();
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(list0);
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      int int0 = keyedObjects2D1.getRowCount();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(0, int0);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(boolean0);
      
      keyedObjects2D1.setObject((Object) list0, (Comparable) int0, (Comparable) boolean0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      boolean boolean1 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(boolean1 == boolean0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-20);
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffffec", string0);
      assertNotNull(string0);
      
      int int1 = keyedObjects2D0.getColumnIndex((Comparable) string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = 0;
      assertFalse(int2 == int1);
      
      Integer integer0 = new Integer(int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int2));
      assertEquals(0, (int)integer0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) integer0, (Comparable) integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int2));
      
      keyedObjects2D0.removeColumn((int) integer0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(integer0.equals((Object)int1));
      assertFalse(integer0.equals((Object)int0));
      assertTrue(integer0.equals((Object)int2));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      String string0 = Integer.toBinaryString(int0);
      assertEquals("0", string0);
      assertNotNull(string0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn((Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (0) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertTrue(boolean0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow((Comparable) boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (true) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 547;
      Integer integer0 = Integer.valueOf(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(547, (int)integer0);
      
      int int1 = 3191;
      keyedObjects2D0.addObject((Object) integer0, (Comparable) integer0, (Comparable) integer0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(integer0.equals((Object)int1));
      assertTrue(integer0.equals((Object)int0));
      assertFalse(int0 == int1);
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) integer0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      assertFalse(integer0.equals((Object)int1));
      assertTrue(integer0.equals((Object)int0));
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-20);
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffffec", string0);
      assertNotNull(string0);
      
      int int1 = keyedObjects2D0.getColumnIndex((Comparable) string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      Integer integer0 = new Integer(int0);
      assertFalse(int0 == int1);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertEquals((-20), (int)integer0);
      
      keyedObjects2D0.removeObject((Comparable) integer0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-20);
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffffec", string0);
      assertNotNull(string0);
      
      int int1 = keyedObjects2D0.getColumnIndex((Comparable) string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = null;
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject((Object) string0, (Comparable) int0, (Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparable<String> comparable0 = null;
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) comparable0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 547;
      Integer integer0 = Integer.valueOf(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(547, (int)integer0);
      
      int int1 = keyedObjects2D0.getRowIndex((Comparable) int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D0.addObject(object0, (Comparable) integer0, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int1 == int0);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertFalse(int0 == int1);
      
      keyedObjects2D0.addObject((Object) integer0, (Comparable) int1, (Comparable) integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertFalse(int0 == int1);
      
      Object object1 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertFalse(int0 == int1);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D1, (Comparable) int0, (Comparable) int0);
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      
      int int1 = keyedObjects2D0.getRowCount();
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(int1 == int0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, int1);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (1) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "%";
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.getObject((Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertSame(keyedObjects2D1, keyedObjects2D0);
      assertSame(keyedObjects2D0, keyedObjects2D1);
      assertNotNull(keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 1293;
      String string0 = Integer.toHexString(int0);
      assertEquals("50d", string0);
      assertNotNull(string0);
      
      Comparable<String> comparable0 = null;
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparable<Object> comparable0 = null;
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "%";
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (%) not recognised.
         //
      }
  }

  //@Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      String string0 = Integer.toBinaryString(int0);
      assertEquals("0", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = keyedObjects2D0.hashCode();
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertEquals(67403, int1);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      
      int int2 = 1;
      assertFalse(int2 == int1);
      
      Object object0 = keyedObjects2D0.getObject(int0, int2);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        Comparable comparable0 = keyedObjects2D0.getRowKey(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}

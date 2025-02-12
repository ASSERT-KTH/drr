/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:41:01 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

 
public class KeyedObjects2DEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D1.equals((Object) keyedObjects2D0);
      assertFalse(boolean0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.setObject((Object) integer0, (Comparable) int0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int1 = 508;
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D0.addObject(object0, (Comparable) int1, (Comparable) int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      
      keyedObjects2D0.removeColumn((Comparable) int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      Comparable<KeyedObjects> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (null) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 31;
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int1 = (-340);
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      int int1 = Integer.MIN_VALUE;
      assertEquals(Integer.MIN_VALUE, int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int1);
      assertFalse(int1 == int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 31;
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-4300);
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffef34", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D0.removeObject((Comparable) string0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      Comparable<Object> comparable0 = null;
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      // Undeclared exception!
      try {
        keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      Comparable<Integer> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.setObject((Object) integer0, (Comparable) int0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = 508;
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D0.addObject(object0, (Comparable) int1, (Comparable) int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      
      Object object1 = keyedObjects2D0.getObject((Comparable) int1, (Comparable) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(integer0.equals((Object)int1));
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.setObject((Object) integer0, (Comparable) int0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      keyedObjects2D0.removeColumn((Comparable) integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (2018) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.setObject((Object) integer0, (Comparable) int0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      Integer integer1 = (Integer)keyedObjects2D0.getObject((Comparable) int0, (Comparable) integer0);
      assertEquals(2018, (int)integer1);
      assertTrue(integer1.equals((Object)int0));
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertSame(integer1, integer0);
      assertSame(integer0, integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      String string0 = "z&kn\"-]BAb)\"kg";
      Integer integer0 = Integer.getInteger(string0);
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparable<Integer> comparable0 = null;
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
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = "p%";
      int int0 = (-68);
      Integer integer0 = new Integer(int0);
      assertEquals((-68), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (-68) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      keyedObjects2D0.setObject((Object) integer0, (Comparable) int0, (Comparable) int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = 508;
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D0.addObject(object0, (Comparable) int1, (Comparable) int1);
      assertFalse(int1 == int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotNull(keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertTrue(boolean0);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-4300);
      String string0 = Integer.toHexString(int0);
      assertEquals("ffffef34", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D1.addObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertFalse(boolean0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 31;
      // Undeclared exception!
      try {
        Comparable comparable0 = keyedObjects2D0.getRowKey(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 31, Size: 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 2018;
      Integer integer0 = new Integer(int0);
      assertEquals(2018, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn((Comparable) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (2018) not recognised.
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(871, int0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, int0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      
      List list0 = keyedObjects2D0.getRowKeys();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
      
      keyedObjects2D0.setObject((Object) list0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      
      keyedObjects2D0.removeRow((Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-4300);
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}

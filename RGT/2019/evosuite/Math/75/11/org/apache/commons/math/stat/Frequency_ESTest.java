/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 12:10:20 GMT 2019
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class Frequency_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      double double0 = frequency0.getCumPct((Object) integer0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      try { 
        frequency0.getPct((Object) frequency0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getPct(0L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount('F');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      long long0 = frequency0.getCumFreq('_');
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      double double0 = frequency0.getPct(1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      double double0 = frequency0.getCumPct('\'');
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      Iterator<Comparable<?>> iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      try { 
        frequency0.getCount((Object) iterator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap$KeyIterator cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.math.stat.Frequency", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      long long0 = frequency0.getCount(1047);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      double double0 = frequency0.getCumPct(0L);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      double double0 = frequency0.getPct(';');
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      double double0 = frequency0.getCumPct(0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      try { 
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class (org.apache.commons.math.stat.Frequency) does not implement Comparable
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1553);
      frequency0.addValue((Object) integer0);
      frequency0.addValue((-30));
      String string0 = frequency0.toString();
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-30\t1\t50%\t50%\n1553\t1\t50%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, (-3759), 1).when(comparator0).compare(anyString() , anyString());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      frequency0.addValue('j');
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf((-1370));
      long long0 = frequency0.getCount((Comparable<?>) integer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, (-3759), 1, (-3759)).when(comparator0).compare(anyString() , anyString());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      frequency0.addValue(comparable0);
      double double0 = frequency0.getCumPct((-1178));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      frequency0.addValue(0);
      long long0 = frequency0.getCumFreq(9);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1047);
      long long0 = frequency0.getCumFreq((-1923L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      Integer integer1 = new Integer((-198));
      frequency0.addValue((-2064L));
      long long0 = frequency0.getCumFreq((Object) integer1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(anyString() , anyString());
      Frequency frequency0 = new Frequency(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Frequency frequency1 = new Frequency();
      assertTrue(frequency1.equals((Object)frequency0));
      
      frequency0.addValue(comparable0);
      boolean boolean0 = frequency0.equals(frequency1);
      assertFalse(frequency1.equals((Object)frequency0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator<?>) null);
      boolean boolean0 = frequency0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long(0L);
      boolean boolean0 = frequency0.equals(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      boolean boolean0 = frequency0.equals(frequency1);
      assertTrue(boolean0);
  }
}

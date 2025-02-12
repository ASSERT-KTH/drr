/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:38:14 GMT 2014
 */

package org.apache.commons.math.stat;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class FrequencyEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = Integer.SIZE;
      assertEquals(32, int0);
      
      long long0 = (-115L);
      frequency0.addValue(long0);
      char char0 = ')';
      frequency0.addValue((int) char0);
      long long1 = frequency0.getCumFreq(int0);
      assertEquals(1L, long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'C';
      long long0 = frequency0.getCumFreq(char0);
      assertEquals(0L, long0);
      
      frequency0.addValue(long0);
      int int0 = (-7);
      double double0 = frequency0.getCumPct(int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'C';
      long long0 = frequency0.getCumFreq(char0);
      assertEquals(0L, long0);
      
      frequency0.addValue(long0);
      double double0 = frequency0.getCumPct((int) char0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = Integer.SIZE;
      assertEquals(32, int0);
      
      frequency0.addValue((Comparable<?>) int0);
      frequency0.addValue(int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = Integer.SIZE;
      assertEquals(32, int0);
      
      frequency0.addValue((long) int0);
      String string0 = frequency0.toString();
      assertNotNull(string0);
      assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = Integer.SIZE;
      assertEquals(32, int0);
      
      frequency0.addValue((Integer) int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      frequency0.clear();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'a';
      frequency0.addValue(char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'C';
      double double0 = frequency0.getCumPct((int) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = Integer.SIZE;
      assertEquals(32, int0);
      
      double double0 = frequency0.getPct(int0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      // Undeclared exception!
      try {
        frequency0.addValue((Object) frequency0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = ')';
      double double0 = frequency0.getPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'a';
      double double0 = frequency0.getCumPct(char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'C';
      long long0 = frequency0.getCount(char0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'a';
      double double0 = frequency0.getPct((long) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'C';
      long long0 = frequency0.getCumFreq(char0);
      assertEquals(0L, long0);
      
      frequency0.addValue(long0);
      Integer integer0 = new Integer((int) char0);
      assertEquals(67, (int)integer0);
      
      double double0 = frequency0.getPct((Object) integer0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'a';
      long long0 = frequency0.getCount((int) char0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      int int0 = 750;
      frequency0.addValue(int0);
      long long0 = frequency0.getCumFreq((Object) int0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      assertNotNull(frequency0);
      
      char char0 = 'a';
      double double0 = frequency0.getCumPct((long) char0);
      assertEquals(Double.NaN, double0, 0.01D);
  }
}

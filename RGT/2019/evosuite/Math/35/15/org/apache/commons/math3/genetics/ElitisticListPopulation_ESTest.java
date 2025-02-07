/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 17:24:46 GMT 2019
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.apache.commons.math3.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ElitisticListPopulation_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.addLast((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 2514, 1.0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
      assertEquals(1, population0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(1457, (-45.082));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-45.082)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 2511, 2511);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (2,511)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }
}

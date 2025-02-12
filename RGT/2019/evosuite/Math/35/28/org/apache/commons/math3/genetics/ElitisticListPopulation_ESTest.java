/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 17:34:48 GMT 2019
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
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, (-2231), (-2231));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // list of chromosomes bigger than maxPopulationSize
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertEquals(1, population0.getPopulationSize());
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(1, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-\u221E)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(850, 850);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (850)
         //
         verifyException("org.apache.commons.math3.genetics.ElitisticListPopulation", e);
      }
  }
}

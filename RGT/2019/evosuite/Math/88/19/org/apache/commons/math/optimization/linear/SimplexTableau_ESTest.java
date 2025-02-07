/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 17:30:22 GMT 2019
 */

package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.Relationship;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class SimplexTableau_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 111.3486);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
      double[][] doubleArray1 = simplexTableau0.getData();
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2449.8908343);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1100.4);
      // Undeclared exception!
      try { 
        simplexTableau0.setEntry(9, (-2027), 895.00388034);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (9, -2,027) in a 1x5 matrix
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(16, 16);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(realVectorImpl0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 16);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-3483.799787477255));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1853.433307));
      // Undeclared exception!
      try { 
        simplexTableau0.getSolution();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(16, 16);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(realVectorImpl0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 16);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1853.433307));
      int int0 = simplexTableau0.getNumDecisionVariables();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 719.6789131);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0);
      int int0 = simplexTableau0.getNumSlackVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2449.8908343);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1100.4);
      int int0 = simplexTableau0.getNumArtificialVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2722.39632741));
      simplexTableau0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 477.8286913783);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1.0E-12, relationship0, doubleArray0, 4074.78682424782);
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 419.98235);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-2257.1685959));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (-2257.1685959);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-2257.1685959));
      linkedList0.add(linearConstraint0);
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint1 = new LinearConstraint(realVectorImpl0, Double.NaN, relationship1, realVectorImpl0, Double.NaN);
      linkedList0.addFirst(linearConstraint1);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = null;
      try {
        simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2257.1685959));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 17.58586182975472);
      simplexTableau0.discardArtificialVariables();
      assertEquals(1, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 372.5234913787876);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(1);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(realVectorImpl0, (-2806.17), relationship0, realVectorImpl0, 372.5234913787876);
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1.0));
      simplexTableau0.numArtificialVariables = (-1);
      simplexTableau0.discardArtificialVariables();
      assertEquals(1, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 17.58586182975472);
      RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
      assertEquals(17.58586182975472, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, Double.POSITIVE_INFINITY);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.POSITIVE_INFINITY);
      simplexTableau0.divideRow(0, 0.0);
      assertEquals(0, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 17.58586182975472);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-129.40741869092));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1590.0);
      boolean boolean0 = simplexTableau0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-348.41315437667));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-348.41315437667));
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-348.41315437667));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 17.58586182975472);
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 17.58586182975472);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, false, (-129.40741869092));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 595.36797);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.1102230246251565E-16);
      Double[] doubleArray1 = new Double[8];
      doubleArray1[0] = (Double) doubleArray0[1];
      doubleArray1[1] = (Double) 10.0;
      doubleArray1[2] = (Double) 10.0;
      doubleArray1[3] = (Double) 2450.82;
      doubleArray1[4] = (Double) doubleArray0[0];
      doubleArray1[5] = (Double) 0.0;
      doubleArray1[6] = (Double) 2450.82;
      doubleArray1[7] = (Double) 2450.82;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-1583.591032));
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.1102230246251565E-16);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 595.36797);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.1102230246251565E-16);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 2450.82);
      linkedList0.addLast(linearConstraint0);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.1102230246251565E-16);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-129.40741869092));
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-129.40741869092));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 17.58586182975472);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-129.40741869092));
      LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, 195.011608855061);
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, false, (-129.40741869092));
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 595.36797);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.1102230246251565E-16);
      GoalType goalType1 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType1, false, 1.1102230246251565E-16);
      boolean boolean0 = simplexTableau0.equals(simplexTableau1);
      assertFalse(boolean0);
  }
}

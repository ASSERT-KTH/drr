/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:19:09 GMT 2014
 */

package org.apache.commons.math3.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.UnboundedSolutionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SimplexSolverEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertNotNull(simplexSolver0);
      
      int int0 = 6;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(int0, int0);
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01D);
      assertNotNull(openMapRealVector0);
      
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction((RealVector) openMapRealVector0, (double) int0);
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertNotNull(linearObjectiveFunction0);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      boolean boolean0 = false;
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertEquals(0, simplexSolver0.getIterations());
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(6, openMapRealVector0.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(6.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      assertEquals(100, simplexSolver0.getMaxIterations());
      assertEquals(0, simplexSolver0.getIterations());
      assertNotNull(simplexSolver0);
      
      double[] doubleArray0 = new double[24];
      double double0 = (-1402.7334078032434);
      doubleArray0[16] = double0;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, doubleArray0[4]);
      assertEquals(0.0, linearObjectiveFunction0.getConstantTerm(), 0.01D);
      assertNotNull(linearObjectiveFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1402.7334078032434), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      boolean boolean0 = true;
      try {
        PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, (Collection<LinearConstraint>) linkedList0, goalType0, boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
      }
  }
}

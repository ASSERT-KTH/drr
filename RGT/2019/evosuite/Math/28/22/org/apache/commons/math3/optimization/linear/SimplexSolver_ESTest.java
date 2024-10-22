/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 18:31:44 GMT 2019
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class SimplexSolver_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.38289396467489434, (-825));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-825);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-825));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship1).when(linearConstraint0).getRelationship();
      doReturn((double)100, 0.0, (-8.0E298), (double)(-825), (-8.0E298)).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      simplexSolver0.doOptimize();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-825.0), 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.38289396467489434, (-825));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-825);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-825));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, 0.0).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (double) (-851);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, 0.0, (-1.0), (-851.0)).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((-1.0), (double)(-851)).when(linearConstraint1).getValue();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      linkedList0.offerFirst(linearConstraint1);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = (double) (-851);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      Relationship relationship1 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship1).when(linearConstraint0).getRelationship();
      doReturn((double)100, 0.0, (-851.0), (-851.0), (double)(-851)).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-851.0));
      List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
      linkedList0.addAll((Collection<? extends LinearConstraint>) list0);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[19];
      doubleArray0[0] = (double) (-858);
      simplexSolver0.setMaxIterations(1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.GEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, 0.0, (-858.0), (-858.0)).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearConstraint linearConstraint1 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint1).getCoefficients();
      doReturn(relationship0).when(linearConstraint1).getRelationship();
      doReturn((-858.0), (double)(-858)).when(linearConstraint1).getValue();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      linkedList0.offerFirst(linearConstraint1);
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.38289396467489434, (-825));
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-825));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-825.0)).when(linearConstraint0).getValue();
      linkedList0.push(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
}

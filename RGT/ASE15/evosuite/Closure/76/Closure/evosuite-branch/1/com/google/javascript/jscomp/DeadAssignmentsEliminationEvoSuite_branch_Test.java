/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:44:06 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class DeadAssignmentsEliminationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(abstractCompiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) deadAssignmentsElimination0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      deadAssignmentsElimination0.exitScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(abstractCompiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      String string0 = "JSC_STRIP_TYPE_IyHERIT&EjROR";
      SyntheticAst syntheticAst0 = new SyntheticAst(string0);
      assertNotNull(syntheticAst0);
      
      Node node0 = syntheticAst0.getAstRoot(abstractCompiler0);
      assertEquals(false, node0.hasChildren());
      assertEquals(132, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        deadAssignmentsElimination0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(abstractCompiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) deadAssignmentsElimination0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      Node node0 = null;
      deadAssignmentsElimination0.visit(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }
}

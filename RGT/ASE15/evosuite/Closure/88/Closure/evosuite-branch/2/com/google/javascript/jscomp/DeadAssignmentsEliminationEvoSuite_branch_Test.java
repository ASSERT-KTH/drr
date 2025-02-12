/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:56:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class DeadAssignmentsEliminationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "function JSCompilerretunArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}";
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination((AbstractCompiler) compiler0);
      assertNotNull(deadAssignmentsElimination0);
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      deadAssignmentsElimination0.process(node0, node0);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }
}

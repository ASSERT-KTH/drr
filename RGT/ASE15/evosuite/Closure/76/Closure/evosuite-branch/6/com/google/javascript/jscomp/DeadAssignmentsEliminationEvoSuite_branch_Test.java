/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:36:59 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.jscomp.LoggerErrorManager;
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
      
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination((AbstractCompiler) compiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      int int0 = 127;
      String string0 = "\\22GX`";
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertNotNull(loggerErrorManager0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(127, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(127, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(127, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      
      deadAssignmentsElimination0.process(node0, node0);
      assertEquals(127, node0.getType());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(127, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(127, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }
}

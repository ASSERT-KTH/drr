/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:54:46 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GatherRawExports;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PeepholeReplaceKnownMethodsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getLength());
      assertEquals(37, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
      compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      assertNotNull(gatherRawExports0);
      
      node0.addChildToFront(node0);
      assertEquals(37, node0.getType());
      assertEquals(0, node0.getLength());
      assertEquals(37, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) gatherRawExports0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      peepholeReplaceKnownMethods0.beginTraversal(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertEquals(37, node1.getCharno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(151589, node1.getSourcePosition());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(true, node1.hasChildren());
      assertEquals(37, node1.getLineno());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isFromExterns());
      assertNull(node1.getSourceFileName());
      assertEquals(0, node1.getLength());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(37, node0.getType());
      assertEquals(0, node0.getLength());
      assertEquals(37, node0.getCharno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      int int0 = 37;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(0, node0.getChildCount());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(37, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertNotNull(node0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(37, node1.getCharno());
      assertEquals(37, node1.getType());
      assertNull(node1.getSourceFileName());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(0, node1.getLength());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isFromExterns());
      assertEquals(151589, node1.getSourcePosition());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(37, node1.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasChildren());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(37, node0.getCharno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(151589, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(37, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertNotNull(node1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      double double0 = 1476.57016617466;
      int int0 = (-682);
      Node node0 = Node.newNumber(double0, int0, int0);
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(39, node1.getType());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(-1, node1.getCharno());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isFromExterns());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node1);
  }
}

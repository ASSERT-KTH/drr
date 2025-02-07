/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:26:29 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockNullPointerException;
import org.junit.runner.RunWith;

 
public class PeepholeReplaceKnownMethodsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getSourcePosition());
      
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      node0.addChildToBack(node0);
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(-1, node0.getSourcePosition());
      
      // Undeclared exception!
      try {
        Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 37;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(37, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isQuotedString());
      assertEquals(-1, node1.getLineno());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasChildren());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getCharno());
      assertEquals(37, node1.getType());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(0, node1.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 3637;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(3637, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods();
      assertNotNull(peepholeReplaceKnownMethods0);
      
      Node node1 = peepholeReplaceKnownMethods0.optimizeSubtree(node0);
      assertNotNull(node1);
      assertSame(node0, node1);
      assertSame(node1, node0);
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(3637, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasOneChild());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(3637, node1.getType());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isOptionalArg());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getLineno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(0, node1.getLength());
  }
}

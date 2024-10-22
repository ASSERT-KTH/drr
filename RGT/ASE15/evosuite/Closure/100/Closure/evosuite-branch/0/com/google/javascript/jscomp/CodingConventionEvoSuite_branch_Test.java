/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:54:22 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeNative;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodingConventionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.INHERITS;
      Node node0 = null;
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = null;
      try {
        codingConvention_SubclassRelationship0 = new CodingConvention.SubclassRelationship(codingConvention_SubclassType0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = " f\\8erPeL";
      CodingConvention.DelegateRelationship codingConvention_DelegateRelationship0 = new CodingConvention.DelegateRelationship(string0, string0);
      assertNotNull(codingConvention_DelegateRelationship0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "KBy+zM|l[-1";
      int int0 = 1791;
      Node node0 = Node.newString(int0, string0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1791, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1791, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1791, node0.getLineno());
      
      CodingConvention.ObjectLiteralCast codingConvention_ObjectLiteralCast0 = new CodingConvention.ObjectLiteralCast(string0, node0);
      assertNotNull(codingConvention_ObjectLiteralCast0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1791, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1791, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1791, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = " f\\8erPeL";
      JSTypeNative jSTypeNative0 = JSTypeNative.CHECKED_UNKNOWN_TYPE;
      CodingConvention.AssertionFunctionSpec codingConvention_AssertionFunctionSpec0 = new CodingConvention.AssertionFunctionSpec(string0, jSTypeNative0);
      assertNotNull(codingConvention_AssertionFunctionSpec0);
      
      JSTypeNative jSTypeNative1 = codingConvention_AssertionFunctionSpec0.getAssertedType();
      assertSame(jSTypeNative1, jSTypeNative0);
      assertSame(jSTypeNative0, jSTypeNative1);
      assertEquals("CHECKED_UNKNOWN_TYPE", jSTypeNative1.toString());
      assertEquals(5, jSTypeNative1.ordinal());
      assertEquals("CHECKED_UNKNOWN_TYPE", jSTypeNative1.name());
      assertEquals(JSTypeNative.CHECKED_UNKNOWN_TYPE, jSTypeNative1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = " f\\8erPeL";
      JSTypeNative jSTypeNative0 = JSTypeNative.CHECKED_UNKNOWN_TYPE;
      CodingConvention.AssertionFunctionSpec codingConvention_AssertionFunctionSpec0 = new CodingConvention.AssertionFunctionSpec(string0, jSTypeNative0);
      assertNotNull(codingConvention_AssertionFunctionSpec0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertNotNull(node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(125, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      
      Node node1 = codingConvention_AssertionFunctionSpec0.getAssertedParam(node0);
      assertNotNull(node1);
      assertSame(node1, node0);
      assertSame(node0, node1);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.hasChildren());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertEquals(125, node1.getType());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.hasOneChild());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(125, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "";
      CodingConvention.AssertionFunctionSpec codingConvention_AssertionFunctionSpec0 = new CodingConvention.AssertionFunctionSpec(string0);
      assertNotNull(codingConvention_AssertionFunctionSpec0);
      
      String string1 = codingConvention_AssertionFunctionSpec0.getFunctionName();
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
      assertEquals("", string1);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 23:42:51 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureCodingConvention_ESTest extends ClosureCodingConvention_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      // Undeclared exception!
      try { 
        googleCodingConvention0.extractClassNameIfRequire((Node) null, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("left side of comparison");
      boolean boolean0 = closureCodingConvention0.isVarArgsParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("left side of comparison");
      String string0 = closureCodingConvention0.extractClassNameIfProvide(node0, node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getExportSymbolFunction();
      assertEquals("goog.exportSymbol", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newString("", 64, 0);
      boolean boolean0 = closureCodingConvention0.isOptionalParameter(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isSuperClassReference("com.google.javascript.jscomp.NameReferenceGraphConstruction$NameUse");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getAbstractMethodName();
      assertEquals("goog.abstractMethod", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      boolean boolean0 = closureCodingConvention0.isPrivate("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      String string0 = googleCodingConvention0.getExportPropertyFunction();
      assertEquals("goog.exportProperty", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      // Undeclared exception!
      try { 
        googleCodingConvention0.applySingletonGetter((FunctionType) null, (FunctionType) null, (ObjectType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      String string0 = closureCodingConvention0.getGlobalObject();
      assertEquals("goog.global", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Collection<CodingConvention.AssertionFunctionSpec> collection0 = closureCodingConvention0.getAssertionFunctions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.MIXIN;
      closureCodingConvention0.applySubclassRelationship((FunctionType) null, (FunctionType) null, codingConvention_SubclassType0);
      assertNull(closureCodingConvention0.getDelegateSuperclassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      CodingConvention.SubclassType codingConvention_SubclassType0 = CodingConvention.SubclassType.INHERITS;
      // Undeclared exception!
      try { 
        closureCodingConvention0.applySubclassRelationship((FunctionType) null, (FunctionType) null, codingConvention_SubclassType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      jSTypeArray0[0] = jSType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = closureCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = new Node(33);
      Node node1 = new Node(33, node0);
      // Undeclared exception!
      try { 
        googleCodingConvention0.getClassesDefinedByCall(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ClosureCodingConvention", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      MockPrintStream mockPrintStream0 = new MockPrintStream(">bFGZ&P/b=upq,h;8s");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = compiler0.parseSyntheticCode("goog.isFunction", "xy09MJN");
      CodingConvention.SubclassRelationship codingConvention_SubclassRelationship0 = googleCodingConvention0.getClassesDefinedByCall(node0);
      assertNull(codingConvention_SubclassRelationship0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      jSTypeArray0[0] = jSType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      List<String> list0 = closureCodingConvention0.identifyTypeDeclarationCall(node0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType[] jSTypeArray0 = new JSType[1];
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_FUNCTION_TYPE;
      JSType jSType0 = jSTypeRegistry0.getNativeType(jSTypeNative0);
      jSTypeArray0[0] = jSType0;
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs(jSTypeArray0);
      String string0 = closureCodingConvention0.getSingletonGetterClassName(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = new Node((-671));
      // Undeclared exception!
      try { 
        closureCodingConvention0.isPropertyTestFunction(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Node node0 = Node.newNumber((double) 37, 64, 40);
      Node node1 = new Node(37, node0, node0, node0, node0);
      boolean boolean0 = closureCodingConvention0.isPropertyTestFunction(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0, (Predicate<Scope.Var>) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0, (ScopeCreator) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("com.google.javascript.jscomp.NameReferenceGraphConstruction$NameUse");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      // Undeclared exception!
      try { 
        closureCodingConvention0.getObjectLiteralCast(nodeTraversal0, node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = Node.newNumber((double) 37, 37, 37);
      Node node1 = new Node(37, node0, node0, node0, node0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Compiler compiler0 = new Compiler();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      CodingConvention.ObjectLiteralCast codingConvention_ObjectLiteralCast0 = googleCodingConvention0.getObjectLiteralCast(nodeTraversal0, node1);
      assertNull(codingConvention_ObjectLiteralCast0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = Node.newNumber((double) 37, 37, 37);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      CodingConvention.Bind codingConvention_Bind0 = googleCodingConvention0.describeFunctionBind(node0);
      assertNull(codingConvention_Bind0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = Node.newNumber((double) 37, 37, 37);
      Node node1 = new Node(37, node0, node0, node0, node0);
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      CodingConvention.Bind codingConvention_Bind0 = googleCodingConvention0.describeFunctionBind(node1);
      assertNull(codingConvention_Bind0);
  }
}

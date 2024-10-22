/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 02:44:31 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      compiler0.parseSyntheticCode("!-TE7Qge'~{bpA<-.", "!-TE7Qge'~{bpA<-.");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Node node0 = Node.newString(43, "// Input %num%", 4095, 49);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      TypedScopeCreator typedScopeCreator0 = null;
      try {
        typedScopeCreator0 = new TypedScopeCreator(compiler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = compiler0.parseTestCode("cIm.google.javascrit.rhino.JSDoInfo$Visiilty");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      Node node1 = new Node(14, node0);
      Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
      assertEquals(1, scope1.getVarCount());
      assertEquals(34, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = compiler0.parseTestCode("com.g-ogle.javascript.rhino.JSDecI+fo$Visibility");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertFalse(scope0.isLocal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      compiler0.parseTestCode("cIm.google.javascrit.rhino.JSDoInfo$Visiilty");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      Node node0 = Node.newNumber(0.0, 50, 118);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      Node node0 = compiler0.parseTestCode("cIm.google.avascrit.rino.JSDoInfo$Visiilty");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, googleCodingConvention0);
      CompilerOptions compilerOptions0 = compiler0.options;
      Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
      compiler0.compile((List<JSSourceFile>) stack0, (List<JSSourceFile>) stack0, compilerOptions0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newString("", 108, 65023);
      node0.addSuppression("");
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertEquals(0, jSDocInfo0.getImplementedInterfaceCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.oo1xe.omon.bas.Jinir$2");
      Node node1 = new Node(14, node0);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node((-2733));
      Node node1 = new Node(38, node0, 1, 11);
      node1.addSuppression("%s (%s) must not be negative");
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0.getVisibility());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node((-2733));
      Node node1 = new Node(38, node0, 1, 11);
      node1.addChildToFront(node1);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node((-2733));
      Node node1 = new Node(38, node0, 1, 11);
      node0.addChildToFront(node1);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(86);
      node0.addChildToFront(node0);
      JSDocInfo jSDocInfo0 = TypedScopeCreator.getBestJSDocInfo(node0);
      assertNull(jSDocInfo0);
  }
}

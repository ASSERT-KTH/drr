/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 21:45:02 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowAnalysis;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MoveFunctionDeclarations;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControlFlowAnalysis_ESTest extends ControlFlowAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1", "com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph$1");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("h");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "h", "h");
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      Node node1 = new Node(107, node0, 35, (-35));
      controlFlowAnalysis0.process(node0, node1);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants(true);
      Node node0 = Node.newNumber((-1.0));
      Node node1 = new Node(49, node0, node0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0z^C#0J**;w'FFQpp", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      controlFlowAnalysis0.process(node0, node2);
      assertFalse(node2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(113, 113, 52);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      ControlFlowGraph<Node> controlFlowGraph0 = controlFlowAnalysis0.getCfg();
      assertNull(controlFlowGraph0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(114, 114, 52);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newString(108, "");
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, moveFunctionDeclarations0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(110, 110, 52);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(115, 115, 52);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(116, 116, 62);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(125, 125, 34);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(126, 126, 52);
      controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isInc());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(117, 117, 52);
      node0.addChildToFront(node0);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // CONTINUE 117 is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, controlFlowAnalysis0, (ScopeCreator) null);
      Node node0 = new Node(117, 117, 52);
      Node node1 = new Node(43, node0, node0, node0, 45, 1);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot find continue target.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = Node.newString(94, "");
      Node node1 = new Node(105, node0, node0, node0, node0);
      Node node2 = ControlFlowAnalysis.computeFollowNode(node0);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newNumber(3567.725894);
      node0.addChildrenToBack(node0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.computeFollowNode(node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newNumber((-1.0));
      Node node1 = new Node(1372, node0, 41, 47);
      Compiler compiler0 = new Compiler();
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(54, Node.LAST_PROP);
  }

//  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("h");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "h", "h");
      node0.addChildToBack(node0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, false, false);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = new Node(114, 114, 6);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.computeFallThrough(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, false, false);
      Node node0 = new Node(115, 115, 52);
      // Undeclared exception!
      try { 
        controlFlowAnalysis0.process(node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = Node.newNumber((-1.0));
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "$c}KMWy");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = Node.newString(125, "UDF.[p|UFYE#*t");
      node0.addChildToFront(node0);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, "UDF.[p|UFYE#*t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = new Node(110, 110, 46);
      boolean boolean0 = ControlFlowAnalysis.isBreakTarget(node0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis((AbstractCompiler) null, true, true);
      Node node0 = Node.newString(30, "~~:[4@'M{z/!8 /", (-132), 1612);
      controlFlowAnalysis0.process(node0, node0);
      assertEquals(8, Node.FLAG_NO_THROWS);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = Node.newString(94, "");
      Node node1 = new Node(37, node0, 52, 40);
      node0.addChildToFront(node1);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = Node.newNumber((-1.0));
      Node node1 = new Node(52, node0, node0, node0, 38, 42);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0z^C#0J**;w'FFQpp", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ControlFlowAnalysis controlFlowAnalysis0 = new ControlFlowAnalysis(compiler0, true, false);
      controlFlowAnalysis0.process(node0, node1);
      assertFalse(node1.isBreak());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = Node.newString(86, "UDF.[p|UFYE#*t");
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = Node.newString(94, "");
      Node node1 = new Node(102, node0, node0, node0, node0);
      node0.addChildToFront(node1);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Node.newString(125, "UDF.[p|UFYE#*t");
      Node node1 = new Node(103, node0, node0, node0, node0);
      Node node2 = peepholeSimplifyRegExp0.optimizeSubtree(node1);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = Node.newString(94, "");
      Node node1 = new Node(105, node0, node0, node0, node0);
      boolean boolean0 = ControlFlowAnalysis.mayThrowException(node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(113, 113, 52);
      boolean boolean0 = ControlFlowAnalysis.isBreakStructure(node0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = new Node(115, 115, 52);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.isBreakTarget(node0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ControlFlowAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = new Node(113, 113, 52);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = new Node(115, 115, 0);
      boolean boolean0 = ControlFlowAnalysis.isContinueStructure(node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("U", "U");
      Node node1 = ControlFlowAnalysis.getExceptionHandler(node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = Node.newString(94, "");
      Node node1 = new Node(105, node0, node0, node0, node0);
      Node node2 = ControlFlowAnalysis.getExceptionHandler(node1);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = Node.newString(125, "UDF.[p|UFYE#*t");
      Node node1 = new Node(110, node0, node0, node0, node0);
      // Undeclared exception!
      try { 
        ControlFlowAnalysis.getExceptionHandler(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = Node.newString(125, "UDF.[p|UFYE#*t");
      node0.addChildToFront(node0);
      // Undeclared exception!
      ControlFlowAnalysis.getExceptionHandler(node0);
  }
}

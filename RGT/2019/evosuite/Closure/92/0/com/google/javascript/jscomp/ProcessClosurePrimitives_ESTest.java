/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 04:58:50 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckMissingReturn;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseSyntheticCode("s6f6 |En#IcHA*", "goog.base");
      processClosurePrimitives0.process(node0, node0);
      assertTrue(compiler0.hasErrors());
      assertEquals(1, compiler0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("S-8cE*&mE`#MW~R}Mn");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(30);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      Node node1 = new Node(37, node0, node0, node0);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node1);
      assertFalse(node1.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseSyntheticCode("s6f6 |En#IcHA*", "inWalid=asts");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(4095, Node.COLUMN_MASK);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      MockPrintStream mockPrintStream0 = new MockPrintStream("s6f6 |En#IcHA*");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = Node.newString("s6f6 |En#IcHA*", 105, 105);
      Node node1 = new Node(105, node0, 0, 40);
      node0.addChildAfter(node1, node1);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(42, Node.IS_CONSTANT_NAME);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      MockPrintStream mockPrintStream0 = new MockPrintStream("s6f6 |En#IcHA*");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = compiler0.parseSyntheticCode("s6f6 |En#IcHA*", "s6f6 |En#IcHA*");
      Node node1 = new Node(105, node0, 0, 40);
      node0.addChildAfter(node1, node1);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // BLOCK [sourcename: java.lang.String@0000000310] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(lightweightMessageFormatter0, (Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = compiler0.parseSyntheticCode("s6f6 |En#IcHA*", "org.w3c.dom.Node");
      processClosurePrimitives0.process(node0, node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      CheckMissingReturn checkMissingReturn0 = new CheckMissingReturn(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkMissingReturn0);
      Node node0 = new Node(86, 86, 86);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("S-8cE*&mE`#MW~R}Mn");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = new Node(30);
      processClosurePrimitives0.process(node0, node0);
      assertEquals(29, Node.VAR_ARGS_NAME);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = new Node(30);
      Node node1 = new Node(41);
      node0.addChildrenToBack(node1);
      processClosurePrimitives0.process(node0, node0);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }
}

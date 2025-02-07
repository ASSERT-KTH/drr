/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 06:07:27 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("jO0h9LeCr0B}Z");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("require");
      Node node1 = compiler0.parseSyntheticCode("1c", "goog.base");
      processClosurePrimitives0.process(node0, node1);
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
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      SyntheticAst syntheticAst0 = new SyntheticAst((String) null);
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(30, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ReplaceStrings$Location");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node1 = new Node(37, node0, node0, 15, 44);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(49, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ReplaceStrings$Location");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("jO0h9LeCr0B}Z");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("require");
      Node node1 = compiler0.parseSyntheticCode("require", "gog.ha=Ye");
      processClosurePrimitives0.process(node0, node1);
      assertTrue(node1.hasOneChild());
      assertEquals(1, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Nested loops are forbidden", "bad left operand to bitwise operator");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      Node node0 = compiler0.parseSyntheticCode("bad left operand to bitwise operator", "Nested loops are forbidden");
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node1 = new Node(86, 86, 86);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0, (ScopeCreator) null);
      processClosurePrimitives0.visit(nodeTraversal0, node1, node0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("76J,m");
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Node node1 = new Node(30, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertFalse(node1.isQualifiedName());
  }
}

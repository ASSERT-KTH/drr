/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 06:21:57 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProcessClosurePrimitives_ESTest extends ProcessClosurePrimitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseSyntheticCode("3", "goog.base");
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
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseSyntheticCode("3", "pattern.flags");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(18, Node.SPECIAL_PROP_PROP);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, true);
      Node node0 = new Node(86, 86, 86);
      Node node1 = new Node(30, node0, node0);
      processClosurePrimitives0.process(node1, node1);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("ZoME15K'fK$^rQYV");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      Node node0 = new Node(37, 0, 211);
      // Undeclared exception!
      try { 
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ProcessClosurePrimitives", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(30, node0, node0, node0, 37, 24);
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, processClosurePrimitives0);
      processClosurePrimitives0.visit(nodeTraversal0, node0, node1);
      assertEquals(22, Node.TARGETBLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      Node node0 = compiler0.parseTestCode("com.gogle.common.base.CharMatcher");
      processClosurePrimitives0.process(node0, node0);
      assertEquals(47, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(105, "OTECTED");
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Node node1 = new Node(30, node0, node0, node0, 37, 24);
      node1.removeFirstChild();
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, false);
      processClosurePrimitives0.process(node1, node1);
      assertFalse(node1.wasEmptyNode());
  }
}

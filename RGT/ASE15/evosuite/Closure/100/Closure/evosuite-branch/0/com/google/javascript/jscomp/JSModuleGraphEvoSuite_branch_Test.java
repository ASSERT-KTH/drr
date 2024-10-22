/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:15:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import java.io.File;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

 
public class JSModuleGraphEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = " not found in graph";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModule0);
      
      JSModule[] jSModuleArray0 = new JSModule[4];
      jSModuleArray0[0] = jSModule0;
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModuleArray0[0].getName());
      assertEquals(" not found in graph", jSModuleArray0[0].toString());
      assertNotNull(jSModuleArray0[0]);
      
      jSModuleArray0[1] = jSModule0;
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModuleArray0[1].getName());
      assertEquals(" not found in graph", jSModuleArray0[1].toString());
      assertNotNull(jSModuleArray0[1]);
      
      jSModuleArray0[2] = jSModule0;
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModuleArray0[2].toString());
      assertEquals(" not found in graph", jSModuleArray0[2].getName());
      assertNotNull(jSModuleArray0[2]);
      
      jSModuleArray0[3] = jSModuleArray0[0];
      assertEquals(" not found in graph", jSModuleArray0[3].getName());
      assertEquals(" not found in graph", jSModuleArray0[3].toString());
      assertNotNull(jSModuleArray0[3]);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      assertNotNull(jSModuleGraph0);
      
      MockFile mockFile0 = new MockFile(string0, string0);
      assertNotNull(mockFile0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0);
      assertEquals(" not found in graph/ not found in graph", jSSourceFile0.getOriginalPath());
      assertEquals(" not found in graph/ not found in graph", jSSourceFile0.getName());
      assertNotNull(jSSourceFile0);
      
      jSModuleArray0[0].addFirst(jSSourceFile0);
      assertEquals(" not found in graph/ not found in graph", jSSourceFile0.getOriginalPath());
      assertEquals(" not found in graph/ not found in graph", jSSourceFile0.getName());
      
      jSModuleGraph0.coalesceDuplicateFiles();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = null;
      JSModule jSModule0 = new JSModule(string0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertNotNull(jSModule0);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(jSModuleGraph0);
      
      Set<JSModule> set0 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
      
      Set<JSModule> set1 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals(true, set1.isEmpty());
      assertEquals(0, set1.size());
      assertSame(set1, set0);
      assertNotNull(set1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = " not found in graph";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModule0.getName());
      assertNotNull(jSModule0);
      
      JSModule[] jSModuleArray0 = new JSModule[4];
      jSModuleArray0[0] = jSModule0;
      assertEquals(" not found in graph", jSModuleArray0[0].toString());
      assertEquals(" not found in graph", jSModuleArray0[0].getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModule0.getName());
      assertNotNull(jSModuleArray0[0]);
      
      jSModuleArray0[1] = jSModule0;
      assertEquals(" not found in graph", jSModuleArray0[1].toString());
      assertEquals(" not found in graph", jSModuleArray0[1].getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModule0.getName());
      assertNotNull(jSModuleArray0[1]);
      
      jSModuleArray0[2] = jSModule0;
      assertEquals(" not found in graph", jSModuleArray0[2].toString());
      assertEquals(" not found in graph", jSModuleArray0[2].getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModule0.getName());
      assertNotNull(jSModuleArray0[2]);
      
      jSModuleArray0[3] = jSModuleArray0[0];
      assertEquals(" not found in graph", jSModuleArray0[3].getName());
      assertEquals(" not found in graph", jSModuleArray0[3].toString());
      assertNotNull(jSModuleArray0[3]);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      assertNotNull(jSModuleGraph0);
      
      JSModule jSModule1 = new JSModule(string0);
      assertFalse(jSModule1.equals((Object)jSModule0));
      assertEquals(" not found in graph", jSModule1.toString());
      assertEquals(" not found in graph", jSModule1.getName());
      assertNotSame(jSModule1, jSModule0);
      assertNotNull(jSModule1);
      
      // Undeclared exception!
      try {
        JSModule jSModule2 = jSModuleGraph0.getDeepestCommonDependencyInclusive(jSModule1, jSModuleArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      String string0 = null;
      JSModule jSModule0 = new JSModule(string0);
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      assertNotNull(jSModule0);
      
      boolean boolean0 = linkedList0.add(jSModule0);
      assertEquals(1, linkedList0.size());
      assertEquals("[null]", linkedList0.toString());
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      assertTrue(boolean0);
      
      boolean boolean1 = linkedList0.add(jSModule0);
      assertTrue(boolean1 == boolean0);
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      assertTrue(boolean1);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) linkedList0);
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      assertNotNull(jSModuleGraph0);
      
      JSModule jSModule1 = jSModuleGraph0.getDeepestCommonDependencyInclusive((Collection<JSModule>) linkedList0);
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      assertNull(jSModule1.getName());
      assertNull(jSModule1.toString());
      assertSame(jSModule1, jSModule0);
      assertNotNull(jSModule1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      String string0 = null;
      JSModule jSModule0 = new JSModule(string0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertNotNull(jSModule0);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) linkedList0);
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(jSModuleGraph0);
      
      Set<JSModule> set0 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertEquals(0, set0.size());
      assertEquals(true, set0.isEmpty());
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(set0);
      
      boolean boolean0 = jSModuleGraph0.dependsOn(jSModule0, jSModule0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertNotNull(jSModule0);
      
      JSModule jSModule1 = null;
      jSModule0.addDependency(jSModule1);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      
      JSModule[] jSModuleArray0 = new JSModule[11];
      jSModuleArray0[0] = jSModule0;
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertEquals("", jSModuleArray0[0].getName());
      assertEquals("", jSModuleArray0[0].toString());
      assertNotNull(jSModuleArray0[0]);
      
      JSModuleGraph jSModuleGraph0 = null;
      try {
        jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = " not found in graph";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModule0);
      
      JSModule[] jSModuleArray0 = new JSModule[4];
      jSModuleArray0[0] = jSModule0;
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModuleArray0[0].toString());
      assertEquals(" not found in graph", jSModuleArray0[0].getName());
      assertNotNull(jSModuleArray0[0]);
      
      jSModuleArray0[1] = jSModule0;
      assertEquals(" not found in graph", jSModuleArray0[1].toString());
      assertEquals(" not found in graph", jSModuleArray0[1].getName());
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModuleArray0[1]);
      
      jSModuleArray0[2] = jSModule0;
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertEquals(" not found in graph", jSModuleArray0[2].getName());
      assertEquals(" not found in graph", jSModuleArray0[2].toString());
      assertNotNull(jSModuleArray0[2]);
      
      jSModuleArray0[3] = jSModule0;
      assertEquals(" not found in graph", jSModuleArray0[3].toString());
      assertEquals(" not found in graph", jSModuleArray0[3].getName());
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModuleArray0[3]);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      assertNotNull(jSModuleGraph0);
      
      JSModule jSModule1 = jSModuleGraph0.getDeepestCommonDependency(jSModule0, jSModuleArray0[0]);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNull(jSModule1);
      
      jSModuleArray0[3].addDependency(jSModule1);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      
      JSModule jSModule2 = new JSModule(string0);
      assertFalse(jSModule2.equals((Object)jSModule0));
      assertEquals(" not found in graph", jSModule2.toString());
      assertEquals(" not found in graph", jSModule2.getName());
      assertNotSame(jSModule2, jSModule0);
      assertNotNull(jSModule2);
      
      // Undeclared exception!
      try {
        JSModule jSModule3 = jSModuleGraph0.getDeepestCommonDependencyInclusive(jSModule2, jSModuleArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertNotNull(jSModule0);
      
      JSModuleGraph.ModuleDependenceException jSModuleGraph_ModuleDependenceException0 = new JSModuleGraph.ModuleDependenceException(string0, jSModule0, jSModule0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertNotNull(jSModuleGraph_ModuleDependenceException0);
      
      JSModule jSModule1 = jSModuleGraph_ModuleDependenceException0.getModule();
      assertEquals("", jSModule1.getName());
      assertEquals("", jSModule1.toString());
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertSame(jSModule1, jSModule0);
      assertSame(jSModule0, jSModule1);
      assertNotNull(jSModule1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = " not found in graph";
      JSModule jSModule0 = new JSModule(string0);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModule0);
      
      JSModuleGraph.ModuleDependenceException jSModuleGraph_ModuleDependenceException0 = new JSModuleGraph.ModuleDependenceException(string0, jSModule0, jSModule0);
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertNotNull(jSModuleGraph_ModuleDependenceException0);
      
      JSModule jSModule1 = jSModuleGraph_ModuleDependenceException0.getDependentModule();
      assertEquals(" not found in graph", jSModule1.toString());
      assertEquals(" not found in graph", jSModule1.getName());
      assertEquals(" not found in graph", jSModule0.getName());
      assertEquals(" not found in graph", jSModule0.toString());
      assertSame(jSModule1, jSModule0);
      assertSame(jSModule0, jSModule1);
      assertNotNull(jSModule1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(jSModuleGraph0);
      
      Iterable<JSModule> iterable0 = jSModuleGraph0.getAllModules();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      assertEquals("[]", stack0.toString());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.empty());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertNotNull(stack0);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) stack0);
      assertEquals("[]", stack0.toString());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.empty());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertNotNull(jSModuleGraph0);
      
      int int0 = jSModuleGraph0.getModuleCount();
      assertEquals("[]", stack0.toString());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.empty());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertNotNull(stack0);
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) stack0);
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertNotNull(jSModuleGraph0);
      
      // Undeclared exception!
      try {
        JSModule jSModule0 = jSModuleGraph0.getRootModule();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 10:42:05 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NameAnalyzer_ESTest extends NameAnalyzer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
      Node node0 = compiler0.parseTestCode("function JSCompiler_et(JSCompiler_set_name) {  return function(JSCmpiler_set_value) {this[JSCompiler_set_name] = JxCompiler_set_value}}");
      Node node1 = new Node(37, node0);
      nameAnalyzer0.process(node0, node1);
      String string0 = nameAnalyzer0.getHtmlReport();
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"JSCompiler_et\">JSCompiler_et</a><ul><li>REFERENCED BY: </li></ul></li><li><a name=\"window\">window</a><ul><li>REFERS TO: <a href=\"#JSCompiler_et\">JSCompiler_et</a></li></ul></li></ul></body></html>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JxCompiler_st_value}}");
      Node node1 = new Node(2, node0, node0, node0, node0, 1, 16);
      nameAnalyzer0.process(node1, node0);
      assertFalse(node0.hasOneChild());
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JxCompiler_set_value}}");
      Node node1 = new Node(3049, node0, node0, 2, 5);
      nameAnalyzer0.process(node0, node1);
      nameAnalyzer0.process(node0, node1);
      assertEquals(0, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("BwmHA.ad@r");
      Node node1 = new Node(86, node0, node0);
      nameAnalyzer0.process(node0, node1);
      assertFalse(node0.isName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer((AbstractCompiler) null, true);
      Node node0 = Node.newString((-962), "X");
      Node node1 = new Node(49, node0, node0);
      nameAnalyzer0.process(node0, node1);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.NameAnalyzer$ProcessExternals");
      nameAnalyzer0.process(node0, node0);
      assertEquals(41, Node.BRACELESS_TYPE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("window");
      nameAnalyzer0.process(node0, node0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {ths[JSCompiler_set_name] = JxComiler_set_value}}");
      nameAnalyzer0.process(node0, node0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
      Node node0 = compiler0.parseTestCode("function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JxCompiler_st_value}}");
      nameAnalyzer0.process(node0, node0);
      assertTrue(node0.hasOneChild());
      
      String string0 = nameAnalyzer0.getHtmlReport();
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"JSCompiler_set\">JSCompiler_set</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string0);
  }
}

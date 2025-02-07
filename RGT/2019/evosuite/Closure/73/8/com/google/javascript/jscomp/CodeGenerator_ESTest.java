/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 11:42:14 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, (Charset) null);
      codeGenerator0.addList((Node) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.tagAsStrict();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = new Node(26);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addLeftExpr(node0, 7680, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString(6, "\t", 6, 6);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for ifeq (type 6)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("9");
      assertEquals(9.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("\t");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        codeGenerator0.addArrayList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, (Charset) null);
      Node node0 = Node.newString("9");
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(51, 51, 51);
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(60, nodeArray0);
      // Undeclared exception!
      try { 
        codeGenerator0.addAllSiblings(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("OiPB3@\";^#", charsetEncoder0);
      assertEquals("'OiPB3@\";^#'", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("Hg-MfrX'NN", charsetEncoder0);
      assertEquals("\"Hg-MfrX'NN\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\u0000E=iE=i'`,BCQgn>A(`,BCQgn>A(\u0000");
      assertEquals("/\\0E=iE=i'`,BCQgn>A(\\u007f`,BCQgn>A(\\u007f\\0/", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\t");
      assertEquals("\"\\t\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("\n", '\u0001', "\n", "\n", "7|^", (CharsetEncoder) null);
      assertEquals("\u0001\\n\u0001", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\rE=i`,BCQgn>A(\r");
      assertEquals("/\\rE=i`,BCQgn>A(\\u007f\\r/", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("X>6.iJ.+M:]z3#J", '@', ";e0Bf$", "X>6.iJ.+M:]z3#J", ";e0Bf$", charsetEncoder0);
      assertEquals("@X>6.iJ.+M:]z3#J@", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("zj9d`2]>BsMz");
      assertEquals("/zj9d`2]>BsMz/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("zjaHd]]>Mz");
      assertEquals("\"zjaHd]]\\>Mz\"", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CodeGenerator.strEscape("6p</script&x", '$', "ViWfGivHCbBVC#`", "$E=i`,BCQgn>A($", "Hd+5", (CharsetEncoder) null);
      assertEquals("$6p<\\/script&x$", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("/<!--m.google.javascript.jscomp.CollapseAnonymousFunctions$CallbackgirUV?e~<sgirUV?e~'yD2P1yD2P1/");
      assertEquals("//<\\!--m.google.javascript.jscomp.CollapseAnonymousFunctions$CallbackgirUV?e~<sgirUV?e~'yD2P1yD2P1//", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\u001BE=i`,BCQgn>A(\u001B");
      assertEquals("/\\u001bE=i`,BCQgn>A(\\u007f\\u001b/", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape(" \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000B2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000B2\u001C.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000B2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000B2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000B2\u001F.google.protobuf.ServiceOptions\"\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018");
      assertEquals(" \\u0001(\\u0009\\u00128\\u000a\\u0005value\\u0018\\u0002 \\u0003(\\u000b2).google.protobuf.EnumValueDescriptorProto\\u0012-\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001c.google.protobuf.EnumOptions\"l\\u000a\\u0018EnumValueDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u0012\\u000e\\u000a\\u0006number\\u0018\\u0002 \\u0001(\\u0005\\u00122\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2!.google.protobuf.EnumValueOptions\"\\u0090\\u0001\\u000a\\u0016ServiceDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u00126\\u000a\\u0006method\\u0018\\u0002 \\u0003(\\u000b2&.google.protobuf.MethodDescriptorProto\\u00120\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001f.google.protobuf.ServiceOptions\"\\u007f\\u000a\\u0015MethodDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("");
      assertEquals("", string0);
  }
}

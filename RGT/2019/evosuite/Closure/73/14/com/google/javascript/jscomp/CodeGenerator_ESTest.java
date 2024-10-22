/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 11:55:56 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = new Node(4363, 4363, 4363);
      Node node1 = new Node(25, node0, node0, node0);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.PRESERVE_BLOCK;
      // Undeclared exception!
      try { 
        codeGenerator0.addLeftExpr(node1, 20, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = new Node(1919);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for <unknown=1919> (type 1919)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("oO");
      String string0 = compiler0.toSource(node0);
      assertEquals("oO", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node[] nodeArray0 = new Node[0];
      Node node0 = new Node(0, nodeArray0);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addList((Node) null, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)28, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)4, "o!O", (int) (byte)4, (int) (byte)4);
      String string0 = compiler0.toSource(node0);
      assertEquals("return", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)6, "o!O", (int) (byte)6, (int) (byte)6);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 6
         // IFEQ o!O 6
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)8, (byte)8, 394);
      String string0 = compiler0.toSource(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)13, (byte)8, 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 13
         // NE 8
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)15, "o!O", (int) (byte)15, (int) (byte)15);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 15
         // LE o!O 15
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)17, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 17
         // GE
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)18, "o!O", (int) (byte)18, (int) (byte)18);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 18
         // LSH o!O 18
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)19, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 19
         // RSH
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)24, (byte)8, 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 24
         // DIV 8
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)26, "o!O", (int) (byte)26, (int) (byte)26);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)32, "o!O", (int) (byte)32, (int) (byte)32);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)34, (byte)8, 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 34
         // SETPROP 8
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("\"o!O\"");
      String string0 = compiler0.toSource(node0);
      assertEquals("\"o!O\\u007f\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)42, (byte) (-3), 394);
      String string0 = compiler0.toSource(node0);
      assertEquals("this", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("/o!O/");
      String string0 = compiler0.toSource(node0);
      assertEquals("/o!O\\u007f/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)48, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 48
         // BINDNAME
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)49, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)50, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 50
         // RETHROW
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)53, "o!O", (int) (byte)53, (int) (byte)53);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 53
         // LOCAL_LOAD o!O 53
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)55, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 55
         // SETVAR
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)56, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 56
         // CATCH_SCOPE
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)57, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 57
         // ENUM_INIT_KEYS
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)61, "o!O", (int) (byte)61, (int) (byte)61);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 61
         // THISFN o!O 61
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)62, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 62
         // RETURN_RESULT
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)64, (byte) (-3), 394);
      String string0 = compiler0.toSource(node0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)69, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)71, (byte)0, 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 71
         // ESCXMLATTR 0
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

////  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)90, (byte) (-3), 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 90
         // ASSIGN_LSH
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString((int) (byte)97, "o!O", (int) (byte)97, (int) (byte)97);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 97
         // ASSIGN_MOD o!O 97
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node((byte)101, (byte)0, 394);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown type 101
         // AND 0
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("o!O");
      String string0 = compiler0.toSource(node0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(394, (-44), 2534);
      // Undeclared exception!
      try { 
        compiler0.toSource(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 394
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("/o!O/");
      String string0 = compiler0.toSource(node0);
      assertEquals("\"/o!O\\u007f/\"", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("5");
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("/oO/");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("oO");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newString("/o!O/");
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
  public void test45()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("5");
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
  public void test46()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) arrayList0);
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
  public void test49()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("\"o!O\"", charsetEncoder0);
      assertEquals("'\"o!O\"'", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("c^'Xtehb", charsetEncoder0);
      assertEquals("\"c^'Xtehb\"", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString(" \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000B2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000B2\u001C.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000B2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000B2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000B2\u001F.google.protobuf.ServiceOptions\"\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018");
      assertEquals("\" \\u0001(\\t\\u00128\\n\\u0005value\\u0018\\u0002 \\u0003(\\u000b2).google.protobuf.EnumValueDescriptorProto\\u0012-\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001c.google.protobuf.EnumOptions\\\"l\\n\\u0018EnumValueDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018\\u0001 \\u0001(\\t\\u0012\\u000e\\n\\u0006number\\u0018\\u0002 \\u0001(\\u0005\\u00122\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2!.google.protobuf.EnumValueOptions\\\"\\u0090\\u0001\\n\\u0016ServiceDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018\\u0001 \\u0001(\\t\\u00126\\n\\u0006method\\u0018\\u0002 \\u0003(\\u000b2&.google.protobuf.MethodDescriptorProto\\u00120\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001f.google.protobuf.ServiceOptions\\\"\\u007f\\n\\u0015MethodDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018\"", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("Htp^{.>nR?<!-->OAJ", charsetEncoder0);
      assertEquals("\"Htp^{.>nR?<\\!--\\>OAJ\"", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("\"/o!O\\u007f/\"");
      assertEquals("/\"/o!O\\u007f/\"/", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape(">&JjwU");
      assertEquals("/>&JjwU/", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.jsString("Htp^{.>AR?<8->OAJ", charsetEncoder0);
      assertEquals("\"Htp^{.>AR?<8->OAJ\"", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("h)$TyD]>9K_9A>");
      assertEquals("\"h)$TyD]>9K_9A>\"", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("$>cDh]]>B");
      assertEquals("\"$>cDh]]\\>B\"", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("</scriptx=zq@", 'A', "</scriptx=zq@", ":_3|. ", "debugger", charsetEncoder0);
      assertEquals("A<\\/scriptx=zq@A", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape(" \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000B2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000B2\u001C.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000B2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000B2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000B2\u001F.google.protobuf.ServiceOptions\"\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018");
      assertEquals(" \\u0001(\\u0009\\u00128\\u000a\\u0005value\\u0018\\u0002 \\u0003(\\u000b2).google.protobuf.EnumValueDescriptorProto\\u0012-\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001c.google.protobuf.EnumOptions\"l\\u000a\\u0018EnumValueDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u0012\\u000e\\u000a\\u0006number\\u0018\\u0002 \\u0001(\\u0005\\u00122\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2!.google.protobuf.EnumValueOptions\"\\u0090\\u0001\\u000a\\u0016ServiceDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u00126\\u000a\\u0006method\\u0018\\u0002 \\u0003(\\u000b2&.google.protobuf.MethodDescriptorProto\\u00120\\u000a\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001f.google.protobuf.ServiceOptions\"\\u007f\\u000a\\u0015MethodDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018", string0);
  }
}

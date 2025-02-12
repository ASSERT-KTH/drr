/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 11:26:16 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.LinkedList;
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
  public void test01()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape(" \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000B2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000B2\u001C.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000B2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000B2&.google.protouf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000B2\u001F.google.protobuf.ServiceOptions\"\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018");
      assertEquals("/ \\u0001(\\t\\u00128\\n\\u0005value\\u0018\\u0002 \\u0003(\\u000b2).google.protobuf.EnumValueDescriptorProto\\u0012-\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001c.google.protobuf.EnumOptions\"l\\n\\u0018EnumValueDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018\\u0001 \\u0001(\\t\\u0012\\u000e\\n\\u0006number\\u0018\\u0002 \\u0001(\\u0005\\u00122\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2!.google.protobuf.EnumValueOptions\"\\u0090\\u0001\\n\\u0016ServiceDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0001 \\u0001(\\t\\u00126\\n\\u0006method\\u0018\\u0002 \\u0003(\\u000b2&.google.protouf.MethodDescriptorProto\\u00120\\n\\u0007options\\u0018\\u0003 \\u0001(\\u000b2\\u001f.google.protobuf.ServiceOptions\"\\u007f\\n\\u0015MethodDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018/", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addList((Node) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString(30, "<(u&vqnumWn)(fqK");
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.STATEMENT;
      // Undeclared exception!
      try { 
        codeGenerator0.addLeftExpr(node0, 14, codeGenerator_Context0);
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
      Node node0 = Node.newString("<(u&vqnumWn)(fqK");
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
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
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
  public void test06()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      Node node0 = Node.newString("", 531, 531);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber(" ui,K&(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("V5rW3nS)ww.");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("4");
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newNumber(Double.NaN, 8, 1);
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
  public void test12()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addArrayList((Node) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
      Node node0 = Node.newNumber(Double.NaN, 8, 1);
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
  public void test14()  throws Throwable  {
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = CodeGenerator.jsString("/*nrKi^\"/", (CharsetEncoder) null);
      assertEquals("'/*nrKi^\"/'", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = CodeGenerator.jsString("'\"Rj>{R 5f", (CharsetEncoder) null);
      assertEquals("\"'\\\"Rj>{R 5f\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = CodeGenerator.strEscape("8/ w<!--I3$V6tSU0xF", 'B', "V5rW3nS)ww.", ")`G;", "\"", charsetEncoder0);
      assertEquals("B8/ w<\\!--I3$V6tSU0xFB", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("HVd+-$/,kMe:6Qw^t");
      assertEquals("/HVd\\u007f+-$/,kMe:6Qw^t/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString("Bad dependency: {0} -> {1}.Modues must be listed i depenCency order.");
      assertEquals("\"Bad dependency: {0} -> {1}.Modues must be listed i depenCency order.\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = CodeGenerator.escapeToDoubleQuotedJsString(">q</scriptdxgkyduwe");
      assertEquals("\">q<\\/scriptdxgkyduwe\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = CodeGenerator.regexpEscape("Cu<%kI:9DKf_BmsuFB");
      assertEquals("/Cu<%kI:9DKf_BmsuFB/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("rotobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000B2\u001C.google.protobuf.FileOptions\"\u00A9\u0003\n\u000FDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000B2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000B2%.google.protobuf.FieldDescriptorProto\u00125\n\u000Bnested_type\u0018\u0003 \u0003(\u000B2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0004 \u0003(\u000B2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000Fextension_range\u0018\u0005 \u0003(\u000B2/.google.protobuf.DescriptorProto.Extensi");
      assertEquals("rotobuf.FieldDescriptorProto\\u0012-\\u000a\\u0007options\\u0018\\u0008 \\u0001(\\u000b2\\u001c.google.protobuf.FileOptions\"\\u00a9\\u0003\\u000a\\u000fDescriptorProto\\u0012\\u000c\\u000a\\u0004name\\u0018\\u0001 \\u0001(\\u0009\\u00124\\u000a\\u0005field\\u0018\\u0002 \\u0003(\\u000b2%.google.protobuf.FieldDescriptorProto\\u00128\\u000a\\u0009extension\\u0018\\u0006 \\u0003(\\u000b2%.google.protobuf.FieldDescriptorProto\\u00125\\u000a\\u000bnested_type\\u0018\\u0003 \\u0003(\\u000b2 .google.protobuf.DescriptorProto\\u00127\\u000a\\u0009enum_type\\u0018\\u0004 \\u0003(\\u000b2$.google.protobuf.EnumDescriptorProto\\u0012H\\u000a\\u000fextension_range\\u0018\\u0005 \\u0003(\\u000b2/.google.protobuf.DescriptorProto.Extensi", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("V5rW3nS)ww.");
      assertEquals("V5rW3nS)ww.", string0);
  }
}

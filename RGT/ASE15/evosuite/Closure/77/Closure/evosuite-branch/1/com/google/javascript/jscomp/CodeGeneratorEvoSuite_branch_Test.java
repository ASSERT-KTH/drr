/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:45:35 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CodeGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "\t3]\n\u000B\rmax\u0085\u1680\u2028\u2029\u205F5";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u00093]\\u000a\\u000b\\u000dmax\\u0085\\u1680\\u2028\\u2029\\u205f5", string1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "IO|KC8_->>";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/IO|KC8_->>/", string1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "<!-->";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"<\\!--\\>\"", string1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = ">";
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      
      String string1 = CodeGenerator.regexpEscape(string0, charsetEncoder0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/>/", string1);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "\"0\\\"y</script8bA>rodly\"";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"\\\"0\\\\\\\"y<\\/script8bA>rodly\\\"\"", string1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "<_Gy4E$75'&";
      CharsetEncoder charsetEncoder0 = null;
      String string1 = CodeGenerator.jsString(string0, charsetEncoder0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\"<_Gy4E$75'&\"", string1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = ".\"[srpmz]>xfd";
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      
      String string1 = CodeGenerator.jsString(string0, charsetEncoder0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("'.\"[srpmz]>xfd'", string1);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      boolean boolean0 = false;
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0, boolean0);
      assertNotNull(jSTypeRegistry0);
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      
      JSType jSType0 = null;
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      
      ObjectType objectType0 = ObjectType.cast(jSType0);
      assertNull(objectType0);
      
      boolean boolean1 = linkedList0.add((JSType) objectType0);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      assertEquals("[null]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
      
      boolean boolean2 = linkedList0.add(jSType0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (List<JSType>) linkedList0);
      assertFalse(boolean0 == boolean2);
      assertFalse(boolean0 == boolean1);
      assertNotNull(functionType0);
      assertEquals(false, functionType0.isNominalType());
      assertEquals(true, functionType0.canBeCalled());
      assertEquals(false, functionType0.isTemplateType());
      assertEquals(true, functionType0.isOrdinaryFunction());
      assertEquals(false, functionType0.isResolved());
      assertEquals(false, functionType0.isEnumElementType());
      assertEquals(false, functionType0.isNoObjectType());
      assertEquals(BooleanLiteralSet.TRUE, functionType0.getPossibleToBooleanOutcomes());
      assertEquals(false, functionType0.hasInstanceType());
      assertEquals(2, functionType0.getMaxArguments());
      assertEquals(false, functionType0.isEnumType());
      assertEquals(false, functionType0.isVoidType());
      assertEquals(false, functionType0.isNumberValueType());
      assertEquals(false, functionType0.isUnionType());
      assertEquals(false, functionType0.isStringValueType());
      assertEquals(false, functionType0.isCheckedUnknownType());
      assertEquals(false, functionType0.isNullType());
      assertNull(functionType0.getTemplateTypeName());
      assertEquals(false, functionType0.isAllType());
      assertEquals(false, functionType0.hasCachedValues());
      assertEquals(false, functionType0.isReturnTypeInferred());
      assertEquals(false, functionType0.isRecordType());
      assertEquals(false, functionType0.isBooleanValueType());
      assertEquals(false, functionType0.isInterface());
      assertEquals(false, functionType0.isNoType());
      assertEquals(false, functionType0.isConstructor());
      assertEquals(true, functionType0.isFunctionType());
      assertEquals(false, functionType0.isFunctionPrototypeType());
      assertEquals(false, functionType0.isNoResolvedType());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      
      Node node0 = functionType0.getParametersNode();
      assertFalse(boolean0 == boolean2);
      assertFalse(boolean0 == boolean1);
      assertNotNull(node0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, functionType0.isNominalType());
      assertEquals(true, functionType0.canBeCalled());
      assertEquals(false, functionType0.isTemplateType());
      assertEquals(true, functionType0.isOrdinaryFunction());
      assertEquals(false, functionType0.isResolved());
      assertEquals(false, functionType0.isEnumElementType());
      assertEquals(false, functionType0.isNoObjectType());
      assertEquals(BooleanLiteralSet.TRUE, functionType0.getPossibleToBooleanOutcomes());
      assertEquals(false, functionType0.hasInstanceType());
      assertEquals(2, functionType0.getMaxArguments());
      assertEquals(false, functionType0.isEnumType());
      assertEquals(false, functionType0.isVoidType());
      assertEquals(false, functionType0.isNumberValueType());
      assertEquals(false, functionType0.isUnionType());
      assertEquals(false, functionType0.isStringValueType());
      assertEquals(false, functionType0.isCheckedUnknownType());
      assertEquals(false, functionType0.isNullType());
      assertNull(functionType0.getTemplateTypeName());
      assertEquals(false, functionType0.isAllType());
      assertEquals(false, functionType0.hasCachedValues());
      assertEquals(false, functionType0.isReturnTypeInferred());
      assertEquals(false, functionType0.isRecordType());
      assertEquals(false, functionType0.isBooleanValueType());
      assertEquals(false, functionType0.isInterface());
      assertEquals(false, functionType0.isNoType());
      assertEquals(false, functionType0.isConstructor());
      assertEquals(true, functionType0.isFunctionType());
      assertEquals(false, functionType0.isFunctionPrototypeType());
      assertEquals(false, functionType0.isNoResolvedType());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
      
      String string0 = compiler0.toSource(node0);
      assertFalse(boolean0 == boolean2);
      assertFalse(boolean0 == boolean1);
      assertNotNull(string0);
      assertEquals("(,)", string0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(2, node0.getChildCount());
      assertEquals(false, node0.hasOneChild());
      assertEquals(83, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, functionType0.isNominalType());
      assertEquals(true, functionType0.canBeCalled());
      assertEquals(false, functionType0.isTemplateType());
      assertEquals(true, functionType0.isOrdinaryFunction());
      assertEquals(false, functionType0.isResolved());
      assertEquals(false, functionType0.isEnumElementType());
      assertEquals(false, functionType0.isNoObjectType());
      assertEquals(BooleanLiteralSet.TRUE, functionType0.getPossibleToBooleanOutcomes());
      assertEquals(false, functionType0.hasInstanceType());
      assertEquals(2, functionType0.getMaxArguments());
      assertEquals(false, functionType0.isEnumType());
      assertEquals(false, functionType0.isVoidType());
      assertEquals(false, functionType0.isNumberValueType());
      assertEquals(false, functionType0.isUnionType());
      assertEquals(false, functionType0.isStringValueType());
      assertEquals(false, functionType0.isCheckedUnknownType());
      assertEquals(false, functionType0.isNullType());
      assertNull(functionType0.getTemplateTypeName());
      assertEquals(false, functionType0.isAllType());
      assertEquals(false, functionType0.hasCachedValues());
      assertEquals(false, functionType0.isReturnTypeInferred());
      assertEquals(false, functionType0.isRecordType());
      assertEquals(false, functionType0.isBooleanValueType());
      assertEquals(false, functionType0.isInterface());
      assertEquals(false, functionType0.isNoType());
      assertEquals(false, functionType0.isConstructor());
      assertEquals(true, functionType0.isFunctionType());
      assertEquals(false, functionType0.isFunctionPrototypeType());
      assertEquals(false, functionType0.isNoResolvedType());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, jSTypeRegistry0.shouldTolerateUndefinedValues());
      assertEquals("[null, null]", linkedList0.toString());
      assertEquals(2, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = "onRange\u00120\n\u0007options\u0018\u0007 \u0001(\u000B2\u001F.google.protobuf.MessageOptions\u001A,\n\u000EExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000B\n\u0003end\u0018\u0002 \u0001(\u0005\"\u0094\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000E2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000E2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000B2\u001D.google.protobuf.FieldOptions\"\u00B6\u0002\n\u0004Type\u0012\u000F\n\u000BTYP";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"onRange\\u00120\\n\\u0007options\\u0018\\u0007 \\u0001(\\u000b2\\u001f.google.protobuf.MessageOptions\\u001a,\\n\\u000eExtensionRange\\u0012\\r\\n\\u0005start\\u0018\\u0001 \\u0001(\\u0005\\u0012\\u000b\\n\\u0003end\\u0018\\u0002 \\u0001(\\u0005\\\"\\u0094\\u0005\\n\\u0014FieldDescriptorProto\\u0012\\u000c\\n\\u0004name\\u0018\\u0001 \\u0001(\\t\\u0012\\u000e\\n\\u0006number\\u0018\\u0003 \\u0001(\\u0005\\u0012:\\n\\u0005label\\u0018\\u0004 \\u0001(\\u000e2+.google.protobuf.FieldDescriptorProto.Label\\u00128\\n\\u0004type\\u0018\\u0005 \\u0001(\\u000e2*.google.protobuf.FieldDescriptorProto.Type\\u0012\\u0011\\n\\ttype_name\\u0018\\u0006 \\u0001(\\t\\u0012\\u0010\\n\\u0008extendee\\u0018\\u0002 \\u0001(\\t\\u0012\\u0015\\n\\rdefault_value\\u0018\\u0007 \\u0001(\\t\\u0012.\\n\\u0007options\\u0018\\u0008 \\u0001(\\u000b2\\u001d.google.protobuf.FieldOptions\\\"\\u00b6\\u0002\\n\\u0004Type\\u0012\\u000f\\n\\u000bTYP\"", string1);
  }
}

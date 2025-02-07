/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 09:36:48 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.IndexedType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import com.google.javascript.rhino.jstype.VoidType;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      errorFunctionType0.toStringHelper(true);
      assertTrue(errorFunctionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      FunctionType functionType0 = FunctionType.forInterface(jSTypeRegistry0, "F;\"I c><#*}zKF", (Node) null);
      boolean boolean0 = functionType0.matchesObjectContext();
      assertTrue(boolean0);
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "?");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      instanceObjectType0.canBeCalled();
      assertTrue(instanceObjectType0.hasReferenceName());
      assertFalse(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) prototypeObjectType0, true, jSTypeArray0);
      Node node0 = Node.newNumber((-1.0));
      boolean boolean0 = prototypeObjectType0.defineProperty("\n", functionType0, true, node0);
      assertTrue(boolean0);
      
      String string0 = functionType0.toAnnotationString();
      assertEquals("function (): {\n: Function}", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "p4\"{=myYCf/*F&MDxOF");
      Node node0 = Node.newString((-1908874352), "Not declared as a type name", 1, 1265);
      boolean boolean0 = errorFunctionType0.defineDeclaredProperty("?", (JSType) null, node0);
      assertTrue(boolean0);
      
      int int0 = errorFunctionType0.getPropertiesCount();
      assertEquals(1, int0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
      assertTrue(noResolvedType0.hasCachedValues());
      
      int int0 = instanceObjectType0.getPropertiesCount();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType(":ps?HhK", (Node) null, arrowType0);
      boolean boolean0 = enumType0.defineElement("", (Node) null);
      assertTrue(boolean0);
      
      boolean boolean1 = enumType0.hasProperty("");
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType(":ps?HhK", (Node) null, arrowType0);
      boolean boolean0 = enumType0.defineElement("", (Node) null);
      boolean boolean1 = enumType0.defineProperty("", arrowType0, true, (Node) null);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      boolean boolean0 = noObjectType0.isPropertyTypeDeclared("Unknown class name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "b!Xm|{");
      errorFunctionType0.collectPropertyNames((Set<String>) null);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
      FunctionType functionType0 = new FunctionType(jSTypeRegistry0, "iG", (Node) null, arrowType0, instanceObjectType0, "iG", true, true);
      functionType0.setImplicitPrototype(instanceObjectType0);
      assertTrue(noResolvedType0.hasCachedValues());
      
      functionType0.getPropertyNames();
      assertFalse(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      boolean boolean0 = functionType0.defineProperty("#+,yU", recordType0, true, node0);
      assertTrue(boolean0);
      
      boolean boolean1 = functionType0.isPropertyTypeInferred("#+,yU");
      assertTrue(boolean1);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "b!Xm|{");
      boolean boolean0 = errorFunctionType0.isPropertyTypeInferred("3|#VE(Pa");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = recordType0.isPropertyInExterns("3|#VE(Pa");
      assertFalse(recordType0.hasReferenceName());
      assertFalse(boolean0);
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType(":ps?HhK", (Node) null, arrowType0);
      boolean boolean0 = enumType0.defineElement("", (Node) null);
      assertTrue(boolean0);
      
      boolean boolean1 = enumType0.isPropertyInExterns("");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("Unknown class name", jSDocInfo0);
      assertTrue(noResolvedType0.hasCachedValues());
      
      boolean boolean0 = instanceObjectType0.defineProperty("Unknown class name", arrowType0, false, (Node) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "b!Xm|{");
      boolean boolean0 = errorFunctionType0.removeProperty("Not declared as a constructor");
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      Node node0 = new Node(1, 1, 1);
      boolean boolean0 = functionType0.defineProperty("Not declared as a constructor", recordType0, true, node0);
      assertTrue(boolean0);
      
      boolean boolean1 = functionType0.removeProperty("Not declared as a constructor");
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.getPropertyNode("YYLR3e! ");
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      boolean boolean0 = functionType0.defineProperty("#+,yU", recordType0, true, node0);
      assertTrue(boolean0);
      
      Node node1 = functionType0.getPropertyNode("#+,yU");
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertNotNull(node1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "b!Xm|{");
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, errorFunctionType0, recordType0);
      indexedType0.getOwnPropertyJSDocInfo("Named type with empty name component");
      assertTrue(indexedType0.hasReferenceName());
      assertTrue(indexedType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType(":ps?HhK", (Node) null, arrowType0);
      enumType0.defineElement("", (Node) null);
      JSDocInfo jSDocInfo0 = enumType0.getOwnPropertyJSDocInfo("");
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      functionType0.setPropertyJSDocInfo("u$L(S$j", (JSDocInfo) null);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("Unknown class name", jSDocInfo0);
      instanceObjectType0.setPropertyJSDocInfo("Unknown class name", jSDocInfo0);
      assertTrue(noResolvedType0.hasCachedValues());
      assertFalse(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      recordType0.setPropertyJSDocInfo("", jSDocInfo0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createNativeAnonymousObjectType();
      boolean boolean0 = ((PrototypeObjectType) objectType0).matchesNumberContext();
      assertFalse(boolean0);
      assertTrue(objectType0.isNativeObjectType());
      assertFalse(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      boolean boolean0 = functionType0.matchesStringContext();
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(boolean0);
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      StringType stringType0 = new StringType(jSTypeRegistry0);
      JSType jSType0 = stringType0.autoboxesTo();
      boolean boolean0 = jSType0.matchesStringContext();
      assertTrue(jSType0.isNominalType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = recordType0.matchesStringContext();
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType jSType0 = recordType0.unboxesTo();
      assertFalse(recordType0.hasReferenceName());
      assertNull(jSType0);
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "fJ", (ObjectType) null);
      String string0 = prototypeObjectType0.toStringHelper(true);
      assertEquals("fJ", string0);
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      PrototypeObjectType prototypeObjectType0 = (PrototypeObjectType)jSTypeRegistry0.createAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) prototypeObjectType0, true, jSTypeArray0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, prototypeObjectType0, functionType0);
      Node node0 = Node.newNumber((-1.0));
      prototypeObjectType0.defineProperty("\n", functionType0, true, node0);
      boolean boolean0 = indexedType0.defineInferredProperty("Not declared as a type name", functionType0, node0);
      assertTrue(boolean0);
      
      String string0 = functionType0.toStringHelper(false);
      assertEquals("function (): {\n: Function, Not declared as a type name: Function}", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.setPrettyPrint(false);
      String string0 = recordType0.toStringHelper(false);
      assertEquals("{...}", string0);
      assertFalse(recordType0.isNativeObjectType());
      assertNotNull(string0);
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      NoType noType0 = new NoType(jSTypeRegistry0);
      JSType[] jSTypeArray0 = new JSType[7];
      jSTypeArray0[0] = (JSType) noType0;
      jSTypeArray0[6] = (JSType) noType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noType0, true, jSTypeArray0);
      functionType0.getGreatestSubtype(jSTypeArray0[0]);
      // Undeclared exception!
      try { 
        noType0.setImplicitPrototype(functionType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

////  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ArrowType arrowType0 = jSTypeRegistry0.createArrowType((Node) null);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithNewReturnType(noResolvedType0, arrowType0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0, true);
      functionType0.setOwnerFunction(noResolvedType0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
      assertTrue(instanceObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) objectType0, true, jSTypeArray0);
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, objectType0, functionType0);
      indexedType0.getTypesUnderEquality(objectType0);
      assertFalse(indexedType0.isNativeObjectType());
      assertFalse(indexedType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      boolean boolean0 = objectType0.isString();
      assertTrue(objectType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) recordType0, jSTypeArray0);
      RecordType recordType1 = (RecordType)functionType0.getLeastSupertype(recordType0);
      assertFalse(recordType1.hasReferenceName());
      assertFalse(recordType1.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = Node.newNumber((double) (-2075900857), 64, (-2075900857));
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "|?");
      IndexedType indexedType0 = new IndexedType(jSTypeRegistry0, unresolvedTypeExpression0, unresolvedTypeExpression0);
      JSType jSType0 = jSTypeRegistry0.getGreatestSubtypeWithProperty(indexedType0, "}");
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>();
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs(jSType0, (List<JSType>) linkedList0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      boolean boolean0 = errorFunctionType0.isSubtype(functionType0);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "fJ", (ObjectType) null);
      NoType noType0 = (NoType)jSTypeRegistry0.getGreatestSubtypeWithProperty(prototypeObjectType0, "Named type with empty name component");
      prototypeObjectType0.setOwnerFunction(noType0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Named type with empty name component");
      // Undeclared exception!
      try { 
        prototypeObjectType0.setOwnerFunction(errorFunctionType0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "p4\"{=myYCf/*F&MDxOF");
      errorFunctionType0.getSuperClassConstructor();
      errorFunctionType0.setPrototypeBasedOn(errorFunctionType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "fJ", (ObjectType) null);
      prototypeObjectType0.getCtorImplementedInterfaces();
      assertTrue(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "fJ", (ObjectType) null);
      NoType noType0 = (NoType)jSTypeRegistry0.getGreatestSubtypeWithProperty(prototypeObjectType0, "Named type with empty name component");
      prototypeObjectType0.setOwnerFunction(noType0);
      prototypeObjectType0.getCtorImplementedInterfaces();
      assertTrue(prototypeObjectType0.hasReferenceName());
      assertFalse(prototypeObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("", (Node) null);
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, functionType0, "");
      functionType0.defineProperty("3.U:Vk]M_>", enumElementType0, false, (Node) null);
      functionType0.resolveInternal(simpleErrorReporter0, enumElementType0);
      assertTrue(enumElementType0.isResolved());
      assertFalse(functionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0, true);
      assertFalse(instanceObjectType0.isNominalType());
      
      noResolvedType0.setOwnerFunction(noResolvedType0);
      noResolvedType0.matchConstraint(instanceObjectType0);
      assertTrue(instanceObjectType0.isNominalType());
      assertTrue(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      VoidType voidType0 = new VoidType(jSTypeRegistry0);
      JSType jSType0 = voidType0.restrictByNotNullOrUndefined();
      EnumElementType enumElementType0 = new EnumElementType(jSTypeRegistry0, jSType0, "Named type with empty name component");
      recordType0.matchConstraint(enumElementType0);
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "b!Xm|{");
      Node node0 = Node.newString(1, "Named type with empty name component");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(errorFunctionType0, node0);
      hashMap0.put("{\"z;xF)nX&X%2o<", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = new RecordType(jSTypeRegistry0, hashMap0);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasCachedValues());
      assertFalse(recordType0.hasReferenceName());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 09:47:30 GMT 2019
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.ErrorFunctionType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoResolvedType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.PrototypeObjectType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.RecordType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.UnresolvedTypeExpression;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrototypeObjectType_ESTest extends PrototypeObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "&.ME{");
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, errorFunctionType0);
      boolean boolean0 = instanceObjectType0.matchesObjectContext();
      assertTrue(boolean0);
      assertTrue(instanceObjectType0.hasReferenceName());
      assertFalse(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.canBeCalled();
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0, 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.matchConstraint(recordType0);
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      errorFunctionType0.setPrototypeBasedOn(errorFunctionType0);
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", errorFunctionType0, false, node0);
      assertTrue(boolean0);
      
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      instanceObjectType0.setPropertyJSDocInfo("", jSDocInfo0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", instanceObjectType0, false, node0);
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(boolean0);
      
      int int0 = errorFunctionType0.getPropertiesCount();
      assertEquals(1, int0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Zz%{nU<RzIsZZ-NcWa");
      Node node0 = new Node(0);
      UnresolvedTypeExpression unresolvedTypeExpression0 = new UnresolvedTypeExpression(jSTypeRegistry0, node0, "Named type with empty name component");
      errorFunctionType0.setImplicitPrototype(unresolvedTypeExpression0);
      boolean boolean0 = errorFunctionType0.hasProperty("l<14");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "w_sbQ]Ic(!N%6M@Y^p.");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      errorFunctionType0.setPropertyJSDocInfo("FNkv", jSDocInfo0);
      boolean boolean0 = errorFunctionType0.defineProperty("FNkv", errorFunctionType0, false, (Node) null);
      assertTrue(errorFunctionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      Locale locale0 = new Locale("", "^*uR;");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      instanceObjectType0.collectPropertyNames(set0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      Locale locale0 = new Locale("", "^*uR;");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Node node0 = new Node(0, 0, 4);
      instanceObjectType0.defineProperty("P %BhS", instanceObjectType0, false, node0);
      // Undeclared exception!
      try { 
        instanceObjectType0.collectPropertyNames(set0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", errorFunctionType0, false, node0);
      boolean boolean1 = errorFunctionType0.isPropertyTypeInferred("");
      assertFalse(boolean1 == boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Zz%{nU<RzIsZZ-NcWa");
      boolean boolean0 = errorFunctionType0.isPropertyTypeInferred("Named type with empty name component");
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor");
      boolean boolean0 = errorFunctionType0.isPropertyInExterns("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0, 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      recordType0.isPropertyInExterns("Not declared as a type name");
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(recordType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", instanceObjectType0, false, node0);
      assertTrue(instanceObjectType0.hasReferenceName());
      
      boolean boolean1 = errorFunctionType0.defineProperty("", errorFunctionType0, true, node0);
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor");
      boolean boolean0 = errorFunctionType0.removeProperty("Unknown class name");
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", errorFunctionType0, false, node0);
      assertTrue(boolean0);
      
      boolean boolean1 = errorFunctionType0.removeProperty("");
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      instanceObjectType0.getPropertyNode("");
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

////  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      errorFunctionType0.setPrototypeBasedOn(errorFunctionType0);
      Node node0 = new Node(0, 0, 4);
      errorFunctionType0.defineProperty("", instanceObjectType0, false, node0);
      instanceObjectType0.getPropertyNode("");
      assertTrue(instanceObjectType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, (String) null);
      errorFunctionType0.getOwnPropertyJSDocInfo("");
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      JSType jSType0 = errorFunctionType0.getReturnType();
      Node node0 = new Node(0, 0, 4);
      boolean boolean0 = errorFunctionType0.defineProperty("", jSType0, false, node0);
      assertTrue(boolean0);
      assertTrue(jSType0.isNominalType());
      
      errorFunctionType0.getOwnPropertyJSDocInfo("");
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "Zz%{nU<RzIsZZ-NcWa");
      errorFunctionType0.setPropertyJSDocInfo("", (JSDocInfo) null);
      assertFalse(errorFunctionType0.hasCachedValues());
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newString("SHEQ");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      recordType0.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo0);
      assertFalse(recordType0.hasCachedValues());
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      recordType0.setPropertyJSDocInfo("prev is not a child of this node.", jSDocInfo0);
      assertTrue(recordType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      boolean boolean0 = instanceObjectType0.matchesNumberContext();
      assertFalse(instanceObjectType0.hasCachedValues());
      assertFalse(boolean0);
      assertTrue(instanceObjectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      boolean boolean0 = errorFunctionType0.matchesStringContext();
      assertFalse(boolean0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      JSType[] jSTypeArray0 = new JSType[1];
      jSTypeArray0[0] = (JSType) instanceObjectType0;
      FunctionType functionType0 = jSTypeRegistry0.createFunctionTypeWithVarArgs((JSType) instanceObjectType0, jSTypeArray0);
      boolean boolean0 = functionType0.matchesStringContext();
      assertFalse(boolean0);
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(instanceObjectType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = recordType0.matchesStringContext();
      assertFalse(recordType0.hasReferenceName());
      assertFalse(boolean0);
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)errorFunctionType0.getReturnType();
      NumberType numberType0 = (NumberType)instanceObjectType0.unboxesTo();
      assertNull(numberType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0);
      String string0 = instanceObjectType0.toAnnotationString();
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertNotNull(string0);
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      Node node0 = Node.newString("Named type with empty name component", 0, 1);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.NULL_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      JSTypeNative jSTypeNative1 = JSTypeNative.TOP_LEVEL_PROTOTYPE;
      jSTypeNativeArray0[2] = jSTypeNative1;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
      hashMap0.put("2K|Z4$D\"v83Vl", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertEquals("{2K|Z4$D\"v83Vl: (Object.prototype|null)}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newString("SHEQ");
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.putIfAbsent("*L", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(true);
      assertNotNull(string0);
      assertEquals("{*L: ?}", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      Node node0 = Node.newString("Named type with empty name component", 0, 1);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.NULL_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(jSType0, node0);
      hashMap0.put("2K|Z4$D\"v83Vl", recordTypeBuilder_RecordProperty0);
      hashMap0.putIfAbsent("*L", recordTypeBuilder_RecordProperty0);
      hashMap0.put("Not declared as a constructor", recordTypeBuilder_RecordProperty0);
      hashMap0.put(": ", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      String string0 = recordType0.toStringHelper(false);
      assertEquals("{*L: null, 2K|Z4$D\"v83Vl: null, : : null, Not declared as a constructor: null, ...}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      NoResolvedType noResolvedType0 = new NoResolvedType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, noResolvedType0);
      String string0 = instanceObjectType0.toStringHelper(false);
      assertFalse(instanceObjectType0.isNativeObjectType());
      assertNotNull(string0);
      assertEquals("{...}", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor");
      errorFunctionType0.getSuperClassConstructor();
      // Undeclared exception!
      try { 
        errorFunctionType0.setImplicitPrototype(errorFunctionType0);
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
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_TYPE;
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)recordType0.getNativeType(jSTypeNative0);
      assertTrue(instanceObjectType0.hasReferenceName());
      
      JSType[] jSTypeArray0 = new JSType[8];
      jSTypeArray0[0] = (JSType) recordType0;
      jSTypeArray0[1] = (JSType) instanceObjectType0;
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, jSTypeArray0[0]);
      ProxyObjectType proxyObjectType1 = (ProxyObjectType)JSType.getLeastSupertype((JSType) proxyObjectType0, jSTypeArray0[1]);
      assertFalse(proxyObjectType1.isNativeObjectType());
      assertFalse(proxyObjectType1.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      boolean boolean0 = recordType0.isNumber();
      assertFalse(recordType0.hasReferenceName());
      assertFalse(recordType0.isNativeObjectType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null, true);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "PRIVATE");
      FunctionType functionType0 = errorFunctionType0.getBindReturnType((-503));
      InstanceObjectType instanceObjectType0 = new InstanceObjectType(jSTypeRegistry0, functionType0, true);
      boolean boolean0 = instanceObjectType0.isSubtype(functionType0);
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertFalse(instanceObjectType0.isNominalType());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "^*uR;");
      errorFunctionType0.toStringHelper(false);
      assertTrue(errorFunctionType0.hasCachedValues());
      
      errorFunctionType0.setPrototypeBasedOn(errorFunctionType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "");
      errorFunctionType0.setOwnerFunction(errorFunctionType0);
      // Undeclared exception!
      try { 
        errorFunctionType0.setPrototype(errorFunctionType0, (Node) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Node node0 = new Node(2265, (-1436), 0);
      BooleanType booleanType0 = new BooleanType(jSTypeRegistry0);
      InstanceObjectType instanceObjectType0 = (InstanceObjectType)booleanType0.autoboxesTo();
      EnumType enumType0 = new EnumType(jSTypeRegistry0, (String) null, node0, instanceObjectType0);
      enumType0.getCtorImplementedInterfaces();
      assertTrue(instanceObjectType0.hasReferenceName());
      assertTrue(instanceObjectType0.isNativeObjectType());
      assertTrue(instanceObjectType0.isNominalType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "w_sbQ]Ic(!N%6M@Y^p.");
      ObjectType objectType0 = errorFunctionType0.getPrototype();
      objectType0.getCtorImplementedInterfaces();
      assertTrue(errorFunctionType0.isNominalConstructor());
      assertTrue(objectType0.hasReferenceName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      PrototypeObjectType prototypeObjectType0 = new PrototypeObjectType(jSTypeRegistry0, "{...}", (ObjectType) null);
      Node node0 = Node.newNumber((double) 0);
      boolean boolean0 = prototypeObjectType0.defineProperty("3P]8iaF", (JSType) null, true, node0);
      assertTrue(boolean0);
      
      PrototypeObjectType prototypeObjectType1 = (PrototypeObjectType)JSType.safeResolve(prototypeObjectType0, simpleErrorReporter0, (StaticScope<JSType>) null);
      assertTrue(prototypeObjectType1.hasReferenceName());
      assertFalse(prototypeObjectType1.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ErrorFunctionType errorFunctionType0 = new ErrorFunctionType(jSTypeRegistry0, "w_sbQ]Ic(!N%6M@Y^p.");
      errorFunctionType0.matchConstraint(errorFunctionType0);
      assertTrue(errorFunctionType0.isNominalConstructor());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      noObjectType0.matchConstraint(noObjectType0);
      assertFalse(noObjectType0.isVoidType());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0, 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      noObjectType0.matchConstraint(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertFalse(recordType0.isNativeObjectType());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      HashMap<String, RecordTypeBuilder.RecordProperty> hashMap0 = new HashMap<String, RecordTypeBuilder.RecordProperty>();
      NoObjectType noObjectType0 = new NoObjectType(jSTypeRegistry0);
      Node node0 = Node.newNumber((double) 0, 0, 1);
      RecordTypeBuilder.RecordProperty recordTypeBuilder_RecordProperty0 = new RecordTypeBuilder.RecordProperty(noObjectType0, node0);
      hashMap0.put("Not declared as a type name", recordTypeBuilder_RecordProperty0);
      JSType[] jSTypeArray0 = new JSType[0];
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) noObjectType0, jSTypeArray0);
      RecordType recordType0 = jSTypeRegistry0.createRecordType(hashMap0);
      functionType0.matchConstraint(recordType0);
      assertTrue(recordType0.hasCachedValues());
      assertTrue(noObjectType0.hasCachedValues());
  }
}

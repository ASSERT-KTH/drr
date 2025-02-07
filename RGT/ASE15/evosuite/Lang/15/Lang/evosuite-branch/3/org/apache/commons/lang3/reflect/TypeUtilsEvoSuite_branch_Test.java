/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:08:20 GMT 2014
 */

package org.apache.commons.lang3.reflect;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.lang3.reflect.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

 
public class TypeUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = null;
      Type type1 = TypeUtils.getArrayComponentType(type0);
      assertNull(type1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<AbstractMap.SimpleImmutableEntry> class1 = AbstractMap.SimpleImmutableEntry.class;
      Class<?> class2 = TypeUtils.getRawType((Type) class0, (Type) class1);
      assertNotNull(class2);
      assertEquals(false, class2.isInterface());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isArray());
      
      Type type0 = TypeUtils.getArrayComponentType((Type) class2);
      assertNull(type0);
      assertEquals(false, class2.isInterface());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isArray());
      
      boolean boolean0 = TypeUtils.isArrayType(type0);
      assertFalse(boolean0);
      assertEquals(false, class2.isInterface());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isArray());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = TypeUtils.isArrayType((Type) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = null;
      // Undeclared exception!
      try {
        Class<?> class0 = TypeUtils.getRawType(type0, type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: null
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class0);
      assertNotNull(map0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
      
      boolean boolean0 = TypeUtils.typesSatisfyVariables(map0);
      assertTrue(boolean0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertSame(typeArray0, typeArray1);
      assertSame(typeArray1, typeArray0);
      assertNotNull(typeArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<AbstractMap.SimpleImmutableEntry> class1 = AbstractMap.SimpleImmutableEntry.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertNull(map0);
      
      Class<?> class2 = TypeUtils.getRawType((Type) class0, (Type) class1);
      assertNotNull(class2);
      assertEquals(false, class2.isArray());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isPrimitive());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
      
      boolean boolean0 = TypeUtils.isInstance((Object) map0, (Type) class2);
      assertTrue(boolean0);
      assertEquals(false, class2.isArray());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isPrimitive());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isSynthetic());
      assertEquals(false, class2.isInterface());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isEnum());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = null;
      boolean boolean0 = TypeUtils.isInstance((Object) type0, type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class0);
      assertNotNull(map0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      
      Class<AbstractMap.SimpleImmutableEntry> class1 = AbstractMap.SimpleImmutableEntry.class;
      Class<?> class2 = TypeUtils.getRawType((Type) class0, (Type) class1);
      assertNotNull(class2);
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isArray());
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isInterface());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isSynthetic());
      
      boolean boolean0 = TypeUtils.isInstance((Object) map0, (Type) class2);
      assertFalse(boolean0);
      assertEquals(0, map0.size());
      assertEquals(true, map0.isEmpty());
      assertEquals("class java.lang.String", class2.toString());
      assertEquals(false, class2.isAnnotation());
      assertEquals(false, class2.isPrimitive());
      assertEquals(false, class2.isArray());
      assertEquals(false, class2.isEnum());
      assertEquals(false, class2.isInterface());
      assertEquals(17, class2.getModifiers());
      assertEquals(false, class2.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<TypeVariable> class0 = TypeVariable.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class0);
      assertNotNull(map0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = null;
      // Undeclared exception!
      try {
        Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments(type0, class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // found an unhandled type: null
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type[] typeArray0 = new Type[31];
      typeArray0[13] = (Type) class0;
      assertNotNull(typeArray0[13]);
      
      Type[] typeArray1 = TypeUtils.normalizeUpperBounds(typeArray0);
      assertFalse(typeArray0.equals((Object)typeArray1));
      assertFalse(typeArray1.equals((Object)typeArray0));
      assertNotSame(typeArray0, typeArray1);
      assertNotSame(typeArray1, typeArray0);
      assertNotNull(typeArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      Map<TypeVariable<?>, Type> map0 = TypeUtils.getTypeArguments((Type) class0, (Class<?>) class1);
      assertNotNull(map0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = TypeUtils.getArrayComponentType((Type) class0);
      assertNull(type0);
      
      boolean boolean0 = TypeUtils.isAssignable(type0, type0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
      assertNotNull(typeUtils0);
  }
}

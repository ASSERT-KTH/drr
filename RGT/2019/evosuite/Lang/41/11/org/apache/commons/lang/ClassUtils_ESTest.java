/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 04:58:16 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ClassUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Long", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      String string0 = ClassUtils.getPackageCanonicalName((Object) class0, "vk'nB=C_p9");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        ClassUtils.getClass("!oga`c]=oqmJj9");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getPackageName((Object) classUtils0, ".");
      assertEquals("org.apache.commons.lang", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class1 = ClassUtils.getClass(classLoader0, "long");
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ClassUtils.getShortClassName(object0, "");
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "-(`mx1,Ol[T%`=2");
      assertEquals("-(`mx1,Ol[T%`=2", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[java.lang.String");
      assertEquals("String[]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[Lch_<($1u;");
      assertEquals("ch_<(.1u[]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[Lch_<($1u$");
      assertEquals("Lch_<(.1u.[]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("Z");
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("[Lch_<($1u;");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Long");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<String> class0 = String.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertTrue(list2.equals((Object)list0));
      assertEquals(1, list0.size());
      assertNotNull(list2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 2);
      Class<Integer>[] classArray1 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 1);
      Class<Boolean> class0 = Boolean.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 5);
      Class<Boolean> class0 = Boolean.class;
      classArray0[0] = class0;
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      Class<?>[] classArray2 = ClassUtils.wrappersToPrimitives(classArray1);
      boolean boolean0 = ClassUtils.isAssignable(classArray2, classArray1, false);
      assertFalse(boolean0);
      assertNotSame(classArray2, classArray1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = ClassUtils.getClass("boolean", false);
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<?> class1 = ClassUtils.getClass("double", false);
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 3);
      Class<String> class0 = String.class;
      classArray0[2] = class0;
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(3, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
      boolean boolean0 = ClassUtils.isInnerClass(classArray0[7]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang.builder.ToStringStyle$DefaultToStringStyle[]", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = objectArray0[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(2, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) "dIWPje}", (String) null);
      assertNotNull(string0);
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      String string0 = ClassUtils.getShortCanonicalName(classArray0[5]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[Lch_<($1u;");
      assertEquals("ch_<(.1u[]", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[Lch_<($1u$");
      assertEquals("ch_<(.1u.[]", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}

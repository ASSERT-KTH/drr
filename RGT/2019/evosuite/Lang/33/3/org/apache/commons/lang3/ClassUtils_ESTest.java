/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 02 22:22:34 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ClassUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      String string0 = ClassUtils.getShortCanonicalName((Object) classUtils0, "_Qj");
      assertEquals("ClassUtils", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "char");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Byte byte0 = new Byte((byte)4);
      String string0 = ClassUtils.getShortClassName((Object) byte0, "java.lang");
      assertEquals("Byte", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "Object");
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[LEMfD,E<i,eU=N}L");
      assertEquals("LEMfD,E<i,eU=N}L[]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[LEMfD>e,RU=N}8;");
      assertEquals("EMfD>e,RU=N}8[]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("Z");
      assertEquals("boolean", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
      assertEquals("ToStringStyle.ShortPrefixToStringStyle", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) "LINUX", "");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "java.specification.version");
      assertEquals("java.specification.version", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("[org.apache.commons.lang3.ClassUtils");
      assertEquals("org.apache.commons.lang3", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("LINUX");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Lz!vQ9Nq)=E.b(Fr`;");
      assertEquals("z!vQ9Nq)=E", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Float> class0 = Float.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertNotNull(list2);
      assertTrue(list2.equals((Object)list0));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Float> class0 = Float.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      Class<String>[] classArray2 = (Class<String>[]) Array.newInstance(Class.class, 8);
      boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray2, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "java.lang";
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Double> class0 = Double.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Boolean> class1 = Boolean.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Boolean> class1 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "java.lang";
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertNotNull(classArray1);
      assertNotSame(classArray1, classArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 4);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(4, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("short[]", true);
      assertEquals("class [S", class0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        ClassUtils.getClass("[]");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Long>[] classArray0 = (Class<Long>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "Object");
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Boolean", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 2);
      String string0 = ClassUtils.getShortCanonicalName(classArray0[0]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "java.lang", "");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[[S]");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[LEMfD,E<i,eU=N}L");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("[[");
      assertEquals("][][]", string0);
  }
}

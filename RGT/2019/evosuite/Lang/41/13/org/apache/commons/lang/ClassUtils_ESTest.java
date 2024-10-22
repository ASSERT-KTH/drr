/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 05:02:25 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ClassUtils_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "java.vendor.url");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertEquals('.', ClassUtils.PACKAGE_SEPARATOR_CHAR);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      objectArray0[1] = object0;
      objectArray0[2] = object0;
      objectArray0[3] = (Object) "java.lang";
      objectArray0[4] = object0;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertNotNull(classArray0);
      
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertEquals(5, classArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) "String", "4.0");
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "h@Lc/C2ag7v`)cjx");
      assertEquals("h@Lc/C2ag7v`)cjx", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 1);
      String string0 = ClassUtils.getShortClassName(classArray0[0]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[double");
      assertEquals("double[]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[Ld*|>I*lC;");
      assertEquals("d*|>I*lC[]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[Ld*|>J2*l+S!");
      assertEquals("Ld*|>J2*l+S![]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("B");
      assertEquals("byte", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("XAd$q$(t3WO");
      assertEquals("XAd.q.(t3WO", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) "Integer", (String) null);
      assertEquals("java.lang", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, "JPi3C'qE");
      assertEquals("JPi3C'qE", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("Long");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ClassUtils.getPackageName("Ld*|>J2*lR;");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
      assertEquals(3, list2.size());
      assertNotNull(list2);
      assertTrue(list2.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 8);
      Class<Byte>[] classArray1 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 16);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[0], class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[0], class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertNotNull(class1);
      
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 1);
      Class<Boolean> class0 = Boolean.TYPE;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Float> class1 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Long> class1 = Long.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Boolean> class1 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 3);
      Class<Float> class1 = Float.TYPE;
      classArray0[0] = class1;
      boolean boolean0 = ClassUtils.isAssignable(classArray0[0], class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Character> class0 = Character.class;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(4, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Class<Byte>[] classArray0 = (Class<Byte>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Class<Float>[] classArray0 = (Class<Float>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(0, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang.builder.ToStringStyle$DefaultToStringStyle", true);
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("double");
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      try { 
        ClassUtils.getClass("Integer[]", true);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("float[]", true);
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(0, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Object object0 = new Object();
      String string0 = ClassUtils.getShortCanonicalName(object0, ">Fmq{E6b|zH");
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "java");
      assertEquals("java", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("long", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Double double0 = new Double((-1194.23556441));
      String string0 = ClassUtils.getPackageCanonicalName((Object) double0, "String");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) null, "java.lang");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Class<Short> class0 = Short.class;
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      String string0 = ClassUtils.getPackageCanonicalName(classArray0[0]);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[Ld*|>J2*l+S!");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[F(vk`_'1*AZU");
      assertEquals("", string0);
  }
}
